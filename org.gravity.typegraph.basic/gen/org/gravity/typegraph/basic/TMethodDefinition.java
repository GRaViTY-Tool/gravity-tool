/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMethod Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TMethodDefinition#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMethodDefinition#getOverriding <em>Overriding</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMethodDefinition#getOverriddenBy <em>Overridden By</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMethodDefinition#getOverloading <em>Overloading</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMethodDefinition#getOverloadedBy <em>Overloaded By</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMethodDefinition#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TMethodDefinition#getTMethodEntity <em>TMethod Entity</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodDefinition()
 * @model
 * @generated
 */
public interface TMethodDefinition extends EObject, TMember {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMethodSignature#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' container reference.
	 * @see #setSignature(TMethodSignature)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodDefinition_Signature()
	 * @see org.gravity.typegraph.basic.TMethodSignature#getDefinitions
	 * @model opposite="definitions" resolveProxies="false" required="true" transient="false"
	 * @generated
	 */
	TMethodSignature getSignature();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TMethodDefinition#getSignature <em>Signature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' container reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(TMethodSignature value);

	/**
	 * Returns the value of the '<em><b>Overriding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMethodDefinition#getOverriddenBy <em>Overridden By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overriding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overriding</em>' reference.
	 * @see #setOverriding(TMethodDefinition)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodDefinition_Overriding()
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getOverriddenBy
	 * @model opposite="overriddenBy"
	 * @generated
	 */
	TMethodDefinition getOverriding();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TMethodDefinition#getOverriding <em>Overriding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overriding</em>' reference.
	 * @see #getOverriding()
	 * @generated
	 */
	void setOverriding(TMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>Overridden By</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TMethodDefinition}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMethodDefinition#getOverriding <em>Overriding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overridden By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overridden By</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodDefinition_OverriddenBy()
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getOverriding
	 * @model opposite="overriding"
	 * @generated
	 */
	EList<TMethodDefinition> getOverriddenBy();

	/**
	 * Returns the value of the '<em><b>Overloading</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TMethodDefinition}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMethodDefinition#getOverloadedBy <em>Overloaded By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overloading</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overloading</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodDefinition_Overloading()
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getOverloadedBy
	 * @model opposite="overloadedBy"
	 * @generated
	 */
	EList<TMethodDefinition> getOverloading();

	/**
	 * Returns the value of the '<em><b>Overloaded By</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TMethodDefinition}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMethodDefinition#getOverloading <em>Overloading</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overloaded By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overloaded By</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodDefinition_OverloadedBy()
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getOverloading
	 * @model opposite="overloading"
	 * @generated
	 */
	EList<TMethodDefinition> getOverloadedBy();

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
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodDefinition_ReturnType()
	 * @model
	 * @generated
	 */
	TAbstractType getReturnType();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TMethodDefinition#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TAbstractType value);

	/**
	 * Returns the value of the '<em><b>TMethod Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMethodEntity#getTMethodDefinition <em>TMethod Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TMethod Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TMethod Entity</em>' reference.
	 * @see #setTMethodEntity(TMethodEntity)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTMethodDefinition_TMethodEntity()
	 * @see org.gravity.typegraph.basic.TMethodEntity#getTMethodDefinition
	 * @model opposite="tMethodDefinition" required="true"
	 * @generated
	 */
	TMethodEntity getTMethodEntity();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TMethodDefinition#getTMethodEntity <em>TMethod Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TMethod Entity</em>' reference.
	 * @see #getTMethodEntity()
	 * @generated
	 */
	void setTMethodEntity(TMethodEntity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSignatureString();

} // TMethodDefinition
