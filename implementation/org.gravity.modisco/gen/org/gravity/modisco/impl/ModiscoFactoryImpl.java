/**
 */
package org.gravity.modisco.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.modisco.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModiscoFactoryImpl extends EFactoryImpl implements ModiscoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModiscoFactory init() {
		try {
			ModiscoFactory theModiscoFactory = (ModiscoFactory)EPackage.Registry.INSTANCE.getEFactory(ModiscoPackage.eNS_URI);
			if (theModiscoFactory != null) {
				return theModiscoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModiscoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoFactoryImpl() {
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
			case ModiscoPackage.MCONSTRUCTOR_DEFINITION: return createMConstructorDefinition();
			case ModiscoPackage.MMETHOD_NAME: return createMMethodName();
			case ModiscoPackage.MMETHOD_SIGNATURE: return createMMethodSignature();
			case ModiscoPackage.MMETHOD_DEFINITION: return createMMethodDefinition();
			case ModiscoPackage.MFIELD_NAME: return createMFieldName();
			case ModiscoPackage.MFIELD_SIGNATURE: return createMFieldSignature();
			case ModiscoPackage.MFIELD_DEFINITION: return createMFieldDefinition();
			case ModiscoPackage.MENTRY: return createMEntry();
			case ModiscoPackage.MGRAVITY_MODEL: return createMGravityModel();
			case ModiscoPackage.METHOD_INVOCATION_STATIC_TYPE: return createMethodInvocationStaticType();
			case ModiscoPackage.MSYNTHETIC_METHOD_DEFINITION: return createMSyntheticMethodDefinition();
			case ModiscoPackage.MANONYMOUS: return createMAnonymous();
			case ModiscoPackage.MCLASS: return createMClass();
			case ModiscoPackage.MFLOW: return createMFlow();
			case ModiscoPackage.MSINGLE_VARIABLE_ACCESS: return createMSingleVariableAccess();
			case ModiscoPackage.MMETHOD_INVOCATION: return createMMethodInvocation();
			case ModiscoPackage.MCONSTRUCTOR_INVOCATION: return createMConstructorInvocation();
			case ModiscoPackage.MSINGLE_VARIABLE_DECLARATION: return createMSingleVariableDeclaration();
			case ModiscoPackage.MSUPER_METHOD_INVOCATION: return createMSuperMethodInvocation();
			case ModiscoPackage.MCLASS_INSTANCE_CREATION: return createMClassInstanceCreation();
			case ModiscoPackage.MSUPER_CONSTRUCTOR_INVOCATION: return createMSuperConstructorInvocation();
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
			case ModiscoPackage.ACCESS_KIND:
				return createAccessKindFromString(eDataType, initialValue);
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
			case ModiscoPackage.ACCESS_KIND:
				return convertAccessKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MConstructorDefinition createMConstructorDefinition() {
		MConstructorDefinitionImpl mConstructorDefinition = new MConstructorDefinitionImpl();
		return mConstructorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodSignature createMMethodSignature() {
		MMethodSignatureImpl mMethodSignature = new MMethodSignatureImpl();
		return mMethodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodName createMMethodName() {
		MMethodNameImpl mMethodName = new MMethodNameImpl();
		return mMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldName createMFieldName() {
		MFieldNameImpl mFieldName = new MFieldNameImpl();
		return mFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldDefinition createMFieldDefinition() {
		MFieldDefinitionImpl mFieldDefinition = new MFieldDefinitionImpl();
		return mFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodDefinition createMMethodDefinition() {
		MMethodDefinitionImpl mMethodDefinition = new MMethodDefinitionImpl();
		return mMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethodInvocation createMMethodInvocation() {
		MMethodInvocationImpl mMethodInvocation = new MMethodInvocationImpl();
		return mMethodInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MConstructorInvocation createMConstructorInvocation() {
		MConstructorInvocationImpl mConstructorInvocation = new MConstructorInvocationImpl();
		return mConstructorInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSingleVariableDeclaration createMSingleVariableDeclaration() {
		MSingleVariableDeclarationImpl mSingleVariableDeclaration = new MSingleVariableDeclarationImpl();
		return mSingleVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSuperMethodInvocation createMSuperMethodInvocation() {
		MSuperMethodInvocationImpl mSuperMethodInvocation = new MSuperMethodInvocationImpl();
		return mSuperMethodInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClassInstanceCreation createMClassInstanceCreation() {
		MClassInstanceCreationImpl mClassInstanceCreation = new MClassInstanceCreationImpl();
		return mClassInstanceCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSuperConstructorInvocation createMSuperConstructorInvocation() {
		MSuperConstructorInvocationImpl mSuperConstructorInvocation = new MSuperConstructorInvocationImpl();
		return mSuperConstructorInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessKind createAccessKindFromString(EDataType eDataType, String initialValue) {
		AccessKind result = AccessKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEntry createMEntry() {
		MEntryImpl mEntry = new MEntryImpl();
		return mEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGravityModel createMGravityModel() {
		MGravityModelImpl mGravityModel = new MGravityModelImpl();
		return mGravityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFieldSignature createMFieldSignature() {
		MFieldSignatureImpl mFieldSignature = new MFieldSignatureImpl();
		return mFieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSyntheticMethodDefinition createMSyntheticMethodDefinition() {
		MSyntheticMethodDefinitionImpl mSyntheticMethodDefinition = new MSyntheticMethodDefinitionImpl();
		return mSyntheticMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodInvocationStaticType createMethodInvocationStaticType() {
		MethodInvocationStaticTypeImpl methodInvocationStaticType = new MethodInvocationStaticTypeImpl();
		return methodInvocationStaticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAnonymous createMAnonymous() {
		MAnonymousImpl mAnonymous = new MAnonymousImpl();
		return mAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClass createMClass() {
		MClassImpl mClass = new MClassImpl();
		return mClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFlow createMFlow() {
		MFlowImpl mFlow = new MFlowImpl();
		return mFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSingleVariableAccess createMSingleVariableAccess() {
		MSingleVariableAccessImpl mSingleVariableAccess = new MSingleVariableAccessImpl();
		return mSingleVariableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoPackage getModiscoPackage() {
		return (ModiscoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModiscoPackage getPackage() {
		return ModiscoPackage.eINSTANCE;
	}

} //ModiscoFactoryImpl
