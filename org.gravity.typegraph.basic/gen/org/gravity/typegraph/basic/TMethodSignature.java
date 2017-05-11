/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link org.gravity.typegraph.basic.TMethodSignature#getParamList <em>Param List</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMethodSignature#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMethodSignature#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodSignature()
 * @model
 * @generated
 */
public interface TMethodSignature extends EObject, TSignature {
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
	 * @model opposite="signatures" resolveProxies="false" required="true" transient="false"
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
	 * Returns the value of the '<em><b>Param List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param List</em>' containment reference.
	 * @see #setParamList(TParameterList)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodSignature_ParamList()
	 * @model containment="true"
	 * @generated
	 */
	TParameterList getParamList();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TMethodSignature#getParamList <em>Param List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param List</em>' containment reference.
	 * @see #getParamList()
	 * @generated
	 */
	void setParamList(TParameterList value);

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TMethodDefinition}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMethodDefinition#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodSignature_Definitions()
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getSignature
	 * @model opposite="signature" containment="true"
	 * @generated
	 */
	EList<TMethodDefinition> getDefinitions();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSignatureString();

} // TMethodSignature
