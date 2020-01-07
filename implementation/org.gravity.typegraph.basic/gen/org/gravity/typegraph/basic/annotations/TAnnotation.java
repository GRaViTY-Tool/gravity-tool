/**
 */
package org.gravity.typegraph.basic.annotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAnnotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.annotations.TAnnotation#getTAnnotated <em>TAnnotated</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.annotations.TAnnotation#getType <em>Type</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.annotations.TAnnotation#getTValues <em>TValues</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage#getTAnnotation()
 * @model
 * @generated
 */
public interface TAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>TAnnotated</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.annotations.TAnnotatable#getTAnnotation <em>TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TAnnotated</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TAnnotated</em>' container reference.
	 * @see #setTAnnotated(TAnnotatable)
	 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage#getTAnnotation_TAnnotated()
	 * @see org.gravity.typegraph.basic.annotations.TAnnotatable#getTAnnotation
	 * @model opposite="tAnnotation" required="true" transient="false"
	 * @generated
	 */
	TAnnotatable getTAnnotated();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.annotations.TAnnotation#getTAnnotated <em>TAnnotated</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TAnnotated</em>' container reference.
	 * @see #getTAnnotated()
	 * @generated
	 */
	void setTAnnotated(TAnnotatable value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.annotations.TAnnotationType#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TAnnotationType)
	 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage#getTAnnotation_Type()
	 * @see org.gravity.typegraph.basic.annotations.TAnnotationType#getAnnotations
	 * @model opposite="annotations" required="true"
	 * @generated
	 */
	TAnnotationType getType();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.annotations.TAnnotation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TAnnotationType value);

	/**
	 * Returns the value of the '<em><b>TValues</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.annotations.TAnnotationValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TValues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TValues</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage#getTAnnotation_TValues()
	 * @model containment="true" keys="tKey"
	 * @generated
	 */
	EList<TAnnotationValue> getTValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TAnnotationValue getValue(String key);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TAnnotation
