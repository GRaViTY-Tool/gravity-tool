package momotFiles;

import com.beust.jcommander.Parameter;

public class SearchParameters {

	// public static String INITIAL_MODEL = "input/SecureMailApp.xmi";
	// public static String INITIAL_MODEL = "input/02_JsciCalc2.1.0.xmi";
	@Parameter(	names = { "-im", "--initial_model" },
				description = "Initial Model that will be optimized")
	public static String INITIAL_MODEL = "input/01_QuickUML2001.xmi";

	@Parameter(	names = { "-h", "--help" }, 
				help = true, 
				description = "Displays help information")
	public static boolean help = false;

	@Parameter(	names = { "-c", "--use_constraints" }, 
				arity = 1, 
				description = "flag to toggle usage of visibility constraints")
	public static boolean useConstraints = true;

	@Parameter(	names = { "-r", "--use_repair" }, 
				arity = 1, 
				description = "flag to toggle usage of repair")
	public static boolean useRepair = true;
	
	@Parameter(	names = { "-s", "--use_Security" }, 
				arity = 1, 
				description = "flag to toggle usage of security constraints")
	public static boolean useSecurity = true;

	@Parameter(	names = { "-sl", "--solution_length" }, 
				description = "number of transformations each solution will contain")
	public static int SOLUTION_LENGTH = 10;
	
	@Parameter(	names = { "-p", "--population_size" },
				description = "number of solutions a population contains")
	public static int populationSize = 100;
	
	@Parameter(	names = { "-e", "--max_evaluations" },
				description = "number of solutions that will be calculated")
	public static int maxEvaluations = 10000;
	
	@Parameter(	names = { "-nr", "--nr_runs" },
				description = "number of times the algorithm will be executed")
	public static int nrRuns = 1;

	@Parameter(	names = { "-pm", "--parameter_mutation_probability" }, 
				description = "probability a solution will be mutated with a new transformation")
	public static double TransformationParameterMutationProbability = 0.1;
	
	@Parameter(	names = { "-phm", "--placeholder_mutation_probability" }, 
				description = "probability a solution will be mutated with a placeholder")
	public static double TransformationPlaceholderMutationProbability = 0.1;
	
	@Parameter(	names = { "-cop", "--crossover_probability" }, 
				description = "probability a crossover between two solutions will happen")
	public static double OnePointCrossoverProbability = 1;
	
	@Parameter(	names = { "-mod", "--modules" },
				description = "modules containing transformation rules")
	public static String[] modules = new String[] { "transformations/MoveMethod.henshin" };

	@Parameter(	names = { "-u", "--units" },
			description = "units that will be used as transformation rules")
	public static String[] units = new String[] { "MoveMethod::rules::MoveMethodMain", "MoveMethod::rules::changeMethodVisibility","MoveMethod::rules::changeFieldVisibility"};
	
	@Parameter(	names = { "-cdc", "--use_customDominanceComperator" }, 
			arity = 1, 
			description = "flag to toggle usage of custom DominanceComperator")
	public static boolean useCustomDominanceComperator = true;

	@Parameter(	names = { "-rv", "--reduce_visibilities" }, 
			arity = 1, 
			description = "flag to toggle to reduce visibilities in every step.")
	public static boolean useOptimizationRepair = false;
	
	@Parameter(	names = { "-w", "--weight" },
			description = "Weights used for dominance comparation")
	public static double[] weight = {1,1,1,1,1};
	
	@Parameter(	names = { "-puv", "--public_value" },
			description = "Value for public access modifier used in metric calculation")
	public static int publicValue = 3;
	
	@Parameter(	names = { "-prv", "--protected_value" },
			description = "Value for protected access modifier used in metric calculation")
	public static int protectedValue = 2;
	
	@Parameter(	names = { "-pav", "--package_value" },
			description = "Value for public access modifier used in metric calculation")
	public static int packageValue = 1;
	
	@Parameter(	names = { "-priv", "--private_value" },
			description = "Value for private access modifier used in metric calculation")
	public static int privateValue = 0;
	
}
