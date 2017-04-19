package ConstraintCalculators;

import java.util.ArrayList;
import java.util.List;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TypeGraph;

import FitnessCalculators.IFitnessCalculator;
import momotFiles.Utility;

public class SubTypesConstraintCalculator extends ConstraintCalculator{

	@Override
	public double calculate(TypeGraph graph) {
		// TODO Auto-generated method stub
		return sub1(graph) + sub2(graph);
	}
	
	private static List<TMethodDefinition> getMethods(TClass tClass){
		List<TMethodDefinition> methods = new ArrayList<TMethodDefinition>();
		for(TMember member: tClass.getDefines()){
			if(member instanceof TMethodDefinition){
				methods.add((TMethodDefinition)member);
			}
		}
		return methods;
	}
	
private static void fillParentMethods(List<TMethodDefinition> parentMethods, TClass tClass){
		
		if(tClass.getParentClass() != null){
			parentMethods.addAll(getMethods(tClass.getParentClass()));
			fillParentMethods(parentMethods, tClass.getParentClass());
		}
	}
	
	private static double compareMethods(List<TMethodDefinition> parentMethods, TClass tClass){
		double violations = 0;
		for(TMember member: tClass.getDefines()){
			if(member instanceof TMethodDefinition){
				TMethodDefinition method = (TMethodDefinition) member;
				for(TMethodDefinition parentMethod: parentMethods){
					if(parentMethod.getSignature() == method.getSignature()){
						if(!Utility.visibilityDominates(method.getTModifier().getTVisibility(), parentMethod.getTModifier().getTVisibility())){
							violations++;
						}
					}
				}
			}
		}
		return violations;
	}
	
	/*
	 * Für jede Methode a gilt:
	 * wenn von a eine andere Methode b überschrieben oder versteckt wird:
	 * sichtbarkeit von a >= sichtbarkeit von b
	 * 
	 */
	public static double sub1(TypeGraph graph){
		int violations = 0;
		for(TClass tClass: graph.getClasses()){
			List<TMethodDefinition> parentMethods = new ArrayList<TMethodDefinition>();
			fillParentMethods(parentMethods, tClass);
				violations += compareMethods(parentMethods, tClass);
		}
		return violations;
	}
	
	
	
	private static void fillAllMethods(List<TMethodDefinition> methods, TInterface tInterface){
		for(TMember sig: tInterface.getDefines()){
			if(sig instanceof TMethodDefinition){
				methods.add((TMethodDefinition)sig);
			}
		}
		for(TInterface parentInterface: tInterface.getParentInterfaces()){
			fillAllMethods(methods, parentInterface);
		}
	}
	
	

	/*
	 * Für jede Methode a gilt:
	 * Methoden müssen die gleiche Sichtbarkeit haben wie die Interface Methoden, von denen sie abgeleitet werden
	 * kann mit sub1 kombiniert werden indem check auf interfaces und auf superklassen
	 */
	public static double sub2(TypeGraph graph){
		int violations = 0;
		for(TClass tClass: graph.getClasses()){
			List<TMethodDefinition> methods = new ArrayList<TMethodDefinition>();
			for(TInterface tInterface: tClass.getImplements()){
				fillAllMethods(methods, tInterface);
			}
			violations += compareMethods(methods, tClass);
		}
		return violations;
	}

}
