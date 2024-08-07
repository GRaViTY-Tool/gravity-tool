/**
 */
package org.gravity.security.violation.patterns.violations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.security.violation.patterns.violations.ViolationsPackage
 * @generated
 */
public interface ViolationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViolationsFactory eINSTANCE = org.gravity.security.violation.patterns.violations.impl.ViolationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Secure Dependency Violation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secure Dependency Violation</em>'.
	 * @generated
	 */
	SecureDependencyViolation createSecureDependencyViolation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ViolationsPackage getViolationsPackage();

} //ViolationsFactory
