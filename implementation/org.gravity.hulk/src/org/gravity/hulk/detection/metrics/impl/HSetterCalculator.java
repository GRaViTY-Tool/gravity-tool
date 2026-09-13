/**
 */
package org.gravity.hulk.detection.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.AbstractClassBasedCalculator;
import org.gravity.hulk.detection.helpers.GetterSetterHelper;
import org.gravity.hulk.detection.metrics.HMetricCalculator;
import org.gravity.typegraph.basic.TClass;
import org.moflon.core.dfs.DFSGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HSetter
 * Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HSetterCalculator extends AbstractClassBasedCalculator implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HSetterCalculator(final DFSGraph graph) {
		this.setGraph(graph);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public HMetric calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		final var metric = MetricsFactory.eINSTANCE.createHSetterMetric();
		metric.setTAnnotated(tClass);
		metric.setValue(GetterSetterHelper.countMethodsStartingWithName(tClass, "set"));
		this.getHAnnotation().add(metric);
		return metric;
	}

	@Override
	public String getGuiName() {
		return "Number of Setter Methods";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHSetterMetric();
	}

} // HSetterCalculatorImpl
