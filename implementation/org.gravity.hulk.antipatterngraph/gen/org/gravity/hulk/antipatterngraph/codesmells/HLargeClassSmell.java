/**
 */
package org.gravity.hulk.antipatterngraph.codesmells;

import org.gravity.hulk.antipatterngraph.HCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HLarge Class Smell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell#getHNumberOfMembers <em>HNumber Of Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHLargeClassSmell()
 * @model
 * @generated
 */
public interface HLargeClassSmell extends HCodeSmell {
	/**
	 * Returns the value of the '<em><b>HNumber Of Members</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HNumber Of Members</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HNumber Of Members</em>' reference.
	 * @see #setHNumberOfMembers(HNumberOfMembersMetric)
	 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHLargeClassSmell_HNumberOfMembers()
	 * @model
	 * @generated
	 */
	HNumberOfMembersMetric getHNumberOfMembers();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell#getHNumberOfMembers <em>HNumber Of Members</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HNumber Of Members</em>' reference.
	 * @see #getHNumberOfMembers()
	 * @generated
	 */
	void setHNumberOfMembers(HNumberOfMembersMetric value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HLargeClassSmell
