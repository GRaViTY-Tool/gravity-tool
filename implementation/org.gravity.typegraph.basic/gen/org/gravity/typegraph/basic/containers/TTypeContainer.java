/**
 */
package org.gravity.typegraph.basic.containers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gravity.typegraph.basic.TAbstractType;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TType Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.containers.TTypeContainer#getTAbstractTypes <em>TAbstract Types</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTTypeContainer()
 * @model
 * @generated
 */
public interface TTypeContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>TAbstract Types</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TAbstractType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TAbstract Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TAbstract Types</em>' reference list.
	 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTTypeContainer_TAbstractTypes()
	 * @model
	 * @generated
	 */
	EList<TAbstractType> getTAbstractTypes();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TTypeContainer
