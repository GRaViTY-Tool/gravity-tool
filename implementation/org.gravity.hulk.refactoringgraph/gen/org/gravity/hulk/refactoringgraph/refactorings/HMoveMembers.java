/**
 */
package org.gravity.hulk.refactoringgraph.refactorings;

import org.eclipse.emf.common.util.EList;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HMove Members</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers#getHMoveMembers <em>HMove Members</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers#getSourceClass <em>Source Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage#getHMoveMembers()
 * @model
 * @generated
 */
public interface HMoveMembers extends HRefactoring {
	/**
	 * Returns the value of the '<em><b>HMove Members</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HMove Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HMove Members</em>' reference list.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage#getHMoveMembers_HMoveMembers()
	 * @model
	 * @generated
	 */
	EList<HMoveMember> getHMoveMembers();

	/**
	 * Returns the value of the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Class</em>' reference.
	 * @see #setTargetClass(TClass)
	 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage#getHMoveMembers_TargetClass()
	 * @model
	 * @generated
	 */
	TClass getTargetClass();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers#getTargetClass <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class</em>' reference.
	 * @see #getTargetClass()
	 * @generated
	 */
	void setTargetClass(TClass value);

	/**
	 * Returns the value of the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Class</em>' reference.
	 * @see #setSourceClass(TClass)
	 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage#getHMoveMembers_SourceClass()
	 * @model
	 * @generated
	 */
	TClass getSourceClass();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers#getSourceClass <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Class</em>' reference.
	 * @see #getSourceClass()
	 * @generated
	 */
	void setSourceClass(TClass value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HMoveMembers
