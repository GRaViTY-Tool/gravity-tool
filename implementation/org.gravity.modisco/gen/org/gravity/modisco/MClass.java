/**
 */
package org.gravity.modisco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MClass#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMClass()
 * @model
 * @generated
 */
public interface MClass extends ClassDeclaration {
	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see org.gravity.modisco.ModiscoPackage#getMClass_Dependencies()
	 * @model
	 * @generated
	 */
	EList<Type> getDependencies();

} // MClass
