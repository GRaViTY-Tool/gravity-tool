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

} // MAbstractMethodDefinition
