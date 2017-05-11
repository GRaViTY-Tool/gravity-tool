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
	private Map<TMember, TVisibility> methodINH1(TMethodDefinition methodDef, TClass tClass, TypeGraph graph){ 
		Map<TMember, TVisibility> violations = new HashMap<TMember, TVisibility>();
		for(TAccess access: methodDef.getTAccessing()){
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
		}
		return violations;
	}
	
	private Map<TMember, TVisibility> classINH1(TClass tClass, TypeGraph graph){ 
		Map<TMember, TVisibility> violations = new HashMap<TMember, TVisibility>();
		for(TMethodDefinition methodDef: Utility.getMethodDefinitions(tClass)){
			violations.putAll(methodINH1(methodDef, tClass, graph));
		}
		return violations;
	}
	
	public Map<TMember, TVisibility> INH1(TypeGraph graph){
		Map<TMember, TVisibility> violations = new HashMap<TMember, TVisibility>();
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
	public Map<TMember, TVisibility> violations(TypeGraph graph) {
		Map<TMember, TVisibility> violations = new HashMap<TMember, TVisibility>();
		violations.putAll(INH1(graph));
		//violations.putAll(INH2(graph));
		return violations;
	}

}
