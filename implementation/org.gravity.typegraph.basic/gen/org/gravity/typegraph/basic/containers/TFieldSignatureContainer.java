/**
 */
package org.gravity.typegraph.basic.containers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.gravity.typegraph.basic.TFieldSignature;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TField Signature Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.containers.TFieldSignatureContainer#getTFieldSignatures <em>TField Signatures</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTFieldSignatureContainer()
 * @model
 * @generated
 */
public interface TFieldSignatureContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>TField Signatures</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TFieldSignature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TField Signatures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TField Signatures</em>' reference list.
	 * @see org.gravity.typegraph.basic.containers.ContainersPackage#getTFieldSignatureContainer_TFieldSignatures()
	 * @model
	 * @generated
	 */
	EList<TFieldSignature> getTFieldSignatures();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TFieldSignatureContainer
