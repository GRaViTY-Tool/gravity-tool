package org.gravity.hulk.exceptions;

/**
 * An exception for indicating that the anti-pattern detection failed.
 * 
 * @author speldszus
 *
 */
public class DetectionFailedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4123348891829637655L;

	/**
	 * Creates a new exception with the given message
	 * 
	 * @param message
	 */
	public DetectionFailedException(String message) {
		super(message);
	}

	/**
	 * Created a new exception with an other exception as the cause of the detection failing
	 * 
	 * @param cause The cause for failure
	 */
	public DetectionFailedException(Throwable cause) {
		super(cause);
	}

}
