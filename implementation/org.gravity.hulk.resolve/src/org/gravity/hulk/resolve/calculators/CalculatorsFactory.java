/**
 */
package org.gravity.hulk.resolve.calculators;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.resolve.calculators.CalculatorsPackage
 * @generated
 */
public interface CalculatorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CalculatorsFactory eINSTANCE = org.gravity.hulk.resolve.calculators.impl.CalculatorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HMethod To Data Class Access Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMethod To Data Class Access Calculator</em>'.
	 * @generated
	 */
	HMethodToDataClassAccessCalculator createHMethodToDataClassAccessCalculator();

	/**
	 * Returns a new object of class '<em>HIn Blob Access Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HIn Blob Access Calculator</em>'.
	 * @generated
	 */
	HInBlobAccessCalculator createHInBlobAccessCalculator();

	/**
	 * Returns a new object of class '<em>HCluster Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HCluster Calculator</em>'.
	 * @generated
	 */
	HClusterCalculator createHClusterCalculator();

	/**
	 * Returns a new object of class '<em>HCluster Access Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HCluster Access Calculator</em>'.
	 * @generated
	 */
	HClusterAccessCalculator createHClusterAccessCalculator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CalculatorsPackage getCalculatorsPackage();

} //CalculatorsFactory