/**
 */
package org.gravity.hulk.antipatterngraph.metrics;

import org.gravity.hulk.antipatterngraph.HMetric;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HLocal Access Relation Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric#getHLocalFieldAccesses <em>HLocal Field Accesses</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric#getHLocalMethodAccesses <em>HLocal Method Accesses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHLocalAccessRelationMetric()
 * @model
 * @generated
 */
public interface HLocalAccessRelationMetric extends HMetric {
	/**
	 * Returns the value of the '<em><b>HLocal Field Accesses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HLocal Field Accesses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HLocal Field Accesses</em>' reference.
	 * @see #setHLocalFieldAccesses(HLocalFieldAccessesMetric)
	 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHLocalAccessRelationMetric_HLocalFieldAccesses()
	 * @model
	 * @generated
	 */
	HLocalFieldAccessesMetric getHLocalFieldAccesses();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric#getHLocalFieldAccesses <em>HLocal Field Accesses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HLocal Field Accesses</em>' reference.
	 * @see #getHLocalFieldAccesses()
	 * @generated
	 */
	void setHLocalFieldAccesses(HLocalFieldAccessesMetric value);

	/**
	 * Returns the value of the '<em><b>HLocal Method Accesses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HLocal Method Accesses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HLocal Method Accesses</em>' reference.
	 * @see #setHLocalMethodAccesses(HLocalMethodAccessesMetric)
	 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#getHLocalAccessRelationMetric_HLocalMethodAccesses()
	 * @model
	 * @generated
	 */
	HLocalMethodAccessesMetric getHLocalMethodAccesses();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric#getHLocalMethodAccesses <em>HLocal Method Accesses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HLocal Method Accesses</em>' reference.
	 * @see #getHLocalMethodAccesses()
	 * @generated
	 */
	void setHLocalMethodAccesses(HLocalMethodAccessesMetric value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HLocalAccessRelationMetric
