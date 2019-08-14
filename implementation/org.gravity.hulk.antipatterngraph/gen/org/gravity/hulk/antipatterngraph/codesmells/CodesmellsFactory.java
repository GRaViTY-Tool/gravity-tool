/**
 */
package org.gravity.hulk.antipatterngraph.codesmells;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage
 * @generated
 */
public interface CodesmellsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodesmellsFactory eINSTANCE = org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HController Class Smell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HController Class Smell</em>'.
	 * @generated
	 */
	HControllerClassSmell createHControllerClassSmell();

	/**
	 * Returns a new object of class '<em>HData Class Smell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HData Class Smell</em>'.
	 * @generated
	 */
	HDataClassSmell createHDataClassSmell();

	/**
	 * Returns a new object of class '<em>HEmpty Class Smell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HEmpty Class Smell</em>'.
	 * @generated
	 */
	HEmptyClassSmell createHEmptyClassSmell();

	/**
	 * Returns a new object of class '<em>HGetter Setter Smell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HGetter Setter Smell</em>'.
	 * @generated
	 */
	HGetterSetterSmell createHGetterSetterSmell();

	/**
	 * Returns a new object of class '<em>HLarge Class Low Cohesion Smell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLarge Class Low Cohesion Smell</em>'.
	 * @generated
	 */
	HLargeClassLowCohesionSmell createHLargeClassLowCohesionSmell();

	/**
	 * Returns a new object of class '<em>HLarge Class Smell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLarge Class Smell</em>'.
	 * @generated
	 */
	HLargeClassSmell createHLargeClassSmell();

	/**
	 * Returns a new object of class '<em>HLow Cohesion Smell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HLow Cohesion Smell</em>'.
	 * @generated
	 */
	HLowCohesionSmell createHLowCohesionSmell();

	/**
	 * Returns a new object of class '<em>HData Class Accessor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HData Class Accessor</em>'.
	 * @generated
	 */
	HDataClassAccessor createHDataClassAccessor();

	/**
	 * Returns a new object of class '<em>HMuch Overloading Code Smell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMuch Overloading Code Smell</em>'.
	 * @generated
	 */
	HMuchOverloadingCodeSmell createHMuchOverloadingCodeSmell();

	/**
	 * Returns a new object of class '<em>HMany Parameters Code Smell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMany Parameters Code Smell</em>'.
	 * @generated
	 */
	HManyParametersCodeSmell createHManyParametersCodeSmell();

	/**
	 * Returns a new object of class '<em>HIntense Field Usage Code Smell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HIntense Field Usage Code Smell</em>'.
	 * @generated
	 */
	HIntenseFieldUsageCodeSmell createHIntenseFieldUsageCodeSmell();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodesmellsPackage getCodesmellsPackage();

} //CodesmellsFactory
