/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;
import org.gravity.typegraph.basic.containers.TMemberContainer;
import org.gravity.typegraph.basic.containers.TMethodDefinitionContainer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TClass#getParentClass <em>Parent Class</em>}</li>
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
	 * Returns the value of the '<em><b>Parent Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TClass#getChildClasses <em>Child Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Class</em>' reference.
	 * @see #setParentClass(TClass)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTClass_ParentClass()
	 * @see org.gravity.typegraph.basic.TClass#getChildClasses
	 * @model opposite="childClasses"
	 * @generated
	 */
	TClass getParentClass();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TClass#getParentClass <em>Parent Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Class</em>' reference.
	 * @see #getParentClass()
	 * @generated
	 */
	void setParentClass(TClass value);

	/**
	 * Returns the value of the '<em><b>Child Classes</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TClass}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TClass#getParentClass <em>Parent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Classes</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTClass_ChildClasses()
	 * @see org.gravity.typegraph.basic.TClass#getParentClass
	 * @model opposite="parentClass"
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
	 * @model opposite="implementedBy"
	 * @generated
	 */
	EList<TInterface> getImplements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	TMethodDefinitionContainer getTMethodDefinitions();

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
	TMemberContainer getAllTMembersInContainer();

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
	boolean isSubTypeOf(TAbstractType tType);

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
	 * @model kind="operation"
	 * @generated
	 */
	TClass getResolvedParentClass();

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
	boolean hasCommonSuperType(TAbstractType tType);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TClass
