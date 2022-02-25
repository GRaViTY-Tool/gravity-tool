/**
 */
package org.gravity.tgg.pm.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

import org.gravity.typegraph.basic.TFieldSignature;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property2 TField Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.Property2TFieldSignature#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.Property2TFieldSignature#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.gravity.tgg.pm.uml.UmlPackage#getProperty2TFieldSignature()
 * @model
 * @generated
 */
public interface Property2TFieldSignature extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Property)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getProperty2TFieldSignature_Source()
	 * @model required="true"
	 * @generated
	 */
	Property getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Property2TFieldSignature#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Property value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TFieldSignature)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getProperty2TFieldSignature_Target()
	 * @model required="true"
	 * @generated
	 */
	TFieldSignature getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Property2TFieldSignature#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TFieldSignature value);

} // Property2TFieldSignature
