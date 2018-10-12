package org.gravity.eclipse.exceptions;

/**
 * This exception will be thrown if the translation of the an intermediate model
 * into a PG failed
 */
public class TGGFailedException extends TransformationFailedException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6336472898852501535L;

	/**
	 * Instantiates a new TGG failed exception.
	 */
	public TGGFailedException() {
		super();
	}

	/**
	 * Instantiates a new TGG failed exception.
	 *
	 * @param message
	 *            the message
	 */
	public TGGFailedException(String message) {
		super(message);
	}

}
