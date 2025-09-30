/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.util.HashMap;
// [user defined imports] -->

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;
import org.moflon.core.dfs.DFSGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>HAverage Overloading In Class Calculator</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HAverageOverloadingInClassCalculator extends HClassBasedCalculatorImpl implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HAverageOverloadingInClassCalculator(final DFSGraph graph) {
		this.setGraph(graph);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMetric calculate(final TClass tClass) {
		final var metric = MetricsFactory.eINSTANCE.createHAverageOverloadingInClassMetric();
		metric.setTAnnotated(tClass);
		metric.setValue(this.calculateValue(tClass));
		this.getHAnnotation().add(metric);
		return metric;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public double calculateValue(final TClass tClass) {
		this.removeAnnotations(tClass);

		final var methods = new HashMap<TMethod, Integer>();
		final var signatures = tClass.getSignature();
		for (final TSignature sig : signatures) {
			if (sig instanceof final TMethodSignature methodSig) {
				final var method = methodSig.getMethod();
				if (methods.containsKey(method)) {
					methods.put(method, methods.get(method) + 1);
				} else {
					methods.put(method, 1);
				}
			}
		}
		if (methods.isEmpty()) {
			return 0;
		}
		var sum = 0D;
		for (final double value : methods.values()) {
			sum += value;
		}
		return sum / methods.size();

	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Average Overloading";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHAverageOverloadingInClassMetric();
	}

	// [user code injected with eMoflon] -->
} // HAverageOverloadingInClassCalculatorImpl
