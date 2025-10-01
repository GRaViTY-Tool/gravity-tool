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
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.moflon.core.dfs.DFSGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HLocal
 * Fields Access Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLocalFieldsAccessCalculator extends HClassBasedCalculatorImpl implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param graph
	 *
	 * @generated
	 */
	public HLocalFieldsAccessCalculator(final DFSGraph graph) {
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

		final var metric = MetricsFactory.eINSTANCE.createHLocalFieldAccessesMetric();
		metric.setTAnnotated(tClass);
		this.getHAnnotation().add(metric);
		metric.setValue(0);

		for (final TMember tMember : tClass.getDefines()) {
			for (final TMember tAnyAccessedField : tClass.getDefines()) {
				if (tAnyAccessedField instanceof TFieldDefinition) {
					for (final TAccess tAnyAccess : tMember.getAccessing()) {
						if (tAnyAccessedField.getAccessedBy().contains(tAnyAccess)) {
							metric.increment();
						}
					}
				}
			}
		}
		return metric;
	}

	public double calculateValue(final TClass tClass) {

		var i = 0;
		for (final TMember m : tClass.getDefines()) {
			for (final TAccess t : m.getAccessing()) {
				final var tTarget = t.getTarget();
				if ((tTarget instanceof TFieldDefinition) && tTarget.getDefinedBy().equals(tClass)) {
					i++;
				}
			}
		}
		return i;

	}

	@Override
	public String getGuiName() {
		return "Number of in Class Fieldaccesses";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHLocalFieldAccessesMetric();
	}

	// [user code injected with eMoflon] -->
} // HLocalFieldsAccessCalculatorImpl
