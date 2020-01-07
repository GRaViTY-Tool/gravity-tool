/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.BodyDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MDefinition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MDefinition#getInvocationStaticTypes <em>Invocation Static Types</em>}</li>
 *   <li>{@link org.gravity.modisco.MDefinition#getMMethodInvocations <em>MMethod Invocations</em>}</li>
 *   <li>{@link org.gravity.modisco.MDefinition#getMAbstractFieldAccess <em>MAbstract Field Access</em>}</li>
 *   <li>{@link org.gravity.modisco.MDefinition#getMSignature <em>MSignature</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMDefinition()
 * @model abstract="true"
 * @generated
 */
public interface MDefinition extends BodyDeclaration, MAbstractFlowElement {
	/**
	 * Returns the value of the '<em><b>Invocation Static Types</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MethodInvocationStaticType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocation Static Types</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMDefinition_InvocationStaticTypes()
	 * @model
	 * @generated
	 */
	EList<MethodInvocationStaticType> getInvocationStaticTypes();

	/**
	 * Returns the value of the '<em><b>MMethod Invocations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.AbstractMethodInvocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMethod Invocations</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMDefinition_MMethodInvocations()
	 * @model
	 * @generated
	 */
	EList<AbstractMethodInvocation> getMMethodInvocations();

	/**
	 * Returns the value of the '<em><b>MAbstract Field Access</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MSingleVariableAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAbstract Field Access</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMDefinition_MAbstractFieldAccess()
	 * @model
	 * @generated
	 */
	EList<MSingleVariableAccess> getMAbstractFieldAccess();

	/**
	 * Returns the value of the '<em><b>MSignature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MSignature#getMDefinitions <em>MDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSignature</em>' reference.
	 * @see #setMSignature(MSignature)
	 * @see org.gravity.modisco.ModiscoPackage#getMDefinition_MSignature()
	 * @see org.gravity.modisco.MSignature#getMDefinitions
	 * @model opposite="mDefinitions"
	 * @generated
	 */
	MSignature getMSignature();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MDefinition#getMSignature <em>MSignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSignature</em>' reference.
	 * @see #getMSignature()
	 * @generated
	 */
	void setMSignature(MSignature value);

} // MDefinition
