package org.gravity.tgg.uml;

/**
 * An exception for indicating that a model transformation failed
 * 
 * @author speldszus
 *
 */
public class TransformationFailedException extends Exception {

	/** 
	 * @see java.lang.Serializable
	 */
	private static final long serialVersionUID = -5078757297349685856L;

	/**
	 * Creates a new transformation with the given error message
	 * 
	 * @param message The error message
	 */
	public TransformationFailedException(String message) {
		super(message);
	}

}
