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
 *   <li>{@link org.gravity.typegraph.basic.TField#getModel <em>Model</em>}</li>
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
	 * @model opposite="field" containment="true" ordered="false"
	 * @generated
	 */
	EList<TFieldSignature> getSignatures();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TypeGraph#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(TypeGraph)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTField_Model()
	 * @see org.gravity.typegraph.basic.TypeGraph#getFields
	 * @model opposite="fields" required="true" transient="false"
	 * @generated
	 */
	TypeGraph getModel();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TField#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(TypeGraph value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TField
