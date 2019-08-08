/**
 */
package org.gravity.hulk.antipatterngraph.codesmells.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.hulk.antipatterngraph.codesmells.*;

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
		case CodesmellsPackage.HCONTROLLER_CLASS_SMELL:
			return createHControllerClassSmell();
		case CodesmellsPackage.HDATA_CLASS_SMELL:
			return createHDataClassSmell();
		case CodesmellsPackage.HEMPTY_CLASS_SMELL:
			return createHEmptyClassSmell();
		case CodesmellsPackage.HGETTER_SETTER_SMELL:
			return createHGetterSetterSmell();
		case CodesmellsPackage.HLARGE_CLASS_LOW_COHESION_SMELL:
			return createHLargeClassLowCohesionSmell();
		case CodesmellsPackage.HLARGE_CLASS_SMELL:
			return createHLargeClassSmell();
		case CodesmellsPackage.HLOW_COHESION_SMELL:
			return createHLowCohesionSmell();
		case CodesmellsPackage.HDATA_CLASS_ACCESSOR:
			return createHDataClassAccessor();
		case CodesmellsPackage.HMUCH_OVERLOADING_CODE_SMELL:
			return createHMuchOverloadingCodeSmell();
		case CodesmellsPackage.HMANY_PARAMETERS_CODE_SMELL:
			return createHManyParametersCodeSmell();
		case CodesmellsPackage.HINTENSE_FIELD_USAGE_CODE_SMELL:
			return createHIntenseFieldUsageCodeSmell();
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
	public HControllerClassSmell createHControllerClassSmell() {
		HControllerClassSmellImpl hControllerClassSmell = new HControllerClassSmellImpl();
		return hControllerClassSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HDataClassSmell createHDataClassSmell() {
		HDataClassSmellImpl hDataClassSmell = new HDataClassSmellImpl();
		return hDataClassSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HEmptyClassSmell createHEmptyClassSmell() {
		HEmptyClassSmellImpl hEmptyClassSmell = new HEmptyClassSmellImpl();
		return hEmptyClassSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HGetterSetterSmell createHGetterSetterSmell() {
		HGetterSetterSmellImpl hGetterSetterSmell = new HGetterSetterSmellImpl();
		return hGetterSetterSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLargeClassLowCohesionSmell createHLargeClassLowCohesionSmell() {
		HLargeClassLowCohesionSmellImpl hLargeClassLowCohesionSmell = new HLargeClassLowCohesionSmellImpl();
		return hLargeClassLowCohesionSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLargeClassSmell createHLargeClassSmell() {
		HLargeClassSmellImpl hLargeClassSmell = new HLargeClassSmellImpl();
		return hLargeClassSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLowCohesionSmell createHLowCohesionSmell() {
		HLowCohesionSmellImpl hLowCohesionSmell = new HLowCohesionSmellImpl();
		return hLowCohesionSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HDataClassAccessor createHDataClassAccessor() {
		HDataClassAccessorImpl hDataClassAccessor = new HDataClassAccessorImpl();
		return hDataClassAccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HMuchOverloadingCodeSmell createHMuchOverloadingCodeSmell() {
		HMuchOverloadingCodeSmellImpl hMuchOverloadingCodeSmell = new HMuchOverloadingCodeSmellImpl();
		return hMuchOverloadingCodeSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HManyParametersCodeSmell createHManyParametersCodeSmell() {
		HManyParametersCodeSmellImpl hManyParametersCodeSmell = new HManyParametersCodeSmellImpl();
		return hManyParametersCodeSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HIntenseFieldUsageCodeSmell createHIntenseFieldUsageCodeSmell() {
		HIntenseFieldUsageCodeSmellImpl hIntenseFieldUsageCodeSmell = new HIntenseFieldUsageCodeSmellImpl();
		return hIntenseFieldUsageCodeSmell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
