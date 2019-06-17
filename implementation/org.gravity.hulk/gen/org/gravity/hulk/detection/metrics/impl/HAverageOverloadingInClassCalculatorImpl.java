/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;
import java.util.Hashtable;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAverage Overloading In Class Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HAverageOverloadingInClassCalculatorImpl extends HClassBasedMetricCalculatorImpl
		implements HAverageOverloadingInClassCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HAverageOverloadingInClassCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HAverageOverloadingInClassCalculatorImpl
				.pattern_HAverageOverloadingInClassCalculator_0_1_ActivityNode8_blackBB(this, tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		Object[] result1_green = HAverageOverloadingInClassCalculatorImpl
				.pattern_HAverageOverloadingInClassCalculator_0_1_ActivityNode8_greenBFB(this, tClass);
		HAverageOverloadingInClassMetric metric = (HAverageOverloadingInClassMetric) result1_green[1];

		return HAverageOverloadingInClassCalculatorImpl
				.pattern_HAverageOverloadingInClassCalculator_0_2_expressionFB(metric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(TClass tClass) {
		// [user code injected with eMoflon]

		Hashtable<TMethod, Integer> methods = new Hashtable<TMethod, Integer>();
		EList<TSignature> signatures = tClass.getSignature();
		for (TSignature sig : signatures) {
			if (sig instanceof TMethodSignature) {
				TMethodSignature new_name = (TMethodSignature) sig;
				TMethod method = ((TMethodSignature) sig).getMethod();
				if (methods.containsKey(method)) {
					methods.put(method, methods.get(method) + 1);
				} else {
					methods.put(method, 1);
				}
			}
		}
		if (methods.size() == 0) {
			return 0;
		}
		double sum = 0;
		for (double value : methods.values()) {
			sum += value;
		}
		return sum / methods.size();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HAverageOverloadingInClassCalculator_0_1_ActivityNode8_blackBB(
			HAverageOverloadingInClassCalculator _this, TClass tClass) {
		return new Object[] { _this, tClass };
	}

	public static final Object[] pattern_HAverageOverloadingInClassCalculator_0_1_ActivityNode8_greenBFB(
			HAverageOverloadingInClassCalculator _this, TClass tClass) {
		HAverageOverloadingInClassMetric metric = MetricsFactory.eINSTANCE.createHAverageOverloadingInClassMetric();
		double _localVariable_0 = _this.calculateValue(tClass);
		_this.getHAnnotation().add(metric);
		metric.setTAnnotated(tClass);
		double metric_value_prime = Double.valueOf(_localVariable_0);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { _this, metric, tClass };
	}

	public static final HMetric pattern_HAverageOverloadingInClassCalculator_0_2_expressionFB(
			HAverageOverloadingInClassMetric metric) {
		HMetric _result = metric;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Average Overloading";
	}

	// [user code injected with eMoflon] -->
} //HAverageOverloadingInClassCalculatorImpl
