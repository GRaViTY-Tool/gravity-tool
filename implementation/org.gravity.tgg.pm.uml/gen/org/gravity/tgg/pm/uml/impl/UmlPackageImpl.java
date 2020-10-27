/**
 */
package org.gravity.tgg.pm.uml.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.gravity.tgg.pm.uml.Class2TClass;
import org.gravity.tgg.pm.uml.Comment2TTextAnnotation;
import org.gravity.tgg.pm.uml.Element2TAnnotatable;
import org.gravity.tgg.pm.uml.FDependency2TAccess;
import org.gravity.tgg.pm.uml.Feature2TMember;
import org.gravity.tgg.pm.uml.Feature2TSignature;
import org.gravity.tgg.pm.uml.Interface2TInterface;
import org.gravity.tgg.pm.uml.Model2TypeGraph;
import org.gravity.tgg.pm.uml.Operation2TMethodDefinition;
import org.gravity.tgg.pm.uml.Operation2TMethodName;
import org.gravity.tgg.pm.uml.Operation2TMethodSignature;
import org.gravity.tgg.pm.uml.Package2TPackage;
import org.gravity.tgg.pm.uml.Parameter2TParameter;
import org.gravity.tgg.pm.uml.PrimitiveType2TClass;
import org.gravity.tgg.pm.uml.Property2TFieldDefinition;
import org.gravity.tgg.pm.uml.Property2TFieldName;
import org.gravity.tgg.pm.uml.Property2TFieldSignature;

import org.gravity.tgg.pm.uml.Rules.RulesPackage;

import org.gravity.tgg.pm.uml.Rules.impl.RulesPackageImpl;

import org.gravity.tgg.pm.uml.Stereotype2TAnnotation;
import org.gravity.tgg.pm.uml.StereotypeProperty2AnnotationNode;
import org.gravity.tgg.pm.uml.Type2TAbstractType;
import org.gravity.tgg.pm.uml.UmlFactory;
import org.gravity.tgg.pm.uml.UmlPackage;

import org.gravity.typegraph.basic.BasicPackage;

