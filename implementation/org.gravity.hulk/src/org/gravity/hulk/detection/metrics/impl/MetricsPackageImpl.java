/**
 */
package org.gravity.hulk.detection.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.detection.DetectionPackage;

import org.gravity.hulk.detection.antipattern.AntipatternPackage;

import org.gravity.hulk.detection.antipattern.impl.AntipatternPackageImpl;

import org.gravity.hulk.detection.codesmells.CodesmellsPackage;

import org.gravity.hulk.detection.codesmells.impl.CodesmellsPackageImpl;

import org.gravity.hulk.detection.impl.DetectionPackageImpl;

import org.gravity.hulk.detection.metrics.HAfferentCouplingCalculator;
import org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator;
import org.gravity.hulk.detection.metrics.HAverageParametersCalculator;
import org.gravity.hulk.detection.metrics.HDepthOfInheritanceCalculator;
import org.gravity.hulk.detection.metrics.HEfferentCouplingCalculator;
import org.gravity.hulk.detection.metrics.HFieldNumberCalculator;
import org.gravity.hulk.detection.metrics.HGetterCalculator;
import org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator;
import org.gravity.hulk.detection.metrics.HIGAMCalculator;
import org.gravity.hulk.detection.metrics.HIGATCalculator;
import org.gravity.hulk.detection.metrics.HIncommingInvocationCalculator;
import org.gravity.hulk.detection.metrics.HInvocationRelationCalculator;
import org.gravity.hulk.detection.metrics.HLcom5Calculator;
import org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator;
import org.gravity.hulk.detection.metrics.HLocalFieldUniqueAccessCalculator;
import org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator;
import org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator;
import org.gravity.hulk.detection.metrics.HMemberNumberCalculator;
import org.gravity.hulk.detection.metrics.HMethodNumberCalculator;
import org.gravity.hulk.detection.metrics.HNumberOfChildCalculator;
import org.gravity.hulk.detection.metrics.HOutgoingInvocationCalculator;
import org.gravity.hulk.detection.metrics.HSetterCalculator;
import org.gravity.hulk.detection.metrics.HTotalCouplingCalculator;
import org.gravity.hulk.detection.metrics.HTotalVisibilityCalculator;
import org.gravity.hulk.detection.metrics.MetricsFactory;
import org.gravity.hulk.detection.metrics.MetricsPackage;

import org.gravity.hulk.impl.HulkPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

