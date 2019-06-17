/**
 */
package org.gravity.hulk.detection.codesmells;

import org.gravity.hulk.antipatterngraph.HAnnotation;

import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.HCodeSmellDetector;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodDefinition;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HGetter Setter Detector</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.hulk.detection.codesmells.CodesmellsPackage#getHGetterSetterDetector()
 * @model
 * @generated
 */
public interface HGetterSetterDetector extends HCodeSmellDetector, HClassBasedCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isGetterSetter(TMethodDefinition method);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	HAnnotation calculate(TClass tClass);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HGetterSetterDetector
