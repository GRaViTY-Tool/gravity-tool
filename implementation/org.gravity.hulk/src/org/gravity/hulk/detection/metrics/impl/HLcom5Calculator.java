/**
 */
package org.gravity.hulk.detection.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldUniqueAccessMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfFieldsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HLcom5
 * Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HLcom5Calculator extends HClassBasedCalculatorImpl implements HMetricCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HLcom5Calculator(final HLocalFieldUniqueAccessCalculator lfuac,
			final DFSGraph graph, final HMethodNumberCalculator methods, final HFieldNumberCalculator fnc) {
		final var edge7 = DfsFactory.eINSTANCE.createEdge();
		final var edge8 = DfsFactory.eINSTANCE.createEdge();
		final var edge9 = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		this.getOutgoing().add(edge7);
		lfuac.getIncoming().add(edge7);
		edge7.setGraph(graph);
		this.getOutgoing().add(edge8);
		edge8.setGraph(graph);
		methods.getIncoming().add(edge8);
		this.getOutgoing().add(edge9);
		edge9.setGraph(graph);
		fnc.getIncoming().add(edge9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMetric calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		HLocalFieldUniqueAccessMetric lfau = null;
		HNumberOfFieldsMetric nof = null;
		HNumberOfMethodsMetric nom = null;

		for (final TAnnotation annotation : tClass.getTAnnotation()) {
			if (annotation instanceof HLocalFieldUniqueAccessMetric) {
				lfau = (HLocalFieldUniqueAccessMetric) annotation;
			} else if (annotation instanceof HNumberOfFieldsMetric) {
				nof = (HNumberOfFieldsMetric) annotation;
			} else if (annotation instanceof HNumberOfMethodsMetric) {
				nom = (HNumberOfMethodsMetric) annotation;
			}

		}

		if (lfau == null || nof == null || nom == null) {
			throw new IllegalStateException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		return this.createMetric(lfau, nof, nom, tClass);
	}

	public double calculateValue(final TClass tClass) {
		HLocalFieldUniqueAccessMetric lfau = null;
		HNumberOfFieldsMetric nof = null;
		HNumberOfMethodsMetric nom = null;

		for (final TAnnotation annotation : tClass.getTAnnotation()) {
			if (annotation instanceof HLocalFieldUniqueAccessMetric) {
				lfau = (HLocalFieldUniqueAccessMetric) annotation;
			} else if (annotation instanceof HNumberOfFieldsMetric) {
				nof = (HNumberOfFieldsMetric) annotation;
			} else if (annotation instanceof HNumberOfMethodsMetric) {
				nom = (HNumberOfMethodsMetric) annotation;
			}

		}

		if (lfau == null || nof == null || nom == null) {
			throw new IllegalStateException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ".");
		}
		return this.calculateLcom5Value(nof, nom, lfau);
	}

	public double calculateLcom5Value(final HNumberOfFieldsMetric nof, final HNumberOfMethodsMetric nom,
			final HLocalFieldUniqueAccessMetric lfa) {
		// [user code injected with eMoflon]

		final var nomTimesNof = nom.getValue() * nof.getValue();
		final var dividend = lfa.getValue() - (nomTimesNof);
		final var divisor = nof.getValue() - (nomTimesNof);

		if (divisor == 0) {
			return 0;
		}
		return dividend / divisor;

	}

	public final HLCOM5Metric createMetric(final HLocalFieldUniqueAccessMetric lfau, final HNumberOfFieldsMetric nof,
			final HNumberOfMethodsMetric nom, final TClass tClass) {
		final var metric = MetricsFactory.eINSTANCE.createHLCOM5Metric();
		metric.setTAnnotated(tClass);
		metric.setValue(this.calculateLcom5Value(nof, nom, lfau));
		metric.setHLocalFieldUniqueAccessMetric(lfau);
		metric.setHNumberOfFieldsMetric(nof);
		metric.setHNumberOfMethodsMetric(nom);
		lfau.getPartOf().add(metric);
		nof.getPartOf().add(metric);
		nom.getPartOf().add(metric);
		this.getHAnnotation().add(metric);
		return metric;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {

		return "Calculate LCOM5 on PG";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHLCOM5Metric();
	}

	// [user code injected with eMoflon] -->
} // HLcom5CalculatorImpl
