package org.emoflon.ibex.tgg.operational.csp.constraints.factories.uml;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.operational.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;			

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.uml.UserDefined_isReturn;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.uml.UserDefined_isInParameter;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.uml.UserDefined_jVisibility2umlVisibility;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.uml.UserDefined_parameterizedNameFitsNonParameterizedName;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.uml.UserDefined_nonParameterizedName;

public class UserDefinedRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public UserDefinedRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("isReturn", () -> new UserDefined_isReturn());
		creators.put("isInParameter", () -> new UserDefined_isInParameter());
		creators.put("jVisibility2umlVisibility", () -> new UserDefined_jVisibility2umlVisibility());
		creators.put("parameterizedNameFitsNonParameterizedName", () -> new UserDefined_parameterizedNameFitsNonParameterizedName());
		creators.put("nonParameterizedName", () -> new UserDefined_nonParameterizedName());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
}
