/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TClass Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TClassEntity#getTClass <em>TClass</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTClassEntity()
 * @model
 * @generated
 */
public interface TClassEntity extends EObject, TDeclaredEntity {
	/**
	 * Returns the value of the '<em><b>TClass</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TClass#getTClassEntity <em>TClass Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TClass</em>' reference.
	 * @see #setTClass(TClass)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTClassEntity_TClass()
	 * @see org.gravity.typegraph.basic.TClass#getTClassEntity
	 * @model opposite="tClassEntity" required="true"
	 * @generated
	 */
	TClass getTClass();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TClassEntity#getTClass <em>TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TClass</em>' reference.
	 * @see #getTClass()
	 * @generated
	 */
	void setTClass(TClass value);

} // TClassEntity
