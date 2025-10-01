/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.util.ArrayList;
// [user defined imports] -->

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.moflon.core.dfs.DFSGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLocal Field Unique Access
 * Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLocalFieldUniqueAccessCalculator extends HClassBasedCalculatorImpl implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param graph
	 *
	 * @generated
	 */
	public HLocalFieldUniqueAccessCalculator(final DFSGraph graph) {
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

		final var metric = MetricsFactory.eINSTANCE.createHLocalFieldUniqueAccessMetric();
		metric.setTAnnotated(tClass);
		metric.setValue(this.calculateValue(tClass));
		this.getHAnnotation().add(metric);
		return metric;
	}

	private double calculateValue(final TClass tClass) {
		var i = 0;
		for (final TMember m : tClass.getDefines()) {
			final var accessedMembers = new ArrayList<TMember>();
			for (final TAccess t : m.getAccessing()) {
				final var tTarget = t.getTarget();
				if ((tTarget instanceof TFieldDefinition) && tClass.equals(tTarget.getDefinedBy())
						&& !accessedMembers.contains(tTarget)) {
					i++;
					accessedMembers.add(tTarget);
				}
			}
		}
		return i;
	}

	@Override
	public String getGuiName() {
		return "Number of distinct fields accessed by each method";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHLocalFieldUniqueAccessMetric();
	}
} // HLocalFieldUniqueAccessCalculatorImpl
