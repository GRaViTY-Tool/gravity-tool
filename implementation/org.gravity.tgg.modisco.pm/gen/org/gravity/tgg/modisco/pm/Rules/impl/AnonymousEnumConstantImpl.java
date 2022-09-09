/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MEnumConstantDeclaration;

import org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.AnonymousEnumConstant;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
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
import org.gravity.tgg.modisco.pm.csp.constraints.*;
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
 * An implementation of the model object '<em><b>Anonymous Enum Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnonymousEnumConstantImpl extends AbstractRuleImpl implements AnonymousEnumConstant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousEnumConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnonymousEnumConstant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AnonymousClassDeclaration mAnonymous,
			MEnumConstantDeclaration mMember) {

		Object[] result1_black = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_0_1_initialbindings_blackBBBB(this, match, mAnonymous, mMember);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mMember] = " + mMember + ".");
		}

		Object[] result2_bindingAndBlack = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mAnonymous, mMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mMember] = " + mMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnonymousEnumConstantImpl
					.pattern_AnonymousEnumConstant_0_4_collectelementstobetranslated_blackBBB(match, mAnonymous,
							mMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAnonymous] = " + mAnonymous + ", " + "[mMember] = " + mMember + ".");
			}
			AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_0_4_collectelementstobetranslated_greenBBBF(match,
					mAnonymous, mMember);
			//nothing EMoflonEdge mMember__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnonymousEnumConstantImpl
					.pattern_AnonymousEnumConstant_0_5_collectcontextelements_blackBBB(match, mAnonymous, mMember);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAnonymous] = " + mAnonymous + ", " + "[mMember] = " + mMember + ".");
			}
			AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_0_5_collectcontextelements_greenBB(match, mMember);

			// 
			AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_0_6_registerobjectstomatch_expressionBBBB(this,
					match, mAnonymous, mMember);
			return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_0_7_expressionF();
		} else {
			return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TPackage tPackage = (TPackage) result1_bindingAndBlack[0];
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[1];
		TMember tMember = (TMember) result1_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[3];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[4];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result1_bindingAndBlack[5];
		MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_1_1_performtransformation_greenFBFBBBB(tPackage, pg, tType, mAnonymous,
						csp);
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result1_green[0];
		TClass tAnonymous = (TClass) result1_green[2];

		Object[] result2_black = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_1_2_collecttranslatedelements_blackBBB(
						eAnonymousClassDeclarationToTClass, tAnonymous, mAnonymous);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: "
					+ "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
					+ "[tAnonymous] = " + tAnonymous + ", " + "[mAnonymous] = " + mAnonymous + ".");
		}
		Object[] result2_green = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_1_2_collecttranslatedelements_greenFBBB(
						eAnonymousClassDeclarationToTClass, tAnonymous, mAnonymous);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						eAnonymousClassDeclarationToTClass, tPackage, tAnonymous, mMemberToTMember, tMember, pg, tType,
						mAnonymous, mMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
					+ "[tPackage] = " + tPackage + ", " + "[tAnonymous] = " + tAnonymous + ", "
					+ "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tMember] = " + tMember + ", " + "[pg] = "
					+ pg + ", " + "[tType] = " + tType + ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mMember] = "
					+ mMember + ".");
		}
		AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(
				ruleresult, eAnonymousClassDeclarationToTClass, tPackage, tAnonymous, pg, tType, mAnonymous, mMember);
		//nothing EMoflonEdge tPackage__tAnonymous____ownedTypes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnonymous__tPackage____package = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tPackage__tAnonymous____classes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tAnonymous____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge pg__tAnonymous____classes = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tType__tAnonymous____innerTypes = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tAnonymous__tType____outerType = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mMember__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge pg__tAnonymous____ownedTypes = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tAnonymous__pg____model = (EMoflonEdge) result3_green[18];

		// 
		// 
		AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, eAnonymousClassDeclarationToTClass, tPackage, tAnonymous, mMemberToTMember, tMember, pg,
				tType, mAnonymous, mMember);
		return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_binding[0];
		MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) result2_binding[1];
		for (Object[] result2_black : AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_2_2_corematch_blackFFBBB(mAnonymous, mMember, match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[0];
			TMember tMember = (TMember) result2_black[1];
			// ForEach 
			for (Object[] result3_black : AnonymousEnumConstantImpl
					.pattern_AnonymousEnumConstant_2_3_findcontext_blackFBBFFBB(mMemberToTMember, tMember, mAnonymous,
							mMember)) {
				TPackage tPackage = (TPackage) result3_black[0];
				TypeGraph pg = (TypeGraph) result3_black[3];
				TAbstractType tType = (TAbstractType) result3_black[4];
				Object[] result3_green = AnonymousEnumConstantImpl
						.pattern_AnonymousEnumConstant_2_3_findcontext_greenBBBBBBBFFFFFFFFF(tPackage, mMemberToTMember,
								tMember, pg, tType, mAnonymous, mMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mMember__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tType__tMember____defines = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tMember__tType____definedBy = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tPackage__pg____model = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = AnonymousEnumConstantImpl
						.pattern_AnonymousEnumConstant_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								tPackage, mMemberToTMember, tMember, pg, tType, mAnonymous, mMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tPackage] = " + tPackage + ", "
							+ "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tMember] = " + tMember + ", "
							+ "[pg] = " + pg + ", " + "[tType] = " + tType + ", " + "[mAnonymous] = " + mAnonymous
							+ ", " + "[mMember] = " + mMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnonymousEnumConstantImpl
							.pattern_AnonymousEnumConstant_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AnonymousClassDeclaration mAnonymous,
			MEnumConstantDeclaration mMember) {
		match.registerObject("mAnonymous", mAnonymous);
		match.registerObject("mMember", mMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AnonymousClassDeclaration mAnonymous,
			MEnumConstantDeclaration mMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TPackage tPackage,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg, TAbstractType tType,
			AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$Anonymous");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");

		// Create unbound variables
		Variable var_tAnonymous_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tLib", csp);
		var_tAnonymous_tLib.setType("Boolean");
		Variable var_tAnonymous_tName = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tName", csp);
		var_tAnonymous_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(addSuffix);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tType_tLib, var_tAnonymous_tLib);
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tType_tName, literal0, var_tAnonymous_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mAnonymous", mAnonymous);
		isApplicableMatch.registerObject("mMember", mMember);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eAnonymousClassDeclarationToTClass,
			EObject tPackage, EObject tAnonymous, EObject mMemberToTMember, EObject tMember, EObject pg, EObject tType,
			EObject mAnonymous, EObject mMember) {
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("tAnonymous", tAnonymous);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mAnonymous", mAnonymous);
		ruleresult.registerObject("mMember", mMember);

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
	public boolean isAppropriate_BWD(Match match, TPackage tPackage, TClass tAnonymous, TMember tMember, TypeGraph pg,
			TAbstractType tType) {

		Object[] result1_black = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_10_1_initialbindings_blackBBBBBBB(this, match, tPackage, tAnonymous,
						tMember, pg, tType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPackage] = " + tPackage + ", " + "[tAnonymous] = " + tAnonymous
					+ ", " + "[tMember] = " + tMember + ", " + "[pg] = " + pg + ", " + "[tType] = " + tType + ".");
		}

		Object[] result2_bindingAndBlack = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, tPackage, tAnonymous,
						tMember, pg, tType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPackage] = " + tPackage + ", " + "[tAnonymous] = " + tAnonymous
					+ ", " + "[tMember] = " + tMember + ", " + "[pg] = " + pg + ", " + "[tType] = " + tType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnonymousEnumConstantImpl
					.pattern_AnonymousEnumConstant_10_4_collectelementstobetranslated_blackBBBBBB(match, tPackage,
							tAnonymous, tMember, pg, tType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPackage] = " + tPackage + ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tMember] = "
						+ tMember + ", " + "[pg] = " + pg + ", " + "[tType] = " + tType + ".");
			}
			AnonymousEnumConstantImpl
					.pattern_AnonymousEnumConstant_10_4_collectelementstobetranslated_greenBBBBBFFFFFFFF(match,
							tPackage, tAnonymous, pg, tType);
			//nothing EMoflonEdge tPackage__tAnonymous____ownedTypes = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tAnonymous__tPackage____package = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tPackage__tAnonymous____classes = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge pg__tAnonymous____classes = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tType__tAnonymous____innerTypes = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tAnonymous__tType____outerType = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge pg__tAnonymous____ownedTypes = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge tAnonymous__pg____model = (EMoflonEdge) result4_green[12];

			Object[] result5_black = AnonymousEnumConstantImpl
					.pattern_AnonymousEnumConstant_10_5_collectcontextelements_blackBBBBBB(match, tPackage, tAnonymous,
							tMember, pg, tType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPackage] = " + tPackage + ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tMember] = "
						+ tMember + ", " + "[pg] = " + pg + ", " + "[tType] = " + tType + ".");
			}
			AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_10_5_collectcontextelements_greenBBBBBFFFFF(match,
					tPackage, tMember, pg, tType);
			//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge tType__tMember____defines = (EMoflonEdge) result5_green[7];
			//nothing EMoflonEdge tMember__tType____definedBy = (EMoflonEdge) result5_green[8];
			//nothing EMoflonEdge tPackage__pg____model = (EMoflonEdge) result5_green[9];

			// 
			AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_10_6_registerobjectstomatch_expressionBBBBBBB(this,
					match, tPackage, tAnonymous, tMember, pg, tType);
			return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_10_7_expressionF();
		} else {
			return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TPackage tPackage = (TPackage) result1_bindingAndBlack[0];
		TClass tAnonymous = (TClass) result1_bindingAndBlack[1];
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[2];
		TMember tMember = (TMember) result1_bindingAndBlack[3];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[4];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[5];
		MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_11_1_performtransformation_greenFBFB(tAnonymous, mMember);
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result1_green[0];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result1_green[2];

		Object[] result2_black = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_11_2_collecttranslatedelements_blackBBB(
						eAnonymousClassDeclarationToTClass, tAnonymous, mAnonymous);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: "
					+ "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
					+ "[tAnonymous] = " + tAnonymous + ", " + "[mAnonymous] = " + mAnonymous + ".");
		}
		Object[] result2_green = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_11_2_collecttranslatedelements_greenFBBB(
						eAnonymousClassDeclarationToTClass, tAnonymous, mAnonymous);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						eAnonymousClassDeclarationToTClass, tPackage, tAnonymous, mMemberToTMember, tMember, pg, tType,
						mAnonymous, mMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
					+ "[tPackage] = " + tPackage + ", " + "[tAnonymous] = " + tAnonymous + ", "
					+ "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tMember] = " + tMember + ", " + "[pg] = "
					+ pg + ", " + "[tType] = " + tType + ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mMember] = "
					+ mMember + ".");
		}
		AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(
				ruleresult, eAnonymousClassDeclarationToTClass, tPackage, tAnonymous, pg, tType, mAnonymous, mMember);
		//nothing EMoflonEdge tPackage__tAnonymous____ownedTypes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnonymous__tPackage____package = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tPackage__tAnonymous____classes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tAnonymous____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge pg__tAnonymous____classes = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tType__tAnonymous____innerTypes = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tAnonymous__tType____outerType = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mMember__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge pg__tAnonymous____ownedTypes = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tAnonymous__pg____model = (EMoflonEdge) result3_green[18];

		// 
		// 
		AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, eAnonymousClassDeclarationToTClass, tPackage, tAnonymous, mMemberToTMember, tMember, pg,
				tType, mAnonymous, mMember);
		return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TPackage tPackage = (TPackage) result2_binding[0];
		TClass tAnonymous = (TClass) result2_binding[1];
		TMember tMember = (TMember) result2_binding[2];
		TypeGraph pg = (TypeGraph) result2_binding[3];
		TAbstractType tType = (TAbstractType) result2_binding[4];
		for (Object[] result2_black : AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_12_2_corematch_blackBBFBBBFB(tPackage, tAnonymous, tMember, pg, tType,
						match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[2];
			MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) result2_black[6];
			// ForEach 
			for (Object[] result3_black : AnonymousEnumConstantImpl
					.pattern_AnonymousEnumConstant_12_3_findcontext_blackBBBBBBB(tPackage, tAnonymous, mMemberToTMember,
							tMember, pg, tType, mMember)) {
				Object[] result3_green = AnonymousEnumConstantImpl
						.pattern_AnonymousEnumConstant_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFFF(tPackage,
								tAnonymous, mMemberToTMember, tMember, pg, tType, mMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tPackage__tAnonymous____ownedTypes = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tAnonymous__tPackage____package = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tPackage__tAnonymous____classes = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge pg__tAnonymous____classes = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tType__tAnonymous____innerTypes = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tAnonymous__tType____outerType = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge pg__tAnonymous____ownedTypes = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tAnonymous__pg____model = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tType__tMember____defines = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tMember__tType____definedBy = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge tPackage__pg____model = (EMoflonEdge) result3_green[22];

				Object[] result4_bindingAndBlack = AnonymousEnumConstantImpl
						.pattern_AnonymousEnumConstant_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								tPackage, tAnonymous, mMemberToTMember, tMember, pg, tType, mMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tPackage] = " + tPackage + ", "
							+ "[tAnonymous] = " + tAnonymous + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
							+ "[tMember] = " + tMember + ", " + "[pg] = " + pg + ", " + "[tType] = " + tType + ", "
							+ "[mMember] = " + mMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnonymousEnumConstantImpl
							.pattern_AnonymousEnumConstant_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TPackage tPackage, TClass tAnonymous, TMember tMember,
			TypeGraph pg, TAbstractType tType) {
		match.registerObject("tPackage", tPackage);
		match.registerObject("tAnonymous", tAnonymous);
		match.registerObject("tMember", tMember);
		match.registerObject("pg", pg);
		match.registerObject("tType", tType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TPackage tPackage, TClass tAnonymous, TMember tMember,
			TypeGraph pg, TAbstractType tType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$Anonymous");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");
		Variable var_tAnonymous_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tLib", true, csp);
		var_tAnonymous_tLib.setValue(tAnonymous.isTLib());
		var_tAnonymous_tLib.setType("Boolean");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");
		Variable var_tAnonymous_tName = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tName", true, csp);
		var_tAnonymous_tName.setValue(tAnonymous.getTName());
		var_tAnonymous_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(addSuffix);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tType_tLib, var_tAnonymous_tLib);
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tType_tName, literal0, var_tAnonymous_tName);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TPackage tPackage, TClass tAnonymous,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg, TAbstractType tType,
			MEnumConstantDeclaration mMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("tAnonymous", tAnonymous);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mMember", mMember);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject eAnonymousClassDeclarationToTClass,
			EObject tPackage, EObject tAnonymous, EObject mMemberToTMember, EObject tMember, EObject pg, EObject tType,
			EObject mAnonymous, EObject mMember) {
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("tAnonymous", tAnonymous);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mAnonymous", mAnonymous);
		ruleresult.registerObject("mMember", mMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tAnonymous").eClass())
				.equals("basic.TClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_52(EMoflonEdge _edge_ownedTypes) {

		Object[] result1_bindingAndBlack = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_20_2_testcorematchandDECs_blackFFFFFB(_edge_ownedTypes)) {
			TPackage tPackage = (TPackage) result2_black[0];
			TClass tAnonymous = (TClass) result2_black[1];
			TMember tMember = (TMember) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];
			TAbstractType tType = (TAbstractType) result2_black[4];
			Object[] result2_green = AnonymousEnumConstantImpl
					.pattern_AnonymousEnumConstant_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousEnumConstantImpl
					.pattern_AnonymousEnumConstant_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, tPackage, tAnonymous, tMember, pg, tType)) {
				// 
				if (AnonymousEnumConstantImpl
						.pattern_AnonymousEnumConstant_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnonymousEnumConstantImpl
							.pattern_AnonymousEnumConstant_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_54(EMoflonEdge _edge_anonymousClassDeclaration) {

		Object[] result1_bindingAndBlack = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_21_2_testcorematchandDECs_blackFFB(_edge_anonymousClassDeclaration)) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[0];
			MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) result2_black[1];
			Object[] result2_green = AnonymousEnumConstantImpl
					.pattern_AnonymousEnumConstant_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousEnumConstantImpl
					.pattern_AnonymousEnumConstant_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mAnonymous, mMember)) {
				// 
				if (AnonymousEnumConstantImpl
						.pattern_AnonymousEnumConstant_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnonymousEnumConstantImpl
							.pattern_AnonymousEnumConstant_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnonymousEnumConstant");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tAnonymous_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous", true, csp);
		var_tAnonymous_tLib.setValue(__helper.getValue("tAnonymous", "tLib"));
		var_tAnonymous_tLib.setType("boolean");

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_tAnonymous_tName = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous", true, csp);
		var_tAnonymous_tName.setValue(__helper.getValue("tAnonymous", "tName"));
		var_tAnonymous_tName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$Anonymous");
		var_literal0.setType("");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		AddSuffix addSuffix1 = new AddSuffix();
		csp.getConstraints().add(addSuffix1);

		eq0.setRuleName("AnonymousEnumConstant");
		eq0.solve(var_tType_tLib, var_tAnonymous_tLib);

		addSuffix1.setRuleName("AnonymousEnumConstant");
		addSuffix1.solve(var_tType_tName, var_literal0, var_tAnonymous_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tAnonymous_tLib.setBound(false);
			var_tAnonymous_tName.setBound(false);
			eq0.solve(var_tType_tLib, var_tAnonymous_tLib);
			addSuffix1.solve(var_tType_tName, var_literal0, var_tAnonymous_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tAnonymous", "tLib", var_tAnonymous_tLib.getValue());
				__helper.setValue("tAnonymous", "tName", var_tAnonymous_tName.getValue());
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
		ruleResult.setRule("AnonymousEnumConstant");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tAnonymous_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous", true, csp);
		var_tAnonymous_tLib.setValue(__helper.getValue("tAnonymous", "tLib"));
		var_tAnonymous_tLib.setType("boolean");

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_tAnonymous_tName = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous", true, csp);
		var_tAnonymous_tName.setValue(__helper.getValue("tAnonymous", "tName"));
		var_tAnonymous_tName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$Anonymous");
		var_literal0.setType("");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		AddSuffix addSuffix1 = new AddSuffix();
		csp.getConstraints().add(addSuffix1);

		eq0.setRuleName("AnonymousEnumConstant");
		eq0.solve(var_tType_tLib, var_tAnonymous_tLib);

		addSuffix1.setRuleName("AnonymousEnumConstant");
		addSuffix1.solve(var_tType_tName, var_literal0, var_tAnonymous_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			eq0.solve(var_tType_tLib, var_tAnonymous_tLib);
			addSuffix1.solve(var_tType_tName, var_literal0, var_tAnonymous_tName);
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

		Object[] result1_black = AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TPackage tPackage = (TPackage) result2_bindingAndBlack[0];
		TClass tAnonymous = (TClass) result2_bindingAndBlack[1];
		TMember tMember = (TMember) result2_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[3];
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[4];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_bindingAndBlack[5];
		MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, tPackage, tAnonymous,
						tMember, pg, tType, mAnonymous, mMember, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tPackage] = " + tPackage + ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tMember] = "
					+ tMember + ", " + "[pg] = " + pg + ", " + "[tType] = " + tType + ", " + "[mAnonymous] = "
					+ mAnonymous + ", " + "[mMember] = " + mMember + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnonymousEnumConstantImpl
					.pattern_AnonymousEnumConstant_24_5_matchcorrcontext_blackFBBBB(tMember, mMember, sourceMatch,
							targetMatch)) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result5_black[0];
				Object[] result5_green = AnonymousEnumConstantImpl
						.pattern_AnonymousEnumConstant_24_5_matchcorrcontext_greenBBBF(mMemberToTMember, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = AnonymousEnumConstantImpl
						.pattern_AnonymousEnumConstant_24_6_createcorrespondence_blackBBBBBBBB(tPackage, tAnonymous,
								tMember, pg, tType, mAnonymous, mMember, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tPackage] = " + tPackage
							+ ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tMember] = " + tMember + ", " + "[pg] = "
							+ pg + ", " + "[tType] = " + tType + ", " + "[mAnonymous] = " + mAnonymous + ", "
							+ "[mMember] = " + mMember + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_24_6_createcorrespondence_greenFBBB(tAnonymous,
						mAnonymous, ccMatch);
				//nothing AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result6_green[0];

				Object[] result7_black = AnonymousEnumConstantImpl
						.pattern_AnonymousEnumConstant_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TPackage tPackage, TClass tAnonymous, TMember tMember, TypeGraph pg,
			TAbstractType tType, AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$Anonymous");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");
		Variable var_tAnonymous_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tLib", true, csp);
		var_tAnonymous_tLib.setValue(tAnonymous.isTLib());
		var_tAnonymous_tLib.setType("Boolean");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");
		Variable var_tAnonymous_tName = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tName", true, csp);
		var_tAnonymous_tName.setValue(tAnonymous.getTName());
		var_tAnonymous_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(addSuffix);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tType_tLib, var_tAnonymous_tLib);
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tType_tName, literal0, var_tAnonymous_tName);
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
	public boolean checkDEC_FWD(AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember) {// 
		Object[] result1_black = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_27_1_matchtggpattern_blackBB(mAnonymous, mMember);
		if (result1_black != null) {
			return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_27_2_expressionF();
		} else {
			return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TPackage tPackage, TClass tAnonymous, TMember tMember, TypeGraph pg,
			TAbstractType tType) {// 
		Object[] result1_black = AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_28_1_matchtggpattern_blackBBBBB(tPackage, tAnonymous, tMember, pg,
						tType);
		if (result1_black != null) {
			return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_28_2_expressionF();
		} else {
			return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember mMemberToTMemberParameter) {

		Object[] result1_black = AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnonymousEnumConstantImpl
				.pattern_AnonymousEnumConstant_29_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mMemberToTMemberList = (RuleEntryList) result2_black[0];
			TPackage tPackage = (TPackage) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			TAbstractType tType = (TAbstractType) result2_black[3];
			TMember tMember = (TMember) result2_black[4];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[5];
			MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) result2_black[6];

			Object[] result3_bindingAndBlack = AnonymousEnumConstantImpl
					.pattern_AnonymousEnumConstant_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							tPackage, mMemberToTMember, tMember, pg, tType, mMember, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tPackage] = " + tPackage + ", "
						+ "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tMember] = " + tMember + ", "
						+ "[pg] = " + pg + ", " + "[tType] = " + tType + ", " + "[mMember] = " + mMember + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnonymousEnumConstantImpl
						.pattern_AnonymousEnumConstant_29_5_checknacs_blackBBBBBB(tPackage, mMemberToTMember, tMember,
								pg, tType, mMember);
				if (result5_black != null) {

					Object[] result6_black = AnonymousEnumConstantImpl
							.pattern_AnonymousEnumConstant_29_6_perform_blackBBBBBBB(tPackage, mMemberToTMember,
									tMember, pg, tType, mMember, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tPackage] = "
								+ tPackage + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tMember] = "
								+ tMember + ", " + "[pg] = " + pg + ", " + "[tType] = " + tType + ", " + "[mMember] = "
								+ mMember + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_29_6_perform_greenFBFBBFBBB(tPackage, pg,
							tType, mMember, ruleResult, csp);
					//nothing AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result6_green[0];
					//nothing TClass tAnonymous = (TClass) result6_green[2];
					//nothing AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return AnonymousEnumConstantImpl.pattern_AnonymousEnumConstant_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TPackage tPackage,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg, TAbstractType tType,
			MEnumConstantDeclaration mMember, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$Anonymous");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");

		// Create unbound variables
		Variable var_tAnonymous_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tLib", csp);
		var_tAnonymous_tLib.setType("Boolean");
		Variable var_tAnonymous_tName = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tName", csp);
		var_tAnonymous_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(addSuffix);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tType_tLib, var_tAnonymous_tLib);
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tType_tName, literal0, var_tAnonymous_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mMember", mMember);
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
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPROPRIATE_FWD__MATCH_ANONYMOUSCLASSDECLARATION_MENUMCONSTANTDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MEnumConstantDeclaration) arguments.get(2));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANONYMOUSCLASSDECLARATION_MENUMCONSTANTDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MEnumConstantDeclaration) arguments.get(2));
			return null;
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANONYMOUSCLASSDECLARATION_MENUMCONSTANTDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MEnumConstantDeclaration) arguments.get(2));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TPACKAGE_MDEFINITIONTOTMEMBER_TMEMBER_TYPEGRAPH_TABSTRACTTYPE_ANONYMOUSCLASSDECLARATION_MENUMCONSTANTDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TPackage) arguments.get(1),
					(MDefinitionToTMember) arguments.get(2), (TMember) arguments.get(3), (TypeGraph) arguments.get(4),
					(TAbstractType) arguments.get(5), (AnonymousClassDeclaration) arguments.get(6),
					(MEnumConstantDeclaration) arguments.get(7));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPROPRIATE_BWD__MATCH_TPACKAGE_TCLASS_TMEMBER_TYPEGRAPH_TABSTRACTTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TPackage) arguments.get(1), (TClass) arguments.get(2),
					(TMember) arguments.get(3), (TypeGraph) arguments.get(4), (TAbstractType) arguments.get(5));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPACKAGE_TCLASS_TMEMBER_TYPEGRAPH_TABSTRACTTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TPackage) arguments.get(1), (TClass) arguments.get(2),
					(TMember) arguments.get(3), (TypeGraph) arguments.get(4), (TAbstractType) arguments.get(5));
			return null;
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPACKAGE_TCLASS_TMEMBER_TYPEGRAPH_TABSTRACTTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TClass) arguments.get(2), (TMember) arguments.get(3), (TypeGraph) arguments.get(4),
					(TAbstractType) arguments.get(5));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TPACKAGE_TCLASS_MDEFINITIONTOTMEMBER_TMEMBER_TYPEGRAPH_TABSTRACTTYPE_MENUMCONSTANTDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TPackage) arguments.get(1),
					(TClass) arguments.get(2), (MDefinitionToTMember) arguments.get(3), (TMember) arguments.get(4),
					(TypeGraph) arguments.get(5), (TAbstractType) arguments.get(6),
					(MEnumConstantDeclaration) arguments.get(7));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_52__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_52((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_54__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_54((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPLICABLE_SOLVE_CSP_CC__TPACKAGE_TCLASS_TMEMBER_TYPEGRAPH_TABSTRACTTYPE_ANONYMOUSCLASSDECLARATION_MENUMCONSTANTDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TPackage) arguments.get(0), (TClass) arguments.get(1),
					(TMember) arguments.get(2), (TypeGraph) arguments.get(3), (TAbstractType) arguments.get(4),
					(AnonymousClassDeclaration) arguments.get(5), (MEnumConstantDeclaration) arguments.get(6),
					(Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___CHECK_DEC_FWD__ANONYMOUSCLASSDECLARATION_MENUMCONSTANTDECLARATION:
			return checkDEC_FWD((AnonymousClassDeclaration) arguments.get(0),
					(MEnumConstantDeclaration) arguments.get(1));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___CHECK_DEC_BWD__TPACKAGE_TCLASS_TMEMBER_TYPEGRAPH_TABSTRACTTYPE:
			return checkDEC_BWD((TPackage) arguments.get(0), (TClass) arguments.get(1), (TMember) arguments.get(2),
					(TypeGraph) arguments.get(3), (TAbstractType) arguments.get(4));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TPACKAGE_MDEFINITIONTOTMEMBER_TMEMBER_TYPEGRAPH_TABSTRACTTYPE_MENUMCONSTANTDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TPackage) arguments.get(1),
					(MDefinitionToTMember) arguments.get(2), (TMember) arguments.get(3), (TypeGraph) arguments.get(4),
					(TAbstractType) arguments.get(5), (MEnumConstantDeclaration) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.ANONYMOUS_ENUM_CONSTANT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnonymousEnumConstant_0_1_initialbindings_blackBBBB(
			AnonymousEnumConstant _this, Match match, AnonymousClassDeclaration mAnonymous,
			MEnumConstantDeclaration mMember) {
		return new Object[] { _this, match, mAnonymous, mMember };
	}

	public static final Object[] pattern_AnonymousEnumConstant_0_2_SolveCSP_bindingFBBBB(AnonymousEnumConstant _this,
			Match match, AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mAnonymous, mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mAnonymous, mMember };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousEnumConstant_0_2_SolveCSP_bindingAndBlackFBBBB(
			AnonymousEnumConstant _this, Match match, AnonymousClassDeclaration mAnonymous,
			MEnumConstantDeclaration mMember) {
		Object[] result_pattern_AnonymousEnumConstant_0_2_SolveCSP_binding = pattern_AnonymousEnumConstant_0_2_SolveCSP_bindingFBBBB(
				_this, match, mAnonymous, mMember);
		if (result_pattern_AnonymousEnumConstant_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousEnumConstant_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousEnumConstant_0_2_SolveCSP_black = pattern_AnonymousEnumConstant_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnonymousEnumConstant_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mAnonymous, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousEnumConstant_0_3_CheckCSP_expressionFBB(AnonymousEnumConstant _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_0_4_collectelementstobetranslated_blackBBB(Match match,
			AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember) {
		return new Object[] { match, mAnonymous, mMember };
	}

	public static final Object[] pattern_AnonymousEnumConstant_0_4_collectelementstobetranslated_greenBBBF(Match match,
			AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember) {
		EMoflonEdge mMember__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mAnonymous);
		String mMember__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		mMember__mAnonymous____anonymousClassDeclaration.setSrc(mMember);
		mMember__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		match.getToBeTranslatedEdges().add(mMember__mAnonymous____anonymousClassDeclaration);
		mMember__mAnonymous____anonymousClassDeclaration
				.setName(mMember__mAnonymous____anonymousClassDeclaration_name_prime);
		return new Object[] { match, mAnonymous, mMember, mMember__mAnonymous____anonymousClassDeclaration };
	}

	public static final Object[] pattern_AnonymousEnumConstant_0_5_collectcontextelements_blackBBB(Match match,
			AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember) {
		return new Object[] { match, mAnonymous, mMember };
	}

	public static final Object[] pattern_AnonymousEnumConstant_0_5_collectcontextelements_greenBB(Match match,
			MEnumConstantDeclaration mMember) {
		match.getContextNodes().add(mMember);
		return new Object[] { match, mMember };
	}

	public static final void pattern_AnonymousEnumConstant_0_6_registerobjectstomatch_expressionBBBB(
			AnonymousEnumConstant _this, Match match, AnonymousClassDeclaration mAnonymous,
			MEnumConstantDeclaration mMember) {
		_this.registerObjectsToMatch_FWD(match, mAnonymous, mMember);

	}

	public static final boolean pattern_AnonymousEnumConstant_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousEnumConstant_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("pg");
		EObject _localVariable_4 = isApplicableMatch.getObject("tType");
		EObject _localVariable_5 = isApplicableMatch.getObject("mAnonymous");
		EObject _localVariable_6 = isApplicableMatch.getObject("mMember");
		EObject tmpTPackage = _localVariable_0;
		EObject tmpMMemberToTMember = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpTType = _localVariable_4;
		EObject tmpMAnonymous = _localVariable_5;
		EObject tmpMMember = _localVariable_6;
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpTType instanceof TAbstractType) {
							TAbstractType tType = (TAbstractType) tmpTType;
							if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
								AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
								if (tmpMMember instanceof MEnumConstantDeclaration) {
									MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) tmpMMember;
									return new Object[] { tPackage, mMemberToTMember, tMember, pg, tType, mAnonymous,
											mMember, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_1_1_performtransformation_blackBBBBBBBFBB(
			TPackage tPackage, MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg,
			TAbstractType tType, AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember,
			AnonymousEnumConstant _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tPackage, mMemberToTMember, tMember, pg, tType, mAnonymous, mMember, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			AnonymousEnumConstant _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousEnumConstant_1_1_performtransformation_binding = pattern_AnonymousEnumConstant_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousEnumConstant_1_1_performtransformation_binding != null) {
			TPackage tPackage = (TPackage) result_pattern_AnonymousEnumConstant_1_1_performtransformation_binding[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_AnonymousEnumConstant_1_1_performtransformation_binding[1];
			TMember tMember = (TMember) result_pattern_AnonymousEnumConstant_1_1_performtransformation_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_AnonymousEnumConstant_1_1_performtransformation_binding[3];
			TAbstractType tType = (TAbstractType) result_pattern_AnonymousEnumConstant_1_1_performtransformation_binding[4];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_AnonymousEnumConstant_1_1_performtransformation_binding[5];
			MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) result_pattern_AnonymousEnumConstant_1_1_performtransformation_binding[6];

			Object[] result_pattern_AnonymousEnumConstant_1_1_performtransformation_black = pattern_AnonymousEnumConstant_1_1_performtransformation_blackBBBBBBBFBB(
					tPackage, mMemberToTMember, tMember, pg, tType, mAnonymous, mMember, _this, isApplicableMatch);
			if (result_pattern_AnonymousEnumConstant_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousEnumConstant_1_1_performtransformation_black[7];

				return new Object[] { tPackage, mMemberToTMember, tMember, pg, tType, mAnonymous, mMember, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_1_1_performtransformation_greenFBFBBBB(TPackage tPackage,
			TypeGraph pg, TAbstractType tType, AnonymousClassDeclaration mAnonymous, CSP csp) {
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE
				.createAnonymousClassDeclarationToTClass();
		TClass tAnonymous = BasicFactory.eINSTANCE.createTClass();
		Object _localVariable_0 = csp.getValue("tAnonymous", "tLib");
		Object _localVariable_1 = csp.getValue("tAnonymous", "tName");
		eAnonymousClassDeclarationToTClass.setSource(mAnonymous);
		tPackage.getOwnedTypes().add(tAnonymous);
		tPackage.getClasses().add(tAnonymous);
		eAnonymousClassDeclarationToTClass.setTarget(tAnonymous);
		pg.getClasses().add(tAnonymous);
		tType.getInnerTypes().add(tAnonymous);
		pg.getOwnedTypes().add(tAnonymous);
		boolean tAnonymous_tLib_prime = (boolean) _localVariable_0;
		String tAnonymous_tName_prime = (String) _localVariable_1;
		tAnonymous.setTLib(Boolean.valueOf(tAnonymous_tLib_prime));
		tAnonymous.setTName(tAnonymous_tName_prime);
		return new Object[] { eAnonymousClassDeclarationToTClass, tPackage, tAnonymous, pg, tType, mAnonymous, csp };
	}

	public static final Object[] pattern_AnonymousEnumConstant_1_2_collecttranslatedelements_blackBBB(
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TClass tAnonymous,
			AnonymousClassDeclaration mAnonymous) {
		return new Object[] { eAnonymousClassDeclarationToTClass, tAnonymous, mAnonymous };
	}

	public static final Object[] pattern_AnonymousEnumConstant_1_2_collecttranslatedelements_greenFBBB(
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TClass tAnonymous,
			AnonymousClassDeclaration mAnonymous) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(eAnonymousClassDeclarationToTClass);
		ruleresult.getCreatedElements().add(tAnonymous);
		ruleresult.getTranslatedElements().add(mAnonymous);
		return new Object[] { ruleresult, eAnonymousClassDeclarationToTClass, tAnonymous, mAnonymous };
	}

	public static final Object[] pattern_AnonymousEnumConstant_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eAnonymousClassDeclarationToTClass, EObject tPackage,
			EObject tAnonymous, EObject mMemberToTMember, EObject tMember, EObject pg, EObject tType,
			EObject mAnonymous, EObject mMember) {
		if (!eAnonymousClassDeclarationToTClass.equals(tPackage)) {
			if (!eAnonymousClassDeclarationToTClass.equals(tAnonymous)) {
				if (!eAnonymousClassDeclarationToTClass.equals(mMemberToTMember)) {
					if (!eAnonymousClassDeclarationToTClass.equals(tMember)) {
						if (!eAnonymousClassDeclarationToTClass.equals(pg)) {
							if (!eAnonymousClassDeclarationToTClass.equals(tType)) {
								if (!eAnonymousClassDeclarationToTClass.equals(mAnonymous)) {
									if (!eAnonymousClassDeclarationToTClass.equals(mMember)) {
										if (!tPackage.equals(tType)) {
											if (!tAnonymous.equals(tPackage)) {
												if (!tAnonymous.equals(tMember)) {
													if (!tAnonymous.equals(tType)) {
														if (!mMemberToTMember.equals(tPackage)) {
															if (!mMemberToTMember.equals(tAnonymous)) {
																if (!mMemberToTMember.equals(tMember)) {
																	if (!mMemberToTMember.equals(pg)) {
																		if (!mMemberToTMember.equals(tType)) {
																			if (!tMember.equals(tPackage)) {
																				if (!tMember.equals(tType)) {
																					if (!pg.equals(tPackage)) {
																						if (!pg.equals(tAnonymous)) {
																							if (!pg.equals(tMember)) {
																								if (!pg.equals(tType)) {
																									if (!mAnonymous
																											.equals(tPackage)) {
																										if (!mAnonymous
																												.equals(tAnonymous)) {
																											if (!mAnonymous
																													.equals(mMemberToTMember)) {
																												if (!mAnonymous
																														.equals(tMember)) {
																													if (!mAnonymous
																															.equals(pg)) {
																														if (!mAnonymous
																																.equals(tType)) {
																															if (!mAnonymous
																																	.equals(mMember)) {
																																if (!mMember
																																		.equals(tPackage)) {
																																	if (!mMember
																																			.equals(tAnonymous)) {
																																		if (!mMember
																																				.equals(mMemberToTMember)) {
																																			if (!mMember
																																					.equals(tMember)) {
																																				if (!mMember
																																						.equals(pg)) {
																																					if (!mMember
																																							.equals(tType)) {
																																						return new Object[] {
																																								ruleresult,
																																								eAnonymousClassDeclarationToTClass,
																																								tPackage,
																																								tAnonymous,
																																								mMemberToTMember,
																																								tMember,
																																								pg,
																																								tType,
																																								mAnonymous,
																																								mMember };
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

	public static final Object[] pattern_AnonymousEnumConstant_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eAnonymousClassDeclarationToTClass, EObject tPackage,
			EObject tAnonymous, EObject pg, EObject tType, EObject mAnonymous, EObject mMember) {
		EMoflonEdge tPackage__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__tAnonymous____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tAnonymous____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mMember__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousEnumConstant";
		String tPackage__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__tPackage____package_name_prime = "package";
		String tPackage__tAnonymous____classes_name_prime = "classes";
		String eAnonymousClassDeclarationToTClass__tAnonymous____target_name_prime = "target";
		String pg__tAnonymous____classes_name_prime = "classes";
		String tType__tAnonymous____innerTypes_name_prime = "innerTypes";
		String tAnonymous__tType____outerType_name_prime = "outerType";
		String eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime = "source";
		String mMember__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String pg__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__pg____model_name_prime = "model";
		tPackage__tAnonymous____ownedTypes.setSrc(tPackage);
		tPackage__tAnonymous____ownedTypes.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(tPackage__tAnonymous____ownedTypes);
		tAnonymous__tPackage____package.setSrc(tAnonymous);
		tAnonymous__tPackage____package.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(tAnonymous__tPackage____package);
		tPackage__tAnonymous____classes.setSrc(tPackage);
		tPackage__tAnonymous____classes.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(tPackage__tAnonymous____classes);
		eAnonymousClassDeclarationToTClass__tAnonymous____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tAnonymous____target.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__tAnonymous____target);
		pg__tAnonymous____classes.setSrc(pg);
		pg__tAnonymous____classes.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(pg__tAnonymous____classes);
		tType__tAnonymous____innerTypes.setSrc(tType);
		tType__tAnonymous____innerTypes.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(tType__tAnonymous____innerTypes);
		tAnonymous__tType____outerType.setSrc(tAnonymous);
		tAnonymous__tType____outerType.setTrg(tType);
		ruleresult.getCreatedEdges().add(tAnonymous__tType____outerType);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setTrg(mAnonymous);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__mAnonymous____source);
		mMember__mAnonymous____anonymousClassDeclaration.setSrc(mMember);
		mMember__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		ruleresult.getTranslatedEdges().add(mMember__mAnonymous____anonymousClassDeclaration);
		pg__tAnonymous____ownedTypes.setSrc(pg);
		pg__tAnonymous____ownedTypes.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(pg__tAnonymous____ownedTypes);
		tAnonymous__pg____model.setSrc(tAnonymous);
		tAnonymous__pg____model.setTrg(pg);
		ruleresult.getCreatedEdges().add(tAnonymous__pg____model);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tPackage__tAnonymous____ownedTypes.setName(tPackage__tAnonymous____ownedTypes_name_prime);
		tAnonymous__tPackage____package.setName(tAnonymous__tPackage____package_name_prime);
		tPackage__tAnonymous____classes.setName(tPackage__tAnonymous____classes_name_prime);
		eAnonymousClassDeclarationToTClass__tAnonymous____target
				.setName(eAnonymousClassDeclarationToTClass__tAnonymous____target_name_prime);
		pg__tAnonymous____classes.setName(pg__tAnonymous____classes_name_prime);
		tType__tAnonymous____innerTypes.setName(tType__tAnonymous____innerTypes_name_prime);
		tAnonymous__tType____outerType.setName(tAnonymous__tType____outerType_name_prime);
		eAnonymousClassDeclarationToTClass__mAnonymous____source
				.setName(eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime);
		mMember__mAnonymous____anonymousClassDeclaration
				.setName(mMember__mAnonymous____anonymousClassDeclaration_name_prime);
		pg__tAnonymous____ownedTypes.setName(pg__tAnonymous____ownedTypes_name_prime);
		tAnonymous__pg____model.setName(tAnonymous__pg____model_name_prime);
		return new Object[] { ruleresult, eAnonymousClassDeclarationToTClass, tPackage, tAnonymous, pg, tType,
				mAnonymous, mMember, tPackage__tAnonymous____ownedTypes, tAnonymous__tPackage____package,
				tPackage__tAnonymous____classes, eAnonymousClassDeclarationToTClass__tAnonymous____target,
				pg__tAnonymous____classes, tType__tAnonymous____innerTypes, tAnonymous__tType____outerType,
				eAnonymousClassDeclarationToTClass__mAnonymous____source,
				mMember__mAnonymous____anonymousClassDeclaration, pg__tAnonymous____ownedTypes,
				tAnonymous__pg____model };
	}

	public static final void pattern_AnonymousEnumConstant_1_5_registerobjects_expressionBBBBBBBBBBB(
			AnonymousEnumConstant _this, PerformRuleResult ruleresult, EObject eAnonymousClassDeclarationToTClass,
			EObject tPackage, EObject tAnonymous, EObject mMemberToTMember, EObject tMember, EObject pg, EObject tType,
			EObject mAnonymous, EObject mMember) {
		_this.registerObjects_FWD(ruleresult, eAnonymousClassDeclarationToTClass, tPackage, tAnonymous,
				mMemberToTMember, tMember, pg, tType, mAnonymous, mMember);

	}

	public static final PerformRuleResult pattern_AnonymousEnumConstant_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_2_1_preparereturnvalue_bindingFB(
			AnonymousEnumConstant _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousEnumConstant _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousEnumConstant _this) {
		Object[] result_pattern_AnonymousEnumConstant_2_1_preparereturnvalue_binding = pattern_AnonymousEnumConstant_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousEnumConstant_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousEnumConstant_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousEnumConstant_2_1_preparereturnvalue_black = pattern_AnonymousEnumConstant_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousEnumConstant_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousEnumConstant_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousEnumConstant";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousEnumConstant_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mAnonymous");
		EObject _localVariable_1 = match.getObject("mMember");
		EObject tmpMAnonymous = _localVariable_0;
		EObject tmpMMember = _localVariable_1;
		if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
			if (tmpMMember instanceof MEnumConstantDeclaration) {
				MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) tmpMMember;
				return new Object[] { mAnonymous, mMember, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousEnumConstant_2_2_corematch_blackFFBBB(
			AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
			TMember tMember = mMemberToTMember.getTarget();
			if (tMember != null) {
				_result.add(new Object[] { mMemberToTMember, tMember, mAnonymous, mMember, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousEnumConstant_2_3_findcontext_blackFBBFFBB(
			MDefinitionToTMember mMemberToTMember, TMember tMember, AnonymousClassDeclaration mAnonymous,
			MEnumConstantDeclaration mMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMember.equals(mMemberToTMember.getTarget())) {
			if (mAnonymous.equals(mMember.getAnonymousClassDeclaration())) {
				if (mMember.equals(mMemberToTMember.getSource())) {
					TAbstractType tType = tMember.getDefinedBy();
					if (tType != null) {
						TPackage tPackage = tType.getPackage();
						if (tPackage != null) {
							TypeGraph pg = tPackage.getModel();
							if (pg != null) {
								_result.add(new Object[] { tPackage, mMemberToTMember, tMember, pg, tType, mAnonymous,
										mMember });
							}

						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_2_3_findcontext_greenBBBBBBBFFFFFFFFF(TPackage tPackage,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg, TAbstractType tType,
			AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMemberToTMember__tMember____target_name_prime = "target";
		String tType__tPackage____package_name_prime = "package";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String mMember__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String tType__tMember____defines_name_prime = "defines";
		String tMember__tType____definedBy_name_prime = "definedBy";
		String tPackage__pg____model_name_prime = "model";
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mMember);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tType__tPackage____package);
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tPackage__tType____ownedTypes);
		mMember__mAnonymous____anonymousClassDeclaration.setSrc(mMember);
		mMember__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mMember__mAnonymous____anonymousClassDeclaration);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		tType__tMember____defines.setSrc(tType);
		tType__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tType__tMember____defines);
		tMember__tType____definedBy.setSrc(tMember);
		tMember__tType____definedBy.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tMember__tType____definedBy);
		tPackage__pg____model.setSrc(tPackage);
		tPackage__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tPackage__pg____model);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		mMember__mAnonymous____anonymousClassDeclaration
				.setName(mMember__mAnonymous____anonymousClassDeclaration_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		tType__tMember____defines.setName(tType__tMember____defines_name_prime);
		tMember__tType____definedBy.setName(tMember__tType____definedBy_name_prime);
		tPackage__pg____model.setName(tPackage__pg____model_name_prime);
		return new Object[] { tPackage, mMemberToTMember, tMember, pg, tType, mAnonymous, mMember, isApplicableMatch,
				mMemberToTMember__tMember____target, tType__tPackage____package, tPackage__tType____ownedTypes,
				mMember__mAnonymous____anonymousClassDeclaration, mMemberToTMember__mMember____source,
				tType__tMember____defines, tMember__tType____definedBy, tPackage__pg____model };
	}

	public static final Object[] pattern_AnonymousEnumConstant_2_4_solveCSP_bindingFBBBBBBBBB(
			AnonymousEnumConstant _this, IsApplicableMatch isApplicableMatch, TPackage tPackage,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg, TAbstractType tType,
			AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tPackage, mMemberToTMember, tMember,
				pg, tType, mAnonymous, mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tPackage, mMemberToTMember, tMember, pg, tType,
					mAnonymous, mMember };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousEnumConstant_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			AnonymousEnumConstant _this, IsApplicableMatch isApplicableMatch, TPackage tPackage,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg, TAbstractType tType,
			AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember) {
		Object[] result_pattern_AnonymousEnumConstant_2_4_solveCSP_binding = pattern_AnonymousEnumConstant_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tPackage, mMemberToTMember, tMember, pg, tType, mAnonymous, mMember);
		if (result_pattern_AnonymousEnumConstant_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousEnumConstant_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousEnumConstant_2_4_solveCSP_black = pattern_AnonymousEnumConstant_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousEnumConstant_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tPackage, mMemberToTMember, tMember, pg, tType,
						mAnonymous, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousEnumConstant_2_5_checkCSP_expressionFBB(AnonymousEnumConstant _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousEnumConstant_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousEnumConstant";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousEnumConstant_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_10_1_initialbindings_blackBBBBBBB(
			AnonymousEnumConstant _this, Match match, TPackage tPackage, TClass tAnonymous, TMember tMember,
			TypeGraph pg, TAbstractType tType) {
		if (!tAnonymous.equals(tType)) {
			return new Object[] { _this, match, tPackage, tAnonymous, tMember, pg, tType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_10_2_SolveCSP_bindingFBBBBBBB(
			AnonymousEnumConstant _this, Match match, TPackage tPackage, TClass tAnonymous, TMember tMember,
			TypeGraph pg, TAbstractType tType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tPackage, tAnonymous, tMember, pg, tType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tPackage, tAnonymous, tMember, pg, tType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousEnumConstant_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			AnonymousEnumConstant _this, Match match, TPackage tPackage, TClass tAnonymous, TMember tMember,
			TypeGraph pg, TAbstractType tType) {
		Object[] result_pattern_AnonymousEnumConstant_10_2_SolveCSP_binding = pattern_AnonymousEnumConstant_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, tPackage, tAnonymous, tMember, pg, tType);
		if (result_pattern_AnonymousEnumConstant_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousEnumConstant_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousEnumConstant_10_2_SolveCSP_black = pattern_AnonymousEnumConstant_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnonymousEnumConstant_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tPackage, tAnonymous, tMember, pg, tType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousEnumConstant_10_3_CheckCSP_expressionFBB(AnonymousEnumConstant _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_10_4_collectelementstobetranslated_blackBBBBBB(
			Match match, TPackage tPackage, TClass tAnonymous, TMember tMember, TypeGraph pg, TAbstractType tType) {
		if (!tAnonymous.equals(tType)) {
			return new Object[] { match, tPackage, tAnonymous, tMember, pg, tType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_10_4_collectelementstobetranslated_greenBBBBBFFFFFFFF(
			Match match, TPackage tPackage, TClass tAnonymous, TypeGraph pg, TAbstractType tType) {
		EMoflonEdge tPackage__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tAnonymous____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tAnonymous);
		String tPackage__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__tPackage____package_name_prime = "package";
		String tPackage__tAnonymous____classes_name_prime = "classes";
		String pg__tAnonymous____classes_name_prime = "classes";
		String tType__tAnonymous____innerTypes_name_prime = "innerTypes";
		String tAnonymous__tType____outerType_name_prime = "outerType";
		String pg__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__pg____model_name_prime = "model";
		tPackage__tAnonymous____ownedTypes.setSrc(tPackage);
		tPackage__tAnonymous____ownedTypes.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(tPackage__tAnonymous____ownedTypes);
		tAnonymous__tPackage____package.setSrc(tAnonymous);
		tAnonymous__tPackage____package.setTrg(tPackage);
		match.getToBeTranslatedEdges().add(tAnonymous__tPackage____package);
		tPackage__tAnonymous____classes.setSrc(tPackage);
		tPackage__tAnonymous____classes.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(tPackage__tAnonymous____classes);
		pg__tAnonymous____classes.setSrc(pg);
		pg__tAnonymous____classes.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(pg__tAnonymous____classes);
		tType__tAnonymous____innerTypes.setSrc(tType);
		tType__tAnonymous____innerTypes.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(tType__tAnonymous____innerTypes);
		tAnonymous__tType____outerType.setSrc(tAnonymous);
		tAnonymous__tType____outerType.setTrg(tType);
		match.getToBeTranslatedEdges().add(tAnonymous__tType____outerType);
		pg__tAnonymous____ownedTypes.setSrc(pg);
		pg__tAnonymous____ownedTypes.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(pg__tAnonymous____ownedTypes);
		tAnonymous__pg____model.setSrc(tAnonymous);
		tAnonymous__pg____model.setTrg(pg);
		match.getToBeTranslatedEdges().add(tAnonymous__pg____model);
		tPackage__tAnonymous____ownedTypes.setName(tPackage__tAnonymous____ownedTypes_name_prime);
		tAnonymous__tPackage____package.setName(tAnonymous__tPackage____package_name_prime);
		tPackage__tAnonymous____classes.setName(tPackage__tAnonymous____classes_name_prime);
		pg__tAnonymous____classes.setName(pg__tAnonymous____classes_name_prime);
		tType__tAnonymous____innerTypes.setName(tType__tAnonymous____innerTypes_name_prime);
		tAnonymous__tType____outerType.setName(tAnonymous__tType____outerType_name_prime);
		pg__tAnonymous____ownedTypes.setName(pg__tAnonymous____ownedTypes_name_prime);
		tAnonymous__pg____model.setName(tAnonymous__pg____model_name_prime);
		return new Object[] { match, tPackage, tAnonymous, pg, tType, tPackage__tAnonymous____ownedTypes,
				tAnonymous__tPackage____package, tPackage__tAnonymous____classes, pg__tAnonymous____classes,
				tType__tAnonymous____innerTypes, tAnonymous__tType____outerType, pg__tAnonymous____ownedTypes,
				tAnonymous__pg____model };
	}

	public static final Object[] pattern_AnonymousEnumConstant_10_5_collectcontextelements_blackBBBBBB(Match match,
			TPackage tPackage, TClass tAnonymous, TMember tMember, TypeGraph pg, TAbstractType tType) {
		if (!tAnonymous.equals(tType)) {
			return new Object[] { match, tPackage, tAnonymous, tMember, pg, tType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_10_5_collectcontextelements_greenBBBBBFFFFF(Match match,
			TPackage tPackage, TMember tMember, TypeGraph pg, TAbstractType tType) {
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tPackage);
		match.getContextNodes().add(tMember);
		match.getContextNodes().add(pg);
		match.getContextNodes().add(tType);
		String tType__tPackage____package_name_prime = "package";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tMember____defines_name_prime = "defines";
		String tMember__tType____definedBy_name_prime = "definedBy";
		String tPackage__pg____model_name_prime = "model";
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		match.getContextEdges().add(tType__tPackage____package);
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		match.getContextEdges().add(tPackage__tType____ownedTypes);
		tType__tMember____defines.setSrc(tType);
		tType__tMember____defines.setTrg(tMember);
		match.getContextEdges().add(tType__tMember____defines);
		tMember__tType____definedBy.setSrc(tMember);
		tMember__tType____definedBy.setTrg(tType);
		match.getContextEdges().add(tMember__tType____definedBy);
		tPackage__pg____model.setSrc(tPackage);
		tPackage__pg____model.setTrg(pg);
		match.getContextEdges().add(tPackage__pg____model);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		tType__tMember____defines.setName(tType__tMember____defines_name_prime);
		tMember__tType____definedBy.setName(tMember__tType____definedBy_name_prime);
		tPackage__pg____model.setName(tPackage__pg____model_name_prime);
		return new Object[] { match, tPackage, tMember, pg, tType, tType__tPackage____package,
				tPackage__tType____ownedTypes, tType__tMember____defines, tMember__tType____definedBy,
				tPackage__pg____model };
	}

	public static final void pattern_AnonymousEnumConstant_10_6_registerobjectstomatch_expressionBBBBBBB(
			AnonymousEnumConstant _this, Match match, TPackage tPackage, TClass tAnonymous, TMember tMember,
			TypeGraph pg, TAbstractType tType) {
		_this.registerObjectsToMatch_BWD(match, tPackage, tAnonymous, tMember, pg, tType);

	}

	public static final boolean pattern_AnonymousEnumConstant_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousEnumConstant_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAnonymous");
		EObject _localVariable_2 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_4 = isApplicableMatch.getObject("pg");
		EObject _localVariable_5 = isApplicableMatch.getObject("tType");
		EObject _localVariable_6 = isApplicableMatch.getObject("mMember");
		EObject tmpTPackage = _localVariable_0;
		EObject tmpTAnonymous = _localVariable_1;
		EObject tmpMMemberToTMember = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		EObject tmpPg = _localVariable_4;
		EObject tmpTType = _localVariable_5;
		EObject tmpMMember = _localVariable_6;
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			if (tmpTAnonymous instanceof TClass) {
				TClass tAnonymous = (TClass) tmpTAnonymous;
				if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
					if (tmpTMember instanceof TMember) {
						TMember tMember = (TMember) tmpTMember;
						if (tmpPg instanceof TypeGraph) {
							TypeGraph pg = (TypeGraph) tmpPg;
							if (tmpTType instanceof TAbstractType) {
								TAbstractType tType = (TAbstractType) tmpTType;
								if (tmpMMember instanceof MEnumConstantDeclaration) {
									MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) tmpMMember;
									return new Object[] { tPackage, tAnonymous, mMemberToTMember, tMember, pg, tType,
											mMember, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_11_1_performtransformation_blackBBBBBBBFBB(
			TPackage tPackage, TClass tAnonymous, MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg,
			TAbstractType tType, MEnumConstantDeclaration mMember, AnonymousEnumConstant _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tAnonymous.equals(tType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tPackage, tAnonymous, mMemberToTMember, tMember, pg, tType, mMember, csp,
							_this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			AnonymousEnumConstant _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousEnumConstant_11_1_performtransformation_binding = pattern_AnonymousEnumConstant_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousEnumConstant_11_1_performtransformation_binding != null) {
			TPackage tPackage = (TPackage) result_pattern_AnonymousEnumConstant_11_1_performtransformation_binding[0];
			TClass tAnonymous = (TClass) result_pattern_AnonymousEnumConstant_11_1_performtransformation_binding[1];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_AnonymousEnumConstant_11_1_performtransformation_binding[2];
			TMember tMember = (TMember) result_pattern_AnonymousEnumConstant_11_1_performtransformation_binding[3];
			TypeGraph pg = (TypeGraph) result_pattern_AnonymousEnumConstant_11_1_performtransformation_binding[4];
			TAbstractType tType = (TAbstractType) result_pattern_AnonymousEnumConstant_11_1_performtransformation_binding[5];
			MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) result_pattern_AnonymousEnumConstant_11_1_performtransformation_binding[6];

			Object[] result_pattern_AnonymousEnumConstant_11_1_performtransformation_black = pattern_AnonymousEnumConstant_11_1_performtransformation_blackBBBBBBBFBB(
					tPackage, tAnonymous, mMemberToTMember, tMember, pg, tType, mMember, _this, isApplicableMatch);
			if (result_pattern_AnonymousEnumConstant_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousEnumConstant_11_1_performtransformation_black[7];

				return new Object[] { tPackage, tAnonymous, mMemberToTMember, tMember, pg, tType, mMember, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_11_1_performtransformation_greenFBFB(TClass tAnonymous,
			MEnumConstantDeclaration mMember) {
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE
				.createAnonymousClassDeclarationToTClass();
		AnonymousClassDeclaration mAnonymous = JavaFactory.eINSTANCE.createAnonymousClassDeclaration();
		eAnonymousClassDeclarationToTClass.setTarget(tAnonymous);
		eAnonymousClassDeclarationToTClass.setSource(mAnonymous);
		mMember.setAnonymousClassDeclaration(mAnonymous);
		return new Object[] { eAnonymousClassDeclarationToTClass, tAnonymous, mAnonymous, mMember };
	}

	public static final Object[] pattern_AnonymousEnumConstant_11_2_collecttranslatedelements_blackBBB(
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TClass tAnonymous,
			AnonymousClassDeclaration mAnonymous) {
		return new Object[] { eAnonymousClassDeclarationToTClass, tAnonymous, mAnonymous };
	}

	public static final Object[] pattern_AnonymousEnumConstant_11_2_collecttranslatedelements_greenFBBB(
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TClass tAnonymous,
			AnonymousClassDeclaration mAnonymous) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(eAnonymousClassDeclarationToTClass);
		ruleresult.getTranslatedElements().add(tAnonymous);
		ruleresult.getCreatedElements().add(mAnonymous);
		return new Object[] { ruleresult, eAnonymousClassDeclarationToTClass, tAnonymous, mAnonymous };
	}

	public static final Object[] pattern_AnonymousEnumConstant_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eAnonymousClassDeclarationToTClass, EObject tPackage,
			EObject tAnonymous, EObject mMemberToTMember, EObject tMember, EObject pg, EObject tType,
			EObject mAnonymous, EObject mMember) {
		if (!eAnonymousClassDeclarationToTClass.equals(tPackage)) {
			if (!eAnonymousClassDeclarationToTClass.equals(tAnonymous)) {
				if (!eAnonymousClassDeclarationToTClass.equals(mMemberToTMember)) {
					if (!eAnonymousClassDeclarationToTClass.equals(tMember)) {
						if (!eAnonymousClassDeclarationToTClass.equals(pg)) {
							if (!eAnonymousClassDeclarationToTClass.equals(tType)) {
								if (!eAnonymousClassDeclarationToTClass.equals(mAnonymous)) {
									if (!eAnonymousClassDeclarationToTClass.equals(mMember)) {
										if (!tPackage.equals(tType)) {
											if (!tAnonymous.equals(tPackage)) {
												if (!tAnonymous.equals(tMember)) {
													if (!tAnonymous.equals(tType)) {
														if (!mMemberToTMember.equals(tPackage)) {
															if (!mMemberToTMember.equals(tAnonymous)) {
																if (!mMemberToTMember.equals(tMember)) {
																	if (!mMemberToTMember.equals(pg)) {
																		if (!mMemberToTMember.equals(tType)) {
																			if (!tMember.equals(tPackage)) {
																				if (!tMember.equals(tType)) {
																					if (!pg.equals(tPackage)) {
																						if (!pg.equals(tAnonymous)) {
																							if (!pg.equals(tMember)) {
																								if (!pg.equals(tType)) {
																									if (!mAnonymous
																											.equals(tPackage)) {
																										if (!mAnonymous
																												.equals(tAnonymous)) {
																											if (!mAnonymous
																													.equals(mMemberToTMember)) {
																												if (!mAnonymous
																														.equals(tMember)) {
																													if (!mAnonymous
																															.equals(pg)) {
																														if (!mAnonymous
																																.equals(tType)) {
																															if (!mAnonymous
																																	.equals(mMember)) {
																																if (!mMember
																																		.equals(tPackage)) {
																																	if (!mMember
																																			.equals(tAnonymous)) {
																																		if (!mMember
																																				.equals(mMemberToTMember)) {
																																			if (!mMember
																																					.equals(tMember)) {
																																				if (!mMember
																																						.equals(pg)) {
																																					if (!mMember
																																							.equals(tType)) {
																																						return new Object[] {
																																								ruleresult,
																																								eAnonymousClassDeclarationToTClass,
																																								tPackage,
																																								tAnonymous,
																																								mMemberToTMember,
																																								tMember,
																																								pg,
																																								tType,
																																								mAnonymous,
																																								mMember };
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

	public static final Object[] pattern_AnonymousEnumConstant_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eAnonymousClassDeclarationToTClass, EObject tPackage,
			EObject tAnonymous, EObject pg, EObject tType, EObject mAnonymous, EObject mMember) {
		EMoflonEdge tPackage__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__tAnonymous____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tAnonymous____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mMember__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousEnumConstant";
		String tPackage__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__tPackage____package_name_prime = "package";
		String tPackage__tAnonymous____classes_name_prime = "classes";
		String eAnonymousClassDeclarationToTClass__tAnonymous____target_name_prime = "target";
		String pg__tAnonymous____classes_name_prime = "classes";
		String tType__tAnonymous____innerTypes_name_prime = "innerTypes";
		String tAnonymous__tType____outerType_name_prime = "outerType";
		String eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime = "source";
		String mMember__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String pg__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__pg____model_name_prime = "model";
		tPackage__tAnonymous____ownedTypes.setSrc(tPackage);
		tPackage__tAnonymous____ownedTypes.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(tPackage__tAnonymous____ownedTypes);
		tAnonymous__tPackage____package.setSrc(tAnonymous);
		tAnonymous__tPackage____package.setTrg(tPackage);
		ruleresult.getTranslatedEdges().add(tAnonymous__tPackage____package);
		tPackage__tAnonymous____classes.setSrc(tPackage);
		tPackage__tAnonymous____classes.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(tPackage__tAnonymous____classes);
		eAnonymousClassDeclarationToTClass__tAnonymous____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tAnonymous____target.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__tAnonymous____target);
		pg__tAnonymous____classes.setSrc(pg);
		pg__tAnonymous____classes.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(pg__tAnonymous____classes);
		tType__tAnonymous____innerTypes.setSrc(tType);
		tType__tAnonymous____innerTypes.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(tType__tAnonymous____innerTypes);
		tAnonymous__tType____outerType.setSrc(tAnonymous);
		tAnonymous__tType____outerType.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tAnonymous__tType____outerType);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setTrg(mAnonymous);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__mAnonymous____source);
		mMember__mAnonymous____anonymousClassDeclaration.setSrc(mMember);
		mMember__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		ruleresult.getCreatedEdges().add(mMember__mAnonymous____anonymousClassDeclaration);
		pg__tAnonymous____ownedTypes.setSrc(pg);
		pg__tAnonymous____ownedTypes.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(pg__tAnonymous____ownedTypes);
		tAnonymous__pg____model.setSrc(tAnonymous);
		tAnonymous__pg____model.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tAnonymous__pg____model);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tPackage__tAnonymous____ownedTypes.setName(tPackage__tAnonymous____ownedTypes_name_prime);
		tAnonymous__tPackage____package.setName(tAnonymous__tPackage____package_name_prime);
		tPackage__tAnonymous____classes.setName(tPackage__tAnonymous____classes_name_prime);
		eAnonymousClassDeclarationToTClass__tAnonymous____target
				.setName(eAnonymousClassDeclarationToTClass__tAnonymous____target_name_prime);
		pg__tAnonymous____classes.setName(pg__tAnonymous____classes_name_prime);
		tType__tAnonymous____innerTypes.setName(tType__tAnonymous____innerTypes_name_prime);
		tAnonymous__tType____outerType.setName(tAnonymous__tType____outerType_name_prime);
		eAnonymousClassDeclarationToTClass__mAnonymous____source
				.setName(eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime);
		mMember__mAnonymous____anonymousClassDeclaration
				.setName(mMember__mAnonymous____anonymousClassDeclaration_name_prime);
		pg__tAnonymous____ownedTypes.setName(pg__tAnonymous____ownedTypes_name_prime);
		tAnonymous__pg____model.setName(tAnonymous__pg____model_name_prime);
		return new Object[] { ruleresult, eAnonymousClassDeclarationToTClass, tPackage, tAnonymous, pg, tType,
				mAnonymous, mMember, tPackage__tAnonymous____ownedTypes, tAnonymous__tPackage____package,
				tPackage__tAnonymous____classes, eAnonymousClassDeclarationToTClass__tAnonymous____target,
				pg__tAnonymous____classes, tType__tAnonymous____innerTypes, tAnonymous__tType____outerType,
				eAnonymousClassDeclarationToTClass__mAnonymous____source,
				mMember__mAnonymous____anonymousClassDeclaration, pg__tAnonymous____ownedTypes,
				tAnonymous__pg____model };
	}

	public static final void pattern_AnonymousEnumConstant_11_5_registerobjects_expressionBBBBBBBBBBB(
			AnonymousEnumConstant _this, PerformRuleResult ruleresult, EObject eAnonymousClassDeclarationToTClass,
			EObject tPackage, EObject tAnonymous, EObject mMemberToTMember, EObject tMember, EObject pg, EObject tType,
			EObject mAnonymous, EObject mMember) {
		_this.registerObjects_BWD(ruleresult, eAnonymousClassDeclarationToTClass, tPackage, tAnonymous,
				mMemberToTMember, tMember, pg, tType, mAnonymous, mMember);

	}

	public static final PerformRuleResult pattern_AnonymousEnumConstant_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_12_1_preparereturnvalue_bindingFB(
			AnonymousEnumConstant _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousEnumConstant _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousEnumConstant _this) {
		Object[] result_pattern_AnonymousEnumConstant_12_1_preparereturnvalue_binding = pattern_AnonymousEnumConstant_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousEnumConstant_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousEnumConstant_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousEnumConstant_12_1_preparereturnvalue_black = pattern_AnonymousEnumConstant_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousEnumConstant_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousEnumConstant_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousEnumConstant";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousEnumConstant_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tPackage");
		EObject _localVariable_1 = match.getObject("tAnonymous");
		EObject _localVariable_2 = match.getObject("tMember");
		EObject _localVariable_3 = match.getObject("pg");
		EObject _localVariable_4 = match.getObject("tType");
		EObject tmpTPackage = _localVariable_0;
		EObject tmpTAnonymous = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpTType = _localVariable_4;
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			if (tmpTAnonymous instanceof TClass) {
				TClass tAnonymous = (TClass) tmpTAnonymous;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpTType instanceof TAbstractType) {
							TAbstractType tType = (TAbstractType) tmpTType;
							return new Object[] { tPackage, tAnonymous, tMember, pg, tType, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousEnumConstant_12_2_corematch_blackBBFBBBFB(TPackage tPackage,
			TClass tAnonymous, TMember tMember, TypeGraph pg, TAbstractType tType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnonymous.equals(tType)) {
			for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
				BodyDeclaration tmpMMember = mMemberToTMember.getSource();
				if (tmpMMember instanceof MEnumConstantDeclaration) {
					MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) tmpMMember;
					_result.add(new Object[] { tPackage, tAnonymous, mMemberToTMember, tMember, pg, tType, mMember,
							match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousEnumConstant_12_3_findcontext_blackBBBBBBB(
			TPackage tPackage, TClass tAnonymous, MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg,
			TAbstractType tType, MEnumConstantDeclaration mMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnonymous.equals(tType)) {
			if (tPackage.getOwnedTypes().contains(tAnonymous)) {
				if (tPackage.getClasses().contains(tAnonymous)) {
					if (tMember.equals(mMemberToTMember.getTarget())) {
						if (pg.getClasses().contains(tAnonymous)) {
							if (tType.getInnerTypes().contains(tAnonymous)) {
								if (tPackage.equals(tType.getPackage())) {
									if (mMember.equals(mMemberToTMember.getSource())) {
										if (pg.getOwnedTypes().contains(tAnonymous)) {
											if (tType.getDefines().contains(tMember)) {
												if (pg.equals(tPackage.getModel())) {
													_result.add(new Object[] { tPackage, tAnonymous, mMemberToTMember,
															tMember, pg, tType, mMember });
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

	public static final Object[] pattern_AnonymousEnumConstant_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFFF(
			TPackage tPackage, TClass tAnonymous, MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg,
			TAbstractType tType, MEnumConstantDeclaration mMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tPackage__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tAnonymous____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tPackage__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__tPackage____package_name_prime = "package";
		String tPackage__tAnonymous____classes_name_prime = "classes";
		String mMemberToTMember__tMember____target_name_prime = "target";
		String pg__tAnonymous____classes_name_prime = "classes";
		String tType__tAnonymous____innerTypes_name_prime = "innerTypes";
		String tAnonymous__tType____outerType_name_prime = "outerType";
		String tType__tPackage____package_name_prime = "package";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String pg__tAnonymous____ownedTypes_name_prime = "ownedTypes";
		String tAnonymous__pg____model_name_prime = "model";
		String tType__tMember____defines_name_prime = "defines";
		String tMember__tType____definedBy_name_prime = "definedBy";
		String tPackage__pg____model_name_prime = "model";
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(tAnonymous);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mMember);
		tPackage__tAnonymous____ownedTypes.setSrc(tPackage);
		tPackage__tAnonymous____ownedTypes.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(tPackage__tAnonymous____ownedTypes);
		tAnonymous__tPackage____package.setSrc(tAnonymous);
		tAnonymous__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tAnonymous__tPackage____package);
		tPackage__tAnonymous____classes.setSrc(tPackage);
		tPackage__tAnonymous____classes.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(tPackage__tAnonymous____classes);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		pg__tAnonymous____classes.setSrc(pg);
		pg__tAnonymous____classes.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(pg__tAnonymous____classes);
		tType__tAnonymous____innerTypes.setSrc(tType);
		tType__tAnonymous____innerTypes.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(tType__tAnonymous____innerTypes);
		tAnonymous__tType____outerType.setSrc(tAnonymous);
		tAnonymous__tType____outerType.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tAnonymous__tType____outerType);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tType__tPackage____package);
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tPackage__tType____ownedTypes);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		pg__tAnonymous____ownedTypes.setSrc(pg);
		pg__tAnonymous____ownedTypes.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(pg__tAnonymous____ownedTypes);
		tAnonymous__pg____model.setSrc(tAnonymous);
		tAnonymous__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tAnonymous__pg____model);
		tType__tMember____defines.setSrc(tType);
		tType__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tType__tMember____defines);
		tMember__tType____definedBy.setSrc(tMember);
		tMember__tType____definedBy.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tMember__tType____definedBy);
		tPackage__pg____model.setSrc(tPackage);
		tPackage__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tPackage__pg____model);
		tPackage__tAnonymous____ownedTypes.setName(tPackage__tAnonymous____ownedTypes_name_prime);
		tAnonymous__tPackage____package.setName(tAnonymous__tPackage____package_name_prime);
		tPackage__tAnonymous____classes.setName(tPackage__tAnonymous____classes_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		pg__tAnonymous____classes.setName(pg__tAnonymous____classes_name_prime);
		tType__tAnonymous____innerTypes.setName(tType__tAnonymous____innerTypes_name_prime);
		tAnonymous__tType____outerType.setName(tAnonymous__tType____outerType_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		pg__tAnonymous____ownedTypes.setName(pg__tAnonymous____ownedTypes_name_prime);
		tAnonymous__pg____model.setName(tAnonymous__pg____model_name_prime);
		tType__tMember____defines.setName(tType__tMember____defines_name_prime);
		tMember__tType____definedBy.setName(tMember__tType____definedBy_name_prime);
		tPackage__pg____model.setName(tPackage__pg____model_name_prime);
		return new Object[] { tPackage, tAnonymous, mMemberToTMember, tMember, pg, tType, mMember, isApplicableMatch,
				tPackage__tAnonymous____ownedTypes, tAnonymous__tPackage____package, tPackage__tAnonymous____classes,
				mMemberToTMember__tMember____target, pg__tAnonymous____classes, tType__tAnonymous____innerTypes,
				tAnonymous__tType____outerType, tType__tPackage____package, tPackage__tType____ownedTypes,
				mMemberToTMember__mMember____source, pg__tAnonymous____ownedTypes, tAnonymous__pg____model,
				tType__tMember____defines, tMember__tType____definedBy, tPackage__pg____model };
	}

	public static final Object[] pattern_AnonymousEnumConstant_12_4_solveCSP_bindingFBBBBBBBBB(
			AnonymousEnumConstant _this, IsApplicableMatch isApplicableMatch, TPackage tPackage, TClass tAnonymous,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg, TAbstractType tType,
			MEnumConstantDeclaration mMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tPackage, tAnonymous,
				mMemberToTMember, tMember, pg, tType, mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tPackage, tAnonymous, mMemberToTMember, tMember, pg,
					tType, mMember };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousEnumConstant_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			AnonymousEnumConstant _this, IsApplicableMatch isApplicableMatch, TPackage tPackage, TClass tAnonymous,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg, TAbstractType tType,
			MEnumConstantDeclaration mMember) {
		Object[] result_pattern_AnonymousEnumConstant_12_4_solveCSP_binding = pattern_AnonymousEnumConstant_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tPackage, tAnonymous, mMemberToTMember, tMember, pg, tType, mMember);
		if (result_pattern_AnonymousEnumConstant_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousEnumConstant_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousEnumConstant_12_4_solveCSP_black = pattern_AnonymousEnumConstant_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousEnumConstant_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tPackage, tAnonymous, mMemberToTMember, tMember,
						pg, tType, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousEnumConstant_12_5_checkCSP_expressionFBB(AnonymousEnumConstant _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousEnumConstant_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousEnumConstant";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousEnumConstant_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_20_1_preparereturnvalue_bindingFB(
			AnonymousEnumConstant _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnonymousEnumConstant _this) {
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

	public static final Object[] pattern_AnonymousEnumConstant_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousEnumConstant _this) {
		Object[] result_pattern_AnonymousEnumConstant_20_1_preparereturnvalue_binding = pattern_AnonymousEnumConstant_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousEnumConstant_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousEnumConstant_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousEnumConstant_20_1_preparereturnvalue_black = pattern_AnonymousEnumConstant_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousEnumConstant_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousEnumConstant_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousEnumConstant_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnonymousEnumConstant_20_2_testcorematchandDECs_black_nac_0BB(
			TClass tAnonymous, TPackage tPackage) {
		for (TPackage __DEC_tAnonymous_classes_992603 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnonymous, TPackage.class, "classes")) {
			if (!tPackage.equals(__DEC_tAnonymous_classes_992603)) {
				return new Object[] { tAnonymous, tPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_20_2_testcorematchandDECs_black_nac_1BB(
			TClass tAnonymous, TypeGraph pg) {
		for (TypeGraph __DEC_tAnonymous_classes_201529 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnonymous, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tAnonymous_classes_201529)) {
				return new Object[] { tAnonymous, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_20_2_testcorematchandDECs_black_nac_2BB(
			TClass tAnonymous, TPackage tPackage) {
		TPackage __DEC_tAnonymous_ownedTypes_625962 = tAnonymous.getPackage();
		if (__DEC_tAnonymous_ownedTypes_625962 != null) {
			if (!tPackage.equals(__DEC_tAnonymous_ownedTypes_625962)) {
				return new Object[] { tAnonymous, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_20_2_testcorematchandDECs_black_nac_3BB(
			TClass tAnonymous, TAbstractType tType) {
		if (!tAnonymous.equals(tType)) {
			TAbstractType __DEC_tAnonymous_innerTypes_985545 = tAnonymous.getOuterType();
			if (__DEC_tAnonymous_innerTypes_985545 != null) {
				if (!tAnonymous.equals(__DEC_tAnonymous_innerTypes_985545)) {
					if (!tType.equals(__DEC_tAnonymous_innerTypes_985545)) {
						return new Object[] { tAnonymous, tType };
					}
				}
			}

		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousEnumConstant_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_ownedTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTPackage = _edge_ownedTypes.getSrc();
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			EObject tmpTAnonymous = _edge_ownedTypes.getTrg();
			if (tmpTAnonymous instanceof TClass) {
				TClass tAnonymous = (TClass) tmpTAnonymous;
				if (tPackage.getOwnedTypes().contains(tAnonymous)) {
					if (tPackage.getClasses().contains(tAnonymous)) {
						TypeGraph pg = tPackage.getModel();
						if (pg != null) {
							if (pg.getClasses().contains(tAnonymous)) {
								if (pg.getOwnedTypes().contains(tAnonymous)) {
									TAbstractType tType = tAnonymous.getOuterType();
									if (tType != null) {
										if (!tAnonymous.equals(tType)) {
											if (tPackage.equals(tType.getPackage())) {
												if (pattern_AnonymousEnumConstant_20_2_testcorematchandDECs_black_nac_0BB(
														tAnonymous, tPackage) == null) {
													if (pattern_AnonymousEnumConstant_20_2_testcorematchandDECs_black_nac_2BB(
															tAnonymous, tPackage) == null) {
														if (pattern_AnonymousEnumConstant_20_2_testcorematchandDECs_black_nac_1BB(
																tAnonymous, pg) == null) {
															if (pattern_AnonymousEnumConstant_20_2_testcorematchandDECs_black_nac_3BB(
																	tAnonymous, tType) == null) {
																for (TMember tMember : tType.getDefines()) {
																	_result.add(new Object[] { tPackage, tAnonymous,
																			tMember, pg, tType, _edge_ownedTypes });
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

	public static final Object[] pattern_AnonymousEnumConstant_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousEnumConstant_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			AnonymousEnumConstant _this, Match match, TPackage tPackage, TClass tAnonymous, TMember tMember,
			TypeGraph pg, TAbstractType tType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tPackage, tAnonymous, tMember, pg, tType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousEnumConstant_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousEnumConstant _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousEnumConstant_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_21_1_preparereturnvalue_bindingFB(
			AnonymousEnumConstant _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnonymousEnumConstant _this) {
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

	public static final Object[] pattern_AnonymousEnumConstant_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousEnumConstant _this) {
		Object[] result_pattern_AnonymousEnumConstant_21_1_preparereturnvalue_binding = pattern_AnonymousEnumConstant_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousEnumConstant_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousEnumConstant_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousEnumConstant_21_1_preparereturnvalue_black = pattern_AnonymousEnumConstant_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousEnumConstant_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousEnumConstant_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousEnumConstant_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnonymousEnumConstant_21_2_testcorematchandDECs_black_nac_0B(
			AnonymousClassDeclaration mAnonymous) {
		ClassInstanceCreation __DEC_mAnonymous_anonymousClassDeclaration_221023 = mAnonymous.getClassInstanceCreation();
		if (__DEC_mAnonymous_anonymousClassDeclaration_221023 != null) {
			return new Object[] { mAnonymous };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousEnumConstant_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_anonymousClassDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMMember = _edge_anonymousClassDeclaration.getSrc();
		if (tmpMMember instanceof MEnumConstantDeclaration) {
			MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) tmpMMember;
			EObject tmpMAnonymous = _edge_anonymousClassDeclaration.getTrg();
			if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
				if (mAnonymous.equals(mMember.getAnonymousClassDeclaration())) {
					if (pattern_AnonymousEnumConstant_21_2_testcorematchandDECs_black_nac_0B(mAnonymous) == null) {
						_result.add(new Object[] { mAnonymous, mMember, _edge_anonymousClassDeclaration });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousEnumConstant_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			AnonymousEnumConstant _this, Match match, AnonymousClassDeclaration mAnonymous,
			MEnumConstantDeclaration mMember) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mAnonymous, mMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousEnumConstant_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousEnumConstant _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousEnumConstant_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_24_1_prepare_blackB(AnonymousEnumConstant _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousEnumConstant_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tPackage");
		EObject _localVariable_1 = targetMatch.getObject("tAnonymous");
		EObject _localVariable_2 = targetMatch.getObject("tMember");
		EObject _localVariable_3 = targetMatch.getObject("pg");
		EObject _localVariable_4 = targetMatch.getObject("tType");
		EObject _localVariable_5 = sourceMatch.getObject("mAnonymous");
		EObject _localVariable_6 = sourceMatch.getObject("mMember");
		EObject tmpTPackage = _localVariable_0;
		EObject tmpTAnonymous = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpTType = _localVariable_4;
		EObject tmpMAnonymous = _localVariable_5;
		EObject tmpMMember = _localVariable_6;
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			if (tmpTAnonymous instanceof TClass) {
				TClass tAnonymous = (TClass) tmpTAnonymous;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpTType instanceof TAbstractType) {
							TAbstractType tType = (TAbstractType) tmpTType;
							if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
								AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
								if (tmpMMember instanceof MEnumConstantDeclaration) {
									MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) tmpMMember;
									return new Object[] { tPackage, tAnonymous, tMember, pg, tType, mAnonymous, mMember,
											targetMatch, sourceMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_blackBBBBBBBBB(TPackage tPackage,
			TClass tAnonymous, TMember tMember, TypeGraph pg, TAbstractType tType, AnonymousClassDeclaration mAnonymous,
			MEnumConstantDeclaration mMember, Match sourceMatch, Match targetMatch) {
		if (!tAnonymous.equals(tType)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { tPackage, tAnonymous, tMember, pg, tType, mAnonymous, mMember, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_binding = pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_binding != null) {
			TPackage tPackage = (TPackage) result_pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_binding[0];
			TClass tAnonymous = (TClass) result_pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_binding[1];
			TMember tMember = (TMember) result_pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_binding[3];
			TAbstractType tType = (TAbstractType) result_pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_binding[4];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_binding[5];
			MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) result_pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_black = pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					tPackage, tAnonymous, tMember, pg, tType, mAnonymous, mMember, sourceMatch, targetMatch);
			if (result_pattern_AnonymousEnumConstant_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tPackage, tAnonymous, tMember, pg, tType, mAnonymous, mMember, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_24_3_solvecsp_bindingFBBBBBBBBBB(
			AnonymousEnumConstant _this, TPackage tPackage, TClass tAnonymous, TMember tMember, TypeGraph pg,
			TAbstractType tType, AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(tPackage, tAnonymous, tMember, pg, tType, mAnonymous,
				mMember, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, tPackage, tAnonymous, tMember, pg, tType, mAnonymous, mMember,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousEnumConstant_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			AnonymousEnumConstant _this, TPackage tPackage, TClass tAnonymous, TMember tMember, TypeGraph pg,
			TAbstractType tType, AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnonymousEnumConstant_24_3_solvecsp_binding = pattern_AnonymousEnumConstant_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, tPackage, tAnonymous, tMember, pg, tType, mAnonymous, mMember, sourceMatch, targetMatch);
		if (result_pattern_AnonymousEnumConstant_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousEnumConstant_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnonymousEnumConstant_24_3_solvecsp_black = pattern_AnonymousEnumConstant_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnonymousEnumConstant_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tPackage, tAnonymous, tMember, pg, tType, mAnonymous, mMember,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousEnumConstant_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousEnumConstant_24_5_matchcorrcontext_blackFBBBB(
			TMember tMember, MEnumConstantDeclaration mMember, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
				if (mMember.equals(mMemberToTMember.getSource())) {
					_result.add(new Object[] { mMemberToTMember, tMember, mMember, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_24_5_matchcorrcontext_greenBBBF(
			MDefinitionToTMember mMemberToTMember, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnonymousEnumConstant";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mMemberToTMember);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mMemberToTMember, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnonymousEnumConstant_24_6_createcorrespondence_blackBBBBBBBB(
			TPackage tPackage, TClass tAnonymous, TMember tMember, TypeGraph pg, TAbstractType tType,
			AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember, CCMatch ccMatch) {
		if (!tAnonymous.equals(tType)) {
			return new Object[] { tPackage, tAnonymous, tMember, pg, tType, mAnonymous, mMember, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_24_6_createcorrespondence_greenFBBB(TClass tAnonymous,
			AnonymousClassDeclaration mAnonymous, CCMatch ccMatch) {
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE
				.createAnonymousClassDeclarationToTClass();
		eAnonymousClassDeclarationToTClass.setTarget(tAnonymous);
		eAnonymousClassDeclarationToTClass.setSource(mAnonymous);
		ccMatch.getCreateCorr().add(eAnonymousClassDeclarationToTClass);
		return new Object[] { eAnonymousClassDeclarationToTClass, tAnonymous, mAnonymous, ccMatch };
	}

	public static final Object[] pattern_AnonymousEnumConstant_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnonymousEnumConstant_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnonymousEnumConstant";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousEnumConstant_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_27_1_matchtggpattern_black_nac_0B(
			AnonymousClassDeclaration mAnonymous) {
		ClassInstanceCreation __DEC_mAnonymous_anonymousClassDeclaration_894077 = mAnonymous.getClassInstanceCreation();
		if (__DEC_mAnonymous_anonymousClassDeclaration_894077 != null) {
			return new Object[] { mAnonymous };
		}

		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_27_1_matchtggpattern_blackBB(
			AnonymousClassDeclaration mAnonymous, MEnumConstantDeclaration mMember) {
		if (mAnonymous.equals(mMember.getAnonymousClassDeclaration())) {
			if (pattern_AnonymousEnumConstant_27_1_matchtggpattern_black_nac_0B(mAnonymous) == null) {
				return new Object[] { mAnonymous, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousEnumConstant_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousEnumConstant_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_28_1_matchtggpattern_black_nac_0BB(TClass tAnonymous,
			TPackage tPackage) {
		for (TPackage __DEC_tAnonymous_classes_836711 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnonymous, TPackage.class, "classes")) {
			if (!tPackage.equals(__DEC_tAnonymous_classes_836711)) {
				return new Object[] { tAnonymous, tPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_28_1_matchtggpattern_black_nac_1BB(TClass tAnonymous,
			TypeGraph pg) {
		for (TypeGraph __DEC_tAnonymous_classes_430127 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnonymous, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tAnonymous_classes_430127)) {
				return new Object[] { tAnonymous, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_28_1_matchtggpattern_black_nac_2BB(TClass tAnonymous,
			TPackage tPackage) {
		TPackage __DEC_tAnonymous_ownedTypes_174636 = tAnonymous.getPackage();
		if (__DEC_tAnonymous_ownedTypes_174636 != null) {
			if (!tPackage.equals(__DEC_tAnonymous_ownedTypes_174636)) {
				return new Object[] { tAnonymous, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_28_1_matchtggpattern_black_nac_3BB(TClass tAnonymous,
			TAbstractType tType) {
		if (!tAnonymous.equals(tType)) {
			TAbstractType __DEC_tAnonymous_innerTypes_340660 = tAnonymous.getOuterType();
			if (__DEC_tAnonymous_innerTypes_340660 != null) {
				if (!tAnonymous.equals(__DEC_tAnonymous_innerTypes_340660)) {
					if (!tType.equals(__DEC_tAnonymous_innerTypes_340660)) {
						return new Object[] { tAnonymous, tType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_28_1_matchtggpattern_blackBBBBB(TPackage tPackage,
			TClass tAnonymous, TMember tMember, TypeGraph pg, TAbstractType tType) {
		if (!tAnonymous.equals(tType)) {
			if (tPackage.getOwnedTypes().contains(tAnonymous)) {
				if (tPackage.getClasses().contains(tAnonymous)) {
					if (pg.getClasses().contains(tAnonymous)) {
						if (tType.getInnerTypes().contains(tAnonymous)) {
							if (tPackage.equals(tType.getPackage())) {
								if (pg.getOwnedTypes().contains(tAnonymous)) {
									if (tType.getDefines().contains(tMember)) {
										if (pg.equals(tPackage.getModel())) {
											if (pattern_AnonymousEnumConstant_28_1_matchtggpattern_black_nac_0BB(
													tAnonymous, tPackage) == null) {
												if (pattern_AnonymousEnumConstant_28_1_matchtggpattern_black_nac_1BB(
														tAnonymous, pg) == null) {
													if (pattern_AnonymousEnumConstant_28_1_matchtggpattern_black_nac_2BB(
															tAnonymous, tPackage) == null) {
														if (pattern_AnonymousEnumConstant_28_1_matchtggpattern_black_nac_3BB(
																tAnonymous, tType) == null) {
															return new Object[] { tPackage, tAnonymous, tMember, pg,
																	tType };
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

	public static final boolean pattern_AnonymousEnumConstant_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousEnumConstant_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_29_1_createresult_blackB(AnonymousEnumConstant _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousEnumConstant_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnonymousEnumConstant_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TPackage tPackage) {
		if (ruleResult.getTargetObjects().contains(tPackage)) {
			return new Object[] { ruleResult, tPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMemberToTMember) {
		if (ruleResult.getCorrObjects().contains(mMemberToTMember)) {
			return new Object[] { ruleResult, mMemberToTMember };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MEnumConstantDeclaration mMember) {
		if (ruleResult.getSourceObjects().contains(mMember)) {
			return new Object[] { ruleResult, mMember };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousEnumConstant_29_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mMemberToTMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMMemberToTMember : mMemberToTMemberList.getEntryObjects()) {
				if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
					TMember tMember = mMemberToTMember.getTarget();
					if (tMember != null) {
						BodyDeclaration tmpMMember = mMemberToTMember.getSource();
						if (tmpMMember instanceof MEnumConstantDeclaration) {
							MEnumConstantDeclaration mMember = (MEnumConstantDeclaration) tmpMMember;
							TAbstractType tType = tMember.getDefinedBy();
							if (tType != null) {
								TPackage tPackage = tType.getPackage();
								if (tPackage != null) {
									TypeGraph pg = tPackage.getModel();
									if (pg != null) {
										if (pattern_AnonymousEnumConstant_29_2_isapplicablecore_black_nac_4BB(
												ruleResult, mMemberToTMember) == null) {
											if (pattern_AnonymousEnumConstant_29_2_isapplicablecore_black_nac_3BB(
													ruleResult, tMember) == null) {
												if (pattern_AnonymousEnumConstant_29_2_isapplicablecore_black_nac_5BB(
														ruleResult, mMember) == null) {
													if (pattern_AnonymousEnumConstant_29_2_isapplicablecore_black_nac_2BB(
															ruleResult, tType) == null) {
														if (pattern_AnonymousEnumConstant_29_2_isapplicablecore_black_nac_0BB(
																ruleResult, tPackage) == null) {
															if (pattern_AnonymousEnumConstant_29_2_isapplicablecore_black_nac_1BB(
																	ruleResult, pg) == null) {
																_result.add(new Object[] { mMemberToTMemberList,
																		tPackage, pg, tType, tMember, mMemberToTMember,
																		mMember, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_AnonymousEnumConstant_29_3_solveCSP_bindingFBBBBBBBBB(
			AnonymousEnumConstant _this, IsApplicableMatch isApplicableMatch, TPackage tPackage,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg, TAbstractType tType,
			MEnumConstantDeclaration mMember, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tPackage, mMemberToTMember, tMember,
				pg, tType, mMember, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tPackage, mMemberToTMember, tMember, pg, tType,
					mMember, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousEnumConstant_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousEnumConstant_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			AnonymousEnumConstant _this, IsApplicableMatch isApplicableMatch, TPackage tPackage,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg, TAbstractType tType,
			MEnumConstantDeclaration mMember, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnonymousEnumConstant_29_3_solveCSP_binding = pattern_AnonymousEnumConstant_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tPackage, mMemberToTMember, tMember, pg, tType, mMember, ruleResult);
		if (result_pattern_AnonymousEnumConstant_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousEnumConstant_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnonymousEnumConstant_29_3_solveCSP_black = pattern_AnonymousEnumConstant_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousEnumConstant_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tPackage, mMemberToTMember, tMember, pg, tType,
						mMember, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousEnumConstant_29_4_checkCSP_expressionFBB(AnonymousEnumConstant _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousEnumConstant_29_5_checknacs_blackBBBBBB(TPackage tPackage,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg, TAbstractType tType,
			MEnumConstantDeclaration mMember) {
		return new Object[] { tPackage, mMemberToTMember, tMember, pg, tType, mMember };
	}

	public static final Object[] pattern_AnonymousEnumConstant_29_6_perform_blackBBBBBBB(TPackage tPackage,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TypeGraph pg, TAbstractType tType,
			MEnumConstantDeclaration mMember, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tPackage, mMemberToTMember, tMember, pg, tType, mMember, ruleResult };
	}

	public static final Object[] pattern_AnonymousEnumConstant_29_6_perform_greenFBFBBFBBB(TPackage tPackage,
			TypeGraph pg, TAbstractType tType, MEnumConstantDeclaration mMember, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE
				.createAnonymousClassDeclarationToTClass();
		TClass tAnonymous = BasicFactory.eINSTANCE.createTClass();
		AnonymousClassDeclaration mAnonymous = JavaFactory.eINSTANCE.createAnonymousClassDeclaration();
		Object _localVariable_0 = csp.getValue("tAnonymous", "tLib");
		Object _localVariable_1 = csp.getValue("tAnonymous", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(eAnonymousClassDeclarationToTClass);
		tPackage.getOwnedTypes().add(tAnonymous);
		tPackage.getClasses().add(tAnonymous);
		eAnonymousClassDeclarationToTClass.setTarget(tAnonymous);
		pg.getClasses().add(tAnonymous);
		tType.getInnerTypes().add(tAnonymous);
		pg.getOwnedTypes().add(tAnonymous);
		ruleResult.getTargetObjects().add(tAnonymous);
		eAnonymousClassDeclarationToTClass.setSource(mAnonymous);
		mMember.setAnonymousClassDeclaration(mAnonymous);
		ruleResult.getSourceObjects().add(mAnonymous);
		boolean tAnonymous_tLib_prime = (boolean) _localVariable_0;
		String tAnonymous_tName_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tAnonymous.setTLib(Boolean.valueOf(tAnonymous_tLib_prime));
		tAnonymous.setTName(tAnonymous_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eAnonymousClassDeclarationToTClass, tPackage, tAnonymous, pg, tType, mAnonymous, mMember,
				ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnonymousEnumConstant_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnonymousEnumConstantImpl
