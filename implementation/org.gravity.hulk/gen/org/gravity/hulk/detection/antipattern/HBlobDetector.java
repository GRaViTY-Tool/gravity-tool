/**
 */
package org.gravity.hulk.detection.antipattern;

import org.gravity.hulk.antipatterngraph.HAnnotation;

import org.gravity.hulk.detection.HAntiPatternDetector;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HBlob Detector</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.detection.antipattern.AntipatternPackage#getHBlobDetector()
 * @model
 * @generated
 */
public interface HBlobDetector extends HAntiPatternDetector, HClassBasedCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	HAnnotation calculate(TClass tClass);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HBlobDetector
