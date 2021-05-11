package org.gravity.goblin.fitness;

import org.gravity.typegraph.basic.TypeGraph;

public class CriticalClassRatioCalculator extends MetricCalculator {

	@Override
	public double calculate(final TypeGraph graph) {
		return org.gravity.security.analysis.CriticalClassRatioCalculator.calculate(graph);
	}
}
