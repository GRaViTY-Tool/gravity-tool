/**
 */
package org.gravity.security.annotations.requirements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.security.annotations.requirements.RequirementsPackage
 * @generated
 */
public interface RequirementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsFactory eINSTANCE = org.gravity.security.annotations.requirements.impl.RequirementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TSecrecy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSecrecy</em>'.
	 * @generated
	 */
	TSecrecy createTSecrecy();

	/**
	 * Returns a new object of class '<em>TIntegrity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TIntegrity</em>'.
	 * @generated
	 */
	TIntegrity createTIntegrity();

	/**
	 * Returns a new object of class '<em>THigh</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>THigh</em>'.
	 * @generated
	 */
	THigh createTHigh();

	/**
	 * Returns a new object of class '<em>TCritical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCritical</em>'.
	 * @generated
	 */
	TCritical createTCritical();

	/**
	 * Returns a new object of class '<em>TAnnotation With Counter Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAnnotation With Counter Measure</em>'.
	 * @generated
	 */
	TAnnotationWithCounterMeasure createTAnnotationWithCounterMeasure();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RequirementsPackage getRequirementsPackage();

} //RequirementsFactory
