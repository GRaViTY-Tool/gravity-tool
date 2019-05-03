/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.hulk.detection.codesmells.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodesmellsFactoryImpl extends EFactoryImpl implements CodesmellsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodesmellsFactory init() {
		try {
			CodesmellsFactory theCodesmellsFactory = (CodesmellsFactory) EPackage.Registry.INSTANCE
					.getEFactory(CodesmellsPackage.eNS_URI);
			if (theCodesmellsFactory != null) {
				return theCodesmellsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodesmellsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodesmellsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CodesmellsPackage.HCONTOLLER_CLASS_DETECTOR:
			return createHContollerClassDetector();
		case CodesmellsPackage.HDATA_CLASS_DETECTOR:
			return createHDataClassDetector();
		case CodesmellsPackage.HEMPTY_CLASS_DETECTOR:
			return createHEmptyClassDetector();
		case CodesmellsPackage.HGETTER_SETTER_DETECTOR:
			return createHGetterSetterDetector();
		case CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_DETECTOR:
			return createHLargeClassLowCohesionDetector();
		case CodesmellsPackage.HLARGE_CLASS_DETECTOR:
			return createHLargeClassDetector();
		case CodesmellsPackage.HLOW_COHESION_DETECTOR:
			return createHLowCohesionDetector();
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR_DETECTOR:
			return createHDataClassAccessorDetector();
		case CodesmellsPackage.HMANY_PARAMETERS_DETECTOR:
			return createHManyParametersDetector();
		case CodesmellsPackage.HMUCH_OVERLOADING_DETECTOR:
			return createHMuchOverloadingDetector();
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_DETECTOR:
			return createHIntenseFieldUsageDetector();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HContollerClassDetector createHContollerClassDetector() {
		HContollerClassDetectorImpl hContollerClassDetector = new HContollerClassDetectorImpl();
		return hContollerClassDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDataClassDetector createHDataClassDetector() {
		HDataClassDetectorImpl hDataClassDetector = new HDataClassDetectorImpl();
		return hDataClassDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HEmptyClassDetector createHEmptyClassDetector() {
		HEmptyClassDetectorImpl hEmptyClassDetector = new HEmptyClassDetectorImpl();
		return hEmptyClassDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HGetterSetterDetector createHGetterSetterDetector() {
		HGetterSetterDetectorImpl hGetterSetterDetector = new HGetterSetterDetectorImpl();
		return hGetterSetterDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLargeClassLowCohesionDetector createHLargeClassLowCohesionDetector() {
		HLargeClassLowCohesionDetectorImpl hLargeClassLowCohesionDetector = new HLargeClassLowCohesionDetectorImpl();
		return hLargeClassLowCohesionDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLargeClassDetector createHLargeClassDetector() {
		HLargeClassDetectorImpl hLargeClassDetector = new HLargeClassDetectorImpl();
		return hLargeClassDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLowCohesionDetector createHLowCohesionDetector() {
		HLowCohesionDetectorImpl hLowCohesionDetector = new HLowCohesionDetectorImpl();
		return hLowCohesionDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDataClassAccessorDetector createHDataClassAccessorDetector() {
		HDataClassAccessorDetectorImpl hDataClassAccessorDetector = new HDataClassAccessorDetectorImpl();
		return hDataClassAccessorDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HManyParametersDetector createHManyParametersDetector() {
		HManyParametersDetectorImpl hManyParametersDetector = new HManyParametersDetectorImpl();
		return hManyParametersDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMuchOverloadingDetector createHMuchOverloadingDetector() {
		HMuchOverloadingDetectorImpl hMuchOverloadingDetector = new HMuchOverloadingDetectorImpl();
		return hMuchOverloadingDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HIntenseFieldUsageDetector createHIntenseFieldUsageDetector() {
		HIntenseFieldUsageDetectorImpl hIntenseFieldUsageDetector = new HIntenseFieldUsageDetectorImpl();
		return hIntenseFieldUsageDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodesmellsPackage getCodesmellsPackage() {
		return (CodesmellsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodesmellsPackage getPackage() {
		return CodesmellsPackage.eINSTANCE;
	}

} //CodesmellsFactoryImpl
