package momotFiles;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.AssignmentImpl;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.impl.ModuleImpl;
import org.eclipse.emf.henshin.model.impl.RuleImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameterList;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.impl.TMethodDefinitionImpl;
import org.osgi.framework.Bundle;

import ConstraintCalculators.AccessConstraintCalculator;
import ConstraintCalculators.InheritanceConstraintCalculator;
import ConstraintCalculators.VisibilityConstraintCalculator;
import FitnessCalculators.CouplingCalculator;
import at.ac.tuwien.big.moea.problem.solution.variable.IPlaceholderVariable;
import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.problem.solution.variable.ITransformationVariable;
import at.ac.tuwien.big.momot.problem.solution.variable.RuleApplicationVariable;
import at.ac.tuwien.big.momot.problem.solution.variable.UnitApplicationVariable;
import at.ac.tuwien.big.momot.problem.unit.parameter.comparator.DefaultEObjectEqualityHelper;
import at.ac.tuwien.big.momot.problem.unit.parameter.comparator.IEObjectEqualityHelper;
import at.ac.tuwien.big.momot.search.solution.executor.SearchHelper;
import at.ac.tuwien.big.momot.util.MomotUtil;

public class HenshinExecutor {


	HenshinResourceSet resourceSet;
	Module module;
	EGraph graph;
	String modulePath = "transformations/MoveMethod.henshin";
	

	public HashMap<String, Object> getMoveMethodParameter(TypeGraph pg, String methodName, String sourceClassName, String targetClassName){
		HashMap<String, Object> parameters = new HashMap<String, Object>();
		
		
		TClass sourceClass = pg.getClass(sourceClassName);
		TClass targetClass=  pg.getClass(targetClassName);
		TMethodSignature methodSig = sourceClass.getMethodSignature(methodName);

		

		parameters.put("methodSig", methodSig);
		parameters.put("targetClass", targetClass);
		parameters.put("sourceClass", sourceClass);
		return parameters;
	}
	
