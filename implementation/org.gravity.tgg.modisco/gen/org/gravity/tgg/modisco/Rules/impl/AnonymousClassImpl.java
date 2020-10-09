/**
 */
package org.gravity.tgg.modisco.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.Type;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MDefinition;

import org.gravity.tgg.modisco.AnonymousClassDeclarationToTClass;
import org.gravity.tgg.modisco.ModiscoFactory;
import org.gravity.tgg.modisco.PackageToTPackage;

import org.gravity.tgg.modisco.Rules.AnonymousClass;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;
import org.moflon.tgg.language.modelgenerator.RuleEntryList;

import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.CCMatch;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.TripleMatch;

import org.moflon.tgg.runtime.impl.AbstractRuleImpl;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import org.gravity.tgg.modisco.csp.constraints.*;
import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnonymousClassImpl extends AbstractRuleImpl implements AnonymousClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnonymousClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassInstanceCreation mCreation, AbstractTypeDeclaration mType,
			AnonymousClassDeclaration mAnonymous, org.eclipse.modisco.java.Package mPackage, MDefinition mMebmber) {

		Object[] result1_black = AnonymousClassImpl.pattern_AnonymousClass_0_1_initialbindings_blackBBBBBBB(this, match,
				mCreation, mType, mAnonymous, mPackage, mMebmber);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mCreation] = " + mCreation + ", " + "[mType] = " + mType + ", "
					+ "[mAnonymous] = " + mAnonymous + ", " + "[mPackage] = " + mPackage + ", " + "[mMebmber] = "
					+ mMebmber + ".");
		}

		Object[] result2_bindingAndBlack = AnonymousClassImpl
				.pattern_AnonymousClass_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, mCreation, mType, mAnonymous,
						mPackage, mMebmber);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mCreation] = " + mCreation + ", " + "[mType] = " + mType + ", "
					+ "[mAnonymous] = " + mAnonymous + ", " + "[mPackage] = " + mPackage + ", " + "[mMebmber] = "
					+ mMebmber + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousClassImpl.pattern_AnonymousClass_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnonymousClassImpl
					.pattern_AnonymousClass_0_4_collectelementstobetranslated_blackBBBBBB(match, mCreation, mType,
							mAnonymous, mPackage, mMebmber);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mCreation] = " + mCreation + ", " + "[mType] = " + mType + ", " + "[mAnonymous] = "
						+ mAnonymous + ", " + "[mPackage] = " + mPackage + ", " + "[mMebmber] = " + mMebmber + ".");
			}
			AnonymousClassImpl.pattern_AnonymousClass_0_4_collectelementstobetranslated_greenBBBFF(match, mCreation,
					mAnonymous);
			//nothing EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mAnonymous__mCreation____classInstanceCreation = (EMoflonEdge) result4_green[4];

			Object[] result5_black = AnonymousClassImpl.pattern_AnonymousClass_0_5_collectcontextelements_blackBBBBBB(
					match, mCreation, mType, mAnonymous, mPackage, mMebmber);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mCreation] = " + mCreation + ", " + "[mType] = " + mType + ", " + "[mAnonymous] = "
						+ mAnonymous + ", " + "[mPackage] = " + mPackage + ", " + "[mMebmber] = " + mMebmber + ".");
			}
			AnonymousClassImpl.pattern_AnonymousClass_0_5_collectcontextelements_greenBBBBBFFFFF(match, mCreation,
					mType, mPackage, mMebmber);
			//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge mMebmber__mCreation____mMethodInvocations = (EMoflonEdge) result5_green[7];
			//nothing EMoflonEdge mType__mMebmber____bodyDeclarations = (EMoflonEdge) result5_green[8];
			//nothing EMoflonEdge mMebmber__mType____abstractTypeDeclaration = (EMoflonEdge) result5_green[9];

			// 
			AnonymousClassImpl.pattern_AnonymousClass_0_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					mCreation, mType, mAnonymous, mPackage, mMebmber);
			return AnonymousClassImpl.pattern_AnonymousClass_0_7_expressionF();
		} else {
			return AnonymousClassImpl.pattern_AnonymousClass_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousClassImpl
				.pattern_AnonymousClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		ClassInstanceCreation mCreation = (ClassInstanceCreation) result1_bindingAndBlack[1];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[2];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[3];
		PackageToTPackage mPackageToTPackage = (PackageToTPackage) result1_bindingAndBlack[4];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result1_bindingAndBlack[5];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[6];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[7];
		MDefinition mMebmber = (MDefinition) result1_bindingAndBlack[8];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = AnonymousClassImpl
				.pattern_AnonymousClass_1_1_performtransformation_greenFFBFBBBB(tPackage, mAnonymous, tType, pg, csp);
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result1_green[0];
		TClass tAnonymous = (TClass) result1_green[1];
		TPackage tNewPackage = (TPackage) result1_green[3];

		Object[] result2_black = AnonymousClassImpl.pattern_AnonymousClass_1_2_collecttranslatedelements_blackBBBB(
				eAnonymousClassDeclarationToTClass, tAnonymous, tNewPackage, mAnonymous);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[eAnonymousClassDeclarationToTClass] = "
							+ eAnonymousClassDeclarationToTClass + ", " + "[tAnonymous] = " + tAnonymous + ", "
							+ "[tNewPackage] = " + tNewPackage + ", " + "[mAnonymous] = " + mAnonymous + ".");
		}
		Object[] result2_green = AnonymousClassImpl.pattern_AnonymousClass_1_2_collecttranslatedelements_greenFBBBB(
				eAnonymousClassDeclarationToTClass, tAnonymous, tNewPackage, mAnonymous);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousClassImpl.pattern_AnonymousClass_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
				ruleresult, mTypeToTType, eAnonymousClassDeclarationToTClass, tAnonymous, mCreation, tPackage, mType,
				tNewPackage, mPackageToTPackage, mAnonymous, mPackage, tType, mMebmber, pg);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ", " + "[tAnonymous] = " + tAnonymous + ", "
					+ "[mCreation] = " + mCreation + ", " + "[tPackage] = " + tPackage + ", " + "[mType] = " + mType
					+ ", " + "[tNewPackage] = " + tNewPackage + ", " + "[mPackageToTPackage] = " + mPackageToTPackage
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mPackage] = " + mPackage + ", " + "[tType] = "
					+ tType + ", " + "[mMebmber] = " + mMebmber + ", " + "[pg] = " + pg + ".");
		}
		AnonymousClassImpl.pattern_AnonymousClass_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFF(ruleresult,
				eAnonymousClassDeclarationToTClass, tAnonymous, mCreation, tPackage, tNewPackage, mAnonymous, tType,
				pg);
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tAnonymous____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tType__tAnonymous____innerTypes = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tAnonymous__tType____outerType = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tNewPackage__tAnonymous____ownedTypes = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tAnonymous__tNewPackage____package = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge pg__tAnonymous____ownedTypes = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tAnonymous__pg____pg = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tNewPackage__tPackage____parent = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tPackage__tNewPackage____subpackage = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge pg__tAnonymous____classes = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge mAnonymous__mCreation____classInstanceCreation = (EMoflonEdge) result3_green[21];

		// 
		// 
		AnonymousClassImpl.pattern_AnonymousClass_1_5_registerobjects_expressionBBBBBBBBBBBBBBB(this, ruleresult,
				mTypeToTType, eAnonymousClassDeclarationToTClass, tAnonymous, mCreation, tPackage, mType, tNewPackage,
				mPackageToTPackage, mAnonymous, mPackage, tType, mMebmber, pg);
		return AnonymousClassImpl.pattern_AnonymousClass_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousClassImpl
				.pattern_AnonymousClass_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousClassImpl
				.pattern_AnonymousClass_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousClassImpl.pattern_AnonymousClass_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassInstanceCreation mCreation = (ClassInstanceCreation) result2_binding[0];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_binding[1];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_binding[2];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_binding[3];
		MDefinition mMebmber = (MDefinition) result2_binding[4];
		for (Object[] result2_black : AnonymousClassImpl.pattern_AnonymousClass_2_2_corematch_blackFBFBFBBFBB(mCreation,
				mType, mAnonymous, mPackage, mMebmber, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			TPackage tPackage = (TPackage) result2_black[2];
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[4];
			TAbstractType tType = (TAbstractType) result2_black[7];
			// ForEach 
			for (Object[] result3_black : AnonymousClassImpl.pattern_AnonymousClass_2_3_findcontext_blackBBBBBBBBBF(
					mTypeToTType, mCreation, tPackage, mType, mPackageToTPackage, mAnonymous, mPackage, tType,
					mMebmber)) {
				TypeGraph pg = (TypeGraph) result3_black[9];
				Object[] result3_green = AnonymousClassImpl
						.pattern_AnonymousClass_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(mTypeToTType, mCreation,
								tPackage, mType, mPackageToTPackage, mAnonymous, mPackage, tType, mMebmber, pg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mMebmber__mCreation____mMethodInvocations = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mType__mMebmber____bodyDeclarations = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge mMebmber__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge mAnonymous__mCreation____classInstanceCreation = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[25];

				Object[] result4_bindingAndBlack = AnonymousClassImpl
						.pattern_AnonymousClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
								mTypeToTType, mCreation, tPackage, mType, mPackageToTPackage, mAnonymous, mPackage,
								tType, mMebmber, pg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[mCreation] = " + mCreation + ", " + "[tPackage] = " + tPackage + ", "
							+ "[mType] = " + mType + ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ", "
							+ "[mAnonymous] = " + mAnonymous + ", " + "[mPackage] = " + mPackage + ", " + "[tType] = "
							+ tType + ", " + "[mMebmber] = " + mMebmber + ", " + "[pg] = " + pg + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousClassImpl.pattern_AnonymousClass_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnonymousClassImpl
							.pattern_AnonymousClass_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousClassImpl.pattern_AnonymousClass_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousClassImpl.pattern_AnonymousClass_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassInstanceCreation mCreation, AbstractTypeDeclaration mType,
			AnonymousClassDeclaration mAnonymous, org.eclipse.modisco.java.Package mPackage, MDefinition mMebmber) {
		match.registerObject("mCreation", mCreation);
		match.registerObject("mType", mType);
		match.registerObject("mAnonymous", mAnonymous);
		match.registerObject("mPackage", mPackage);
		match.registerObject("mMebmber", mMebmber);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassInstanceCreation mCreation, AbstractTypeDeclaration mType,
			AnonymousClassDeclaration mAnonymous, org.eclipse.modisco.java.Package mPackage, MDefinition mMebmber) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			ClassInstanceCreation mCreation, TPackage tPackage, AbstractTypeDeclaration mType,
			PackageToTPackage mPackageToTPackage, AnonymousClassDeclaration mAnonymous,
			org.eclipse.modisco.java.Package mPackage, TAbstractType tType, MDefinition mMebmber, TypeGraph pg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$1");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");

		// Create unbound variables
		Variable var_tNewPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNewPackage.tName", csp);
		var_tNewPackage_tName.setType("String");

		// Create constraints
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(addSuffix);

		// Solve CSP
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tType_tName, literal0, var_tNewPackage_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mCreation", mCreation);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mPackageToTPackage", mPackageToTPackage);
		isApplicableMatch.registerObject("mAnonymous", mAnonymous);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mMebmber", mMebmber);
		isApplicableMatch.registerObject("pg", pg);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mTypeToTType,
			EObject eAnonymousClassDeclarationToTClass, EObject tAnonymous, EObject mCreation, EObject tPackage,
			EObject mType, EObject tNewPackage, EObject mPackageToTPackage, EObject mAnonymous, EObject mPackage,
			EObject tType, EObject mMebmber, EObject pg) {
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("tAnonymous", tAnonymous);
		ruleresult.registerObject("mCreation", mCreation);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tNewPackage", tNewPackage);
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);
		ruleresult.registerObject("mAnonymous", mAnonymous);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mMebmber", mMebmber);
		ruleresult.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mAnonymous").eClass())
				.equals("java.AnonymousClassDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tAnonymous, TPackage tPackage, TPackage tNewPackage,
			TAbstractType tType, TypeGraph pg) {

		Object[] result1_black = AnonymousClassImpl.pattern_AnonymousClass_10_1_initialbindings_blackBBBBBBB(this,
				match, tAnonymous, tPackage, tNewPackage, tType, pg);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tPackage] = " + tPackage
					+ ", " + "[tNewPackage] = " + tNewPackage + ", " + "[tType] = " + tType + ", " + "[pg] = " + pg
					+ ".");
		}

		Object[] result2_bindingAndBlack = AnonymousClassImpl
				.pattern_AnonymousClass_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, tAnonymous, tPackage,
						tNewPackage, tType, pg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tPackage] = " + tPackage
					+ ", " + "[tNewPackage] = " + tNewPackage + ", " + "[tType] = " + tType + ", " + "[pg] = " + pg
					+ ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousClassImpl.pattern_AnonymousClass_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnonymousClassImpl
					.pattern_AnonymousClass_10_4_collectelementstobetranslated_blackBBBBBB(match, tAnonymous, tPackage,
							tNewPackage, tType, pg);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnonymous] = " + tAnonymous + ", " + "[tPackage] = " + tPackage + ", " + "[tNewPackage] = "
						+ tNewPackage + ", " + "[tType] = " + tType + ", " + "[pg] = " + pg + ".");
			}
			AnonymousClassImpl.pattern_AnonymousClass_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFF(match,
					tAnonymous, tPackage, tNewPackage, tType, pg);
			//nothing EMoflonEdge tType__tAnonymous____innerTypes = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tAnonymous__tType____outerType = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tNewPackage__tAnonymous____ownedTypes = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tAnonymous__tNewPackage____package = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge pg__tAnonymous____ownedTypes = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge tAnonymous__pg____pg = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge tNewPackage__tPackage____parent = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge tPackage__tNewPackage____subpackage = (EMoflonEdge) result4_green[13];
			//nothing EMoflonEdge pg__tAnonymous____classes = (EMoflonEdge) result4_green[14];

			Object[] result5_black = AnonymousClassImpl.pattern_AnonymousClass_10_5_collectcontextelements_blackBBBBBB(
					match, tAnonymous, tPackage, tNewPackage, tType, pg);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnonymous] = " + tAnonymous + ", " + "[tPackage] = " + tPackage + ", " + "[tNewPackage] = "
						+ tNewPackage + ", " + "[tType] = " + tType + ", " + "[pg] = " + pg + ".");
			}
			AnonymousClassImpl.pattern_AnonymousClass_10_5_collectcontextelements_greenBBBBFFFF(match, tPackage, tType,
					pg);
			//nothing EMoflonEdge tType__pg____pg = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result5_green[7];

			// 
			AnonymousClassImpl.pattern_AnonymousClass_10_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					tAnonymous, tPackage, tNewPackage, tType, pg);
			return AnonymousClassImpl.pattern_AnonymousClass_10_7_expressionF();
		} else {
			return AnonymousClassImpl.pattern_AnonymousClass_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousClassImpl
				.pattern_AnonymousClass_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TClass tAnonymous = (TClass) result1_bindingAndBlack[1];
		ClassInstanceCreation mCreation = (ClassInstanceCreation) result1_bindingAndBlack[2];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[3];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		TPackage tNewPackage = (TPackage) result1_bindingAndBlack[5];
		PackageToTPackage mPackageToTPackage = (PackageToTPackage) result1_bindingAndBlack[6];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[7];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[8];
		MDefinition mMebmber = (MDefinition) result1_bindingAndBlack[9];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[10];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = AnonymousClassImpl
				.pattern_AnonymousClass_11_1_performtransformation_greenFBBF(tAnonymous, mCreation);
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result1_green[0];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result1_green[3];

		Object[] result2_black = AnonymousClassImpl.pattern_AnonymousClass_11_2_collecttranslatedelements_blackBBBB(
				eAnonymousClassDeclarationToTClass, tAnonymous, tNewPackage, mAnonymous);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[eAnonymousClassDeclarationToTClass] = "
							+ eAnonymousClassDeclarationToTClass + ", " + "[tAnonymous] = " + tAnonymous + ", "
							+ "[tNewPackage] = " + tNewPackage + ", " + "[mAnonymous] = " + mAnonymous + ".");
		}
		Object[] result2_green = AnonymousClassImpl.pattern_AnonymousClass_11_2_collecttranslatedelements_greenFBBBB(
				eAnonymousClassDeclarationToTClass, tAnonymous, tNewPackage, mAnonymous);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousClassImpl.pattern_AnonymousClass_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
				ruleresult, mTypeToTType, eAnonymousClassDeclarationToTClass, tAnonymous, mCreation, tPackage, mType,
				tNewPackage, mPackageToTPackage, mAnonymous, mPackage, tType, mMebmber, pg);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ", " + "[tAnonymous] = " + tAnonymous + ", "
					+ "[mCreation] = " + mCreation + ", " + "[tPackage] = " + tPackage + ", " + "[mType] = " + mType
					+ ", " + "[tNewPackage] = " + tNewPackage + ", " + "[mPackageToTPackage] = " + mPackageToTPackage
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mPackage] = " + mPackage + ", " + "[tType] = "
					+ tType + ", " + "[mMebmber] = " + mMebmber + ", " + "[pg] = " + pg + ".");
		}
		AnonymousClassImpl.pattern_AnonymousClass_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFF(ruleresult,
				eAnonymousClassDeclarationToTClass, tAnonymous, mCreation, tPackage, tNewPackage, mAnonymous, tType,
				pg);
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tAnonymous____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tType__tAnonymous____innerTypes = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tAnonymous__tType____outerType = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tNewPackage__tAnonymous____ownedTypes = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tAnonymous__tNewPackage____package = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge pg__tAnonymous____ownedTypes = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tAnonymous__pg____pg = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tNewPackage__tPackage____parent = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tPackage__tNewPackage____subpackage = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge pg__tAnonymous____classes = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge mAnonymous__mCreation____classInstanceCreation = (EMoflonEdge) result3_green[21];

		// 
		// 
		AnonymousClassImpl.pattern_AnonymousClass_11_5_registerobjects_expressionBBBBBBBBBBBBBBB(this, ruleresult,
				mTypeToTType, eAnonymousClassDeclarationToTClass, tAnonymous, mCreation, tPackage, mType, tNewPackage,
				mPackageToTPackage, mAnonymous, mPackage, tType, mMebmber, pg);
		return AnonymousClassImpl.pattern_AnonymousClass_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousClassImpl
				.pattern_AnonymousClass_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousClassImpl
				.pattern_AnonymousClass_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousClassImpl.pattern_AnonymousClass_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tAnonymous = (TClass) result2_binding[0];
		TPackage tPackage = (TPackage) result2_binding[1];
		TPackage tNewPackage = (TPackage) result2_binding[2];
		TAbstractType tType = (TAbstractType) result2_binding[3];
		TypeGraph pg = (TypeGraph) result2_binding[4];
		for (Object[] result2_black : AnonymousClassImpl.pattern_AnonymousClass_12_2_corematch_blackFBBFBFFBBB(
				tAnonymous, tPackage, tNewPackage, tType, pg, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[3];
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[5];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[6];
			// ForEach 
			for (Object[] result3_black : AnonymousClassImpl.pattern_AnonymousClass_12_3_findcontext_blackBBFBBBBBBFB(
					mTypeToTType, tAnonymous, tPackage, mType, tNewPackage, mPackageToTPackage, mPackage, tType, pg)) {
				ClassInstanceCreation mCreation = (ClassInstanceCreation) result3_black[2];
				MDefinition mMebmber = (MDefinition) result3_black[9];
				Object[] result3_green = AnonymousClassImpl
						.pattern_AnonymousClass_12_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFF(mTypeToTType,
								tAnonymous, mCreation, tPackage, mType, tNewPackage, mPackageToTPackage, mPackage,
								tType, mMebmber, pg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tType__tAnonymous____innerTypes = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tAnonymous__tType____outerType = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tNewPackage__tAnonymous____ownedTypes = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tAnonymous__tNewPackage____package = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge mMebmber__mCreation____mMethodInvocations = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge pg__tAnonymous____ownedTypes = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge tAnonymous__pg____pg = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge tNewPackage__tPackage____parent = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge tPackage__tNewPackage____subpackage = (EMoflonEdge) result3_green[28];
				//nothing EMoflonEdge mType__mMebmber____bodyDeclarations = (EMoflonEdge) result3_green[29];
				//nothing EMoflonEdge mMebmber__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[30];
				//nothing EMoflonEdge pg__tAnonymous____classes = (EMoflonEdge) result3_green[31];
				//nothing EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[32];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[33];

				Object[] result4_bindingAndBlack = AnonymousClassImpl
						.pattern_AnonymousClass_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(this, isApplicableMatch,
								mTypeToTType, tAnonymous, mCreation, tPackage, mType, tNewPackage, mPackageToTPackage,
								mPackage, tType, mMebmber, pg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[tAnonymous] = " + tAnonymous + ", " + "[mCreation] = " + mCreation + ", "
							+ "[tPackage] = " + tPackage + ", " + "[mType] = " + mType + ", " + "[tNewPackage] = "
							+ tNewPackage + ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ", "
							+ "[mPackage] = " + mPackage + ", " + "[tType] = " + tType + ", " + "[mMebmber] = "
							+ mMebmber + ", " + "[pg] = " + pg + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousClassImpl.pattern_AnonymousClass_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnonymousClassImpl
							.pattern_AnonymousClass_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousClassImpl.pattern_AnonymousClass_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousClassImpl.pattern_AnonymousClass_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tAnonymous, TPackage tPackage, TPackage tNewPackage,
			TAbstractType tType, TypeGraph pg) {
		match.registerObject("tAnonymous", tAnonymous);
		match.registerObject("tPackage", tPackage);
		match.registerObject("tNewPackage", tNewPackage);
		match.registerObject("tType", tType);
		match.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tAnonymous, TPackage tPackage, TPackage tNewPackage,
			TAbstractType tType, TypeGraph pg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$1");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");
		Variable var_tNewPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNewPackage.tName", true, csp);
		var_tNewPackage_tName.setValue(tNewPackage.getTName());
		var_tNewPackage_tName.setType("String");

		// Create unbound variables

		// Create constraints
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(addSuffix);

		// Solve CSP
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tType_tName, literal0, var_tNewPackage_tName);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TClass tAnonymous, ClassInstanceCreation mCreation, TPackage tPackage, AbstractTypeDeclaration mType,
			TPackage tNewPackage, PackageToTPackage mPackageToTPackage, org.eclipse.modisco.java.Package mPackage,
			TAbstractType tType, MDefinition mMebmber, TypeGraph pg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tAnonymous", tAnonymous);
		isApplicableMatch.registerObject("mCreation", mCreation);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tNewPackage", tNewPackage);
		isApplicableMatch.registerObject("mPackageToTPackage", mPackageToTPackage);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mMebmber", mMebmber);
		isApplicableMatch.registerObject("pg", pg);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mTypeToTType,
			EObject eAnonymousClassDeclarationToTClass, EObject tAnonymous, EObject mCreation, EObject tPackage,
			EObject mType, EObject tNewPackage, EObject mPackageToTPackage, EObject mAnonymous, EObject mPackage,
			EObject tType, EObject mMebmber, EObject pg) {
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("tAnonymous", tAnonymous);
		ruleresult.registerObject("mCreation", mCreation);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tNewPackage", tNewPackage);
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);
		ruleresult.registerObject("mAnonymous", mAnonymous);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mMebmber", mMebmber);
		ruleresult.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tAnonymous").eClass()).equals("basic.TClass.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tNewPackage").eClass())
						.equals("basic.TPackage.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_252(EMoflonEdge _edge_innerTypes) {

		Object[] result1_bindingAndBlack = AnonymousClassImpl
				.pattern_AnonymousClass_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousClassImpl.pattern_AnonymousClass_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousClassImpl
				.pattern_AnonymousClass_20_2_testcorematchandDECs_blackFFFFFB(_edge_innerTypes)) {
			TClass tAnonymous = (TClass) result2_black[0];
			TPackage tPackage = (TPackage) result2_black[1];
			TPackage tNewPackage = (TPackage) result2_black[2];
			TAbstractType tType = (TAbstractType) result2_black[3];
			TypeGraph pg = (TypeGraph) result2_black[4];
			Object[] result2_green = AnonymousClassImpl
					.pattern_AnonymousClass_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousClassImpl
					.pattern_AnonymousClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, tAnonymous, tPackage, tNewPackage, tType, pg)) {
				// 
				if (AnonymousClassImpl
						.pattern_AnonymousClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = AnonymousClassImpl
							.pattern_AnonymousClass_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousClassImpl.pattern_AnonymousClass_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousClassImpl.pattern_AnonymousClass_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_261(EMoflonEdge _edge_anonymousClassDeclaration) {

		Object[] result1_bindingAndBlack = AnonymousClassImpl
				.pattern_AnonymousClass_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousClassImpl.pattern_AnonymousClass_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousClassImpl
				.pattern_AnonymousClass_21_2_testcorematchandDECs_blackFFFFFB(_edge_anonymousClassDeclaration)) {
			ClassInstanceCreation mCreation = (ClassInstanceCreation) result2_black[0];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[1];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[2];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[3];
			MDefinition mMebmber = (MDefinition) result2_black[4];
			Object[] result2_green = AnonymousClassImpl
					.pattern_AnonymousClass_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousClassImpl
					.pattern_AnonymousClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, mCreation, mType, mAnonymous, mPackage, mMebmber)) {
				// 
				if (AnonymousClassImpl
						.pattern_AnonymousClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = AnonymousClassImpl
							.pattern_AnonymousClass_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousClassImpl.pattern_AnonymousClass_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousClassImpl.pattern_AnonymousClass_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnonymousClass");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tAnonymous", "tName", "Anonymous", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tAnonymous", "tLib", false, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_tNewPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNewPackage", true, csp);
		var_tNewPackage_tName.setValue(__helper.getValue("tNewPackage", "tName"));
		var_tNewPackage_tName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$1");
		var_literal0.setType("");

		AddSuffix addSuffix0 = new AddSuffix();
		csp.getConstraints().add(addSuffix0);

		addSuffix0.setRuleName("AnonymousClass");
		addSuffix0.solve(var_tType_tName, var_literal0, var_tNewPackage_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tNewPackage_tName.setBound(false);
			addSuffix0.solve(var_tType_tName, var_literal0, var_tNewPackage_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tNewPackage", "tName", var_tNewPackage_tName.getValue());
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnonymousClass");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tAnonymous", "tName", "Anonymous", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tAnonymous", "tLib", false, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_tNewPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNewPackage", true, csp);
		var_tNewPackage_tName.setValue(__helper.getValue("tNewPackage", "tName"));
		var_tNewPackage_tName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$1");
		var_literal0.setType("");

		AddSuffix addSuffix0 = new AddSuffix();
		csp.getConstraints().add(addSuffix0);

		addSuffix0.setRuleName("AnonymousClass");
		addSuffix0.solve(var_tType_tName, var_literal0, var_tNewPackage_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			addSuffix0.solve(var_tType_tName, var_literal0, var_tNewPackage_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {

		Object[] result1_black = AnonymousClassImpl.pattern_AnonymousClass_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousClassImpl.pattern_AnonymousClass_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnonymousClassImpl
				.pattern_AnonymousClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TClass tAnonymous = (TClass) result2_bindingAndBlack[0];
		ClassInstanceCreation mCreation = (ClassInstanceCreation) result2_bindingAndBlack[1];
		TPackage tPackage = (TPackage) result2_bindingAndBlack[2];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_bindingAndBlack[3];
		TPackage tNewPackage = (TPackage) result2_bindingAndBlack[4];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_bindingAndBlack[5];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[6];
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[7];
		MDefinition mMebmber = (MDefinition) result2_bindingAndBlack[8];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = AnonymousClassImpl
				.pattern_AnonymousClass_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, tAnonymous, mCreation,
						tPackage, mType, tNewPackage, mAnonymous, mPackage, tType, mMebmber, pg, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tAnonymous] = " + tAnonymous + ", " + "[mCreation] = " + mCreation + ", " + "[tPackage] = "
					+ tPackage + ", " + "[mType] = " + mType + ", " + "[tNewPackage] = " + tNewPackage + ", "
					+ "[mAnonymous] = " + mAnonymous + ", " + "[mPackage] = " + mPackage + ", " + "[tType] = " + tType
					+ ", " + "[mMebmber] = " + mMebmber + ", " + "[pg] = " + pg + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnonymousClassImpl.pattern_AnonymousClass_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnonymousClassImpl.pattern_AnonymousClass_24_5_matchcorrcontext_blackFBBFBBBB(
					tPackage, mType, mPackage, tType, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[0];
				PackageToTPackage mPackageToTPackage = (PackageToTPackage) result5_black[3];
				Object[] result5_green = AnonymousClassImpl.pattern_AnonymousClass_24_5_matchcorrcontext_greenBBBBF(
						mTypeToTType, mPackageToTPackage, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = AnonymousClassImpl
						.pattern_AnonymousClass_24_6_createcorrespondence_blackBBBBBBBBBBB(tAnonymous, mCreation,
								tPackage, mType, tNewPackage, mAnonymous, mPackage, tType, mMebmber, pg, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnonymous] = "
							+ tAnonymous + ", " + "[mCreation] = " + mCreation + ", " + "[tPackage] = " + tPackage
							+ ", " + "[mType] = " + mType + ", " + "[tNewPackage] = " + tNewPackage + ", "
							+ "[mAnonymous] = " + mAnonymous + ", " + "[mPackage] = " + mPackage + ", " + "[tType] = "
							+ tType + ", " + "[mMebmber] = " + mMebmber + ", " + "[pg] = " + pg + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}
				AnonymousClassImpl.pattern_AnonymousClass_24_6_createcorrespondence_greenFBBB(tAnonymous, mAnonymous,
						ccMatch);
				//nothing AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result6_green[0];

				Object[] result7_black = AnonymousClassImpl
						.pattern_AnonymousClass_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnonymousClassImpl.pattern_AnonymousClass_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnonymousClassImpl.pattern_AnonymousClass_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TClass tAnonymous, ClassInstanceCreation mCreation, TPackage tPackage,
			AbstractTypeDeclaration mType, TPackage tNewPackage, AnonymousClassDeclaration mAnonymous,
			org.eclipse.modisco.java.Package mPackage, TAbstractType tType, MDefinition mMebmber, TypeGraph pg,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$1");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");
		Variable var_tNewPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNewPackage.tName", true, csp);
		var_tNewPackage_tName.setValue(tNewPackage.getTName());
		var_tNewPackage_tName.setType("String");

		// Create unbound variables

		// Create constraints
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(addSuffix);

		// Solve CSP
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tType_tName, literal0, var_tNewPackage_tName);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(ClassInstanceCreation mCreation, AbstractTypeDeclaration mType,
			AnonymousClassDeclaration mAnonymous, org.eclipse.modisco.java.Package mPackage, MDefinition mMebmber) {// 
		Object[] result1_black = AnonymousClassImpl.pattern_AnonymousClass_27_1_matchtggpattern_blackBBBBB(mCreation,
				mType, mAnonymous, mPackage, mMebmber);
		if (result1_black != null) {
			return AnonymousClassImpl.pattern_AnonymousClass_27_2_expressionF();
		} else {
			return AnonymousClassImpl.pattern_AnonymousClass_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tAnonymous, TPackage tPackage, TPackage tNewPackage, TAbstractType tType,
			TypeGraph pg) {// 
		Object[] result1_black = AnonymousClassImpl.pattern_AnonymousClass_28_1_matchtggpattern_blackBBBBB(tAnonymous,
				tPackage, tNewPackage, tType, pg);
		if (result1_black != null) {
			AnonymousClassImpl.pattern_AnonymousClass_28_1_matchtggpattern_greenB(tAnonymous);

			return AnonymousClassImpl.pattern_AnonymousClass_28_2_expressionF();
		} else {
			return AnonymousClassImpl.pattern_AnonymousClass_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mTypeToTTypeParameter) {

		Object[] result1_black = AnonymousClassImpl.pattern_AnonymousClass_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousClassImpl.pattern_AnonymousClass_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnonymousClassImpl
				.pattern_AnonymousClass_29_2_isapplicablecore_blackFFFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[2];
			MDefinition mMebmber = (MDefinition) result2_black[3];
			ClassInstanceCreation mCreation = (ClassInstanceCreation) result2_black[4];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[5];
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[6];
			TPackage tPackage = (TPackage) result2_black[7];
			TAbstractType tType = (TAbstractType) result2_black[8];
			TypeGraph pg = (TypeGraph) result2_black[9];

			Object[] result3_bindingAndBlack = AnonymousClassImpl
					.pattern_AnonymousClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
							mTypeToTType, mCreation, tPackage, mType, mPackageToTPackage, mPackage, tType, mMebmber, pg,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
						+ ", " + "[mCreation] = " + mCreation + ", " + "[tPackage] = " + tPackage + ", " + "[mType] = "
						+ mType + ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[mPackage] = "
						+ mPackage + ", " + "[tType] = " + tType + ", " + "[mMebmber] = " + mMebmber + ", " + "[pg] = "
						+ pg + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnonymousClassImpl.pattern_AnonymousClass_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnonymousClassImpl.pattern_AnonymousClass_29_5_checknacs_blackBBBBBBBBB(
						mTypeToTType, mCreation, tPackage, mType, mPackageToTPackage, mPackage, tType, mMebmber, pg);
				if (result5_black != null) {

					Object[] result6_black = AnonymousClassImpl.pattern_AnonymousClass_29_6_perform_blackBBBBBBBBBB(
							mTypeToTType, mCreation, tPackage, mType, mPackageToTPackage, mPackage, tType, mMebmber, pg,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = "
								+ mTypeToTType + ", " + "[mCreation] = " + mCreation + ", " + "[tPackage] = " + tPackage
								+ ", " + "[mType] = " + mType + ", " + "[mPackageToTPackage] = " + mPackageToTPackage
								+ ", " + "[mPackage] = " + mPackage + ", " + "[tType] = " + tType + ", "
								+ "[mMebmber] = " + mMebmber + ", " + "[pg] = " + pg + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					AnonymousClassImpl.pattern_AnonymousClass_29_6_perform_greenFFBBFFBBBB(mCreation, tPackage, tType,
							pg, ruleResult, csp);
					//nothing AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result6_green[0];
					//nothing TClass tAnonymous = (TClass) result6_green[1];
					//nothing TPackage tNewPackage = (TPackage) result6_green[4];
					//nothing AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return AnonymousClassImpl.pattern_AnonymousClass_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			ClassInstanceCreation mCreation, TPackage tPackage, AbstractTypeDeclaration mType,
			PackageToTPackage mPackageToTPackage, org.eclipse.modisco.java.Package mPackage, TAbstractType tType,
			MDefinition mMebmber, TypeGraph pg, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$1");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");

		// Create unbound variables
		Variable var_tNewPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNewPackage.tName", csp);
		var_tNewPackage_tName.setType("String");

		// Create constraints
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(addSuffix);

		// Solve CSP
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tType_tName, literal0, var_tNewPackage_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mCreation", mCreation);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mPackageToTPackage", mPackageToTPackage);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mMebmber", mMebmber);
		isApplicableMatch.registerObject("pg", pg);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.ANONYMOUS_CLASS___IS_APPROPRIATE_FWD__MATCH_CLASSINSTANCECREATION_ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATION_PACKAGE_MDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassInstanceCreation) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
					(org.eclipse.modisco.java.Package) arguments.get(4), (MDefinition) arguments.get(5));
		case RulesPackage.ANONYMOUS_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSINSTANCECREATION_ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATION_PACKAGE_MDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassInstanceCreation) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
					(org.eclipse.modisco.java.Package) arguments.get(4), (MDefinition) arguments.get(5));
			return null;
		case RulesPackage.ANONYMOUS_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSINSTANCECREATION_ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATION_PACKAGE_MDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassInstanceCreation) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
					(org.eclipse.modisco.java.Package) arguments.get(4), (MDefinition) arguments.get(5));
		case RulesPackage.ANONYMOUS_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_CLASSINSTANCECREATION_TPACKAGE_ABSTRACTTYPEDECLARATION_PACKAGETOTPACKAGE_ANONYMOUSCLASSDECLARATION_PACKAGE_TABSTRACTTYPE_MDEFINITION_TYPEGRAPH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (ClassInstanceCreation) arguments.get(2),
					(TPackage) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(PackageToTPackage) arguments.get(5), (AnonymousClassDeclaration) arguments.get(6),
					(org.eclipse.modisco.java.Package) arguments.get(7), (TAbstractType) arguments.get(8),
					(MDefinition) arguments.get(9), (TypeGraph) arguments.get(10));
		case RulesPackage.ANONYMOUS_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.ANONYMOUS_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS___IS_APPROPRIATE_BWD__MATCH_TCLASS_TPACKAGE_TPACKAGE_TABSTRACTTYPE_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TPackage) arguments.get(2),
					(TPackage) arguments.get(3), (TAbstractType) arguments.get(4), (TypeGraph) arguments.get(5));
		case RulesPackage.ANONYMOUS_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TPACKAGE_TPACKAGE_TABSTRACTTYPE_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TPackage) arguments.get(2),
					(TPackage) arguments.get(3), (TAbstractType) arguments.get(4), (TypeGraph) arguments.get(5));
			return null;
		case RulesPackage.ANONYMOUS_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TPACKAGE_TPACKAGE_TABSTRACTTYPE_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TPackage) arguments.get(2), (TPackage) arguments.get(3), (TAbstractType) arguments.get(4),
					(TypeGraph) arguments.get(5));
		case RulesPackage.ANONYMOUS_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TCLASS_CLASSINSTANCECREATION_TPACKAGE_ABSTRACTTYPEDECLARATION_TPACKAGE_PACKAGETOTPACKAGE_PACKAGE_TABSTRACTTYPE_MDEFINITION_TYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TClass) arguments.get(2),
					(ClassInstanceCreation) arguments.get(3), (TPackage) arguments.get(4),
					(AbstractTypeDeclaration) arguments.get(5), (TPackage) arguments.get(6),
					(PackageToTPackage) arguments.get(7), (org.eclipse.modisco.java.Package) arguments.get(8),
					(TAbstractType) arguments.get(9), (MDefinition) arguments.get(10), (TypeGraph) arguments.get(11));
		case RulesPackage.ANONYMOUS_CLASS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.ANONYMOUS_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_252__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_252((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_261__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_261((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANONYMOUS_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__TCLASS_CLASSINSTANCECREATION_TPACKAGE_ABSTRACTTYPEDECLARATION_TPACKAGE_ANONYMOUSCLASSDECLARATION_PACKAGE_TABSTRACTTYPE_MDEFINITION_TYPEGRAPH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TClass) arguments.get(0), (ClassInstanceCreation) arguments.get(1),
					(TPackage) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3),
					(TPackage) arguments.get(4), (AnonymousClassDeclaration) arguments.get(5),
					(org.eclipse.modisco.java.Package) arguments.get(6), (TAbstractType) arguments.get(7),
					(MDefinition) arguments.get(8), (TypeGraph) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.ANONYMOUS_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS___CHECK_DEC_FWD__CLASSINSTANCECREATION_ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATION_PACKAGE_MDEFINITION:
			return checkDEC_FWD((ClassInstanceCreation) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (org.eclipse.modisco.java.Package) arguments.get(3),
					(MDefinition) arguments.get(4));
		case RulesPackage.ANONYMOUS_CLASS___CHECK_DEC_BWD__TCLASS_TPACKAGE_TPACKAGE_TABSTRACTTYPE_TYPEGRAPH:
			return checkDEC_BWD((TClass) arguments.get(0), (TPackage) arguments.get(1), (TPackage) arguments.get(2),
					(TAbstractType) arguments.get(3), (TypeGraph) arguments.get(4));
		case RulesPackage.ANONYMOUS_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.ANONYMOUS_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_CLASSINSTANCECREATION_TPACKAGE_ABSTRACTTYPEDECLARATION_PACKAGETOTPACKAGE_PACKAGE_TABSTRACTTYPE_MDEFINITION_TYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (ClassInstanceCreation) arguments.get(2),
					(TPackage) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(PackageToTPackage) arguments.get(5), (org.eclipse.modisco.java.Package) arguments.get(6),
					(TAbstractType) arguments.get(7), (MDefinition) arguments.get(8), (TypeGraph) arguments.get(9),
					(ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.ANONYMOUS_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnonymousClass_0_1_initialbindings_blackBBBBBBB(AnonymousClass _this,
			Match match, ClassInstanceCreation mCreation, AbstractTypeDeclaration mType,
			AnonymousClassDeclaration mAnonymous, org.eclipse.modisco.java.Package mPackage, MDefinition mMebmber) {
		return new Object[] { _this, match, mCreation, mType, mAnonymous, mPackage, mMebmber };
	}

	public static final Object[] pattern_AnonymousClass_0_2_SolveCSP_bindingFBBBBBBB(AnonymousClass _this, Match match,
			ClassInstanceCreation mCreation, AbstractTypeDeclaration mType, AnonymousClassDeclaration mAnonymous,
			org.eclipse.modisco.java.Package mPackage, MDefinition mMebmber) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mCreation, mType, mAnonymous, mPackage,
				mMebmber);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mCreation, mType, mAnonymous, mPackage, mMebmber };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass_0_2_SolveCSP_bindingAndBlackFBBBBBBB(AnonymousClass _this,
			Match match, ClassInstanceCreation mCreation, AbstractTypeDeclaration mType,
			AnonymousClassDeclaration mAnonymous, org.eclipse.modisco.java.Package mPackage, MDefinition mMebmber) {
		Object[] result_pattern_AnonymousClass_0_2_SolveCSP_binding = pattern_AnonymousClass_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, mCreation, mType, mAnonymous, mPackage, mMebmber);
		if (result_pattern_AnonymousClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousClass_0_2_SolveCSP_black = pattern_AnonymousClass_0_2_SolveCSP_blackB(csp);
			if (result_pattern_AnonymousClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mCreation, mType, mAnonymous, mPackage, mMebmber };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass_0_3_CheckCSP_expressionFBB(AnonymousClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_0_4_collectelementstobetranslated_blackBBBBBB(Match match,
			ClassInstanceCreation mCreation, AbstractTypeDeclaration mType, AnonymousClassDeclaration mAnonymous,
			org.eclipse.modisco.java.Package mPackage, MDefinition mMebmber) {
		return new Object[] { match, mCreation, mType, mAnonymous, mPackage, mMebmber };
	}

	public static final Object[] pattern_AnonymousClass_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous) {
		EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mCreation____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mAnonymous);
		String mCreation__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnonymous__mCreation____classInstanceCreation_name_prime = "classInstanceCreation";
		mCreation__mAnonymous____anonymousClassDeclaration.setSrc(mCreation);
		mCreation__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		match.getToBeTranslatedEdges().add(mCreation__mAnonymous____anonymousClassDeclaration);
		mAnonymous__mCreation____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mCreation____classInstanceCreation.setTrg(mCreation);
		match.getToBeTranslatedEdges().add(mAnonymous__mCreation____classInstanceCreation);
		mCreation__mAnonymous____anonymousClassDeclaration
				.setName(mCreation__mAnonymous____anonymousClassDeclaration_name_prime);
		mAnonymous__mCreation____classInstanceCreation
				.setName(mAnonymous__mCreation____classInstanceCreation_name_prime);
		return new Object[] { match, mCreation, mAnonymous, mCreation__mAnonymous____anonymousClassDeclaration,
				mAnonymous__mCreation____classInstanceCreation };
	}

	public static final Object[] pattern_AnonymousClass_0_5_collectcontextelements_blackBBBBBB(Match match,
			ClassInstanceCreation mCreation, AbstractTypeDeclaration mType, AnonymousClassDeclaration mAnonymous,
			org.eclipse.modisco.java.Package mPackage, MDefinition mMebmber) {
		return new Object[] { match, mCreation, mType, mAnonymous, mPackage, mMebmber };
	}

	public static final Object[] pattern_AnonymousClass_0_5_collectcontextelements_greenBBBBBFFFFF(Match match,
			ClassInstanceCreation mCreation, AbstractTypeDeclaration mType, org.eclipse.modisco.java.Package mPackage,
			MDefinition mMebmber) {
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMebmber__mCreation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mMebmber____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMebmber__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mCreation);
		match.getContextNodes().add(mType);
		match.getContextNodes().add(mPackage);
		match.getContextNodes().add(mMebmber);
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		String mMebmber__mCreation____mMethodInvocations_name_prime = "mMethodInvocations";
		String mType__mMebmber____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMebmber__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		match.getContextEdges().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		match.getContextEdges().add(mType__mPackage____package);
		mMebmber__mCreation____mMethodInvocations.setSrc(mMebmber);
		mMebmber__mCreation____mMethodInvocations.setTrg(mCreation);
		match.getContextEdges().add(mMebmber__mCreation____mMethodInvocations);
		mType__mMebmber____bodyDeclarations.setSrc(mType);
		mType__mMebmber____bodyDeclarations.setTrg(mMebmber);
		match.getContextEdges().add(mType__mMebmber____bodyDeclarations);
		mMebmber__mType____abstractTypeDeclaration.setSrc(mMebmber);
		mMebmber__mType____abstractTypeDeclaration.setTrg(mType);
		match.getContextEdges().add(mMebmber__mType____abstractTypeDeclaration);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		mMebmber__mCreation____mMethodInvocations.setName(mMebmber__mCreation____mMethodInvocations_name_prime);
		mType__mMebmber____bodyDeclarations.setName(mType__mMebmber____bodyDeclarations_name_prime);
		mMebmber__mType____abstractTypeDeclaration.setName(mMebmber__mType____abstractTypeDeclaration_name_prime);
		return new Object[] { match, mCreation, mType, mPackage, mMebmber, mPackage__mType____ownedElements,
				mType__mPackage____package, mMebmber__mCreation____mMethodInvocations,
				mType__mMebmber____bodyDeclarations, mMebmber__mType____abstractTypeDeclaration };
	}

	public static final void pattern_AnonymousClass_0_6_registerobjectstomatch_expressionBBBBBBB(AnonymousClass _this,
			Match match, ClassInstanceCreation mCreation, AbstractTypeDeclaration mType,
			AnonymousClassDeclaration mAnonymous, org.eclipse.modisco.java.Package mPackage, MDefinition mMebmber) {
		_this.registerObjectsToMatch_FWD(match, mCreation, mType, mAnonymous, mPackage, mMebmber);

	}

	public static final boolean pattern_AnonymousClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_1_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mCreation");
		EObject _localVariable_2 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("mType");
		EObject _localVariable_4 = isApplicableMatch.getObject("mPackageToTPackage");
		EObject _localVariable_5 = isApplicableMatch.getObject("mAnonymous");
		EObject _localVariable_6 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_7 = isApplicableMatch.getObject("tType");
		EObject _localVariable_8 = isApplicableMatch.getObject("mMebmber");
		EObject _localVariable_9 = isApplicableMatch.getObject("pg");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpMCreation = _localVariable_1;
		EObject tmpTPackage = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpMPackageToTPackage = _localVariable_4;
		EObject tmpMAnonymous = _localVariable_5;
		EObject tmpMPackage = _localVariable_6;
		EObject tmpTType = _localVariable_7;
		EObject tmpMMebmber = _localVariable_8;
		EObject tmpPg = _localVariable_9;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpMCreation instanceof ClassInstanceCreation) {
				ClassInstanceCreation mCreation = (ClassInstanceCreation) tmpMCreation;
				if (tmpTPackage instanceof TPackage) {
					TPackage tPackage = (TPackage) tmpTPackage;
					if (tmpMType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
						if (tmpMPackageToTPackage instanceof PackageToTPackage) {
							PackageToTPackage mPackageToTPackage = (PackageToTPackage) tmpMPackageToTPackage;
							if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
								AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
								if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
									org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
									if (tmpTType instanceof TAbstractType) {
										TAbstractType tType = (TAbstractType) tmpTType;
										if (tmpMMebmber instanceof MDefinition) {
											MDefinition mMebmber = (MDefinition) tmpMMebmber;
											if (tmpPg instanceof TypeGraph) {
												TypeGraph pg = (TypeGraph) tmpPg;
												return new Object[] { mTypeToTType, mCreation, tPackage, mType,
														mPackageToTPackage, mAnonymous, mPackage, tType, mMebmber, pg,
														isApplicableMatch };
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_1_1_performtransformation_blackBBBBBBBBBBFBB(
			TypeToTAbstractType mTypeToTType, ClassInstanceCreation mCreation, TPackage tPackage,
			AbstractTypeDeclaration mType, PackageToTPackage mPackageToTPackage, AnonymousClassDeclaration mAnonymous,
			org.eclipse.modisco.java.Package mPackage, TAbstractType tType, MDefinition mMebmber, TypeGraph pg,
			AnonymousClass _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mTypeToTType, mCreation, tPackage, mType, mPackageToTPackage, mAnonymous,
						mPackage, tType, mMebmber, pg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			AnonymousClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousClass_1_1_performtransformation_binding = pattern_AnonymousClass_1_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousClass_1_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_AnonymousClass_1_1_performtransformation_binding[0];
			ClassInstanceCreation mCreation = (ClassInstanceCreation) result_pattern_AnonymousClass_1_1_performtransformation_binding[1];
			TPackage tPackage = (TPackage) result_pattern_AnonymousClass_1_1_performtransformation_binding[2];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_AnonymousClass_1_1_performtransformation_binding[3];
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result_pattern_AnonymousClass_1_1_performtransformation_binding[4];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_AnonymousClass_1_1_performtransformation_binding[5];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_AnonymousClass_1_1_performtransformation_binding[6];
			TAbstractType tType = (TAbstractType) result_pattern_AnonymousClass_1_1_performtransformation_binding[7];
			MDefinition mMebmber = (MDefinition) result_pattern_AnonymousClass_1_1_performtransformation_binding[8];
			TypeGraph pg = (TypeGraph) result_pattern_AnonymousClass_1_1_performtransformation_binding[9];

			Object[] result_pattern_AnonymousClass_1_1_performtransformation_black = pattern_AnonymousClass_1_1_performtransformation_blackBBBBBBBBBBFBB(
					mTypeToTType, mCreation, tPackage, mType, mPackageToTPackage, mAnonymous, mPackage, tType, mMebmber,
					pg, _this, isApplicableMatch);
			if (result_pattern_AnonymousClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousClass_1_1_performtransformation_black[10];

				return new Object[] { mTypeToTType, mCreation, tPackage, mType, mPackageToTPackage, mAnonymous,
						mPackage, tType, mMebmber, pg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_1_1_performtransformation_greenFFBFBBBB(TPackage tPackage,
			AnonymousClassDeclaration mAnonymous, TAbstractType tType, TypeGraph pg, CSP csp) {
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = ModiscoFactory.eINSTANCE
				.createAnonymousClassDeclarationToTClass();
		TClass tAnonymous = BasicFactory.eINSTANCE.createTClass();
		TPackage tNewPackage = BasicFactory.eINSTANCE.createTPackage();
		String tAnonymous_tName_prime = "Anonymous";
		boolean tAnonymous_tLib_prime = Boolean.valueOf(false);
		Object _localVariable_0 = csp.getValue("tNewPackage", "tName");
		eAnonymousClassDeclarationToTClass.setSource(mAnonymous);
		eAnonymousClassDeclarationToTClass.setTarget(tAnonymous);
		tType.getInnerTypes().add(tAnonymous);
		pg.getOwnedTypes().add(tAnonymous);
		pg.getClasses().add(tAnonymous);
		tNewPackage.getOwnedTypes().add(tAnonymous);
		tNewPackage.setParent(tPackage);
		tAnonymous.setTName(tAnonymous_tName_prime);
		tAnonymous.setTLib(Boolean.valueOf(tAnonymous_tLib_prime));
		String tNewPackage_tName_prime = (String) _localVariable_0;
		tNewPackage.setTName(tNewPackage_tName_prime);
		return new Object[] { eAnonymousClassDeclarationToTClass, tAnonymous, tPackage, tNewPackage, mAnonymous, tType,
				pg, csp };
	}

	public static final Object[] pattern_AnonymousClass_1_2_collecttranslatedelements_blackBBBB(
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TClass tAnonymous,
			TPackage tNewPackage, AnonymousClassDeclaration mAnonymous) {
		return new Object[] { eAnonymousClassDeclarationToTClass, tAnonymous, tNewPackage, mAnonymous };
	}

	public static final Object[] pattern_AnonymousClass_1_2_collecttranslatedelements_greenFBBBB(
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TClass tAnonymous,
			TPackage tNewPackage, AnonymousClassDeclaration mAnonymous) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(eAnonymousClassDeclarationToTClass);
		ruleresult.getCreatedElements().add(tAnonymous);
		ruleresult.getCreatedElements().add(tNewPackage);
		ruleresult.getTranslatedElements().add(mAnonymous);
		return new Object[] { ruleresult, eAnonymousClassDeclarationToTClass, tAnonymous, tNewPackage, mAnonymous };
	}

	public static final Object[] pattern_AnonymousClass_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject eAnonymousClassDeclarationToTClass,
			EObject tAnonymous, EObject mCreation, EObject tPackage, EObject mType, EObject tNewPackage,
			EObject mPackageToTPackage, EObject mAnonymous, EObject mPackage, EObject tType, EObject mMebmber,
			EObject pg) {
		if (!mTypeToTType.equals(tAnonymous)) {
			if (!mTypeToTType.equals(tPackage)) {
				if (!mTypeToTType.equals(tNewPackage)) {
					if (!mTypeToTType.equals(tType)) {
						if (!mTypeToTType.equals(pg)) {
							if (!eAnonymousClassDeclarationToTClass.equals(mTypeToTType)) {
								if (!eAnonymousClassDeclarationToTClass.equals(tAnonymous)) {
									if (!eAnonymousClassDeclarationToTClass.equals(mCreation)) {
										if (!eAnonymousClassDeclarationToTClass.equals(tPackage)) {
											if (!eAnonymousClassDeclarationToTClass.equals(mType)) {
												if (!eAnonymousClassDeclarationToTClass.equals(tNewPackage)) {
													if (!eAnonymousClassDeclarationToTClass
															.equals(mPackageToTPackage)) {
														if (!eAnonymousClassDeclarationToTClass.equals(mAnonymous)) {
															if (!eAnonymousClassDeclarationToTClass.equals(mPackage)) {
																if (!eAnonymousClassDeclarationToTClass.equals(tType)) {
																	if (!eAnonymousClassDeclarationToTClass
																			.equals(mMebmber)) {
																		if (!eAnonymousClassDeclarationToTClass
																				.equals(pg)) {
																			if (!tAnonymous.equals(tPackage)) {
																				if (!tAnonymous.equals(tNewPackage)) {
																					if (!tAnonymous.equals(tType)) {
																						if (!mCreation
																								.equals(mTypeToTType)) {
																							if (!mCreation.equals(
																									tAnonymous)) {
																								if (!mCreation.equals(
																										tPackage)) {
																									if (!mCreation
																											.equals(mType)) {
																										if (!mCreation
																												.equals(tNewPackage)) {
																											if (!mCreation
																													.equals(mPackageToTPackage)) {
																												if (!mCreation
																														.equals(mPackage)) {
																													if (!mCreation
																															.equals(tType)) {
																														if (!mCreation
																																.equals(mMebmber)) {
																															if (!mCreation
																																	.equals(pg)) {
																																if (!tPackage
																																		.equals(tType)) {
																																	if (!mType
																																			.equals(mTypeToTType)) {
																																		if (!mType
																																				.equals(tAnonymous)) {
																																			if (!mType
																																					.equals(tPackage)) {
																																				if (!mType
																																						.equals(tNewPackage)) {
																																					if (!mType
																																							.equals(tType)) {
																																						if (!mType
																																								.equals(pg)) {
																																							if (!tNewPackage
																																									.equals(tPackage)) {
																																								if (!tNewPackage
																																										.equals(tType)) {
																																									if (!mPackageToTPackage
																																											.equals(mTypeToTType)) {
																																										if (!mPackageToTPackage
																																												.equals(tAnonymous)) {
																																											if (!mPackageToTPackage
																																													.equals(tPackage)) {
																																												if (!mPackageToTPackage
																																														.equals(mType)) {
																																													if (!mPackageToTPackage
																																															.equals(tNewPackage)) {
																																														if (!mPackageToTPackage
																																																.equals(tType)) {
																																															if (!mPackageToTPackage
																																																	.equals(pg)) {
																																																if (!mAnonymous
																																																		.equals(mTypeToTType)) {
																																																	if (!mAnonymous
																																																			.equals(tAnonymous)) {
																																																		if (!mAnonymous
																																																				.equals(mCreation)) {
																																																			if (!mAnonymous
																																																					.equals(tPackage)) {
																																																				if (!mAnonymous
																																																						.equals(mType)) {
																																																					if (!mAnonymous
																																																							.equals(tNewPackage)) {
																																																						if (!mAnonymous
																																																								.equals(mPackageToTPackage)) {
																																																							if (!mAnonymous
																																																									.equals(mPackage)) {
																																																								if (!mAnonymous
																																																										.equals(tType)) {
																																																									if (!mAnonymous
																																																											.equals(mMebmber)) {
																																																										if (!mAnonymous
																																																												.equals(pg)) {
																																																											if (!mPackage
																																																													.equals(mTypeToTType)) {
																																																												if (!mPackage
																																																														.equals(tAnonymous)) {
																																																													if (!mPackage
																																																															.equals(tPackage)) {
																																																														if (!mPackage
																																																																.equals(mType)) {
																																																															if (!mPackage
																																																																	.equals(tNewPackage)) {
																																																																if (!mPackage
																																																																		.equals(mPackageToTPackage)) {
																																																																	if (!mPackage
																																																																			.equals(tType)) {
																																																																		if (!mPackage
																																																																				.equals(pg)) {
																																																																			if (!mMebmber
																																																																					.equals(mTypeToTType)) {
																																																																				if (!mMebmber
																																																																						.equals(tAnonymous)) {
																																																																					if (!mMebmber
																																																																							.equals(tPackage)) {
																																																																						if (!mMebmber
																																																																								.equals(mType)) {
																																																																							if (!mMebmber
																																																																									.equals(tNewPackage)) {
																																																																								if (!mMebmber
																																																																										.equals(mPackageToTPackage)) {
																																																																									if (!mMebmber
																																																																											.equals(mPackage)) {
																																																																										if (!mMebmber
																																																																												.equals(tType)) {
																																																																											if (!mMebmber
																																																																													.equals(pg)) {
																																																																												if (!pg.equals(
																																																																														tAnonymous)) {
																																																																													if (!pg.equals(
																																																																															tPackage)) {
																																																																														if (!pg.equals(
																																																																																tNewPackage)) {
																																																																															if (!pg.equals(
																																																																																	tType)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		mTypeToTType,
																																																																																		eAnonymousClassDeclarationToTClass,
																																																																																		tAnonymous,
																																																																																		mCreation,
																																																																																		tPackage,
																																																																																		mType,
																																																																																		tNewPackage,
																																																																																		mPackageToTPackage,
																																																																																		mAnonymous,
																																																																																		mPackage,
																																																																																		tType,
																																																																																		mMebmber,
																																																																																		pg };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eAnonymousClassDeclarationToTClass, EObject tAnonymous,
			EObject mCreation, EObject tPackage, EObject tNewPackage, EObject mAnonymous, EObject tType, EObject pg) {
		EMoflonEdge eAnonymousClassDeclarationToTClass__tAnonymous____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tType__tAnonymous____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNewPackage__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tNewPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNewPackage__tPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tNewPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mCreation____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousClass";
		String eAnonymousClassDeclarationToTClass__tAnonymous____target_name_prime = "target";
		String eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime = "source";
		String tType__tAnonymous____innerTypes_name_prime = "innerTypes";
		String tAnonymous__tType____outerType_name_prime = "outerType";
		String tNewPackage__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__tNewPackage____package_name_prime = "package";
		String pg__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__pg____pg_name_prime = "pg";
		String tNewPackage__tPackage____parent_name_prime = "parent";
		String tPackage__tNewPackage____subpackage_name_prime = "subpackage";
		String pg__tAnonymous____classes_name_prime = "classes";
		String mCreation__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnonymous__mCreation____classInstanceCreation_name_prime = "classInstanceCreation";
		eAnonymousClassDeclarationToTClass__tAnonymous____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tAnonymous____target.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__tAnonymous____target);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setTrg(mAnonymous);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__mAnonymous____source);
		tType__tAnonymous____innerTypes.setSrc(tType);
		tType__tAnonymous____innerTypes.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(tType__tAnonymous____innerTypes);
		tAnonymous__tType____outerType.setSrc(tAnonymous);
		tAnonymous__tType____outerType.setTrg(tType);
		ruleresult.getCreatedEdges().add(tAnonymous__tType____outerType);
		tNewPackage__tAnonymous____ownedTypes.setSrc(tNewPackage);
		tNewPackage__tAnonymous____ownedTypes.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(tNewPackage__tAnonymous____ownedTypes);
		tAnonymous__tNewPackage____package.setSrc(tAnonymous);
		tAnonymous__tNewPackage____package.setTrg(tNewPackage);
		ruleresult.getCreatedEdges().add(tAnonymous__tNewPackage____package);
		pg__tAnonymous____ownedTypes.setSrc(pg);
		pg__tAnonymous____ownedTypes.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(pg__tAnonymous____ownedTypes);
		tAnonymous__pg____pg.setSrc(tAnonymous);
		tAnonymous__pg____pg.setTrg(pg);
		ruleresult.getCreatedEdges().add(tAnonymous__pg____pg);
		tNewPackage__tPackage____parent.setSrc(tNewPackage);
		tNewPackage__tPackage____parent.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(tNewPackage__tPackage____parent);
		tPackage__tNewPackage____subpackage.setSrc(tPackage);
		tPackage__tNewPackage____subpackage.setTrg(tNewPackage);
		ruleresult.getCreatedEdges().add(tPackage__tNewPackage____subpackage);
		pg__tAnonymous____classes.setSrc(pg);
		pg__tAnonymous____classes.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(pg__tAnonymous____classes);
		mCreation__mAnonymous____anonymousClassDeclaration.setSrc(mCreation);
		mCreation__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		ruleresult.getTranslatedEdges().add(mCreation__mAnonymous____anonymousClassDeclaration);
		mAnonymous__mCreation____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mCreation____classInstanceCreation.setTrg(mCreation);
		ruleresult.getTranslatedEdges().add(mAnonymous__mCreation____classInstanceCreation);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eAnonymousClassDeclarationToTClass__tAnonymous____target
				.setName(eAnonymousClassDeclarationToTClass__tAnonymous____target_name_prime);
		eAnonymousClassDeclarationToTClass__mAnonymous____source
				.setName(eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime);
		tType__tAnonymous____innerTypes.setName(tType__tAnonymous____innerTypes_name_prime);
		tAnonymous__tType____outerType.setName(tAnonymous__tType____outerType_name_prime);
		tNewPackage__tAnonymous____ownedTypes.setName(tNewPackage__tAnonymous____ownedTypes_name_prime);
		tAnonymous__tNewPackage____package.setName(tAnonymous__tNewPackage____package_name_prime);
		pg__tAnonymous____ownedTypes.setName(pg__tAnonymous____ownedTypes_name_prime);
		tAnonymous__pg____pg.setName(tAnonymous__pg____pg_name_prime);
		tNewPackage__tPackage____parent.setName(tNewPackage__tPackage____parent_name_prime);
		tPackage__tNewPackage____subpackage.setName(tPackage__tNewPackage____subpackage_name_prime);
		pg__tAnonymous____classes.setName(pg__tAnonymous____classes_name_prime);
		mCreation__mAnonymous____anonymousClassDeclaration
				.setName(mCreation__mAnonymous____anonymousClassDeclaration_name_prime);
		mAnonymous__mCreation____classInstanceCreation
				.setName(mAnonymous__mCreation____classInstanceCreation_name_prime);
		return new Object[] { ruleresult, eAnonymousClassDeclarationToTClass, tAnonymous, mCreation, tPackage,
				tNewPackage, mAnonymous, tType, pg, eAnonymousClassDeclarationToTClass__tAnonymous____target,
				eAnonymousClassDeclarationToTClass__mAnonymous____source, tType__tAnonymous____innerTypes,
				tAnonymous__tType____outerType, tNewPackage__tAnonymous____ownedTypes,
				tAnonymous__tNewPackage____package, pg__tAnonymous____ownedTypes, tAnonymous__pg____pg,
				tNewPackage__tPackage____parent, tPackage__tNewPackage____subpackage, pg__tAnonymous____classes,
				mCreation__mAnonymous____anonymousClassDeclaration, mAnonymous__mCreation____classInstanceCreation };
	}

	public static final void pattern_AnonymousClass_1_5_registerobjects_expressionBBBBBBBBBBBBBBB(AnonymousClass _this,
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject eAnonymousClassDeclarationToTClass,
			EObject tAnonymous, EObject mCreation, EObject tPackage, EObject mType, EObject tNewPackage,
			EObject mPackageToTPackage, EObject mAnonymous, EObject mPackage, EObject tType, EObject mMebmber,
			EObject pg) {
		_this.registerObjects_FWD(ruleresult, mTypeToTType, eAnonymousClassDeclarationToTClass, tAnonymous, mCreation,
				tPackage, mType, tNewPackage, mPackageToTPackage, mAnonymous, mPackage, tType, mMebmber, pg);

	}

	public static final PerformRuleResult pattern_AnonymousClass_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_2_1_preparereturnvalue_bindingFB(AnonymousClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousClass _this) {
		Object[] result_pattern_AnonymousClass_2_1_preparereturnvalue_binding = pattern_AnonymousClass_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousClass_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass_2_1_preparereturnvalue_black = pattern_AnonymousClass_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousClass_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousClass_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousClass_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mCreation");
		EObject _localVariable_1 = match.getObject("mType");
		EObject _localVariable_2 = match.getObject("mAnonymous");
		EObject _localVariable_3 = match.getObject("mPackage");
		EObject _localVariable_4 = match.getObject("mMebmber");
		EObject tmpMCreation = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		EObject tmpMAnonymous = _localVariable_2;
		EObject tmpMPackage = _localVariable_3;
		EObject tmpMMebmber = _localVariable_4;
		if (tmpMCreation instanceof ClassInstanceCreation) {
			ClassInstanceCreation mCreation = (ClassInstanceCreation) tmpMCreation;
			if (tmpMType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
				if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
					AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
					if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
						org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
						if (tmpMMebmber instanceof MDefinition) {
							MDefinition mMebmber = (MDefinition) tmpMMebmber;
							return new Object[] { mCreation, mType, mAnonymous, mPackage, mMebmber, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_2_2_corematch_blackFBFBFBBFBB(
			ClassInstanceCreation mCreation, AbstractTypeDeclaration mType, AnonymousClassDeclaration mAnonymous,
			org.eclipse.modisco.java.Package mPackage, MDefinition mMebmber, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
			TAbstractType tType = mTypeToTType.getTarget();
			if (tType != null) {
				for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mPackage, PackageToTPackage.class, "source")) {
					TPackage tPackage = mPackageToTPackage.getTarget();
					if (tPackage != null) {
						_result.add(new Object[] { mTypeToTType, mCreation, tPackage, mType, mPackageToTPackage,
								mAnonymous, mPackage, tType, mMebmber, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_2_3_findcontext_blackBBBBBBBBBF(
			TypeToTAbstractType mTypeToTType, ClassInstanceCreation mCreation, TPackage tPackage,
			AbstractTypeDeclaration mType, PackageToTPackage mPackageToTPackage, AnonymousClassDeclaration mAnonymous,
			org.eclipse.modisco.java.Package mPackage, TAbstractType tType, MDefinition mMebmber) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mType.equals(mTypeToTType.getSource())) {
			if (mPackage.equals(mPackageToTPackage.getSource())) {
				if (mPackage.getOwnedElements().contains(mType)) {
					if (tPackage.equals(tType.getPackage())) {
						if (mMebmber.getMMethodInvocations().contains(mCreation)) {
							if (mType.getBodyDeclarations().contains(mMebmber)) {
								if (mAnonymous.equals(mCreation.getAnonymousClassDeclaration())) {
									if (tPackage.equals(mPackageToTPackage.getTarget())) {
										if (tType.equals(mTypeToTType.getTarget())) {
											TypeGraph pg = tType.getPg();
											if (pg != null) {
												_result.add(new Object[] { mTypeToTType, mCreation, tPackage, mType,
														mPackageToTPackage, mAnonymous, mPackage, tType, mMebmber,
														pg });
											}

										}
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			TypeToTAbstractType mTypeToTType, ClassInstanceCreation mCreation, TPackage tPackage,
			AbstractTypeDeclaration mType, PackageToTPackage mPackageToTPackage, AnonymousClassDeclaration mAnonymous,
			org.eclipse.modisco.java.Package mPackage, TAbstractType tType, MDefinition mMebmber, TypeGraph pg) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMebmber__mCreation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mMebmber____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMebmber__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mCreation____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__tPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mTypeToTType__mType____source_name_prime = "source";
		String mPackageToTPackage__mPackage____source_name_prime = "source";
		String tType__pg____pg_name_prime = "pg";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		String tType__tPackage____package_name_prime = "package";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String mMebmber__mCreation____mMethodInvocations_name_prime = "mMethodInvocations";
		String mType__mMebmber____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMebmber__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mCreation__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnonymous__mCreation____classInstanceCreation_name_prime = "classInstanceCreation";
		String mPackageToTPackage__tPackage____target_name_prime = "target";
		String mTypeToTType__tType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mCreation);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage);
		isApplicableMatch.getAllContextElements().add(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mMebmber);
		isApplicableMatch.getAllContextElements().add(pg);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mPackageToTPackage__mPackage____source.setSrc(mPackageToTPackage);
		mPackageToTPackage__mPackage____source.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__mPackage____source);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tType__pg____pg);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____ownedTypes);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mType__mPackage____package);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tType__tPackage____package);
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tPackage__tType____ownedTypes);
		mMebmber__mCreation____mMethodInvocations.setSrc(mMebmber);
		mMebmber__mCreation____mMethodInvocations.setTrg(mCreation);
		isApplicableMatch.getAllContextElements().add(mMebmber__mCreation____mMethodInvocations);
		mType__mMebmber____bodyDeclarations.setSrc(mType);
		mType__mMebmber____bodyDeclarations.setTrg(mMebmber);
		isApplicableMatch.getAllContextElements().add(mType__mMebmber____bodyDeclarations);
		mMebmber__mType____abstractTypeDeclaration.setSrc(mMebmber);
		mMebmber__mType____abstractTypeDeclaration.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mMebmber__mType____abstractTypeDeclaration);
		mCreation__mAnonymous____anonymousClassDeclaration.setSrc(mCreation);
		mCreation__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mCreation__mAnonymous____anonymousClassDeclaration);
		mAnonymous__mCreation____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mCreation____classInstanceCreation.setTrg(mCreation);
		isApplicableMatch.getAllContextElements().add(mAnonymous__mCreation____classInstanceCreation);
		mPackageToTPackage__tPackage____target.setSrc(mPackageToTPackage);
		mPackageToTPackage__tPackage____target.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__tPackage____target);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mPackageToTPackage__mPackage____source.setName(mPackageToTPackage__mPackage____source_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		mMebmber__mCreation____mMethodInvocations.setName(mMebmber__mCreation____mMethodInvocations_name_prime);
		mType__mMebmber____bodyDeclarations.setName(mType__mMebmber____bodyDeclarations_name_prime);
		mMebmber__mType____abstractTypeDeclaration.setName(mMebmber__mType____abstractTypeDeclaration_name_prime);
		mCreation__mAnonymous____anonymousClassDeclaration
				.setName(mCreation__mAnonymous____anonymousClassDeclaration_name_prime);
		mAnonymous__mCreation____classInstanceCreation
				.setName(mAnonymous__mCreation____classInstanceCreation_name_prime);
		mPackageToTPackage__tPackage____target.setName(mPackageToTPackage__tPackage____target_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		return new Object[] { mTypeToTType, mCreation, tPackage, mType, mPackageToTPackage, mAnonymous, mPackage, tType,
				mMebmber, pg, isApplicableMatch, mTypeToTType__mType____source, mPackageToTPackage__mPackage____source,
				tType__pg____pg, pg__tType____ownedTypes, mPackage__mType____ownedElements, mType__mPackage____package,
				tType__tPackage____package, tPackage__tType____ownedTypes, mMebmber__mCreation____mMethodInvocations,
				mType__mMebmber____bodyDeclarations, mMebmber__mType____abstractTypeDeclaration,
				mCreation__mAnonymous____anonymousClassDeclaration, mAnonymous__mCreation____classInstanceCreation,
				mPackageToTPackage__tPackage____target, mTypeToTType__tType____target };
	}

	public static final Object[] pattern_AnonymousClass_2_4_solveCSP_bindingFBBBBBBBBBBBB(AnonymousClass _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, ClassInstanceCreation mCreation,
			TPackage tPackage, AbstractTypeDeclaration mType, PackageToTPackage mPackageToTPackage,
			AnonymousClassDeclaration mAnonymous, org.eclipse.modisco.java.Package mPackage, TAbstractType tType,
			MDefinition mMebmber, TypeGraph pg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mTypeToTType, mCreation, tPackage,
				mType, mPackageToTPackage, mAnonymous, mPackage, tType, mMebmber, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mCreation, tPackage, mType,
					mPackageToTPackage, mAnonymous, mPackage, tType, mMebmber, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(AnonymousClass _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, ClassInstanceCreation mCreation,
			TPackage tPackage, AbstractTypeDeclaration mType, PackageToTPackage mPackageToTPackage,
			AnonymousClassDeclaration mAnonymous, org.eclipse.modisco.java.Package mPackage, TAbstractType tType,
			MDefinition mMebmber, TypeGraph pg) {
		Object[] result_pattern_AnonymousClass_2_4_solveCSP_binding = pattern_AnonymousClass_2_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, mCreation, tPackage, mType, mPackageToTPackage, mAnonymous,
				mPackage, tType, mMebmber, pg);
		if (result_pattern_AnonymousClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClass_2_4_solveCSP_black = pattern_AnonymousClass_2_4_solveCSP_blackB(csp);
			if (result_pattern_AnonymousClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mCreation, tPackage, mType,
						mPackageToTPackage, mAnonymous, mPackage, tType, mMebmber, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass_2_5_checkCSP_expressionFBB(AnonymousClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousClass_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClass_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_10_1_initialbindings_blackBBBBBBB(AnonymousClass _this,
			Match match, TClass tAnonymous, TPackage tPackage, TPackage tNewPackage, TAbstractType tType,
			TypeGraph pg) {
		if (!tAnonymous.equals(tType)) {
			if (!tNewPackage.equals(tPackage)) {
				return new Object[] { _this, match, tAnonymous, tPackage, tNewPackage, tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_10_2_SolveCSP_bindingFBBBBBBB(AnonymousClass _this, Match match,
			TClass tAnonymous, TPackage tPackage, TPackage tNewPackage, TAbstractType tType, TypeGraph pg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAnonymous, tPackage, tNewPackage, tType, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAnonymous, tPackage, tNewPackage, tType, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass_10_2_SolveCSP_bindingAndBlackFBBBBBBB(AnonymousClass _this,
			Match match, TClass tAnonymous, TPackage tPackage, TPackage tNewPackage, TAbstractType tType,
			TypeGraph pg) {
		Object[] result_pattern_AnonymousClass_10_2_SolveCSP_binding = pattern_AnonymousClass_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, tAnonymous, tPackage, tNewPackage, tType, pg);
		if (result_pattern_AnonymousClass_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousClass_10_2_SolveCSP_black = pattern_AnonymousClass_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAnonymous, tPackage, tNewPackage, tType, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass_10_3_CheckCSP_expressionFBB(AnonymousClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_10_4_collectelementstobetranslated_blackBBBBBB(Match match,
			TClass tAnonymous, TPackage tPackage, TPackage tNewPackage, TAbstractType tType, TypeGraph pg) {
		if (!tAnonymous.equals(tType)) {
			if (!tNewPackage.equals(tPackage)) {
				return new Object[] { match, tAnonymous, tPackage, tNewPackage, tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFF(
			Match match, TClass tAnonymous, TPackage tPackage, TPackage tNewPackage, TAbstractType tType,
			TypeGraph pg) {
		EMoflonEdge tType__tAnonymous____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNewPackage__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tNewPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNewPackage__tPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tNewPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tAnonymous);
		match.getToBeTranslatedNodes().add(tNewPackage);
		String tType__tAnonymous____innerTypes_name_prime = "innerTypes";
		String tAnonymous__tType____outerType_name_prime = "outerType";
		String tNewPackage__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__tNewPackage____package_name_prime = "package";
		String pg__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__pg____pg_name_prime = "pg";
		String tNewPackage__tPackage____parent_name_prime = "parent";
		String tPackage__tNewPackage____subpackage_name_prime = "subpackage";
		String pg__tAnonymous____classes_name_prime = "classes";
		tType__tAnonymous____innerTypes.setSrc(tType);
		tType__tAnonymous____innerTypes.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(tType__tAnonymous____innerTypes);
		tAnonymous__tType____outerType.setSrc(tAnonymous);
		tAnonymous__tType____outerType.setTrg(tType);
		match.getToBeTranslatedEdges().add(tAnonymous__tType____outerType);
		tNewPackage__tAnonymous____ownedTypes.setSrc(tNewPackage);
		tNewPackage__tAnonymous____ownedTypes.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(tNewPackage__tAnonymous____ownedTypes);
		tAnonymous__tNewPackage____package.setSrc(tAnonymous);
		tAnonymous__tNewPackage____package.setTrg(tNewPackage);
		match.getToBeTranslatedEdges().add(tAnonymous__tNewPackage____package);
		pg__tAnonymous____ownedTypes.setSrc(pg);
		pg__tAnonymous____ownedTypes.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(pg__tAnonymous____ownedTypes);
		tAnonymous__pg____pg.setSrc(tAnonymous);
		tAnonymous__pg____pg.setTrg(pg);
		match.getToBeTranslatedEdges().add(tAnonymous__pg____pg);
		tNewPackage__tPackage____parent.setSrc(tNewPackage);
		tNewPackage__tPackage____parent.setTrg(tPackage);
		match.getToBeTranslatedEdges().add(tNewPackage__tPackage____parent);
		tPackage__tNewPackage____subpackage.setSrc(tPackage);
		tPackage__tNewPackage____subpackage.setTrg(tNewPackage);
		match.getToBeTranslatedEdges().add(tPackage__tNewPackage____subpackage);
		pg__tAnonymous____classes.setSrc(pg);
		pg__tAnonymous____classes.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(pg__tAnonymous____classes);
		tType__tAnonymous____innerTypes.setName(tType__tAnonymous____innerTypes_name_prime);
		tAnonymous__tType____outerType.setName(tAnonymous__tType____outerType_name_prime);
		tNewPackage__tAnonymous____ownedTypes.setName(tNewPackage__tAnonymous____ownedTypes_name_prime);
		tAnonymous__tNewPackage____package.setName(tAnonymous__tNewPackage____package_name_prime);
		pg__tAnonymous____ownedTypes.setName(pg__tAnonymous____ownedTypes_name_prime);
		tAnonymous__pg____pg.setName(tAnonymous__pg____pg_name_prime);
		tNewPackage__tPackage____parent.setName(tNewPackage__tPackage____parent_name_prime);
		tPackage__tNewPackage____subpackage.setName(tPackage__tNewPackage____subpackage_name_prime);
		pg__tAnonymous____classes.setName(pg__tAnonymous____classes_name_prime);
		return new Object[] { match, tAnonymous, tPackage, tNewPackage, tType, pg, tType__tAnonymous____innerTypes,
				tAnonymous__tType____outerType, tNewPackage__tAnonymous____ownedTypes,
				tAnonymous__tNewPackage____package, pg__tAnonymous____ownedTypes, tAnonymous__pg____pg,
				tNewPackage__tPackage____parent, tPackage__tNewPackage____subpackage, pg__tAnonymous____classes };
	}

	public static final Object[] pattern_AnonymousClass_10_5_collectcontextelements_blackBBBBBB(Match match,
			TClass tAnonymous, TPackage tPackage, TPackage tNewPackage, TAbstractType tType, TypeGraph pg) {
		if (!tAnonymous.equals(tType)) {
			if (!tNewPackage.equals(tPackage)) {
				return new Object[] { match, tAnonymous, tPackage, tNewPackage, tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_10_5_collectcontextelements_greenBBBBFFFF(Match match,
			TPackage tPackage, TAbstractType tType, TypeGraph pg) {
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tPackage);
		match.getContextNodes().add(tType);
		match.getContextNodes().add(pg);
		String tType__pg____pg_name_prime = "pg";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		match.getContextEdges().add(tType__pg____pg);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		match.getContextEdges().add(pg__tType____ownedTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		match.getContextEdges().add(tType__tPackage____package);
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		match.getContextEdges().add(tPackage__tType____ownedTypes);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		return new Object[] { match, tPackage, tType, pg, tType__pg____pg, pg__tType____ownedTypes,
				tType__tPackage____package, tPackage__tType____ownedTypes };
	}

	public static final void pattern_AnonymousClass_10_6_registerobjectstomatch_expressionBBBBBBB(AnonymousClass _this,
			Match match, TClass tAnonymous, TPackage tPackage, TPackage tNewPackage, TAbstractType tType,
			TypeGraph pg) {
		_this.registerObjectsToMatch_BWD(match, tAnonymous, tPackage, tNewPackage, tType, pg);

	}

	public static final boolean pattern_AnonymousClass_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_11_1_performtransformation_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAnonymous");
		EObject _localVariable_2 = isApplicableMatch.getObject("mCreation");
		EObject _localVariable_3 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_4 = isApplicableMatch.getObject("mType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tNewPackage");
		EObject _localVariable_6 = isApplicableMatch.getObject("mPackageToTPackage");
		EObject _localVariable_7 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_8 = isApplicableMatch.getObject("tType");
		EObject _localVariable_9 = isApplicableMatch.getObject("mMebmber");
		EObject _localVariable_10 = isApplicableMatch.getObject("pg");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpTAnonymous = _localVariable_1;
		EObject tmpMCreation = _localVariable_2;
		EObject tmpTPackage = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		EObject tmpTNewPackage = _localVariable_5;
		EObject tmpMPackageToTPackage = _localVariable_6;
		EObject tmpMPackage = _localVariable_7;
		EObject tmpTType = _localVariable_8;
		EObject tmpMMebmber = _localVariable_9;
		EObject tmpPg = _localVariable_10;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpTAnonymous instanceof TClass) {
				TClass tAnonymous = (TClass) tmpTAnonymous;
				if (tmpMCreation instanceof ClassInstanceCreation) {
					ClassInstanceCreation mCreation = (ClassInstanceCreation) tmpMCreation;
					if (tmpTPackage instanceof TPackage) {
						TPackage tPackage = (TPackage) tmpTPackage;
						if (tmpMType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
							if (tmpTNewPackage instanceof TPackage) {
								TPackage tNewPackage = (TPackage) tmpTNewPackage;
								if (tmpMPackageToTPackage instanceof PackageToTPackage) {
									PackageToTPackage mPackageToTPackage = (PackageToTPackage) tmpMPackageToTPackage;
									if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
										org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
										if (tmpTType instanceof TAbstractType) {
											TAbstractType tType = (TAbstractType) tmpTType;
											if (tmpMMebmber instanceof MDefinition) {
												MDefinition mMebmber = (MDefinition) tmpMMebmber;
												if (tmpPg instanceof TypeGraph) {
													TypeGraph pg = (TypeGraph) tmpPg;
													return new Object[] { mTypeToTType, tAnonymous, mCreation, tPackage,
															mType, tNewPackage, mPackageToTPackage, mPackage, tType,
															mMebmber, pg, isApplicableMatch };
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_11_1_performtransformation_blackBBBBBBBBBBBFBB(
			TypeToTAbstractType mTypeToTType, TClass tAnonymous, ClassInstanceCreation mCreation, TPackage tPackage,
			AbstractTypeDeclaration mType, TPackage tNewPackage, PackageToTPackage mPackageToTPackage,
			org.eclipse.modisco.java.Package mPackage, TAbstractType tType, MDefinition mMebmber, TypeGraph pg,
			AnonymousClass _this, IsApplicableMatch isApplicableMatch) {
		if (!tAnonymous.equals(tType)) {
			if (!tNewPackage.equals(tPackage)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { mTypeToTType, tAnonymous, mCreation, tPackage, mType, tNewPackage,
								mPackageToTPackage, mPackage, tType, mMebmber, pg, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(
			AnonymousClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousClass_11_1_performtransformation_binding = pattern_AnonymousClass_11_1_performtransformation_bindingFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousClass_11_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_AnonymousClass_11_1_performtransformation_binding[0];
			TClass tAnonymous = (TClass) result_pattern_AnonymousClass_11_1_performtransformation_binding[1];
			ClassInstanceCreation mCreation = (ClassInstanceCreation) result_pattern_AnonymousClass_11_1_performtransformation_binding[2];
			TPackage tPackage = (TPackage) result_pattern_AnonymousClass_11_1_performtransformation_binding[3];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_AnonymousClass_11_1_performtransformation_binding[4];
			TPackage tNewPackage = (TPackage) result_pattern_AnonymousClass_11_1_performtransformation_binding[5];
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result_pattern_AnonymousClass_11_1_performtransformation_binding[6];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_AnonymousClass_11_1_performtransformation_binding[7];
			TAbstractType tType = (TAbstractType) result_pattern_AnonymousClass_11_1_performtransformation_binding[8];
			MDefinition mMebmber = (MDefinition) result_pattern_AnonymousClass_11_1_performtransformation_binding[9];
			TypeGraph pg = (TypeGraph) result_pattern_AnonymousClass_11_1_performtransformation_binding[10];

			Object[] result_pattern_AnonymousClass_11_1_performtransformation_black = pattern_AnonymousClass_11_1_performtransformation_blackBBBBBBBBBBBFBB(
					mTypeToTType, tAnonymous, mCreation, tPackage, mType, tNewPackage, mPackageToTPackage, mPackage,
					tType, mMebmber, pg, _this, isApplicableMatch);
			if (result_pattern_AnonymousClass_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousClass_11_1_performtransformation_black[11];

				return new Object[] { mTypeToTType, tAnonymous, mCreation, tPackage, mType, tNewPackage,
						mPackageToTPackage, mPackage, tType, mMebmber, pg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_11_1_performtransformation_greenFBBF(TClass tAnonymous,
			ClassInstanceCreation mCreation) {
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = ModiscoFactory.eINSTANCE
				.createAnonymousClassDeclarationToTClass();
		AnonymousClassDeclaration mAnonymous = JavaFactory.eINSTANCE.createAnonymousClassDeclaration();
		eAnonymousClassDeclarationToTClass.setTarget(tAnonymous);
		eAnonymousClassDeclarationToTClass.setSource(mAnonymous);
		mCreation.setAnonymousClassDeclaration(mAnonymous);
		return new Object[] { eAnonymousClassDeclarationToTClass, tAnonymous, mCreation, mAnonymous };
	}

	public static final Object[] pattern_AnonymousClass_11_2_collecttranslatedelements_blackBBBB(
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TClass tAnonymous,
			TPackage tNewPackage, AnonymousClassDeclaration mAnonymous) {
		return new Object[] { eAnonymousClassDeclarationToTClass, tAnonymous, tNewPackage, mAnonymous };
	}

	public static final Object[] pattern_AnonymousClass_11_2_collecttranslatedelements_greenFBBBB(
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TClass tAnonymous,
			TPackage tNewPackage, AnonymousClassDeclaration mAnonymous) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(eAnonymousClassDeclarationToTClass);
		ruleresult.getTranslatedElements().add(tAnonymous);
		ruleresult.getTranslatedElements().add(tNewPackage);
		ruleresult.getCreatedElements().add(mAnonymous);
		return new Object[] { ruleresult, eAnonymousClassDeclarationToTClass, tAnonymous, tNewPackage, mAnonymous };
	}

	public static final Object[] pattern_AnonymousClass_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject eAnonymousClassDeclarationToTClass,
			EObject tAnonymous, EObject mCreation, EObject tPackage, EObject mType, EObject tNewPackage,
			EObject mPackageToTPackage, EObject mAnonymous, EObject mPackage, EObject tType, EObject mMebmber,
			EObject pg) {
		if (!mTypeToTType.equals(tAnonymous)) {
			if (!mTypeToTType.equals(tPackage)) {
				if (!mTypeToTType.equals(tNewPackage)) {
					if (!mTypeToTType.equals(tType)) {
						if (!mTypeToTType.equals(pg)) {
							if (!eAnonymousClassDeclarationToTClass.equals(mTypeToTType)) {
								if (!eAnonymousClassDeclarationToTClass.equals(tAnonymous)) {
									if (!eAnonymousClassDeclarationToTClass.equals(mCreation)) {
										if (!eAnonymousClassDeclarationToTClass.equals(tPackage)) {
											if (!eAnonymousClassDeclarationToTClass.equals(mType)) {
												if (!eAnonymousClassDeclarationToTClass.equals(tNewPackage)) {
													if (!eAnonymousClassDeclarationToTClass
															.equals(mPackageToTPackage)) {
														if (!eAnonymousClassDeclarationToTClass.equals(mAnonymous)) {
															if (!eAnonymousClassDeclarationToTClass.equals(mPackage)) {
																if (!eAnonymousClassDeclarationToTClass.equals(tType)) {
																	if (!eAnonymousClassDeclarationToTClass
																			.equals(mMebmber)) {
																		if (!eAnonymousClassDeclarationToTClass
																				.equals(pg)) {
																			if (!tAnonymous.equals(tPackage)) {
																				if (!tAnonymous.equals(tNewPackage)) {
																					if (!tAnonymous.equals(tType)) {
																						if (!mCreation
																								.equals(mTypeToTType)) {
																							if (!mCreation.equals(
																									tAnonymous)) {
																								if (!mCreation.equals(
																										tPackage)) {
																									if (!mCreation
																											.equals(mType)) {
																										if (!mCreation
																												.equals(tNewPackage)) {
																											if (!mCreation
																													.equals(mPackageToTPackage)) {
																												if (!mCreation
																														.equals(mPackage)) {
																													if (!mCreation
																															.equals(tType)) {
																														if (!mCreation
																																.equals(mMebmber)) {
																															if (!mCreation
																																	.equals(pg)) {
																																if (!tPackage
																																		.equals(tType)) {
																																	if (!mType
																																			.equals(mTypeToTType)) {
																																		if (!mType
																																				.equals(tAnonymous)) {
																																			if (!mType
																																					.equals(tPackage)) {
																																				if (!mType
																																						.equals(tNewPackage)) {
																																					if (!mType
																																							.equals(tType)) {
																																						if (!mType
																																								.equals(pg)) {
																																							if (!tNewPackage
																																									.equals(tPackage)) {
																																								if (!tNewPackage
																																										.equals(tType)) {
																																									if (!mPackageToTPackage
																																											.equals(mTypeToTType)) {
																																										if (!mPackageToTPackage
																																												.equals(tAnonymous)) {
																																											if (!mPackageToTPackage
																																													.equals(tPackage)) {
																																												if (!mPackageToTPackage
																																														.equals(mType)) {
																																													if (!mPackageToTPackage
																																															.equals(tNewPackage)) {
																																														if (!mPackageToTPackage
																																																.equals(tType)) {
																																															if (!mPackageToTPackage
																																																	.equals(pg)) {
																																																if (!mAnonymous
																																																		.equals(mTypeToTType)) {
																																																	if (!mAnonymous
																																																			.equals(tAnonymous)) {
																																																		if (!mAnonymous
																																																				.equals(mCreation)) {
																																																			if (!mAnonymous
																																																					.equals(tPackage)) {
																																																				if (!mAnonymous
																																																						.equals(mType)) {
																																																					if (!mAnonymous
																																																							.equals(tNewPackage)) {
																																																						if (!mAnonymous
																																																								.equals(mPackageToTPackage)) {
																																																							if (!mAnonymous
																																																									.equals(mPackage)) {
																																																								if (!mAnonymous
																																																										.equals(tType)) {
																																																									if (!mAnonymous
																																																											.equals(mMebmber)) {
																																																										if (!mAnonymous
																																																												.equals(pg)) {
																																																											if (!mPackage
																																																													.equals(mTypeToTType)) {
																																																												if (!mPackage
																																																														.equals(tAnonymous)) {
																																																													if (!mPackage
																																																															.equals(tPackage)) {
																																																														if (!mPackage
																																																																.equals(mType)) {
																																																															if (!mPackage
																																																																	.equals(tNewPackage)) {
																																																																if (!mPackage
																																																																		.equals(mPackageToTPackage)) {
																																																																	if (!mPackage
																																																																			.equals(tType)) {
																																																																		if (!mPackage
																																																																				.equals(pg)) {
																																																																			if (!mMebmber
																																																																					.equals(mTypeToTType)) {
																																																																				if (!mMebmber
																																																																						.equals(tAnonymous)) {
																																																																					if (!mMebmber
																																																																							.equals(tPackage)) {
																																																																						if (!mMebmber
																																																																								.equals(mType)) {
																																																																							if (!mMebmber
																																																																									.equals(tNewPackage)) {
																																																																								if (!mMebmber
																																																																										.equals(mPackageToTPackage)) {
																																																																									if (!mMebmber
																																																																											.equals(mPackage)) {
																																																																										if (!mMebmber
																																																																												.equals(tType)) {
																																																																											if (!mMebmber
																																																																													.equals(pg)) {
																																																																												if (!pg.equals(
																																																																														tAnonymous)) {
																																																																													if (!pg.equals(
																																																																															tPackage)) {
																																																																														if (!pg.equals(
																																																																																tNewPackage)) {
																																																																															if (!pg.equals(
																																																																																	tType)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		mTypeToTType,
																																																																																		eAnonymousClassDeclarationToTClass,
																																																																																		tAnonymous,
																																																																																		mCreation,
																																																																																		tPackage,
																																																																																		mType,
																																																																																		tNewPackage,
																																																																																		mPackageToTPackage,
																																																																																		mAnonymous,
																																																																																		mPackage,
																																																																																		tType,
																																																																																		mMebmber,
																																																																																		pg };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eAnonymousClassDeclarationToTClass, EObject tAnonymous,
			EObject mCreation, EObject tPackage, EObject tNewPackage, EObject mAnonymous, EObject tType, EObject pg) {
		EMoflonEdge eAnonymousClassDeclarationToTClass__tAnonymous____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tType__tAnonymous____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNewPackage__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tNewPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNewPackage__tPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tNewPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mCreation____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousClass";
		String eAnonymousClassDeclarationToTClass__tAnonymous____target_name_prime = "target";
		String eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime = "source";
		String tType__tAnonymous____innerTypes_name_prime = "innerTypes";
		String tAnonymous__tType____outerType_name_prime = "outerType";
		String tNewPackage__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__tNewPackage____package_name_prime = "package";
		String pg__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__pg____pg_name_prime = "pg";
		String tNewPackage__tPackage____parent_name_prime = "parent";
		String tPackage__tNewPackage____subpackage_name_prime = "subpackage";
		String pg__tAnonymous____classes_name_prime = "classes";
		String mCreation__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnonymous__mCreation____classInstanceCreation_name_prime = "classInstanceCreation";
		eAnonymousClassDeclarationToTClass__tAnonymous____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tAnonymous____target.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__tAnonymous____target);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setTrg(mAnonymous);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__mAnonymous____source);
		tType__tAnonymous____innerTypes.setSrc(tType);
		tType__tAnonymous____innerTypes.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(tType__tAnonymous____innerTypes);
		tAnonymous__tType____outerType.setSrc(tAnonymous);
		tAnonymous__tType____outerType.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tAnonymous__tType____outerType);
		tNewPackage__tAnonymous____ownedTypes.setSrc(tNewPackage);
		tNewPackage__tAnonymous____ownedTypes.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(tNewPackage__tAnonymous____ownedTypes);
		tAnonymous__tNewPackage____package.setSrc(tAnonymous);
		tAnonymous__tNewPackage____package.setTrg(tNewPackage);
		ruleresult.getTranslatedEdges().add(tAnonymous__tNewPackage____package);
		pg__tAnonymous____ownedTypes.setSrc(pg);
		pg__tAnonymous____ownedTypes.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(pg__tAnonymous____ownedTypes);
		tAnonymous__pg____pg.setSrc(tAnonymous);
		tAnonymous__pg____pg.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tAnonymous__pg____pg);
		tNewPackage__tPackage____parent.setSrc(tNewPackage);
		tNewPackage__tPackage____parent.setTrg(tPackage);
		ruleresult.getTranslatedEdges().add(tNewPackage__tPackage____parent);
		tPackage__tNewPackage____subpackage.setSrc(tPackage);
		tPackage__tNewPackage____subpackage.setTrg(tNewPackage);
		ruleresult.getTranslatedEdges().add(tPackage__tNewPackage____subpackage);
		pg__tAnonymous____classes.setSrc(pg);
		pg__tAnonymous____classes.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(pg__tAnonymous____classes);
		mCreation__mAnonymous____anonymousClassDeclaration.setSrc(mCreation);
		mCreation__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		ruleresult.getCreatedEdges().add(mCreation__mAnonymous____anonymousClassDeclaration);
		mAnonymous__mCreation____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mCreation____classInstanceCreation.setTrg(mCreation);
		ruleresult.getCreatedEdges().add(mAnonymous__mCreation____classInstanceCreation);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eAnonymousClassDeclarationToTClass__tAnonymous____target
				.setName(eAnonymousClassDeclarationToTClass__tAnonymous____target_name_prime);
		eAnonymousClassDeclarationToTClass__mAnonymous____source
				.setName(eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime);
		tType__tAnonymous____innerTypes.setName(tType__tAnonymous____innerTypes_name_prime);
		tAnonymous__tType____outerType.setName(tAnonymous__tType____outerType_name_prime);
		tNewPackage__tAnonymous____ownedTypes.setName(tNewPackage__tAnonymous____ownedTypes_name_prime);
		tAnonymous__tNewPackage____package.setName(tAnonymous__tNewPackage____package_name_prime);
		pg__tAnonymous____ownedTypes.setName(pg__tAnonymous____ownedTypes_name_prime);
		tAnonymous__pg____pg.setName(tAnonymous__pg____pg_name_prime);
		tNewPackage__tPackage____parent.setName(tNewPackage__tPackage____parent_name_prime);
		tPackage__tNewPackage____subpackage.setName(tPackage__tNewPackage____subpackage_name_prime);
		pg__tAnonymous____classes.setName(pg__tAnonymous____classes_name_prime);
		mCreation__mAnonymous____anonymousClassDeclaration
				.setName(mCreation__mAnonymous____anonymousClassDeclaration_name_prime);
		mAnonymous__mCreation____classInstanceCreation
				.setName(mAnonymous__mCreation____classInstanceCreation_name_prime);
		return new Object[] { ruleresult, eAnonymousClassDeclarationToTClass, tAnonymous, mCreation, tPackage,
				tNewPackage, mAnonymous, tType, pg, eAnonymousClassDeclarationToTClass__tAnonymous____target,
				eAnonymousClassDeclarationToTClass__mAnonymous____source, tType__tAnonymous____innerTypes,
				tAnonymous__tType____outerType, tNewPackage__tAnonymous____ownedTypes,
				tAnonymous__tNewPackage____package, pg__tAnonymous____ownedTypes, tAnonymous__pg____pg,
				tNewPackage__tPackage____parent, tPackage__tNewPackage____subpackage, pg__tAnonymous____classes,
				mCreation__mAnonymous____anonymousClassDeclaration, mAnonymous__mCreation____classInstanceCreation };
	}

	public static final void pattern_AnonymousClass_11_5_registerobjects_expressionBBBBBBBBBBBBBBB(AnonymousClass _this,
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject eAnonymousClassDeclarationToTClass,
			EObject tAnonymous, EObject mCreation, EObject tPackage, EObject mType, EObject tNewPackage,
			EObject mPackageToTPackage, EObject mAnonymous, EObject mPackage, EObject tType, EObject mMebmber,
			EObject pg) {
		_this.registerObjects_BWD(ruleresult, mTypeToTType, eAnonymousClassDeclarationToTClass, tAnonymous, mCreation,
				tPackage, mType, tNewPackage, mPackageToTPackage, mAnonymous, mPackage, tType, mMebmber, pg);

	}

	public static final PerformRuleResult pattern_AnonymousClass_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_12_1_preparereturnvalue_bindingFB(AnonymousClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousClass _this) {
		Object[] result_pattern_AnonymousClass_12_1_preparereturnvalue_binding = pattern_AnonymousClass_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousClass_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass_12_1_preparereturnvalue_black = pattern_AnonymousClass_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousClass_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousClass_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousClass_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAnonymous");
		EObject _localVariable_1 = match.getObject("tPackage");
		EObject _localVariable_2 = match.getObject("tNewPackage");
		EObject _localVariable_3 = match.getObject("tType");
		EObject _localVariable_4 = match.getObject("pg");
		EObject tmpTAnonymous = _localVariable_0;
		EObject tmpTPackage = _localVariable_1;
		EObject tmpTNewPackage = _localVariable_2;
		EObject tmpTType = _localVariable_3;
		EObject tmpPg = _localVariable_4;
		if (tmpTAnonymous instanceof TClass) {
			TClass tAnonymous = (TClass) tmpTAnonymous;
			if (tmpTPackage instanceof TPackage) {
				TPackage tPackage = (TPackage) tmpTPackage;
				if (tmpTNewPackage instanceof TPackage) {
					TPackage tNewPackage = (TPackage) tmpTNewPackage;
					if (tmpTType instanceof TAbstractType) {
						TAbstractType tType = (TAbstractType) tmpTType;
						if (tmpPg instanceof TypeGraph) {
							TypeGraph pg = (TypeGraph) tmpPg;
							return new Object[] { tAnonymous, tPackage, tNewPackage, tType, pg, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_12_2_corematch_blackFBBFBFFBBB(TClass tAnonymous,
			TPackage tPackage, TPackage tNewPackage, TAbstractType tType, TypeGraph pg, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnonymous.equals(tType)) {
			if (!tNewPackage.equals(tPackage)) {
				String tAnonymous_tName = tAnonymous.getTName();
				if (tAnonymous_tName.equals("Anonymous")) {
					boolean tAnonymous_tLib = tAnonymous.isTLib();
					if (Boolean.valueOf(tAnonymous_tLib).equals(Boolean.valueOf(false))) {
						for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tPackage, PackageToTPackage.class, "target")) {
							org.eclipse.modisco.java.Package mPackage = mPackageToTPackage.getSource();
							if (mPackage != null) {
								for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
									Type tmpMType = mTypeToTType.getSource();
									if (tmpMType instanceof AbstractTypeDeclaration) {
										AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
										_result.add(new Object[] { mTypeToTType, tAnonymous, tPackage, mType,
												tNewPackage, mPackageToTPackage, mPackage, tType, pg, match });
									}

								}
							}

						}
					}

				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_12_3_findcontext_blackBBFBBBBBBFB(
			TypeToTAbstractType mTypeToTType, TClass tAnonymous, TPackage tPackage, AbstractTypeDeclaration mType,
			TPackage tNewPackage, PackageToTPackage mPackageToTPackage, org.eclipse.modisco.java.Package mPackage,
			TAbstractType tType, TypeGraph pg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnonymous.equals(tType)) {
			if (!tNewPackage.equals(tPackage)) {
				if (mType.equals(mTypeToTType.getSource())) {
					if (mPackage.equals(mPackageToTPackage.getSource())) {
						if (tType.getInnerTypes().contains(tAnonymous)) {
							if (pg.equals(tType.getPg())) {
								if (mPackage.getOwnedElements().contains(mType)) {
									if (tNewPackage.getOwnedTypes().contains(tAnonymous)) {
										if (tPackage.equals(tType.getPackage())) {
											if (pg.getOwnedTypes().contains(tAnonymous)) {
												if (tPackage.equals(tNewPackage.getParent())) {
													if (pg.getClasses().contains(tAnonymous)) {
														if (tPackage.equals(mPackageToTPackage.getTarget())) {
															if (tType.equals(mTypeToTType.getTarget())) {
																String tAnonymous_tName = tAnonymous.getTName();
																if (tAnonymous_tName.equals("Anonymous")) {
																	boolean tAnonymous_tLib = tAnonymous.isTLib();
																	if (Boolean.valueOf(tAnonymous_tLib)
																			.equals(Boolean.valueOf(false))) {
																		for (BodyDeclaration tmpMMebmber : mType
																				.getBodyDeclarations()) {
																			if (tmpMMebmber instanceof MDefinition) {
																				MDefinition mMebmber = (MDefinition) tmpMMebmber;
																				for (AbstractMethodInvocation tmpMCreation : mMebmber
																						.getMMethodInvocations()) {
																					if (tmpMCreation instanceof ClassInstanceCreation) {
																						ClassInstanceCreation mCreation = (ClassInstanceCreation) tmpMCreation;
																						_result.add(new Object[] {
																								mTypeToTType,
																								tAnonymous, mCreation,
																								tPackage, mType,
																								tNewPackage,
																								mPackageToTPackage,
																								mPackage, tType,
																								mMebmber, pg });
																					}
																				}
																			}
																		}
																	}

																}

															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_12_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFF(
			TypeToTAbstractType mTypeToTType, TClass tAnonymous, ClassInstanceCreation mCreation, TPackage tPackage,
			AbstractTypeDeclaration mType, TPackage tNewPackage, PackageToTPackage mPackageToTPackage,
			org.eclipse.modisco.java.Package mPackage, TAbstractType tType, MDefinition mMebmber, TypeGraph pg) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tAnonymous____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNewPackage__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tNewPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMebmber__mCreation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNewPackage__tPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tNewPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mMebmber____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMebmber__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__tPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mTypeToTType__mType____source_name_prime = "source";
		String mPackageToTPackage__mPackage____source_name_prime = "source";
		String tType__tAnonymous____innerTypes_name_prime = "innerTypes";
		String tAnonymous__tType____outerType_name_prime = "outerType";
		String tType__pg____pg_name_prime = "pg";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		String tNewPackage__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__tNewPackage____package_name_prime = "package";
		String tType__tPackage____package_name_prime = "package";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String mMebmber__mCreation____mMethodInvocations_name_prime = "mMethodInvocations";
		String pg__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__pg____pg_name_prime = "pg";
		String tNewPackage__tPackage____parent_name_prime = "parent";
		String tPackage__tNewPackage____subpackage_name_prime = "subpackage";
		String mType__mMebmber____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMebmber__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String pg__tAnonymous____classes_name_prime = "classes";
		String mPackageToTPackage__tPackage____target_name_prime = "target";
		String mTypeToTType__tType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tAnonymous);
		isApplicableMatch.getAllContextElements().add(mCreation);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tNewPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mMebmber);
		isApplicableMatch.getAllContextElements().add(pg);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mPackageToTPackage__mPackage____source.setSrc(mPackageToTPackage);
		mPackageToTPackage__mPackage____source.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__mPackage____source);
		tType__tAnonymous____innerTypes.setSrc(tType);
		tType__tAnonymous____innerTypes.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(tType__tAnonymous____innerTypes);
		tAnonymous__tType____outerType.setSrc(tAnonymous);
		tAnonymous__tType____outerType.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tAnonymous__tType____outerType);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tType__pg____pg);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____ownedTypes);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mType__mPackage____package);
		tNewPackage__tAnonymous____ownedTypes.setSrc(tNewPackage);
		tNewPackage__tAnonymous____ownedTypes.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(tNewPackage__tAnonymous____ownedTypes);
		tAnonymous__tNewPackage____package.setSrc(tAnonymous);
		tAnonymous__tNewPackage____package.setTrg(tNewPackage);
		isApplicableMatch.getAllContextElements().add(tAnonymous__tNewPackage____package);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tType__tPackage____package);
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tPackage__tType____ownedTypes);
		mMebmber__mCreation____mMethodInvocations.setSrc(mMebmber);
		mMebmber__mCreation____mMethodInvocations.setTrg(mCreation);
		isApplicableMatch.getAllContextElements().add(mMebmber__mCreation____mMethodInvocations);
		pg__tAnonymous____ownedTypes.setSrc(pg);
		pg__tAnonymous____ownedTypes.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(pg__tAnonymous____ownedTypes);
		tAnonymous__pg____pg.setSrc(tAnonymous);
		tAnonymous__pg____pg.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tAnonymous__pg____pg);
		tNewPackage__tPackage____parent.setSrc(tNewPackage);
		tNewPackage__tPackage____parent.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tNewPackage__tPackage____parent);
		tPackage__tNewPackage____subpackage.setSrc(tPackage);
		tPackage__tNewPackage____subpackage.setTrg(tNewPackage);
		isApplicableMatch.getAllContextElements().add(tPackage__tNewPackage____subpackage);
		mType__mMebmber____bodyDeclarations.setSrc(mType);
		mType__mMebmber____bodyDeclarations.setTrg(mMebmber);
		isApplicableMatch.getAllContextElements().add(mType__mMebmber____bodyDeclarations);
		mMebmber__mType____abstractTypeDeclaration.setSrc(mMebmber);
		mMebmber__mType____abstractTypeDeclaration.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mMebmber__mType____abstractTypeDeclaration);
		pg__tAnonymous____classes.setSrc(pg);
		pg__tAnonymous____classes.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(pg__tAnonymous____classes);
		mPackageToTPackage__tPackage____target.setSrc(mPackageToTPackage);
		mPackageToTPackage__tPackage____target.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__tPackage____target);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mPackageToTPackage__mPackage____source.setName(mPackageToTPackage__mPackage____source_name_prime);
		tType__tAnonymous____innerTypes.setName(tType__tAnonymous____innerTypes_name_prime);
		tAnonymous__tType____outerType.setName(tAnonymous__tType____outerType_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		tNewPackage__tAnonymous____ownedTypes.setName(tNewPackage__tAnonymous____ownedTypes_name_prime);
		tAnonymous__tNewPackage____package.setName(tAnonymous__tNewPackage____package_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		mMebmber__mCreation____mMethodInvocations.setName(mMebmber__mCreation____mMethodInvocations_name_prime);
		pg__tAnonymous____ownedTypes.setName(pg__tAnonymous____ownedTypes_name_prime);
		tAnonymous__pg____pg.setName(tAnonymous__pg____pg_name_prime);
		tNewPackage__tPackage____parent.setName(tNewPackage__tPackage____parent_name_prime);
		tPackage__tNewPackage____subpackage.setName(tPackage__tNewPackage____subpackage_name_prime);
		mType__mMebmber____bodyDeclarations.setName(mType__mMebmber____bodyDeclarations_name_prime);
		mMebmber__mType____abstractTypeDeclaration.setName(mMebmber__mType____abstractTypeDeclaration_name_prime);
		pg__tAnonymous____classes.setName(pg__tAnonymous____classes_name_prime);
		mPackageToTPackage__tPackage____target.setName(mPackageToTPackage__tPackage____target_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		return new Object[] { mTypeToTType, tAnonymous, mCreation, tPackage, mType, tNewPackage, mPackageToTPackage,
				mPackage, tType, mMebmber, pg, isApplicableMatch, mTypeToTType__mType____source,
				mPackageToTPackage__mPackage____source, tType__tAnonymous____innerTypes, tAnonymous__tType____outerType,
				tType__pg____pg, pg__tType____ownedTypes, mPackage__mType____ownedElements, mType__mPackage____package,
				tNewPackage__tAnonymous____ownedTypes, tAnonymous__tNewPackage____package, tType__tPackage____package,
				tPackage__tType____ownedTypes, mMebmber__mCreation____mMethodInvocations, pg__tAnonymous____ownedTypes,
				tAnonymous__pg____pg, tNewPackage__tPackage____parent, tPackage__tNewPackage____subpackage,
				mType__mMebmber____bodyDeclarations, mMebmber__mType____abstractTypeDeclaration,
				pg__tAnonymous____classes, mPackageToTPackage__tPackage____target, mTypeToTType__tType____target };
	}

	public static final Object[] pattern_AnonymousClass_12_4_solveCSP_bindingFBBBBBBBBBBBBB(AnonymousClass _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, TClass tAnonymous,
			ClassInstanceCreation mCreation, TPackage tPackage, AbstractTypeDeclaration mType, TPackage tNewPackage,
			PackageToTPackage mPackageToTPackage, org.eclipse.modisco.java.Package mPackage, TAbstractType tType,
			MDefinition mMebmber, TypeGraph pg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mTypeToTType, tAnonymous, mCreation,
				tPackage, mType, tNewPackage, mPackageToTPackage, mPackage, tType, mMebmber, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tAnonymous, mCreation, tPackage, mType,
					tNewPackage, mPackageToTPackage, mPackage, tType, mMebmber, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(
			AnonymousClass _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TClass tAnonymous, ClassInstanceCreation mCreation, TPackage tPackage, AbstractTypeDeclaration mType,
			TPackage tNewPackage, PackageToTPackage mPackageToTPackage, org.eclipse.modisco.java.Package mPackage,
			TAbstractType tType, MDefinition mMebmber, TypeGraph pg) {
		Object[] result_pattern_AnonymousClass_12_4_solveCSP_binding = pattern_AnonymousClass_12_4_solveCSP_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tAnonymous, mCreation, tPackage, mType, tNewPackage,
				mPackageToTPackage, mPackage, tType, mMebmber, pg);
		if (result_pattern_AnonymousClass_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClass_12_4_solveCSP_black = pattern_AnonymousClass_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tAnonymous, mCreation, tPackage,
						mType, tNewPackage, mPackageToTPackage, mPackage, tType, mMebmber, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass_12_5_checkCSP_expressionFBB(AnonymousClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousClass_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClass_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_20_1_preparereturnvalue_bindingFB(AnonymousClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnonymousClass _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_BWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousClass _this) {
		Object[] result_pattern_AnonymousClass_20_1_preparereturnvalue_binding = pattern_AnonymousClass_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousClass_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass_20_1_preparereturnvalue_black = pattern_AnonymousClass_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousClass_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousClass_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousClass_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_0BBB(TClass tAnonymous,
			TPackage tPackage, TPackage tNewPackage) {
		if (!tNewPackage.equals(tPackage)) {
			for (TPackage __DEC_tAnonymous_classes_421902 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAnonymous, TPackage.class, "classes")) {
				if (!tPackage.equals(__DEC_tAnonymous_classes_421902)) {
					if (!tNewPackage.equals(__DEC_tAnonymous_classes_421902)) {
						return new Object[] { tAnonymous, tPackage, tNewPackage };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_1BB(TClass tAnonymous,
			TypeGraph pg) {
		for (TypeGraph __DEC_tAnonymous_classes_542400 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnonymous, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tAnonymous_classes_542400)) {
				return new Object[] { tAnonymous, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_2BBB(TClass tAnonymous,
			TPackage tPackage, TPackage tNewPackage) {
		if (!tNewPackage.equals(tPackage)) {
			TPackage __DEC_tAnonymous_ownedTypes_821358 = tAnonymous.getPackage();
			if (__DEC_tAnonymous_ownedTypes_821358 != null) {
				if (!tPackage.equals(__DEC_tAnonymous_ownedTypes_821358)) {
					if (!tNewPackage.equals(__DEC_tAnonymous_ownedTypes_821358)) {
						return new Object[] { tAnonymous, tPackage, tNewPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_3BB(TClass tAnonymous,
			TAbstractType tType) {
		if (!tAnonymous.equals(tType)) {
			TAbstractType __DEC_tAnonymous_innerTypes_476473 = tAnonymous.getOuterType();
			if (__DEC_tAnonymous_innerTypes_476473 != null) {
				if (!tAnonymous.equals(__DEC_tAnonymous_innerTypes_476473)) {
					if (!tType.equals(__DEC_tAnonymous_innerTypes_476473)) {
						return new Object[] { tAnonymous, tType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_4BB(TPackage tNewPackage,
			TypeGraph pg) {
		TypeGraph __DEC_tNewPackage_typeGraph_689627 = tNewPackage.getTypeGraph();
		if (__DEC_tNewPackage_typeGraph_689627 != null) {
			if (!pg.equals(__DEC_tNewPackage_typeGraph_689627)) {
				return new Object[] { tNewPackage, pg };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_5BB(TPackage tNewPackage,
			TPackage tPackage) {
		if (!tNewPackage.equals(tPackage)) {
			TPackage __DEC_tNewPackage_subpackage_193436 = tNewPackage.getParent();
			if (__DEC_tNewPackage_subpackage_193436 != null) {
				if (!tNewPackage.equals(__DEC_tNewPackage_subpackage_193436)) {
					if (!tPackage.equals(__DEC_tNewPackage_subpackage_193436)) {
						return new Object[] { tNewPackage, tPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_6BB(TPackage tNewPackage,
			TypeGraph pg) {
		TypeGraph __DEC_tNewPackage_packages_979818 = tNewPackage.getPg();
		if (__DEC_tNewPackage_packages_979818 != null) {
			if (!pg.equals(__DEC_tNewPackage_packages_979818)) {
				return new Object[] { tNewPackage, pg };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_7BB(TPackage tPackage,
			TClass tAnonymous) {
		if (tPackage.getClasses().contains(tAnonymous)) {
			return new Object[] { tPackage, tAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_8BB(TPackage tNewPackage,
			TClass tAnonymous) {
		if (tNewPackage.getClasses().contains(tAnonymous)) {
			return new Object[] { tNewPackage, tAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_9BB(TPackage tPackage,
			TClass tAnonymous) {
		if (tPackage.getOwnedTypes().contains(tAnonymous)) {
			return new Object[] { tPackage, tAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_10BB(TPackage tNewPackage,
			TypeGraph pg) {
		if (pg.equals(tNewPackage.getTypeGraph())) {
			return new Object[] { tNewPackage, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_11BB(TypeGraph pg,
			TPackage tNewPackage) {
		if (pg.getPackages().contains(tNewPackage)) {
			return new Object[] { pg, tNewPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_innerTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTType = _edge_innerTypes.getSrc();
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			EObject tmpTAnonymous = _edge_innerTypes.getTrg();
			if (tmpTAnonymous instanceof TClass) {
				TClass tAnonymous = (TClass) tmpTAnonymous;
				if (!tAnonymous.equals(tType)) {
					if (tType.getInnerTypes().contains(tAnonymous)) {
						TypeGraph pg = tType.getPg();
						if (pg != null) {
							if (pg.getOwnedTypes().contains(tAnonymous)) {
								if (pg.getClasses().contains(tAnonymous)) {
									TPackage tPackage = tType.getPackage();
									if (tPackage != null) {
										TPackage tNewPackage = tAnonymous.getPackage();
										if (tNewPackage != null) {
											if (!tNewPackage.equals(tPackage)) {
												if (tPackage.equals(tNewPackage.getParent())) {
													String tAnonymous_tName = tAnonymous.getTName();
													if (tAnonymous_tName.equals("Anonymous")) {
														boolean tAnonymous_tLib = tAnonymous.isTLib();
														if (Boolean.valueOf(tAnonymous_tLib)
																.equals(Boolean.valueOf(false))) {
															if (pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_3BB(
																	tAnonymous, tType) == null) {
																if (pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_1BB(
																		tAnonymous, pg) == null) {
																	if (pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_7BB(
																			tPackage, tAnonymous) == null) {
																		if (pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_9BB(
																				tPackage, tAnonymous) == null) {
																			if (pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_0BBB(
																					tAnonymous, tPackage,
																					tNewPackage) == null) {
																				if (pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_2BBB(
																						tAnonymous, tPackage,
																						tNewPackage) == null) {
																					if (pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_4BB(
																							tNewPackage, pg) == null) {
																						if (pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_5BB(
																								tNewPackage,
																								tPackage) == null) {
																							if (pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_6BB(
																									tNewPackage,
																									pg) == null) {
																								if (pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_8BB(
																										tNewPackage,
																										tAnonymous) == null) {
																									if (pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_10BB(
																											tNewPackage,
																											pg) == null) {
																										if (pattern_AnonymousClass_20_2_testcorematchandDECs_black_nac_11BB(
																												pg,
																												tNewPackage) == null) {
																											_result.add(
																													new Object[] {
																															tAnonymous,
																															tPackage,
																															tNewPackage,
																															tType,
																															pg,
																															_edge_innerTypes });
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}

													}

												}
											}
										}

									}

								}
							}
						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnonymousClass_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			AnonymousClass _this, Match match, TClass tAnonymous, TPackage tPackage, TPackage tNewPackage,
			TAbstractType tType, TypeGraph pg) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAnonymous, tPackage, tNewPackage, tType, pg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousClass_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_21_1_preparereturnvalue_bindingFB(AnonymousClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnonymousClass _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_FWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousClass _this) {
		Object[] result_pattern_AnonymousClass_21_1_preparereturnvalue_binding = pattern_AnonymousClass_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousClass_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass_21_1_preparereturnvalue_black = pattern_AnonymousClass_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousClass_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousClass_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousClass_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_anonymousClassDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMCreation = _edge_anonymousClassDeclaration.getSrc();
		if (tmpMCreation instanceof ClassInstanceCreation) {
			ClassInstanceCreation mCreation = (ClassInstanceCreation) tmpMCreation;
			EObject tmpMAnonymous = _edge_anonymousClassDeclaration.getTrg();
			if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
				if (mAnonymous.equals(mCreation.getAnonymousClassDeclaration())) {
					for (MDefinition mMebmber : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mCreation, MDefinition.class, "mMethodInvocations")) {
						AbstractTypeDeclaration mType = mMebmber.getAbstractTypeDeclaration();
						if (mType != null) {
							org.eclipse.modisco.java.Package mPackage = mType.getPackage();
							if (mPackage != null) {
								_result.add(new Object[] { mCreation, mType, mAnonymous, mPackage, mMebmber,
										_edge_anonymousClassDeclaration });
							}

						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnonymousClass_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			AnonymousClass _this, Match match, ClassInstanceCreation mCreation, AbstractTypeDeclaration mType,
			AnonymousClassDeclaration mAnonymous, org.eclipse.modisco.java.Package mPackage, MDefinition mMebmber) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mCreation, mType, mAnonymous, mPackage, mMebmber);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousClass_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_24_1_prepare_blackB(AnonymousClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousClass_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnonymousClass_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tAnonymous");
		EObject _localVariable_1 = sourceMatch.getObject("mCreation");
		EObject _localVariable_2 = targetMatch.getObject("tPackage");
		EObject _localVariable_3 = sourceMatch.getObject("mType");
		EObject _localVariable_4 = targetMatch.getObject("tNewPackage");
		EObject _localVariable_5 = sourceMatch.getObject("mAnonymous");
		EObject _localVariable_6 = sourceMatch.getObject("mPackage");
		EObject _localVariable_7 = targetMatch.getObject("tType");
		EObject _localVariable_8 = sourceMatch.getObject("mMebmber");
		EObject _localVariable_9 = targetMatch.getObject("pg");
		EObject tmpTAnonymous = _localVariable_0;
		EObject tmpMCreation = _localVariable_1;
		EObject tmpTPackage = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpTNewPackage = _localVariable_4;
		EObject tmpMAnonymous = _localVariable_5;
		EObject tmpMPackage = _localVariable_6;
		EObject tmpTType = _localVariable_7;
		EObject tmpMMebmber = _localVariable_8;
		EObject tmpPg = _localVariable_9;
		if (tmpTAnonymous instanceof TClass) {
			TClass tAnonymous = (TClass) tmpTAnonymous;
			if (tmpMCreation instanceof ClassInstanceCreation) {
				ClassInstanceCreation mCreation = (ClassInstanceCreation) tmpMCreation;
				if (tmpTPackage instanceof TPackage) {
					TPackage tPackage = (TPackage) tmpTPackage;
					if (tmpMType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
						if (tmpTNewPackage instanceof TPackage) {
							TPackage tNewPackage = (TPackage) tmpTNewPackage;
							if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
								AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
								if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
									org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
									if (tmpTType instanceof TAbstractType) {
										TAbstractType tType = (TAbstractType) tmpTType;
										if (tmpMMebmber instanceof MDefinition) {
											MDefinition mMebmber = (MDefinition) tmpMMebmber;
											if (tmpPg instanceof TypeGraph) {
												TypeGraph pg = (TypeGraph) tmpPg;
												return new Object[] { tAnonymous, mCreation, tPackage, mType,
														tNewPackage, mAnonymous, mPackage, tType, mMebmber, pg,
														targetMatch, sourceMatch };
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(TClass tAnonymous,
			ClassInstanceCreation mCreation, TPackage tPackage, AbstractTypeDeclaration mType, TPackage tNewPackage,
			AnonymousClassDeclaration mAnonymous, org.eclipse.modisco.java.Package mPackage, TAbstractType tType,
			MDefinition mMebmber, TypeGraph pg, Match sourceMatch, Match targetMatch) {
		if (!tAnonymous.equals(tType)) {
			if (!tNewPackage.equals(tPackage)) {
				if (!sourceMatch.equals(targetMatch)) {
					String tAnonymous_tName = tAnonymous.getTName();
					if (tAnonymous_tName.equals("Anonymous")) {
						boolean tAnonymous_tLib = tAnonymous.isTLib();
						if (Boolean.valueOf(tAnonymous_tLib).equals(Boolean.valueOf(false))) {
							return new Object[] { tAnonymous, mCreation, tPackage, mType, tNewPackage, mAnonymous,
									mPackage, tType, mMebmber, pg, sourceMatch, targetMatch };
						}

					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnonymousClass_24_2_matchsrctrgcontext_binding = pattern_AnonymousClass_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_AnonymousClass_24_2_matchsrctrgcontext_binding != null) {
			TClass tAnonymous = (TClass) result_pattern_AnonymousClass_24_2_matchsrctrgcontext_binding[0];
			ClassInstanceCreation mCreation = (ClassInstanceCreation) result_pattern_AnonymousClass_24_2_matchsrctrgcontext_binding[1];
			TPackage tPackage = (TPackage) result_pattern_AnonymousClass_24_2_matchsrctrgcontext_binding[2];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_AnonymousClass_24_2_matchsrctrgcontext_binding[3];
			TPackage tNewPackage = (TPackage) result_pattern_AnonymousClass_24_2_matchsrctrgcontext_binding[4];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_AnonymousClass_24_2_matchsrctrgcontext_binding[5];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_AnonymousClass_24_2_matchsrctrgcontext_binding[6];
			TAbstractType tType = (TAbstractType) result_pattern_AnonymousClass_24_2_matchsrctrgcontext_binding[7];
			MDefinition mMebmber = (MDefinition) result_pattern_AnonymousClass_24_2_matchsrctrgcontext_binding[8];
			TypeGraph pg = (TypeGraph) result_pattern_AnonymousClass_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_AnonymousClass_24_2_matchsrctrgcontext_black = pattern_AnonymousClass_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					tAnonymous, mCreation, tPackage, mType, tNewPackage, mAnonymous, mPackage, tType, mMebmber, pg,
					sourceMatch, targetMatch);
			if (result_pattern_AnonymousClass_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tAnonymous, mCreation, tPackage, mType, tNewPackage, mAnonymous, mPackage, tType,
						mMebmber, pg, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_24_3_solvecsp_bindingFBBBBBBBBBBBBB(AnonymousClass _this,
			TClass tAnonymous, ClassInstanceCreation mCreation, TPackage tPackage, AbstractTypeDeclaration mType,
			TPackage tNewPackage, AnonymousClassDeclaration mAnonymous, org.eclipse.modisco.java.Package mPackage,
			TAbstractType tType, MDefinition mMebmber, TypeGraph pg, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(tAnonymous, mCreation, tPackage, mType, tNewPackage,
				mAnonymous, mPackage, tType, mMebmber, pg, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, tAnonymous, mCreation, tPackage, mType, tNewPackage, mAnonymous, mPackage,
					tType, mMebmber, pg, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			AnonymousClass _this, TClass tAnonymous, ClassInstanceCreation mCreation, TPackage tPackage,
			AbstractTypeDeclaration mType, TPackage tNewPackage, AnonymousClassDeclaration mAnonymous,
			org.eclipse.modisco.java.Package mPackage, TAbstractType tType, MDefinition mMebmber, TypeGraph pg,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnonymousClass_24_3_solvecsp_binding = pattern_AnonymousClass_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, tAnonymous, mCreation, tPackage, mType, tNewPackage, mAnonymous, mPackage, tType, mMebmber, pg,
				sourceMatch, targetMatch);
		if (result_pattern_AnonymousClass_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnonymousClass_24_3_solvecsp_black = pattern_AnonymousClass_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnonymousClass_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tAnonymous, mCreation, tPackage, mType, tNewPackage, mAnonymous,
						mPackage, tType, mMebmber, pg, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_24_5_matchcorrcontext_blackFBBFBBBB(TPackage tPackage,
			AbstractTypeDeclaration mType, org.eclipse.modisco.java.Package mPackage, TAbstractType tType,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
				if (tType.equals(mTypeToTType.getTarget())) {
					for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mPackage, PackageToTPackage.class, "source")) {
						if (tPackage.equals(mPackageToTPackage.getTarget())) {
							_result.add(new Object[] { mTypeToTType, tPackage, mType, mPackageToTPackage, mPackage,
									tType, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTType, PackageToTPackage mPackageToTPackage, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnonymousClass";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(mPackageToTPackage);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, mPackageToTPackage, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnonymousClass_24_6_createcorrespondence_blackBBBBBBBBBBB(TClass tAnonymous,
			ClassInstanceCreation mCreation, TPackage tPackage, AbstractTypeDeclaration mType, TPackage tNewPackage,
			AnonymousClassDeclaration mAnonymous, org.eclipse.modisco.java.Package mPackage, TAbstractType tType,
			MDefinition mMebmber, TypeGraph pg, CCMatch ccMatch) {
		if (!tAnonymous.equals(tType)) {
			if (!tNewPackage.equals(tPackage)) {
				return new Object[] { tAnonymous, mCreation, tPackage, mType, tNewPackage, mAnonymous, mPackage, tType,
						mMebmber, pg, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_24_6_createcorrespondence_greenFBBB(TClass tAnonymous,
			AnonymousClassDeclaration mAnonymous, CCMatch ccMatch) {
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = ModiscoFactory.eINSTANCE
				.createAnonymousClassDeclarationToTClass();
		eAnonymousClassDeclarationToTClass.setTarget(tAnonymous);
		eAnonymousClassDeclarationToTClass.setSource(mAnonymous);
		ccMatch.getCreateCorr().add(eAnonymousClassDeclarationToTClass);
		return new Object[] { eAnonymousClassDeclarationToTClass, tAnonymous, mAnonymous, ccMatch };
	}

	public static final Object[] pattern_AnonymousClass_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnonymousClass_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnonymousClass";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClass_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_27_1_matchtggpattern_blackBBBBB(ClassInstanceCreation mCreation,
			AbstractTypeDeclaration mType, AnonymousClassDeclaration mAnonymous,
			org.eclipse.modisco.java.Package mPackage, MDefinition mMebmber) {
		if (mPackage.getOwnedElements().contains(mType)) {
			if (mMebmber.getMMethodInvocations().contains(mCreation)) {
				if (mType.getBodyDeclarations().contains(mMebmber)) {
					if (mAnonymous.equals(mCreation.getAnonymousClassDeclaration())) {
						return new Object[] { mCreation, mType, mAnonymous, mPackage, mMebmber };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_28_1_matchtggpattern_black_nac_0BBB(TClass tAnonymous,
			TPackage tPackage, TPackage tNewPackage) {
		if (!tNewPackage.equals(tPackage)) {
			for (TPackage __DEC_tAnonymous_classes_38719 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAnonymous, TPackage.class, "classes")) {
				if (!tPackage.equals(__DEC_tAnonymous_classes_38719)) {
					if (!tNewPackage.equals(__DEC_tAnonymous_classes_38719)) {
						return new Object[] { tAnonymous, tPackage, tNewPackage };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_28_1_matchtggpattern_black_nac_1BB(TClass tAnonymous,
			TypeGraph pg) {
		for (TypeGraph __DEC_tAnonymous_classes_300225 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnonymous, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tAnonymous_classes_300225)) {
				return new Object[] { tAnonymous, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_28_1_matchtggpattern_black_nac_2BBB(TClass tAnonymous,
			TPackage tPackage, TPackage tNewPackage) {
		if (!tNewPackage.equals(tPackage)) {
			TPackage __DEC_tAnonymous_ownedTypes_737985 = tAnonymous.getPackage();
			if (__DEC_tAnonymous_ownedTypes_737985 != null) {
				if (!tPackage.equals(__DEC_tAnonymous_ownedTypes_737985)) {
					if (!tNewPackage.equals(__DEC_tAnonymous_ownedTypes_737985)) {
						return new Object[] { tAnonymous, tPackage, tNewPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_28_1_matchtggpattern_black_nac_3BB(TClass tAnonymous,
			TAbstractType tType) {
		if (!tAnonymous.equals(tType)) {
			TAbstractType __DEC_tAnonymous_innerTypes_459314 = tAnonymous.getOuterType();
			if (__DEC_tAnonymous_innerTypes_459314 != null) {
				if (!tAnonymous.equals(__DEC_tAnonymous_innerTypes_459314)) {
					if (!tType.equals(__DEC_tAnonymous_innerTypes_459314)) {
						return new Object[] { tAnonymous, tType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_28_1_matchtggpattern_black_nac_4BB(TPackage tNewPackage,
			TypeGraph pg) {
		TypeGraph __DEC_tNewPackage_typeGraph_342179 = tNewPackage.getTypeGraph();
		if (__DEC_tNewPackage_typeGraph_342179 != null) {
			if (!pg.equals(__DEC_tNewPackage_typeGraph_342179)) {
				return new Object[] { tNewPackage, pg };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnonymousClass_28_1_matchtggpattern_black_nac_5BB(TPackage tNewPackage,
			TPackage tPackage) {
		if (!tNewPackage.equals(tPackage)) {
			TPackage __DEC_tNewPackage_subpackage_881203 = tNewPackage.getParent();
			if (__DEC_tNewPackage_subpackage_881203 != null) {
				if (!tNewPackage.equals(__DEC_tNewPackage_subpackage_881203)) {
					if (!tPackage.equals(__DEC_tNewPackage_subpackage_881203)) {
						return new Object[] { tNewPackage, tPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_28_1_matchtggpattern_black_nac_6BB(TPackage tNewPackage,
			TypeGraph pg) {
		TypeGraph __DEC_tNewPackage_packages_990774 = tNewPackage.getPg();
		if (__DEC_tNewPackage_packages_990774 != null) {
			if (!pg.equals(__DEC_tNewPackage_packages_990774)) {
				return new Object[] { tNewPackage, pg };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnonymousClass_28_1_matchtggpattern_black_nac_7BB(TPackage tPackage,
			TClass tAnonymous) {
		if (tPackage.getClasses().contains(tAnonymous)) {
			return new Object[] { tPackage, tAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_28_1_matchtggpattern_black_nac_8BB(TPackage tNewPackage,
			TClass tAnonymous) {
		if (tNewPackage.getClasses().contains(tAnonymous)) {
			return new Object[] { tNewPackage, tAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_28_1_matchtggpattern_black_nac_9BB(TPackage tPackage,
			TClass tAnonymous) {
		if (tPackage.getOwnedTypes().contains(tAnonymous)) {
			return new Object[] { tPackage, tAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_28_1_matchtggpattern_black_nac_10BB(TPackage tNewPackage,
			TypeGraph pg) {
		if (pg.equals(tNewPackage.getTypeGraph())) {
			return new Object[] { tNewPackage, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_28_1_matchtggpattern_black_nac_11BB(TypeGraph pg,
			TPackage tNewPackage) {
		if (pg.getPackages().contains(tNewPackage)) {
			return new Object[] { pg, tNewPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_28_1_matchtggpattern_blackBBBBB(TClass tAnonymous,
			TPackage tPackage, TPackage tNewPackage, TAbstractType tType, TypeGraph pg) {
		if (!tAnonymous.equals(tType)) {
			if (!tNewPackage.equals(tPackage)) {
				if (tType.getInnerTypes().contains(tAnonymous)) {
					if (pg.equals(tType.getPg())) {
						if (tNewPackage.getOwnedTypes().contains(tAnonymous)) {
							if (tPackage.equals(tType.getPackage())) {
								if (pg.getOwnedTypes().contains(tAnonymous)) {
									if (tPackage.equals(tNewPackage.getParent())) {
										if (pg.getClasses().contains(tAnonymous)) {
											if (pattern_AnonymousClass_28_1_matchtggpattern_black_nac_0BBB(tAnonymous,
													tPackage, tNewPackage) == null) {
												if (pattern_AnonymousClass_28_1_matchtggpattern_black_nac_1BB(
														tAnonymous, pg) == null) {
													if (pattern_AnonymousClass_28_1_matchtggpattern_black_nac_2BBB(
															tAnonymous, tPackage, tNewPackage) == null) {
														if (pattern_AnonymousClass_28_1_matchtggpattern_black_nac_3BB(
																tAnonymous, tType) == null) {
															if (pattern_AnonymousClass_28_1_matchtggpattern_black_nac_4BB(
																	tNewPackage, pg) == null) {
																if (pattern_AnonymousClass_28_1_matchtggpattern_black_nac_5BB(
																		tNewPackage, tPackage) == null) {
																	if (pattern_AnonymousClass_28_1_matchtggpattern_black_nac_6BB(
																			tNewPackage, pg) == null) {
																		if (pattern_AnonymousClass_28_1_matchtggpattern_black_nac_7BB(
																				tPackage, tAnonymous) == null) {
																			if (pattern_AnonymousClass_28_1_matchtggpattern_black_nac_8BB(
																					tNewPackage, tAnonymous) == null) {
																				if (pattern_AnonymousClass_28_1_matchtggpattern_black_nac_9BB(
																						tPackage, tAnonymous) == null) {
																					if (pattern_AnonymousClass_28_1_matchtggpattern_black_nac_10BB(
																							tNewPackage, pg) == null) {
																						if (pattern_AnonymousClass_28_1_matchtggpattern_black_nac_11BB(
																								pg,
																								tNewPackage) == null) {
																							return new Object[] {
																									tAnonymous,
																									tPackage,
																									tNewPackage, tType,
																									pg };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_28_1_matchtggpattern_greenB(TClass tAnonymous) {
		String tAnonymous_tName_prime = "Anonymous";
		boolean tAnonymous_tLib_prime = Boolean.valueOf(false);
		tAnonymous.setTName(tAnonymous_tName_prime);
		tAnonymous.setTLib(Boolean.valueOf(tAnonymous_tLib_prime));
		return new Object[] { tAnonymous };
	}

	public static final boolean pattern_AnonymousClass_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_29_1_createresult_blackB(AnonymousClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousClass_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnonymousClass_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mMebmber) {
		if (ruleResult.getSourceObjects().contains(mMebmber)) {
			return new Object[] { ruleResult, mMebmber };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ClassInstanceCreation mCreation) {
		if (ruleResult.getSourceObjects().contains(mCreation)) {
			return new Object[] { ruleResult, mCreation };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package mPackage) {
		if (ruleResult.getSourceObjects().contains(mPackage)) {
			return new Object[] { ruleResult, mPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, PackageToTPackage mPackageToTPackage) {
		if (ruleResult.getCorrObjects().contains(mPackageToTPackage)) {
			return new Object[] { ruleResult, mPackageToTPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, TPackage tPackage) {
		if (ruleResult.getTargetObjects().contains(tPackage)) {
			return new Object[] { ruleResult, tPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_29_2_isapplicablecore_blackFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
				if (tmpMTypeToTType instanceof TypeToTAbstractType) {
					TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
					Type tmpMType = mTypeToTType.getSource();
					if (tmpMType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
						TAbstractType tType = mTypeToTType.getTarget();
						if (tType != null) {
							org.eclipse.modisco.java.Package mPackage = mType.getPackage();
							if (mPackage != null) {
								TPackage tPackage = tType.getPackage();
								if (tPackage != null) {
									TypeGraph pg = tType.getPg();
									if (pg != null) {
										if (pattern_AnonymousClass_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												mTypeToTType) == null) {
											if (pattern_AnonymousClass_29_2_isapplicablecore_black_nac_1BB(ruleResult,
													mType) == null) {
												if (pattern_AnonymousClass_29_2_isapplicablecore_black_nac_7BB(
														ruleResult, tType) == null) {
													if (pattern_AnonymousClass_29_2_isapplicablecore_black_nac_4BB(
															ruleResult, mPackage) == null) {
														if (pattern_AnonymousClass_29_2_isapplicablecore_black_nac_6BB(
																ruleResult, tPackage) == null) {
															if (pattern_AnonymousClass_29_2_isapplicablecore_black_nac_8BB(
																	ruleResult, pg) == null) {
																for (BodyDeclaration tmpMMebmber : mType
																		.getBodyDeclarations()) {
																	if (tmpMMebmber instanceof MDefinition) {
																		MDefinition mMebmber = (MDefinition) tmpMMebmber;
																		if (pattern_AnonymousClass_29_2_isapplicablecore_black_nac_2BB(
																				ruleResult, mMebmber) == null) {
																			for (AbstractMethodInvocation tmpMCreation : mMebmber
																					.getMMethodInvocations()) {
																				if (tmpMCreation instanceof ClassInstanceCreation) {
																					ClassInstanceCreation mCreation = (ClassInstanceCreation) tmpMCreation;
																					if (pattern_AnonymousClass_29_2_isapplicablecore_black_nac_3BB(
																							ruleResult,
																							mCreation) == null) {
																						for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										mPackage,
																										PackageToTPackage.class,
																										"source")) {
																							if (tPackage.equals(
																									mPackageToTPackage
																											.getTarget())) {
																								if (pattern_AnonymousClass_29_2_isapplicablecore_black_nac_5BB(
																										ruleResult,
																										mPackageToTPackage) == null) {
																									_result.add(
																											new Object[] {
																													mTypeToTTypeList,
																													mTypeToTType,
																													mType,
																													mMebmber,
																													mCreation,
																													mPackage,
																													mPackageToTPackage,
																													tPackage,
																													tType,
																													pg,
																													ruleEntryContainer,
																													ruleResult });
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}

								}

							}

						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_29_3_solveCSP_bindingFBBBBBBBBBBBB(AnonymousClass _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, ClassInstanceCreation mCreation,
			TPackage tPackage, AbstractTypeDeclaration mType, PackageToTPackage mPackageToTPackage,
			org.eclipse.modisco.java.Package mPackage, TAbstractType tType, MDefinition mMebmber, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mTypeToTType, mCreation, tPackage,
				mType, mPackageToTPackage, mPackage, tType, mMebmber, pg, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mCreation, tPackage, mType,
					mPackageToTPackage, mPackage, tType, mMebmber, pg, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(AnonymousClass _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, ClassInstanceCreation mCreation,
			TPackage tPackage, AbstractTypeDeclaration mType, PackageToTPackage mPackageToTPackage,
			org.eclipse.modisco.java.Package mPackage, TAbstractType tType, MDefinition mMebmber, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnonymousClass_29_3_solveCSP_binding = pattern_AnonymousClass_29_3_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, mCreation, tPackage, mType, mPackageToTPackage, mPackage, tType,
				mMebmber, pg, ruleResult);
		if (result_pattern_AnonymousClass_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClass_29_3_solveCSP_black = pattern_AnonymousClass_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mCreation, tPackage, mType,
						mPackageToTPackage, mPackage, tType, mMebmber, pg, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass_29_4_checkCSP_expressionFBB(AnonymousClass _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_29_5_checknacs_blackBBBBBBBBB(TypeToTAbstractType mTypeToTType,
			ClassInstanceCreation mCreation, TPackage tPackage, AbstractTypeDeclaration mType,
			PackageToTPackage mPackageToTPackage, org.eclipse.modisco.java.Package mPackage, TAbstractType tType,
			MDefinition mMebmber, TypeGraph pg) {
		return new Object[] { mTypeToTType, mCreation, tPackage, mType, mPackageToTPackage, mPackage, tType, mMebmber,
				pg };
	}

	public static final Object[] pattern_AnonymousClass_29_6_perform_blackBBBBBBBBBB(TypeToTAbstractType mTypeToTType,
			ClassInstanceCreation mCreation, TPackage tPackage, AbstractTypeDeclaration mType,
			PackageToTPackage mPackageToTPackage, org.eclipse.modisco.java.Package mPackage, TAbstractType tType,
			MDefinition mMebmber, TypeGraph pg, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mTypeToTType, mCreation, tPackage, mType, mPackageToTPackage, mPackage, tType, mMebmber,
				pg, ruleResult };
	}

	public static final Object[] pattern_AnonymousClass_29_6_perform_greenFFBBFFBBBB(ClassInstanceCreation mCreation,
			TPackage tPackage, TAbstractType tType, TypeGraph pg, ModelgeneratorRuleResult ruleResult, CSP csp) {
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = ModiscoFactory.eINSTANCE
				.createAnonymousClassDeclarationToTClass();
		TClass tAnonymous = BasicFactory.eINSTANCE.createTClass();
		TPackage tNewPackage = BasicFactory.eINSTANCE.createTPackage();
		AnonymousClassDeclaration mAnonymous = JavaFactory.eINSTANCE.createAnonymousClassDeclaration();
		String tAnonymous_tName_prime = "Anonymous";
		boolean tAnonymous_tLib_prime = Boolean.valueOf(false);
		Object _localVariable_0 = csp.getValue("tNewPackage", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass.setTarget(tAnonymous);
		tType.getInnerTypes().add(tAnonymous);
		pg.getOwnedTypes().add(tAnonymous);
		pg.getClasses().add(tAnonymous);
		ruleResult.getTargetObjects().add(tAnonymous);
		tNewPackage.getOwnedTypes().add(tAnonymous);
		tNewPackage.setParent(tPackage);
		ruleResult.getTargetObjects().add(tNewPackage);
		eAnonymousClassDeclarationToTClass.setSource(mAnonymous);
		mCreation.setAnonymousClassDeclaration(mAnonymous);
		ruleResult.getSourceObjects().add(mAnonymous);
		tAnonymous.setTName(tAnonymous_tName_prime);
		tAnonymous.setTLib(Boolean.valueOf(tAnonymous_tLib_prime));
		String tNewPackage_tName_prime = (String) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		tNewPackage.setTName(tNewPackage_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eAnonymousClassDeclarationToTClass, tAnonymous, mCreation, tPackage, tNewPackage,
				mAnonymous, tType, pg, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnonymousClass_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnonymousClassImpl
