/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TClass#getParentClasses <em>Parent Classes</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TClass#getChildClasses <em>Child Classes</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TClass#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTClass()
 * @model
 * @generated
 */
public interface TClass extends TAbstractType {
	/**
	 * Returns the value of the '<em><b>Parent Classes</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TClass}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TClass#getChildClasses <em>Child Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Classes</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTClass_ParentClasses()
	 * @see org.gravity.typegraph.basic.TClass#getChildClasses
	 * @model opposite="childClasses"
	 * @generated
	 */
	EList<TClass> getParentClasses();

	/**
	 * Returns the value of the '<em><b>Child Classes</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TClass}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TClass#getParentClasses <em>Parent Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Classes</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTClass_ChildClasses()
	 * @see org.gravity.typegraph.basic.TClass#getParentClasses
	 * @model opposite="parentClasses" ordered="false"
	 * @generated
	 */
	EList<TClass> getChildClasses();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TInterface}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TInterface#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTClass_Implements()
	 * @see org.gravity.typegraph.basic.TInterface#getImplementedBy
	 * @model opposite="implementedBy" ordered="false"
	 * @generated
	 */
	EList<TInterface> getImplements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TMethodDefinition> getDeclaredTMethodDefinitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TMember> getAllTMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TClass> getAllChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	@Override
	boolean isSubTypeOf(TAbstractType tType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	@Override
	boolean isSuperTypeOf(TAbstractType tType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<TMember> getAllOutgoingAccesses(TSignature signature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasAParentThisTMember(TMember member);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	@Override
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TClass> getParents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	@Override
	boolean hasCommonSuperType(TAbstractType tType);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TClass
