package org.gravity.tgg.modisco.preprocessing;

import java.util.ArrayList;

import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.VisibilityKind;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MSyntheticMethodDefinition;
import org.gravity.modisco.ModiscoFactory;

public class SyntethicMethodsPreprocessor {
	
	
	public void addSyntethicMembers(MMethodDefinition mDef){
		AbstractTypeDeclaration abstractTypeDeclaration = mDef.getAbstractTypeDeclaration();
		if(abstractTypeDeclaration != null && abstractTypeDeclaration instanceof ClassDeclaration){
			ClassDeclaration mClass = (ClassDeclaration) abstractTypeDeclaration;
			
			TypeAccess superClassAccess = mClass.getSuperClass();
			if(superClassAccess != null){
			Type superClassType = superClassAccess.getType();
			if(superClassType != null && superClassType instanceof ClassDeclaration){
				ClassDeclaration superClass = (ClassDeclaration) superClassType;
				if(!superClass.eIsProxy()){
					boolean needsSynt = true;
					for(BodyDeclaration body: superClass.getBodyDeclarations()){
						if(body instanceof MMethodDefinition){
							
							MMethodDefinition superMDef = (MMethodDefinition) body;
							if(superMDef.getMMethodSignature() == mDef.getMMethodSignature()){
								needsSynt = false;
							}
						}
					}
					
					if(needsSynt){
						
					}
					
				}
			}
		}
		}
	}
	
	public ClassDeclaration getSuperClass(ClassDeclaration mClass){
		TypeAccess superAccess = mClass.getSuperClass();
		if(superAccess != null){
			Type superType = superAccess.getType();
			if(superType != null && superType instanceof ClassDeclaration){
				return (ClassDeclaration) superType;
			}
		}
		return null;
	}
	
	public boolean definesWithEqualSignatureMethod(ClassDeclaration mClass, MMethodDefinition methodDef){
		for(BodyDeclaration declaration: mClass.getBodyDeclarations()){
			if(declaration instanceof MMethodDefinition){
				if(((MMethodDefinition)declaration).getMMethodSignature() == methodDef.getMMethodSignature()){
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean hasVisibility(ClassDeclaration mClass, ClassDeclaration superClass, MMethodDefinition mDef){
		VisibilityKind vis = mDef.getModifier().getVisibility();
		if(vis == VisibilityKind.PUBLIC && vis == VisibilityKind.PROTECTED){
			return true;
		}
		if(vis == VisibilityKind.NONE && superClass.getPackage() == mClass.getPackage()){
			return true;
		}
		return false;
	}
	
	
	public void addSyntethicMethodsForClass(ClassDeclaration mClass, ClassDeclaration superClass){
		for(BodyDeclaration declaration: superClass.getBodyDeclarations()){
			MMethodDefinition superMethod = null;
			if(declaration instanceof MMethodDefinition){
				superMethod = (MMethodDefinition) declaration;
			}
			if(declaration instanceof MSyntheticMethodDefinition){
				superMethod = ((MSyntheticMethodDefinition)declaration).getOriginalMethodDefinition();
			}
			
			if(superMethod != null && !definesWithEqualSignatureMethod(mClass, superMethod)){			
				if(hasVisibility(mClass, superClass, superMethod)){
					MSyntheticMethodDefinition synt = ModiscoFactory.eINSTANCE.createMSyntheticMethodDefinition();
					synt.setOriginalMethodDefinition(superMethod);
					synt.setName(superMethod.getName());
					mClass.getBodyDeclarations().add(synt);
					superMethod.getSyntheticMethodDefinitions().add(synt);
				}
			}
		}
	}
	
	public void addSyntethicMethods(ClassDeclaration mClass, ArrayList<ClassDeclaration> remainingClasses){
		ClassDeclaration superClass = getSuperClass(mClass);
		if(superClass != null  && !superClass.isProxy()){
			if(remainingClasses.contains(superClass)){
				//has no syntethic methods added till now
				remainingClasses.remove(superClass);
				addSyntethicMethods(superClass, remainingClasses);
			}
			
			addSyntethicMethodsForClass(mClass, superClass);
		}
		
		if(!remainingClasses.isEmpty()){
			ClassDeclaration nextMClass = remainingClasses.get(0);
			remainingClasses.remove(nextMClass);
			addSyntethicMethods(nextMClass, remainingClasses);
		}
	}
	
	public ArrayList<Package> getAllPackages(ArrayList<Package> packages){
		ArrayList<Package> newPackages = new ArrayList<Package>();
		for(Package mPackage: packages){
			for( Package ownedPackage : mPackage.getOwnedPackages()){
				if(!packages.contains(ownedPackage)){
					newPackages.add(ownedPackage);
				}
			}
		}
		if(newPackages.size() > 0){
			
			newPackages.addAll(getAllPackages(newPackages));
			return newPackages;
		}
		return newPackages;
	}
	
	public ArrayList<ClassDeclaration> getAllClasses(MGravityModel model){
		ArrayList<ClassDeclaration> classes = new ArrayList<ClassDeclaration>();
		ArrayList<Package> packages = new ArrayList<Package>();
		packages.addAll(model.getOwnedElements());
		packages.addAll(getAllPackages(packages));
		for( Package mPackage : packages){
			for( AbstractTypeDeclaration element : mPackage.getOwnedElements()){
				if(element instanceof ClassDeclaration){
					ClassDeclaration mClass = (ClassDeclaration) element;
					if(!mClass.isProxy()){
						classes.add(mClass);
					}
				}
			}
		}
		return classes;
	}
	
	public void addSyntethicMethods(MGravityModel model){
		ArrayList<ClassDeclaration> classes = getAllClasses(model);
		if(classes.size() > 0){
			ClassDeclaration mClass = classes.get(0);
			classes.remove(mClass);
			addSyntethicMethods(mClass, classes);
		}
	}

}
