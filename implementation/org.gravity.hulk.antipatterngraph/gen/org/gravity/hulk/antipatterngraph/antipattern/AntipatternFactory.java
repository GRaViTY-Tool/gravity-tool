/**
 */
package org.gravity.hulk.antipatterngraph.antipattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage
 * @generated
 */
public interface AntipatternFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AntipatternFactory eINSTANCE = org.gravity.hulk.antipatterngraph.antipattern.impl.AntipatternFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HBlob Anti Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HBlob Anti Pattern</em>'.
	 * @generated
	 */
	HBlobAntiPattern createHBlobAntiPattern();

	/**
	 * Returns a new object of class '<em>HGod Class Anti Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HGod Class Anti Pattern</em>'.
	 * @generated
	 */
	HGodClassAntiPattern createHGodClassAntiPattern();

	/**
	 * Returns a new object of class '<em>HSwiss Army Knife Anti Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HSwiss Army Knife Anti Pattern</em>'.
	 * @generated
	 */
	HSwissArmyKnifeAntiPattern createHSwissArmyKnifeAntiPattern();

	/**
	 * Returns a new object of class '<em>HSpaghetti Code Anti Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HSpaghetti Code Anti Pattern</em>'.
	 * @generated
	 */
	HSpaghettiCodeAntiPattern createHSpaghettiCodeAntiPattern();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AntipatternPackage getAntipatternPackage();

} //AntipatternFactory
