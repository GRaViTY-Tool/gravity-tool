/**
 */
package org.gravity.modisco;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAnonymous</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MAnonymous#getMSourroundingType <em>MSourrounding Type</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMAnonymous()
 * @model
 * @generated
 */
public interface MAnonymous extends AnonymousClassDeclaration {
	/**
	 * Returns the value of the '<em><b>MSourrounding Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSourrounding Type</em>' reference.
	 * @see #setMSourroundingType(AbstractTypeDeclaration)
	 * @see org.gravity.modisco.ModiscoPackage#getMAnonymous_MSourroundingType()
	 * @model
	 * @generated
	 */
	AbstractTypeDeclaration getMSourroundingType();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MAnonymous#getMSourroundingType <em>MSourrounding Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSourrounding Type</em>' reference.
	 * @see #getMSourroundingType()
	 * @generated
	 */
	void setMSourroundingType(AbstractTypeDeclaration value);

} // MAnonymous
