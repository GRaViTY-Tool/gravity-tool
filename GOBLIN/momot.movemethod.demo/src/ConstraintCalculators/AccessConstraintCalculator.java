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
	
	
	
	private ViolationsMap violatesAcc2(TAccess access,TMethodDefinition methodDef, TClass sourceClass){
		ViolationsMap violations = new ViolationsMap();
		TModifier targetMod = access.getTTarget().getTModifier();
		if(targetMod == null){
			return violations;
		}
		if(targetMod.isIsStatic()){
			return violations;
		}
		if(methodDef.getMinimumRequiredVisibility(access.getTTarget()) != TVisibility.TPROTECTED){
			return violations;
		}
		if(access.getStaticType() == null 
				|| !(access.getStaticType() instanceof TClass)
				|| Utility.isSubClass((TClass)access.getStaticType(), sourceClass) 
				|| sourceClass == access.getStaticType() ){
			return violations;
		}
		if(targetMod.getTVisibility() == TVisibility.TPUBLIC){
			return violations;
		}
		
		violations.put(access.getTTarget(), TVisibility.TPUBLIC);
		return violations;
	}
	
	private ViolationsMap methodViolations(TMethodDefinition methodDef, TClass sourceClass) {
		ViolationsMap violations = new ViolationsMap();
		for(TAccess access: methodDef.getTAccessing()){
			violations.putAll(violatesAcc2(access, methodDef, sourceClass));
		}
		return violations;
	}

	private ViolationsMap classViolations(TClass tClass) {
		ViolationsMap violations = new ViolationsMap();
		for(TMethodDefinition methodDef : Utility.getMethodDefinitions(tClass)){
			violations.putAll(methodViolations(methodDef, tClass));
		}	
		return violations;
	}
	
	@Override
	public ViolationsMap violations(TypeGraph graph) {
		ViolationsMap violations = new ViolationsMap();
		for(TClass tClass: Utility.getDefinedClasses(graph)){
			violations.putAll(classViolations(tClass));
		}
		return violations;
	}
	
	@Override
	public ViolationsMap memberLeadsToViolations(TMember member) {
		ViolationsMap violations = new ViolationsMap();
		for(TAccess access: member.getAccessedBy()){
			if(access.getTSource() instanceof TMethodDefinition && access.getTSource().getDefinedBy() instanceof TClass){
				violations.putAll(violatesAcc2(access, (TMethodDefinition) access.getTSource(), (TClass) access.getTSource().getDefinedBy()));
			}
		}
		
		return violations;
	}

}
