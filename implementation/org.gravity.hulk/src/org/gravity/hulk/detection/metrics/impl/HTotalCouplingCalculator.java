/**
 */
package org.gravity.hulk.detection.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.moflon.core.dfs.DFSGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTotal Coupling
 * Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HTotalCouplingCalculator extends HClassBasedCalculatorImpl implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param graph
	 *
	 * @generated
	 */
	public HTotalCouplingCalculator(final DFSGraph graph) {
		this.setGraph(graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public HMetric calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		final var metric = MetricsFactory.eINSTANCE.createHTotalCouplingMetric();
		metric.setTAnnotated(tClass);
		metric.setValue(this.calculateValue(tClass));
		this.getHAnnotation().add(metric);
		return metric;
	}

	public double calculateValue(final TClass tClass) {
		// [user code injected with eMoflon]

		var coupling = 0D;

		for (final TMember m : tClass.getDefines()) {
			for (final TAccess access : m.getAccessedBy()) {
				if (access.getSource().getDefinedBy() != tClass) {
					coupling++;
				}
			}

			for (final TAccess access : m.getAccessing()) {
				final var target = access.getTarget().getDefinedBy();
				if (!target.isTLib() && (target != tClass) && !target.getTName().equals("T")) {
					coupling++;
				}
			}
		}
		return coupling;

	}

	@Override
	public String getGuiName() {
		return "Total Coupling";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHTotalCouplingMetric();
	}

} // HTotalCouplingCalculatorImpl
