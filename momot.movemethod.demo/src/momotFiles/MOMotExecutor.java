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
import at.ac.tuwien.big.momot.ModuleManager;
import at.ac.tuwien.big.momot.TransformationResultManager;
import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.search.fitness.EGraphMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.search.fitness.IEGraphMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.search.fitness.dimension.AbstractEGraphFitnessDimension;
import at.ac.tuwien.big.momot.search.fitness.dimension.TransformationLengthDimension;
import at.ac.tuwien.big.momot.util.MomotUtil;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TypeGraph;
import org.moeaframework.algorithm.NSGAII;
import org.moeaframework.core.Population;
import org.moeaframework.util.progress.ProgressListener;

import ConstraintCalculators.VisibilityConstraintCalculator;
import FitnessCalculators.CouplingCalculator;


public class MOMotExecutor {
	


	  protected final static String INITIAL_MODEL = "input/MailApp.xmi";
	  
	  protected final static int SOLUTION_LENGTH = 10;
	  
	  protected final String[] modules = new String[] { "transformations/MoveMethod.henshin" };
	  
	  protected final String[] unitsToRemove = new String[] { "MoveMethod::rules::libCheck", "MoveMethod::rules::MoveMethod", "MoveMethod::rules::checkPreconditions", "MoveMethod::rules::dynMoveMethod", "MoveMethod::rules::changeVisibility" };
	  
	  protected final int populationSize = 100;
	  
	  protected final int maxEvaluations = 10000;
	  
	  protected final int nrRuns = 1;
	  
	  protected String baseName;
	  
	  
	  
	  //------Fitness----------------
	  protected IFitnessDimension<TransformationSolution> getCouplingFitness(final TransformationSearchOrchestration orchestration) {
	    return new AbstractEGraphFitnessDimension("Coupling", at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension.FunctionType.Minimum) {
	       @Override
	       protected double internalEvaluate(TransformationSolution solution) {
	          EGraph graph = solution.execute();
	          EObject root = MomotUtil.getRoot(graph);
	          return CouplingCalculator.calculateCoupling(((TypeGraph) root));
	       }
	    };
	  }
	  
	  protected IFitnessDimension<TransformationSolution> getTransformationLengthDimension(final TransformationSearchOrchestration orchestration) {
	    IFitnessDimension<TransformationSolution> dimension = new TransformationLengthDimension();
	    dimension.setName("SolutionLength");
	    dimension.setFunctionType(at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension.FunctionType.Minimum);
	    return dimension;
	  }
	  
	//---------------------------------
	  
	  
	//------Constraints----------------	  
	  protected IFitnessDimension<TransformationSolution> _createConstraint_0(final TransformationSearchOrchestration orchestration) {
	    return new AbstractEGraphFitnessDimension("visibility", at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension.FunctionType.Minimum) {
	       @Override
	       protected double internalEvaluate(TransformationSolution solution) {
	          EGraph graph = solution.execute();
	          EObject root = MomotUtil.getRoot(graph);
	          return VisibilityConstraintCalculator.visiblility(((TypeGraph) root));
	       }
	    };
	  }
	  
	  
	//---------------------------------
	  
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
	    function.addObjective(getCouplingFitness(orchestration));
	    function.addObjective(getTransformationLengthDimension(orchestration));
	    function.addConstraint(_createConstraint_0(orchestration));
	    return function;
	  }
	  
	  protected IRegisteredAlgorithm<NSGAII> _createRegisteredAlgorithm_0(final TransformationSearchOrchestration orchestration, final EvolutionaryAlgorithmFactory<TransformationSolution> moea, final LocalSearchAlgorithmFactory<TransformationSolution> local) {
	    IRegisteredAlgorithm<NSGAII> _createNSGAIII = moea.createNSGAIII();
	    return _createNSGAIII;
	  }
	  
	  protected ProgressListener _createListener_0() {
	    SeedRuntimePrintListener _seedRuntimePrintListener = new SeedRuntimePrintListener();
	    return _seedRuntimePrintListener;
	  }
	  
	  protected EGraph createInputGraph(final String initialGraph, final ModuleManager moduleManager) {
	    EGraph graph = moduleManager.loadGraph(initialGraph);
	    return graph;
	  }
	  
	  protected TransformationSearchOrchestration createOrchestration(final String initialGraph, final int solutionLength) {
	    TransformationSearchOrchestration orchestration = new TransformationSearchOrchestration();
	    ModuleManager moduleManager = createModuleManager();
	    EGraph graph = createInputGraph(initialGraph, moduleManager);
	    orchestration.setModuleManager(moduleManager);
	    orchestration.setProblemGraph(graph);
	    orchestration.setSolutionLength(solutionLength);
	    orchestration.setFitnessFunction(createFitnessFunction(orchestration));
	    
	    EvolutionaryAlgorithmFactory<TransformationSolution> moea = orchestration.createEvolutionaryAlgorithmFactory(populationSize);
	    LocalSearchAlgorithmFactory<TransformationSolution> local = orchestration.createLocalSearchAlgorithmFactory();
	    orchestration.addAlgorithm("NSGAIII", _createRegisteredAlgorithm_0(orchestration, moea, local));
	    
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
	    initialization();
	    MOMotExecutor search = new MOMotExecutor();
	    search.performSearch(INITIAL_MODEL, SOLUTION_LENGTH);
	    finalization();
	  }
	}

