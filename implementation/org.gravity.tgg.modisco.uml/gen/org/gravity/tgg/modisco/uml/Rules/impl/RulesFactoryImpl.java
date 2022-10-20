/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.tgg.modisco.uml.Rules.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory) EPackage.Registry.INSTANCE.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
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
		case RulesPackage.ANONYMOUS_CLASS4_ABSTRACT:
			return createAnonymousClass4_Abstract();
		case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE:
			return createArrayType2NonArrayType();
		case RulesPackage.VARIABLE_DEC2_PARAMETER4:
			return createVariableDec2Parameter4();
		case RulesPackage.ENUM_DEC2_ENUM:
			return createEnumDec2Enum();
		case RulesPackage.CLASS_DEC_WITH_MODIFIER2_CLASS:
			return createClassDecWithModifier2Class();
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE:
			return createJavaPackageToUMLPackage_underPackage();
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_CLASS:
			return createInnerDeclaration2InnerClassifier_InClass();
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_INTERFACE:
			return createInnerDeclaration2InnerClassifier_InInterface();
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD_ABSTRACT:
			return createInnerDeclaration2InnerClassifier_InMethod_Abstract();
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT:
			return createManifestation4CompilationUnit2Artifact();
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION:
			return createConstructorDec2Operation();
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM:
			return createInnerDeclaration2InnerClassifier_InEnum();
		case RulesPackage.ORPHANDED_PRIMITIVE2_PRIMITIVE_TYPE:
			return createOrphandedPrimitive2PrimitiveType();
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_PACKAGE:
			return createAnonymousClass4EnumConstInPackage();
		case RulesPackage.MODIFIER2_NAMED_ELEMENT_ABSTRACT:
			return createModifier2NamedElement_Abstract();
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE:
			return createAnnotationTypeDeclaration2Interface();
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE:
			return createJavaModel2UmlModelRule();
		case RulesPackage.PRIMITIVE_TYPE_BOOLEAN:
			return createPrimitiveTypeBoolean();
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_INTERFACE:
			return createInnerDeclaration2InnerClassifier_InMethod4Interface();
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE:
			return createFieldDec2Property4Interface();
		case RulesPackage.MODIFIER2_FEATURE_ABSTRACT:
			return createModifier2Feature_Abstract();
		case RulesPackage.PRIMITIVE_TYPE_LONG:
			return createPrimitiveTypeLong();
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE_INNER_TYPE_IN_CLASS:
			return createParameterizedType2Interface_InnerTypeInClass();
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS:
			return createInnerDeclaration2InnerClassifier_InAnonymous();
		case RulesPackage.OPERATION_IN_ANNOTATION_TYPE:
			return createOperationInAnnotationType();
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION:
			return createTypeAccess2InterfaceGeneralization();
		case RulesPackage.TYPE_PARAMETER2_OBJECT_ABSTRACT:
			return createTypeParameter2Object_Abstract();
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_METHOD_IN_CLASS:
			return createTypeParameter2Object_InMethod_InClass();
		case RulesPackage.PRIMITIVE_TYPE_SHORT:
			return createPrimitiveTypeShort();
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_METHOD_ABSTRACT:
			return createTypeParameter2Object_InMethod_Abstract();
		case RulesPackage.ANONYMOUS_CLASS4_CLASS:
			return createAnonymousClass4Class();
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_CLASS:
			return createInnerDeclaration2InnerClassifier_InMethod4Class();
		case RulesPackage.PARAMETERIZED_TYPE2_CLASSIFIER_ABSTRACT:
			return createParameterizedType2Classifier_Abstract();
		case RulesPackage.PARAMETERIZED_TYPE2_CLASSIFIER_INNER_TYPE_IN_INTERFACE_ABSTRACT:
			return createParameterizedType2Classifier_InnerTypeInInterface_Abstract();
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL:
			return createJavaPackageToUMLPackage_underModel();
		case RulesPackage.ORPHANED_TYPE_DEC2_ORPHANED_TYPE_ABSTRACT:
			return createOrphanedTypeDec2OrphanedType_Abstract();
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT:
			return createJavaAnnotationValueEntry2Comment();
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM:
			return createAbstractTypeAccess2ReturnParam();
		case RulesPackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE:
			return createPrimitiveType2PrimitiveType();
		case RulesPackage.ANONYMOUS_CLASS4_INTERFACE:
			return createAnonymousClass4Interface();
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS:
			return createFieldDec2Property4Class();
		case RulesPackage.PARAMETERIZED_TYPE2_CLASSIFIER_INNER_TYPE_IN_CLASS_ABSTRACT:
			return createParameterizedType2Classifier_InnerTypeInClass_Abstract();
		case RulesPackage.INTERFACE_DEC2_INTERFACE:
			return createInterfaceDec2Interface();
		case RulesPackage.OPERATION_IN_CLASS:
			return createOperationInClass();
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_INTERFACE:
			return createTypeParameter2Object_InInterface();
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE:
			return createAnonymousClass4EnumConstInType();
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM:
			return createEnumDecWithModifier2Enum();
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS:
			return createParameterizedType2Class();
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM:
			return createFieldDec2Property4Enum();
		case RulesPackage.PRIMITIVE_TYPE_FLOAT:
			return createPrimitiveTypeFloat();
		case RulesPackage.INTERFACE_DEC_WITH_MODIFIER2_INTERFACE:
			return createInterfaceDecWithModifier2Interface();
		case RulesPackage.CLASS_DEC2_CLASS:
			return createClassDec2Class();
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS:
			return createTypeParameter2Object_InClass();
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION:
			return createTypeAccess2Generalization();
		case RulesPackage.PRIMITIVE_TYPE_CHAR:
			return createPrimitiveTypeChar();
		case RulesPackage.OPERATION_IN_ANONYMOUS:
			return createOperationInAnonymous();
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE:
			return createIgnoreOrphanTypesEdge();
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANNOTATION_TYPE:
			return createInnerDeclaration2InnerClassifier_InAnnotationType();
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT:
			return createCompilationUnit2Artifact();
		case RulesPackage.FIELD_DECLARATION_TYPE_ACCESS_TYPE2_PROPERTY_TYPE:
			return createFieldDeclarationTypeAccessType2PropertyType();
		case RulesPackage.METHOD_DEC2_OPERATION_WITH_MODIFIER:
			return createMethodDec2OperationWithModifier();
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION:
			return createJavaAnnotation2Comment4SingleVariableDeclaration();
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE_INNER_TYPE_IN_INTERFACE:
			return createParameterizedType2Interface_InnerTypeInInterface();
		case RulesPackage.OPERATION_IN_INTERFACE:
			return createOperationInInterface();
		case RulesPackage.FIELD_DEC2_PROPERTY4_ANONYMOUS:
			return createFieldDec2Property4_Anonymous();
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS:
			return createAnonymousClass4Anonymous();
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER:
			return createIgnoreClassInstanceCreation4ArrayInitializer();
		case RulesPackage.PRIMITIVE_TYPE_INT:
			return createPrimitiveTypeInt();
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY:
			return createTypeDependency2UsageDependency();
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_ABSTRACT:
			return createAnonymousClass4EnumConst_Abstract();
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER:
			return createAnnotationTypeDeclaration2Interface_WithModifier();
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_ABSTRACT:
			return createInnerDeclaration2InnerClassifier_Abstract();
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_METHOD_IN_INTERFACE:
			return createTypeParameter2Object_InMethod_InInterface();
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS:
			return createOrphanedClassDec2OrphanedClass();
		case RulesPackage.FIELD_DEC2_PROPERTY:
			return createFieldDec2Property();
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE:
			return createParameterizedType2Class_InnerTypeInInterface();
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE:
			return createUnresolvedTypeDeclaration2Type();
		case RulesPackage.LINK_TYPE_TO_PACKAGE:
			return createLinkTypeToPackage();
		case RulesPackage.JAVA_ANNOTATION2_COMMENT_ABSTRACT:
			return createJavaAnnotation2Comment_Abstract();
		case RulesPackage.OPERATION_IN_ENUM:
			return createOperationInEnum();
		case RulesPackage.PRIMITIVE_TYPE_BYTE:
			return createPrimitiveTypeByte();
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS:
			return createInnerDeclaration2InnerClassifier_InMethod4IAnonymous();
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT:
			return createJavaAnnotationValue2Comment();
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER:
			return createFieldDec2Property_WithModifier();
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION:
			return createTypeAccess2InterfaceRealization();
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE:
			return createParameterizedType2Interface();
		case RulesPackage.PRIMITIVE_TYPE_VOID:
			return createPrimitiveTypeVoid();
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_CLASS:
			return createParameterizedType2Class_InnerTypeInClass();
		case RulesPackage.METHOD_DEC2_OPERATION:
			return createMethodDec2Operation();
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_BODY_DECLARATION:
			return createJavaAnnotation2Comment4BodyDeclaration();
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE:
			return createPrimitiveTypeDouble();
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER:
			return createConstructorDec2OperationWithModifier();
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
	public AnonymousClass4_Abstract createAnonymousClass4_Abstract() {
		AnonymousClass4_AbstractImpl anonymousClass4_Abstract = new AnonymousClass4_AbstractImpl();
		return anonymousClass4_Abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayType2NonArrayType createArrayType2NonArrayType() {
		ArrayType2NonArrayTypeImpl arrayType2NonArrayType = new ArrayType2NonArrayTypeImpl();
		return arrayType2NonArrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDec2Parameter4 createVariableDec2Parameter4() {
		VariableDec2Parameter4Impl variableDec2Parameter4 = new VariableDec2Parameter4Impl();
		return variableDec2Parameter4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumDec2Enum createEnumDec2Enum() {
		EnumDec2EnumImpl enumDec2Enum = new EnumDec2EnumImpl();
		return enumDec2Enum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDecWithModifier2Class createClassDecWithModifier2Class() {
		ClassDecWithModifier2ClassImpl classDecWithModifier2Class = new ClassDecWithModifier2ClassImpl();
		return classDecWithModifier2Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaPackageToUMLPackage_underPackage createJavaPackageToUMLPackage_underPackage() {
		JavaPackageToUMLPackage_underPackageImpl javaPackageToUMLPackage_underPackage = new JavaPackageToUMLPackage_underPackageImpl();
		return javaPackageToUMLPackage_underPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerDeclaration2InnerClassifier_InClass createInnerDeclaration2InnerClassifier_InClass() {
		InnerDeclaration2InnerClassifier_InClassImpl innerDeclaration2InnerClassifier_InClass = new InnerDeclaration2InnerClassifier_InClassImpl();
		return innerDeclaration2InnerClassifier_InClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerDeclaration2InnerClassifier_InInterface createInnerDeclaration2InnerClassifier_InInterface() {
		InnerDeclaration2InnerClassifier_InInterfaceImpl innerDeclaration2InnerClassifier_InInterface = new InnerDeclaration2InnerClassifier_InInterfaceImpl();
		return innerDeclaration2InnerClassifier_InInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerDeclaration2InnerClassifier_InMethod_Abstract createInnerDeclaration2InnerClassifier_InMethod_Abstract() {
		InnerDeclaration2InnerClassifier_InMethod_AbstractImpl innerDeclaration2InnerClassifier_InMethod_Abstract = new InnerDeclaration2InnerClassifier_InMethod_AbstractImpl();
		return innerDeclaration2InnerClassifier_InMethod_Abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Manifestation4CompilationUnit2Artifact createManifestation4CompilationUnit2Artifact() {
		Manifestation4CompilationUnit2ArtifactImpl manifestation4CompilationUnit2Artifact = new Manifestation4CompilationUnit2ArtifactImpl();
		return manifestation4CompilationUnit2Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorDec2Operation createConstructorDec2Operation() {
		ConstructorDec2OperationImpl constructorDec2Operation = new ConstructorDec2OperationImpl();
		return constructorDec2Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerDeclaration2InnerClassifier_InEnum createInnerDeclaration2InnerClassifier_InEnum() {
		InnerDeclaration2InnerClassifier_InEnumImpl innerDeclaration2InnerClassifier_InEnum = new InnerDeclaration2InnerClassifier_InEnumImpl();
		return innerDeclaration2InnerClassifier_InEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrphandedPrimitive2PrimitiveType createOrphandedPrimitive2PrimitiveType() {
		OrphandedPrimitive2PrimitiveTypeImpl orphandedPrimitive2PrimitiveType = new OrphandedPrimitive2PrimitiveTypeImpl();
		return orphandedPrimitive2PrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClass4EnumConstInPackage createAnonymousClass4EnumConstInPackage() {
		AnonymousClass4EnumConstInPackageImpl anonymousClass4EnumConstInPackage = new AnonymousClass4EnumConstInPackageImpl();
		return anonymousClass4EnumConstInPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier2NamedElement_Abstract createModifier2NamedElement_Abstract() {
		Modifier2NamedElement_AbstractImpl modifier2NamedElement_Abstract = new Modifier2NamedElement_AbstractImpl();
		return modifier2NamedElement_Abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeDeclaration2Interface createAnnotationTypeDeclaration2Interface() {
		AnnotationTypeDeclaration2InterfaceImpl annotationTypeDeclaration2Interface = new AnnotationTypeDeclaration2InterfaceImpl();
		return annotationTypeDeclaration2Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaModel2UmlModelRule createJavaModel2UmlModelRule() {
		JavaModel2UmlModelRuleImpl javaModel2UmlModelRule = new JavaModel2UmlModelRuleImpl();
		return javaModel2UmlModelRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeBoolean createPrimitiveTypeBoolean() {
		PrimitiveTypeBooleanImpl primitiveTypeBoolean = new PrimitiveTypeBooleanImpl();
		return primitiveTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerDeclaration2InnerClassifier_InMethod4Interface createInnerDeclaration2InnerClassifier_InMethod4Interface() {
		InnerDeclaration2InnerClassifier_InMethod4InterfaceImpl innerDeclaration2InnerClassifier_InMethod4Interface = new InnerDeclaration2InnerClassifier_InMethod4InterfaceImpl();
		return innerDeclaration2InnerClassifier_InMethod4Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldDec2Property4Interface createFieldDec2Property4Interface() {
		FieldDec2Property4InterfaceImpl fieldDec2Property4Interface = new FieldDec2Property4InterfaceImpl();
		return fieldDec2Property4Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier2Feature_Abstract createModifier2Feature_Abstract() {
		Modifier2Feature_AbstractImpl modifier2Feature_Abstract = new Modifier2Feature_AbstractImpl();
		return modifier2Feature_Abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeLong createPrimitiveTypeLong() {
		PrimitiveTypeLongImpl primitiveTypeLong = new PrimitiveTypeLongImpl();
		return primitiveTypeLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType2Interface_InnerTypeInClass createParameterizedType2Interface_InnerTypeInClass() {
		ParameterizedType2Interface_InnerTypeInClassImpl parameterizedType2Interface_InnerTypeInClass = new ParameterizedType2Interface_InnerTypeInClassImpl();
		return parameterizedType2Interface_InnerTypeInClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerDeclaration2InnerClassifier_InAnonymous createInnerDeclaration2InnerClassifier_InAnonymous() {
		InnerDeclaration2InnerClassifier_InAnonymousImpl innerDeclaration2InnerClassifier_InAnonymous = new InnerDeclaration2InnerClassifier_InAnonymousImpl();
		return innerDeclaration2InnerClassifier_InAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationInAnnotationType createOperationInAnnotationType() {
		OperationInAnnotationTypeImpl operationInAnnotationType = new OperationInAnnotationTypeImpl();
		return operationInAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess2InterfaceGeneralization createTypeAccess2InterfaceGeneralization() {
		TypeAccess2InterfaceGeneralizationImpl typeAccess2InterfaceGeneralization = new TypeAccess2InterfaceGeneralizationImpl();
		return typeAccess2InterfaceGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameter2Object_Abstract createTypeParameter2Object_Abstract() {
		TypeParameter2Object_AbstractImpl typeParameter2Object_Abstract = new TypeParameter2Object_AbstractImpl();
		return typeParameter2Object_Abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameter2Object_InMethod_InClass createTypeParameter2Object_InMethod_InClass() {
		TypeParameter2Object_InMethod_InClassImpl typeParameter2Object_InMethod_InClass = new TypeParameter2Object_InMethod_InClassImpl();
		return typeParameter2Object_InMethod_InClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeShort createPrimitiveTypeShort() {
		PrimitiveTypeShortImpl primitiveTypeShort = new PrimitiveTypeShortImpl();
		return primitiveTypeShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameter2Object_InMethod_Abstract createTypeParameter2Object_InMethod_Abstract() {
		TypeParameter2Object_InMethod_AbstractImpl typeParameter2Object_InMethod_Abstract = new TypeParameter2Object_InMethod_AbstractImpl();
		return typeParameter2Object_InMethod_Abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClass4Class createAnonymousClass4Class() {
		AnonymousClass4ClassImpl anonymousClass4Class = new AnonymousClass4ClassImpl();
		return anonymousClass4Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerDeclaration2InnerClassifier_InMethod4Class createInnerDeclaration2InnerClassifier_InMethod4Class() {
		InnerDeclaration2InnerClassifier_InMethod4ClassImpl innerDeclaration2InnerClassifier_InMethod4Class = new InnerDeclaration2InnerClassifier_InMethod4ClassImpl();
		return innerDeclaration2InnerClassifier_InMethod4Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType2Classifier_Abstract createParameterizedType2Classifier_Abstract() {
		ParameterizedType2Classifier_AbstractImpl parameterizedType2Classifier_Abstract = new ParameterizedType2Classifier_AbstractImpl();
		return parameterizedType2Classifier_Abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType2Classifier_InnerTypeInInterface_Abstract createParameterizedType2Classifier_InnerTypeInInterface_Abstract() {
		ParameterizedType2Classifier_InnerTypeInInterface_AbstractImpl parameterizedType2Classifier_InnerTypeInInterface_Abstract = new ParameterizedType2Classifier_InnerTypeInInterface_AbstractImpl();
		return parameterizedType2Classifier_InnerTypeInInterface_Abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaPackageToUMLPackage_underModel createJavaPackageToUMLPackage_underModel() {
		JavaPackageToUMLPackage_underModelImpl javaPackageToUMLPackage_underModel = new JavaPackageToUMLPackage_underModelImpl();
		return javaPackageToUMLPackage_underModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrphanedTypeDec2OrphanedType_Abstract createOrphanedTypeDec2OrphanedType_Abstract() {
		OrphanedTypeDec2OrphanedType_AbstractImpl orphanedTypeDec2OrphanedType_Abstract = new OrphanedTypeDec2OrphanedType_AbstractImpl();
		return orphanedTypeDec2OrphanedType_Abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaAnnotationValueEntry2Comment createJavaAnnotationValueEntry2Comment() {
		JavaAnnotationValueEntry2CommentImpl javaAnnotationValueEntry2Comment = new JavaAnnotationValueEntry2CommentImpl();
		return javaAnnotationValueEntry2Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTypeAccess2ReturnParam createAbstractTypeAccess2ReturnParam() {
		AbstractTypeAccess2ReturnParamImpl abstractTypeAccess2ReturnParam = new AbstractTypeAccess2ReturnParamImpl();
		return abstractTypeAccess2ReturnParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType2PrimitiveType createPrimitiveType2PrimitiveType() {
		PrimitiveType2PrimitiveTypeImpl primitiveType2PrimitiveType = new PrimitiveType2PrimitiveTypeImpl();
		return primitiveType2PrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClass4Interface createAnonymousClass4Interface() {
		AnonymousClass4InterfaceImpl anonymousClass4Interface = new AnonymousClass4InterfaceImpl();
		return anonymousClass4Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldDec2Property4Class createFieldDec2Property4Class() {
		FieldDec2Property4ClassImpl fieldDec2Property4Class = new FieldDec2Property4ClassImpl();
		return fieldDec2Property4Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType2Classifier_InnerTypeInClass_Abstract createParameterizedType2Classifier_InnerTypeInClass_Abstract() {
		ParameterizedType2Classifier_InnerTypeInClass_AbstractImpl parameterizedType2Classifier_InnerTypeInClass_Abstract = new ParameterizedType2Classifier_InnerTypeInClass_AbstractImpl();
		return parameterizedType2Classifier_InnerTypeInClass_Abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDec2Interface createInterfaceDec2Interface() {
		InterfaceDec2InterfaceImpl interfaceDec2Interface = new InterfaceDec2InterfaceImpl();
		return interfaceDec2Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationInClass createOperationInClass() {
		OperationInClassImpl operationInClass = new OperationInClassImpl();
		return operationInClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameter2Object_InInterface createTypeParameter2Object_InInterface() {
		TypeParameter2Object_InInterfaceImpl typeParameter2Object_InInterface = new TypeParameter2Object_InInterfaceImpl();
		return typeParameter2Object_InInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClass4EnumConstInType createAnonymousClass4EnumConstInType() {
		AnonymousClass4EnumConstInTypeImpl anonymousClass4EnumConstInType = new AnonymousClass4EnumConstInTypeImpl();
		return anonymousClass4EnumConstInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumDecWithModifier2Enum createEnumDecWithModifier2Enum() {
		EnumDecWithModifier2EnumImpl enumDecWithModifier2Enum = new EnumDecWithModifier2EnumImpl();
		return enumDecWithModifier2Enum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType2Class createParameterizedType2Class() {
		ParameterizedType2ClassImpl parameterizedType2Class = new ParameterizedType2ClassImpl();
		return parameterizedType2Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldDec2Property4Enum createFieldDec2Property4Enum() {
		FieldDec2Property4EnumImpl fieldDec2Property4Enum = new FieldDec2Property4EnumImpl();
		return fieldDec2Property4Enum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeFloat createPrimitiveTypeFloat() {
		PrimitiveTypeFloatImpl primitiveTypeFloat = new PrimitiveTypeFloatImpl();
		return primitiveTypeFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDecWithModifier2Interface createInterfaceDecWithModifier2Interface() {
		InterfaceDecWithModifier2InterfaceImpl interfaceDecWithModifier2Interface = new InterfaceDecWithModifier2InterfaceImpl();
		return interfaceDecWithModifier2Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDec2Class createClassDec2Class() {
		ClassDec2ClassImpl classDec2Class = new ClassDec2ClassImpl();
		return classDec2Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameter2Object_InClass createTypeParameter2Object_InClass() {
		TypeParameter2Object_InClassImpl typeParameter2Object_InClass = new TypeParameter2Object_InClassImpl();
		return typeParameter2Object_InClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess2Generalization createTypeAccess2Generalization() {
		TypeAccess2GeneralizationImpl typeAccess2Generalization = new TypeAccess2GeneralizationImpl();
		return typeAccess2Generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeChar createPrimitiveTypeChar() {
		PrimitiveTypeCharImpl primitiveTypeChar = new PrimitiveTypeCharImpl();
		return primitiveTypeChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationInAnonymous createOperationInAnonymous() {
		OperationInAnonymousImpl operationInAnonymous = new OperationInAnonymousImpl();
		return operationInAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IgnoreOrphanTypesEdge createIgnoreOrphanTypesEdge() {
		IgnoreOrphanTypesEdgeImpl ignoreOrphanTypesEdge = new IgnoreOrphanTypesEdgeImpl();
		return ignoreOrphanTypesEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerDeclaration2InnerClassifier_InAnnotationType createInnerDeclaration2InnerClassifier_InAnnotationType() {
		InnerDeclaration2InnerClassifier_InAnnotationTypeImpl innerDeclaration2InnerClassifier_InAnnotationType = new InnerDeclaration2InnerClassifier_InAnnotationTypeImpl();
		return innerDeclaration2InnerClassifier_InAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompilationUnit2Artifact createCompilationUnit2Artifact() {
		CompilationUnit2ArtifactImpl compilationUnit2Artifact = new CompilationUnit2ArtifactImpl();
		return compilationUnit2Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldDeclarationTypeAccessType2PropertyType createFieldDeclarationTypeAccessType2PropertyType() {
		FieldDeclarationTypeAccessType2PropertyTypeImpl fieldDeclarationTypeAccessType2PropertyType = new FieldDeclarationTypeAccessType2PropertyTypeImpl();
		return fieldDeclarationTypeAccessType2PropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDec2OperationWithModifier createMethodDec2OperationWithModifier() {
		MethodDec2OperationWithModifierImpl methodDec2OperationWithModifier = new MethodDec2OperationWithModifierImpl();
		return methodDec2OperationWithModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaAnnotation2Comment4SingleVariableDeclaration createJavaAnnotation2Comment4SingleVariableDeclaration() {
		JavaAnnotation2Comment4SingleVariableDeclarationImpl javaAnnotation2Comment4SingleVariableDeclaration = new JavaAnnotation2Comment4SingleVariableDeclarationImpl();
		return javaAnnotation2Comment4SingleVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType2Interface_InnerTypeInInterface createParameterizedType2Interface_InnerTypeInInterface() {
		ParameterizedType2Interface_InnerTypeInInterfaceImpl parameterizedType2Interface_InnerTypeInInterface = new ParameterizedType2Interface_InnerTypeInInterfaceImpl();
		return parameterizedType2Interface_InnerTypeInInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationInInterface createOperationInInterface() {
		OperationInInterfaceImpl operationInInterface = new OperationInInterfaceImpl();
		return operationInInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldDec2Property4_Anonymous createFieldDec2Property4_Anonymous() {
		FieldDec2Property4_AnonymousImpl fieldDec2Property4_Anonymous = new FieldDec2Property4_AnonymousImpl();
		return fieldDec2Property4_Anonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClass4Anonymous createAnonymousClass4Anonymous() {
		AnonymousClass4AnonymousImpl anonymousClass4Anonymous = new AnonymousClass4AnonymousImpl();
		return anonymousClass4Anonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IgnoreClassInstanceCreation4ArrayInitializer createIgnoreClassInstanceCreation4ArrayInitializer() {
		IgnoreClassInstanceCreation4ArrayInitializerImpl ignoreClassInstanceCreation4ArrayInitializer = new IgnoreClassInstanceCreation4ArrayInitializerImpl();
		return ignoreClassInstanceCreation4ArrayInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeInt createPrimitiveTypeInt() {
		PrimitiveTypeIntImpl primitiveTypeInt = new PrimitiveTypeIntImpl();
		return primitiveTypeInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDependency2UsageDependency createTypeDependency2UsageDependency() {
		TypeDependency2UsageDependencyImpl typeDependency2UsageDependency = new TypeDependency2UsageDependencyImpl();
		return typeDependency2UsageDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClass4EnumConst_Abstract createAnonymousClass4EnumConst_Abstract() {
		AnonymousClass4EnumConst_AbstractImpl anonymousClass4EnumConst_Abstract = new AnonymousClass4EnumConst_AbstractImpl();
		return anonymousClass4EnumConst_Abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeDeclaration2Interface_WithModifier createAnnotationTypeDeclaration2Interface_WithModifier() {
		AnnotationTypeDeclaration2Interface_WithModifierImpl annotationTypeDeclaration2Interface_WithModifier = new AnnotationTypeDeclaration2Interface_WithModifierImpl();
		return annotationTypeDeclaration2Interface_WithModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerDeclaration2InnerClassifier_Abstract createInnerDeclaration2InnerClassifier_Abstract() {
		InnerDeclaration2InnerClassifier_AbstractImpl innerDeclaration2InnerClassifier_Abstract = new InnerDeclaration2InnerClassifier_AbstractImpl();
		return innerDeclaration2InnerClassifier_Abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameter2Object_InMethod_InInterface createTypeParameter2Object_InMethod_InInterface() {
		TypeParameter2Object_InMethod_InInterfaceImpl typeParameter2Object_InMethod_InInterface = new TypeParameter2Object_InMethod_InInterfaceImpl();
		return typeParameter2Object_InMethod_InInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrphanedClassDec2OrphanedClass createOrphanedClassDec2OrphanedClass() {
		OrphanedClassDec2OrphanedClassImpl orphanedClassDec2OrphanedClass = new OrphanedClassDec2OrphanedClassImpl();
		return orphanedClassDec2OrphanedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldDec2Property createFieldDec2Property() {
		FieldDec2PropertyImpl fieldDec2Property = new FieldDec2PropertyImpl();
		return fieldDec2Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType2Class_InnerTypeInInterface createParameterizedType2Class_InnerTypeInInterface() {
		ParameterizedType2Class_InnerTypeInInterfaceImpl parameterizedType2Class_InnerTypeInInterface = new ParameterizedType2Class_InnerTypeInInterfaceImpl();
		return parameterizedType2Class_InnerTypeInInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedTypeDeclaration2Type createUnresolvedTypeDeclaration2Type() {
		UnresolvedTypeDeclaration2TypeImpl unresolvedTypeDeclaration2Type = new UnresolvedTypeDeclaration2TypeImpl();
		return unresolvedTypeDeclaration2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkTypeToPackage createLinkTypeToPackage() {
		LinkTypeToPackageImpl linkTypeToPackage = new LinkTypeToPackageImpl();
		return linkTypeToPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaAnnotation2Comment_Abstract createJavaAnnotation2Comment_Abstract() {
		JavaAnnotation2Comment_AbstractImpl javaAnnotation2Comment_Abstract = new JavaAnnotation2Comment_AbstractImpl();
		return javaAnnotation2Comment_Abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationInEnum createOperationInEnum() {
		OperationInEnumImpl operationInEnum = new OperationInEnumImpl();
		return operationInEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeByte createPrimitiveTypeByte() {
		PrimitiveTypeByteImpl primitiveTypeByte = new PrimitiveTypeByteImpl();
		return primitiveTypeByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerDeclaration2InnerClassifier_InMethod4IAnonymous createInnerDeclaration2InnerClassifier_InMethod4IAnonymous() {
		InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl innerDeclaration2InnerClassifier_InMethod4IAnonymous = new InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl();
		return innerDeclaration2InnerClassifier_InMethod4IAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaAnnotationValue2Comment createJavaAnnotationValue2Comment() {
		JavaAnnotationValue2CommentImpl javaAnnotationValue2Comment = new JavaAnnotationValue2CommentImpl();
		return javaAnnotationValue2Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldDec2Property_WithModifier createFieldDec2Property_WithModifier() {
		FieldDec2Property_WithModifierImpl fieldDec2Property_WithModifier = new FieldDec2Property_WithModifierImpl();
		return fieldDec2Property_WithModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess2InterfaceRealization createTypeAccess2InterfaceRealization() {
		TypeAccess2InterfaceRealizationImpl typeAccess2InterfaceRealization = new TypeAccess2InterfaceRealizationImpl();
		return typeAccess2InterfaceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType2Interface createParameterizedType2Interface() {
		ParameterizedType2InterfaceImpl parameterizedType2Interface = new ParameterizedType2InterfaceImpl();
		return parameterizedType2Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeVoid createPrimitiveTypeVoid() {
		PrimitiveTypeVoidImpl primitiveTypeVoid = new PrimitiveTypeVoidImpl();
		return primitiveTypeVoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType2Class_InnerTypeInClass createParameterizedType2Class_InnerTypeInClass() {
		ParameterizedType2Class_InnerTypeInClassImpl parameterizedType2Class_InnerTypeInClass = new ParameterizedType2Class_InnerTypeInClassImpl();
		return parameterizedType2Class_InnerTypeInClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDec2Operation createMethodDec2Operation() {
		MethodDec2OperationImpl methodDec2Operation = new MethodDec2OperationImpl();
		return methodDec2Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaAnnotation2Comment4BodyDeclaration createJavaAnnotation2Comment4BodyDeclaration() {
		JavaAnnotation2Comment4BodyDeclarationImpl javaAnnotation2Comment4BodyDeclaration = new JavaAnnotation2Comment4BodyDeclarationImpl();
		return javaAnnotation2Comment4BodyDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeDouble createPrimitiveTypeDouble() {
		PrimitiveTypeDoubleImpl primitiveTypeDouble = new PrimitiveTypeDoubleImpl();
		return primitiveTypeDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorDec2OperationWithModifier createConstructorDec2OperationWithModifier() {
		ConstructorDec2OperationWithModifierImpl constructorDec2OperationWithModifier = new ConstructorDec2OperationWithModifierImpl();
		return constructorDec2OperationWithModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RulesPackage getRulesPackage() {
		return (RulesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
