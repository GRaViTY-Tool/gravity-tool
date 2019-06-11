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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage;
import org.gravity.typegraph.basic.BasicPackage;

public class HulkHenshin {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		HenshinResourceSet resourceSet = new HenshinResourceSet();
		resourceSet.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(AntipatternPackage.eNS_URI, AntipatternPackage.eINSTANCE);

		String model = "instances/iTrust21.0.xmi";
		Resource resource = resourceSet.getResource(URI.createURI(model), true);

		Engine engine = new EngineImpl();
		EGraphImpl graph = new EGraphImpl(resource);

		executeAllRules(resourceSet, engine, graph, new File("rules/metrics"));
		executeAllRules(resourceSet, engine, graph, new File("rules/codesmells"));
		graph.getRoots().get(0).eResource().save(new FileOutputStream(model.replace(".xmi", ".trg.xmi")),
				Collections.emptyMap());
		System.out.println("done");
	}

	/**
	 * @param set
	 * @param engine
	 * @param graph
	 * @param folder
	 */
	private static void executeAllRules(HenshinResourceSet set, Engine engine, EGraphImpl graph, File folder) {
		for (File ruleFile : folder.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".henshin");
			}

		})) {
			Module module = set.getModule(ruleFile.getAbsolutePath(), false);

			// Create an engine and a rule application:
			for (Rule rule : module.getAllRules()) {
				System.out.println("Execute rule: " + rule.getName());
				Iterable<Match> matches = engine.findMatches(rule, graph, null);
				for (Match match : matches) {
					boolean success = new RuleApplicationImpl(engine, graph, rule, match).execute(null);
					if (!success) {
						System.out.println("Error: " + match);
					}
				}
			}
		}
	}

}