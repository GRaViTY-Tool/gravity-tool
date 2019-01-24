package org.gravity.eclipse.importer;

public class ImportException extends Exception {

	/**
	 * The generated serial ID
	 */
	private static final long serialVersionUID = -6970975621652921211L;

	/**
	 * Creates an instance with an given message
	 * 
	 * @param message The message
	 */
	public ImportException(String message) {
		super(message);
	}

	/**
	 * Creates an instance with an other exception as cause and a given message
	 * 
	 * @param message The message
	 * @param cause The cause
	 */
	public ImportException(String message, Exception cause) {
		super(message, cause);
	}

	/**
	 * Creates an instance with an other exception as cause
	 * 
	 * @param cause The cause
	 */
	public ImportException(Exception cause) {
		super(cause);
	}

}
