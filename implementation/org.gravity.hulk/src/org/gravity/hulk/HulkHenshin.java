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

import carisma.check.variability.VerificationEngine;

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

	public static void main(String[] args) throws IOException {
		final HenshinResourceSet resourceHenshinSet = new HenshinResourceSet();
		resourceHenshinSet.getPackageRegistry().put(AnnotationsPackage.eNS_URI, AnnotationsPackage.eINSTANCE);
		resourceHenshinSet.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		resourceHenshinSet.getPackageRegistry().put(AntipatternPackage.eNS_URI, AntipatternPackage.eINSTANCE);
		resourceHenshinSet.getPackageRegistry().put(SplPackage.eNS_URI, SplPackage.eINSTANCE);

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		final String model = "instances/TestSPL.xmi";
		final Resource currentModel = resourceSet.getResource(URI.createURI(model), true);
		
		//TreeIterator
		TreeIterator<EObject> tree = currentModel.getAllContents();

		while(tree.hasNext()) {
			EList<TAnnotation> pc;
			Map<EObject, String> pcs;
			EObject e = (EObject) tree.next();
			if(e instanceof TAnnotatable) {
				pc = ((TAnnotatable) e).getTAnnotation(SplPackage.eINSTANCE.getTPresenceCondition());
				if(pc==null){
					for (Map.Entry<EObject, String> entry : pcs.entrySet()) {
					    pcs.put(entry.getKey(), (String) entry.getValue());
					 }
				}else {
					throw new Exception("More than one TPresenceCondition");
				}
			}
	}

	final String featureModel = "instances/model.txt";

	final MultiVarEGraph graph = new MultiVarEGraph(currentModel.getContents(), pcs, featureModel);

	final MultiVarEngine engine = new MultiVarEngine();engine.getScriptEngine().put("HulkHenshin",new HulkHenshin());
	final HulkHenshin hulk = new HulkHenshin();hulk.loadRules(resourceSet,new File("rules"));hulk.execute(engine,graph,hulk.getRule(AntipatternPackage.eINSTANCE.getHSpaghettiCodeAntiPattern()));

	try(
	OutputStream outputStream = Files.newOutputStream(Paths.get(model.replace(".xmi", ".trg.xmi"))))
	{
		graph.getRoots().get(0).eResource().save(outputStream, Collections.emptyMap());
	}LOGGER.info("done");
	}

	public static boolean ocl_LargeClass(double oclLimit, EObject eObject) {
		
		final String ocl = "context TClass inv: self.defines -> size() >= " + oclLimit;
		
		VerificationEngine veri = new VerificationEngine(eObject, featureModel);
		boolean test = veri.validateOCLWellFormednessRule(ocl, eObject);
		System.out.println("----------------------------" + test + "----------------------------");
		return true;
	}

	public static boolean ocl_IFU(double oclLimit, EObject eObject) {
		
//		final String ocl = "context TClass inv: self.defines->select(t | t.accessedBy->size <> 0)->size() <= " + oclLimit;
//		
//		VerificationEngine veri = new VerificationEngine(eObject, null);
//		boolean test = veri.validateOCLWellFormednessRule(ocl, eObject);
//		System.out.println("----------------------------" + test + "----------------------------");
		return true;
	}

	public static boolean ocl_AvgParam(double oclLimit, EObject eObject) {
		
//		final String ocl = "context TClass inv: self.signature->size() <= " + oclLimit;
//		
//		VerificationEngine veri = new VerificationEngine(eObject, null);
//		boolean test = veri.validateOCLWellFormednessRule(ocl, eObject);
//		System.out.println("----------------------------" + test + "----------------------------");
		return true;
	}

	public static boolean ocl_DIT(double oclLimit, EObject eObject) {
		
		//IOCLHelper helper = HelperUtil.createOCLHelper();
		//helper.define("getChilds(c : TClass) : Set(TClass) = r.childs->collect(t|getChilds(t))->asSet()->union(r.childs) ");
		
		final String ocl = "context TClass inv: self.parentClass->closure(childClasses)->size() <= " + oclLimit;
		
		VerificationEngine veri = new VerificationEngine(eObject, null);
		boolean test = veri.validateOCLWellFormednessRule(ocl, eObject);
		System.out.println("----------------------------" + test + "----------------------------");
		return test;
	}

	public static boolean ocl_ChildClasses(double oclLimit, EObject eObject) {
		
//		final String ocl = "context TClass inv: self.childClasses->size() >= " + oclLimit;
//		
//		VerificationEngine veri = new VerificationEngine(eObject, null);
//		boolean test = veri.validateOCLWellFormednessRule(ocl, eObject);
//		System.out.println("----------------------------" + test + "----------------------------");
		return true;
	}

	private Rule getRule(EClass type) {
		return this.creates.get(type);
	}

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
					throw new IllegalStateException(
							"The annotation \"" + create.getName() + "\" is created by multiple rules");
				}
			}
		}
		return rules;
	}

	private void execute(MultiVarEngine engine, EGraphImpl graph, Rule rule) {
		final Set<EClass> requires = getRequires(rule);
		if (!requires.isEmpty()) {
			System.out.println("Execure requirements of rule: " + rule.getName());
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