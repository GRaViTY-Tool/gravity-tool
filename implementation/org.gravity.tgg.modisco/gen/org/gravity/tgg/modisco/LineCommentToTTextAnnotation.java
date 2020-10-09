/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.LineComment;

import org.gravity.typegraph.basic.annotations.TTextAnnotation;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Comment To TText Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.LineCommentToTTextAnnotation#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.LineCommentToTTextAnnotation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.ModiscoPackage#getLineCommentToTTextAnnotation()
 * @model
 * @generated
 */
public interface LineCommentToTTextAnnotation extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(LineComment)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getLineCommentToTTextAnnotation_Source()
	 * @model required="true"
	 * @generated
	 */
	LineComment getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.LineCommentToTTextAnnotation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(LineComment value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TTextAnnotation)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getLineCommentToTTextAnnotation_Target()
	 * @model required="true"
	 * @generated
	 */
	TTextAnnotation getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.LineCommentToTTextAnnotation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TTextAnnotation value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // LineCommentToTTextAnnotation
