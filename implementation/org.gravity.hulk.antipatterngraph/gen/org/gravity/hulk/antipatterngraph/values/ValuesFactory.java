/**
 */
package org.gravity.hulk.antipatterngraph.values;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.antipatterngraph.values.ValuesPackage
 * @generated
 */
public interface ValuesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValuesFactory eINSTANCE = org.gravity.hulk.antipatterngraph.values.impl.ValuesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HRelative Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HRelative Value</em>'.
	 * @generated
	 */
	HRelativeValue createHRelativeValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ValuesPackage getValuesPackage();

} //ValuesFactory
