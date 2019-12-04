/**
 *
 */
package org.gravity.modisco.util;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.Package;

/**
 * This class contains methods for generating names form MoDisco elements
 *
 * @author speldszus
 *
 */
public final class NameUtil {

	private NameUtil() {
		// This class shouldn't be instantiated
	}

	/**
	 * Builds the fully qualified name of the type
	 *
	 * @param type A type
	 * @return the name
	 */
	public static String getFullyQualifiedName(AbstractTypeDeclaration type) {
		final List<String> names = new LinkedList<>();
		names.add(type.getName());
		Package current = type.getPackage();
		while(current != null) {
			names.add(current.getName());
			current = current.getPackage();
		}
		return String.join(".", names); //$NON-NLS-1
	}

	/**
	 * Builds the fully qualified name of the member definition
	 *
	 * @param definition a member definition
	 * @return The fully qualified name
	 */
	public static String getFullyQualifiedName(BodyDeclaration definition) {
		StringBuilder name = new StringBuilder();
		final AbstractTypeDeclaration declaringType = definition.getAbstractTypeDeclaration();
		if (declaringType != null) {
			name = name.append(declaringType.getName()).append('.');
		}
		return name.append(definition.getName()).toString();
	}

}
