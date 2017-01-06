package org.gravity.modisco.bugfixes;

import java.lang.reflect.Method;

import org.eclipse.gmt.modisco.java.AnnotationMemberValuePair;

public class AnnotationImpl extends org.eclipse.gmt.modisco.java.emf.impl.AnnotationImpl {

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder(getClass().getName());
	    result.append('@');
	    result.append(Integer.toHexString(hashCode()));

	    if (eIsProxy())
	    {
	      result.append(" (eProxyURI: ");
	      result.append(eProxyURI());
	      if (eDynamicClass() != null)
	      {
	        result.append(" eClass: ");
	        result.append(eDynamicClass());
	      }
	      result.append(')');
	    }
	    else if (eDynamicClass() != null)
	    {
	      result.append(" (eClass: ");
	      result.append(eDynamicClass());
	      result.append(')');
	    }
		result.append("\n"); //$NON-NLS-1$
		result.append("annotation type = "); //$NON-NLS-1$
		if (getType() != null) {
			result.append(getType().toString());
		} else {
			result.append("null"); //$NON-NLS-1$
		}
		for (AnnotationMemberValuePair member : getValues()) {
			result.append("\n"); //$NON-NLS-1$
			result.append("value of "); //$NON-NLS-1$
			result.append(member.getName());
			result.append(" = "); //$NON-NLS-1$
			result.append(member.getValue());
		}
		return result.toString();
	}
}
