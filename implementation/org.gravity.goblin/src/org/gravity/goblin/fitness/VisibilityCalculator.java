package org.gravity.goblin.fitness;

import org.gravity.hulk.HulkAPI;
import org.gravity.hulk.HulkAPI.AntiPatternNames;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
import org.gravity.hulk.exceptions.DetectionFailedException;
import org.gravity.typegraph.basic.TypeGraph;

/**
 *
 * A calculator for a simple visibility metric
 *
 * @author sruland
 * @author speldszus
 *
 */
public class VisibilityCalculator extends MetricCalculator {

	@Override
	public double calculate(final TypeGraph pg) {
		if (pg == null) {
			throw new IllegalStateException("PG not found!");
		}
		try {
			HulkAPI.detect(pg, "", AntiPatternNames.TOTAL_METHOD_VISIBILITY);
		} catch (final DetectionFailedException e) {
			return -1;
		}
		final var metrics = pg.getTAnnotation(MetricsPackage.eINSTANCE.getHTotalVisibilityMetric());
		if(metrics.size() != 1) {
			throw new IllegalStateException("Unexpected number of metrics");
		}

		return ((HMetric) metrics.get(0)).getValue();
	}

}
