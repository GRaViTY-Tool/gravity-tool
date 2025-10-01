/**
 */
package org.gravity.hulk.detection.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.moflon.core.dfs.DFSGraph;
// <-- [user defined imports]
// [user defined imports] -->
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HLocal
 * Access Relation Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLocalAccessRelationCalculator extends HClassBasedCalculatorImpl implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HLocalAccessRelationCalculator(final DFSGraph graph,
			final HLocalFieldsAccessCalculator lfa, final HLocalMethodAccessCalculator lma) {
		final var edge5 = DfsFactory.eINSTANCE.createEdge();
		final var edge6 = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		this.getOutgoing().add(edge5);
		lfa.getIncoming().add(edge5);
		edge5.setGraph(graph);
		this.getOutgoing().add(edge6);
		lma.getIncoming().add(edge6);
		edge6.setGraph(graph);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMetric calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		HLocalFieldAccessesMetric hField = null;
		HLocalMethodAccessesMetric hMethod = null;
		for (final TAnnotation tmpHField : tClass.getTAnnotation()) {
			if (tmpHField instanceof HLocalFieldAccessesMetric) {
				hField = (HLocalFieldAccessesMetric) tmpHField;
			} else if (tmpHField instanceof HLocalMethodAccessesMetric) {
				hMethod = (HLocalMethodAccessesMetric) tmpHField;
			}
		}
		if ((hField == null) || (hMethod == null)) {
			throw new IllegalStateException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
					+ "[this] = " + this + ".");
		}

		final var metric = MetricsFactory.eINSTANCE.createHLocalAccessRelationMetric();
		metric.setTAnnotated(tClass);
		metric.setHLocalMethodAccesses(hMethod);
		metric.setHLocalFieldAccesses(hField);
		metric.setValue(this.calculateValue(hField, hMethod));
		hField.getPartOf().add(metric);
		hMethod.getPartOf().add(metric);
		this.getHAnnotation().add(metric);

		return metric;
	}

	public double calculateValue(final HLocalFieldAccessesMetric fa, final HLocalMethodAccessesMetric ma) {
		return fa.getValue() / (ma.getValue() + 1);

	}

	@Override
	public String getGuiName() {
		return "Relation beteen in Class Methodcalls and Fieldaccesses";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHLocalAccessRelationMetric();
	}

	// [user code injected with eMoflon] -->
} // HLocalAccessRelationCalculatorImpl
