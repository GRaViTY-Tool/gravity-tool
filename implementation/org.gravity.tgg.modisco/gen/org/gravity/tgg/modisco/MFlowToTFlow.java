/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MFlow;

import org.gravity.typegraph.basic.TFlow;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFlow To TFlow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.MFlowToTFlow#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.MFlowToTFlow#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.ModiscoPackage#getMFlowToTFlow()
 * @model
 * @generated
 */
public interface MFlowToTFlow extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MFlow)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getMFlowToTFlow_Source()
	 * @model required="true"
	 * @generated
	 */
	MFlow getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.MFlowToTFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MFlow value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TFlow)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getMFlowToTFlow_Target()
	 * @model required="true"
	 * @generated
	 */
	TFlow getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.MFlowToTFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TFlow value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MFlowToTFlow
