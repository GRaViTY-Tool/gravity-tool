package ConstraintCalculators;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.typegraph.basic.TypeGraph;

import FitnessCalculators.IFitnessCalculator;

public abstract class ConstraintCalculator implements IFitnessCalculator{

	@Override
	public double calculate(EGraph graph) {
		
		TypeGraph pg = null;
		EObject root = graph.getRoots().get(0);
		if( root instanceof TypeGraph){
			pg = (TypeGraph) root;
		}
		
		if( root instanceof HAntiPatternGraph){
			pg = ((HAntiPatternGraph) root).getPg();
		}
		
		if( root instanceof HAntiPatternHandling){
			pg = ((HAntiPatternDetection) root).getApg().getPg();
		}
		return calculate(graph);
	}
	
	public abstract double calculate(TypeGraph graph);
	
}
