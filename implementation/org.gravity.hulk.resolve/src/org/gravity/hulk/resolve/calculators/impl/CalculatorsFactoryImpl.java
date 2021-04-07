/**
 */
package org.gravity.hulk.resolve.calculators.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.hulk.resolve.calculators.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CalculatorsFactoryImpl extends EFactoryImpl implements CalculatorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CalculatorsFactory init() {
		try {
			CalculatorsFactory theCalculatorsFactory = (CalculatorsFactory) EPackage.Registry.INSTANCE
					.getEFactory(CalculatorsPackage.eNS_URI);
			if (theCalculatorsFactory != null) {
				return theCalculatorsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CalculatorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatorsFactoryImpl() {
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
		case CalculatorsPackage.HMETHOD_TO_DATA_CLASS_ACCESS_CALCULATOR:
			return createHMethodToDataClassAccessCalculator();
		case CalculatorsPackage.HIN_BLOB_ACCESS_CALCULATOR:
			return createHInBlobAccessCalculator();
		case CalculatorsPackage.HCLUSTER_CALCULATOR:
			return createHClusterCalculator();
		case CalculatorsPackage.HCLUSTER_ACCESS_CALCULATOR:
			return createHClusterAccessCalculator();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMethodToDataClassAccessCalculator createHMethodToDataClassAccessCalculator() {
		HMethodToDataClassAccessCalculatorImpl hMethodToDataClassAccessCalculator = new HMethodToDataClassAccessCalculatorImpl();
		return hMethodToDataClassAccessCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HInBlobAccessCalculator createHInBlobAccessCalculator() {
		HInBlobAccessCalculatorImpl hInBlobAccessCalculator = new HInBlobAccessCalculatorImpl();
		return hInBlobAccessCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HClusterCalculator createHClusterCalculator() {
		HClusterCalculatorImpl hClusterCalculator = new HClusterCalculatorImpl();
		return hClusterCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HClusterAccessCalculator createHClusterAccessCalculator() {
		HClusterAccessCalculatorImpl hClusterAccessCalculator = new HClusterAccessCalculatorImpl();
		return hClusterAccessCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatorsPackage getCalculatorsPackage() {
		return (CalculatorsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CalculatorsPackage getPackage() {
		return CalculatorsPackage.eINSTANCE;
	}

} //CalculatorsFactoryImpl