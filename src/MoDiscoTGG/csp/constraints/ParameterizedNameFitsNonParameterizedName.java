package MoDiscoTGG.csp.constraints;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class ParameterizedNameFitsNonParameterizedName extends TGGConstraintImpl {
	// private static final Pattern pattern = Pattern.compile("(?:\\.)(\\w*)(?:<)");

	/**
	 * 
	 * @param var_0
	 *            the name of the parameterizedType
	 * @param var_1
	 *            the name of the nonParameterizedType
	 */
	public void solve(Variable var_0, Variable var_1) {
		String bindingStates = getBindingStates(var_0, var_1);
		switch (bindingStates) {
		case "BB":
			String parameterizedName = (String) var_0.getValue();
			String nonParameterizedName = (String) var_1.getValue();
			setSatisfied(parameterizedName.matches("([^<]*\\.)?" + nonParameterizedName + "<.*"));
			return;
		default:
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);
		}

	}
}