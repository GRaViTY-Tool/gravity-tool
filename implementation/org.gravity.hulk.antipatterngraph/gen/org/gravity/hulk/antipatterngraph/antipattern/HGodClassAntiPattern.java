/**
 */
package org.gravity.hulk.antipatterngraph.antipattern;

import org.eclipse.emf.common.util.EList;
import org.gravity.hulk.antipatterngraph.HAntiPattern;

import org.gravity.hulk.antipatterngraph.HCodeSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HGod Class Anti Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern#getHLargeClassLowCohesionSmells <em>HLarge Class Low Cohesion Smells</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern#getHControllerClassSmell <em>HController Class Smell</em>}</li>
 * </ul>
 *
 * @see org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage#getHGodClassAntiPattern()
 * @model
 * @generated
 */
public interface HGodClassAntiPattern extends HAntiPattern {
	/**
	 * Returns the value of the '<em><b>HLarge Class Low Cohesion Smells</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.hulk.antipatterngraph.HCodeSmell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HLarge Class Low Cohesion Smells</em>' reference list.
	 * @see org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage#getHGodClassAntiPattern_HLargeClassLowCohesionSmells()
	 * @model
	 * @generated
	 */
	EList<HCodeSmell> getHLargeClassLowCohesionSmells();

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
