/**
 */
package org.gravity.hulk.resolve.calculators;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.resolve.HResolver;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HCluster Access Calculator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.resolve.calculators.CalculatorsPackage#getHClusterAccessCalculator()
 * @model
 * @generated
 */
public interface HClusterAccessCalculator extends HResolver {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean detect(HAntiPatternGraph apg);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HClusterAccessCalculator