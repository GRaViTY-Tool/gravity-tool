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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HBlob Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HBlobDetectorImpl extends HAntiPatternDetectorImpl implements HBlobDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HBlobDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HBLOB_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {// 
		Object[] result1_black = HBlobDetectorImpl.pattern_HBlobDetector_0_1_ActivityNode10_blackFBF(tClass);
		if (result1_black != null) {
			//nothing HGodClassAntiPattern mainClass = (HGodClassAntiPattern) result1_black[0];
			HDataClassAccessor nad = (HDataClassAccessor) result1_black[2];
			// 
			Object[] result2_bindingAndBlack = HBlobDetectorImpl
					.pattern_HBlobDetector_0_2_ActivityNode64_bindingAndBlackFB(nad);
			if (result2_bindingAndBlack != null) {
				HRelativeValue relative = (HRelativeValue) result2_bindingAndBlack[0];
				// 
				Object[] result3_bindingAndBlack = HBlobDetectorImpl
						.pattern_HBlobDetector_0_3_ActivityNode64_bindingAndBlackFB(nad);
				if (result3_bindingAndBlack != null) {
					relative = (HRelativeValue) result3_bindingAndBlack[0];

					Object[] result4_black = HBlobDetectorImpl.pattern_HBlobDetector_0_4_ActivityNode9_blackBBFB(tClass,
							this, nad);
					if (result4_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass
								+ ", " + "[this] = " + this + ", " + "[nad] = " + nad + ".");
					}
					HGodClassAntiPattern mainClassS = (HGodClassAntiPattern) result4_black[2];
					Object[] result4_green = HBlobDetectorImpl
							.pattern_HBlobDetector_0_4_ActivityNode9_greenBBFBB(tClass, this, mainClassS, nad);
					HBlobAntiPattern blob = (HBlobAntiPattern) result4_green[2];

					// ForEach 
					for (Object[] result5_black : HBlobDetectorImpl
							.pattern_HBlobDetector_0_5_ActivityNode14_blackBF(nad)) {
						HDataClassSmell dc = (HDataClassSmell) result5_black[1];

						Object[] result6_black = HBlobDetectorImpl
								.pattern_HBlobDetector_0_6_ActivityNode15_blackBB(blob, dc);
						if (result6_black == null) {
							throw new RuntimeException("Pattern matching failed." + " Variables: " + "[blob] = " + blob
									+ ", " + "[dc] = " + dc + ".");
						}
						HBlobDetectorImpl.pattern_HBlobDetector_0_6_ActivityNode15_greenBB(blob, dc);

					}
					// 
					Object[] result7_black = HBlobDetectorImpl
							.pattern_HBlobDetector_0_7_ActivityNode69_blackFBF(tClass);
					if (result7_black != null) {
						TAnnotationType tAnnotationType = (TAnnotationType) result7_black[0];
						//nothing TypeGraph pg = (TypeGraph) result7_black[2];
						HBlobDetectorImpl.pattern_HBlobDetector_0_7_ActivityNode69_greenBBF(tAnnotationType, tClass);
						//nothing TAnnotation annotation = (TAnnotation) result7_green[2];

					} else {
					}
					return HBlobDetectorImpl.pattern_HBlobDetector_0_8_expressionFB(blob);
				} else {
					return HBlobDetectorImpl.pattern_HBlobDetector_0_9_expressionF();
				}

			} else {
				return HBlobDetectorImpl.pattern_HBlobDetector_0_10_expressionF();
			}

		} else {
			return HBlobDetectorImpl.pattern_HBlobDetector_0_11_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean detect(HAntiPatternGraph pg) {// ForEach 
		for (Object[] result1_black : HClassBasedCalculatorImpl
				.pattern_HClassBasedCalculator_1_1_ActivityNode6_blackFBFB(pg, this)) {
			TClass tClass = (TClass) result1_black[0];
			//nothing TypeGraph o = (TypeGraph) result1_black[2];
			// 
			Object[] result2_bindingAndBlack = HClassBasedCalculatorImpl
					.pattern_HClassBasedCalculator_1_2_ActivityNode7_bindingAndBlackFBBB(tClass, this, pg);
			if (result2_bindingAndBlack != null) {
				HAnnotation metric = (HAnnotation) result2_bindingAndBlack[0];
				HClassBasedCalculatorImpl.pattern_HClassBasedCalculator_1_2_ActivityNode7_greenBBBB(metric, tClass,
						this, pg);

			} else {
			}

		}
		return HClassBasedCalculatorImpl.pattern_HClassBasedCalculator_1_3_expressionF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

	public static final Object[] pattern_HBlobDetector_0_1_ActivityNode10_blackFBF(TClass tClass) {
		for (TAnnotation tmpMainClass : tClass.getTAnnotation()) {
			if (tmpMainClass instanceof HGodClassAntiPattern) {
				HGodClassAntiPattern mainClass = (HGodClassAntiPattern) tmpMainClass;
				for (TAnnotation tmpNad : tClass.getTAnnotation()) {
					if (tmpNad instanceof HDataClassAccessor) {
						HDataClassAccessor nad = (HDataClassAccessor) tmpNad;
						return new Object[] { mainClass, tClass, nad };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HBlobDetector_0_2_ActivityNode64_bindingFB(HDataClassAccessor nad) {
		HRelativeValue _localVariable_0 = nad.getRelativeAmount();
		HRelativeValue relative = _localVariable_0;
		if (relative != null) {
			return new Object[] { relative, nad };
		}
		return null;
	}

	public static final Object[] pattern_HBlobDetector_0_2_ActivityNode64_blackB(HRelativeValue relative) {
		HRelativeValueConstants relative_value = relative.getValue();
		if (!relative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { relative };
		}

		return null;
	}

	public static final Object[] pattern_HBlobDetector_0_2_ActivityNode64_bindingAndBlackFB(HDataClassAccessor nad) {
		Object[] result_pattern_HBlobDetector_0_2_ActivityNode64_binding = pattern_HBlobDetector_0_2_ActivityNode64_bindingFB(
				nad);
		if (result_pattern_HBlobDetector_0_2_ActivityNode64_binding != null) {
			HRelativeValue relative = (HRelativeValue) result_pattern_HBlobDetector_0_2_ActivityNode64_binding[0];

			Object[] result_pattern_HBlobDetector_0_2_ActivityNode64_black = pattern_HBlobDetector_0_2_ActivityNode64_blackB(
					relative);
			if (result_pattern_HBlobDetector_0_2_ActivityNode64_black != null) {

				return new Object[] { relative, nad };
			}
		}
		return null;
	}

	public static final Object[] pattern_HBlobDetector_0_3_ActivityNode64_bindingFB(HDataClassAccessor nad) {
		HRelativeValue _localVariable_1 = nad.getRelativeAmount();
		HRelativeValue relative = _localVariable_1;
		if (relative != null) {
			return new Object[] { relative, nad };
		}
		return null;
	}

	public static final Object[] pattern_HBlobDetector_0_3_ActivityNode64_blackB(HRelativeValue relative) {
		HRelativeValueConstants relative_value = relative.getValue();
		if (!relative_value.equals(HRelativeValueConstants.LOW)) {
			return new Object[] { relative };
		}

		return null;
	}

	public static final Object[] pattern_HBlobDetector_0_3_ActivityNode64_bindingAndBlackFB(HDataClassAccessor nad) {
		Object[] result_pattern_HBlobDetector_0_3_ActivityNode64_binding = pattern_HBlobDetector_0_3_ActivityNode64_bindingFB(
				nad);
		if (result_pattern_HBlobDetector_0_3_ActivityNode64_binding != null) {
			HRelativeValue relative = (HRelativeValue) result_pattern_HBlobDetector_0_3_ActivityNode64_binding[0];

			Object[] result_pattern_HBlobDetector_0_3_ActivityNode64_black = pattern_HBlobDetector_0_3_ActivityNode64_blackB(
					relative);
			if (result_pattern_HBlobDetector_0_3_ActivityNode64_black != null) {

				return new Object[] { relative, nad };
			}
		}
		return null;
	}

	public static final Object[] pattern_HBlobDetector_0_4_ActivityNode9_blackBBFB(TClass tClass, HBlobDetector _this,
			HDataClassAccessor nad) {
		for (TAnnotation tmpMainClassS : tClass.getTAnnotation()) {
			if (tmpMainClassS instanceof HGodClassAntiPattern) {
				HGodClassAntiPattern mainClassS = (HGodClassAntiPattern) tmpMainClassS;
				return new Object[] { tClass, _this, mainClassS, nad };
			}
		}
		return null;
	}

	public static final Object[] pattern_HBlobDetector_0_4_ActivityNode9_greenBBFBB(TClass tClass, HBlobDetector _this,
			HGodClassAntiPattern mainClassS, HDataClassAccessor nad) {
		HBlobAntiPattern blob = AntipatternFactory.eINSTANCE.createHBlobAntiPattern();
		blob.setTAnnotated(tClass);
		_this.getHAnnotation().add(blob);
		blob.setHGodClassAntiPattern(mainClassS);
		mainClassS.getPartOf().add(blob);
		nad.getPartOf().add(blob);
		return new Object[] { tClass, _this, blob, mainClassS, nad };
	}

	public static final Iterable<Object[]> pattern_HBlobDetector_0_5_ActivityNode14_blackBF(HDataClassAccessor nad) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (HDataClassSmell dc : nad.getHDataClassSmells()) {
			_result.add(new Object[] { nad, dc });
		}
		return _result;
	}

	public static final Object[] pattern_HBlobDetector_0_6_ActivityNode15_blackBB(HBlobAntiPattern blob,
			HDataClassSmell dc) {
		return new Object[] { blob, dc };
	}

	public static final Object[] pattern_HBlobDetector_0_6_ActivityNode15_greenBB(HBlobAntiPattern blob,
			HDataClassSmell dc) {
		blob.getHDataClassSmells().add(dc);
		return new Object[] { blob, dc };
	}

	public static final Object[] pattern_HBlobDetector_0_7_ActivityNode69_blackFBF(TClass tClass) {
		TypeGraph pg = tClass.getPg();
		if (pg != null) {
			for (TAnnotationType tAnnotationType : pg.getTAnnotationTypes()) {
				String tAnnotationType_tName = tAnnotationType.getTName();
				if (tAnnotationType_tName.equals("Blob")) {
					return new Object[] { tAnnotationType, tClass, pg };
				}

			}
		}

		return null;
	}

	public static final Object[] pattern_HBlobDetector_0_7_ActivityNode69_greenBBF(TAnnotationType tAnnotationType,
			TClass tClass) {
		TAnnotation annotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
		annotation.setTAnnotated(tClass);
		tAnnotationType.getAnnotations().add(annotation);
		return new Object[] { tAnnotationType, tClass, annotation };
	}

	public static final HAnnotation pattern_HBlobDetector_0_8_expressionFB(HBlobAntiPattern blob) {
		HAnnotation _result = blob;
		return _result;
	}

	public static final HAnnotation pattern_HBlobDetector_0_9_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final HAnnotation pattern_HBlobDetector_0_10_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	public static final HAnnotation pattern_HBlobDetector_0_11_expressionF() {
		HAnnotation _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "The Blob [Anti-Pattern]";
	}

	// [user code injected with eMoflon] -->
} //HBlobDetectorImpl
