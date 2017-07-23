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
	public void solve(Variable var_0, Variable var_1, Variable var_2, Variable var_3) {
		String bindingStates = getBindingStates(var_0, var_1, var_2, var_3);
		String nonParameterizedName1 = (String) var_2.getValue();
		String nonParameterizedName2 = (String) var_3.getValue();
		if (!nonParameterizedName1.equals(nonParameterizedName2)) {
			setSatisfied(false);
			return;
		}
		String parameterizedName1, parameterizedName2;
		switch (bindingStates) {
		case "BBBB":
			parameterizedName1 = (String) var_0.getValue();
			parameterizedName2 = (String) var_1.getValue();
			if (!parameterizedName1.equals(parameterizedName2)) {
				setSatisfied(false);
				return;
			}
			setSatisfied(parameterizedName1.matches("(.*\\.)?" + nonParameterizedName1 + "<.*"));
			return;
		case "FBBB":
			parameterizedName2 = (String) var_1.getValue();
			setSatisfied(parameterizedName2.matches("(.*\\.)?" + nonParameterizedName2 + "<.*"));
			if (satisfied) {
				var_0.bindToValue(parameterizedName2);
			}
			return;
		case "BFBB":
			parameterizedName1 = (String) var_0.getValue();
			setSatisfied(parameterizedName1.matches("(.*\\.)?" + nonParameterizedName1 + "<.*"));
			if (satisfied) {
				var_1.bindToValue(parameterizedName1);
			}
			return;
		default:
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);
		}

	}
}