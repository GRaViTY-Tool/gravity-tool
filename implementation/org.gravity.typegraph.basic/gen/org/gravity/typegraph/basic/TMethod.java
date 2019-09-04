/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TMethod#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMethod#getPg <em>Pg</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTMethod()
 * @model
 * @generated
 */
public interface TMethod extends TName {
	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TMethodSignature}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMethodSignature#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signatures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethod_Signatures()
	 * @see org.gravity.typegraph.basic.TMethodSignature#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<TMethodSignature> getSignatures();

	/**
	 * Returns the value of the '<em><b>Pg</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TypeGraph#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pg</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pg</em>' container reference.
	 * @see #setPg(TypeGraph)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethod_Pg()
	 * @see org.gravity.typegraph.basic.TypeGraph#getMethods
	 * @model opposite="methods" required="true" transient="false"
	 * @generated
	 */
	TypeGraph getPg();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TMethod#getPg <em>Pg</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pg</em>' container reference.
	 * @see #getPg()
	 * @generated
	 */
	void setPg(TypeGraph value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameterTypesMany="true"
	 * @generated
	 */
	TMethodSignature getSignature(TAbstractType returnType, EList<TAbstractType> parameterTypes);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TMethod
