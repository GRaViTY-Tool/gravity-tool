/**
 */
package org.gravity.hulk.refactoringgraph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage
 * @generated
 */
public interface RefactoringgraphFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefactoringgraphFactory eINSTANCE = org.gravity.hulk.refactoringgraph.impl.RefactoringgraphFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HMethod To Data Class Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMethod To Data Class Access</em>'.
	 * @generated
	 */
	HMethodToDataClassAccess createHMethodToDataClassAccess();

	/**
	 * Returns a new object of class '<em>HIn Blob Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HIn Blob Access</em>'.
	 * @generated
	 */
	HInBlobAccess createHInBlobAccess();

	/**
	 * Returns a new object of class '<em>HBlob Resolve Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HBlob Resolve Annotation</em>'.
	 * @generated
	 */
	HBlobResolveAnnotation createHBlobResolveAnnotation();

	/**
	 * Returns a new object of class '<em>HCluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HCluster</em>'.
	 * @generated
	 */
	HCluster createHCluster();

	/**
	 * Returns a new object of class '<em>HIn Blob Cluster Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HIn Blob Cluster Access</em>'.
	 * @generated
	 */
	HInBlobClusterAccess createHInBlobClusterAccess();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RefactoringgraphPackage getRefactoringgraphPackage();

} //RefactoringgraphFactory
