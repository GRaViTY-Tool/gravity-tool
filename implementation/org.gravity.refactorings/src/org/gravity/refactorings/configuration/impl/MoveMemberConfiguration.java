/**
 */
package org.gravity.refactorings.configuration.impl;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TSignature;

public class MoveMemberConfiguration implements RefactoringConfiguration {

	final private TClass source;
	final private TClass target;
	final private TSignature member;

	public MoveMemberConfiguration(TSignature member, TClass source, TClass target) {
		this.member = member;
		this.source = source;
		this.target = target;
	}

	public TSignature getSignature() {
		return member;
	}
	
	public TClass getSourceClass() {
		return source;
	}

	public TClass getTargetClass() {
		return target;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.MOVE_MEMBER;
	}
}
