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
import org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern;

import org.gravity.hulk.antipatterngraph.codesmells.HLargeClassSmell;
import org.gravity.hulk.antipatterngraph.codesmells.HMuchOverloadingCodeSmell;

import org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.hulk.detection.antipattern.AntipatternPackage;
import org.gravity.hulk.detection.antipattern.HSwissArmyKnifeDetector;

import org.gravity.hulk.detection.impl.HAntiPatternDetectorImpl;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HSwiss
 * Army Knife Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HSwissArmyKnifeDetectorImpl extends HAntiPatternDetectorImpl implements HSwissArmyKnifeDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HSwissArmyKnifeDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HSWISS_ARMY_KNIFE_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {//
		Object[] result1_black = HSwissArmyKnifeDetectorImpl
				.pattern_HSwissArmyKnifeDetector_0_1_ActivityNode38_blackBFFF(tClass);
		if (result1_black != null) {
			HMuchOverloadingCodeSmell over = (HMuchOverloadingCodeSmell) result1_black[1];
			HLargeClassSmell large = (HLargeClassSmell) result1_black[2];
			HIncommingInvocationMetric invoc = (HIncommingInvocationMetric) result1_black[3];
			//
			HRelativeValue relative = invoc.getRelativeAmount();
			if (relative == null || !(HRelativeValueConstants.HIGH.equals(relative.getValue())
					|| HRelativeValueConstants.VERY_HIGH.equals(relative.getValue()))) {
				return null;

			}

			HSwissArmyKnifeAntiPattern pattern = createAntiPattern(tClass, large, invoc, over);

			//
			TAnnotationType type = getAnnotationType(tClass.getModel(), "SwissArmyKnife");
			if (type != null) {
				TAnnotation tAnnotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
				tAnnotation.setTAnnotated(tClass);
				type.getAnnotations().add(tAnnotation);
			}
			return pattern;
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
				return AntipatternPackage.HSWISS_ARMY_KNIFE_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return AntipatternPackage.HSWISS_ARMY_KNIFE_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return AntipatternPackage.HSWISS_ARMY_KNIFE_DETECTOR___DETECT__HANTIPATTERNGRAPH;
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
		case AntipatternPackage.HSWISS_ARMY_KNIFE_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case AntipatternPackage.HSWISS_ARMY_KNIFE_DETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HSwissArmyKnifeDetector_0_1_ActivityNode38_blackBFFF(TClass tClass) {
		for (TAnnotation tmpOver : tClass.getTAnnotation()) {
			if (tmpOver instanceof HMuchOverloadingCodeSmell) {
				HMuchOverloadingCodeSmell over = (HMuchOverloadingCodeSmell) tmpOver;
				for (TAnnotation tmpLarge : tClass.getTAnnotation()) {
					if (tmpLarge instanceof HLargeClassSmell) {
						HLargeClassSmell large = (HLargeClassSmell) tmpLarge;
						for (TAnnotation tmpInvoc : tClass.getTAnnotation()) {
							if (tmpInvoc instanceof HIncommingInvocationMetric) {
								HIncommingInvocationMetric invoc = (HIncommingInvocationMetric) tmpInvoc;
								return new Object[] { tClass, over, large, invoc };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public final HSwissArmyKnifeAntiPattern createAntiPattern(TClass tClass, HLargeClassSmell large,
			HIncommingInvocationMetric invoc, HMuchOverloadingCodeSmell over) {
		HSwissArmyKnifeAntiPattern pattern = AntipatternFactory.eINSTANCE.createHSwissArmyKnifeAntiPattern();
		pattern.setTAnnotated(tClass);
		pattern.setHLargeClassSmell(large);
		pattern.setHMuchOverloadingCodeSmell(over);
		pattern.setHIncommingInvocationCustomMetric(invoc);
		large.getPartOf().add(pattern);
		invoc.getPartOf().add(pattern);
		over.getPartOf().add(pattern);
		getHAnnotation().add(pattern);
		return pattern;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Swiss Army Knife [Anti-Pattern]";
	}

	// [user code injected with eMoflon] -->
} // HSwissArmyKnifeDetectorImpl
