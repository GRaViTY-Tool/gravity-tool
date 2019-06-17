/**
 */
package org.gravity.hulk.detection.antipattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.hulk.detection.antipattern.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AntipatternFactoryImpl extends EFactoryImpl implements AntipatternFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AntipatternFactory init() {
		try {
			AntipatternFactory theAntipatternFactory = (AntipatternFactory) EPackage.Registry.INSTANCE
					.getEFactory(AntipatternPackage.eNS_URI);
			if (theAntipatternFactory != null) {
				return theAntipatternFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AntipatternFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntipatternFactoryImpl() {
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
		case AntipatternPackage.HBLOB_DETECTOR:
			return createHBlobDetector();
		case AntipatternPackage.HGOD_CLASS_DETECTOR:
			return createHGodClassDetector();
		case AntipatternPackage.HSWISS_ARMY_KNIFE_DETECTOR:
			return createHSwissArmyKnifeDetector();
		case AntipatternPackage.HSPAGHETTI_CODE_DETECTOR:
			return createHSpaghettiCodeDetector();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HBlobDetector createHBlobDetector() {
		HBlobDetectorImpl hBlobDetector = new HBlobDetectorImpl();
		return hBlobDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HGodClassDetector createHGodClassDetector() {
		HGodClassDetectorImpl hGodClassDetector = new HGodClassDetectorImpl();
		return hGodClassDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSwissArmyKnifeDetector createHSwissArmyKnifeDetector() {
		HSwissArmyKnifeDetectorImpl hSwissArmyKnifeDetector = new HSwissArmyKnifeDetectorImpl();
		return hSwissArmyKnifeDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSpaghettiCodeDetector createHSpaghettiCodeDetector() {
		HSpaghettiCodeDetectorImpl hSpaghettiCodeDetector = new HSpaghettiCodeDetectorImpl();
		return hSpaghettiCodeDetector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntipatternPackage getAntipatternPackage() {
		return (AntipatternPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AntipatternPackage getPackage() {
		return AntipatternPackage.eINSTANCE;
	}

} //AntipatternFactoryImpl
