/**
 */
package org.gravity.hulk.refactoringgraph;

import org.gravity.hulk.antipatterngraph.HMetric;

import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HMethod To Data Class Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess#getHDataClassSmell <em>HData Class Smell</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess#getHDataClass <em>HData Class</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess#getTMethodDefinition <em>TMethod Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage#getHMethodToDataClassAccess()
 * @model
 * @generated
 */
public interface HMethodToDataClassAccess extends HMetric {
	/**
	 * Returns the value of the '<em><b>HData Class Smell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HData Class Smell</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HData Class Smell</em>' reference.
	 * @see #setHDataClassSmell(HDataClassSmell)
	 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage#getHMethodToDataClassAccess_HDataClassSmell()
	 * @model
	 * @generated
	 */
	HDataClassSmell getHDataClassSmell();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess#getHDataClassSmell <em>HData Class Smell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HData Class Smell</em>' reference.
	 * @see #getHDataClassSmell()
	 * @generated
	 */
	void setHDataClassSmell(HDataClassSmell value);

	/**
	 * Returns the value of the '<em><b>HData Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HData Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HData Class</em>' reference.
	 * @see #setHDataClass(TClass)
	 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage#getHMethodToDataClassAccess_HDataClass()
	 * @model
	 * @generated
	 */
	TClass getHDataClass();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess#getHDataClass <em>HData Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HData Class</em>' reference.
	 * @see #getHDataClass()
	 * @generated
	 */
	void setHDataClass(TClass value);

	/**
	 * Returns the value of the '<em><b>TMethod Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TMethod Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TMethod Definition</em>' reference.
	 * @see #setTMethodDefinition(TMember)
	 * @see org.gravity.hulk.refactoringgraph.RefactoringgraphPackage#getHMethodToDataClassAccess_TMethodDefinition()
	 * @model
	 * @generated
	 */
	TMember getTMethodDefinition();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess#getTMethodDefinition <em>TMethod Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TMethod Definition</em>' reference.
	 * @see #getTMethodDefinition()
	 * @generated
	 */
	void setTMethodDefinition(TMember value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	HRelativeValue getRelativeAmount();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HMethodToDataClassAccess
