package org.gravity.eclipse.importer.gradle;

public class NoGradleRootFolderException extends GradleImportException {

	public NoGradleRootFolderException() {
		super("The gradle root folder cannot be found.");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5578756709979719901L;

}
