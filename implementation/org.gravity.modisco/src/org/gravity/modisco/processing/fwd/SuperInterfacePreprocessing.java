package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.eclipse.modisco.java.emf.JavaPackage;
import org.eclipse.osgi.util.NLS;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.Messages;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;
import org.gravity.modisco.util.NameUtil;

/**
 * This preprocessor replaces MClasses with Interfaces if they have falsely been
 * discovered as classes
 *
 * @author speldszus
 *
 */
public class SuperInterfacePreprocessing extends AbstractTypedModiscoProcessor<AbstractTypeDeclaration> {

	private static final Logger LOGGER = Logger.getLogger(SuperInterfacePreprocessing.class);

	@Override
	public boolean process(final MGravityModel model, final Collection<AbstractTypeDeclaration> elements, IFolder debug,
			final IProgressMonitor monitor) {
		final Set<TypeAccess> brokenTypeAccesses = elements.parallelStream()
				.flatMap(type -> getAccessedClassDeclarations(type.getSuperInterfaces()).parallelStream())
				.collect(Collectors.toSet());
		return process(model, brokenTypeAccesses);
	}

	private boolean process(final MGravityModel model, final Set<TypeAccess> brokenTypeAccesses) {
		Map<ClassDeclaration, InterfaceDeclaration> replacements;
		try {
			replacements = calculateReplacements(brokenTypeAccesses);
		} catch (final ProcessingException e) {
			return false;
		}
		if (!replacements.isEmpty()) {
			replace(model, replacements);
		}
		return true;
	}

	/**
	 * @param model
	 * @param replacements
	 */
	private void replace(final MGravityModel model, Map<ClassDeclaration, InterfaceDeclaration> replacements) {
		for (final Entry<EObject, Collection<Setting>> entry : EcoreUtil.UsageCrossReferencer
				.findAll(replacements.keySet(), model.eResource().getResourceSet()).entrySet()) {
			final EObject key = entry.getKey();
			if (key instanceof ClassDeclaration) {
				final ClassDeclaration replacedClass = (ClassDeclaration) key;
				final Collection<Setting> references = entry.getValue();
				for (final Setting setting : references) {
					setting.getEObject().eSet(setting.getEStructuralFeature(), replacements.get(replacedClass));
				}
			} else {
				LOGGER.error(NLS.bind(Messages.errorUnhandeldedCrossref, key));
			}

		}
		replacements.clear();
	}

	private Map<ClassDeclaration, InterfaceDeclaration> calculateReplacements(final Set<TypeAccess> brokenTypeAccesses)
			throws ProcessingException {
		final Map<ClassDeclaration, InterfaceDeclaration> replacements = new ConcurrentHashMap<>(
				brokenTypeAccesses.size());
		for (final TypeAccess typeAccess : brokenTypeAccesses) {
			final Type clazz = typeAccess.getType();
			if (clazz.isProxy()) {
				replacements.put((ClassDeclaration) clazz, replaceWithInterface((ClassDeclaration) clazz));
				if (LOGGER.isInfoEnabled()) {
					LOGGER.info(NLS.bind(Messages.infoReplacedClassWithInterface, clazz));
				}
			} else {
				LOGGER.warn(Messages.errorClassNoProxy);
				final ClassDeclaration child = (ClassDeclaration) typeAccess.eContainer();
				if (child.getSuperClass() != null) {
					LOGGER.error(
							NLS.bind(Messages.errorClassAlreadyHasSuperType, NameUtil.getFullyQualifiedName(child)));
					throw new ProcessingException();
				}
				if (LOGGER.isEnabledFor(Level.WARN)) {
					LOGGER.warn(NLS.bind(Messages.warnReplacedInterfaceWithClass,
							new String[] { child.getName(), clazz.getName() }));
				}
				child.setSuperClass(typeAccess);
			}
		}
		return replacements;
	}

	/**
	 * Searches all types which are class declarations
	 *
	 * @param accesses
	 *            A collection of accesses
	 * @return A set of accessed class declarations
	 */
	private Set<TypeAccess> getAccessedClassDeclarations(final Collection<TypeAccess> accesses) {
		return accesses.parallelStream()
				.filter(access -> JavaPackage.eINSTANCE.getClassDeclaration().isSuperTypeOf(access.getType().eClass()))
				.collect(Collectors.toSet());
	}

	/**
	 * Replaces the class with an new interface
	 *
	 * @param clazz
	 *            The class
	 * @return the interface
	 */
	private InterfaceDeclaration replaceWithInterface(final ClassDeclaration clazz) {
		final InterfaceDeclaration iface = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		iface.setName(clazz.getName());
		iface.setAbstractTypeDeclaration(clazz.getAbstractTypeDeclaration());
		iface.getAnnotations().addAll(clazz.getAnnotations());
		iface.setAnonymousClassDeclarationOwner(clazz.getAnonymousClassDeclarationOwner());
		iface.getBodyDeclarations().addAll(clazz.getBodyDeclarations());
		iface.getComments().addAll(clazz.getComments());
		iface.getCommentsAfterBody().addAll(clazz.getCommentsAfterBody());
		iface.getCommentsBeforeBody().addAll(clazz.getCommentsBeforeBody());
		iface.setModifier(clazz.getModifier());
		iface.setOriginalClassFile(clazz.getOriginalClassFile());
		iface.setOriginalCompilationUnit(clazz.getOriginalCompilationUnit());
		iface.setPackage(clazz.getPackage());
		final TypeAccess superClazz = clazz.getSuperClass();
		if (superClazz != null) {
			iface.getSuperInterfaces().add(superClazz);
		}
		iface.getSuperInterfaces().addAll(clazz.getSuperInterfaces());
		iface.getTypeParameters().addAll(clazz.getTypeParameters());
		iface.getUsagesInImports().addAll(clazz.getUsagesInImports());
		iface.getUsagesInTypeAccess().addAll(clazz.getUsagesInTypeAccess());
		EcoreUtil.replace(clazz, iface);
		return iface;
	}

	@Override
	public Class<AbstractTypeDeclaration> getSupportedType() {
		return AbstractTypeDeclaration.class;
	}

}
