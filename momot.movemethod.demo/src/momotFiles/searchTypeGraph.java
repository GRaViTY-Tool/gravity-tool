package momotFiles;

import at.ac.tuwien.big.moea.SearchAnalysis;
import at.ac.tuwien.big.moea.SearchExperiment;
import at.ac.tuwien.big.moea.experiment.analyzer.SearchAnalyzer;
import at.ac.tuwien.big.moea.experiment.executor.listener.SeedRuntimePrintListener;
import at.ac.tuwien.big.moea.print.IPopulationWriter;
import at.ac.tuwien.big.moea.print.ISolutionWriter;
import at.ac.tuwien.big.moea.search.algorithm.EvolutionaryAlgorithmFactory;
import at.ac.tuwien.big.moea.search.algorithm.LocalSearchAlgorithmFactory;
import at.ac.tuwien.big.moea.search.algorithm.provider.IRegisteredAlgorithm;
import at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension;
import at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension.FunctionType;
import at.ac.tuwien.big.momot.ModuleManager;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.search.algorithm.operator.mutation.TransformationParameterMutation;
import at.ac.tuwien.big.momot.search.algorithm.operator.mutation.TransformationPlaceholderMutation;
import at.ac.tuwien.big.momot.search.fitness.EGraphMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.search.fitness.IEGraphMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.search.fitness.dimension.AbstractEGraphFitnessDimension;
import at.ac.tuwien.big.momot.search.fitness.dimension.TransformationLengthDimension;
import at.ac.tuwien.big.momot.util.MomotUtil;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.internal.resources.ProjectInfo;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.core.JavaProject;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.io.ModelSaver;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.tgg.modisco.MoDiscoTGGConverterFactory;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TypeGraph;
import org.moeaframework.algorithm.NSGAII;
import org.moeaframework.core.Population;
import org.moeaframework.core.operator.OnePointCrossover;
import org.moeaframework.core.operator.TournamentSelection;
import org.moeaframework.util.progress.ProgressListener;

import ConstraintCalculators.ConstraintCalculator;
import ConstraintCalculators.VisibilityConstraintCalculator;
import FitnessCalculators.AntiPatternCalculator;
import FitnessCalculators.CohesionCalculator;
import FitnessCalculators.CouplingCalculator;
import FitnessCalculators.IFitnessCalculator;

@SuppressWarnings("all")
public class searchTypeGraph {
  
	//protected static String INITIAL_MODEL = "input/SecureMailApp.xmi";
	protected static String INITIAL_MODEL = "input/02_JsciCalc2.1.0.xmi";
  //protected static String INITIAL_MODEL = "input/00_JavaSolitaire1.3.xmi";
  //protected static String INITIAL_MODEL = "input/01_QuickUML2001.xmi";
  //protected static String INITIAL_MODEL = "input/04_Gantt1.10.2.xmi";
  //protected static String INITIAL_MODEL = "input/04_Gantt1.10.2.xmi";
  //protected static String INITIAL_MODEL = "input/04_Gantt1.10.2.xmi";
  //protected static String INITIAL_MODEL = "input/04_Gantt1.10.2.xmi";
  
  
  protected String baseName;
  protected List<FitnessFunction> fitnessFunctions;
  public static List<FitnessFunction> constraints;
  protected static boolean useConstraints = true;
  protected static boolean useRepair = false;
  
  protected final String[] modules = new String[] { "transformations/MoveMethod.henshin" };
  protected final String[] unitsToRemove = new String[] { 
		  "MoveMethod::rules::libCheck", 
		  "MoveMethod::rules::MoveMethod", 
		  "MoveMethod::rules::checkPreconditions", 
		  "MoveMethod::rules::dyn1MoveMethod", 
		  "MoveMethod::rules::MoveMethodWithoutPreconstraints" ,
		  "MoveMethod::rules::changeVisibility",
		  "MoveMethod::rules::dyn2MoveMethod"
		 /// ,"MoveMethod::rules::main" 
		  };
  
  protected final static int SOLUTION_LENGTH = 5;
  protected final int populationSize = 100;
  protected final int maxEvaluations = 10000;
  protected static int nrRuns = 1;
  
  protected static double TransformationParameterMutationProbability = 0.1;
  protected static double TransformationPlaceholderMutationProbability = 0.2;
  protected static double OnePointCrossoverProbability = 0.5;

  public class AbstractFitnessFunction{
	  
  }
  
  public class FitnessFunction{
	  public String Name;
	  public FunctionType type;
	  public IFitnessCalculator calculator;
	  public FitnessFunction(String name, FunctionType type, IFitnessCalculator calc){
		  this.Name = name;
		  this.type = type; 
		  this.calculator = calc;
	  }
  }
  
