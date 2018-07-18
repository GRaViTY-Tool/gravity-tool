package org.gravity.eclipse.os;

public class UnsupportedOperationSystemException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4243056359909543277L;

	public UnsupportedOperationSystemException(String string) {
		super("ErrorMessage=\""+string+"\",\nos.name=\""+System.getProperty("os.name")+"\",\nOS="+OperationSystem.os+"\"");
	}

	public UnsupportedOperationSystemException() {
		super();
	}

}
