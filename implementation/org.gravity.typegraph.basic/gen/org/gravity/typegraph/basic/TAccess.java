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
 *   <li>{@link org.gravity.typegraph.basic.TAccess#getTTarget <em>TTarget</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TAccess#getTSource <em>TSource</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TAccess#getStaticType <em>Static Type</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTAccess()
 * @model abstract="true"
 * @generated
 */
public interface TAccess extends TAbstractFlowElement {
	/**
	 * Returns the value of the '<em><b>TTarget</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMember#getAccessedBy <em>Accessed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TTarget</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TTarget</em>' reference.
	 * @see #setTTarget(TMember)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAccess_TTarget()
	 * @see org.gravity.typegraph.basic.TMember#getAccessedBy
	 * @model opposite="accessedBy" required="true"
	 * @generated
	 */
	TMember getTTarget();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TAccess#getTTarget <em>TTarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TTarget</em>' reference.
	 * @see #getTTarget()
	 * @generated
	 */
	void setTTarget(TMember value);

	/**
	 * Returns the value of the '<em><b>TSource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMember#getTAccessing <em>TAccessing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TSource</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TSource</em>' container reference.
	 * @see #setTSource(TMember)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTAccess_TSource()
	 * @see org.gravity.typegraph.basic.TMember#getTAccessing
	 * @model opposite="tAccessing" required="true" transient="false"
	 * @generated
	 */
	TMember getTSource();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TAccess#getTSource <em>TSource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TSource</em>' container reference.
	 * @see #getTSource()
	 * @generated
	 */
	void setTSource(TMember value);

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
