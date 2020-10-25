/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved.
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.gravity.hulk;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.model.Action.Type;
import org.eclipse.emf.henshin.model.AttributeCondition;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.variability.multi.MultiVarEGraph;
import org.eclipse.emf.henshin.variability.multi.MultiVarEngine;
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;
import org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.security.annotations.AnnotationsPackage;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.spl.SplPackage;
import org.gravity.typegraph.spl.TPresenceCondition;
import org.prop4j.NodeWriter;

import carisma.check.variability.VerificationEngine;
import de.ovgu.featureide.fm.core.analysis.cnf.CNFCreator;
import de.ovgu.featureide.fm.core.analysis.cnf.Nodes;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.init.FMCoreLibrary;
import de.ovgu.featureide.fm.core.io.manager.FeatureModelManager;

public class HulkHenshin {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(HulkHenshin.class);

	private static final String THRESHOLD = "threshold";
	private HashMap<EClass, Rule> creates;
	private HashSet<Rule> executed;

	public HulkHenshin() {

	}

	public static void main(String[] args) throws Exception {
		final HenshinResourceSet resourceHenshinSet = new HenshinResourceSet();
		resourceHenshinSet.getPackageRegistry().put(AnnotationsPackage.eNS_URI, AnnotationsPackage.eINSTANCE);
		resourceHenshinSet.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		resourceHenshinSet.getPackageRegistry().put(AntipatternPackage.eNS_URI, AntipatternPackage.eINSTANCE);
		resourceHenshinSet.getPackageRegistry().put(SplPackage.eNS_URI, SplPackage.eINSTANCE);

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		final String model = "instances/Test.xmi";
		final Resource currentModel = resourceSet.getResource(URI.createURI(model), true);

		TreeIterator<EObject> tree = currentModel.getAllContents();
		Map<EObject, String> pcs = new HashMap<>();

		while (tree.hasNext()) {
			EObject eObject = (EObject) tree.next();
			EList<TAnnotation> pcEObjectList;
			if (eObject instanceof TAnnotatable) {
				pcEObjectList = ((TAnnotatable) eObject).getTAnnotation(SplPackage.eINSTANCE.getTPresenceCondition());
				pcEObjectList.stream().forEach(pcEObject -> {
					final String pc = ((TPresenceCondition) pcEObject).getPc();
					if (pcEObjectList.size() <= 1) {
						if (pcEObjectList.size() != 0) {
							pcs.put(eObject, pc);
						}
					} else {
						throw new RuntimeException("More than one TPresenceCondition detected.");
					}
				});
			}
		}
		IFeatureModel fm = addFeatureModel();
		String fmCNFString = "";
		if (fm != null) {
			// FeatureModelFormula formula = new FeatureModelFormula(fm);
			// Configuration configuration = new Configuration(formula);
			fmCNFString = writeCNF(fm);
		}

		final MultiVarEGraph graph = new MultiVarEGraph(currentModel.getContents(), pcs, fmCNFString);

		final MultiVarEngine engine = new MultiVarEngine();
		engine.getScriptEngine().put("HulkHenshin", new HulkHenshin());
		final HulkHenshin hulk = new HulkHenshin();
		hulk.loadRules(resourceHenshinSet, new File("rules"));
		hulk.execute(engine, graph, hulk.getRule(AntipatternPackage.eINSTANCE.getHSpaghettiCodeAntiPattern()));

		try (OutputStream outputStream = Files.newOutputStream(Paths.get(model.replace(".xmi", ".trg.xmi")))) {
			graph.getRoots().get(0).eResource().save(outputStream, Collections.emptyMap());
		}
		LOGGER.info("done");

		// Log Anti-Patterns and Code Smells
		final String targetModel = "instances/Test.trg.xmi";
		final Resource currentTargetModel = resourceSet.getResource(URI.createURI(targetModel), true);

		logAntiPattern(currentTargetModel);
	}

	public static String writeCNF(IFeatureModel featureModel) {
		final org.prop4j.Node nodes = Nodes.convert(CNFCreator.createNodes(featureModel));
		final StringBuilder cnf = new StringBuilder();
		// Textual Symbols:
		cnf.append(nodes.toString(NodeWriter.textualSymbols));

		// Short Symbols
		// cnf.append(nodes.toString(NodeWriter.shortSymbols));
		return cnf.toString();
	}

	public static void logAntiPattern(Resource resource) {

		TreeIterator<EObject> tree = resource.getAllContents();

		while (tree.hasNext()) {
			EObject eObject = (EObject) tree.next();
			List<TAnnotation> pcEObjectList;

			if (eObject instanceof TAnnotatable) {
				pcEObjectList = ((TAnnotatable) eObject).getTAnnotation(AntipatternPackage.eINSTANCE.getHSpaghettiCodeAntiPattern());
				
				//System.out.println(pcEObjectList);
				pcEObjectList.removeAll(Collections.singleton(""));
				
				List<Map<EObject, EObject>> result = pcEObjectList.stream().distinct().map(pcEObject -> {
							EObject annotatedObject = pcEObject.getTAnnotated();
							Map<EObject, EObject> tempMap = new HashMap<>();
							tempMap.put(pcEObject, annotatedObject);
							
							return tempMap;
						}).collect(Collectors.toList());
				System.out.println(result);
			}
		}
	}

