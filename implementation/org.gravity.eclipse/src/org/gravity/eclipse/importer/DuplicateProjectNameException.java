package org.gravity.eclipse.importer;

public class DuplicateProjectNameException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4090818541178903310L;

	public  DuplicateProjectNameException() {
		
	}
	
	public DuplicateProjectNameException(String string) {
		super(string);
	}

}
