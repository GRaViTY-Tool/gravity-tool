/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
// [user defined imports] -->

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;
import org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>HAverage Overloading In Class Calculator</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HAverageOverloadingInClassCalculatorImpl extends HClassBasedMetricCalculatorImpl
implements HAverageOverloadingInClassCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HAverageOverloadingInClassCalculatorImpl() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMetric calculateMetric(final TClass tClass) {
		final var metric = MetricsFactory.eINSTANCE.createHAverageOverloadingInClassMetric();
		metric.setTAnnotated(tClass);
		metric.setValue(calculateValue(tClass));
		getHAnnotation().add(metric);
		return metric;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public double calculateValue(final TClass tClass) {
		removeAnnotations(tClass);

		final var methods = new HashMap<TMethod, Integer>();
		final var signatures = tClass.getSignature();
		for (final TSignature sig : signatures) {
			if (sig instanceof TMethodSignature) {
				final var method = ((TMethodSignature) sig).getMethod();
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
