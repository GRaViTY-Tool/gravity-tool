package ConstraintCalculators;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.tgg.modisco.Rules.MethodDefinition;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;

import FitnessCalculators.IFitnessCalculator;

public abstract class ConstraintCalculator implements IFitnessCalculator{

	private TypeGraph getPG(EGraph graph){
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
		return pg;
	}
	
	@Override
	public double calculate(EGraph graph) {
		return calculate(getPG(graph));
	}
	
	
	public abstract double calculate(TypeGraph graph);
	
	
	public Map<TMember, TVisibility>  violations(EGraph graph) {
		return violations(getPG(graph));
	}
	public abstract Map<TMember, TVisibility> violations(TypeGraph graph);
	
}
