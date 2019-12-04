package org.gravity.refactorings.configuration.impl;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TSignature;

public abstract class PullUpMemberConfiguration implements RefactoringConfiguration {

	private final TSignature signature;
	private final TClass sourceClass;

	public PullUpMemberConfiguration(TSignature signature, TClass sourceClass) {
		this.signature = signature;
		this.sourceClass = sourceClass;
	}

	public TSignature getSignature() {
		return this.signature;
	}

	public TClass getTargetClass() {
		return this.sourceClass;
	}

}
