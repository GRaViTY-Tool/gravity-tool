/**
 */
package org.gravity.hulk.detection.metrics.impl;

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
 * An implementation of the model object '<em><b>HAfferent Coupling
 * Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HAfferentCouplingCalculator extends HClassBasedCalculatorImpl implements HMetricCalculator {
	private static final Logger LOGGER = Logger.getLogger(HAfferentCouplingCalculator.class);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HAfferentCouplingCalculator(final DFSGraph graph) {
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
		final var metric = MetricsFactory.eINSTANCE.createHAfferentCouplingMetric();
		metric.setTAnnotated(tClass);
		metric.setValue(this.calculateValue(tClass));
		this.getHAnnotation().add(metric);
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public double calculateValue(final TClass tClass) {
		this.removeAnnotations(tClass);

		final var accessingClasses = new ArrayList<TAbstractType>();
		for (final TMember m : tClass.getDefines()) {
			for (final TAccess t : m.getAccessedBy()) {
				final var tSource = t.getSource();
				if (tSource == null) {
					LOGGER.warn(
							"Member within Class " + tClass.getTName() + " was accessed without an TAccess Source");
					continue;
				}
				final var definingClass = tSource.getDefinedBy();
				if (definingClass == null) {
					LOGGER.warn("Member within Class " + tClass.getTName()
							+ " was accessed by a Source without defining Class");
					continue;
				}
				if (!tSource.getDefinedBy().equals(tClass) && !accessingClasses.contains(tSource.getDefinedBy())) {
					accessingClasses.add(definingClass);
				}
			}

		}
		return accessingClasses.size();

	}

	@Override
	public String getGuiName() {
		return "Afferent Coupling";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHAfferentCouplingMetric();

	}

	// [user code injected with eMoflon] -->
} // HAfferentCouplingCalculatorImpl
