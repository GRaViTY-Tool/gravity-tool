package org.gravity.refactorings.configuration.impl;

import java.util.List;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.typegraph.basic.TClass;

public class CreateSuperClassConfiguration implements RefactoringConfiguration {

	private TClass tParent;
	private List<TClass> tChildren;

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

}
