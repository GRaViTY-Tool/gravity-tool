package org.gravity.modisco.processing;

import org.eclipse.osgi.util.NLS;

/**
 * Strings used in messages
 * 
 * @author speldszus
 *
 */
public class ProcessingMessages extends NLS {
	private static final String BUNDLE_NAME = "org.gravity.modisco.processing.messages"; //$NON-NLS-1$
	public static String FieldPreprocessing_the_field;
	public static String FieldPreprocessing_no_type;
	public static String FieldPreprocessing_no_fragments;
	public static String FieldPreprocessing_multiple_fragments;
	public static String FieldPreprocessing_no_type_assume_object;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, ProcessingMessages.class);
	}

	private ProcessingMessages() {
	}
}