	public void initialize(EGraph egraph){
		// Create a resource set with a base directory:
		graph = egraph;
		resourceSet = new HenshinResourceSet("");
				
		
		Resource r = resourceSet.createResource(URI.createURI(""));
		Bundle bundle = Platform.getBundle("momot.movemethod.demo");
		URL res = bundle.getResource(modulePath);
		try(InputStream s = res.openStream()){
			r.load(s, Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		module = (Module) r.getContents().get(0);
	}
	
	
	private class  unitapp extends UnitApplicationVariable{

		public unitapp(Engine engine, EGraph graph, Unit unit, Assignment assignment) {
			super(engine, graph, unit, assignment);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public boolean execute(ApplicationMonitor mon) {
			// TODO Auto-generated method stub
			return super.doExecute(mon);
		}
		
	}
	
	
	

	
	public void run(){
		//register
		BasicPackage.eINSTANCE.eClass();
		
		
		boolean saveResult = true;
		
		//String graphPath  = "input/dyn1_Test";
		//String graphPath  = "input/03_JUnit3.8.2";
		String graphPath       = "input/SecureMailApp";
		//String graphPath       = "input/00_JavaSolitaire1.3";
		//String graphPath       = "input/01_QuickUML2001";
		//String graphPath = "input/02_JsciCalc2.1.0";
		//String graphPath       = "input/03_JUnit3.8.2";
		//String graphPath       = "input/04_Gantt1.10.2";	
		//String graphPath       = "input/05_Nutch0.9";
		//String graphPath       = "input/06_Lucene1.4.3";
		//String graphPath       = "input/07_log4j1.2.17";
		//String graphPath       = "input/08_JHotDraw7.6";
		//String graphPath       = "input/09_JEdit4.0";
		//String graphPath       = "input/10_PMD3.9";
		//String graphPath       = "input/11_JTransform3.1";
		//String graphPath       = "input/12_iTrust21.0";
			
		
		resourceSet = new HenshinResourceSet("");
		module = resourceSet.getModule(modulePath);
		graph = new EGraphImpl(resourceSet.getResource(graphPath+".xmi"));
		// Load the module:
		//module = resourceSet.getModule(modulePath+".henshin", false);
		
	
		TypeGraph pg = (TypeGraph)graph.getRoots().get(0);
		double fitness = new CouplingCalculator().calculate(graph);
		double violations = new VisibilityConstraintCalculator().calculate(pg);
		//violations += new InheritanceConstraintCalculator().calculate(pg);
		
		
		
		
		String sourceClass= "example.mailapp.SecureMailApp";
		String targetClass = "example.mailapp.Contact";
		String method= "encryptMessage(String, Contact):String";

		
				
		
		
		//HashMap<String, Object> parameters = new HashMap<String, Object>();
	
		//parameters.put("firstClass", pg.getClass(sourceClass));
		//parameters.put("secondClass", pg.getClass(targetClass));
		
		//boolean success = executeUnit("libCheck", parameters);
		

		HashMap<String, Object> parameters = getMoveMethodParameter(pg, method, sourceClass, targetClass);
		//boolean success = executeMain(parameters);
		boolean success = executeMoveMethod(parameters);
		//HashMap<String, Object> parameters = getDynParameter("n()", "dyn1_Test.B", (TypeGraph)graph.getRoots().get(0));
		//boolean success = executeDyn(parameters);
		
		// Saving the result:
		fitness = new CouplingCalculator().calculate(graph);
		if (saveResult) {
			resourceSet.saveEObject(graph.getRoots().get(0), graphPath+"_result.xmi");
		}
		
	}
	

	   protected boolean equals(final EObject left, final EObject right, TransformationSearchOrchestration orchestration) {
	      IEObjectEqualityHelper helper = orchestration.getEqualityHelper();
	      if(helper == null) {
	         helper = new DefaultEObjectEqualityHelper();
	      }
	      return helper.equals(left, right);
	   }
	
	   protected void adapt(final ITransformationVariable variable, final EGraph newGraph, TransformationSearchOrchestration orchestration) {
		      if(variable instanceof IPlaceholderVariable) {
		         return;
		      }

		      for(final Parameter param : variable.getUnit().getParameters()) {
		         final Object paramValue = variable.getParameterValue(param);
		         if(paramValue instanceof EObject) {
		            final EObject valueInOldGraph = (EObject) paramValue;
		            for(final EObject valueInNewGraph : newGraph.getDomain(valueInOldGraph.eClass(), true)) {
		               if(equals(valueInNewGraph, valueInOldGraph, orchestration)) {
		                  variable.setParameterValue(param, valueInNewGraph);
		                  break;
		               }
		            }
		         }
		      }
		      variable.setEGraph(newGraph);
		   }
	
	public static void main(String[] args) {
		
		double result = Double.POSITIVE_INFINITY - Double.POSITIVE_INFINITY;
		
		new HenshinExecutor().run();
		
	}
	
	public HashMap<String, Object> getDynParameter(String methodName, String sourceClassName, TypeGraph graph){
		HashMap<String, Object> parameters = new HashMap<String, Object>();
		TClass sourceClass= graph.getClass(sourceClassName);
		TMethodSignature methodSig = sourceClass.getMethodSignature(methodName);
		parameters.put("methodSig", methodSig);
		parameters.put("sourceClass", sourceClass);
		return parameters;
	}

	public boolean executeDyn(HashMap<String, Object> parameters){
		return executeUnit("dynMoveMethod", parameters);
	}

	
	public boolean executeMain(HashMap<String, Object> parameters){
		return executeUnit("MoveMethodMain", parameters);
	}
	
	public boolean executeMoveMethod(HashMap<String, Object> parameters){
		return executeUnit("MoveMethod", parameters);
	}
	
	
	public boolean executeCheckPreconditions(HashMap<String, Object> parameters){
		return executeUnit("checkPreconditions", parameters);
	}
	
	public boolean executepreconditions(HashMap<String, Object> parameters){
		return executeUnit("preconditions", parameters);
	}
	
	public boolean executeUnit(String unitName, Map<String, Object> parameters ){
		// Create an engine and a rule application:
		Engine engine = new EngineImpl();
		UnitApplication unit = new UnitApplicationImpl(engine);
		unit.setEGraph(graph);
		
		// Creating unit 
		unit.setUnit(module.getUnit(unitName));
		
		for(String key: parameters.keySet()){
			unit.setParameterValue(key, parameters.get(key));
		}
		return unit.execute(null);
		

	}
}
