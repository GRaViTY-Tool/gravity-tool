/**
 */
package org.gravity.tgg.modisco.pm;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Modifier;

import org.gravity.typegraph.basic.TMethodDefinition;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier To TMethod Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.pm.ModifierToTMethodEntity#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.pm.ModifierToTMethodEntity#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.pm.PmPackage#getModifierToTMethodEntity()
 * @model
 * @generated
 */
public interface ModifierToTMethodEntity extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Modifier)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getModifierToTMethodEntity_Source()
	 * @model required="true"
	 * @generated
	 */
	Modifier getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.ModifierToTMethodEntity#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Modifier value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TMethodDefinition)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getModifierToTMethodEntity_Target()
	 * @model required="true"
	 * @generated
	 */
	TMethodDefinition getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.ModifierToTMethodEntity#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TMethodDefinition value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ModifierToTMethodEntity
