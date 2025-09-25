/**
 */
package org.gravity.hulk.detection;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HClass Based Metric Calculator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.detection.DetectionPackage#getHClassBasedMetricCalculator()
 * @model abstract="true"
 * @generated
 */
public interface HClassBasedMetricCalculator extends HClassBasedCalculator, HMetricCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	HAnnotation calculate(TClass tClass);

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
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HClassBasedMetricCalculator
