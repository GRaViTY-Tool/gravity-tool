/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.modisco.java.MethodDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMethod Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MMethodDefinition#getSyntheticMethodDefinitions <em>Synthetic Method Definitions</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMMethodDefinition()
 * @model
 * @generated
 */
public interface MMethodDefinition extends MethodDeclaration, MAbstractMethodDefinition {
	/**
	 * Returns the value of the '<em><b>Synthetic Method Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.modisco.MSyntheticMethodDefinition}.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MSyntheticMethodDefinition#getOriginalMethodDefinition <em>Original Method Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthetic Method Definitions</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMMethodDefinition_SyntheticMethodDefinitions()
	 * @see org.gravity.modisco.MSyntheticMethodDefinition#getOriginalMethodDefinition
	 * @model opposite="originalMethodDefinition"
	 * @generated
	 */
	EList<MSyntheticMethodDefinition> getSyntheticMethodDefinitions();

} // MMethodDefinition
