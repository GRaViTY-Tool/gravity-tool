/**
 */
package org.gravity.hulk.detection.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
// <-- [user defined imports]
// [user defined imports] -->
import org.moflon.core.dfs.DFSGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HLocal
 * Method Access Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLocalMethodAccessCalculator extends HClassBasedCalculatorImpl implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HLocalMethodAccessCalculator(DFSGraph graph) {
		this.setGraph(graph);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMetric calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		final var metric = MetricsFactory.eINSTANCE.createHLocalMethodAccessesMetric();
		metric.setTAnnotated(tClass);
		this.getHAnnotation().add(metric);

		var value = 0L;
		final var methods = tClass.getDeclaredTMethodDefinitions();
		for (var i = 0; i < methods.size(); i++) {
			final var m0 = methods.get(i);
			for (var j = i + 1; j < methods.size(); j++) {
				final var m1 = methods.get(j);
				value += m0.getAccessing().parallelStream().filter(access -> access.getTarget().equals(m1)).count();
				value += m0.getAccessedBy().parallelStream().filter(access -> access.getSource().equals(m1)).count();
			}
		}
		metric.setValue(value);
		return metric;
	}

	@Override
	public String getGuiName() {
		return "Number of in Class Methodcalls";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHLocalMethodAccessesMetric();
	}

} // HLocalMethodAccessCalculatorImpl
