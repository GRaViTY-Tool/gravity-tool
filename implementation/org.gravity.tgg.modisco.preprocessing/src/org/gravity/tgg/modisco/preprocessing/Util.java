package org.gravity.tgg.modisco.preprocessing;

import java.util.ArrayList;

import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.Package;
import org.gravity.modisco.MGravityModel;

public class Util {
	private static ArrayList<Package> fillAllPackages(ArrayList<Package> packages){
		ArrayList<Package> newPackages = new ArrayList<Package>();
		for(Package mPackage: packages){
			for( Package ownedPackage : mPackage.getOwnedPackages()){
				if(!packages.contains(ownedPackage)){
					newPackages.add(ownedPackage);
				}
			}
		}
		if(newPackages.size() > 0){
			
			newPackages.addAll(fillAllPackages(newPackages));
			return newPackages;
		}
		return newPackages;
	}
	
	public static ArrayList<Package> getAllPackages(MGravityModel model){
		ArrayList<Package> packages = new ArrayList<Package>();
		packages.addAll(model.getOwnedElements());
		packages.addAll(fillAllPackages(packages));
		return packages;
	}
	
	public static ArrayList<ClassDeclaration> getAllClasses(MGravityModel model, boolean includeProxyClasses){
		ArrayList<ClassDeclaration> classes = new ArrayList<ClassDeclaration>();
		ArrayList<Package> packages = getAllPackages(model);
		for( Package mPackage : packages){
			for( AbstractTypeDeclaration element : mPackage.getOwnedElements()){
				if(element instanceof ClassDeclaration){
					ClassDeclaration mClass = (ClassDeclaration) element;
					if(includeProxyClasses || !mClass.isProxy()){
						classes.add(mClass);
					}
				}
			}
		}
		return classes;
	}

}
