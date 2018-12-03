/**
 */
package org.gravity.typegraph.basic.annotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage
 * @generated
 */
public interface AnnotationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationsFactory eINSTANCE = org.gravity.typegraph.basic.annotations.impl.AnnotationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TAnnotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAnnotation Value</em>'.
	 * @generated
	 */
	TAnnotationValue createTAnnotationValue();

	/**
	 * Returns a new object of class '<em>TText Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TText Annotation</em>'.
	 * @generated
	 */
	TTextAnnotation createTTextAnnotation();

	/**
	 * Returns a new object of class '<em>TAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAnnotation</em>'.
	 * @generated
	 */
	TAnnotation createTAnnotation();

	/**
	 * Returns a new object of class '<em>TAnnotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAnnotation Type</em>'.
	 * @generated
	 */
	TAnnotationType createTAnnotationType();

	/**
	 * Returns a new object of class '<em>TText Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TText Node</em>'.
	 * @generated
	 */
	TTextNode createTTextNode();

	/**
	 * Returns a new object of class '<em>TNumber Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TNumber Node</em>'.
	 * @generated
	 */
	TNumberNode createTNumberNode();

	/**
	 * Returns a new object of class '<em>TBool Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TBool Node</em>'.
	 * @generated
	 */
	TBoolNode createTBoolNode();

	/**
	 * Returns a new object of class '<em>TClass Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TClass Node</em>'.
	 * @generated
	 */
	TClassNode createTClassNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnnotationsPackage getAnnotationsPackage();

} //AnnotationsFactory
