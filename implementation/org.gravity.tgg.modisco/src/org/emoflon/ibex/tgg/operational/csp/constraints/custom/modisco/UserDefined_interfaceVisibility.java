package org.emoflon.ibex.tgg.operational.csp.constraints.custom.modisco;

import org.eclipse.modisco.java.VisibilityKind;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;
import org.gravity.typegraph.basic.TVisibility;

public class UserDefined_interfaceVisibility extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint interfaceVisibility(v0, v1)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		if (variables.size() != 2)
			throw new RuntimeException("The CSP -INTERFACEVISIBILITY- needs exactly 2 variables");

		RuntimeTGGAttributeConstraintVariable mVisibilityVar = variables.get(0);
		RuntimeTGGAttributeConstraintVariable tVisibilityVar = variables.get(1);
		
		String bindingStates = getBindingStates(mVisibilityVar, tVisibilityVar);

		switch(bindingStates){
    	case "FB":
    		TVisibility tVisibility = (TVisibility) tVisibilityVar.getValue();
    		mVisibilityVar.bindToValue(tVisibilityToVKind(tVisibility));
    		setSatisfied(true);
    		break;
    	case "BF":
    		VisibilityKind vKind = (VisibilityKind) mVisibilityVar.getValue();
    		tVisibilityVar.bindToValue(vKindToTVisibility(vKind));
    		setSatisfied(true);
    		break;
    	case "BB":
    		TVisibility tVis = (TVisibility) tVisibilityVar.getValue();
    		VisibilityKind visKind = (VisibilityKind) mVisibilityVar.getValue();
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
	
	private VisibilityKind tVisibilityToVKind(TVisibility tVisibility){		
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
	
	
	private TVisibility vKindToTVisibility(VisibilityKind vKind){		
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