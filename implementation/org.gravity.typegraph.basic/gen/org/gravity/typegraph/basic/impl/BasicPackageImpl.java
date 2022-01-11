/**
 */
package org.gravity.typegraph.basic.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractFlowElement;
import org.gravity.typegraph.basic.TAbstractMultiplicity;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TCall;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TConstructor;
import org.gravity.typegraph.basic.TEnum;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TFlow;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TName;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TRead;
import org.gravity.typegraph.basic.TReadWrite;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TSyntethicMethod;
import org.gravity.typegraph.basic.TUnresolvedType;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TWrite;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.AnnotationsPackage;

import org.gravity.typegraph.basic.annotations.impl.AnnotationsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicPackageImpl extends EPackageImpl implements BasicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFieldSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tMethodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tMethodSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAbstractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tReadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tWriteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSyntethicMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tUnresolvedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAbstractFlowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tReadWriteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAbstractMultiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tVisibilityEEnum = null;

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
	 * @see org.gravity.typegraph.basic.BasicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicPackageImpl() {
		super(eNS_URI, BasicFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicPackage init() {
		if (isInited) return (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasicPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasicPackageImpl theBasicPackage = registeredBasicPackage instanceof BasicPackageImpl ? (BasicPackageImpl)registeredBasicPackage : new BasicPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
		AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl)(registeredPackage instanceof AnnotationsPackageImpl ? registeredPackage : AnnotationsPackage.eINSTANCE);

		// Create package meta-data objects
		theBasicPackage.createPackageContents();
		theAnnotationsPackage.createPackageContents();

		// Initialize created meta-data
		theBasicPackage.initializePackageContents();
		theAnnotationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasicPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicPackage.eNS_URI, theBasicPackage);
		return theBasicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAccess() {
		return tAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAccess_Target() {
		return (EReference)tAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAccess_Source() {
		return (EReference)tAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAccess_StaticType() {
		return (EReference)tAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTClass() {
		return tClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTClass_ParentClasses() {
		return (EReference)tClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTClass_ChildClasses() {
		return (EReference)tClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTClass_Implements() {
		return (EReference)tClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTClass__GetDeclaredTMethodDefinitions() {
		return tClassEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTClass__GetAllTMembers() {
		return tClassEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTClass__GetAllChildren() {
		return tClassEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTClass__IsSubTypeOf__TAbstractType() {
		return tClassEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTClass__IsSuperTypeOf__TAbstractType() {
		return tClassEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTClass__GetAllOutgoingAccesses__TSignature() {
		return tClassEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTClass__HasAParentThisTMember__TMember() {
		return tClassEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTClass__ToString() {
		return tClassEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTClass__GetParents() {
		return tClassEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTClass__HasCommonSuperType__TAbstractType() {
		return tClassEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTField() {
		return tFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTField_Signatures() {
		return (EReference)tFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTField_Model() {
		return (EReference)tFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTFieldDefinition() {
		return tFieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFieldDefinition_Hiding() {
		return (EReference)tFieldDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFieldDefinition_HiddenBy() {
		return (EReference)tFieldDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTFieldDefinition__GetSignature() {
		return tFieldDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTFieldSignature() {
		return tFieldSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFieldSignature_Field() {
		return (EReference)tFieldSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFieldSignature_Type() {
		return (EReference)tFieldSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTFieldSignature__GetSignatureString() {
		return tFieldSignatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTFieldSignature__GetTDefinition__TAbstractType() {
		return tFieldSignatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTFieldSignature__GetFieldDefinitions() {
		return tFieldSignatureEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCall() {
		return tCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTMember() {
		return tMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMember_DefinedBy() {
		return (EReference)tMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMember_AccessedBy() {
		return (EReference)tMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMember_Accessing() {
		return (EReference)tMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMember_TModifier() {
		return (EReference)tMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMember_Signature() {
		return (EReference)tMemberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTMember__GetSignatureString() {
		return tMemberEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTMethod() {
		return tMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMethod_Signatures() {
		return (EReference)tMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMethod_Model() {
		return (EReference)tMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTMethod__GetMethodSignature__TAbstractType_int_int_EList_EList_EList() {
		return tMethodEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTMethod__CreateMethodSignature__TAbstractType_int_int_EList_EList_EList() {
		return tMethodEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTMethodDefinition() {
		return tMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMethodDefinition_Overriding() {
		return (EReference)tMethodDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMethodDefinition_OverriddenBy() {
		return (EReference)tMethodDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMethodDefinition_Overloading() {
		return (EReference)tMethodDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMethodDefinition_OverloadedBy() {
		return (EReference)tMethodDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMethodDefinition_ReturnType() {
		return (EReference)tMethodDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMethodDefinition_SyntethicMethods() {
		return (EReference)tMethodDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTMethodDefinition__ToString() {
		return tMethodDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTMethodDefinition__GetSignature() {
		return tMethodDefinitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTMethodSignature() {
		return tMethodSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMethodSignature_Method() {
		return (EReference)tMethodSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMethodSignature_ReturnType() {
		return (EReference)tMethodSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMethodSignature_Parameters() {
		return (EReference)tMethodSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMethodSignature_FirstParameter() {
		return (EReference)tMethodSignatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTMethodSignature__GetSignatureString() {
		return tMethodSignatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTMethodSignature__GetTDefinition__TAbstractType() {
		return tMethodSignatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTMethodSignature__ToString() {
		return tMethodSignatureEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTMethodSignature__GetMethodDefinitions() {
		return tMethodSignatureEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPackage() {
		return tPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPackage_Subpackages() {
		return (EReference)tPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPackage_Parent() {
		return (EReference)tPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPackage_Classes() {
		return (EReference)tPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPackage_Interfaces() {
		return (EReference)tPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPackage_OwnedTypes() {
		return (EReference)tPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPackage_Model() {
		return (EReference)tPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPackage_TName() {
		return (EAttribute)tPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTPackage__GetFullyQualifiedName() {
		return tPackageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTPackage__GetAllOwnedTypes() {
		return tPackageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTPackage__GetAllOwnedClasses() {
		return tPackageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTPackage__GetBasePackage() {
		return tPackageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTPackage__CreateTClass__String_boolean_TVisibility() {
		return tPackageEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTParameter() {
		return tParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTParameter_Next() {
		return (EReference)tParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTParameter_Previous() {
		return (EReference)tParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTParameter_Type() {
		return (EReference)tParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSignature() {
		return tSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSignature_Definitions() {
		return (EReference)tSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTSignature__GetSignatureString() {
		return tSignatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTSignature__GetTDefinition__TAbstractType() {
		return tSignatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeGraph() {
		return typeGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeGraph_Packages() {
		return (EReference)typeGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeGraph_Methods() {
		return (EReference)typeGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeGraph_Fields() {
		return (EReference)typeGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeGraph_Classes() {
		return (EReference)typeGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeGraph_Interfaces() {
		return (EReference)typeGraphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeGraph_OwnedTypes() {
		return (EReference)typeGraphEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeGraph_TAnnotationTypes() {
		return (EReference)typeGraphEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeGraph_TName() {
		return (EAttribute)typeGraphEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeGraph__GetDeclaredTClasses() {
		return typeGraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeGraph__ToString() {
		return typeGraphEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeGraph__GetPackage__String() {
		return typeGraphEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeGraph__GetPackage__EList() {
		return typeGraphEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeGraph__GetClass__String() {
		return typeGraphEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeGraph__GetInterface__String() {
		return typeGraphEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeGraph__GetMethod__String() {
		return typeGraphEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeGraph__GetField__String() {
		return typeGraphEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeGraph__GetSignature__String() {
		return typeGraphEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeGraph__GetFieldSignature__String() {
		return typeGraphEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeGraph__GetMethodSignature__String() {
		return typeGraphEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeGraph__GetDefinition__String() {
		return typeGraphEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeGraph__GetFieldDefinition__String() {
		return typeGraphEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeGraph__GetMethodDefinition__String() {
		return typeGraphEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeGraph__CreatePackage__String() {
		return typeGraphEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTInterface() {
		return tInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTInterface_ImplementedBy() {
		return (EReference)tInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTInterface_ParentInterfaces() {
		return (EReference)tInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTInterface_ChildInterfaces() {
		return (EReference)tInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTInterface__IsSubTypeOf__TAbstractType() {
		return tInterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTInterface__IsSuperTypeOf__TAbstractType() {
		return tInterfaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTInterface__HasCommonSuperType__TAbstractType() {
		return tInterfaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAbstractType() {
		return tAbstractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAbstractType_Model() {
		return (EReference)tAbstractTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAbstractType_Package() {
		return (EReference)tAbstractTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAbstractType_Signature() {
		return (EReference)tAbstractTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAbstractType_Defines() {
		return (EReference)tAbstractTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTAbstractType_TLib() {
		return (EAttribute)tAbstractTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTAbstractType_TName() {
		return (EAttribute)tAbstractTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAbstractType_TModifier() {
		return (EReference)tAbstractTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAbstractType_InnerTypes() {
		return (EReference)tAbstractTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAbstractType_OuterType() {
		return (EReference)tAbstractTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__IsSuperTypeOf__TAbstractType() {
		return tAbstractTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__IsSubTypeOf__TAbstractType() {
		return tAbstractTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__IsDeclared() {
		return tAbstractTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__GetFullyQualifiedName() {
		return tAbstractTypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__GetTMethodSignature__String() {
		return tAbstractTypeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__GetTMethodDefinition__String() {
		return tAbstractTypeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__GetBasePackage() {
		return tAbstractTypeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__GetTDefinition__TSignature() {
		return tAbstractTypeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__GetTDefinition__String() {
		return tAbstractTypeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__HasTMember__TMember() {
		return tAbstractTypeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__HasCommonSuperType__TAbstractType() {
		return tAbstractTypeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__FillSameType__EList() {
		return tAbstractTypeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__IsInnerType__TAbstractType() {
		return tAbstractTypeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__GetRealPackage__TAbstractType() {
		return tAbstractTypeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__GetTFieldSignature__String() {
		return tAbstractTypeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__GetTFieldDefinition__String() {
		return tAbstractTypeEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__CreateMethodDefinition__String_TAbstractType_int_int_EList_EList_EList_boolean_TVisibility() {
		return tAbstractTypeEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractType__CreateFieldDefinition__String_TAbstractType_int_int_boolean_TVisibility() {
		return tAbstractTypeEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTRead() {
		return tReadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTWrite() {
		return tWriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTModifier() {
		return tModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTModifier_TVisibility() {
		return (EAttribute)tModifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTModifier_IsStatic() {
		return (EAttribute)tModifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSyntethicMethod() {
		return tSyntethicMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSyntethicMethod_OriginalMethodDefinition() {
		return (EReference)tSyntethicMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTSyntethicMethod__GetSignature() {
		return tSyntethicMethodEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTUnresolvedType() {
		return tUnresolvedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTName() {
		return tNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTName_TName() {
		return (EAttribute)tNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTFlow() {
		return tFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFlow_FlowOwner() {
		return (EReference)tFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAbstractFlowElement() {
		return tAbstractFlowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAbstractFlowElement_OwnedFlows() {
		return (EReference)tAbstractFlowElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAbstractFlowElement_IncomingFlows() {
		return (EReference)tAbstractFlowElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAbstractFlowElement_OutgoingFlows() {
		return (EReference)tAbstractFlowElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTReadWrite() {
		return tReadWriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTConstructor() {
		return tConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTEnum() {
		return tEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAbstractMultiplicity() {
		return tAbstractMultiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTAbstractMultiplicity_LowerBound() {
		return (EAttribute)tAbstractMultiplicityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTAbstractMultiplicity_UpperBound() {
		return (EAttribute)tAbstractMultiplicityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAbstractMultiplicity__IsArray() {
		return tAbstractMultiplicityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTVisibility() {
		return tVisibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicFactory getBasicFactory() {
		return (BasicFactory)getEFactoryInstance();
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
		tAccessEClass = createEClass(TACCESS);
		createEReference(tAccessEClass, TACCESS__TARGET);
		createEReference(tAccessEClass, TACCESS__SOURCE);
		createEReference(tAccessEClass, TACCESS__STATIC_TYPE);

		tClassEClass = createEClass(TCLASS);
		createEReference(tClassEClass, TCLASS__PARENT_CLASSES);
		createEReference(tClassEClass, TCLASS__CHILD_CLASSES);
		createEReference(tClassEClass, TCLASS__IMPLEMENTS);
		createEOperation(tClassEClass, TCLASS___GET_DECLARED_TMETHOD_DEFINITIONS);
		createEOperation(tClassEClass, TCLASS___GET_ALL_TMEMBERS);
		createEOperation(tClassEClass, TCLASS___GET_ALL_CHILDREN);
		createEOperation(tClassEClass, TCLASS___IS_SUB_TYPE_OF__TABSTRACTTYPE);
		createEOperation(tClassEClass, TCLASS___IS_SUPER_TYPE_OF__TABSTRACTTYPE);
		createEOperation(tClassEClass, TCLASS___GET_ALL_OUTGOING_ACCESSES__TSIGNATURE);
		createEOperation(tClassEClass, TCLASS___HAS_APARENT_THIS_TMEMBER__TMEMBER);
		createEOperation(tClassEClass, TCLASS___TO_STRING);
		createEOperation(tClassEClass, TCLASS___GET_PARENTS);
		createEOperation(tClassEClass, TCLASS___HAS_COMMON_SUPER_TYPE__TABSTRACTTYPE);

		tFieldEClass = createEClass(TFIELD);
		createEReference(tFieldEClass, TFIELD__SIGNATURES);
		createEReference(tFieldEClass, TFIELD__MODEL);

		tFieldDefinitionEClass = createEClass(TFIELD_DEFINITION);
		createEReference(tFieldDefinitionEClass, TFIELD_DEFINITION__HIDING);
		createEReference(tFieldDefinitionEClass, TFIELD_DEFINITION__HIDDEN_BY);
		createEOperation(tFieldDefinitionEClass, TFIELD_DEFINITION___GET_SIGNATURE);

		tFieldSignatureEClass = createEClass(TFIELD_SIGNATURE);
		createEReference(tFieldSignatureEClass, TFIELD_SIGNATURE__FIELD);
		createEReference(tFieldSignatureEClass, TFIELD_SIGNATURE__TYPE);
		createEOperation(tFieldSignatureEClass, TFIELD_SIGNATURE___GET_SIGNATURE_STRING);
		createEOperation(tFieldSignatureEClass, TFIELD_SIGNATURE___GET_TDEFINITION__TABSTRACTTYPE);
		createEOperation(tFieldSignatureEClass, TFIELD_SIGNATURE___GET_FIELD_DEFINITIONS);

		tCallEClass = createEClass(TCALL);

		tMemberEClass = createEClass(TMEMBER);
		createEReference(tMemberEClass, TMEMBER__DEFINED_BY);
		createEReference(tMemberEClass, TMEMBER__ACCESSED_BY);
		createEReference(tMemberEClass, TMEMBER__ACCESSING);
		createEReference(tMemberEClass, TMEMBER__TMODIFIER);
		createEReference(tMemberEClass, TMEMBER__SIGNATURE);
		createEOperation(tMemberEClass, TMEMBER___GET_SIGNATURE_STRING);

		tMethodEClass = createEClass(TMETHOD);
		createEReference(tMethodEClass, TMETHOD__SIGNATURES);
		createEReference(tMethodEClass, TMETHOD__MODEL);
		createEOperation(tMethodEClass, TMETHOD___GET_METHOD_SIGNATURE__TABSTRACTTYPE_INT_INT_ELIST_ELIST_ELIST);
		createEOperation(tMethodEClass, TMETHOD___CREATE_METHOD_SIGNATURE__TABSTRACTTYPE_INT_INT_ELIST_ELIST_ELIST);

		tMethodDefinitionEClass = createEClass(TMETHOD_DEFINITION);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__OVERRIDING);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__OVERRIDDEN_BY);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__OVERLOADING);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__OVERLOADED_BY);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__RETURN_TYPE);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__SYNTETHIC_METHODS);
		createEOperation(tMethodDefinitionEClass, TMETHOD_DEFINITION___TO_STRING);
		createEOperation(tMethodDefinitionEClass, TMETHOD_DEFINITION___GET_SIGNATURE);

		tMethodSignatureEClass = createEClass(TMETHOD_SIGNATURE);
		createEReference(tMethodSignatureEClass, TMETHOD_SIGNATURE__METHOD);
		createEReference(tMethodSignatureEClass, TMETHOD_SIGNATURE__RETURN_TYPE);
		createEReference(tMethodSignatureEClass, TMETHOD_SIGNATURE__PARAMETERS);
		createEReference(tMethodSignatureEClass, TMETHOD_SIGNATURE__FIRST_PARAMETER);
		createEOperation(tMethodSignatureEClass, TMETHOD_SIGNATURE___GET_SIGNATURE_STRING);
		createEOperation(tMethodSignatureEClass, TMETHOD_SIGNATURE___GET_TDEFINITION__TABSTRACTTYPE);
		createEOperation(tMethodSignatureEClass, TMETHOD_SIGNATURE___TO_STRING);
		createEOperation(tMethodSignatureEClass, TMETHOD_SIGNATURE___GET_METHOD_DEFINITIONS);

		tPackageEClass = createEClass(TPACKAGE);
		createEReference(tPackageEClass, TPACKAGE__SUBPACKAGES);
		createEReference(tPackageEClass, TPACKAGE__PARENT);
		createEReference(tPackageEClass, TPACKAGE__CLASSES);
		createEReference(tPackageEClass, TPACKAGE__INTERFACES);
		createEReference(tPackageEClass, TPACKAGE__OWNED_TYPES);
		createEReference(tPackageEClass, TPACKAGE__MODEL);
		createEAttribute(tPackageEClass, TPACKAGE__TNAME);
		createEOperation(tPackageEClass, TPACKAGE___GET_FULLY_QUALIFIED_NAME);
		createEOperation(tPackageEClass, TPACKAGE___GET_ALL_OWNED_TYPES);
		createEOperation(tPackageEClass, TPACKAGE___GET_ALL_OWNED_CLASSES);
		createEOperation(tPackageEClass, TPACKAGE___GET_BASE_PACKAGE);
		createEOperation(tPackageEClass, TPACKAGE___CREATE_TCLASS__STRING_BOOLEAN_TVISIBILITY);

		tParameterEClass = createEClass(TPARAMETER);
		createEReference(tParameterEClass, TPARAMETER__NEXT);
		createEReference(tParameterEClass, TPARAMETER__PREVIOUS);
		createEReference(tParameterEClass, TPARAMETER__TYPE);

		tSignatureEClass = createEClass(TSIGNATURE);
		createEReference(tSignatureEClass, TSIGNATURE__DEFINITIONS);
		createEOperation(tSignatureEClass, TSIGNATURE___GET_SIGNATURE_STRING);
		createEOperation(tSignatureEClass, TSIGNATURE___GET_TDEFINITION__TABSTRACTTYPE);

		typeGraphEClass = createEClass(TYPE_GRAPH);
		createEReference(typeGraphEClass, TYPE_GRAPH__PACKAGES);
		createEReference(typeGraphEClass, TYPE_GRAPH__METHODS);
		createEReference(typeGraphEClass, TYPE_GRAPH__FIELDS);
		createEReference(typeGraphEClass, TYPE_GRAPH__CLASSES);
		createEReference(typeGraphEClass, TYPE_GRAPH__INTERFACES);
		createEReference(typeGraphEClass, TYPE_GRAPH__OWNED_TYPES);
		createEReference(typeGraphEClass, TYPE_GRAPH__TANNOTATION_TYPES);
		createEAttribute(typeGraphEClass, TYPE_GRAPH__TNAME);
		createEOperation(typeGraphEClass, TYPE_GRAPH___GET_DECLARED_TCLASSES);
		createEOperation(typeGraphEClass, TYPE_GRAPH___TO_STRING);
		createEOperation(typeGraphEClass, TYPE_GRAPH___GET_PACKAGE__STRING);
		createEOperation(typeGraphEClass, TYPE_GRAPH___GET_PACKAGE__ELIST);
		createEOperation(typeGraphEClass, TYPE_GRAPH___GET_CLASS__STRING);
		createEOperation(typeGraphEClass, TYPE_GRAPH___GET_INTERFACE__STRING);
		createEOperation(typeGraphEClass, TYPE_GRAPH___GET_METHOD__STRING);
		createEOperation(typeGraphEClass, TYPE_GRAPH___GET_FIELD__STRING);
		createEOperation(typeGraphEClass, TYPE_GRAPH___GET_SIGNATURE__STRING);
		createEOperation(typeGraphEClass, TYPE_GRAPH___GET_FIELD_SIGNATURE__STRING);
		createEOperation(typeGraphEClass, TYPE_GRAPH___GET_METHOD_SIGNATURE__STRING);
		createEOperation(typeGraphEClass, TYPE_GRAPH___GET_DEFINITION__STRING);
		createEOperation(typeGraphEClass, TYPE_GRAPH___GET_FIELD_DEFINITION__STRING);
		createEOperation(typeGraphEClass, TYPE_GRAPH___GET_METHOD_DEFINITION__STRING);
		createEOperation(typeGraphEClass, TYPE_GRAPH___CREATE_PACKAGE__STRING);

		tInterfaceEClass = createEClass(TINTERFACE);
		createEReference(tInterfaceEClass, TINTERFACE__IMPLEMENTED_BY);
		createEReference(tInterfaceEClass, TINTERFACE__PARENT_INTERFACES);
		createEReference(tInterfaceEClass, TINTERFACE__CHILD_INTERFACES);
		createEOperation(tInterfaceEClass, TINTERFACE___IS_SUB_TYPE_OF__TABSTRACTTYPE);
		createEOperation(tInterfaceEClass, TINTERFACE___IS_SUPER_TYPE_OF__TABSTRACTTYPE);
		createEOperation(tInterfaceEClass, TINTERFACE___HAS_COMMON_SUPER_TYPE__TABSTRACTTYPE);

		tAbstractTypeEClass = createEClass(TABSTRACT_TYPE);
		createEReference(tAbstractTypeEClass, TABSTRACT_TYPE__MODEL);
		createEReference(tAbstractTypeEClass, TABSTRACT_TYPE__PACKAGE);
		createEReference(tAbstractTypeEClass, TABSTRACT_TYPE__SIGNATURE);
		createEReference(tAbstractTypeEClass, TABSTRACT_TYPE__DEFINES);
		createEAttribute(tAbstractTypeEClass, TABSTRACT_TYPE__TLIB);
		createEAttribute(tAbstractTypeEClass, TABSTRACT_TYPE__TNAME);
		createEReference(tAbstractTypeEClass, TABSTRACT_TYPE__TMODIFIER);
		createEReference(tAbstractTypeEClass, TABSTRACT_TYPE__INNER_TYPES);
		createEReference(tAbstractTypeEClass, TABSTRACT_TYPE__OUTER_TYPE);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___IS_SUPER_TYPE_OF__TABSTRACTTYPE);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___IS_SUB_TYPE_OF__TABSTRACTTYPE);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___IS_DECLARED);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___GET_FULLY_QUALIFIED_NAME);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___GET_TMETHOD_SIGNATURE__STRING);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___GET_TMETHOD_DEFINITION__STRING);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___GET_BASE_PACKAGE);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___GET_TDEFINITION__TSIGNATURE);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___GET_TDEFINITION__STRING);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___HAS_TMEMBER__TMEMBER);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___HAS_COMMON_SUPER_TYPE__TABSTRACTTYPE);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___FILL_SAME_TYPE__ELIST);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___IS_INNER_TYPE__TABSTRACTTYPE);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___GET_REAL_PACKAGE__TABSTRACTTYPE);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___GET_TFIELD_SIGNATURE__STRING);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___GET_TFIELD_DEFINITION__STRING);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___CREATE_METHOD_DEFINITION__STRING_TABSTRACTTYPE_INT_INT_ELIST_ELIST_ELIST_BOOLEAN_TVISIBILITY);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___CREATE_FIELD_DEFINITION__STRING_TABSTRACTTYPE_INT_INT_BOOLEAN_TVISIBILITY);

		tReadEClass = createEClass(TREAD);

		tWriteEClass = createEClass(TWRITE);

		tModifierEClass = createEClass(TMODIFIER);
		createEAttribute(tModifierEClass, TMODIFIER__TVISIBILITY);
		createEAttribute(tModifierEClass, TMODIFIER__IS_STATIC);

		tSyntethicMethodEClass = createEClass(TSYNTETHIC_METHOD);
		createEReference(tSyntethicMethodEClass, TSYNTETHIC_METHOD__ORIGINAL_METHOD_DEFINITION);
		createEOperation(tSyntethicMethodEClass, TSYNTETHIC_METHOD___GET_SIGNATURE);

		tUnresolvedTypeEClass = createEClass(TUNRESOLVED_TYPE);

		tNameEClass = createEClass(TNAME);
		createEAttribute(tNameEClass, TNAME__TNAME);

		tFlowEClass = createEClass(TFLOW);
		createEReference(tFlowEClass, TFLOW__FLOW_OWNER);

		tAbstractFlowElementEClass = createEClass(TABSTRACT_FLOW_ELEMENT);
		createEReference(tAbstractFlowElementEClass, TABSTRACT_FLOW_ELEMENT__OWNED_FLOWS);
		createEReference(tAbstractFlowElementEClass, TABSTRACT_FLOW_ELEMENT__INCOMING_FLOWS);
		createEReference(tAbstractFlowElementEClass, TABSTRACT_FLOW_ELEMENT__OUTGOING_FLOWS);

		tReadWriteEClass = createEClass(TREAD_WRITE);

		tConstructorEClass = createEClass(TCONSTRUCTOR);

		tEnumEClass = createEClass(TENUM);

		tAbstractMultiplicityEClass = createEClass(TABSTRACT_MULTIPLICITY);
		createEAttribute(tAbstractMultiplicityEClass, TABSTRACT_MULTIPLICITY__LOWER_BOUND);
		createEAttribute(tAbstractMultiplicityEClass, TABSTRACT_MULTIPLICITY__UPPER_BOUND);
		createEOperation(tAbstractMultiplicityEClass, TABSTRACT_MULTIPLICITY___IS_ARRAY);

		// Create enums
		tVisibilityEEnum = createEEnum(TVISIBILITY);
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
		AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAnnotationsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tAccessEClass.getESuperTypes().add(this.getTAbstractFlowElement());
		tAccessEClass.getESuperTypes().add(theAnnotationsPackage.getTAnnotatable());
		tClassEClass.getESuperTypes().add(this.getTAbstractType());
		tFieldEClass.getESuperTypes().add(this.getTName());
		tFieldDefinitionEClass.getESuperTypes().add(this.getTMember());
		tFieldSignatureEClass.getESuperTypes().add(this.getTSignature());
		tFieldSignatureEClass.getESuperTypes().add(this.getTAbstractMultiplicity());
		tCallEClass.getESuperTypes().add(this.getTAccess());
		tMemberEClass.getESuperTypes().add(theAnnotationsPackage.getTAnnotatable());
		tMemberEClass.getESuperTypes().add(this.getTAbstractFlowElement());
		tMethodEClass.getESuperTypes().add(this.getTName());
		tMethodDefinitionEClass.getESuperTypes().add(this.getTMember());
		tMethodDefinitionEClass.getESuperTypes().add(this.getTAbstractMultiplicity());
		tMethodSignatureEClass.getESuperTypes().add(this.getTSignature());
		tMethodSignatureEClass.getESuperTypes().add(this.getTAbstractMultiplicity());
		tPackageEClass.getESuperTypes().add(theAnnotationsPackage.getTAnnotatable());
		tParameterEClass.getESuperTypes().add(theAnnotationsPackage.getTAnnotatable());
		tParameterEClass.getESuperTypes().add(this.getTAbstractFlowElement());
		tParameterEClass.getESuperTypes().add(this.getTAbstractMultiplicity());
		tSignatureEClass.getESuperTypes().add(theAnnotationsPackage.getTAnnotatable());
		tSignatureEClass.getESuperTypes().add(this.getTAbstractFlowElement());
		typeGraphEClass.getESuperTypes().add(theAnnotationsPackage.getTAnnotatable());
		tInterfaceEClass.getESuperTypes().add(this.getTAbstractType());
		tAbstractTypeEClass.getESuperTypes().add(theAnnotationsPackage.getTAnnotatable());
		tReadEClass.getESuperTypes().add(this.getTAccess());
		tWriteEClass.getESuperTypes().add(this.getTAccess());
		tSyntethicMethodEClass.getESuperTypes().add(this.getTMember());
		tUnresolvedTypeEClass.getESuperTypes().add(this.getTClass());
		tUnresolvedTypeEClass.getESuperTypes().add(this.getTInterface());
		tFlowEClass.getESuperTypes().add(this.getTAbstractFlowElement());
		tReadWriteEClass.getESuperTypes().add(this.getTAccess());
		tConstructorEClass.getESuperTypes().add(theAnnotationsPackage.getTAnnotation());
		tEnumEClass.getESuperTypes().add(theAnnotationsPackage.getTAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(tAccessEClass, TAccess.class, "TAccess", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAccess_Target(), this.getTMember(), this.getTMember_AccessedBy(), "target", null, 1, 1, TAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAccess_Source(), this.getTMember(), this.getTMember_Accessing(), "source", null, 1, 1, TAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAccess_StaticType(), this.getTAbstractType(), null, "staticType", null, 0, 1, TAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tClassEClass, TClass.class, "TClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTClass_ParentClasses(), this.getTClass(), this.getTClass_ChildClasses(), "parentClasses", null, 0, -1, TClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTClass_ChildClasses(), this.getTClass(), this.getTClass_ParentClasses(), "childClasses", null, 0, -1, TClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTClass_Implements(), this.getTInterface(), this.getTInterface_ImplementedBy(), "implements", null, 0, -1, TClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTClass__GetDeclaredTMethodDefinitions(), this.getTMethodDefinition(), "getDeclaredTMethodDefinitions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTClass__GetAllTMembers(), this.getTMember(), "getAllTMembers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTClass__GetAllChildren(), this.getTClass(), "getAllChildren", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getTClass__IsSubTypeOf__TAbstractType(), ecorePackage.getEBoolean(), "isSubTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "tType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTClass__IsSuperTypeOf__TAbstractType(), ecorePackage.getEBoolean(), "isSuperTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "tType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTClass__GetAllOutgoingAccesses__TSignature(), this.getTMember(), "getAllOutgoingAccesses", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTSignature(), "signature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTClass__HasAParentThisTMember__TMember(), ecorePackage.getEBoolean(), "hasAParentThisTMember", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTMember(), "member", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTClass__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTClass__GetParents(), this.getTClass(), "getParents", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTClass__HasCommonSuperType__TAbstractType(), ecorePackage.getEBoolean(), "hasCommonSuperType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "tType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tFieldEClass, TField.class, "TField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTField_Signatures(), this.getTFieldSignature(), this.getTFieldSignature_Field(), "signatures", null, 0, -1, TField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTField_Model(), this.getTypeGraph(), this.getTypeGraph_Fields(), "model", null, 1, 1, TField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tFieldDefinitionEClass, TFieldDefinition.class, "TFieldDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFieldDefinition_Hiding(), this.getTFieldDefinition(), this.getTFieldDefinition_HiddenBy(), "hiding", null, 0, 1, TFieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFieldDefinition_HiddenBy(), this.getTFieldDefinition(), this.getTFieldDefinition_Hiding(), "hiddenBy", null, 0, -1, TFieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTFieldDefinition__GetSignature(), this.getTFieldSignature(), "getSignature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tFieldSignatureEClass, TFieldSignature.class, "TFieldSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFieldSignature_Field(), this.getTField(), this.getTField_Signatures(), "field", null, 1, 1, TFieldSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFieldSignature_Type(), this.getTAbstractType(), null, "type", null, 1, 1, TFieldSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTFieldSignature__GetSignatureString(), ecorePackage.getEString(), "getSignatureString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTFieldSignature__GetTDefinition__TAbstractType(), this.getTFieldDefinition(), "getTDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "defining", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTFieldSignature__GetFieldDefinitions(), this.getTFieldDefinition(), "getFieldDefinitions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(tCallEClass, TCall.class, "TCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tMemberEClass, TMember.class, "TMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMember_DefinedBy(), this.getTAbstractType(), this.getTAbstractType_Defines(), "definedBy", null, 1, 1, TMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMember_AccessedBy(), this.getTAccess(), this.getTAccess_Target(), "accessedBy", null, 0, -1, TMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTMember_Accessing(), this.getTAccess(), this.getTAccess_Source(), "accessing", null, 0, -1, TMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMember_TModifier(), this.getTModifier(), null, "tModifier", null, 0, 1, TMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMember_Signature(), this.getTSignature(), this.getTSignature_Definitions(), "signature", null, 1, 1, TMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTMember__GetSignatureString(), ecorePackage.getEString(), "getSignatureString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tMethodEClass, TMethod.class, "TMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMethod_Signatures(), this.getTMethodSignature(), this.getTMethodSignature_Method(), "signatures", null, 0, -1, TMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTMethod_Model(), this.getTypeGraph(), this.getTypeGraph_Methods(), "model", null, 1, 1, TMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTMethod__GetMethodSignature__TAbstractType_int_int_EList_EList_EList(), this.getTMethodSignature(), "getMethodSignature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "returnType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "returnLowerBound", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "returnUpperBound", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "parameterLowerBounds", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "parameterUpperBounds", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTMethod__CreateMethodSignature__TAbstractType_int_int_EList_EList_EList(), this.getTMethodSignature(), "createMethodSignature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "returnType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "returnLowerBound", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "returnUpperBound", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "parameterLowerBounds", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "parameterUpperBounds", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(tMethodDefinitionEClass, TMethodDefinition.class, "TMethodDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMethodDefinition_Overriding(), this.getTMethodDefinition(), this.getTMethodDefinition_OverriddenBy(), "overriding", null, 0, -1, TMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodDefinition_OverriddenBy(), this.getTMethodDefinition(), this.getTMethodDefinition_Overriding(), "overriddenBy", null, 0, -1, TMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTMethodDefinition_Overloading(), this.getTMethodDefinition(), this.getTMethodDefinition_OverloadedBy(), "overloading", null, 0, -1, TMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTMethodDefinition_OverloadedBy(), this.getTMethodDefinition(), this.getTMethodDefinition_Overloading(), "overloadedBy", null, 0, -1, TMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTMethodDefinition_ReturnType(), this.getTAbstractType(), null, "returnType", null, 0, 1, TMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodDefinition_SyntethicMethods(), this.getTSyntethicMethod(), this.getTSyntethicMethod_OriginalMethodDefinition(), "syntethicMethods", null, 0, -1, TMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTMethodDefinition__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTMethodDefinition__GetSignature(), this.getTMethodSignature(), "getSignature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tMethodSignatureEClass, TMethodSignature.class, "TMethodSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMethodSignature_Method(), this.getTMethod(), this.getTMethod_Signatures(), "method", null, 1, 1, TMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodSignature_ReturnType(), this.getTAbstractType(), null, "returnType", null, 0, 1, TMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodSignature_Parameters(), this.getTParameter(), null, "parameters", null, 0, -1, TMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodSignature_FirstParameter(), this.getTParameter(), null, "firstParameter", null, 0, 1, TMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTMethodSignature__GetSignatureString(), ecorePackage.getEString(), "getSignatureString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTMethodSignature__GetTDefinition__TAbstractType(), this.getTMethodDefinition(), "getTDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "defining", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTMethodSignature__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTMethodSignature__GetMethodDefinitions(), this.getTMethodDefinition(), "getMethodDefinitions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(tPackageEClass, TPackage.class, "TPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTPackage_Subpackages(), this.getTPackage(), this.getTPackage_Parent(), "subpackages", null, 0, -1, TPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPackage_Parent(), this.getTPackage(), this.getTPackage_Subpackages(), "parent", null, 0, 1, TPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPackage_Classes(), this.getTClass(), null, "classes", null, 0, -1, TPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTPackage_Interfaces(), this.getTInterface(), null, "interfaces", null, 0, -1, TPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTPackage_OwnedTypes(), this.getTAbstractType(), this.getTAbstractType_Package(), "ownedTypes", null, 0, -1, TPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTPackage_Model(), this.getTypeGraph(), null, "model", null, 1, 1, TPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPackage_TName(), ecorePackage.getEString(), "tName", null, 1, 1, TPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTPackage__GetFullyQualifiedName(), ecorePackage.getEString(), "getFullyQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTPackage__GetAllOwnedTypes(), this.getTAbstractType(), "getAllOwnedTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTPackage__GetAllOwnedClasses(), this.getTClass(), "getAllOwnedClasses", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTPackage__GetBasePackage(), this.getTPackage(), "getBasePackage", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTPackage__CreateTClass__String_boolean_TVisibility(), this.getTClass(), "createTClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "lib", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTVisibility(), "visibility", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tParameterEClass, TParameter.class, "TParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTParameter_Next(), this.getTParameter(), this.getTParameter_Previous(), "next", null, 0, 1, TParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTParameter_Previous(), this.getTParameter(), this.getTParameter_Next(), "previous", null, 0, 1, TParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTParameter_Type(), this.getTAbstractType(), null, "type", null, 1, 1, TParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tSignatureEClass, TSignature.class, "TSignature", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTSignature_Definitions(), this.getTMember(), this.getTMember_Signature(), "definitions", null, 0, -1, TSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTSignature__GetSignatureString(), ecorePackage.getEString(), "getSignatureString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTSignature__GetTDefinition__TAbstractType(), this.getTMember(), "getTDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "defining", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeGraphEClass, TypeGraph.class, "TypeGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeGraph_Packages(), this.getTPackage(), null, "packages", null, 0, -1, TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypeGraph_Methods(), this.getTMethod(), this.getTMethod_Model(), "methods", null, 0, -1, TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypeGraph_Fields(), this.getTField(), this.getTField_Model(), "fields", null, 0, -1, TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypeGraph_Classes(), this.getTClass(), null, "classes", null, 0, -1, TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypeGraph_Interfaces(), this.getTInterface(), null, "interfaces", null, 0, -1, TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypeGraph_OwnedTypes(), this.getTAbstractType(), this.getTAbstractType_Model(), "ownedTypes", null, 0, -1, TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypeGraph_TAnnotationTypes(), theAnnotationsPackage.getTAnnotationType(), null, "tAnnotationTypes", null, 0, -1, TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTypeGraph_TName(), ecorePackage.getEString(), "tName", null, 1, 1, TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTypeGraph__GetDeclaredTClasses(), this.getTClass(), "getDeclaredTClasses", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTypeGraph__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeGraph__GetPackage__String(), this.getTPackage(), "getPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "namespace", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeGraph__GetPackage__EList(), this.getTPackage(), "getPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "namespace", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeGraph__GetClass__String(), this.getTClass(), "getClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fullyQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeGraph__GetInterface__String(), this.getTInterface(), "getInterface", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fullyQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeGraph__GetMethod__String(), this.getTMethod(), "getMethod", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeGraph__GetField__String(), this.getTField(), "getField", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fullyQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeGraph__GetSignature__String(), this.getTSignature(), "getSignature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signature", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getTypeGraph__GetFieldSignature__String(), this.getTFieldSignature(), "getFieldSignature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signature", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getTypeGraph__GetMethodSignature__String(), this.getTMethodSignature(), "getMethodSignature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signature", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getTypeGraph__GetDefinition__String(), this.getTMember(), "getDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signature", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getTypeGraph__GetFieldDefinition__String(), this.getTFieldDefinition(), "getFieldDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signature", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getTypeGraph__GetMethodDefinition__String(), this.getTMethodDefinition(), "getMethodDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signature", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getTypeGraph__CreatePackage__String(), this.getTPackage(), "createPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "namespace", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tInterfaceEClass, TInterface.class, "TInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTInterface_ImplementedBy(), this.getTClass(), this.getTClass_Implements(), "implementedBy", null, 0, -1, TInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTInterface_ParentInterfaces(), this.getTInterface(), this.getTInterface_ChildInterfaces(), "parentInterfaces", null, 0, -1, TInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTInterface_ChildInterfaces(), this.getTInterface(), this.getTInterface_ParentInterfaces(), "childInterfaces", null, 0, -1, TInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getTInterface__IsSubTypeOf__TAbstractType(), ecorePackage.getEBoolean(), "isSubTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "tType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTInterface__IsSuperTypeOf__TAbstractType(), ecorePackage.getEBoolean(), "isSuperTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "tType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTInterface__HasCommonSuperType__TAbstractType(), ecorePackage.getEBoolean(), "hasCommonSuperType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "tType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tAbstractTypeEClass, TAbstractType.class, "TAbstractType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAbstractType_Model(), this.getTypeGraph(), this.getTypeGraph_OwnedTypes(), "model", null, 1, 1, TAbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAbstractType_Package(), this.getTPackage(), this.getTPackage_OwnedTypes(), "package", null, 0, 1, TAbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAbstractType_Signature(), this.getTSignature(), null, "signature", null, 0, -1, TAbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTAbstractType_Defines(), this.getTMember(), this.getTMember_DefinedBy(), "defines", null, 0, -1, TAbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTAbstractType_TLib(), ecorePackage.getEBoolean(), "tLib", null, 1, 1, TAbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTAbstractType_TName(), ecorePackage.getEString(), "tName", null, 1, 1, TAbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTAbstractType_TModifier(), this.getTModifier(), null, "tModifier", null, 0, 1, TAbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAbstractType_InnerTypes(), this.getTAbstractType(), this.getTAbstractType_OuterType(), "innerTypes", null, 0, -1, TAbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTAbstractType_OuterType(), this.getTAbstractType(), this.getTAbstractType_InnerTypes(), "outerType", null, 0, 1, TAbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTAbstractType__IsSuperTypeOf__TAbstractType(), ecorePackage.getEBoolean(), "isSuperTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "tType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTAbstractType__IsSubTypeOf__TAbstractType(), ecorePackage.getEBoolean(), "isSubTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "tType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTAbstractType__IsDeclared(), ecorePackage.getEBoolean(), "isDeclared", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTAbstractType__GetFullyQualifiedName(), ecorePackage.getEString(), "getFullyQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTAbstractType__GetTMethodSignature__String(), this.getTMethodSignature(), "getTMethodSignature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTAbstractType__GetTMethodDefinition__String(), this.getTMethodDefinition(), "getTMethodDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTAbstractType__GetBasePackage(), this.getTPackage(), "getBasePackage", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTAbstractType__GetTDefinition__TSignature(), this.getTMember(), "getTDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTSignature(), "signature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTAbstractType__GetTDefinition__String(), this.getTMember(), "getTDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signatureString", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getTAbstractType__HasTMember__TMember(), ecorePackage.getEBoolean(), "hasTMember", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTMember(), "member", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTAbstractType__HasCommonSuperType__TAbstractType(), ecorePackage.getEBoolean(), "hasCommonSuperType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "tType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTAbstractType__FillSameType__EList(), null, "fillSameType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "list", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTAbstractType__IsInnerType__TAbstractType(), ecorePackage.getEBoolean(), "isInnerType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "tAbstractType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTAbstractType__GetRealPackage__TAbstractType(), this.getTPackage(), "getRealPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTAbstractType__GetTFieldSignature__String(), this.getTFieldSignature(), "getTFieldSignature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTAbstractType__GetTFieldDefinition__String(), this.getTFieldDefinition(), "getTFieldDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "signature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTAbstractType__CreateMethodDefinition__String_TAbstractType_int_int_EList_EList_EList_boolean_TVisibility(), this.getTMethodDefinition(), "createMethodDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "returnType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "returnLowerBound", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "returnUpperBound", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "parameterLowerBounds", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "parameterUpperBounds", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "static_", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTVisibility(), "visibility", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTAbstractType__CreateFieldDefinition__String_TAbstractType_int_int_boolean_TVisibility(), this.getTFieldDefinition(), "createFieldDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTAbstractType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "lowerBound", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "upperBound", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "static_", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTVisibility(), "visibility", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tReadEClass, TRead.class, "TRead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tWriteEClass, TWrite.class, "TWrite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tModifierEClass, TModifier.class, "TModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTModifier_TVisibility(), this.getTVisibility(), "tVisibility", null, 0, 1, TModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTModifier_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 1, 1, TModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tSyntethicMethodEClass, TSyntethicMethod.class, "TSyntethicMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTSyntethicMethod_OriginalMethodDefinition(), this.getTMethodDefinition(), this.getTMethodDefinition_SyntethicMethods(), "originalMethodDefinition", null, 1, 1, TSyntethicMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTSyntethicMethod__GetSignature(), this.getTMethodSignature(), "getSignature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tUnresolvedTypeEClass, TUnresolvedType.class, "TUnresolvedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tNameEClass, TName.class, "TName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTName_TName(), ecorePackage.getEString(), "tName", null, 1, 1, TName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tFlowEClass, TFlow.class, "TFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFlow_FlowOwner(), this.getTAbstractFlowElement(), this.getTAbstractFlowElement_OwnedFlows(), "flowOwner", null, 1, 1, TFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tAbstractFlowElementEClass, TAbstractFlowElement.class, "TAbstractFlowElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAbstractFlowElement_OwnedFlows(), this.getTFlow(), this.getTFlow_FlowOwner(), "ownedFlows", null, 0, -1, TAbstractFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTAbstractFlowElement_IncomingFlows(), this.getTAbstractFlowElement(), this.getTAbstractFlowElement_OutgoingFlows(), "incomingFlows", null, 0, -1, TAbstractFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTAbstractFlowElement_OutgoingFlows(), this.getTAbstractFlowElement(), this.getTAbstractFlowElement_IncomingFlows(), "outgoingFlows", null, 0, -1, TAbstractFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tReadWriteEClass, TReadWrite.class, "TReadWrite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tConstructorEClass, TConstructor.class, "TConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tEnumEClass, TEnum.class, "TEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tAbstractMultiplicityEClass, TAbstractMultiplicity.class, "TAbstractMultiplicity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTAbstractMultiplicity_LowerBound(), ecorePackage.getEInt(), "lowerBound", "0", 0, 1, TAbstractMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTAbstractMultiplicity_UpperBound(), ecorePackage.getEInt(), "upperBound", "1", 0, 1, TAbstractMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTAbstractMultiplicity__IsArray(), ecorePackage.getEBoolean(), "isArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tVisibilityEEnum, TVisibility.class, "TVisibility");
		addEEnumLiteral(tVisibilityEEnum, TVisibility.TPRIVATE);
		addEEnumLiteral(tVisibilityEEnum, TVisibility.TPACKAGE);
		addEEnumLiteral(tVisibilityEEnum, TVisibility.TPROTECTED);
		addEEnumLiteral(tVisibilityEEnum, TVisibility.TPUBLIC);

		// Create resource
		createResource(eNS_URI);
	}

} //BasicPackageImpl
