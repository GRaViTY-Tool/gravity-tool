package org.gravity.refactorings.ui;

import org.eclipse.osgi.util.NLS;

/**
 * The message strings for the Refactorings UI
 *
 * @author speldszus
 *
 */
public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.gravity.refactorings.ui.messages"; //$NON-NLS-1$

	// Below are the message keys
	public static String classNotFound;
	public static String createPMFailed;
	public static String enterTargetClass;
	public static String executeRefactoring;
	public static String installConverter;
	public static String internalError;
	public static String targetIsLib;
	public static String moveMethod;
	public static String moveMethodNotPossible;
	public static String moveMethodFromTo;
	public static String pullUpUMethod;
	public static String pullUpMethodFailed;
	public static String pullUpMethodNotPossible;
	public static String refactoringError;
	public static String refactoringInfo;
	public static String refactoringNotPossible;
	public static String selectMethod;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// This class shouldn't be initialized
	}
}
