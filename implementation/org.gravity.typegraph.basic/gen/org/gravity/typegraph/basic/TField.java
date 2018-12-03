/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TField</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TField#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TField#getPg <em>Pg</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTField()
 * @model
 * @generated
 */
public interface TField extends TName {
	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TFieldSignature}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TFieldSignature#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signatures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTField_Signatures()
	 * @see org.gravity.typegraph.basic.TFieldSignature#getField
	 * @model opposite="field" containment="true"
	 * @generated
	 */
	EList<TFieldSignature> getSignatures();

	/**
	 * Returns the value of the '<em><b>Pg</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TypeGraph#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pg</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pg</em>' container reference.
	 * @see #setPg(TypeGraph)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTField_Pg()
	 * @see org.gravity.typegraph.basic.TypeGraph#getFields
	 * @model opposite="fields" required="true" transient="false"
	 * @generated
	 */
	TypeGraph getPg();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TField#getPg <em>Pg</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pg</em>' container reference.
	 * @see #getPg()
	 * @generated
	 */
	void setPg(TypeGraph value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TField
