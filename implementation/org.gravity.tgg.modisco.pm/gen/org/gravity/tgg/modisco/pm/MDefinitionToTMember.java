/**
 */
package org.gravity.tgg.modisco.pm;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.BodyDeclaration;

import org.gravity.typegraph.basic.TMember;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MDefinition To TMember</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.tgg.modisco.pm.MDefinitionToTMember#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.tgg.modisco.pm.MDefinitionToTMember#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.tgg.modisco.pm.PmPackage#getMDefinitionToTMember()
 * @model
 * @generated
 */
public interface MDefinitionToTMember extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(BodyDeclaration)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getMDefinitionToTMember_Source()
	 * @model required="true"
	 * @generated
	 */
	BodyDeclaration getSource();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.MDefinitionToTMember#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(BodyDeclaration value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TMember)
	 * @see org.gravity.tgg.modisco.pm.PmPackage#getMDefinitionToTMember_Target()
	 * @model required="true"
	 * @generated
	 */
	TMember getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.tgg.modisco.pm.MDefinitionToTMember#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TMember value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MDefinitionToTMember
