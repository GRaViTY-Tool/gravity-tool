package org.gravity.metrics.sourcemeter;

/**
 * This exception should be thrown if a class identified by name cannot be found
 * 
 * @author speldszus
 *
 */
public class UnknownClassException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7904966962893561225L;
	
	private final String unqualifiedName;
	private final String qualifiedName;

	/**
	 * This constructor should be used whenever possible.
	 * 
	 * @param unqualifiedName The name of the class
	 * @param qualifiedName The qualified name of the class
	 */
	public UnknownClassException(String unqualifiedName, String qualifiedName) {
		this.unqualifiedName = unqualifiedName;
		this.qualifiedName = qualifiedName;
	}

	/**
	 * This constructor should be used if only the unqualified name of the class are available
	 * 
	 * @param unqualifiedName The name of the class
	 */
	public UnknownClassException(String unqualifiedName) {
		this.unqualifiedName = unqualifiedName;
		this.qualifiedName = null;
	}

	@Override
	public String getMessage() {
		StringBuilder builder = new StringBuilder("Unknown class: \"");
		builder.append(unqualifiedName);
		if(qualifiedName != null) {
			builder.append(" with qualified name \"");
			builder.append(qualifiedName);
			builder.append('\"');
		}
		return builder.toString();
	}
}
