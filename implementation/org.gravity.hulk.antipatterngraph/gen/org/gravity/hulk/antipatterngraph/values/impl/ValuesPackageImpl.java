/**
 */
package org.gravity.hulk.antipatterngraph.values.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.antipatterngraph.antipattern.AntipatternPackage;

import org.gravity.hulk.antipatterngraph.antipattern.impl.AntipatternPackageImpl;

import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage;

import org.gravity.hulk.antipatterngraph.codesmells.impl.CodesmellsPackageImpl;

import org.gravity.hulk.antipatterngraph.impl.AntipatterngraphPackageImpl;

import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;

import org.gravity.hulk.antipatterngraph.metrics.impl.MetricsPackageImpl;

import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.antipatterngraph.values.ValuesFactory;
import org.gravity.hulk.antipatterngraph.values.ValuesPackage;

import org.gravity.typegraph.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValuesPackageImpl extends EPackageImpl implements ValuesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hRelativeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hRelativeValueConstantsEEnum = null;

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
	 * @see org.gravity.hulk.antipatterngraph.values.ValuesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValuesPackageImpl() {
		super(eNS_URI, ValuesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ValuesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValuesPackage init() {
		if (isInited)
			return (ValuesPackage) EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredValuesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ValuesPackageImpl theValuesPackage = registeredValuesPackage instanceof ValuesPackageImpl
				? (ValuesPackageImpl) registeredValuesPackage
				: new ValuesPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl) (registeredPackage instanceof MetricsPackageImpl
				? registeredPackage
				: MetricsPackage.eINSTANCE);

		// Create package meta-data objects
		theValuesPackage.createPackageContents();
		theAntipatterngraphPackage.createPackageContents();
		theAntipatternPackage.createPackageContents();
		theCodesmellsPackage.createPackageContents();
		theMetricsPackage.createPackageContents();

		// Initialize created meta-data
		theValuesPackage.initializePackageContents();
		theAntipatterngraphPackage.initializePackageContents();
		theAntipatternPackage.initializePackageContents();
		theCodesmellsPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValuesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValuesPackage.eNS_URI, theValuesPackage);
		return theValuesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHRelativeValue() {
		return hRelativeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHRelativeValue_Value() {
		return (EAttribute) hRelativeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHRelativeValueConstants() {
		return hRelativeValueConstantsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValuesFactory getValuesFactory() {
		return (ValuesFactory) getEFactoryInstance();
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
		hRelativeValueEClass = createEClass(HRELATIVE_VALUE);
		createEAttribute(hRelativeValueEClass, HRELATIVE_VALUE__VALUE);

		// Create enums
		hRelativeValueConstantsEEnum = createEEnum(HRELATIVE_VALUE_CONSTANTS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(hRelativeValueEClass, HRelativeValue.class, "HRelativeValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHRelativeValue_Value(), this.getHRelativeValueConstants(), "value", null, 1, 1,
				HRelativeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(hRelativeValueConstantsEEnum, HRelativeValueConstants.class, "HRelativeValueConstants");
		addEEnumLiteral(hRelativeValueConstantsEEnum, HRelativeValueConstants.VERY_HIGH);
		addEEnumLiteral(hRelativeValueConstantsEEnum, HRelativeValueConstants.HIGH);
		addEEnumLiteral(hRelativeValueConstantsEEnum, HRelativeValueConstants.MEDIUM);
		addEEnumLiteral(hRelativeValueConstantsEEnum, HRelativeValueConstants.LOW);
		addEEnumLiteral(hRelativeValueConstantsEEnum, HRelativeValueConstants.VERY_LOW);
	}

} //ValuesPackageImpl
