/**
 */
package org.gravity.hulk.antipatterngraph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.antipatterngraph.AntipatterngraphPackage
 * @generated
 */
public interface AntipatterngraphFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AntipatterngraphFactory eINSTANCE = org.gravity.hulk.antipatterngraph.impl.AntipatterngraphFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HAnti Pattern Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HAnti Pattern Graph</em>'.
	 * @generated
	 */
	HAntiPatternGraph createHAntiPatternGraph();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AntipatterngraphPackage getAntipatterngraphPackage();

} //AntipatterngraphFactory
