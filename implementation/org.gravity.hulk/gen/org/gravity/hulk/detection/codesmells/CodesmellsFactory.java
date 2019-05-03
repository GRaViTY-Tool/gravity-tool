/**
 */
package org.gravity.hulk.detection.codesmells;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.detection.codesmells.CodesmellsPackage
 * @generated
 */
public interface CodesmellsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodesmellsFactory eINSTANCE = org.gravity.hulk.detection.codesmells.impl.CodesmellsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HContoller Class Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HContoller Class Detector</em>'.
	 * @generated
	 */
	HContollerClassDetector createHContollerClassDetector();

	/**
	 * Returns a new object of class '<em>HData Class Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HData Class Detector</em>'.
	 * @generated
	 */
	HDataClassDetector createHDataClassDetector();

	/**
	 * Returns a new object of class '<em>HEmpty Class Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HEmpty Class Detector</em>'.
	 * @generated
	 */
	HEmptyClassDetector createHEmptyClassDetector();

	/**
	 * Returns a new object of class '<em>HGetter Setter Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HGetter Setter Detector</em>'.
	 * @generated
	 */
	HGetterSetterDetector createHGetterSetterDetector();

	/**
	 * Returns a new object of class '<em>HLarge Class Low Cohesion Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLarge Class Low Cohesion Detector</em>'.
	 * @generated
	 */
	HLargeClassLowCohesionDetector createHLargeClassLowCohesionDetector();

	/**
	 * Returns a new object of class '<em>HLarge Class Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLarge Class Detector</em>'.
	 * @generated
	 */
	HLargeClassDetector createHLargeClassDetector();

	/**
	 * Returns a new object of class '<em>HLow Cohesion Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLow Cohesion Detector</em>'.
	 * @generated
	 */
	HLowCohesionDetector createHLowCohesionDetector();

	/**
	 * Returns a new object of class '<em>HData Class Accessor Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HData Class Accessor Detector</em>'.
	 * @generated
	 */
	HDataClassAccessorDetector createHDataClassAccessorDetector();

	/**
	 * Returns a new object of class '<em>HMany Parameters Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMany Parameters Detector</em>'.
	 * @generated
	 */
	HManyParametersDetector createHManyParametersDetector();

	/**
	 * Returns a new object of class '<em>HMuch Overloading Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMuch Overloading Detector</em>'.
	 * @generated
	 */
	HMuchOverloadingDetector createHMuchOverloadingDetector();

	/**
	 * Returns a new object of class '<em>HIntense Field Usage Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HIntense Field Usage Detector</em>'.
	 * @generated
	 */
	HIntenseFieldUsageDetector createHIntenseFieldUsageDetector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodesmellsPackage getCodesmellsPackage();

} //CodesmellsFactory
