/**
 */
package org.gravity.typegraph.basic.annotations;

import org.eclipse.emf.ecore.EObject;
import org.gravity.typegraph.basic.TAbstractType;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TClass Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.annotations.TClassNode#getTClass <em>TClass</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage#getTClassNode()
 * @model
 * @generated
 */
public interface TClassNode extends EObject {
	/**
	 * Returns the value of the '<em><b>TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TClass</em>' reference.
	 * @see #setTClass(TAbstractType)
	 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage#getTClassNode_TClass()
	 * @model
	 * @generated
	 */
	TAbstractType getTClass();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.annotations.TClassNode#getTClass <em>TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TClass</em>' reference.
	 * @see #getTClass()
	 * @generated
	 */
	void setTClass(TAbstractType value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TClassNode
