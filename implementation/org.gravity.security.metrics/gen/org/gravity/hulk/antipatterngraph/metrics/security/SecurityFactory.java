/**
 */
package org.gravity.hulk.antipatterngraph.metrics.security;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.antipatterngraph.metrics.security.SecurityPackage
 * @generated
 */
public interface SecurityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityFactory eINSTANCE = org.gravity.hulk.antipatterngraph.metrics.security.impl.SecurityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Critical Class Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Critical Class Ratio</em>'.
	 * @generated
	 */
	CriticalClassRatio createCriticalClassRatio();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecurityPackage getSecurityPackage();

} //SecurityFactory
