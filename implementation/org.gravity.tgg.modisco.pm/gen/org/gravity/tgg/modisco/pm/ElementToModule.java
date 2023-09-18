/**
 */
package org.gravity.tgg.modisco.pm;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.NamedElement;

import org.gravity.typegraph.basic.TModule;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element To Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.pm.ElementToModule#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.pm.ElementToModule#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.pm.PmPackage#getElementToModule()
 * @model
 * @generated
 */
public interface ElementToModule extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NamedElement)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getElementToModule_Source()
	 * @model required="true"
	 * @generated
	 */
	NamedElement getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.ElementToModule#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TModule)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getElementToModule_Target()
	 * @model required="true"
	 * @generated
	 */
	TModule getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.ElementToModule#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TModule value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ElementToModule
