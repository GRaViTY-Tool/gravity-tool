/**
 */
package org.gravity.tgg.modisco;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.VariableDeclarationFragment;

import org.gravity.typegraph.basic.TFieldDefinition;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Fragment To TField Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.ModiscoPackage#getVariableDeclarationFragmentToTFieldDefinition()
 * @model
 * @generated
 */
public interface VariableDeclarationFragmentToTFieldDefinition extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(VariableDeclarationFragment)
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getVariableDeclarationFragmentToTFieldDefinition_Source()
	 * @model required="true"
	 * @generated
	 */
	VariableDeclarationFragment getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(VariableDeclarationFragment value);

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
	 * @see org.gravity.tgg.modisco.ModiscoPackage#getVariableDeclarationFragmentToTFieldDefinition_Target()
	 * @model required="true"
	 * @generated
	 */
	TFieldDefinition getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.VariableDeclarationFragmentToTFieldDefinition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TFieldDefinition value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // VariableDeclarationFragmentToTFieldDefinition
