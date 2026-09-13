package org.gravity.security.annotations.check.data;

public enum SecurityProperty {

	SECRECY("secrecy"), INTEGRITY("integrity");

	private final String name;

	private SecurityProperty(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}