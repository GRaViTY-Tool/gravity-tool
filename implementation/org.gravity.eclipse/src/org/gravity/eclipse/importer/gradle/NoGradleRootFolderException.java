package org.gravity.eclipse.importer.gradle;

/**
 * A Exception of this type should be thrown if the root of a gradle project cannot be found
 * @author speldszus
 *
 */
public class NoGradleRootFolderException extends GradleImportException {

	/**
	 * A generated id
	 */
	private static final long serialVersionUID = 5578756709979719901L;

	/**
	 * Creates a new Exception with a default message
	 */
	public NoGradleRootFolderException() {
		super("The gradle root folder cannot be found.");
	}

}
