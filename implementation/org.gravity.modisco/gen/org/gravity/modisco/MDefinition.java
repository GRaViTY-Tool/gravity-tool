/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MDefinition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MDefinition#getMMethodInvocations <em>MMethod Invocations</em>}</li>
 *   <li>{@link org.gravity.modisco.MDefinition#getMAbstractFieldAccess <em>MAbstract Field Access</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMDefinition()
 * @model abstract="true"
 * @generated
 */
public interface MDefinition extends BodyDeclaration {
	/**
	 * Returns the value of the '<em><b>MMethod Invocations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.java.AbstractMethodInvocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMethod Invocations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMethod Invocations</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMDefinition_MMethodInvocations()
	 * @model
	 * @generated
	 */
	EList<AbstractMethodInvocation> getMMethodInvocations();

	/**
	 * Returns the value of the '<em><b>MAbstract Field Access</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.java.SingleVariableAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MAbstract Field Access</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAbstract Field Access</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMDefinition_MAbstractFieldAccess()
	 * @model
	 * @generated
	 */
	EList<SingleVariableAccess> getMAbstractFieldAccess();

} // MDefinition
