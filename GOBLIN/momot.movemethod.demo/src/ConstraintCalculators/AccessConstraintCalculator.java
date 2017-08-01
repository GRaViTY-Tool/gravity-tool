package ConstraintCalculators;

import java.util.HashMap;
import java.util.Map;

import org.gravity.tgg.modisco.Rules.TypesVisibility;
import org.gravity.tgg.modisco.Rules.impl.TypesVisibilityImpl;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.impl.TMethodDefinitionImpl;

import momotFiles.Utility;

public class AccessConstraintCalculator extends ConstraintCalculator{
	
	
	
	private boolean violatesAcc2(TAccess access,TMethodDefinition methodDef, TClass sourceClass){
		TModifier targetMod = access.getTTarget().getTModifier();
		if(targetMod == null){
			return false;
		}
		if(targetMod.isIsStatic()){
			return false;
		}
		if(methodDef.getMinimumRequiredVisibility(access.getTTarget()) != TVisibility.TPROTECTED){
			return false;
		}
		if(access.getStaticType() == null 
				|| !(access.getStaticType() instanceof TClass)
				|| Utility.isSubClass((TClass)access.getStaticType(), sourceClass) 
				|| sourceClass == access.getStaticType() ){
			return false;
		}
		if(targetMod.getTVisibility() == TVisibility.TPUBLIC){
			return false;
		}
		
		
		return true;
	}
	
	private Map<TMember, TVisibility> methodViolations(TMethodDefinition methodDef, TClass sourceClass) {
		Map<TMember, TVisibility> violations = new HashMap<>();
		for(TAccess access: methodDef.getTAccessing()){
			if(violatesAcc2(access, methodDef, sourceClass)){
				violations.put(access.getTTarget(), TVisibility.TPUBLIC);
			}
		}
		return violations;
	}

	private Map<TMember, TVisibility> classViolations(TClass tClass) {
		Map<TMember, TVisibility> violations = new HashMap<>();
		for(TMethodDefinition methodDef : Utility.getMethodDefinitions(tClass)){
			violations.putAll(methodViolations(methodDef, tClass));
		}	
		return violations;
	}
	
	@Override
	public Map<TMember, TVisibility> violations(TypeGraph graph) {
		Map<TMember, TVisibility> violations = new HashMap<>();
		for(TClass tClass: Utility.getDefinedClasses(graph)){
			violations.putAll(classViolations(tClass));
		}
		return violations;
	}

}
