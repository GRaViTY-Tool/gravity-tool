/**
 */
package org.gravity.hulk.antipatterngraph.codesmells;

import org.eclipse.emf.common.util.EList;

import org.gravity.hulk.antipatterngraph.HCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HNACCMetric;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HData Class Smell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell#getGetterSetterSmells <em>Getter Setter Smells</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell#getHNACCMetric <em>HNACC Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHDataClassSmell()
 * @model
 * @generated
 */
public interface HDataClassSmell extends HCodeSmell {
	/**
	 * Returns the value of the '<em><b>Getter Setter Smells</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.hulk.antipatterngraph.codesmells.HGetterSetterSmell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter Setter Smells</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter Setter Smells</em>' reference list.
	 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHDataClassSmell_GetterSetterSmells()
	 * @model
	 * @generated
	 */
	EList<HGetterSetterSmell> getGetterSetterSmells();

	/**
	 * Returns the value of the '<em><b>HNACC Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HNACC Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HNACC Metric</em>' reference.
	 * @see #setHNACCMetric(HNACCMetric)
	 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHDataClassSmell_HNACCMetric()
	 * @model
	 * @generated
	 */
	HNACCMetric getHNACCMetric();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell#getHNACCMetric <em>HNACC Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HNACC Metric</em>' reference.
	 * @see #getHNACCMetric()
	 * @generated
	 */
	void setHNACCMetric(HNACCMetric value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HDataClassSmell
