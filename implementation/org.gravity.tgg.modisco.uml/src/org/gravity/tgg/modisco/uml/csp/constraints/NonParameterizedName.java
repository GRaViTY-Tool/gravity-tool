package org.gravity.tgg.modisco.uml.csp.constraints;

import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class NonParameterizedName extends TGGConstraintImpl {

	/**
	 * Constraint nonParameterizedName(v0)
	 *
	 * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
	 */
	public void solve(Variable v0) {
		final String bindingStates = getBindingStates(v0);

		if ("B".equals(bindingStates)) {
			setSatisfied(!((String) v0.getValue()).contains("<"));
		} else {
			setSatisfied(true);
		}
	}
}
