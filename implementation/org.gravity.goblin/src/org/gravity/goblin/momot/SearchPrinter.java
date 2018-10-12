package org.gravity.goblin.momot;

import java.io.File;
import java.io.IOException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.goblin.SearchParameters;
import org.gravity.goblin.Utility;
import org.gravity.typegraph.basic.TypeGraph;
import org.moeaframework.core.Population;
import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.SearchAnalysis;
import at.ac.tuwien.big.moea.SearchExperiment;
import at.ac.tuwien.big.moea.experiment.analyzer.SearchAnalyzer;
import at.ac.tuwien.big.moea.print.IPopulationWriter;
import at.ac.tuwien.big.moea.print.ISolutionWriter;
import at.ac.tuwien.big.momot.TransformationResultManager;
import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.util.MomotUtil;

/**
 * 
 * A helper class for printing/saving search configuration and results
 *
 */
public class SearchPrinter {

	private static final Logger LOGGER = Logger.getLogger(SearchPrinter.class.getName());
	private static final double SIGNIFICANCE_LEVEL = 0.01;

	private String baseName;
	private final TransformationSearchOrchestration orchestration;

	/**
	 * Creates a new instance for printing the given search orchestration
	 * 
	 * @param orchestration The given search orchestration
	 */
	public SearchPrinter(TransformationSearchOrchestration orchestration) {
		this.orchestration = orchestration;
		EObject root = MomotUtil.getRoot(orchestration.getProblemGraph());
		if (root == null || root.eResource() == null || root.eResource().getURI() == null) {
			baseName = getClass().getSimpleName();
		} else {
			baseName = root.eResource().getURI().trimFileExtension().lastSegment();
		}
	}

	private SearchAnalyzer performAnalysis(final SearchExperiment<TransformationSolution> experiment, File folder) {
		SearchAnalysis analysis = new SearchAnalysis(experiment);
		analysis.setHypervolume(true);
		analysis.setInvertedGenerationalDistance(true);
		analysis.setShowAggregate(true);
		analysis.setShowIndividualValues(true);
		analysis.setShowStatisticalSignificance(true);
		analysis.setSignificanceLevel(SIGNIFICANCE_LEVEL);
		SearchAnalyzer searchAnalyzer = analysis.analyze();
		LOGGER.log(Level.INFO, "---------------------------");
		LOGGER.log(Level.INFO, "Analysis Results");
		LOGGER.log(Level.INFO, "---------------------------");
		searchAnalyzer.printAnalysis();
		LOGGER.log(Level.INFO, "---------------------------");

		File analysisFolder = new File(folder, "analysis");
		File analysisFolderTxt = new File(analysisFolder, "analysis.txt");
		try {
			LOGGER.log(Level.INFO, "- Save Analysis to '" + analysisFolderTxt + "'");
			searchAnalyzer.saveAnalysis(analysisFolderTxt);
		} catch (IOException e) {
			LOGGER.log(Level.WARN, e.getMessage(), e);
		}
		LOGGER.log(Level.INFO, "- Save Indicator BoxPlots to '" + analysisFolder + "'");
		searchAnalyzer.saveIndicatorBoxPlots(analysisFolder.getAbsolutePath(), baseName);
		return searchAnalyzer;
	}

	private TransformationResultManager handleResults(final SearchExperiment<TransformationSolution> experiment,
			File folder) {
		ISolutionWriter<TransformationSolution> solutionWriter = experiment.getSearchOrchestration()
				.createSolutionWriter();
		IPopulationWriter<TransformationSolution> populationWriter = experiment.getSearchOrchestration()
				.createPopulationWriter();
		TransformationResultManager resultManager = new TransformationResultManager(experiment);
		Population population;
		population = TransformationResultManager.createApproximationSet(experiment, (String[]) null);
		File objectivesTxt = new File(folder, "objectives/objective_values.txt");
		LOGGER.log(Level.INFO, "- Save objectives of all algorithms to '" + objectivesTxt.getPath() + "'");
		TransformationResultManager.saveObjectives(objectivesTxt, population);
		LOGGER.log(Level.INFO, "---------------------------");
		LOGGER.log(Level.INFO, "Objectives of all algorithms");
		LOGGER.log(Level.INFO, "---------------------------");
		LOGGER.log(Level.INFO, TransformationResultManager.printObjectives(population));

		population = TransformationResultManager.createApproximationSet(experiment, (String[]) null);
		File solutionsFolder = new File(folder, "solutions");
		File solutionsTxt = new File(solutionsFolder, "objective_values.txt");
		LOGGER.log(Level.INFO, "- Save solutions of all algorithms to '" + solutionsTxt + "'");
		TransformationResultManager.savePopulation(solutionsTxt, population, populationWriter);
		LOGGER.log(Level.INFO, "- Save solutions of all algorithms to '" + solutionsFolder + "'");
		TransformationResultManager.saveSolutions(solutionsFolder, baseName,
				MomotUtil.asIterables(population, TransformationSolution.class), solutionWriter);

		population = TransformationResultManager.createApproximationSet(experiment, (String[]) null);
		fixContainment(population);
		File modelsFolder = new File(folder, "models");
		LOGGER.log(Level.INFO, "- Save models of all algorithms to '" + modelsFolder + "'");
		TransformationResultManager.saveModels(modelsFolder, baseName, population);

		return resultManager;
	}

