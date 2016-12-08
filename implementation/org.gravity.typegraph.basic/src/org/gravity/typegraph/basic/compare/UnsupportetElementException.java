package org.gravity.typegraph.basic.compare;

public class UnsupportetElementException extends Exception {

	private static final long serialVersionUID = -5817533255729198889L;

	private final Class<?> type;

	public UnsupportetElementException(Class<?> type) {
		this.type = type;
	}

	public Class<?> getUnsupportetType() {
		return this.type;
	}

	@Override
	public void printStackTrace() {
		System.err.print("The type \"" + this.type + "\" is not supported"); //$NON-NLS-1$//$NON-NLS-2$
	}
}
