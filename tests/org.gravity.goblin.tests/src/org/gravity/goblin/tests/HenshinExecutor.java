package org.gravity.goblin.tests;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.gravity.goblin.GoblinActivator;
import org.gravity.goblin.constraints.VisibilityConstraintCalculator;
import org.gravity.goblin.fitness.CouplingCalculator;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TypeGraph;
import org.osgi.framework.Bundle;

import at.ac.tuwien.big.moea.problem.solution.variable.IPlaceholderVariable;
import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
import at.ac.tuwien.big.momot.problem.solution.variable.ITransformationVariable;
import at.ac.tuwien.big.momot.problem.unit.parameter.comparator.DefaultEObjectEqualityHelper;
import at.ac.tuwien.big.momot.problem.unit.parameter.comparator.IEObjectEqualityHelper;

public class HenshinExecutor {

	private static final Logger LOGGER = Logger.getLogger(HenshinExecutor.class);

	HenshinResourceSet resourceSet;
	Module module;
	EGraph graph;
	String modulePath = "transformations/MoveMethod.henshin";

	public Map<String, Object> getMoveMethodParameter(TypeGraph pg, String methodName, String sourceClassName,
			String targetClassName) {
		final HashMap<String, Object> parameters = new HashMap<>();

		final TClass sourceClass = pg.getClass(sourceClassName);
		final TClass targetClass = pg.getClass(targetClassName);
		final TMethodSignature methodSig = sourceClass.getTMethodSignature(methodName);

		parameters.put("methodSig", methodSig);
		parameters.put("targetClass", targetClass);
		parameters.put("sourceClass", sourceClass);
		return parameters;
	}

	public void initialize(EGraph egraph) {
		// Create a resource set with a base directory:
		this.graph = egraph;
		this.resourceSet = new HenshinResourceSet("");

		final Resource r = this.resourceSet.createResource(URI.createURI(""));
		final Bundle bundle = Platform.getBundle(GoblinActivator.PLUGIN_ID);
		final URL res = bundle.getResource(this.modulePath);
		try (InputStream s = res.openStream()) {
			r.load(s, Collections.emptyMap());
		} catch (final IOException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
		}
		this.module = (Module) r.getContents().get(0);
	}

	public void run() {
		// register
		BasicPackage.eINSTANCE.eClass();

		final boolean saveResult = true;

		final String graphPath =
				//"input/dyn1_Test";
				//"input/03_JUnit3.8.2";
				"input/SecureMailApp";
		//"input/00_JavaSolitaire1.3";
		//"input/01_QuickUML2001";
		//"input/02_JsciCalc2.1.0";
		//"input/03_JUnit3.8.2";
		//"input/04_Gantt1.10.2";
		//"input/05_Nutch0.9";
		//"input/06_Lucene1.4.3";
		//"input/07_log4j1.2.17";
		//"input/08_JHotDraw7.6";
		//"input/09_JEdit4.0";
		//"input/10_PMD3.9";
		//"input/11_JTransform3.1";
		//"input/12_iTrust21.0";

		this.resourceSet = new HenshinResourceSet("");
		this.module = this.resourceSet.getModule(this.modulePath);
		this.graph = new EGraphImpl(this.resourceSet.getResource(graphPath + ".xmi"));
		// Load the module:
		// module = resourceSet.getModule(modulePath+".henshin", false);

		final TypeGraph pg = (TypeGraph) this.graph.getRoots().get(0);
		double fitness = new CouplingCalculator().calculate(pg);
		final double violations = new VisibilityConstraintCalculator().calculate(pg);
		// violations += new InheritanceConstraintCalculator().calculate(pg);

		final String sourceClass = "example.mailapp.SecureMailApp";
		final String targetClass = "example.mailapp.Contact";
		final String method = "encryptMessage(String, Contact):String";

		// HashMap<String, Object> parameters = new HashMap<String, Object>();

		// parameters.put("firstClass", pg.getClass(sourceClass));
		// parameters.put("secondClass", pg.getClass(targetClass));

		// boolean success = executeUnit("libCheck", parameters);

		final Map<String, Object> parameters = getMoveMethodParameter(pg, method, sourceClass, targetClass);
		// boolean success = executeMain(parameters);
		final boolean success = executeMoveMethod(parameters);
		// HashMap<String, Object> parameters = getDynParameter("n()", "dyn1_Test.B",
		// (TypeGraph)graph.getRoots().get(0));
		// boolean success = executeDyn(parameters);

		// Saving the result:
		fitness = new CouplingCalculator().calculate(pg);
		if (saveResult) {
			this.resourceSet.saveEObject(this.graph.getRoots().get(0), graphPath + "_result.xmi");
		}

	}

	protected boolean equals(final EObject left, final EObject right, TransformationSearchOrchestration orchestration) {
		IEObjectEqualityHelper helper = orchestration.getEqualityHelper();
		if (helper == null) {
			helper = new DefaultEObjectEqualityHelper();
		}
		return helper.equals(left, right);
	}

	protected void adapt(final ITransformationVariable variable, final EGraph newGraph,
			TransformationSearchOrchestration orchestration) {
		if (variable instanceof IPlaceholderVariable) {
			return;
		}

		for (final Parameter param : variable.getUnit().getParameters()) {
			final Object paramValue = variable.getParameterValue(param);
			if (paramValue instanceof EObject) {
				final EObject valueInOldGraph = (EObject) paramValue;
				for (final EObject valueInNewGraph : newGraph.getDomain(valueInOldGraph.eClass(), true)) {
					if (equals(valueInNewGraph, valueInOldGraph, orchestration)) {
						variable.setParameterValue(param, valueInNewGraph);
						break;
					}
				}
			}
		}
		variable.setEGraph(newGraph);
	}

	public static void main(String[] args) {
		new HenshinExecutor().run();
	}

	public Map<String, Object> getDynParameter(String methodName, String sourceClassName, TypeGraph graph) {
		final Map<String, Object> parameters = new HashMap<>();
		final TClass sourceClass = graph.getClass(sourceClassName);
		final TMethodSignature methodSig = sourceClass.getTMethodSignature(methodName);
		parameters.put("methodSig", methodSig);
		parameters.put("sourceClass", sourceClass);
		return parameters;
	}

	public boolean executeDyn(Map<String, Object> parameters) {
		return executeUnit("dynMoveMethod", parameters);
	}

	public boolean executeMain(Map<String, Object> parameters) {
		return executeUnit("MoveMethodMain", parameters);
	}

	public boolean executeMoveMethod(Map<String, Object> parameters) {
		return executeUnit("MoveMethod", parameters);
	}

	public boolean executeCheckPreconditions(Map<String, Object> parameters) {
		return executeUnit("checkPreconditions", parameters);
	}

	public boolean executepreconditions(Map<String, Object> parameters) {
		return executeUnit("preconditions", parameters);
	}

	public boolean executeUnit(String unitName, Map<String, Object> parameters) {
		// Create an engine and a rule application:
		final Engine engine = new EngineImpl();
		final UnitApplication unit = new UnitApplicationImpl(engine);
		unit.setEGraph(this.graph);

		// Creating unit
		unit.setUnit(this.module.getUnit(unitName));

		for ( final Entry<String, Object> entry : parameters.entrySet()) {
			unit.setParameterValue(entry.getKey(), entry.getValue());
		}
		return unit.execute(null);

	}
}