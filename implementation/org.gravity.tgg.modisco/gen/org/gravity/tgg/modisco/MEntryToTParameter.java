/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MEntry;

import org.gravity.typegraph.basic.TParameter;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MEntry To TParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.MEntryToTParameter#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.MEntryToTParameter#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.ModiscoPackage#getMEntryToTParameter()
 * @model
 * @generated
 */
public interface MEntryToTParameter extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MEntry)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getMEntryToTParameter_Source()
	 * @model required="true"
	 * @generated
	 */
	MEntry getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.MEntryToTParameter#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MEntry value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TParameter)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getMEntryToTParameter_Target()
	 * @model required="true"
	 * @generated
	 */
	TParameter getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.MEntryToTParameter#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TParameter value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MEntryToTParameter
