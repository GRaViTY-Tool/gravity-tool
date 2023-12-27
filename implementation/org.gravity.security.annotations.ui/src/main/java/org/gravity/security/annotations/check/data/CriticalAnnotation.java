package org.gravity.security.annotations.check.data;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jdt.core.IAnnotation;

public class CriticalAnnotation {
	final Set<String> secrecySignatures;
	final Set<String> integritySignatures;
	final IAnnotation annotation;

	public CriticalAnnotation(final IAnnotation critical, final Set<String> secrecySignatures,
			final Set<String> integritySignatures) {
		this.annotation = critical;
		this.secrecySignatures = secrecySignatures;
		this.integritySignatures = integritySignatures;
	}

	public Set<String> secrecy() {
		return new HashSet<>(this.secrecySignatures);
	}

	public Set<String> integrity() {
		return new HashSet<>(this.integritySignatures);
	}

	public IAnnotation getAnnotation() {
		return this.annotation;
	}
}