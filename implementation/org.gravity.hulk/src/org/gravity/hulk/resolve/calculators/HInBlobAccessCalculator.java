/**
 */
package org.gravity.hulk.resolve.calculators;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.detection.HMetricCalculator;

import org.gravity.hulk.resolve.HResolver;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HIn Blob Access Calculator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.resolve.calculators.CalculatorsPackage#getHInBlobAccessCalculator()
 * @model
 * @generated
 */
public interface HInBlobAccessCalculator extends HMetricCalculator, HResolver {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean detect(HAntiPatternGraph apg);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HInBlobAccessCalculator
