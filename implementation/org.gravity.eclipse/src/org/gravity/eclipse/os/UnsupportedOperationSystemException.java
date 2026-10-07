package org.gravity.eclipse.os;

import org.eclipse.core.runtime.Platform;

public class UnsupportedOperationSystemException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = -4243056359909543277L;

	public UnsupportedOperationSystemException(final String string) {
		super("ErrorMessage=\"" + string + "\",\nos.name=\"" + System.getProperty("os.name") + "\",\nOS="
				+ Platform.getOS() + "\"");
	}

	public UnsupportedOperationSystemException() {
	}

}
