package org.gravity.refactorings.configuration.impl;

import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TSignature;

public class PullUpFieldConfiguration extends PullUpMemberConfiguration {

	public PullUpFieldConfiguration(TSignature signature, TClass sourceClass) {
		super(signature, sourceClass);
	}

	public TFieldSignature getSignature() {
		return (TFieldSignature) super.getSignature();
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.TPullUpField;
	}
}
