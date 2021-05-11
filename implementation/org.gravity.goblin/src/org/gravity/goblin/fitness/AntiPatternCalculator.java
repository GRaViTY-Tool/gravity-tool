package org.gravity.goblin.fitness;

import org.gravity.hulk.HulkAPI;
import org.gravity.hulk.HulkAPI.AntiPatternNames;
import org.gravity.hulk.exceptions.DetectionFailedException;
import org.gravity.typegraph.basic.TypeGraph;

public class AntiPatternCalculator extends MetricCalculator {

	@Override
	public double calculate(final TypeGraph graph) {
		try {
			return HulkAPI.detect(graph, "", AntiPatternNames.BLOB).size();
		} catch (final DetectionFailedException e) {
			return -1;
		}
	}
}
