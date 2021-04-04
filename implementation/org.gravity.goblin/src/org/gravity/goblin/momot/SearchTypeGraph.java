package org.gravity.goblin.momot;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.model.Unit;
import org.gravity.goblin.EGraphUtil;
import org.gravity.goblin.GoblinActivator;
import org.gravity.goblin.SearchParameters;
import org.gravity.goblin.constraints.VisibilityConstraintCalculator;
import org.gravity.goblin.fitness.AntiPatternCalculator;
import org.gravity.goblin.fitness.CohesionCalculator;
import org.gravity.goblin.fitness.CouplingCalculator;
import org.gravity.goblin.fitness.IFitnessCalculator;
import org.gravity.goblin.fitness.VisibilityCalculator;
import org.gravity.goblin.orchestration.MoveMethodTransformationSearchOrchestration;
import org.gravity.goblin.repair.PostProcessRepairMultiDimensionalFitnessFunction;
import org.gravity.goblin.repair.VisibilityReducer;
import org.gravity.goblin.repair.VisibilityRepairer;
import org.gravity.goblin.typegraph.equality.EqualityHelper;
import org.gravity.typegraph.basic.BasicPackage;
import org.moeaframework.core.operator.OnePointCrossover;
import org.moeaframework.core.operator.TournamentSelection;
import org.osgi.framework.Bundle;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

import at.ac.tuwien.big.moea.SearchExperiment;
import at.ac.tuwien.big.moea.experiment.executor.listener.SeedRuntimePrintListener;
import at.ac.tuwien.big.moea.search.algorithm.EvolutionaryAlgorithmFactory;
import at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension;
import at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension.FunctionType;
import at.ac.tuwien.big.momot.ModuleManager;
import at.ac.tuwien.big.momot.TransformationResultManager;
import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.search.algorithm.operator.mutation.TransformationParameterMutation;
import at.ac.tuwien.big.momot.search.algorithm.operator.mutation.TransformationPlaceholderMutation;
import at.ac.tuwien.big.momot.search.fitness.IEGraphMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.search.fitness.dimension.AbstractEGraphFitnessDimension;
import at.ac.tuwien.big.momot.search.fitness.dimension.TransformationLengthDimension;

/**
 *
 * The main class for executing search experiments
 *
 */
public class SearchTypeGraph {

	private static final Logger LOGGER = Logger.getLogger(SearchTypeGraph.class);

	protected List<FitnessFunction> fitnessFunctions;
	private List<FitnessFunction> constraints;

	// protected final String[] modules = new String[] {
	// "transformations/allInOne.henshin" };
	/*
	 * protected final String[] unitsToRemove = new String[] {
	 * "MoveMethod::rules::libCheck", "MoveMethod::rules::MoveMethod",
	 * "MoveMethod::rules::checkPreconditions", "MoveMethod::rules::dyn1MoveMethod",
	 * "MoveMethod::rules::MoveMethodWithoutPreconstraints" ,
	 * "MoveMethod::rules::changeVisibility", "MoveMethod::rules::dyn2MoveMethod" //
	 * ,"MoveMethod::rules::MoveMethodMain" };
	 */

	public class FitnessFunction {
		private final String name;
		private final FunctionType type;
		private final IFitnessCalculator calculator;

		public FitnessFunction(String name, FunctionType type, IFitnessCalculator calc) {
			this.name = name;
			this.type = type;
			this.calculator = calc;
		}

		/**
		 * A getter for the calculator
		 *
		 * @return the calculator
		 */
		public IFitnessCalculator getCalculator() {
			return this.calculator;
		}

		public IFitnessDimension<TransformationSolution> createFitnessDimension() {
			return new AbstractEGraphFitnessDimension(this.name, this.type) {
				@Override
				protected double internalEvaluate(TransformationSolution solution) {
					return getCalculator().calculate(EGraphUtil.getPG(solution.getResultGraph()));
				}
			};
		}
	}

