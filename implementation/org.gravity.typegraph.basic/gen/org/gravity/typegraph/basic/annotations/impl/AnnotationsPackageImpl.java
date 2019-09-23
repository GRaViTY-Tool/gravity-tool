/**
 */
package org.gravity.typegraph.basic.annotations.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.AnnotationsPackage;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;
import org.gravity.typegraph.basic.annotations.TAnnotationValue;
import org.gravity.typegraph.basic.annotations.TBoolNode;
import org.gravity.typegraph.basic.annotations.TClassNode;
import org.gravity.typegraph.basic.annotations.TNumberNode;
import org.gravity.typegraph.basic.annotations.TTextAnnotation;
import org.gravity.typegraph.basic.annotations.TTextNode;

import org.gravity.typegraph.basic.containers.ContainersPackage;

import org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl;

import org.gravity.typegraph.basic.impl.BasicPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationsPackageImpl extends EPackageImpl implements AnnotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAnnotationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTextAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAnnotatableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTextNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tNumberNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tBoolNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tClassNodeEClass = null;

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
	 * @see org.gravity.typegraph.basic.annotations.AnnotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnnotationsPackageImpl() {
		super(eNS_URI, AnnotationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AnnotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnnotationsPackage init() {
		if (isInited) return (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAnnotationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AnnotationsPackageImpl theAnnotationsPackage = registeredAnnotationsPackage instanceof AnnotationsPackageImpl ? (AnnotationsPackageImpl)registeredAnnotationsPackage : new AnnotationsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)(registeredPackage instanceof BasicPackageImpl ? registeredPackage : BasicPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI);
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl)(registeredPackage instanceof ContainersPackageImpl ? registeredPackage : ContainersPackage.eINSTANCE);

		// Create package meta-data objects
		theAnnotationsPackage.createPackageContents();
		theBasicPackage.createPackageContents();
		theContainersPackage.createPackageContents();

		// Initialize created meta-data
		theAnnotationsPackage.initializePackageContents();
		theBasicPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnnotationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnnotationsPackage.eNS_URI, theAnnotationsPackage);
		return theAnnotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAnnotationValue() {
		return tAnnotationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTAnnotationValue_TKey() {
		return (EAttribute)tAnnotationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAnnotationValue_TValue() {
		return (EReference)tAnnotationValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTextAnnotation() {
		return tTextAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTextAnnotation_Text() {
		return (EAttribute)tTextAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAnnotation() {
		return tAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAnnotation_TAnnotated() {
		return (EReference)tAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAnnotation_Type() {
		return (EReference)tAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAnnotation_TValues() {
		return (EReference)tAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAnnotation__GetValue__String() {
		return tAnnotationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAnnotationType() {
		return tAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAnnotationType_Annotations() {
		return (EReference)tAnnotationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAnnotationType__IsSubTypeOf__TAbstractType() {
		return tAnnotationTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAnnotationType__IsSuperTypeOf__TAbstractType() {
		return tAnnotationTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAnnotatable() {
		return tAnnotatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAnnotatable_TAnnotation() {
		return (EReference)tAnnotatableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAnnotatable__GetTAnnotation__EClass() {
		return tAnnotatableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTextNode() {
		return tTextNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTextNode_TText() {
		return (EAttribute)tTextNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTNumberNode() {
		return tNumberNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTNumberNode_TNumber() {
		return (EAttribute)tNumberNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTBoolNode() {
		return tBoolNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTBoolNode_Value() {
		return (EAttribute)tBoolNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTClassNode() {
		return tClassNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTClassNode_TClass() {
		return (EReference)tClassNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationsFactory getAnnotationsFactory() {
		return (AnnotationsFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tAnnotationValueEClass = createEClass(TANNOTATION_VALUE);
		createEAttribute(tAnnotationValueEClass, TANNOTATION_VALUE__TKEY);
		createEReference(tAnnotationValueEClass, TANNOTATION_VALUE__TVALUE);

		tTextAnnotationEClass = createEClass(TTEXT_ANNOTATION);
		createEAttribute(tTextAnnotationEClass, TTEXT_ANNOTATION__TEXT);

		tAnnotationEClass = createEClass(TANNOTATION);
		createEReference(tAnnotationEClass, TANNOTATION__TANNOTATED);
		createEReference(tAnnotationEClass, TANNOTATION__TYPE);
		createEReference(tAnnotationEClass, TANNOTATION__TVALUES);
		createEOperation(tAnnotationEClass, TANNOTATION___GET_VALUE__STRING);

		tAnnotationTypeEClass = createEClass(TANNOTATION_TYPE);
		createEReference(tAnnotationTypeEClass, TANNOTATION_TYPE__ANNOTATIONS);
		createEOperation(tAnnotationTypeEClass, TANNOTATION_TYPE___IS_SUB_TYPE_OF__TABSTRACTTYPE);
		createEOperation(tAnnotationTypeEClass, TANNOTATION_TYPE___IS_SUPER_TYPE_OF__TABSTRACTTYPE);

		tAnnotatableEClass = createEClass(TANNOTATABLE);
		createEReference(tAnnotatableEClass, TANNOTATABLE__TANNOTATION);
		createEOperation(tAnnotatableEClass, TANNOTATABLE___GET_TANNOTATION__ECLASS);

		tTextNodeEClass = createEClass(TTEXT_NODE);
		createEAttribute(tTextNodeEClass, TTEXT_NODE__TTEXT);

		tNumberNodeEClass = createEClass(TNUMBER_NODE);
		createEAttribute(tNumberNodeEClass, TNUMBER_NODE__TNUMBER);

		tBoolNodeEClass = createEClass(TBOOL_NODE);
		createEAttribute(tBoolNodeEClass, TBOOL_NODE__VALUE);

		tClassNodeEClass = createEClass(TCLASS_NODE);
		createEReference(tClassNodeEClass, TCLASS_NODE__TCLASS);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tTextAnnotationEClass.getESuperTypes().add(this.getTAnnotation());
		tAnnotationEClass.getESuperTypes().add(ecorePackage.getEObject());
		tAnnotationTypeEClass.getESuperTypes().add(theBasicPackage.getTAbstractType());
		tTextNodeEClass.getESuperTypes().add(ecorePackage.getEObject());
		tNumberNodeEClass.getESuperTypes().add(ecorePackage.getEObject());
		tBoolNodeEClass.getESuperTypes().add(ecorePackage.getEObject());
		tClassNodeEClass.getESuperTypes().add(ecorePackage.getEObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(tAnnotationValueEClass, TAnnotationValue.class, "TAnnotationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTAnnotationValue_TKey(), ecorePackage.getEString(), "tKey", null, 1, 1, TAnnotationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAnnotationValue_TValue(), ecorePackage.getEObject(), null, "tValue", null, 0, -1, TAnnotationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTextAnnotationEClass, TTextAnnotation.class, "TTextAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTTextAnnotation_Text(), ecorePackage.getEString(), "text", null, 1, 1, TTextAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tAnnotationEClass, TAnnotation.class, "TAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAnnotation_TAnnotated(), this.getTAnnotatable(), this.getTAnnotatable_TAnnotation(), "tAnnotated", null, 1, 1, TAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAnnotation_Type(), this.getTAnnotationType(), this.getTAnnotationType_Annotations(), "type", null, 1, 1, TAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAnnotation_TValues(), this.getTAnnotationValue(), null, "tValues", null, 0, -1, TAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTAnnotation_TValues().getEKeys().add(this.getTAnnotationValue_TKey());

		EOperation op = initEOperation(getTAnnotation__GetValue__String(), this.getTAnnotationValue(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tAnnotationTypeEClass, TAnnotationType.class, "TAnnotationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAnnotationType_Annotations(), this.getTAnnotation(), this.getTAnnotation_Type(), "annotations", null, 0, -1, TAnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTAnnotationType__IsSubTypeOf__TAbstractType(), ecorePackage.getEBoolean(), "isSubTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTAbstractType(), "tType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTAnnotationType__IsSuperTypeOf__TAbstractType(), ecorePackage.getEBoolean(), "isSuperTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBasicPackage.getTAbstractType(), "tType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tAnnotatableEClass, TAnnotatable.class, "TAnnotatable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAnnotatable_TAnnotation(), this.getTAnnotation(), this.getTAnnotation_TAnnotated(), "tAnnotation", null, 0, -1, TAnnotatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTAnnotatable__GetTAnnotation__EClass(), this.getTAnnotation(), "getTAnnotation", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "tType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tTextNodeEClass, TTextNode.class, "TTextNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTTextNode_TText(), ecorePackage.getEString(), "tText", null, 1, 1, TTextNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tNumberNodeEClass, TNumberNode.class, "TNumberNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTNumberNode_TNumber(), ecorePackage.getEString(), "tNumber", null, 0, 1, TNumberNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tBoolNodeEClass, TBoolNode.class, "TBoolNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTBoolNode_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, TBoolNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tClassNodeEClass, TClassNode.class, "TClassNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTClassNode_TClass(), theBasicPackage.getTAbstractType(), null, "tClass", null, 0, 1, TClassNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AnnotationsPackageImpl
