package org.gravity.modisco.bugfixes;

import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.emf.impl.AnnotationImpl;

/**
 * An override for the standard annotation implementation to fix an exception in
 * the toString operation
 *
 * @author speldszus
 *
 */
@SuppressWarnings("restriction")
public class MAnnotation extends AnnotationImpl {

	@Override
	public String toString() {
		final StringBuilder result = new StringBuilder(getClass().getName());
		result.append('@').append(System.identityHashCode(this));

		if (eIsProxy()) {
			result.append(" (eProxyURI: ").append(eProxyURI());
			if (eDynamicClass() != null) {
				result.append(" eClass: ").append(eDynamicClass());
			}
			result.append(')');
		} else if (eDynamicClass() != null) {
			result.append(" (eClass: ").append(eDynamicClass()).append(')');
		}
		result.append("\n\nannotation type = "); //$NON-NLS-1$
		if (getType() != null) {
			result.append(getType().toString());
		} else {
			result.append("null"); //$NON-NLS-1$
		}
		for (final AnnotationMemberValuePair member : getValues()) {
			result.append("\nvalue of ") //$NON-NLS-1$
			.append(member.getName()).append(" = ") //$NON-NLS-1$
			.append(member.getValue());
		}
		return result.toString();
	}
}
