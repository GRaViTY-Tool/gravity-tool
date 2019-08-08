/**
 */
package org.gravity.hulk.antipatterngraph.codesmells;

import org.gravity.hulk.antipatterngraph.HCodeSmell;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HLarge Class Low Cohesion Smell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell#getHLowCohesionSmell <em>HLow Cohesion Smell</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell#getHLargeClassSmell <em>HLarge Class Smell</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHLargeClassLowCohesionSmell()
 * @model
 * @generated
 */
public interface HLargeClassLowCohesionSmell extends HCodeSmell {
	/**
	 * Returns the value of the '<em><b>HLow Cohesion Smell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HLow Cohesion Smell</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HLow Cohesion Smell</em>' reference.
	 * @see #setHLowCohesionSmell(HLowCohesionSmell)
	 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHLargeClassLowCohesionSmell_HLowCohesionSmell()
	 * @model
	 * @generated
	 */
	HLowCohesionSmell getHLowCohesionSmell();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell#getHLowCohesionSmell <em>HLow Cohesion Smell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HLow Cohesion Smell</em>' reference.
	 * @see #getHLowCohesionSmell()
	 * @generated
	 */
	void setHLowCohesionSmell(HLowCohesionSmell value);

	/**
	 * Returns the value of the '<em><b>HLarge Class Smell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HLarge Class Smell</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HLarge Class Smell</em>' reference.
	 * @see #setHLargeClassSmell(HLargeClassSmell)
	 * @see org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage#getHLargeClassLowCohesionSmell_HLargeClassSmell()
	 * @model
	 * @generated
	 */
	HLargeClassSmell getHLargeClassSmell();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell#getHLargeClassSmell <em>HLarge Class Smell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HLarge Class Smell</em>' reference.
	 * @see #getHLargeClassSmell()
	 * @generated
	 */
	void setHLargeClassSmell(HLargeClassSmell value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HLargeClassLowCohesionSmell
