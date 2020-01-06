/**
 */
package org.gravity.modisco;

import org.eclipse.modisco.java.SingleVariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSingle Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MSingleVariableDeclaration#getMEntry <em>MEntry</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMSingleVariableDeclaration()
 * @model
 * @generated
 */
public interface MSingleVariableDeclaration extends SingleVariableDeclaration {
	/**
	 * Returns the value of the '<em><b>MEntry</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MEntry#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEntry</em>' reference.
	 * @see #setMEntry(MEntry)
	 * @see org.gravity.modisco.ModiscoPackage#getMSingleVariableDeclaration_MEntry()
	 * @see org.gravity.modisco.MEntry#getParameters
	 * @model opposite="parameters" required="true"
	 * @generated
	 */
	MEntry getMEntry();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MSingleVariableDeclaration#getMEntry <em>MEntry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MEntry</em>' reference.
	 * @see #getMEntry()
	 * @generated
	 */
	void setMEntry(MEntry value);

} // MSingleVariableDeclaration
