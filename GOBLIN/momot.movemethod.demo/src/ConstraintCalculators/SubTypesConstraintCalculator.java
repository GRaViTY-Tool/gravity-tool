package ConstraintCalculators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;

import FitnessCalculators.IFitnessCalculator;
import momotFiles.Utility;

public class SubTypesConstraintCalculator extends ConstraintCalculator{

	

	
private static ViolationsMap compareMethod(List<TMethodDefinition> parentMethods, TMethodDefinition method){
	ViolationsMap violations = new ViolationsMap();
	for(TMethodDefinition parentMethod: parentMethods){
		if(parentMethod.getSignature() == method.getSignature()){
			if(parentMethod.getTModifier() == null){
				continue;
			}
			TVisibility methodVisibility = TVisibility.TPUBLIC;
			if(method.getTModifier() != null){
				methodVisibility = method.getTModifier().getTVisibility();
			}
			TVisibility parentMethodVisibility = TVisibility.TPUBLIC;
			if(parentMethod.getTModifier() != null){
				parentMethodVisibility = parentMethod.getTModifier().getTVisibility();
			}
			
			if(!Utility.visibilityDominates(methodVisibility, parentMethodVisibility)){
				violations.put(method,  parentMethod.getTModifier().getTVisibility());
			}
		}
	}
	return violations;
}
	

	
	private static ViolationsMap compareMethods(List<TMethodDefinition> parentMethods, TClass tClass){
		ViolationsMap violations = new ViolationsMap();
		for(TMember member: tClass.getDefines()){
			if(member instanceof TMethodDefinition){
				TMethodDefinition method = (TMethodDefinition) member;
				violations.putAll(compareMethod(parentMethods, method));
			}
		}
		return violations;
	}
	

	/*
	 * Für jede Methode a gilt:
	 * Methoden müssen die gleiche Sichtbarkeit haben wie die Interface Methoden, von denen sie abgeleitet werden
	 * kann mit sub1 kombiniert werden indem check auf interfaces und auf superklassen
	 */
	public static ViolationsMap sub2(TypeGraph graph){
		ViolationsMap violations = new ViolationsMap();
		for(TClass tClass: graph.getClasses()){
			List<TMethodDefinition> methods =  Utility.getImplementedInterfaceMethods(tClass);
			violations.putAll(compareMethods(methods, tClass));
		}
		return violations;
	}

	/*
	 * Für jede Methode a gilt:
	 * wenn von a eine andere Methode b überschrieben oder versteckt wird:
	 * sichtbarkeit von a >= sichtbarkeit von b
	 * 
	 */
	public static ViolationsMap sub1(TypeGraph graph){
		ViolationsMap violations = new ViolationsMap();
		for(TClass tClass: Utility.getDefinedClasses(graph)){
			List<TMethodDefinition> parentMethods = Utility.getAllParentsMethods(tClass);
			violations.putAll(compareMethods(parentMethods, tClass));
		}
		return violations;
	}
	
	@Override
	public ViolationsMap memberLeadsToViolations(TMember member) {
		ViolationsMap violations = new ViolationsMap();
		
		
		if(member.getDefinedBy() instanceof TClass && member instanceof TMethodDefinition){
			//Parents check
			TClass tClass = (TClass) member.getDefinedBy();
			TMethodDefinition method = (TMethodDefinition) member;
			violations.putAll(compareMethod(Utility.getAllParentsMethods(tClass), method));
			
			//Interfaces Check
			violations.putAll(compareMethod(Utility.getImplementedInterfaceMethods(tClass), method));
		}
		
		return violations;
	}
	
	@Override
	public ViolationsMap violations(TypeGraph graph) {
		ViolationsMap violations = new ViolationsMap();
		violations.putAll(sub1(graph));
		violations.putAll(sub2(graph));
		return violations;
	}


}
