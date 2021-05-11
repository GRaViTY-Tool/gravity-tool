package org.gravity.goblin.fitness;

import org.gravity.hulk.HulkAPI.AntiPatternNames;
import org.gravity.typegraph.basic.TypeGraph;

public class CouplingCalculator extends MetricCalculator {

	@Override
	public double calculate(final TypeGraph graph) {
		// total
		return calculate(AntiPatternNames.TOTAL_COUPLING, graph);

		// efferent
		// return calculate(HEfferentCouplingCalculator.class, graph);

		// afferent
		// return calculate(HAfferentCouplingCalculator.class, graph);
	}
}
