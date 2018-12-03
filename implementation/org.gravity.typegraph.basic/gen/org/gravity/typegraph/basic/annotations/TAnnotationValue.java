/**
 */
package org.gravity.typegraph.basic.annotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAnnotation Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.annotations.TAnnotationValue#getTKey <em>TKey</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.annotations.TAnnotationValue#getTValue <em>TValue</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage#getTAnnotationValue()
 * @model
 * @generated
 */
public interface TAnnotationValue extends EObject {
	/**
	 * Returns the value of the '<em><b>TKey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TKey</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TKey</em>' attribute.
	 * @see #setTKey(String)
	 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage#getTAnnotationValue_TKey()
	 * @model required="true"
	 * @generated
	 */
	String getTKey();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.annotations.TAnnotationValue#getTKey <em>TKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TKey</em>' attribute.
	 * @see #getTKey()
	 * @generated
	 */
	void setTKey(String value);

	/**
	 * Returns the value of the '<em><b>TValue</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TValue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TValue</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage#getTAnnotationValue_TValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getTValue();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TAnnotationValue
