package org.gravity.goblin.fitness;

import org.gravity.hulk.HulkAPI;
import org.gravity.hulk.HulkAPI.AntiPatternNames;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.exceptions.DetectionFailedException;
import org.gravity.typegraph.basic.TypeGraph;

public abstract class MetricCalculator implements IFitnessCalculator {

	public double calculate(final AntiPatternNames id, final TypeGraph graph) {
		try {
			final var metrics = HulkAPI.detect(graph, "", id);

			var value = 0D;
			for (final HAnnotation annotation : metrics) {
				value += ((HMetric) annotation).getValue();
			}
			return value;
		} catch (final DetectionFailedException e) {
			return -1;
		}
	}
}
