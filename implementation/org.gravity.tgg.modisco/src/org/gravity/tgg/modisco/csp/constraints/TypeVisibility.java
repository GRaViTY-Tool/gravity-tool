package org.gravity.tgg.modisco.csp.constraints;

import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class TypeVisibility extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1){
    	String bindingStates = getBindingStates(var_0, var_1);
    	
    	switch(bindingStates){
    	case "FB":
    		// TODO Implement FB-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	case "BF":
    		// TODO Implement BF-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	case "FF":
    		// TODO Implement FF-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	case "BB":
    		// TODO Implement BB-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	default: 
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	}
    	
  	}	  
}