/**
 */
package org.gravity.hulk.antipatterngraph.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.hulk.antipatterngraph.metrics.*;

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
		case MetricsPackage.HNACC_METRIC:
			return createHNACCMetric();
		case MetricsPackage.HNUMBER_OF_MEMBERS_METRIC:
			return createHNumberOfMembersMetric();
		case MetricsPackage.HLOCAL_ACCESS_RELATION_METRIC:
			return createHLocalAccessRelationMetric();
		case MetricsPackage.HINVOCATION_RELATION:
			return createHInvocationRelation();
		case MetricsPackage.HNUMBER_OF_CHILD_METRIC:
			return createHNumberOfChildMetric();
		case MetricsPackage.HIGAM_METRIC:
			return createHIGAMMetric();
		case MetricsPackage.HIGAT_METRIC:
			return createHIGATMetric();
		case MetricsPackage.HNUMBER_OF_METHODS_METRIC:
			return createHNumberOfMethodsMetric();
		case MetricsPackage.HAVERAGE_OVERLOADING_IN_CLASS_METRIC:
			return createHAverageOverloadingInClassMetric();
		case MetricsPackage.HAVERAGE_PARAMETERS_METRIC:
			return createHAverageParametersMetric();
		case MetricsPackage.HLOCAL_METHOD_ACCESSES_METRIC:
			return createHLocalMethodAccessesMetric();
		case MetricsPackage.HLOCAL_FIELD_ACCESSES_METRIC:
			return createHLocalFieldAccessesMetric();
		case MetricsPackage.HTOTAL_VISIBILITY_METRIC:
			return createHTotalVisibilityMetric();
		case MetricsPackage.HTOTAL_COUPLING_METRIC:
			return createHTotalCouplingMetric();
		case MetricsPackage.HNUMBER_OF_FIELDS_METRIC:
			return createHNumberOfFieldsMetric();
		case MetricsPackage.HLCOM5_METRIC:
			return createHLCOM5Metric();
		case MetricsPackage.HEFFERENT_COUPLING_METRIC:
			return createHEfferentCouplingMetric();
		case MetricsPackage.HAFFERENT_COUPLING_METRIC:
			return createHAfferentCouplingMetric();
		case MetricsPackage.HLOCAL_FIELD_UNIQUE_ACCESS_METRIC:
			return createHLocalFieldUniqueAccessMetric();
		case MetricsPackage.HINCOMMING_INVOCATION_METRIC:
			return createHIncommingInvocationMetric();
		case MetricsPackage.HOUTGOING_INVOCATION_METRIC:
			return createHOutgoingInvocationMetric();
		case MetricsPackage.HDEPTH_OF_INHERITANCE_METRIC:
			return createHDepthOfInheritanceMetric();
		case MetricsPackage.HGETTER_METRIC:
			return createHGetterMetric();
		case MetricsPackage.HSETTER_METRIC:
			return createHSetterMetric();
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
	public HNACCMetric createHNACCMetric() {
		HNACCMetricImpl hnaccMetric = new HNACCMetricImpl();
		return hnaccMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HNumberOfMembersMetric createHNumberOfMembersMetric() {
		HNumberOfMembersMetricImpl hNumberOfMembersMetric = new HNumberOfMembersMetricImpl();
		return hNumberOfMembersMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLocalAccessRelationMetric createHLocalAccessRelationMetric() {
		HLocalAccessRelationMetricImpl hLocalAccessRelationMetric = new HLocalAccessRelationMetricImpl();
		return hLocalAccessRelationMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HInvocationRelation createHInvocationRelation() {
		HInvocationRelationImpl hInvocationRelation = new HInvocationRelationImpl();
		return hInvocationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HNumberOfChildMetric createHNumberOfChildMetric() {
		HNumberOfChildMetricImpl hNumberOfChildMetric = new HNumberOfChildMetricImpl();
		return hNumberOfChildMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HIGAMMetric createHIGAMMetric() {
		HIGAMMetricImpl higamMetric = new HIGAMMetricImpl();
		return higamMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HIGATMetric createHIGATMetric() {
		HIGATMetricImpl higatMetric = new HIGATMetricImpl();
		return higatMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HNumberOfMethodsMetric createHNumberOfMethodsMetric() {
		HNumberOfMethodsMetricImpl hNumberOfMethodsMetric = new HNumberOfMethodsMetricImpl();
		return hNumberOfMethodsMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HAverageOverloadingInClassMetric createHAverageOverloadingInClassMetric() {
		HAverageOverloadingInClassMetricImpl hAverageOverloadingInClassMetric = new HAverageOverloadingInClassMetricImpl();
		return hAverageOverloadingInClassMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HAverageParametersMetric createHAverageParametersMetric() {
		HAverageParametersMetricImpl hAverageParametersMetric = new HAverageParametersMetricImpl();
		return hAverageParametersMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLocalMethodAccessesMetric createHLocalMethodAccessesMetric() {
		HLocalMethodAccessesMetricImpl hLocalMethodAccessesMetric = new HLocalMethodAccessesMetricImpl();
		return hLocalMethodAccessesMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLocalFieldAccessesMetric createHLocalFieldAccessesMetric() {
		HLocalFieldAccessesMetricImpl hLocalFieldAccessesMetric = new HLocalFieldAccessesMetricImpl();
		return hLocalFieldAccessesMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTotalVisibilityMetric createHTotalVisibilityMetric() {
		HTotalVisibilityMetricImpl hTotalVisibilityMetric = new HTotalVisibilityMetricImpl();
		return hTotalVisibilityMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTotalCouplingMetric createHTotalCouplingMetric() {
		HTotalCouplingMetricImpl hTotalCouplingMetric = new HTotalCouplingMetricImpl();
		return hTotalCouplingMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HNumberOfFieldsMetric createHNumberOfFieldsMetric() {
		HNumberOfFieldsMetricImpl hNumberOfFieldsMetric = new HNumberOfFieldsMetricImpl();
		return hNumberOfFieldsMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLCOM5Metric createHLCOM5Metric() {
		HLCOM5MetricImpl hlcom5Metric = new HLCOM5MetricImpl();
		return hlcom5Metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HEfferentCouplingMetric createHEfferentCouplingMetric() {
		HEfferentCouplingMetricImpl hEfferentCouplingMetric = new HEfferentCouplingMetricImpl();
		return hEfferentCouplingMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HAfferentCouplingMetric createHAfferentCouplingMetric() {
		HAfferentCouplingMetricImpl hAfferentCouplingMetric = new HAfferentCouplingMetricImpl();
		return hAfferentCouplingMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HLocalFieldUniqueAccessMetric createHLocalFieldUniqueAccessMetric() {
		HLocalFieldUniqueAccessMetricImpl hLocalFieldUniqueAccessMetric = new HLocalFieldUniqueAccessMetricImpl();
		return hLocalFieldUniqueAccessMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HIncommingInvocationMetric createHIncommingInvocationMetric() {
		HIncommingInvocationMetricImpl hIncommingInvocationMetric = new HIncommingInvocationMetricImpl();
		return hIncommingInvocationMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HOutgoingInvocationMetric createHOutgoingInvocationMetric() {
		HOutgoingInvocationMetricImpl hOutgoingInvocationMetric = new HOutgoingInvocationMetricImpl();
		return hOutgoingInvocationMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HDepthOfInheritanceMetric createHDepthOfInheritanceMetric() {
		HDepthOfInheritanceMetricImpl hDepthOfInheritanceMetric = new HDepthOfInheritanceMetricImpl();
		return hDepthOfInheritanceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HGetterMetric createHGetterMetric() {
		HGetterMetricImpl hGetterMetric = new HGetterMetricImpl();
		return hGetterMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HSetterMetric createHSetterMetric() {
		HSetterMetricImpl hSetterMetric = new HSetterMetricImpl();
		return hSetterMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
