/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.ecore.EObject;

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
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTAccess()
 * @model
 * @generated
 */
public interface TAccess extends EObject {
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
	 * @model opposite="tAccessing" resolveProxies="false" required="true" transient="false"
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

} // TAccess
