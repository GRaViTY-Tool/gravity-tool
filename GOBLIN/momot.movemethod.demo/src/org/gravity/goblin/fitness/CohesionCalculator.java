package org.gravity.goblin.fitness;

import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TypeGraph;

public class CohesionCalculator extends MetricCalculator{

	@Override
	public double calculate(TypeGraph graph) {
		return calculate(MetricsPackage.eINSTANCE.getHLCOM5Metric(), graph);
	}

}
