package ConstraintCalculators;

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
	
	
	@Override
	public double calculate(TypeGraph graph) {
		return visiblility(graph);
	}
	
	public static boolean isLibOrT(TAbstractType tClass){
		if(tClass.getTName().equals("T") || tClass.isTLib() || tClass.getTName().equals("Anonymous")){
			return true;
		}
		return false;
	}
	
	
	
	private static double methodVisibility(TMethodDefinition method){
		double violations = 0;
		for(TAccess access : method.getTAccessing()){
			
			TMember targetMember = access.getTTarget();
			
			if(targetMember != null && !isLibOrT(targetMember.getDefinedBy())){
				TModifier targetModifier = targetMember.getTModifier();
				if(targetModifier != null){
					TVisibility actualVisibility = targetModifier.getTVisibility();
					TVisibility requiredVisibility = method.getMinimumRequiredVisibility(targetMember);
					if(!Utility.visibilityDominates(actualVisibility, requiredVisibility)){
						violations++;
					}
				}
				
				
			}
		}
		return violations;
	}
	
	private static double classVisibility(TClass tClass){
		double violations = 0;
		for(TMember member : tClass.getDefines()){
			if(member instanceof TMethodDefinition){
				violations += methodVisibility((TMethodDefinition) member);
				
			}
	}
		return violations;
	}
	
	public static double visiblility(TypeGraph graph){
		
		int violations = 0;
		EList<TClass> classes = graph.getClasses();
		for(TClass tClass: classes){
			if(!isLibOrT(tClass)){
				violations += classVisibility(tClass);
			}
			
		}
		
		return violations;
	}





}
