/**
 */
package org.gravity.modisco;

import org.eclipse.modisco.java.SingleVariableAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSingle Variable Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MSingleVariableAccess#getAccessKind <em>Access Kind</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMSingleVariableAccess()
 * @model
 * @generated
 */
public interface MSingleVariableAccess extends SingleVariableAccess, MAccess {
	/**
	 * Returns the value of the '<em><b>Access Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gravity.modisco.AccessKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Kind</em>' attribute.
	 * @see org.gravity.modisco.AccessKind
	 * @see #setAccessKind(AccessKind)
	 * @see org.gravity.modisco.ModiscoPackage#getMSingleVariableAccess_AccessKind()
	 * @model
	 * @generated
	 */
	AccessKind getAccessKind();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MSingleVariableAccess#getAccessKind <em>Access Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Kind</em>' attribute.
	 * @see org.gravity.modisco.AccessKind
	 * @see #getAccessKind()
	 * @generated
	 */
	void setAccessKind(AccessKind value);

} // MSingleVariableAccess
