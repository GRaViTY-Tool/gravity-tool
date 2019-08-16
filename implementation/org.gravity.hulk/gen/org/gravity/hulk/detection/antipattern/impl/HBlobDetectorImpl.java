/**
 */
package org.gravity.hulk.detection.antipattern.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

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
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.hulk.detection.antipattern.AntipatternPackage;
import org.gravity.hulk.detection.antipattern.HBlobDetector;

import org.gravity.hulk.detection.impl.HAntiPatternDetectorImpl;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;
// <-- [user defined imports]
// [user defined imports] -->

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
		super();
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
	public HAnnotation calculate(TClass tClass) {//
		HGodClassAntiPattern mainClass = null;
		HDataClassAccessor nad = null;
		for (TAnnotation annotation : tClass.getTAnnotation()) {
			if (annotation instanceof HGodClassAntiPattern) {
				mainClass = (HGodClassAntiPattern) annotation;
			} else if (annotation instanceof HDataClassAccessor) {
				nad = (HDataClassAccessor) annotation;
			}
		}
		if (mainClass != null && nad != null) {
			//
			HRelativeValue relative = nad.getRelativeAmount();
			if (relative != null && !relative.equals(HRelativeValueConstants.VERY_LOW)
					&& !relative.equals(HRelativeValueConstants.LOW)) {
				HBlobAntiPattern blob = createAntiPattern(tClass, mainClass, nad);

				// ForEach
				for (HDataClassSmell dc : nad.getHDataClassSmells()) {
					blob.getHDataClassSmells().add(dc);
				}
				//
				TAnnotationType tAnnotationType = getAnnotationType(tClass.getPg(), "Blob");
				if (tAnnotationType != null) {
					TAnnotation annotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
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
	public boolean detect(HAntiPatternGraph pg) {// ForEach
		for (TClass tClass : HClassBasedCalculatorImpl.getClassesToVisit(pg, this)) {
			HAnnotation metric = calculate(tClass);
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case AntipatternPackage.HBLOB_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case AntipatternPackage.HBLOB_DETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public final HBlobAntiPattern createAntiPattern(TClass tClass, HGodClassAntiPattern mainClassS,
			HDataClassAccessor nad) {
		HBlobAntiPattern blob = AntipatternFactory.eINSTANCE.createHBlobAntiPattern();
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

	// [user code injected with eMoflon] -->
} // HBlobDetectorImpl
