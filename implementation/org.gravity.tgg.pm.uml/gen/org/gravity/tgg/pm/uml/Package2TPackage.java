/**
 */
package org.gravity.tgg.pm.uml;

import org.eclipse.emf.ecore.EObject;

import org.gravity.typegraph.basic.TPackage;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package2 TPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.Package2TPackage#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.Package2TPackage#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.gravity.tgg.pm.uml.UmlPackage#getPackage2TPackage()
 * @model
 * @generated
 */
public interface Package2TPackage extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(org.eclipse.uml2.uml.Package)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getPackage2TPackage_Source()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Package2TPackage#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TPackage)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getPackage2TPackage_Target()
	 * @model required="true"
	 * @generated
	 */
	TPackage getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Package2TPackage#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TPackage value);

} // Package2TPackage
