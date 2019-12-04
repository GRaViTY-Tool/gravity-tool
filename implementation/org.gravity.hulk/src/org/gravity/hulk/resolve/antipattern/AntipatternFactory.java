/**
 */
package org.gravity.hulk.resolve.antipattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.resolve.antipattern.AntipatternPackage
 * @generated
 */
public interface AntipatternFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AntipatternFactory eINSTANCE = org.gravity.hulk.resolve.antipattern.impl.AntipatternFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HBlob Resolver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HBlob Resolver</em>'.
	 * @generated
	 */
	HBlobResolver createHBlobResolver();

	/**
	 * Returns a new object of class '<em>HAlternative Blobresolver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HAlternative Blobresolver</em>'.
	 * @generated
	 */
	HAlternativeBlobresolver createHAlternativeBlobresolver();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AntipatternPackage getAntipatternPackage();

} //AntipatternFactory
