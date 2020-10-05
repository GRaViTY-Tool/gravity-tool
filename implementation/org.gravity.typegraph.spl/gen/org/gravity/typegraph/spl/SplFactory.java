/**
 */
package org.gravity.typegraph.spl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.typegraph.spl.SplPackage
 * @generated
 */
public interface SplFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SplFactory eINSTANCE = org.gravity.typegraph.spl.impl.SplFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TPresence Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPresence Condition</em>'.
	 * @generated
	 */
	TPresenceCondition createTPresenceCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SplPackage getSplPackage();

} //SplFactory
