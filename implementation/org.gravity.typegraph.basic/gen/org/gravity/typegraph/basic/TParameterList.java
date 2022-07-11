/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TParameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TParameterList#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TParameterList#getFirst <em>First</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTParameterList()
 * @model
 * @generated
 */
public interface TParameterList extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTParameterList_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<TParameter> getEntries();

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(TParameter)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTParameterList_First()
	 * @model
	 * @generated
	 */
	TParameter getFirst();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TParameterList#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(TParameter value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TParameterList
