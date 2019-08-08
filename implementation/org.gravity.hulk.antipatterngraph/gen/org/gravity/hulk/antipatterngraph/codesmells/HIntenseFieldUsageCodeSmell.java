/**
 */
package org.gravity.hulk.antipatterngraph.codesmells;

import org.gravity.hulk.antipatterngraph.HCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HIntense Field Usage Code Smell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell#getHLocalAccessRelationMetric <em>HLocal Access Relation Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHIntenseFieldUsageCodeSmell()
 * @model
 * @generated
 */
public interface HIntenseFieldUsageCodeSmell extends HCodeSmell {
	/**
	 * Returns the value of the '<em><b>HLocal Access Relation Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HLocal Access Relation Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HLocal Access Relation Metric</em>' reference.
	 * @see #setHLocalAccessRelationMetric(HLocalAccessRelationMetric)
	 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHIntenseFieldUsageCodeSmell_HLocalAccessRelationMetric()
	 * @model
	 * @generated
	 */
	HLocalAccessRelationMetric getHLocalAccessRelationMetric();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell#getHLocalAccessRelationMetric <em>HLocal Access Relation Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HLocal Access Relation Metric</em>' reference.
	 * @see #getHLocalAccessRelationMetric()
	 * @generated
	 */
	void setHLocalAccessRelationMetric(HLocalAccessRelationMetric value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HIntenseFieldUsageCodeSmell
