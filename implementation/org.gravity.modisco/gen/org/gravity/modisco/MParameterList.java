/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MParameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MParameterList#getMFirstEntry <em>MFirst Entry</em>}</li>
 *   <li>{@link org.gravity.modisco.MParameterList#getMEntrys <em>MEntrys</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMParameterList()
 * @model abstract="true"
 * @generated
 */
public interface MParameterList extends EObject {
	/**
	 * Returns the value of the '<em><b>MFirst Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFirst Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFirst Entry</em>' reference.
	 * @see #setMFirstEntry(MEntry)
	 * @see org.gravity.modisco.ModiscoPackage#getMParameterList_MFirstEntry()
	 * @model
	 * @generated
	 */
	MEntry getMFirstEntry();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MParameterList#getMFirstEntry <em>MFirst Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFirst Entry</em>' reference.
	 * @see #getMFirstEntry()
	 * @generated
	 */
	void setMFirstEntry(MEntry value);

	/**
	 * Returns the value of the '<em><b>MEntrys</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.modisco.MEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MEntrys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEntrys</em>' containment reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMParameterList_MEntrys()
	 * @model containment="true"
	 * @generated
	 */
	EList<MEntry> getMEntrys();

} // MParameterList
