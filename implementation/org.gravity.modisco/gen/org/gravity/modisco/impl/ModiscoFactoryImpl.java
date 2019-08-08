/**
 */
package org.gravity.modisco.impl;

import org.eclipse.emf.ecore.EClass;
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
			case ModiscoPackage.MMETHOD_SIGNATURE: return createMMethodSignature();
			case ModiscoPackage.MPARAMETER_LIST: return createMParameterList();
			case ModiscoPackage.MMETHOD_NAME: return createMMethodName();
			case ModiscoPackage.MFIELD_NAME: return createMFieldName();
			case ModiscoPackage.MFIELD_DEFINITION: return createMFieldDefinition();
			case ModiscoPackage.MMETHOD_DEFINITION: return createMMethodDefinition();
			case ModiscoPackage.MMETHOD_INVOCATION: return createMMethodInvocation();
			case ModiscoPackage.MENTRY: return createMEntry();
			case ModiscoPackage.MGRAVITY_MODEL: return createMGravityModel();
			case ModiscoPackage.MFIELD_SIGNATURE: return createMFieldSignature();
			case ModiscoPackage.MANNOTATION: return createMAnnotation();
			case ModiscoPackage.MSYNTHETIC_METHOD_DEFINITION: return createMSyntheticMethodDefinition();
			case ModiscoPackage.MANONYMOUS: return createMAnonymous();
			case ModiscoPackage.MCLASS: return createMClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public MParameterList createMParameterList() {
		MParameterListImpl mParameterList = new MParameterListImpl();
		return mParameterList;
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
	public MAnnotation createMAnnotation() {
		MAnnotationImpl mAnnotation = new MAnnotationImpl();
		return mAnnotation;
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
