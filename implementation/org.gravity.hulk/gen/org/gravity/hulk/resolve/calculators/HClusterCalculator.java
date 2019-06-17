/**
 */
package org.gravity.hulk.resolve.calculators;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.resolve.HResolver;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HCluster Calculator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.resolve.calculators.CalculatorsPackage#getHClusterCalculator()
 * @model
 * @generated
 */
public interface HClusterCalculator extends HResolver {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean detect(TClass tClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean detect(HAntiPatternGraph apg);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HClusterCalculator
