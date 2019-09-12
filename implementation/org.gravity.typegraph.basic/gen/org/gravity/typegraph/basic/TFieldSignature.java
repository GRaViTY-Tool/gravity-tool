/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TField Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TFieldSignature#getField <em>Field</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TFieldSignature#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTFieldSignature()
 * @model
 * @generated
 */
public interface TFieldSignature extends TSignature {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TField#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' container reference.
	 * @see #setField(TField)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTFieldSignature_Field()
	 * @see org.gravity.typegraph.basic.TField#getSignatures
	 * @model opposite="signatures" required="true" transient="false"
	 * @generated
	 */
	TField getField();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TFieldSignature#getField <em>Field</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' container reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(TField value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TAbstractType)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTFieldSignature_Type()
	 * @model required="true"
	 * @generated
	 */
	TAbstractType getType();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TFieldSignature#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TAbstractType value);

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
	TFieldDefinition getTDefinition(TAbstractType defining);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TFieldDefinition> getFieldDefinitions();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TFieldSignature
