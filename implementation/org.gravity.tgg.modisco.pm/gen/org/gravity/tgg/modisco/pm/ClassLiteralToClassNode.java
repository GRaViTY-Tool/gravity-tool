/**
 */
package org.gravity.tgg.modisco.pm;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.TypeLiteral;

import org.gravity.typegraph.basic.annotations.TClassNode;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Literal To Class Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.pm.ClassLiteralToClassNode#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.pm.ClassLiteralToClassNode#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.pm.PmPackage#getClassLiteralToClassNode()
 * @model
 * @generated
 */
public interface ClassLiteralToClassNode extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TypeLiteral)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getClassLiteralToClassNode_Source()
	 * @model required="true"
	 * @generated
	 */
	TypeLiteral getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.ClassLiteralToClassNode#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TypeLiteral value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TClassNode)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getClassLiteralToClassNode_Target()
	 * @model required="true"
	 * @generated
	 */
	TClassNode getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.ClassLiteralToClassNode#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TClassNode value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ClassLiteralToClassNode
