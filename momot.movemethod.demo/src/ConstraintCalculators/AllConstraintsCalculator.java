package ConstraintCalculators;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.typegraph.basic.TypeGraph;

import FitnessCalculators.IFitnessCalculator;

public class AllConstraintsCalculator extends ConstraintCalculator {

	@Override
	public double calculate(TypeGraph graph) {
		double violations = 0;
		
		violations += new VisibilityConstraintCalculator().calculate(graph);	
		violations += new SubTypesConstraintCalculator().calculate(graph);		
	
		return violations;
	}
}
