package org.emoflon.ibex.tgg.operational.csp.constraints.custom.uml;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;

public class UserDefined_nonParameterizedName extends RuntimeTGGAttributeConstraint {

	/**
	 * Constraint nonParameterizedName(v0)
	 *
	 * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
	 */
	@Override
	public void solve() {
		if (this.variables.size() != 1) {
			throw new RuntimeException("The CSP -NONPARAMETERIZEDNAME- needs exactly 1 variables");
		}

		final RuntimeTGGAttributeConstraintVariable v0 = this.variables.get(0);
		final String bindingStates = getBindingStates(v0);

		if ("B".equals(bindingStates)) {
			setSatisfied(!((String) v0.getValue()).contains("<"));
		} else {
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);
		}
	}
}
