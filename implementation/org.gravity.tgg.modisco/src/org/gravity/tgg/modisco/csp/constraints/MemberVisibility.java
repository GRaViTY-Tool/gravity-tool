package org.gravity.tgg.modisco.csp.constraints;

import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class MemberVisibility extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1, Variable var_2){
    	String bindingStates = getBindingStates(var_0, var_1, var_2);
    	
    	switch(bindingStates){
    	case "BFB":
    		// TODO Implement BFB-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	case "BBB":
    		// TODO Implement BBB-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	case "FFB":
    		// TODO Implement FFB-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	case "FBB":
    		// TODO Implement FBB-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	default: 
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	}
    	
  	}	  
}