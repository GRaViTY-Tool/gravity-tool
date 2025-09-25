/**
 */
package org.gravity.hulk.detection.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.hulk.detection.metrics.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricsFactoryImpl extends EFactoryImpl implements MetricsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetricsFactory init() {
		try {
			MetricsFactory theMetricsFactory = (MetricsFactory) EPackage.Registry.INSTANCE
					.getEFactory(MetricsPackage.eNS_URI);
			if (theMetricsFactory != null) {
				return theMetricsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetricsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsFactoryImpl() {
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
		case MetricsPackage.HINVOCATION_RELATION_CALCULATOR:
			return createHInvocationRelationCalculator();
		case MetricsPackage.HIGAM_CALCULATOR:
			return createHIGAMCalculator();
		case MetricsPackage.HNUMBER_OF_CHILD_CALCULATOR:
			return createHNumberOfChildCalculator();
		case MetricsPackage.HIGAT_CALCULATOR:
			return createHIGATCalculator();
		case MetricsPackage.HMEMBER_NUMBER_CALCULATOR:
			return createHMemberNumberCalculator();
		case MetricsPackage.HLOCAL_ACCESS_RELATION_CALCULATOR:
			return createHLocalAccessRelationCalculator();
		case MetricsPackage.HMETHOD_NUMBER_CALCULATOR:
			return createHMethodNumberCalculator();
		case MetricsPackage.HGETTER_SETTER_METHOD_RELATION_CALCULATOR:
			return createHGetterSetterMethodRelationCalculator();
		case MetricsPackage.HAVERAGE_PARAMETERS_CALCULATOR:
			return createHAverageParametersCalculator();
		case MetricsPackage.HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR:
			return createHAverageOverloadingInClassCalculator();
		case MetricsPackage.HLOCAL_METHOD_ACCESS_CALCULATOR:
			return createHLocalMethodAccessCalculator();
		case MetricsPackage.HLOCAL_FIELDS_ACCESS_CALCULATOR:
			return createHLocalFieldsAccessCalculator();
		case MetricsPackage.HFIELD_NUMBER_CALCULATOR:
			return createHFieldNumberCalculator();
		case MetricsPackage.HTOTAL_VISIBILITY_CALCULATOR:
			return createHTotalVisibilityCalculator();
		case MetricsPackage.HTOTAL_COUPLING_CALCULATOR:
			return createHTotalCouplingCalculator();
		case MetricsPackage.HLCOM5_CALCULATOR:
			return createHLcom5Calculator();
		case MetricsPackage.HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR:
			return createHLocalFieldUniqueAccessCalculator();
		case MetricsPackage.HAFFERENT_COUPLING_CALCULATOR:
			return createHAfferentCouplingCalculator();
		case MetricsPackage.HEFFERENT_COUPLING_CALCULATOR:
			return createHEfferentCouplingCalculator();
		case MetricsPackage.HINCOMMING_INVOCATION_CALCULATOR:
			return createHIncommingInvocationCalculator();
		case MetricsPackage.HOUTGOING_INVOCATION_CALCULATOR:
			return createHOutgoingInvocationCalculator();
		case MetricsPackage.HDEPTH_OF_INHERITANCE_CALCULATOR:
			return createHDepthOfInheritanceCalculator();
		case MetricsPackage.HGETTER_CALCULATOR:
			return createHGetterCalculator();
		case MetricsPackage.HSETTER_CALCULATOR:
			return createHSetterCalculator();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HInvocationRelationCalculator createHInvocationRelationCalculator() {
		HInvocationRelationCalculatorImpl hInvocationRelationCalculator = new HInvocationRelationCalculatorImpl();
		return hInvocationRelationCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HIGAMCalculator createHIGAMCalculator() {
		HIGAMCalculatorImpl higamCalculator = new HIGAMCalculatorImpl();
		return higamCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HNumberOfChildCalculator createHNumberOfChildCalculator() {
		HNumberOfChildCalculatorImpl hNumberOfChildCalculator = new HNumberOfChildCalculatorImpl();
		return hNumberOfChildCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HIGATCalculator createHIGATCalculator() {
		HIGATCalculatorImpl higatCalculator = new HIGATCalculatorImpl();
		return higatCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMemberNumberCalculator createHMemberNumberCalculator() {
		HMemberNumberCalculatorImpl hMemberNumberCalculator = new HMemberNumberCalculatorImpl();
		return hMemberNumberCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalAccessRelationCalculator createHLocalAccessRelationCalculator() {
		HLocalAccessRelationCalculatorImpl hLocalAccessRelationCalculator = new HLocalAccessRelationCalculatorImpl();
		return hLocalAccessRelationCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMethodNumberCalculator createHMethodNumberCalculator() {
		HMethodNumberCalculatorImpl hMethodNumberCalculator = new HMethodNumberCalculatorImpl();
		return hMethodNumberCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HGetterSetterMethodRelationCalculator createHGetterSetterMethodRelationCalculator() {
		HGetterSetterMethodRelationCalculatorImpl hGetterSetterMethodRelationCalculator = new HGetterSetterMethodRelationCalculatorImpl();
		return hGetterSetterMethodRelationCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAverageParametersCalculator createHAverageParametersCalculator() {
		HAverageParametersCalculatorImpl hAverageParametersCalculator = new HAverageParametersCalculatorImpl();
		return hAverageParametersCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAverageOverloadingInClassCalculator createHAverageOverloadingInClassCalculator() {
		HAverageOverloadingInClassCalculatorImpl hAverageOverloadingInClassCalculator = new HAverageOverloadingInClassCalculatorImpl();
		return hAverageOverloadingInClassCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalMethodAccessCalculator createHLocalMethodAccessCalculator() {
		HLocalMethodAccessCalculatorImpl hLocalMethodAccessCalculator = new HLocalMethodAccessCalculatorImpl();
		return hLocalMethodAccessCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalFieldsAccessCalculator createHLocalFieldsAccessCalculator() {
		HLocalFieldsAccessCalculatorImpl hLocalFieldsAccessCalculator = new HLocalFieldsAccessCalculatorImpl();
		return hLocalFieldsAccessCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HFieldNumberCalculator createHFieldNumberCalculator() {
		HFieldNumberCalculatorImpl hFieldNumberCalculator = new HFieldNumberCalculatorImpl();
		return hFieldNumberCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTotalVisibilityCalculator createHTotalVisibilityCalculator() {
		HTotalVisibilityCalculatorImpl hTotalVisibilityCalculator = new HTotalVisibilityCalculatorImpl();
		return hTotalVisibilityCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTotalCouplingCalculator createHTotalCouplingCalculator() {
		HTotalCouplingCalculatorImpl hTotalCouplingCalculator = new HTotalCouplingCalculatorImpl();
		return hTotalCouplingCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLcom5Calculator createHLcom5Calculator() {
		HLcom5CalculatorImpl hLcom5Calculator = new HLcom5CalculatorImpl();
		return hLcom5Calculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLocalFieldUniqueAccessCalculator createHLocalFieldUniqueAccessCalculator() {
		HLocalFieldUniqueAccessCalculatorImpl hLocalFieldUniqueAccessCalculator = new HLocalFieldUniqueAccessCalculatorImpl();
		return hLocalFieldUniqueAccessCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAfferentCouplingCalculator createHAfferentCouplingCalculator() {
		HAfferentCouplingCalculatorImpl hAfferentCouplingCalculator = new HAfferentCouplingCalculatorImpl();
		return hAfferentCouplingCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HEfferentCouplingCalculator createHEfferentCouplingCalculator() {
		HEfferentCouplingCalculatorImpl hEfferentCouplingCalculator = new HEfferentCouplingCalculatorImpl();
		return hEfferentCouplingCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HIncommingInvocationCalculator createHIncommingInvocationCalculator() {
		HIncommingInvocationCalculatorImpl hIncommingInvocationCalculator = new HIncommingInvocationCalculatorImpl();
		return hIncommingInvocationCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HOutgoingInvocationCalculator createHOutgoingInvocationCalculator() {
		HOutgoingInvocationCalculatorImpl hOutgoingInvocationCalculator = new HOutgoingInvocationCalculatorImpl();
		return hOutgoingInvocationCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDepthOfInheritanceCalculator createHDepthOfInheritanceCalculator() {
		HDepthOfInheritanceCalculatorImpl hDepthOfInheritanceCalculator = new HDepthOfInheritanceCalculatorImpl();
		return hDepthOfInheritanceCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HGetterCalculator createHGetterCalculator() {
		HGetterCalculatorImpl hGetterCalculator = new HGetterCalculatorImpl();
		return hGetterCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSetterCalculator createHSetterCalculator() {
		HSetterCalculatorImpl hSetterCalculator = new HSetterCalculatorImpl();
		return hSetterCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsPackage getMetricsPackage() {
		return (MetricsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetricsPackage getPackage() {
		return MetricsPackage.eINSTANCE;
	}

} //MetricsFactoryImpl
