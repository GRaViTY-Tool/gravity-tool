package org.emoflon.ibex.tgg.operational.csp.constraints.factories.modisco;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.operational.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;			

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.modisco.UserDefined_defaultVisibility;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.modisco.UserDefined_interfaceVisibility;

public class UserDefinedRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public UserDefinedRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("defaultVisibility", () -> new UserDefined_defaultVisibility());
		creators.put("interfaceVisibility", () -> new UserDefined_interfaceVisibility());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
}
