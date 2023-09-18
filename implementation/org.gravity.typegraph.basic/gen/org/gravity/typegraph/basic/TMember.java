/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMember</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TMember#getDefinedBy <em>Defined By</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMember#getAccessedBy <em>Accessed By</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMember#getAccessing <em>Accessing</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMember#getTModifier <em>TModifier</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMember#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTMember()
 * @model abstract="true"
 * @generated
 */
public interface TMember extends TAnnotatable, TAbstractFlowElement, TContainableElement {
	/**
	 * Returns the value of the '<em><b>Defined By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAbstractType#getDefines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined By</em>' reference.
	 * @see #setDefinedBy(TAbstractType)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMember_DefinedBy()
	 * @see org.gravity.typegraph.basic.TAbstractType#getDefines
	 * @model opposite="defines" required="true"
	 * @generated
	 */
	TAbstractType getDefinedBy();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TMember#getDefinedBy <em>Defined By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined By</em>' reference.
	 * @see #getDefinedBy()
	 * @generated
	 */
	void setDefinedBy(TAbstractType value);

	/**
	 * Returns the value of the '<em><b>Accessed By</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TAccess}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessed By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessed By</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMember_AccessedBy()
	 * @see org.gravity.typegraph.basic.TAccess#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<TAccess> getAccessedBy();

	/**
	 * Returns the value of the '<em><b>Accessing</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TAccess}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessing</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMember_Accessing()
	 * @see org.gravity.typegraph.basic.TAccess#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<TAccess> getAccessing();

	/**
	 * Returns the value of the '<em><b>TModifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TModifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TModifier</em>' containment reference.
	 * @see #setTModifier(TModifier)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMember_TModifier()
	 * @model containment="true"
	 * @generated
	 */
	TModifier getTModifier();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TMember#getTModifier <em>TModifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TModifier</em>' containment reference.
	 * @see #getTModifier()
	 * @generated
	 */
	void setTModifier(TModifier value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TSignature#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' container reference.
	 * @see #setSignature(TSignature)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMember_Signature()
	 * @see org.gravity.typegraph.basic.TSignature#getDefinitions
	 * @model opposite="definitions" required="true" transient="false"
	 * @generated
	 */
	TSignature getSignature();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TMember#getSignature <em>Signature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' container reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(TSignature value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSignatureString();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TMember
