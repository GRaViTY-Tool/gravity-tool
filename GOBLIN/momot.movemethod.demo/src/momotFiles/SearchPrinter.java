package momotFiles;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;
import org.moeaframework.core.Population;

import at.ac.tuwien.big.moea.SearchAnalysis;
import at.ac.tuwien.big.moea.SearchExperiment;
import at.ac.tuwien.big.moea.experiment.analyzer.SearchAnalyzer;
import at.ac.tuwien.big.moea.print.IPopulationWriter;
import at.ac.tuwien.big.moea.print.ISolutionWriter;
import at.ac.tuwien.big.momot.TransformationResultManager;
import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.util.MomotUtil;

public class SearchPrinter {
	
	String baseName;
	TransformationSearchOrchestration orchestration;
	protected double significanceLevel = 0.01;
	public SearchPrinter(TransformationSearchOrchestration orchestration){
		deriveBaseName(orchestration);
		this.orchestration = orchestration;
	}

	
	  protected void deriveBaseName(final TransformationSearchOrchestration orchestration) {
		    EObject root = MomotUtil.getRoot(orchestration.getProblemGraph());
		    if(root == null || root.eResource() == null || root.eResource().getURI() == null)
		    	baseName = getClass().getSimpleName();
		    else
		    	baseName = root.eResource().getURI().trimFileExtension().lastSegment();
		  }
	
	protected SearchAnalyzer performAnalysis(final SearchExperiment<TransformationSolution> experiment) {
	    SearchAnalysis analysis = new SearchAnalysis(experiment);
	    analysis.setHypervolume(true);
	    analysis.setInvertedGenerationalDistance(true);
	    analysis.setShowAggregate(true);
	    analysis.setShowIndividualValues(true);
	    analysis.setShowStatisticalSignificance(true);
	    analysis.setSignificanceLevel(significanceLevel);
	    SearchAnalyzer searchAnalyzer = analysis.analyze();
	    System.out.println("---------------------------");
	    System.out.println("Analysis Results");
	    System.out.println("---------------------------");
	    searchAnalyzer.printAnalysis();
	    System.out.println("---------------------------");
	    try {
	    	System.out.println("- Save Analysis to 'output/analysis/analysis.txt'");
	    	searchAnalyzer.saveAnalysis(new File("output/analysis/analysis.txt"));
	    } catch(IOException e) {
	    	e.printStackTrace();
	    }
	    System.out.println("- Save Indicator BoxPlots to 'output/analysis/'");
	    searchAnalyzer.saveIndicatorBoxPlots(
	    	"output/analysis/",
	    	baseName
	    );
	    return searchAnalyzer;
	  }
	  
	  protected TransformationResultManager handleResults(final SearchExperiment<TransformationSolution> experiment) {
	    ISolutionWriter<TransformationSolution> solutionWriter = experiment.getSearchOrchestration().createSolutionWriter();
	    IPopulationWriter<TransformationSolution> populationWriter = experiment.getSearchOrchestration().createPopulationWriter();
	    TransformationResultManager resultManager = new TransformationResultManager(experiment);
	    Population population;
	    population = 
	    	TransformationResultManager.createApproximationSet(experiment, (String[])null);
	    System.out.println("- Save objectives of all algorithms to 'output/objectives/objective_values.txt'");
	    TransformationResultManager.saveObjectives(
	    	"output/objectives/objective_values.txt",
	    	population
	    );
	    System.out.println("---------------------------");
	    System.out.println("Objectives of all algorithms");
	    System.out.println("---------------------------");
	    System.out.println(TransformationResultManager.printObjectives(
	    	population
	    ));
	    
	    population = 
	    	TransformationResultManager.createApproximationSet(experiment, (String[])null);
	    System.out.println("- Save solutions of all algorithms to 'output/solutions/objective_values.txt'");
	    TransformationResultManager.savePopulation(
	    	"output/solutions/objective_values.txt",
	    	population,
	    	populationWriter
	    );
	    System.out.println("- Save solutions of all algorithms to 'output/solutions/objective_values.txt'");
	    TransformationResultManager.saveSolutions(
	    	"output/solutions/",
	    	baseName,
	    	MomotUtil.asIterables(
	    		population,
	    		TransformationSolution.class),
	    	solutionWriter
	    );
	    
	    population = 
	    	TransformationResultManager.createApproximationSet(experiment, (String[])null);
	    System.out.println("- Save models of all algorithms to 'output/models/'");
	    TransformationResultManager.saveModels(
	    	"output/models/",
	    	baseName,
	    	population
	    );
	    
	    return resultManager;
	  }
	  

	  
	  public void printResults( SearchExperiment<TransformationSolution> experiment){
		  System.out.println("-------------------------------------------------------");
		    System.out.println("Analysis");
		    System.out.println("-------------------------------------------------------");
		    performAnalysis(experiment);
		    System.out.println("-------------------------------------------------------");
		    System.out.println("Results");
		    System.out.println("-------------------------------------------------------");
		    handleResults(experiment);
	  }

	public void printSearchInfo(String initalModel, String[] modules, int populationSize, int maxEvaluations,
			int nrRuns) {
	    System.out.println("-------------------------------------------------------");
	    System.out.println("Search");
	    System.out.println("-------------------------------------------------------");
	    System.out.println("InputModel:      " + initalModel);
	    System.out.println("Objectives:      " + orchestration.getFitnessFunction().getObjectiveNames());
	    System.out.println("NrObjectives:    " + orchestration.getNumberOfObjectives());
	    System.out.println("Constraints:     " + orchestration.getFitnessFunction().getConstraintNames());
	    System.out.println("NrConstraints:   " + orchestration.getNumberOfConstraints());
	    System.out.println("Transformations: " + Arrays.toString(modules));
	    System.out.println("Units:           " + orchestration.getModuleManager().getUnits());
	    System.out.println("SolutionLength:  " + orchestration.getSolutionLength());
	    System.out.println("PopulationSize:  " + populationSize);
	    System.out.println("Iterations:      " + maxEvaluations / populationSize);
	    System.out.println("MaxEvaluations:  " + maxEvaluations);
	    System.out.println("AlgorithmRuns:   " + nrRuns);
	    System.out.println("---------------------------");
		
	}

}
