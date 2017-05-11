/**
 */
package org.gravity.typegraph.basic.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.typegraph.basic.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicFactoryImpl extends EFactoryImpl implements BasicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicFactory init() {
		try {
			BasicFactory theBasicFactory = (BasicFactory) EPackage.Registry.INSTANCE.getEFactory(BasicPackage.eNS_URI);
			if (theBasicFactory != null) {
				return theBasicFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicFactoryImpl() {
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
		case BasicPackage.TACCESS:
			return createTAccess();
		case BasicPackage.TANNOTATION:
			return createTAnnotation();
		case BasicPackage.TCLASS:
			return createTClass();
		case BasicPackage.TFIELD:
			return createTField();
		case BasicPackage.TFIELD_DEFINITION:
			return createTFieldDefinition();
		case BasicPackage.TFIELD_SIGNATURE:
			return createTFieldSignature();
		case BasicPackage.TCALL:
			return createTCall();
		case BasicPackage.TMETHOD:
			return createTMethod();
		case BasicPackage.TMETHOD_DEFINITION:
			return createTMethodDefinition();
		case BasicPackage.TMETHOD_SIGNATURE:
			return createTMethodSignature();
		case BasicPackage.TPACKAGE:
			return createTPackage();
		case BasicPackage.TPARAMETER:
			return createTParameter();
		case BasicPackage.TPARAMETER_LIST:
			return createTParameterList();
		case BasicPackage.TYPE_GRAPH:
			return createTypeGraph();
		case BasicPackage.TINTERFACE:
			return createTInterface();
		case BasicPackage.TANNOTATION_TYPE:
			return createTAnnotationType();
		case BasicPackage.TTEXT_ANNOTATION:
			return createTTextAnnotation();
		case BasicPackage.TCONSTRUCTOR_NAME:
			return createTConstructorName();
		case BasicPackage.TCONSTRUCTOR_SIGNATURE:
			return createTConstructorSignature();
		case BasicPackage.TCONSTRUCTOR_DEFINITION:
			return createTConstructorDefinition();
		case BasicPackage.TREAD:
			return createTRead();
		case BasicPackage.TWRITE:
			return createTWrite();
		case BasicPackage.TCLASS_ENTITY:
			return createTClassEntity();
		case BasicPackage.TFIELD_ENTITY:
			return createTFieldEntity();
		case BasicPackage.TMETHOD_ENTITY:
			return createTMethodEntity();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case BasicPackage.TVISIBILITY:
			return createTVisibilityFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case BasicPackage.TVISIBILITY:
			return convertTVisibilityToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAccess createTAccess() {
		TAccessImpl tAccess = new TAccessImpl();
		return tAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAnnotation createTAnnotation() {
		TAnnotationImpl tAnnotation = new TAnnotationImpl();
		return tAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass createTClass() {
		TClassImpl tClass = new TClassImpl();
		return tClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TField createTField() {
		TFieldImpl tField = new TFieldImpl();
		return tField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldDefinition createTFieldDefinition() {
		TFieldDefinitionImpl tFieldDefinition = new TFieldDefinitionImpl();
		return tFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldSignature createTFieldSignature() {
		TFieldSignatureImpl tFieldSignature = new TFieldSignatureImpl();
		return tFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCall createTCall() {
		TCallImpl tCall = new TCallImpl();
		return tCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethod createTMethod() {
		TMethodImpl tMethod = new TMethodImpl();
		return tMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinition createTMethodDefinition() {
		TMethodDefinitionImpl tMethodDefinition = new TMethodDefinitionImpl();
		return tMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature createTMethodSignature() {
		TMethodSignatureImpl tMethodSignature = new TMethodSignatureImpl();
		return tMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage createTPackage() {
		TPackageImpl tPackage = new TPackageImpl();
		return tPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameter createTParameter() {
		TParameterImpl tParameter = new TParameterImpl();
		return tParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameterList createTParameterList() {
		TParameterListImpl tParameterList = new TParameterListImpl();
		return tParameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph createTypeGraph() {
		TypeGraphImpl typeGraph = new TypeGraphImpl();
		return typeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TInterface createTInterface() {
		TInterfaceImpl tInterface = new TInterfaceImpl();
		return tInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAnnotationType createTAnnotationType() {
		TAnnotationTypeImpl tAnnotationType = new TAnnotationTypeImpl();
		return tAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTextAnnotation createTTextAnnotation() {
		TTextAnnotationImpl tTextAnnotation = new TTextAnnotationImpl();
		return tTextAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConstructorName createTConstructorName() {
		TConstructorNameImpl tConstructorName = new TConstructorNameImpl();
		return tConstructorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConstructorSignature createTConstructorSignature() {
		TConstructorSignatureImpl tConstructorSignature = new TConstructorSignatureImpl();
		return tConstructorSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConstructorDefinition createTConstructorDefinition() {
		TConstructorDefinitionImpl tConstructorDefinition = new TConstructorDefinitionImpl();
		return tConstructorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRead createTRead() {
		TReadImpl tRead = new TReadImpl();
		return tRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TWrite createTWrite() {
		TWriteImpl tWrite = new TWriteImpl();
		return tWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClassEntity createTClassEntity() {
		TClassEntityImpl tClassEntity = new TClassEntityImpl();
		return tClassEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldEntity createTFieldEntity() {
		TFieldEntityImpl tFieldEntity = new TFieldEntityImpl();
		return tFieldEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodEntity createTMethodEntity() {
		TMethodEntityImpl tMethodEntity = new TMethodEntityImpl();
		return tMethodEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVisibility createTVisibilityFromString(EDataType eDataType, String initialValue) {
		TVisibility result = TVisibility.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicPackage getBasicPackage() {
		return (BasicPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicPackage getPackage() {
		return BasicPackage.eINSTANCE;
	}

} //BasicFactoryImpl
