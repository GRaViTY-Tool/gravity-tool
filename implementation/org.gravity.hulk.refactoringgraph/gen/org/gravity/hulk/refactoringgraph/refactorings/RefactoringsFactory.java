/**
 */
package org.gravity.hulk.refactoringgraph.refactorings;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage
 * @generated
 */
public interface RefactoringsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefactoringsFactory eINSTANCE = org.gravity.hulk.refactoringgraph.refactorings.impl.RefactoringsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HMove Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMove Method</em>'.
	 * @generated
	 */
	HMoveMethod createHMoveMethod();

	/**
	 * Returns a new object of class '<em>HExtract Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HExtract Class</em>'.
	 * @generated
	 */
	HExtractClass createHExtractClass();

	/**
	 * Returns a new object of class '<em>HMove Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMove Field</em>'.
	 * @generated
	 */
	HMoveField createHMoveField();

	/**
	 * Returns a new object of class '<em>HMove Members</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMove Members</em>'.
	 * @generated
	 */
	HMoveMembers createHMoveMembers();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RefactoringsPackage getRefactoringsPackage();

} //RefactoringsFactory
