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
			BasicFactory theBasicFactory = (BasicFactory)EPackage.Registry.INSTANCE.getEFactory(BasicPackage.eNS_URI);
			if (theBasicFactory != null) {
				return theBasicFactory;
			}
		}
		catch (Exception exception) {
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
			case BasicPackage.TCLASS: return createTClass();
			case BasicPackage.TFIELD: return createTField();
			case BasicPackage.TFIELD_DEFINITION: return createTFieldDefinition();
			case BasicPackage.TFIELD_SIGNATURE: return createTFieldSignature();
			case BasicPackage.TCALL: return createTCall();
			case BasicPackage.TMETHOD: return createTMethod();
			case BasicPackage.TMETHOD_DEFINITION: return createTMethodDefinition();
			case BasicPackage.TMETHOD_SIGNATURE: return createTMethodSignature();
			case BasicPackage.TPACKAGE: return createTPackage();
			case BasicPackage.TPARAMETER: return createTParameter();
			case BasicPackage.TYPE_GRAPH: return createTypeGraph();
			case BasicPackage.TINTERFACE: return createTInterface();
			case BasicPackage.TREAD: return createTRead();
			case BasicPackage.TWRITE: return createTWrite();
			case BasicPackage.TMODIFIER: return createTModifier();
			case BasicPackage.TSYNTETHIC_METHOD: return createTSyntethicMethod();
			case BasicPackage.TUNRESOLVED_TYPE: return createTUnresolvedType();
			case BasicPackage.TNAME: return createTName();
			case BasicPackage.TFLOW: return createTFlow();
			case BasicPackage.TREAD_WRITE: return createTReadWrite();
			case BasicPackage.TCONSTRUCTOR: return createTConstructor();
			case BasicPackage.TENUM: return createTEnum();
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
	@Override
	public TClass createTClass() {
		TClassImpl tClass = new TClassImpl();
		return tClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TField createTField() {
		TFieldImpl tField = new TFieldImpl();
		return tField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFieldDefinition createTFieldDefinition() {
		TFieldDefinitionImpl tFieldDefinition = new TFieldDefinitionImpl();
		return tFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFieldSignature createTFieldSignature() {
		TFieldSignatureImpl tFieldSignature = new TFieldSignatureImpl();
		return tFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCall createTCall() {
		TCallImpl tCall = new TCallImpl();
		return tCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethod createTMethod() {
		TMethodImpl tMethod = new TMethodImpl();
		return tMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodDefinition createTMethodDefinition() {
		TMethodDefinitionImpl tMethodDefinition = new TMethodDefinitionImpl();
		return tMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodSignature createTMethodSignature() {
		TMethodSignatureImpl tMethodSignature = new TMethodSignatureImpl();
		return tMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPackage createTPackage() {
		TPackageImpl tPackage = new TPackageImpl();
		return tPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParameter createTParameter() {
		TParameterImpl tParameter = new TParameterImpl();
		return tParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeGraph createTypeGraph() {
		TypeGraphImpl typeGraph = new TypeGraphImpl();
		return typeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInterface createTInterface() {
		TInterfaceImpl tInterface = new TInterfaceImpl();
		return tInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRead createTRead() {
		TReadImpl tRead = new TReadImpl();
		return tRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TWrite createTWrite() {
		TWriteImpl tWrite = new TWriteImpl();
		return tWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TModifier createTModifier() {
		TModifierImpl tModifier = new TModifierImpl();
		return tModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSyntethicMethod createTSyntethicMethod() {
		TSyntethicMethodImpl tSyntethicMethod = new TSyntethicMethodImpl();
		return tSyntethicMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TUnresolvedType createTUnresolvedType() {
		TUnresolvedTypeImpl tUnresolvedType = new TUnresolvedTypeImpl();
		return tUnresolvedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TName createTName() {
		TNameImpl tName = new TNameImpl();
		return tName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFlow createTFlow() {
		TFlowImpl tFlow = new TFlowImpl();
		return tFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TReadWrite createTReadWrite() {
		TReadWriteImpl tReadWrite = new TReadWriteImpl();
		return tReadWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TConstructor createTConstructor() {
		TConstructorImpl tConstructor = new TConstructorImpl();
		return tConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEnum createTEnum() {
		TEnumImpl tEnum = new TEnumImpl();
		return tEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVisibility createTVisibilityFromString(EDataType eDataType, String initialValue) {
		TVisibility result = TVisibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
	@Override
	public BasicPackage getBasicPackage() {
		return (BasicPackage)getEPackage();
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
