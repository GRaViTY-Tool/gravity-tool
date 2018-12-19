package org.gravity.refactorings;

/**
 * This exception should be thrown if a refactoring fails unexpectedly
 * 
 * @author speldszus
 *
 */
public class RefactoringFailedException extends Exception {

	/**
	 * The serial UID for this exception
	 */
	private static final long serialVersionUID = 2918658008875038122L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message The message
	 */
	public RefactoringFailedException(String message) {
		super(message);
	}

}
