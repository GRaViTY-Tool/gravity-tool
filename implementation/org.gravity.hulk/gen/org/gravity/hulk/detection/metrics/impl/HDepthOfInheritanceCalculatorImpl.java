/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HDepthOfInheritanceCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HDepth Of Inheritance Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HDepthOfInheritanceCalculatorImpl extends HClassBasedMetricCalculatorImpl
		implements HDepthOfInheritanceCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDepthOfInheritanceCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HDEPTH_OF_INHERITANCE_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HDepthOfInheritanceCalculatorImpl
				.pattern_HDepthOfInheritanceCalculator_0_1_ActivityNode26_blackBB(this, tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		Object[] result1_green = HDepthOfInheritanceCalculatorImpl
				.pattern_HDepthOfInheritanceCalculator_0_1_ActivityNode26_greenBFB(this, tClass);
		HDepthOfInheritanceMetric metric = (HDepthOfInheritanceMetric) result1_green[1];

		return HDepthOfInheritanceCalculatorImpl.pattern_HDepthOfInheritanceCalculator_0_2_expressionFB(metric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(TClass tClass) {
		// [user code injected with eMoflon]

		int depth = 0;
		TClass parent = tClass.getParentClass();
		while (parent != null && !parent.isTLib()) {
			depth++;
			parent = parent.getParentClass();
		}
		return depth;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HDEPTH_OF_INHERITANCE_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HDEPTH_OF_INHERITANCE_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HDepthOfInheritanceCalculator_0_1_ActivityNode26_blackBB(
			HDepthOfInheritanceCalculator _this, TClass tClass) {
		return new Object[] { _this, tClass };
	}

	public static final Object[] pattern_HDepthOfInheritanceCalculator_0_1_ActivityNode26_greenBFB(
			HDepthOfInheritanceCalculator _this, TClass tClass) {
		HDepthOfInheritanceMetric metric = MetricsFactory.eINSTANCE.createHDepthOfInheritanceMetric();
		double _localVariable_0 = _this.calculateValue(tClass);
		_this.getHAnnotation().add(metric);
		metric.setTAnnotated(tClass);
		double metric_value_prime = Double.valueOf(_localVariable_0);
		metric.setValue(Double.valueOf(metric_value_prime));
		return new Object[] { _this, metric, tClass };
	}

	public static final HMetric pattern_HDepthOfInheritanceCalculator_0_2_expressionFB(
			HDepthOfInheritanceMetric metric) {
		HMetric _result = metric;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Depth of Inheritance";
	}

	// [user code injected with eMoflon] -->
} //HDepthOfInheritanceCalculatorImpl
