package ConstraintCalculators;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;

import FitnessCalculators.IFitnessCalculator;
import momotFiles.Utility;

public class VisibilityConstraintCalculator extends ConstraintCalculator{
	
	
	
	private ViolationsMap accessVisibility(TAccess access, TMethodDefinition sourceMethod){
		ViolationsMap violations = new ViolationsMap();
		TMember targetMember = access.getTTarget();	
		if(targetMember != null && Utility.isDefinedClass(targetMember.getDefinedBy())){
			TModifier targetModifier = targetMember.getTModifier();
			if(targetModifier != null){
				TVisibility actualVisibility = targetModifier.getTVisibility();
				TVisibility requiredVisibility = sourceMethod.getMinimumRequiredVisibility(targetMember);
				if(!Utility.visibilityDominates(actualVisibility, requiredVisibility)){
					violations.put(access.getTTarget(), requiredVisibility);
				}
			}
		}
		return violations;
	}
	
	private ViolationsMap methodVisibility(TMethodDefinition sourceMethod){
		ViolationsMap violations = new ViolationsMap();
		for(TAccess access : sourceMethod.getTAccessing()){
			
			violations.putAll(accessVisibility(access, sourceMethod));
		}
		return violations;
	}
	
	private ViolationsMap classVisibility(TClass tClass){
		ViolationsMap violations = new ViolationsMap();
		for(TMember member : tClass.getDefines()){
			if(member instanceof TMethodDefinition){
				violations.putAll(methodVisibility((TMethodDefinition) member));
			}
		}
		return violations;
	}
	
	@Override
	public ViolationsMap violations(TypeGraph graph){
		ViolationsMap violations = new ViolationsMap();
		for(TClass tClass: Utility.getDefinedClasses(graph)){
				violations.putAll(classVisibility(tClass));			
		}
//		if(map.size()>0)System.err.println(map);
		return violations;
	}



	@Override
	public ViolationsMap memberLeadsToViolations(TMember member) {
		ViolationsMap violations = new ViolationsMap();
		for(TAccess access: member.getAccessedBy()){
			if(access.getTSource() instanceof TMethodDefinition){
				violations.putAll(accessVisibility(access, (TMethodDefinition) access.getTSource()));
			}
		}
		
		return violations;
	}


}
