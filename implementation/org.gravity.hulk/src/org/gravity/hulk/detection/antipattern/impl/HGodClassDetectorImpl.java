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
import org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern;
import org.gravity.hulk.antipatterngraph.codesmells.HControllerClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HLowCohesionSmell;
import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;
import org.gravity.hulk.detection.antipattern.AntipatternPackage;
import org.gravity.hulk.detection.antipattern.HGodClassDetector;
import org.gravity.hulk.detection.impl.HAntiPatternDetectorImpl;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HGod
 * Class Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HGodClassDetectorImpl extends HAntiPatternDetectorImpl implements HGodClassDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HGodClassDetectorImpl() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HGOD_CLASS_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {//
		removeAnnotations(tClass);

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
			final var mc = createAntiPattern(controller, largeClass, lowCohesion, tClass);

			//
			final var tAnnotationType = getAnnotationType(tClass.getModel(), "GodClass");
			if (tAnnotationType != null) {
				final var annotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
				annotation.setTAnnotated(tClass);
				tAnnotationType.getAnnotations().add(annotation);
			}
			return mc;
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
				return AntipatternPackage.HGOD_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return AntipatternPackage.HGOD_CLASS_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return AntipatternPackage.HGOD_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH;
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
		case AntipatternPackage.HGOD_CLASS_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case AntipatternPackage.HGOD_CLASS_DETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public final HGodClassAntiPattern createAntiPattern(final HControllerClassSmell controller,
			final HLargeClassSmell largeClass, final HLowCohesionSmell lowCohesion, final TClass tClass) {
		final var mc = AntipatternFactory.eINSTANCE.createHGodClassAntiPattern();
		mc.setTAnnotated(tClass);
		if(largeClass != null) {
			largeClass.getPartOf().add(mc);
			mc.getHLargeClassLowCohesionSmells().add(largeClass);
		}
		if(lowCohesion != null) {
			lowCohesion.getPartOf().add(mc);
			mc.getHLargeClassLowCohesionSmells().add(lowCohesion);
		}
		mc.setHControllerClassSmell(controller);
		getHAnnotation().add(mc);
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
