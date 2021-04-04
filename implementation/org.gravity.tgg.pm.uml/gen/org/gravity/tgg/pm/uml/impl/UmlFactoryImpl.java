/**
 */
package org.gravity.tgg.pm.uml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.tgg.pm.uml.*;

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
		case UmlPackage.PROPERTY2_TFIELD_SIGNATURE:
			return createProperty2TFieldSignature();
		case UmlPackage.ELEMENT2_TANNOTATABLE:
			return createElement2TAnnotatable();
		case UmlPackage.FEATURE2_TSIGNATURE:
			return createFeature2TSignature();
		case UmlPackage.INTERFACE2_TINTERFACE:
			return createInterface2TInterface();
		case UmlPackage.MODEL2_TYPE_GRAPH:
			return createModel2TypeGraph();
		case UmlPackage.TYPE2_TABSTRACT_TYPE:
			return createType2TAbstractType();
		case UmlPackage.PARAMETER2_TPARAMETER:
			return createParameter2TParameter();
		case UmlPackage.PROPERTY2_TFIELD_NAME:
			return createProperty2TFieldName();
		case UmlPackage.COMMENT2_TTEXT_ANNOTATION:
			return createComment2TTextAnnotation();
		case UmlPackage.CLASS2_TCLASS:
			return createClass2TClass();
		case UmlPackage.STEREOTYPE_PROPERTY2_ANNOTATION_NODE:
			return createStereotypeProperty2AnnotationNode();
		case UmlPackage.OPERATION2_TMETHOD_DEFINITION:
			return createOperation2TMethodDefinition();
		case UmlPackage.OPERATION2_TMETHOD_NAME:
			return createOperation2TMethodName();
		case UmlPackage.STEREOTYPE2_TANNOTATION:
			return createStereotype2TAnnotation();
		case UmlPackage.FDEPENDENCY2_TACCESS:
			return createFDependency2TAccess();
		case UmlPackage.FEATURE2_TMEMBER:
			return createFeature2TMember();
		case UmlPackage.PRIMITIVE_TYPE2_TCLASS:
			return createPrimitiveType2TClass();
		case UmlPackage.PROPERTY2_TFIELD_DEFINITION:
			return createProperty2TFieldDefinition();
		case UmlPackage.OPERATION2_TMETHOD_SIGNATURE:
			return createOperation2TMethodSignature();
		case UmlPackage.PACKAGE2_TPACKAGE:
			return createPackage2TPackage();
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
	public Property2TFieldSignature createProperty2TFieldSignature() {
		Property2TFieldSignatureImpl property2TFieldSignature = new Property2TFieldSignatureImpl();
		return property2TFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element2TAnnotatable createElement2TAnnotatable() {
		Element2TAnnotatableImpl element2TAnnotatable = new Element2TAnnotatableImpl();
		return element2TAnnotatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature2TSignature createFeature2TSignature() {
		Feature2TSignatureImpl feature2TSignature = new Feature2TSignatureImpl();
		return feature2TSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface2TInterface createInterface2TInterface() {
		Interface2TInterfaceImpl interface2TInterface = new Interface2TInterfaceImpl();
		return interface2TInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model2TypeGraph createModel2TypeGraph() {
		Model2TypeGraphImpl model2TypeGraph = new Model2TypeGraphImpl();
		return model2TypeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type2TAbstractType createType2TAbstractType() {
		Type2TAbstractTypeImpl type2TAbstractType = new Type2TAbstractTypeImpl();
		return type2TAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter2TParameter createParameter2TParameter() {
		Parameter2TParameterImpl parameter2TParameter = new Parameter2TParameterImpl();
		return parameter2TParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property2TFieldName createProperty2TFieldName() {
		Property2TFieldNameImpl property2TFieldName = new Property2TFieldNameImpl();
		return property2TFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment2TTextAnnotation createComment2TTextAnnotation() {
		Comment2TTextAnnotationImpl comment2TTextAnnotation = new Comment2TTextAnnotationImpl();
		return comment2TTextAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class2TClass createClass2TClass() {
		Class2TClassImpl class2TClass = new Class2TClassImpl();
		return class2TClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StereotypeProperty2AnnotationNode createStereotypeProperty2AnnotationNode() {
		StereotypeProperty2AnnotationNodeImpl stereotypeProperty2AnnotationNode = new StereotypeProperty2AnnotationNodeImpl();
		return stereotypeProperty2AnnotationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation2TMethodDefinition createOperation2TMethodDefinition() {
		Operation2TMethodDefinitionImpl operation2TMethodDefinition = new Operation2TMethodDefinitionImpl();
		return operation2TMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation2TMethodName createOperation2TMethodName() {
		Operation2TMethodNameImpl operation2TMethodName = new Operation2TMethodNameImpl();
		return operation2TMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stereotype2TAnnotation createStereotype2TAnnotation() {
		Stereotype2TAnnotationImpl stereotype2TAnnotation = new Stereotype2TAnnotationImpl();
		return stereotype2TAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FDependency2TAccess createFDependency2TAccess() {
		FDependency2TAccessImpl fDependency2TAccess = new FDependency2TAccessImpl();
		return fDependency2TAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature2TMember createFeature2TMember() {
		Feature2TMemberImpl feature2TMember = new Feature2TMemberImpl();
		return feature2TMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType2TClass createPrimitiveType2TClass() {
		PrimitiveType2TClassImpl primitiveType2TClass = new PrimitiveType2TClassImpl();
		return primitiveType2TClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property2TFieldDefinition createProperty2TFieldDefinition() {
		Property2TFieldDefinitionImpl property2TFieldDefinition = new Property2TFieldDefinitionImpl();
		return property2TFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation2TMethodSignature createOperation2TMethodSignature() {
		Operation2TMethodSignatureImpl operation2TMethodSignature = new Operation2TMethodSignatureImpl();
		return operation2TMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Package2TPackage createPackage2TPackage() {
		Package2TPackageImpl package2TPackage = new Package2TPackageImpl();
		return package2TPackage;
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
