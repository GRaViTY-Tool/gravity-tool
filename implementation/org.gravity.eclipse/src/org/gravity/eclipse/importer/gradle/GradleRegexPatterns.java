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
	final static Pattern PLUGIN = Pattern.compile("(apply\\W+plugin:\\W*')(.+)(')");
	
	/**
	 * Defintions
	 */
	final static Pattern DEFINITION = Pattern.compile("def\\s+(\\w+)\\s+=\\s+\\[((.|\\n|\\r)+?)\\]");
	
	/**
	 * The single entries of an include
	 */
	final static Pattern INCLUDE_ENTRY = Pattern.compile("('(:)?)((\\w|-|_|\\d)+)(')");
	
	/**
	 * inclusions
	 */
	final static Pattern INCLUDE = Pattern.compile(
			"(include)(\\s*)((((('(:)?)((\\w|-|_|\\d)+)('))(\\s*,\\s+)?)+)|\\((\\w+)\\s+as\\s+((\\w|\\[|\\]|_)+)\\))");
	
	/**
	 * Dependencies
	 */
	final static Pattern SINGLE_DEPENDENCY = Pattern.compile("(compile|useLibrary)(\\s+)('|\")(.+)('|\")");
	
	/**
	 * The min and max Android SDK version
	 */
	final static Pattern ANDROID_SDK_VERSION = Pattern.compile("(((min)|(target))SdkVersion)(\\s+)(\\d+)");
	
}
