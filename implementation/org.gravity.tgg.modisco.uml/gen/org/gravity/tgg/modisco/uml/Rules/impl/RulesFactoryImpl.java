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
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE_WITH_MODIFIER:
			return createConstructorDec2Operation4InterfaceWithModifier();
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_ENUM:
			return createConstructorDec2Operation4Enum();
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_CLASS:
			return createInnerInterfaceDeclaration2InnerInterface_InClass();
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER:
			return createAnonymousClass_WithModifier();
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_INTERFACE_ABSTRACT:
			return createInnerDeclaration2InnerClassifier_InInterface_Abstract();
		case RulesPackage.VARIABLE_DEC2_PARAMETER4:
			return createVariableDec2Parameter4();
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ABSTRACT:
			return createConstructorDec2Operation_Abstract();
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE:
			return createJavaModel2UmlModelRule();
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT:
			return createManifestation4CompilationUnit2Artifact();
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_BODY_DECLARATION:
			return createJavaAnnotation2Comment4BodyDeclaration();
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM:
			return createAbstractTypeAccess2ReturnParam();
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER:
			return createFieldDec2Property4Enum_WithModifier();
		case RulesPackage.FIELD_DEC2_PROPERTY4_ABSTRACT:
			return createFieldDec2Property4_Abstract();
		case RulesPackage.PRIMITIVE_TYPE_BOOLEAN:
			return createPrimitiveTypeBoolean();
		case RulesPackage.MODIFIER2_NAMED_ELEMENT_ABSTRACT:
			return createModifier2NamedElement_Abstract();
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD_ABSTRACT:
			return createInnerDeclaration2InnerClassifier_InMethod_Abstract();
		case RulesPackage.PARAMETERIZED_TYPE2_CLASSIFIER_ABSTRACT:
			return createParameterizedType2Classifier_Abstract();
		case RulesPackage.PARAMETERIZED_TYPE2_CLASSIFIER_INNER_TYPE_IN_CLASS_ABSTRACT:
			return createParameterizedType2Classifier_InnerTypeInClass_Abstract();
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_CLASS:
			return createParameterizedType2Class_InnerTypeInClass();
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE:
			return createPrimitiveTypeDouble();
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL:
			return createJavaPackageToUMLPackage_underModel();
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE:
			return createIgnoreOrphanTypesEdge();
		case RulesPackage.PRIMITIVE_TYPE_SHORT:
			return createPrimitiveTypeShort();
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_INTERFACE_WITH_MODIFIER:
			return createInnerInterfaceDeclaration2InnerInterface_InInterface_WithModifier();
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM:
			return createEnumDecWithModifier2Enum();
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM:
			return createMethodDec2Operation4Enum();
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUMERATION_ABSTRACT:
			return createInnerEnumDeclaration2InnerEnumeration_Abstract();
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_CLASS:
			return createConstructorDec2Operation4Class();
		case RulesPackage.METHOD_DEC2_OPERATION4_INTERFACE:
			return createMethodDec2Operation4Interface();
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUMERATION_IN_CLASS_WITH_MODIFIER:
			return createInnerEnumDeclaration2InnerEnumeration_InClass_WithModifier();
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_ENUM_WITH_MODIFIER:
			return createConstructorDec2Operation4EnumWithModifier();
		case RulesPackage.PRIMITIVE_TYPE_CHAR:
			return createPrimitiveTypeChar();
		case RulesPackage.PRIMITIVE_TYPE_FLOAT:
			return createPrimitiveTypeFloat();
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD:
			return createInnerEnumDeclaration2InnerEnum_InMethod();
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_METHOD_IN_INTERFACE:
			return createTypeParameter2Object_InMethod_InInterface();
		case RulesPackage.METHOD_DEC2_OPERATION4_ANONYMOUS:
			return createMethodDec2Operation4Anonymous();
		case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE:
			return createArrayType2NonArrayType();
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION:
			return createTypeAccess2InterfaceRealization();
		case RulesPackage.METHOD_DEC2_OPERATION4_INTERFACE_WITH_MODIFIER:
			return createMethodDec2Operation4InterfaceWithModifier();
		case RulesPackage.INTERFACE_DEC_WITH_MODIFIER2_INTERFACE:
			return createInterfaceDecWithModifier2Interface();
		case RulesPackage.PRIMITIVE_TYPE_BYTE:
			return createPrimitiveTypeByte();
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_ANONYMOUS:
			return createConstructorDec2Operation4Anonymous();
		case RulesPackage.METHOD_DEC2_OPERATION4_ANONYMOUS_WITH_MODIFIER:
			return createMethodDec2Operation4AnonymousWithModifier();
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_ABSTRACT:
			return createInnerClassDeclaration2InnerClass_Abstract();
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS:
			return createOrphanedClassDec2OrphanedClass();
		case RulesPackage.JAVA_ANNOTATION2_COMMENT_ABSTRACT:
			return createJavaAnnotation2Comment_Abstract();
		case RulesPackage.METHOD_DEC2_OPERATION4_CLASS:
			return createMethodDec2Operation4Class();
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS:
			return createParameterizedType2Class();
		case RulesPackage.MODIFIER2_FEATURE_ABSTRACT:
			return createModifier2Feature_Abstract();
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD:
			return createInnerInterfaceDeclaration2InnerInterface_InMethod();
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE:
			return createParameterizedType2Interface();
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_CLASS_WITH_MODIFIER:
			return createConstructorDec2Operation4ClassWithModifier();
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE:
			return createAnnotationTypeDeclaration2Interface();
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER:
			return createMethodDec2Operation4EnumWithModifier();
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE:
			return createJavaPackageToUMLPackage_underPackage();
		case RulesPackage.TYPE_PARAMETER2_OBJECT_ABSTRACT:
			return createTypeParameter2Object_Abstract();
		case RulesPackage.METHOD_DEC2_OPERATION4_CLASS_WITH_MODIFIER:
			return createMethodDec2Operation4ClassWithModifier();
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS:
			return createTypeParameter2Object_InClass();
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS:
			return createFieldDec2Property4Class();
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS_WITH_MODIFIER:
			return createFieldDec2Property4Class_WithModifier();
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE_INNER_TYPE_IN_CLASS:
			return createParameterizedType2Interface_InnerTypeInClass();
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE:
			return createConstructorDec2Operation4Interface();
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE:
			return createFieldDec2Property4Interface();
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE:
			return createParameterizedType2Class_InnerTypeInInterface();
		case RulesPackage.CLASS_DEC_WITH_MODIFIER2_CLASS_IN_PACKAGE:
			return createClassDecWithModifier2Class_InPackage();
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE:
			return createInnerClassDeclaration2InnerClass_InInterface();
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_INTERFACE:
			return createInnerInterfaceDeclaration2InnerInterface_InInterface();
		case RulesPackage.PRIMITIVE_TYPE_LONG:
			return createPrimitiveTypeLong();
		case RulesPackage.FIELD_DECLARATION_TYPE_ACCESS_TYPE2_PROPERTY_TYPE:
			return createFieldDeclarationTypeAccessType2PropertyType();
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION:
			return createJavaAnnotation2Comment4SingleVariableDeclaration();
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION:
			return createTypeAccess2Generalization();
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT:
			return createCompilationUnit2Artifact();
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER:
			return createInnerClassDeclaration2InnerClass_InMethod_withModifier();
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE_WITH_MODIFIER:
			return createInnerClassDeclaration2InnerClass_InInterface_WithModifier();
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_CLASS_WITH_MODIFIER:
			return createInnerClassDeclaration2InnerClass_InClass_WithModifier();
		case RulesPackage.METHOD_DEC2_OPERATION_ABSTRACT:
			return createMethodDec2Operation_Abstract();
		case RulesPackage.CLASS_DEC2_CLASS_IN_PACKAGE:
			return createClassDec2Class_InPackage();
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION:
			return createTypeAccess2InterfaceGeneralization();
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_METHOD_ABSTRACT:
			return createTypeParameter2Object_InMethod_Abstract();
		case RulesPackage.INTERFACE_DEC2_INTERFACE:
			return createInterfaceDec2Interface();
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY:
			return createTypeDependency2UsageDependency();
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM:
			return createFieldDec2Property4Enum();
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_CLASS_WITH_MODIFIER:
			return createInnerInterfaceDeclaration2InnerInterface_InClass_WithModifier();
		case RulesPackage.PRIMITIVE_TYPE_VOID:
			return createPrimitiveTypeVoid();
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD:
			return createInnerClassDeclaration2InnerClass_InMethod();
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUMERATION_IN_CLASS:
			return createInnerEnumDeclaration2InnerEnumeration_InClass();
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE_WITH_MODIFIER:
			return createFieldDec2Property4Interface_WithModifier();
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_CLASS:
			return createInnerClassDeclaration2InnerClass_InClass();
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_ABSTRACT:
			return createInnerDeclaration2InnerClassifier_Abstract();
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUMERATION_IN_INTERFACE_WITH_MODIFIER:
			return createInnerEnumDeclaration2InnerEnumeration_InInterface_WithModifier();
		case RulesPackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE:
			return createPrimitiveType2PrimitiveType();
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUMERATION_IN_INTERFACE:
			return createInnerEnumDeclaration2InnerEnumeration_InInterface();
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_ANONYMOUS_WITH_MODIFIER:
			return createConstructorDec2Operation4AnonymousWithModifier();
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE_INNER_TYPE_IN_INTERFACE:
			return createParameterizedType2Interface_InnerTypeInInterface();
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT:
			return createJavaAnnotationValueEntry2Comment();
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_CLASS_ABSTRACT:
			return createInnerDeclaration2InnerClassifier_InClass_Abstract();
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_INTERFACE:
			return createTypeParameter2Object_InInterface();
		case RulesPackage.PARAMETERIZED_TYPE2_CLASSIFIER_INNER_TYPE_IN_INTERFACE_ABSTRACT:
			return createParameterizedType2Classifier_InnerTypeInInterface_Abstract();
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_METHOD_IN_CLASS:
			return createTypeParameter2Object_InMethod_InClass();
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_ABSTRACT:
			return createInnerInterfaceDeclaration2InnerInterface_Abstract();
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER:
			return createAnnotationTypeDeclaration2Interface_WithModifier();
		case RulesPackage.PRIMITIVE_TYPE_INT:
			return createPrimitiveTypeInt();
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT:
			return createJavaAnnotationValue2Comment();
		case RulesPackage.ENUM_DEC2_ENUM:
			return createEnumDec2Enum();
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
	public ConstructorDec2Operation4InterfaceWithModifier createConstructorDec2Operation4InterfaceWithModifier() {
		ConstructorDec2Operation4InterfaceWithModifierImpl constructorDec2Operation4InterfaceWithModifier = new ConstructorDec2Operation4InterfaceWithModifierImpl();
		return constructorDec2Operation4InterfaceWithModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorDec2Operation4Enum createConstructorDec2Operation4Enum() {
		ConstructorDec2Operation4EnumImpl constructorDec2Operation4Enum = new ConstructorDec2Operation4EnumImpl();
		return constructorDec2Operation4Enum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerInterfaceDeclaration2InnerInterface_InClass createInnerInterfaceDeclaration2InnerInterface_InClass() {
		InnerInterfaceDeclaration2InnerInterface_InClassImpl innerInterfaceDeclaration2InnerInterface_InClass = new InnerInterfaceDeclaration2InnerInterface_InClassImpl();
		return innerInterfaceDeclaration2InnerInterface_InClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClass_WithModifier createAnonymousClass_WithModifier() {
		AnonymousClass_WithModifierImpl anonymousClass_WithModifier = new AnonymousClass_WithModifierImpl();
		return anonymousClass_WithModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerDeclaration2InnerClassifier_InInterface_Abstract createInnerDeclaration2InnerClassifier_InInterface_Abstract() {
		InnerDeclaration2InnerClassifier_InInterface_AbstractImpl innerDeclaration2InnerClassifier_InInterface_Abstract = new InnerDeclaration2InnerClassifier_InInterface_AbstractImpl();
		return innerDeclaration2InnerClassifier_InInterface_Abstract;
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
	public ConstructorDec2Operation_Abstract createConstructorDec2Operation_Abstract() {
		ConstructorDec2Operation_AbstractImpl constructorDec2Operation_Abstract = new ConstructorDec2Operation_AbstractImpl();
		return constructorDec2Operation_Abstract;
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
	public FieldDec2Property4Enum_WithModifier createFieldDec2Property4Enum_WithModifier() {
		FieldDec2Property4Enum_WithModifierImpl fieldDec2Property4Enum_WithModifier = new FieldDec2Property4Enum_WithModifierImpl();
		return fieldDec2Property4Enum_WithModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldDec2Property4_Abstract createFieldDec2Property4_Abstract() {
		FieldDec2Property4_AbstractImpl fieldDec2Property4_Abstract = new FieldDec2Property4_AbstractImpl();
		return fieldDec2Property4_Abstract;
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
	public InnerInterfaceDeclaration2InnerInterface_InInterface_WithModifier createInnerInterfaceDeclaration2InnerInterface_InInterface_WithModifier() {
		InnerInterfaceDeclaration2InnerInterface_InInterface_WithModifierImpl innerInterfaceDeclaration2InnerInterface_InInterface_WithModifier = new InnerInterfaceDeclaration2InnerInterface_InInterface_WithModifierImpl();
		return innerInterfaceDeclaration2InnerInterface_InInterface_WithModifier;
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
	public MethodDec2Operation4Enum createMethodDec2Operation4Enum() {
		MethodDec2Operation4EnumImpl methodDec2Operation4Enum = new MethodDec2Operation4EnumImpl();
		return methodDec2Operation4Enum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerEnumDeclaration2InnerEnumeration_Abstract createInnerEnumDeclaration2InnerEnumeration_Abstract() {
		InnerEnumDeclaration2InnerEnumeration_AbstractImpl innerEnumDeclaration2InnerEnumeration_Abstract = new InnerEnumDeclaration2InnerEnumeration_AbstractImpl();
		return innerEnumDeclaration2InnerEnumeration_Abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorDec2Operation4Class createConstructorDec2Operation4Class() {
		ConstructorDec2Operation4ClassImpl constructorDec2Operation4Class = new ConstructorDec2Operation4ClassImpl();
		return constructorDec2Operation4Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDec2Operation4Interface createMethodDec2Operation4Interface() {
		MethodDec2Operation4InterfaceImpl methodDec2Operation4Interface = new MethodDec2Operation4InterfaceImpl();
		return methodDec2Operation4Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerEnumDeclaration2InnerEnumeration_InClass_WithModifier createInnerEnumDeclaration2InnerEnumeration_InClass_WithModifier() {
		InnerEnumDeclaration2InnerEnumeration_InClass_WithModifierImpl innerEnumDeclaration2InnerEnumeration_InClass_WithModifier = new InnerEnumDeclaration2InnerEnumeration_InClass_WithModifierImpl();
		return innerEnumDeclaration2InnerEnumeration_InClass_WithModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorDec2Operation4EnumWithModifier createConstructorDec2Operation4EnumWithModifier() {
		ConstructorDec2Operation4EnumWithModifierImpl constructorDec2Operation4EnumWithModifier = new ConstructorDec2Operation4EnumWithModifierImpl();
		return constructorDec2Operation4EnumWithModifier;
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
	public InnerEnumDeclaration2InnerEnum_InMethod createInnerEnumDeclaration2InnerEnum_InMethod() {
		InnerEnumDeclaration2InnerEnum_InMethodImpl innerEnumDeclaration2InnerEnum_InMethod = new InnerEnumDeclaration2InnerEnum_InMethodImpl();
		return innerEnumDeclaration2InnerEnum_InMethod;
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
	public MethodDec2Operation4Anonymous createMethodDec2Operation4Anonymous() {
		MethodDec2Operation4AnonymousImpl methodDec2Operation4Anonymous = new MethodDec2Operation4AnonymousImpl();
		return methodDec2Operation4Anonymous;
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
	public MethodDec2Operation4InterfaceWithModifier createMethodDec2Operation4InterfaceWithModifier() {
		MethodDec2Operation4InterfaceWithModifierImpl methodDec2Operation4InterfaceWithModifier = new MethodDec2Operation4InterfaceWithModifierImpl();
		return methodDec2Operation4InterfaceWithModifier;
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
	public ConstructorDec2Operation4Anonymous createConstructorDec2Operation4Anonymous() {
		ConstructorDec2Operation4AnonymousImpl constructorDec2Operation4Anonymous = new ConstructorDec2Operation4AnonymousImpl();
		return constructorDec2Operation4Anonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDec2Operation4AnonymousWithModifier createMethodDec2Operation4AnonymousWithModifier() {
		MethodDec2Operation4AnonymousWithModifierImpl methodDec2Operation4AnonymousWithModifier = new MethodDec2Operation4AnonymousWithModifierImpl();
		return methodDec2Operation4AnonymousWithModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerClassDeclaration2InnerClass_Abstract createInnerClassDeclaration2InnerClass_Abstract() {
		InnerClassDeclaration2InnerClass_AbstractImpl innerClassDeclaration2InnerClass_Abstract = new InnerClassDeclaration2InnerClass_AbstractImpl();
		return innerClassDeclaration2InnerClass_Abstract;
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
	public MethodDec2Operation4Class createMethodDec2Operation4Class() {
		MethodDec2Operation4ClassImpl methodDec2Operation4Class = new MethodDec2Operation4ClassImpl();
		return methodDec2Operation4Class;
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
	public InnerInterfaceDeclaration2InnerInterface_InMethod createInnerInterfaceDeclaration2InnerInterface_InMethod() {
		InnerInterfaceDeclaration2InnerInterface_InMethodImpl innerInterfaceDeclaration2InnerInterface_InMethod = new InnerInterfaceDeclaration2InnerInterface_InMethodImpl();
		return innerInterfaceDeclaration2InnerInterface_InMethod;
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
	public ConstructorDec2Operation4ClassWithModifier createConstructorDec2Operation4ClassWithModifier() {
		ConstructorDec2Operation4ClassWithModifierImpl constructorDec2Operation4ClassWithModifier = new ConstructorDec2Operation4ClassWithModifierImpl();
		return constructorDec2Operation4ClassWithModifier;
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
	public MethodDec2Operation4EnumWithModifier createMethodDec2Operation4EnumWithModifier() {
		MethodDec2Operation4EnumWithModifierImpl methodDec2Operation4EnumWithModifier = new MethodDec2Operation4EnumWithModifierImpl();
		return methodDec2Operation4EnumWithModifier;
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
	public MethodDec2Operation4ClassWithModifier createMethodDec2Operation4ClassWithModifier() {
		MethodDec2Operation4ClassWithModifierImpl methodDec2Operation4ClassWithModifier = new MethodDec2Operation4ClassWithModifierImpl();
		return methodDec2Operation4ClassWithModifier;
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
	public FieldDec2Property4Class_WithModifier createFieldDec2Property4Class_WithModifier() {
		FieldDec2Property4Class_WithModifierImpl fieldDec2Property4Class_WithModifier = new FieldDec2Property4Class_WithModifierImpl();
		return fieldDec2Property4Class_WithModifier;
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
	public ConstructorDec2Operation4Interface createConstructorDec2Operation4Interface() {
		ConstructorDec2Operation4InterfaceImpl constructorDec2Operation4Interface = new ConstructorDec2Operation4InterfaceImpl();
		return constructorDec2Operation4Interface;
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
	public ClassDecWithModifier2Class_InPackage createClassDecWithModifier2Class_InPackage() {
		ClassDecWithModifier2Class_InPackageImpl classDecWithModifier2Class_InPackage = new ClassDecWithModifier2Class_InPackageImpl();
		return classDecWithModifier2Class_InPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerClassDeclaration2InnerClass_InInterface createInnerClassDeclaration2InnerClass_InInterface() {
		InnerClassDeclaration2InnerClass_InInterfaceImpl innerClassDeclaration2InnerClass_InInterface = new InnerClassDeclaration2InnerClass_InInterfaceImpl();
		return innerClassDeclaration2InnerClass_InInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerInterfaceDeclaration2InnerInterface_InInterface createInnerInterfaceDeclaration2InnerInterface_InInterface() {
		InnerInterfaceDeclaration2InnerInterface_InInterfaceImpl innerInterfaceDeclaration2InnerInterface_InInterface = new InnerInterfaceDeclaration2InnerInterface_InInterfaceImpl();
		return innerInterfaceDeclaration2InnerInterface_InInterface;
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
	public InnerClassDeclaration2InnerClass_InMethod_withModifier createInnerClassDeclaration2InnerClass_InMethod_withModifier() {
		InnerClassDeclaration2InnerClass_InMethod_withModifierImpl innerClassDeclaration2InnerClass_InMethod_withModifier = new InnerClassDeclaration2InnerClass_InMethod_withModifierImpl();
		return innerClassDeclaration2InnerClass_InMethod_withModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerClassDeclaration2InnerClass_InInterface_WithModifier createInnerClassDeclaration2InnerClass_InInterface_WithModifier() {
		InnerClassDeclaration2InnerClass_InInterface_WithModifierImpl innerClassDeclaration2InnerClass_InInterface_WithModifier = new InnerClassDeclaration2InnerClass_InInterface_WithModifierImpl();
		return innerClassDeclaration2InnerClass_InInterface_WithModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerClassDeclaration2InnerClass_InClass_WithModifier createInnerClassDeclaration2InnerClass_InClass_WithModifier() {
		InnerClassDeclaration2InnerClass_InClass_WithModifierImpl innerClassDeclaration2InnerClass_InClass_WithModifier = new InnerClassDeclaration2InnerClass_InClass_WithModifierImpl();
		return innerClassDeclaration2InnerClass_InClass_WithModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDec2Operation_Abstract createMethodDec2Operation_Abstract() {
		MethodDec2Operation_AbstractImpl methodDec2Operation_Abstract = new MethodDec2Operation_AbstractImpl();
		return methodDec2Operation_Abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDec2Class_InPackage createClassDec2Class_InPackage() {
		ClassDec2Class_InPackageImpl classDec2Class_InPackage = new ClassDec2Class_InPackageImpl();
		return classDec2Class_InPackage;
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
	public InnerInterfaceDeclaration2InnerInterface_InClass_WithModifier createInnerInterfaceDeclaration2InnerInterface_InClass_WithModifier() {
		InnerInterfaceDeclaration2InnerInterface_InClass_WithModifierImpl innerInterfaceDeclaration2InnerInterface_InClass_WithModifier = new InnerInterfaceDeclaration2InnerInterface_InClass_WithModifierImpl();
		return innerInterfaceDeclaration2InnerInterface_InClass_WithModifier;
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
	public InnerClassDeclaration2InnerClass_InMethod createInnerClassDeclaration2InnerClass_InMethod() {
		InnerClassDeclaration2InnerClass_InMethodImpl innerClassDeclaration2InnerClass_InMethod = new InnerClassDeclaration2InnerClass_InMethodImpl();
		return innerClassDeclaration2InnerClass_InMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerEnumDeclaration2InnerEnumeration_InClass createInnerEnumDeclaration2InnerEnumeration_InClass() {
		InnerEnumDeclaration2InnerEnumeration_InClassImpl innerEnumDeclaration2InnerEnumeration_InClass = new InnerEnumDeclaration2InnerEnumeration_InClassImpl();
		return innerEnumDeclaration2InnerEnumeration_InClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldDec2Property4Interface_WithModifier createFieldDec2Property4Interface_WithModifier() {
		FieldDec2Property4Interface_WithModifierImpl fieldDec2Property4Interface_WithModifier = new FieldDec2Property4Interface_WithModifierImpl();
		return fieldDec2Property4Interface_WithModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerClassDeclaration2InnerClass_InClass createInnerClassDeclaration2InnerClass_InClass() {
		InnerClassDeclaration2InnerClass_InClassImpl innerClassDeclaration2InnerClass_InClass = new InnerClassDeclaration2InnerClass_InClassImpl();
		return innerClassDeclaration2InnerClass_InClass;
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
	public InnerEnumDeclaration2InnerEnumeration_InInterface_WithModifier createInnerEnumDeclaration2InnerEnumeration_InInterface_WithModifier() {
		InnerEnumDeclaration2InnerEnumeration_InInterface_WithModifierImpl innerEnumDeclaration2InnerEnumeration_InInterface_WithModifier = new InnerEnumDeclaration2InnerEnumeration_InInterface_WithModifierImpl();
		return innerEnumDeclaration2InnerEnumeration_InInterface_WithModifier;
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
	public InnerEnumDeclaration2InnerEnumeration_InInterface createInnerEnumDeclaration2InnerEnumeration_InInterface() {
		InnerEnumDeclaration2InnerEnumeration_InInterfaceImpl innerEnumDeclaration2InnerEnumeration_InInterface = new InnerEnumDeclaration2InnerEnumeration_InInterfaceImpl();
		return innerEnumDeclaration2InnerEnumeration_InInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorDec2Operation4AnonymousWithModifier createConstructorDec2Operation4AnonymousWithModifier() {
		ConstructorDec2Operation4AnonymousWithModifierImpl constructorDec2Operation4AnonymousWithModifier = new ConstructorDec2Operation4AnonymousWithModifierImpl();
		return constructorDec2Operation4AnonymousWithModifier;
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
	public InnerDeclaration2InnerClassifier_InClass_Abstract createInnerDeclaration2InnerClassifier_InClass_Abstract() {
		InnerDeclaration2InnerClassifier_InClass_AbstractImpl innerDeclaration2InnerClassifier_InClass_Abstract = new InnerDeclaration2InnerClassifier_InClass_AbstractImpl();
		return innerDeclaration2InnerClassifier_InClass_Abstract;
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
	public InnerInterfaceDeclaration2InnerInterface_Abstract createInnerInterfaceDeclaration2InnerInterface_Abstract() {
		InnerInterfaceDeclaration2InnerInterface_AbstractImpl innerInterfaceDeclaration2InnerInterface_Abstract = new InnerInterfaceDeclaration2InnerInterface_AbstractImpl();
		return innerInterfaceDeclaration2InnerInterface_Abstract;
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