import org.moflon.core.dfs.DfsPackage;

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
	private EClass hInvocationRelationCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass higamCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hNumberOfChildCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass higatCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hMemberNumberCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLocalAccessRelationCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hMethodNumberCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hGetterSetterMethodRelationCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAverageParametersCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAverageOverloadingInClassCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLocalMethodAccessCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLocalFieldsAccessCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hFieldNumberCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hTotalVisibilityCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hTotalCouplingCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLcom5CalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hLocalFieldUniqueAccessCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hAfferentCouplingCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hEfferentCouplingCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hIncommingInvocationCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hOutgoingInvocationCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hDepthOfInheritanceCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hGetterCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSetterCalculatorEClass = null;

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
	 * @see org.gravity.hulk.detection.metrics.MetricsPackage#eNS_URI
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
		DfsPackage.eINSTANCE.eClass();
		AntipatterngraphPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HulkPackage.eNS_URI);
		HulkPackageImpl theHulkPackage = (HulkPackageImpl) (registeredPackage instanceof HulkPackageImpl
				? registeredPackage
				: HulkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DetectionPackage.eNS_URI);
		DetectionPackageImpl theDetectionPackage = (DetectionPackageImpl) (registeredPackage instanceof DetectionPackageImpl
				? registeredPackage
				: DetectionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AntipatternPackage.eNS_URI);
		AntipatternPackageImpl theAntipatternPackage = (AntipatternPackageImpl) (registeredPackage instanceof AntipatternPackageImpl
				? registeredPackage
				: AntipatternPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CodesmellsPackage.eNS_URI);
		CodesmellsPackageImpl theCodesmellsPackage = (CodesmellsPackageImpl) (registeredPackage instanceof CodesmellsPackageImpl
				? registeredPackage
				: CodesmellsPackage.eINSTANCE);

		// Create package meta-data objects
		theMetricsPackage.createPackageContents();
		theHulkPackage.createPackageContents();
		theDetectionPackage.createPackageContents();
		theAntipatternPackage.createPackageContents();
		theCodesmellsPackage.createPackageContents();

		// Initialize created meta-data
		theMetricsPackage.initializePackageContents();
		theHulkPackage.initializePackageContents();
		theDetectionPackage.initializePackageContents();
		theAntipatternPackage.initializePackageContents();
		theCodesmellsPackage.initializePackageContents();

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
	public EClass getHInvocationRelationCalculator() {
		return hInvocationRelationCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHInvocationRelationCalculator__CalculateMetric__TClass() {
		return hInvocationRelationCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHInvocationRelationCalculator__CalculateInvocValue__HIncommingInvocationMetric_HOutgoingInvocationMetric() {
		return hInvocationRelationCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHInvocationRelationCalculator__CalculateValue__TClass() {
		return hInvocationRelationCalculatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHIGAMCalculator() {
		return higamCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHIGAMCalculator__Detect__HAntiPatternGraph() {
		return higamCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHNumberOfChildCalculator() {
		return hNumberOfChildCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHNumberOfChildCalculator__CalculateMetric__TClass() {
		return hNumberOfChildCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHNumberOfChildCalculator__CalculateValue__TClass() {
		return hNumberOfChildCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHIGATCalculator() {
		return higatCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHIGATCalculator__Detect__HAntiPatternGraph() {
		return higatCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMemberNumberCalculator() {
		return hMemberNumberCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHMemberNumberCalculator__CalculateMetric__TClass() {
		return hMemberNumberCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHMemberNumberCalculator__CalculateValue__TClass() {
		return hMemberNumberCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLocalAccessRelationCalculator() {
		return hLocalAccessRelationCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalAccessRelationCalculator__CalculateMetric__TClass() {
		return hLocalAccessRelationCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalAccessRelationCalculator__CalculateValue__HLocalFieldAccessesMetric_HLocalMethodAccessesMetric() {
		return hLocalAccessRelationCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalAccessRelationCalculator__CalculateValue__TClass() {
		return hLocalAccessRelationCalculatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMethodNumberCalculator() {
		return hMethodNumberCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHMethodNumberCalculator__CalculateMetric__TClass() {
		return hMethodNumberCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHMethodNumberCalculator__CalculateValue__TClass() {
		return hMethodNumberCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHGetterSetterMethodRelationCalculator() {
		return hGetterSetterMethodRelationCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHGetterSetterMethodRelationCalculator__CalculateMetric__TClass() {
		return hGetterSetterMethodRelationCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHGetterSetterMethodRelationCalculator__CalculateValue__HSetterMetric_HGetterMetric_HNumberOfMethodsMetric() {
		return hGetterSetterMethodRelationCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHGetterSetterMethodRelationCalculator__CalculateValue__TClass() {
		return hGetterSetterMethodRelationCalculatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHAverageParametersCalculator() {
		return hAverageParametersCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAverageParametersCalculator__CalculateMetric__TClass() {
		return hAverageParametersCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAverageParametersCalculator__CalculateValue__TClass() {
		return hAverageParametersCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHAverageOverloadingInClassCalculator() {
		return hAverageOverloadingInClassCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAverageOverloadingInClassCalculator__CalculateMetric__TClass() {
		return hAverageOverloadingInClassCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAverageOverloadingInClassCalculator__CalculateValue__TClass() {
		return hAverageOverloadingInClassCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLocalMethodAccessCalculator() {
		return hLocalMethodAccessCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalMethodAccessCalculator__CalculateMetric__TClass() {
		return hLocalMethodAccessCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalMethodAccessCalculator__CalculateValue__TClass() {
		return hLocalMethodAccessCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLocalFieldsAccessCalculator() {
		return hLocalFieldsAccessCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalFieldsAccessCalculator__CalculateMetric__TClass() {
		return hLocalFieldsAccessCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalFieldsAccessCalculator__CalculateValue__TClass() {
		return hLocalFieldsAccessCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHFieldNumberCalculator() {
		return hFieldNumberCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHFieldNumberCalculator__CalculateMetric__TClass() {
		return hFieldNumberCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHFieldNumberCalculator__CalculateValue__TClass() {
		return hFieldNumberCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTotalVisibilityCalculator() {
		return hTotalVisibilityCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHTotalVisibilityCalculator__Detect__HAntiPatternGraph() {
		return hTotalVisibilityCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTotalCouplingCalculator() {
		return hTotalCouplingCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHTotalCouplingCalculator__CalculateMetric__TClass() {
		return hTotalCouplingCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHTotalCouplingCalculator__CalculateValue__TClass() {
		return hTotalCouplingCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLcom5Calculator() {
		return hLcom5CalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLcom5Calculator__CalculateMetric__TClass() {
		return hLcom5CalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLcom5Calculator__CalculateValue__TClass() {
		return hLcom5CalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLcom5Calculator__CalculateLcom5Value__HNumberOfFieldsMetric_HNumberOfMethodsMetric_HLocalFieldUniqueAccessMetric() {
		return hLcom5CalculatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHLocalFieldUniqueAccessCalculator() {
		return hLocalFieldUniqueAccessCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalFieldUniqueAccessCalculator__CalculateMetric__TClass() {
		return hLocalFieldUniqueAccessCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHLocalFieldUniqueAccessCalculator__CalculateValue__TClass() {
		return hLocalFieldUniqueAccessCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHAfferentCouplingCalculator() {
		return hAfferentCouplingCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAfferentCouplingCalculator__CalculateMetric__TClass() {
		return hAfferentCouplingCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHAfferentCouplingCalculator__CalculateValue__TClass() {
		return hAfferentCouplingCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHEfferentCouplingCalculator() {
		return hEfferentCouplingCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHEfferentCouplingCalculator__CalculateMetric__TClass() {
		return hEfferentCouplingCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHEfferentCouplingCalculator__CalculateValue__TClass() {
		return hEfferentCouplingCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHIncommingInvocationCalculator() {
		return hIncommingInvocationCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHIncommingInvocationCalculator__CalculateMetric__TClass() {
		return hIncommingInvocationCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHIncommingInvocationCalculator__CalculateValue__TClass() {
		return hIncommingInvocationCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHOutgoingInvocationCalculator() {
		return hOutgoingInvocationCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHOutgoingInvocationCalculator__CalculateMetric__TClass() {
		return hOutgoingInvocationCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHOutgoingInvocationCalculator__CalculateValue__TClass() {
		return hOutgoingInvocationCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDepthOfInheritanceCalculator() {
		return hDepthOfInheritanceCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHDepthOfInheritanceCalculator__CalculateMetric__TClass() {
		return hDepthOfInheritanceCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHDepthOfInheritanceCalculator__CalculateValue__TClass() {
		return hDepthOfInheritanceCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHGetterCalculator() {
		return hGetterCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHGetterCalculator__CalculateMetric__TClass() {
		return hGetterCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHGetterCalculator__CalculateValue__TClass() {
		return hGetterCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHSetterCalculator() {
		return hSetterCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHSetterCalculator__CalculateMetric__TClass() {
		return hSetterCalculatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHSetterCalculator__CalculateValue__TClass() {
		return hSetterCalculatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		hInvocationRelationCalculatorEClass = createEClass(HINVOCATION_RELATION_CALCULATOR);
		createEOperation(hInvocationRelationCalculatorEClass,
				HINVOCATION_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hInvocationRelationCalculatorEClass,
				HINVOCATION_RELATION_CALCULATOR___CALCULATE_INVOC_VALUE__HINCOMMINGINVOCATIONMETRIC_HOUTGOINGINVOCATIONMETRIC);
		createEOperation(hInvocationRelationCalculatorEClass,
				HINVOCATION_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS);

		higamCalculatorEClass = createEClass(HIGAM_CALCULATOR);
		createEOperation(higamCalculatorEClass, HIGAM_CALCULATOR___DETECT__HANTIPATTERNGRAPH);

		hNumberOfChildCalculatorEClass = createEClass(HNUMBER_OF_CHILD_CALCULATOR);
		createEOperation(hNumberOfChildCalculatorEClass, HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hNumberOfChildCalculatorEClass, HNUMBER_OF_CHILD_CALCULATOR___CALCULATE_VALUE__TCLASS);

		higatCalculatorEClass = createEClass(HIGAT_CALCULATOR);
		createEOperation(higatCalculatorEClass, HIGAT_CALCULATOR___DETECT__HANTIPATTERNGRAPH);

		hMemberNumberCalculatorEClass = createEClass(HMEMBER_NUMBER_CALCULATOR);
		createEOperation(hMemberNumberCalculatorEClass, HMEMBER_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hMemberNumberCalculatorEClass, HMEMBER_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hLocalAccessRelationCalculatorEClass = createEClass(HLOCAL_ACCESS_RELATION_CALCULATOR);
		createEOperation(hLocalAccessRelationCalculatorEClass,
				HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hLocalAccessRelationCalculatorEClass,
				HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__HLOCALFIELDACCESSESMETRIC_HLOCALMETHODACCESSESMETRIC);
		createEOperation(hLocalAccessRelationCalculatorEClass,
				HLOCAL_ACCESS_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hMethodNumberCalculatorEClass = createEClass(HMETHOD_NUMBER_CALCULATOR);
		createEOperation(hMethodNumberCalculatorEClass, HMETHOD_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hMethodNumberCalculatorEClass, HMETHOD_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hGetterSetterMethodRelationCalculatorEClass = createEClass(HGETTER_SETTER_METHOD_RELATION_CALCULATOR);
		createEOperation(hGetterSetterMethodRelationCalculatorEClass,
				HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hGetterSetterMethodRelationCalculatorEClass,
				HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__HSETTERMETRIC_HGETTERMETRIC_HNUMBEROFMETHODSMETRIC);
		createEOperation(hGetterSetterMethodRelationCalculatorEClass,
				HGETTER_SETTER_METHOD_RELATION_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hAverageParametersCalculatorEClass = createEClass(HAVERAGE_PARAMETERS_CALCULATOR);
		createEOperation(hAverageParametersCalculatorEClass, HAVERAGE_PARAMETERS_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hAverageParametersCalculatorEClass, HAVERAGE_PARAMETERS_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hAverageOverloadingInClassCalculatorEClass = createEClass(HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR);
		createEOperation(hAverageOverloadingInClassCalculatorEClass,
				HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hAverageOverloadingInClassCalculatorEClass,
				HAVERAGE_OVERLOADING_IN_CLASS_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hLocalMethodAccessCalculatorEClass = createEClass(HLOCAL_METHOD_ACCESS_CALCULATOR);
		createEOperation(hLocalMethodAccessCalculatorEClass,
				HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hLocalMethodAccessCalculatorEClass, HLOCAL_METHOD_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hLocalFieldsAccessCalculatorEClass = createEClass(HLOCAL_FIELDS_ACCESS_CALCULATOR);
		createEOperation(hLocalFieldsAccessCalculatorEClass,
				HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hLocalFieldsAccessCalculatorEClass, HLOCAL_FIELDS_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hFieldNumberCalculatorEClass = createEClass(HFIELD_NUMBER_CALCULATOR);
		createEOperation(hFieldNumberCalculatorEClass, HFIELD_NUMBER_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hFieldNumberCalculatorEClass, HFIELD_NUMBER_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hTotalVisibilityCalculatorEClass = createEClass(HTOTAL_VISIBILITY_CALCULATOR);
		createEOperation(hTotalVisibilityCalculatorEClass, HTOTAL_VISIBILITY_CALCULATOR___DETECT__HANTIPATTERNGRAPH);

		hTotalCouplingCalculatorEClass = createEClass(HTOTAL_COUPLING_CALCULATOR);
		createEOperation(hTotalCouplingCalculatorEClass, HTOTAL_COUPLING_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hTotalCouplingCalculatorEClass, HTOTAL_COUPLING_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hLcom5CalculatorEClass = createEClass(HLCOM5_CALCULATOR);
		createEOperation(hLcom5CalculatorEClass, HLCOM5_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hLcom5CalculatorEClass, HLCOM5_CALCULATOR___CALCULATE_VALUE__TCLASS);
		createEOperation(hLcom5CalculatorEClass,
				HLCOM5_CALCULATOR___CALCULATE_LCOM5_VALUE__HNUMBEROFFIELDSMETRIC_HNUMBEROFMETHODSMETRIC_HLOCALFIELDUNIQUEACCESSMETRIC);

		hLocalFieldUniqueAccessCalculatorEClass = createEClass(HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR);
		createEOperation(hLocalFieldUniqueAccessCalculatorEClass,
				HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hLocalFieldUniqueAccessCalculatorEClass,
				HLOCAL_FIELD_UNIQUE_ACCESS_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hAfferentCouplingCalculatorEClass = createEClass(HAFFERENT_COUPLING_CALCULATOR);
		createEOperation(hAfferentCouplingCalculatorEClass, HAFFERENT_COUPLING_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hAfferentCouplingCalculatorEClass, HAFFERENT_COUPLING_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hEfferentCouplingCalculatorEClass = createEClass(HEFFERENT_COUPLING_CALCULATOR);
		createEOperation(hEfferentCouplingCalculatorEClass, HEFFERENT_COUPLING_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hEfferentCouplingCalculatorEClass, HEFFERENT_COUPLING_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hIncommingInvocationCalculatorEClass = createEClass(HINCOMMING_INVOCATION_CALCULATOR);
		createEOperation(hIncommingInvocationCalculatorEClass,
				HINCOMMING_INVOCATION_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hIncommingInvocationCalculatorEClass,
				HINCOMMING_INVOCATION_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hOutgoingInvocationCalculatorEClass = createEClass(HOUTGOING_INVOCATION_CALCULATOR);
		createEOperation(hOutgoingInvocationCalculatorEClass,
				HOUTGOING_INVOCATION_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hOutgoingInvocationCalculatorEClass,
				HOUTGOING_INVOCATION_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hDepthOfInheritanceCalculatorEClass = createEClass(HDEPTH_OF_INHERITANCE_CALCULATOR);
		createEOperation(hDepthOfInheritanceCalculatorEClass,
				HDEPTH_OF_INHERITANCE_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hDepthOfInheritanceCalculatorEClass,
				HDEPTH_OF_INHERITANCE_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hGetterCalculatorEClass = createEClass(HGETTER_CALCULATOR);
		createEOperation(hGetterCalculatorEClass, HGETTER_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hGetterCalculatorEClass, HGETTER_CALCULATOR___CALCULATE_VALUE__TCLASS);

		hSetterCalculatorEClass = createEClass(HSETTER_CALCULATOR);
		createEOperation(hSetterCalculatorEClass, HSETTER_CALCULATOR___CALCULATE_METRIC__TCLASS);
		createEOperation(hSetterCalculatorEClass, HSETTER_CALCULATOR___CALCULATE_VALUE__TCLASS);
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
		DetectionPackage theDetectionPackage = (DetectionPackage) EPackage.Registry.INSTANCE
				.getEPackage(DetectionPackage.eNS_URI);
		AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage) EPackage.Registry.INSTANCE
				.getEPackage(AntipatterngraphPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		org.gravity.hulk.antipatterngraph.metrics.MetricsPackage theMetricsPackage_1 = (org.gravity.hulk.antipatterngraph.metrics.MetricsPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hInvocationRelationCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		higamCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHMetricCalculator());
		hNumberOfChildCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		higatCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHMetricCalculator());
		hMemberNumberCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hLocalAccessRelationCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hMethodNumberCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hGetterSetterMethodRelationCalculatorEClass.getESuperTypes()
				.add(theDetectionPackage.getHClassBasedMetricCalculator());
		hAverageParametersCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hAverageOverloadingInClassCalculatorEClass.getESuperTypes()
				.add(theDetectionPackage.getHClassBasedMetricCalculator());
		hLocalMethodAccessCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hLocalFieldsAccessCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hFieldNumberCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hTotalVisibilityCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHMetricCalculator());
		hTotalCouplingCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hLcom5CalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hLocalFieldUniqueAccessCalculatorEClass.getESuperTypes()
				.add(theDetectionPackage.getHClassBasedMetricCalculator());
		hAfferentCouplingCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hEfferentCouplingCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hIncommingInvocationCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hOutgoingInvocationCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hDepthOfInheritanceCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hGetterCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());
		hSetterCalculatorEClass.getESuperTypes().add(theDetectionPackage.getHClassBasedMetricCalculator());

		// Initialize classes, features, and operations; add parameters
		initEClass(hInvocationRelationCalculatorEClass, HInvocationRelationCalculator.class,
				"HInvocationRelationCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getHInvocationRelationCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getHInvocationRelationCalculator__CalculateInvocValue__HIncommingInvocationMetric_HOutgoingInvocationMetric(),
				ecorePackage.getEDouble(), "calculateInvocValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHIncommingInvocationMetric(), "nii", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHOutgoingInvocationMetric(), "noi", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHInvocationRelationCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(higamCalculatorEClass, HIGAMCalculator.class, "HIGAMCalculator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHIGAMCalculator__Detect__HAntiPatternGraph(), ecorePackage.getEBoolean(), "detect", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatterngraphPackage.getHAntiPatternGraph(), "apg", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hNumberOfChildCalculatorEClass, HNumberOfChildCalculator.class, "HNumberOfChildCalculator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHNumberOfChildCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHNumberOfChildCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tParent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(higatCalculatorEClass, HIGATCalculator.class, "HIGATCalculator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHIGATCalculator__Detect__HAntiPatternGraph(), ecorePackage.getEBoolean(), "detect", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatterngraphPackage.getHAntiPatternGraph(), "apg", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hMemberNumberCalculatorEClass, HMemberNumberCalculator.class, "HMemberNumberCalculator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHMemberNumberCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHMemberNumberCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hLocalAccessRelationCalculatorEClass, HLocalAccessRelationCalculator.class,
				"HLocalAccessRelationCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHLocalAccessRelationCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getHLocalAccessRelationCalculator__CalculateValue__HLocalFieldAccessesMetric_HLocalMethodAccessesMetric(),
				ecorePackage.getEDouble(), "calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHLocalFieldAccessesMetric(), "fa", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHLocalMethodAccessesMetric(), "ma", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHLocalAccessRelationCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hMethodNumberCalculatorEClass, HMethodNumberCalculator.class, "HMethodNumberCalculator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHMethodNumberCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHMethodNumberCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hGetterSetterMethodRelationCalculatorEClass, HGetterSetterMethodRelationCalculator.class,
				"HGetterSetterMethodRelationCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHGetterSetterMethodRelationCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getHGetterSetterMethodRelationCalculator__CalculateValue__HSetterMetric_HGetterMetric_HNumberOfMethodsMetric(),
				ecorePackage.getEDouble(), "calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHSetterMetric(), "setter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHGetterMetric(), "getter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHNumberOfMethodsMetric(), "methods", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHGetterSetterMethodRelationCalculator__CalculateValue__TClass(),
				ecorePackage.getEDouble(), "calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hAverageParametersCalculatorEClass, HAverageParametersCalculator.class,
				"HAverageParametersCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHAverageParametersCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHAverageParametersCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hAverageOverloadingInClassCalculatorEClass, HAverageOverloadingInClassCalculator.class,
				"HAverageOverloadingInClassCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHAverageOverloadingInClassCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHAverageOverloadingInClassCalculator__CalculateValue__TClass(),
				ecorePackage.getEDouble(), "calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hLocalMethodAccessCalculatorEClass, HLocalMethodAccessCalculator.class,
				"HLocalMethodAccessCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHLocalMethodAccessCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHLocalMethodAccessCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hLocalFieldsAccessCalculatorEClass, HLocalFieldsAccessCalculator.class,
				"HLocalFieldsAccessCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHLocalFieldsAccessCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHLocalFieldsAccessCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hFieldNumberCalculatorEClass, HFieldNumberCalculator.class, "HFieldNumberCalculator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHFieldNumberCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHFieldNumberCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hTotalVisibilityCalculatorEClass, HTotalVisibilityCalculator.class, "HTotalVisibilityCalculator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHTotalVisibilityCalculator__Detect__HAntiPatternGraph(), ecorePackage.getEBoolean(),
				"detect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAntipatterngraphPackage.getHAntiPatternGraph(), "apg", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hTotalCouplingCalculatorEClass, HTotalCouplingCalculator.class, "HTotalCouplingCalculator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHTotalCouplingCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHTotalCouplingCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hLcom5CalculatorEClass, HLcom5Calculator.class, "HLcom5Calculator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHLcom5Calculator__CalculateMetric__TClass(), theAntipatterngraphPackage.getHMetric(),
				"calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHLcom5Calculator__CalculateValue__TClass(), ecorePackage.getEDouble(), "calculateValue",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getHLcom5Calculator__CalculateLcom5Value__HNumberOfFieldsMetric_HNumberOfMethodsMetric_HLocalFieldUniqueAccessMetric(),
				ecorePackage.getEDouble(), "CalculateLcom5Value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHNumberOfFieldsMetric(), "nof", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHNumberOfMethodsMetric(), "nom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage_1.getHLocalFieldUniqueAccessMetric(), "lfa", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hLocalFieldUniqueAccessCalculatorEClass, HLocalFieldUniqueAccessCalculator.class,
				"HLocalFieldUniqueAccessCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHLocalFieldUniqueAccessCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHLocalFieldUniqueAccessCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hAfferentCouplingCalculatorEClass, HAfferentCouplingCalculator.class, "HAfferentCouplingCalculator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHAfferentCouplingCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHAfferentCouplingCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hEfferentCouplingCalculatorEClass, HEfferentCouplingCalculator.class, "HEfferentCouplingCalculator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHEfferentCouplingCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHEfferentCouplingCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hIncommingInvocationCalculatorEClass, HIncommingInvocationCalculator.class,
				"HIncommingInvocationCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHIncommingInvocationCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHIncommingInvocationCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hOutgoingInvocationCalculatorEClass, HOutgoingInvocationCalculator.class,
				"HOutgoingInvocationCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHOutgoingInvocationCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHOutgoingInvocationCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hDepthOfInheritanceCalculatorEClass, HDepthOfInheritanceCalculator.class,
				"HDepthOfInheritanceCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHDepthOfInheritanceCalculator__CalculateMetric__TClass(),
				theAntipatterngraphPackage.getHMetric(), "calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHDepthOfInheritanceCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(),
				"calculateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hGetterCalculatorEClass, HGetterCalculator.class, "HGetterCalculator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHGetterCalculator__CalculateMetric__TClass(), theAntipatterngraphPackage.getHMetric(),
				"calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHGetterCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(), "calculateValue",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hSetterCalculatorEClass, HSetterCalculator.class, "HSetterCalculator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHSetterCalculator__CalculateMetric__TClass(), theAntipatterngraphPackage.getHMetric(),
				"calculateMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHSetterCalculator__CalculateValue__TClass(), ecorePackage.getEDouble(), "calculateValue",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTClass(), "tClass", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //MetricsPackageImpl
