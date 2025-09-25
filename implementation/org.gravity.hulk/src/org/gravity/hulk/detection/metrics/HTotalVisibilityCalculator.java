/**
 */
package org.gravity.hulk.detection.metrics;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.detection.HMetricCalculator;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTotal Visibility Calculator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.detection.metrics.MetricsPackage#getHTotalVisibilityCalculator()
 * @model
 * @generated
 */
public interface HTotalVisibilityCalculator extends HMetricCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean detect(HAntiPatternGraph apg);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HTotalVisibilityCalculator
