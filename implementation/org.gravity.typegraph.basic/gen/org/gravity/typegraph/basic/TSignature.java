/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSignature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TSignature#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTSignature()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TSignature extends TAnnotatable, TAbstractFlowElement {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TMember}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMember#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTSignature_Definitions()
	 * @see org.gravity.typegraph.basic.TMember#getSignature
	 * @model opposite="signature" containment="true"
	 * @generated
	 */
	EList<TMember> getDefinitions();

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
