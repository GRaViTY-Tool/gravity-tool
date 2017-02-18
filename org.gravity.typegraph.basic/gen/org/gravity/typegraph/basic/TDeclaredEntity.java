/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDeclared Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TDeclaredEntity#getPg <em>Pg</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TDeclaredEntity#getTVisibility <em>TVisibility</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTDeclaredEntity()
 * @model abstract="true"
 * @generated
 */
public interface TDeclaredEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Pg</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TypeGraph#getTDeclaredEntities <em>TDeclared Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pg</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pg</em>' container reference.
	 * @see #setPg(TypeGraph)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTDeclaredEntity_Pg()
	 * @see org.gravity.typegraph.basic.TypeGraph#getTDeclaredEntities
	 * @model opposite="tDeclaredEntities" resolveProxies="false" required="true" transient="false"
	 * @generated
	 */
	TypeGraph getPg();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TDeclaredEntity#getPg <em>Pg</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pg</em>' container reference.
	 * @see #getPg()
	 * @generated
	 */
	void setPg(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>TVisibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gravity.typegraph.basic.TVisibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TVisibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TVisibility</em>' attribute.
	 * @see org.gravity.typegraph.basic.TVisibility
	 * @see #setTVisibility(TVisibility)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTDeclaredEntity_TVisibility()
	 * @model required="true"
	 * @generated
	 */
	TVisibility getTVisibility();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TDeclaredEntity#getTVisibility <em>TVisibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TVisibility</em>' attribute.
	 * @see org.gravity.typegraph.basic.TVisibility
	 * @see #getTVisibility()
	 * @generated
	 */
	void setTVisibility(TVisibility value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	TDeclaredEntity getParent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TDeclaredEntity> getParents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	TPackage getPackage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TVisibility getMinimumRequiredVisibility(TDeclaredEntity tDeclaredEntity);

} // TDeclaredEntity
