/**
 */
package org.gravity.refactorings.configuration.impl;

import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;

public class MoveMethodConfiguration extends MoveMemberConfiguration {

	public MoveMethodConfiguration(TSignature member, TClass source, TClass target) {
		super(member, source, target);
	}

	@Override
	public TMethodSignature getSignature() {
		return (TMethodSignature) super.getSignature();
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.MOVE_METHOD;
	}
}