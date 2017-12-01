/**
 */
package org.gravity.refactorings.configuration.impl;

import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;

public class PullUpMethodConfiguration extends PullUpMemberConfiguration {
	
	public PullUpMethodConfiguration(TSignature signature, TClass sourceClass) {
		super(signature, sourceClass);
	}
	
	public TMethodSignature getSignature() {
		return (TMethodSignature) super.getSignature();
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.TPullUpMethod;
	}
}