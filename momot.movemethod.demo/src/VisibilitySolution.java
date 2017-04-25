import java.util.List;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.moeaframework.core.Solution;

import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.problem.solution.variable.ITransformationVariable;

public class VisibilitySolution extends TransformationSolution{
	
	 public VisibilitySolution(final EGraph sourceGraph, final int numberOfVariables, final int numberOfObjectives) {
	      this(sourceGraph, numberOfVariables, numberOfObjectives, 0);
	   }

	   public VisibilitySolution(final EGraph sourceGraph, final int numberOfVariables, final int numberOfObjectives,
	         final int numberOfConstraints) {
		   super(sourceGraph, numberOfVariables, numberOfObjectives, numberOfConstraints);
	   }

	   public VisibilitySolution(final EGraph sourceGraph, final List<? extends ITransformationVariable> variables,
	         final int numberOfObjectives) {
		   	super(sourceGraph, variables, numberOfObjectives);
	   }

	   public VisibilitySolution(final EGraph sourceGraph, final List<? extends ITransformationVariable> variables,
	         final int numberOfObjectives, final int numberOfConstraints) {
		   super(sourceGraph, variables, numberOfObjectives, numberOfConstraints);
	   }

	   public VisibilitySolution(final EGraph sourceGraph, final Solution solution) {
		   super(sourceGraph, solution);
	   }

	   public VisibilitySolution(final TransformationSearchOrchestration searchOrchestration) {
		   super(searchOrchestration);
	   }

	   public VisibilitySolution(final TransformationSolution solution) {
		   super(solution);
	   }
	

}
