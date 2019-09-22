/**
 */
package org.gravity.modisco.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gmt.modisco.java.emf.JavaPackage;

import org.gravity.modisco.AccessKind;
import org.gravity.modisco.MAbstractFlowElement;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MAbstractMethodInvocation;
import org.gravity.modisco.MAccess;
import org.gravity.modisco.MAnonymous;
import org.gravity.modisco.MClass;
import org.gravity.modisco.MClassInstanceCreation;
import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MConstructorInvocation;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MEntry;
import org.gravity.modisco.MExtension;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;
import org.gravity.modisco.MFlow;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodInvocation;
import org.gravity.modisco.MMethodName;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.MName;
import org.gravity.modisco.MParameterList;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.MSingleVariableAccess;
import org.gravity.modisco.MSingleVariableDeclaration;
import org.gravity.modisco.MSuperConstructorInvocation;
import org.gravity.modisco.MSuperMethodInvocation;
import org.gravity.modisco.MSyntheticMethodDefinition;
import org.gravity.modisco.MethodInvocationStaticType;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.ModiscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModiscoPackageImpl extends EPackageImpl implements ModiscoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mAbstractMethodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mConstructorDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mMethodSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mParameterListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mMethodNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFieldNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mMethodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mMethodInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mConstructorInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSingleVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mAbstractMethodInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSuperMethodInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mClassInstanceCreationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSuperConstructorInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mGravityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFieldSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSyntheticMethodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodInvocationStaticTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mAnonymousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mAbstractFlowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSingleVariableAccessEClass = null;

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
	 * @see org.gravity.modisco.ModiscoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModiscoPackageImpl() {
		super(eNS_URI, ModiscoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModiscoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModiscoPackage init() {
		if (isInited) return (ModiscoPackage)EPackage.Registry.INSTANCE.getEPackage(ModiscoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModiscoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModiscoPackageImpl theModiscoPackage = registeredModiscoPackage instanceof ModiscoPackageImpl ? (ModiscoPackageImpl)registeredModiscoPackage : new ModiscoPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		JavaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModiscoPackage.createPackageContents();

		// Initialize created meta-data
		theModiscoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModiscoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModiscoPackage.eNS_URI, theModiscoPackage);
		return theModiscoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMAbstractMethodDefinition() {
		return mAbstractMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAbstractMethodDefinition_MInnerTypes() {
		return (EReference)mAbstractMethodDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMAccess() {
		return mAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMConstructorDefinition() {
		return mConstructorDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMConstructorDefinition_Model() {
		return (EReference)mConstructorDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMDefinition() {
		return mDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMDefinition_InvocationStaticTypes() {
		return (EReference)mDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMDefinition_MMethodInvocations() {
		return (EReference)mDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMDefinition_MAbstractFieldAccess() {
		return (EReference)mDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMDefinition_MSignature() {
		return (EReference)mDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMethodSignature() {
		return mMethodSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodSignature_ReturnType() {
		return (EReference)mMethodSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMParameterList() {
		return mParameterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMParameterList_MFirstEntry() {
		return (EReference)mParameterListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMParameterList_MEntrys() {
		return (EReference)mParameterListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMName() {
		return mNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMName_MSignatures() {
		return (EReference)mNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMName_MDefinitions() {
		return (EReference)mNameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMName_MName() {
		return (EAttribute)mNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMethodName() {
		return mMethodNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMFieldName() {
		return mFieldNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMFieldDefinition() {
		return mFieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMethodDefinition() {
		return mMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodDefinition_SyntheticMethodDefinitions() {
		return (EReference)mMethodDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMethodInvocation() {
		return mMethodInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMethodInvocation_MStaticType() {
		return (EReference)mMethodInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMConstructorInvocation() {
		return mConstructorInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSingleVariableDeclaration() {
		return mSingleVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSingleVariableDeclaration_MEntry() {
		return (EReference)mSingleVariableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMAbstractMethodInvocation() {
		return mAbstractMethodInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSuperMethodInvocation() {
		return mSuperMethodInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMClassInstanceCreation() {
		return mClassInstanceCreationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSuperConstructorInvocation() {
		return mSuperConstructorInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessKind() {
		return accessKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSignature() {
		return mSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSignature_MDefinitions() {
		return (EReference)mSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMEntry() {
		return mEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMEntry_MNext() {
		return (EReference)mEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMEntry_MPrevious() {
		return (EReference)mEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMEntry_Type() {
		return (EReference)mEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMEntry_Parameters() {
		return (EReference)mEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMGravityModel() {
		return mGravityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_MFieldDefinitions() {
		return (EReference)mGravityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_AnonymousClassDeclarations() {
		return (EReference)mGravityModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_MMethodNames() {
		return (EReference)mGravityModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_MFieldNames() {
		return (EReference)mGravityModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_MAbstractMethodDefinitions() {
		return (EReference)mGravityModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_TypeParameters() {
		return (EReference)mGravityModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGravityModel_MExtensions() {
		return (EReference)mGravityModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMFieldSignature() {
		return mFieldSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFieldSignature_Type() {
		return (EReference)mFieldSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSyntheticMethodDefinition() {
		return mSyntheticMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSyntheticMethodDefinition_OriginalMethodDefinition() {
		return (EReference)mSyntheticMethodDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodInvocationStaticType() {
		return methodInvocationStaticTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodInvocationStaticType_MethodInvoc() {
		return (EReference)methodInvocationStaticTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodInvocationStaticType_Type() {
		return (EReference)methodInvocationStaticTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMAnonymous() {
		return mAnonymousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAnonymous_MSourroundingType() {
		return (EReference)mAnonymousEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMClass() {
		return mClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMClass_Dependencies() {
		return (EReference)mClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMExtension() {
		return mExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMFlow() {
		return mFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFlow_FlowSource() {
		return (EReference)mFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFlow_FlowTarget() {
		return (EReference)mFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMFlow_FlowOwner() {
		return (EReference)mFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMAbstractFlowElement() {
		return mAbstractFlowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAbstractFlowElement_OwnedFlows() {
		return (EReference)mAbstractFlowElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAbstractFlowElement_IncomingFlows() {
		return (EReference)mAbstractFlowElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAbstractFlowElement_OutgoingFlows() {
		return (EReference)mAbstractFlowElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSingleVariableAccess() {
		return mSingleVariableAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSingleVariableAccess_AccessKind() {
		return (EAttribute)mSingleVariableAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModiscoFactory getModiscoFactory() {
		return (ModiscoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mAbstractMethodDefinitionEClass = createEClass(MABSTRACT_METHOD_DEFINITION);
		createEReference(mAbstractMethodDefinitionEClass, MABSTRACT_METHOD_DEFINITION__MINNER_TYPES);

		mAccessEClass = createEClass(MACCESS);

		mConstructorDefinitionEClass = createEClass(MCONSTRUCTOR_DEFINITION);
		createEReference(mConstructorDefinitionEClass, MCONSTRUCTOR_DEFINITION__MODEL);

		mDefinitionEClass = createEClass(MDEFINITION);
		createEReference(mDefinitionEClass, MDEFINITION__INVOCATION_STATIC_TYPES);
		createEReference(mDefinitionEClass, MDEFINITION__MMETHOD_INVOCATIONS);
		createEReference(mDefinitionEClass, MDEFINITION__MABSTRACT_FIELD_ACCESS);
		createEReference(mDefinitionEClass, MDEFINITION__MSIGNATURE);

		mParameterListEClass = createEClass(MPARAMETER_LIST);
		createEReference(mParameterListEClass, MPARAMETER_LIST__MFIRST_ENTRY);
		createEReference(mParameterListEClass, MPARAMETER_LIST__MENTRYS);

		mMethodNameEClass = createEClass(MMETHOD_NAME);

		mMethodSignatureEClass = createEClass(MMETHOD_SIGNATURE);
		createEReference(mMethodSignatureEClass, MMETHOD_SIGNATURE__RETURN_TYPE);

		mMethodDefinitionEClass = createEClass(MMETHOD_DEFINITION);
		createEReference(mMethodDefinitionEClass, MMETHOD_DEFINITION__SYNTHETIC_METHOD_DEFINITIONS);

		mNameEClass = createEClass(MNAME);
		createEAttribute(mNameEClass, MNAME__MNAME);
		createEReference(mNameEClass, MNAME__MSIGNATURES);
		createEReference(mNameEClass, MNAME__MDEFINITIONS);

		mFieldNameEClass = createEClass(MFIELD_NAME);

		mFieldSignatureEClass = createEClass(MFIELD_SIGNATURE);
		createEReference(mFieldSignatureEClass, MFIELD_SIGNATURE__TYPE);

		mFieldDefinitionEClass = createEClass(MFIELD_DEFINITION);

		mSignatureEClass = createEClass(MSIGNATURE);
		createEReference(mSignatureEClass, MSIGNATURE__MDEFINITIONS);

		mEntryEClass = createEClass(MENTRY);
		createEReference(mEntryEClass, MENTRY__MNEXT);
		createEReference(mEntryEClass, MENTRY__MPREVIOUS);
		createEReference(mEntryEClass, MENTRY__TYPE);
		createEReference(mEntryEClass, MENTRY__PARAMETERS);

		mGravityModelEClass = createEClass(MGRAVITY_MODEL);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__MFIELD_DEFINITIONS);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__ANONYMOUS_CLASS_DECLARATIONS);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__MMETHOD_NAMES);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__MFIELD_NAMES);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__MABSTRACT_METHOD_DEFINITIONS);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__TYPE_PARAMETERS);
		createEReference(mGravityModelEClass, MGRAVITY_MODEL__MEXTENSIONS);

		methodInvocationStaticTypeEClass = createEClass(METHOD_INVOCATION_STATIC_TYPE);
		createEReference(methodInvocationStaticTypeEClass, METHOD_INVOCATION_STATIC_TYPE__METHOD_INVOC);
		createEReference(methodInvocationStaticTypeEClass, METHOD_INVOCATION_STATIC_TYPE__TYPE);

		mSyntheticMethodDefinitionEClass = createEClass(MSYNTHETIC_METHOD_DEFINITION);
		createEReference(mSyntheticMethodDefinitionEClass, MSYNTHETIC_METHOD_DEFINITION__ORIGINAL_METHOD_DEFINITION);

		mAnonymousEClass = createEClass(MANONYMOUS);
		createEReference(mAnonymousEClass, MANONYMOUS__MSOURROUNDING_TYPE);

		mClassEClass = createEClass(MCLASS);
		createEReference(mClassEClass, MCLASS__DEPENDENCIES);

		mExtensionEClass = createEClass(MEXTENSION);

		mFlowEClass = createEClass(MFLOW);
		createEReference(mFlowEClass, MFLOW__FLOW_SOURCE);
		createEReference(mFlowEClass, MFLOW__FLOW_TARGET);
		createEReference(mFlowEClass, MFLOW__FLOW_OWNER);

		mAbstractFlowElementEClass = createEClass(MABSTRACT_FLOW_ELEMENT);
		createEReference(mAbstractFlowElementEClass, MABSTRACT_FLOW_ELEMENT__OWNED_FLOWS);
		createEReference(mAbstractFlowElementEClass, MABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS);
		createEReference(mAbstractFlowElementEClass, MABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS);

		mSingleVariableAccessEClass = createEClass(MSINGLE_VARIABLE_ACCESS);
		createEAttribute(mSingleVariableAccessEClass, MSINGLE_VARIABLE_ACCESS__ACCESS_KIND);

		mMethodInvocationEClass = createEClass(MMETHOD_INVOCATION);
		createEReference(mMethodInvocationEClass, MMETHOD_INVOCATION__MSTATIC_TYPE);

		mConstructorInvocationEClass = createEClass(MCONSTRUCTOR_INVOCATION);

		mSingleVariableDeclarationEClass = createEClass(MSINGLE_VARIABLE_DECLARATION);
		createEReference(mSingleVariableDeclarationEClass, MSINGLE_VARIABLE_DECLARATION__MENTRY);

		mAbstractMethodInvocationEClass = createEClass(MABSTRACT_METHOD_INVOCATION);

		mSuperMethodInvocationEClass = createEClass(MSUPER_METHOD_INVOCATION);

		mClassInstanceCreationEClass = createEClass(MCLASS_INSTANCE_CREATION);

		mSuperConstructorInvocationEClass = createEClass(MSUPER_CONSTRUCTOR_INVOCATION);

		// Create enums
		accessKindEEnum = createEEnum(ACCESS_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		JavaPackage theJavaPackage = (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mAbstractMethodDefinitionEClass.getESuperTypes().add(this.getMDefinition());
		mAbstractMethodDefinitionEClass.getESuperTypes().add(theJavaPackage.getAbstractMethodDeclaration());
		mAccessEClass.getESuperTypes().add(this.getMAbstractFlowElement());
		mConstructorDefinitionEClass.getESuperTypes().add(this.getMAbstractMethodDefinition());
		mConstructorDefinitionEClass.getESuperTypes().add(theJavaPackage.getConstructorDeclaration());
		mDefinitionEClass.getESuperTypes().add(theJavaPackage.getBodyDeclaration());
		mDefinitionEClass.getESuperTypes().add(this.getMAbstractFlowElement());
		mMethodNameEClass.getESuperTypes().add(this.getMName());
		mMethodSignatureEClass.getESuperTypes().add(this.getMSignature());
		mMethodSignatureEClass.getESuperTypes().add(this.getMParameterList());
		mMethodDefinitionEClass.getESuperTypes().add(theJavaPackage.getMethodDeclaration());
		mMethodDefinitionEClass.getESuperTypes().add(this.getMAbstractMethodDefinition());
		mFieldNameEClass.getESuperTypes().add(this.getMName());
		mFieldSignatureEClass.getESuperTypes().add(this.getMSignature());
		mFieldDefinitionEClass.getESuperTypes().add(this.getMDefinition());
		mFieldDefinitionEClass.getESuperTypes().add(theJavaPackage.getFieldDeclaration());
		mSignatureEClass.getESuperTypes().add(this.getMAbstractFlowElement());
		mEntryEClass.getESuperTypes().add(this.getMAbstractFlowElement());
		mGravityModelEClass.getESuperTypes().add(theJavaPackage.getModel());
		mSyntheticMethodDefinitionEClass.getESuperTypes().add(theJavaPackage.getBodyDeclaration());
		mAnonymousEClass.getESuperTypes().add(theJavaPackage.getAnonymousClassDeclaration());
		mClassEClass.getESuperTypes().add(theJavaPackage.getClassDeclaration());
		mFlowEClass.getESuperTypes().add(this.getMAbstractFlowElement());
		mSingleVariableAccessEClass.getESuperTypes().add(theJavaPackage.getSingleVariableAccess());
		mSingleVariableAccessEClass.getESuperTypes().add(this.getMAccess());
		mMethodInvocationEClass.getESuperTypes().add(theJavaPackage.getMethodInvocation());
		mMethodInvocationEClass.getESuperTypes().add(this.getMAbstractFlowElement());
		mMethodInvocationEClass.getESuperTypes().add(this.getMAbstractMethodInvocation());
		mConstructorInvocationEClass.getESuperTypes().add(theJavaPackage.getConstructorInvocation());
		mConstructorInvocationEClass.getESuperTypes().add(this.getMAbstractFlowElement());
		mConstructorInvocationEClass.getESuperTypes().add(this.getMAbstractMethodInvocation());
		mSingleVariableDeclarationEClass.getESuperTypes().add(theJavaPackage.getSingleVariableDeclaration());
		mAbstractMethodInvocationEClass.getESuperTypes().add(theJavaPackage.getAbstractMethodInvocation());
		mAbstractMethodInvocationEClass.getESuperTypes().add(this.getMAccess());
		mSuperMethodInvocationEClass.getESuperTypes().add(theJavaPackage.getSuperMethodInvocation());
		mSuperMethodInvocationEClass.getESuperTypes().add(this.getMAbstractMethodInvocation());
		mClassInstanceCreationEClass.getESuperTypes().add(theJavaPackage.getClassInstanceCreation());
		mClassInstanceCreationEClass.getESuperTypes().add(this.getMAbstractMethodInvocation());
		mSuperConstructorInvocationEClass.getESuperTypes().add(theJavaPackage.getSuperConstructorInvocation());
		mSuperConstructorInvocationEClass.getESuperTypes().add(this.getMAbstractMethodInvocation());

		// Initialize classes and features; add operations and parameters
		initEClass(mAbstractMethodDefinitionEClass, MAbstractMethodDefinition.class, "MAbstractMethodDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMAbstractMethodDefinition_MInnerTypes(), theJavaPackage.getAbstractTypeDeclaration(), null, "mInnerTypes", null, 0, -1, MAbstractMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mAccessEClass, MAccess.class, "MAccess", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mConstructorDefinitionEClass, MConstructorDefinition.class, "MConstructorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMConstructorDefinition_Model(), this.getMGravityModel(), null, "model", null, 1, 1, MConstructorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mDefinitionEClass, MDefinition.class, "MDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDefinition_InvocationStaticTypes(), this.getMethodInvocationStaticType(), null, "invocationStaticTypes", null, 0, -1, MDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDefinition_MMethodInvocations(), theJavaPackage.getAbstractMethodInvocation(), null, "mMethodInvocations", null, 0, -1, MDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDefinition_MAbstractFieldAccess(), this.getMSingleVariableAccess(), null, "mAbstractFieldAccess", null, 0, -1, MDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDefinition_MSignature(), this.getMSignature(), this.getMSignature_MDefinitions(), "mSignature", null, 0, 1, MDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterListEClass, MParameterList.class, "MParameterList", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterList_MFirstEntry(), this.getMEntry(), null, "mFirstEntry", null, 0, 1, MParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMParameterList_MEntrys(), this.getMEntry(), null, "mEntrys", null, 0, -1, MParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mMethodNameEClass, MMethodName.class, "MMethodName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mMethodSignatureEClass, MMethodSignature.class, "MMethodSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMethodSignature_ReturnType(), theJavaPackage.getType(), null, "returnType", null, 0, 1, MMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mMethodDefinitionEClass, MMethodDefinition.class, "MMethodDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMethodDefinition_SyntheticMethodDefinitions(), this.getMSyntheticMethodDefinition(), this.getMSyntheticMethodDefinition_OriginalMethodDefinition(), "syntheticMethodDefinitions", null, 0, -1, MMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mNameEClass, MName.class, "MName", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMName_MName(), ecorePackage.getEString(), "mName", null, 1, 1, MName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMName_MSignatures(), this.getMSignature(), null, "mSignatures", null, 0, -1, MName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMName_MDefinitions(), this.getMDefinition(), null, "mDefinitions", null, 0, -1, MName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mFieldNameEClass, MFieldName.class, "MFieldName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mFieldSignatureEClass, MFieldSignature.class, "MFieldSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMFieldSignature_Type(), theJavaPackage.getType(), null, "type", null, 0, 1, MFieldSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mFieldDefinitionEClass, MFieldDefinition.class, "MFieldDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mSignatureEClass, MSignature.class, "MSignature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSignature_MDefinitions(), this.getMDefinition(), this.getMDefinition_MSignature(), "mDefinitions", null, 0, -1, MSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mEntryEClass, MEntry.class, "MEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMEntry_MNext(), this.getMEntry(), this.getMEntry_MPrevious(), "mNext", null, 0, 1, MEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEntry_MPrevious(), this.getMEntry(), this.getMEntry_MNext(), "mPrevious", null, 0, 1, MEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEntry_Type(), theJavaPackage.getType(), null, "type", null, 0, 1, MEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMEntry_Parameters(), this.getMSingleVariableDeclaration(), this.getMSingleVariableDeclaration_MEntry(), "parameters", null, 0, -1, MEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mGravityModelEClass, MGravityModel.class, "MGravityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMGravityModel_MFieldDefinitions(), this.getMFieldDefinition(), null, "mFieldDefinitions", null, 0, -1, MGravityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMGravityModel_AnonymousClassDeclarations(), theJavaPackage.getAnonymousClassDeclaration(), null, "anonymousClassDeclarations", null, 0, -1, MGravityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMGravityModel_MMethodNames(), this.getMMethodName(), null, "mMethodNames", null, 0, -1, MGravityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMGravityModel_MFieldNames(), this.getMFieldName(), null, "mFieldNames", null, 0, -1, MGravityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMGravityModel_MAbstractMethodDefinitions(), this.getMAbstractMethodDefinition(), null, "mAbstractMethodDefinitions", null, 0, -1, MGravityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMGravityModel_TypeParameters(), theJavaPackage.getTypeParameter(), null, "typeParameters", null, 0, -1, MGravityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMGravityModel_MExtensions(), this.getMExtension(), null, "mExtensions", null, 0, -1, MGravityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodInvocationStaticTypeEClass, MethodInvocationStaticType.class, "MethodInvocationStaticType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodInvocationStaticType_MethodInvoc(), theJavaPackage.getAbstractMethodInvocation(), null, "methodInvoc", null, 1, 1, MethodInvocationStaticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodInvocationStaticType_Type(), theJavaPackage.getType(), null, "type", null, 1, 1, MethodInvocationStaticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mSyntheticMethodDefinitionEClass, MSyntheticMethodDefinition.class, "MSyntheticMethodDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSyntheticMethodDefinition_OriginalMethodDefinition(), this.getMMethodDefinition(), this.getMMethodDefinition_SyntheticMethodDefinitions(), "originalMethodDefinition", null, 1, 1, MSyntheticMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mAnonymousEClass, MAnonymous.class, "MAnonymous", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMAnonymous_MSourroundingType(), theJavaPackage.getAbstractTypeDeclaration(), null, "mSourroundingType", null, 0, 1, MAnonymous.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mClassEClass, MClass.class, "MClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMClass_Dependencies(), theJavaPackage.getType(), null, "dependencies", null, 0, -1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mExtensionEClass, MExtension.class, "MExtension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mFlowEClass, MFlow.class, "MFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMFlow_FlowSource(), this.getMAbstractFlowElement(), this.getMAbstractFlowElement_OutgoingFlows(), "flowSource", null, 1, 1, MFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlow_FlowTarget(), this.getMAbstractFlowElement(), this.getMAbstractFlowElement_IncomingFlows(), "flowTarget", null, 1, 1, MFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlow_FlowOwner(), this.getMAbstractFlowElement(), this.getMAbstractFlowElement_OwnedFlows(), "flowOwner", null, 1, 1, MFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mAbstractFlowElementEClass, MAbstractFlowElement.class, "MAbstractFlowElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMAbstractFlowElement_OwnedFlows(), this.getMFlow(), this.getMFlow_FlowOwner(), "ownedFlows", null, 0, -1, MAbstractFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAbstractFlowElement_IncomingFlows(), this.getMFlow(), this.getMFlow_FlowTarget(), "incomingFlows", null, 0, -1, MAbstractFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAbstractFlowElement_OutgoingFlows(), this.getMFlow(), this.getMFlow_FlowSource(), "outgoingFlows", null, 0, -1, MAbstractFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mSingleVariableAccessEClass, MSingleVariableAccess.class, "MSingleVariableAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMSingleVariableAccess_AccessKind(), this.getAccessKind(), "accessKind", null, 0, 1, MSingleVariableAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mMethodInvocationEClass, MMethodInvocation.class, "MMethodInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMethodInvocation_MStaticType(), theJavaPackage.getType(), null, "mStaticType", null, 0, 1, MMethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mConstructorInvocationEClass, MConstructorInvocation.class, "MConstructorInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mSingleVariableDeclarationEClass, MSingleVariableDeclaration.class, "MSingleVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSingleVariableDeclaration_MEntry(), this.getMEntry(), this.getMEntry_Parameters(), "mEntry", null, 1, 1, MSingleVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mAbstractMethodInvocationEClass, MAbstractMethodInvocation.class, "MAbstractMethodInvocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mSuperMethodInvocationEClass, MSuperMethodInvocation.class, "MSuperMethodInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mClassInstanceCreationEClass, MClassInstanceCreation.class, "MClassInstanceCreation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mSuperConstructorInvocationEClass, MSuperConstructorInvocation.class, "MSuperConstructorInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(accessKindEEnum, AccessKind.class, "AccessKind");
		addEEnumLiteral(accessKindEEnum, AccessKind.READ);
		addEEnumLiteral(accessKindEEnum, AccessKind.WRITE);
		addEEnumLiteral(accessKindEEnum, AccessKind.READWRITE);

		// Create resource
		createResource(eNS_URI);
	}

} //ModiscoPackageImpl