	public void initializeFitnessFunctions() {
		this.fitnessFunctions = new ArrayList<>();
		this.fitnessFunctions.add(new FitnessFunction("Coupling", FunctionType.Minimum, new CouplingCalculator()));
		this.fitnessFunctions.add(new FitnessFunction("LCOM", FunctionType.Minimum, new CohesionCalculator()));
		this.fitnessFunctions
				.add(new FitnessFunction("Number of Blobs", FunctionType.Minimum, new AntiPatternCalculator()));
		this.fitnessFunctions.add(new FitnessFunction("Visibility", FunctionType.Minimum, new VisibilityCalculator()));
		// exclude repairs, not needed anymore because of visibility
		/*
		 * if (SearchParameters.useRepair) { fitnessFunctions.add(new
		 * FitnessFunction("Number Repairs", FunctionType.Minimum, new
		 * RepairMetricCalculator())); }
		 */

	}

	public void initializeConstraints() {
		this.constraints = new ArrayList<>();
		if (SearchParameters.useConstraints) {
			this.constraints
					.add(new FitnessFunction("Visibility", FunctionType.Minimum, new VisibilityConstraintCalculator()));
		}
	}

	private void initializeAlgorithms(TransformationSearchOrchestration orchestration,
			EvolutionaryAlgorithmFactory<TransformationSolution> moea) {

		TournamentSelection ts = null;
		if (SearchParameters.useCustomDominanceComperator) {
			ts = new TournamentSelection(2, new CustomDominanceComperator(this.fitnessFunctions));
		} else {
			ts = new TournamentSelection(2);
		}

		orchestration.addAlgorithm("NSGAIII", moea.createNSGAIII(ts,
				new OnePointCrossover(SearchParameters.onePointCrossoverProbability),
				new TransformationParameterMutation(SearchParameters.transformationParameterMutationProbability,
						orchestration.getModuleManager()),
				new TransformationPlaceholderMutation(SearchParameters.transformationPlaceholderMutationProbability)));
	}

	protected IFitnessDimension<TransformationSolution> createSolutionLengthFitness() {
		final IFitnessDimension<TransformationSolution> dimension = new TransformationLengthDimension("SolutionLength");
		dimension.setFunctionType(FunctionType.Minimum);
		return dimension;
	}

	protected ModuleManager createModuleManager() {
		final ModuleManager manager = new ModuleManager();
		if (Platform.isRunning()) {
			final Bundle bundle = Platform.getBundle(GoblinActivator.PLUGIN_ID);
			for (final String module : SearchParameters.modules) {
				if (bundle == null) {
					manager.addModule(module);
				} else {
					final URL entry = bundle.getEntry(module);
					try {
						final String substring = entry.getFile().substring(entry.getFile().lastIndexOf('/') + 1);
						final Path temp = Files.createTempDirectory("goblin");
						final File file = new File(temp.toFile(), substring);
						Files.copy(entry.openStream(), file.toPath());
						manager.addModule(file.getAbsolutePath());
					} catch (final IOException e) {
						LOGGER.warn(e.getMessage(), e);
					}
				}
			}
		}

		final List<String> units = new ArrayList<>();
		for (final Unit unit : manager.getUnits()) {
			units.add(ModuleManager.getQualifiedName(unit));
		}
		units.removeAll(SearchParameters.units);
		manager.removeUnits(units);

		return manager;
	}

	protected IEGraphMultiDimensionalFitnessFunction createFitnessFunction() {
		final PostProcessRepairMultiDimensionalFitnessFunction function = new PostProcessRepairMultiDimensionalFitnessFunction();
		// IEGraphMultiDimensionalFitnessFunction function = new
		// EGraphMultiDimensionalFitnessFunction();
		function.addObjective(createSolutionLengthFitness());

		for (final FitnessFunction fitness : this.fitnessFunctions) {
			function.addObjective(fitness.createFitnessDimension());
		}
		for (final FitnessFunction constraint : this.constraints) {
			function.addConstraint(constraint.createFitnessDimension());
		}
		if (SearchParameters.useRepair) {
			function.setSolutionRepairer(new VisibilityRepairer());
		}
		if (SearchParameters.useOptimizationRepair) {
			function.setOptimizationRepairer(new VisibilityReducer());
		}

		return function;
	}

