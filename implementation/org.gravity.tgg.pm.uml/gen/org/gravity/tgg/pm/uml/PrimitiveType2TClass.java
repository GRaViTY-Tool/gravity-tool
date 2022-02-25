/**
 */
package org.gravity.tgg.pm.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.PrimitiveType;

import org.gravity.typegraph.basic.TClass;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type2 TClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.tgg.pm.uml.PrimitiveType2TClass#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.pm.uml.PrimitiveType2TClass#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.gravity.tgg.pm.uml.UmlPackage#getPrimitiveType2TClass()
 * @model
 * @generated
 */
public interface PrimitiveType2TClass extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PrimitiveType)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getPrimitiveType2TClass_Source()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.PrimitiveType2TClass#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TClass)
	 * @see org.gravity.tgg.pm.uml.UmlPackage#getPrimitiveType2TClass_Target()
	 * @model required="true"
	 * @generated
	 */
	TClass getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.pm.uml.PrimitiveType2TClass#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TClass value);

} // PrimitiveType2TClass
