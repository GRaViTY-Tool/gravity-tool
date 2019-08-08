/**
 */
package org.gravity.hulk.antipatterngraph.antipattern;

import org.gravity.hulk.antipatterngraph.HAntiPattern;

import org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassLowCohesionSmell;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HGod Class Anti Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern#getHLargeClassLowCohesionSmell <em>HLarge Class Low Cohesion Smell</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern#getHControllerClassSmell <em>HController Class Smell</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage#getHGodClassAntiPattern()
 * @model
 * @generated
 */
public interface HGodClassAntiPattern extends HAntiPattern {
	/**
	 * Returns the value of the '<em><b>HLarge Class Low Cohesion Smell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HLarge Class Low Cohesion Smell</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HLarge Class Low Cohesion Smell</em>' reference.
	 * @see #setHLargeClassLowCohesionSmell(HLargeClassLowCohesionSmell)
	 * @see org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage#getHGodClassAntiPattern_HLargeClassLowCohesionSmell()
	 * @model
	 * @generated
	 */
	HLargeClassLowCohesionSmell getHLargeClassLowCohesionSmell();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern#getHLargeClassLowCohesionSmell <em>HLarge Class Low Cohesion Smell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HLarge Class Low Cohesion Smell</em>' reference.
	 * @see #getHLargeClassLowCohesionSmell()
	 * @generated
	 */
	void setHLargeClassLowCohesionSmell(HLargeClassLowCohesionSmell value);

	/**
	 * Returns the value of the '<em><b>HController Class Smell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HController Class Smell</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HController Class Smell</em>' reference.
	 * @see #setHControllerClassSmell(HControllerClassSmell)
	 * @see org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage#getHGodClassAntiPattern_HControllerClassSmell()
	 * @model
	 * @generated
	 */
	HControllerClassSmell getHControllerClassSmell();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern#getHControllerClassSmell <em>HController Class Smell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HController Class Smell</em>' reference.
	 * @see #getHControllerClassSmell()
	 * @generated
	 */
	void setHControllerClassSmell(HControllerClassSmell value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HGodClassAntiPattern
