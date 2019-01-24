package org.gravity.eclipse.importer.gradle;

import org.gravity.eclipse.importer.ImportException;

/**
 * This exception should be thrwon if the import of a gradle project failed
 * 
 * @author speldszus
 *
 */
public class GradleImportException extends ImportException {

	/**
	 * A generated serial version ID 
	 */
	private static final long serialVersionUID = -300723204808288520L;
	
	/**
	 * Creates an instance with an given message
	 * 
	 * @param message The message
	 */
	public GradleImportException(String message) {
		super(message);
	}

	/**
	 * Creates an instance with an other exception as cause and a given message
	 * 
	 * @param message The message
	 * @param cause The cause
	 */
	public GradleImportException(String message, Exception cause) {
		super(message, cause);
	}

	/**
	 * Creates an instance with an other exception as cause
	 * 
	 * @param cause The cause
	 */
	public GradleImportException(Exception cause) {
		super(cause);
	}

}
