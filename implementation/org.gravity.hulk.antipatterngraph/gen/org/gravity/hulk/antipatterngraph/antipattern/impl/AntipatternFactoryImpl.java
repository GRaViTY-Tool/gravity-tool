/**
 */
package org.gravity.hulk.antipatterngraph.antipattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.hulk.antipatterngraph.antipattern.*;

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
		case AntipatternPackage.HBLOB_ANTI_PATTERN:
			return createHBlobAntiPattern();
		case AntipatternPackage.HGOD_CLASS_ANTI_PATTERN:
			return createHGodClassAntiPattern();
		case AntipatternPackage.HSWISS_ARMY_KNIFE_ANTI_PATTERN:
			return createHSwissArmyKnifeAntiPattern();
		case AntipatternPackage.HSPAGHETTI_CODE_ANTI_PATTERN:
			return createHSpaghettiCodeAntiPattern();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HBlobAntiPattern createHBlobAntiPattern() {
		HBlobAntiPatternImpl hBlobAntiPattern = new HBlobAntiPatternImpl();
		return hBlobAntiPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HGodClassAntiPattern createHGodClassAntiPattern() {
		HGodClassAntiPatternImpl hGodClassAntiPattern = new HGodClassAntiPatternImpl();
		return hGodClassAntiPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HSwissArmyKnifeAntiPattern createHSwissArmyKnifeAntiPattern() {
		HSwissArmyKnifeAntiPatternImpl hSwissArmyKnifeAntiPattern = new HSwissArmyKnifeAntiPatternImpl();
		return hSwissArmyKnifeAntiPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HSpaghettiCodeAntiPattern createHSpaghettiCodeAntiPattern() {
		HSpaghettiCodeAntiPatternImpl hSpaghettiCodeAntiPattern = new HSpaghettiCodeAntiPatternImpl();
		return hSpaghettiCodeAntiPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
