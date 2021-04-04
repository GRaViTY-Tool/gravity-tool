/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.AbstractTypeDeclaration;

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
 *   <li>{@link org.gravity.modisco.MAbstractMethodDefinition#getDefinedBy <em>Defined By</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMAbstractMethodDefinition()
 * @model abstract="true"
 * @generated
 */
public interface MAbstractMethodDefinition extends MDefinition, AbstractMethodDeclaration {
	/**
	 * Returns the value of the '<em><b>MInner Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.AbstractTypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MInner Types</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMAbstractMethodDefinition_MInnerTypes()
	 * @model
	 * @generated
	 */
	EList<AbstractTypeDeclaration> getMInnerTypes();

	/**
	 * Returns the value of the '<em><b>Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined By</em>' reference.
	 * @see #setDefinedBy(ASTNode)
	 * @see org.gravity.modisco.ModiscoPackage#getMAbstractMethodDefinition_DefinedBy()
	 * @model derived="true"
	 * @generated
	 */
	ASTNode getDefinedBy();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MAbstractMethodDefinition#getDefinedBy <em>Defined By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined By</em>' reference.
	 * @see #getDefinedBy()
	 * @generated
	 */
	void setDefinedBy(ASTNode value);

} // MAbstractMethodDefinition
