package org.gravity.goblin.fitness;

import org.eclipse.emf.common.util.EList;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotation;

public class VisibilityCalculator extends MetricCalculator {

	@Override
	public double calculate(TypeGraph pg) {
		if (pg == null) {
			throw new RuntimeException("PG not found!");
		}

		EList<TAnnotation> metrics = pg.getTAnnotation(MetricsPackage.eINSTANCE.getHTotalVisibilityMetric());
		if(metrics.size() != 1) {
			throw new RuntimeException("Unexpected number of metrics");
		}
		
		return ((HMetric) metrics.get(0)).getValue();
	}

}
