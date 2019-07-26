package org.emoflon.ibex.tgg.run.modisco;

import java.io.IOException;

import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

/**
 * Generated by eMoflon::IBeX.
 * 
 * Do not edit this class. It is automatically generated and is kept in sync
 * with the imports in your Schema.tgg file.
 */
public class _SchemaBasedAutoRegistration {
	
	public static void register(OperationalStrategy strategy) throws IOException {
		strategy.loadAndRegisterMetamodel("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java");
		strategy.loadAndRegisterMetamodel("http://www.gravity.org/modisco");
		strategy.loadAndRegisterMetamodel("http://www.gravity.org/typegraph/basic");
	}
	
}