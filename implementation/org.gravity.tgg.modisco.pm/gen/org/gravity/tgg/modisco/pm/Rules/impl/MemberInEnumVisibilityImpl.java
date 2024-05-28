/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.EnumDeclaration;
import org.eclipse.modisco.java.Modifier;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.VisibilityKind;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MDefinition;

import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.MModifierToTModifier;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.MemberInEnumVisibility;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TVisibility;

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
 * An implementation of the model object '<em><b>Member In Enum Visibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MemberInEnumVisibilityImpl extends AbstractRuleImpl implements MemberInEnumVisibility {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberInEnumVisibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMemberInEnumVisibility();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MDefinition mDefinition, Modifier mModifier, EnumDeclaration mClass) {

		Object[] result1_black = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_0_1_initialbindings_blackBBBBB(this, match, mDefinition, mModifier,
						mClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", " + "[mModifier] = "
					+ mModifier + ", " + "[mClass] = " + mClass + ".");
		}

		Object[] result2_bindingAndBlack = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mDefinition, mModifier,
						mClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", " + "[mModifier] = "
					+ mModifier + ", " + "[mClass] = " + mClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MemberInEnumVisibilityImpl
					.pattern_MemberInEnumVisibility_0_4_collectelementstobetranslated_blackBBBB(match, mDefinition,
							mModifier, mClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mModifier] = " + mModifier + ", " + "[mClass] = "
						+ mClass + ".");
			}
			MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_0_4_collectelementstobetranslated_greenBBBFF(
					match, mDefinition, mModifier);
			//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MemberInEnumVisibilityImpl
					.pattern_MemberInEnumVisibility_0_5_collectcontextelements_blackBBBB(match, mDefinition, mModifier,
							mClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mModifier] = " + mModifier + ", " + "[mClass] = "
						+ mClass + ".");
			}
			MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_0_5_collectcontextelements_greenBBBFF(match,
					mDefinition, mClass);
			//nothing EMoflonEdge mClass__mDefinition____bodyDeclarations = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = (EMoflonEdge) result5_green[4];

			// 
			MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, mDefinition, mModifier, mClass);
			return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_0_7_expressionF();
		} else {
			return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[0];
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[1];
		Modifier mModifier = (Modifier) result1_bindingAndBlack[2];
		TMember tMember = (TMember) result1_bindingAndBlack[3];
		TClass tClass = (TClass) result1_bindingAndBlack[4];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[5];
		EnumDeclaration mClass = (EnumDeclaration) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_1_1_performtransformation_greenFBFBB(mModifier, tMember, csp);
		TModifier tModifier = (TModifier) result1_green[0];
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[2];

		Object[] result2_black = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_1_2_collecttranslatedelements_blackBBB(tModifier, mModifier,
						mModifierToTModifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tModifier] = " + tModifier + ", "
					+ "[mModifier] = " + mModifier + ", " + "[mModifierToTModifier] = " + mModifierToTModifier + ".");
		}
		Object[] result2_green = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_1_2_collecttranslatedelements_greenFBBB(tModifier, mModifier,
						mModifierToTModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, mDefinition,
						tModifier, defToMember, mModifier, mModifierToTModifier, tMember, tClass, mTypeToTType, mClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mDefinition] = " + mDefinition + ", " + "[tModifier] = " + tModifier + ", "
					+ "[defToMember] = " + defToMember + ", " + "[mModifier] = " + mModifier + ", "
					+ "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[tMember] = " + tMember + ", "
					+ "[tClass] = " + tClass + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mClass] = " + mClass
					+ ".");
		}
		MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				mDefinition, tModifier, mModifier, mModifierToTModifier, tMember);
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[10];

		// 
		// 
		MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, mDefinition, tModifier, defToMember, mModifier, mModifierToTModifier, tMember, tClass,
				mTypeToTType, mClass);
		return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MDefinition mDefinition = (MDefinition) result2_binding[0];
		Modifier mModifier = (Modifier) result2_binding[1];
		EnumDeclaration mClass = (EnumDeclaration) result2_binding[2];
		for (Object[] result2_black : MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_2_2_corematch_blackBFBFFFBB(mDefinition, mModifier, mClass, match)) {
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[1];
			TMember tMember = (TMember) result2_black[3];
			TClass tClass = (TClass) result2_black[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MemberInEnumVisibilityImpl
					.pattern_MemberInEnumVisibility_2_3_findcontext_blackBBBBBBB(mDefinition, defToMember, mModifier,
							tMember, tClass, mTypeToTType, mClass)) {
				Object[] result3_green = MemberInEnumVisibilityImpl
						.pattern_MemberInEnumVisibility_2_3_findcontext_greenBBBBBBBFFFFFFFFFFF(mDefinition,
								defToMember, mModifier, tMember, tClass, mTypeToTType, mClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeToTType__tClass____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tClass__tMember____defines = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tMember__tClass____definedBy = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mTypeToTType__mClass____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mClass__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = MemberInEnumVisibilityImpl
						.pattern_MemberInEnumVisibility_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mDefinition, defToMember, mModifier, tMember, tClass, mTypeToTType, mClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mDefinition] = " + mDefinition
							+ ", " + "[defToMember] = " + defToMember + ", " + "[mModifier] = " + mModifier + ", "
							+ "[tMember] = " + tMember + ", " + "[tClass] = " + tClass + ", " + "[mTypeToTType] = "
							+ mTypeToTType + ", " + "[mClass] = " + mClass + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MemberInEnumVisibilityImpl
							.pattern_MemberInEnumVisibility_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MDefinition mDefinition, Modifier mModifier,
			EnumDeclaration mClass) {
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mModifier", mModifier);
		match.registerObject("mClass", mClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MDefinition mDefinition, Modifier mModifier,
			EnumDeclaration mClass) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			MDefinitionToTMember defToMember, Modifier mModifier, TMember tMember, TClass tClass,
			TypeToTAbstractType mTypeToTType, EnumDeclaration mClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", true, csp);
		var_mModifier_static.setValue(mModifier.isStatic());
		var_mModifier_static.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", true,
				csp);
		var_mModifier_visibility.setValue(mModifier.getVisibility());
		var_mModifier_visibility.setType("java.VisibilityKind");

		// Create unbound variables
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", csp);
		var_tModifier_isStatic.setType("Boolean");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", csp);
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create constraints
		Eq eq = new Eq();
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("mModifier", mModifier);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mClass", mClass);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mDefinition, EObject tModifier,
			EObject defToMember, EObject mModifier, EObject mModifierToTModifier, EObject tMember, EObject tClass,
			EObject mTypeToTType, EObject mClass) {
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("defToMember", defToMember);
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mClass", mClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mModifier").eClass())
				.equals("java.Modifier.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TModifier tModifier, TMember tMember, TClass tClass) {

		Object[] result1_black = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_10_1_initialbindings_blackBBBBB(this, match, tModifier, tMember,
						tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tModifier] = " + tModifier + ", " + "[tMember] = " + tMember
					+ ", " + "[tClass] = " + tClass + ".");
		}

		Object[] result2_bindingAndBlack = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tModifier, tMember,
						tClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tModifier] = " + tModifier + ", " + "[tMember] = " + tMember
					+ ", " + "[tClass] = " + tClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MemberInEnumVisibilityImpl
					.pattern_MemberInEnumVisibility_10_4_collectelementstobetranslated_blackBBBB(match, tModifier,
							tMember, tClass);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tModifier] = "
								+ tModifier + ", " + "[tMember] = " + tMember + ", " + "[tClass] = " + tClass + ".");
			}
			MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_10_4_collectelementstobetranslated_greenBBBF(
					match, tModifier, tMember);
			//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = MemberInEnumVisibilityImpl
					.pattern_MemberInEnumVisibility_10_5_collectcontextelements_blackBBBB(match, tModifier, tMember,
							tClass);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tModifier] = "
								+ tModifier + ", " + "[tMember] = " + tMember + ", " + "[tClass] = " + tClass + ".");
			}
			MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_10_5_collectcontextelements_greenBBBFF(match,
					tMember, tClass);
			//nothing EMoflonEdge tClass__tMember____defines = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tMember__tClass____definedBy = (EMoflonEdge) result5_green[4];

			// 
			MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_10_6_registerobjectstomatch_expressionBBBBB(this,
					match, tModifier, tMember, tClass);
			return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_10_7_expressionF();
		} else {
			return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[0];
		TModifier tModifier = (TModifier) result1_bindingAndBlack[1];
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[2];
		TMember tMember = (TMember) result1_bindingAndBlack[3];
		TClass tClass = (TClass) result1_bindingAndBlack[4];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[5];
		EnumDeclaration mClass = (EnumDeclaration) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_11_1_performtransformation_greenBBFFB(mDefinition, tModifier, csp);
		Modifier mModifier = (Modifier) result1_green[2];
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[3];

		Object[] result2_black = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_11_2_collecttranslatedelements_blackBBB(tModifier, mModifier,
						mModifierToTModifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tModifier] = " + tModifier + ", "
					+ "[mModifier] = " + mModifier + ", " + "[mModifierToTModifier] = " + mModifierToTModifier + ".");
		}
		Object[] result2_green = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_11_2_collecttranslatedelements_greenFBBB(tModifier, mModifier,
						mModifierToTModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, mDefinition,
						tModifier, defToMember, mModifier, mModifierToTModifier, tMember, tClass, mTypeToTType, mClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mDefinition] = " + mDefinition + ", " + "[tModifier] = " + tModifier + ", "
					+ "[defToMember] = " + defToMember + ", " + "[mModifier] = " + mModifier + ", "
					+ "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[tMember] = " + tMember + ", "
					+ "[tClass] = " + tClass + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mClass] = " + mClass
					+ ".");
		}
		MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				mDefinition, tModifier, mModifier, mModifierToTModifier, tMember);
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[10];

		// 
		// 
		MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, mDefinition, tModifier, defToMember, mModifier, mModifierToTModifier, tMember, tClass,
				mTypeToTType, mClass);
		return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TModifier tModifier = (TModifier) result2_binding[0];
		TMember tMember = (TMember) result2_binding[1];
		TClass tClass = (TClass) result2_binding[2];
		for (Object[] result2_black : MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_12_2_corematch_blackFBFBBFFB(tModifier, tMember, tClass, match)) {
			MDefinition mDefinition = (MDefinition) result2_black[0];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[5];
			EnumDeclaration mClass = (EnumDeclaration) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MemberInEnumVisibilityImpl
					.pattern_MemberInEnumVisibility_12_3_findcontext_blackBBBBBBB(mDefinition, tModifier, defToMember,
							tMember, tClass, mTypeToTType, mClass)) {
				Object[] result3_green = MemberInEnumVisibilityImpl
						.pattern_MemberInEnumVisibility_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(mDefinition, tModifier,
								defToMember, tMember, tClass, mTypeToTType, mClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mTypeToTType__tClass____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tClass__tMember____defines = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tMember__tClass____definedBy = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mTypeToTType__mClass____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mClass__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = MemberInEnumVisibilityImpl
						.pattern_MemberInEnumVisibility_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mDefinition, tModifier, defToMember, tMember, tClass, mTypeToTType, mClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mDefinition] = " + mDefinition
							+ ", " + "[tModifier] = " + tModifier + ", " + "[defToMember] = " + defToMember + ", "
							+ "[tMember] = " + tMember + ", " + "[tClass] = " + tClass + ", " + "[mTypeToTType] = "
							+ mTypeToTType + ", " + "[mClass] = " + mClass + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MemberInEnumVisibilityImpl
							.pattern_MemberInEnumVisibility_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TModifier tModifier, TMember tMember, TClass tClass) {
		match.registerObject("tModifier", tModifier);
		match.registerObject("tMember", tMember);
		match.registerObject("tClass", tClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TModifier tModifier, TMember tMember, TClass tClass) {// Create CSP
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
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			TModifier tModifier, MDefinitionToTMember defToMember, TMember tMember, TClass tClass,
			TypeToTAbstractType mTypeToTType, EnumDeclaration mClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", true, csp);
		var_tModifier_isStatic.setValue(tModifier.isIsStatic());
		var_tModifier_isStatic.setType("Boolean");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", true,
				csp);
		var_tModifier_tVisibility.setValue(tModifier.getTVisibility());
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create unbound variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", csp);
		var_mModifier_static.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", csp);
		var_mModifier_visibility.setType("java.VisibilityKind");

		// Create constraints
		Eq eq = new Eq();
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tModifier", tModifier);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mClass", mClass);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mDefinition, EObject tModifier,
			EObject defToMember, EObject mModifier, EObject mModifierToTModifier, EObject tMember, EObject tClass,
			EObject mTypeToTType, EObject mClass) {
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("defToMember", defToMember);
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mClass", mClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tModifier").eClass())
				.equals("basic.TModifier.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_944(EMoflonEdge _edge_tModifier) {

		Object[] result1_bindingAndBlack = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_20_2_testcorematchandDECs_blackFFFB(_edge_tModifier)) {
			TModifier tModifier = (TModifier) result2_black[0];
			TMember tMember = (TMember) result2_black[1];
			TClass tClass = (TClass) result2_black[2];
			Object[] result2_green = MemberInEnumVisibilityImpl
					.pattern_MemberInEnumVisibility_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MemberInEnumVisibilityImpl
					.pattern_MemberInEnumVisibility_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tModifier, tMember, tClass)) {
				// 
				if (MemberInEnumVisibilityImpl
						.pattern_MemberInEnumVisibility_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MemberInEnumVisibilityImpl
							.pattern_MemberInEnumVisibility_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1038(EMoflonEdge _edge_modifier) {

		Object[] result1_bindingAndBlack = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_21_2_testcorematchandDECs_blackFFFB(_edge_modifier)) {
			MDefinition mDefinition = (MDefinition) result2_black[0];
			Modifier mModifier = (Modifier) result2_black[1];
			EnumDeclaration mClass = (EnumDeclaration) result2_black[2];
			Object[] result2_green = MemberInEnumVisibilityImpl
					.pattern_MemberInEnumVisibility_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MemberInEnumVisibilityImpl
					.pattern_MemberInEnumVisibility_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, mDefinition, mModifier, mClass)) {
				// 
				if (MemberInEnumVisibilityImpl
						.pattern_MemberInEnumVisibility_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MemberInEnumVisibilityImpl
							.pattern_MemberInEnumVisibility_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MemberInEnumVisibility");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_tVisibility.setValue(__helper.getValue("tModifier", "tVisibility"));
		var_tModifier_tVisibility.setType("basic.TVisibility");

		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_visibility.setValue(__helper.getValue("mModifier", "visibility"));
		var_mModifier_visibility.setType("java.VisibilityKind");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		DefaultVisibility defaultVisibility1 = new DefaultVisibility();
		csp.getConstraints().add(defaultVisibility1);

		eq0.setRuleName("MemberInEnumVisibility");
		eq0.solve(var_mModifier_static, var_tModifier_isStatic);

		defaultVisibility1.setRuleName("MemberInEnumVisibility");
		defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tModifier_isStatic.setBound(false);
			var_tModifier_tVisibility.setBound(false);
			eq0.solve(var_mModifier_static, var_tModifier_isStatic);
			defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tModifier", "isStatic", var_tModifier_isStatic.getValue());
				__helper.setValue("tModifier", "tVisibility", var_tModifier_tVisibility.getValue());
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
		ruleResult.setRule("MemberInEnumVisibility");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_tVisibility.setValue(__helper.getValue("tModifier", "tVisibility"));
		var_tModifier_tVisibility.setType("basic.TVisibility");

		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_visibility.setValue(__helper.getValue("mModifier", "visibility"));
		var_mModifier_visibility.setType("java.VisibilityKind");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		DefaultVisibility defaultVisibility1 = new DefaultVisibility();
		csp.getConstraints().add(defaultVisibility1);

		eq0.setRuleName("MemberInEnumVisibility");
		eq0.solve(var_mModifier_static, var_tModifier_isStatic);

		defaultVisibility1.setRuleName("MemberInEnumVisibility");
		defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mModifier_static.setBound(false);
			var_mModifier_visibility.setBound(false);
			eq0.solve(var_mModifier_static, var_tModifier_isStatic);
			defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mModifier", "static", var_mModifier_static.getValue());
				__helper.setValue("mModifier", "visibility", var_mModifier_visibility.getValue());
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

		Object[] result1_black = MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MDefinition mDefinition = (MDefinition) result2_bindingAndBlack[0];
		TModifier tModifier = (TModifier) result2_bindingAndBlack[1];
		Modifier mModifier = (Modifier) result2_bindingAndBlack[2];
		TMember tMember = (TMember) result2_bindingAndBlack[3];
		TClass tClass = (TClass) result2_bindingAndBlack[4];
		EnumDeclaration mClass = (EnumDeclaration) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, mDefinition, tModifier,
						mModifier, tMember, tClass, mClass, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[tModifier] = " + tModifier + ", " + "[mModifier] = "
					+ mModifier + ", " + "[tMember] = " + tMember + ", " + "[tClass] = " + tClass + ", " + "[mClass] = "
					+ mClass + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MemberInEnumVisibilityImpl
					.pattern_MemberInEnumVisibility_24_5_matchcorrcontext_blackBFBBFBBB(mDefinition, tMember, tClass,
							mClass, sourceMatch, targetMatch)) {
				MDefinitionToTMember defToMember = (MDefinitionToTMember) result5_black[1];
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[4];
				Object[] result5_green = MemberInEnumVisibilityImpl
						.pattern_MemberInEnumVisibility_24_5_matchcorrcontext_greenBBBBF(defToMember, mTypeToTType,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MemberInEnumVisibilityImpl
						.pattern_MemberInEnumVisibility_24_6_createcorrespondence_blackBBBBBBB(mDefinition, tModifier,
								mModifier, tMember, tClass, mClass, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mDefinition] = "
							+ mDefinition + ", " + "[tModifier] = " + tModifier + ", " + "[mModifier] = " + mModifier
							+ ", " + "[tMember] = " + tMember + ", " + "[tClass] = " + tClass + ", " + "[mClass] = "
							+ mClass + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_24_6_createcorrespondence_greenBBFB(tModifier,
						mModifier, ccMatch);
				//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[2];

				Object[] result7_black = MemberInEnumVisibilityImpl
						.pattern_MemberInEnumVisibility_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MDefinition mDefinition, TModifier tModifier, Modifier mModifier,
			TMember tMember, TClass tClass, EnumDeclaration mClass, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", true, csp);
		var_mModifier_static.setValue(mModifier.isStatic());
		var_mModifier_static.setType("Boolean");
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", true, csp);
		var_tModifier_isStatic.setValue(tModifier.isIsStatic());
		var_tModifier_isStatic.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", true,
				csp);
		var_mModifier_visibility.setValue(mModifier.getVisibility());
		var_mModifier_visibility.setType("java.VisibilityKind");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", true,
				csp);
		var_tModifier_tVisibility.setValue(tModifier.getTVisibility());
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);
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
	public boolean checkDEC_FWD(MDefinition mDefinition, Modifier mModifier, EnumDeclaration mClass) {// 
		Object[] result1_black = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_27_1_matchtggpattern_blackBBB(mDefinition, mModifier, mClass);
		if (result1_black != null) {
			return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_27_2_expressionF();
		} else {
			return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TModifier tModifier, TMember tMember, TClass tClass) {// 
		Object[] result1_black = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_28_1_matchtggpattern_blackBBB(tModifier, tMember, tClass);
		if (result1_black != null) {
			return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_28_2_expressionF();
		} else {
			return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember defToMemberParameter) {

		Object[] result1_black = MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MemberInEnumVisibilityImpl
				.pattern_MemberInEnumVisibility_29_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList defToMemberList = (RuleEntryList) result2_black[0];
			MDefinition mDefinition = (MDefinition) result2_black[1];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[2];
			TMember tMember = (TMember) result2_black[3];
			TClass tClass = (TClass) result2_black[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[5];
			EnumDeclaration mClass = (EnumDeclaration) result2_black[6];

			Object[] result3_bindingAndBlack = MemberInEnumVisibilityImpl
					.pattern_MemberInEnumVisibility_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mDefinition, defToMember, tMember, tClass, mTypeToTType, mClass, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[defToMember] = " + defToMember + ", " + "[tMember] = " + tMember + ", " + "[tClass] = "
						+ tClass + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mClass] = " + mClass + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MemberInEnumVisibilityImpl
						.pattern_MemberInEnumVisibility_29_5_checknacs_blackBBBBBB(mDefinition, defToMember, tMember,
								tClass, mTypeToTType, mClass);
				if (result5_black != null) {

					Object[] result6_black = MemberInEnumVisibilityImpl
							.pattern_MemberInEnumVisibility_29_6_perform_blackBBBBBBB(mDefinition, defToMember, tMember,
									tClass, mTypeToTType, mClass, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mDefinition] = "
								+ mDefinition + ", " + "[defToMember] = " + defToMember + ", " + "[tMember] = "
								+ tMember + ", " + "[tClass] = " + tClass + ", " + "[mTypeToTType] = " + mTypeToTType
								+ ", " + "[mClass] = " + mClass + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_29_6_perform_greenBFFFBBB(mDefinition,
							tMember, ruleResult, csp);
					//nothing TModifier tModifier = (TModifier) result6_green[1];
					//nothing Modifier mModifier = (Modifier) result6_green[2];
					//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return MemberInEnumVisibilityImpl.pattern_MemberInEnumVisibility_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			MDefinitionToTMember defToMember, TMember tMember, TClass tClass, TypeToTAbstractType mTypeToTType,
			EnumDeclaration mClass, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", csp);
		var_mModifier_static.setType("Boolean");
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", csp);
		var_tModifier_isStatic.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", csp);
		var_mModifier_visibility.setType("java.VisibilityKind");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", csp);
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create constraints
		Eq eq = new Eq();
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mClass", mClass);
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
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPROPRIATE_FWD__MATCH_MDEFINITION_MODIFIER_ENUMDECLARATION:
				return isAppropriate_FWD((Match) arguments.get(0), (MDefinition) arguments.get(1),
						(Modifier) arguments.get(2), (EnumDeclaration) arguments.get(3));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MDEFINITION_MODIFIER_ENUMDECLARATION:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (MDefinition) arguments.get(1),
						(Modifier) arguments.get(2), (EnumDeclaration) arguments.get(3));
				return null;
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MDEFINITION_MODIFIER_ENUMDECLARATION:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MDefinition) arguments.get(1),
						(Modifier) arguments.get(2), (EnumDeclaration) arguments.get(3));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MDEFINITION_MDEFINITIONTOTMEMBER_MODIFIER_TMEMBER_TCLASS_TYPETOTABSTRACTTYPE_ENUMDECLARATION:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MDefinition) arguments.get(1),
						(MDefinitionToTMember) arguments.get(2), (Modifier) arguments.get(3),
						(TMember) arguments.get(4), (TClass) arguments.get(5), (TypeToTAbstractType) arguments.get(6),
						(EnumDeclaration) arguments.get(7));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8), (EObject) arguments.get(9));
				return null;
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPROPRIATE_BWD__MATCH_TMODIFIER_TMEMBER_TCLASS:
				return isAppropriate_BWD((Match) arguments.get(0), (TModifier) arguments.get(1),
						(TMember) arguments.get(2), (TClass) arguments.get(3));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMODIFIER_TMEMBER_TCLASS:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TModifier) arguments.get(1),
						(TMember) arguments.get(2), (TClass) arguments.get(3));
				return null;
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMODIFIER_TMEMBER_TCLASS:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TModifier) arguments.get(1),
						(TMember) arguments.get(2), (TClass) arguments.get(3));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITION_TMODIFIER_MDEFINITIONTOTMEMBER_TMEMBER_TCLASS_TYPETOTABSTRACTTYPE_ENUMDECLARATION:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MDefinition) arguments.get(1),
						(TModifier) arguments.get(2), (MDefinitionToTMember) arguments.get(3),
						(TMember) arguments.get(4), (TClass) arguments.get(5), (TypeToTAbstractType) arguments.get(6),
						(EnumDeclaration) arguments.get(7));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8), (EObject) arguments.get(9));
				return null;
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPROPRIATE_BWD_EMOFLON_EDGE_944__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_944((EMoflonEdge) arguments.get(0));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1038__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_1038((EMoflonEdge) arguments.get(0));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_CC__MDEFINITION_TMODIFIER_MODIFIER_TMEMBER_TCLASS_ENUMDECLARATION_MATCH_MATCH:
				return isApplicable_solveCsp_CC((MDefinition) arguments.get(0), (TModifier) arguments.get(1),
						(Modifier) arguments.get(2), (TMember) arguments.get(3), (TClass) arguments.get(4),
						(EnumDeclaration) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___CHECK_DEC_FWD__MDEFINITION_MODIFIER_ENUMDECLARATION:
				return checkDEC_FWD((MDefinition) arguments.get(0), (Modifier) arguments.get(1),
						(EnumDeclaration) arguments.get(2));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___CHECK_DEC_BWD__TMODIFIER_TMEMBER_TCLASS:
				return checkDEC_BWD((TModifier) arguments.get(0), (TMember) arguments.get(1),
						(TClass) arguments.get(2));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
				return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITION_MDEFINITIONTOTMEMBER_TMEMBER_TCLASS_TYPETOTABSTRACTTYPE_ENUMDECLARATION_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MDefinition) arguments.get(1),
						(MDefinitionToTMember) arguments.get(2), (TMember) arguments.get(3), (TClass) arguments.get(4),
						(TypeToTAbstractType) arguments.get(5), (EnumDeclaration) arguments.get(6),
						(ModelgeneratorRuleResult) arguments.get(7));
			case RulesPackage.MEMBER_IN_ENUM_VISIBILITY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MemberInEnumVisibility_0_1_initialbindings_blackBBBBB(
			MemberInEnumVisibility _this, Match match, MDefinition mDefinition, Modifier mModifier,
			EnumDeclaration mClass) {
		return new Object[] { _this, match, mDefinition, mModifier, mClass };
	}

	public static final Object[] pattern_MemberInEnumVisibility_0_2_SolveCSP_bindingFBBBBB(MemberInEnumVisibility _this,
			Match match, MDefinition mDefinition, Modifier mModifier, EnumDeclaration mClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mDefinition, mModifier, mClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mDefinition, mModifier, mClass };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInEnumVisibility_0_2_SolveCSP_bindingAndBlackFBBBBB(
			MemberInEnumVisibility _this, Match match, MDefinition mDefinition, Modifier mModifier,
			EnumDeclaration mClass) {
		Object[] result_pattern_MemberInEnumVisibility_0_2_SolveCSP_binding = pattern_MemberInEnumVisibility_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mDefinition, mModifier, mClass);
		if (result_pattern_MemberInEnumVisibility_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInEnumVisibility_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MemberInEnumVisibility_0_2_SolveCSP_black = pattern_MemberInEnumVisibility_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MemberInEnumVisibility_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mDefinition, mModifier, mClass };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInEnumVisibility_0_3_CheckCSP_expressionFBB(MemberInEnumVisibility _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_0_4_collectelementstobetranslated_blackBBBB(Match match,
			MDefinition mDefinition, Modifier mModifier, EnumDeclaration mClass) {
		return new Object[] { match, mDefinition, mModifier, mClass };
	}

	public static final Object[] pattern_MemberInEnumVisibility_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, MDefinition mDefinition, Modifier mModifier) {
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mModifier);
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		match.getToBeTranslatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		return new Object[] { match, mDefinition, mModifier, mDefinition__mModifier____modifier,
				mModifier__mDefinition____bodyDeclaration };
	}

	public static final Object[] pattern_MemberInEnumVisibility_0_5_collectcontextelements_blackBBBB(Match match,
			MDefinition mDefinition, Modifier mModifier, EnumDeclaration mClass) {
		return new Object[] { match, mDefinition, mModifier, mClass };
	}

	public static final Object[] pattern_MemberInEnumVisibility_0_5_collectcontextelements_greenBBBFF(Match match,
			MDefinition mDefinition, EnumDeclaration mClass) {
		EMoflonEdge mClass__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mDefinition);
		match.getContextNodes().add(mClass);
		String mClass__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		mClass__mDefinition____bodyDeclarations.setSrc(mClass);
		mClass__mDefinition____bodyDeclarations.setTrg(mDefinition);
		match.getContextEdges().add(mClass__mDefinition____bodyDeclarations);
		mDefinition__mClass____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mClass____abstractTypeDeclaration.setTrg(mClass);
		match.getContextEdges().add(mDefinition__mClass____abstractTypeDeclaration);
		mClass__mDefinition____bodyDeclarations.setName(mClass__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mClass____abstractTypeDeclaration
				.setName(mDefinition__mClass____abstractTypeDeclaration_name_prime);
		return new Object[] { match, mDefinition, mClass, mClass__mDefinition____bodyDeclarations,
				mDefinition__mClass____abstractTypeDeclaration };
	}

	public static final void pattern_MemberInEnumVisibility_0_6_registerobjectstomatch_expressionBBBBB(
			MemberInEnumVisibility _this, Match match, MDefinition mDefinition, Modifier mModifier,
			EnumDeclaration mClass) {
		_this.registerObjectsToMatch_FWD(match, mDefinition, mModifier, mClass);

	}

	public static final boolean pattern_MemberInEnumVisibility_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInEnumVisibility_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_1 = isApplicableMatch.getObject("defToMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("mModifier");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_4 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_6 = isApplicableMatch.getObject("mClass");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpDefToMember = _localVariable_1;
		EObject tmpMModifier = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		EObject tmpTClass = _localVariable_4;
		EObject tmpMTypeToTType = _localVariable_5;
		EObject tmpMClass = _localVariable_6;
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			if (tmpDefToMember instanceof MDefinitionToTMember) {
				MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
				if (tmpMModifier instanceof Modifier) {
					Modifier mModifier = (Modifier) tmpMModifier;
					if (tmpTMember instanceof TMember) {
						TMember tMember = (TMember) tmpTMember;
						if (tmpTClass instanceof TClass) {
							TClass tClass = (TClass) tmpTClass;
							if (tmpMTypeToTType instanceof TypeToTAbstractType) {
								TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
								if (tmpMClass instanceof EnumDeclaration) {
									EnumDeclaration mClass = (EnumDeclaration) tmpMClass;
									return new Object[] { mDefinition, defToMember, mModifier, tMember, tClass,
											mTypeToTType, mClass, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_1_1_performtransformation_blackBBBBBBBFBB(
			MDefinition mDefinition, MDefinitionToTMember defToMember, Modifier mModifier, TMember tMember,
			TClass tClass, TypeToTAbstractType mTypeToTType, EnumDeclaration mClass, MemberInEnumVisibility _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mDefinition, defToMember, mModifier, tMember, tClass, mTypeToTType, mClass, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MemberInEnumVisibility _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MemberInEnumVisibility_1_1_performtransformation_binding = pattern_MemberInEnumVisibility_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MemberInEnumVisibility_1_1_performtransformation_binding != null) {
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInEnumVisibility_1_1_performtransformation_binding[0];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_MemberInEnumVisibility_1_1_performtransformation_binding[1];
			Modifier mModifier = (Modifier) result_pattern_MemberInEnumVisibility_1_1_performtransformation_binding[2];
			TMember tMember = (TMember) result_pattern_MemberInEnumVisibility_1_1_performtransformation_binding[3];
			TClass tClass = (TClass) result_pattern_MemberInEnumVisibility_1_1_performtransformation_binding[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MemberInEnumVisibility_1_1_performtransformation_binding[5];
			EnumDeclaration mClass = (EnumDeclaration) result_pattern_MemberInEnumVisibility_1_1_performtransformation_binding[6];

			Object[] result_pattern_MemberInEnumVisibility_1_1_performtransformation_black = pattern_MemberInEnumVisibility_1_1_performtransformation_blackBBBBBBBFBB(
					mDefinition, defToMember, mModifier, tMember, tClass, mTypeToTType, mClass, _this,
					isApplicableMatch);
			if (result_pattern_MemberInEnumVisibility_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MemberInEnumVisibility_1_1_performtransformation_black[7];

				return new Object[] { mDefinition, defToMember, mModifier, tMember, tClass, mTypeToTType, mClass, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_1_1_performtransformation_greenFBFBB(Modifier mModifier,
			TMember tMember, CSP csp) {
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Object _localVariable_0 = csp.getValue("tModifier", "isStatic");
		Object _localVariable_1 = csp.getValue("tModifier", "tVisibility");
		tMember.setTModifier(tModifier);
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		boolean tModifier_isStatic_prime = (boolean) _localVariable_0;
		TVisibility tModifier_tVisibility_prime = (TVisibility) _localVariable_1;
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		tModifier.setTVisibility(tModifier_tVisibility_prime);
		return new Object[] { tModifier, mModifier, mModifierToTModifier, tMember, csp };
	}

	public static final Object[] pattern_MemberInEnumVisibility_1_2_collecttranslatedelements_blackBBB(
			TModifier tModifier, Modifier mModifier, MModifierToTModifier mModifierToTModifier) {
		return new Object[] { tModifier, mModifier, mModifierToTModifier };
	}

	public static final Object[] pattern_MemberInEnumVisibility_1_2_collecttranslatedelements_greenFBBB(
			TModifier tModifier, Modifier mModifier, MModifierToTModifier mModifierToTModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tModifier);
		ruleresult.getTranslatedElements().add(mModifier);
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		return new Object[] { ruleresult, tModifier, mModifier, mModifierToTModifier };
	}

	public static final Object[] pattern_MemberInEnumVisibility_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mDefinition, EObject tModifier, EObject defToMember,
			EObject mModifier, EObject mModifierToTModifier, EObject tMember, EObject tClass, EObject mTypeToTType,
			EObject mClass) {
		if (!mDefinition.equals(tModifier)) {
			if (!mDefinition.equals(mModifier)) {
				if (!mDefinition.equals(mModifierToTModifier)) {
					if (!mDefinition.equals(tMember)) {
						if (!mDefinition.equals(tClass)) {
							if (!mDefinition.equals(mTypeToTType)) {
								if (!defToMember.equals(mDefinition)) {
									if (!defToMember.equals(tModifier)) {
										if (!defToMember.equals(mModifier)) {
											if (!defToMember.equals(mModifierToTModifier)) {
												if (!defToMember.equals(tMember)) {
													if (!defToMember.equals(tClass)) {
														if (!defToMember.equals(mTypeToTType)) {
															if (!defToMember.equals(mClass)) {
																if (!mModifier.equals(tModifier)) {
																	if (!mModifier.equals(mModifierToTModifier)) {
																		if (!mModifier.equals(tMember)) {
																			if (!mModifier.equals(tClass)) {
																				if (!mModifier.equals(mTypeToTType)) {
																					if (!mModifierToTModifier
																							.equals(tModifier)) {
																						if (!mModifierToTModifier
																								.equals(tMember)) {
																							if (!mModifierToTModifier
																									.equals(tClass)) {
																								if (!mModifierToTModifier
																										.equals(mTypeToTType)) {
																									if (!tMember.equals(
																											tModifier)) {
																										if (!tClass
																												.equals(tModifier)) {
																											if (!tClass
																													.equals(tMember)) {
																												if (!mTypeToTType
																														.equals(tModifier)) {
																													if (!mTypeToTType
																															.equals(tMember)) {
																														if (!mTypeToTType
																																.equals(tClass)) {
																															if (!mClass
																																	.equals(mDefinition)) {
																																if (!mClass
																																		.equals(tModifier)) {
																																	if (!mClass
																																			.equals(mModifier)) {
																																		if (!mClass
																																				.equals(mModifierToTModifier)) {
																																			if (!mClass
																																					.equals(tMember)) {
																																				if (!mClass
																																						.equals(tClass)) {
																																					if (!mClass
																																							.equals(mTypeToTType)) {
																																						return new Object[] {
																																								ruleresult,
																																								mDefinition,
																																								tModifier,
																																								defToMember,
																																								mModifier,
																																								mModifierToTModifier,
																																								tMember,
																																								tClass,
																																								mTypeToTType,
																																								mClass };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MemberInEnumVisibility_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mDefinition, EObject tModifier, EObject mModifier,
			EObject mModifierToTModifier, EObject tMember) {
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MemberInEnumVisibility";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getTranslatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(tMember__tModifier____tModifier);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		return new Object[] { ruleresult, mDefinition, tModifier, mModifier, mModifierToTModifier, tMember,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration,
				mModifierToTModifier__mModifier____source, mModifierToTModifier__tModifier____target,
				tMember__tModifier____tModifier };
	}

	public static final void pattern_MemberInEnumVisibility_1_5_registerobjects_expressionBBBBBBBBBBB(
			MemberInEnumVisibility _this, PerformRuleResult ruleresult, EObject mDefinition, EObject tModifier,
			EObject defToMember, EObject mModifier, EObject mModifierToTModifier, EObject tMember, EObject tClass,
			EObject mTypeToTType, EObject mClass) {
		_this.registerObjects_FWD(ruleresult, mDefinition, tModifier, defToMember, mModifier, mModifierToTModifier,
				tMember, tClass, mTypeToTType, mClass);

	}

	public static final PerformRuleResult pattern_MemberInEnumVisibility_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_2_1_preparereturnvalue_bindingFB(
			MemberInEnumVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MemberInEnumVisibility _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_2_1_preparereturnvalue_bindingAndBlackFFB(
			MemberInEnumVisibility _this) {
		Object[] result_pattern_MemberInEnumVisibility_2_1_preparereturnvalue_binding = pattern_MemberInEnumVisibility_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInEnumVisibility_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MemberInEnumVisibility_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInEnumVisibility_2_1_preparereturnvalue_black = pattern_MemberInEnumVisibility_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MemberInEnumVisibility_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MemberInEnumVisibility_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MemberInEnumVisibility";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MemberInEnumVisibility_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mDefinition");
		EObject _localVariable_1 = match.getObject("mModifier");
		EObject _localVariable_2 = match.getObject("mClass");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpMModifier = _localVariable_1;
		EObject tmpMClass = _localVariable_2;
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			if (tmpMModifier instanceof Modifier) {
				Modifier mModifier = (Modifier) tmpMModifier;
				if (tmpMClass instanceof EnumDeclaration) {
					EnumDeclaration mClass = (EnumDeclaration) tmpMClass;
					return new Object[] { mDefinition, mModifier, mClass, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInEnumVisibility_2_2_corematch_blackBFBFFFBB(
			MDefinition mDefinition, Modifier mModifier, EnumDeclaration mClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
			TMember tMember = defToMember.getTarget();
			if (tMember != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mClass, TypeToTAbstractType.class, "source")) {
					TAbstractType tmpTClass = mTypeToTType.getTarget();
					if (tmpTClass instanceof TClass) {
						TClass tClass = (TClass) tmpTClass;
						_result.add(new Object[] { mDefinition, defToMember, mModifier, tMember, tClass, mTypeToTType,
								mClass, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInEnumVisibility_2_3_findcontext_blackBBBBBBB(
			MDefinition mDefinition, MDefinitionToTMember defToMember, Modifier mModifier, TMember tMember,
			TClass tClass, TypeToTAbstractType mTypeToTType, EnumDeclaration mClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mDefinition.equals(defToMember.getSource())) {
			if (mModifier.equals(mDefinition.getModifier())) {
				if (tClass.equals(mTypeToTType.getTarget())) {
					if (tMember.equals(defToMember.getTarget())) {
						if (tClass.getDefines().contains(tMember)) {
							if (mClass.equals(mTypeToTType.getSource())) {
								if (mClass.getBodyDeclarations().contains(mDefinition)) {
									_result.add(new Object[] { mDefinition, defToMember, mModifier, tMember, tClass,
											mTypeToTType, mClass });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_2_3_findcontext_greenBBBBBBBFFFFFFFFFFF(
			MDefinition mDefinition, MDefinitionToTMember defToMember, Modifier mModifier, TMember tMember,
			TClass tClass, TypeToTAbstractType mTypeToTType, EnumDeclaration mClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mClass__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String defToMember__mDefinition____source_name_prime = "source";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String mTypeToTType__tClass____target_name_prime = "target";
		String defToMember__tMember____target_name_prime = "target";
		String tClass__tMember____defines_name_prime = "defines";
		String tMember__tClass____definedBy_name_prime = "definedBy";
		String mTypeToTType__mClass____source_name_prime = "source";
		String mClass__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember);
		isApplicableMatch.getAllContextElements().add(mModifier);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mClass);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		isApplicableMatch.getAllContextElements().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mModifier__mDefinition____bodyDeclaration);
		mTypeToTType__tClass____target.setSrc(mTypeToTType);
		mTypeToTType__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tClass____target);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		tClass__tMember____defines.setSrc(tClass);
		tClass__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tClass__tMember____defines);
		tMember__tClass____definedBy.setSrc(tMember);
		tMember__tClass____definedBy.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tMember__tClass____definedBy);
		mTypeToTType__mClass____source.setSrc(mTypeToTType);
		mTypeToTType__mClass____source.setTrg(mClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mClass____source);
		mClass__mDefinition____bodyDeclarations.setSrc(mClass);
		mClass__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mClass__mDefinition____bodyDeclarations);
		mDefinition__mClass____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mClass____abstractTypeDeclaration.setTrg(mClass);
		isApplicableMatch.getAllContextElements().add(mDefinition__mClass____abstractTypeDeclaration);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		mTypeToTType__tClass____target.setName(mTypeToTType__tClass____target_name_prime);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		tClass__tMember____defines.setName(tClass__tMember____defines_name_prime);
		tMember__tClass____definedBy.setName(tMember__tClass____definedBy_name_prime);
		mTypeToTType__mClass____source.setName(mTypeToTType__mClass____source_name_prime);
		mClass__mDefinition____bodyDeclarations.setName(mClass__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mClass____abstractTypeDeclaration
				.setName(mDefinition__mClass____abstractTypeDeclaration_name_prime);
		return new Object[] { mDefinition, defToMember, mModifier, tMember, tClass, mTypeToTType, mClass,
				isApplicableMatch, defToMember__mDefinition____source, mDefinition__mModifier____modifier,
				mModifier__mDefinition____bodyDeclaration, mTypeToTType__tClass____target,
				defToMember__tMember____target, tClass__tMember____defines, tMember__tClass____definedBy,
				mTypeToTType__mClass____source, mClass__mDefinition____bodyDeclarations,
				mDefinition__mClass____abstractTypeDeclaration };
	}

	public static final Object[] pattern_MemberInEnumVisibility_2_4_solveCSP_bindingFBBBBBBBBB(
			MemberInEnumVisibility _this, IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			MDefinitionToTMember defToMember, Modifier mModifier, TMember tMember, TClass tClass,
			TypeToTAbstractType mTypeToTType, EnumDeclaration mClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mDefinition, defToMember, mModifier,
				tMember, tClass, mTypeToTType, mClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, defToMember, mModifier, tMember, tClass,
					mTypeToTType, mClass };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInEnumVisibility_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInEnumVisibility _this, IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			MDefinitionToTMember defToMember, Modifier mModifier, TMember tMember, TClass tClass,
			TypeToTAbstractType mTypeToTType, EnumDeclaration mClass) {
		Object[] result_pattern_MemberInEnumVisibility_2_4_solveCSP_binding = pattern_MemberInEnumVisibility_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mDefinition, defToMember, mModifier, tMember, tClass, mTypeToTType, mClass);
		if (result_pattern_MemberInEnumVisibility_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInEnumVisibility_2_4_solveCSP_binding[0];

			Object[] result_pattern_MemberInEnumVisibility_2_4_solveCSP_black = pattern_MemberInEnumVisibility_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInEnumVisibility_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, defToMember, mModifier, tMember,
						tClass, mTypeToTType, mClass };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInEnumVisibility_2_5_checkCSP_expressionFBB(MemberInEnumVisibility _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MemberInEnumVisibility_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MemberInEnumVisibility";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MemberInEnumVisibility_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_10_1_initialbindings_blackBBBBB(
			MemberInEnumVisibility _this, Match match, TModifier tModifier, TMember tMember, TClass tClass) {
		return new Object[] { _this, match, tModifier, tMember, tClass };
	}

	public static final Object[] pattern_MemberInEnumVisibility_10_2_SolveCSP_bindingFBBBBB(
			MemberInEnumVisibility _this, Match match, TModifier tModifier, TMember tMember, TClass tClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tModifier, tMember, tClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tModifier, tMember, tClass };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInEnumVisibility_10_2_SolveCSP_bindingAndBlackFBBBBB(
			MemberInEnumVisibility _this, Match match, TModifier tModifier, TMember tMember, TClass tClass) {
		Object[] result_pattern_MemberInEnumVisibility_10_2_SolveCSP_binding = pattern_MemberInEnumVisibility_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tModifier, tMember, tClass);
		if (result_pattern_MemberInEnumVisibility_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInEnumVisibility_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MemberInEnumVisibility_10_2_SolveCSP_black = pattern_MemberInEnumVisibility_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MemberInEnumVisibility_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tModifier, tMember, tClass };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInEnumVisibility_10_3_CheckCSP_expressionFBB(MemberInEnumVisibility _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TModifier tModifier, TMember tMember, TClass tClass) {
		return new Object[] { match, tModifier, tMember, tClass };
	}

	public static final Object[] pattern_MemberInEnumVisibility_10_4_collectelementstobetranslated_greenBBBF(
			Match match, TModifier tModifier, TMember tMember) {
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tModifier);
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		match.getToBeTranslatedEdges().add(tMember__tModifier____tModifier);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		return new Object[] { match, tModifier, tMember, tMember__tModifier____tModifier };
	}

	public static final Object[] pattern_MemberInEnumVisibility_10_5_collectcontextelements_blackBBBB(Match match,
			TModifier tModifier, TMember tMember, TClass tClass) {
		return new Object[] { match, tModifier, tMember, tClass };
	}

	public static final Object[] pattern_MemberInEnumVisibility_10_5_collectcontextelements_greenBBBFF(Match match,
			TMember tMember, TClass tClass) {
		EMoflonEdge tClass__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tMember);
		match.getContextNodes().add(tClass);
		String tClass__tMember____defines_name_prime = "defines";
		String tMember__tClass____definedBy_name_prime = "definedBy";
		tClass__tMember____defines.setSrc(tClass);
		tClass__tMember____defines.setTrg(tMember);
		match.getContextEdges().add(tClass__tMember____defines);
		tMember__tClass____definedBy.setSrc(tMember);
		tMember__tClass____definedBy.setTrg(tClass);
		match.getContextEdges().add(tMember__tClass____definedBy);
		tClass__tMember____defines.setName(tClass__tMember____defines_name_prime);
		tMember__tClass____definedBy.setName(tMember__tClass____definedBy_name_prime);
		return new Object[] { match, tMember, tClass, tClass__tMember____defines, tMember__tClass____definedBy };
	}

	public static final void pattern_MemberInEnumVisibility_10_6_registerobjectstomatch_expressionBBBBB(
			MemberInEnumVisibility _this, Match match, TModifier tModifier, TMember tMember, TClass tClass) {
		_this.registerObjectsToMatch_BWD(match, tModifier, tMember, tClass);

	}

	public static final boolean pattern_MemberInEnumVisibility_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInEnumVisibility_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_1 = isApplicableMatch.getObject("tModifier");
		EObject _localVariable_2 = isApplicableMatch.getObject("defToMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_4 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_6 = isApplicableMatch.getObject("mClass");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpTModifier = _localVariable_1;
		EObject tmpDefToMember = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		EObject tmpTClass = _localVariable_4;
		EObject tmpMTypeToTType = _localVariable_5;
		EObject tmpMClass = _localVariable_6;
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tmpDefToMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
					if (tmpTMember instanceof TMember) {
						TMember tMember = (TMember) tmpTMember;
						if (tmpTClass instanceof TClass) {
							TClass tClass = (TClass) tmpTClass;
							if (tmpMTypeToTType instanceof TypeToTAbstractType) {
								TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
								if (tmpMClass instanceof EnumDeclaration) {
									EnumDeclaration mClass = (EnumDeclaration) tmpMClass;
									return new Object[] { mDefinition, tModifier, defToMember, tMember, tClass,
											mTypeToTType, mClass, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_11_1_performtransformation_blackBBBBBBBFBB(
			MDefinition mDefinition, TModifier tModifier, MDefinitionToTMember defToMember, TMember tMember,
			TClass tClass, TypeToTAbstractType mTypeToTType, EnumDeclaration mClass, MemberInEnumVisibility _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mDefinition, tModifier, defToMember, tMember, tClass, mTypeToTType, mClass, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MemberInEnumVisibility _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MemberInEnumVisibility_11_1_performtransformation_binding = pattern_MemberInEnumVisibility_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MemberInEnumVisibility_11_1_performtransformation_binding != null) {
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInEnumVisibility_11_1_performtransformation_binding[0];
			TModifier tModifier = (TModifier) result_pattern_MemberInEnumVisibility_11_1_performtransformation_binding[1];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_MemberInEnumVisibility_11_1_performtransformation_binding[2];
			TMember tMember = (TMember) result_pattern_MemberInEnumVisibility_11_1_performtransformation_binding[3];
			TClass tClass = (TClass) result_pattern_MemberInEnumVisibility_11_1_performtransformation_binding[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MemberInEnumVisibility_11_1_performtransformation_binding[5];
			EnumDeclaration mClass = (EnumDeclaration) result_pattern_MemberInEnumVisibility_11_1_performtransformation_binding[6];

			Object[] result_pattern_MemberInEnumVisibility_11_1_performtransformation_black = pattern_MemberInEnumVisibility_11_1_performtransformation_blackBBBBBBBFBB(
					mDefinition, tModifier, defToMember, tMember, tClass, mTypeToTType, mClass, _this,
					isApplicableMatch);
			if (result_pattern_MemberInEnumVisibility_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MemberInEnumVisibility_11_1_performtransformation_black[7];

				return new Object[] { mDefinition, tModifier, defToMember, tMember, tClass, mTypeToTType, mClass, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_11_1_performtransformation_greenBBFFB(
			MDefinition mDefinition, TModifier tModifier, CSP csp) {
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Object _localVariable_0 = csp.getValue("mModifier", "static");
		Object _localVariable_1 = csp.getValue("mModifier", "visibility");
		mDefinition.setModifier(mModifier);
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		boolean mModifier_static_prime = (boolean) _localVariable_0;
		VisibilityKind mModifier_visibility_prime = (VisibilityKind) _localVariable_1;
		mModifier.setStatic(Boolean.valueOf(mModifier_static_prime));
		mModifier.setVisibility(mModifier_visibility_prime);
		return new Object[] { mDefinition, tModifier, mModifier, mModifierToTModifier, csp };
	}

	public static final Object[] pattern_MemberInEnumVisibility_11_2_collecttranslatedelements_blackBBB(
			TModifier tModifier, Modifier mModifier, MModifierToTModifier mModifierToTModifier) {
		return new Object[] { tModifier, mModifier, mModifierToTModifier };
	}

	public static final Object[] pattern_MemberInEnumVisibility_11_2_collecttranslatedelements_greenFBBB(
			TModifier tModifier, Modifier mModifier, MModifierToTModifier mModifierToTModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tModifier);
		ruleresult.getCreatedElements().add(mModifier);
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		return new Object[] { ruleresult, tModifier, mModifier, mModifierToTModifier };
	}

	public static final Object[] pattern_MemberInEnumVisibility_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mDefinition, EObject tModifier, EObject defToMember,
			EObject mModifier, EObject mModifierToTModifier, EObject tMember, EObject tClass, EObject mTypeToTType,
			EObject mClass) {
		if (!mDefinition.equals(tModifier)) {
			if (!mDefinition.equals(mModifier)) {
				if (!mDefinition.equals(mModifierToTModifier)) {
					if (!mDefinition.equals(tMember)) {
						if (!mDefinition.equals(tClass)) {
							if (!mDefinition.equals(mTypeToTType)) {
								if (!defToMember.equals(mDefinition)) {
									if (!defToMember.equals(tModifier)) {
										if (!defToMember.equals(mModifier)) {
											if (!defToMember.equals(mModifierToTModifier)) {
												if (!defToMember.equals(tMember)) {
													if (!defToMember.equals(tClass)) {
														if (!defToMember.equals(mTypeToTType)) {
															if (!defToMember.equals(mClass)) {
																if (!mModifier.equals(tModifier)) {
																	if (!mModifier.equals(mModifierToTModifier)) {
																		if (!mModifier.equals(tMember)) {
																			if (!mModifier.equals(tClass)) {
																				if (!mModifier.equals(mTypeToTType)) {
																					if (!mModifierToTModifier
																							.equals(tModifier)) {
																						if (!mModifierToTModifier
																								.equals(tMember)) {
																							if (!mModifierToTModifier
																									.equals(tClass)) {
																								if (!mModifierToTModifier
																										.equals(mTypeToTType)) {
																									if (!tMember.equals(
																											tModifier)) {
																										if (!tClass
																												.equals(tModifier)) {
																											if (!tClass
																													.equals(tMember)) {
																												if (!mTypeToTType
																														.equals(tModifier)) {
																													if (!mTypeToTType
																															.equals(tMember)) {
																														if (!mTypeToTType
																																.equals(tClass)) {
																															if (!mClass
																																	.equals(mDefinition)) {
																																if (!mClass
																																		.equals(tModifier)) {
																																	if (!mClass
																																			.equals(mModifier)) {
																																		if (!mClass
																																				.equals(mModifierToTModifier)) {
																																			if (!mClass
																																					.equals(tMember)) {
																																				if (!mClass
																																						.equals(tClass)) {
																																					if (!mClass
																																							.equals(mTypeToTType)) {
																																						return new Object[] {
																																								ruleresult,
																																								mDefinition,
																																								tModifier,
																																								defToMember,
																																								mModifier,
																																								mModifierToTModifier,
																																								tMember,
																																								tClass,
																																								mTypeToTType,
																																								mClass };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MemberInEnumVisibility_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mDefinition, EObject tModifier, EObject mModifier,
			EObject mModifierToTModifier, EObject tMember) {
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MemberInEnumVisibility";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getTranslatedEdges().add(tMember__tModifier____tModifier);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		return new Object[] { ruleresult, mDefinition, tModifier, mModifier, mModifierToTModifier, tMember,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration,
				mModifierToTModifier__mModifier____source, mModifierToTModifier__tModifier____target,
				tMember__tModifier____tModifier };
	}

	public static final void pattern_MemberInEnumVisibility_11_5_registerobjects_expressionBBBBBBBBBBB(
			MemberInEnumVisibility _this, PerformRuleResult ruleresult, EObject mDefinition, EObject tModifier,
			EObject defToMember, EObject mModifier, EObject mModifierToTModifier, EObject tMember, EObject tClass,
			EObject mTypeToTType, EObject mClass) {
		_this.registerObjects_BWD(ruleresult, mDefinition, tModifier, defToMember, mModifier, mModifierToTModifier,
				tMember, tClass, mTypeToTType, mClass);

	}

	public static final PerformRuleResult pattern_MemberInEnumVisibility_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_12_1_preparereturnvalue_bindingFB(
			MemberInEnumVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MemberInEnumVisibility _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_12_1_preparereturnvalue_bindingAndBlackFFB(
			MemberInEnumVisibility _this) {
		Object[] result_pattern_MemberInEnumVisibility_12_1_preparereturnvalue_binding = pattern_MemberInEnumVisibility_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInEnumVisibility_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MemberInEnumVisibility_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInEnumVisibility_12_1_preparereturnvalue_black = pattern_MemberInEnumVisibility_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MemberInEnumVisibility_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MemberInEnumVisibility_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MemberInEnumVisibility";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MemberInEnumVisibility_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tModifier");
		EObject _localVariable_1 = match.getObject("tMember");
		EObject _localVariable_2 = match.getObject("tClass");
		EObject tmpTModifier = _localVariable_0;
		EObject tmpTMember = _localVariable_1;
		EObject tmpTClass = _localVariable_2;
		if (tmpTModifier instanceof TModifier) {
			TModifier tModifier = (TModifier) tmpTModifier;
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				if (tmpTClass instanceof TClass) {
					TClass tClass = (TClass) tmpTClass;
					return new Object[] { tModifier, tMember, tClass, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInEnumVisibility_12_2_corematch_blackFBFBBFFB(
			TModifier tModifier, TMember tMember, TClass tClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeToTAbstractType.class, "target")) {
			Type tmpMClass = mTypeToTType.getSource();
			if (tmpMClass instanceof EnumDeclaration) {
				EnumDeclaration mClass = (EnumDeclaration) tmpMClass;
				for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
					BodyDeclaration tmpMDefinition = defToMember.getSource();
					if (tmpMDefinition instanceof MDefinition) {
						MDefinition mDefinition = (MDefinition) tmpMDefinition;
						_result.add(new Object[] { mDefinition, tModifier, defToMember, tMember, tClass, mTypeToTType,
								mClass, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInEnumVisibility_12_3_findcontext_blackBBBBBBB(
			MDefinition mDefinition, TModifier tModifier, MDefinitionToTMember defToMember, TMember tMember,
			TClass tClass, TypeToTAbstractType mTypeToTType, EnumDeclaration mClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mDefinition.equals(defToMember.getSource())) {
			if (tModifier.equals(tMember.getTModifier())) {
				if (tClass.equals(mTypeToTType.getTarget())) {
					if (tMember.equals(defToMember.getTarget())) {
						if (tClass.getDefines().contains(tMember)) {
							if (mClass.equals(mTypeToTType.getSource())) {
								if (mClass.getBodyDeclarations().contains(mDefinition)) {
									_result.add(new Object[] { mDefinition, tModifier, defToMember, tMember, tClass,
											mTypeToTType, mClass });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(
			MDefinition mDefinition, TModifier tModifier, MDefinitionToTMember defToMember, TMember tMember,
			TClass tClass, TypeToTAbstractType mTypeToTType, EnumDeclaration mClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mClass__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String defToMember__mDefinition____source_name_prime = "source";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String mTypeToTType__tClass____target_name_prime = "target";
		String defToMember__tMember____target_name_prime = "target";
		String tClass__tMember____defines_name_prime = "defines";
		String tMember__tClass____definedBy_name_prime = "definedBy";
		String mTypeToTType__mClass____source_name_prime = "source";
		String mClass__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tModifier);
		isApplicableMatch.getAllContextElements().add(defToMember);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mClass);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		isApplicableMatch.getAllContextElements().add(tMember__tModifier____tModifier);
		mTypeToTType__tClass____target.setSrc(mTypeToTType);
		mTypeToTType__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tClass____target);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		tClass__tMember____defines.setSrc(tClass);
		tClass__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tClass__tMember____defines);
		tMember__tClass____definedBy.setSrc(tMember);
		tMember__tClass____definedBy.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tMember__tClass____definedBy);
		mTypeToTType__mClass____source.setSrc(mTypeToTType);
		mTypeToTType__mClass____source.setTrg(mClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mClass____source);
		mClass__mDefinition____bodyDeclarations.setSrc(mClass);
		mClass__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mClass__mDefinition____bodyDeclarations);
		mDefinition__mClass____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mClass____abstractTypeDeclaration.setTrg(mClass);
		isApplicableMatch.getAllContextElements().add(mDefinition__mClass____abstractTypeDeclaration);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		mTypeToTType__tClass____target.setName(mTypeToTType__tClass____target_name_prime);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		tClass__tMember____defines.setName(tClass__tMember____defines_name_prime);
		tMember__tClass____definedBy.setName(tMember__tClass____definedBy_name_prime);
		mTypeToTType__mClass____source.setName(mTypeToTType__mClass____source_name_prime);
		mClass__mDefinition____bodyDeclarations.setName(mClass__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mClass____abstractTypeDeclaration
				.setName(mDefinition__mClass____abstractTypeDeclaration_name_prime);
		return new Object[] { mDefinition, tModifier, defToMember, tMember, tClass, mTypeToTType, mClass,
				isApplicableMatch, defToMember__mDefinition____source, tMember__tModifier____tModifier,
				mTypeToTType__tClass____target, defToMember__tMember____target, tClass__tMember____defines,
				tMember__tClass____definedBy, mTypeToTType__mClass____source, mClass__mDefinition____bodyDeclarations,
				mDefinition__mClass____abstractTypeDeclaration };
	}

	public static final Object[] pattern_MemberInEnumVisibility_12_4_solveCSP_bindingFBBBBBBBBB(
			MemberInEnumVisibility _this, IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			TModifier tModifier, MDefinitionToTMember defToMember, TMember tMember, TClass tClass,
			TypeToTAbstractType mTypeToTType, EnumDeclaration mClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mDefinition, tModifier, defToMember,
				tMember, tClass, mTypeToTType, mClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, tModifier, defToMember, tMember, tClass,
					mTypeToTType, mClass };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInEnumVisibility_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInEnumVisibility _this, IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			TModifier tModifier, MDefinitionToTMember defToMember, TMember tMember, TClass tClass,
			TypeToTAbstractType mTypeToTType, EnumDeclaration mClass) {
		Object[] result_pattern_MemberInEnumVisibility_12_4_solveCSP_binding = pattern_MemberInEnumVisibility_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mDefinition, tModifier, defToMember, tMember, tClass, mTypeToTType, mClass);
		if (result_pattern_MemberInEnumVisibility_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInEnumVisibility_12_4_solveCSP_binding[0];

			Object[] result_pattern_MemberInEnumVisibility_12_4_solveCSP_black = pattern_MemberInEnumVisibility_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInEnumVisibility_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, tModifier, defToMember, tMember,
						tClass, mTypeToTType, mClass };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInEnumVisibility_12_5_checkCSP_expressionFBB(MemberInEnumVisibility _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MemberInEnumVisibility_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MemberInEnumVisibility";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MemberInEnumVisibility_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_20_1_preparereturnvalue_bindingFB(
			MemberInEnumVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MemberInEnumVisibility _this) {
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

	public static final Object[] pattern_MemberInEnumVisibility_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MemberInEnumVisibility _this) {
		Object[] result_pattern_MemberInEnumVisibility_20_1_preparereturnvalue_binding = pattern_MemberInEnumVisibility_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInEnumVisibility_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MemberInEnumVisibility_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInEnumVisibility_20_1_preparereturnvalue_black = pattern_MemberInEnumVisibility_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MemberInEnumVisibility_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MemberInEnumVisibility_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MemberInEnumVisibility_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MemberInEnumVisibility_20_2_testcorematchandDECs_black_nac_0BB(
			TModifier tModifier, TClass tClass) {
		for (TAbstractType __DEC_tModifier_tModifier_243409 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tClass.equals(__DEC_tModifier_tModifier_243409)) {
				return new Object[] { tModifier, tClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_20_2_testcorematchandDECs_black_nac_1BB(TClass tClass,
			TModifier tModifier) {
		if (tModifier.equals(tClass.getTModifier())) {
			return new Object[] { tClass, tModifier };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInEnumVisibility_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_tModifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMember = _edge_tModifier.getSrc();
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			EObject tmpTModifier = _edge_tModifier.getTrg();
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tModifier.equals(tMember.getTModifier())) {
					TAbstractType tmpTClass = tMember.getDefinedBy();
					if (tmpTClass instanceof TClass) {
						TClass tClass = (TClass) tmpTClass;
						if (pattern_MemberInEnumVisibility_20_2_testcorematchandDECs_black_nac_0BB(tModifier,
								tClass) == null) {
							if (pattern_MemberInEnumVisibility_20_2_testcorematchandDECs_black_nac_1BB(tClass,
									tModifier) == null) {
								_result.add(new Object[] { tModifier, tMember, tClass, _edge_tModifier });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MemberInEnumVisibility_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MemberInEnumVisibility _this, Match match, TModifier tModifier, TMember tMember, TClass tClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tModifier, tMember, tClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MemberInEnumVisibility_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MemberInEnumVisibility _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MemberInEnumVisibility_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_21_1_preparereturnvalue_bindingFB(
			MemberInEnumVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MemberInEnumVisibility _this) {
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

	public static final Object[] pattern_MemberInEnumVisibility_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MemberInEnumVisibility _this) {
		Object[] result_pattern_MemberInEnumVisibility_21_1_preparereturnvalue_binding = pattern_MemberInEnumVisibility_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInEnumVisibility_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MemberInEnumVisibility_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInEnumVisibility_21_1_preparereturnvalue_black = pattern_MemberInEnumVisibility_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MemberInEnumVisibility_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MemberInEnumVisibility_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MemberInEnumVisibility_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MemberInEnumVisibility_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_modifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMDefinition = _edge_modifier.getSrc();
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			EObject tmpMModifier = _edge_modifier.getTrg();
			if (tmpMModifier instanceof Modifier) {
				Modifier mModifier = (Modifier) tmpMModifier;
				if (mModifier.equals(mDefinition.getModifier())) {
					AbstractTypeDeclaration tmpMClass = mDefinition.getAbstractTypeDeclaration();
					if (tmpMClass instanceof EnumDeclaration) {
						EnumDeclaration mClass = (EnumDeclaration) tmpMClass;
						_result.add(new Object[] { mDefinition, mModifier, mClass, _edge_modifier });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MemberInEnumVisibility_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MemberInEnumVisibility _this, Match match, MDefinition mDefinition, Modifier mModifier,
			EnumDeclaration mClass) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mDefinition, mModifier, mClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MemberInEnumVisibility_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MemberInEnumVisibility _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MemberInEnumVisibility_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_24_1_prepare_blackB(MemberInEnumVisibility _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MemberInEnumVisibility_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_1 = targetMatch.getObject("tModifier");
		EObject _localVariable_2 = sourceMatch.getObject("mModifier");
		EObject _localVariable_3 = targetMatch.getObject("tMember");
		EObject _localVariable_4 = targetMatch.getObject("tClass");
		EObject _localVariable_5 = sourceMatch.getObject("mClass");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpTModifier = _localVariable_1;
		EObject tmpMModifier = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		EObject tmpTClass = _localVariable_4;
		EObject tmpMClass = _localVariable_5;
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tmpMModifier instanceof Modifier) {
					Modifier mModifier = (Modifier) tmpMModifier;
					if (tmpTMember instanceof TMember) {
						TMember tMember = (TMember) tmpTMember;
						if (tmpTClass instanceof TClass) {
							TClass tClass = (TClass) tmpTClass;
							if (tmpMClass instanceof EnumDeclaration) {
								EnumDeclaration mClass = (EnumDeclaration) tmpMClass;
								return new Object[] { mDefinition, tModifier, mModifier, tMember, tClass, mClass,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_blackBBBBBBBB(
			MDefinition mDefinition, TModifier tModifier, Modifier mModifier, TMember tMember, TClass tClass,
			EnumDeclaration mClass, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mDefinition, tModifier, mModifier, tMember, tClass, mClass, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_binding = pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_binding != null) {
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_binding[0];
			TModifier tModifier = (TModifier) result_pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_binding[1];
			Modifier mModifier = (Modifier) result_pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_binding[2];
			TMember tMember = (TMember) result_pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_binding[3];
			TClass tClass = (TClass) result_pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_binding[4];
			EnumDeclaration mClass = (EnumDeclaration) result_pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_black = pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_blackBBBBBBBB(
					mDefinition, tModifier, mModifier, tMember, tClass, mClass, sourceMatch, targetMatch);
			if (result_pattern_MemberInEnumVisibility_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mDefinition, tModifier, mModifier, tMember, tClass, mClass, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_24_3_solvecsp_bindingFBBBBBBBBB(
			MemberInEnumVisibility _this, MDefinition mDefinition, TModifier tModifier, Modifier mModifier,
			TMember tMember, TClass tClass, EnumDeclaration mClass, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(mDefinition, tModifier, mModifier, tMember, tClass,
				mClass, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, mDefinition, tModifier, mModifier, tMember, tClass, mClass, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInEnumVisibility_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			MemberInEnumVisibility _this, MDefinition mDefinition, TModifier tModifier, Modifier mModifier,
			TMember tMember, TClass tClass, EnumDeclaration mClass, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MemberInEnumVisibility_24_3_solvecsp_binding = pattern_MemberInEnumVisibility_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, mDefinition, tModifier, mModifier, tMember, tClass, mClass, sourceMatch, targetMatch);
		if (result_pattern_MemberInEnumVisibility_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInEnumVisibility_24_3_solvecsp_binding[0];

			Object[] result_pattern_MemberInEnumVisibility_24_3_solvecsp_black = pattern_MemberInEnumVisibility_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MemberInEnumVisibility_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mDefinition, tModifier, mModifier, tMember, tClass, mClass,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInEnumVisibility_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInEnumVisibility_24_5_matchcorrcontext_blackBFBBFBBB(
			MDefinition mDefinition, TMember tMember, TClass tClass, EnumDeclaration mClass, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
				if (tMember.equals(defToMember.getTarget())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tClass, TypeToTAbstractType.class, "target")) {
						if (mClass.equals(mTypeToTType.getSource())) {
							_result.add(new Object[] { mDefinition, defToMember, tMember, tClass, mTypeToTType, mClass,
									sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_24_5_matchcorrcontext_greenBBBBF(
			MDefinitionToTMember defToMember, TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MemberInEnumVisibility";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(defToMember);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { defToMember, mTypeToTType, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MemberInEnumVisibility_24_6_createcorrespondence_blackBBBBBBB(
			MDefinition mDefinition, TModifier tModifier, Modifier mModifier, TMember tMember, TClass tClass,
			EnumDeclaration mClass, CCMatch ccMatch) {
		return new Object[] { mDefinition, tModifier, mModifier, tMember, tClass, mClass, ccMatch };
	}

	public static final Object[] pattern_MemberInEnumVisibility_24_6_createcorrespondence_greenBBFB(TModifier tModifier,
			Modifier mModifier, CCMatch ccMatch) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		ccMatch.getCreateCorr().add(mModifierToTModifier);
		return new Object[] { tModifier, mModifier, mModifierToTModifier, ccMatch };
	}

	public static final Object[] pattern_MemberInEnumVisibility_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MemberInEnumVisibility_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MemberInEnumVisibility";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MemberInEnumVisibility_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_27_1_matchtggpattern_blackBBB(MDefinition mDefinition,
			Modifier mModifier, EnumDeclaration mClass) {
		if (mModifier.equals(mDefinition.getModifier())) {
			if (mClass.getBodyDeclarations().contains(mDefinition)) {
				return new Object[] { mDefinition, mModifier, mClass };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInEnumVisibility_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInEnumVisibility_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_28_1_matchtggpattern_black_nac_0BB(TModifier tModifier,
			TClass tClass) {
		for (TAbstractType __DEC_tModifier_tModifier_758850 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tClass.equals(__DEC_tModifier_tModifier_758850)) {
				return new Object[] { tModifier, tClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_28_1_matchtggpattern_black_nac_1BB(TClass tClass,
			TModifier tModifier) {
		if (tModifier.equals(tClass.getTModifier())) {
			return new Object[] { tClass, tModifier };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_28_1_matchtggpattern_blackBBB(TModifier tModifier,
			TMember tMember, TClass tClass) {
		if (tModifier.equals(tMember.getTModifier())) {
			if (tClass.getDefines().contains(tMember)) {
				if (pattern_MemberInEnumVisibility_28_1_matchtggpattern_black_nac_0BB(tModifier, tClass) == null) {
					if (pattern_MemberInEnumVisibility_28_1_matchtggpattern_black_nac_1BB(tClass, tModifier) == null) {
						return new Object[] { tModifier, tMember, tClass };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInEnumVisibility_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInEnumVisibility_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_29_1_createresult_blackB(MemberInEnumVisibility _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MemberInEnumVisibility_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MemberInEnumVisibility_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember defToMember) {
		if (ruleResult.getCorrObjects().contains(defToMember)) {
			return new Object[] { ruleResult, defToMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TClass tClass) {
		if (ruleResult.getTargetObjects().contains(tClass)) {
			return new Object[] { ruleResult, tClass };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, EnumDeclaration mClass) {
		if (ruleResult.getSourceObjects().contains(mClass)) {
			return new Object[] { ruleResult, mClass };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInEnumVisibility_29_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList defToMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpDefToMember : defToMemberList.getEntryObjects()) {
				if (tmpDefToMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
					BodyDeclaration tmpMDefinition = defToMember.getSource();
					if (tmpMDefinition instanceof MDefinition) {
						MDefinition mDefinition = (MDefinition) tmpMDefinition;
						TMember tMember = defToMember.getTarget();
						if (tMember != null) {
							AbstractTypeDeclaration tmpMClass = mDefinition.getAbstractTypeDeclaration();
							if (tmpMClass instanceof EnumDeclaration) {
								EnumDeclaration mClass = (EnumDeclaration) tmpMClass;
								TAbstractType tmpTClass = tMember.getDefinedBy();
								if (tmpTClass instanceof TClass) {
									TClass tClass = (TClass) tmpTClass;
									if (pattern_MemberInEnumVisibility_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											defToMember) == null) {
										if (pattern_MemberInEnumVisibility_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, mDefinition) == null) {
											if (pattern_MemberInEnumVisibility_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tMember) == null) {
												if (pattern_MemberInEnumVisibility_29_2_isapplicablecore_black_nac_5BB(
														ruleResult, mClass) == null) {
													if (pattern_MemberInEnumVisibility_29_2_isapplicablecore_black_nac_3BB(
															ruleResult, tClass) == null) {
														for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(mClass,
																		TypeToTAbstractType.class, "source")) {
															if (tClass.equals(mTypeToTType.getTarget())) {
																if (pattern_MemberInEnumVisibility_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, mTypeToTType) == null) {
																	_result.add(new Object[] { defToMemberList,
																			mDefinition, defToMember, tMember, tClass,
																			mTypeToTType, mClass, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_29_3_solveCSP_bindingFBBBBBBBBB(
			MemberInEnumVisibility _this, IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			MDefinitionToTMember defToMember, TMember tMember, TClass tClass, TypeToTAbstractType mTypeToTType,
			EnumDeclaration mClass, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mDefinition, defToMember, tMember,
				tClass, mTypeToTType, mClass, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, defToMember, tMember, tClass,
					mTypeToTType, mClass, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MemberInEnumVisibility_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInEnumVisibility_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInEnumVisibility _this, IsApplicableMatch isApplicableMatch, MDefinition mDefinition,
			MDefinitionToTMember defToMember, TMember tMember, TClass tClass, TypeToTAbstractType mTypeToTType,
			EnumDeclaration mClass, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MemberInEnumVisibility_29_3_solveCSP_binding = pattern_MemberInEnumVisibility_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mDefinition, defToMember, tMember, tClass, mTypeToTType, mClass, ruleResult);
		if (result_pattern_MemberInEnumVisibility_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInEnumVisibility_29_3_solveCSP_binding[0];

			Object[] result_pattern_MemberInEnumVisibility_29_3_solveCSP_black = pattern_MemberInEnumVisibility_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInEnumVisibility_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, defToMember, tMember, tClass,
						mTypeToTType, mClass, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInEnumVisibility_29_4_checkCSP_expressionFBB(MemberInEnumVisibility _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInEnumVisibility_29_5_checknacs_blackBBBBBB(MDefinition mDefinition,
			MDefinitionToTMember defToMember, TMember tMember, TClass tClass, TypeToTAbstractType mTypeToTType,
			EnumDeclaration mClass) {
		return new Object[] { mDefinition, defToMember, tMember, tClass, mTypeToTType, mClass };
	}

	public static final Object[] pattern_MemberInEnumVisibility_29_6_perform_blackBBBBBBB(MDefinition mDefinition,
			MDefinitionToTMember defToMember, TMember tMember, TClass tClass, TypeToTAbstractType mTypeToTType,
			EnumDeclaration mClass, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mDefinition, defToMember, tMember, tClass, mTypeToTType, mClass, ruleResult };
	}

	public static final Object[] pattern_MemberInEnumVisibility_29_6_perform_greenBFFFBBB(MDefinition mDefinition,
			TMember tMember, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Object _localVariable_0 = csp.getValue("tModifier", "isStatic");
		Object _localVariable_1 = csp.getValue("tModifier", "tVisibility");
		Object _localVariable_2 = csp.getValue("mModifier", "static");
		Object _localVariable_3 = csp.getValue("mModifier", "visibility");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		tMember.setTModifier(tModifier);
		ruleResult.getTargetObjects().add(tModifier);
		mDefinition.setModifier(mModifier);
		ruleResult.getSourceObjects().add(mModifier);
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		ruleResult.getCorrObjects().add(mModifierToTModifier);
		boolean tModifier_isStatic_prime = (boolean) _localVariable_0;
		TVisibility tModifier_tVisibility_prime = (TVisibility) _localVariable_1;
		boolean mModifier_static_prime = (boolean) _localVariable_2;
		VisibilityKind mModifier_visibility_prime = (VisibilityKind) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		tModifier.setTVisibility(tModifier_tVisibility_prime);
		mModifier.setStatic(Boolean.valueOf(mModifier_static_prime));
		mModifier.setVisibility(mModifier_visibility_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mDefinition, tModifier, mModifier, mModifierToTModifier, tMember, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MemberInEnumVisibility_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MemberInEnumVisibilityImpl
