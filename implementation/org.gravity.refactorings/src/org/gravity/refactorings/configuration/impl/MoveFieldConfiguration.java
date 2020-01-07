/**
 */
package org.gravity.refactorings.configuration.impl;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldSignature;

public class MoveFieldConfiguration extends MoveMemberConfiguration implements RefactoringConfiguration {

	public MoveFieldConfiguration(TFieldSignature signature, TClass source, TClass target) {
		super(signature, source, target);
	}

	@Override
	public TFieldSignature getSignature() {
		return (TFieldSignature) super.getSignature();
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.MOVE_FIELD;
	}

}