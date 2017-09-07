package momotFiles;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.model.Unit;
import org.gravity.typegraph.basic.BasicPackage;
import org.moeaframework.core.operator.OnePointCrossover;
import org.moeaframework.core.operator.TournamentSelection;
import org.osgi.framework.Bundle;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;

import ConstraintCalculators.AccessConstraintCalculator;
import ConstraintCalculators.InheritanceConstraintCalculator;
import ConstraintCalculators.SubTypesConstraintCalculator;
import ConstraintCalculators.VisibilityConstraintCalculator;
import FitnessCalculators.AntiPatternCalculator;
import FitnessCalculators.CohesionCalculator;
import FitnessCalculators.CouplingCalculator;
import FitnessCalculators.IFitnessCalculator;
import FitnessCalculators.RepairMetricCalculator;
import Orchestration.MoveMethodTransformationSearchOrchestration;
import Repair.PostProcessRepairMultiDimensionalFitnessFunction;
import Repair.VisibilityRepairer;
import at.ac.tuwien.big.moea.SearchExperiment;
import at.ac.tuwien.big.moea.experiment.executor.listener.SeedRuntimePrintListener;
import at.ac.tuwien.big.moea.search.algorithm.EvolutionaryAlgorithmFactory;
import at.ac.tuwien.big.moea.search.algorithm.LocalSearchAlgorithmFactory;
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

@SuppressWarnings("all")
public class SearchTypeGraph {

	protected List<FitnessFunction> fitnessFunctions;
	public static List<FitnessFunction> constraints;

	// protected final String[] modules = new String[] {
	// "transformations/allInOne.henshin" };
	/*
	 * protected final String[] unitsToRemove = new String[] {
	 * "MoveMethod::rules::libCheck", "MoveMethod::rules::MoveMethod",
	 * "MoveMethod::rules::checkPreconditions",
	 * "MoveMethod::rules::dyn1MoveMethod",
	 * "MoveMethod::rules::MoveMethodWithoutPreconstraints" ,
	 * "MoveMethod::rules::changeVisibility",
	 * "MoveMethod::rules::dyn2MoveMethod" //
	 * ,"MoveMethod::rules::MoveMethodMain" };
	 */

	public class FitnessFunction {
		public String Name;
		public FunctionType type;
		public IFitnessCalculator calculator;

		public FitnessFunction(String name, FunctionType type, IFitnessCalculator calc) {
			this.Name = name;
			this.type = type;
			this.calculator = calc;
		}
	}

	public void initializeFitnessFunctions() {
		fitnessFunctions = new ArrayList<FitnessFunction>();
		fitnessFunctions.add(new FitnessFunction("Coupling", FunctionType.Minimum, new CouplingCalculator()));
		fitnessFunctions.add(new FitnessFunction("LCOM", FunctionType.Minimum, new CohesionCalculator()));
		fitnessFunctions.add(new FitnessFunction("Number of Blobs", FunctionType.Minimum, new AntiPatternCalculator()));
		if (SearchParameters.useRepair) {
			fitnessFunctions
					.add(new FitnessFunction("Number Repairs", FunctionType.Minimum, new RepairMetricCalculator()));
		}

	}

	public void initializeConstraints() {
		constraints = new ArrayList<FitnessFunction>();
		if (SearchParameters.useConstraints) {
			constraints
					.add(new FitnessFunction("Visibility", FunctionType.Minimum, new VisibilityConstraintCalculator()));
			constraints
					.add(new FitnessFunction("Accessibility", FunctionType.Minimum, new AccessConstraintCalculator()));
			constraints.add(
					new FitnessFunction("Inheritance", FunctionType.Minimum, new InheritanceConstraintCalculator()));
			constraints.add(new FitnessFunction("SubTypes", FunctionType.Minimum, new SubTypesConstraintCalculator()));
		}
	}

	private void initializeAlgorithms(TransformationSearchOrchestration orchestration,
			EvolutionaryAlgorithmFactory<TransformationSolution> moea) {
		orchestration.addAlgorithm("NSGAIII", moea.createNSGAIII(new TournamentSelection(2),
				new OnePointCrossover(SearchParameters.OnePointCrossoverProbability),
				new TransformationParameterMutation(SearchParameters.TransformationParameterMutationProbability,
						orchestration.getModuleManager()),
				new TransformationPlaceholderMutation(SearchParameters.TransformationPlaceholderMutationProbability)));
	}

	// -----------------------------non configurable
	// stuff-------------------------------------------
	protected IFitnessDimension<TransformationSolution> createFitnessDimension(FitnessFunction function) {
		return new AbstractEGraphFitnessDimension(function.Name, function.type) {
			@Override
			protected double internalEvaluate(TransformationSolution solution) {
				EGraph graph = solution.execute();
				return function.calculator.calculate(graph);
			}
		};
	}

	protected IFitnessDimension<TransformationSolution> createSolutionLengthFitness() {
		IFitnessDimension<TransformationSolution> dimension = new TransformationLengthDimension("SolutionLength");
		dimension.setFunctionType(FunctionType.Minimum);
		return dimension;
	}

