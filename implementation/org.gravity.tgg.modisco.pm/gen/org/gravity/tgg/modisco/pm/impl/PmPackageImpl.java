/**
 */
package org.gravity.tgg.modisco.pm.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.modisco.java.emf.JavaPackage;

import org.gravity.modisco.ModiscoPackage;

import org.gravity.tgg.modisco.pm.PmFactory;
import org.gravity.tgg.modisco.pm.PmPackage;

import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.Rules.impl.RulesPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PmPackageImpl extends EPackageImpl implements PmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "pm.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astNodeToTAnnotatableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierToTClassEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationFragmentToTFieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mModifierToTModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierToTMethodEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSyntethicMethodToTSyntethicMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFlowToTFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineCommentToTTextAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSingleVariableAccessToTAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageToTPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSignatureToTSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierToTFieldEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassDeclarationToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeToTAbstractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedTypeDeclarationToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValuePairToTAnnotationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccessToTAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mDefinitionToTMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalToTNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mAbstractFlowElementToTAbstractFlowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFieldNameToTFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelToTypeGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodInvocationToTAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierToAbstractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameterToTClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEntryToTParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticTypeToAccessStaticTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationToTAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mMethodNameToTMethodEClass = null;

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
	 * @see org.gravity.tgg.modisco.pm.PmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PmPackageImpl() {
		super(eNS_URI, PmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static PmPackage init() {
		if (isInited)
			return (PmPackage) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PmPackageImpl thePmPackage = registeredPmPackage instanceof PmPackageImpl ? (PmPackageImpl) registeredPmPackage
				: new PmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ModiscoPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();
		JavaPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (registeredPackage instanceof RulesPackageImpl
				? registeredPackage
				: RulesPackage.eINSTANCE);

		// Load packages
		thePmPackage.loadPackage();

		// Fix loaded packages
		thePmPackage.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		thePmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PmPackage.eNS_URI, thePmPackage);
		return thePmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getASTNodeToTAnnotatable() {
		if (astNodeToTAnnotatableEClass == null) {
			astNodeToTAnnotatableEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return astNodeToTAnnotatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getASTNodeToTAnnotatable_Source() {
		return (EReference) getASTNodeToTAnnotatable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getASTNodeToTAnnotatable_Target() {
		return (EReference) getASTNodeToTAnnotatable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifierToTClassEntity() {
		if (modifierToTClassEntityEClass == null) {
			modifierToTClassEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return modifierToTClassEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToTClassEntity_Source() {
		return (EReference) getModifierToTClassEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToTClassEntity_Target() {
		return (EReference) getModifierToTClassEntity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclarationFragmentToTFieldDefinition() {
		if (variableDeclarationFragmentToTFieldDefinitionEClass == null) {
			variableDeclarationFragmentToTFieldDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(PmPackage.eNS_URI).getEClassifiers().get(2);
		}
		return variableDeclarationFragmentToTFieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationFragmentToTFieldDefinition_Source() {
		return (EReference) getVariableDeclarationFragmentToTFieldDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationFragmentToTFieldDefinition_Target() {
		return (EReference) getVariableDeclarationFragmentToTFieldDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMModifierToTModifier() {
		if (mModifierToTModifierEClass == null) {
			mModifierToTModifierEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return mModifierToTModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMModifierToTModifier_Source() {
		return (EReference) getMModifierToTModifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMModifierToTModifier_Target() {
		return (EReference) getMModifierToTModifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifierToTMethodEntity() {
		if (modifierToTMethodEntityEClass == null) {
			modifierToTMethodEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return modifierToTMethodEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToTMethodEntity_Source() {
		return (EReference) getModifierToTMethodEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToTMethodEntity_Target() {
		return (EReference) getModifierToTMethodEntity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMSyntethicMethodToTSyntethicMethod() {
		if (mSyntethicMethodToTSyntethicMethodEClass == null) {
			mSyntethicMethodToTSyntethicMethodEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(PmPackage.eNS_URI).getEClassifiers().get(5);
		}
		return mSyntethicMethodToTSyntethicMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMSyntethicMethodToTSyntethicMethod_Source() {
		return (EReference) getMSyntethicMethodToTSyntethicMethod().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMSyntethicMethodToTSyntethicMethod_Target() {
		return (EReference) getMSyntethicMethodToTSyntethicMethod().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMFlowToTFlow() {
		if (mFlowToTFlowEClass == null) {
			mFlowToTFlowEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI).getEClassifiers()
					.get(6);
		}
		return mFlowToTFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMFlowToTFlow_Source() {
		return (EReference) getMFlowToTFlow().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMFlowToTFlow_Target() {
		return (EReference) getMFlowToTFlow().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineCommentToTTextAnnotation() {
		if (lineCommentToTTextAnnotationEClass == null) {
			lineCommentToTTextAnnotationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return lineCommentToTTextAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineCommentToTTextAnnotation_Source() {
		return (EReference) getLineCommentToTTextAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineCommentToTTextAnnotation_Target() {
		return (EReference) getLineCommentToTTextAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMSingleVariableAccessToTAccess() {
		if (mSingleVariableAccessToTAccessEClass == null) {
			mSingleVariableAccessToTAccessEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return mSingleVariableAccessToTAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMSingleVariableAccessToTAccess_Source() {
		return (EReference) getMSingleVariableAccessToTAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMSingleVariableAccessToTAccess_Target() {
		return (EReference) getMSingleVariableAccessToTAccess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageToTPackage() {
		if (packageToTPackageEClass == null) {
			packageToTPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(9);
		}
		return packageToTPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageToTPackage_Source() {
		return (EReference) getPackageToTPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageToTPackage_Target() {
		return (EReference) getPackageToTPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMSignatureToTSignature() {
		if (mSignatureToTSignatureEClass == null) {
			mSignatureToTSignatureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(10);
		}
		return mSignatureToTSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMSignatureToTSignature_Source() {
		return (EReference) getMSignatureToTSignature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMSignatureToTSignature_Target() {
		return (EReference) getMSignatureToTSignature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifierToTFieldEntity() {
		if (modifierToTFieldEntityEClass == null) {
			modifierToTFieldEntityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(11);
		}
		return modifierToTFieldEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToTFieldEntity_Source() {
		return (EReference) getModifierToTFieldEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToTFieldEntity_Target() {
		return (EReference) getModifierToTFieldEntity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClassDeclarationToTClass() {
		if (anonymousClassDeclarationToTClassEClass == null) {
			anonymousClassDeclarationToTClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(12);
		}
		return anonymousClassDeclarationToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassDeclarationToTClass_Source() {
		return (EReference) getAnonymousClassDeclarationToTClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassDeclarationToTClass_Target() {
		return (EReference) getAnonymousClassDeclarationToTClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeToTAbstractType() {
		if (typeToTAbstractTypeEClass == null) {
			typeToTAbstractTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(13);
		}
		return typeToTAbstractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeToTAbstractType_Source() {
		return (EReference) getTypeToTAbstractType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeToTAbstractType_Target() {
		return (EReference) getTypeToTAbstractType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedTypeDeclarationToTClass() {
		if (unresolvedTypeDeclarationToTClassEClass == null) {
			unresolvedTypeDeclarationToTClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(14);
		}
		return unresolvedTypeDeclarationToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnresolvedTypeDeclarationToTClass_Source() {
		return (EReference) getUnresolvedTypeDeclarationToTClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnresolvedTypeDeclarationToTClass_Target() {
		return (EReference) getUnresolvedTypeDeclarationToTClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValuePairToTAnnotationValue() {
		if (annotationMemberValuePairToTAnnotationValueEClass == null) {
			annotationMemberValuePairToTAnnotationValueEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(PmPackage.eNS_URI).getEClassifiers().get(15);
		}
		return annotationMemberValuePairToTAnnotationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValuePairToTAnnotationValue_Source() {
		return (EReference) getAnnotationMemberValuePairToTAnnotationValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValuePairToTAnnotationValue_Target() {
		return (EReference) getAnnotationMemberValuePairToTAnnotationValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldAccessToTAccess() {
		if (fieldAccessToTAccessEClass == null) {
			fieldAccessToTAccessEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(16);
		}
		return fieldAccessToTAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessToTAccess_Source() {
		return (EReference) getFieldAccessToTAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccessToTAccess_Target() {
		return (EReference) getFieldAccessToTAccess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDefinitionToTMember() {
		if (mDefinitionToTMemberEClass == null) {
			mDefinitionToTMemberEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(17);
		}
		return mDefinitionToTMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDefinitionToTMember_Source() {
		return (EReference) getMDefinitionToTMember().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDefinitionToTMember_Target() {
		return (EReference) getMDefinitionToTMember().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralToTNode() {
		if (literalToTNodeEClass == null) {
			literalToTNodeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI).getEClassifiers()
					.get(18);
		}
		return literalToTNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLiteralToTNode_Source() {
		return (EReference) getLiteralToTNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLiteralToTNode_Target() {
		return (EReference) getLiteralToTNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMAbstractFlowElementToTAbstractFlowElement() {
		if (mAbstractFlowElementToTAbstractFlowElementEClass == null) {
			mAbstractFlowElementToTAbstractFlowElementEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(PmPackage.eNS_URI).getEClassifiers().get(19);
		}
		return mAbstractFlowElementToTAbstractFlowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMAbstractFlowElementToTAbstractFlowElement_Source() {
		return (EReference) getMAbstractFlowElementToTAbstractFlowElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMAbstractFlowElementToTAbstractFlowElement_Target() {
		return (EReference) getMAbstractFlowElementToTAbstractFlowElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMFieldNameToTField() {
		if (mFieldNameToTFieldEClass == null) {
			mFieldNameToTFieldEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(20);
		}
		return mFieldNameToTFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMFieldNameToTField_Source() {
		return (EReference) getMFieldNameToTField().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMFieldNameToTField_Target() {
		return (EReference) getMFieldNameToTField().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelToTypeGraph() {
		if (modelToTypeGraphEClass == null) {
			modelToTypeGraphEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(21);
		}
		return modelToTypeGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelToTypeGraph_Source() {
		return (EReference) getModelToTypeGraph().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelToTypeGraph_Target() {
		return (EReference) getModelToTypeGraph().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMethodInvocationToTAccess() {
		if (abstractMethodInvocationToTAccessEClass == null) {
			abstractMethodInvocationToTAccessEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(22);
		}
		return abstractMethodInvocationToTAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodInvocationToTAccess_Source() {
		return (EReference) getAbstractMethodInvocationToTAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodInvocationToTAccess_Target() {
		return (EReference) getAbstractMethodInvocationToTAccess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifierToAbstractType() {
		if (modifierToAbstractTypeEClass == null) {
			modifierToAbstractTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(23);
		}
		return modifierToAbstractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToAbstractType_Source() {
		return (EReference) getModifierToAbstractType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierToAbstractType_Target() {
		return (EReference) getModifierToAbstractType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeParameterToTClass() {
		if (typeParameterToTClassEClass == null) {
			typeParameterToTClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(24);
		}
		return typeParameterToTClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeParameterToTClass_Source() {
		return (EReference) getTypeParameterToTClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeParameterToTClass_Target() {
		return (EReference) getTypeParameterToTClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMEntryToTParameter() {
		if (mEntryToTParameterEClass == null) {
			mEntryToTParameterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(25);
		}
		return mEntryToTParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMEntryToTParameter_Source() {
		return (EReference) getMEntryToTParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMEntryToTParameter_Target() {
		return (EReference) getMEntryToTParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaticTypeToAccessStaticType() {
		if (staticTypeToAccessStaticTypeEClass == null) {
			staticTypeToAccessStaticTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(26);
		}
		return staticTypeToAccessStaticTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaticTypeToAccessStaticType_Source() {
		return (EReference) getStaticTypeToAccessStaticType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaticTypeToAccessStaticType_Target() {
		return (EReference) getStaticTypeToAccessStaticType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationToTAnnotation() {
		if (annotationToTAnnotationEClass == null) {
			annotationToTAnnotationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(27);
		}
		return annotationToTAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationToTAnnotation_Source() {
		return (EReference) getAnnotationToTAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationToTAnnotation_Target() {
		return (EReference) getAnnotationToTAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMMethodNameToTMethod() {
		if (mMethodNameToTMethodEClass == null) {
			mMethodNameToTMethodEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI)
					.getEClassifiers().get(28);
		}
		return mMethodNameToTMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMMethodNameToTMethod_Source() {
		return (EReference) getMMethodNameToTMethod().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMMethodNameToTMethod_Target() {
		return (EReference) getMMethodNameToTMethod().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PmFactory getPmFactory() {
		return (PmFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.gravity.tgg.modisco.pm." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //PmPackageImpl
