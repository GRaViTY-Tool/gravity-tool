/**
 */
package org.gravity.refactorings.impl;

import org.gravity.refactorings.Refactoring;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refactoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.refactorings.impl.RefactoringImpl#getPg <em>Pg</em>}</li>
 *   <li>{@link org.gravity.refactorings.impl.RefactoringImpl#getSearch <em>Search</em>}</li>
 *   <li>{@link org.gravity.refactorings.impl.RefactoringImpl#getHelpersImpl <em>HelpersImpl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RefactoringImpl implements Refactoring {
	/**
	 * The cached value of the '{@link #getPg() <em>Pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPg()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph pg;

	/**
	 * The cached value of the '{@link #getHelpersImpl() <em>HelpersImpl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpersImpl()
	 * @generated
	 * @ordered
	 */
	protected HelpersImpl helpers;

	/**
	 * Creates a new refactoring
	 * 
	 * @param programModel The program model which should be refactored
	 */
	protected RefactoringImpl(TypeGraph programModel) {
		this.pg = programModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph getPg() {
		return pg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpersImpl getHelpersImpl() {
		return helpers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelpersImpl(HelpersImpl newHelpersImpl) {
		helpers = newHelpersImpl;
	}

	// [user code injected with eMoflon] -->
} //RefactoringImpl
