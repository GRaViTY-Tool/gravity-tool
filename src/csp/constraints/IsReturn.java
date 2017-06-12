package csp.constraints;

import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class IsReturn extends TGGConstraintImpl {
	public void solve(Variable var_0){
    	String bindingStates = getBindingStates(var_0);
    	
    	switch(bindingStates){
    	case "F":
    		var_0.bindToValue(ParameterDirectionKind.RETURN_LITERAL);
    		setSatisfied(true);
    		break;
    	case "B":
    		setSatisfied(var_0.getValue().equals(ParameterDirectionKind.RETURN_LITERAL));
    		break;
    	default: 
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	}
    	
  	}	  
}