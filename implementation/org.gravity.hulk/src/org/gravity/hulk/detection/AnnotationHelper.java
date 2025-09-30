/**
 */
package org.gravity.hulk.detection;

import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAnti Pattern
 * Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationHelper {
	
	public static final TAnnotationType getAnnotationType(final TypeGraph pm, final String name) {
		return pm.getAnnotationTypes().parallelStream().filter(t -> name.equals(t.getTName())).findAny()
				.orElse(null);
	}

	// [user code injected with eMoflon] -->
} // HAntiPatternDetectorImpl
