/**
 */
package org.gravity.hulk.detection.antipattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.AntipatternFactory;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.AnnotationHelper;
import org.gravity.hulk.detection.HAntiPatternDetector;
import org.gravity.hulk.detection.codesmells.impl.HDataClassAccessorDetector;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HBlob
 * Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HBlobDetector extends HClassBasedCalculatorImpl implements HAntiPatternDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HBlobDetector(final DFSGraph graph, final HGodClassDetector god,
			final HDataClassAccessorDetector dacAccessor) {
		final var blobReqDataClass = DfsFactory.eINSTANCE.createEdge();
		final var blobReqDataCAccessor = DfsFactory.eINSTANCE.createEdge();
		god.getIncoming().add(blobReqDataClass);
		blobReqDataClass.setGraph(graph);
		this.setGraph(graph);
		this.getOutgoing().add(blobReqDataClass);
		blobReqDataCAccessor.setGraph(graph);
		this.getOutgoing().add(blobReqDataCAccessor);
		dacAccessor.getIncoming().add(blobReqDataCAccessor);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {//
		this.removeAnnotations(tClass);

		HGodClassAntiPattern mainClass = null;
		HDataClassAccessor nad = null;
		for (final TAnnotation annotation : tClass.getTAnnotation()) {
			if (annotation instanceof HGodClassAntiPattern) {
				mainClass = (HGodClassAntiPattern) annotation;
			} else if (annotation instanceof HDataClassAccessor) {
				nad = (HDataClassAccessor) annotation;
			}
		}
		if ((mainClass != null) && (nad != null)) {
			//
			final var relative = nad.getRelativeAmount();
			if ((relative != null) && !HRelativeValueConstants.VERY_LOW.equals(relative.getValue())
					&& !HRelativeValueConstants.LOW.equals(relative.getValue())) {
				final var blob = this.createAntiPattern(tClass, mainClass, nad);

				// ForEach
				blob.getHDataClassSmells().addAll(nad.getHDataClassSmells());
				//
				final var tAnnotationType = AnnotationHelper.getAnnotationType(tClass.getModel(), "Blob");
				if (tAnnotationType != null) {
					final var annotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
					annotation.setTAnnotated(tClass);
					tAnnotationType.getAnnotations().add(annotation);
				}
				return blob;
			}
		}
		return null;
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

	public final HBlobAntiPattern createAntiPattern(final TClass tClass, final HGodClassAntiPattern mainClassS,
			final HDataClassAccessor nad) {
		final var blob = AntipatternFactory.eINSTANCE.createHBlobAntiPattern();
		blob.setTAnnotated(tClass);
		blob.setHGodClassAntiPattern(mainClassS);
		mainClassS.getPartOf().add(blob);
		nad.getPartOf().add(blob);
		this.getHAnnotation().add(blob);
		return blob;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "The Blob [Anti-Pattern]";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage.eINSTANCE.getHBlobAntiPattern();
	}

	// [user code injected with eMoflon] -->
} // HBlobDetectorImpl
