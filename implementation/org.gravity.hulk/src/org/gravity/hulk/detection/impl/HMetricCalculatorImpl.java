/**
 */
package org.gravity.hulk.detection.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.HTotalVisibilityMetric;
import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.impl.HDetectorImpl;
// <-- [user defined imports]
// [user defined imports] -->
import org.gravity.typegraph.basic.annotations.TAnnotatable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMetric Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class HMetricCalculatorImpl extends HDetectorImpl implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMetricCalculatorImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DetectionPackage.Literals.HMETRIC_CALCULATOR;
	}
	// <-- [user code injected with eMoflon]

	/**
	 * @param annotateable
	 * @param value
	 */
	public void addMetric(final TAnnotatable annotateable, final EClass type, final int value) {
		HMetric metric = null;
		final var existingMetrics = annotateable.getTAnnotation(type);
		if(!existingMetrics.isEmpty()) {
			metric = (HTotalVisibilityMetric) existingMetrics.remove(0);
			annotateable.getTAnnotation().removeAll(existingMetrics);
			EcoreUtil.deleteAll(existingMetrics, true);
		}
		if(metric == null) {
			metric = (HMetric) type.getEPackage().getEFactoryInstance().create(type);
			metric.setTAnnotated(annotateable);
			getHAnnotation().add(metric);
		}
		metric.setValue(value);
	}

	// [user code injected with eMoflon] -->
} //HMetricCalculatorImpl
