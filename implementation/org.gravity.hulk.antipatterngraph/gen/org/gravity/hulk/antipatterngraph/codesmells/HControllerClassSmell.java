/**
 */
package org.gravity.hulk.antipatterngraph.codesmells;

import org.gravity.hulk.antipatterngraph.HCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HController Class Smell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell#getHInvocationRelation <em>HInvocation Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHControllerClassSmell()
 * @model
 * @generated
 */
public interface HControllerClassSmell extends HCodeSmell {
	/**
	 * Returns the value of the '<em><b>HInvocation Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HInvocation Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HInvocation Relation</em>' reference.
	 * @see #setHInvocationRelation(HInvocationRelation)
	 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHControllerClassSmell_HInvocationRelation()
	 * @model
	 * @generated
	 */
	HInvocationRelation getHInvocationRelation();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell#getHInvocationRelation <em>HInvocation Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HInvocation Relation</em>' reference.
	 * @see #getHInvocationRelation()
	 * @generated
	 */
	void setHInvocationRelation(HInvocationRelation value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HControllerClassSmell
