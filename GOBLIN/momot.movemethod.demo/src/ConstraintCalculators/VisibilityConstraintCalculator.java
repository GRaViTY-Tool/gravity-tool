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
	
	
	public boolean isLibOrT(TAbstractType tClass){
		if(tClass.getTName().equals("T") || tClass.isTLib() || tClass.getTName().equals("Anonymous")){
			return true;
		}
		return false;
	}
	
	
	
	private Map<TMember, TVisibility> methodVisibility(TMethodDefinition method){
		HashMap<TMember, TVisibility> map = new HashMap<TMember, TVisibility>();
		for(TAccess access : method.getTAccessing()){
			
			TMember targetMember = access.getTTarget();
			
			if(targetMember != null && !isLibOrT(targetMember.getDefinedBy())){
				TModifier targetModifier = targetMember.getTModifier();
				if(targetModifier != null){
					TVisibility actualVisibility = targetModifier.getTVisibility();
					TVisibility requiredVisibility = method.getMinimumRequiredVisibility(targetMember);
					if(!Utility.visibilityDominates(actualVisibility, requiredVisibility)){
						map.put(access.getTTarget(), requiredVisibility);
					}
				}
				
				
			}
		}
		return map;
	}
	
	private Map<TMember, TVisibility> classVisibility(TClass tClass){
		HashMap<TMember, TVisibility> map = new HashMap<TMember, TVisibility>();
		for(TMember member : tClass.getDefines()){
			if(member instanceof TMethodDefinition){
				map.putAll(methodVisibility((TMethodDefinition) member));
				
			}
	}
		return map;
	}
	
	@Override
	public Map<TMember, TVisibility> violations(TypeGraph graph){
		HashMap<TMember, TVisibility> map = new HashMap<TMember, TVisibility>();
		EList<TClass> classes = graph.getClasses();
		for(TClass tClass: classes){
			if(!isLibOrT(tClass)){
				map.putAll(classVisibility(tClass));
			}
			
		}
		
		return map;
	}






}
