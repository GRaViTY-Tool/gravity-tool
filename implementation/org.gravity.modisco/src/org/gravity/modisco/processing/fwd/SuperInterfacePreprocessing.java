package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.InterfaceDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.gravity.modisco.MGravityModel;
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
	public boolean process(MGravityModel model, Collection<AbstractTypeDeclaration> elements,
			IProgressMonitor monitor) {
		Set<TypeAccess> brokenTypeAccesses = elements.parallelStream()
				.flatMap(type -> getAccessedClassDeclarations(type.getSuperInterfaces()).parallelStream())
				.collect(Collectors.toSet());
		return process(model, brokenTypeAccesses);
	}

	/**
	 * @param model
	 * @param brokenTypeAccesses
	 * @return
	 */
	private boolean process(MGravityModel model, Set<TypeAccess> brokenTypeAccesses) {
		HashMap<ClassDeclaration, InterfaceDeclaration> replacements = new HashMap<>(brokenTypeAccesses.size());
		for (TypeAccess typeAccess : brokenTypeAccesses) {
			Type clazz = typeAccess.getType();
			if (clazz.isProxy()) {
				replacements.put((ClassDeclaration) clazz, replaceWithInterface((ClassDeclaration) clazz));
				LOGGER.log(Level.INFO, "Replaced class with interface: " + clazz);
			} else {
				LOGGER.log(Level.ERROR, "Broken class is not a proxy!");
				ClassDeclaration child = (ClassDeclaration) typeAccess.eContainer();
				if (child.getSuperClass() != null) {
					LOGGER.log(Level.ERROR, child + " has alread a super class!");
					return false;
				}
				LOGGER.log(Level.WARN, "Replaced interface implementation with super class: " + child.getName() + " -> "
						+ clazz.getName());
				child.setSuperClass(typeAccess);
			}
		}
		for (Entry<EObject, Collection<Setting>> entry : EcoreUtil.UsageCrossReferencer
				.findAll(replacements.keySet(), model.eResource().getResourceSet()).entrySet()) {
			EObject key = entry.getKey();
			if (key instanceof ClassDeclaration) {
				ClassDeclaration replacedClass = (ClassDeclaration) key;
				Collection<Setting> references = entry.getValue();
				for (Setting s : references) {
					s.getEObject().eSet(s.getEStructuralFeature(), replacements.get(replacedClass));
				}
			} else {
				LOGGER.log(Level.ERROR, "Cannot handle crossreference to: " + key);
			}

		}
		replacements.clear();
		return true;
	}

	/**
	 * Searches all types which are class declarations
	 * 
	 * @param accesses A collection of accesses
	 * @return A set of accessed class declarations
	 */
	private Set<TypeAccess> getAccessedClassDeclarations(Collection<TypeAccess> accesses) {
		return accesses.parallelStream()
				.filter(access -> JavaPackage.eINSTANCE.getClassDeclaration()
						.isSuperTypeOf(access.getType().eClass()))
				.collect(Collectors.toSet());
	}

	/**
	 * Replaces the class with an new interface
	 * 
	 * @param clazz The class
	 * @return the interface
	 */
	private InterfaceDeclaration replaceWithInterface(ClassDeclaration clazz) {
		InterfaceDeclaration iface = JavaFactory.eINSTANCE.createInterfaceDeclaration();
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
		TypeAccess superClazz = clazz.getSuperClass();
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
