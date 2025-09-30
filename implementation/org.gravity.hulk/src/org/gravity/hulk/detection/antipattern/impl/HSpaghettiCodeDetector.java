/**
 */
package org.gravity.hulk.detection.antipattern.impl;

// <-- [user defined imports]
import java.util.ArrayList;
import java.util.List;
// [user defined imports] -->

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.AntipatternFactory;
import org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern;
import org.gravity.hulk.antipatterngraph.codesmells.HIntenseFieldUsageCodeSmell;
import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;
import org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.AnnotationHelper;
import org.gravity.hulk.detection.HAntiPatternDetector;
import org.gravity.hulk.detection.codesmells.impl.HIntenseFieldUsageDetector;
import org.gravity.hulk.detection.codesmells.impl.HLargeClassDetector;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.metrics.impl.HAverageOverloadingInClassCalculator;
import org.gravity.hulk.detection.metrics.impl.HAverageParametersCalculator;
import org.gravity.hulk.detection.metrics.impl.HDepthOfInheritanceCalculator;
import org.gravity.hulk.detection.metrics.impl.HNumberOfChildCalculator;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>HSpaghetti Code Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HSpaghettiCodeDetector extends HClassBasedCalculatorImpl implements HAntiPatternDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HSpaghettiCodeDetector(final DFSGraph graph,
			final HDepthOfInheritanceCalculator inh, final HNumberOfChildCalculator child,
			final HAverageOverloadingInClassCalculator over, final HAverageParametersCalculator param,
			final HIntenseFieldUsageDetector field, final HLargeClassDetector largeClassDetector) {
		final var edgeS1 = DfsFactory.eINSTANCE.createEdge();
		final var edgeS2 = DfsFactory.eINSTANCE.createEdge();
		final var edgeS3 = DfsFactory.eINSTANCE.createEdge();
		final var edgeS4 = DfsFactory.eINSTANCE.createEdge();
		final var edgeS5 = DfsFactory.eINSTANCE.createEdge();
		final var edgeS6 = DfsFactory.eINSTANCE.createEdge();
		this.setGraph(graph);
		this.getOutgoing().add(edgeS1);
		edgeS1.setGraph(graph);
		largeClassDetector.getIncoming().add(edgeS1);
		this.getOutgoing().add(edgeS2);
		edgeS2.setGraph(graph);
		child.getIncoming().add(edgeS2);
		this.getOutgoing().add(edgeS3);
		edgeS3.setGraph(graph);
		inh.getIncoming().add(edgeS3);
		this.getOutgoing().add(edgeS4);
		edgeS4.setGraph(graph);
		over.getIncoming().add(edgeS4);
		this.getOutgoing().add(edgeS5);
		edgeS5.setGraph(graph);
		param.getIncoming().add(edgeS5);
		this.getOutgoing().add(edgeS6);
		edgeS6.setGraph(graph);
		field.getIncoming().add(edgeS6);

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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {
		this.removeAnnotations(tClass);

		HIntenseFieldUsageCodeSmell intenseFieldUsage = null;
		HAverageParametersMetric averageParams = null;
		HDepthOfInheritanceMetric depthOfInheritance = null;
		HNumberOfChildMetric numberOfChild = null;
		HAverageOverloadingInClassMetric averageOverloading = null;
		for (final TAnnotation annotation : tClass.getTAnnotation()) {
			if (annotation instanceof HAverageParametersMetric) {
				averageParams = (HAverageParametersMetric) annotation;
			} else if (annotation instanceof HIntenseFieldUsageCodeSmell) {
				intenseFieldUsage = (HIntenseFieldUsageCodeSmell) annotation;
			} else if (annotation instanceof HDepthOfInheritanceMetric) {
				depthOfInheritance = (HDepthOfInheritanceMetric) annotation;
			} else if (annotation instanceof HNumberOfChildMetric) {
				numberOfChild = (HNumberOfChildMetric) annotation;
			} else if (annotation instanceof HAverageOverloadingInClassMetric) {
				averageOverloading = (HAverageOverloadingInClassMetric) annotation;
			}
		}
		if ((intenseFieldUsage == null) || (averageParams == null) || (depthOfInheritance == null)
				|| (numberOfChild == null)
				|| (averageOverloading == null)) {
			return null;
		}

		this.collect(intenseFieldUsage);

		return this.calculate(tClass, averageParams, depthOfInheritance, numberOfChild, averageOverloading);
	}

	private HAnnotation calculate(final TClass tClass, final HAverageParametersMetric averageParams,
			final HDepthOfInheritanceMetric depthOfInheritance, final HNumberOfChildMetric numberOfChild,
			final HAverageOverloadingInClassMetric averageOverloading) {
		if (!HRelativeValueConstants.VERY_LOW.equals(averageParams.getRelativeAmount().getValue())) {
			return null;
		}

		final var iRelative = depthOfInheritance.getRelativeAmount();
		if ((iRelative != null) && HRelativeValueConstants.VERY_LOW.equals(iRelative.getValue())) {
			this.collect(depthOfInheritance);
			//
			final var cRelative = numberOfChild.getRelativeAmount();
			if ((cRelative != null) && HRelativeValueConstants.VERY_LOW.equals(cRelative.getValue())) {
				this.collect(numberOfChild);

			}
			//
			final var oRelative = averageOverloading.getRelativeAmount();
			if ((oRelative != null) && HRelativeValueConstants.VERY_LOW.equals(oRelative.getValue())) {
				this.collect(averageOverloading);
			}

		} else {
			final var cRelative = numberOfChild.getRelativeAmount();
			if ((cRelative != null) && HRelativeValueConstants.VERY_LOW.equals(cRelative.getValue())) {
				this.collect(numberOfChild);
				//
				final var oRelative = averageOverloading.getRelativeAmount();
				if ((oRelative != null) && HRelativeValueConstants.VERY_LOW.equals(oRelative.getValue())) {
					this.collect(averageOverloading);
				}

			} else {
				final var oRelative = averageOverloading.getRelativeAmount();
				if ((oRelative == null) || !HRelativeValueConstants.VERY_LOW.equals(oRelative.getValue())) {
					return null;
				}
				this.collect(averageOverloading);

			}

		}
		return this.createSpaghettiCodeAnnotation(tClass);

	}

	/**
	 * @param tClass
	 * @return
	 */
	private HAnnotation createSpaghettiCodeAnnotation(final TClass tClass) {
		final var anti = AntipatternFactory.eINSTANCE.createHSpaghettiCodeAntiPattern();
		anti.setTAnnotated(tClass);
		this.getHAnnotation().add(anti);
		//
		this.connect(anti);
		//

		final var tType = AnnotationHelper.getAnnotationType(tClass.getModel(), "SpaghettiCode");
		if (tType != null) {
			final var tAnnotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
			tAnnotation.setTAnnotated(tClass);
			tType.getAnnotations().add(tAnnotation);
		}
		return anti;
	}

	private boolean collect(final HAnnotation hAnnotation) {
		return this.annotations.add(hAnnotation);
	}

	private boolean connect(final HSpaghettiCodeAntiPattern hAntiPattern) {

		for (final HAnnotation a : this.annotations) {
			a.getPartOf().add(hAntiPattern);
			if (a instanceof HIntenseFieldUsageCodeSmell) {
				hAntiPattern.setHIntenseFieldUsageCodeSmell((HIntenseFieldUsageCodeSmell) a);
			} else if (a instanceof HAverageParametersMetric) {
				hAntiPattern.setHAverageParametersMetric((HAverageParametersMetric) a);
			} else if (a instanceof HAverageOverloadingInClassMetric) {
				hAntiPattern.setHAverageOverloadingInClassMetric((HAverageOverloadingInClassMetric) a);
			} else if (a instanceof HNumberOfChildMetric) {
				hAntiPattern.setHNumberOfChild((HNumberOfChildMetric) a);
			} else if (a instanceof HDepthOfInheritanceMetric) {
				hAntiPattern.setHDepthOfInheritanceMetric((HDepthOfInheritanceMetric) a);
			}
		}
		return true;

	}

	public static final HNumberOfChildMetric getNumberOfChildMetric(final TClass tClass) {
		for (final TAnnotation tmpChild : tClass.getTAnnotation()) {
			if (tmpChild instanceof final HNumberOfChildMetric child) {
				return child;
			}
		}
		return null;
	}

	// <-- [user code injected with eMoflon]

	private final List<HAnnotation> annotations = new ArrayList<>();

	@Override
	public String getGuiName() {
		return "Spaghetti Code [Anti-Pattern]";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage.eINSTANCE
				.getHSpaghettiCodeAntiPattern();
	}

	// [user code injected with eMoflon] -->
} // HSpaghettiCodeDetectorImpl
