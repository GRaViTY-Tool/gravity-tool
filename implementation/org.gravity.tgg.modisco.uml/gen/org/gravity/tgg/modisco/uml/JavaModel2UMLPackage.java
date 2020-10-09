/**
 */
package org.gravity.tgg.modisco.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Model;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Model2 UML Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.uml.JavaModel2UMLPackage#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.uml.JavaModel2UMLPackage#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.uml.UmlPackage#getJavaModel2UMLPackage()
 * @model
 * @generated
 */
public interface JavaModel2UMLPackage extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Model)
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getJavaModel2UMLPackage_Source()
	 * @model required="true"
	 * @generated
	 */
	Model getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.JavaModel2UMLPackage#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Model value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(org.eclipse.uml2.uml.Package)
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getJavaModel2UMLPackage_Target()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.JavaModel2UMLPackage#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(org.eclipse.uml2.uml.Package value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // JavaModel2UMLPackage
