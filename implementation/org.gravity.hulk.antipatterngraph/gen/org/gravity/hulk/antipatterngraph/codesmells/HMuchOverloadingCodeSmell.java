/**
 */
package org.gravity.hulk.antipatterngraph.codesmells;

import org.gravity.hulk.antipatterngraph.HCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HMuch Overloading Code Smell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell#getHAverageOverloadingInClassMetric <em>HAverage Overloading In Class Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHMuchOverloadingCodeSmell()
 * @model
 * @generated
 */
public interface HMuchOverloadingCodeSmell extends HCodeSmell {
	/**
	 * Returns the value of the '<em><b>HAverage Overloading In Class Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HAverage Overloading In Class Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HAverage Overloading In Class Metric</em>' reference.
	 * @see #setHAverageOverloadingInClassMetric(HAverageOverloadingInClassMetric)
	 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHMuchOverloadingCodeSmell_HAverageOverloadingInClassMetric()
	 * @model
	 * @generated
	 */
	HAverageOverloadingInClassMetric getHAverageOverloadingInClassMetric();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell#getHAverageOverloadingInClassMetric <em>HAverage Overloading In Class Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HAverage Overloading In Class Metric</em>' reference.
	 * @see #getHAverageOverloadingInClassMetric()
	 * @generated
	 */
	void setHAverageOverloadingInClassMetric(HAverageOverloadingInClassMetric value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HMuchOverloadingCodeSmell
