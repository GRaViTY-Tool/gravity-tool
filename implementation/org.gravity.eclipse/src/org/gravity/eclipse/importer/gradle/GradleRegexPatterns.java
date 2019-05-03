package org.gravity.eclipse.importer.gradle;

import java.util.regex.Pattern;

/**
 * This class holds frequently used patterns for parsing gradle files
 * 
 * @author speldszus
 *
 */
class GradleRegexPatterns {

	/**
	 * Plugin applications
	 */
	static final Pattern PLUGIN = Pattern.compile("(apply\\W+plugin:\\W*')(.+)(')");
	
	/**
	 * Defintions
	 */
	static final Pattern DEFINITION = Pattern.compile("def\\s+(\\w+)\\s+=\\s+\\[((.|\\n|\\r)+?)\\]");
	
	/**
	 * The single entries of an include
	 */
	static final Pattern INCLUDE_ENTRY = Pattern.compile("(('|\")(:)?)((\\w|-|_|\\d|:)+)('|\")");
	
	/**
	 * inclusions
	 */
	static final Pattern INCLUDE = Pattern.compile(
			"(include)(\\s*)(\\(?)(((((('|\")(:)?)((\\w|-|_|\\d|:)+)('|\"))(\\s*,\\s+)?)+)|\\((\\w+)\\s+as\\s+((\\w|\\[|\\]|_)+)\\))(\\)?)");
	
	/**
	 * Dependencies
	 */
	static final Pattern SINGLE_DEPENDENCY = Pattern.compile("(compile|useLibrary)(\\s+)('|\")(.+)('|\")");
//	static final Pattern MULTIPLE_DEPENDENCIES = Pattern.compile("(?:dependencies\\s*)\\{(?:.|\\s)+?\\}");
	static final Pattern MULTIPLE_DEPENDENCIES_ENTRY = Pattern.compile("classpath\\s+('|\")(.+)('|\")");
	
	/**
	 * The min and max Android SDK version
	 */
	static final Pattern ANDROID_SDK_VERSION = Pattern.compile("(((min)|(target))SdkVersion)(\\s+)(\\d+)");
	
}
