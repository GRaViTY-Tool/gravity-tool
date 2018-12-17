/**
 */
package org.gravity.typegraph.basic.annotations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TText Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.annotations.TTextNode#getTText <em>TText</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage#getTTextNode()
 * @model
 * @generated
 */
public interface TTextNode extends EObject {
	/**
	 * Returns the value of the '<em><b>TText</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TText</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TText</em>' attribute.
	 * @see #setTText(String)
	 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage#getTTextNode_TText()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getTText();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.annotations.TTextNode#getTText <em>TText</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TText</em>' attribute.
	 * @see #getTText()
	 * @generated
	 */
	void setTText(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TTextNode
