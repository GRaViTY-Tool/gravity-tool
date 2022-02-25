/**
 */
package org.gravity.tgg.pm.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

import org.gravity.typegraph.basic.TFieldDefinition;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property2 TField Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.Property2TFieldDefinition#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.Property2TFieldDefinition#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.pm.uml.UmlPackage#getProperty2TFieldDefinition()
 * @model
 * @generated
 */
public interface Property2TFieldDefinition extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Property)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getProperty2TFieldDefinition_Source()
	 * @model required="true"
	 * @generated
	 */
	Property getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Property2TFieldDefinition#getSource <em>Source</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TFieldDefinition)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getProperty2TFieldDefinition_Target()
	 * @model required="true"
	 * @generated
	 */
	TFieldDefinition getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Property2TFieldDefinition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TFieldDefinition value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Property2TFieldDefinition