import org.gravity.typegraph.basic.annotations.AnnotationsPackage;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlPackageImpl extends EPackageImpl implements UmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass package2TPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model2TypeGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feature2TMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operation2TMethodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveType2TClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interface2TInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass property2TFieldNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feature2TSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass property2TFieldSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fDependency2TAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class2TClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comment2TTextAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operation2TMethodSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stereotype2TAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass element2TAnnotatableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stereotypeProperty2AnnotationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass type2TAbstractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operation2TMethodNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameter2TParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass property2TFieldDefinitionEClass = null;

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
	 * @see org.gravity.tgg.pm.uml.UmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UmlPackageImpl() {
		super(eNS_URI, UmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UmlPackage init() {
		if (isInited)
			return (UmlPackage) EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UmlPackageImpl theUmlPackage = registeredUmlPackage instanceof UmlPackageImpl
				? (UmlPackageImpl) registeredUmlPackage
				: new UmlPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (registeredPackage instanceof RulesPackageImpl
				? registeredPackage
				: RulesPackage.eINSTANCE);

		// Create package meta-data objects
		theUmlPackage.createPackageContents();
		theRulesPackage.createPackageContents();

		// Initialize created meta-data
		theUmlPackage.initializePackageContents();
		theRulesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UmlPackage.eNS_URI, theUmlPackage);
		return theUmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage2TPackage() {
		return package2TPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage2TPackage_Source() {
		return (EReference) package2TPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage2TPackage_Target() {
		return (EReference) package2TPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel2TypeGraph() {
		return model2TypeGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel2TypeGraph_Source() {
		return (EReference) model2TypeGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel2TypeGraph_Target() {
		return (EReference) model2TypeGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature2TMember() {
		return feature2TMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature2TMember_Source() {
		return (EReference) feature2TMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature2TMember_Target() {
		return (EReference) feature2TMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation2TMethodDefinition() {
		return operation2TMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation2TMethodDefinition_Source() {
		return (EReference) operation2TMethodDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation2TMethodDefinition_Target() {
		return (EReference) operation2TMethodDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveType2TClass() {
		return primitiveType2TClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveType2TClass_Source() {
		return (EReference) primitiveType2TClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveType2TClass_Target() {
		return (EReference) primitiveType2TClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterface2TInterface() {
		return interface2TInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface2TInterface_Source() {
		return (EReference) interface2TInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface2TInterface_Target() {
		return (EReference) interface2TInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty2TFieldName() {
		return property2TFieldNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty2TFieldName_Source() {
		return (EReference) property2TFieldNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty2TFieldName_Target() {
		return (EReference) property2TFieldNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature2TSignature() {
		return feature2TSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature2TSignature_Source() {
		return (EReference) feature2TSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature2TSignature_Target() {
		return (EReference) feature2TSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty2TFieldSignature() {
		return property2TFieldSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty2TFieldSignature_Source() {
		return (EReference) property2TFieldSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty2TFieldSignature_Target() {
		return (EReference) property2TFieldSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFDependency2TAccess() {
		return fDependency2TAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFDependency2TAccess_Source() {
		return (EReference) fDependency2TAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFDependency2TAccess_Target() {
		return (EReference) fDependency2TAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass2TClass() {
		return class2TClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass2TClass_Source() {
		return (EReference) class2TClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass2TClass_Target() {
		return (EReference) class2TClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComment2TTextAnnotation() {
		return comment2TTextAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComment2TTextAnnotation_Source() {
		return (EReference) comment2TTextAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComment2TTextAnnotation_Target() {
		return (EReference) comment2TTextAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation2TMethodSignature() {
		return operation2TMethodSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation2TMethodSignature_Source() {
		return (EReference) operation2TMethodSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation2TMethodSignature_Target() {
		return (EReference) operation2TMethodSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStereotype2TAnnotation() {
		return stereotype2TAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStereotype2TAnnotation_Source() {
		return (EReference) stereotype2TAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStereotype2TAnnotation_Target() {
		return (EReference) stereotype2TAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement2TAnnotatable() {
		return element2TAnnotatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement2TAnnotatable_Source() {
		return (EReference) element2TAnnotatableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement2TAnnotatable_Target() {
		return (EReference) element2TAnnotatableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStereotypeProperty2AnnotationNode() {
		return stereotypeProperty2AnnotationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStereotypeProperty2AnnotationNode_Source() {
		return (EReference) stereotypeProperty2AnnotationNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStereotypeProperty2AnnotationNode_Target() {
		return (EReference) stereotypeProperty2AnnotationNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType2TAbstractType() {
		return type2TAbstractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType2TAbstractType_Source() {
		return (EReference) type2TAbstractTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType2TAbstractType_Target() {
		return (EReference) type2TAbstractTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation2TMethodName() {
		return operation2TMethodNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation2TMethodName_Source() {
		return (EReference) operation2TMethodNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation2TMethodName_Target() {
		return (EReference) operation2TMethodNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter2TParameter() {
		return parameter2TParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter2TParameter_Source() {
		return (EReference) parameter2TParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter2TParameter_Target() {
		return (EReference) parameter2TParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty2TFieldDefinition() {
		return property2TFieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty2TFieldDefinition_Source() {
		return (EReference) property2TFieldDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty2TFieldDefinition_Target() {
		return (EReference) property2TFieldDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UmlFactory getUmlFactory() {
		return (UmlFactory) getEFactoryInstance();
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
		package2TPackageEClass = createEClass(PACKAGE2_TPACKAGE);
		createEReference(package2TPackageEClass, PACKAGE2_TPACKAGE__SOURCE);
		createEReference(package2TPackageEClass, PACKAGE2_TPACKAGE__TARGET);

		model2TypeGraphEClass = createEClass(MODEL2_TYPE_GRAPH);
		createEReference(model2TypeGraphEClass, MODEL2_TYPE_GRAPH__SOURCE);
		createEReference(model2TypeGraphEClass, MODEL2_TYPE_GRAPH__TARGET);

		feature2TMemberEClass = createEClass(FEATURE2_TMEMBER);
		createEReference(feature2TMemberEClass, FEATURE2_TMEMBER__SOURCE);
		createEReference(feature2TMemberEClass, FEATURE2_TMEMBER__TARGET);

		operation2TMethodDefinitionEClass = createEClass(OPERATION2_TMETHOD_DEFINITION);
		createEReference(operation2TMethodDefinitionEClass, OPERATION2_TMETHOD_DEFINITION__SOURCE);
		createEReference(operation2TMethodDefinitionEClass, OPERATION2_TMETHOD_DEFINITION__TARGET);

		primitiveType2TClassEClass = createEClass(PRIMITIVE_TYPE2_TCLASS);
		createEReference(primitiveType2TClassEClass, PRIMITIVE_TYPE2_TCLASS__SOURCE);
		createEReference(primitiveType2TClassEClass, PRIMITIVE_TYPE2_TCLASS__TARGET);

		interface2TInterfaceEClass = createEClass(INTERFACE2_TINTERFACE);
		createEReference(interface2TInterfaceEClass, INTERFACE2_TINTERFACE__SOURCE);
		createEReference(interface2TInterfaceEClass, INTERFACE2_TINTERFACE__TARGET);

		property2TFieldNameEClass = createEClass(PROPERTY2_TFIELD_NAME);
		createEReference(property2TFieldNameEClass, PROPERTY2_TFIELD_NAME__SOURCE);
		createEReference(property2TFieldNameEClass, PROPERTY2_TFIELD_NAME__TARGET);

		feature2TSignatureEClass = createEClass(FEATURE2_TSIGNATURE);
		createEReference(feature2TSignatureEClass, FEATURE2_TSIGNATURE__SOURCE);
		createEReference(feature2TSignatureEClass, FEATURE2_TSIGNATURE__TARGET);

		property2TFieldSignatureEClass = createEClass(PROPERTY2_TFIELD_SIGNATURE);
		createEReference(property2TFieldSignatureEClass, PROPERTY2_TFIELD_SIGNATURE__SOURCE);
		createEReference(property2TFieldSignatureEClass, PROPERTY2_TFIELD_SIGNATURE__TARGET);

		fDependency2TAccessEClass = createEClass(FDEPENDENCY2_TACCESS);
		createEReference(fDependency2TAccessEClass, FDEPENDENCY2_TACCESS__SOURCE);
		createEReference(fDependency2TAccessEClass, FDEPENDENCY2_TACCESS__TARGET);

		class2TClassEClass = createEClass(CLASS2_TCLASS);
		createEReference(class2TClassEClass, CLASS2_TCLASS__SOURCE);
		createEReference(class2TClassEClass, CLASS2_TCLASS__TARGET);

		comment2TTextAnnotationEClass = createEClass(COMMENT2_TTEXT_ANNOTATION);
		createEReference(comment2TTextAnnotationEClass, COMMENT2_TTEXT_ANNOTATION__SOURCE);
		createEReference(comment2TTextAnnotationEClass, COMMENT2_TTEXT_ANNOTATION__TARGET);

		operation2TMethodSignatureEClass = createEClass(OPERATION2_TMETHOD_SIGNATURE);
		createEReference(operation2TMethodSignatureEClass, OPERATION2_TMETHOD_SIGNATURE__SOURCE);
		createEReference(operation2TMethodSignatureEClass, OPERATION2_TMETHOD_SIGNATURE__TARGET);

		stereotype2TAnnotationEClass = createEClass(STEREOTYPE2_TANNOTATION);
		createEReference(stereotype2TAnnotationEClass, STEREOTYPE2_TANNOTATION__SOURCE);
		createEReference(stereotype2TAnnotationEClass, STEREOTYPE2_TANNOTATION__TARGET);

		element2TAnnotatableEClass = createEClass(ELEMENT2_TANNOTATABLE);
		createEReference(element2TAnnotatableEClass, ELEMENT2_TANNOTATABLE__SOURCE);
		createEReference(element2TAnnotatableEClass, ELEMENT2_TANNOTATABLE__TARGET);

		stereotypeProperty2AnnotationNodeEClass = createEClass(STEREOTYPE_PROPERTY2_ANNOTATION_NODE);
		createEReference(stereotypeProperty2AnnotationNodeEClass, STEREOTYPE_PROPERTY2_ANNOTATION_NODE__SOURCE);
		createEReference(stereotypeProperty2AnnotationNodeEClass, STEREOTYPE_PROPERTY2_ANNOTATION_NODE__TARGET);

		type2TAbstractTypeEClass = createEClass(TYPE2_TABSTRACT_TYPE);
		createEReference(type2TAbstractTypeEClass, TYPE2_TABSTRACT_TYPE__SOURCE);
		createEReference(type2TAbstractTypeEClass, TYPE2_TABSTRACT_TYPE__TARGET);

		operation2TMethodNameEClass = createEClass(OPERATION2_TMETHOD_NAME);
		createEReference(operation2TMethodNameEClass, OPERATION2_TMETHOD_NAME__SOURCE);
		createEReference(operation2TMethodNameEClass, OPERATION2_TMETHOD_NAME__TARGET);

		parameter2TParameterEClass = createEClass(PARAMETER2_TPARAMETER);
		createEReference(parameter2TParameterEClass, PARAMETER2_TPARAMETER__SOURCE);
		createEReference(parameter2TParameterEClass, PARAMETER2_TPARAMETER__TARGET);

		property2TFieldDefinitionEClass = createEClass(PROPERTY2_TFIELD_DEFINITION);
		createEReference(property2TFieldDefinitionEClass, PROPERTY2_TFIELD_DEFINITION__SOURCE);
		createEReference(property2TFieldDefinitionEClass, PROPERTY2_TFIELD_DEFINITION__TARGET);
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
		RulesPackage theRulesPackage = (RulesPackage) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);
		RuntimePackage theRuntimePackage = (RuntimePackage) EPackage.Registry.INSTANCE
				.getEPackage(RuntimePackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage) EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage) EPackage.Registry.INSTANCE
				.getEPackage(AnnotationsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRulesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		package2TPackageEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		model2TypeGraphEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		feature2TMemberEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		operation2TMethodDefinitionEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		primitiveType2TClassEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		interface2TInterfaceEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		property2TFieldNameEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		feature2TSignatureEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		property2TFieldSignatureEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		fDependency2TAccessEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		class2TClassEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		comment2TTextAnnotationEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		operation2TMethodSignatureEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		stereotype2TAnnotationEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		element2TAnnotatableEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		stereotypeProperty2AnnotationNodeEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		type2TAbstractTypeEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		operation2TMethodNameEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		parameter2TParameterEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		property2TFieldDefinitionEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());

		// Initialize classes, features, and operations; add parameters
		initEClass(package2TPackageEClass, Package2TPackage.class, "Package2TPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage2TPackage_Source(), theUMLPackage.getPackage(), null, "source", null, 1, 1,
				Package2TPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage2TPackage_Target(), theBasicPackage.getTPackage(), null, "target", null, 1, 1,
				Package2TPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(model2TypeGraphEClass, Model2TypeGraph.class, "Model2TypeGraph", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel2TypeGraph_Source(), theUMLPackage.getModel(), null, "source", null, 1, 1,
				Model2TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel2TypeGraph_Target(), theBasicPackage.getTypeGraph(), null, "target", null, 1, 1,
				Model2TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feature2TMemberEClass, Feature2TMember.class, "Feature2TMember", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature2TMember_Source(), theUMLPackage.getFeature(), null, "source", null, 1, 1,
				Feature2TMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature2TMember_Target(), theBasicPackage.getTMember(), null, "target", null, 1, 1,
				Feature2TMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operation2TMethodDefinitionEClass, Operation2TMethodDefinition.class, "Operation2TMethodDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation2TMethodDefinition_Source(), theUMLPackage.getOperation(), null, "source", null, 1,
				1, Operation2TMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation2TMethodDefinition_Target(), theBasicPackage.getTMethodDefinition(), null, "target",
				null, 1, 1, Operation2TMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveType2TClassEClass, PrimitiveType2TClass.class, "PrimitiveType2TClass", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveType2TClass_Source(), theUMLPackage.getPrimitiveType(), null, "source", null, 1, 1,
				PrimitiveType2TClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveType2TClass_Target(), theBasicPackage.getTClass(), null, "target", null, 1, 1,
				PrimitiveType2TClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interface2TInterfaceEClass, Interface2TInterface.class, "Interface2TInterface", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface2TInterface_Source(), theUMLPackage.getInterface(), null, "source", null, 1, 1,
				Interface2TInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface2TInterface_Target(), theBasicPackage.getTInterface(), null, "target", null, 1, 1,
				Interface2TInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(property2TFieldNameEClass, Property2TFieldName.class, "Property2TFieldName", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty2TFieldName_Source(), theUMLPackage.getProperty(), null, "source", null, 1, 1,
				Property2TFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty2TFieldName_Target(), theBasicPackage.getTField(), null, "target", null, 1, 1,
				Property2TFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feature2TSignatureEClass, Feature2TSignature.class, "Feature2TSignature", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature2TSignature_Source(), theUMLPackage.getFeature(), null, "source", null, 1, 1,
				Feature2TSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature2TSignature_Target(), theBasicPackage.getTSignature(), null, "target", null, 1, 1,
				Feature2TSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(property2TFieldSignatureEClass, Property2TFieldSignature.class, "Property2TFieldSignature",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty2TFieldSignature_Source(), theUMLPackage.getProperty(), null, "source", null, 1, 1,
				Property2TFieldSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty2TFieldSignature_Target(), theBasicPackage.getTFieldSignature(), null, "target", null,
				1, 1, Property2TFieldSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fDependency2TAccessEClass, FDependency2TAccess.class, "FDependency2TAccess", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFDependency2TAccess_Source(), theUMLPackage.getDependency(), null, "source", null, 1, 1,
				FDependency2TAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFDependency2TAccess_Target(), theBasicPackage.getTAccess(), null, "target", null, 1, 1,
				FDependency2TAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(class2TClassEClass, Class2TClass.class, "Class2TClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass2TClass_Source(), theUMLPackage.getClass_(), null, "source", null, 1, 1,
				Class2TClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass2TClass_Target(), theBasicPackage.getTClass(), null, "target", null, 1, 1,
				Class2TClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comment2TTextAnnotationEClass, Comment2TTextAnnotation.class, "Comment2TTextAnnotation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComment2TTextAnnotation_Source(), theUMLPackage.getComment(), null, "source", null, 1, 1,
				Comment2TTextAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComment2TTextAnnotation_Target(), theAnnotationsPackage.getTTextAnnotation(), null, "target",
				null, 1, 1, Comment2TTextAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operation2TMethodSignatureEClass, Operation2TMethodSignature.class, "Operation2TMethodSignature",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation2TMethodSignature_Source(), theUMLPackage.getOperation(), null, "source", null, 1, 1,
				Operation2TMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation2TMethodSignature_Target(), theBasicPackage.getTMethodSignature(), null, "target",
				null, 1, 1, Operation2TMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stereotype2TAnnotationEClass, Stereotype2TAnnotation.class, "Stereotype2TAnnotation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStereotype2TAnnotation_Source(), theUMLPackage.getStereotype(), null, "source", null, 1, 1,
				Stereotype2TAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStereotype2TAnnotation_Target(), theAnnotationsPackage.getTAnnotation(), null, "target", null,
				1, 1, Stereotype2TAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(element2TAnnotatableEClass, Element2TAnnotatable.class, "Element2TAnnotatable", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement2TAnnotatable_Source(), theUMLPackage.getElement(), null, "source", null, 1, 1,
				Element2TAnnotatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement2TAnnotatable_Target(), theAnnotationsPackage.getTAnnotatable(), null, "target", null,
				1, 1, Element2TAnnotatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stereotypeProperty2AnnotationNodeEClass, StereotypeProperty2AnnotationNode.class,
				"StereotypeProperty2AnnotationNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStereotypeProperty2AnnotationNode_Source(), theUMLPackage.getProperty(), null, "source", null,
				1, 1, StereotypeProperty2AnnotationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStereotypeProperty2AnnotationNode_Target(), theAnnotationsPackage.getTAbstractNode(), null,
				"target", null, 1, 1, StereotypeProperty2AnnotationNode.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(type2TAbstractTypeEClass, Type2TAbstractType.class, "Type2TAbstractType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType2TAbstractType_Source(), theUMLPackage.getType(), null, "source", null, 1, 1,
				Type2TAbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType2TAbstractType_Target(), theBasicPackage.getTAbstractType(), null, "target", null, 1, 1,
				Type2TAbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operation2TMethodNameEClass, Operation2TMethodName.class, "Operation2TMethodName", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation2TMethodName_Source(), theUMLPackage.getOperation(), null, "source", null, 1, 1,
				Operation2TMethodName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation2TMethodName_Target(), theBasicPackage.getTMethod(), null, "target", null, 1, 1,
				Operation2TMethodName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameter2TParameterEClass, Parameter2TParameter.class, "Parameter2TParameter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter2TParameter_Source(), theUMLPackage.getParameter(), null, "source", null, 1, 1,
				Parameter2TParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter2TParameter_Target(), theBasicPackage.getTParameter(), null, "target", null, 1, 1,
				Parameter2TParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(property2TFieldDefinitionEClass, Property2TFieldDefinition.class, "Property2TFieldDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty2TFieldDefinition_Source(), theUMLPackage.getProperty(), null, "source", null, 1, 1,
				Property2TFieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty2TFieldDefinition_Target(), theBasicPackage.getTFieldDefinition(), null, "target",
				null, 1, 1, Property2TFieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UmlPackageImpl
