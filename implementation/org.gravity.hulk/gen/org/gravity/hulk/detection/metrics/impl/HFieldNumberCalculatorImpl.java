/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HNumberOfFieldsMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HFieldNumberCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HField Number Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HFieldNumberCalculatorImpl extends HClassBasedMetricCalculatorImpl implements HFieldNumberCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HFieldNumberCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HFIELD_NUMBER_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HFieldNumberCalculatorImpl
				.pattern_HFieldNumberCalculator_0_1_ActivityNode18_blackBB(tClass, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
					+ "[this] = " + this + ".");
		}
		Object[] result1_green = HFieldNumberCalculatorImpl
				.pattern_HFieldNumberCalculator_0_1_ActivityNode18_greenBBF(tClass, this);
		HNumberOfFieldsMetric metric = (HNumberOfFieldsMetric) result1_green[2];

		return HFieldNumberCalculatorImpl.pattern_HFieldNumberCalculator_0_2_expressionFB(metric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(TClass tClass) {
		// [user code injected with eMoflon]

		int i = 0;
		for (TMember m : tClass.getDefines()) {
			if (m instanceof TFieldDefinition) {
				i++;
			}
		}
		return i;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HFIELD_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HFIELD_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HFieldNumberCalculator_0_1_ActivityNode18_blackBB(TClass tClass,
			HFieldNumberCalculator _this) {
		return new Object[] { tClass, _this };
	}

	public static final Object[] pattern_HFieldNumberCalculator_0_1_ActivityNode18_greenBBF(TClass tClass,
			HFieldNumberCalculator _this) {
		HNumberOfFieldsMetric metric = MetricsFactory.eINSTANCE.createHNumberOfFieldsMetric();
		double _localVariable_0 = _this.calculateValue(tClass);
		_this.getHAnnotation().add(metric);
		metric.setTAnnotated(tClass);
		double metric_value_prime = Double.valueOf(_localVariable_0);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { tClass, _this, metric };
	}

	public static final HMetric pattern_HFieldNumberCalculator_0_2_expressionFB(HNumberOfFieldsMetric metric) {
		HMetric _result = metric;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Number of fields";
	}

	// [user code injected with eMoflon] -->
} //HFieldNumberCalculatorImpl
