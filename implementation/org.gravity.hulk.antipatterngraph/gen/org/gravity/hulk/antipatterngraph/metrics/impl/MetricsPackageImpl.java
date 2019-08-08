/**
 */
package org.gravity.hulk.antipatterngraph.metrics.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage;

import org.gravity.hulk.antipatterngraph.antipattern.impl.AntipatternPackageImpl;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;

import org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl;

import org.gravity.hulk.antipatterngraph.impl.AntipatterngraphPackageImpl;

import org.gravity.hulk.antipatterngraph.metrics.HAfferentCouplingMetric;
import org.gravity.hulk.antipatterngraph.metrics.HAverageOverloadingInClassMetric;
import org.gravity.hulk.antipatterngraph.metrics.HAverageParametersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HDepthOfInheritanceMetric;
import org.gravity.hulk.antipatterngraph.metrics.HEfferentCouplingMetric;
import org.gravity.hulk.antipatterngraph.metrics.HGetterMetric;
import org.gravity.hulk.antipatterngraph.metrics.HIGAMMetric;
import org.gravity.hulk.antipatterngraph.metrics.HIGATMetric;
import org.gravity.hulk.antipatterngraph.metrics.HIncommingInvocationMetric;
import org.gravity.hulk.antipatterngraph.metrics.HInvocationRelation;
import org.gravity.hulk.antipatterngraph.metrics.HLCOM5Metric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalAccessRelationMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalFieldUniqueAccessMetric;
import org.gravity.hulk.antipatterngraph.metrics.HLocalMethodAccessesMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNACCMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfChildMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfFieldsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMembersMetric;
import org.gravity.hulk.antipatterngraph.metrics.HNumberOfMethodsMetric;
import org.gravity.hulk.antipatterngraph.metrics.HOutgoingInvocationMetric;
import org.gravity.hulk.antipatterngraph.metrics.HSetterMetric;
import org.gravity.hulk.antipatterngraph.metrics.HTotalCouplingMetric;
import org.gravity.hulk.antipatterngraph.metrics.HTotalVisibilityMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;

import org.gravity.hulk.antipatterngraph.values.ValuesPackage;

