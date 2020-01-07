/**
 */
package org.gravity.hulk.refactoringgraph;

import org.eclipse.emf.common.util.EList;

import org.gravity.hulk.antipatterngraph.HAnnotation;

import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;

import org.gravity.hulk.refactoringgraph.refactorings.HMoveMember;
import org.gravity.hulk.refactoringgraph.refactorings.HRefactoring;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HBlob Resolve Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation#getHBlobAntiPattern <em>HBlob Anti Pattern</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation#getHMoves <em>HMoves</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation#getHRefactorings <em>HRefactorings</em>}</li>
 * </ul>
 *
 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage#getHBlobResolveAnnotation()
 * @model
 * @generated
 */
public interface HBlobResolveAnnotation extends HAnnotation {
	/**
	 * Returns the value of the '<em><b>HBlob Anti Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HBlob Anti Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HBlob Anti Pattern</em>' reference.
	 * @see #setHBlobAntiPattern(HBlobAntiPattern)
	 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage#getHBlobResolveAnnotation_HBlobAntiPattern()
	 * @model
	 * @generated
	 */
	HBlobAntiPattern getHBlobAntiPattern();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation#getHBlobAntiPattern <em>HBlob Anti Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HBlob Anti Pattern</em>' reference.
	 * @see #getHBlobAntiPattern()
	 * @generated
	 */
	void setHBlobAntiPattern(HBlobAntiPattern value);

	/**
	 * Returns the value of the '<em><b>HMoves</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HMoves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HMoves</em>' reference list.
	 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage#getHBlobResolveAnnotation_HMoves()
	 * @model
	 * @generated
	 */
	EList<HMoveMember> getHMoves();

	/**
	 * Returns the value of the '<em><b>HRefactorings</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.hulk.refactoringgraph.refactorings.HRefactoring}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HRefactorings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HRefactorings</em>' reference list.
	 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage#getHBlobResolveAnnotation_HRefactorings()
	 * @model
	 * @generated
	 */
	EList<HRefactoring> getHRefactorings();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HBlobResolveAnnotation
