package org.gravity.refactorings.configuration.impl;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TSignature;

public abstract class PullUpMemberConfiguration implements RefactoringConfiguration {

	final private TSignature signature;
	final private TClass sourceClass;

	public PullUpMemberConfiguration(TSignature signature, TClass sourceClass) {
		this.signature = signature;
		this.sourceClass = sourceClass;
	}
	
	public TSignature getSignature() {
		return signature;
	}
	
	public TClass getTargetClass() {
		return sourceClass;
	}

}
