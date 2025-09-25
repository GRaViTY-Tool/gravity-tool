/**
 */
package org.gravity.hulk.detection.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedMetricCalculator;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HClass Based Metric Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class HClassBasedMetricCalculatorImpl extends HClassBasedCalculatorImpl
		implements HClassBasedMetricCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HClassBasedMetricCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DetectionPackage.Literals.HCLASS_BASED_METRIC_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {
		return calculateMetric(tClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public abstract HMetric calculateMetric(TClass tClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public abstract double calculateValue(TClass tClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE_METRIC__TCLASS:
			return calculateMetric((TClass) arguments.get(0));
		case DetectionPackage.HCLASS_BASED_METRIC_CALCULATOR___CALCULATE_VALUE__TCLASS:
			return calculateValue((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //HClassBasedMetricCalculatorImpl
