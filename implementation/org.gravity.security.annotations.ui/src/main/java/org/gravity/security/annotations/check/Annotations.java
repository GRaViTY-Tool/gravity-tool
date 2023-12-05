package org.gravity.security.annotations.check;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IType;

class Annotations {
	final Set<String> secrecySignatures;
	final Set<String> integritySignatures;
	final IType type;
	final IAnnotation annotation;

	public Annotations(final Set<String> secrecySignatures, final Set<String> integritySignatures, final IType type,
			final IAnnotation critical) {
		this.annotation = critical;
		this.type = type;
		this.secrecySignatures = secrecySignatures;
		this.integritySignatures = integritySignatures;
	}

	public Set<String> secrecy() {
		return new HashSet<>(this.secrecySignatures);
	}

	public Set<String> integrity() {
		return new HashSet<>(this.integritySignatures);
	}
}