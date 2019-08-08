/**
 */
package org.gravity.hulk.refactoringgraph.refactorings;

import org.eclipse.emf.common.util.EList;

import org.gravity.hulk.refactoringgraph.HInBlobAccess;
import org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TSignature;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HMove Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getM2dc <em>M2dc</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getIba <em>Iba</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getTSignature <em>TSignature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage#getHMoveMember()
 * @model abstract="true"
 * @generated
 */
public interface HMoveMember extends HRefactoring {
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
	 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage#getHMoveMember_SourceClass()
	 * @model required="true"
	 * @generated
	 */
	TClass getSourceClass();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getSourceClass <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Class</em>' reference.
	 * @see #getSourceClass()
	 * @generated
	 */
	void setSourceClass(TClass value);

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
	 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage#getHMoveMember_TargetClass()
	 * @model required="true"
	 * @generated
	 */
	TClass getTargetClass();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getTargetClass <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class</em>' reference.
	 * @see #getTargetClass()
	 * @generated
	 */
	void setTargetClass(TClass value);

	/**
	 * Returns the value of the '<em><b>M2dc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M2dc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M2dc</em>' reference.
	 * @see #setM2dc(HMethodToDataClassAccess)
	 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage#getHMoveMember_M2dc()
	 * @model required="true"
	 * @generated
	 */
	HMethodToDataClassAccess getM2dc();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getM2dc <em>M2dc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M2dc</em>' reference.
	 * @see #getM2dc()
	 * @generated
	 */
	void setM2dc(HMethodToDataClassAccess value);

	/**
	 * Returns the value of the '<em><b>Iba</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iba</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iba</em>' reference.
	 * @see #setIba(HInBlobAccess)
	 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage#getHMoveMember_Iba()
	 * @model required="true"
	 * @generated
	 */
	HInBlobAccess getIba();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember#getIba <em>Iba</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iba</em>' reference.
	 * @see #getIba()
	 * @generated
	 */
	void setIba(HInBlobAccess value);

	/**
	 * Returns the value of the '<em><b>TSignature</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TSignature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TSignature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TSignature</em>' reference list.
	 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage#getHMoveMember_TSignature()
	 * @model
	 * @generated
	 */
	EList<TSignature> getTSignature();
	// <-- [user code injected with eMoflon]

	int compare(HMoveMember arg0);

	// [user code injected with eMoflon] -->
} // HMoveMember
