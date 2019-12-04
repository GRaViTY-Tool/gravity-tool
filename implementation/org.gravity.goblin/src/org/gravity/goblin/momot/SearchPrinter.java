package org.gravity.goblin.momot;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.goblin.EGraphUtil;
import org.gravity.goblin.SearchParameters;
import org.gravity.typegraph.basic.TypeGraph;
import org.moeaframework.core.Population;
import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.SearchAnalysis;
import at.ac.tuwien.big.moea.SearchExperiment;
import at.ac.tuwien.big.moea.SearchResultManager;
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
		final EObject root = MomotUtil.getRoot(orchestration.getProblemGraph());
		if (root == null || root.eResource() == null || root.eResource().getURI() == null) {
			this.baseName = getClass().getSimpleName();
		} else {
			this.baseName = root.eResource().getURI().trimFileExtension().lastSegment();
		}
	}

	private SearchAnalyzer performAnalysis(final SearchExperiment<TransformationSolution> experiment, File folder) {
		final SearchAnalysis analysis = new SearchAnalysis(experiment);
		analysis.setHypervolume(true);
		analysis.setInvertedGenerationalDistance(true);
		analysis.setShowAggregate(true);
		analysis.setShowIndividualValues(true);
		analysis.setShowStatisticalSignificance(true);
		analysis.setSignificanceLevel(SIGNIFICANCE_LEVEL);
		final SearchAnalyzer searchAnalyzer = analysis.analyze();
		LOGGER.info( "---------------------------");
		LOGGER.info( "Analysis Results");
		LOGGER.info( "---------------------------");
		searchAnalyzer.printAnalysis();
		LOGGER.info( "---------------------------");

		final File analysisFolder = new File(folder, "analysis");
		final File analysisFolderTxt = new File(analysisFolder, "analysis.txt");
		try {
			LOGGER.info( "- Save Analysis to '" + analysisFolderTxt + "'");
			searchAnalyzer.saveAnalysis(analysisFolderTxt);
		} catch (final IOException e) {
			LOGGER.warn(e.getMessage(), e);
		}
		LOGGER.info( "- Save Indicator BoxPlots to '" + analysisFolder + "'");
		searchAnalyzer.saveIndicatorBoxPlots(analysisFolder.getAbsolutePath(), this.baseName);
		return searchAnalyzer;
	}

	private TransformationResultManager handleResults(final SearchExperiment<TransformationSolution> experiment,
			File folder) {
		final ISolutionWriter<TransformationSolution> solutionWriter = experiment.getSearchOrchestration()
				.createSolutionWriter();
		final IPopulationWriter<TransformationSolution> populationWriter = experiment.getSearchOrchestration()
				.createPopulationWriter();
		final TransformationResultManager resultManager = new TransformationResultManager(experiment);
		Population population;
		population = SearchResultManager.createApproximationSet(experiment, (String[]) null);
		final File objectivesTxt = new File(folder, "objectives/objective_values.txt");
		LOGGER.info( "- Save objectives of all algorithms to '" + objectivesTxt.getPath() + "'");
		SearchResultManager.saveObjectives(objectivesTxt, population);
		LOGGER.info( "---------------------------");
		LOGGER.info( "Objectives of all algorithms");
		LOGGER.info( "---------------------------");
		LOGGER.info( SearchResultManager.printObjectives(population));

		population = SearchResultManager.createApproximationSet(experiment, (String[]) null);
		final File solutionsFolder = new File(folder, "solutions");
		final File solutionsTxt = new File(solutionsFolder, "objective_values.txt");
		LOGGER.info( "- Save solutions of all algorithms to '" + solutionsTxt + "'");
		SearchResultManager.savePopulation(solutionsTxt, population, populationWriter);
		LOGGER.info( "- Save solutions of all algorithms to '" + solutionsFolder + "'");
		SearchResultManager.saveSolutions(solutionsFolder, this.baseName,
				MomotUtil.asIterables(population, TransformationSolution.class), solutionWriter);

		population = SearchResultManager.createApproximationSet(experiment, (String[]) null);
		fixContainment(population);
		final File modelsFolder = new File(folder, "models");
		LOGGER.info( "- Save models of all algorithms to '" + modelsFolder + "'");
		TransformationResultManager.saveModels(modelsFolder, this.baseName, population);

		return resultManager;
	}

	/**
	 * Checks if the HPG is always contained in a resource and fix it otherwise
	 *
	 * @param population The population which should be checked
	 */
	private void fixContainment(Population population) {
		for (final Solution solution : population) {
			final TransformationSolution transformationSolution = MomotUtil.assertTransformationSolution(solution);
			final EGraph graph = transformationSolution.execute();
			final TypeGraph pg = EGraphUtil.getPG(graph);
			final EObject eContainer = pg.eContainer();
			if (eContainer != null && eContainer.eResource() == null) {
				LOGGER.warn("There was a HAntiPatternGraph withot resource");
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
		LOGGER.info( "-------------------------------------------------------");
		LOGGER.info( "Analysis");
		LOGGER.info( "-------------------------------------------------------");
		performAnalysis(experiment, folder);
		LOGGER.info( "-------------------------------------------------------");
		LOGGER.info( "Results");
		LOGGER.info( "-------------------------------------------------------");
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
		for (final Logger l : loggerToUse) {
			l.log(Level.INFO, "-------------------------------------------------------");
			l.log(Level.INFO, "Search");
			l.log(Level.INFO, "-------------------------------------------------------");
			l.log(Level.INFO, "InputModel:      " + SearchParameters.initialModel);
			l.log(Level.INFO, "Objectives:      " + this.orchestration.getFitnessFunction().getObjectiveNames());
			l.log(Level.INFO, "NrObjectives:    " + this.orchestration.getNumberOfObjectives());
			l.log(Level.INFO, "Constraints:     " + this.orchestration.getFitnessFunction().getConstraintNames());
			l.log(Level.INFO, "NrConstraints:   " + this.orchestration.getNumberOfConstraints());
			l.log(Level.INFO, "Transformations: " + String.join(", ", SearchParameters.modules));
			l.log(Level.INFO, "Units:           " + this.orchestration.getModuleManager().getUnits());
			l.log(Level.INFO, "SolutionLength:  " + this.orchestration.getSolutionLength());
			l.log(Level.INFO, "PopulationSize:  " + SearchParameters.populationSize);
			l.log(Level.INFO, "Iterations:      " + SearchParameters.maxEvaluations / SearchParameters.populationSize);
			l.log(Level.INFO, "MaxEvaluations:  " + SearchParameters.maxEvaluations);
			l.log(Level.INFO, "AlgorithmRuns:   " + SearchParameters.nrRuns);
			l.log(Level.INFO, "---------------------------");
		}
	}

}
