package org.emoflon.ibex.tgg.operational.csp.constraints.custom.modisco;

import org.eclipse.modisco.java.VisibilityKind;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;
import org.gravity.typegraph.basic.TVisibility;

public class UserDefined_defaultVisibility extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint defaultVisibility(v0, v1)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {

		if (variables.size() != 2) {
			throw new IllegalArgumentException("The CSP " + getClass().getName() + " needs exactly two variables");
		}

		RuntimeTGGAttributeConstraintVariable a = variables.get(0);
		RuntimeTGGAttributeConstraintVariable b = variables.get(1);

		String bindingStates = getBindingStates(a, b);

		switch (bindingStates) {
		case "FB":
			TVisibility tVisibility = (TVisibility) b.getValue();
			a.bindToValue(TVisibilityToVKind(tVisibility));
			setSatisfied(true);
			break;
		case "BF":
			VisibilityKind vKind = (VisibilityKind) a.getValue();
			b.bindToValue(VKindToTVisibility(vKind));
			setSatisfied(true);
			break;
		case "BB":

			TVisibility tVis = (TVisibility) b.getValue();
			VisibilityKind visKind = (VisibilityKind) a.getValue();
			setSatisfied(visKind.equals(TVisibilityToVKind(tVis)));
			break;

		case "FF":
			setSatisfied(true);
			break;
		default:
			setSatisfied(true);
			break;
		}
	}

	private VisibilityKind TVisibilityToVKind(TVisibility tVisibility) {
		if (tVisibility == TVisibility.TPUBLIC) {
			return VisibilityKind.PUBLIC;
		}
		if (tVisibility == TVisibility.TPROTECTED) {
			return VisibilityKind.PROTECTED;
		}
		if (tVisibility == TVisibility.TPACKAGE) {
			return VisibilityKind.NONE;
		}
		if (tVisibility == TVisibility.TPRIVATE) {
			return VisibilityKind.PRIVATE;
		}
		// default Value
		return VisibilityKind.NONE;
	}

	private TVisibility VKindToTVisibility(VisibilityKind vKind) {
		if (vKind == VisibilityKind.PUBLIC) {
			return TVisibility.TPUBLIC;
		}
		if (vKind == VisibilityKind.PROTECTED) {
			return TVisibility.TPROTECTED;
		}
		if (vKind == VisibilityKind.NONE) {
			return TVisibility.TPACKAGE;
		}
		if (vKind == VisibilityKind.PRIVATE) {
			return TVisibility.TPRIVATE;
		}
		// default Value
		return TVisibility.TPACKAGE;
	}
}

