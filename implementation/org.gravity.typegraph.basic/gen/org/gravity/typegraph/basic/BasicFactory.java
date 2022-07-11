/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.typegraph.basic.BasicPackage
 * @generated
 */
public interface BasicFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicFactory eINSTANCE = org.gravity.typegraph.basic.impl.BasicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TClass</em>'.
	 * @generated
	 */
	TClass createTClass();

	/**
	 * Returns a new object of class '<em>TField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TField</em>'.
	 * @generated
	 */
	TField createTField();

	/**
	 * Returns a new object of class '<em>TField Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TField Definition</em>'.
	 * @generated
	 */
	TFieldDefinition createTFieldDefinition();

	/**
	 * Returns a new object of class '<em>TField Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TField Signature</em>'.
	 * @generated
	 */
	TFieldSignature createTFieldSignature();

	/**
	 * Returns a new object of class '<em>TCall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCall</em>'.
	 * @generated
	 */
	TCall createTCall();

	/**
	 * Returns a new object of class '<em>TMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMethod</em>'.
	 * @generated
	 */
	TMethod createTMethod();

	/**
	 * Returns a new object of class '<em>TMethod Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMethod Definition</em>'.
	 * @generated
	 */
	TMethodDefinition createTMethodDefinition();

	/**
	 * Returns a new object of class '<em>TMethod Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMethod Signature</em>'.
	 * @generated
	 */
	TMethodSignature createTMethodSignature();

	/**
	 * Returns a new object of class '<em>TPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPackage</em>'.
	 * @generated
	 */
	TPackage createTPackage();

	/**
	 * Returns a new object of class '<em>TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TParameter</em>'.
	 * @generated
	 */
	TParameter createTParameter();

	/**
	 * Returns a new object of class '<em>Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Graph</em>'.
	 * @generated
	 */
	TypeGraph createTypeGraph();

	/**
	 * Returns a new object of class '<em>TInterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TInterface</em>'.
	 * @generated
	 */
	TInterface createTInterface();

	/**
	 * Returns a new object of class '<em>TRead</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRead</em>'.
	 * @generated
	 */
	TRead createTRead();

	/**
	 * Returns a new object of class '<em>TWrite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TWrite</em>'.
	 * @generated
	 */
	TWrite createTWrite();

	/**
	 * Returns a new object of class '<em>TModifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TModifier</em>'.
	 * @generated
	 */
	TModifier createTModifier();

	/**
	 * Returns a new object of class '<em>TSyntethic Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSyntethic Method</em>'.
	 * @generated
	 */
	TSyntethicMethod createTSyntethicMethod();

	/**
	 * Returns a new object of class '<em>TUnresolved Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TUnresolved Type</em>'.
	 * @generated
	 */
	TUnresolvedType createTUnresolvedType();

	/**
	 * Returns a new object of class '<em>TName</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TName</em>'.
	 * @generated
	 */
	TName createTName();

	/**
	 * Returns a new object of class '<em>TFlow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TFlow</em>'.
	 * @generated
	 */
	TFlow createTFlow();

	/**
	 * Returns a new object of class '<em>TRead Write</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRead Write</em>'.
	 * @generated
	 */
	TReadWrite createTReadWrite();

	/**
	 * Returns a new object of class '<em>TConstructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TConstructor</em>'.
	 * @generated
	 */
	TConstructor createTConstructor();

	/**
	 * Returns a new object of class '<em>TEnum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEnum</em>'.
	 * @generated
	 */
	TEnum createTEnum();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicPackage getBasicPackage();

} //BasicFactory
