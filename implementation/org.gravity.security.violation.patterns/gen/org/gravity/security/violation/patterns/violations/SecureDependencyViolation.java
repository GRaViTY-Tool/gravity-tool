/**
 */
package org.gravity.security.violation.patterns.violations;

import carisma.profile.umlsec.critical;

import org.gravity.hulk.antipatterngraph.HAnnotation;

import org.gravity.typegraph.basic.TMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secure Dependency Violation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.security.violation.patterns.violations.SecureDependencyViolation#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.security.violation.patterns.violations.SecureDependencyViolation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.gravity.security.violation.patterns.violations.SecureDependencyViolation#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see org.gravity.security.violation.patterns.violations.ViolationsPackage#getSecureDependencyViolation()
 * @model
 * @generated
 */
public interface SecureDependencyViolation extends HAnnotation {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TMember)
	 * @see org.gravity.security.violation.patterns.violations.ViolationsPackage#getSecureDependencyViolation_Source()
	 * @model
	 * @generated
	 */
	TMember getSource();

	/**
	 * Sets the value of the '{@link org.gravity.security.violation.patterns.violations.SecureDependencyViolation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TMember value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TMember)
	 * @see org.gravity.security.violation.patterns.violations.ViolationsPackage#getSecureDependencyViolation_Target()
	 * @model
	 * @generated
	 */
	TMember getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.security.violation.patterns.violations.SecureDependencyViolation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TMember value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(critical)
	 * @see org.gravity.security.violation.patterns.violations.ViolationsPackage#getSecureDependencyViolation_Requirement()
	 * @model
	 * @generated
	 */
	critical getRequirement();

	/**
	 * Sets the value of the '{@link org.gravity.security.violation.patterns.violations.SecureDependencyViolation#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(critical value);

} // SecureDependencyViolation
