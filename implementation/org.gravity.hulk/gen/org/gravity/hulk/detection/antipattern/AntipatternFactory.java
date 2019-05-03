/**
 */
package org.gravity.hulk.detection.antipattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.detection.antipattern.AntipatternPackage
 * @generated
 */
public interface AntipatternFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AntipatternFactory eINSTANCE = org.gravity.hulk.detection.antipattern.impl.AntipatternFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HBlob Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HBlob Detector</em>'.
	 * @generated
	 */
	HBlobDetector createHBlobDetector();

	/**
	 * Returns a new object of class '<em>HGod Class Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HGod Class Detector</em>'.
	 * @generated
	 */
	HGodClassDetector createHGodClassDetector();

	/**
	 * Returns a new object of class '<em>HSwiss Army Knife Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HSwiss Army Knife Detector</em>'.
	 * @generated
	 */
	HSwissArmyKnifeDetector createHSwissArmyKnifeDetector();

	/**
	 * Returns a new object of class '<em>HSpaghetti Code Detector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HSpaghetti Code Detector</em>'.
	 * @generated
	 */
	HSpaghettiCodeDetector createHSpaghettiCodeDetector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AntipatternPackage getAntipatternPackage();

} //AntipatternFactory
