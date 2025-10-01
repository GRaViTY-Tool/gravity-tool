/**
 */
package org.gravity.hulk.detection.antipattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.AntipatternFactory;
import org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern;
import org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell;
import org.gravity.hulk.detection.AnnotationHelper;
import org.gravity.hulk.detection.HAntiPatternDetector;
import org.gravity.hulk.detection.codesmells.impl.HControllerClassDetector;
import org.gravity.hulk.detection.codesmells.impl.HLargeClassDetector;
import org.gravity.hulk.detection.codesmells.impl.HLowCohesionDetector;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HGod
 * Class Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HGodClassDetector extends HClassBasedCalculatorImpl implements HAntiPatternDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HGodClassDetector(final DFSGraph graph, final HControllerClassDetector controller,
			final HLargeClassDetector largeClass, final HLowCohesionDetector lowCohesion) {
		final var edge6 = DfsFactory.eINSTANCE.createEdge();
		final var edge7 = DfsFactory.eINSTANCE.createEdge();
		final var edge8 = DfsFactory.eINSTANCE.createEdge();
		controller.getIncoming().add(edge6);
		edge6.setGraph(graph);
		largeClass.getIncoming().add(edge7);
		edge7.setGraph(graph);
		lowCohesion.getIncoming().add(edge8);
		edge8.setGraph(graph);
		this.setGraph(graph);
		this.getOutgoing().add(edge6);
		this.getOutgoing().add(edge7);
		this.getOutgoing().add(edge8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {//
		this.removeAnnotations(tClass);

		HControllerClassSmell controller = null;
		HLargeClassSmell largeClass = null;
		HLowCohesionSmell lowCohesion = null;
		for (final TAnnotation tmpLclc : tClass.getTAnnotation()) {
			if (tmpLclc instanceof HLargeClassSmell) {
				largeClass = (HLargeClassSmell) tmpLclc;
			} else if (tmpLclc instanceof HLowCohesionSmell) {
				lowCohesion = (HLowCohesionSmell) tmpLclc;
			} else if (tmpLclc instanceof HControllerClassSmell) {
				controller = (HControllerClassSmell) tmpLclc;
			}
		}
		if (((largeClass != null) || (lowCohesion != null)) && (controller != null)) {
			//
			final var mc = this.createAntiPattern(controller, largeClass, lowCohesion, tClass);

			//
			final var tAnnotationType = AnnotationHelper.getAnnotationType(tClass.getModel(), "GodClass");
			if (tAnnotationType != null) {
				final var annotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
				annotation.setTAnnotated(tClass);
				tAnnotationType.getAnnotations().add(annotation);
			}
			return mc;
		}
		return null;

	}

	public final HGodClassAntiPattern createAntiPattern(final HControllerClassSmell controller,
			final HLargeClassSmell largeClass, final HLowCohesionSmell lowCohesion, final TClass tClass) {
		final var mc = AntipatternFactory.eINSTANCE.createHGodClassAntiPattern();
		mc.setTAnnotated(tClass);
		if (largeClass != null) {
			largeClass.getPartOf().add(mc);
			mc.getHLargeClassLowCohesionSmells().add(largeClass);
		}
		if (lowCohesion != null) {
			lowCohesion.getPartOf().add(mc);
			mc.getHLargeClassLowCohesionSmells().add(lowCohesion);
		}
		mc.setHControllerClassSmell(controller);
		this.getHAnnotation().add(mc);
		controller.getPartOf().add(mc);
		return mc;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "God Class [Anti-Pattern]";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage.eINSTANCE.getHGodClassAntiPattern();
	}

	// [user code injected with eMoflon] -->
} // HGodClassDetectorImpl
