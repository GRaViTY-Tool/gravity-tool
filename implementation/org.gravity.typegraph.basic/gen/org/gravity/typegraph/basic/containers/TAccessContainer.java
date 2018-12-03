/**
 */
package org.gravity.typegraph.basic.containers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gravity.typegraph.basic.TAccess;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAccess Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.containers.TAccessContainer#getTAccessEdges <em>TAccess Edges</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTAccessContainer()
 * @model
 * @generated
 */
public interface TAccessContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>TAccess Edges</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TAccess Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TAccess Edges</em>' reference list.
	 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTAccessContainer_TAccessEdges()
	 * @model
	 * @generated
	 */
	EList<TAccess> getTAccessEdges();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TAccessContainer
