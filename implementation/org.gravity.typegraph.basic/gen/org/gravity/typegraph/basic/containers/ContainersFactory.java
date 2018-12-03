/**
 */
package org.gravity.typegraph.basic.containers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.typegraph.basic.containers.ContainersPackage
 * @generated
 */
public interface ContainersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContainersFactory eINSTANCE = org.gravity.typegraph.basic.containers.impl.ContainersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TType Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TType Container</em>'.
	 * @generated
	 */
	TTypeContainer createTTypeContainer();

	/**
	 * Returns a new object of class '<em>TAccess Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAccess Container</em>'.
	 * @generated
	 */
	TAccessContainer createTAccessContainer();

	/**
	 * Returns a new object of class '<em>TMember Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMember Container</em>'.
	 * @generated
	 */
	TMemberContainer createTMemberContainer();

	/**
	 * Returns a new object of class '<em>TClass Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TClass Container</em>'.
	 * @generated
	 */
	TClassContainer createTClassContainer();

	/**
	 * Returns a new object of class '<em>TField Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TField Container</em>'.
	 * @generated
	 */
	TFieldContainer createTFieldContainer();

	/**
	 * Returns a new object of class '<em>TField Definition Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TField Definition Container</em>'.
	 * @generated
	 */
	TFieldDefinitionContainer createTFieldDefinitionContainer();

	/**
	 * Returns a new object of class '<em>TField Signature Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TField Signature Container</em>'.
	 * @generated
	 */
	TFieldSignatureContainer createTFieldSignatureContainer();

	/**
	 * Returns a new object of class '<em>TSignature Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSignature Container</em>'.
	 * @generated
	 */
	TSignatureContainer createTSignatureContainer();

	/**
	 * Returns a new object of class '<em>TMethod Definition Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMethod Definition Container</em>'.
	 * @generated
	 */
	TMethodDefinitionContainer createTMethodDefinitionContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContainersPackage getContainersPackage();

} //ContainersFactory
