/**
 */
package org.gravity.typegraph.basic.containers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gravity.typegraph.basic.TMember;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMember Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.containers.TMemberContainer#getTMembers <em>TMembers</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTMemberContainer()
 * @model
 * @generated
 */
public interface TMemberContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>TMembers</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TMembers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TMembers</em>' reference list.
	 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTMemberContainer_TMembers()
	 * @model
	 * @generated
	 */
	EList<TMember> getTMembers();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TMemberContainer
