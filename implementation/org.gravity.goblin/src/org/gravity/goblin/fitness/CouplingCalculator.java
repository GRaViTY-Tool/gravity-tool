package org.gravity.goblin.fitness;

import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TypeGraph;

public class CouplingCalculator extends MetricCalculator {

	@Override
	public double calculate(TypeGraph graph) {
		// total
		return calculate(MetricsPackage.eINSTANCE.getHTotalCouplingMetric(), graph);

		// efferent
		// return calculate(HEfferentCouplingCalculator.class, graph);

		// afferent
		// return calculate(HAfferentCouplingCalculator.class, graph);
	}
}
