package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
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
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.UnresolvedInterfaceDeclaration;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.eclipse.modisco.java.emf.JavaPackage;
import org.eclipse.osgi.util.NLS;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.Messages;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

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
	public boolean process(final MGravityModel model, final Collection<AbstractTypeDeclaration> elements,
			final IFolder debug, final IProgressMonitor monitor) {
		final Set<TypeAccess> brokenTypeAccesses = elements.parallelStream()
				.flatMap(type -> getNonInterfaceDeclarations(type.getSuperInterfaces()).parallelStream())
				.collect(Collectors.toSet());
		return process(model, brokenTypeAccesses);
	}

	private boolean process(final MGravityModel model, final Set<TypeAccess> brokenTypeAccesses) {
		final var replacements = calculateReplacements(brokenTypeAccesses, model);
		if (!replacements.isEmpty()) {
			replace(model, replacements);
		}
		return true;
	}

	/**
	 * Replaces type instances with interfaces
	 *
	 * @param model        The model in which the types should be replaced
	 * @param replacements the types to be replaced and their replacements
	 */
	private void replace(final MGravityModel model,
			final Map<AbstractTypeDeclaration, InterfaceDeclaration> replacements) {
		for (final Entry<EObject, Collection<Setting>> entry : UsageCrossReferencer
				.findAll(replacements.keySet(), model.eResource()).entrySet()) {
			final var key = entry.getKey();
			if (!(key instanceof InterfaceDeclaration)) {
				final var replacedClass = key;
				for (final Setting setting : entry.getValue()) {
					setting.getEObject().eSet(setting.getEStructuralFeature(), replacements.get(replacedClass));
				}
			} else {
				LOGGER.error(NLS.bind(Messages.errorUnhandeldedCrossref, key));
			}

		}
		replacements.clear();
	}

	final Map<String, UnresolvedInterfaceDeclaration> proxies = new HashMap<>();

	private Map<AbstractTypeDeclaration, InterfaceDeclaration> calculateReplacements(
			final Set<TypeAccess> brokenTypeAccesses, final Model model) {
		final Map<AbstractTypeDeclaration, InterfaceDeclaration> replacements = new ConcurrentHashMap<>(
				brokenTypeAccesses.size());
		for (final TypeAccess typeAccess : brokenTypeAccesses) {
			final var type = (AbstractTypeDeclaration) typeAccess.getType();
			if (type.isProxy()) {
				replacements.put(type, createReplacementType(type));
				if (LOGGER.isInfoEnabled()) {
					LOGGER.info(NLS.bind(Messages.infoReplacedClassWithInterface, type));
				}
			} else {
				LOGGER.warn(Messages.errorClassNoProxy);
				final var child = (AbstractTypeDeclaration) typeAccess.eContainer();
				if (LOGGER.isEnabledFor(Level.WARN)) {
					LOGGER.warn(NLS.bind(Messages.warnReplacedInterfaceWithClass,
							new String[] { child.getName(), type.getName() }));
				}

				final var iface = this.proxies.computeIfAbsent(type.getName(), name -> {
					final var replacement = JavaFactory.eINSTANCE.createUnresolvedInterfaceDeclaration();
					model.getUnresolvedItems().add(replacement);
					replacement.setName(name);
					return replacement;
				});
				typeAccess.setType(iface);
			}
		}
		return replacements;
	}

	/**
	 * Searches all types which are not interface declarations
	 *
	 * @param accesses A collection of accesses
	 * @return A set of accessed type declarations that are not interfaces
	 */
	private Set<TypeAccess> getNonInterfaceDeclarations(final Collection<TypeAccess> accesses) {
		final Set<TypeAccess> classes = new HashSet<>();
		for (final TypeAccess access : accesses) {
			final var type = access.getType();
			if (type != null) {
				if (JavaPackage.eINSTANCE.getClassDeclaration().isSuperTypeOf(type.eClass())
						|| JavaPackage.eINSTANCE.getEnumDeclaration().isSuperTypeOf(type.eClass())
						|| JavaPackage.eINSTANCE.getAnnotationTypeDeclaration().isSuperTypeOf(type.eClass())) {
					classes.add(access);
				}
			} else {
				LOGGER.warn("TypeAccess has no type! Access contained in: " + access.eContainer());
			}
		}
		return classes;
	}

	/**
	 * Creates a new interface for replacing the type
	 *
	 * @param type The class
	 * @return the interface
	 */
	private InterfaceDeclaration createReplacementType(final AbstractTypeDeclaration type) {
		final var iface = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		iface.setName(type.getName());
		iface.setAbstractTypeDeclaration(type.getAbstractTypeDeclaration());
		iface.getAnnotations().addAll(type.getAnnotations());
		iface.setAnonymousClassDeclarationOwner(type.getAnonymousClassDeclarationOwner());
		iface.getBodyDeclarations().addAll(type.getBodyDeclarations());
		iface.getComments().addAll(type.getComments());
		iface.getCommentsAfterBody().addAll(type.getCommentsAfterBody());
		iface.getCommentsBeforeBody().addAll(type.getCommentsBeforeBody());
		iface.setModifier(type.getModifier());
		iface.setOriginalClassFile(type.getOriginalClassFile());
		iface.setOriginalCompilationUnit(type.getOriginalCompilationUnit());
		iface.setPackage(type.getPackage());
		iface.getSuperInterfaces().addAll(type.getSuperInterfaces());
		iface.getUsagesInImports().addAll(type.getUsagesInImports());
		iface.getUsagesInTypeAccess().addAll(type.getUsagesInTypeAccess());
		if (type instanceof ClassDeclaration) {
			final var clazz = (ClassDeclaration) type;
			final var superClazz = clazz.getSuperClass();
			if (superClazz != null) {
				iface.getSuperInterfaces().add(superClazz);
				iface.getTypeParameters().addAll(clazz.getTypeParameters());
			}
		}
		return iface;
	}

	@Override
	public Class<AbstractTypeDeclaration> getSupportedType() {
		return AbstractTypeDeclaration.class;
	}

}
