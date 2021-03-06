/**
 */
package org.gravity.tgg.modisco.pm;

import org.eclipse.emf.ecore.EObject;

import org.gravity.modisco.MFieldName;

import org.gravity.typegraph.basic.TField;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MField Name To TField</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.pm.MFieldNameToTField#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.pm.MFieldNameToTField#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.pm.PmPackage#getMFieldNameToTField()
 * @model
 * @generated
 */
public interface MFieldNameToTField extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MFieldName)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getMFieldNameToTField_Source()
	 * @model required="true"
	 * @generated
	 */
	MFieldName getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.MFieldNameToTField#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MFieldName value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TField)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getMFieldNameToTField_Target()
	 * @model required="true"
	 * @generated
	 */
	TField getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.MFieldNameToTField#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TField value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MFieldNameToTField
