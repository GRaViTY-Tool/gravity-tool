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
		if (variables.size() != 2)
			throw new RuntimeException("The CSP -PARAMETERIZEDNAMEFITSNONPARAMETERIZEDNAME- needs exactly 2 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		RuntimeTGGAttributeConstraintVariable v1 = variables.get(1);
		String bindingStates = getBindingStates(v0, v1);

		switch (bindingStates) {
		case "BB":
			String parameterizedName = (String) v0.getValue();
			String nonParameterizedName = (String) v1.getValue();
			int lastOuterDot = -1;
			int bracketCount = 0;
			char[] chars = parameterizedName.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				char c = chars[i];
				if (c == '.' && bracketCount == 0) {
					lastOuterDot = i;
				} else if (c == '<') {
					bracketCount++;
				} else if (c == '>') {
					bracketCount--;
				}
			}
			setSatisfied(parameterizedName.startsWith(nonParameterizedName, lastOuterDot + 1));
			return;
		default:
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);
		}
	}
}
