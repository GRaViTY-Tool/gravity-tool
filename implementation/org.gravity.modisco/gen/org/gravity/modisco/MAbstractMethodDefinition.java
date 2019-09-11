/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAbstract Method Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MAbstractMethodDefinition#getMInnerTypes <em>MInner Types</em>}</li>
 *   <li>{@link org.gravity.modisco.MAbstractMethodDefinition#getMMethodName <em>MMethod Name</em>}</li>
 *   <li>{@link org.gravity.modisco.MAbstractMethodDefinition#getMMethodSignature <em>MMethod Signature</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMAbstractMethodDefinition()
 * @model abstract="true"
 * @generated
 */
public interface MAbstractMethodDefinition extends MDefinition, AbstractMethodDeclaration {
	/**
	 * Returns the value of the '<em><b>MInner Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.java.AbstractTypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MInner Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MInner Types</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMAbstractMethodDefinition_MInnerTypes()
	 * @model
	 * @generated
	 */
	EList<AbstractTypeDeclaration> getMInnerTypes();

	/**
	 * Returns the value of the '<em><b>MMethod Name</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MMethodName#getMMethodDefinitions <em>MMethod Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMethod Name</em>' reference.
	 * @see #setMMethodName(MMethodName)
	 * @see org.gravity.modisco.ModiscoPackage#getMAbstractMethodDefinition_MMethodName()
	 * @see org.gravity.modisco.MMethodName#getMMethodDefinitions
	 * @model opposite="mMethodDefinitions" required="true"
	 * @generated
	 */
	MMethodName getMMethodName();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MAbstractMethodDefinition#getMMethodName <em>MMethod Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMethod Name</em>' reference.
	 * @see #getMMethodName()
	 * @generated
	 */
	void setMMethodName(MMethodName value);

	/**
	 * Returns the value of the '<em><b>MMethod Signature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MMethodSignature#getMMethodDefinitions <em>MMethod Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMethod Signature</em>' reference.
	 * @see #setMMethodSignature(MMethodSignature)
	 * @see org.gravity.modisco.ModiscoPackage#getMAbstractMethodDefinition_MMethodSignature()
	 * @see org.gravity.modisco.MMethodSignature#getMMethodDefinitions
	 * @model opposite="mMethodDefinitions" required="true"
	 * @generated
	 */
	MMethodSignature getMMethodSignature();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MAbstractMethodDefinition#getMMethodSignature <em>MMethod Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMethod Signature</em>' reference.
	 * @see #getMMethodSignature()
	 * @generated
	 */
	void setMMethodSignature(MMethodSignature value);

} // MAbstractMethodDefinition
