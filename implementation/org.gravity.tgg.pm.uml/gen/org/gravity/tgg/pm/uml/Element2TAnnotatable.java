/**
 */
package org.gravity.tgg.pm.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Element;

import org.gravity.typegraph.basic.annotations.TAnnotatable;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element2 TAnnotatable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.Element2TAnnotatable#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.Element2TAnnotatable#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.gravity.tgg.pm.uml.UmlPackage#getElement2TAnnotatable()
 * @model
 * @generated
 */
public interface Element2TAnnotatable extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Element)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getElement2TAnnotatable_Source()
	 * @model required="true"
	 * @generated
	 */
	Element getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Element2TAnnotatable#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Element value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TAnnotatable)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getElement2TAnnotatable_Target()
	 * @model required="true"
	 * @generated
	 */
	TAnnotatable getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.Element2TAnnotatable#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TAnnotatable value);

} // Element2TAnnotatable
