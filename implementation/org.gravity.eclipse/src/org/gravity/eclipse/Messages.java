package org.gravity.eclipse;

import org.eclipse.osgi.util.NLS;

/**
 * The Class Messages.
 */
public class Messages extends NLS {

	/** The Constant BUNDLENAME. */
	public static final String BUNDLENAME = "org.gravity.eclipse.messages"; //$NON-NLS-1$

	public static String couldntLoadModel;

	public static String createPMFailed;

	/** The Java parse handler0. */
	public static String unhandledResource;

	/** The Java parse handler1. */
	public static String unhandledPackageFagment;

	/** The Java parse handler2. */
	public static String unhandledObject;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLENAME, Messages.class);
	}

	/**
	 * Instantiates a new messages.
	 */
	private Messages() {
		// There shouldn't be any instance of this class
	}
}
