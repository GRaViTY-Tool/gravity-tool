package ConstraintCalculators;

import java.util.HashMap;
import java.util.Map;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;

import momotFiles.Utility;

public class InheritanceConstraintCalculator extends ConstraintCalculator{

	
	//-------------------------INH1---------------------------------
	private ViolationsMap accessINH1(TAccess access, TMethodDefinition methodDef, TClass tClass, TypeGraph graph){
		ViolationsMap violations = new ViolationsMap();
		if(access.getStaticType() != null 
				&& access.getStaticType() != graph.getClass("Void") 
				&& access.getStaticType() != tClass){	
			TVisibility minVis = access.getStaticType().getMinimumRequiredVisibility(access.getTTarget().getDefinedBy());
			TModifier targetMod = access.getTTarget().getTModifier();
			if(targetMod != null){
				TVisibility acutalVis = access.getTTarget().getTModifier().getTVisibility();
				if(!Utility.visibilityDominates(acutalVis, minVis)){
					violations.put(access.getTTarget(), minVis);
				}
			}	
		}
		return violations;
	}
	
	private ViolationsMap methodINH1(TMethodDefinition methodDef, TClass tClass, TypeGraph graph){ 
		ViolationsMap violations = new ViolationsMap();
		for(TAccess access: methodDef.getTAccessing()){
			violations.putAll(accessINH1(access, methodDef, tClass, graph));
		}
		return violations;
	}
	
	private ViolationsMap classINH1(TClass tClass, TypeGraph graph){ 
		ViolationsMap violations = new ViolationsMap();
		for(TMethodDefinition methodDef: Utility.getMethodDefinitions(tClass)){
			violations.putAll(methodINH1(methodDef, tClass, graph));
		}
		return violations;
	}
	
	public ViolationsMap INH1(TypeGraph graph){
		ViolationsMap violations = new ViolationsMap();
		for(TClass tClass: Utility.getDefinedClasses(graph)){
			violations.putAll(classINH1(tClass, graph));
		}
		return violations;
	}
	
	//--------------------------------------------------------------
	
	
	
	//------INH2 only concerns fields => only needed when moving fields will be included-----
	// also it does require a max visibility therefore it needs to be handled a bit differently than other visibility constraints
	//--------------------------------------------------------------
	
	@Override
	public ViolationsMap violations(TypeGraph graph) {
		ViolationsMap violations = new ViolationsMap();
		violations.putAll(INH1(graph));
		//violations.putAll(INH2(graph));
		return violations;
	}
	
	@Override
	public ViolationsMap memberLeadsToViolations(TMember member) {
		ViolationsMap violations = new ViolationsMap();
		for(TAccess access: member.getAccessedBy()){
			if(access.getTSource() instanceof TMethodDefinition && access.getTSource().getDefinedBy() instanceof TClass){
				TClass tClass = (TClass) access.getTSource().getDefinedBy();
				TMethodDefinition method = (TMethodDefinition) access.getTSource();
				violations.putAll(accessINH1(access, method, tClass, tClass.getPg() ));
			}
		}
		return violations;
	}

}
