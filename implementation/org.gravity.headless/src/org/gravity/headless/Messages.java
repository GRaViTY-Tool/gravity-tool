package org.gravity.headless;

import org.eclipse.osgi.util.NLS;

/**
 * An accessor class to the localized messages of the GRaViTY headless implementation
 *
 * @author speldszus
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = Messages.class.getPackageName() + ".messages"; //$NON-NLS-1$
	// Explanation of launcher options
	public static String explainOptionCache;
	public static String explainOptionCacheModelNumber;
	public static String explainOptionCacheRepositoryNumber;
	public static String explainOptionHelp;
	public static String explainOptionLog;
	public static String explainOptionPort;
	public static String explainOptionSaveFailed;
	public static String explainOptionServer;
	public static String explainOptionVersion;
	public static String explainOptionWorkspace;
	public static String batch;
	public static String createCacheFailed;
	public static String createLogFailed;
	public static String howtoShutdown;
	public static String launched;
	public static String runningOn;
	public static String noPort;

	// Runtime error messages
	public static String errorCloneFailed;
	public static String errorHttpNoCommitID;
	public static String errorHttpNoGitURL;
	public static String errorHttpNoGroupID;
	public static String errorHttpNoArtifactID;
	public static String errorHttpNoVersion;
	public static String errorGravityTGG;
	public static String errorPM;
	public static String errorFreeCache;
	public static String errorClone;
	public static String errorCannotCheckoutCommit;
	public static String errorImportFailed;
	public static String errorNoSupportetBuildSystem;
	public static String errorPMSerialize;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// This class should not be instantiated
	}
}
