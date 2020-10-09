/**
 */
package org.gravity.tgg.modisco.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.NamedElement;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element2 Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.uml.NamedElement2NamedElement#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.uml.NamedElement2NamedElement#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.uml.UmlPackage#getNamedElement2NamedElement()
 * @model
 * @generated
 */
public interface NamedElement2NamedElement extends EObject, AbstractCorrespondence {
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
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getNamedElement2NamedElement_Source()
	 * @model required="true"
	 * @generated
	 */
	NamedElement getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.NamedElement2NamedElement#getSource <em>Source</em>}' reference.
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
	 * @see #setTarget(org.eclipse.uml2.uml.NamedElement)
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getNamedElement2NamedElement_Target()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.NamedElement getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.NamedElement2NamedElement#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(org.eclipse.uml2.uml.NamedElement value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // NamedElement2NamedElement
