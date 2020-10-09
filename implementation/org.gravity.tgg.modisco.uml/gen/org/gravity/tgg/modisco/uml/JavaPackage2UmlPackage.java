/**
 */
package org.gravity.tgg.modisco.uml;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Package2 Uml Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.uml.UmlPackage#getJavaPackage2UmlPackage()
 * @model
 * @generated
 */
public interface JavaPackage2UmlPackage extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(org.eclipse.modisco.java.Package)
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getJavaPackage2UmlPackage_Source()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.modisco.java.Package getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(org.eclipse.modisco.java.Package value);

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
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#getJavaPackage2UmlPackage_Target()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(org.eclipse.uml2.uml.Package value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // JavaPackage2UmlPackage
