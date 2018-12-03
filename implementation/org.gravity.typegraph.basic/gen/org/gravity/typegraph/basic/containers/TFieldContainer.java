/**
 */
package org.gravity.typegraph.basic.containers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gravity.typegraph.basic.TField;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TField Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.containers.TFieldContainer#getTFields <em>TFields</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTFieldContainer()
 * @model
 * @generated
 */
public interface TFieldContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>TFields</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TFields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TFields</em>' reference list.
	 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTFieldContainer_TFields()
	 * @model
	 * @generated
	 */
	EList<TField> getTFields();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TFieldContainer
