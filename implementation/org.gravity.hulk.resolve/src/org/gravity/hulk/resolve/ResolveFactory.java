/**
 */
package org.gravity.hulk.resolve;

import org.eclipse.emf.ecore.EFactory;
import org.gravity.hulk.HAntiPatternHandling;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.resolve.ResolvePackage
 * @generated
 */
public interface ResolveFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResolveFactory eINSTANCE = org.gravity.hulk.resolve.impl.ResolveFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResolvePackage getResolvePackage();

	HAntiPatternHandling createHAntiPatternResolving();

} //ResolveFactory