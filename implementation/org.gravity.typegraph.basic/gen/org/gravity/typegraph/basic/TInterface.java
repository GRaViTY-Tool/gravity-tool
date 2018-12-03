/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TInterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TInterface#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TInterface#getParentInterfaces <em>Parent Interfaces</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TInterface#getChildInterfaces <em>Child Interfaces</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTInterface()
 * @model
 * @generated
 */
public interface TInterface extends TAbstractType {
	/**
	 * Returns the value of the '<em><b>Implemented By</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TClass}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TClass#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implemented By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented By</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTInterface_ImplementedBy()
	 * @see org.gravity.typegraph.basic.TClass#getImplements
	 * @model opposite="implements"
	 * @generated
	 */
	EList<TClass> getImplementedBy();

	/**
	 * Returns the value of the '<em><b>Parent Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TInterface}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TInterface#getChildInterfaces <em>Child Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Interfaces</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTInterface_ParentInterfaces()
	 * @see org.gravity.typegraph.basic.TInterface#getChildInterfaces
	 * @model opposite="childInterfaces"
	 * @generated
	 */
	EList<TInterface> getParentInterfaces();

	/**
	 * Returns the value of the '<em><b>Child Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TInterface}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TInterface#getParentInterfaces <em>Parent Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Interfaces</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTInterface_ChildInterfaces()
	 * @see org.gravity.typegraph.basic.TInterface#getParentInterfaces
	 * @model opposite="parentInterfaces"
	 * @generated
	 */
	EList<TInterface> getChildInterfaces();

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
	boolean hasCommonSuperType(TAbstractType tType);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TInterface
