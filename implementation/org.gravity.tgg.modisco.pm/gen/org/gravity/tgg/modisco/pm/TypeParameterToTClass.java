/**
 */
package org.gravity.tgg.modisco.pm;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.TypeParameter;

import org.gravity.typegraph.basic.TClass;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parameter To TClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.pm.TypeParameterToTClass#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.pm.TypeParameterToTClass#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.pm.PmPackage#getTypeParameterToTClass()
 * @model
 * @generated
 */
public interface TypeParameterToTClass extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TypeParameter)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getTypeParameterToTClass_Source()
	 * @model required="true"
	 * @generated
	 */
	TypeParameter getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.TypeParameterToTClass#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TypeParameter value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TClass)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getTypeParameterToTClass_Target()
	 * @model required="true"
	 * @generated
	 */
	TClass getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.TypeParameterToTClass#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TClass value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TypeParameterToTClass
