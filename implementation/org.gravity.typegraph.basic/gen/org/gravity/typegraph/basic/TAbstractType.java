/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAbstract Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TAbstractType#getPg <em>Pg</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TAbstractType#getPackage <em>Package</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TAbstractType#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TAbstractType#getDefines <em>Defines</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TAbstractType#isTLib <em>TLib</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TAbstractType#getTName <em>TName</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TAbstractType#getTModifier <em>TModifier</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TAbstractType#getInnerTypes <em>Inner Types</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TAbstractType#getOuterType <em>Outer Type</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTAbstractType()
 * @model abstract="true"
 * @generated
 */
public interface TAbstractType extends TAnnotatable {
	/**
	 * Returns the value of the '<em><b>Pg</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TypeGraph#getOwnedTypes <em>Owned Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pg</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pg</em>' container reference.
	 * @see #setPg(TypeGraph)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAbstractType_Pg()
	 * @see org.gravity.typegraph.basic.TypeGraph#getOwnedTypes
	 * @model opposite="ownedTypes" required="true" transient="false"
	 * @generated
	 */
	TypeGraph getPg();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TAbstractType#getPg <em>Pg</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pg</em>' container reference.
	 * @see #getPg()
	 * @generated
	 */
	void setPg(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TPackage#getOwnedTypes <em>Owned Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(TPackage)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAbstractType_Package()
	 * @see org.gravity.typegraph.basic.TPackage#getOwnedTypes
	 * @model opposite="ownedTypes"
	 * @generated
	 */
	TPackage getPackage();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TAbstractType#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(TPackage value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TSignature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAbstractType_Signature()
	 * @model
	 * @generated
	 */
	EList<TSignature> getSignature();

	/**
	 * Returns the value of the '<em><b>Defines</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TMember}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMember#getDefinedBy <em>Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAbstractType_Defines()
	 * @see org.gravity.typegraph.basic.TMember#getDefinedBy
	 * @model opposite="definedBy"
	 * @generated
	 */
	EList<TMember> getDefines();

	/**
	 * Returns the value of the '<em><b>TLib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TLib</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TLib</em>' attribute.
	 * @see #setTLib(boolean)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAbstractType_TLib()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isTLib();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TAbstractType#isTLib <em>TLib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TLib</em>' attribute.
	 * @see #isTLib()
	 * @generated
	 */
	void setTLib(boolean value);

	/**
	 * Returns the value of the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TName</em>' attribute.
	 * @see #setTName(String)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAbstractType_TName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTName();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TAbstractType#getTName <em>TName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TName</em>' attribute.
	 * @see #getTName()
	 * @generated
	 */
	void setTName(String value);

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
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAbstractType_TModifier()
	 * @model containment="true"
	 * @generated
	 */
	TModifier getTModifier();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TAbstractType#getTModifier <em>TModifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TModifier</em>' containment reference.
	 * @see #getTModifier()
	 * @generated
	 */
	void setTModifier(TModifier value);

	/**
	 * Returns the value of the '<em><b>Inner Types</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TAbstractType}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAbstractType#getOuterType <em>Outer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Types</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAbstractType_InnerTypes()
	 * @see org.gravity.typegraph.basic.TAbstractType#getOuterType
	 * @model opposite="outerType"
	 * @generated
	 */
	EList<TAbstractType> getInnerTypes();

	/**
	 * Returns the value of the '<em><b>Outer Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAbstractType#getInnerTypes <em>Inner Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Type</em>' reference.
	 * @see #setOuterType(TAbstractType)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAbstractType_OuterType()
	 * @see org.gravity.typegraph.basic.TAbstractType#getInnerTypes
	 * @model opposite="innerTypes"
	 * @generated
	 */
	TAbstractType getOuterType();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TAbstractType#getOuterType <em>Outer Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Type</em>' reference.
	 * @see #getOuterType()
	 * @generated
	 */
	void setOuterType(TAbstractType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isSuperTypeOf(TAbstractType tType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isSubTypeOf(TAbstractType tType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDeclared();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getFullyQualifiedName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TMethodSignature getTMethodSignature(String signature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TMethodDefinition getTMethodDefinition(String signature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	TPackage getBasePackage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TMember getTDefinition(TSignature signature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model signatureStringOrdered="false"
	 * @generated
	 */
	TMember getTDefinition(String signatureString);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasTMember(TMember member);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasCommonSuperType(TAbstractType tType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listMany="true"
	 * @generated
	 */
	void fillSameType(EList<TAbstractType> list);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isInnerType(TAbstractType tAbstractType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TPackage getRealPackage(TAbstractType type);
	// <-- [user code injected with eMoflon]


	// [user code injected with eMoflon] -->
} // TAbstractType
