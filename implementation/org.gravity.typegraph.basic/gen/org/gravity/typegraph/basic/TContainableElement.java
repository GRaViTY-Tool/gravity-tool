/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TContainable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TContainableElement#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTContainableElement()
 * @model abstract="true"
 * @generated
 */
public interface TContainableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TModule#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(TModule)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTContainableElement_Module()
	 * @see org.gravity.typegraph.basic.TModule#getContains
	 * @model opposite="contains" transient="false"
	 * @generated
	 */
	TModule getModule();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TContainableElement#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(TModule value);

} // TContainableElement
