package org.gravity.goblin.momot;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

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
	
	private static final Logger LOGGER = Logger.getLogger( SearchPrinter.class.getName() );
	
	String baseName;
	TransformationSearchOrchestration orchestration;
	protected double significanceLevel = 0.01;
	
	public SearchPrinter(TransformationSearchOrchestration orchestration){
		deriveBaseName(orchestration);
		this.orchestration = orchestration;
	}

	
	  protected void deriveBaseName(final TransformationSearchOrchestration orchestration) {
		    EObject root = MomotUtil.getRoot(orchestration.getProblemGraph());
		    if(root == null || root.eResource() == null || root.eResource().getURI() == null) {
		    	baseName = getClass().getSimpleName();
		    }
		    else {
		    	baseName = root.eResource().getURI().trimFileExtension().lastSegment();
		    }
		  }
	
	protected SearchAnalyzer performAnalysis(final SearchExperiment<TransformationSolution> experiment, File folder) {
	    SearchAnalysis analysis = new SearchAnalysis(experiment);
	    analysis.setHypervolume(true);
	    analysis.setInvertedGenerationalDistance(true);
	    analysis.setShowAggregate(true);
	    analysis.setShowIndividualValues(true);
	    analysis.setShowStatisticalSignificance(true);
	    analysis.setSignificanceLevel(significanceLevel);
	    SearchAnalyzer searchAnalyzer = analysis.analyze();
	    LOGGER.log( Level.INFO, "---------------------------");
	    LOGGER.log( Level.INFO, "Analysis Results");
	    LOGGER.log( Level.INFO, "---------------------------");
	    searchAnalyzer.printAnalysis();
	    LOGGER.log( Level.INFO, "---------------------------");

    	File analysisFolder = new File(folder, "analysis");
    	File analysisFolderTxt = new File(analysisFolder, "analysis.txt");
	    try {
			LOGGER.log( Level.INFO, "- Save Analysis to '"+analysisFolderTxt
	    			+ "'");
	    	searchAnalyzer.saveAnalysis(analysisFolderTxt);
	    } catch(IOException e) {
	    	LOGGER.log(Level.WARN, e.getMessage(), e);
	    }
	    LOGGER.log( Level.INFO, "- Save Indicator BoxPlots to '"
	    		+ analysisFolder
	    		+ "'");
	    searchAnalyzer.saveIndicatorBoxPlots(
	    	analysisFolder.getAbsolutePath(),
	    	baseName
	    );
	    return searchAnalyzer;
	  }
	  
	  protected TransformationResultManager handleResults(final SearchExperiment<TransformationSolution> experiment, File folder) {
	    ISolutionWriter<TransformationSolution> solutionWriter = experiment.getSearchOrchestration().createSolutionWriter();
	    IPopulationWriter<TransformationSolution> populationWriter = experiment.getSearchOrchestration().createPopulationWriter();
	    TransformationResultManager resultManager = new TransformationResultManager(experiment);
	    Population population;
	    population = 
	    	TransformationResultManager.createApproximationSet(experiment, (String[])null);
	    File objectivesTxt = new File(folder, "objectives/objective_values.txt");
		LOGGER.log( Level.INFO, "- Save objectives of all algorithms to '"
	    		+ objectivesTxt.getPath()
	    		+ "'");
	    TransformationResultManager.saveObjectives(
	    	objectivesTxt,
	    	population
	    );
	    LOGGER.log( Level.INFO, "---------------------------");
	    LOGGER.log( Level.INFO, "Objectives of all algorithms");
	    LOGGER.log( Level.INFO, "---------------------------");
	    LOGGER.log( Level.INFO, TransformationResultManager.printObjectives(
	    	population
	    ));
	    
	    population = 
	    	TransformationResultManager.createApproximationSet(experiment, (String[])null);
	    File solutionsFolder = new File(folder, "solutions");
		File solutionsTxt = new File(solutionsFolder ,"objective_values.txt");
		LOGGER.log( Level.INFO, "- Save solutions of all algorithms to '"
	    		+ solutionsTxt
	    		+ "'");
	    TransformationResultManager.savePopulation(
	    	solutionsTxt,
	    	population,
	    	populationWriter
	    );
	    LOGGER.log( Level.INFO, "- Save solutions of all algorithms to '"
	    		+ solutionsFolder
	    		+ "'");
	    TransformationResultManager.saveSolutions(
	    	solutionsFolder,
	    	baseName,
	    	MomotUtil.asIterables(
	    		population,
	    		TransformationSolution.class),
	    	solutionWriter
	    );
	    
	    population = 
	    	TransformationResultManager.createApproximationSet(experiment, (String[])null);
	    File modelsFolder = new File(folder, "models");
		LOGGER.log( Level.INFO, "- Save models of all algorithms to '"
	    		+ modelsFolder
	    		+ "'");
	    TransformationResultManager.saveModels(
	    	modelsFolder,
	    	baseName,
	    	population
	    );
	    
	    return resultManager;
	  }
	  

	  
	  public TransformationResultManager printResults( SearchExperiment<TransformationSolution> experiment, File folder){
		  LOGGER.log( Level.INFO, "-------------------------------------------------------");
		    LOGGER.log( Level.INFO, "Analysis");
		    LOGGER.log( Level.INFO, "-------------------------------------------------------");
		    performAnalysis(experiment, folder);
		    LOGGER.log( Level.INFO, "-------------------------------------------------------");
		    LOGGER.log( Level.INFO, "Results");
		    LOGGER.log( Level.INFO, "-------------------------------------------------------");
		    return handleResults(experiment, folder);
	  }

	public void printSearchInfo(String initalModel, String[] modules, int populationSize, int maxEvaluations,
			int nrRuns) {
	    LOGGER.log( Level.INFO, "-------------------------------------------------------");
	    LOGGER.log( Level.INFO, "Search");
	    LOGGER.log( Level.INFO, "-------------------------------------------------------");
	    LOGGER.log( Level.INFO, "InputModel:      " + initalModel);
	    LOGGER.log( Level.INFO, "Objectives:      " + orchestration.getFitnessFunction().getObjectiveNames());
	    LOGGER.log( Level.INFO, "NrObjectives:    " + orchestration.getNumberOfObjectives());
	    LOGGER.log( Level.INFO, "Constraints:     " + orchestration.getFitnessFunction().getConstraintNames());
	    LOGGER.log( Level.INFO, "NrConstraints:   " + orchestration.getNumberOfConstraints());
	    LOGGER.log( Level.INFO, "Transformations: " + Arrays.toString(modules));
	    LOGGER.log( Level.INFO, "Units:           " + orchestration.getModuleManager().getUnits());
	    LOGGER.log( Level.INFO, "SolutionLength:  " + orchestration.getSolutionLength());
	    LOGGER.log( Level.INFO, "PopulationSize:  " + populationSize);
	    LOGGER.log( Level.INFO, "Iterations:      " + maxEvaluations / populationSize);
	    LOGGER.log( Level.INFO, "MaxEvaluations:  " + maxEvaluations);
	    LOGGER.log( Level.INFO, "AlgorithmRuns:   " + nrRuns);
	    LOGGER.log( Level.INFO, "---------------------------");
		
	}

}
