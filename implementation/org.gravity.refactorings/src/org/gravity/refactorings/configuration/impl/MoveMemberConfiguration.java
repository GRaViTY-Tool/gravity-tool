/**
 */
package org.gravity.refactorings.configuration.impl;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TSignature;

public class MoveMemberConfiguration implements RefactoringConfiguration {

	private final TClass source;
	private final TClass target;
	private final TSignature member;

	public MoveMemberConfiguration(TSignature member, TClass source, TClass target) {
		this.member = member;
		this.source = source;
		this.target = target;
	}

	public TSignature getSignature() {
		return this.member;
	}

	public TClass getSourceClass() {
		return this.source;
	}

	public TClass getTargetClass() {
		return this.target;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.MOVE_MEMBER;
	}
}
