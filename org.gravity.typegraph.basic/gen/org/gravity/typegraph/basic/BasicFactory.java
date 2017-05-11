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
	 * Returns a new object of class '<em>TAccess</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAccess</em>'.
	 * @generated
	 */
	TAccess createTAccess();

	/**
	 * Returns a new object of class '<em>TAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAnnotation</em>'.
	 * @generated
	 */
	TAnnotation createTAnnotation();

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
	 * Returns a new object of class '<em>TParameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TParameter List</em>'.
	 * @generated
	 */
	TParameterList createTParameterList();

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
	 * Returns a new object of class '<em>TAnnotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAnnotation Type</em>'.
	 * @generated
	 */
	TAnnotationType createTAnnotationType();

	/**
	 * Returns a new object of class '<em>TText Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TText Annotation</em>'.
	 * @generated
	 */
	TTextAnnotation createTTextAnnotation();

	/**
	 * Returns a new object of class '<em>TConstructor Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TConstructor Name</em>'.
	 * @generated
	 */
	TConstructorName createTConstructorName();

	/**
	 * Returns a new object of class '<em>TConstructor Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TConstructor Signature</em>'.
	 * @generated
	 */
	TConstructorSignature createTConstructorSignature();

	/**
	 * Returns a new object of class '<em>TConstructor Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TConstructor Definition</em>'.
	 * @generated
	 */
	TConstructorDefinition createTConstructorDefinition();

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
	 * Returns a new object of class '<em>TClass Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TClass Entity</em>'.
	 * @generated
	 */
	TClassEntity createTClassEntity();

	/**
	 * Returns a new object of class '<em>TField Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TField Entity</em>'.
	 * @generated
	 */
	TFieldEntity createTFieldEntity();

	/**
	 * Returns a new object of class '<em>TMethod Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMethod Entity</em>'.
	 * @generated
	 */
	TMethodEntity createTMethodEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicPackage getBasicPackage();

} //BasicFactory
