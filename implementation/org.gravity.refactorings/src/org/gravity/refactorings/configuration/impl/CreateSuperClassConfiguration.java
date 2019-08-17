package org.gravity.refactorings.configuration.impl;

import java.util.List;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;

public class CreateSuperClassConfiguration implements RefactoringConfiguration {

	private TClass tParent;
	private List<TClass> tChildren;

	
	public CreateSuperClassConfiguration(String namespace, String tParent, List<TClass> tChildren) {
		this(createTClass(namespace, tParent), tChildren);
	}

	public CreateSuperClassConfiguration(TClass tParent, List<TClass> tChildren) {
		this.tParent = tParent;
		this.tChildren = tChildren;
	}

	public List<TClass> getChildren() {
		return tChildren;
	}

	public TClass getNewParent() {
		return tParent;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.TCreateSuperClass;
	}

	private static TClass createTClass(String namespace, String name) {
		TPackage pack = null;
		for(String packageName : namespace.split("\\.")) {
			TPackage next = BasicFactory.eINSTANCE.createTPackage();
			next.setTName(packageName);
			if(pack != null) {
				pack.getSubpackage().add(next);
			}
			pack = next;
		}
		TClass tClass = BasicFactory.eINSTANCE.createTClass();
		tClass.setTLib(false);
		tClass.setTName(name);
		if(pack != null) {
			pack.getClasses().add(tClass);
			pack.getOwnedTypes().add(tClass);
		}
		return tClass;
	}
}
