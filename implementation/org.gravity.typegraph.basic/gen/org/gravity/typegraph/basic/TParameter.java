/**
 */
package org.gravity.typegraph.basic;

import org.gravity.typegraph.basic.annotations.TAnnotatable;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TParameter#getNext <em>Next</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TParameter#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TParameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTParameter()
 * @model
 * @generated
 */
public interface TParameter extends TAnnotatable, TAbstractFlowElement {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TParameter#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(TParameter)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTParameter_Next()
	 * @see org.gravity.typegraph.basic.TParameter#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	TParameter getNext();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TParameter#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(TParameter value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TParameter#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(TParameter)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTParameter_Previous()
	 * @see org.gravity.typegraph.basic.TParameter#getNext
	 * @model opposite="next"
	 * @generated
	 */
	TParameter getPrevious();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TParameter#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(TParameter value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TAbstractType)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	TAbstractType getType();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TParameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TAbstractType value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TParameter
