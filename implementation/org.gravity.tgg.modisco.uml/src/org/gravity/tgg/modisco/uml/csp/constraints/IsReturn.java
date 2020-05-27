package org.gravity.tgg.modisco.uml.csp.constraints;

import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class IsReturn extends TGGConstraintImpl {

	/**
	 * Constraint isReturn(v0)
	 * 
	 * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
	 */
	public void solve(Variable v0) {
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
