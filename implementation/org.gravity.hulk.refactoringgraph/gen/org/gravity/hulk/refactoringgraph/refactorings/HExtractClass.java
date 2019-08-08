/**
 */
package org.gravity.hulk.refactoringgraph.refactorings;

import org.eclipse.emf.common.util.EList;

import org.gravity.typegraph.basic.TMember;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HExtract Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.HExtractClass#getTMembers <em>TMembers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage#getHExtractClass()
 * @model
 * @generated
 */
public interface HExtractClass extends HRefactoring {
	/**
	 * Returns the value of the '<em><b>TMembers</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TMembers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TMembers</em>' reference list.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage#getHExtractClass_TMembers()
	 * @model
	 * @generated
	 */
	EList<TMember> getTMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	double getAvgIba();
	// <-- [user code injected with eMoflon]

	public int compare(HExtractClass hExtractClass);

	// [user code injected with eMoflon] -->
} // HExtractClass
