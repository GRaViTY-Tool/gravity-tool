package org.emoflon.ibex.tgg.operational.csp.constraints.custom.uml;

import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;

public class UserDefined_isReturn extends RuntimeTGGAttributeConstraint {

	/**
	 * Constraint isReturn(v0)
	 * 
	 * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
	 */
	@Override
	public void solve() {
		if (variables.size() != 1)
			throw new RuntimeException("The CSP -ISRETURN- needs exactly 1 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		String bindingStates = getBindingStates(v0);

		switch (bindingStates) {
		case "F":
			v0.bindToValue(ParameterDirectionKind.RETURN_LITERAL);
			setSatisfied(true);
			break;
		case "B":
			setSatisfied(v0.getValue().equals(ParameterDirectionKind.RETURN_LITERAL));
			break;
		default:
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);
		}
	}
}
