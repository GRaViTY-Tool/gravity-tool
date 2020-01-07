/**
 */
package org.gravity.hulk.detection.impl;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HAntiPatternDetector;

import org.gravity.hulk.impl.HDetectorImpl;
// <-- [user defined imports]
// [user defined imports] -->
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAnti Pattern Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class HAntiPatternDetectorImpl extends HDetectorImpl implements HAntiPatternDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HAntiPatternDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DetectionPackage.Literals.HANTI_PATTERN_DETECTOR;
	}
	// <-- [user code injected with eMoflon]


	public static final TAnnotationType getAnnotationType(TypeGraph pm, String name) {
		return pm.getTAnnotationTypes().parallelStream().filter(t -> name.equals(t.getTName())).findAny()
				.orElse(null);
	}

	// [user code injected with eMoflon] -->
} //HAntiPatternDetectorImpl
