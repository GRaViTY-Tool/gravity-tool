/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.AnnotationMemberValuePair;

import org.gravity.typegraph.basic.annotations.TAnnotationValue;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Member Value Pair To TAnnotation Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.AnnotationMemberValuePairToTAnnotationValue#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.AnnotationMemberValuePairToTAnnotationValue#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.ModiscoPackage#getAnnotationMemberValuePairToTAnnotationValue()
 * @model
 * @generated
 */
public interface AnnotationMemberValuePairToTAnnotationValue extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AnnotationMemberValuePair)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getAnnotationMemberValuePairToTAnnotationValue_Source()
	 * @model required="true"
	 * @generated
	 */
	AnnotationMemberValuePair getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.AnnotationMemberValuePairToTAnnotationValue#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AnnotationMemberValuePair value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TAnnotationValue)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getAnnotationMemberValuePairToTAnnotationValue_Target()
	 * @model required="true"
	 * @generated
	 */
	TAnnotationValue getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.AnnotationMemberValuePairToTAnnotationValue#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TAnnotationValue value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // AnnotationMemberValuePairToTAnnotationValue
