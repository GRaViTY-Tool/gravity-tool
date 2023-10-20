/**
 */
package org.gravity.security.annotations.access;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.security.annotations.access.AccessPackage
 * @generated
 */
public interface AccessFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccessFactory eINSTANCE = org.gravity.security.annotations.access.impl.AccessFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TApi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TApi</em>'.
	 * @generated
	 */
	TApi createTApi();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AccessPackage getAccessPackage();

} //AccessFactory
