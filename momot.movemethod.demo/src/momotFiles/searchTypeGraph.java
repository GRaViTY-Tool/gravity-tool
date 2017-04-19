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
import at.ac.tuwien.big.momot.TransformationResultManager;
import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
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

import ConstraintCalculators.VisibilityConstraintCalculator;
import FitnessCalculators.AntiPatternCalculator;
import FitnessCalculators.CohesionCalculator;
import FitnessCalculators.CouplingCalculator;
import FitnessCalculators.IFitnessCalculator;

@SuppressWarnings("all")
public class searchTypeGraph {
  
  protected static String INITIAL_MODEL = "input/00_JavaSolitaire1.3.xmi";
  //protected static String INITIAL_MODEL = "input/04_Gantt1.10.2.xmi";
  //protected static String INITIAL_MODEL = "input/04_Gantt1.10.2.xmi";
  //protected static String INITIAL_MODEL = "input/04_Gantt1.10.2.xmi";
  //protected static String INITIAL_MODEL = "input/04_Gantt1.10.2.xmi";
  
  
  protected String baseName;
  protected List<FitnessFunction> fitnessFunctions;
  protected List<FitnessFunction> constraints;
	  
  
  protected final String[] modules = new String[] { "transformations/MoveMethod.henshin" };
  protected final String[] unitsToRemove = new String[] { 
		  "MoveMethod::rules::libCheck", 
		  "MoveMethod::rules::MoveMethod", 
		  "MoveMethod::rules::checkPreconditions", 
		  "MoveMethod::rules::dyn1MoveMethod", 
		  "MoveMethod::rules::changeVisibility",
		  "MoveMethod::rules::dyn2MoveMethod"
		  //,"MoveMethod::rules::main" 
		  };
  
  protected final static int SOLUTION_LENGTH = 10;
  protected final int populationSize = 100;
  protected final int maxEvaluations = 10000;
  protected static int nrRuns = 1;
  
  protected static double TransformationParameterMutationProbability = 0.1;
  protected static double TransformationPlaceholderMutationProbability = 0.05;
  protected static double OnePointCrossoverProbability = 1;

  
  private class FitnessFunction{
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
	  //constraints.add(new FitnessFunction("visibility", FunctionType.Minimum, new VisibilityConstraintCalculator()));  
  }
  
  private void initializeAlgorithms(TransformationSearchOrchestration orchestration, EvolutionaryAlgorithmFactory<TransformationSolution> moea) {
	  orchestration.addAlgorithm("NSGAIII", moea.createNSGAIII( new TournamentSelection(2),  
	    		new OnePointCrossover(OnePointCrossoverProbability), 
	    		new TransformationParameterMutation(TransformationParameterMutationProbability, orchestration.getModuleManager()), 
	    		new TransformationPlaceholderMutation(TransformationPlaceholderMutationProbability)));
	
}
  
  
  
  
  
  
  
  
  //-----------------------------non configurable stuff-------------------------------------------
  protected IFitnessDimension<TransformationSolution> createFitnessDimension(final TransformationSearchOrchestration orchestration, FitnessFunction function) {
	    return new AbstractEGraphFitnessDimension(function.Name, function.type) {
	        @Override
	        protected double internalEvaluate(TransformationSolution solution) {
	           EGraph graph = solution.execute();
        	   return function.calculator.calculate(graph);
	        }
	     };
	   }

  

  protected IFitnessDimension<TransformationSolution> createSolutionLengthFitness(final TransformationSearchOrchestration orchestration) {
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
  
  protected IEGraphMultiDimensionalFitnessFunction createFitnessFunction(final TransformationSearchOrchestration orchestration) {
    IEGraphMultiDimensionalFitnessFunction function = new EGraphMultiDimensionalFitnessFunction();
    function.addObjective(createSolutionLengthFitness(orchestration));

    for(FitnessFunction fitness : fitnessFunctions){
    	function.addObjective(createFitnessDimension(orchestration, fitness));
    }
    
    for(FitnessFunction constraint : constraints){
    	function.addConstraint(createFitnessDimension(orchestration, constraint));
    }
    
    
    return function;
  }
  

  protected ProgressListener _createListener_0() {
    SeedRuntimePrintListener _seedRuntimePrintListener = new SeedRuntimePrintListener();
    return _seedRuntimePrintListener;
  }
  
  protected TransformationSearchOrchestration createOrchestration(final String initialGraph, final int solutionLength) {
    TransformationSearchOrchestration orchestration = new TransformationSearchOrchestration();
    ModuleManager moduleManager = createModuleManager();
    EGraph graph = moduleManager.loadGraph(initialGraph);
    orchestration.setModuleManager(moduleManager);
    orchestration.setProblemGraph(graph);
    orchestration.setSolutionLength(solutionLength);
    orchestration.setFitnessFunction(createFitnessFunction(orchestration));
    
    EvolutionaryAlgorithmFactory<TransformationSolution> moea = orchestration.createEvolutionaryAlgorithmFactory(populationSize);
    LocalSearchAlgorithmFactory<TransformationSolution> local = orchestration.createLocalSearchAlgorithmFactory();

    
    initializeAlgorithms(orchestration, moea);
    
    
    return orchestration;
  }
  


protected SearchExperiment<TransformationSolution> createExperiment(final TransformationSearchOrchestration orchestration) {
    SearchExperiment<TransformationSolution> experiment = new SearchExperiment<TransformationSolution>(orchestration, maxEvaluations);
    experiment.setNumberOfRuns(nrRuns);
    experiment.addProgressListener(_createListener_0());
    return experiment;
  }
  
  protected void deriveBaseName(final TransformationSearchOrchestration orchestration) {
    EObject root = MomotUtil.getRoot(orchestration.getProblemGraph());
    if(root == null || root.eResource() == null || root.eResource().getURI() == null)
    	baseName = getClass().getSimpleName();
    else
    	baseName = root.eResource().getURI().trimFileExtension().lastSegment();
  }
  
  protected double significanceLevel = 0.01;
  
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
  
  public void printSearchInfo(final TransformationSearchOrchestration orchestration) {
    System.out.println("-------------------------------------------------------");
    System.out.println("Search");
    System.out.println("-------------------------------------------------------");
    System.out.println("InputModel:      " + INITIAL_MODEL);
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
  
  public void performSearch(final String initialGraph, final int solutionLength) {
    TransformationSearchOrchestration orchestration = createOrchestration(initialGraph, solutionLength);
    deriveBaseName(orchestration);
    printSearchInfo(orchestration);
    SearchExperiment<TransformationSolution> experiment = createExperiment(orchestration);
    experiment.run();
    System.out.println("-------------------------------------------------------");
    System.out.println("Analysis");
    System.out.println("-------------------------------------------------------");
    performAnalysis(experiment);
    System.out.println("-------------------------------------------------------");
    System.out.println("Results");
    System.out.println("-------------------------------------------------------");
    handleResults(experiment);
  }
  
  public static void initialization() {
    BasicPackage.eINSTANCE.eClass();
    System.out.println("Search started.");
  }
  
  public static void finalization() {
    System.out.println("Search finished.");
  }
  
  

  
  public static void main(final String... args) {
	  if(args.length > 0){
		  INITIAL_MODEL =  args[0];
	  }
	  if(args.length>1){
		  nrRuns = Integer.parseInt(args[1]);
	  }
	  
    initialization();
    
    searchTypeGraph search = new searchTypeGraph();
    search.initializeFitnessFunctions();
    search.initializeConstraints();
    search.performSearch(INITIAL_MODEL, SOLUTION_LENGTH);
    finalization();
  }
}