	protected ModuleManager createModuleManager() {
		Bundle bundle = Platform.getBundle("org.goblin.movemethod");
		ModuleManager manager = new ModuleManager();
		for (String module : SearchParameters.modules) {
			if(bundle == null) {
				manager.addModule(module);
			}else {
				URL entry = bundle.getEntry(module);
				try {
					String substring = entry.getFile().substring(entry.getFile().lastIndexOf('/') + 1);
					Path temp = Files.createTempDirectory("goblin");
					File file = new File(temp.toFile(), substring);
					Files.copy(entry.openStream(), file.toPath());
					manager.addModule(file.getAbsolutePath());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		List<String> units = new ArrayList<String>();
		for (Unit unit : manager.getUnits()) {
			units.add(manager.getQualifiedName(unit));
		}
		units.removeAll((Arrays.asList(SearchParameters.units)));
		manager.removeUnits(units);

		return manager;
	}

	protected IEGraphMultiDimensionalFitnessFunction createFitnessFunction() {
		IEGraphMultiDimensionalFitnessFunction function = new PostProcessRepairMultiDimensionalFitnessFunction();
		// IEGraphMultiDimensionalFitnessFunction function = new
		// EGraphMultiDimensionalFitnessFunction();
		function.addObjective(createSolutionLengthFitness());

		for (FitnessFunction fitness : fitnessFunctions) {
			function.addObjective(createFitnessDimension(fitness));
		}
		for (FitnessFunction constraint : constraints) {
			function.addConstraint(createFitnessDimension(constraint));
		}
		if (SearchParameters.useRepair) {
			function.setSolutionRepairer(new VisibilityRepairer());
		}

		return function;
	}

	protected TransformationSearchOrchestration createOrchestration(final String initialGraph,
			final int solutionLength) {
		MoveMethodTransformationSearchOrchestration orchestration = new MoveMethodTransformationSearchOrchestration();
		// TransformationSearchOrchestration orchestration = new
		// TransformationSearchOrchestration();
		ModuleManager moduleManager = createModuleManager();
		EGraph graph = moduleManager.loadGraph(initialGraph);
		orchestration.setModuleManager(moduleManager);
		orchestration.setProblemGraph(graph);
		orchestration.setSolutionLength(solutionLength);
		orchestration.setFitnessFunction(createFitnessFunction());
		orchestration.setEqualityHelper(new EqualityHelper());

		EvolutionaryAlgorithmFactory<TransformationSolution> moea = orchestration
				.createEvolutionaryAlgorithmFactory(SearchParameters.populationSize);
		LocalSearchAlgorithmFactory<TransformationSolution> local = orchestration.createLocalSearchAlgorithmFactory();

		initializeAlgorithms(orchestration, moea);
		return orchestration;
	}

	protected SearchExperiment<TransformationSolution> createExperiment(
			final TransformationSearchOrchestration orchestration) {
		SearchExperiment<TransformationSolution> experiment = new SearchExperiment<TransformationSolution>(
				orchestration, SearchParameters.maxEvaluations);
		experiment.setNumberOfRuns(SearchParameters.nrRuns);
		experiment.addProgressListener(new SeedRuntimePrintListener());
		return experiment;
	}

	public TransformationResultManager performSearch(String initialGraph, int solutionLength) {
		return performSearch(initialGraph, solutionLength, new File("./"));
	}

	public TransformationResultManager performSearch(final String initialGraph, final int solutionLength, File folder) {
		TransformationSearchOrchestration orchestration = createOrchestration(initialGraph, solutionLength);
		SearchPrinter printer = new SearchPrinter(orchestration);
		printer.printSearchInfo(SearchParameters.INITIAL_MODEL, SearchParameters.modules,
				SearchParameters.populationSize, SearchParameters.maxEvaluations, SearchParameters.nrRuns);
		SearchExperiment<TransformationSolution> experiment = createExperiment(orchestration);
		long start = System.currentTimeMillis();
		experiment.run();
		long duration = System.currentTimeMillis() -start;
		try {
			Files.write(new File(folder, "durationGoblinInMs.txt").toPath(), Long.toString(duration).getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return printer.printResults(experiment, folder);
	}

	public static void parseArgs(final String... args) {
		if (args.length > 0) {
			if (args[0].equalsIgnoreCase("help") || args[0].equalsIgnoreCase("?")) {
				System.out.println("Useage:");
				System.out.println("Argument 1: Model Name");
				System.out.println("(optinal) Argument 2: Number of runs (default 1)");
				System.out.println("(optinal) Argument 3: boolean useContraints (default true)");
			}

			SearchParameters.INITIAL_MODEL = args[0];
		}
		if (args.length > 1) {
			SearchParameters.nrRuns = Integer.parseInt(args[1]);
		}
		if (args.length > 2) {
			SearchParameters.useConstraints = Boolean.parseBoolean(args[2]);
		}
	}

	public void handleInput(String[] args) {
		JCommander jCommander = new JCommander(new SearchParameters());
		jCommander.setProgramName("Search Type Graph");

		try {
			jCommander.parse(args);
		} catch (ParameterException ex) {
			System.out.println(ex.getMessage());
			jCommander.usage();
			System.exit(0);
		}

		if (SearchParameters.help) {
			jCommander.usage();
			System.exit(0);
		}

	}

	public static void main(final String... args) {
		SearchTypeGraph search = new SearchTypeGraph();
		// parseArgs(args);
		search.handleInput(args);
		BasicPackage.eINSTANCE.eClass();
		System.out.println("Search started.");

		search.initializeFitnessFunctions();
		search.initializeConstraints();
		search.performSearch(SearchParameters.INITIAL_MODEL, SearchParameters.SOLUTION_LENGTH);
		System.out.println("Search finished.");
	}
}
