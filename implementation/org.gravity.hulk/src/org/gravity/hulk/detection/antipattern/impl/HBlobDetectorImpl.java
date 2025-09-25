/**
 */
package org.gravity.hulk.detection.antipattern.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.AntipatternFactory;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.antipattern.AntipatternPackage;
import org.gravity.hulk.detection.antipattern.HBlobDetector;
import org.gravity.hulk.detection.impl.HAntiPatternDetectorImpl;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HBlob
 * Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HBlobDetectorImpl extends HAntiPatternDetectorImpl implements HBlobDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HBlobDetectorImpl() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HBLOB_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {//
		removeAnnotations(tClass);

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
				final var blob = createAntiPattern(tClass, mainClass, nad);

				// ForEach
				blob.getHDataClassSmells().addAll(nad.getHDataClassSmells());
				//
				final var tAnnotationType = getAnnotationType(tClass.getModel(), "Blob");
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
			final var metric = calculate(tClass);
			if (metric != null) {
				metric.setTAnnotated(tClass);
				pg.getHAnnotations().add(metric);
				getHAnnotation().add(metric);

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
	public int eDerivedOperationID(final int baseOperationID, final Class<?> baseClass) {
		if (baseClass == HDetector.class) {
			switch (baseOperationID) {
			case HulkPackage.HDETECTOR___DETECT__HANTIPATTERNGRAPH:
				return AntipatternPackage.HBLOB_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return AntipatternPackage.HBLOB_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return AntipatternPackage.HBLOB_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case AntipatternPackage.HBLOB_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case AntipatternPackage.HBLOB_DETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public final HBlobAntiPattern createAntiPattern(final TClass tClass, final HGodClassAntiPattern mainClassS,
			final HDataClassAccessor nad) {
		final var blob = AntipatternFactory.eINSTANCE.createHBlobAntiPattern();
		blob.setTAnnotated(tClass);
		blob.setHGodClassAntiPattern(mainClassS);
		mainClassS.getPartOf().add(blob);
		nad.getPartOf().add(blob);
		getHAnnotation().add(blob);
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
