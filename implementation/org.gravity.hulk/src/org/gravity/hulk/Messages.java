package org.gravity.hulk;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public final class Messages {
	private static final String BUNDLE_NAME = "org.gravity.hulk.messages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private Messages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (final MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
