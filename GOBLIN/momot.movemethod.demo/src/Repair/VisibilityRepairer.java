package Repair;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.annotations.TAnnotation;

import ConstraintCalculators.ConstraintCalculator;
import PreConditions.ChangeVisibilityPreConditions;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.search.solution.repair.AbstractTransformationSolutionRepairer;
import momotFiles.SearchTypeGraph;
import momotFiles.SearchTypeGraph.FitnessFunction;

public class VisibilityRepairer extends AbstractTransformationSolutionRepairer{

	@Override
	public TransformationSolution repair(TransformationSolution solution) {
		EGraph graph = solution.getResultGraph();
		for(FitnessFunction constraint: SearchTypeGraph.constraints){
			if(constraint.calculator instanceof ConstraintCalculator){
				ConstraintCalculator calc = (ConstraintCalculator) constraint.calculator;
				
				Map<TMember, TVisibility> violations = calc.violations(solution.getResultGraph());
				for(Entry<TMember, TVisibility> violation : violations.entrySet()){
					if(ChangeVisibilityPreConditions.checkPreconditions(violation)){
						TAnnotation repairAnnot = new RepairAnnotation(violation.getKey().getTModifier().getTVisibility(), violation.getValue());
						TMember member = violation.getKey();
						repairAnnot.setTAnnotated(member);
						member.getTAnnotation().add(repairAnnot);
						member.getTModifier().setTVisibility(violation.getValue());
					}
				}
				
			}
		}
		return solution;
	}



	
}
