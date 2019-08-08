package org.gravity.goblin.fitness;

import org.eclipse.emf.common.util.EList;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotation;

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
	public double calculate(TypeGraph pg) {
		if (pg == null) {
			throw new IllegalStateException("PG not found!");
		}

		EList<TAnnotation> metrics = pg.getTAnnotation(MetricsPackage.eINSTANCE.getHTotalVisibilityMetric());
		if(metrics.size() != 1) {
			throw new IllegalStateException("Unexpected number of metrics");
		}
		
		return ((HMetric) metrics.get(0)).getValue();
	}

}
