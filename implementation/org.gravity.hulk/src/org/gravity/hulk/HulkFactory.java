/**
 */
package org.gravity.hulk;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.HulkPackage
 * @generated
 */
public interface HulkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HulkFactory eINSTANCE = org.gravity.hulk.impl.HulkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HAnti Pattern Detection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HAnti Pattern Detection</em>'.
	 * @generated
	 */
	HAntiPatternDetection createHAntiPatternDetection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HulkPackage getHulkPackage();

} //HulkFactory
