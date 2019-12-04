package org.gravity.hulk.ui;

import org.eclipse.osgi.util.NLS;

public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.gravity.hulk.ui.messages"; //$NON-NLS-1$
	public static String scan;
	public static String apSelection;
	public static String detect;
	public static String select;
	public static String noPM;
	public static String unknownSelection;
	public static String error;
	public static String foundSmell;
	public static String saveAPsFailed;
	public static String nothingSelected;
	public static String hulkAPDetection;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// This class shouldn't be instantiated
	}
}
