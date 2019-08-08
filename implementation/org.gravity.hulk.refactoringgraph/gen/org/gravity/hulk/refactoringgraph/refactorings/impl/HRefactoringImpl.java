/**
 */
package org.gravity.hulk.refactoringgraph.refactorings.impl;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.impl.HMetricImpl;

import org.gravity.hulk.refactoringgraph.refactorings.HRefactoring;
import org.gravity.hulk.refactoringgraph.refactorings.RefactoringsPackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HRefactoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class HRefactoringImpl extends HMetricImpl implements HRefactoring {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HRefactoringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringsPackage.Literals.HREFACTORING;
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //HRefactoringImpl