import org.gravity.hulk.antipatterngraph.values.impl.ValuesPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricsPackageImpl extends EPackageImpl implements MetricsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hnaccMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hNumberOfMembersMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLocalAccessRelationMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hInvocationRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hNumberOfChildMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass higamMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass higatMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hNumberOfMethodsMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAverageOverloadingInClassMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAverageParametersMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLocalMethodAccessesMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLocalFieldAccessesMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hTotalVisibilityMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hTotalCouplingMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hNumberOfFieldsMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hlcom5MetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hEfferentCouplingMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAfferentCouplingMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLocalFieldUniqueAccessMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hIncommingInvocationMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hOutgoingInvocationMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hDepthOfInheritanceMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hGetterMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSetterMetricEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gravity.hulk.antipatterngraph.metrics.MetricsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetricsPackageImpl() {
		super(eNS_URI, MetricsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MetricsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetricsPackage init() {
		if (isInited)
			return (MetricsPackage) EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetricsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetricsPackageImpl theMetricsPackage = registeredMetricsPackage instanceof MetricsPackageImpl
				? (MetricsPackageImpl) registeredMetricsPackage
				: new MetricsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AntipatterngraphPackage.eNS_URI);
		AntipatterngraphPackageImpl theAntipatterngraphPackage = (AntipatterngraphPackageImpl) (registeredPackage instanceof AntipatterngraphPackageImpl
				? registeredPackage
				: AntipatterngraphPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AntipatternPackage.eNS_URI);
		AntipatternPackageImpl theAntipatternPackage = (AntipatternPackageImpl) (registeredPackage instanceof AntipatternPackageImpl
				? registeredPackage
				: AntipatternPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CodesmellsPackage.eNS_URI);
		CodesmellsPackageImpl theCodesmellsPackage = (CodesmellsPackageImpl) (registeredPackage instanceof CodesmellsPackageImpl
				? registeredPackage
				: CodesmellsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl) (registeredPackage instanceof ValuesPackageImpl
				? registeredPackage
				: ValuesPackage.eINSTANCE);

		// Create package meta-data objects
		theMetricsPackage.createPackageContents();
		theAntipatterngraphPackage.createPackageContents();
		theAntipatternPackage.createPackageContents();
		theCodesmellsPackage.createPackageContents();
		theValuesPackage.createPackageContents();

		// Initialize created meta-data
		theMetricsPackage.initializePackageContents();
		theAntipatterngraphPackage.initializePackageContents();
		theAntipatternPackage.initializePackageContents();
		theCodesmellsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetricsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetricsPackage.eNS_URI, theMetricsPackage);
		return theMetricsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHNACCMetric() {
		return hnaccMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHNACCMetric_HGetterSetterSmells() {
		return (EReference) hnaccMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHNACCMetric_HGetterCustomMetric() {
		return (EReference) hnaccMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHNACCMetric_HSetterCustomMetric() {
		return (EReference) hnaccMetricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHNACCMetric_HNumberOfMethodsMetric() {
		return (EReference) hnaccMetricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHNumberOfMembersMetric() {
		return hNumberOfMembersMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHLocalAccessRelationMetric() {
		return hLocalAccessRelationMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHLocalAccessRelationMetric_HLocalFieldAccesses() {
		return (EReference) hLocalAccessRelationMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHLocalAccessRelationMetric_HLocalMethodAccesses() {
		return (EReference) hLocalAccessRelationMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHInvocationRelation() {
		return hInvocationRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHInvocationRelation_HOutgoingInvocationCustomMetric() {
		return (EReference) hInvocationRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHInvocationRelation_HIncommingInvocationCustomMetric() {
		return (EReference) hInvocationRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHNumberOfChildMetric() {
		return hNumberOfChildMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHIGAMMetric() {
		return higamMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHIGAMMetric_HMinVis() {
		return (EAttribute) higamMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHIGATMetric() {
		return higatMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHIGATMetric_HMinVis() {
		return (EAttribute) higatMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHNumberOfMethodsMetric() {
		return hNumberOfMethodsMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHAverageOverloadingInClassMetric() {
		return hAverageOverloadingInClassMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHAverageParametersMetric() {
		return hAverageParametersMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHLocalMethodAccessesMetric() {
		return hLocalMethodAccessesMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHLocalFieldAccessesMetric() {
		return hLocalFieldAccessesMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHTotalVisibilityMetric() {
		return hTotalVisibilityMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHTotalCouplingMetric() {
		return hTotalCouplingMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHNumberOfFieldsMetric() {
		return hNumberOfFieldsMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHLCOM5Metric() {
		return hlcom5MetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHLCOM5Metric_HNumberOfMethodsMetric() {
		return (EReference) hlcom5MetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHLCOM5Metric_HNumberOfFieldsMetric() {
		return (EReference) hlcom5MetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHLCOM5Metric_HLocalFieldUniqueAccessMetric() {
		return (EReference) hlcom5MetricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHEfferentCouplingMetric() {
		return hEfferentCouplingMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHAfferentCouplingMetric() {
		return hAfferentCouplingMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHLocalFieldUniqueAccessMetric() {
		return hLocalFieldUniqueAccessMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHIncommingInvocationMetric() {
		return hIncommingInvocationMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHOutgoingInvocationMetric() {
		return hOutgoingInvocationMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHDepthOfInheritanceMetric() {
		return hDepthOfInheritanceMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHGetterMetric() {
		return hGetterMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHSetterMetric() {
		return hSetterMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetricsFactory getMetricsFactory() {
		return (MetricsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		hnaccMetricEClass = createEClass(HNACC_METRIC);
		createEReference(hnaccMetricEClass, HNACC_METRIC__HGETTER_SETTER_SMELLS);
		createEReference(hnaccMetricEClass, HNACC_METRIC__HGETTER_CUSTOM_METRIC);
		createEReference(hnaccMetricEClass, HNACC_METRIC__HSETTER_CUSTOM_METRIC);
		createEReference(hnaccMetricEClass, HNACC_METRIC__HNUMBER_OF_METHODS_METRIC);

		hNumberOfMembersMetricEClass = createEClass(HNUMBER_OF_MEMBERS_METRIC);

		hLocalAccessRelationMetricEClass = createEClass(HLOCAL_ACCESS_RELATION_METRIC);
		createEReference(hLocalAccessRelationMetricEClass, HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_FIELD_ACCESSES);
		createEReference(hLocalAccessRelationMetricEClass, HLOCAL_ACCESS_RELATION_METRIC__HLOCAL_METHOD_ACCESSES);

		hInvocationRelationEClass = createEClass(HINVOCATION_RELATION);
		createEReference(hInvocationRelationEClass, HINVOCATION_RELATION__HOUTGOING_INVOCATION_CUSTOM_METRIC);
		createEReference(hInvocationRelationEClass, HINVOCATION_RELATION__HINCOMMING_INVOCATION_CUSTOM_METRIC);

		hNumberOfChildMetricEClass = createEClass(HNUMBER_OF_CHILD_METRIC);

		higamMetricEClass = createEClass(HIGAM_METRIC);
		createEAttribute(higamMetricEClass, HIGAM_METRIC__HMIN_VIS);

		higatMetricEClass = createEClass(HIGAT_METRIC);
		createEAttribute(higatMetricEClass, HIGAT_METRIC__HMIN_VIS);

		hNumberOfMethodsMetricEClass = createEClass(HNUMBER_OF_METHODS_METRIC);

		hAverageOverloadingInClassMetricEClass = createEClass(HAVERAGE_OVERLOADING_IN_CLASS_METRIC);

		hAverageParametersMetricEClass = createEClass(HAVERAGE_PARAMETERS_METRIC);

		hLocalMethodAccessesMetricEClass = createEClass(HLOCAL_METHOD_ACCESSES_METRIC);

		hLocalFieldAccessesMetricEClass = createEClass(HLOCAL_FIELD_ACCESSES_METRIC);

		hTotalVisibilityMetricEClass = createEClass(HTOTAL_VISIBILITY_METRIC);

		hTotalCouplingMetricEClass = createEClass(HTOTAL_COUPLING_METRIC);

		hNumberOfFieldsMetricEClass = createEClass(HNUMBER_OF_FIELDS_METRIC);

		hlcom5MetricEClass = createEClass(HLCOM5_METRIC);
		createEReference(hlcom5MetricEClass, HLCOM5_METRIC__HNUMBER_OF_METHODS_METRIC);
		createEReference(hlcom5MetricEClass, HLCOM5_METRIC__HNUMBER_OF_FIELDS_METRIC);
		createEReference(hlcom5MetricEClass, HLCOM5_METRIC__HLOCAL_FIELD_UNIQUE_ACCESS_METRIC);

		hEfferentCouplingMetricEClass = createEClass(HEFFERENT_COUPLING_METRIC);

		hAfferentCouplingMetricEClass = createEClass(HAFFERENT_COUPLING_METRIC);

		hLocalFieldUniqueAccessMetricEClass = createEClass(HLOCAL_FIELD_UNIQUE_ACCESS_METRIC);

		hIncommingInvocationMetricEClass = createEClass(HINCOMMING_INVOCATION_METRIC);

		hOutgoingInvocationMetricEClass = createEClass(HOUTGOING_INVOCATION_METRIC);

		hDepthOfInheritanceMetricEClass = createEClass(HDEPTH_OF_INHERITANCE_METRIC);

		hGetterMetricEClass = createEClass(HGETTER_METRIC);

		hSetterMetricEClass = createEClass(HSETTER_METRIC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatterngraphPackage.eNS_URI);
		CodesmellsPackage theCodesmellsPackage = (CodesmellsPackage) EPackage.Registry.INSTANCE
				.getEPackage(CodesmellsPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hnaccMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hNumberOfMembersMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hLocalAccessRelationMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hInvocationRelationEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hNumberOfChildMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		higamMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		higatMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hNumberOfMethodsMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hAverageOverloadingInClassMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hAverageParametersMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hLocalMethodAccessesMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hLocalFieldAccessesMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hTotalVisibilityMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hTotalCouplingMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hNumberOfFieldsMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hlcom5MetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hEfferentCouplingMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hAfferentCouplingMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hLocalFieldUniqueAccessMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hIncommingInvocationMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hOutgoingInvocationMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hDepthOfInheritanceMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hGetterMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());
		hSetterMetricEClass.getESuperTypes().add(theAntipatterngraphPackage.getHMetric());

		// Initialize classes, features, and operations; add parameters
		initEClass(hnaccMetricEClass, HNACCMetric.class, "HNACCMetric", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHNACCMetric_HGetterSetterSmells(), theCodesmellsPackage.getHGetterSetterSmell(), null,
				"hGetterSetterSmells", null, 0, -1, HNACCMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHNACCMetric_HGetterCustomMetric(), this.getHGetterMetric(), null, "hGetterCustomMetric", null,
				0, 1, HNACCMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHNACCMetric_HSetterCustomMetric(), this.getHSetterMetric(), null, "hSetterCustomMetric", null,
				0, 1, HNACCMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHNACCMetric_HNumberOfMethodsMetric(), this.getHNumberOfMethodsMetric(), null,
				"hNumberOfMethodsMetric", null, 0, 1, HNACCMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hNumberOfMembersMetricEClass, HNumberOfMembersMetric.class, "HNumberOfMembersMetric", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hLocalAccessRelationMetricEClass, HLocalAccessRelationMetric.class, "HLocalAccessRelationMetric",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHLocalAccessRelationMetric_HLocalFieldAccesses(), this.getHLocalFieldAccessesMetric(), null,
				"hLocalFieldAccesses", null, 0, 1, HLocalAccessRelationMetric.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHLocalAccessRelationMetric_HLocalMethodAccesses(), this.getHLocalMethodAccessesMetric(), null,
				"hLocalMethodAccesses", null, 0, 1, HLocalAccessRelationMetric.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hInvocationRelationEClass, HInvocationRelation.class, "HInvocationRelation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHInvocationRelation_HOutgoingInvocationCustomMetric(), this.getHOutgoingInvocationMetric(),
				null, "hOutgoingInvocationCustomMetric", null, 0, 1, HInvocationRelation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getHInvocationRelation_HIncommingInvocationCustomMetric(), this.getHIncommingInvocationMetric(),
				null, "hIncommingInvocationCustomMetric", null, 0, 1, HInvocationRelation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(hNumberOfChildMetricEClass, HNumberOfChildMetric.class, "HNumberOfChildMetric", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(higamMetricEClass, HIGAMMetric.class, "HIGAMMetric", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHIGAMMetric_HMinVis(), theBasicPackage.getTVisibility(), "hMinVis", null, 1, 1,
				HIGAMMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(higatMetricEClass, HIGATMetric.class, "HIGATMetric", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHIGATMetric_HMinVis(), theBasicPackage.getTVisibility(), "hMinVis", null, 1, 1,
				HIGATMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(hNumberOfMethodsMetricEClass, HNumberOfMethodsMetric.class, "HNumberOfMethodsMetric", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hAverageOverloadingInClassMetricEClass, HAverageOverloadingInClassMetric.class,
				"HAverageOverloadingInClassMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hAverageParametersMetricEClass, HAverageParametersMetric.class, "HAverageParametersMetric",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hLocalMethodAccessesMetricEClass, HLocalMethodAccessesMetric.class, "HLocalMethodAccessesMetric",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hLocalFieldAccessesMetricEClass, HLocalFieldAccessesMetric.class, "HLocalFieldAccessesMetric",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hTotalVisibilityMetricEClass, HTotalVisibilityMetric.class, "HTotalVisibilityMetric", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hTotalCouplingMetricEClass, HTotalCouplingMetric.class, "HTotalCouplingMetric", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hNumberOfFieldsMetricEClass, HNumberOfFieldsMetric.class, "HNumberOfFieldsMetric", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hlcom5MetricEClass, HLCOM5Metric.class, "HLCOM5Metric", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHLCOM5Metric_HNumberOfMethodsMetric(), this.getHNumberOfMethodsMetric(), null,
				"hNumberOfMethodsMetric", null, 0, 1, HLCOM5Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHLCOM5Metric_HNumberOfFieldsMetric(), this.getHNumberOfFieldsMetric(), null,
				"hNumberOfFieldsMetric", null, 0, 1, HLCOM5Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHLCOM5Metric_HLocalFieldUniqueAccessMetric(), this.getHLocalFieldUniqueAccessMetric(), null,
				"hLocalFieldUniqueAccessMetric", null, 0, 1, HLCOM5Metric.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hEfferentCouplingMetricEClass, HEfferentCouplingMetric.class, "HEfferentCouplingMetric",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hAfferentCouplingMetricEClass, HAfferentCouplingMetric.class, "HAfferentCouplingMetric",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hLocalFieldUniqueAccessMetricEClass, HLocalFieldUniqueAccessMetric.class,
				"HLocalFieldUniqueAccessMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hIncommingInvocationMetricEClass, HIncommingInvocationMetric.class, "HIncommingInvocationMetric",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hOutgoingInvocationMetricEClass, HOutgoingInvocationMetric.class, "HOutgoingInvocationMetric",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hDepthOfInheritanceMetricEClass, HDepthOfInheritanceMetric.class, "HDepthOfInheritanceMetric",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hGetterMetricEClass, HGetterMetric.class, "HGetterMetric", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hSetterMetricEClass, HSetterMetric.class, "HSetterMetric", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //MetricsPackageImpl
