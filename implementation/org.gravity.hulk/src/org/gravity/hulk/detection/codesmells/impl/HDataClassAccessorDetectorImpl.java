/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassSmell;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HDataClassAccessorDetector;

import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.hulk.detection.impl.HCodeSmellDetectorImpl;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HData
 * Class Accessor Detector</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HDataClassAccessorDetectorImpl extends HCodeSmellDetectorImpl implements HDataClassAccessorDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HDataClassAccessorDetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HDATA_CLASS_ACCESSOR_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HAnnotation calculate(TClass tClass) {
		TypeGraph pg = tClass.getModel();
		if (pg == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ".");
		}
		// nothing TypeGraph pg = (TypeGraph) result1_black[0];
		//
		boolean dataClassAccessed = accessesDataClass(tClass);
		if (dataClassAccessed) {
			HDataClassAccessor ad = CodesmellsFactory.eINSTANCE.createHDataClassAccessor();
			ad.setValue(0.0);
			ad.setTAnnotated(tClass);
			getHAnnotation().add(ad);

			// ForEach
			for (TMember tAccessing : tClass.getDefines()) {
				for (TAccess access : tAccessing.getAccessing()) {
					TAbstractType dataClass = access.getTarget().getDefinedBy();
					if (dataClass instanceof TClass && !dataClass.equals(tClass)) {
						for (TAnnotation smell : dataClass.getTAnnotation()) {
							if (smell instanceof HDataClassSmell) {
								ad.increment();
								ad.getHDataClassSmells().add((HDataClassSmell) smell);
								((HAnnotation) smell).getPartOf().add(ad);
							}
						}
					}

				}
			}
			return ad;
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
				return CodesmellsPackage.HDATA_CLASS_ACCESSOR_DETECTOR___DETECT__HANTIPATTERNGRAPH;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == HClassBasedCalculator.class) {
			switch (baseOperationID) {
			case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
				return CodesmellsPackage.HDATA_CLASS_ACCESSOR_DETECTOR___CALCULATE__TCLASS;
			case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
				return CodesmellsPackage.HDATA_CLASS_ACCESSOR_DETECTOR___DETECT__HANTIPATTERNGRAPH;
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
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR_DETECTOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR_DETECTOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final boolean accessesDataClass(TClass tClass) {
		for (TMember tAnyAccessing : tClass.getDefines()) {
			for (TAccess anyAccess : tAnyAccessing.getAccessing()) {
				TMember tAnyAccessed = anyAccess.getTarget();
				if (tAnyAccessed != null) {
					if (!tAnyAccessed.equals(tAnyAccessing)) {
						TAbstractType tmpTAnyDataClass = tAnyAccessed.getDefinedBy();
						if (tmpTAnyDataClass instanceof TClass) {
							TClass tAnyDataClass = (TClass) tmpTAnyDataClass;
							if (!tAnyDataClass.equals(tClass)) {
								for (TAnnotation tmpTData : tAnyDataClass.getTAnnotation()) {
									if (tmpTData instanceof HDataClassSmell) {
										return true;
									}
								}
							}
						}

					}
				}

			}
		}
		return false;
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Data Class Accessor Smell";
	}

	// [user code injected with eMoflon] -->
} // HDataClassAccessorDetectorImpl
