/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.modisco.java.emf.JavaPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.gravity.modisco.ModiscoPackage;

import org.gravity.tgg.modisco.uml.Rules.RulesFactory;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

import org.gravity.tgg.modisco.uml.UmlPackage;

import org.gravity.tgg.modisco.uml.impl.UmlPackageImpl;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClass4_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayType2NonArrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDec2Parameter4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumDec2EnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDecWithModifier2ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaPackageToUMLPackage_underPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerDeclaration2InnerClassifier_InClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerDeclaration2InnerClassifier_InInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerDeclaration2InnerClassifier_InMethod_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestation4CompilationUnit2ArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorDec2OperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerDeclaration2InnerClassifier_InEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orphandedPrimitive2PrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClass4EnumConstInPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier2NamedElement_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeDeclaration2InterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaModel2UmlModelRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerDeclaration2InnerClassifier_InMethod4InterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDec2Property4InterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier2Feature_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedType2Interface_InnerTypeInClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerDeclaration2InnerClassifier_InAnonymousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationInAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAccess2InterfaceGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameter2Object_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameter2Object_InMethod_InClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeShortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameter2Object_InMethod_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClass4ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerDeclaration2InnerClassifier_InMethod4ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedType2Classifier_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedType2Classifier_InnerTypeInInterface_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaPackageToUMLPackage_underModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orphanedTypeDec2OrphanedType_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaAnnotationValueEntry2CommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeAccess2ReturnParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveType2PrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClass4InterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDec2Property4ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedType2Classifier_InnerTypeInClass_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDec2InterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationInClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameter2Object_InInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClass4EnumConstInTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumDecWithModifier2EnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedType2ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDec2Property4EnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeFloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDecWithModifier2InterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDec2ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameter2Object_InClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAccess2GeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeCharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationInAnonymousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ignoreOrphanTypesEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerDeclaration2InnerClassifier_InAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnit2ArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDeclarationTypeAccessType2PropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDec2OperationWithModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaAnnotation2Comment4SingleVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedType2Interface_InnerTypeInInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationInInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDec2Property4_AnonymousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClass4AnonymousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ignoreClassInstanceCreation4ArrayInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDependency2UsageDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClass4EnumConst_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeDeclaration2Interface_WithModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerDeclaration2InnerClassifier_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameter2Object_InMethod_InInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orphanedClassDec2OrphanedClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDec2PropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedType2Class_InnerTypeInInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedTypeDeclaration2TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkTypeToPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaAnnotation2Comment_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationInEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeByteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerDeclaration2InnerClassifier_InMethod4IAnonymousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaAnnotationValue2CommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDec2Property_WithModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAccess2InterfaceRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedType2InterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeVoidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedType2Class_InnerTypeInClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDec2OperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaAnnotation2Comment4BodyDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorDec2OperationWithModifierEClass = null;

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
	 * @see org.gravity.tgg.modisco.uml.Rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited)
			return (RulesPackage) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRulesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RulesPackageImpl theRulesPackage = registeredRulesPackage instanceof RulesPackageImpl
				? (RulesPackageImpl) registeredRulesPackage
				: new RulesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ModiscoPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		JavaPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI);
		UmlPackageImpl theUmlPackage = (UmlPackageImpl) (registeredPackage instanceof UmlPackageImpl ? registeredPackage
				: UmlPackage.eINSTANCE);

		// Load packages
		theUmlPackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theUmlPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClass4_Abstract() {
		if (anonymousClass4_AbstractEClass == null) {
			anonymousClass4_AbstractEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return anonymousClass4_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayType2NonArrayType() {
		if (arrayType2NonArrayTypeEClass == null) {
			arrayType2NonArrayTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return arrayType2NonArrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__IsAppropriate_FWD__Match_Type_ArrayType_TypeAccess() {
		return getArrayType2NonArrayType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__Perform_FWD__IsApplicableMatch() {
		return getArrayType2NonArrayType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__IsApplicable_FWD__Match() {
		return getArrayType2NonArrayType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__RegisterObjectsToMatch_FWD__Match_Type_ArrayType_TypeAccess() {
		return getArrayType2NonArrayType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__IsAppropriate_solveCsp_FWD__Match_Type_ArrayType_TypeAccess() {
		return getArrayType2NonArrayType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__IsAppropriate_checkCsp_FWD__CSP() {
		return getArrayType2NonArrayType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__IsApplicable_solveCsp_FWD__IsApplicableMatch_Type_ASTNode2Element_ArrayType_Type_TypeAccess() {
		return getArrayType2NonArrayType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__IsApplicable_checkCsp_FWD__CSP() {
		return getArrayType2NonArrayType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getArrayType2NonArrayType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__CheckTypes_FWD__Match() {
		return getArrayType2NonArrayType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__IsAppropriate_BWD__Match_Type() {
		return getArrayType2NonArrayType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__Perform_BWD__IsApplicableMatch() {
		return getArrayType2NonArrayType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__IsApplicable_BWD__Match() {
		return getArrayType2NonArrayType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__RegisterObjectsToMatch_BWD__Match_Type() {
		return getArrayType2NonArrayType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__IsAppropriate_solveCsp_BWD__Match_Type() {
		return getArrayType2NonArrayType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__IsAppropriate_checkCsp_BWD__CSP() {
		return getArrayType2NonArrayType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__CheckTypes_BWD__Match() {
		return getArrayType2NonArrayType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__IsAppropriate_BWD_Type_0__Type() {
		return getArrayType2NonArrayType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__IsAppropriate_FWD_EMoflonEdge_98__EMoflonEdge() {
		return getArrayType2NonArrayType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__CheckAttributes_FWD__TripleMatch() {
		return getArrayType2NonArrayType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__CheckAttributes_BWD__TripleMatch() {
		return getArrayType2NonArrayType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__IsApplicable_CC__Match_Match() {
		return getArrayType2NonArrayType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__IsApplicable_solveCsp_CC__Type_ArrayType_Type_TypeAccess_Match_Match() {
		return getArrayType2NonArrayType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__IsApplicable_checkCsp_CC__CSP() {
		return getArrayType2NonArrayType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__CheckDEC_FWD__Type_ArrayType_TypeAccess() {
		return getArrayType2NonArrayType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__CheckDEC_BWD__Type() {
		return getArrayType2NonArrayType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getArrayType2NonArrayType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__GenerateModel_solveCsp_BWD__IsApplicableMatch_Type_ASTNode2Element_Type_ModelgeneratorRuleResult() {
		return getArrayType2NonArrayType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayType2NonArrayType__GenerateModel_checkCsp_BWD__CSP() {
		return getArrayType2NonArrayType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDec2Parameter4() {
		if (variableDec2Parameter4EClass == null) {
			variableDec2Parameter4EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return variableDec2Parameter4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsAppropriate_FWD__Match_MSingleVariableDeclaration_Type_TypeAccess_AbstractMethodDeclaration() {
		return getVariableDec2Parameter4().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__Perform_FWD__IsApplicableMatch() {
		return getVariableDec2Parameter4().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsApplicable_FWD__Match() {
		return getVariableDec2Parameter4().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__RegisterObjectsToMatch_FWD__Match_MSingleVariableDeclaration_Type_TypeAccess_AbstractMethodDeclaration() {
		return getVariableDec2Parameter4().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsAppropriate_solveCsp_FWD__Match_MSingleVariableDeclaration_Type_TypeAccess_AbstractMethodDeclaration() {
		return getVariableDec2Parameter4().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsAppropriate_checkCsp_FWD__CSP() {
		return getVariableDec2Parameter4().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsApplicable_solveCsp_FWD__IsApplicableMatch_Type_MSingleVariableDeclaration_Type_ASTNode2Element_ASTNode2Element_TypeAccess_AbstractMethodDeclaration_Operation() {
		return getVariableDec2Parameter4().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsApplicable_checkCsp_FWD__CSP() {
		return getVariableDec2Parameter4().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getVariableDec2Parameter4().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__CheckTypes_FWD__Match() {
		return getVariableDec2Parameter4().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsAppropriate_BWD__Match_Type_Parameter_Operation() {
		return getVariableDec2Parameter4().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__Perform_BWD__IsApplicableMatch() {
		return getVariableDec2Parameter4().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsApplicable_BWD__Match() {
		return getVariableDec2Parameter4().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__RegisterObjectsToMatch_BWD__Match_Type_Parameter_Operation() {
		return getVariableDec2Parameter4().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsAppropriate_solveCsp_BWD__Match_Type_Parameter_Operation() {
		return getVariableDec2Parameter4().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsAppropriate_checkCsp_BWD__CSP() {
		return getVariableDec2Parameter4().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsApplicable_solveCsp_BWD__IsApplicableMatch_Type_Parameter_Type_ASTNode2Element_ASTNode2Element_AbstractMethodDeclaration_Operation() {
		return getVariableDec2Parameter4().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsApplicable_checkCsp_BWD__CSP() {
		return getVariableDec2Parameter4().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getVariableDec2Parameter4().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__CheckTypes_BWD__Match() {
		return getVariableDec2Parameter4().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsAppropriate_BWD_EMoflonEdge_94__EMoflonEdge() {
		return getVariableDec2Parameter4().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsAppropriate_FWD_EMoflonEdge_99__EMoflonEdge() {
		return getVariableDec2Parameter4().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__CheckAttributes_FWD__TripleMatch() {
		return getVariableDec2Parameter4().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__CheckAttributes_BWD__TripleMatch() {
		return getVariableDec2Parameter4().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsApplicable_CC__Match_Match() {
		return getVariableDec2Parameter4().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsApplicable_solveCsp_CC__Type_MSingleVariableDeclaration_Parameter_Type_TypeAccess_AbstractMethodDeclaration_Operation_Match_Match() {
		return getVariableDec2Parameter4().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__IsApplicable_checkCsp_CC__CSP() {
		return getVariableDec2Parameter4().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__CheckDEC_FWD__MSingleVariableDeclaration_Type_TypeAccess_AbstractMethodDeclaration() {
		return getVariableDec2Parameter4().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__CheckDEC_BWD__Type_Parameter_Operation() {
		return getVariableDec2Parameter4().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getVariableDec2Parameter4().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__GenerateModel_solveCsp_BWD__IsApplicableMatch_Type_Type_ASTNode2Element_ASTNode2Element_AbstractMethodDeclaration_Operation_ModelgeneratorRuleResult() {
		return getVariableDec2Parameter4().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDec2Parameter4__GenerateModel_checkCsp_BWD__CSP() {
		return getVariableDec2Parameter4().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumDec2Enum() {
		if (enumDec2EnumEClass == null) {
			enumDec2EnumEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(3);
		}
		return enumDec2EnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsAppropriate_FWD__Match_EnumDeclaration() {
		return getEnumDec2Enum().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__Perform_FWD__IsApplicableMatch() {
		return getEnumDec2Enum().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsApplicable_FWD__Match() {
		return getEnumDec2Enum().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__RegisterObjectsToMatch_FWD__Match_EnumDeclaration() {
		return getEnumDec2Enum().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsAppropriate_solveCsp_FWD__Match_EnumDeclaration() {
		return getEnumDec2Enum().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsAppropriate_checkCsp_FWD__CSP() {
		return getEnumDec2Enum().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsApplicable_solveCsp_FWD__IsApplicableMatch_EnumDeclaration() {
		return getEnumDec2Enum().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsApplicable_checkCsp_FWD__CSP() {
		return getEnumDec2Enum().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getEnumDec2Enum().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__CheckTypes_FWD__Match() {
		return getEnumDec2Enum().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsAppropriate_BWD__Match_Enumeration() {
		return getEnumDec2Enum().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__Perform_BWD__IsApplicableMatch() {
		return getEnumDec2Enum().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsApplicable_BWD__Match() {
		return getEnumDec2Enum().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__RegisterObjectsToMatch_BWD__Match_Enumeration() {
		return getEnumDec2Enum().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsAppropriate_solveCsp_BWD__Match_Enumeration() {
		return getEnumDec2Enum().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsAppropriate_checkCsp_BWD__CSP() {
		return getEnumDec2Enum().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsApplicable_solveCsp_BWD__IsApplicableMatch_Enumeration() {
		return getEnumDec2Enum().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsApplicable_checkCsp_BWD__CSP() {
		return getEnumDec2Enum().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getEnumDec2Enum().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__CheckTypes_BWD__Match() {
		return getEnumDec2Enum().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsAppropriate_BWD_Enumeration_0__Enumeration() {
		return getEnumDec2Enum().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsAppropriate_FWD_EnumDeclaration_0__EnumDeclaration() {
		return getEnumDec2Enum().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__CheckAttributes_FWD__TripleMatch() {
		return getEnumDec2Enum().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__CheckAttributes_BWD__TripleMatch() {
		return getEnumDec2Enum().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsApplicable_CC__Match_Match() {
		return getEnumDec2Enum().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsApplicable_solveCsp_CC__EnumDeclaration_Enumeration_Match_Match() {
		return getEnumDec2Enum().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__IsApplicable_checkCsp_CC__CSP() {
		return getEnumDec2Enum().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__CheckDEC_FWD__EnumDeclaration() {
		return getEnumDec2Enum().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__CheckDEC_BWD__Enumeration() {
		return getEnumDec2Enum().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__GenerateModel__RuleEntryContainer() {
		return getEnumDec2Enum().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getEnumDec2Enum().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDec2Enum__GenerateModel_checkCsp_BWD__CSP() {
		return getEnumDec2Enum().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassDecWithModifier2Class() {
		if (classDecWithModifier2ClassEClass == null) {
			classDecWithModifier2ClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return classDecWithModifier2ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsAppropriate_FWD__Match_MClass_Modifier() {
		return getClassDecWithModifier2Class().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__Perform_FWD__IsApplicableMatch() {
		return getClassDecWithModifier2Class().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsApplicable_FWD__Match() {
		return getClassDecWithModifier2Class().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__RegisterObjectsToMatch_FWD__Match_MClass_Modifier() {
		return getClassDecWithModifier2Class().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsAppropriate_solveCsp_FWD__Match_MClass_Modifier() {
		return getClassDecWithModifier2Class().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsAppropriate_checkCsp_FWD__CSP() {
		return getClassDecWithModifier2Class().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsApplicable_solveCsp_FWD__IsApplicableMatch_MClass_Modifier() {
		return getClassDecWithModifier2Class().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsApplicable_checkCsp_FWD__CSP() {
		return getClassDecWithModifier2Class().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject() {
		return getClassDecWithModifier2Class().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__CheckTypes_FWD__Match() {
		return getClassDecWithModifier2Class().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsAppropriate_BWD__Match_Class() {
		return getClassDecWithModifier2Class().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__Perform_BWD__IsApplicableMatch() {
		return getClassDecWithModifier2Class().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsApplicable_BWD__Match() {
		return getClassDecWithModifier2Class().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__RegisterObjectsToMatch_BWD__Match_Class() {
		return getClassDecWithModifier2Class().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsAppropriate_solveCsp_BWD__Match_Class() {
		return getClassDecWithModifier2Class().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsAppropriate_checkCsp_BWD__CSP() {
		return getClassDecWithModifier2Class().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsApplicable_solveCsp_BWD__IsApplicableMatch_Class() {
		return getClassDecWithModifier2Class().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsApplicable_checkCsp_BWD__CSP() {
		return getClassDecWithModifier2Class().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject() {
		return getClassDecWithModifier2Class().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__CheckTypes_BWD__Match() {
		return getClassDecWithModifier2Class().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsAppropriate_BWD_Class_0__Class() {
		return getClassDecWithModifier2Class().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsAppropriate_FWD_EMoflonEdge_100__EMoflonEdge() {
		return getClassDecWithModifier2Class().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__CheckAttributes_FWD__TripleMatch() {
		return getClassDecWithModifier2Class().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__CheckAttributes_BWD__TripleMatch() {
		return getClassDecWithModifier2Class().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsApplicable_CC__Match_Match() {
		return getClassDecWithModifier2Class().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsApplicable_solveCsp_CC__Class_MClass_Modifier_Match_Match() {
		return getClassDecWithModifier2Class().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__IsApplicable_checkCsp_CC__CSP() {
		return getClassDecWithModifier2Class().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__CheckDEC_FWD__MClass_Modifier() {
		return getClassDecWithModifier2Class().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__CheckDEC_BWD__Class() {
		return getClassDecWithModifier2Class().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__GenerateModel__RuleEntryContainer() {
		return getClassDecWithModifier2Class().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getClassDecWithModifier2Class().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDecWithModifier2Class__GenerateModel_checkCsp_BWD__CSP() {
		return getClassDecWithModifier2Class().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaPackageToUMLPackage_underPackage() {
		if (javaPackageToUMLPackage_underPackageEClass == null) {
			javaPackageToUMLPackage_underPackageEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return javaPackageToUMLPackage_underPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsAppropriate_FWD__Match_Package_Package() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__Perform_FWD__IsApplicableMatch() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsApplicable_FWD__Match() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__RegisterObjectsToMatch_FWD__Match_Package_Package() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsAppropriate_solveCsp_FWD__Match_Package_Package() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsAppropriate_checkCsp_FWD__CSP() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsApplicable_solveCsp_FWD__IsApplicableMatch_JavaPackage2UmlPackage_Package_Package_Package() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsApplicable_checkCsp_FWD__CSP() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__CheckTypes_FWD__Match() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsAppropriate_BWD__Match_Package_Package() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__Perform_BWD__IsApplicableMatch() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsApplicable_BWD__Match() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__RegisterObjectsToMatch_BWD__Match_Package_Package() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsAppropriate_solveCsp_BWD__Match_Package_Package() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsAppropriate_checkCsp_BWD__CSP() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsApplicable_solveCsp_BWD__IsApplicableMatch_Package_JavaPackage2UmlPackage_Package_Package() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsApplicable_checkCsp_BWD__CSP() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__CheckTypes_BWD__Match() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsAppropriate_BWD_EMoflonEdge_95__EMoflonEdge() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsAppropriate_FWD_EMoflonEdge_101__EMoflonEdge() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__CheckAttributes_FWD__TripleMatch() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__CheckAttributes_BWD__TripleMatch() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsApplicable_CC__Match_Match() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsApplicable_solveCsp_CC__Package_Package_Package_Package_Match_Match() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__IsApplicable_checkCsp_CC__CSP() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__CheckDEC_FWD__Package_Package() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__CheckDEC_BWD__Package_Package() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__GenerateModel__RuleEntryContainer_JavaPackage2UmlPackage() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_JavaPackage2UmlPackage_Package_Package_ModelgeneratorRuleResult() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underPackage__GenerateModel_checkCsp_BWD__CSP() {
		return getJavaPackageToUMLPackage_underPackage().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInnerDeclaration2InnerClassifier_InClass() {
		if (innerDeclaration2InnerClassifier_InClassEClass == null) {
			innerDeclaration2InnerClassifier_InClassEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return innerDeclaration2InnerClassifier_InClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsAppropriate_FWD__Match_AbstractTypeDeclaration_ClassDeclaration() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__Perform_FWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsApplicable_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__RegisterObjectsToMatch_FWD__Match_AbstractTypeDeclaration_ClassDeclaration() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsAppropriate_solveCsp_FWD__Match_AbstractTypeDeclaration_ClassDeclaration() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_Classifier_ASTNode2Element_AbstractTypeDeclaration_Class_ClassDeclaration_ASTNode2Element() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsApplicable_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__CheckTypes_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsAppropriate_BWD__Match_Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__Perform_BWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsApplicable_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__RegisterObjectsToMatch_BWD__Match_Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsAppropriate_solveCsp_BWD__Match_Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsAppropriate_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_Classifier_ASTNode2Element_AbstractTypeDeclaration_Class_ClassDeclaration_ASTNode2Element() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsApplicable_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__CheckTypes_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsAppropriate_BWD_EMoflonEdge_96__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsAppropriate_FWD_EMoflonEdge_102__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__CheckAttributes_FWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__CheckAttributes_BWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsApplicable_CC__Match_Match() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsApplicable_solveCsp_CC__Classifier_AbstractTypeDeclaration_Class_ClassDeclaration_Match_Match() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__IsApplicable_checkCsp_CC__CSP() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__CheckDEC_FWD__AbstractTypeDeclaration_ClassDeclaration() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__CheckDEC_BWD__Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_Classifier_ASTNode2Element_AbstractTypeDeclaration_Class_ClassDeclaration_ASTNode2Element_ModelgeneratorRuleResult() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InClass__GenerateModel_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InClass().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInnerDeclaration2InnerClassifier_InInterface() {
		if (innerDeclaration2InnerClassifier_InInterfaceEClass == null) {
			innerDeclaration2InnerClassifier_InInterfaceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return innerDeclaration2InnerClassifier_InInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsAppropriate_FWD__Match_AbstractTypeDeclaration_InterfaceDeclaration() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__Perform_FWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsApplicable_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__RegisterObjectsToMatch_FWD__Match_AbstractTypeDeclaration_InterfaceDeclaration() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsAppropriate_solveCsp_FWD__Match_AbstractTypeDeclaration_InterfaceDeclaration() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsAppropriate_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsApplicable_solveCsp_FWD__IsApplicableMatch_Classifier_ASTNode2Element_AbstractTypeDeclaration_Interface_InterfaceDeclaration_ASTNode2Element() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsApplicable_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__CheckTypes_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsAppropriate_BWD__Match_Classifier_Interface() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__Perform_BWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsApplicable_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__RegisterObjectsToMatch_BWD__Match_Classifier_Interface() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsAppropriate_solveCsp_BWD__Match_Classifier_Interface() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsAppropriate_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsApplicable_solveCsp_BWD__IsApplicableMatch_Classifier_ASTNode2Element_AbstractTypeDeclaration_Interface_InterfaceDeclaration_ASTNode2Element() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsApplicable_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__CheckTypes_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsAppropriate_BWD_EMoflonEdge_97__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsAppropriate_FWD_EMoflonEdge_103__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__CheckAttributes_FWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__CheckAttributes_BWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsApplicable_CC__Match_Match() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsApplicable_solveCsp_CC__Classifier_AbstractTypeDeclaration_Interface_InterfaceDeclaration_Match_Match() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__IsApplicable_checkCsp_CC__CSP() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__CheckDEC_FWD__AbstractTypeDeclaration_InterfaceDeclaration() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__CheckDEC_BWD__Classifier_Interface() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__GenerateModel_solveCsp_BWD__IsApplicableMatch_Classifier_ASTNode2Element_AbstractTypeDeclaration_Interface_InterfaceDeclaration_ASTNode2Element_ModelgeneratorRuleResult() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InInterface__GenerateModel_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InInterface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInnerDeclaration2InnerClassifier_InMethod_Abstract() {
		if (innerDeclaration2InnerClassifier_InMethod_AbstractEClass == null) {
			innerDeclaration2InnerClassifier_InMethod_AbstractEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return innerDeclaration2InnerClassifier_InMethod_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManifestation4CompilationUnit2Artifact() {
		if (manifestation4CompilationUnit2ArtifactEClass == null) {
			manifestation4CompilationUnit2ArtifactEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(9);
		}
		return manifestation4CompilationUnit2ArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsAppropriate_FWD__Match_CompilationUnit_AbstractTypeDeclaration() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__Perform_FWD__IsApplicableMatch() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsApplicable_FWD__Match() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__RegisterObjectsToMatch_FWD__Match_CompilationUnit_AbstractTypeDeclaration() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsAppropriate_solveCsp_FWD__Match_CompilationUnit_AbstractTypeDeclaration() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsAppropriate_checkCsp_FWD__CSP() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsApplicable_solveCsp_FWD__IsApplicableMatch_ASTNode2Element_CompilationUnit_Artifact_AbstractTypeDeclaration_Classifier_CompilationUnit2Artifact() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsApplicable_checkCsp_FWD__CSP() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__CheckTypes_FWD__Match() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsAppropriate_BWD__Match_Manifestation_Artifact_Classifier() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__Perform_BWD__IsApplicableMatch() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsApplicable_BWD__Match() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__RegisterObjectsToMatch_BWD__Match_Manifestation_Artifact_Classifier() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsAppropriate_solveCsp_BWD__Match_Manifestation_Artifact_Classifier() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsAppropriate_checkCsp_BWD__CSP() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsApplicable_solveCsp_BWD__IsApplicableMatch_ASTNode2Element_CompilationUnit_Manifestation_Artifact_AbstractTypeDeclaration_Classifier_CompilationUnit2Artifact() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsApplicable_checkCsp_BWD__CSP() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__CheckTypes_BWD__Match() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsAppropriate_BWD_EMoflonEdge_98__EMoflonEdge() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsAppropriate_FWD_EMoflonEdge_104__EMoflonEdge() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__CheckAttributes_FWD__TripleMatch() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__CheckAttributes_BWD__TripleMatch() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsApplicable_CC__Match_Match() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsApplicable_solveCsp_CC__CompilationUnit_Manifestation_Artifact_AbstractTypeDeclaration_Classifier_Match_Match() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__IsApplicable_checkCsp_CC__CSP() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__CheckDEC_FWD__CompilationUnit_AbstractTypeDeclaration() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__CheckDEC_BWD__Manifestation_Artifact_Classifier() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__GenerateModel__RuleEntryContainer_ASTNode2Element_CompilationUnit2Artifact() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__GenerateModel_solveCsp_BWD__IsApplicableMatch_ASTNode2Element_CompilationUnit_Artifact_AbstractTypeDeclaration_Classifier_CompilationUnit2Artifact_ModelgeneratorRuleResult() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManifestation4CompilationUnit2Artifact__GenerateModel_checkCsp_BWD__CSP() {
		return getManifestation4CompilationUnit2Artifact().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstructorDec2Operation() {
		if (constructorDec2OperationEClass == null) {
			constructorDec2OperationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(10);
		}
		return constructorDec2OperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsAppropriate_FWD__Match_MConstructorDefinition() {
		return getConstructorDec2Operation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__Perform_FWD__IsApplicableMatch() {
		return getConstructorDec2Operation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsApplicable_FWD__Match() {
		return getConstructorDec2Operation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__RegisterObjectsToMatch_FWD__Match_MConstructorDefinition() {
		return getConstructorDec2Operation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsAppropriate_solveCsp_FWD__Match_MConstructorDefinition() {
		return getConstructorDec2Operation().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsAppropriate_checkCsp_FWD__CSP() {
		return getConstructorDec2Operation().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsApplicable_solveCsp_FWD__IsApplicableMatch_MConstructorDefinition() {
		return getConstructorDec2Operation().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsApplicable_checkCsp_FWD__CSP() {
		return getConstructorDec2Operation().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject() {
		return getConstructorDec2Operation().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__CheckTypes_FWD__Match() {
		return getConstructorDec2Operation().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsAppropriate_BWD__Match_Comment_Operation() {
		return getConstructorDec2Operation().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__Perform_BWD__IsApplicableMatch() {
		return getConstructorDec2Operation().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsApplicable_BWD__Match() {
		return getConstructorDec2Operation().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__RegisterObjectsToMatch_BWD__Match_Comment_Operation() {
		return getConstructorDec2Operation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsAppropriate_solveCsp_BWD__Match_Comment_Operation() {
		return getConstructorDec2Operation().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsAppropriate_checkCsp_BWD__CSP() {
		return getConstructorDec2Operation().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsApplicable_solveCsp_BWD__IsApplicableMatch_Comment_Operation() {
		return getConstructorDec2Operation().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsApplicable_checkCsp_BWD__CSP() {
		return getConstructorDec2Operation().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject() {
		return getConstructorDec2Operation().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__CheckTypes_BWD__Match() {
		return getConstructorDec2Operation().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsAppropriate_FWD_MConstructorDefinition_0__MConstructorDefinition() {
		return getConstructorDec2Operation().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsAppropriate_BWD_EMoflonEdge_99__EMoflonEdge() {
		return getConstructorDec2Operation().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__CheckAttributes_FWD__TripleMatch() {
		return getConstructorDec2Operation().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__CheckAttributes_BWD__TripleMatch() {
		return getConstructorDec2Operation().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsApplicable_CC__Match_Match() {
		return getConstructorDec2Operation().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsApplicable_solveCsp_CC__Comment_Operation_MConstructorDefinition_Match_Match() {
		return getConstructorDec2Operation().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__IsApplicable_checkCsp_CC__CSP() {
		return getConstructorDec2Operation().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__CheckDEC_FWD__MConstructorDefinition() {
		return getConstructorDec2Operation().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__CheckDEC_BWD__Comment_Operation() {
		return getConstructorDec2Operation().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__GenerateModel__RuleEntryContainer() {
		return getConstructorDec2Operation().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getConstructorDec2Operation().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2Operation__GenerateModel_checkCsp_BWD__CSP() {
		return getConstructorDec2Operation().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInnerDeclaration2InnerClassifier_InEnum() {
		if (innerDeclaration2InnerClassifier_InEnumEClass == null) {
			innerDeclaration2InnerClassifier_InEnumEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(11);
		}
		return innerDeclaration2InnerClassifier_InEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsAppropriate_FWD__Match_Package_AbstractTypeDeclaration_EnumDeclaration() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__Perform_FWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsApplicable_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__RegisterObjectsToMatch_FWD__Match_Package_AbstractTypeDeclaration_EnumDeclaration() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsAppropriate_solveCsp_FWD__Match_Package_AbstractTypeDeclaration_EnumDeclaration() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsAppropriate_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsApplicable_solveCsp_FWD__IsApplicableMatch_Classifier_ASTNode2Element_Package_Package_AbstractTypeDeclaration_Enumeration_EnumDeclaration_ASTNode2Element_JavaPackage2UmlPackage() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsApplicable_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__CheckTypes_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsAppropriate_BWD__Match_Classifier_Package_Enumeration() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__Perform_BWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsApplicable_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__RegisterObjectsToMatch_BWD__Match_Classifier_Package_Enumeration() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsAppropriate_solveCsp_BWD__Match_Classifier_Package_Enumeration() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsAppropriate_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsApplicable_solveCsp_BWD__IsApplicableMatch_Classifier_ASTNode2Element_Package_Package_AbstractTypeDeclaration_Enumeration_EnumDeclaration_ASTNode2Element_JavaPackage2UmlPackage() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsApplicable_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__CheckTypes_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsAppropriate_BWD_EMoflonEdge_100__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsAppropriate_FWD_EMoflonEdge_105__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__CheckAttributes_FWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__CheckAttributes_BWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsApplicable_CC__Match_Match() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsApplicable_solveCsp_CC__Classifier_Package_Package_AbstractTypeDeclaration_Enumeration_EnumDeclaration_Match_Match() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__IsApplicable_checkCsp_CC__CSP() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__CheckDEC_FWD__Package_AbstractTypeDeclaration_EnumDeclaration() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__CheckDEC_BWD__Classifier_Package_Enumeration() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__GenerateModel_solveCsp_BWD__IsApplicableMatch_Classifier_ASTNode2Element_Package_Package_AbstractTypeDeclaration_Enumeration_EnumDeclaration_ASTNode2Element_JavaPackage2UmlPackage_ModelgeneratorRuleResult() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InEnum__GenerateModel_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InEnum().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrphandedPrimitive2PrimitiveType() {
		if (orphandedPrimitive2PrimitiveTypeEClass == null) {
			orphandedPrimitive2PrimitiveTypeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(12);
		}
		return orphandedPrimitive2PrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsAppropriate_FWD__Match_Model_PrimitiveType() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__Perform_FWD__IsApplicableMatch() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsApplicable_FWD__Match() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__RegisterObjectsToMatch_FWD__Match_Model_PrimitiveType() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsAppropriate_solveCsp_FWD__Match_Model_PrimitiveType() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsAppropriate_checkCsp_FWD__CSP() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsApplicable_solveCsp_FWD__IsApplicableMatch_Package_PrimitiveType_Model_PrimitiveType_ASTNode2Element_JavaModel2UMLPackage() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsApplicable_checkCsp_FWD__CSP() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__CheckTypes_FWD__Match() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsAppropriate_BWD__Match_Package_PrimitiveType() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__Perform_BWD__IsApplicableMatch() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsApplicable_BWD__Match() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__RegisterObjectsToMatch_BWD__Match_Package_PrimitiveType() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsAppropriate_solveCsp_BWD__Match_Package_PrimitiveType() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsAppropriate_checkCsp_BWD__CSP() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsApplicable_solveCsp_BWD__IsApplicableMatch_Package_PrimitiveType_Model_PrimitiveType_ASTNode2Element_JavaModel2UMLPackage() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsApplicable_checkCsp_BWD__CSP() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__CheckTypes_BWD__Match() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsAppropriate_BWD_EMoflonEdge_101__EMoflonEdge() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsAppropriate_FWD_EMoflonEdge_106__EMoflonEdge() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__CheckAttributes_FWD__TripleMatch() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__CheckAttributes_BWD__TripleMatch() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsApplicable_CC__Match_Match() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsApplicable_solveCsp_CC__Package_PrimitiveType_Model_PrimitiveType_Match_Match() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__IsApplicable_checkCsp_CC__CSP() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__CheckDEC_FWD__Model_PrimitiveType() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__CheckDEC_BWD__Package_PrimitiveType() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__GenerateModel__RuleEntryContainer_JavaModel2UMLPackage_ASTNode2Element() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__GenerateModel_solveCsp_BWD__IsApplicableMatch_Package_PrimitiveType_Model_PrimitiveType_ASTNode2Element_JavaModel2UMLPackage_ModelgeneratorRuleResult() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphandedPrimitive2PrimitiveType__GenerateModel_checkCsp_BWD__CSP() {
		return getOrphandedPrimitive2PrimitiveType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClass4EnumConstInPackage() {
		if (anonymousClass4EnumConstInPackageEClass == null) {
			anonymousClass4EnumConstInPackageEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(13);
		}
		return anonymousClass4EnumConstInPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsAppropriate_FWD__Match_Package_AnonymousClassDeclaration_EnumConstantDeclaration_EnumDeclaration() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__Perform_FWD__IsApplicableMatch() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsApplicable_FWD__Match() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__RegisterObjectsToMatch_FWD__Match_Package_AnonymousClassDeclaration_EnumConstantDeclaration_EnumDeclaration() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsAppropriate_solveCsp_FWD__Match_Package_AnonymousClassDeclaration_EnumConstantDeclaration_EnumDeclaration() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsApplicable_solveCsp_FWD__IsApplicableMatch_Package_Package_AnonymousClassDeclaration_Enumeration_EnumConstantDeclaration_EnumDeclaration_ASTNode2Element_JavaPackage2UmlPackage() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsApplicable_checkCsp_FWD__CSP() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__CheckTypes_FWD__Match() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsAppropriate_BWD__Match_Class_Package_Enumeration() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__Perform_BWD__IsApplicableMatch() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsApplicable_BWD__Match() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__RegisterObjectsToMatch_BWD__Match_Class_Package_Enumeration() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsAppropriate_solveCsp_BWD__Match_Class_Package_Enumeration() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsApplicable_solveCsp_BWD__IsApplicableMatch_Class_Package_Package_Enumeration_EnumConstantDeclaration_EnumDeclaration_ASTNode2Element_JavaPackage2UmlPackage() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsApplicable_checkCsp_BWD__CSP() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__CheckTypes_BWD__Match() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsAppropriate_BWD_EMoflonEdge_102__EMoflonEdge() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsAppropriate_FWD_EMoflonEdge_107__EMoflonEdge() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__CheckAttributes_FWD__TripleMatch() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__CheckAttributes_BWD__TripleMatch() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsApplicable_CC__Match_Match() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsApplicable_solveCsp_CC__Class_Package_Package_AnonymousClassDeclaration_Enumeration_EnumConstantDeclaration_EnumDeclaration_Match_Match() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__IsApplicable_checkCsp_CC__CSP() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__CheckDEC_FWD__Package_AnonymousClassDeclaration_EnumConstantDeclaration_EnumDeclaration() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__CheckDEC_BWD__Class_Package_Enumeration() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_Package_Package_Enumeration_EnumConstantDeclaration_EnumDeclaration_ASTNode2Element_JavaPackage2UmlPackage_ModelgeneratorRuleResult() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInPackage__GenerateModel_checkCsp_BWD__CSP() {
		return getAnonymousClass4EnumConstInPackage().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier2NamedElement_Abstract() {
		if (modifier2NamedElement_AbstractEClass == null) {
			modifier2NamedElement_AbstractEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(14);
		}
		return modifier2NamedElement_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeDeclaration2Interface() {
		if (annotationTypeDeclaration2InterfaceEClass == null) {
			annotationTypeDeclaration2InterfaceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(15);
		}
		return annotationTypeDeclaration2InterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsAppropriate_FWD__Match_AnnotationTypeDeclaration() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__Perform_FWD__IsApplicableMatch() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsApplicable_FWD__Match() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__RegisterObjectsToMatch_FWD__Match_AnnotationTypeDeclaration() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsAppropriate_solveCsp_FWD__Match_AnnotationTypeDeclaration() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsApplicable_solveCsp_FWD__IsApplicableMatch_AnnotationTypeDeclaration() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__CheckTypes_FWD__Match() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsAppropriate_BWD__Match_Interface() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__Perform_BWD__IsApplicableMatch() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsApplicable_BWD__Match() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__RegisterObjectsToMatch_BWD__Match_Interface() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsAppropriate_solveCsp_BWD__Match_Interface() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsApplicable_solveCsp_BWD__IsApplicableMatch_Interface() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__CheckTypes_BWD__Match() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsAppropriate_BWD_Interface_0__Interface() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsAppropriate_FWD_AnnotationTypeDeclaration_0__AnnotationTypeDeclaration() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsApplicable_CC__Match_Match() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsApplicable_solveCsp_CC__AnnotationTypeDeclaration_Interface_Match_Match() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__CheckDEC_FWD__AnnotationTypeDeclaration() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__CheckDEC_BWD__Interface() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__GenerateModel__RuleEntryContainer() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationTypeDeclaration2Interface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaModel2UmlModelRule() {
		if (javaModel2UmlModelRuleEClass == null) {
			javaModel2UmlModelRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(16);
		}
		return javaModel2UmlModelRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsAppropriate_FWD__Match_MGravityModel() {
		return getJavaModel2UmlModelRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__Perform_FWD__IsApplicableMatch() {
		return getJavaModel2UmlModelRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsApplicable_FWD__Match() {
		return getJavaModel2UmlModelRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__RegisterObjectsToMatch_FWD__Match_MGravityModel() {
		return getJavaModel2UmlModelRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsAppropriate_solveCsp_FWD__Match_MGravityModel() {
		return getJavaModel2UmlModelRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getJavaModel2UmlModelRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_MGravityModel() {
		return getJavaModel2UmlModelRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsApplicable_checkCsp_FWD__CSP() {
		return getJavaModel2UmlModelRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getJavaModel2UmlModelRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__CheckTypes_FWD__Match() {
		return getJavaModel2UmlModelRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsAppropriate_BWD__Match_Package_Model_Model_Model_Model() {
		return getJavaModel2UmlModelRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__Perform_BWD__IsApplicableMatch() {
		return getJavaModel2UmlModelRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsApplicable_BWD__Match() {
		return getJavaModel2UmlModelRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__RegisterObjectsToMatch_BWD__Match_Package_Model_Model_Model_Model() {
		return getJavaModel2UmlModelRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsAppropriate_solveCsp_BWD__Match_Package_Model_Model_Model_Model() {
		return getJavaModel2UmlModelRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getJavaModel2UmlModelRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Package_Model_Model_Model_Model() {
		return getJavaModel2UmlModelRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsApplicable_checkCsp_BWD__CSP() {
		return getJavaModel2UmlModelRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getJavaModel2UmlModelRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__CheckTypes_BWD__Match() {
		return getJavaModel2UmlModelRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsAppropriate_FWD_MGravityModel_1__MGravityModel() {
		return getJavaModel2UmlModelRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsAppropriate_BWD_EMoflonEdge_103__EMoflonEdge() {
		return getJavaModel2UmlModelRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__CheckAttributes_FWD__TripleMatch() {
		return getJavaModel2UmlModelRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__CheckAttributes_BWD__TripleMatch() {
		return getJavaModel2UmlModelRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsApplicable_CC__Match_Match() {
		return getJavaModel2UmlModelRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsApplicable_solveCsp_CC__Package_Model_Model_MGravityModel_Model_Model_Match_Match() {
		return getJavaModel2UmlModelRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__IsApplicable_checkCsp_CC__CSP() {
		return getJavaModel2UmlModelRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__CheckDEC_FWD__MGravityModel() {
		return getJavaModel2UmlModelRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__CheckDEC_BWD__Package_Model_Model_Model_Model() {
		return getJavaModel2UmlModelRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__GenerateModel__RuleEntryContainer() {
		return getJavaModel2UmlModelRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getJavaModel2UmlModelRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaModel2UmlModelRule__GenerateModel_checkCsp_BWD__CSP() {
		return getJavaModel2UmlModelRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeBoolean() {
		if (primitiveTypeBooleanEClass == null) {
			primitiveTypeBooleanEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(17);
		}
		return primitiveTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsAppropriate_FWD__Match_PrimitiveTypeBoolean() {
		return getPrimitiveTypeBoolean().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeBoolean().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsApplicable_FWD__Match() {
		return getPrimitiveTypeBoolean().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeBoolean() {
		return getPrimitiveTypeBoolean().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeBoolean() {
		return getPrimitiveTypeBoolean().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeBoolean().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeBoolean() {
		return getPrimitiveTypeBoolean().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeBoolean().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeBoolean().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__CheckTypes_FWD__Match() {
		return getPrimitiveTypeBoolean().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsAppropriate_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeBoolean().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeBoolean().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsApplicable_BWD__Match() {
		return getPrimitiveTypeBoolean().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__RegisterObjectsToMatch_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeBoolean().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsAppropriate_solveCsp_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeBoolean().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeBoolean().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsApplicable_solveCsp_BWD__IsApplicableMatch_PrimitiveType() {
		return getPrimitiveTypeBoolean().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeBoolean().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeBoolean().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__CheckTypes_BWD__Match() {
		return getPrimitiveTypeBoolean().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsAppropriate_BWD_PrimitiveType_0__PrimitiveType() {
		return getPrimitiveTypeBoolean().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsAppropriate_FWD_PrimitiveTypeBoolean_0__PrimitiveTypeBoolean() {
		return getPrimitiveTypeBoolean().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeBoolean().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeBoolean().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeBoolean().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsApplicable_solveCsp_CC__PrimitiveType_PrimitiveTypeBoolean_Match_Match() {
		return getPrimitiveTypeBoolean().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeBoolean().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__CheckDEC_FWD__PrimitiveTypeBoolean() {
		return getPrimitiveTypeBoolean().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__CheckDEC_BWD__PrimitiveType() {
		return getPrimitiveTypeBoolean().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__GenerateModel__RuleEntryContainer() {
		return getPrimitiveTypeBoolean().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getPrimitiveTypeBoolean().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeBoolean__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeBoolean().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInnerDeclaration2InnerClassifier_InMethod4Interface() {
		if (innerDeclaration2InnerClassifier_InMethod4InterfaceEClass == null) {
			innerDeclaration2InnerClassifier_InMethod4InterfaceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(18);
		}
		return innerDeclaration2InnerClassifier_InMethod4InterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsAppropriate_FWD__Match_InterfaceDeclaration_MAbstractMethodDefinition_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__Perform_FWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsApplicable_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__RegisterObjectsToMatch_FWD__Match_InterfaceDeclaration_MAbstractMethodDefinition_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsAppropriate_solveCsp_FWD__Match_InterfaceDeclaration_MAbstractMethodDefinition_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsAppropriate_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsApplicable_solveCsp_FWD__IsApplicableMatch_InterfaceDeclaration_ASTNode2Element_Classifier_MAbstractMethodDefinition_ASTNode2Element_AbstractTypeDeclaration_Interface() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsApplicable_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__CheckTypes_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsAppropriate_BWD__Match_Classifier_Interface() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__Perform_BWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsApplicable_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__RegisterObjectsToMatch_BWD__Match_Classifier_Interface() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsAppropriate_solveCsp_BWD__Match_Classifier_Interface() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsAppropriate_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsApplicable_solveCsp_BWD__IsApplicableMatch_InterfaceDeclaration_ASTNode2Element_Classifier_MAbstractMethodDefinition_ASTNode2Element_AbstractTypeDeclaration_Interface() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsApplicable_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__CheckTypes_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsAppropriate_BWD_EMoflonEdge_104__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsAppropriate_FWD_EMoflonEdge_108__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__CheckAttributes_FWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__CheckAttributes_BWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsApplicable_CC__Match_Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsApplicable_solveCsp_CC__InterfaceDeclaration_Classifier_MAbstractMethodDefinition_AbstractTypeDeclaration_Interface_Match_Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__IsApplicable_checkCsp_CC__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__CheckDEC_FWD__InterfaceDeclaration_MAbstractMethodDefinition_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__CheckDEC_BWD__Classifier_Interface() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__GenerateModel_solveCsp_BWD__IsApplicableMatch_InterfaceDeclaration_ASTNode2Element_Classifier_MAbstractMethodDefinition_ASTNode2Element_AbstractTypeDeclaration_Interface_ModelgeneratorRuleResult() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Interface__GenerateModel_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4Interface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldDec2Property4Interface() {
		if (fieldDec2Property4InterfaceEClass == null) {
			fieldDec2Property4InterfaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(19);
		}
		return fieldDec2Property4InterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsAppropriate_FWD__Match_MFieldDefinition_InterfaceDeclaration() {
		return getFieldDec2Property4Interface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__Perform_FWD__IsApplicableMatch() {
		return getFieldDec2Property4Interface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsApplicable_FWD__Match() {
		return getFieldDec2Property4Interface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__RegisterObjectsToMatch_FWD__Match_MFieldDefinition_InterfaceDeclaration() {
		return getFieldDec2Property4Interface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsAppropriate_solveCsp_FWD__Match_MFieldDefinition_InterfaceDeclaration() {
		return getFieldDec2Property4Interface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldDec2Property4Interface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsApplicable_solveCsp_FWD__IsApplicableMatch_MFieldDefinition_ASTNode2Element_Property_ASTNode2Element_Interface_InterfaceDeclaration() {
		return getFieldDec2Property4Interface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldDec2Property4Interface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldDec2Property4Interface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__CheckTypes_FWD__Match() {
		return getFieldDec2Property4Interface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsAppropriate_BWD__Match_Property_Interface() {
		return getFieldDec2Property4Interface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__Perform_BWD__IsApplicableMatch() {
		return getFieldDec2Property4Interface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsApplicable_BWD__Match() {
		return getFieldDec2Property4Interface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__RegisterObjectsToMatch_BWD__Match_Property_Interface() {
		return getFieldDec2Property4Interface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsAppropriate_solveCsp_BWD__Match_Property_Interface() {
		return getFieldDec2Property4Interface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldDec2Property4Interface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsApplicable_solveCsp_BWD__IsApplicableMatch_MFieldDefinition_ASTNode2Element_Property_ASTNode2Element_Interface_InterfaceDeclaration() {
		return getFieldDec2Property4Interface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldDec2Property4Interface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldDec2Property4Interface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__CheckTypes_BWD__Match() {
		return getFieldDec2Property4Interface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsAppropriate_BWD_EMoflonEdge_105__EMoflonEdge() {
		return getFieldDec2Property4Interface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsAppropriate_FWD_EMoflonEdge_109__EMoflonEdge() {
		return getFieldDec2Property4Interface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__CheckAttributes_FWD__TripleMatch() {
		return getFieldDec2Property4Interface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__CheckAttributes_BWD__TripleMatch() {
		return getFieldDec2Property4Interface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsApplicable_CC__Match_Match() {
		return getFieldDec2Property4Interface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsApplicable_solveCsp_CC__MFieldDefinition_Property_Interface_InterfaceDeclaration_Match_Match() {
		return getFieldDec2Property4Interface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__IsApplicable_checkCsp_CC__CSP() {
		return getFieldDec2Property4Interface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__CheckDEC_FWD__MFieldDefinition_InterfaceDeclaration() {
		return getFieldDec2Property4Interface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__CheckDEC_BWD__Property_Interface() {
		return getFieldDec2Property4Interface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getFieldDec2Property4Interface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__GenerateModel_solveCsp_BWD__IsApplicableMatch_MFieldDefinition_ASTNode2Element_Property_ASTNode2Element_Interface_InterfaceDeclaration_ModelgeneratorRuleResult() {
		return getFieldDec2Property4Interface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Interface__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldDec2Property4Interface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier2Feature_Abstract() {
		if (modifier2Feature_AbstractEClass == null) {
			modifier2Feature_AbstractEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(20);
		}
		return modifier2Feature_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeLong() {
		if (primitiveTypeLongEClass == null) {
			primitiveTypeLongEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(21);
		}
		return primitiveTypeLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsAppropriate_FWD__Match_PrimitiveTypeLong() {
		return getPrimitiveTypeLong().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeLong().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsApplicable_FWD__Match() {
		return getPrimitiveTypeLong().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeLong() {
		return getPrimitiveTypeLong().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeLong() {
		return getPrimitiveTypeLong().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeLong().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeLong() {
		return getPrimitiveTypeLong().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeLong().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeLong().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__CheckTypes_FWD__Match() {
		return getPrimitiveTypeLong().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsAppropriate_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeLong().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeLong().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsApplicable_BWD__Match() {
		return getPrimitiveTypeLong().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__RegisterObjectsToMatch_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeLong().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsAppropriate_solveCsp_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeLong().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeLong().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsApplicable_solveCsp_BWD__IsApplicableMatch_PrimitiveType() {
		return getPrimitiveTypeLong().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeLong().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeLong().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__CheckTypes_BWD__Match() {
		return getPrimitiveTypeLong().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsAppropriate_BWD_PrimitiveType_1__PrimitiveType() {
		return getPrimitiveTypeLong().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsAppropriate_FWD_PrimitiveTypeLong_0__PrimitiveTypeLong() {
		return getPrimitiveTypeLong().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeLong().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeLong().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeLong().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsApplicable_solveCsp_CC__PrimitiveType_PrimitiveTypeLong_Match_Match() {
		return getPrimitiveTypeLong().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeLong().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__CheckDEC_FWD__PrimitiveTypeLong() {
		return getPrimitiveTypeLong().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__CheckDEC_BWD__PrimitiveType() {
		return getPrimitiveTypeLong().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__GenerateModel__RuleEntryContainer() {
		return getPrimitiveTypeLong().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getPrimitiveTypeLong().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeLong__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeLong().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedType2Interface_InnerTypeInClass() {
		if (parameterizedType2Interface_InnerTypeInClassEClass == null) {
			parameterizedType2Interface_InnerTypeInClassEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(22);
		}
		return parameterizedType2Interface_InnerTypeInClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsAppropriate_FWD__Match_TypeDeclaration_AbstractTypeDeclaration_ParameterizedType_Package_TypeAccess() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__Perform_FWD__IsApplicableMatch() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsApplicable_FWD__Match() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__RegisterObjectsToMatch_FWD__Match_TypeDeclaration_AbstractTypeDeclaration_ParameterizedType_Package_TypeAccess() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsAppropriate_solveCsp_FWD__Match_TypeDeclaration_AbstractTypeDeclaration_ParameterizedType_Package_TypeAccess() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_Package_ASTNode2Element_Class_TypeDeclaration_AbstractTypeDeclaration_ParameterizedType_Package_JavaPackage2UmlPackage_TypeAccess_Interface_ASTNode2Element() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsApplicable_checkCsp_FWD__CSP() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__CheckTypes_FWD__Match() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsAppropriate_BWD__Match_Package_Class_Interface_Interface() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__Perform_BWD__IsApplicableMatch() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsApplicable_BWD__Match() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__RegisterObjectsToMatch_BWD__Match_Package_Class_Interface_Interface() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsAppropriate_solveCsp_BWD__Match_Package_Class_Interface_Interface() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsAppropriate_checkCsp_BWD__CSP() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_Package_ASTNode2Element_Class_TypeDeclaration_AbstractTypeDeclaration_Package_JavaPackage2UmlPackage_Interface_ASTNode2Element_Interface() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsApplicable_checkCsp_BWD__CSP() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__CheckTypes_BWD__Match() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsAppropriate_BWD_EMoflonEdge_106__EMoflonEdge() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsAppropriate_FWD_EMoflonEdge_110__EMoflonEdge() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__CheckAttributes_FWD__TripleMatch() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__CheckAttributes_BWD__TripleMatch() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsApplicable_CC__Match_Match() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsApplicable_solveCsp_CC__Package_Class_TypeDeclaration_AbstractTypeDeclaration_ParameterizedType_Package_TypeAccess_Interface_Interface_Match_Match() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__IsApplicable_checkCsp_CC__CSP() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__CheckDEC_FWD__TypeDeclaration_AbstractTypeDeclaration_ParameterizedType_Package_TypeAccess() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__CheckDEC_BWD__Package_Class_Interface_Interface() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_Package_ASTNode2Element_Class_TypeDeclaration_AbstractTypeDeclaration_Package_JavaPackage2UmlPackage_Interface_ASTNode2Element_ModelgeneratorRuleResult() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInClass__GenerateModel_checkCsp_BWD__CSP() {
		return getParameterizedType2Interface_InnerTypeInClass().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInnerDeclaration2InnerClassifier_InAnonymous() {
		if (innerDeclaration2InnerClassifier_InAnonymousEClass == null) {
			innerDeclaration2InnerClassifier_InAnonymousEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(23);
		}
		return innerDeclaration2InnerClassifier_InAnonymousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsAppropriate_FWD__Match_AnonymousClassDeclaration_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__Perform_FWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsApplicable_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__RegisterObjectsToMatch_FWD__Match_AnonymousClassDeclaration_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsAppropriate_solveCsp_FWD__Match_AnonymousClassDeclaration_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsAppropriate_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsApplicable_solveCsp_FWD__IsApplicableMatch_Classifier_Class_ASTNode2Element_AnonymousClassDeclaration_ASTNode2Element_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsApplicable_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__CheckTypes_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsAppropriate_BWD__Match_Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__Perform_BWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsApplicable_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__RegisterObjectsToMatch_BWD__Match_Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsAppropriate_solveCsp_BWD__Match_Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsAppropriate_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsApplicable_solveCsp_BWD__IsApplicableMatch_Classifier_Class_ASTNode2Element_AnonymousClassDeclaration_ASTNode2Element_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsApplicable_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__CheckTypes_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsAppropriate_BWD_EMoflonEdge_107__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsAppropriate_FWD_EMoflonEdge_111__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__CheckAttributes_FWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__CheckAttributes_BWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsApplicable_CC__Match_Match() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsApplicable_solveCsp_CC__Classifier_Class_AnonymousClassDeclaration_AbstractTypeDeclaration_Match_Match() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__IsApplicable_checkCsp_CC__CSP() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__CheckDEC_FWD__AnonymousClassDeclaration_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__CheckDEC_BWD__Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__GenerateModel_solveCsp_BWD__IsApplicableMatch_Classifier_Class_ASTNode2Element_AnonymousClassDeclaration_ASTNode2Element_AbstractTypeDeclaration_ModelgeneratorRuleResult() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnonymous__GenerateModel_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InAnonymous().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationInAnnotationType() {
		if (operationInAnnotationTypeEClass == null) {
			operationInAnnotationTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(24);
		}
		return operationInAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsAppropriate_FWD__Match_AnnotationTypeDeclaration_MAbstractMethodDefinition() {
		return getOperationInAnnotationType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__Perform_FWD__IsApplicableMatch() {
		return getOperationInAnnotationType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsApplicable_FWD__Match() {
		return getOperationInAnnotationType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__RegisterObjectsToMatch_FWD__Match_AnnotationTypeDeclaration_MAbstractMethodDefinition() {
		return getOperationInAnnotationType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsAppropriate_solveCsp_FWD__Match_AnnotationTypeDeclaration_MAbstractMethodDefinition() {
		return getOperationInAnnotationType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsAppropriate_checkCsp_FWD__CSP() {
		return getOperationInAnnotationType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsApplicable_solveCsp_FWD__IsApplicableMatch_Interface_ASTNode2Element_ASTNode2Element_AnnotationTypeDeclaration_MAbstractMethodDefinition_Operation() {
		return getOperationInAnnotationType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsApplicable_checkCsp_FWD__CSP() {
		return getOperationInAnnotationType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getOperationInAnnotationType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__CheckTypes_FWD__Match() {
		return getOperationInAnnotationType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsAppropriate_BWD__Match_Interface_Operation() {
		return getOperationInAnnotationType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__Perform_BWD__IsApplicableMatch() {
		return getOperationInAnnotationType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsApplicable_BWD__Match() {
		return getOperationInAnnotationType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__RegisterObjectsToMatch_BWD__Match_Interface_Operation() {
		return getOperationInAnnotationType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsAppropriate_solveCsp_BWD__Match_Interface_Operation() {
		return getOperationInAnnotationType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsAppropriate_checkCsp_BWD__CSP() {
		return getOperationInAnnotationType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsApplicable_solveCsp_BWD__IsApplicableMatch_Interface_ASTNode2Element_ASTNode2Element_AnnotationTypeDeclaration_MAbstractMethodDefinition_Operation() {
		return getOperationInAnnotationType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsApplicable_checkCsp_BWD__CSP() {
		return getOperationInAnnotationType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getOperationInAnnotationType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__CheckTypes_BWD__Match() {
		return getOperationInAnnotationType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsAppropriate_BWD_EMoflonEdge_108__EMoflonEdge() {
		return getOperationInAnnotationType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsAppropriate_FWD_EMoflonEdge_112__EMoflonEdge() {
		return getOperationInAnnotationType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__CheckAttributes_FWD__TripleMatch() {
		return getOperationInAnnotationType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__CheckAttributes_BWD__TripleMatch() {
		return getOperationInAnnotationType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsApplicable_CC__Match_Match() {
		return getOperationInAnnotationType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsApplicable_solveCsp_CC__Interface_AnnotationTypeDeclaration_MAbstractMethodDefinition_Operation_Match_Match() {
		return getOperationInAnnotationType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__IsApplicable_checkCsp_CC__CSP() {
		return getOperationInAnnotationType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__CheckDEC_FWD__AnnotationTypeDeclaration_MAbstractMethodDefinition() {
		return getOperationInAnnotationType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__CheckDEC_BWD__Interface_Operation() {
		return getOperationInAnnotationType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getOperationInAnnotationType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__GenerateModel_solveCsp_BWD__IsApplicableMatch_Interface_ASTNode2Element_ASTNode2Element_AnnotationTypeDeclaration_MAbstractMethodDefinition_Operation_ModelgeneratorRuleResult() {
		return getOperationInAnnotationType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnnotationType__GenerateModel_checkCsp_BWD__CSP() {
		return getOperationInAnnotationType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeAccess2InterfaceGeneralization() {
		if (typeAccess2InterfaceGeneralizationEClass == null) {
			typeAccess2InterfaceGeneralizationEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(25);
		}
		return typeAccess2InterfaceGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsAppropriate_FWD__Match_InterfaceDeclaration_InterfaceDeclaration_TypeAccess() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__Perform_FWD__IsApplicableMatch() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsApplicable_FWD__Match() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__RegisterObjectsToMatch_FWD__Match_InterfaceDeclaration_InterfaceDeclaration_TypeAccess() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsAppropriate_solveCsp_FWD__Match_InterfaceDeclaration_InterfaceDeclaration_TypeAccess() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsAppropriate_checkCsp_FWD__CSP() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsApplicable_solveCsp_FWD__IsApplicableMatch_InterfaceDeclaration_Interface_ASTNode2Element_InterfaceDeclaration_TypeAccess_Interface_ASTNode2Element() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsApplicable_checkCsp_FWD__CSP() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__CheckTypes_FWD__Match() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsAppropriate_BWD__Match_Interface_Generalization_Interface() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__Perform_BWD__IsApplicableMatch() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsApplicable_BWD__Match() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__RegisterObjectsToMatch_BWD__Match_Interface_Generalization_Interface() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsAppropriate_solveCsp_BWD__Match_Interface_Generalization_Interface() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsAppropriate_checkCsp_BWD__CSP() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsApplicable_solveCsp_BWD__IsApplicableMatch_InterfaceDeclaration_Interface_ASTNode2Element_InterfaceDeclaration_Generalization_Interface_ASTNode2Element() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsApplicable_checkCsp_BWD__CSP() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__CheckTypes_BWD__Match() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsAppropriate_BWD_EMoflonEdge_109__EMoflonEdge() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsAppropriate_FWD_EMoflonEdge_113__EMoflonEdge() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__CheckAttributes_FWD__TripleMatch() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__CheckAttributes_BWD__TripleMatch() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsApplicable_CC__Match_Match() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsApplicable_solveCsp_CC__InterfaceDeclaration_Interface_InterfaceDeclaration_TypeAccess_Generalization_Interface_Match_Match() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__IsApplicable_checkCsp_CC__CSP() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__CheckDEC_FWD__InterfaceDeclaration_InterfaceDeclaration_TypeAccess() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__CheckDEC_BWD__Interface_Generalization_Interface() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__GenerateModel_solveCsp_BWD__IsApplicableMatch_InterfaceDeclaration_Interface_ASTNode2Element_InterfaceDeclaration_Interface_ASTNode2Element_ModelgeneratorRuleResult() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceGeneralization__GenerateModel_checkCsp_BWD__CSP() {
		return getTypeAccess2InterfaceGeneralization().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeParameter2Object_Abstract() {
		if (typeParameter2Object_AbstractEClass == null) {
			typeParameter2Object_AbstractEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(26);
		}
		return typeParameter2Object_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeParameter2Object_InMethod_InClass() {
		if (typeParameter2Object_InMethod_InClassEClass == null) {
			typeParameter2Object_InMethod_InClassEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(27);
		}
		return typeParameter2Object_InMethod_InClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsAppropriate_FWD__Match_ClassDeclaration_AbstractMethodDeclaration_TypeParameter() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__Perform_FWD__IsApplicableMatch() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsApplicable_FWD__Match() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__RegisterObjectsToMatch_FWD__Match_ClassDeclaration_AbstractMethodDeclaration_TypeParameter() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsAppropriate_solveCsp_FWD__Match_ClassDeclaration_AbstractMethodDeclaration_TypeParameter() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_ClassDeclaration_AbstractMethodDeclaration_Class_TypeParameter_ASTNode2Element() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsApplicable_checkCsp_FWD__CSP() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__CheckTypes_FWD__Match() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsAppropriate_BWD__Match_Class_Class() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__Perform_BWD__IsApplicableMatch() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsApplicable_BWD__Match() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__RegisterObjectsToMatch_BWD__Match_Class_Class() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsAppropriate_solveCsp_BWD__Match_Class_Class() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsAppropriate_checkCsp_BWD__CSP() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_ClassDeclaration_AbstractMethodDeclaration_Class_Class_ASTNode2Element() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsApplicable_checkCsp_BWD__CSP() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__CheckTypes_BWD__Match() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsAppropriate_BWD_EMoflonEdge_110__EMoflonEdge() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsAppropriate_FWD_EMoflonEdge_114__EMoflonEdge() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__CheckAttributes_FWD__TripleMatch() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__CheckAttributes_BWD__TripleMatch() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsApplicable_CC__Match_Match() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsApplicable_solveCsp_CC__ClassDeclaration_AbstractMethodDeclaration_Class_Class_TypeParameter_Match_Match() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__IsApplicable_checkCsp_CC__CSP() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__CheckDEC_FWD__ClassDeclaration_AbstractMethodDeclaration_TypeParameter() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__CheckDEC_BWD__Class_Class() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_ClassDeclaration_AbstractMethodDeclaration_Class_ASTNode2Element_ModelgeneratorRuleResult() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InClass__GenerateModel_checkCsp_BWD__CSP() {
		return getTypeParameter2Object_InMethod_InClass().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeShort() {
		if (primitiveTypeShortEClass == null) {
			primitiveTypeShortEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(28);
		}
		return primitiveTypeShortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsAppropriate_FWD__Match_PrimitiveTypeShort() {
		return getPrimitiveTypeShort().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeShort().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsApplicable_FWD__Match() {
		return getPrimitiveTypeShort().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeShort() {
		return getPrimitiveTypeShort().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeShort() {
		return getPrimitiveTypeShort().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeShort().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeShort() {
		return getPrimitiveTypeShort().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeShort().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeShort().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__CheckTypes_FWD__Match() {
		return getPrimitiveTypeShort().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsAppropriate_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeShort().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeShort().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsApplicable_BWD__Match() {
		return getPrimitiveTypeShort().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__RegisterObjectsToMatch_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeShort().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsAppropriate_solveCsp_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeShort().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeShort().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsApplicable_solveCsp_BWD__IsApplicableMatch_PrimitiveType() {
		return getPrimitiveTypeShort().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeShort().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeShort().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__CheckTypes_BWD__Match() {
		return getPrimitiveTypeShort().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsAppropriate_BWD_PrimitiveType_2__PrimitiveType() {
		return getPrimitiveTypeShort().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsAppropriate_FWD_PrimitiveTypeShort_0__PrimitiveTypeShort() {
		return getPrimitiveTypeShort().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeShort().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeShort().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeShort().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsApplicable_solveCsp_CC__PrimitiveType_PrimitiveTypeShort_Match_Match() {
		return getPrimitiveTypeShort().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeShort().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__CheckDEC_FWD__PrimitiveTypeShort() {
		return getPrimitiveTypeShort().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__CheckDEC_BWD__PrimitiveType() {
		return getPrimitiveTypeShort().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__GenerateModel__RuleEntryContainer() {
		return getPrimitiveTypeShort().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getPrimitiveTypeShort().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeShort__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeShort().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeParameter2Object_InMethod_Abstract() {
		if (typeParameter2Object_InMethod_AbstractEClass == null) {
			typeParameter2Object_InMethod_AbstractEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(29);
		}
		return typeParameter2Object_InMethod_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClass4Class() {
		if (anonymousClass4ClassEClass == null) {
			anonymousClass4ClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(30);
		}
		return anonymousClass4ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsAppropriate_FWD__Match_MClassInstanceCreation_AnonymousClassDeclaration_MDefinition_MClass() {
		return getAnonymousClass4Class().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__Perform_FWD__IsApplicableMatch() {
		return getAnonymousClass4Class().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsApplicable_FWD__Match() {
		return getAnonymousClass4Class().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__RegisterObjectsToMatch_FWD__Match_MClassInstanceCreation_AnonymousClassDeclaration_MDefinition_MClass() {
		return getAnonymousClass4Class().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsAppropriate_solveCsp_FWD__Match_MClassInstanceCreation_AnonymousClassDeclaration_MDefinition_MClass() {
		return getAnonymousClass4Class().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnonymousClass4Class().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsApplicable_solveCsp_FWD__IsApplicableMatch_MClassInstanceCreation_AnonymousClassDeclaration_Class_MDefinition_MClass_ASTNode2Element() {
		return getAnonymousClass4Class().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsApplicable_checkCsp_FWD__CSP() {
		return getAnonymousClass4Class().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClass4Class().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__CheckTypes_FWD__Match() {
		return getAnonymousClass4Class().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsAppropriate_BWD__Match_Class_Class() {
		return getAnonymousClass4Class().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__Perform_BWD__IsApplicableMatch() {
		return getAnonymousClass4Class().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsApplicable_BWD__Match() {
		return getAnonymousClass4Class().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__RegisterObjectsToMatch_BWD__Match_Class_Class() {
		return getAnonymousClass4Class().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsAppropriate_solveCsp_BWD__Match_Class_Class() {
		return getAnonymousClass4Class().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnonymousClass4Class().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsApplicable_solveCsp_BWD__IsApplicableMatch_Class_Class_MDefinition_MClass_ASTNode2Element() {
		return getAnonymousClass4Class().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsApplicable_checkCsp_BWD__CSP() {
		return getAnonymousClass4Class().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClass4Class().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__CheckTypes_BWD__Match() {
		return getAnonymousClass4Class().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsAppropriate_BWD_EMoflonEdge_111__EMoflonEdge() {
		return getAnonymousClass4Class().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsAppropriate_FWD_EMoflonEdge_115__EMoflonEdge() {
		return getAnonymousClass4Class().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__CheckAttributes_FWD__TripleMatch() {
		return getAnonymousClass4Class().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__CheckAttributes_BWD__TripleMatch() {
		return getAnonymousClass4Class().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsApplicable_CC__Match_Match() {
		return getAnonymousClass4Class().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsApplicable_solveCsp_CC__MClassInstanceCreation_Class_AnonymousClassDeclaration_Class_MDefinition_MClass_Match_Match() {
		return getAnonymousClass4Class().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__IsApplicable_checkCsp_CC__CSP() {
		return getAnonymousClass4Class().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__CheckDEC_FWD__MClassInstanceCreation_AnonymousClassDeclaration_MDefinition_MClass() {
		return getAnonymousClass4Class().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__CheckDEC_BWD__Class_Class() {
		return getAnonymousClass4Class().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getAnonymousClass4Class().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__GenerateModel_solveCsp_BWD__IsApplicableMatch_Class_MDefinition_MClass_ASTNode2Element_ModelgeneratorRuleResult() {
		return getAnonymousClass4Class().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Class__GenerateModel_checkCsp_BWD__CSP() {
		return getAnonymousClass4Class().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInnerDeclaration2InnerClassifier_InMethod4Class() {
		if (innerDeclaration2InnerClassifier_InMethod4ClassEClass == null) {
			innerDeclaration2InnerClassifier_InMethod4ClassEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(31);
		}
		return innerDeclaration2InnerClassifier_InMethod4ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsAppropriate_FWD__Match_ClassDeclaration_MAbstractMethodDefinition_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__Perform_FWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsApplicable_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__RegisterObjectsToMatch_FWD__Match_ClassDeclaration_MAbstractMethodDefinition_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsAppropriate_solveCsp_FWD__Match_ClassDeclaration_MAbstractMethodDefinition_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsAppropriate_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsApplicable_solveCsp_FWD__IsApplicableMatch_ClassDeclaration_ASTNode2Element_MAbstractMethodDefinition_Classifier_ASTNode2Element_AbstractTypeDeclaration_Class() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsApplicable_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__CheckTypes_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsAppropriate_BWD__Match_Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__Perform_BWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsApplicable_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__RegisterObjectsToMatch_BWD__Match_Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsAppropriate_solveCsp_BWD__Match_Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsAppropriate_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsApplicable_solveCsp_BWD__IsApplicableMatch_ClassDeclaration_ASTNode2Element_MAbstractMethodDefinition_Classifier_ASTNode2Element_AbstractTypeDeclaration_Class() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsApplicable_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__CheckTypes_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsAppropriate_BWD_EMoflonEdge_112__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsAppropriate_FWD_EMoflonEdge_116__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__CheckAttributes_FWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__CheckAttributes_BWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsApplicable_CC__Match_Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsApplicable_solveCsp_CC__ClassDeclaration_MAbstractMethodDefinition_Classifier_AbstractTypeDeclaration_Class_Match_Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__IsApplicable_checkCsp_CC__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__CheckDEC_FWD__ClassDeclaration_MAbstractMethodDefinition_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__CheckDEC_BWD__Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__GenerateModel_solveCsp_BWD__IsApplicableMatch_ClassDeclaration_ASTNode2Element_MAbstractMethodDefinition_Classifier_ASTNode2Element_AbstractTypeDeclaration_Class_ModelgeneratorRuleResult() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4Class__GenerateModel_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4Class().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedType2Classifier_Abstract() {
		if (parameterizedType2Classifier_AbstractEClass == null) {
			parameterizedType2Classifier_AbstractEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(32);
		}
		return parameterizedType2Classifier_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedType2Classifier_InnerTypeInInterface_Abstract() {
		if (parameterizedType2Classifier_InnerTypeInInterface_AbstractEClass == null) {
			parameterizedType2Classifier_InnerTypeInInterface_AbstractEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(33);
		}
		return parameterizedType2Classifier_InnerTypeInInterface_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaPackageToUMLPackage_underModel() {
		if (javaPackageToUMLPackage_underModelEClass == null) {
			javaPackageToUMLPackage_underModelEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(34);
		}
		return javaPackageToUMLPackage_underModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsAppropriate_FWD__Match_Model_Package() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__Perform_FWD__IsApplicableMatch() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsApplicable_FWD__Match() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__RegisterObjectsToMatch_FWD__Match_Model_Package() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsAppropriate_solveCsp_FWD__Match_Model_Package() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsAppropriate_checkCsp_FWD__CSP() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsApplicable_solveCsp_FWD__IsApplicableMatch_JavaModel2UMLPackage_Model_Package_Model() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsApplicable_checkCsp_FWD__CSP() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__CheckTypes_FWD__Match() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsAppropriate_BWD__Match_Package_Model() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__Perform_BWD__IsApplicableMatch() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsApplicable_BWD__Match() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__RegisterObjectsToMatch_BWD__Match_Package_Model() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsAppropriate_solveCsp_BWD__Match_Package_Model() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsAppropriate_checkCsp_BWD__CSP() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsApplicable_solveCsp_BWD__IsApplicableMatch_Package_JavaModel2UMLPackage_Model_Model() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsApplicable_checkCsp_BWD__CSP() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__CheckTypes_BWD__Match() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsAppropriate_BWD_EMoflonEdge_113__EMoflonEdge() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsAppropriate_FWD_EMoflonEdge_117__EMoflonEdge() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__CheckAttributes_FWD__TripleMatch() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__CheckAttributes_BWD__TripleMatch() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsApplicable_CC__Match_Match() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsApplicable_solveCsp_CC__Package_Model_Package_Model_Match_Match() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__IsApplicable_checkCsp_CC__CSP() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__CheckDEC_FWD__Model_Package() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__CheckDEC_BWD__Package_Model() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__GenerateModel__RuleEntryContainer_JavaModel2UMLPackage() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__GenerateModel_solveCsp_BWD__IsApplicableMatch_JavaModel2UMLPackage_Model_Model_ModelgeneratorRuleResult() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaPackageToUMLPackage_underModel__GenerateModel_checkCsp_BWD__CSP() {
		return getJavaPackageToUMLPackage_underModel().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrphanedTypeDec2OrphanedType_Abstract() {
		if (orphanedTypeDec2OrphanedType_AbstractEClass == null) {
			orphanedTypeDec2OrphanedType_AbstractEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(35);
		}
		return orphanedTypeDec2OrphanedType_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaAnnotationValueEntry2Comment() {
		if (javaAnnotationValueEntry2CommentEClass == null) {
			javaAnnotationValueEntry2CommentEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(36);
		}
		return javaAnnotationValueEntry2CommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsAppropriate_FWD__Match_AnnotationMemberValuePair_StringLiteral_ArrayInitializer_Annotation() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__Perform_FWD__IsApplicableMatch() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsApplicable_FWD__Match() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__RegisterObjectsToMatch_FWD__Match_AnnotationMemberValuePair_StringLiteral_ArrayInitializer_Annotation() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsAppropriate_solveCsp_FWD__Match_AnnotationMemberValuePair_StringLiteral_ArrayInitializer_Annotation() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsAppropriate_checkCsp_FWD__CSP() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsApplicable_solveCsp_FWD__IsApplicableMatch_ASTNode2Element_ASTNode2Element_AnnotationMemberValuePair_Comment_Comment_StringLiteral_ArrayInitializer_Annotation() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsApplicable_checkCsp_FWD__CSP() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__CheckTypes_FWD__Match() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsAppropriate_BWD__Match_Comment_Comment_Comment() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__Perform_BWD__IsApplicableMatch() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsApplicable_BWD__Match() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__RegisterObjectsToMatch_BWD__Match_Comment_Comment_Comment() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsAppropriate_solveCsp_BWD__Match_Comment_Comment_Comment() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsAppropriate_checkCsp_BWD__CSP() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsApplicable_solveCsp_BWD__IsApplicableMatch_ASTNode2Element_ASTNode2Element_Comment_AnnotationMemberValuePair_Comment_Comment_ArrayInitializer_Annotation() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsApplicable_checkCsp_BWD__CSP() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__CheckTypes_BWD__Match() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsAppropriate_BWD_EMoflonEdge_114__EMoflonEdge() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsAppropriate_FWD_EMoflonEdge_118__EMoflonEdge() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__CheckAttributes_FWD__TripleMatch() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__CheckAttributes_BWD__TripleMatch() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsApplicable_CC__Match_Match() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsApplicable_solveCsp_CC__Comment_AnnotationMemberValuePair_Comment_Comment_StringLiteral_ArrayInitializer_Annotation_Match_Match() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__IsApplicable_checkCsp_CC__CSP() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__CheckDEC_FWD__AnnotationMemberValuePair_StringLiteral_ArrayInitializer_Annotation() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__CheckDEC_BWD__Comment_Comment_Comment() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__GenerateModel_solveCsp_BWD__IsApplicableMatch_ASTNode2Element_ASTNode2Element_AnnotationMemberValuePair_Comment_Comment_ArrayInitializer_Annotation_ModelgeneratorRuleResult() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValueEntry2Comment__GenerateModel_checkCsp_BWD__CSP() {
		return getJavaAnnotationValueEntry2Comment().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTypeAccess2ReturnParam() {
		if (abstractTypeAccess2ReturnParamEClass == null) {
			abstractTypeAccess2ReturnParamEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(37);
		}
		return abstractTypeAccess2ReturnParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsAppropriate_FWD__Match_TypeAccess_Type_MMethodDefinition() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__Perform_FWD__IsApplicableMatch() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsApplicable_FWD__Match() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__RegisterObjectsToMatch_FWD__Match_TypeAccess_Type_MMethodDefinition() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsAppropriate_solveCsp_FWD__Match_TypeAccess_Type_MMethodDefinition() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsAppropriate_checkCsp_FWD__CSP() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsApplicable_solveCsp_FWD__IsApplicableMatch_ASTNode2Element_TypeAccess_Type_ASTNode2Element_MMethodDefinition_Operation_Type() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsApplicable_checkCsp_FWD__CSP() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__CheckTypes_FWD__Match() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsAppropriate_BWD__Match_Parameter_Operation_Type() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__Perform_BWD__IsApplicableMatch() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsApplicable_BWD__Match() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__RegisterObjectsToMatch_BWD__Match_Parameter_Operation_Type() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsAppropriate_solveCsp_BWD__Match_Parameter_Operation_Type() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsAppropriate_checkCsp_BWD__CSP() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsApplicable_solveCsp_BWD__IsApplicableMatch_ASTNode2Element_Parameter_Type_ASTNode2Element_MMethodDefinition_Operation_Type() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsApplicable_checkCsp_BWD__CSP() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__CheckTypes_BWD__Match() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsAppropriate_BWD_EMoflonEdge_115__EMoflonEdge() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsAppropriate_FWD_EMoflonEdge_119__EMoflonEdge() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__CheckAttributes_FWD__TripleMatch() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__CheckAttributes_BWD__TripleMatch() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsApplicable_CC__Match_Match() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsApplicable_solveCsp_CC__TypeAccess_Parameter_Type_MMethodDefinition_Operation_Type_Match_Match() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__IsApplicable_checkCsp_CC__CSP() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__CheckDEC_FWD__TypeAccess_Type_MMethodDefinition() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__CheckDEC_BWD__Parameter_Operation_Type() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__GenerateModel_solveCsp_BWD__IsApplicableMatch_ASTNode2Element_Type_ASTNode2Element_MMethodDefinition_Operation_Type_ModelgeneratorRuleResult() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractTypeAccess2ReturnParam__GenerateModel_checkCsp_BWD__CSP() {
		return getAbstractTypeAccess2ReturnParam().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveType2PrimitiveType() {
		if (primitiveType2PrimitiveTypeEClass == null) {
			primitiveType2PrimitiveTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(38);
		}
		return primitiveType2PrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClass4Interface() {
		if (anonymousClass4InterfaceEClass == null) {
			anonymousClass4InterfaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(39);
		}
		return anonymousClass4InterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsAppropriate_FWD__Match_MClassInstanceCreation_AnonymousClassDeclaration_MDefinition_InterfaceDeclaration() {
		return getAnonymousClass4Interface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__Perform_FWD__IsApplicableMatch() {
		return getAnonymousClass4Interface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsApplicable_FWD__Match() {
		return getAnonymousClass4Interface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__RegisterObjectsToMatch_FWD__Match_MClassInstanceCreation_AnonymousClassDeclaration_MDefinition_InterfaceDeclaration() {
		return getAnonymousClass4Interface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsAppropriate_solveCsp_FWD__Match_MClassInstanceCreation_AnonymousClassDeclaration_MDefinition_InterfaceDeclaration() {
		return getAnonymousClass4Interface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnonymousClass4Interface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsApplicable_solveCsp_FWD__IsApplicableMatch_MClassInstanceCreation_AnonymousClassDeclaration_Interface_MDefinition_InterfaceDeclaration_ASTNode2Element() {
		return getAnonymousClass4Interface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsApplicable_checkCsp_FWD__CSP() {
		return getAnonymousClass4Interface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClass4Interface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__CheckTypes_FWD__Match() {
		return getAnonymousClass4Interface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsAppropriate_BWD__Match_Class_Interface() {
		return getAnonymousClass4Interface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__Perform_BWD__IsApplicableMatch() {
		return getAnonymousClass4Interface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsApplicable_BWD__Match() {
		return getAnonymousClass4Interface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__RegisterObjectsToMatch_BWD__Match_Class_Interface() {
		return getAnonymousClass4Interface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsAppropriate_solveCsp_BWD__Match_Class_Interface() {
		return getAnonymousClass4Interface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnonymousClass4Interface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsApplicable_solveCsp_BWD__IsApplicableMatch_Class_Interface_MDefinition_InterfaceDeclaration_ASTNode2Element() {
		return getAnonymousClass4Interface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsApplicable_checkCsp_BWD__CSP() {
		return getAnonymousClass4Interface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClass4Interface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__CheckTypes_BWD__Match() {
		return getAnonymousClass4Interface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsAppropriate_BWD_EMoflonEdge_116__EMoflonEdge() {
		return getAnonymousClass4Interface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsAppropriate_FWD_EMoflonEdge_120__EMoflonEdge() {
		return getAnonymousClass4Interface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__CheckAttributes_FWD__TripleMatch() {
		return getAnonymousClass4Interface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__CheckAttributes_BWD__TripleMatch() {
		return getAnonymousClass4Interface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsApplicable_CC__Match_Match() {
		return getAnonymousClass4Interface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsApplicable_solveCsp_CC__MClassInstanceCreation_Class_AnonymousClassDeclaration_Interface_MDefinition_InterfaceDeclaration_Match_Match() {
		return getAnonymousClass4Interface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__IsApplicable_checkCsp_CC__CSP() {
		return getAnonymousClass4Interface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__CheckDEC_FWD__MClassInstanceCreation_AnonymousClassDeclaration_MDefinition_InterfaceDeclaration() {
		return getAnonymousClass4Interface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__CheckDEC_BWD__Class_Interface() {
		return getAnonymousClass4Interface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getAnonymousClass4Interface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__GenerateModel_solveCsp_BWD__IsApplicableMatch_Interface_MDefinition_InterfaceDeclaration_ASTNode2Element_ModelgeneratorRuleResult() {
		return getAnonymousClass4Interface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Interface__GenerateModel_checkCsp_BWD__CSP() {
		return getAnonymousClass4Interface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldDec2Property4Class() {
		if (fieldDec2Property4ClassEClass == null) {
			fieldDec2Property4ClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(40);
		}
		return fieldDec2Property4ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsAppropriate_FWD__Match_MFieldDefinition_ClassDeclaration() {
		return getFieldDec2Property4Class().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__Perform_FWD__IsApplicableMatch() {
		return getFieldDec2Property4Class().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsApplicable_FWD__Match() {
		return getFieldDec2Property4Class().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__RegisterObjectsToMatch_FWD__Match_MFieldDefinition_ClassDeclaration() {
		return getFieldDec2Property4Class().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsAppropriate_solveCsp_FWD__Match_MFieldDefinition_ClassDeclaration() {
		return getFieldDec2Property4Class().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldDec2Property4Class().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsApplicable_solveCsp_FWD__IsApplicableMatch_Property_ASTNode2Element_MFieldDefinition_Class_ClassDeclaration_ASTNode2Element() {
		return getFieldDec2Property4Class().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldDec2Property4Class().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldDec2Property4Class().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__CheckTypes_FWD__Match() {
		return getFieldDec2Property4Class().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsAppropriate_BWD__Match_Property_Class() {
		return getFieldDec2Property4Class().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__Perform_BWD__IsApplicableMatch() {
		return getFieldDec2Property4Class().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsApplicable_BWD__Match() {
		return getFieldDec2Property4Class().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__RegisterObjectsToMatch_BWD__Match_Property_Class() {
		return getFieldDec2Property4Class().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsAppropriate_solveCsp_BWD__Match_Property_Class() {
		return getFieldDec2Property4Class().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldDec2Property4Class().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsApplicable_solveCsp_BWD__IsApplicableMatch_Property_ASTNode2Element_MFieldDefinition_Class_ClassDeclaration_ASTNode2Element() {
		return getFieldDec2Property4Class().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldDec2Property4Class().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldDec2Property4Class().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__CheckTypes_BWD__Match() {
		return getFieldDec2Property4Class().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsAppropriate_BWD_EMoflonEdge_117__EMoflonEdge() {
		return getFieldDec2Property4Class().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsAppropriate_FWD_EMoflonEdge_121__EMoflonEdge() {
		return getFieldDec2Property4Class().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__CheckAttributes_FWD__TripleMatch() {
		return getFieldDec2Property4Class().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__CheckAttributes_BWD__TripleMatch() {
		return getFieldDec2Property4Class().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsApplicable_CC__Match_Match() {
		return getFieldDec2Property4Class().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsApplicable_solveCsp_CC__Property_MFieldDefinition_Class_ClassDeclaration_Match_Match() {
		return getFieldDec2Property4Class().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__IsApplicable_checkCsp_CC__CSP() {
		return getFieldDec2Property4Class().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__CheckDEC_FWD__MFieldDefinition_ClassDeclaration() {
		return getFieldDec2Property4Class().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__CheckDEC_BWD__Property_Class() {
		return getFieldDec2Property4Class().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getFieldDec2Property4Class().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__GenerateModel_solveCsp_BWD__IsApplicableMatch_Property_ASTNode2Element_MFieldDefinition_Class_ClassDeclaration_ASTNode2Element_ModelgeneratorRuleResult() {
		return getFieldDec2Property4Class().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Class__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldDec2Property4Class().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedType2Classifier_InnerTypeInClass_Abstract() {
		if (parameterizedType2Classifier_InnerTypeInClass_AbstractEClass == null) {
			parameterizedType2Classifier_InnerTypeInClass_AbstractEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(41);
		}
		return parameterizedType2Classifier_InnerTypeInClass_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceDec2Interface() {
		if (interfaceDec2InterfaceEClass == null) {
			interfaceDec2InterfaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(42);
		}
		return interfaceDec2InterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsAppropriate_FWD__Match_InterfaceDeclaration() {
		return getInterfaceDec2Interface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__Perform_FWD__IsApplicableMatch() {
		return getInterfaceDec2Interface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsApplicable_FWD__Match() {
		return getInterfaceDec2Interface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__RegisterObjectsToMatch_FWD__Match_InterfaceDeclaration() {
		return getInterfaceDec2Interface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsAppropriate_solveCsp_FWD__Match_InterfaceDeclaration() {
		return getInterfaceDec2Interface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsAppropriate_checkCsp_FWD__CSP() {
		return getInterfaceDec2Interface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsApplicable_solveCsp_FWD__IsApplicableMatch_InterfaceDeclaration() {
		return getInterfaceDec2Interface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsApplicable_checkCsp_FWD__CSP() {
		return getInterfaceDec2Interface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getInterfaceDec2Interface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__CheckTypes_FWD__Match() {
		return getInterfaceDec2Interface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsAppropriate_BWD__Match_Interface() {
		return getInterfaceDec2Interface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__Perform_BWD__IsApplicableMatch() {
		return getInterfaceDec2Interface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsApplicable_BWD__Match() {
		return getInterfaceDec2Interface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__RegisterObjectsToMatch_BWD__Match_Interface() {
		return getInterfaceDec2Interface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsAppropriate_solveCsp_BWD__Match_Interface() {
		return getInterfaceDec2Interface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsAppropriate_checkCsp_BWD__CSP() {
		return getInterfaceDec2Interface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsApplicable_solveCsp_BWD__IsApplicableMatch_Interface() {
		return getInterfaceDec2Interface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsApplicable_checkCsp_BWD__CSP() {
		return getInterfaceDec2Interface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getInterfaceDec2Interface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__CheckTypes_BWD__Match() {
		return getInterfaceDec2Interface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsAppropriate_BWD_Interface_1__Interface() {
		return getInterfaceDec2Interface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsAppropriate_FWD_InterfaceDeclaration_0__InterfaceDeclaration() {
		return getInterfaceDec2Interface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__CheckAttributes_FWD__TripleMatch() {
		return getInterfaceDec2Interface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__CheckAttributes_BWD__TripleMatch() {
		return getInterfaceDec2Interface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsApplicable_CC__Match_Match() {
		return getInterfaceDec2Interface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsApplicable_solveCsp_CC__InterfaceDeclaration_Interface_Match_Match() {
		return getInterfaceDec2Interface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__IsApplicable_checkCsp_CC__CSP() {
		return getInterfaceDec2Interface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__CheckDEC_FWD__InterfaceDeclaration() {
		return getInterfaceDec2Interface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__CheckDEC_BWD__Interface() {
		return getInterfaceDec2Interface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__GenerateModel__RuleEntryContainer() {
		return getInterfaceDec2Interface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getInterfaceDec2Interface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDec2Interface__GenerateModel_checkCsp_BWD__CSP() {
		return getInterfaceDec2Interface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationInClass() {
		if (operationInClassEClass == null) {
			operationInClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(43);
		}
		return operationInClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsAppropriate_FWD__Match_ClassDeclaration_MAbstractMethodDefinition() {
		return getOperationInClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__Perform_FWD__IsApplicableMatch() {
		return getOperationInClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsApplicable_FWD__Match() {
		return getOperationInClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__RegisterObjectsToMatch_FWD__Match_ClassDeclaration_MAbstractMethodDefinition() {
		return getOperationInClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsAppropriate_solveCsp_FWD__Match_ClassDeclaration_MAbstractMethodDefinition() {
		return getOperationInClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getOperationInClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_ClassDeclaration_Operation_ASTNode2Element_Class_ASTNode2Element_MAbstractMethodDefinition() {
		return getOperationInClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsApplicable_checkCsp_FWD__CSP() {
		return getOperationInClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getOperationInClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__CheckTypes_FWD__Match() {
		return getOperationInClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsAppropriate_BWD__Match_Operation_Class() {
		return getOperationInClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__Perform_BWD__IsApplicableMatch() {
		return getOperationInClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsApplicable_BWD__Match() {
		return getOperationInClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__RegisterObjectsToMatch_BWD__Match_Operation_Class() {
		return getOperationInClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsAppropriate_solveCsp_BWD__Match_Operation_Class() {
		return getOperationInClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsAppropriate_checkCsp_BWD__CSP() {
		return getOperationInClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_ClassDeclaration_Operation_ASTNode2Element_Class_ASTNode2Element_MAbstractMethodDefinition() {
		return getOperationInClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsApplicable_checkCsp_BWD__CSP() {
		return getOperationInClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getOperationInClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__CheckTypes_BWD__Match() {
		return getOperationInClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsAppropriate_BWD_EMoflonEdge_118__EMoflonEdge() {
		return getOperationInClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsAppropriate_FWD_EMoflonEdge_122__EMoflonEdge() {
		return getOperationInClass().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__CheckAttributes_FWD__TripleMatch() {
		return getOperationInClass().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__CheckAttributes_BWD__TripleMatch() {
		return getOperationInClass().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsApplicable_CC__Match_Match() {
		return getOperationInClass().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsApplicable_solveCsp_CC__ClassDeclaration_Operation_Class_MAbstractMethodDefinition_Match_Match() {
		return getOperationInClass().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__IsApplicable_checkCsp_CC__CSP() {
		return getOperationInClass().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__CheckDEC_FWD__ClassDeclaration_MAbstractMethodDefinition() {
		return getOperationInClass().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__CheckDEC_BWD__Operation_Class() {
		return getOperationInClass().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getOperationInClass().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_ClassDeclaration_Operation_ASTNode2Element_Class_ASTNode2Element_MAbstractMethodDefinition_ModelgeneratorRuleResult() {
		return getOperationInClass().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInClass__GenerateModel_checkCsp_BWD__CSP() {
		return getOperationInClass().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeParameter2Object_InInterface() {
		if (typeParameter2Object_InInterfaceEClass == null) {
			typeParameter2Object_InInterfaceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(44);
		}
		return typeParameter2Object_InInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsAppropriate_FWD__Match_InterfaceDeclaration_TypeParameter() {
		return getTypeParameter2Object_InInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__Perform_FWD__IsApplicableMatch() {
		return getTypeParameter2Object_InInterface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsApplicable_FWD__Match() {
		return getTypeParameter2Object_InInterface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__RegisterObjectsToMatch_FWD__Match_InterfaceDeclaration_TypeParameter() {
		return getTypeParameter2Object_InInterface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsAppropriate_solveCsp_FWD__Match_InterfaceDeclaration_TypeParameter() {
		return getTypeParameter2Object_InInterface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsAppropriate_checkCsp_FWD__CSP() {
		return getTypeParameter2Object_InInterface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsApplicable_solveCsp_FWD__IsApplicableMatch_InterfaceDeclaration_Interface_TypeParameter_ASTNode2Element() {
		return getTypeParameter2Object_InInterface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsApplicable_checkCsp_FWD__CSP() {
		return getTypeParameter2Object_InInterface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeParameter2Object_InInterface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__CheckTypes_FWD__Match() {
		return getTypeParameter2Object_InInterface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsAppropriate_BWD__Match_Interface_Class() {
		return getTypeParameter2Object_InInterface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__Perform_BWD__IsApplicableMatch() {
		return getTypeParameter2Object_InInterface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsApplicable_BWD__Match() {
		return getTypeParameter2Object_InInterface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__RegisterObjectsToMatch_BWD__Match_Interface_Class() {
		return getTypeParameter2Object_InInterface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsAppropriate_solveCsp_BWD__Match_Interface_Class() {
		return getTypeParameter2Object_InInterface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsAppropriate_checkCsp_BWD__CSP() {
		return getTypeParameter2Object_InInterface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsApplicable_solveCsp_BWD__IsApplicableMatch_InterfaceDeclaration_Interface_Class_ASTNode2Element() {
		return getTypeParameter2Object_InInterface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsApplicable_checkCsp_BWD__CSP() {
		return getTypeParameter2Object_InInterface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeParameter2Object_InInterface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__CheckTypes_BWD__Match() {
		return getTypeParameter2Object_InInterface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsAppropriate_BWD_EMoflonEdge_119__EMoflonEdge() {
		return getTypeParameter2Object_InInterface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsAppropriate_FWD_EMoflonEdge_123__EMoflonEdge() {
		return getTypeParameter2Object_InInterface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__CheckAttributes_FWD__TripleMatch() {
		return getTypeParameter2Object_InInterface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__CheckAttributes_BWD__TripleMatch() {
		return getTypeParameter2Object_InInterface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsApplicable_CC__Match_Match() {
		return getTypeParameter2Object_InInterface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsApplicable_solveCsp_CC__InterfaceDeclaration_Interface_Class_TypeParameter_Match_Match() {
		return getTypeParameter2Object_InInterface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__IsApplicable_checkCsp_CC__CSP() {
		return getTypeParameter2Object_InInterface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__CheckDEC_FWD__InterfaceDeclaration_TypeParameter() {
		return getTypeParameter2Object_InInterface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__CheckDEC_BWD__Interface_Class() {
		return getTypeParameter2Object_InInterface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getTypeParameter2Object_InInterface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__GenerateModel_solveCsp_BWD__IsApplicableMatch_InterfaceDeclaration_Interface_ASTNode2Element_ModelgeneratorRuleResult() {
		return getTypeParameter2Object_InInterface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InInterface__GenerateModel_checkCsp_BWD__CSP() {
		return getTypeParameter2Object_InInterface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClass4EnumConstInType() {
		if (anonymousClass4EnumConstInTypeEClass == null) {
			anonymousClass4EnumConstInTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(45);
		}
		return anonymousClass4EnumConstInTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsAppropriate_FWD__Match_AnonymousClassDeclaration_AbstractTypeDeclaration_EnumConstantDeclaration_EnumDeclaration() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__Perform_FWD__IsApplicableMatch() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsApplicable_FWD__Match() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__RegisterObjectsToMatch_FWD__Match_AnonymousClassDeclaration_AbstractTypeDeclaration_EnumConstantDeclaration_EnumDeclaration() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsAppropriate_solveCsp_FWD__Match_AnonymousClassDeclaration_AbstractTypeDeclaration_EnumConstantDeclaration_EnumDeclaration() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsApplicable_solveCsp_FWD__IsApplicableMatch_AnonymousClassDeclaration_Class_Enumeration_AbstractTypeDeclaration_EnumConstantDeclaration_EnumDeclaration_ASTNode2Element_ASTNode2Element() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsApplicable_checkCsp_FWD__CSP() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__CheckTypes_FWD__Match() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsAppropriate_BWD__Match_Class_Class_Enumeration() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__Perform_BWD__IsApplicableMatch() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsApplicable_BWD__Match() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__RegisterObjectsToMatch_BWD__Match_Class_Class_Enumeration() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsAppropriate_solveCsp_BWD__Match_Class_Class_Enumeration() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsApplicable_solveCsp_BWD__IsApplicableMatch_Class_Class_Enumeration_AbstractTypeDeclaration_EnumConstantDeclaration_EnumDeclaration_ASTNode2Element_ASTNode2Element() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsApplicable_checkCsp_BWD__CSP() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__CheckTypes_BWD__Match() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsAppropriate_BWD_EMoflonEdge_120__EMoflonEdge() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsAppropriate_FWD_EMoflonEdge_124__EMoflonEdge() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__CheckAttributes_FWD__TripleMatch() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__CheckAttributes_BWD__TripleMatch() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsApplicable_CC__Match_Match() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsApplicable_solveCsp_CC__Class_AnonymousClassDeclaration_Class_Enumeration_AbstractTypeDeclaration_EnumConstantDeclaration_EnumDeclaration_Match_Match() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__IsApplicable_checkCsp_CC__CSP() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__CheckDEC_FWD__AnonymousClassDeclaration_AbstractTypeDeclaration_EnumConstantDeclaration_EnumDeclaration() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__CheckDEC_BWD__Class_Class_Enumeration() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__GenerateModel_solveCsp_BWD__IsApplicableMatch_Class_Enumeration_AbstractTypeDeclaration_EnumConstantDeclaration_EnumDeclaration_ASTNode2Element_ASTNode2Element_ModelgeneratorRuleResult() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4EnumConstInType__GenerateModel_checkCsp_BWD__CSP() {
		return getAnonymousClass4EnumConstInType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumDecWithModifier2Enum() {
		if (enumDecWithModifier2EnumEClass == null) {
			enumDecWithModifier2EnumEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(46);
		}
		return enumDecWithModifier2EnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsAppropriate_FWD__Match_EnumDeclaration_Modifier() {
		return getEnumDecWithModifier2Enum().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__Perform_FWD__IsApplicableMatch() {
		return getEnumDecWithModifier2Enum().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsApplicable_FWD__Match() {
		return getEnumDecWithModifier2Enum().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__RegisterObjectsToMatch_FWD__Match_EnumDeclaration_Modifier() {
		return getEnumDecWithModifier2Enum().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsAppropriate_solveCsp_FWD__Match_EnumDeclaration_Modifier() {
		return getEnumDecWithModifier2Enum().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsAppropriate_checkCsp_FWD__CSP() {
		return getEnumDecWithModifier2Enum().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsApplicable_solveCsp_FWD__IsApplicableMatch_EnumDeclaration_Modifier() {
		return getEnumDecWithModifier2Enum().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsApplicable_checkCsp_FWD__CSP() {
		return getEnumDecWithModifier2Enum().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject() {
		return getEnumDecWithModifier2Enum().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__CheckTypes_FWD__Match() {
		return getEnumDecWithModifier2Enum().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsAppropriate_BWD__Match_Enumeration() {
		return getEnumDecWithModifier2Enum().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__Perform_BWD__IsApplicableMatch() {
		return getEnumDecWithModifier2Enum().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsApplicable_BWD__Match() {
		return getEnumDecWithModifier2Enum().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__RegisterObjectsToMatch_BWD__Match_Enumeration() {
		return getEnumDecWithModifier2Enum().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsAppropriate_solveCsp_BWD__Match_Enumeration() {
		return getEnumDecWithModifier2Enum().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsAppropriate_checkCsp_BWD__CSP() {
		return getEnumDecWithModifier2Enum().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsApplicable_solveCsp_BWD__IsApplicableMatch_Enumeration() {
		return getEnumDecWithModifier2Enum().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsApplicable_checkCsp_BWD__CSP() {
		return getEnumDecWithModifier2Enum().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject() {
		return getEnumDecWithModifier2Enum().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__CheckTypes_BWD__Match() {
		return getEnumDecWithModifier2Enum().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsAppropriate_BWD_Enumeration_1__Enumeration() {
		return getEnumDecWithModifier2Enum().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsAppropriate_FWD_EMoflonEdge_125__EMoflonEdge() {
		return getEnumDecWithModifier2Enum().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__CheckAttributes_FWD__TripleMatch() {
		return getEnumDecWithModifier2Enum().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__CheckAttributes_BWD__TripleMatch() {
		return getEnumDecWithModifier2Enum().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsApplicable_CC__Match_Match() {
		return getEnumDecWithModifier2Enum().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsApplicable_solveCsp_CC__Enumeration_EnumDeclaration_Modifier_Match_Match() {
		return getEnumDecWithModifier2Enum().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__IsApplicable_checkCsp_CC__CSP() {
		return getEnumDecWithModifier2Enum().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__CheckDEC_FWD__EnumDeclaration_Modifier() {
		return getEnumDecWithModifier2Enum().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__CheckDEC_BWD__Enumeration() {
		return getEnumDecWithModifier2Enum().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__GenerateModel__RuleEntryContainer() {
		return getEnumDecWithModifier2Enum().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getEnumDecWithModifier2Enum().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumDecWithModifier2Enum__GenerateModel_checkCsp_BWD__CSP() {
		return getEnumDecWithModifier2Enum().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedType2Class() {
		if (parameterizedType2ClassEClass == null) {
			parameterizedType2ClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(47);
		}
		return parameterizedType2ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsAppropriate_FWD__Match_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Class().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__Perform_FWD__IsApplicableMatch() {
		return getParameterizedType2Class().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsApplicable_FWD__Match() {
		return getParameterizedType2Class().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__RegisterObjectsToMatch_FWD__Match_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Class().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsAppropriate_solveCsp_FWD__Match_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Class().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsAppropriate_checkCsp_FWD__CSP() {
		return getParameterizedType2Class().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsApplicable_solveCsp_FWD__IsApplicableMatch_Package_Class_ASTNode2Element_AbstractTypeDeclaration_Package_ParameterizedType_JavaPackage2UmlPackage_TypeAccess() {
		return getParameterizedType2Class().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsApplicable_checkCsp_FWD__CSP() {
		return getParameterizedType2Class().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterizedType2Class().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__CheckTypes_FWD__Match() {
		return getParameterizedType2Class().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsAppropriate_BWD__Match_Package_Class_Class() {
		return getParameterizedType2Class().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__Perform_BWD__IsApplicableMatch() {
		return getParameterizedType2Class().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsApplicable_BWD__Match() {
		return getParameterizedType2Class().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__RegisterObjectsToMatch_BWD__Match_Package_Class_Class() {
		return getParameterizedType2Class().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsAppropriate_solveCsp_BWD__Match_Package_Class_Class() {
		return getParameterizedType2Class().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsAppropriate_checkCsp_BWD__CSP() {
		return getParameterizedType2Class().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsApplicable_solveCsp_BWD__IsApplicableMatch_Package_Class_ASTNode2Element_Class_AbstractTypeDeclaration_Package_JavaPackage2UmlPackage() {
		return getParameterizedType2Class().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsApplicable_checkCsp_BWD__CSP() {
		return getParameterizedType2Class().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterizedType2Class().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__CheckTypes_BWD__Match() {
		return getParameterizedType2Class().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsAppropriate_BWD_EMoflonEdge_121__EMoflonEdge() {
		return getParameterizedType2Class().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsAppropriate_FWD_EMoflonEdge_126__EMoflonEdge() {
		return getParameterizedType2Class().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__CheckAttributes_FWD__TripleMatch() {
		return getParameterizedType2Class().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__CheckAttributes_BWD__TripleMatch() {
		return getParameterizedType2Class().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsApplicable_CC__Match_Match() {
		return getParameterizedType2Class().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsApplicable_solveCsp_CC__Package_Class_Class_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess_Match_Match() {
		return getParameterizedType2Class().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__IsApplicable_checkCsp_CC__CSP() {
		return getParameterizedType2Class().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__CheckDEC_FWD__AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Class().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__CheckDEC_BWD__Package_Class_Class() {
		return getParameterizedType2Class().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getParameterizedType2Class().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__GenerateModel_solveCsp_BWD__IsApplicableMatch_Package_Class_ASTNode2Element_AbstractTypeDeclaration_Package_JavaPackage2UmlPackage_ModelgeneratorRuleResult() {
		return getParameterizedType2Class().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class__GenerateModel_checkCsp_BWD__CSP() {
		return getParameterizedType2Class().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldDec2Property4Enum() {
		if (fieldDec2Property4EnumEClass == null) {
			fieldDec2Property4EnumEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(48);
		}
		return fieldDec2Property4EnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsAppropriate_FWD__Match_MFieldDefinition_EnumDeclaration() {
		return getFieldDec2Property4Enum().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__Perform_FWD__IsApplicableMatch() {
		return getFieldDec2Property4Enum().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsApplicable_FWD__Match() {
		return getFieldDec2Property4Enum().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__RegisterObjectsToMatch_FWD__Match_MFieldDefinition_EnumDeclaration() {
		return getFieldDec2Property4Enum().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsAppropriate_solveCsp_FWD__Match_MFieldDefinition_EnumDeclaration() {
		return getFieldDec2Property4Enum().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldDec2Property4Enum().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsApplicable_solveCsp_FWD__IsApplicableMatch_MFieldDefinition_Enumeration_Property_ASTNode2Element_EnumDeclaration_ASTNode2Element() {
		return getFieldDec2Property4Enum().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldDec2Property4Enum().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldDec2Property4Enum().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__CheckTypes_FWD__Match() {
		return getFieldDec2Property4Enum().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsAppropriate_BWD__Match_Enumeration_Property() {
		return getFieldDec2Property4Enum().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__Perform_BWD__IsApplicableMatch() {
		return getFieldDec2Property4Enum().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsApplicable_BWD__Match() {
		return getFieldDec2Property4Enum().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__RegisterObjectsToMatch_BWD__Match_Enumeration_Property() {
		return getFieldDec2Property4Enum().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsAppropriate_solveCsp_BWD__Match_Enumeration_Property() {
		return getFieldDec2Property4Enum().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldDec2Property4Enum().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsApplicable_solveCsp_BWD__IsApplicableMatch_MFieldDefinition_Enumeration_Property_ASTNode2Element_EnumDeclaration_ASTNode2Element() {
		return getFieldDec2Property4Enum().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldDec2Property4Enum().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldDec2Property4Enum().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__CheckTypes_BWD__Match() {
		return getFieldDec2Property4Enum().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsAppropriate_BWD_EMoflonEdge_122__EMoflonEdge() {
		return getFieldDec2Property4Enum().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsAppropriate_FWD_EMoflonEdge_127__EMoflonEdge() {
		return getFieldDec2Property4Enum().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__CheckAttributes_FWD__TripleMatch() {
		return getFieldDec2Property4Enum().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__CheckAttributes_BWD__TripleMatch() {
		return getFieldDec2Property4Enum().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsApplicable_CC__Match_Match() {
		return getFieldDec2Property4Enum().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsApplicable_solveCsp_CC__MFieldDefinition_Enumeration_Property_EnumDeclaration_Match_Match() {
		return getFieldDec2Property4Enum().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__IsApplicable_checkCsp_CC__CSP() {
		return getFieldDec2Property4Enum().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__CheckDEC_FWD__MFieldDefinition_EnumDeclaration() {
		return getFieldDec2Property4Enum().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__CheckDEC_BWD__Enumeration_Property() {
		return getFieldDec2Property4Enum().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getFieldDec2Property4Enum().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__GenerateModel_solveCsp_BWD__IsApplicableMatch_MFieldDefinition_Enumeration_Property_ASTNode2Element_EnumDeclaration_ASTNode2Element_ModelgeneratorRuleResult() {
		return getFieldDec2Property4Enum().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4Enum__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldDec2Property4Enum().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeFloat() {
		if (primitiveTypeFloatEClass == null) {
			primitiveTypeFloatEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(49);
		}
		return primitiveTypeFloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsAppropriate_FWD__Match_PrimitiveTypeFloat() {
		return getPrimitiveTypeFloat().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeFloat().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsApplicable_FWD__Match() {
		return getPrimitiveTypeFloat().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeFloat() {
		return getPrimitiveTypeFloat().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeFloat() {
		return getPrimitiveTypeFloat().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeFloat().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeFloat() {
		return getPrimitiveTypeFloat().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeFloat().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeFloat().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__CheckTypes_FWD__Match() {
		return getPrimitiveTypeFloat().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsAppropriate_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeFloat().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeFloat().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsApplicable_BWD__Match() {
		return getPrimitiveTypeFloat().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__RegisterObjectsToMatch_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeFloat().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsAppropriate_solveCsp_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeFloat().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeFloat().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsApplicable_solveCsp_BWD__IsApplicableMatch_PrimitiveType() {
		return getPrimitiveTypeFloat().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeFloat().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeFloat().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__CheckTypes_BWD__Match() {
		return getPrimitiveTypeFloat().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsAppropriate_BWD_PrimitiveType_3__PrimitiveType() {
		return getPrimitiveTypeFloat().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsAppropriate_FWD_PrimitiveTypeFloat_0__PrimitiveTypeFloat() {
		return getPrimitiveTypeFloat().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeFloat().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeFloat().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeFloat().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsApplicable_solveCsp_CC__PrimitiveType_PrimitiveTypeFloat_Match_Match() {
		return getPrimitiveTypeFloat().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeFloat().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__CheckDEC_FWD__PrimitiveTypeFloat() {
		return getPrimitiveTypeFloat().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__CheckDEC_BWD__PrimitiveType() {
		return getPrimitiveTypeFloat().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__GenerateModel__RuleEntryContainer() {
		return getPrimitiveTypeFloat().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getPrimitiveTypeFloat().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeFloat__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeFloat().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceDecWithModifier2Interface() {
		if (interfaceDecWithModifier2InterfaceEClass == null) {
			interfaceDecWithModifier2InterfaceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(50);
		}
		return interfaceDecWithModifier2InterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsAppropriate_FWD__Match_InterfaceDeclaration_Modifier() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__Perform_FWD__IsApplicableMatch() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsApplicable_FWD__Match() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__RegisterObjectsToMatch_FWD__Match_InterfaceDeclaration_Modifier() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsAppropriate_solveCsp_FWD__Match_InterfaceDeclaration_Modifier() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsAppropriate_checkCsp_FWD__CSP() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsApplicable_solveCsp_FWD__IsApplicableMatch_InterfaceDeclaration_Modifier() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsApplicable_checkCsp_FWD__CSP() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__CheckTypes_FWD__Match() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsAppropriate_BWD__Match_Interface() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__Perform_BWD__IsApplicableMatch() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsApplicable_BWD__Match() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__RegisterObjectsToMatch_BWD__Match_Interface() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsAppropriate_solveCsp_BWD__Match_Interface() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsAppropriate_checkCsp_BWD__CSP() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsApplicable_solveCsp_BWD__IsApplicableMatch_Interface() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsApplicable_checkCsp_BWD__CSP() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__CheckTypes_BWD__Match() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsAppropriate_BWD_Interface_2__Interface() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsAppropriate_FWD_EMoflonEdge_128__EMoflonEdge() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__CheckAttributes_FWD__TripleMatch() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__CheckAttributes_BWD__TripleMatch() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsApplicable_CC__Match_Match() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsApplicable_solveCsp_CC__Interface_InterfaceDeclaration_Modifier_Match_Match() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__IsApplicable_checkCsp_CC__CSP() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__CheckDEC_FWD__InterfaceDeclaration_Modifier() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__CheckDEC_BWD__Interface() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__GenerateModel__RuleEntryContainer() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceDecWithModifier2Interface__GenerateModel_checkCsp_BWD__CSP() {
		return getInterfaceDecWithModifier2Interface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassDec2Class() {
		if (classDec2ClassEClass == null) {
			classDec2ClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(51);
		}
		return classDec2ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsAppropriate_FWD__Match_MClass() {
		return getClassDec2Class().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__Perform_FWD__IsApplicableMatch() {
		return getClassDec2Class().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsApplicable_FWD__Match() {
		return getClassDec2Class().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__RegisterObjectsToMatch_FWD__Match_MClass() {
		return getClassDec2Class().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsAppropriate_solveCsp_FWD__Match_MClass() {
		return getClassDec2Class().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsAppropriate_checkCsp_FWD__CSP() {
		return getClassDec2Class().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsApplicable_solveCsp_FWD__IsApplicableMatch_MClass() {
		return getClassDec2Class().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsApplicable_checkCsp_FWD__CSP() {
		return getClassDec2Class().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getClassDec2Class().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__CheckTypes_FWD__Match() {
		return getClassDec2Class().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsAppropriate_BWD__Match_Class() {
		return getClassDec2Class().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__Perform_BWD__IsApplicableMatch() {
		return getClassDec2Class().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsApplicable_BWD__Match() {
		return getClassDec2Class().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__RegisterObjectsToMatch_BWD__Match_Class() {
		return getClassDec2Class().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsAppropriate_solveCsp_BWD__Match_Class() {
		return getClassDec2Class().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsAppropriate_checkCsp_BWD__CSP() {
		return getClassDec2Class().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsApplicable_solveCsp_BWD__IsApplicableMatch_Class() {
		return getClassDec2Class().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsApplicable_checkCsp_BWD__CSP() {
		return getClassDec2Class().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getClassDec2Class().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__CheckTypes_BWD__Match() {
		return getClassDec2Class().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsAppropriate_BWD_Class_1__Class() {
		return getClassDec2Class().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsAppropriate_FWD_MClass_0__MClass() {
		return getClassDec2Class().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__CheckAttributes_FWD__TripleMatch() {
		return getClassDec2Class().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__CheckAttributes_BWD__TripleMatch() {
		return getClassDec2Class().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsApplicable_CC__Match_Match() {
		return getClassDec2Class().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsApplicable_solveCsp_CC__Class_MClass_Match_Match() {
		return getClassDec2Class().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__IsApplicable_checkCsp_CC__CSP() {
		return getClassDec2Class().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__CheckDEC_FWD__MClass() {
		return getClassDec2Class().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__CheckDEC_BWD__Class() {
		return getClassDec2Class().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__GenerateModel__RuleEntryContainer() {
		return getClassDec2Class().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getClassDec2Class().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassDec2Class__GenerateModel_checkCsp_BWD__CSP() {
		return getClassDec2Class().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeParameter2Object_InClass() {
		if (typeParameter2Object_InClassEClass == null) {
			typeParameter2Object_InClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(52);
		}
		return typeParameter2Object_InClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsAppropriate_FWD__Match_ClassDeclaration_TypeParameter() {
		return getTypeParameter2Object_InClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__Perform_FWD__IsApplicableMatch() {
		return getTypeParameter2Object_InClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsApplicable_FWD__Match() {
		return getTypeParameter2Object_InClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__RegisterObjectsToMatch_FWD__Match_ClassDeclaration_TypeParameter() {
		return getTypeParameter2Object_InClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsAppropriate_solveCsp_FWD__Match_ClassDeclaration_TypeParameter() {
		return getTypeParameter2Object_InClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getTypeParameter2Object_InClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_ClassDeclaration_Class_TypeParameter_ASTNode2Element() {
		return getTypeParameter2Object_InClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsApplicable_checkCsp_FWD__CSP() {
		return getTypeParameter2Object_InClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeParameter2Object_InClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__CheckTypes_FWD__Match() {
		return getTypeParameter2Object_InClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsAppropriate_BWD__Match_Class_Class() {
		return getTypeParameter2Object_InClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__Perform_BWD__IsApplicableMatch() {
		return getTypeParameter2Object_InClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsApplicable_BWD__Match() {
		return getTypeParameter2Object_InClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__RegisterObjectsToMatch_BWD__Match_Class_Class() {
		return getTypeParameter2Object_InClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsAppropriate_solveCsp_BWD__Match_Class_Class() {
		return getTypeParameter2Object_InClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsAppropriate_checkCsp_BWD__CSP() {
		return getTypeParameter2Object_InClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_ClassDeclaration_Class_Class_ASTNode2Element() {
		return getTypeParameter2Object_InClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsApplicable_checkCsp_BWD__CSP() {
		return getTypeParameter2Object_InClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeParameter2Object_InClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__CheckTypes_BWD__Match() {
		return getTypeParameter2Object_InClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsAppropriate_BWD_EMoflonEdge_123__EMoflonEdge() {
		return getTypeParameter2Object_InClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsAppropriate_FWD_EMoflonEdge_129__EMoflonEdge() {
		return getTypeParameter2Object_InClass().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__CheckAttributes_FWD__TripleMatch() {
		return getTypeParameter2Object_InClass().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__CheckAttributes_BWD__TripleMatch() {
		return getTypeParameter2Object_InClass().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsApplicable_CC__Match_Match() {
		return getTypeParameter2Object_InClass().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsApplicable_solveCsp_CC__ClassDeclaration_Class_Class_TypeParameter_Match_Match() {
		return getTypeParameter2Object_InClass().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__IsApplicable_checkCsp_CC__CSP() {
		return getTypeParameter2Object_InClass().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__CheckDEC_FWD__ClassDeclaration_TypeParameter() {
		return getTypeParameter2Object_InClass().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__CheckDEC_BWD__Class_Class() {
		return getTypeParameter2Object_InClass().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getTypeParameter2Object_InClass().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_ClassDeclaration_Class_ASTNode2Element_ModelgeneratorRuleResult() {
		return getTypeParameter2Object_InClass().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InClass__GenerateModel_checkCsp_BWD__CSP() {
		return getTypeParameter2Object_InClass().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeAccess2Generalization() {
		if (typeAccess2GeneralizationEClass == null) {
			typeAccess2GeneralizationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(53);
		}
		return typeAccess2GeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsAppropriate_FWD__Match_TypeAccess_ClassDeclaration_Type() {
		return getTypeAccess2Generalization().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__Perform_FWD__IsApplicableMatch() {
		return getTypeAccess2Generalization().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsApplicable_FWD__Match() {
		return getTypeAccess2Generalization().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__RegisterObjectsToMatch_FWD__Match_TypeAccess_ClassDeclaration_Type() {
		return getTypeAccess2Generalization().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsAppropriate_solveCsp_FWD__Match_TypeAccess_ClassDeclaration_Type() {
		return getTypeAccess2Generalization().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsAppropriate_checkCsp_FWD__CSP() {
		return getTypeAccess2Generalization().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeAccess_Classifier_ClassDeclaration_Class_ASTNode2Element_Type_ASTNode2Element() {
		return getTypeAccess2Generalization().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsApplicable_checkCsp_FWD__CSP() {
		return getTypeAccess2Generalization().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeAccess2Generalization().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__CheckTypes_FWD__Match() {
		return getTypeAccess2Generalization().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsAppropriate_BWD__Match_Classifier_Class_Generalization() {
		return getTypeAccess2Generalization().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__Perform_BWD__IsApplicableMatch() {
		return getTypeAccess2Generalization().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsApplicable_BWD__Match() {
		return getTypeAccess2Generalization().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__RegisterObjectsToMatch_BWD__Match_Classifier_Class_Generalization() {
		return getTypeAccess2Generalization().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsAppropriate_solveCsp_BWD__Match_Classifier_Class_Generalization() {
		return getTypeAccess2Generalization().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsAppropriate_checkCsp_BWD__CSP() {
		return getTypeAccess2Generalization().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsApplicable_solveCsp_BWD__IsApplicableMatch_Classifier_ClassDeclaration_Class_ASTNode2Element_Generalization_Type_ASTNode2Element() {
		return getTypeAccess2Generalization().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsApplicable_checkCsp_BWD__CSP() {
		return getTypeAccess2Generalization().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeAccess2Generalization().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__CheckTypes_BWD__Match() {
		return getTypeAccess2Generalization().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsAppropriate_BWD_EMoflonEdge_124__EMoflonEdge() {
		return getTypeAccess2Generalization().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsAppropriate_FWD_EMoflonEdge_130__EMoflonEdge() {
		return getTypeAccess2Generalization().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__CheckAttributes_FWD__TripleMatch() {
		return getTypeAccess2Generalization().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__CheckAttributes_BWD__TripleMatch() {
		return getTypeAccess2Generalization().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsApplicable_CC__Match_Match() {
		return getTypeAccess2Generalization().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsApplicable_solveCsp_CC__TypeAccess_Classifier_ClassDeclaration_Class_Generalization_Type_Match_Match() {
		return getTypeAccess2Generalization().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__IsApplicable_checkCsp_CC__CSP() {
		return getTypeAccess2Generalization().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__CheckDEC_FWD__TypeAccess_ClassDeclaration_Type() {
		return getTypeAccess2Generalization().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__CheckDEC_BWD__Classifier_Class_Generalization() {
		return getTypeAccess2Generalization().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getTypeAccess2Generalization().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__GenerateModel_solveCsp_BWD__IsApplicableMatch_Classifier_ClassDeclaration_Class_ASTNode2Element_Type_ASTNode2Element_ModelgeneratorRuleResult() {
		return getTypeAccess2Generalization().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2Generalization__GenerateModel_checkCsp_BWD__CSP() {
		return getTypeAccess2Generalization().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeChar() {
		if (primitiveTypeCharEClass == null) {
			primitiveTypeCharEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(54);
		}
		return primitiveTypeCharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsAppropriate_FWD__Match_PrimitiveTypeChar() {
		return getPrimitiveTypeChar().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeChar().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsApplicable_FWD__Match() {
		return getPrimitiveTypeChar().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeChar() {
		return getPrimitiveTypeChar().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeChar() {
		return getPrimitiveTypeChar().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeChar().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeChar() {
		return getPrimitiveTypeChar().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeChar().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeChar().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__CheckTypes_FWD__Match() {
		return getPrimitiveTypeChar().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsAppropriate_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeChar().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeChar().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsApplicable_BWD__Match() {
		return getPrimitiveTypeChar().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__RegisterObjectsToMatch_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeChar().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsAppropriate_solveCsp_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeChar().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeChar().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsApplicable_solveCsp_BWD__IsApplicableMatch_PrimitiveType() {
		return getPrimitiveTypeChar().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeChar().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeChar().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__CheckTypes_BWD__Match() {
		return getPrimitiveTypeChar().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsAppropriate_BWD_PrimitiveType_4__PrimitiveType() {
		return getPrimitiveTypeChar().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsAppropriate_FWD_PrimitiveTypeChar_0__PrimitiveTypeChar() {
		return getPrimitiveTypeChar().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeChar().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeChar().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeChar().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsApplicable_solveCsp_CC__PrimitiveType_PrimitiveTypeChar_Match_Match() {
		return getPrimitiveTypeChar().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeChar().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__CheckDEC_FWD__PrimitiveTypeChar() {
		return getPrimitiveTypeChar().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__CheckDEC_BWD__PrimitiveType() {
		return getPrimitiveTypeChar().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__GenerateModel__RuleEntryContainer() {
		return getPrimitiveTypeChar().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getPrimitiveTypeChar().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeChar__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeChar().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationInAnonymous() {
		if (operationInAnonymousEClass == null) {
			operationInAnonymousEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(55);
		}
		return operationInAnonymousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsAppropriate_FWD__Match_MAbstractMethodDefinition_AnonymousClassDeclaration() {
		return getOperationInAnonymous().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__Perform_FWD__IsApplicableMatch() {
		return getOperationInAnonymous().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsApplicable_FWD__Match() {
		return getOperationInAnonymous().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__RegisterObjectsToMatch_FWD__Match_MAbstractMethodDefinition_AnonymousClassDeclaration() {
		return getOperationInAnonymous().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsAppropriate_solveCsp_FWD__Match_MAbstractMethodDefinition_AnonymousClassDeclaration() {
		return getOperationInAnonymous().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsAppropriate_checkCsp_FWD__CSP() {
		return getOperationInAnonymous().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsApplicable_solveCsp_FWD__IsApplicableMatch_ASTNode2Element_ASTNode2Element_Class_Operation_MAbstractMethodDefinition_AnonymousClassDeclaration() {
		return getOperationInAnonymous().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsApplicable_checkCsp_FWD__CSP() {
		return getOperationInAnonymous().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getOperationInAnonymous().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__CheckTypes_FWD__Match() {
		return getOperationInAnonymous().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsAppropriate_BWD__Match_Class_Operation() {
		return getOperationInAnonymous().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__Perform_BWD__IsApplicableMatch() {
		return getOperationInAnonymous().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsApplicable_BWD__Match() {
		return getOperationInAnonymous().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__RegisterObjectsToMatch_BWD__Match_Class_Operation() {
		return getOperationInAnonymous().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsAppropriate_solveCsp_BWD__Match_Class_Operation() {
		return getOperationInAnonymous().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsAppropriate_checkCsp_BWD__CSP() {
		return getOperationInAnonymous().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsApplicable_solveCsp_BWD__IsApplicableMatch_ASTNode2Element_ASTNode2Element_Class_Operation_MAbstractMethodDefinition_AnonymousClassDeclaration() {
		return getOperationInAnonymous().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsApplicable_checkCsp_BWD__CSP() {
		return getOperationInAnonymous().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getOperationInAnonymous().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__CheckTypes_BWD__Match() {
		return getOperationInAnonymous().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsAppropriate_BWD_EMoflonEdge_125__EMoflonEdge() {
		return getOperationInAnonymous().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsAppropriate_FWD_EMoflonEdge_131__EMoflonEdge() {
		return getOperationInAnonymous().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__CheckAttributes_FWD__TripleMatch() {
		return getOperationInAnonymous().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__CheckAttributes_BWD__TripleMatch() {
		return getOperationInAnonymous().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsApplicable_CC__Match_Match() {
		return getOperationInAnonymous().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsApplicable_solveCsp_CC__Class_Operation_MAbstractMethodDefinition_AnonymousClassDeclaration_Match_Match() {
		return getOperationInAnonymous().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__IsApplicable_checkCsp_CC__CSP() {
		return getOperationInAnonymous().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__CheckDEC_FWD__MAbstractMethodDefinition_AnonymousClassDeclaration() {
		return getOperationInAnonymous().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__CheckDEC_BWD__Class_Operation() {
		return getOperationInAnonymous().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getOperationInAnonymous().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__GenerateModel_solveCsp_BWD__IsApplicableMatch_ASTNode2Element_ASTNode2Element_Class_Operation_MAbstractMethodDefinition_AnonymousClassDeclaration_ModelgeneratorRuleResult() {
		return getOperationInAnonymous().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInAnonymous__GenerateModel_checkCsp_BWD__CSP() {
		return getOperationInAnonymous().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIgnoreOrphanTypesEdge() {
		if (ignoreOrphanTypesEdgeEClass == null) {
			ignoreOrphanTypesEdgeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(56);
		}
		return ignoreOrphanTypesEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__IsAppropriate_FWD__Match_Model_ParameterizedType() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__Perform_FWD__IsApplicableMatch() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__IsApplicable_FWD__Match() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__RegisterObjectsToMatch_FWD__Match_Model_ParameterizedType() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__IsAppropriate_solveCsp_FWD__Match_Model_ParameterizedType() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__IsAppropriate_checkCsp_FWD__CSP() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__IsApplicable_solveCsp_FWD__IsApplicableMatch_Model_ParameterizedType() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__IsApplicable_checkCsp_FWD__CSP() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__RegisterObjects_FWD__PerformRuleResult_EObject_EObject() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__CheckTypes_FWD__Match() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__IsAppropriate_BWD__Match() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__Perform_BWD__IsApplicableMatch() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__IsApplicable_BWD__Match() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__RegisterObjectsToMatch_BWD__Match() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__IsAppropriate_solveCsp_BWD__Match() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__IsAppropriate_checkCsp_BWD__CSP() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__CheckTypes_BWD__Match() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__IsAppropriate_FWD_EMoflonEdge_132__EMoflonEdge() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__CheckAttributes_FWD__TripleMatch() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__CheckAttributes_BWD__TripleMatch() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__IsApplicable_CC__Match_Match() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__IsApplicable_solveCsp_CC__Model_ParameterizedType_Match_Match() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__IsApplicable_checkCsp_CC__CSP() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__CheckDEC_FWD__Model_ParameterizedType() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__CheckDEC_BWD() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__GenerateModel__RuleEntryContainer_Model_ParameterizedType() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__GenerateModel_solveCsp_BWD__IsApplicableMatch_Model_ParameterizedType_ModelgeneratorRuleResult() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreOrphanTypesEdge__GenerateModel_checkCsp_BWD__CSP() {
		return getIgnoreOrphanTypesEdge().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInnerDeclaration2InnerClassifier_InAnnotationType() {
		if (innerDeclaration2InnerClassifier_InAnnotationTypeEClass == null) {
			innerDeclaration2InnerClassifier_InAnnotationTypeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(57);
		}
		return innerDeclaration2InnerClassifier_InAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsAppropriate_FWD__Match_AbstractTypeDeclaration_AnnotationTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__Perform_FWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsApplicable_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__RegisterObjectsToMatch_FWD__Match_AbstractTypeDeclaration_AnnotationTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsAppropriate_solveCsp_FWD__Match_AbstractTypeDeclaration_AnnotationTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsAppropriate_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsApplicable_solveCsp_FWD__IsApplicableMatch_Classifier_ASTNode2Element_AbstractTypeDeclaration_Interface_AnnotationTypeDeclaration_ASTNode2Element() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsApplicable_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__CheckTypes_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsAppropriate_BWD__Match_Classifier_Interface() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__Perform_BWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsApplicable_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__RegisterObjectsToMatch_BWD__Match_Classifier_Interface() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsAppropriate_solveCsp_BWD__Match_Classifier_Interface() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsAppropriate_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsApplicable_solveCsp_BWD__IsApplicableMatch_Classifier_ASTNode2Element_AbstractTypeDeclaration_Interface_AnnotationTypeDeclaration_ASTNode2Element() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsApplicable_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__CheckTypes_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsAppropriate_BWD_EMoflonEdge_126__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsAppropriate_FWD_EMoflonEdge_133__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__CheckAttributes_FWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__CheckAttributes_BWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsApplicable_CC__Match_Match() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsApplicable_solveCsp_CC__Classifier_AbstractTypeDeclaration_Interface_AnnotationTypeDeclaration_Match_Match() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__IsApplicable_checkCsp_CC__CSP() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__CheckDEC_FWD__AbstractTypeDeclaration_AnnotationTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__CheckDEC_BWD__Classifier_Interface() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__GenerateModel_solveCsp_BWD__IsApplicableMatch_Classifier_ASTNode2Element_AbstractTypeDeclaration_Interface_AnnotationTypeDeclaration_ASTNode2Element_ModelgeneratorRuleResult() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InAnnotationType__GenerateModel_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InAnnotationType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompilationUnit2Artifact() {
		if (compilationUnit2ArtifactEClass == null) {
			compilationUnit2ArtifactEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(58);
		}
		return compilationUnit2ArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsAppropriate_FWD__Match_CompilationUnit_Model() {
		return getCompilationUnit2Artifact().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__Perform_FWD__IsApplicableMatch() {
		return getCompilationUnit2Artifact().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsApplicable_FWD__Match() {
		return getCompilationUnit2Artifact().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__RegisterObjectsToMatch_FWD__Match_CompilationUnit_Model() {
		return getCompilationUnit2Artifact().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsAppropriate_solveCsp_FWD__Match_CompilationUnit_Model() {
		return getCompilationUnit2Artifact().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsAppropriate_checkCsp_FWD__CSP() {
		return getCompilationUnit2Artifact().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsApplicable_solveCsp_FWD__IsApplicableMatch_JavaModel2UMLPackage_CompilationUnit_Model_Model() {
		return getCompilationUnit2Artifact().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsApplicable_checkCsp_FWD__CSP() {
		return getCompilationUnit2Artifact().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getCompilationUnit2Artifact().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__CheckTypes_FWD__Match() {
		return getCompilationUnit2Artifact().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsAppropriate_BWD__Match_Artifact_Model() {
		return getCompilationUnit2Artifact().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__Perform_BWD__IsApplicableMatch() {
		return getCompilationUnit2Artifact().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsApplicable_BWD__Match() {
		return getCompilationUnit2Artifact().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__RegisterObjectsToMatch_BWD__Match_Artifact_Model() {
		return getCompilationUnit2Artifact().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsAppropriate_solveCsp_BWD__Match_Artifact_Model() {
		return getCompilationUnit2Artifact().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsAppropriate_checkCsp_BWD__CSP() {
		return getCompilationUnit2Artifact().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaModel2UMLPackage_Artifact_Model_Model() {
		return getCompilationUnit2Artifact().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsApplicable_checkCsp_BWD__CSP() {
		return getCompilationUnit2Artifact().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getCompilationUnit2Artifact().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__CheckTypes_BWD__Match() {
		return getCompilationUnit2Artifact().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsAppropriate_BWD_EMoflonEdge_127__EMoflonEdge() {
		return getCompilationUnit2Artifact().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsAppropriate_FWD_EMoflonEdge_134__EMoflonEdge() {
		return getCompilationUnit2Artifact().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__CheckAttributes_FWD__TripleMatch() {
		return getCompilationUnit2Artifact().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__CheckAttributes_BWD__TripleMatch() {
		return getCompilationUnit2Artifact().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsApplicable_CC__Match_Match() {
		return getCompilationUnit2Artifact().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsApplicable_solveCsp_CC__Artifact_CompilationUnit_Model_Model_Match_Match() {
		return getCompilationUnit2Artifact().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__IsApplicable_checkCsp_CC__CSP() {
		return getCompilationUnit2Artifact().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__CheckDEC_FWD__CompilationUnit_Model() {
		return getCompilationUnit2Artifact().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__CheckDEC_BWD__Artifact_Model() {
		return getCompilationUnit2Artifact().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__GenerateModel__RuleEntryContainer_JavaModel2UMLPackage() {
		return getCompilationUnit2Artifact().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__GenerateModel_solveCsp_BWD__IsApplicableMatch_JavaModel2UMLPackage_Model_Model_ModelgeneratorRuleResult() {
		return getCompilationUnit2Artifact().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompilationUnit2Artifact__GenerateModel_checkCsp_BWD__CSP() {
		return getCompilationUnit2Artifact().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldDeclarationTypeAccessType2PropertyType() {
		if (fieldDeclarationTypeAccessType2PropertyTypeEClass == null) {
			fieldDeclarationTypeAccessType2PropertyTypeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(59);
		}
		return fieldDeclarationTypeAccessType2PropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodDec2OperationWithModifier() {
		if (methodDec2OperationWithModifierEClass == null) {
			methodDec2OperationWithModifierEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(60);
		}
		return methodDec2OperationWithModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsAppropriate_FWD__Match_Modifier_MMethodDefinition() {
		return getMethodDec2OperationWithModifier().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__Perform_FWD__IsApplicableMatch() {
		return getMethodDec2OperationWithModifier().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsApplicable_FWD__Match() {
		return getMethodDec2OperationWithModifier().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__RegisterObjectsToMatch_FWD__Match_Modifier_MMethodDefinition() {
		return getMethodDec2OperationWithModifier().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsAppropriate_solveCsp_FWD__Match_Modifier_MMethodDefinition() {
		return getMethodDec2OperationWithModifier().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodDec2OperationWithModifier().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsApplicable_solveCsp_FWD__IsApplicableMatch_Modifier_MMethodDefinition() {
		return getMethodDec2OperationWithModifier().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodDec2OperationWithModifier().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject() {
		return getMethodDec2OperationWithModifier().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__CheckTypes_FWD__Match() {
		return getMethodDec2OperationWithModifier().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsAppropriate_BWD__Match_Operation() {
		return getMethodDec2OperationWithModifier().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__Perform_BWD__IsApplicableMatch() {
		return getMethodDec2OperationWithModifier().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsApplicable_BWD__Match() {
		return getMethodDec2OperationWithModifier().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__RegisterObjectsToMatch_BWD__Match_Operation() {
		return getMethodDec2OperationWithModifier().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsAppropriate_solveCsp_BWD__Match_Operation() {
		return getMethodDec2OperationWithModifier().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodDec2OperationWithModifier().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsApplicable_solveCsp_BWD__IsApplicableMatch_Operation() {
		return getMethodDec2OperationWithModifier().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodDec2OperationWithModifier().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject() {
		return getMethodDec2OperationWithModifier().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__CheckTypes_BWD__Match() {
		return getMethodDec2OperationWithModifier().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsAppropriate_BWD_Operation_0__Operation() {
		return getMethodDec2OperationWithModifier().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsAppropriate_FWD_EMoflonEdge_135__EMoflonEdge() {
		return getMethodDec2OperationWithModifier().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__CheckAttributes_FWD__TripleMatch() {
		return getMethodDec2OperationWithModifier().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__CheckAttributes_BWD__TripleMatch() {
		return getMethodDec2OperationWithModifier().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsApplicable_CC__Match_Match() {
		return getMethodDec2OperationWithModifier().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsApplicable_solveCsp_CC__Operation_Modifier_MMethodDefinition_Match_Match() {
		return getMethodDec2OperationWithModifier().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__IsApplicable_checkCsp_CC__CSP() {
		return getMethodDec2OperationWithModifier().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__CheckDEC_FWD__Modifier_MMethodDefinition() {
		return getMethodDec2OperationWithModifier().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__CheckDEC_BWD__Operation() {
		return getMethodDec2OperationWithModifier().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__GenerateModel__RuleEntryContainer() {
		return getMethodDec2OperationWithModifier().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getMethodDec2OperationWithModifier().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2OperationWithModifier__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodDec2OperationWithModifier().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaAnnotation2Comment4SingleVariableDeclaration() {
		if (javaAnnotation2Comment4SingleVariableDeclarationEClass == null) {
			javaAnnotation2Comment4SingleVariableDeclarationEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(61);
		}
		return javaAnnotation2Comment4SingleVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsAppropriate_FWD__Match_Annotation_TypeAccess_SingleVariableDeclaration_AnnotationTypeDeclaration() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__Perform_FWD__IsApplicableMatch() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsApplicable_FWD__Match() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__RegisterObjectsToMatch_FWD__Match_Annotation_TypeAccess_SingleVariableDeclaration_AnnotationTypeDeclaration() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsAppropriate_solveCsp_FWD__Match_Annotation_TypeAccess_SingleVariableDeclaration_AnnotationTypeDeclaration() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsAppropriate_checkCsp_FWD__CSP() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsApplicable_solveCsp_FWD__IsApplicableMatch_Annotation_TypeAccess_ASTNode2Element_SingleVariableDeclaration_Interface_AnnotationTypeDeclaration_ASTNode2Element_Parameter() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsApplicable_checkCsp_FWD__CSP() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__CheckTypes_FWD__Match() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsAppropriate_BWD__Match_Comment_Interface_Parameter() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__Perform_BWD__IsApplicableMatch() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsApplicable_BWD__Match() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__RegisterObjectsToMatch_BWD__Match_Comment_Interface_Parameter() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsAppropriate_solveCsp_BWD__Match_Comment_Interface_Parameter() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsAppropriate_checkCsp_BWD__CSP() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsApplicable_solveCsp_BWD__IsApplicableMatch_ASTNode2Element_SingleVariableDeclaration_Comment_Interface_AnnotationTypeDeclaration_ASTNode2Element_Parameter() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsApplicable_checkCsp_BWD__CSP() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__CheckTypes_BWD__Match() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsAppropriate_BWD_EMoflonEdge_128__EMoflonEdge() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsAppropriate_FWD_EMoflonEdge_136__EMoflonEdge() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__CheckAttributes_FWD__TripleMatch() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__CheckAttributes_BWD__TripleMatch() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsApplicable_CC__Match_Match() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsApplicable_solveCsp_CC__Annotation_TypeAccess_SingleVariableDeclaration_Comment_Interface_AnnotationTypeDeclaration_Parameter_Match_Match() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__IsApplicable_checkCsp_CC__CSP() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__CheckDEC_FWD__Annotation_TypeAccess_SingleVariableDeclaration_AnnotationTypeDeclaration() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__CheckDEC_BWD__Comment_Interface_Parameter() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__GenerateModel_solveCsp_BWD__IsApplicableMatch_ASTNode2Element_SingleVariableDeclaration_Interface_AnnotationTypeDeclaration_ASTNode2Element_Parameter_ModelgeneratorRuleResult() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4SingleVariableDeclaration__GenerateModel_checkCsp_BWD__CSP() {
		return getJavaAnnotation2Comment4SingleVariableDeclaration().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedType2Interface_InnerTypeInInterface() {
		if (parameterizedType2Interface_InnerTypeInInterfaceEClass == null) {
			parameterizedType2Interface_InnerTypeInInterfaceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(62);
		}
		return parameterizedType2Interface_InnerTypeInInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsAppropriate_FWD__Match_AbstractTypeDeclaration_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__Perform_FWD__IsApplicableMatch() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsApplicable_FWD__Match() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__RegisterObjectsToMatch_FWD__Match_AbstractTypeDeclaration_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsAppropriate_solveCsp_FWD__Match_AbstractTypeDeclaration_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsAppropriate_checkCsp_FWD__CSP() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsApplicable_solveCsp_FWD__IsApplicableMatch_Package_ASTNode2Element_Interface_AbstractTypeDeclaration_AbstractTypeDeclaration_Package_ParameterizedType_JavaPackage2UmlPackage_TypeAccess_Interface_ASTNode2Element() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsApplicable_checkCsp_FWD__CSP() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__CheckTypes_FWD__Match() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsAppropriate_BWD__Match_Package_Interface_Interface_Interface() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__Perform_BWD__IsApplicableMatch() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsApplicable_BWD__Match() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__RegisterObjectsToMatch_BWD__Match_Package_Interface_Interface_Interface() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsAppropriate_solveCsp_BWD__Match_Package_Interface_Interface_Interface() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsAppropriate_checkCsp_BWD__CSP() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsApplicable_solveCsp_BWD__IsApplicableMatch_Package_ASTNode2Element_Interface_AbstractTypeDeclaration_AbstractTypeDeclaration_Package_JavaPackage2UmlPackage_Interface_ASTNode2Element_Interface() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsApplicable_checkCsp_BWD__CSP() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__CheckTypes_BWD__Match() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsAppropriate_BWD_EMoflonEdge_129__EMoflonEdge() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsAppropriate_FWD_EMoflonEdge_137__EMoflonEdge() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__CheckAttributes_FWD__TripleMatch() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__CheckAttributes_BWD__TripleMatch() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsApplicable_CC__Match_Match() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsApplicable_solveCsp_CC__Package_Interface_AbstractTypeDeclaration_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess_Interface_Interface_Match_Match() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__IsApplicable_checkCsp_CC__CSP() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__CheckDEC_FWD__AbstractTypeDeclaration_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__CheckDEC_BWD__Package_Interface_Interface_Interface() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__GenerateModel_solveCsp_BWD__IsApplicableMatch_Package_ASTNode2Element_Interface_AbstractTypeDeclaration_AbstractTypeDeclaration_Package_JavaPackage2UmlPackage_Interface_ASTNode2Element_ModelgeneratorRuleResult() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface_InnerTypeInInterface__GenerateModel_checkCsp_BWD__CSP() {
		return getParameterizedType2Interface_InnerTypeInInterface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationInInterface() {
		if (operationInInterfaceEClass == null) {
			operationInInterfaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(63);
		}
		return operationInInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsAppropriate_FWD__Match_InterfaceDeclaration_MAbstractMethodDefinition() {
		return getOperationInInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__Perform_FWD__IsApplicableMatch() {
		return getOperationInInterface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsApplicable_FWD__Match() {
		return getOperationInInterface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__RegisterObjectsToMatch_FWD__Match_InterfaceDeclaration_MAbstractMethodDefinition() {
		return getOperationInInterface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsAppropriate_solveCsp_FWD__Match_InterfaceDeclaration_MAbstractMethodDefinition() {
		return getOperationInInterface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsAppropriate_checkCsp_FWD__CSP() {
		return getOperationInInterface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsApplicable_solveCsp_FWD__IsApplicableMatch_InterfaceDeclaration_ASTNode2Element_MAbstractMethodDefinition_ASTNode2Element_Interface_Operation() {
		return getOperationInInterface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsApplicable_checkCsp_FWD__CSP() {
		return getOperationInInterface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getOperationInInterface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__CheckTypes_FWD__Match() {
		return getOperationInInterface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsAppropriate_BWD__Match_Interface_Operation() {
		return getOperationInInterface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__Perform_BWD__IsApplicableMatch() {
		return getOperationInInterface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsApplicable_BWD__Match() {
		return getOperationInInterface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__RegisterObjectsToMatch_BWD__Match_Interface_Operation() {
		return getOperationInInterface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsAppropriate_solveCsp_BWD__Match_Interface_Operation() {
		return getOperationInInterface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsAppropriate_checkCsp_BWD__CSP() {
		return getOperationInInterface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsApplicable_solveCsp_BWD__IsApplicableMatch_InterfaceDeclaration_ASTNode2Element_MAbstractMethodDefinition_ASTNode2Element_Interface_Operation() {
		return getOperationInInterface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsApplicable_checkCsp_BWD__CSP() {
		return getOperationInInterface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getOperationInInterface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__CheckTypes_BWD__Match() {
		return getOperationInInterface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsAppropriate_BWD_EMoflonEdge_130__EMoflonEdge() {
		return getOperationInInterface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsAppropriate_FWD_EMoflonEdge_138__EMoflonEdge() {
		return getOperationInInterface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__CheckAttributes_FWD__TripleMatch() {
		return getOperationInInterface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__CheckAttributes_BWD__TripleMatch() {
		return getOperationInInterface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsApplicable_CC__Match_Match() {
		return getOperationInInterface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsApplicable_solveCsp_CC__InterfaceDeclaration_MAbstractMethodDefinition_Interface_Operation_Match_Match() {
		return getOperationInInterface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__IsApplicable_checkCsp_CC__CSP() {
		return getOperationInInterface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__CheckDEC_FWD__InterfaceDeclaration_MAbstractMethodDefinition() {
		return getOperationInInterface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__CheckDEC_BWD__Interface_Operation() {
		return getOperationInInterface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getOperationInInterface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__GenerateModel_solveCsp_BWD__IsApplicableMatch_InterfaceDeclaration_ASTNode2Element_MAbstractMethodDefinition_ASTNode2Element_Interface_Operation_ModelgeneratorRuleResult() {
		return getOperationInInterface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInInterface__GenerateModel_checkCsp_BWD__CSP() {
		return getOperationInInterface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldDec2Property4_Anonymous() {
		if (fieldDec2Property4_AnonymousEClass == null) {
			fieldDec2Property4_AnonymousEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(64);
		}
		return fieldDec2Property4_AnonymousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsAppropriate_FWD__Match_AnonymousClassDeclaration_MFieldDefinition() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__Perform_FWD__IsApplicableMatch() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsApplicable_FWD__Match() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__RegisterObjectsToMatch_FWD__Match_AnonymousClassDeclaration_MFieldDefinition() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsAppropriate_solveCsp_FWD__Match_AnonymousClassDeclaration_MFieldDefinition() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsApplicable_solveCsp_FWD__IsApplicableMatch_AnonymousClassDeclaration_Class_MFieldDefinition_Property_ASTNode2Element_ASTNode2Element() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__CheckTypes_FWD__Match() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsAppropriate_BWD__Match_Class_Property() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__Perform_BWD__IsApplicableMatch() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsApplicable_BWD__Match() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__RegisterObjectsToMatch_BWD__Match_Class_Property() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsAppropriate_solveCsp_BWD__Match_Class_Property() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsApplicable_solveCsp_BWD__IsApplicableMatch_AnonymousClassDeclaration_Class_MFieldDefinition_Property_ASTNode2Element_ASTNode2Element() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__CheckTypes_BWD__Match() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsAppropriate_BWD_EMoflonEdge_131__EMoflonEdge() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsAppropriate_FWD_EMoflonEdge_139__EMoflonEdge() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__CheckAttributes_FWD__TripleMatch() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__CheckAttributes_BWD__TripleMatch() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsApplicable_CC__Match_Match() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsApplicable_solveCsp_CC__AnonymousClassDeclaration_Class_MFieldDefinition_Property_Match_Match() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__IsApplicable_checkCsp_CC__CSP() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__CheckDEC_FWD__AnonymousClassDeclaration_MFieldDefinition() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__CheckDEC_BWD__Class_Property() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__GenerateModel_solveCsp_BWD__IsApplicableMatch_AnonymousClassDeclaration_Class_MFieldDefinition_Property_ASTNode2Element_ASTNode2Element_ModelgeneratorRuleResult() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property4_Anonymous__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldDec2Property4_Anonymous().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClass4Anonymous() {
		if (anonymousClass4AnonymousEClass == null) {
			anonymousClass4AnonymousEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(65);
		}
		return anonymousClass4AnonymousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsAppropriate_FWD__Match_MClassInstanceCreation_AnonymousClassDeclaration_MDefinition_AnonymousClassDeclaration() {
		return getAnonymousClass4Anonymous().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__Perform_FWD__IsApplicableMatch() {
		return getAnonymousClass4Anonymous().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsApplicable_FWD__Match() {
		return getAnonymousClass4Anonymous().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__RegisterObjectsToMatch_FWD__Match_MClassInstanceCreation_AnonymousClassDeclaration_MDefinition_AnonymousClassDeclaration() {
		return getAnonymousClass4Anonymous().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsAppropriate_solveCsp_FWD__Match_MClassInstanceCreation_AnonymousClassDeclaration_MDefinition_AnonymousClassDeclaration() {
		return getAnonymousClass4Anonymous().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnonymousClass4Anonymous().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsApplicable_solveCsp_FWD__IsApplicableMatch_MClassInstanceCreation_AnonymousClassDeclaration_Class_MDefinition_AnonymousClassDeclaration_ASTNode2Element() {
		return getAnonymousClass4Anonymous().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsApplicable_checkCsp_FWD__CSP() {
		return getAnonymousClass4Anonymous().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClass4Anonymous().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__CheckTypes_FWD__Match() {
		return getAnonymousClass4Anonymous().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsAppropriate_BWD__Match_Class_Class() {
		return getAnonymousClass4Anonymous().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__Perform_BWD__IsApplicableMatch() {
		return getAnonymousClass4Anonymous().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsApplicable_BWD__Match() {
		return getAnonymousClass4Anonymous().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__RegisterObjectsToMatch_BWD__Match_Class_Class() {
		return getAnonymousClass4Anonymous().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsAppropriate_solveCsp_BWD__Match_Class_Class() {
		return getAnonymousClass4Anonymous().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnonymousClass4Anonymous().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsApplicable_solveCsp_BWD__IsApplicableMatch_Class_Class_MDefinition_AnonymousClassDeclaration_ASTNode2Element() {
		return getAnonymousClass4Anonymous().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsApplicable_checkCsp_BWD__CSP() {
		return getAnonymousClass4Anonymous().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClass4Anonymous().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__CheckTypes_BWD__Match() {
		return getAnonymousClass4Anonymous().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsAppropriate_BWD_EMoflonEdge_132__EMoflonEdge() {
		return getAnonymousClass4Anonymous().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsAppropriate_FWD_EMoflonEdge_140__EMoflonEdge() {
		return getAnonymousClass4Anonymous().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__CheckAttributes_FWD__TripleMatch() {
		return getAnonymousClass4Anonymous().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__CheckAttributes_BWD__TripleMatch() {
		return getAnonymousClass4Anonymous().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsApplicable_CC__Match_Match() {
		return getAnonymousClass4Anonymous().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsApplicable_solveCsp_CC__MClassInstanceCreation_Class_AnonymousClassDeclaration_Class_MDefinition_AnonymousClassDeclaration_Match_Match() {
		return getAnonymousClass4Anonymous().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__IsApplicable_checkCsp_CC__CSP() {
		return getAnonymousClass4Anonymous().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__CheckDEC_FWD__MClassInstanceCreation_AnonymousClassDeclaration_MDefinition_AnonymousClassDeclaration() {
		return getAnonymousClass4Anonymous().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__CheckDEC_BWD__Class_Class() {
		return getAnonymousClass4Anonymous().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getAnonymousClass4Anonymous().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__GenerateModel_solveCsp_BWD__IsApplicableMatch_Class_MDefinition_AnonymousClassDeclaration_ASTNode2Element_ModelgeneratorRuleResult() {
		return getAnonymousClass4Anonymous().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClass4Anonymous__GenerateModel_checkCsp_BWD__CSP() {
		return getAnonymousClass4Anonymous().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIgnoreClassInstanceCreation4ArrayInitializer() {
		if (ignoreClassInstanceCreation4ArrayInitializerEClass == null) {
			ignoreClassInstanceCreation4ArrayInitializerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(66);
		}
		return ignoreClassInstanceCreation4ArrayInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__IsAppropriate_FWD__Match_ClassInstanceCreation_ArrayInitializer() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__Perform_FWD__IsApplicableMatch() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__IsApplicable_FWD__Match() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__RegisterObjectsToMatch_FWD__Match_ClassInstanceCreation_ArrayInitializer() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__IsAppropriate_solveCsp_FWD__Match_ClassInstanceCreation_ArrayInitializer() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__IsAppropriate_checkCsp_FWD__CSP() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__IsApplicable_solveCsp_FWD__IsApplicableMatch_ClassInstanceCreation_ArrayInitializer() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__IsApplicable_checkCsp_FWD__CSP() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__RegisterObjects_FWD__PerformRuleResult_EObject_EObject() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__CheckTypes_FWD__Match() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__IsAppropriate_BWD__Match() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__Perform_BWD__IsApplicableMatch() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__IsApplicable_BWD__Match() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__RegisterObjectsToMatch_BWD__Match() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__IsAppropriate_solveCsp_BWD__Match() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__IsAppropriate_checkCsp_BWD__CSP() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__CheckTypes_BWD__Match() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__IsAppropriate_FWD_EMoflonEdge_141__EMoflonEdge() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__CheckAttributes_FWD__TripleMatch() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__CheckAttributes_BWD__TripleMatch() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__IsApplicable_CC__Match_Match() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__IsApplicable_solveCsp_CC__ClassInstanceCreation_ArrayInitializer_Match_Match() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__IsApplicable_checkCsp_CC__CSP() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__CheckDEC_FWD__ClassInstanceCreation_ArrayInitializer() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__CheckDEC_BWD() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__GenerateModel__RuleEntryContainer_ClassInstanceCreation_ArrayInitializer() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__GenerateModel_solveCsp_BWD__IsApplicableMatch_ClassInstanceCreation_ArrayInitializer_ModelgeneratorRuleResult() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIgnoreClassInstanceCreation4ArrayInitializer__GenerateModel_checkCsp_BWD__CSP() {
		return getIgnoreClassInstanceCreation4ArrayInitializer().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeInt() {
		if (primitiveTypeIntEClass == null) {
			primitiveTypeIntEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(67);
		}
		return primitiveTypeIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsAppropriate_FWD__Match_PrimitiveTypeInt() {
		return getPrimitiveTypeInt().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeInt().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsApplicable_FWD__Match() {
		return getPrimitiveTypeInt().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeInt() {
		return getPrimitiveTypeInt().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeInt() {
		return getPrimitiveTypeInt().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeInt().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeInt() {
		return getPrimitiveTypeInt().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeInt().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeInt().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__CheckTypes_FWD__Match() {
		return getPrimitiveTypeInt().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsAppropriate_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeInt().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeInt().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsApplicable_BWD__Match() {
		return getPrimitiveTypeInt().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__RegisterObjectsToMatch_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeInt().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsAppropriate_solveCsp_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeInt().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeInt().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsApplicable_solveCsp_BWD__IsApplicableMatch_PrimitiveType() {
		return getPrimitiveTypeInt().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeInt().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeInt().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__CheckTypes_BWD__Match() {
		return getPrimitiveTypeInt().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsAppropriate_BWD_PrimitiveType_5__PrimitiveType() {
		return getPrimitiveTypeInt().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsAppropriate_FWD_PrimitiveTypeInt_0__PrimitiveTypeInt() {
		return getPrimitiveTypeInt().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeInt().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeInt().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeInt().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsApplicable_solveCsp_CC__PrimitiveType_PrimitiveTypeInt_Match_Match() {
		return getPrimitiveTypeInt().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeInt().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__CheckDEC_FWD__PrimitiveTypeInt() {
		return getPrimitiveTypeInt().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__CheckDEC_BWD__PrimitiveType() {
		return getPrimitiveTypeInt().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__GenerateModel__RuleEntryContainer() {
		return getPrimitiveTypeInt().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getPrimitiveTypeInt().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeInt__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeInt().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeDependency2UsageDependency() {
		if (typeDependency2UsageDependencyEClass == null) {
			typeDependency2UsageDependencyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(68);
		}
		return typeDependency2UsageDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsAppropriate_FWD__Match_Package_MClass_Type() {
		return getTypeDependency2UsageDependency().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__Perform_FWD__IsApplicableMatch() {
		return getTypeDependency2UsageDependency().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsApplicable_FWD__Match() {
		return getTypeDependency2UsageDependency().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__RegisterObjectsToMatch_FWD__Match_Package_MClass_Type() {
		return getTypeDependency2UsageDependency().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsAppropriate_solveCsp_FWD__Match_Package_MClass_Type() {
		return getTypeDependency2UsageDependency().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsAppropriate_checkCsp_FWD__CSP() {
		return getTypeDependency2UsageDependency().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsApplicable_solveCsp_FWD__IsApplicableMatch_Package_ASTNode2Element_Package_JavaPackage2UmlPackage_ASTNode2Element_Classifier_MClass_Class_Type() {
		return getTypeDependency2UsageDependency().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsApplicable_checkCsp_FWD__CSP() {
		return getTypeDependency2UsageDependency().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeDependency2UsageDependency().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__CheckTypes_FWD__Match() {
		return getTypeDependency2UsageDependency().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsAppropriate_BWD__Match_Usage_Package_Classifier_Class() {
		return getTypeDependency2UsageDependency().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__Perform_BWD__IsApplicableMatch() {
		return getTypeDependency2UsageDependency().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsApplicable_BWD__Match() {
		return getTypeDependency2UsageDependency().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__RegisterObjectsToMatch_BWD__Match_Usage_Package_Classifier_Class() {
		return getTypeDependency2UsageDependency().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsAppropriate_solveCsp_BWD__Match_Usage_Package_Classifier_Class() {
		return getTypeDependency2UsageDependency().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsAppropriate_checkCsp_BWD__CSP() {
		return getTypeDependency2UsageDependency().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsApplicable_solveCsp_BWD__IsApplicableMatch_Package_Usage_ASTNode2Element_Package_JavaPackage2UmlPackage_ASTNode2Element_Classifier_MClass_Class_Type() {
		return getTypeDependency2UsageDependency().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsApplicable_checkCsp_BWD__CSP() {
		return getTypeDependency2UsageDependency().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeDependency2UsageDependency().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__CheckTypes_BWD__Match() {
		return getTypeDependency2UsageDependency().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsAppropriate_BWD_EMoflonEdge_133__EMoflonEdge() {
		return getTypeDependency2UsageDependency().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsAppropriate_FWD_EMoflonEdge_142__EMoflonEdge() {
		return getTypeDependency2UsageDependency().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__CheckAttributes_FWD__TripleMatch() {
		return getTypeDependency2UsageDependency().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__CheckAttributes_BWD__TripleMatch() {
		return getTypeDependency2UsageDependency().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsApplicable_CC__Match_Match() {
		return getTypeDependency2UsageDependency().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsApplicable_solveCsp_CC__Package_Usage_Package_Classifier_MClass_Class_Type_Match_Match() {
		return getTypeDependency2UsageDependency().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__IsApplicable_checkCsp_CC__CSP() {
		return getTypeDependency2UsageDependency().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__CheckDEC_FWD__Package_MClass_Type() {
		return getTypeDependency2UsageDependency().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__CheckDEC_BWD__Usage_Package_Classifier_Class() {
		return getTypeDependency2UsageDependency().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getTypeDependency2UsageDependency().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__GenerateModel_solveCsp_BWD__IsApplicableMatch_Package_ASTNode2Element_Package_JavaPackage2UmlPackage_ASTNode2Element_Classifier_MClass_Class_Type_ModelgeneratorRuleResult() {
		return getTypeDependency2UsageDependency().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeDependency2UsageDependency__GenerateModel_checkCsp_BWD__CSP() {
		return getTypeDependency2UsageDependency().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClass4EnumConst_Abstract() {
		if (anonymousClass4EnumConst_AbstractEClass == null) {
			anonymousClass4EnumConst_AbstractEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(69);
		}
		return anonymousClass4EnumConst_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeDeclaration2Interface_WithModifier() {
		if (annotationTypeDeclaration2Interface_WithModifierEClass == null) {
			annotationTypeDeclaration2Interface_WithModifierEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(70);
		}
		return annotationTypeDeclaration2Interface_WithModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsAppropriate_FWD__Match_AnnotationTypeDeclaration_Modifier() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__Perform_FWD__IsApplicableMatch() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsApplicable_FWD__Match() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__RegisterObjectsToMatch_FWD__Match_AnnotationTypeDeclaration_Modifier() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsAppropriate_solveCsp_FWD__Match_AnnotationTypeDeclaration_Modifier() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsApplicable_solveCsp_FWD__IsApplicableMatch_AnnotationTypeDeclaration_Modifier() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__CheckTypes_FWD__Match() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsAppropriate_BWD__Match_Interface() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__Perform_BWD__IsApplicableMatch() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsApplicable_BWD__Match() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__RegisterObjectsToMatch_BWD__Match_Interface() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsAppropriate_solveCsp_BWD__Match_Interface() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsApplicable_solveCsp_BWD__IsApplicableMatch_Interface() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__CheckTypes_BWD__Match() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsAppropriate_BWD_Interface_3__Interface() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsAppropriate_FWD_EMoflonEdge_143__EMoflonEdge() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsApplicable_CC__Match_Match() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsApplicable_solveCsp_CC__Interface_AnnotationTypeDeclaration_Modifier_Match_Match() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__CheckDEC_FWD__AnnotationTypeDeclaration_Modifier() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__CheckDEC_BWD__Interface() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__GenerateModel__RuleEntryContainer() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeDeclaration2Interface_WithModifier__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationTypeDeclaration2Interface_WithModifier().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInnerDeclaration2InnerClassifier_Abstract() {
		if (innerDeclaration2InnerClassifier_AbstractEClass == null) {
			innerDeclaration2InnerClassifier_AbstractEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(71);
		}
		return innerDeclaration2InnerClassifier_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeParameter2Object_InMethod_InInterface() {
		if (typeParameter2Object_InMethod_InInterfaceEClass == null) {
			typeParameter2Object_InMethod_InInterfaceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(72);
		}
		return typeParameter2Object_InMethod_InInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsAppropriate_FWD__Match_InterfaceDeclaration_AbstractMethodDeclaration_TypeParameter() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__Perform_FWD__IsApplicableMatch() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsApplicable_FWD__Match() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__RegisterObjectsToMatch_FWD__Match_InterfaceDeclaration_AbstractMethodDeclaration_TypeParameter() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsAppropriate_solveCsp_FWD__Match_InterfaceDeclaration_AbstractMethodDeclaration_TypeParameter() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsAppropriate_checkCsp_FWD__CSP() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsApplicable_solveCsp_FWD__IsApplicableMatch_InterfaceDeclaration_AbstractMethodDeclaration_Interface_TypeParameter_ASTNode2Element() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsApplicable_checkCsp_FWD__CSP() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__CheckTypes_FWD__Match() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsAppropriate_BWD__Match_Interface_Class() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__Perform_BWD__IsApplicableMatch() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsApplicable_BWD__Match() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__RegisterObjectsToMatch_BWD__Match_Interface_Class() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsAppropriate_solveCsp_BWD__Match_Interface_Class() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsAppropriate_checkCsp_BWD__CSP() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsApplicable_solveCsp_BWD__IsApplicableMatch_InterfaceDeclaration_AbstractMethodDeclaration_Interface_Class_ASTNode2Element() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsApplicable_checkCsp_BWD__CSP() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__CheckTypes_BWD__Match() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsAppropriate_BWD_EMoflonEdge_134__EMoflonEdge() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsAppropriate_FWD_EMoflonEdge_144__EMoflonEdge() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__CheckAttributes_FWD__TripleMatch() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__CheckAttributes_BWD__TripleMatch() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsApplicable_CC__Match_Match() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsApplicable_solveCsp_CC__InterfaceDeclaration_AbstractMethodDeclaration_Interface_Class_TypeParameter_Match_Match() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__IsApplicable_checkCsp_CC__CSP() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__CheckDEC_FWD__InterfaceDeclaration_AbstractMethodDeclaration_TypeParameter() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__CheckDEC_BWD__Interface_Class() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__GenerateModel_solveCsp_BWD__IsApplicableMatch_InterfaceDeclaration_AbstractMethodDeclaration_Interface_ASTNode2Element_ModelgeneratorRuleResult() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter2Object_InMethod_InInterface__GenerateModel_checkCsp_BWD__CSP() {
		return getTypeParameter2Object_InMethod_InInterface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrphanedClassDec2OrphanedClass() {
		if (orphanedClassDec2OrphanedClassEClass == null) {
			orphanedClassDec2OrphanedClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(73);
		}
		return orphanedClassDec2OrphanedClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsAppropriate_FWD__Match_Model_AbstractTypeDeclaration() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__Perform_FWD__IsApplicableMatch() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsApplicable_FWD__Match() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__RegisterObjectsToMatch_FWD__Match_Model_AbstractTypeDeclaration() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsAppropriate_solveCsp_FWD__Match_Model_AbstractTypeDeclaration() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_Model_Classifier_Model_AbstractTypeDeclaration_ASTNode2Element_JavaModel2UMLPackage() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsApplicable_checkCsp_FWD__CSP() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__CheckTypes_FWD__Match() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsAppropriate_BWD__Match_Model_Classifier() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__Perform_BWD__IsApplicableMatch() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsApplicable_BWD__Match() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__RegisterObjectsToMatch_BWD__Match_Model_Classifier() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsAppropriate_solveCsp_BWD__Match_Model_Classifier() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsAppropriate_checkCsp_BWD__CSP() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_Model_Classifier_Model_AbstractTypeDeclaration_ASTNode2Element_JavaModel2UMLPackage() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsApplicable_checkCsp_BWD__CSP() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__CheckTypes_BWD__Match() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsAppropriate_BWD_EMoflonEdge_135__EMoflonEdge() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsAppropriate_FWD_EMoflonEdge_145__EMoflonEdge() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__CheckAttributes_FWD__TripleMatch() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__CheckAttributes_BWD__TripleMatch() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsApplicable_CC__Match_Match() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsApplicable_solveCsp_CC__Model_Classifier_Model_AbstractTypeDeclaration_Match_Match() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__IsApplicable_checkCsp_CC__CSP() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__CheckDEC_FWD__Model_AbstractTypeDeclaration() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__CheckDEC_BWD__Model_Classifier() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__GenerateModel__RuleEntryContainer_JavaModel2UMLPackage_ASTNode2Element() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_Model_Classifier_Model_AbstractTypeDeclaration_ASTNode2Element_JavaModel2UMLPackage_ModelgeneratorRuleResult() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrphanedClassDec2OrphanedClass__GenerateModel_checkCsp_BWD__CSP() {
		return getOrphanedClassDec2OrphanedClass().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldDec2Property() {
		if (fieldDec2PropertyEClass == null) {
			fieldDec2PropertyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(74);
		}
		return fieldDec2PropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsAppropriate_FWD__Match_VariableDeclarationFragment_MFieldDefinition() {
		return getFieldDec2Property().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__Perform_FWD__IsApplicableMatch() {
		return getFieldDec2Property().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsApplicable_FWD__Match() {
		return getFieldDec2Property().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__RegisterObjectsToMatch_FWD__Match_VariableDeclarationFragment_MFieldDefinition() {
		return getFieldDec2Property().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsAppropriate_solveCsp_FWD__Match_VariableDeclarationFragment_MFieldDefinition() {
		return getFieldDec2Property().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldDec2Property().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsApplicable_solveCsp_FWD__IsApplicableMatch_VariableDeclarationFragment_MFieldDefinition() {
		return getFieldDec2Property().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldDec2Property().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject() {
		return getFieldDec2Property().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__CheckTypes_FWD__Match() {
		return getFieldDec2Property().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsAppropriate_BWD__Match_Property() {
		return getFieldDec2Property().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__Perform_BWD__IsApplicableMatch() {
		return getFieldDec2Property().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsApplicable_BWD__Match() {
		return getFieldDec2Property().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__RegisterObjectsToMatch_BWD__Match_Property() {
		return getFieldDec2Property().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsAppropriate_solveCsp_BWD__Match_Property() {
		return getFieldDec2Property().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldDec2Property().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsApplicable_solveCsp_BWD__IsApplicableMatch_Property() {
		return getFieldDec2Property().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldDec2Property().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject() {
		return getFieldDec2Property().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__CheckTypes_BWD__Match() {
		return getFieldDec2Property().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsAppropriate_BWD_Property_0__Property() {
		return getFieldDec2Property().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsAppropriate_FWD_EMoflonEdge_146__EMoflonEdge() {
		return getFieldDec2Property().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__CheckAttributes_FWD__TripleMatch() {
		return getFieldDec2Property().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__CheckAttributes_BWD__TripleMatch() {
		return getFieldDec2Property().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsApplicable_CC__Match_Match() {
		return getFieldDec2Property().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsApplicable_solveCsp_CC__VariableDeclarationFragment_MFieldDefinition_Property_Match_Match() {
		return getFieldDec2Property().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__IsApplicable_checkCsp_CC__CSP() {
		return getFieldDec2Property().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__CheckDEC_FWD__VariableDeclarationFragment_MFieldDefinition() {
		return getFieldDec2Property().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__CheckDEC_BWD__Property() {
		return getFieldDec2Property().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__GenerateModel__RuleEntryContainer() {
		return getFieldDec2Property().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getFieldDec2Property().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldDec2Property().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedType2Class_InnerTypeInInterface() {
		if (parameterizedType2Class_InnerTypeInInterfaceEClass == null) {
			parameterizedType2Class_InnerTypeInInterfaceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(75);
		}
		return parameterizedType2Class_InnerTypeInInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsAppropriate_FWD__Match_AbstractTypeDeclaration_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__Perform_FWD__IsApplicableMatch() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsApplicable_FWD__Match() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__RegisterObjectsToMatch_FWD__Match_AbstractTypeDeclaration_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsAppropriate_solveCsp_FWD__Match_AbstractTypeDeclaration_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsAppropriate_checkCsp_FWD__CSP() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsApplicable_solveCsp_FWD__IsApplicableMatch_Package_ASTNode2Element_Interface_AbstractTypeDeclaration_AbstractTypeDeclaration_Package_ParameterizedType_JavaPackage2UmlPackage_TypeAccess_Class_ASTNode2Element() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsApplicable_checkCsp_FWD__CSP() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__CheckTypes_FWD__Match() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsAppropriate_BWD__Match_Package_Interface_Class_Class() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__Perform_BWD__IsApplicableMatch() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsApplicable_BWD__Match() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__RegisterObjectsToMatch_BWD__Match_Package_Interface_Class_Class() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsAppropriate_solveCsp_BWD__Match_Package_Interface_Class_Class() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsAppropriate_checkCsp_BWD__CSP() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsApplicable_solveCsp_BWD__IsApplicableMatch_Package_ASTNode2Element_Interface_AbstractTypeDeclaration_AbstractTypeDeclaration_Package_JavaPackage2UmlPackage_Class_ASTNode2Element_Class() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsApplicable_checkCsp_BWD__CSP() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__CheckTypes_BWD__Match() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsAppropriate_BWD_EMoflonEdge_136__EMoflonEdge() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsAppropriate_FWD_EMoflonEdge_147__EMoflonEdge() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__CheckAttributes_FWD__TripleMatch() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__CheckAttributes_BWD__TripleMatch() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsApplicable_CC__Match_Match() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsApplicable_solveCsp_CC__Package_Interface_AbstractTypeDeclaration_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess_Class_Class_Match_Match() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__IsApplicable_checkCsp_CC__CSP() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__CheckDEC_FWD__AbstractTypeDeclaration_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__CheckDEC_BWD__Package_Interface_Class_Class() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__GenerateModel_solveCsp_BWD__IsApplicableMatch_Package_ASTNode2Element_Interface_AbstractTypeDeclaration_AbstractTypeDeclaration_Package_JavaPackage2UmlPackage_Class_ASTNode2Element_ModelgeneratorRuleResult() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInInterface__GenerateModel_checkCsp_BWD__CSP() {
		return getParameterizedType2Class_InnerTypeInInterface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedTypeDeclaration2Type() {
		if (unresolvedTypeDeclaration2TypeEClass == null) {
			unresolvedTypeDeclaration2TypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(76);
		}
		return unresolvedTypeDeclaration2TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsAppropriate_FWD__Match_Model_UnresolvedTypeDeclaration() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__Perform_FWD__IsApplicableMatch() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsApplicable_FWD__Match() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__RegisterObjectsToMatch_FWD__Match_Model_UnresolvedTypeDeclaration() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsAppropriate_solveCsp_FWD__Match_Model_UnresolvedTypeDeclaration() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsAppropriate_checkCsp_FWD__CSP() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsApplicable_solveCsp_FWD__IsApplicableMatch_Model_Model_JavaModel2UMLPackage_UnresolvedTypeDeclaration() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsApplicable_checkCsp_FWD__CSP() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__CheckTypes_FWD__Match() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsAppropriate_BWD__Match_Model_Class() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__Perform_BWD__IsApplicableMatch() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsApplicable_BWD__Match() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__RegisterObjectsToMatch_BWD__Match_Model_Class() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsAppropriate_solveCsp_BWD__Match_Model_Class() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsAppropriate_checkCsp_BWD__CSP() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsApplicable_solveCsp_BWD__IsApplicableMatch_Model_Model_JavaModel2UMLPackage_Class() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsApplicable_checkCsp_BWD__CSP() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__CheckTypes_BWD__Match() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsAppropriate_BWD_EMoflonEdge_137__EMoflonEdge() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsAppropriate_FWD_EMoflonEdge_148__EMoflonEdge() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__CheckAttributes_FWD__TripleMatch() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__CheckAttributes_BWD__TripleMatch() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsApplicable_CC__Match_Match() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsApplicable_solveCsp_CC__Model_Model_UnresolvedTypeDeclaration_Class_Match_Match() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__IsApplicable_checkCsp_CC__CSP() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__CheckDEC_FWD__Model_UnresolvedTypeDeclaration() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__CheckDEC_BWD__Model_Class() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__GenerateModel__RuleEntryContainer_JavaModel2UMLPackage() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__GenerateModel_solveCsp_BWD__IsApplicableMatch_Model_Model_JavaModel2UMLPackage_ModelgeneratorRuleResult() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration2Type__GenerateModel_checkCsp_BWD__CSP() {
		return getUnresolvedTypeDeclaration2Type().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkTypeToPackage() {
		if (linkTypeToPackageEClass == null) {
			linkTypeToPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(77);
		}
		return linkTypeToPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsAppropriate_FWD__Match_Package_AbstractTypeDeclaration() {
		return getLinkTypeToPackage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__Perform_FWD__IsApplicableMatch() {
		return getLinkTypeToPackage().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsApplicable_FWD__Match() {
		return getLinkTypeToPackage().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__RegisterObjectsToMatch_FWD__Match_Package_AbstractTypeDeclaration() {
		return getLinkTypeToPackage().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsAppropriate_solveCsp_FWD__Match_Package_AbstractTypeDeclaration() {
		return getLinkTypeToPackage().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsAppropriate_checkCsp_FWD__CSP() {
		return getLinkTypeToPackage().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsApplicable_solveCsp_FWD__IsApplicableMatch_Package_Classifier_AbstractTypeDeclaration_ASTNode2Element_JavaPackage2UmlPackage_Package() {
		return getLinkTypeToPackage().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsApplicable_checkCsp_FWD__CSP() {
		return getLinkTypeToPackage().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLinkTypeToPackage().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__CheckTypes_FWD__Match() {
		return getLinkTypeToPackage().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsAppropriate_BWD__Match_Classifier_Package() {
		return getLinkTypeToPackage().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__Perform_BWD__IsApplicableMatch() {
		return getLinkTypeToPackage().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsApplicable_BWD__Match() {
		return getLinkTypeToPackage().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__RegisterObjectsToMatch_BWD__Match_Classifier_Package() {
		return getLinkTypeToPackage().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsAppropriate_solveCsp_BWD__Match_Classifier_Package() {
		return getLinkTypeToPackage().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsAppropriate_checkCsp_BWD__CSP() {
		return getLinkTypeToPackage().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsApplicable_solveCsp_BWD__IsApplicableMatch_Package_Classifier_AbstractTypeDeclaration_ASTNode2Element_JavaPackage2UmlPackage_Package() {
		return getLinkTypeToPackage().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsApplicable_checkCsp_BWD__CSP() {
		return getLinkTypeToPackage().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLinkTypeToPackage().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__CheckTypes_BWD__Match() {
		return getLinkTypeToPackage().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsAppropriate_BWD_EMoflonEdge_138__EMoflonEdge() {
		return getLinkTypeToPackage().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsAppropriate_FWD_EMoflonEdge_149__EMoflonEdge() {
		return getLinkTypeToPackage().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__CheckAttributes_FWD__TripleMatch() {
		return getLinkTypeToPackage().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__CheckAttributes_BWD__TripleMatch() {
		return getLinkTypeToPackage().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsApplicable_CC__Match_Match() {
		return getLinkTypeToPackage().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsApplicable_solveCsp_CC__Package_Classifier_AbstractTypeDeclaration_Package_Match_Match() {
		return getLinkTypeToPackage().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__IsApplicable_checkCsp_CC__CSP() {
		return getLinkTypeToPackage().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__CheckDEC_FWD__Package_AbstractTypeDeclaration() {
		return getLinkTypeToPackage().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__CheckDEC_BWD__Classifier_Package() {
		return getLinkTypeToPackage().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__GenerateModel__RuleEntryContainer_JavaPackage2UmlPackage_ASTNode2Element() {
		return getLinkTypeToPackage().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_Package_Classifier_AbstractTypeDeclaration_ASTNode2Element_JavaPackage2UmlPackage_Package_ModelgeneratorRuleResult() {
		return getLinkTypeToPackage().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkTypeToPackage__GenerateModel_checkCsp_BWD__CSP() {
		return getLinkTypeToPackage().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaAnnotation2Comment_Abstract() {
		if (javaAnnotation2Comment_AbstractEClass == null) {
			javaAnnotation2Comment_AbstractEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(78);
		}
		return javaAnnotation2Comment_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationInEnum() {
		if (operationInEnumEClass == null) {
			operationInEnumEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(79);
		}
		return operationInEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsAppropriate_FWD__Match_MAbstractMethodDefinition_EnumDeclaration() {
		return getOperationInEnum().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__Perform_FWD__IsApplicableMatch() {
		return getOperationInEnum().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsApplicable_FWD__Match() {
		return getOperationInEnum().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__RegisterObjectsToMatch_FWD__Match_MAbstractMethodDefinition_EnumDeclaration() {
		return getOperationInEnum().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsAppropriate_solveCsp_FWD__Match_MAbstractMethodDefinition_EnumDeclaration() {
		return getOperationInEnum().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsAppropriate_checkCsp_FWD__CSP() {
		return getOperationInEnum().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsApplicable_solveCsp_FWD__IsApplicableMatch_Operation_Enumeration_MAbstractMethodDefinition_EnumDeclaration_ASTNode2Element_ASTNode2Element() {
		return getOperationInEnum().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsApplicable_checkCsp_FWD__CSP() {
		return getOperationInEnum().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getOperationInEnum().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__CheckTypes_FWD__Match() {
		return getOperationInEnum().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsAppropriate_BWD__Match_Operation_Enumeration() {
		return getOperationInEnum().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__Perform_BWD__IsApplicableMatch() {
		return getOperationInEnum().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsApplicable_BWD__Match() {
		return getOperationInEnum().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__RegisterObjectsToMatch_BWD__Match_Operation_Enumeration() {
		return getOperationInEnum().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsAppropriate_solveCsp_BWD__Match_Operation_Enumeration() {
		return getOperationInEnum().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsAppropriate_checkCsp_BWD__CSP() {
		return getOperationInEnum().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsApplicable_solveCsp_BWD__IsApplicableMatch_Operation_Enumeration_MAbstractMethodDefinition_EnumDeclaration_ASTNode2Element_ASTNode2Element() {
		return getOperationInEnum().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsApplicable_checkCsp_BWD__CSP() {
		return getOperationInEnum().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getOperationInEnum().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__CheckTypes_BWD__Match() {
		return getOperationInEnum().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsAppropriate_BWD_EMoflonEdge_139__EMoflonEdge() {
		return getOperationInEnum().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsAppropriate_FWD_EMoflonEdge_150__EMoflonEdge() {
		return getOperationInEnum().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__CheckAttributes_FWD__TripleMatch() {
		return getOperationInEnum().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__CheckAttributes_BWD__TripleMatch() {
		return getOperationInEnum().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsApplicable_CC__Match_Match() {
		return getOperationInEnum().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsApplicable_solveCsp_CC__Operation_Enumeration_MAbstractMethodDefinition_EnumDeclaration_Match_Match() {
		return getOperationInEnum().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__IsApplicable_checkCsp_CC__CSP() {
		return getOperationInEnum().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__CheckDEC_FWD__MAbstractMethodDefinition_EnumDeclaration() {
		return getOperationInEnum().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__CheckDEC_BWD__Operation_Enumeration() {
		return getOperationInEnum().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getOperationInEnum().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__GenerateModel_solveCsp_BWD__IsApplicableMatch_Operation_Enumeration_MAbstractMethodDefinition_EnumDeclaration_ASTNode2Element_ASTNode2Element_ModelgeneratorRuleResult() {
		return getOperationInEnum().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperationInEnum__GenerateModel_checkCsp_BWD__CSP() {
		return getOperationInEnum().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeByte() {
		if (primitiveTypeByteEClass == null) {
			primitiveTypeByteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(80);
		}
		return primitiveTypeByteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsAppropriate_FWD__Match_PrimitiveTypeByte() {
		return getPrimitiveTypeByte().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeByte().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsApplicable_FWD__Match() {
		return getPrimitiveTypeByte().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeByte() {
		return getPrimitiveTypeByte().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeByte() {
		return getPrimitiveTypeByte().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeByte().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeByte() {
		return getPrimitiveTypeByte().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeByte().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeByte().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__CheckTypes_FWD__Match() {
		return getPrimitiveTypeByte().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsAppropriate_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeByte().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeByte().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsApplicable_BWD__Match() {
		return getPrimitiveTypeByte().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__RegisterObjectsToMatch_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeByte().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsAppropriate_solveCsp_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeByte().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeByte().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsApplicable_solveCsp_BWD__IsApplicableMatch_PrimitiveType() {
		return getPrimitiveTypeByte().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeByte().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeByte().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__CheckTypes_BWD__Match() {
		return getPrimitiveTypeByte().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsAppropriate_BWD_PrimitiveType_6__PrimitiveType() {
		return getPrimitiveTypeByte().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsAppropriate_FWD_PrimitiveTypeByte_0__PrimitiveTypeByte() {
		return getPrimitiveTypeByte().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeByte().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeByte().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeByte().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsApplicable_solveCsp_CC__PrimitiveType_PrimitiveTypeByte_Match_Match() {
		return getPrimitiveTypeByte().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeByte().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__CheckDEC_FWD__PrimitiveTypeByte() {
		return getPrimitiveTypeByte().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__CheckDEC_BWD__PrimitiveType() {
		return getPrimitiveTypeByte().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__GenerateModel__RuleEntryContainer() {
		return getPrimitiveTypeByte().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getPrimitiveTypeByte().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeByte__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeByte().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInnerDeclaration2InnerClassifier_InMethod4IAnonymous() {
		if (innerDeclaration2InnerClassifier_InMethod4IAnonymousEClass == null) {
			innerDeclaration2InnerClassifier_InMethod4IAnonymousEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(81);
		}
		return innerDeclaration2InnerClassifier_InMethod4IAnonymousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsAppropriate_FWD__Match_AnonymousClassDeclaration_MAbstractMethodDefinition_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__Perform_FWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsApplicable_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__RegisterObjectsToMatch_FWD__Match_AnonymousClassDeclaration_MAbstractMethodDefinition_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsAppropriate_solveCsp_FWD__Match_AnonymousClassDeclaration_MAbstractMethodDefinition_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsAppropriate_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsApplicable_solveCsp_FWD__IsApplicableMatch_AnonymousClassDeclaration_ASTNode2Element_Classifier_MAbstractMethodDefinition_ASTNode2Element_AbstractTypeDeclaration_Class() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsApplicable_checkCsp_FWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__CheckTypes_FWD__Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsAppropriate_BWD__Match_Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__Perform_BWD__IsApplicableMatch() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsApplicable_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__RegisterObjectsToMatch_BWD__Match_Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsAppropriate_solveCsp_BWD__Match_Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsAppropriate_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsApplicable_solveCsp_BWD__IsApplicableMatch_AnonymousClassDeclaration_ASTNode2Element_Classifier_MAbstractMethodDefinition_ASTNode2Element_AbstractTypeDeclaration_Class() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsApplicable_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__CheckTypes_BWD__Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsAppropriate_BWD_EMoflonEdge_140__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsAppropriate_FWD_EMoflonEdge_151__EMoflonEdge() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__CheckAttributes_FWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__CheckAttributes_BWD__TripleMatch() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsApplicable_CC__Match_Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsApplicable_solveCsp_CC__AnonymousClassDeclaration_Classifier_MAbstractMethodDefinition_AbstractTypeDeclaration_Class_Match_Match() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__IsApplicable_checkCsp_CC__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__CheckDEC_FWD__AnonymousClassDeclaration_MAbstractMethodDefinition_AbstractTypeDeclaration() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__CheckDEC_BWD__Classifier_Class() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__GenerateModel_solveCsp_BWD__IsApplicableMatch_AnonymousClassDeclaration_ASTNode2Element_Classifier_MAbstractMethodDefinition_ASTNode2Element_AbstractTypeDeclaration_Class_ModelgeneratorRuleResult() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInnerDeclaration2InnerClassifier_InMethod4IAnonymous__GenerateModel_checkCsp_BWD__CSP() {
		return getInnerDeclaration2InnerClassifier_InMethod4IAnonymous().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaAnnotationValue2Comment() {
		if (javaAnnotationValue2CommentEClass == null) {
			javaAnnotationValue2CommentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(82);
		}
		return javaAnnotationValue2CommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsAppropriate_FWD__Match_AnnotationMemberValuePair_ArrayInitializer_Annotation() {
		return getJavaAnnotationValue2Comment().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__Perform_FWD__IsApplicableMatch() {
		return getJavaAnnotationValue2Comment().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsApplicable_FWD__Match() {
		return getJavaAnnotationValue2Comment().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__RegisterObjectsToMatch_FWD__Match_AnnotationMemberValuePair_ArrayInitializer_Annotation() {
		return getJavaAnnotationValue2Comment().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsAppropriate_solveCsp_FWD__Match_AnnotationMemberValuePair_ArrayInitializer_Annotation() {
		return getJavaAnnotationValue2Comment().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsAppropriate_checkCsp_FWD__CSP() {
		return getJavaAnnotationValue2Comment().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsApplicable_solveCsp_FWD__IsApplicableMatch_AnnotationMemberValuePair_Comment_ArrayInitializer_Annotation_ASTNode2Element() {
		return getJavaAnnotationValue2Comment().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsApplicable_checkCsp_FWD__CSP() {
		return getJavaAnnotationValue2Comment().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getJavaAnnotationValue2Comment().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__CheckTypes_FWD__Match() {
		return getJavaAnnotationValue2Comment().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsAppropriate_BWD__Match_Comment_Comment() {
		return getJavaAnnotationValue2Comment().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__Perform_BWD__IsApplicableMatch() {
		return getJavaAnnotationValue2Comment().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsApplicable_BWD__Match() {
		return getJavaAnnotationValue2Comment().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__RegisterObjectsToMatch_BWD__Match_Comment_Comment() {
		return getJavaAnnotationValue2Comment().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsAppropriate_solveCsp_BWD__Match_Comment_Comment() {
		return getJavaAnnotationValue2Comment().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsAppropriate_checkCsp_BWD__CSP() {
		return getJavaAnnotationValue2Comment().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsApplicable_solveCsp_BWD__IsApplicableMatch_Comment_Comment_Annotation_ASTNode2Element() {
		return getJavaAnnotationValue2Comment().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsApplicable_checkCsp_BWD__CSP() {
		return getJavaAnnotationValue2Comment().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getJavaAnnotationValue2Comment().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__CheckTypes_BWD__Match() {
		return getJavaAnnotationValue2Comment().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsAppropriate_BWD_EMoflonEdge_141__EMoflonEdge() {
		return getJavaAnnotationValue2Comment().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsAppropriate_FWD_EMoflonEdge_152__EMoflonEdge() {
		return getJavaAnnotationValue2Comment().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__CheckAttributes_FWD__TripleMatch() {
		return getJavaAnnotationValue2Comment().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__CheckAttributes_BWD__TripleMatch() {
		return getJavaAnnotationValue2Comment().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsApplicable_CC__Match_Match() {
		return getJavaAnnotationValue2Comment().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsApplicable_solveCsp_CC__AnnotationMemberValuePair_Comment_Comment_ArrayInitializer_Annotation_Match_Match() {
		return getJavaAnnotationValue2Comment().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__IsApplicable_checkCsp_CC__CSP() {
		return getJavaAnnotationValue2Comment().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__CheckDEC_FWD__AnnotationMemberValuePair_ArrayInitializer_Annotation() {
		return getJavaAnnotationValue2Comment().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__CheckDEC_BWD__Comment_Comment() {
		return getJavaAnnotationValue2Comment().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getJavaAnnotationValue2Comment().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__GenerateModel_solveCsp_BWD__IsApplicableMatch_Comment_Annotation_ASTNode2Element_ModelgeneratorRuleResult() {
		return getJavaAnnotationValue2Comment().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotationValue2Comment__GenerateModel_checkCsp_BWD__CSP() {
		return getJavaAnnotationValue2Comment().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldDec2Property_WithModifier() {
		if (fieldDec2Property_WithModifierEClass == null) {
			fieldDec2Property_WithModifierEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(83);
		}
		return fieldDec2Property_WithModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsAppropriate_FWD__Match_Modifier_MFieldDefinition_VariableDeclarationFragment() {
		return getFieldDec2Property_WithModifier().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__Perform_FWD__IsApplicableMatch() {
		return getFieldDec2Property_WithModifier().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsApplicable_FWD__Match() {
		return getFieldDec2Property_WithModifier().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__RegisterObjectsToMatch_FWD__Match_Modifier_MFieldDefinition_VariableDeclarationFragment() {
		return getFieldDec2Property_WithModifier().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsAppropriate_solveCsp_FWD__Match_Modifier_MFieldDefinition_VariableDeclarationFragment() {
		return getFieldDec2Property_WithModifier().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldDec2Property_WithModifier().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsApplicable_solveCsp_FWD__IsApplicableMatch_Modifier_MFieldDefinition_VariableDeclarationFragment() {
		return getFieldDec2Property_WithModifier().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldDec2Property_WithModifier().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldDec2Property_WithModifier().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__CheckTypes_FWD__Match() {
		return getFieldDec2Property_WithModifier().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsAppropriate_BWD__Match_Property() {
		return getFieldDec2Property_WithModifier().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__Perform_BWD__IsApplicableMatch() {
		return getFieldDec2Property_WithModifier().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsApplicable_BWD__Match() {
		return getFieldDec2Property_WithModifier().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__RegisterObjectsToMatch_BWD__Match_Property() {
		return getFieldDec2Property_WithModifier().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsAppropriate_solveCsp_BWD__Match_Property() {
		return getFieldDec2Property_WithModifier().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldDec2Property_WithModifier().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsApplicable_solveCsp_BWD__IsApplicableMatch_Property() {
		return getFieldDec2Property_WithModifier().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldDec2Property_WithModifier().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldDec2Property_WithModifier().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__CheckTypes_BWD__Match() {
		return getFieldDec2Property_WithModifier().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsAppropriate_BWD_Property_1__Property() {
		return getFieldDec2Property_WithModifier().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsAppropriate_FWD_EMoflonEdge_153__EMoflonEdge() {
		return getFieldDec2Property_WithModifier().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__CheckAttributes_FWD__TripleMatch() {
		return getFieldDec2Property_WithModifier().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__CheckAttributes_BWD__TripleMatch() {
		return getFieldDec2Property_WithModifier().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsApplicable_CC__Match_Match() {
		return getFieldDec2Property_WithModifier().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsApplicable_solveCsp_CC__Property_Modifier_MFieldDefinition_VariableDeclarationFragment_Match_Match() {
		return getFieldDec2Property_WithModifier().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__IsApplicable_checkCsp_CC__CSP() {
		return getFieldDec2Property_WithModifier().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__CheckDEC_FWD__Modifier_MFieldDefinition_VariableDeclarationFragment() {
		return getFieldDec2Property_WithModifier().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__CheckDEC_BWD__Property() {
		return getFieldDec2Property_WithModifier().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__GenerateModel__RuleEntryContainer() {
		return getFieldDec2Property_WithModifier().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getFieldDec2Property_WithModifier().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDec2Property_WithModifier__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldDec2Property_WithModifier().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeAccess2InterfaceRealization() {
		if (typeAccess2InterfaceRealizationEClass == null) {
			typeAccess2InterfaceRealizationEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(84);
		}
		return typeAccess2InterfaceRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsAppropriate_FWD__Match_TypeAccess_ClassDeclaration_InterfaceDeclaration() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__Perform_FWD__IsApplicableMatch() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsApplicable_FWD__Match() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__RegisterObjectsToMatch_FWD__Match_TypeAccess_ClassDeclaration_InterfaceDeclaration() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsAppropriate_solveCsp_FWD__Match_TypeAccess_ClassDeclaration_InterfaceDeclaration() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsAppropriate_checkCsp_FWD__CSP() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsApplicable_solveCsp_FWD__IsApplicableMatch_ASTNode2Element_TypeAccess_BehavioredClassifier_ClassDeclaration_ASTNode2Element_Interface_InterfaceDeclaration() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsApplicable_checkCsp_FWD__CSP() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__CheckTypes_FWD__Match() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsAppropriate_BWD__Match_BehavioredClassifier_Interface_InterfaceRealization() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__Perform_BWD__IsApplicableMatch() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsApplicable_BWD__Match() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__RegisterObjectsToMatch_BWD__Match_BehavioredClassifier_Interface_InterfaceRealization() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsAppropriate_solveCsp_BWD__Match_BehavioredClassifier_Interface_InterfaceRealization() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsAppropriate_checkCsp_BWD__CSP() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsApplicable_solveCsp_BWD__IsApplicableMatch_ASTNode2Element_BehavioredClassifier_ClassDeclaration_ASTNode2Element_Interface_InterfaceDeclaration_InterfaceRealization() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsApplicable_checkCsp_BWD__CSP() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__CheckTypes_BWD__Match() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsAppropriate_BWD_EMoflonEdge_142__EMoflonEdge() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsAppropriate_FWD_EMoflonEdge_154__EMoflonEdge() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__CheckAttributes_FWD__TripleMatch() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__CheckAttributes_BWD__TripleMatch() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsApplicable_CC__Match_Match() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsApplicable_solveCsp_CC__TypeAccess_BehavioredClassifier_ClassDeclaration_Interface_InterfaceDeclaration_InterfaceRealization_Match_Match() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__IsApplicable_checkCsp_CC__CSP() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__CheckDEC_FWD__TypeAccess_ClassDeclaration_InterfaceDeclaration() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__CheckDEC_BWD__BehavioredClassifier_Interface_InterfaceRealization() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__GenerateModel_solveCsp_BWD__IsApplicableMatch_ASTNode2Element_BehavioredClassifier_ClassDeclaration_ASTNode2Element_Interface_InterfaceDeclaration_ModelgeneratorRuleResult() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeAccess2InterfaceRealization__GenerateModel_checkCsp_BWD__CSP() {
		return getTypeAccess2InterfaceRealization().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedType2Interface() {
		if (parameterizedType2InterfaceEClass == null) {
			parameterizedType2InterfaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(85);
		}
		return parameterizedType2InterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsAppropriate_FWD__Match_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Interface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__Perform_FWD__IsApplicableMatch() {
		return getParameterizedType2Interface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsApplicable_FWD__Match() {
		return getParameterizedType2Interface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__RegisterObjectsToMatch_FWD__Match_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Interface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsAppropriate_solveCsp_FWD__Match_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Interface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsAppropriate_checkCsp_FWD__CSP() {
		return getParameterizedType2Interface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsApplicable_solveCsp_FWD__IsApplicableMatch_Package_Interface_ASTNode2Element_AbstractTypeDeclaration_Package_ParameterizedType_JavaPackage2UmlPackage_TypeAccess() {
		return getParameterizedType2Interface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsApplicable_checkCsp_FWD__CSP() {
		return getParameterizedType2Interface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterizedType2Interface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__CheckTypes_FWD__Match() {
		return getParameterizedType2Interface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsAppropriate_BWD__Match_Package_Interface_Interface() {
		return getParameterizedType2Interface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__Perform_BWD__IsApplicableMatch() {
		return getParameterizedType2Interface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsApplicable_BWD__Match() {
		return getParameterizedType2Interface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__RegisterObjectsToMatch_BWD__Match_Package_Interface_Interface() {
		return getParameterizedType2Interface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsAppropriate_solveCsp_BWD__Match_Package_Interface_Interface() {
		return getParameterizedType2Interface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsAppropriate_checkCsp_BWD__CSP() {
		return getParameterizedType2Interface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsApplicable_solveCsp_BWD__IsApplicableMatch_Package_Interface_ASTNode2Element_Interface_AbstractTypeDeclaration_Package_JavaPackage2UmlPackage() {
		return getParameterizedType2Interface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsApplicable_checkCsp_BWD__CSP() {
		return getParameterizedType2Interface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterizedType2Interface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__CheckTypes_BWD__Match() {
		return getParameterizedType2Interface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsAppropriate_BWD_EMoflonEdge_143__EMoflonEdge() {
		return getParameterizedType2Interface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsAppropriate_FWD_EMoflonEdge_155__EMoflonEdge() {
		return getParameterizedType2Interface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__CheckAttributes_FWD__TripleMatch() {
		return getParameterizedType2Interface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__CheckAttributes_BWD__TripleMatch() {
		return getParameterizedType2Interface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsApplicable_CC__Match_Match() {
		return getParameterizedType2Interface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsApplicable_solveCsp_CC__Package_Interface_Interface_AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess_Match_Match() {
		return getParameterizedType2Interface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__IsApplicable_checkCsp_CC__CSP() {
		return getParameterizedType2Interface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__CheckDEC_FWD__AbstractTypeDeclaration_Package_ParameterizedType_TypeAccess() {
		return getParameterizedType2Interface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__CheckDEC_BWD__Package_Interface_Interface() {
		return getParameterizedType2Interface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getParameterizedType2Interface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__GenerateModel_solveCsp_BWD__IsApplicableMatch_Package_Interface_ASTNode2Element_AbstractTypeDeclaration_Package_JavaPackage2UmlPackage_ModelgeneratorRuleResult() {
		return getParameterizedType2Interface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Interface__GenerateModel_checkCsp_BWD__CSP() {
		return getParameterizedType2Interface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeVoid() {
		if (primitiveTypeVoidEClass == null) {
			primitiveTypeVoidEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(86);
		}
		return primitiveTypeVoidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsAppropriate_FWD__Match_PrimitiveTypeVoid() {
		return getPrimitiveTypeVoid().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeVoid().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsApplicable_FWD__Match() {
		return getPrimitiveTypeVoid().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeVoid() {
		return getPrimitiveTypeVoid().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeVoid() {
		return getPrimitiveTypeVoid().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeVoid().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeVoid() {
		return getPrimitiveTypeVoid().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeVoid().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeVoid().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__CheckTypes_FWD__Match() {
		return getPrimitiveTypeVoid().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsAppropriate_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeVoid().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeVoid().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsApplicable_BWD__Match() {
		return getPrimitiveTypeVoid().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__RegisterObjectsToMatch_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeVoid().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsAppropriate_solveCsp_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeVoid().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeVoid().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsApplicable_solveCsp_BWD__IsApplicableMatch_PrimitiveType() {
		return getPrimitiveTypeVoid().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeVoid().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeVoid().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__CheckTypes_BWD__Match() {
		return getPrimitiveTypeVoid().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsAppropriate_BWD_PrimitiveType_7__PrimitiveType() {
		return getPrimitiveTypeVoid().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsAppropriate_FWD_PrimitiveTypeVoid_0__PrimitiveTypeVoid() {
		return getPrimitiveTypeVoid().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeVoid().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeVoid().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeVoid().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsApplicable_solveCsp_CC__PrimitiveType_PrimitiveTypeVoid_Match_Match() {
		return getPrimitiveTypeVoid().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeVoid().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__CheckDEC_FWD__PrimitiveTypeVoid() {
		return getPrimitiveTypeVoid().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__CheckDEC_BWD__PrimitiveType() {
		return getPrimitiveTypeVoid().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__GenerateModel__RuleEntryContainer() {
		return getPrimitiveTypeVoid().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getPrimitiveTypeVoid().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeVoid__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeVoid().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedType2Class_InnerTypeInClass() {
		if (parameterizedType2Class_InnerTypeInClassEClass == null) {
			parameterizedType2Class_InnerTypeInClassEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(87);
		}
		return parameterizedType2Class_InnerTypeInClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsAppropriate_FWD__Match_TypeDeclaration_AbstractTypeDeclaration_ParameterizedType_Package_TypeAccess() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__Perform_FWD__IsApplicableMatch() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsApplicable_FWD__Match() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__RegisterObjectsToMatch_FWD__Match_TypeDeclaration_AbstractTypeDeclaration_ParameterizedType_Package_TypeAccess() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsAppropriate_solveCsp_FWD__Match_TypeDeclaration_AbstractTypeDeclaration_ParameterizedType_Package_TypeAccess() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_Package_ASTNode2Element_Class_TypeDeclaration_AbstractTypeDeclaration_ParameterizedType_Package_JavaPackage2UmlPackage_TypeAccess_Class_ASTNode2Element() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsApplicable_checkCsp_FWD__CSP() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__CheckTypes_FWD__Match() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsAppropriate_BWD__Match_Package_Class_Class_Class() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__Perform_BWD__IsApplicableMatch() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsApplicable_BWD__Match() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__RegisterObjectsToMatch_BWD__Match_Package_Class_Class_Class() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsAppropriate_solveCsp_BWD__Match_Package_Class_Class_Class() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsAppropriate_checkCsp_BWD__CSP() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_Package_ASTNode2Element_Class_TypeDeclaration_AbstractTypeDeclaration_Package_JavaPackage2UmlPackage_Class_ASTNode2Element_Class() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsApplicable_checkCsp_BWD__CSP() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__CheckTypes_BWD__Match() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsAppropriate_BWD_EMoflonEdge_144__EMoflonEdge() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsAppropriate_FWD_EMoflonEdge_156__EMoflonEdge() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__CheckAttributes_FWD__TripleMatch() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__CheckAttributes_BWD__TripleMatch() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsApplicable_CC__Match_Match() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsApplicable_solveCsp_CC__Package_Class_TypeDeclaration_AbstractTypeDeclaration_ParameterizedType_Package_TypeAccess_Class_Class_Match_Match() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__IsApplicable_checkCsp_CC__CSP() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__CheckDEC_FWD__TypeDeclaration_AbstractTypeDeclaration_ParameterizedType_Package_TypeAccess() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__CheckDEC_BWD__Package_Class_Class_Class() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__GenerateModel__RuleEntryContainer_ASTNode2Element() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_Package_ASTNode2Element_Class_TypeDeclaration_AbstractTypeDeclaration_Package_JavaPackage2UmlPackage_Class_ASTNode2Element_ModelgeneratorRuleResult() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedType2Class_InnerTypeInClass__GenerateModel_checkCsp_BWD__CSP() {
		return getParameterizedType2Class_InnerTypeInClass().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodDec2Operation() {
		if (methodDec2OperationEClass == null) {
			methodDec2OperationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(88);
		}
		return methodDec2OperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsAppropriate_FWD__Match_MMethodDefinition() {
		return getMethodDec2Operation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__Perform_FWD__IsApplicableMatch() {
		return getMethodDec2Operation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsApplicable_FWD__Match() {
		return getMethodDec2Operation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__RegisterObjectsToMatch_FWD__Match_MMethodDefinition() {
		return getMethodDec2Operation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsAppropriate_solveCsp_FWD__Match_MMethodDefinition() {
		return getMethodDec2Operation().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodDec2Operation().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsApplicable_solveCsp_FWD__IsApplicableMatch_MMethodDefinition() {
		return getMethodDec2Operation().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodDec2Operation().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getMethodDec2Operation().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__CheckTypes_FWD__Match() {
		return getMethodDec2Operation().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsAppropriate_BWD__Match_Operation() {
		return getMethodDec2Operation().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__Perform_BWD__IsApplicableMatch() {
		return getMethodDec2Operation().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsApplicable_BWD__Match() {
		return getMethodDec2Operation().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__RegisterObjectsToMatch_BWD__Match_Operation() {
		return getMethodDec2Operation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsAppropriate_solveCsp_BWD__Match_Operation() {
		return getMethodDec2Operation().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodDec2Operation().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsApplicable_solveCsp_BWD__IsApplicableMatch_Operation() {
		return getMethodDec2Operation().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodDec2Operation().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getMethodDec2Operation().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__CheckTypes_BWD__Match() {
		return getMethodDec2Operation().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsAppropriate_BWD_Operation_1__Operation() {
		return getMethodDec2Operation().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsAppropriate_FWD_MMethodDefinition_0__MMethodDefinition() {
		return getMethodDec2Operation().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__CheckAttributes_FWD__TripleMatch() {
		return getMethodDec2Operation().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__CheckAttributes_BWD__TripleMatch() {
		return getMethodDec2Operation().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsApplicable_CC__Match_Match() {
		return getMethodDec2Operation().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsApplicable_solveCsp_CC__MMethodDefinition_Operation_Match_Match() {
		return getMethodDec2Operation().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__IsApplicable_checkCsp_CC__CSP() {
		return getMethodDec2Operation().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__CheckDEC_FWD__MMethodDefinition() {
		return getMethodDec2Operation().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__CheckDEC_BWD__Operation() {
		return getMethodDec2Operation().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__GenerateModel__RuleEntryContainer() {
		return getMethodDec2Operation().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getMethodDec2Operation().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDec2Operation__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodDec2Operation().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaAnnotation2Comment4BodyDeclaration() {
		if (javaAnnotation2Comment4BodyDeclarationEClass == null) {
			javaAnnotation2Comment4BodyDeclarationEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(89);
		}
		return javaAnnotation2Comment4BodyDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsAppropriate_FWD__Match_Annotation_TypeAccess_BodyDeclaration_AnnotationTypeDeclaration() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__Perform_FWD__IsApplicableMatch() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsApplicable_FWD__Match() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__RegisterObjectsToMatch_FWD__Match_Annotation_TypeAccess_BodyDeclaration_AnnotationTypeDeclaration() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsAppropriate_solveCsp_FWD__Match_Annotation_TypeAccess_BodyDeclaration_AnnotationTypeDeclaration() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsAppropriate_checkCsp_FWD__CSP() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsApplicable_solveCsp_FWD__IsApplicableMatch_Annotation_TypeAccess_ASTNode2Element_Interface_BodyDeclaration_AnnotationTypeDeclaration_ASTNode2Element_Element() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsApplicable_checkCsp_FWD__CSP() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__CheckTypes_FWD__Match() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsAppropriate_BWD__Match_Comment_Interface_Element() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__Perform_BWD__IsApplicableMatch() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsApplicable_BWD__Match() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__RegisterObjectsToMatch_BWD__Match_Comment_Interface_Element() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsAppropriate_solveCsp_BWD__Match_Comment_Interface_Element() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsAppropriate_checkCsp_BWD__CSP() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsApplicable_solveCsp_BWD__IsApplicableMatch_ASTNode2Element_Comment_Interface_BodyDeclaration_AnnotationTypeDeclaration_ASTNode2Element_Element() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsApplicable_checkCsp_BWD__CSP() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__CheckTypes_BWD__Match() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsAppropriate_BWD_EMoflonEdge_145__EMoflonEdge() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsAppropriate_FWD_EMoflonEdge_157__EMoflonEdge() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__CheckAttributes_FWD__TripleMatch() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__CheckAttributes_BWD__TripleMatch() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsApplicable_CC__Match_Match() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsApplicable_solveCsp_CC__Annotation_TypeAccess_Comment_Interface_BodyDeclaration_AnnotationTypeDeclaration_Element_Match_Match() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__IsApplicable_checkCsp_CC__CSP() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__CheckDEC_FWD__Annotation_TypeAccess_BodyDeclaration_AnnotationTypeDeclaration() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__CheckDEC_BWD__Comment_Interface_Element() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__GenerateModel__RuleEntryContainer_ASTNode2Element_ASTNode2Element() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__GenerateModel_solveCsp_BWD__IsApplicableMatch_ASTNode2Element_Interface_BodyDeclaration_AnnotationTypeDeclaration_ASTNode2Element_Element_ModelgeneratorRuleResult() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaAnnotation2Comment4BodyDeclaration__GenerateModel_checkCsp_BWD__CSP() {
		return getJavaAnnotation2Comment4BodyDeclaration().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeDouble() {
		if (primitiveTypeDoubleEClass == null) {
			primitiveTypeDoubleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(90);
		}
		return primitiveTypeDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsAppropriate_FWD__Match_PrimitiveTypeDouble() {
		return getPrimitiveTypeDouble().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeDouble().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsApplicable_FWD__Match() {
		return getPrimitiveTypeDouble().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeDouble() {
		return getPrimitiveTypeDouble().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeDouble() {
		return getPrimitiveTypeDouble().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeDouble().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeDouble() {
		return getPrimitiveTypeDouble().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeDouble().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeDouble().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__CheckTypes_FWD__Match() {
		return getPrimitiveTypeDouble().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsAppropriate_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeDouble().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeDouble().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsApplicable_BWD__Match() {
		return getPrimitiveTypeDouble().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__RegisterObjectsToMatch_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeDouble().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsAppropriate_solveCsp_BWD__Match_PrimitiveType() {
		return getPrimitiveTypeDouble().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeDouble().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsApplicable_solveCsp_BWD__IsApplicableMatch_PrimitiveType() {
		return getPrimitiveTypeDouble().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeDouble().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getPrimitiveTypeDouble().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__CheckTypes_BWD__Match() {
		return getPrimitiveTypeDouble().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsAppropriate_BWD_PrimitiveType_8__PrimitiveType() {
		return getPrimitiveTypeDouble().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsAppropriate_FWD_PrimitiveTypeDouble_0__PrimitiveTypeDouble() {
		return getPrimitiveTypeDouble().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeDouble().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeDouble().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeDouble().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsApplicable_solveCsp_CC__PrimitiveType_PrimitiveTypeDouble_Match_Match() {
		return getPrimitiveTypeDouble().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeDouble().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__CheckDEC_FWD__PrimitiveTypeDouble() {
		return getPrimitiveTypeDouble().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__CheckDEC_BWD__PrimitiveType() {
		return getPrimitiveTypeDouble().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__GenerateModel__RuleEntryContainer() {
		return getPrimitiveTypeDouble().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getPrimitiveTypeDouble().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeDouble__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeDouble().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstructorDec2OperationWithModifier() {
		if (constructorDec2OperationWithModifierEClass == null) {
			constructorDec2OperationWithModifierEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(91);
		}
		return constructorDec2OperationWithModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsAppropriate_FWD__Match_MConstructorDefinition_Modifier() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__Perform_FWD__IsApplicableMatch() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsApplicable_FWD__Match() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__RegisterObjectsToMatch_FWD__Match_MConstructorDefinition_Modifier() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsAppropriate_solveCsp_FWD__Match_MConstructorDefinition_Modifier() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsAppropriate_checkCsp_FWD__CSP() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsApplicable_solveCsp_FWD__IsApplicableMatch_MConstructorDefinition_Modifier() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsApplicable_checkCsp_FWD__CSP() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__CheckTypes_FWD__Match() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsAppropriate_BWD__Match_Operation_Comment() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__Perform_BWD__IsApplicableMatch() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsApplicable_BWD__Match() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__RegisterObjectsToMatch_BWD__Match_Operation_Comment() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsAppropriate_solveCsp_BWD__Match_Operation_Comment() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsAppropriate_checkCsp_BWD__CSP() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsApplicable_solveCsp_BWD__IsApplicableMatch_Operation_Comment() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsApplicable_checkCsp_BWD__CSP() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__CheckTypes_BWD__Match() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsAppropriate_BWD_EMoflonEdge_146__EMoflonEdge() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsAppropriate_FWD_EMoflonEdge_158__EMoflonEdge() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__CheckAttributes_FWD__TripleMatch() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__CheckAttributes_BWD__TripleMatch() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsApplicable_CC__Match_Match() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsApplicable_solveCsp_CC__Operation_MConstructorDefinition_Modifier_Comment_Match_Match() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__IsApplicable_checkCsp_CC__CSP() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__CheckDEC_FWD__MConstructorDefinition_Modifier() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__CheckDEC_BWD__Operation_Comment() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__GenerateModel__RuleEntryContainer() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDec2OperationWithModifier__GenerateModel_checkCsp_BWD__CSP() {
		return getConstructorDec2OperationWithModifier().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RulesFactory getRulesFactory() {
		return (RulesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.gravity.tgg.modisco.uml.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