	/**
	 * Checks if the HPG is always contained in a resource and fix it otherwise
	 * 
	 * @param population The population which should be checked
	 */
	private void fixContainment(Population population) {
		for (Solution solution : population) {
			TransformationSolution transformationSolution = MomotUtil.assertTransformationSolution(solution);
			EGraph graph = transformationSolution.execute();
			TypeGraph pg = Utility.getPG(graph);
			EObject eContainer = pg.eContainer();
			if (eContainer != null && eContainer.eResource() == null) {
				LOGGER.log(Level.WARN, "There was a HAntiPatternGraph withot resource");
				pg.eResource().getContents().add(eContainer);
			}
		}
	}

	/**
	 * Analyzes the experiment and prints the results
	 * 
	 * @param experiment The experiment
	 * @param folder     The output location
	 * @return A manager for accessing the results
	 */
	public TransformationResultManager printResults(SearchExperiment<TransformationSolution> experiment, File folder) {
		LOGGER.log(Level.INFO, "-------------------------------------------------------");
		LOGGER.log(Level.INFO, "Analysis");
		LOGGER.log(Level.INFO, "-------------------------------------------------------");
		performAnalysis(experiment, folder);
		LOGGER.log(Level.INFO, "-------------------------------------------------------");
		LOGGER.log(Level.INFO, "Results");
		LOGGER.log(Level.INFO, "-------------------------------------------------------");
		return handleResults(experiment, folder);
	}

	/**
	 * Loggs the search informations
	 * 
	 * @param logger The loggers to which the search information should be logged,
	 *               if the array is null or empty the logger of this class is used.
	 */
	public void logSearchInfo(Logger... logger) {
		Logger[] loggerToUse;
		if (logger == null || logger.length == 0) {
			loggerToUse = new Logger[] { LOGGER };
		} else {
			loggerToUse = logger;
		}
		for (Logger l : loggerToUse) {
			l.log(Level.INFO, "-------------------------------------------------------");
			l.log(Level.INFO, "Search");
			l.log(Level.INFO, "-------------------------------------------------------");
			l.log(Level.INFO, "InputModel:      " + SearchParameters.INITIAL_MODEL);
			l.log(Level.INFO, "Objectives:      " + orchestration.getFitnessFunction().getObjectiveNames());
			l.log(Level.INFO, "NrObjectives:    " + orchestration.getNumberOfObjectives());
			l.log(Level.INFO, "Constraints:     " + orchestration.getFitnessFunction().getConstraintNames());
			l.log(Level.INFO, "NrConstraints:   " + orchestration.getNumberOfConstraints());
			l.log(Level.INFO, "Transformations: " + String.join(", ", SearchParameters.modules));
			l.log(Level.INFO, "Units:           " + orchestration.getModuleManager().getUnits());
			l.log(Level.INFO, "SolutionLength:  " + orchestration.getSolutionLength());
			l.log(Level.INFO, "PopulationSize:  " + SearchParameters.populationSize);
			l.log(Level.INFO, "Iterations:      " + SearchParameters.maxEvaluations / SearchParameters.populationSize);
			l.log(Level.INFO, "MaxEvaluations:  " + SearchParameters.maxEvaluations);
			l.log(Level.INFO, "AlgorithmRuns:   " + SearchParameters.nrRuns);
			l.log(Level.INFO, "---------------------------");
		}
	}

}
