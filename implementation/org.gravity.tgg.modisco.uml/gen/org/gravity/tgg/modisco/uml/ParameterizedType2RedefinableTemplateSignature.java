/**
 */
package org.gravity.tgg.modisco.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.ParameterizedType;

import org.eclipse.uml2.uml.RedefinableTemplateSignature;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Type2 Redefinable Template Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.uml.ParameterizedType2RedefinableTemplateSignature#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.uml.ParameterizedType2RedefinableTemplateSignature#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.uml.UmlPackage#getParameterizedType2RedefinableTemplateSignature()
 * @model
 * @generated
 */
public interface ParameterizedType2RedefinableTemplateSignature extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ParameterizedType)
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getParameterizedType2RedefinableTemplateSignature_Source()
	 * @model required="true"
	 * @generated
	 */
	ParameterizedType getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.ParameterizedType2RedefinableTemplateSignature#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ParameterizedType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(RedefinableTemplateSignature)
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getParameterizedType2RedefinableTemplateSignature_Target()
	 * @model required="true"
	 * @generated
	 */
	RedefinableTemplateSignature getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.ParameterizedType2RedefinableTemplateSignature#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(RedefinableTemplateSignature value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ParameterizedType2RedefinableTemplateSignature
