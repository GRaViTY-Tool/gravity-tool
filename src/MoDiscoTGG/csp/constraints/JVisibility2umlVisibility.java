package MoDiscoTGG.csp.constraints;

import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class JVisibility2umlVisibility extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1){
    	String bindingStates = getBindingStates(var_0, var_1);
    	
    	if (var_0.isBound()) {
    		System.out.println("var_0 "+((org.eclipse.gmt.modisco.java.VisibilityKind)var_0.getValue()).getName()+"->"+org.eclipse.uml2.uml.VisibilityKind.getByName(((org.eclipse.gmt.modisco.java.VisibilityKind)var_0.getValue()).getName()));
    	}
    	if (var_1.isBound()) {
    		System.out.println("var_1 "+((org.eclipse.uml2.uml.VisibilityKind)var_0.getValue()).getName()+"->"+org.eclipse.gmt.modisco.java.VisibilityKind.getByName(((org.eclipse.uml2.uml.VisibilityKind)var_1.getValue()).getName()));
    	}
    	
    	switch(bindingStates){
    	case "BB":
    		setSatisfied(((org.eclipse.gmt.modisco.java.VisibilityKind)var_0.getValue()).getName().equals(((org.eclipse.uml2.uml.VisibilityKind)var_1.getValue()).getName()));
    	case "BF":
    		var_1.bindToValue(org.eclipse.uml2.uml.VisibilityKind.getByName(((org.eclipse.gmt.modisco.java.VisibilityKind)var_0.getValue()).getName()));
    		setSatisfied(true);
    	case "FB":
    		var_0.bindToValue(org.eclipse.gmt.modisco.java.VisibilityKind.getByName(((org.eclipse.uml2.uml.VisibilityKind)var_1.getValue()).getName()));
    		setSatisfied(true);
    	default: 
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	}
    	
  	}	  
}