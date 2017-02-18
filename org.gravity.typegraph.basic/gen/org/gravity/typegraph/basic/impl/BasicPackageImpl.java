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
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TAnnotatable;
import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TAnnotationType;
import org.gravity.typegraph.basic.TCall;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TClassEntity;
import org.gravity.typegraph.basic.TConstructorDefinition;
import org.gravity.typegraph.basic.TConstructorName;
import org.gravity.typegraph.basic.TConstructorSignature;
import org.gravity.typegraph.basic.TDeclaredEntity;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldEntity;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMemberEntity;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodEntity;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TParameterList;
import org.gravity.typegraph.basic.TRead;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TTextAnnotation;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TWrite;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.containers.ContainersPackage;

import org.gravity.typegraph.basic.containers.impl.ContainersPackageImpl;

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
	private EClass tAnnotatableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAnnotationEClass = null;

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
	private EClass tParameterListEClass = null;

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
	private EClass tAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTextAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tConstructorNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tConstructorSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tConstructorDefinitionEClass = null;

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
	private EClass tDeclaredEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tClassEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFieldEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tMethodEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tMemberEntityEClass = null;

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
		if (isInited)
			return (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Obtain or create and register package
		BasicPackageImpl theBasicPackage = (BasicPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof BasicPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new BasicPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ContainersPackageImpl theContainersPackage = (ContainersPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ContainersPackage.eNS_URI) instanceof ContainersPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ContainersPackage.eNS_URI)
						: ContainersPackage.eINSTANCE);

		// Create package meta-data objects
		theBasicPackage.createPackageContents();
		theContainersPackage.createPackageContents();

		// Initialize created meta-data
		theBasicPackage.initializePackageContents();
		theContainersPackage.initializePackageContents();

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
	public EClass getTAccess() {
		return tAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAccess_TTarget() {
		return (EReference) tAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAccess_TSource() {
		return (EReference) tAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTAnnotatable() {
		return tAnnotatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAnnotatable_TAnnotation() {
		return (EReference) tAnnotatableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTAnnotation() {
		return tAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAnnotation_TAnnotated() {
		return (EReference) tAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAnnotation_Type() {
		return (EReference) tAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTClass() {
		return tClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTClass_ParentClass() {
		return (EReference) tClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTClass_ChildClasses() {
		return (EReference) tClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTClass_Implements() {
		return (EReference) tClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTClass_TClassEntity() {
		return (EReference) tClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTClass__GetAllTMembers() {
		return tClassEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTField() {
		return tFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTField_Signatures() {
		return (EReference) tFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTField_Pg() {
		return (EReference) tFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTField_TName() {
		return (EAttribute) tFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTFieldDefinition() {
		return tFieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFieldDefinition_Signature() {
		return (EReference) tFieldDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFieldDefinition_Hiding() {
		return (EReference) tFieldDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFieldDefinition_HiddenBy() {
		return (EReference) tFieldDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFieldDefinition_TFieldEntity() {
		return (EReference) tFieldDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTFieldDefinition__GetSignatureString() {
		return tFieldDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTFieldSignature() {
		return tFieldSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFieldSignature_Definitions() {
		return (EReference) tFieldSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFieldSignature_Field() {
		return (EReference) tFieldSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFieldSignature_Type() {
		return (EReference) tFieldSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTFieldSignature__GetSignatureString() {
		return tFieldSignatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCall() {
		return tCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMember() {
		return tMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMember_DefinedBy() {
		return (EReference) tMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMember_AccessedBy() {
		return (EReference) tMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMember_TAccessing() {
		return (EReference) tMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTMember__GetSignature() {
		return tMemberEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTMember__GetSignatureString() {
		return tMemberEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMethod() {
		return tMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethod_Pg() {
		return (EReference) tMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethod_Signatures() {
		return (EReference) tMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMethod_TName() {
		return (EAttribute) tMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMethodDefinition() {
		return tMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodDefinition_Signature() {
		return (EReference) tMethodDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodDefinition_Overriding() {
		return (EReference) tMethodDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodDefinition_OverriddenBy() {
		return (EReference) tMethodDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodDefinition_Overloading() {
		return (EReference) tMethodDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodDefinition_OverloadedBy() {
		return (EReference) tMethodDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodDefinition_ReturnType() {
		return (EReference) tMethodDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodDefinition_TMethodEntity() {
		return (EReference) tMethodDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTMethodDefinition__GetSignatureString() {
		return tMethodDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMethodSignature() {
		return tMethodSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodSignature_Method() {
		return (EReference) tMethodSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodSignature_ParamList() {
		return (EReference) tMethodSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodSignature_Definitions() {
		return (EReference) tMethodSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodSignature_ReturnType() {
		return (EReference) tMethodSignatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTMethodSignature__GetSignatureString() {
		return tMethodSignatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPackage() {
		return tPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPackage_Pg() {
		return (EReference) tPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPackage_Subpackage() {
		return (EReference) tPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPackage_Parent() {
		return (EReference) tPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPackage_Classes() {
		return (EReference) tPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPackage_Interfaces() {
		return (EReference) tPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPackage_OwnedTypes() {
		return (EReference) tPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPackage_TypeGraph() {
		return (EReference) tPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPackage_TName() {
		return (EAttribute) tPackageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTParameter() {
		return tParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTParameter_Next() {
		return (EReference) tParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTParameter_Previous() {
		return (EReference) tParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTParameter_Type() {
		return (EReference) tParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTParameterList() {
		return tParameterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTParameterList_Entries() {
		return (EReference) tParameterListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTParameterList_First() {
		return (EReference) tParameterListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSignature() {
		return tSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTSignature__GetSignatureString() {
		return tSignatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeGraph() {
		return typeGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeGraph_Packages() {
		return (EReference) typeGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeGraph_Methods() {
		return (EReference) typeGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeGraph_Fields() {
		return (EReference) typeGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeGraph_Classes() {
		return (EReference) typeGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeGraph_Interfaces() {
		return (EReference) typeGraphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeGraph_OwnedTypes() {
		return (EReference) typeGraphEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeGraph_TAnnotationTypes() {
		return (EReference) typeGraphEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeGraph_TName() {
		return (EAttribute) typeGraphEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeGraph_TDeclaredEntities() {
		return (EReference) typeGraphEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTInterface() {
		return tInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTInterface_ImplementedBy() {
		return (EReference) tInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTInterface_ParentInterfaces() {
		return (EReference) tInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTInterface_ChildInterfaces() {
		return (EReference) tInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTAbstractType() {
		return tAbstractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAbstractType_Pg() {
		return (EReference) tAbstractTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAbstractType_Package() {
		return (EReference) tAbstractTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAbstractType_Signature() {
		return (EReference) tAbstractTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAbstractType_Defines() {
		return (EReference) tAbstractTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAbstractType_TLib() {
		return (EAttribute) tAbstractTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTAbstractType_TName() {
		return (EAttribute) tAbstractTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTAbstractType__GetFullyQualifiedName() {
		return tAbstractTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTAnnotationType() {
		return tAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAnnotationType_Annotations() {
		return (EReference) tAnnotationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTTextAnnotation() {
		return tTextAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTextAnnotation_Text() {
		return (EAttribute) tTextAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTConstructorName() {
		return tConstructorNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTConstructorSignature() {
		return tConstructorSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTConstructorDefinition() {
		return tConstructorDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRead() {
		return tReadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTWrite() {
		return tWriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDeclaredEntity() {
		return tDeclaredEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDeclaredEntity_Pg() {
		return (EReference) tDeclaredEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDeclaredEntity_TVisibility() {
		return (EAttribute) tDeclaredEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTDeclaredEntity__GetParent() {
		return tDeclaredEntityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTDeclaredEntity__GetParents() {
		return tDeclaredEntityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTDeclaredEntity__GetPackage() {
		return tDeclaredEntityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTDeclaredEntity__GetMinimumRequiredVisibility__TDeclaredEntity() {
		return tDeclaredEntityEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTClassEntity() {
		return tClassEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTClassEntity_TClass() {
		return (EReference) tClassEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTFieldEntity() {
		return tFieldEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTFieldEntity_TFieldDefinition() {
		return (EReference) tFieldEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMethodEntity() {
		return tMethodEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMethodEntity_TMethodDefinition() {
		return (EReference) tMethodEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMemberEntity() {
		return tMemberEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTVisibility() {
		return tVisibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicFactory getBasicFactory() {
		return (BasicFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		tAccessEClass = createEClass(TACCESS);
		createEReference(tAccessEClass, TACCESS__TTARGET);
		createEReference(tAccessEClass, TACCESS__TSOURCE);

		tAnnotatableEClass = createEClass(TANNOTATABLE);
		createEReference(tAnnotatableEClass, TANNOTATABLE__TANNOTATION);

		tAnnotationEClass = createEClass(TANNOTATION);
		createEReference(tAnnotationEClass, TANNOTATION__TANNOTATED);
		createEReference(tAnnotationEClass, TANNOTATION__TYPE);

		tClassEClass = createEClass(TCLASS);
		createEReference(tClassEClass, TCLASS__PARENT_CLASS);
		createEReference(tClassEClass, TCLASS__CHILD_CLASSES);
		createEReference(tClassEClass, TCLASS__IMPLEMENTS);
		createEReference(tClassEClass, TCLASS__TCLASS_ENTITY);
		createEOperation(tClassEClass, TCLASS___GET_ALL_TMEMBERS);

		tFieldEClass = createEClass(TFIELD);
		createEReference(tFieldEClass, TFIELD__SIGNATURES);
		createEReference(tFieldEClass, TFIELD__PG);
		createEAttribute(tFieldEClass, TFIELD__TNAME);

		tFieldDefinitionEClass = createEClass(TFIELD_DEFINITION);
		createEReference(tFieldDefinitionEClass, TFIELD_DEFINITION__SIGNATURE);
		createEReference(tFieldDefinitionEClass, TFIELD_DEFINITION__HIDING);
		createEReference(tFieldDefinitionEClass, TFIELD_DEFINITION__HIDDEN_BY);
		createEReference(tFieldDefinitionEClass, TFIELD_DEFINITION__TFIELD_ENTITY);
		createEOperation(tFieldDefinitionEClass, TFIELD_DEFINITION___GET_SIGNATURE_STRING);

		tFieldSignatureEClass = createEClass(TFIELD_SIGNATURE);
		createEReference(tFieldSignatureEClass, TFIELD_SIGNATURE__DEFINITIONS);
		createEReference(tFieldSignatureEClass, TFIELD_SIGNATURE__FIELD);
		createEReference(tFieldSignatureEClass, TFIELD_SIGNATURE__TYPE);
		createEOperation(tFieldSignatureEClass, TFIELD_SIGNATURE___GET_SIGNATURE_STRING);

		tCallEClass = createEClass(TCALL);

		tMemberEClass = createEClass(TMEMBER);
		createEReference(tMemberEClass, TMEMBER__DEFINED_BY);
		createEReference(tMemberEClass, TMEMBER__ACCESSED_BY);
		createEReference(tMemberEClass, TMEMBER__TACCESSING);
		createEOperation(tMemberEClass, TMEMBER___GET_SIGNATURE);
		createEOperation(tMemberEClass, TMEMBER___GET_SIGNATURE_STRING);

		tMethodEClass = createEClass(TMETHOD);
		createEReference(tMethodEClass, TMETHOD__PG);
		createEReference(tMethodEClass, TMETHOD__SIGNATURES);
		createEAttribute(tMethodEClass, TMETHOD__TNAME);

		tMethodDefinitionEClass = createEClass(TMETHOD_DEFINITION);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__SIGNATURE);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__OVERRIDING);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__OVERRIDDEN_BY);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__OVERLOADING);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__OVERLOADED_BY);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__RETURN_TYPE);
		createEReference(tMethodDefinitionEClass, TMETHOD_DEFINITION__TMETHOD_ENTITY);
		createEOperation(tMethodDefinitionEClass, TMETHOD_DEFINITION___GET_SIGNATURE_STRING);

		tMethodSignatureEClass = createEClass(TMETHOD_SIGNATURE);
		createEReference(tMethodSignatureEClass, TMETHOD_SIGNATURE__METHOD);
		createEReference(tMethodSignatureEClass, TMETHOD_SIGNATURE__PARAM_LIST);
		createEReference(tMethodSignatureEClass, TMETHOD_SIGNATURE__DEFINITIONS);
		createEReference(tMethodSignatureEClass, TMETHOD_SIGNATURE__RETURN_TYPE);
		createEOperation(tMethodSignatureEClass, TMETHOD_SIGNATURE___GET_SIGNATURE_STRING);

		tPackageEClass = createEClass(TPACKAGE);
		createEReference(tPackageEClass, TPACKAGE__PG);
		createEReference(tPackageEClass, TPACKAGE__SUBPACKAGE);
		createEReference(tPackageEClass, TPACKAGE__PARENT);
		createEReference(tPackageEClass, TPACKAGE__CLASSES);
		createEReference(tPackageEClass, TPACKAGE__INTERFACES);
		createEReference(tPackageEClass, TPACKAGE__OWNED_TYPES);
		createEReference(tPackageEClass, TPACKAGE__TYPE_GRAPH);
		createEAttribute(tPackageEClass, TPACKAGE__TNAME);

		tParameterEClass = createEClass(TPARAMETER);
		createEReference(tParameterEClass, TPARAMETER__NEXT);
		createEReference(tParameterEClass, TPARAMETER__PREVIOUS);
		createEReference(tParameterEClass, TPARAMETER__TYPE);

		tParameterListEClass = createEClass(TPARAMETER_LIST);
		createEReference(tParameterListEClass, TPARAMETER_LIST__ENTRIES);
		createEReference(tParameterListEClass, TPARAMETER_LIST__FIRST);

		tSignatureEClass = createEClass(TSIGNATURE);
		createEOperation(tSignatureEClass, TSIGNATURE___GET_SIGNATURE_STRING);

		typeGraphEClass = createEClass(TYPE_GRAPH);
		createEReference(typeGraphEClass, TYPE_GRAPH__PACKAGES);
		createEReference(typeGraphEClass, TYPE_GRAPH__METHODS);
		createEReference(typeGraphEClass, TYPE_GRAPH__FIELDS);
		createEReference(typeGraphEClass, TYPE_GRAPH__CLASSES);
		createEReference(typeGraphEClass, TYPE_GRAPH__INTERFACES);
		createEReference(typeGraphEClass, TYPE_GRAPH__OWNED_TYPES);
		createEReference(typeGraphEClass, TYPE_GRAPH__TANNOTATION_TYPES);
		createEAttribute(typeGraphEClass, TYPE_GRAPH__TNAME);
		createEReference(typeGraphEClass, TYPE_GRAPH__TDECLARED_ENTITIES);

		tInterfaceEClass = createEClass(TINTERFACE);
		createEReference(tInterfaceEClass, TINTERFACE__IMPLEMENTED_BY);
		createEReference(tInterfaceEClass, TINTERFACE__PARENT_INTERFACES);
		createEReference(tInterfaceEClass, TINTERFACE__CHILD_INTERFACES);

		tAbstractTypeEClass = createEClass(TABSTRACT_TYPE);
		createEReference(tAbstractTypeEClass, TABSTRACT_TYPE__PG);
		createEReference(tAbstractTypeEClass, TABSTRACT_TYPE__PACKAGE);
		createEReference(tAbstractTypeEClass, TABSTRACT_TYPE__SIGNATURE);
		createEReference(tAbstractTypeEClass, TABSTRACT_TYPE__DEFINES);
		createEAttribute(tAbstractTypeEClass, TABSTRACT_TYPE__TLIB);
		createEAttribute(tAbstractTypeEClass, TABSTRACT_TYPE__TNAME);
		createEOperation(tAbstractTypeEClass, TABSTRACT_TYPE___GET_FULLY_QUALIFIED_NAME);

		tAnnotationTypeEClass = createEClass(TANNOTATION_TYPE);
		createEReference(tAnnotationTypeEClass, TANNOTATION_TYPE__ANNOTATIONS);

		tTextAnnotationEClass = createEClass(TTEXT_ANNOTATION);
		createEAttribute(tTextAnnotationEClass, TTEXT_ANNOTATION__TEXT);

		tConstructorNameEClass = createEClass(TCONSTRUCTOR_NAME);

		tConstructorSignatureEClass = createEClass(TCONSTRUCTOR_SIGNATURE);

		tConstructorDefinitionEClass = createEClass(TCONSTRUCTOR_DEFINITION);

		tReadEClass = createEClass(TREAD);

		tWriteEClass = createEClass(TWRITE);

		tDeclaredEntityEClass = createEClass(TDECLARED_ENTITY);
		createEReference(tDeclaredEntityEClass, TDECLARED_ENTITY__PG);
		createEAttribute(tDeclaredEntityEClass, TDECLARED_ENTITY__TVISIBILITY);
		createEOperation(tDeclaredEntityEClass, TDECLARED_ENTITY___GET_PARENT);
		createEOperation(tDeclaredEntityEClass, TDECLARED_ENTITY___GET_PARENTS);
		createEOperation(tDeclaredEntityEClass, TDECLARED_ENTITY___GET_PACKAGE);
		createEOperation(tDeclaredEntityEClass, TDECLARED_ENTITY___GET_MINIMUM_REQUIRED_VISIBILITY__TDECLAREDENTITY);

		tClassEntityEClass = createEClass(TCLASS_ENTITY);
		createEReference(tClassEntityEClass, TCLASS_ENTITY__TCLASS);

		tFieldEntityEClass = createEClass(TFIELD_ENTITY);
		createEReference(tFieldEntityEClass, TFIELD_ENTITY__TFIELD_DEFINITION);

		tMethodEntityEClass = createEClass(TMETHOD_ENTITY);
		createEReference(tMethodEntityEClass, TMETHOD_ENTITY__TMETHOD_DEFINITION);

		tMemberEntityEClass = createEClass(TMEMBER_ENTITY);

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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ContainersPackage theContainersPackage = (ContainersPackage) EPackage.Registry.INSTANCE
				.getEPackage(ContainersPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theContainersPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tClassEClass.getESuperTypes().add(this.getTAbstractType());
		tFieldDefinitionEClass.getESuperTypes().add(this.getTMember());
		tFieldSignatureEClass.getESuperTypes().add(this.getTSignature());
		tCallEClass.getESuperTypes().add(this.getTAccess());
		tMemberEClass.getESuperTypes().add(this.getTAnnotatable());
		tMethodDefinitionEClass.getESuperTypes().add(this.getTMember());
		tMethodSignatureEClass.getESuperTypes().add(this.getTSignature());
		tPackageEClass.getESuperTypes().add(this.getTAnnotatable());
		tSignatureEClass.getESuperTypes().add(this.getTAnnotatable());
		tInterfaceEClass.getESuperTypes().add(this.getTAbstractType());
		tAbstractTypeEClass.getESuperTypes().add(this.getTAnnotatable());
		tAnnotationTypeEClass.getESuperTypes().add(this.getTAbstractType());
		tTextAnnotationEClass.getESuperTypes().add(this.getTAnnotation());
		tConstructorNameEClass.getESuperTypes().add(this.getTMethod());
		tConstructorSignatureEClass.getESuperTypes().add(this.getTMethodSignature());
		tConstructorDefinitionEClass.getESuperTypes().add(this.getTMethodDefinition());
		tReadEClass.getESuperTypes().add(this.getTAccess());
		tWriteEClass.getESuperTypes().add(this.getTAccess());
		tClassEntityEClass.getESuperTypes().add(this.getTDeclaredEntity());
		tFieldEntityEClass.getESuperTypes().add(this.getTMemberEntity());
		tMethodEntityEClass.getESuperTypes().add(this.getTMemberEntity());
		tMemberEntityEClass.getESuperTypes().add(this.getTDeclaredEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(tAccessEClass, TAccess.class, "TAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAccess_TTarget(), this.getTMember(), this.getTMember_AccessedBy(), "tTarget", null, 1, 1,
				TAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAccess_TSource(), this.getTMember(), this.getTMember_TAccessing(), "tSource", null, 1, 1,
				TAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tAnnotatableEClass, TAnnotatable.class, "TAnnotatable", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAnnotatable_TAnnotation(), this.getTAnnotation(), this.getTAnnotation_TAnnotated(),
				"tAnnotation", null, 0, -1, TAnnotatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tAnnotationEClass, TAnnotation.class, "TAnnotation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAnnotation_TAnnotated(), this.getTAnnotatable(), this.getTAnnotatable_TAnnotation(),
				"tAnnotated", null, 1, 1, TAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAnnotation_Type(), this.getTAnnotationType(), this.getTAnnotationType_Annotations(), "type",
				null, 1, 1, TAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tClassEClass, TClass.class, "TClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTClass_ParentClass(), this.getTClass(), this.getTClass_ChildClasses(), "parentClass", null, 0,
				1, TClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTClass_ChildClasses(), this.getTClass(), this.getTClass_ParentClass(), "childClasses", null,
				0, -1, TClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTClass_Implements(), this.getTInterface(), this.getTInterface_ImplementedBy(), "implements",
				null, 0, -1, TClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTClass_TClassEntity(), this.getTClassEntity(), this.getTClassEntity_TClass(), "tClassEntity",
				null, 1, 1, TClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTClass__GetAllTMembers(), theContainersPackage.getTMemberContainer(), "getAllTMembers", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(tFieldEClass, TField.class, "TField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTField_Signatures(), this.getTFieldSignature(), this.getTFieldSignature_Field(), "signatures",
				null, 0, -1, TField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTField_Pg(), this.getTypeGraph(), this.getTypeGraph_Fields(), "pg", null, 1, 1, TField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTField_TName(), ecorePackage.getEString(), "tName", null, 1, 1, TField.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tFieldDefinitionEClass, TFieldDefinition.class, "TFieldDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFieldDefinition_Signature(), this.getTFieldSignature(),
				this.getTFieldSignature_Definitions(), "signature", null, 1, 1, TFieldDefinition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTFieldDefinition_Hiding(), this.getTFieldDefinition(), this.getTFieldDefinition_HiddenBy(),
				"hiding", null, 0, 1, TFieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFieldDefinition_HiddenBy(), this.getTFieldDefinition(), this.getTFieldDefinition_Hiding(),
				"hiddenBy", null, 0, -1, TFieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFieldDefinition_TFieldEntity(), this.getTFieldEntity(),
				this.getTFieldEntity_TFieldDefinition(), "tFieldEntity", null, 1, 1, TFieldDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTFieldDefinition__GetSignatureString(), ecorePackage.getEString(), "getSignatureString", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(tFieldSignatureEClass, TFieldSignature.class, "TFieldSignature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFieldSignature_Definitions(), this.getTFieldDefinition(),
				this.getTFieldDefinition_Signature(), "definitions", null, 0, -1, TFieldSignature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTFieldSignature_Field(), this.getTField(), this.getTField_Signatures(), "field", null, 1, 1,
				TFieldSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFieldSignature_Type(), this.getTAbstractType(), null, "type", null, 1, 1,
				TFieldSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTFieldSignature__GetSignatureString(), ecorePackage.getEString(), "getSignatureString", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(tCallEClass, TCall.class, "TCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tMemberEClass, TMember.class, "TMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMember_DefinedBy(), this.getTAbstractType(), this.getTAbstractType_Defines(), "definedBy",
				null, 1, 1, TMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMember_AccessedBy(), this.getTAccess(), this.getTAccess_TTarget(), "accessedBy", null, 0, -1,
				TMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMember_TAccessing(), this.getTAccess(), this.getTAccess_TSource(), "tAccessing", null, 0, -1,
				TMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTMember__GetSignature(), this.getTSignature(), "getSignature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTMember__GetSignatureString(), ecorePackage.getEString(), "getSignatureString", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(tMethodEClass, TMethod.class, "TMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMethod_Pg(), this.getTypeGraph(), this.getTypeGraph_Methods(), "pg", null, 1, 1,
				TMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethod_Signatures(), this.getTMethodSignature(), this.getTMethodSignature_Method(),
				"signatures", null, 0, -1, TMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMethod_TName(), ecorePackage.getEString(), "tName", null, 1, 1, TMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tMethodDefinitionEClass, TMethodDefinition.class, "TMethodDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMethodDefinition_Signature(), this.getTMethodSignature(),
				this.getTMethodSignature_Definitions(), "signature", null, 1, 1, TMethodDefinition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTMethodDefinition_Overriding(), this.getTMethodDefinition(),
				this.getTMethodDefinition_OverriddenBy(), "overriding", null, 0, 1, TMethodDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodDefinition_OverriddenBy(), this.getTMethodDefinition(),
				this.getTMethodDefinition_Overriding(), "overriddenBy", null, 0, -1, TMethodDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodDefinition_Overloading(), this.getTMethodDefinition(),
				this.getTMethodDefinition_OverloadedBy(), "overloading", null, 0, -1, TMethodDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodDefinition_OverloadedBy(), this.getTMethodDefinition(),
				this.getTMethodDefinition_Overloading(), "overloadedBy", null, 0, -1, TMethodDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodDefinition_ReturnType(), this.getTAbstractType(), null, "returnType", null, 0, 1,
				TMethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodDefinition_TMethodEntity(), this.getTMethodEntity(),
				this.getTMethodEntity_TMethodDefinition(), "tMethodEntity", null, 1, 1, TMethodDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTMethodDefinition__GetSignatureString(), ecorePackage.getEString(), "getSignatureString", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(tMethodSignatureEClass, TMethodSignature.class, "TMethodSignature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMethodSignature_Method(), this.getTMethod(), this.getTMethod_Signatures(), "method", null, 1,
				1, TMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodSignature_ParamList(), this.getTParameterList(), null, "paramList", null, 0, 1,
				TMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodSignature_Definitions(), this.getTMethodDefinition(),
				this.getTMethodDefinition_Signature(), "definitions", null, 0, -1, TMethodSignature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMethodSignature_ReturnType(), this.getTAbstractType(), null, "returnType", null, 0, 1,
				TMethodSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTMethodSignature__GetSignatureString(), ecorePackage.getEString(), "getSignatureString", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(tPackageEClass, TPackage.class, "TPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTPackage_Pg(), this.getTypeGraph(), this.getTypeGraph_Packages(), "pg", null, 0, 1,
				TPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPackage_Subpackage(), this.getTPackage(), this.getTPackage_Parent(), "subpackage", null, 0,
				-1, TPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPackage_Parent(), this.getTPackage(), this.getTPackage_Subpackage(), "parent", null, 0, 1,
				TPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPackage_Classes(), this.getTClass(), null, "classes", null, 0, -1, TPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPackage_Interfaces(), this.getTInterface(), null, "interfaces", null, 0, -1, TPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPackage_OwnedTypes(), this.getTAbstractType(), this.getTAbstractType_Package(), "ownedTypes",
				null, 0, -1, TPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPackage_TypeGraph(), this.getTypeGraph(), null, "typeGraph", null, 1, 1, TPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPackage_TName(), ecorePackage.getEString(), "tName", null, 1, 1, TPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(tParameterEClass, TParameter.class, "TParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTParameter_Next(), this.getTParameter(), this.getTParameter_Previous(), "next", null, 0, 1,
				TParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTParameter_Previous(), this.getTParameter(), this.getTParameter_Next(), "previous", null, 0,
				1, TParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTParameter_Type(), this.getTAbstractType(), null, "type", null, 1, 1, TParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tParameterListEClass, TParameterList.class, "TParameterList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTParameterList_Entries(), this.getTParameter(), null, "entries", null, 0, -1,
				TParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTParameterList_First(), this.getTParameter(), null, "first", null, 0, 1, TParameterList.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tSignatureEClass, TSignature.class, "TSignature", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTSignature__GetSignatureString(), ecorePackage.getEString(), "getSignatureString", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(typeGraphEClass, TypeGraph.class, "TypeGraph", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeGraph_Packages(), this.getTPackage(), this.getTPackage_Pg(), "packages", null, 0, -1,
				TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeGraph_Methods(), this.getTMethod(), this.getTMethod_Pg(), "methods", null, 0, -1,
				TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeGraph_Fields(), this.getTField(), this.getTField_Pg(), "fields", null, 0, -1,
				TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeGraph_Classes(), this.getTClass(), null, "classes", null, 0, -1, TypeGraph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeGraph_Interfaces(), this.getTInterface(), null, "interfaces", null, 0, -1,
				TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeGraph_OwnedTypes(), this.getTAbstractType(), this.getTAbstractType_Pg(), "ownedTypes",
				null, 0, -1, TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeGraph_TAnnotationTypes(), this.getTAnnotationType(), null, "tAnnotationTypes", null, 0,
				-1, TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeGraph_TName(), ecorePackage.getEString(), "tName", null, 1, 1, TypeGraph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getTypeGraph_TDeclaredEntities(), this.getTDeclaredEntity(), this.getTDeclaredEntity_Pg(),
				"tDeclaredEntities", null, 0, -1, TypeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tInterfaceEClass, TInterface.class, "TInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTInterface_ImplementedBy(), this.getTClass(), this.getTClass_Implements(), "implementedBy",
				null, 0, -1, TInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTInterface_ParentInterfaces(), this.getTInterface(), this.getTInterface_ChildInterfaces(),
				"parentInterfaces", null, 0, -1, TInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTInterface_ChildInterfaces(), this.getTInterface(), this.getTInterface_ParentInterfaces(),
				"childInterfaces", null, 0, -1, TInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tAbstractTypeEClass, TAbstractType.class, "TAbstractType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAbstractType_Pg(), this.getTypeGraph(), this.getTypeGraph_OwnedTypes(), "pg", null, 1, 1,
				TAbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAbstractType_Package(), this.getTPackage(), this.getTPackage_OwnedTypes(), "package", null,
				0, 1, TAbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAbstractType_Signature(), this.getTSignature(), null, "signature", null, 0, -1,
				TAbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAbstractType_Defines(), this.getTMember(), this.getTMember_DefinedBy(), "defines", null, 0,
				-1, TAbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTAbstractType_TLib(), ecorePackage.getEBoolean(), "tLib", null, 1, 1, TAbstractType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getTAbstractType_TName(), ecorePackage.getEString(), "tName", null, 1, 1, TAbstractType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEOperation(getTAbstractType__GetFullyQualifiedName(), ecorePackage.getEString(), "getFullyQualifiedName", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(tAnnotationTypeEClass, TAnnotationType.class, "TAnnotationType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAnnotationType_Annotations(), this.getTAnnotation(), this.getTAnnotation_Type(),
				"annotations", null, 0, -1, TAnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTextAnnotationEClass, TTextAnnotation.class, "TTextAnnotation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTTextAnnotation_Text(), ecorePackage.getEString(), "text", null, 1, 1, TTextAnnotation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(tConstructorNameEClass, TConstructorName.class, "TConstructorName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tConstructorSignatureEClass, TConstructorSignature.class, "TConstructorSignature", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tConstructorDefinitionEClass, TConstructorDefinition.class, "TConstructorDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tReadEClass, TRead.class, "TRead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tWriteEClass, TWrite.class, "TWrite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tDeclaredEntityEClass, TDeclaredEntity.class, "TDeclaredEntity", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTDeclaredEntity_Pg(), this.getTypeGraph(), this.getTypeGraph_TDeclaredEntities(), "pg", null,
				1, 1, TDeclaredEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDeclaredEntity_TVisibility(), this.getTVisibility(), "tVisibility", null, 1, 1,
				TDeclaredEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getTDeclaredEntity__GetParent(), this.getTDeclaredEntity(), "getParent", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getTDeclaredEntity__GetParents(), this.getTDeclaredEntity(), "getParents", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getTDeclaredEntity__GetPackage(), this.getTPackage(), "getPackage", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getTDeclaredEntity__GetMinimumRequiredVisibility__TDeclaredEntity(),
				this.getTVisibility(), "getMinimumRequiredVisibility", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTDeclaredEntity(), "tDeclaredEntity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tClassEntityEClass, TClassEntity.class, "TClassEntity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTClassEntity_TClass(), this.getTClass(), this.getTClass_TClassEntity(), "tClass", null, 1, 1,
				TClassEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tFieldEntityEClass, TFieldEntity.class, "TFieldEntity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFieldEntity_TFieldDefinition(), this.getTFieldDefinition(),
				this.getTFieldDefinition_TFieldEntity(), "tFieldDefinition", null, 1, 1, TFieldEntity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tMethodEntityEClass, TMethodEntity.class, "TMethodEntity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMethodEntity_TMethodDefinition(), this.getTMethodDefinition(),
				this.getTMethodDefinition_TMethodEntity(), "tMethodDefinition", null, 1, 1, TMethodEntity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tMemberEntityEClass, TMemberEntity.class, "TMemberEntity", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

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
