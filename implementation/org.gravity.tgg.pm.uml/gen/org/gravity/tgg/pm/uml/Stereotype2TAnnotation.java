/**
 */
package org.gravity.tgg.pm.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Stereotype;

import org.gravity.typegraph.basic.annotations.TAnnotation;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype2 TAnnotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.Stereotype2TAnnotation#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.Stereotype2TAnnotation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.pm.uml.UmlPackage#getStereotype2TAnnotation()
 * @model
 * @generated
 */
public interface Stereotype2TAnnotation extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Stereotype)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getStereotype2TAnnotation_Source()
	 * @model required="true"
	 * @generated
	 */
	Stereotype getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Stereotype2TAnnotation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Stereotype value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TAnnotation)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getStereotype2TAnnotation_Target()
	 * @model required="true"
	 * @generated
	 */
	TAnnotation getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Stereotype2TAnnotation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TAnnotation value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Stereotype2TAnnotation
