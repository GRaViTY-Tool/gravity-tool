package org.gravity.goblin;

import java.util.Arrays;
import java.util.List;

import com.beust.jcommander.Parameter;

/**
 * The configuration of for a search using JCommander
 *
 */
public class SearchParameters {

	/**
	 * Initial Model that will be optimized
	 */
	@Parameter(names = { "-im", "--initial_model" }, description = "Initial Model that will be optimized")
	public static String initialModel = "input/notepad.xmi";

	/**
	 * Displays help information
	 */
	@Parameter(names = { "-h", "--help" }, help = true, description = "Displays help information")
	public static boolean help = false;

	/**
	 * Flag to toggle usage of visibility constraints
	 */
	@Parameter(names = { "-c",
	"--use_constraints" }, arity = 1, description = "flag to toggle usage of visibility constraints")
	public static boolean useConstraints = true;

	/**
	 * Flag to toggle usage of repair
	 */
	@Parameter(names = { "-r", "--use_repair" }, arity = 1, description = "flag to toggle usage of repair")
	public static boolean useRepair = true;

	/**
	 * Flag to toggle usage of security constraints
	 */
	@Parameter(names = { "-s",
	"--use_Security" }, arity = 1, description = "flag to toggle usage of security constraints")
	public static boolean useSecurity = true;

	/**
	 * Number of transformations each solution will contain
	 */
	@Parameter(names = { "-sl",
	"--solution_length" }, description = "number of transformations each solution will contain")
	public static int solutiionLength = 10;

	/**
	 * Number of solutions a population contains
	 */
	@Parameter(names = { "-p", "--population_size" }, description = "number of solutions a population contains")
	public static int populationSize = 100;

	/**
	 * Number of solutions that will be calculated
	 */
	@Parameter(names = { "-e", "--max_evaluations" }, description = "number of solutions that will be calculated")
	public static int maxEvaluations = 10000;

	/**
	 * Number of times the algorithm will be executed
	 */
	@Parameter(names = { "-nr", "--nr_runs" }, description = "number of times the algorithm will be executed")
	public static int nrRuns = 1;

	/**
	 * Probability a solution will be mutated with a new transformation
	 */
	@Parameter(names = { "-pm",
	"--parameter_mutation_probability" }, description = "probability a solution will be mutated with a new transformation")
	public static double transformationParameterMutationProbability = 0.1;

	/**
	 * Probability a solution will be mutated with a placeholder
	 */
	@Parameter(names = { "-phm",
	"--placeholder_mutation_probability" }, description = "probability a solution will be mutated with a placeholder")
	public static double transformationPlaceholderMutationProbability = 0.1;

	/**
	 * Probability a crossover between two solutions will happen
	 */
	@Parameter(names = { "-cop",
	"--crossover_probability" }, description = "probability a crossover between two solutions will happen")
	public static double onePointCrossoverProbability = 1;

	/**
	 * Modules containing transformation rules
	 */
	@Parameter(names = { "-mod", "--modules" }, description = "modules containing transformation rules")
	public static List<String> modules = Arrays.asList("transformations/MoveMethod.henshin");

	/**
	 * Units that will be used as transformation rules
	 */
	@Parameter(names = { "-u", "--units" }, description = "units that will be used as transformation rules")
	public static List<String> units = Arrays.asList("MoveMethod::rules::MoveMethod",
			"MoveMethod::rules::changeMethodVisibility", "MoveMethod::rules::changeFieldVisibility");

	/**
	 * Flag to toggle usage of custom DominanceComperator
	 */
	@Parameter(names = { "-cdc",
	"--use_customDominanceComperator" }, arity = 1, description = "flag to toggle usage of custom DominanceComperator")
	public static boolean useCustomDominanceComperator = true;

	/**
	 * Flag to toggle to reduce visibilities in every step.
	 */
	@Parameter(names = { "-rv",
	"--reduce_visibilities" }, arity = 1, description = "flag to toggle to reduce visibilities in every step")
	public static boolean useOptimizationRepair = false;

	/**
	 * Weights used for dominance comparation
	 */
	@Parameter(names = { "-w", "--weight" }, description = "weights used for dominance comparation")
	public static List<Double> weight = Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0);

	/**
	 * Value for public access modifier used in metric calculation
	 */
	@Parameter(names = { "-puv",
	"--public_value" }, description = "value for public access modifier used in metric calculation")
	public static int publicValue = 3;

	/**
	 * Value for protected access modifier used in metric calculation
	 */
	@Parameter(names = { "-prv",
	"--protected_value" }, description = "Value for protected access modifier used in metric calculation")
	public static int protectedValue = 2;

	/**
	 * Value for public access modifier used in metric calculation
	 */
	@Parameter(names = { "-pav",
	"--package_value" }, description = "Value for public access modifier used in metric calculation")
	public static int packageValue = 1;

	/**
	 * Value for private access modifier used in metric calculation
	 */
	@Parameter(names = { "-priv",
	"--private_value" }, description = "Value for private access modifier used in metric calculation")
	public static int privateValue = 0;

}
