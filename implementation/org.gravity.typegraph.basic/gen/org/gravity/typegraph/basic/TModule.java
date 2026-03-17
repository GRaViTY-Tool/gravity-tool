/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TModule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TModule#getContains <em>Contains</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TModule#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TModule#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTModule()
 * @model
 * @generated
 */
public interface TModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TContainableElement}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TContainableElement#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTModule_Contains()
	 * @see org.gravity.typegraph.basic.TContainableElement#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<TContainableElement> getContains();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TPackage#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see #setNamespace(TPackage)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTModule_Namespace()
	 * @see org.gravity.typegraph.basic.TPackage#getModules
	 * @model opposite="modules"
	 * @generated
	 */
	TPackage getNamespace();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TModule#getNamespace <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(TPackage value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTModule_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TModule#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // TModule