  private void initializeFitnessFunctions(){
	  fitnessFunctions = new ArrayList<FitnessFunction>();
	  fitnessFunctions.add(new FitnessFunction("Coupling", FunctionType.Minimum, new CouplingCalculator()));  
	  fitnessFunctions.add(new FitnessFunction("LCOM", FunctionType.Minimum, new CohesionCalculator()));  
	  fitnessFunctions.add(new FitnessFunction("Number of Blobs", FunctionType.Minimum, new AntiPatternCalculator()));  
	  
  }
  
  private void initializeConstraints(){
	  constraints = new ArrayList<FitnessFunction>();
	  if(useConstraints){
		  constraints.add(new FitnessFunction("visibility", FunctionType.Minimum, new VisibilityConstraintCalculator()));  
	  }
  }
  
  private void initializeAlgorithms(MoveMethodTransformationSearchOrchestration orchestration, EvolutionaryAlgorithmFactory<TransformationSolution> moea) {
	  orchestration.addAlgorithm("NSGAIII", moea.createNSGAIII( new TournamentSelection(2),  
	    		new OnePointCrossover(OnePointCrossoverProbability), 
	    		new TransformationParameterMutation(TransformationParameterMutationProbability, orchestration.getModuleManager()), 
	    		new TransformationPlaceholderMutation(TransformationPlaceholderMutationProbability)));
	
}
  
  
  
  
  
  
  
  
  //-----------------------------non configurable stuff-------------------------------------------
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
    ModuleManager manager = new ModuleManager();
    for(String module : modules) {
       manager.addModule(URI.createFileURI(new File(module).getPath().toString()).toString());
    }
    manager.removeUnits(unitsToRemove);
    return manager;
  }
  
  protected IEGraphMultiDimensionalFitnessFunction createFitnessFunction() {
    IEGraphMultiDimensionalFitnessFunction function = new PostProcessRepairMultiDimensionalFitnessFunction();
    function.addObjective(createSolutionLengthFitness());

    for(FitnessFunction fitness : fitnessFunctions){
    	function.addObjective(createFitnessDimension(fitness));
    } 
    for(FitnessFunction constraint : constraints){
    	function.addConstraint(createFitnessDimension(constraint));
    }
    if(useRepair){
    	function.setSolutionRepairer(new VisibilityRepairer());
    }
    
    return function;
  }
  
  protected MoveMethodTransformationSearchOrchestration createOrchestration(final String initialGraph, final int solutionLength) {
    MoveMethodTransformationSearchOrchestration orchestration = new MoveMethodTransformationSearchOrchestration();
    ModuleManager moduleManager = createModuleManager();
    EGraph graph = moduleManager.loadGraph(initialGraph);
    orchestration.setModuleManager(moduleManager);
    orchestration.setProblemGraph(graph);
    orchestration.setSolutionLength(solutionLength);
    orchestration.setFitnessFunction(createFitnessFunction());
    
    EvolutionaryAlgorithmFactory<TransformationSolution> moea = orchestration.createEvolutionaryAlgorithmFactory(populationSize);
    LocalSearchAlgorithmFactory<TransformationSolution> local = orchestration.createLocalSearchAlgorithmFactory();
   
    initializeAlgorithms(orchestration, moea);
    return orchestration;
  }
  


protected SearchExperiment<TransformationSolution> createExperiment(final MoveMethodTransformationSearchOrchestration orchestration) {
    SearchExperiment<TransformationSolution> experiment = new SearchExperiment<TransformationSolution>(orchestration, maxEvaluations);
    experiment.setNumberOfRuns(nrRuns);
    experiment.addProgressListener(new SeedRuntimePrintListener());
    return experiment;
  }
  
  public void performSearch(final String initialGraph, final int solutionLength) {
    MoveMethodTransformationSearchOrchestration orchestration = createOrchestration(initialGraph, solutionLength);
    SearchPrinter printer = new SearchPrinter(orchestration);
    printer.printSearchInfo(INITIAL_MODEL, modules, populationSize, maxEvaluations, nrRuns);
    SearchExperiment<TransformationSolution> experiment = createExperiment(orchestration);
    experiment.run();
    printer.printResults(experiment);
  }
  

  
  
  
  public static void main(final String... args) {
	  if(args.length > 0){
		  if(args[0].equalsIgnoreCase("help") || args[0].equalsIgnoreCase("?")){
			  System.out.println("Useage:");
			  System.out.println("Argument 1: Model Name");
			  System.out.println("(optinal) Argument 2: Number of runs (default 1)");
			  System.out.println("(optinal) Argument 3: boolean useContraints (default true)");
		  }
		  
		  INITIAL_MODEL =  args[0];
	  }
	  if(args.length>1){
		  nrRuns = Integer.parseInt(args[1]);
	  }
	  if(args.length > 2){
		  useConstraints = Boolean.parseBoolean(args[2]);
	  }
	  
	  BasicPackage.eINSTANCE.eClass();
	  System.out.println("Search started.");
    
    searchTypeGraph search = new searchTypeGraph();
    search.initializeFitnessFunctions();
    search.initializeConstraints();
    search.performSearch(INITIAL_MODEL, SOLUTION_LENGTH);
    System.out.println("Search finished.");
  }
}
