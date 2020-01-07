/**
 */
package org.gravity.modisco;

import org.eclipse.modisco.java.MethodInvocation;
import org.eclipse.modisco.java.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMethod Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MMethodInvocation#getMStaticType <em>MStatic Type</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMMethodInvocation()
 * @model
 * @generated
 */
public interface MMethodInvocation extends MethodInvocation, MAbstractFlowElement, MAbstractMethodInvocation {
	/**
	 * Returns the value of the '<em><b>MStatic Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MStatic Type</em>' reference.
	 * @see #setMStaticType(Type)
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodInvocation_MStaticType()
	 * @model
	 * @generated
	 */
	Type getMStaticType();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MMethodInvocation#getMStaticType <em>MStatic Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MStatic Type</em>' reference.
	 * @see #getMStaticType()
	 * @generated
	 */
	void setMStaticType(Type value);

} // MMethodInvocation
