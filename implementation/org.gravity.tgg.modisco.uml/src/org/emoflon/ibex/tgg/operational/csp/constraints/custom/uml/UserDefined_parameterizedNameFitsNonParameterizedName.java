package org.emoflon.ibex.tgg.operational.csp.constraints.custom.uml;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;

public class UserDefined_parameterizedNameFitsNonParameterizedName extends RuntimeTGGAttributeConstraint {

	/**
	 * Constraint parameterizedNameFitsNonParameterizedName(v0, v1)
	 *
	 * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
	 */
	@Override
	public void solve() {
		if (this.variables.size() != 2) {
			throw new RuntimeException("The CSP -PARAMETERIZEDNAMEFITSNONPARAMETERIZEDNAME- needs exactly 2 variables");
		}

		final RuntimeTGGAttributeConstraintVariable v0 = this.variables.get(0);
		final RuntimeTGGAttributeConstraintVariable v1 = this.variables.get(1);
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
