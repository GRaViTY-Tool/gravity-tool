/**
 */
package org.gravity.tgg.pm.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Interface;

import org.gravity.typegraph.basic.TInterface;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface2 TInterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.Interface2TInterface#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.Interface2TInterface#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.gravity.tgg.pm.uml.UmlPackage#getInterface2TInterface()
 * @model
 * @generated
 */
public interface Interface2TInterface extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Interface)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getInterface2TInterface_Source()
	 * @model required="true"
	 * @generated
	 */
	Interface getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Interface2TInterface#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Interface value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TInterface)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getInterface2TInterface_Target()
	 * @model required="true"
	 * @generated
	 */
	TInterface getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Interface2TInterface#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TInterface value);

} // Interface2TInterface
