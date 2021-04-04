/**
 */
package org.gravity.typegraph.basic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAccess</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TAccess#getTarget <em>Target</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TAccess#getSource <em>Source</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TAccess#getStaticType <em>Static Type</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTAccess()
 * @model abstract="true"
 * @generated
 */
public interface TAccess extends TAbstractFlowElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMember#getAccessedBy <em>Accessed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TMember)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAccess_Target()
	 * @see org.gravity.typegraph.basic.TMember#getAccessedBy
	 * @model opposite="accessedBy" required="true"
	 * @generated
	 */
	TMember getTarget();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TAccess#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TMember value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMember#getAccessing <em>Accessing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(TMember)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAccess_Source()
	 * @see org.gravity.typegraph.basic.TMember#getAccessing
	 * @model opposite="accessing" required="true" transient="false"
	 * @generated
	 */
	TMember getSource();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TAccess#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TMember value);

	/**
	 * Returns the value of the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Type</em>' reference.
	 * @see #setStaticType(TAbstractType)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAccess_StaticType()
	 * @model
	 * @generated
	 */
	TAbstractType getStaticType();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TAccess#getStaticType <em>Static Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Type</em>' reference.
	 * @see #getStaticType()
	 * @generated
	 */
	void setStaticType(TAbstractType value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TAccess
