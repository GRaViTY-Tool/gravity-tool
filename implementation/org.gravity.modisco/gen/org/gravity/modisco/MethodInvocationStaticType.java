/**
 */
package org.gravity.modisco;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Invocation Static Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MethodInvocationStaticType#getMethodInvoc <em>Method Invoc</em>}</li>
 *   <li>{@link org.gravity.modisco.MethodInvocationStaticType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMethodInvocationStaticType()
 * @model
 * @generated
 */
public interface MethodInvocationStaticType extends EObject {
	/**
	 * Returns the value of the '<em><b>Method Invoc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Invoc</em>' reference.
	 * @see #setMethodInvoc(AbstractMethodInvocation)
	 * @see org.gravity.modisco.ModiscoPackage#getMethodInvocationStaticType_MethodInvoc()
	 * @model required="true"
	 * @generated
	 */
	AbstractMethodInvocation getMethodInvoc();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MethodInvocationStaticType#getMethodInvoc <em>Method Invoc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Invoc</em>' reference.
	 * @see #getMethodInvoc()
	 * @generated
	 */
	void setMethodInvoc(AbstractMethodInvocation value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.gravity.modisco.ModiscoPackage#getMethodInvocationStaticType_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MethodInvocationStaticType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // MethodInvocationStaticType