	public static IFeatureModel addFeatureModel() {
		// Feature Model
		Path featureModelPath = Paths
				.get("/Users/gerwi/git/gravity-tool/implementation/org.gravity.hulk/model/model.xml");
		FMCoreLibrary.getInstance().install();
		IFeatureModel fm = FeatureModelManager.load(featureModelPath);

		return fm;
	}

	public static boolean ocl_LargeClass(double oclLimit, EObject eObject) {

		IFeatureModel fm = addFeatureModel();
		final String ocl = "context TClass inv: self.defines -> size() >= " + oclLimit;
		return new VerificationEngine(eObject, fm).validateOCLWellFormednessRule(ocl, eObject);
		// return false;
	}

	public static boolean ocl_FieldAccess(double oclLimit, EObject eObject) {

		 IFeatureModel fm = addFeatureModel();
		 final String ocl = "context TClass inv: self.defines->select(t | t.accessedBy->size <> 0)->size() >=" + oclLimit;
		 return new VerificationEngine(eObject, fm).validateOCLWellFormednessRule(ocl,
		 eObject);
	}

	public static boolean ocl_MethodAccess(double oclLimit, EObject eObject) {

		IFeatureModel fm = addFeatureModel();
		final String ocl = "context TClass inv: self.defines->select(t:TMethodDefinition | t.accessedBy->size <> 0)->size() >= " + oclLimit;
		return new VerificationEngine(eObject, fm).validateOCLWellFormednessRule(ocl, eObject);
		// return false;
	}

	public static boolean ocl_AvgParam(double oclLimit, EObject eObject) {

		IFeatureModel fm = addFeatureModel();
		final String ocl = "context TClass inv: self.defines->select(t:TMethodDefinition | t.signature->size() <> 0)->size() >= " + oclLimit;
		return new VerificationEngine(eObject, fm).validateOCLWellFormednessRule(ocl, eObject);
		// return false;
	}

	public static boolean ocl_ChildClasses(double oclLimit, EObject eObject) {

		IFeatureModel fm = addFeatureModel();
		final String ocl = "context TClass inv: self.childClasses->size() >= " + oclLimit;
		return new VerificationEngine(eObject, fm).validateOCLWellFormednessRule(ocl, eObject);
		// return false;
	}

	public static boolean ocl_DIT(double oclLimit, EObject eObject) {

		// IOCLHelper helper = HelperUtil.createOCLHelper();
		// helper.define("getChilds(c : TClass) : Set(TClass) =
		// r.childs->collect(t|getChilds(t))->asSet()->union(r.childs) ");

		// final String ocl = "context TClass inv:
		// self.parentClass->closure(childClasses)->size() <= " + oclLimit;
		// return new VerificationEngine(eObject).validateOCLWellFormednessRule(ocl,
		// eObject);
		return false;
	}

	private Rule getRule(EClass type) {
		return this.creates.get(type);
	}

	@SuppressWarnings("unused")
	private void executeAllRules(HenshinResourceSet set, MultiVarEngine engine, EGraphImpl graph, File folder)
			throws IOException {
		final Set<Rule> rules = loadRules(set, folder);
		for (final Rule rule : rules) {
			if (!this.executed.contains(rule)) {
				execute(engine, graph, rule);
			}
		}
	}

	/**
	 * Loads the rules from the folder into the resource set
	 *
	 * @param set    The resource set
	 * @param folder The folder containing rules
	 * @return The loaded rules
	 * @throws IOException If an I/O error occurred while searching the folder
	 */
	private Set<Rule> loadRules(HenshinResourceSet set, File folder) throws IOException {
		final Set<Rule> rules = new HashSet<>();
		final ExtensionFileVisitor visitor = new ExtensionFileVisitor(".henshin");
		Files.walkFileTree(folder.toPath(), visitor);
		for (final Path ruleFile : visitor.getFiles()) {
			final Module module = set.getModule(ruleFile.toAbsolutePath().toString(), false);
			rules.addAll(module.getAllRules());
		}

		this.creates = new HashMap<>();
		this.executed = new HashSet<>();
		for (final Rule rule : rules) {
			for (final EClass create : getCreates(rule)) {
				if (this.creates.put(create, rule) != null) {

				}
			}
		}
		return rules;
	}

