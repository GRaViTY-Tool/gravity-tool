package org.gravity.refactorings.configuration.impl;

import java.util.List;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TSignature;

public class ExtractSuperClassConfiguration implements RefactoringConfiguration {

	private List<TClass> children;
	private TClass newParent;
	private List<TSignature> signatures;

	public ExtractSuperClassConfiguration(List<TClass> children, TClass newParent, List<TSignature> signatures) {
		this.children = children;
		this.newParent = newParent;
		this.signatures = signatures;
	}

	public List<TClass> getChildren() {
		return children;
	}

	public TClass getNewParent() {
		return newParent;
	}

	public List<TSignature> getSignatures() {
		return signatures;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.EXTRACT_SUPERCLASS;
	}

}
