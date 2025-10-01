/**
 */
package org.gravity.hulk.detection.metrics.impl;

// <-- [user defined imports]
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.moflon.core.dfs.DFSGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HEfferent Coupling
 * Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HEfferentCouplingCalculator extends HClassBasedCalculatorImpl implements HMetricCalculator {

	private static final Logger LOGGER = Logger.getLogger(HEfferentCouplingCalculator.class);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HEfferentCouplingCalculator(final DFSGraph graph) {
		this.setGraph(graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMetric calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		final var metric = MetricsFactory.eINSTANCE.createHEfferentCouplingMetric();
		metric.setTAnnotated(tClass);
		metric.setValue(this.calculateValue(tClass));
		this.getHAnnotation().add(metric);
		return metric;
	}

	public double calculateValue(final TClass tClass) {

		final var accessedClasses = new ArrayList<TAbstractType>();
		for (final TMember m : tClass.getDefines()) {
			for (final TAccess t : m.getAccessing()) {
				final var tTarget = t.getTarget();
				if (tTarget == null) {
					LOGGER.warn(
							"Member within Class " + tClass.getTName() + " accesses an TAccess without Target");
					continue;
				}
				final var definingClass = tTarget.getDefinedBy();
				if (definingClass == null) {
					LOGGER.warn(
							"Member within Class " + tClass.getTName() + " accesses a Target without defining Class");
					continue;
				}
				if (!tTarget.getDefinedBy().equals(tClass) && !accessedClasses.contains(tTarget.getDefinedBy())) {
					accessedClasses.add(definingClass);
				}
			}
		}
		return accessedClasses.size();

	}

	@Override
	public String getGuiName() {
		return "Efferent Coupling";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHEfferentCouplingMetric();
	}

} // HEfferentCouplingCalculatorImpl
