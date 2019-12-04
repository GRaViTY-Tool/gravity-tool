/**
 */
package org.gravity.hulk.detection;

import org.gravity.hulk.HDetector;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HClass Based Calculator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.detection.DetectionPackage#getHClassBasedCalculator()
 * @model abstract="true"
 * @generated
 */
public interface HClassBasedCalculator extends HDetector {
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
	boolean detect(HAntiPatternGraph pg);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HClassBasedCalculator
