package Orchestration;

import at.ac.tuwien.big.moea.AbstractSearchOrchestration;
import at.ac.tuwien.big.moea.search.fitness.IMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.moea.search.solution.generator.solution.IRandomSolutionGenerator;
import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.search.solution.executor.SearchHelper;

public class MoveMethodTransformationSearchOrchestration extends TransformationSearchOrchestration{

	protected MoveMethodSearchHelper mMSearchHelper;
	
	
	
	@Override
	protected SearchHelper createSearchHelper() {
	mMSearchHelper = new MoveMethodSearchHelper(this);
      return mMSearchHelper;
   }
	
	@Override
   public SearchHelper getSearchHelper() {
      if(mMSearchHelper == null) {
    	  createSearchHelper();
      }
      return mMSearchHelper;
   }

}
