/**
 */
package org.gravity.tgg.modisco.pm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.tgg.modisco.pm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PmFactoryImpl extends EFactoryImpl implements PmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PmFactory init() {
		try {
			PmFactory thePmFactory = (PmFactory) EPackage.Registry.INSTANCE.getEFactory(PmPackage.eNS_URI);
			if (thePmFactory != null) {
				return thePmFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PmFactoryImpl() {
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
		case PmPackage.TYPE_PARAMETER_TO_TCLASS:
			return createTypeParameterToTClass();
		case PmPackage.MMETHOD_NAME_TO_TMETHOD:
			return createMMethodNameToTMethod();
		case PmPackage.PACKAGE_TO_TPACKAGE:
			return createPackageToTPackage();
		case PmPackage.LITERAL_TO_TNODE:
			return createLiteralToTNode();
		case PmPackage.MODIFIER_TO_TFIELD_ENTITY:
			return createModifierToTFieldEntity();
		case PmPackage.MABSTRACT_FLOW_ELEMENT_TO_TABSTRACT_FLOW_ELEMENT:
			return createMAbstractFlowElementToTAbstractFlowElement();
		case PmPackage.MDEFINITION_TO_TMEMBER:
			return createMDefinitionToTMember();
		case PmPackage.ANNOTATION_TO_TANNOTATION:
			return createAnnotationToTAnnotation();
		case PmPackage.MODIFIER_TO_TMETHOD_ENTITY:
			return createModifierToTMethodEntity();
		case PmPackage.AST_NODE_TO_TANNOTATABLE:
			return createASTNodeToTAnnotatable();
		case PmPackage.FIELD_ACCESS_TO_TACCESS:
			return createFieldAccessToTAccess();
		case PmPackage.MENTRY_TO_TPARAMETER:
			return createMEntryToTParameter();
		case PmPackage.ANNOTATION_MEMBER_VALUE_PAIR_TO_TANNOTATION_VALUE:
			return createAnnotationMemberValuePairToTAnnotationValue();
		case PmPackage.MFLOW_TO_TFLOW:
			return createMFlowToTFlow();
		case PmPackage.MODEL_TO_TYPE_GRAPH:
			return createModelToTypeGraph();
		case PmPackage.ANONYMOUS_CLASS_DECLARATION_TO_TCLASS:
			return createAnonymousClassDeclarationToTClass();
		case PmPackage.TYPE_TO_TABSTRACT_TYPE:
			return createTypeToTAbstractType();
		case PmPackage.MSIGNATURE_TO_TSIGNATURE:
			return createMSignatureToTSignature();
		case PmPackage.LINE_COMMENT_TO_TTEXT_ANNOTATION:
			return createLineCommentToTTextAnnotation();
		case PmPackage.MSINGLE_VARIABLE_ACCESS_TO_TACCESS:
			return createMSingleVariableAccessToTAccess();
		case PmPackage.VARIABLE_DECLARATION_FRAGMENT_TO_TFIELD_DEFINITION:
			return createVariableDeclarationFragmentToTFieldDefinition();
		case PmPackage.MODIFIER_TO_TCLASS_ENTITY:
			return createModifierToTClassEntity();
		case PmPackage.STATIC_TYPE_TO_ACCESS_STATIC_TYPE:
			return createStaticTypeToAccessStaticType();
		case PmPackage.MSYNTETHIC_METHOD_TO_TSYNTETHIC_METHOD:
			return createMSyntethicMethodToTSyntethicMethod();
		case PmPackage.MFIELD_NAME_TO_TFIELD:
			return createMFieldNameToTField();
		case PmPackage.UNRESOLVED_TYPE_DECLARATION_TO_TCLASS:
			return createUnresolvedTypeDeclarationToTClass();
		case PmPackage.ABSTRACT_METHOD_INVOCATION_TO_TACCESS:
			return createAbstractMethodInvocationToTAccess();
		case PmPackage.MODIFIER_TO_ABSTRACT_TYPE:
			return createModifierToAbstractType();
		case PmPackage.MMODIFIER_TO_TMODIFIER:
			return createMModifierToTModifier();
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
	public TypeParameterToTClass createTypeParameterToTClass() {
		TypeParameterToTClassImpl typeParameterToTClass = new TypeParameterToTClassImpl();
		return typeParameterToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMethodNameToTMethod createMMethodNameToTMethod() {
		MMethodNameToTMethodImpl mMethodNameToTMethod = new MMethodNameToTMethodImpl();
		return mMethodNameToTMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageToTPackage createPackageToTPackage() {
		PackageToTPackageImpl packageToTPackage = new PackageToTPackageImpl();
		return packageToTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralToTNode createLiteralToTNode() {
		LiteralToTNodeImpl literalToTNode = new LiteralToTNodeImpl();
		return literalToTNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModifierToTFieldEntity createModifierToTFieldEntity() {
		ModifierToTFieldEntityImpl modifierToTFieldEntity = new ModifierToTFieldEntityImpl();
		return modifierToTFieldEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAbstractFlowElementToTAbstractFlowElement createMAbstractFlowElementToTAbstractFlowElement() {
		MAbstractFlowElementToTAbstractFlowElementImpl mAbstractFlowElementToTAbstractFlowElement = new MAbstractFlowElementToTAbstractFlowElementImpl();
		return mAbstractFlowElementToTAbstractFlowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDefinitionToTMember createMDefinitionToTMember() {
		MDefinitionToTMemberImpl mDefinitionToTMember = new MDefinitionToTMemberImpl();
		return mDefinitionToTMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationToTAnnotation createAnnotationToTAnnotation() {
		AnnotationToTAnnotationImpl annotationToTAnnotation = new AnnotationToTAnnotationImpl();
		return annotationToTAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModifierToTMethodEntity createModifierToTMethodEntity() {
		ModifierToTMethodEntityImpl modifierToTMethodEntity = new ModifierToTMethodEntityImpl();
		return modifierToTMethodEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASTNodeToTAnnotatable createASTNodeToTAnnotatable() {
		ASTNodeToTAnnotatableImpl astNodeToTAnnotatable = new ASTNodeToTAnnotatableImpl();
		return astNodeToTAnnotatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccessToTAccess createFieldAccessToTAccess() {
		FieldAccessToTAccessImpl fieldAccessToTAccess = new FieldAccessToTAccessImpl();
		return fieldAccessToTAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEntryToTParameter createMEntryToTParameter() {
		MEntryToTParameterImpl mEntryToTParameter = new MEntryToTParameterImpl();
		return mEntryToTParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValuePairToTAnnotationValue createAnnotationMemberValuePairToTAnnotationValue() {
		AnnotationMemberValuePairToTAnnotationValueImpl annotationMemberValuePairToTAnnotationValue = new AnnotationMemberValuePairToTAnnotationValueImpl();
		return annotationMemberValuePairToTAnnotationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFlowToTFlow createMFlowToTFlow() {
		MFlowToTFlowImpl mFlowToTFlow = new MFlowToTFlowImpl();
		return mFlowToTFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelToTypeGraph createModelToTypeGraph() {
		ModelToTypeGraphImpl modelToTypeGraph = new ModelToTypeGraphImpl();
		return modelToTypeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassDeclarationToTClass createAnonymousClassDeclarationToTClass() {
		AnonymousClassDeclarationToTClassImpl anonymousClassDeclarationToTClass = new AnonymousClassDeclarationToTClassImpl();
		return anonymousClassDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeToTAbstractType createTypeToTAbstractType() {
		TypeToTAbstractTypeImpl typeToTAbstractType = new TypeToTAbstractTypeImpl();
		return typeToTAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSignatureToTSignature createMSignatureToTSignature() {
		MSignatureToTSignatureImpl mSignatureToTSignature = new MSignatureToTSignatureImpl();
		return mSignatureToTSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineCommentToTTextAnnotation createLineCommentToTTextAnnotation() {
		LineCommentToTTextAnnotationImpl lineCommentToTTextAnnotation = new LineCommentToTTextAnnotationImpl();
		return lineCommentToTTextAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSingleVariableAccessToTAccess createMSingleVariableAccessToTAccess() {
		MSingleVariableAccessToTAccessImpl mSingleVariableAccessToTAccess = new MSingleVariableAccessToTAccessImpl();
		return mSingleVariableAccessToTAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationFragmentToTFieldDefinition createVariableDeclarationFragmentToTFieldDefinition() {
		VariableDeclarationFragmentToTFieldDefinitionImpl variableDeclarationFragmentToTFieldDefinition = new VariableDeclarationFragmentToTFieldDefinitionImpl();
		return variableDeclarationFragmentToTFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModifierToTClassEntity createModifierToTClassEntity() {
		ModifierToTClassEntityImpl modifierToTClassEntity = new ModifierToTClassEntityImpl();
		return modifierToTClassEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticTypeToAccessStaticType createStaticTypeToAccessStaticType() {
		StaticTypeToAccessStaticTypeImpl staticTypeToAccessStaticType = new StaticTypeToAccessStaticTypeImpl();
		return staticTypeToAccessStaticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSyntethicMethodToTSyntethicMethod createMSyntethicMethodToTSyntethicMethod() {
		MSyntethicMethodToTSyntethicMethodImpl mSyntethicMethodToTSyntethicMethod = new MSyntethicMethodToTSyntethicMethodImpl();
		return mSyntethicMethodToTSyntethicMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFieldNameToTField createMFieldNameToTField() {
		MFieldNameToTFieldImpl mFieldNameToTField = new MFieldNameToTFieldImpl();
		return mFieldNameToTField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedTypeDeclarationToTClass createUnresolvedTypeDeclarationToTClass() {
		UnresolvedTypeDeclarationToTClassImpl unresolvedTypeDeclarationToTClass = new UnresolvedTypeDeclarationToTClassImpl();
		return unresolvedTypeDeclarationToTClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodInvocationToTAccess createAbstractMethodInvocationToTAccess() {
		AbstractMethodInvocationToTAccessImpl abstractMethodInvocationToTAccess = new AbstractMethodInvocationToTAccessImpl();
		return abstractMethodInvocationToTAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModifierToAbstractType createModifierToAbstractType() {
		ModifierToAbstractTypeImpl modifierToAbstractType = new ModifierToAbstractTypeImpl();
		return modifierToAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MModifierToTModifier createMModifierToTModifier() {
		MModifierToTModifierImpl mModifierToTModifier = new MModifierToTModifierImpl();
		return mModifierToTModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PmPackage getPmPackage() {
		return (PmPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PmPackage getPackage() {
		return PmPackage.eINSTANCE;
	}

} //PmFactoryImpl
