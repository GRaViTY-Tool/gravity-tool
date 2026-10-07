package org.gravity.eclipse.importer.gradle;

import java.util.regex.Pattern;

/**
 * This class holds frequently used patterns for parsing gradle files
 *
 * @author speldszus
 *
 */
final class GradleRegexPatterns {

	private GradleRegexPatterns() {
		// This class shouldn't be instantiated
	}

	/**
	 * Plugin applications
	 */
	protected static final Pattern PLUGIN = Pattern.compile("(apply\\W+plugin:\\W*['\"])(.+)['\"]");

	/**
	 * Defintions
	 */
	protected static final Pattern DEFINITION = Pattern.compile("def\\s+(\\w+)\\s+=\\s+\\[[^\\]]((?s).)+\\]");

	/**
	 * The single entries of an include
	 */
	protected static final Pattern INCLUDE_ENTRY = Pattern.compile("(['\"](:)?)([\\w\\-:]+)['\"]");

	/**
	 * inclusions
	 */
	protected static final Pattern INCLUDE = Pattern.compile("include\\s*\\(?(((\\s*?,\\s*?)?(['\"]([\\w\\-:]+)['\"]))+)\\)?");

	/**
	 * inclusion of variable
	 */
	protected static final Pattern INCLUDE_VAR = Pattern.compile("include\\s*\\(?(([\\w\\-:]+)\\s+as\\s+[\\w\\-:\\[\\]]+)\\)?");

	/**
	 * Dependencies
	 */
	protected static final Pattern SINGLE_DEPENDENCY = Pattern.compile("(implementation|compile|useLibrary)(\\s+)['\"](.+)['\"]");
	protected static final Pattern MULTIPLE_DEPENDENCIES_ENTRY = Pattern.compile("classpath\\s+['\"](.+)['\"]");

	/**
	 * The min and max Android SDK version
	 */
	protected static final Pattern ANDROID_SDK_VERSION = Pattern.compile("(((min)|(target)|(compile))SdkVersion)(\\s+)(\\d+)");

}
