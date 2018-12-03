/**
 */
package org.gravity.typegraph.basic.annotations;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TText Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.annotations.TTextAnnotation#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage#getTTextAnnotation()
 * @model
 * @generated
 */
public interface TTextAnnotation extends TAnnotation {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage#getTTextAnnotation_Text()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.annotations.TTextAnnotation#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TTextAnnotation
