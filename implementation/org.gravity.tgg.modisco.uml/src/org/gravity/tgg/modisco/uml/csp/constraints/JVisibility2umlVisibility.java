package org.gravity.tgg.modisco.uml.csp.constraints;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;

import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class JVisibility2umlVisibility extends TGGConstraintImpl {

	private static final Map<org.eclipse.modisco.java.VisibilityKind, org.eclipse.uml2.uml.VisibilityKind> jToU = new ConcurrentHashMap<>(
			4);
	private static final Map<org.eclipse.uml2.uml.VisibilityKind, org.eclipse.modisco.java.VisibilityKind> uToJ = new ConcurrentHashMap<>(
			4);

	static {
		jToU.put(org.eclipse.modisco.java.VisibilityKind.PRIVATE, org.eclipse.uml2.uml.VisibilityKind.PRIVATE_LITERAL);
		jToU.put(org.eclipse.modisco.java.VisibilityKind.PROTECTED,
				org.eclipse.uml2.uml.VisibilityKind.PROTECTED_LITERAL);
		jToU.put(org.eclipse.modisco.java.VisibilityKind.NONE, org.eclipse.uml2.uml.VisibilityKind.PACKAGE_LITERAL);
		jToU.put(org.eclipse.modisco.java.VisibilityKind.PUBLIC, org.eclipse.uml2.uml.VisibilityKind.PUBLIC_LITERAL);

		uToJ.put(org.eclipse.uml2.uml.VisibilityKind.PRIVATE_LITERAL, org.eclipse.modisco.java.VisibilityKind.PRIVATE);
		uToJ.put(org.eclipse.uml2.uml.VisibilityKind.PROTECTED_LITERAL,
				org.eclipse.modisco.java.VisibilityKind.PROTECTED);
		uToJ.put(org.eclipse.uml2.uml.VisibilityKind.PACKAGE_LITERAL, org.eclipse.modisco.java.VisibilityKind.NONE);
		uToJ.put(org.eclipse.uml2.uml.VisibilityKind.PUBLIC_LITERAL, org.eclipse.modisco.java.VisibilityKind.PUBLIC);
	}

	/**
	 * Constraint jVisibility2umlVisibility(v0, v1)
	 *
	 * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
	 */
	public void solve(Variable v0, Variable v1) {
		final String bindingStates = getBindingStates(v0, v1);

		switch (bindingStates) {
		case "BB":
			setSatisfied(jToU.get(v0.getValue()) == v1.getValue());
			break;
		case "BF":
			v1.bindToValue(jToU.get(v0.getValue()));
			setSatisfied(true);
			break;
		case "FB":
			v0.bindToValue(uToJ.get(v1.getValue()));
			setSatisfied(true);
			break;
		case "FF":
			@SuppressWarnings("unchecked")
			final Entry<org.eclipse.modisco.java.VisibilityKind, org.eclipse.uml2.uml.VisibilityKind>[] entries = jToU
					.entrySet().toArray(new Map.Entry[jToU.size()]);
			final int selection = ThreadLocalRandom.current().nextInt(entries.length);
			v0.bindToValue(entries[selection].getKey());
			v1.bindToValue(entries[selection].getValue());
			setSatisfied(true);
			break;
		default:
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);
		}
	}
}