	protected TransformationSearchOrchestration createOrchestration(final String initialGraph,
			final int solutionLength) {
		final MoveMethodTransformationSearchOrchestration orchestration = new MoveMethodTransformationSearchOrchestration();

		final ModuleManager moduleManager = createModuleManager();
		final EGraph graph = moduleManager.loadGraph(initialGraph);
		orchestration.setModuleManager(moduleManager);
		orchestration.setProblemGraph(graph);
		orchestration.setSolutionLength(solutionLength);
		orchestration.setFitnessFunction(createFitnessFunction());
		orchestration.setEqualityHelper(new EqualityHelper());

		final EvolutionaryAlgorithmFactory<TransformationSolution> moea = orchestration
				.createEvolutionaryAlgorithmFactory(SearchParameters.populationSize);

		initializeAlgorithms(orchestration, moea);
		return orchestration;
	}

	protected SearchExperiment<TransformationSolution> createExperiment(
			final TransformationSearchOrchestration orchestration) {
		final SearchExperiment<TransformationSolution> experiment = new SearchExperiment<>(orchestration,
				SearchParameters.maxEvaluations);
		experiment.setNumberOfRuns(SearchParameters.nrRuns);
		experiment.addProgressListener(new SeedRuntimePrintListener());
		return experiment;
	}

	/**
	 * Performs the search on the given model saving at the current location
	 *
	 * @param initialGraph   The path of the given model
	 * @param solutionLength The desired solution length
	 * @return A manager for accessing the search solution
	 */
	public TransformationResultManager performSearch(String initialGraph, int solutionLength) {
		return performSearch(initialGraph, solutionLength, new File("./"));
	}

	/**
	 * Performs the search on the given model
	 *
	 * @param initialGraph   The path of the given model
	 * @param solutionLength The desired solution length
	 * @param folder         The output location
	 * @return A manager for accessing the search solution
	 */
	public TransformationResultManager performSearch(final String initialGraph, final int solutionLength, File folder) {
		final TransformationSearchOrchestration orchestration = createOrchestration(initialGraph, solutionLength);
		final SearchPrinter printer = new SearchPrinter(orchestration);
		printer.logSearchInfo();
		final SearchExperiment<TransformationSolution> experiment = createExperiment(orchestration);
		final long start = System.currentTimeMillis();
		experiment.run();
		final long duration = System.currentTimeMillis() - start;
		try {
			Files.write(new File(folder, "durationGoblinInMs.txt").toPath(), Long.toString(duration).getBytes());
		} catch (final IOException e) {
			LOGGER.warn(e.getMessage(), e);
		}
		return printer.printResults(experiment, folder);
	}

	private boolean handleInput(String[] args) {
		final JCommander jCommander = new JCommander(new SearchParameters());
		jCommander.setProgramName("Search Type Graph");

		try {
			jCommander.parse(args);
		} catch (final ParameterException ex) {
			LOGGER.log(Level.INFO, ex.getMessage());
			jCommander.usage();
			System.exit(-1);
		}

		if (SearchParameters.help) {
			jCommander.usage();
			return false;
		}
		return true;
	}

	/**
	 * The main method to execute an optimization
	 *
	 * @param args For the param have a look at the class @see
	 *             org.gravity.goblin.SearchParameters
	 */
	public static void main(final String... args) {
		final SearchTypeGraph search = new SearchTypeGraph();
		if (!search.handleInput(args)) {
			return;
		}
		BasicPackage.eINSTANCE.eClass();
		LOGGER.log(Level.INFO, "Search started.");

		search.initializeFitnessFunctions();
		search.initializeConstraints();
		search.performSearch(SearchParameters.initialModel, SearchParameters.solutiionLength);
		LOGGER.log(Level.INFO, "Search finished.");
	}
}