	private void execute(MultiVarEngine engine, EGraphImpl graph, Rule rule) {
		final Set<EClass> requires = getRequires(rule);
		if (!requires.isEmpty()) {
			System.out.println("Execute requirements of rule: " + rule.getName());
			System.out.println(requires.parallelStream().map(ENamedElement::getName).collect(Collectors.joining(", ")));
		}
		for (final EClass requirement : requires) {
			final Rule requiredRule = this.creates.get(requirement);
			if (requiredRule == null) {
				throw new IllegalStateException(
						"No rule for creating the annotation \"" + requirement.getName() + "\" has been loaded");
			}
			if (!this.executed.contains(requiredRule)) {
				execute(engine, graph, requiredRule);
			}
		}

		LOGGER.info("Execute rule: " + rule.getName());
		final Parameter threshold = rule.getParameter(THRESHOLD);
		double thresholdValue = -1;
		if (threshold != null) {
			thresholdValue = getThresholdValue(threshold, engine, rule, graph);
		}
		final Iterable<Match> matches = engine.findMatches(rule, graph, null);
		int i = 0;
		for (final Match match : matches) {
			if (threshold != null) {
				match.setParameterValue(threshold, thresholdValue);
			}
			if (!engine.findMatches(rule, graph, match).iterator().hasNext()) {
				continue;
			}
			final boolean success = new RuleApplicationImpl(engine, graph, rule, match).execute(null);
			if (!success) {
				LOGGER.error("Error: " + match);
			} else {
				i++;
			}
		}
		this.executed.add(rule);
		LOGGER.info("Applications=" + i);
	}

	protected static Set<EClass> getCreates(Rule rule) {
		final Set<EClass> creates = new HashSet<>();
		final TreeIterator<EObject> eAllContents = rule.eAllContents();
		while (eAllContents.hasNext()) {
			final EObject eObj = eAllContents.next();
			if (eObj instanceof Node) {
				final Node node = (Node) eObj;
				if (node.getAction() != null && node.getAction().getType() == Type.CREATE) {
					final EClass type = node.getType();
					if (AntipatterngraphPackage.eINSTANCE.getHAnnotation().isSuperTypeOf(type)) {
						creates.add(type);
					}
				}

			}
		}
		return creates;
	}

	protected static Set<EClass> getRequires(Rule rule) {
		final Set<EClass> requires = new HashSet<>();
		final TreeIterator<EObject> eAllContents = rule.eAllContents();
		while (eAllContents.hasNext()) {
			final EObject eObj = eAllContents.next();
			if (eObj instanceof Node) {
				final Node node = (Node) eObj;
				if (node.getAction() != null && node.getAction().getType() != Type.CREATE) {
					final EClass type = node.getType();
					if (AntipatterngraphPackage.eINSTANCE.getHAnnotation().isSuperTypeOf(type)) {
						requires.add(type);
					}
				}

			}
		}
		return requires;
	}

	private static double getThresholdValue(Parameter threshold, Engine engine, Rule rule, EGraphImpl graph) {
		final HRelativeValueConstants constant = HRelativeValueConstants.getByName(threshold.getDescription());
		if (constant == null) {
			throw new IllegalStateException("Misspelled relative constant in rule \"" + rule.getName() + "\"");
		}
		final String value = getThresholdCondition(rule);

		final SortedSet<Number> numbers = new TreeSet<>();
		final Iterable<Match> matches = engine.findMatches(rule, graph, null);
		for (final Match match : matches) {
			final ScriptEngine script = engine.getScriptEngine();
			for (final Parameter param : rule.getParameters()) {
				final Object parameterValue = match.getParameterValue(param);
				if (parameterValue != null) {
					script.put(param.getName(), parameterValue);
				}
			}
			try {
				final Object res = script.eval(value);
				if (res instanceof Number) {
					numbers.add((Number) res);
				}
			} catch (final ScriptException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}

		final int size = numbers.size();
		switch (constant) {
		case VERY_LOW:
			return (double) numbers.toArray()[size * 1 / 6];
		case LOW:
			return (double) numbers.toArray()[size * 2 / 6];
		case MEDIUM:
			return (double) numbers.toArray()[size * 3 / 6];
		case HIGH:
			return (double) numbers.toArray()[size * 4 / 6];
		case VERY_HIGH:
			return (double) numbers.toArray()[size * 5 / 6];
		}
		throw new IllegalStateException("Unknown relative constant: " + constant.getName());
	}

	/**
	 * Get the condition of the threshold node
	 *
	 * @param rule The rule
	 * @return The condition
	 */
	private static String getThresholdCondition(Rule rule) {
		for (final AttributeCondition cond : rule.getAttributeConditions()) {
			final String conditionText = cond.getConditionText();
			if (conditionText.contains(THRESHOLD)) {
				return conditionText.replaceAll(THRESHOLD + "\\s*(>|>=|=|<=|<)", "")
						.replaceAll("(>|>=|=|<=|<)\\s*" + THRESHOLD, "");
			}
		}
		throw new IllegalStateException(
				"Didn't found condition containing threshold of rule \"" + rule.getName() + "\"");
	}

}