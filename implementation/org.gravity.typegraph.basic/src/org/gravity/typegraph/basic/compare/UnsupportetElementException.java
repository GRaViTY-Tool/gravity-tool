package org.gravity.typegraph.basic.compare;

/**
 * This exception should be thrown if an element is not supported by a processing of a model
 * 
 * @author speldszus
 *
 */
public class UnsupportetElementException extends Exception {

	private static final long serialVersionUID = -5817533255729198889L;

	private final Class<?> type;

	/**
	 * A constructor taking the unsupported element
	 * 
	 * @param type The unsupported element
	 */
	public UnsupportetElementException(Class<?> type) {
		super("The type \"" + type + "\" is not supported"); //$NON-NLS-1$//$NON-NLS-2$
		this.type = type;
	}

	/**
	 * A getter for the unsupported element due to which this exception has been thrown
	 * 
	 * @return the unsupported element
	 */
	public Class<?> getUnsupportetType() {
		return this.type;
	}
}
