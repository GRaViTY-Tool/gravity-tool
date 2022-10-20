/**
 */
package org.gravity.tgg.modisco.uml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.tgg.modisco.uml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlFactoryImpl extends EFactoryImpl implements UmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UmlFactory init() {
		try {
			UmlFactory theUmlFactory = (UmlFactory) EPackage.Registry.INSTANCE.getEFactory(UmlPackage.eNS_URI);
			if (theUmlFactory != null) {
				return theUmlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlFactoryImpl() {
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
		case UmlPackage.JAVA_MODEL2_UML_PACKAGE:
			return createJavaModel2UMLPackage();
		case UmlPackage.AST_NODE2_ELEMENT:
			return createASTNode2Element();
		case UmlPackage.TYPE_ACCESS2_PROPERTY:
			return createTypeAccess2Property();
		case UmlPackage.PARAMETERIZED_TYPE2_REDEFINABLE_TEMPLATE_SIGNATURE:
			return createParameterizedType2RedefinableTemplateSignature();
		case UmlPackage.TYPE_ACCESS2_GENERALIZATION:
			return createTypeAccess2Generalization();
		case UmlPackage.TYPE_ACCESS2_TEMPLATE_BINDING:
			return createTypeAccess2TemplateBinding();
		case UmlPackage.MODIFIER2_NAMED_ELEMENT:
			return createModifier2NamedElement();
		case UmlPackage.TYPE_ACCESS2_INTERFACE_REALIZATION:
			return createTypeAccess2InterfaceRealization();
		case UmlPackage.JAVA_PACKAGE2_UML_PACKAGE:
			return createJavaPackage2UmlPackage();
		case UmlPackage.TYPE_ACCESS2_PARAMETER:
			return createTypeAccess2Parameter();
		case UmlPackage.COMPILATION_UNIT2_ARTIFACT:
			return createCompilationUnit2Artifact();
		case UmlPackage.EXPRESSION2_COMMENT:
			return createExpression2Comment();
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
	public JavaModel2UMLPackage createJavaModel2UMLPackage() {
		JavaModel2UMLPackageImpl javaModel2UMLPackage = new JavaModel2UMLPackageImpl();
		return javaModel2UMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASTNode2Element createASTNode2Element() {
		ASTNode2ElementImpl astNode2Element = new ASTNode2ElementImpl();
		return astNode2Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess2Property createTypeAccess2Property() {
		TypeAccess2PropertyImpl typeAccess2Property = new TypeAccess2PropertyImpl();
		return typeAccess2Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType2RedefinableTemplateSignature createParameterizedType2RedefinableTemplateSignature() {
		ParameterizedType2RedefinableTemplateSignatureImpl parameterizedType2RedefinableTemplateSignature = new ParameterizedType2RedefinableTemplateSignatureImpl();
		return parameterizedType2RedefinableTemplateSignature;
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
	public TypeAccess2TemplateBinding createTypeAccess2TemplateBinding() {
		TypeAccess2TemplateBindingImpl typeAccess2TemplateBinding = new TypeAccess2TemplateBindingImpl();
		return typeAccess2TemplateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier2NamedElement createModifier2NamedElement() {
		Modifier2NamedElementImpl modifier2NamedElement = new Modifier2NamedElementImpl();
		return modifier2NamedElement;
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
	public JavaPackage2UmlPackage createJavaPackage2UmlPackage() {
		JavaPackage2UmlPackageImpl javaPackage2UmlPackage = new JavaPackage2UmlPackageImpl();
		return javaPackage2UmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess2Parameter createTypeAccess2Parameter() {
		TypeAccess2ParameterImpl typeAccess2Parameter = new TypeAccess2ParameterImpl();
		return typeAccess2Parameter;
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
	public Expression2Comment createExpression2Comment() {
		Expression2CommentImpl expression2Comment = new Expression2CommentImpl();
		return expression2Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UmlPackage getUmlPackage() {
		return (UmlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UmlPackage getPackage() {
		return UmlPackage.eINSTANCE;
	}

} //UmlFactoryImpl
