package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.InterfaceDeclaration;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.IMoDiscoProcessor;

/**
 * This preprocessor replaces MClasses with Interfaces if they have falsely been discovered as classes
 * 
 * @author speldszus
 *
 */
public class SuperInterfacePreprocessing implements IMoDiscoProcessor {

	private static final Logger LOGGER = Logger.getLogger(SuperInterfacePreprocessing.class);

	@Override
	public boolean process(MGravityModel model, IProgressMonitor monitor) {
		Set<ClassDeclaration> brokenTypeAccesses = new HashSet<>();
		Stack<Package> stack = new Stack<>();
		stack.addAll(model.getOwnedElements());
		while(!stack.isEmpty()) {
			Package p = stack.pop();
			stack.addAll(p.getOwnedPackages());
			for(AbstractTypeDeclaration type : p.getOwnedElements()) {
				brokenTypeAccesses.addAll(getAccessedClassDeclarations(type.getSuperInterfaces()));
			}
		}
		Hashtable<ClassDeclaration, InterfaceDeclaration> replacements = new Hashtable<>(brokenTypeAccesses.size());
		for(ClassDeclaration clazz : brokenTypeAccesses) {
			if(!clazz.isProxy()) {
				LOGGER.log(Level.ERROR, "Broken class is not a proxy!");
				return false;
			}
			replacements.put(clazz,replaceWithInterface(clazz));
			LOGGER.log(Level.INFO, "Replaced class with interface: "+clazz);
		}
		for(Entry<EObject, Collection<Setting>> entry : EcoreUtil.UsageCrossReferencer.findAll(brokenTypeAccesses, model.eResource().getResourceSet()).entrySet()) {
			ClassDeclaration replacedClass = (ClassDeclaration) entry.getKey();
			Collection<Setting> references = entry.getValue();
			for(Setting s : references) {
				s.getEObject().eSet(s.getEStructuralFeature(), replacements.get(replacedClass));
			}
		}
		replacements.clear();
		EcoreUtil.deleteAll(brokenTypeAccesses, true);
		brokenTypeAccesses.clear();
		return true;
	}
	
	/**
	 * Searches all types which are class declarations
	 * 
	 * @param accesses A collection of accesses
	 * @return A set of accessed class declarations
	 */
	private Set<ClassDeclaration> getAccessedClassDeclarations(Collection<TypeAccess> accesses) {
		Set<ClassDeclaration> classDecls = new HashSet<>();
		for(TypeAccess access : accesses) {
			Type superType = access.getType();
			if(JavaPackage.eINSTANCE.getClassDeclaration().isSuperTypeOf(superType.eClass())) {
				classDecls.add((ClassDeclaration) access.getType());
			}
		}
		return classDecls;
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
		if(superClazz != null) {
			iface.getSuperInterfaces().add(superClazz);
		}
		iface.getSuperInterfaces().addAll(clazz.getSuperInterfaces());
		iface.getTypeParameters().addAll(clazz.getTypeParameters());
		iface.getUsagesInImports().addAll(clazz.getUsagesInImports());
		iface.getUsagesInTypeAccess().addAll(clazz.getUsagesInTypeAccess());
		EcoreUtil.replace(clazz, iface);
		return iface;
	}

}
