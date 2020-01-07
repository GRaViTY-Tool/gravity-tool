/**
 */
package org.gravity.hulk.detection.codesmells;

import org.gravity.hulk.antipatterngraph.HAnnotation;

import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HCodeSmellDetector;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HLarge Class Low Cohesion Detector</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.detection.codesmells.CodesmellsPackage#getHLargeClassLowCohesionDetector()
 * @model
 * @generated
 */
public interface HLargeClassLowCohesionDetector extends HClassBasedCalculator, HCodeSmellDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	HAnnotation calculate(TClass tClass);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HLargeClassLowCohesionDetector
