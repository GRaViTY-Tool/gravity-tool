/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMethod Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TMethodSignature#getMethod <em>Method</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMethodSignature#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMethodSignature#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMethodSignature#getFirstParameter <em>First Parameter</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodSignature()
 * @model
 * @generated
 */
public interface TMethodSignature extends TSignature {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMethod#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(TMethod)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodSignature_Method()
	 * @see org.gravity.typegraph.basic.TMethod#getSignatures
	 * @model opposite="signatures" required="true" transient="false"
	 * @generated
	 */
	TMethod getMethod();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TMethodSignature#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(TMethod value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(TAbstractType)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodSignature_ReturnType()
	 * @model
	 * @generated
	 */
	TAbstractType getReturnType();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TMethodSignature#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TAbstractType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodSignature_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>First Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Parameter</em>' reference.
	 * @see #setFirstParameter(TParameter)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodSignature_FirstParameter()
	 * @model
	 * @generated
	 */
	TParameter getFirstParameter();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TMethodSignature#getFirstParameter <em>First Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Parameter</em>' reference.
	 * @see #getFirstParameter()
	 * @generated
	 */
	void setFirstParameter(TParameter value);

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
	TMethodDefinition getTDefinition(TAbstractType defining);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameterTypesMany="true"
	 * @generated
	 */
	boolean isThisSignature(TAbstractType returnType, EList<TAbstractType> parameterTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TMethodDefinition> getMethodDefinitions();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TMethodSignature
