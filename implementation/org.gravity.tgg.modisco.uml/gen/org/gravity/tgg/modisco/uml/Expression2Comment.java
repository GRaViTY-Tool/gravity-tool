/**
 */
package org.gravity.tgg.modisco.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Expression;

import org.eclipse.uml2.uml.Comment;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression2 Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.uml.Expression2Comment#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.uml.Expression2Comment#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.uml.UmlPackage#getExpression2Comment()
 * @model
 * @generated
 */
public interface Expression2Comment extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Expression)
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getExpression2Comment_Source()
	 * @model required="true"
	 * @generated
	 */
	Expression getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.Expression2Comment#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Expression value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Comment)
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getExpression2Comment_Target()
	 * @model required="true"
	 * @generated
	 */
	Comment getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.Expression2Comment#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Comment value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Expression2Comment
