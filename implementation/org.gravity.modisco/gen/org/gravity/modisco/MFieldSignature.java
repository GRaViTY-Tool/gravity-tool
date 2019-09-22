/**
 */
package org.gravity.modisco;

import org.eclipse.gmt.modisco.java.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MField Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MFieldSignature#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMFieldSignature()
 * @model
 * @generated
 */
public interface MFieldSignature extends MSignature {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.gravity.modisco.ModiscoPackage#getMFieldSignature_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MFieldSignature#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // MFieldSignature
