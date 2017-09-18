package momotFiles;

import java.util.List;

import org.moeaframework.core.Solution;
import org.moeaframework.core.comparator.DominanceComparator;
import org.moeaframework.core.comparator.ParetoObjectiveComparator;

import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import momotFiles.SearchTypeGraph.FitnessFunction;

public class CustomDominanceComperator implements DominanceComparator{

	private static final double[] weight = {1,1,1,1,1};
	ParetoObjectiveComparator paretoCompare;
	
	private ParetoObjectiveComparator getParetoCompare() {
		if(paretoCompare == null) {
			paretoCompare = new ParetoObjectiveComparator();
		}
		return paretoCompare;
	}
	
	
	List<FitnessFunction> fitnessfunctions;
	public CustomDominanceComperator(List<FitnessFunction> fitnessfunctions) {
		this.fitnessfunctions = fitnessfunctions;
	}
	
	double[] initialObjectives;

	private void calculateInititialObjectives(TransformationSolution solution) {
		int objectivesSize = fitnessfunctions.size()+1;
		initialObjectives = new double[objectivesSize];
		//number of refactorings
		initialObjectives[0] = 0;
		
		for(int i = 1; i < objectivesSize; i++) {
			initialObjectives[i] = fitnessfunctions.get(i-1).calculator.calculate(solution.getSourceGraph());
		}
	}
	
	@Override
	public int compare(Solution solution1, Solution solution2) {
		
		if(!(solution1 instanceof TransformationSolution && solution2 instanceof TransformationSolution)) {
			return getParetoCompare().compare(solution1, solution2);
		}
		
		
		if(initialObjectives == null) {
			calculateInititialObjectives((TransformationSolution) solution1);
		}
		
		double solution1SingleObjective = 0;
		//double[] solution1NormalizedObjectives = new double[solution1.getNumberOfObjectives()];
		
		for (int i = 0; i < solution1.getNumberOfObjectives(); i++) {
			if(solution1.getObjective(i) < solution2.getObjective(i)) {
				solution1SingleObjective += weight[i];		
			}
			else if(solution1.getObjective(i) == solution2.getObjective(i)) {
				solution1SingleObjective += 0;
			}
			else {
				solution1SingleObjective += - weight[i];
			}
		}
		
		
		
		
		if(solution1SingleObjective < 0) {
			return -1;
		} 
		
		if(solution1SingleObjective > 0) {
			return 1;
		} 
		
		
		
		
		
		return 0;
	}
}
