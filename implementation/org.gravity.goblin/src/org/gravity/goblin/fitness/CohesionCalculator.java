package org.gravity.goblin.fitness;

import org.gravity.hulk.HulkAPI.AntiPatternNames;
import org.gravity.typegraph.basic.TypeGraph;

public class CohesionCalculator extends MetricCalculator{

	@Override
	public double calculate(final TypeGraph graph) {
		return calculate(AntiPatternNames.LCOM5, graph);
	}

}
