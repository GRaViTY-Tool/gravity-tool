package org.gravity.tgg.modisco.pm.csp.constraints;

import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class UpperBound extends TGGConstraintImpl {
	public void solve(final Variable var_0, final Variable var_1){
		final var bindingStates = getBindingStates(var_0, var_1);

		final var string = (String)var_0.getValue();
		if(string == null) {
			throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
		}
		final var array = string.trim().endsWith("[]");
		switch(bindingStates){
		case "BB":
			if(array) {
				setSatisfied(((Integer) var_1.getValue()) != 0);
			}
			else {
				setSatisfied(((Integer) var_1.getValue()) == 1);
			}
			break;
		case "BF":
			if(array) {
				var_1.setValue(-1);
			}
			else {
				var_1.setValue(1);
			}
			setSatisfied(true);
			break;
		default:
			throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
		}

	}
}