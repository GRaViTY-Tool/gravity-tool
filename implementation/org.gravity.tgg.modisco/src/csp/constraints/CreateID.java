package csp.constraints;

import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class CreateID extends TGGConstraintImpl {
	private static int counter = 0;

	public void solve(Variable var_0) {
		String bindingStates = getBindingStates(var_0);

		switch (bindingStates) {
		case "F":
			var_0.setValue(counter++);
			// TODO Implement F-operation
			// throw new UnsupportedOperationException("This case in the
			// constraint has not been implemented yet: " + bindingStates);
		case "B":
			// TODO Implement B-operation
			// throw new UnsupportedOperationException("This case in the
			// constraint has not been implemented yet: " + bindingStates);
		default:
			// throw new UnsupportedOperationException("This case in the
			// constraint has not been implemented yet: " + bindingStates);
		}
		setSatisfied(true);

	}
}