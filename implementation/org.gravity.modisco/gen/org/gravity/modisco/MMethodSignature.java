/**
 */
package org.gravity.modisco;

import org.eclipse.gmt.modisco.java.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMethod Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MMethodSignature#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMMethodSignature()
 * @model
 * @generated
 */
public interface MMethodSignature extends MSignature, MParameterList {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Type)
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodSignature_ReturnType()
	 * @model
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MMethodSignature#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

} // MMethodSignature
