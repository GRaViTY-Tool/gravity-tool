/**
 */
package org.gravity.typegraph.basic.containers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gravity.typegraph.basic.TSignature;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSignature Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.containers.TSignatureContainer#getTSignatures <em>TSignatures</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTSignatureContainer()
 * @model
 * @generated
 */
public interface TSignatureContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>TSignatures</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TSignature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TSignatures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TSignatures</em>' reference list.
	 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTSignatureContainer_TSignatures()
	 * @model
	 * @generated
	 */
	EList<TSignature> getTSignatures();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TSignatureContainer
