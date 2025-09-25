/**
 */
package org.gravity.hulk.detection.codesmells;

import org.gravity.hulk.antipatterngraph.HAnnotation;

import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HCodeSmellDetector;
import org.gravity.hulk.detection.HRelativeDetector;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HIntense Field Usage Detector</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.detection.codesmells.CodesmellsPackage#getHIntenseFieldUsageDetector()
 * @model
 * @generated
 */
public interface HIntenseFieldUsageDetector extends HCodeSmellDetector, HClassBasedCalculator, HRelativeDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	HAnnotation calculate(TClass tClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double calculateRelativeThreshold(HRelativeValueConstants level);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HIntenseFieldUsageDetector
