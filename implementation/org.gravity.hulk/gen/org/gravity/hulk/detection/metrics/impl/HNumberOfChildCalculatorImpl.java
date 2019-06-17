/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;

import org.gravity.hulk.detection.impl.HClassBasedMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HNumberOfChildCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HNumber Of Child Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HNumberOfChildCalculatorImpl extends HClassBasedMetricCalculatorImpl implements HNumberOfChildCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HNumberOfChildCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HNUMBER_OF_CHILD_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMetric calculateMetric(TClass tClass) {

		Object[] result1_black = HNumberOfChildCalculatorImpl
				.pattern_HNumberOfChildCalculator_0_1_ActivityNode9_blackBB(tClass, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
					+ "[this] = " + this + ".");
		}
		Object[] result1_green = HNumberOfChildCalculatorImpl
				.pattern_HNumberOfChildCalculator_0_1_ActivityNode9_greenBBF(tClass, this);
		HNumberOfChildMetric child = (HNumberOfChildMetric) result1_green[2];

		return HNumberOfChildCalculatorImpl.pattern_HNumberOfChildCalculator_0_2_expressionFB(child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculateValue(TClass tParent) {
		// [user code injected with eMoflon]

		return tParent.getChildClasses().size();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case MetricsPackage.HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HNumberOfChildCalculator_0_1_ActivityNode9_blackBB(TClass tClass,
			HNumberOfChildCalculator _this) {
		return new Object[] { tClass, _this };
	}

	public static final Object[] pattern_HNumberOfChildCalculator_0_1_ActivityNode9_greenBBF(TClass tClass,
			HNumberOfChildCalculator _this) {
		HNumberOfChildMetric child = MetricsFactory.eINSTANCE.createHNumberOfChildMetric();
		double _localVariable_0 = _this.calculateValue(tClass);
		_this.getHAnnotation().add(child);
		child.setTAnnotated(tClass);
		double child_value_prime = Double.valueOf(_localVariable_0);
		child.setValue(Double.valueOf(child_value_prime));
		return new Object[] { tClass, _this, child };
	}

	public static final HMetric pattern_HNumberOfChildCalculator_0_2_expressionFB(HNumberOfChildMetric child) {
		HMetric _result = child;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Number of members";
	}

	// [user code injected with eMoflon] -->
} //HNumberOfChildCalculatorImpl
