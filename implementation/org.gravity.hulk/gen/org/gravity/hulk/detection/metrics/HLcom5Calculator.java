/**
 */
package org.gravity.hulk.detection.metrics;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldUniqueAccessMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfFieldsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric;

import org.gravity.hulk.detection.HClassBasedMetricCalculator;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HLcom5 Calculator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.detection.metrics.MetricsPackage#getHLcom5Calculator()
 * @model
 * @generated
 */
public interface HLcom5Calculator extends HClassBasedMetricCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	HMetric calculateMetric(TClass tClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double calculateValue(TClass tClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double CalculateLcom5Value(HNumberOfFieldsMetric nof, HNumberOfMethodsMetric nom,
			HLocalFieldUniqueAccessMetric lfa);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HLcom5Calculator
