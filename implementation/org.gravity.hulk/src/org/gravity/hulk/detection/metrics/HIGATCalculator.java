/**
 */
package org.gravity.hulk.detection.metrics;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.detection.HMetricCalculator;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HIGAT Calculator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.detection.metrics.MetricsPackage#getHIGATCalculator()
 * @model
 * @generated
 */
public interface HIGATCalculator extends HMetricCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean detect(HAntiPatternGraph apg);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HIGATCalculator
