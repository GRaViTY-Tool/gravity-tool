/**
 */
package org.gravity.typegraph.basic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAnnotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TAnnotation#getTAnnotated <em>TAnnotated</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TAnnotation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTAnnotation()
 * @model
 * @generated
 */
public interface TAnnotation extends TElementWithId {
	/**
	 * Returns the value of the '<em><b>TAnnotated</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAnnotatable#getTAnnotation <em>TAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TAnnotated</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TAnnotated</em>' container reference.
	 * @see #setTAnnotated(TAnnotatable)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAnnotation_TAnnotated()
	 * @see org.gravity.typegraph.basic.TAnnotatable#getTAnnotation
	 * @model opposite="tAnnotation" required="true" transient="false"
	 * @generated
	 */
	TAnnotatable getTAnnotated();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TAnnotation#getTAnnotated <em>TAnnotated</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TAnnotated</em>' container reference.
	 * @see #getTAnnotated()
	 * @generated
	 */
	void setTAnnotated(TAnnotatable value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAnnotationType#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TAnnotationType)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAnnotation_Type()
	 * @see org.gravity.typegraph.basic.TAnnotationType#getAnnotations
	 * @model opposite="annotations" required="true"
	 * @generated
	 */
	TAnnotationType getType();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TAnnotation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TAnnotationType value);

} // TAnnotation
