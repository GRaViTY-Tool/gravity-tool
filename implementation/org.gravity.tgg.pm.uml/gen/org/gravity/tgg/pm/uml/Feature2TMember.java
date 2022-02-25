/**
 */
package org.gravity.tgg.pm.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Feature;

import org.gravity.typegraph.basic.TMember;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature2 TMember</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.Feature2TMember#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.Feature2TMember#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.gravity.tgg.pm.uml.UmlPackage#getFeature2TMember()
 * @model
 * @generated
 */
public interface Feature2TMember extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Feature)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getFeature2TMember_Source()
	 * @model required="true"
	 * @generated
	 */
	Feature getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Feature2TMember#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Feature value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TMember)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getFeature2TMember_Target()
	 * @model required="true"
	 * @generated
	 */
	TMember getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Feature2TMember#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TMember value);

} // Feature2TMember
