/**
 */
package org.gravity.hulk.detection.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.HGetterMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HSetterMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HGetter
 * Setter Method Relation Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HGetterSetterMethodRelationCalculator extends HClassBasedCalculatorImpl implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HGetterSetterMethodRelationCalculator(final DFSGraph graph,
			final HGetterCalculator ng, final HSetterCalculator ns,
			final HMethodNumberCalculator methods) {
		final var edge0 = DfsFactory.eINSTANCE.createEdge();
		final var edge1 = DfsFactory.eINSTANCE.createEdge();
		final var edge2 = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		edge0.setGraph(graph);
		this.getOutgoing().add(edge0);
		ng.getIncoming().add(edge0);
		edge1.setGraph(graph);
		this.getOutgoing().add(edge1);
		ns.getIncoming().add(edge1);
		edge2.setGraph(graph);
		this.getOutgoing().add(edge2);
		methods.getIncoming().add(edge2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMetric calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		HSetterMetric setter = null;
		HGetterMetric getter = null;
		HNumberOfMethodsMetric methods = null;

		for (final TAnnotation annotation : tClass.getTAnnotation()) {
			if (annotation instanceof HSetterMetric) {
				setter = (HSetterMetric) annotation;
			} else if (annotation instanceof HGetterMetric) {
				getter = (HGetterMetric) annotation;
			} else if (annotation instanceof HNumberOfMethodsMetric) {
				methods = (HNumberOfMethodsMetric) annotation;
			}
		}
		if ((methods == null) || (setter == null) || (getter == null)) {
			throw new IllegalStateException();
		}

		final var metric = MetricsFactory.eINSTANCE.createHNACCMetric();
		metric.setTAnnotated(tClass);
		metric.setHSetterCustomMetric(setter);
		metric.setHGetterCustomMetric(getter);
		metric.setHNumberOfMethodsMetric(methods);
		metric.setValue(this.calculateValue(setter, getter, methods));

		this.getHAnnotation().add(metric);
		methods.getPartOf().add(metric);
		setter.getPartOf().add(metric);
		getter.getPartOf().add(metric);
		return metric;
	}

	public double calculateValue(final HSetterMetric setter, final HGetterMetric getter,
			final HNumberOfMethodsMetric methods) {
		final var methods_value = methods.getValue();
		if (methods_value == 0) {
			return 0;
		}
		return (setter.getValue() + getter.getValue()) / methods_value;

	}

	@Override
	public String getGuiName() {
		return "Relation between Methods and Getters/Setters";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHNACCMetric();
	}

	// [user code injected with eMoflon] -->
} // HGetterSetterMethodRelationCalculatorImpl
