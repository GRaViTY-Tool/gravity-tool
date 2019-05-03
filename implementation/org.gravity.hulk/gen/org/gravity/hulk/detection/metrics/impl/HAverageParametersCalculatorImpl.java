/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HAverageParametersCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAverage Parameters Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HAverageParametersCalculatorImpl extends HClassBasedMetricCalculatorImpl
		implements HAverageParametersCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HAverageParametersCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HAVERAGE_PARAMETERS_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HAverageParametersCalculatorImpl
				.pattern_HAverageParametersCalculator_0_1_ActivityNode7_blackBB(tClass, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
					+ "[this] = " + this + ".");
		}
		Object[] result1_green = HAverageParametersCalculatorImpl
				.pattern_HAverageParametersCalculator_0_1_ActivityNode7_greenBFB(tClass, this);
		HAverageParametersMetric metric = (HAverageParametersMetric) result1_green[1];

		return HAverageParametersCalculatorImpl.pattern_HAverageParametersCalculator_0_2_expressionFB(metric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(TClass tClass) {
		// [user code injected with eMoflon]

		double sum = 0;
		int amount = 0;
		for (TSignature sig : tClass.getSignature()) {
			if (sig instanceof TMethodSignature) {
				TMethodSignature method_sig = (TMethodSignature) sig;
				sum += method_sig.getParamList().getEntries().size();
				amount++;
			}
		}
		return sum / amount;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HAVERAGE_PARAMETERS_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HAVERAGE_PARAMETERS_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HAverageParametersCalculator_0_1_ActivityNode7_blackBB(TClass tClass,
			HAverageParametersCalculator _this) {
		return new Object[] { tClass, _this };
	}

	public static final Object[] pattern_HAverageParametersCalculator_0_1_ActivityNode7_greenBFB(TClass tClass,
			HAverageParametersCalculator _this) {
		HAverageParametersMetric metric = MetricsFactory.eINSTANCE.createHAverageParametersMetric();
		double _localVariable_0 = _this.calculateValue(tClass);
		metric.setTAnnotated(tClass);
		_this.getHAnnotation().add(metric);
		double metric_value_prime = Double.valueOf(_localVariable_0);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { tClass, metric, _this };
	}

	public static final HMetric pattern_HAverageParametersCalculator_0_2_expressionFB(HAverageParametersMetric metric) {
		HMetric _result = metric;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Average amount of parameters in classes";
	}

	// [user code injected with eMoflon] -->
} //HAverageParametersCalculatorImpl
