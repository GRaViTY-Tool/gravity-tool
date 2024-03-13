/**
 */
package org.gravity.modisco;

import org.eclipse.modisco.java.ClassInstanceCreation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MClass Instance Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MClassInstanceCreation#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMClassInstanceCreation()
 * @model
 * @generated
 */
public interface MClassInstanceCreation extends ClassInstanceCreation, MAbstractMethodInvocation {

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see org.gravity.modisco.ModiscoPackage#getMClassInstanceCreation_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MClassInstanceCreation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);
} // MClassInstanceCreation
