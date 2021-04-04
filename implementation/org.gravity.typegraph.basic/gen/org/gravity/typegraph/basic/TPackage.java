/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TPackage#getSubpackages <em>Subpackages</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TPackage#getParent <em>Parent</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TPackage#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TPackage#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TPackage#getOwnedTypes <em>Owned Types</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TPackage#getModel <em>Model</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TPackage#getTName <em>TName</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTPackage()
 * @model
 * @generated
 */
public interface TPackage extends TAnnotatable {
	/**
	 * Returns the value of the '<em><b>Subpackages</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TPackage}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TPackage#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpackages</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTPackage_Subpackages()
	 * @see org.gravity.typegraph.basic.TPackage#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<TPackage> getSubpackages();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TPackage#getSubpackages <em>Subpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TPackage)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTPackage_Parent()
	 * @see org.gravity.typegraph.basic.TPackage#getSubpackages
	 * @model opposite="subpackages" transient="false"
	 * @generated
	 */
	TPackage getParent();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TPackage#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TPackage value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTPackage_Classes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTPackage_Interfaces()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TInterface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Owned Types</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TAbstractType}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAbstractType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Types</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTPackage_OwnedTypes()
	 * @see org.gravity.typegraph.basic.TAbstractType#getPackage
	 * @model opposite="package" ordered="false"
	 * @generated
	 */
	EList<TAbstractType> getOwnedTypes();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(TypeGraph)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTPackage_Model()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getModel();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TPackage#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(TypeGraph value);

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
	 * @see org.gravity.typegraph.basic.BasicPackage#getTPackage_TName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTName();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TPackage#getTName <em>TName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TName</em>' attribute.
	 * @see #getTName()
	 * @generated
	 */
	void setTName(String value);

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
	 * @model kind="operation"
	 * @generated
	 */
	EList<TAbstractType> getAllOwnedTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TClass> getAllOwnedClasses();

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
	TClass createTClass(String name, boolean lib, TVisibility visibility);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TPackage
