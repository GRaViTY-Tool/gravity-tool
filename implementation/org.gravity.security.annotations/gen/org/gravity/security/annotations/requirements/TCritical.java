/**
 */
package org.gravity.security.annotations.requirements;

import org.eclipse.emf.common.util.EList;

import org.gravity.typegraph.basic.TSignature;

import org.gravity.typegraph.basic.annotations.TAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCritical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.security.annotations.requirements.TCritical#getSecrecy <em>Secrecy</em>}</li>
 *   <li>{@link org.gravity.security.annotations.requirements.TCritical#getIntegrity <em>Integrity</em>}</li>
 *   <li>{@link org.gravity.security.annotations.requirements.TCritical#getHigh <em>High</em>}</li>
 * </ul>
 *
 * @see org.gravity.security.annotations.requirements.RequirementsPackage#getTCritical()
 * @model
 * @generated
 */
public interface TCritical extends TAbstractCriticalElement {
	/**
	 * Returns the value of the '<em><b>Secrecy</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TSignature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrecy</em>' reference list.
	 * @see org.gravity.security.annotations.requirements.RequirementsPackage#getTCritical_Secrecy()
	 * @model
	 * @generated
	 */
	EList<TSignature> getSecrecy();

	/**
	 * Returns the value of the '<em><b>Integrity</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TSignature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrity</em>' reference list.
	 * @see org.gravity.security.annotations.requirements.RequirementsPackage#getTCritical_Integrity()
	 * @model
	 * @generated
	 */
	EList<TSignature> getIntegrity();

	/**
	 * Returns the value of the '<em><b>High</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TSignature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High</em>' reference list.
	 * @see org.gravity.security.annotations.requirements.RequirementsPackage#getTCritical_High()
	 * @model
	 * @generated
	 */
	EList<TSignature> getHigh();

} // TCritical
