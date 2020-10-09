/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.StringLiteral;

import org.gravity.typegraph.basic.annotations.TTextNode;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal To TText Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.StringLiteralToTTextNode#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.StringLiteralToTTextNode#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.ModiscoPackage#getStringLiteralToTTextNode()
 * @model
 * @generated
 */
public interface StringLiteralToTTextNode extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(StringLiteral)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getStringLiteralToTTextNode_Source()
	 * @model required="true"
	 * @generated
	 */
	StringLiteral getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.StringLiteralToTTextNode#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(StringLiteral value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TTextNode)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getStringLiteralToTTextNode_Target()
	 * @model required="true"
	 * @generated
	 */
	TTextNode getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.StringLiteralToTTextNode#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TTextNode value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // StringLiteralToTTextNode
