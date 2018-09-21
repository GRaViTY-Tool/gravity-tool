package org.gravity.tgg.modisco.uml.csp.constraints;

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
			int lastOuterDot = -1;
			int bracketCount = 0;
			char[] chars = parameterizedName.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				char c = chars[i];
				if (c=='.' && bracketCount==0) {
					lastOuterDot = i;
				} else if (c=='<') {
					bracketCount++;
				} else if (c=='>') {
					bracketCount--;
				}
			}
			setSatisfied(parameterizedName.startsWith(nonParameterizedName, lastOuterDot+1));
			return;
		default:
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);
		}

	}
}