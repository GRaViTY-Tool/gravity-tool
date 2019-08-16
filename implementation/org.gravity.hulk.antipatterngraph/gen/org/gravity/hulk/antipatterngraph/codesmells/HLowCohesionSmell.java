/**
 */
package org.gravity.hulk.antipatterngraph.codesmells;

import org.gravity.hulk.antipatterngraph.HCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HLow Cohesion Smell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell#getHLCOM5CustomMetric <em>HLCOM5 Custom Metric</em>}</li>
 * </ul>
 *
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHLowCohesionSmell()
 * @model
 * @generated
 */
public interface HLowCohesionSmell extends HCodeSmell {
	/**
	 * Returns the value of the '<em><b>HLCOM5 Custom Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HLCOM5 Custom Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HLCOM5 Custom Metric</em>' reference.
	 * @see #setHLCOM5CustomMetric(HLCOM5Metric)
	 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHLowCohesionSmell_HLCOM5CustomMetric()
	 * @model
	 * @generated
	 */
	HLCOM5Metric getHLCOM5CustomMetric();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell#getHLCOM5CustomMetric <em>HLCOM5 Custom Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HLCOM5 Custom Metric</em>' reference.
	 * @see #getHLCOM5CustomMetric()
	 * @generated
	 */
	void setHLCOM5CustomMetric(HLCOM5Metric value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HLowCohesionSmell
