/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.gravity.typegraph.basic.TMember#getTAccessing <em>TAccessing</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTMember()
 * @model abstract="true"
 * @generated
 */
public interface TMember extends TElementWithId, TAnnotatable {
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
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAccess#getTTarget <em>TTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessed By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessed By</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMember_AccessedBy()
	 * @see org.gravity.typegraph.basic.TAccess#getTTarget
	 * @model opposite="tTarget"
	 * @generated
	 */
	EList<TAccess> getAccessedBy();

	/**
	 * Returns the value of the '<em><b>TAccessing</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TAccess}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAccess#getTSource <em>TSource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TAccessing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TAccessing</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMember_TAccessing()
	 * @see org.gravity.typegraph.basic.TAccess#getTSource
	 * @model opposite="tSource" containment="true"
	 * @generated
	 */
	EList<TAccess> getTAccessing();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	TSignature getSignature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSignatureString();

} // TMember
