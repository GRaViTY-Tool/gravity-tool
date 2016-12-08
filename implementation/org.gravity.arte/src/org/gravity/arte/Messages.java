package org.gravity.arte;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages {
	private static final String BUNDLE_NAME = "org.gravity.arte.messages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private static final MessageFormat MESSAGE_FORMAT = new MessageFormat(""); //$NON-NLS-1$

	private Messages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	public static String getString(String key, Object[] messageArguments) {
		try {
			MESSAGE_FORMAT.applyPattern(RESOURCE_BUNDLE.getString(key));
			return MESSAGE_FORMAT.format(messageArguments);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	public static String applyPattern(String format, String[] messageArguments) {
		MESSAGE_FORMAT.applyPattern(format);
		return MESSAGE_FORMAT.format(messageArguments);
	}
}
