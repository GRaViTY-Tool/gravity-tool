package org.gravity.tgg.modisco.pm.csp.constraints;

import org.eclipse.modisco.java.VisibilityKind;
import org.gravity.typegraph.basic.TVisibility;
import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class InterfaceVisibility extends TGGConstraintImpl {
	public void solve(final Variable modisco, final Variable pm){
		final String bindingStates = getBindingStates(modisco, pm);

		switch(bindingStates){
		case "FB":
			final TVisibility tVisibility = (TVisibility) pm.getValue();
			modisco.bindToValue(tVisibilityToVKind(tVisibility));
			setSatisfied(true);
			break;
		case "BF":
			final VisibilityKind vKind = (VisibilityKind) modisco.getValue();
			pm.bindToValue(vKindToTVisibility(vKind));
			setSatisfied(true);
			break;
		case "BB":
			final TVisibility tVis = (TVisibility) pm.getValue();
			final VisibilityKind visKind = (VisibilityKind) modisco.getValue();
			setSatisfied(tVis.equals(vKindToTVisibility(visKind)));
			break;
		case "FF":
			setSatisfied(true);
			break;
		default:
			setSatisfied(true);
			break;
		}
	}

	private VisibilityKind tVisibilityToVKind(final TVisibility tVisibility){
		if(tVisibility == TVisibility.TPUBLIC){
			return VisibilityKind.PUBLIC;
		}
		if(tVisibility == TVisibility.TPROTECTED){
			return VisibilityKind.PROTECTED;
		}
		if(tVisibility == TVisibility.TPACKAGE){
			throw new UnsupportedOperationException("Interface should not have a member with package visibility");
		}
		if(tVisibility == TVisibility.TPRIVATE){
			return VisibilityKind.PRIVATE;
		}
		// default Value
		return VisibilityKind.NONE;
	}


	private TVisibility vKindToTVisibility(final VisibilityKind vKind){
		if(vKind == VisibilityKind.PUBLIC){
			return TVisibility.TPUBLIC;
		}
		if(vKind == VisibilityKind.PROTECTED){
			return TVisibility.TPROTECTED;
		}
		if(vKind == VisibilityKind.NONE){
			return TVisibility.TPUBLIC;
		}
		if(vKind == VisibilityKind.PRIVATE){
			return TVisibility.TPRIVATE;
		}
		// default Value
		return TVisibility.TPUBLIC;
	}
}