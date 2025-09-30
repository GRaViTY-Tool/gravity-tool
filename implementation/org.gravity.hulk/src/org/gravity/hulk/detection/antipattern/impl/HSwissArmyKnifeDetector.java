/**
 */
package org.gravity.hulk.detection.antipattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.AntipatternFactory;
import org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell;
import org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.AnnotationHelper;
import org.gravity.hulk.detection.HAntiPatternDetector;
import org.gravity.hulk.detection.codesmells.impl.HLargeClassDetector;
import org.gravity.hulk.detection.codesmells.impl.HMuchOverloadingDetector;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.metrics.impl.HIncommingInvocationCalculator;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HSwiss
 * Army Knife Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HSwissArmyKnifeDetector extends HClassBasedCalculatorImpl implements HAntiPatternDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HSwissArmyKnifeDetector(final DFSGraph graph,
			final HLargeClassDetector largeClassDetector, final HMuchOverloadingDetector overloadingDetector,
			final HIncommingInvocationCalculator niiCalculator) {
		final var largeclassEdge = DfsFactory.eINSTANCE.createEdge();
		final var overloadingEdge = DfsFactory.eINSTANCE.createEdge();
		final var niiEdge = DfsFactory.eINSTANCE.createEdge();
		largeClassDetector.getIncoming().add(largeclassEdge);
		largeclassEdge.setGraph(graph);
		this.setGraph(graph);
		this.getOutgoing().add(largeclassEdge);
		this.getOutgoing().add(overloadingEdge);
		overloadingDetector.getIncoming().add(overloadingEdge);
		overloadingEdge.setGraph(graph);
		this.getOutgoing().add(niiEdge);
		niiEdge.setGraph(graph);
		niiCalculator.getIncoming().add(niiEdge);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {//
		this.removeAnnotations(tClass);
		final var over = this.get(tClass.getTAnnotation(), HMuchOverloadingCodeSmell.class);
		if (over == null) {
			return null;
		}
		final var large = this.get(tClass.getTAnnotation(), HLargeClassSmell.class);
		if (large == null) {
			return null;
		}
		final var invoc = this.get(tClass.getTAnnotation(), HIncommingInvocationMetric.class);
		if (invoc == null) {
			return null;
		}
		final var relative = invoc.getRelativeAmount();
		if ((relative == null) || (!HRelativeValueConstants.HIGH.equals(relative.getValue())
				&& !HRelativeValueConstants.VERY_HIGH.equals(relative.getValue()))) {
			return null;

		}

		final var pattern = this.createAntiPattern(tClass, large, invoc, over);

		//
		final var type = AnnotationHelper.getAnnotationType(tClass.getModel(), "SwissArmyKnife");
		if (type != null) {
			final var tAnnotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
			tAnnotation.setTAnnotated(tClass);
			type.getAnnotations().add(tAnnotation);
		}
		return pattern;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean detect(final HAntiPatternGraph pg) {// ForEach
		for (final TClass tClass : HClassBasedCalculatorImpl.getClassesToVisit(pg, this)) {
			final var metric = this.calculate(tClass);
			if (metric != null) {
				metric.setTAnnotated(tClass);
				pg.getHAnnotations().add(metric);
				this.getHAnnotation().add(metric);

			}
		}
		return true;
	}

	public final HSwissArmyKnifeAntiPattern createAntiPattern(final TClass tClass, final HLargeClassSmell large,
			final HIncommingInvocationMetric invoc, final HMuchOverloadingCodeSmell over) {
		final var pattern = AntipatternFactory.eINSTANCE.createHSwissArmyKnifeAntiPattern();
		pattern.setTAnnotated(tClass);
		pattern.setHLargeClassSmell(large);
		pattern.setHMuchOverloadingCodeSmell(over);
		pattern.setHIncommingInvocationCustomMetric(invoc);
		large.getPartOf().add(pattern);
		invoc.getPartOf().add(pattern);
		over.getPartOf().add(pattern);
		this.getHAnnotation().add(pattern);
		return pattern;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Swiss Army Knife [Anti-Pattern]";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage.eINSTANCE
				.getHSwissArmyKnifeAntiPattern();
	}

	// [user code injected with eMoflon] -->
} // HSwissArmyKnifeDetectorImpl
