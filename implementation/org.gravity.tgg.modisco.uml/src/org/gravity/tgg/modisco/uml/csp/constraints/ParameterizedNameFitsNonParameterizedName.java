package org.gravity.tgg.modisco.uml.csp.constraints;

import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class ParameterizedNameFitsNonParameterizedName extends TGGConstraintImpl {

	/**
	 * Constraint parameterizedNameFitsNonParameterizedName(v0, v1)
	 *
	 * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
	 */
	public void solve(Variable v0, Variable v1) {
		final String bindingStates = getBindingStates(v0, v1);

		if ("BB".equals(bindingStates)) {
			final String parameterizedName = (String) v0.getValue();
			final String nonParameterizedName = (String) v1.getValue();
			int lastOuterDot = -1;
			int bracketCount = 0;
			final char[] chars = parameterizedName.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				final char c = chars[i];
				if (c == '.' && bracketCount == 0) {
					lastOuterDot = i;
				} else if (c == '<') {
					bracketCount++;
				} else if (c == '>') {
					bracketCount--;
				}
			}
			setSatisfied(parameterizedName.startsWith(nonParameterizedName, lastOuterDot + 1));
		} else {
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);
		}
	}
}
