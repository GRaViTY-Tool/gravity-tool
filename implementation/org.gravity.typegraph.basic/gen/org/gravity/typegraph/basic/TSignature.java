/**
 */
package org.gravity.typegraph.basic;

import org.gravity.typegraph.basic.annotations.TAnnotatable;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSignature</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTSignature()
 * @model abstract="true"
 * @generated
 */
public interface TSignature extends TAnnotatable, TAbstractFlowElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSignatureString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TMember getTDefinition(TAbstractType defining);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TSignature
