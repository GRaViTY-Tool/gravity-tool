/**
 */
package org.gravity.tgg.modisco.pm;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Type;

import org.gravity.typegraph.basic.TAbstractType;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type To TAbstract Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.pm.TypeToTAbstractType#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.pm.TypeToTAbstractType#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.pm.PmPackage#getTypeToTAbstractType()
 * @model
 * @generated
 */
public interface TypeToTAbstractType extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Type)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getTypeToTAbstractType_Source()
	 * @model required="true"
	 * @generated
	 */
	Type getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.TypeToTAbstractType#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Type value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TAbstractType)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getTypeToTAbstractType_Target()
	 * @model required="true"
	 * @generated
	 */
	TAbstractType getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.TypeToTAbstractType#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TAbstractType value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TypeToTAbstractType
