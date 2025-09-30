/**
 */
package org.gravity.hulk.detection.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric;
import org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation;
import org.gravity.hulk.antipatterngraph.metrics.HOutgoingInvocationMetric;
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
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>HInvocation Relation Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HInvocationRelationCalculator extends HClassBasedCalculatorImpl implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HInvocationRelationCalculator(final DFSGraph graph,
			final HOutgoingInvocationCalculator noi, final HIncommingInvocationCalculator nii) {
		final var edge3 = DfsFactory.eINSTANCE.createEdge();
		final var edge4 = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		this.getOutgoing().add(edge3);
		noi.getIncoming().add(edge3);
		edge3.setGraph(graph);
		edge4.setGraph(graph);
		this.getOutgoing().add(edge4);
		nii.getIncoming().add(edge4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMetric calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		HIncommingInvocationMetric nii = null;
		HOutgoingInvocationMetric noi = null;
		for (final TAnnotation annotation : tClass.getTAnnotation()) {
			if (annotation instanceof HIncommingInvocationMetric) {
				nii = (HIncommingInvocationMetric) annotation;
			} else if (annotation instanceof HOutgoingInvocationMetric) {
				noi = (HOutgoingInvocationMetric) annotation;
			}
		}

		if (noi == null || nii == null) {
			throw new IllegalStateException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}

		return this.createMetric(tClass, nii, noi);
	}

	private double calculateInvocValue(final HIncommingInvocationMetric nii, final HOutgoingInvocationMetric noi) {
		return (noi.getValue()) / (nii.getValue() + 1);

	}

	private final HInvocationRelation createMetric(final TClass tClass, final HIncommingInvocationMetric nii,
			final HOutgoingInvocationMetric noi) {
		final var metric = MetricsFactory.eINSTANCE.createHInvocationRelation();
		metric.setTAnnotated(tClass);
		metric.setHOutgoingInvocationCustomMetric(noi);
		metric.setHIncommingInvocationCustomMetric(nii);
		metric.setValue(this.calculateInvocValue(nii, noi));
		nii.getPartOf().add(metric);
		noi.getPartOf().add(metric);
		this.getHAnnotation().add(metric);
		return metric;
	}

	@Override
	public String getGuiName() {
		return "Relation between Incoming and Outgoing Invocations";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHInvocationRelation();
	}

	// [user code injected with eMoflon] -->
} // HInvocationRelationCalculatorImpl
