/**
 */
package org.gravity.hulk.antipatterngraph.codesmells;

import org.gravity.hulk.antipatterngraph.HCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HMany Parameters Code Smell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.HManyParametersCodeSmell#getHAverageParametersMetric <em>HAverage Parameters Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHManyParametersCodeSmell()
 * @model
 * @generated
 */
public interface HManyParametersCodeSmell extends HCodeSmell {
	/**
	 * Returns the value of the '<em><b>HAverage Parameters Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HAverage Parameters Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HAverage Parameters Metric</em>' reference.
	 * @see #setHAverageParametersMetric(HAverageParametersMetric)
	 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHManyParametersCodeSmell_HAverageParametersMetric()
	 * @model
	 * @generated
	 */
	HAverageParametersMetric getHAverageParametersMetric();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.codesmells.HManyParametersCodeSmell#getHAverageParametersMetric <em>HAverage Parameters Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HAverage Parameters Metric</em>' reference.
	 * @see #getHAverageParametersMetric()
	 * @generated
	 */
	void setHAverageParametersMetric(HAverageParametersMetric value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HManyParametersCodeSmell
