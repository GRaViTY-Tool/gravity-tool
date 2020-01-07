/**
 */
package org.gravity.hulk.detection.antipattern;

import org.gravity.hulk.antipatterngraph.HAnnotation;

import org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern;

import org.gravity.hulk.detection.HAntiPatternDetector;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.typegraph.basic.TClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HSpaghetti Code Detector</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.detection.antipattern.AntipatternPackage#getHSpaghettiCodeDetector()
 * @model
 * @generated
 */
public interface HSpaghettiCodeDetector extends HClassBasedCalculator, HAntiPatternDetector {
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
	boolean collect(HAnnotation hAnnotation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean connect(HSpaghettiCodeAntiPattern hAntiPattern);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HSpaghettiCodeDetector
