/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MMethodName;

import org.gravity.typegraph.basic.TMethod;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMethod Name To TMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.MMethodNameToTMethod#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.MMethodNameToTMethod#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.ModiscoPackage#getMMethodNameToTMethod()
 * @model
 * @generated
 */
public interface MMethodNameToTMethod extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MMethodName)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getMMethodNameToTMethod_Source()
	 * @model required="true"
	 * @generated
	 */
	MMethodName getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.MMethodNameToTMethod#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MMethodName value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TMethod)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getMMethodNameToTMethod_Target()
	 * @model required="true"
	 * @generated
	 */
	TMethod getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.MMethodNameToTMethod#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TMethod value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MMethodNameToTMethod
