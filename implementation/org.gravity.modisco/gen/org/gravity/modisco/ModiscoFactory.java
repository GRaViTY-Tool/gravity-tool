/**
 */
package org.gravity.modisco;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.modisco.ModiscoPackage
 * @generated
 */
public interface ModiscoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModiscoFactory eINSTANCE = org.gravity.modisco.impl.ModiscoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MConstructor Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MConstructor Definition</em>'.
	 * @generated
	 */
	MConstructorDefinition createMConstructorDefinition();

	/**
	 * Returns a new object of class '<em>MMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MMethod Signature</em>'.
	 * @generated
	 */
	MMethodSignature createMMethodSignature();

	/**
	 * Returns a new object of class '<em>MParameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MParameter List</em>'.
	 * @generated
	 */
	MParameterList createMParameterList();

	/**
	 * Returns a new object of class '<em>MMethod Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MMethod Name</em>'.
	 * @generated
	 */
	MMethodName createMMethodName();

	/**
	 * Returns a new object of class '<em>MField Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MField Name</em>'.
	 * @generated
	 */
	MFieldName createMFieldName();

	/**
	 * Returns a new object of class '<em>MField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MField Definition</em>'.
	 * @generated
	 */
	MFieldDefinition createMFieldDefinition();

	/**
	 * Returns a new object of class '<em>MMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MMethod Definition</em>'.
	 * @generated
	 */
	MMethodDefinition createMMethodDefinition();

	/**
	 * Returns a new object of class '<em>MMethod Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MMethod Invocation</em>'.
	 * @generated
	 */
	MMethodInvocation createMMethodInvocation();

	/**
	 * Returns a new object of class '<em>MEntry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MEntry</em>'.
	 * @generated
	 */
	MEntry createMEntry();

	/**
	 * Returns a new object of class '<em>MGravity Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MGravity Model</em>'.
	 * @generated
	 */
	MGravityModel createMGravityModel();

	/**
	 * Returns a new object of class '<em>MField Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MField Signature</em>'.
	 * @generated
	 */
	MFieldSignature createMFieldSignature();

	/**
	 * Returns a new object of class '<em>MAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MAnnotation</em>'.
	 * @generated
	 */
	MAnnotation createMAnnotation();

	/**
	 * Returns a new object of class '<em>MSynthetic Method Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSynthetic Method Definition</em>'.
	 * @generated
	 */
	MSyntheticMethodDefinition createMSyntheticMethodDefinition();

	/**
	 * Returns a new object of class '<em>MAnonymous</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MAnonymous</em>'.
	 * @generated
	 */
	MAnonymous createMAnonymous();

	/**
	 * Returns a new object of class '<em>MClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MClass</em>'.
	 * @generated
	 */
	MClass createMClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModiscoPackage getModiscoPackage();

} //ModiscoFactory
