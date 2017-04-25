package momotFiles;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TVisibility;

import ConstraintCalculators.ConstraintCalculator;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.search.solution.repair.AbstractTransformationSolutionRepairer;
import momotFiles.searchTypeGraph.FitnessFunction;

public class VisibilityRepairer extends AbstractTransformationSolutionRepairer{

	@Override
	public TransformationSolution repair(TransformationSolution solution) {
		EGraph graph = solution.getResultGraph();
		for(FitnessFunction constraint: searchTypeGraph.constraints){
			if(constraint.calculator instanceof ConstraintCalculator){
				ConstraintCalculator calc = (ConstraintCalculator) constraint.calculator;
				
				Map<TMember, TVisibility> violations = calc.violations(solution.getResultGraph());
				for(Entry<TMember, TVisibility> violation : calc.violations(solution.getResultGraph()).entrySet()){
					if(checkPreconditions(violation)){
						violation.getKey().getTModifier().setTVisibility(violation.getValue());
					}
				}
				
			}
			
		}
		// TODO Auto-generated method stub
		return solution;
	}

	private boolean checkPreconditions(Entry<TMember, TVisibility> violation) {
		// TODO Auto-generated method stub
		return true;
	}

	
}
