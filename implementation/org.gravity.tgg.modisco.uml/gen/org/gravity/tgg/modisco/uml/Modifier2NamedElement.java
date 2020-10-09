/**
 */
package org.gravity.tgg.modisco.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Modifier;

import org.eclipse.uml2.uml.NamedElement;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier2 Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.uml.Modifier2NamedElement#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.uml.Modifier2NamedElement#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.uml.UmlPackage#getModifier2NamedElement()
 * @model
 * @generated
 */
public interface Modifier2NamedElement extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Modifier)
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getModifier2NamedElement_Source()
	 * @model required="true"
	 * @generated
	 */
	Modifier getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.Modifier2NamedElement#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Modifier value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NamedElement)
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getModifier2NamedElement_Target()
	 * @model required="true"
	 * @generated
	 */
	NamedElement getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.Modifier2NamedElement#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NamedElement value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Modifier2NamedElement
