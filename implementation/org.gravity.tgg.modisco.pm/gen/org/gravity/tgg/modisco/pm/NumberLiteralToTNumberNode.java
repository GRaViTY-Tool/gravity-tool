/**
 */
package org.gravity.tgg.modisco.pm;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.NumberLiteral;

import org.gravity.typegraph.basic.annotations.TNumberNode;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Literal To TNumber Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.pm.NumberLiteralToTNumberNode#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.pm.NumberLiteralToTNumberNode#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.pm.PmPackage#getNumberLiteralToTNumberNode()
 * @model
 * @generated
 */
public interface NumberLiteralToTNumberNode extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NumberLiteral)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getNumberLiteralToTNumberNode_Source()
	 * @model required="true"
	 * @generated
	 */
	NumberLiteral getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.NumberLiteralToTNumberNode#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NumberLiteral value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TNumberNode)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getNumberLiteralToTNumberNode_Target()
	 * @model required="true"
	 * @generated
	 */
	TNumberNode getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.NumberLiteralToTNumberNode#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TNumberNode value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // NumberLiteralToTNumberNode
