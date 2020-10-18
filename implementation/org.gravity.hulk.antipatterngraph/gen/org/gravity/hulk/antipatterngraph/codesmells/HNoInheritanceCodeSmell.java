/**
 */
package org.gravity.hulk.antipatterngraph.codesmells;

import org.gravity.hulk.antipatterngraph.HCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HNo Inheritance Code Smell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.HNoInheritanceCodeSmell#getHChildClassesMetric <em>HChild Classes Metric</em>}</li>
 * </ul>
 *
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHNoInheritanceCodeSmell()
 * @model
 * @generated
 */
public interface HNoInheritanceCodeSmell extends HCodeSmell {
	/**
	 * Returns the value of the '<em><b>HChild Classes Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HChild Classes Metric</em>' reference.
	 * @see #setHChildClassesMetric(HNumberOfChildMetric)
	 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHNoInheritanceCodeSmell_HChildClassesMetric()
	 * @model
	 * @generated
	 */
	HNumberOfChildMetric getHChildClassesMetric();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.codesmells.HNoInheritanceCodeSmell#getHChildClassesMetric <em>HChild Classes Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HChild Classes Metric</em>' reference.
	 * @see #getHChildClassesMetric()
	 * @generated
	 */
	void setHChildClassesMetric(HNumberOfChildMetric value);

} // HNoInheritanceCodeSmell
