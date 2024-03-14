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
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.Modifier;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.VisibilityKind;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MDefinition;

import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.MModifierToTModifier;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.MemberInClassVisibility;
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
 * An implementation of the model object '<em><b>Member In Class Visibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MemberInClassVisibilityImpl extends AbstractRuleImpl implements MemberInClassVisibility {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberInClassVisibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMemberInClassVisibility();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {

		Object[] result1_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_0_1_initialbindings_blackBBBBB(this, match, mClass, mDefinition,
						mModifier);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mClass] = " + mClass + ", " + "[mDefinition] = " + mDefinition
					+ ", " + "[mModifier] = " + mModifier + ".");
		}

		Object[] result2_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mClass, mDefinition,
						mModifier);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mClass] = " + mClass + ", " + "[mDefinition] = " + mDefinition
					+ ", " + "[mModifier] = " + mModifier + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_0_4_collectelementstobetranslated_blackBBBB(match, mClass,
							mDefinition, mModifier);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mClass] = " + mClass + ", " + "[mDefinition] = " + mDefinition + ", " + "[mModifier] = "
						+ mModifier + ".");
			}
			MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_0_4_collectelementstobetranslated_greenBBBFF(
					match, mDefinition, mModifier);
			//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_0_5_collectcontextelements_blackBBBB(match, mClass, mDefinition,
							mModifier);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mClass] = " + mClass + ", " + "[mDefinition] = " + mDefinition + ", " + "[mModifier] = "
						+ mModifier + ".");
			}
			MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_0_5_collectcontextelements_greenBBBFF(match,
					mClass, mDefinition);
			//nothing EMoflonEdge mClass__mDefinition____bodyDeclarations = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = (EMoflonEdge) result5_green[4];

			// 
			MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, mClass, mDefinition, mModifier);
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_0_7_expressionF();
		} else {
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TClass tClass = (TClass) result1_bindingAndBlack[0];
		ClassDeclaration mClass = (ClassDeclaration) result1_bindingAndBlack[1];
		TMember tMember = (TMember) result1_bindingAndBlack[2];
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[3];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[4];
		Modifier mModifier = (Modifier) result1_bindingAndBlack[5];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_1_1_performtransformation_greenFBBFB(tMember, mModifier, csp);
		TModifier tModifier = (TModifier) result1_green[0];
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[3];

		Object[] result2_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_1_2_collecttranslatedelements_blackBBB(tModifier, mModifier,
						mModifierToTModifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tModifier] = " + tModifier + ", "
					+ "[mModifier] = " + mModifier + ", " + "[mModifierToTModifier] = " + mModifierToTModifier + ".");
		}
		Object[] result2_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_1_2_collecttranslatedelements_greenFBBB(tModifier, mModifier,
						mModifierToTModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, tClass, tModifier,
						mClass, tMember, defToMember, mDefinition, mModifier, mModifierToTModifier, mTypeToTType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tClass] = " + tClass + ", " + "[tModifier] = " + tModifier + ", " + "[mClass] = "
					+ mClass + ", " + "[tMember] = " + tMember + ", " + "[defToMember] = " + defToMember + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[mModifier] = " + mModifier + ", "
					+ "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[mTypeToTType] = " + mTypeToTType
					+ ".");
		}
		MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				tModifier, tMember, mDefinition, mModifier, mModifierToTModifier);
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[10];

		// 
		// 
		MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, tClass, tModifier, mClass, tMember, defToMember, mDefinition, mModifier,
				mModifierToTModifier, mTypeToTType);
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassDeclaration mClass = (ClassDeclaration) result2_binding[0];
		MDefinition mDefinition = (MDefinition) result2_binding[1];
		Modifier mModifier = (Modifier) result2_binding[2];
		for (Object[] result2_black : MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_2_2_corematch_blackFBFFBBFB(mClass, mDefinition, mModifier, match)) {
			TClass tClass = (TClass) result2_black[0];
			TMember tMember = (TMember) result2_black[2];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[3];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_2_3_findcontext_blackBBBBBBB(tClass, mClass, tMember, defToMember,
							mDefinition, mModifier, mTypeToTType)) {
				Object[] result3_green = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_2_3_findcontext_greenBBBBBBBFFFFFFFFFFF(tClass, mClass,
								tMember, defToMember, mDefinition, mModifier, mTypeToTType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mClass__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tClass__tMember____defines = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tMember__tClass____definedBy = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mTypeToTType__tClass____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mTypeToTType__mClass____source = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								tClass, mClass, tMember, defToMember, mDefinition, mModifier, mTypeToTType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
							+ "[mClass] = " + mClass + ", " + "[tMember] = " + tMember + ", " + "[defToMember] = "
							+ defToMember + ", " + "[mDefinition] = " + mDefinition + ", " + "[mModifier] = "
							+ mModifier + ", " + "[mTypeToTType] = " + mTypeToTType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MemberInClassVisibilityImpl
							.pattern_MemberInClassVisibility_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {
		match.registerObject("mClass", mClass);
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mModifier", mModifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TClass tClass, ClassDeclaration mClass,
			TMember tMember, MDefinitionToTMember defToMember, MDefinition mDefinition, Modifier mModifier,
			TypeToTAbstractType mTypeToTType) {// Create CSP
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
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("mClass", mClass);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mModifier", mModifier);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tClass, EObject tModifier, EObject mClass,
			EObject tMember, EObject defToMember, EObject mDefinition, EObject mModifier, EObject mModifierToTModifier,
			EObject mTypeToTType) {
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("mClass", mClass);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("defToMember", defToMember);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);

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
	public boolean isAppropriate_BWD(Match match, TClass tClass, TModifier tModifier, TMember tMember) {

		Object[] result1_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_10_1_initialbindings_blackBBBBB(this, match, tClass, tModifier,
						tMember);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tClass] = " + tClass + ", " + "[tModifier] = " + tModifier + ", "
					+ "[tMember] = " + tMember + ".");
		}

		Object[] result2_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tClass, tModifier,
						tMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tClass] = " + tClass + ", " + "[tModifier] = " + tModifier + ", "
					+ "[tMember] = " + tMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_10_4_collectelementstobetranslated_blackBBBB(match, tClass,
							tModifier, tMember);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tClass] = "
								+ tClass + ", " + "[tModifier] = " + tModifier + ", " + "[tMember] = " + tMember + ".");
			}
			MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_10_4_collectelementstobetranslated_greenBBBF(
					match, tModifier, tMember);
			//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_10_5_collectcontextelements_blackBBBB(match, tClass, tModifier,
							tMember);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tClass] = "
								+ tClass + ", " + "[tModifier] = " + tModifier + ", " + "[tMember] = " + tMember + ".");
			}
			MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_10_5_collectcontextelements_greenBBBFF(match,
					tClass, tMember);
			//nothing EMoflonEdge tClass__tMember____defines = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tMember__tClass____definedBy = (EMoflonEdge) result5_green[4];

			// 
			MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, tClass, tModifier, tMember);
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_10_7_expressionF();
		} else {
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TClass tClass = (TClass) result1_bindingAndBlack[0];
		TModifier tModifier = (TModifier) result1_bindingAndBlack[1];
		ClassDeclaration mClass = (ClassDeclaration) result1_bindingAndBlack[2];
		TMember tMember = (TMember) result1_bindingAndBlack[3];
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[4];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[5];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_11_1_performtransformation_greenBBFFB(tModifier, mDefinition, csp);
		Modifier mModifier = (Modifier) result1_green[2];
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[3];

		Object[] result2_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_11_2_collecttranslatedelements_blackBBB(tModifier, mModifier,
						mModifierToTModifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tModifier] = " + tModifier + ", "
					+ "[mModifier] = " + mModifier + ", " + "[mModifierToTModifier] = " + mModifierToTModifier + ".");
		}
		Object[] result2_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_11_2_collecttranslatedelements_greenFBBB(tModifier, mModifier,
						mModifierToTModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, tClass, tModifier,
						mClass, tMember, defToMember, mDefinition, mModifier, mModifierToTModifier, mTypeToTType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tClass] = " + tClass + ", " + "[tModifier] = " + tModifier + ", " + "[mClass] = "
					+ mClass + ", " + "[tMember] = " + tMember + ", " + "[defToMember] = " + defToMember + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[mModifier] = " + mModifier + ", "
					+ "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[mTypeToTType] = " + mTypeToTType
					+ ".");
		}
		MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, tModifier, tMember, mDefinition, mModifier, mModifierToTModifier);
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[10];

		// 
		// 
		MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, tClass, tModifier, mClass, tMember, defToMember, mDefinition, mModifier,
				mModifierToTModifier, mTypeToTType);
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tClass = (TClass) result2_binding[0];
		TModifier tModifier = (TModifier) result2_binding[1];
		TMember tMember = (TMember) result2_binding[2];
		for (Object[] result2_black : MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_12_2_corematch_blackBBFBFFFB(tClass, tModifier, tMember, match)) {
			ClassDeclaration mClass = (ClassDeclaration) result2_black[2];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[4];
			MDefinition mDefinition = (MDefinition) result2_black[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_12_3_findcontext_blackBBBBBBB(tClass, tModifier, mClass, tMember,
							defToMember, mDefinition, mTypeToTType)) {
				Object[] result3_green = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(tClass, tModifier,
								mClass, tMember, defToMember, mDefinition, mTypeToTType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mClass__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tClass__tMember____defines = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tMember__tClass____definedBy = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mTypeToTType__tClass____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mTypeToTType__mClass____source = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, tClass, tModifier, mClass, tMember, defToMember, mDefinition,
								mTypeToTType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
							+ "[tModifier] = " + tModifier + ", " + "[mClass] = " + mClass + ", " + "[tMember] = "
							+ tMember + ", " + "[defToMember] = " + defToMember + ", " + "[mDefinition] = "
							+ mDefinition + ", " + "[mTypeToTType] = " + mTypeToTType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = MemberInClassVisibilityImpl
							.pattern_MemberInClassVisibility_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tClass, TModifier tModifier, TMember tMember) {
		match.registerObject("tClass", tClass);
		match.registerObject("tModifier", tModifier);
		match.registerObject("tMember", tMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tClass, TModifier tModifier, TMember tMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TClass tClass, TModifier tModifier,
			ClassDeclaration mClass, TMember tMember, MDefinitionToTMember defToMember, MDefinition mDefinition,
			TypeToTAbstractType mTypeToTType) {// Create CSP
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
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("tModifier", tModifier);
		isApplicableMatch.registerObject("mClass", mClass);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tClass, EObject tModifier, EObject mClass,
			EObject tMember, EObject defToMember, EObject mDefinition, EObject mModifier, EObject mModifierToTModifier,
			EObject mTypeToTType) {
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("mClass", mClass);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("defToMember", defToMember);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_631(EMoflonEdge _edge_tModifier) {

		Object[] result1_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_20_2_testcorematchandDECs_blackFFFB(_edge_tModifier)) {
			TClass tClass = (TClass) result2_black[0];
			TModifier tModifier = (TModifier) result2_black[1];
			TMember tMember = (TMember) result2_black[2];
			Object[] result2_green = MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tClass, tModifier, tMember)) {
				// 
				if (MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MemberInClassVisibilityImpl
							.pattern_MemberInClassVisibility_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_678(EMoflonEdge _edge_modifier) {

		Object[] result1_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_21_2_testcorematchandDECs_blackFFFB(_edge_modifier)) {
			ClassDeclaration mClass = (ClassDeclaration) result2_black[0];
			MDefinition mDefinition = (MDefinition) result2_black[1];
			Modifier mModifier = (Modifier) result2_black[2];
			Object[] result2_green = MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, mClass, mDefinition, mModifier)) {
				// 
				if (MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MemberInClassVisibilityImpl
							.pattern_MemberInClassVisibility_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MemberInClassVisibility");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

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

		eq0.setRuleName("MemberInClassVisibility");
		eq0.solve(var_mModifier_static, var_tModifier_isStatic);

		defaultVisibility1.setRuleName("MemberInClassVisibility");
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
		ruleResult.setRule("MemberInClassVisibility");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

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

		eq0.setRuleName("MemberInClassVisibility");
		eq0.solve(var_mModifier_static, var_tModifier_isStatic);

		defaultVisibility1.setRuleName("MemberInClassVisibility");
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

		Object[] result1_black = MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TClass tClass = (TClass) result2_bindingAndBlack[0];
		TModifier tModifier = (TModifier) result2_bindingAndBlack[1];
		ClassDeclaration mClass = (ClassDeclaration) result2_bindingAndBlack[2];
		TMember tMember = (TMember) result2_bindingAndBlack[3];
		MDefinition mDefinition = (MDefinition) result2_bindingAndBlack[4];
		Modifier mModifier = (Modifier) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tClass, tModifier,
						mClass, tMember, mDefinition, mModifier, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ", " + "[tModifier] = " + tModifier + ", " + "[mClass] = " + mClass
					+ ", " + "[tMember] = " + tMember + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mModifier] = " + mModifier + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_24_5_matchcorrcontext_blackBBBFBFBB(tClass, mClass, tMember,
							mDefinition, sourceMatch, targetMatch)) {
				MDefinitionToTMember defToMember = (MDefinitionToTMember) result5_black[3];
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[5];
				Object[] result5_green = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_24_5_matchcorrcontext_greenBBBBF(defToMember, mTypeToTType,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_24_6_createcorrespondence_blackBBBBBBB(tClass, tModifier,
								mClass, tMember, mDefinition, mModifier, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass
							+ ", " + "[tModifier] = " + tModifier + ", " + "[mClass] = " + mClass + ", "
							+ "[tMember] = " + tMember + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mModifier] = " + mModifier + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_24_6_createcorrespondence_greenBBFB(
						tModifier, mModifier, ccMatch);
				//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[2];

				Object[] result7_black = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TClass tClass, TModifier tModifier, ClassDeclaration mClass, TMember tMember,
			MDefinition mDefinition, Modifier mModifier, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(ClassDeclaration mClass, MDefinition mDefinition, Modifier mModifier) {// 
		Object[] result1_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_27_1_matchtggpattern_blackBBB(mClass, mDefinition, mModifier);
		if (result1_black != null) {
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_27_2_expressionF();
		} else {
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tClass, TModifier tModifier, TMember tMember) {// 
		Object[] result1_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_28_1_matchtggpattern_blackBBB(tClass, tModifier, tMember);
		if (result1_black != null) {
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_28_2_expressionF();
		} else {
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember defToMemberParameter) {

		Object[] result1_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_29_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList defToMemberList = (RuleEntryList) result2_black[0];
			TClass tClass = (TClass) result2_black[1];
			TMember tMember = (TMember) result2_black[2];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[3];
			MDefinition mDefinition = (MDefinition) result2_black[4];
			ClassDeclaration mClass = (ClassDeclaration) result2_black[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[6];

			Object[] result3_bindingAndBlack = MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							tClass, mClass, tMember, defToMember, mDefinition, mTypeToTType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
						+ "[mClass] = " + mClass + ", " + "[tMember] = " + tMember + ", " + "[defToMember] = "
						+ defToMember + ", " + "[mDefinition] = " + mDefinition + ", " + "[mTypeToTType] = "
						+ mTypeToTType + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_29_5_checknacs_blackBBBBBB(tClass, mClass, tMember,
								defToMember, mDefinition, mTypeToTType);
				if (result5_black != null) {

					Object[] result6_black = MemberInClassVisibilityImpl
							.pattern_MemberInClassVisibility_29_6_perform_blackBBBBBBB(tClass, mClass, tMember,
									defToMember, mDefinition, mTypeToTType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass
								+ ", " + "[mClass] = " + mClass + ", " + "[tMember] = " + tMember + ", "
								+ "[defToMember] = " + defToMember + ", " + "[mDefinition] = " + mDefinition + ", "
								+ "[mTypeToTType] = " + mTypeToTType + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_29_6_perform_greenFBBFFBB(tMember,
							mDefinition, ruleResult, csp);
					//nothing TModifier tModifier = (TModifier) result6_green[0];
					//nothing Modifier mModifier = (Modifier) result6_green[3];
					//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TClass tClass, ClassDeclaration mClass,
			TMember tMember, MDefinitionToTMember defToMember, MDefinition mDefinition,
			TypeToTAbstractType mTypeToTType, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("mClass", mClass);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
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
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_FWD__MATCH_CLASSDECLARATION_MDEFINITION_MODIFIER:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (Modifier) arguments.get(3));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDECLARATION_MDEFINITION_MODIFIER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (Modifier) arguments.get(3));
			return null;
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDECLARATION_MDEFINITION_MODIFIER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (Modifier) arguments.get(3));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TCLASS_CLASSDECLARATION_TMEMBER_MDEFINITIONTOTMEMBER_MDEFINITION_MODIFIER_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (TMember) arguments.get(3),
					(MDefinitionToTMember) arguments.get(4), (MDefinition) arguments.get(5),
					(Modifier) arguments.get(6), (TypeToTAbstractType) arguments.get(7));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_BWD__MATCH_TCLASS_TMODIFIER_TMEMBER:
			return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TModifier) arguments.get(2),
					(TMember) arguments.get(3));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TMODIFIER_TMEMBER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TModifier) arguments.get(2), (TMember) arguments.get(3));
			return null;
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TMODIFIER_TMEMBER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TModifier) arguments.get(2), (TMember) arguments.get(3));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCLASS_TMODIFIER_CLASSDECLARATION_TMEMBER_MDEFINITIONTOTMEMBER_MDEFINITION_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
					(TModifier) arguments.get(2), (ClassDeclaration) arguments.get(3), (TMember) arguments.get(4),
					(MDefinitionToTMember) arguments.get(5), (MDefinition) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_BWD_EMOFLON_EDGE_631__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_631((EMoflonEdge) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_678__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_678((EMoflonEdge) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_CC__TCLASS_TMODIFIER_CLASSDECLARATION_TMEMBER_MDEFINITION_MODIFIER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TClass) arguments.get(0), (TModifier) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (TMember) arguments.get(3), (MDefinition) arguments.get(4),
					(Modifier) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___CHECK_DEC_FWD__CLASSDECLARATION_MDEFINITION_MODIFIER:
			return checkDEC_FWD((ClassDeclaration) arguments.get(0), (MDefinition) arguments.get(1),
					(Modifier) arguments.get(2));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___CHECK_DEC_BWD__TCLASS_TMODIFIER_TMEMBER:
			return checkDEC_BWD((TClass) arguments.get(0), (TModifier) arguments.get(1), (TMember) arguments.get(2));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCLASS_CLASSDECLARATION_TMEMBER_MDEFINITIONTOTMEMBER_MDEFINITION_TYPETOTABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (TMember) arguments.get(3),
					(MDefinitionToTMember) arguments.get(4), (MDefinition) arguments.get(5),
					(TypeToTAbstractType) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MemberInClassVisibility_0_1_initialbindings_blackBBBBB(
			MemberInClassVisibility _this, Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {
		return new Object[] { _this, match, mClass, mDefinition, mModifier };
	}

	public static final Object[] pattern_MemberInClassVisibility_0_2_SolveCSP_bindingFBBBBB(
			MemberInClassVisibility _this, Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mClass, mDefinition, mModifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mClass, mDefinition, mModifier };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_0_2_SolveCSP_bindingAndBlackFBBBBB(
			MemberInClassVisibility _this, Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {
		Object[] result_pattern_MemberInClassVisibility_0_2_SolveCSP_binding = pattern_MemberInClassVisibility_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mClass, mDefinition, mModifier);
		if (result_pattern_MemberInClassVisibility_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInClassVisibility_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MemberInClassVisibility_0_2_SolveCSP_black = pattern_MemberInClassVisibility_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MemberInClassVisibility_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mClass, mDefinition, mModifier };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_0_3_CheckCSP_expressionFBB(
			MemberInClassVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_0_4_collectelementstobetranslated_blackBBBB(
			Match match, ClassDeclaration mClass, MDefinition mDefinition, Modifier mModifier) {
		return new Object[] { match, mClass, mDefinition, mModifier };
	}

	public static final Object[] pattern_MemberInClassVisibility_0_4_collectelementstobetranslated_greenBBBFF(
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

	public static final Object[] pattern_MemberInClassVisibility_0_5_collectcontextelements_blackBBBB(Match match,
			ClassDeclaration mClass, MDefinition mDefinition, Modifier mModifier) {
		return new Object[] { match, mClass, mDefinition, mModifier };
	}

	public static final Object[] pattern_MemberInClassVisibility_0_5_collectcontextelements_greenBBBFF(Match match,
			ClassDeclaration mClass, MDefinition mDefinition) {
		EMoflonEdge mClass__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mClass);
		match.getContextNodes().add(mDefinition);
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
		return new Object[] { match, mClass, mDefinition, mClass__mDefinition____bodyDeclarations,
				mDefinition__mClass____abstractTypeDeclaration };
	}

	public static final void pattern_MemberInClassVisibility_0_6_registerobjectstomatch_expressionBBBBB(
			MemberInClassVisibility _this, Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {
		_this.registerObjectsToMatch_FWD(match, mClass, mDefinition, mModifier);

	}

	public static final boolean pattern_MemberInClassVisibility_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInClassVisibility_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("mClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("defToMember");
		EObject _localVariable_4 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("mModifier");
		EObject _localVariable_6 = isApplicableMatch.getObject("mTypeToTType");
		EObject tmpTClass = _localVariable_0;
		EObject tmpMClass = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpDefToMember = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		EObject tmpMModifier = _localVariable_5;
		EObject tmpMTypeToTType = _localVariable_6;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpMClass instanceof ClassDeclaration) {
				ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					if (tmpDefToMember instanceof MDefinitionToTMember) {
						MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
						if (tmpMDefinition instanceof MDefinition) {
							MDefinition mDefinition = (MDefinition) tmpMDefinition;
							if (tmpMModifier instanceof Modifier) {
								Modifier mModifier = (Modifier) tmpMModifier;
								if (tmpMTypeToTType instanceof TypeToTAbstractType) {
									TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
									return new Object[] { tClass, mClass, tMember, defToMember, mDefinition, mModifier,
											mTypeToTType, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_1_1_performtransformation_blackBBBBBBBFBB(
			TClass tClass, ClassDeclaration mClass, TMember tMember, MDefinitionToTMember defToMember,
			MDefinition mDefinition, Modifier mModifier, TypeToTAbstractType mTypeToTType,
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tClass, mClass, tMember, defToMember, mDefinition, mModifier, mTypeToTType, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MemberInClassVisibility_1_1_performtransformation_binding = pattern_MemberInClassVisibility_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MemberInClassVisibility_1_1_performtransformation_binding != null) {
			TClass tClass = (TClass) result_pattern_MemberInClassVisibility_1_1_performtransformation_binding[0];
			ClassDeclaration mClass = (ClassDeclaration) result_pattern_MemberInClassVisibility_1_1_performtransformation_binding[1];
			TMember tMember = (TMember) result_pattern_MemberInClassVisibility_1_1_performtransformation_binding[2];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_MemberInClassVisibility_1_1_performtransformation_binding[3];
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInClassVisibility_1_1_performtransformation_binding[4];
			Modifier mModifier = (Modifier) result_pattern_MemberInClassVisibility_1_1_performtransformation_binding[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MemberInClassVisibility_1_1_performtransformation_binding[6];

			Object[] result_pattern_MemberInClassVisibility_1_1_performtransformation_black = pattern_MemberInClassVisibility_1_1_performtransformation_blackBBBBBBBFBB(
					tClass, mClass, tMember, defToMember, mDefinition, mModifier, mTypeToTType, _this,
					isApplicableMatch);
			if (result_pattern_MemberInClassVisibility_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MemberInClassVisibility_1_1_performtransformation_black[7];

				return new Object[] { tClass, mClass, tMember, defToMember, mDefinition, mModifier, mTypeToTType, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_1_1_performtransformation_greenFBBFB(TMember tMember,
			Modifier mModifier, CSP csp) {
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
		return new Object[] { tModifier, tMember, mModifier, mModifierToTModifier, csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_1_2_collecttranslatedelements_blackBBB(
			TModifier tModifier, Modifier mModifier, MModifierToTModifier mModifierToTModifier) {
		return new Object[] { tModifier, mModifier, mModifierToTModifier };
	}

	public static final Object[] pattern_MemberInClassVisibility_1_2_collecttranslatedelements_greenFBBB(
			TModifier tModifier, Modifier mModifier, MModifierToTModifier mModifierToTModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tModifier);
		ruleresult.getTranslatedElements().add(mModifier);
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		return new Object[] { ruleresult, tModifier, mModifier, mModifierToTModifier };
	}

	public static final Object[] pattern_MemberInClassVisibility_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tClass, EObject tModifier, EObject mClass, EObject tMember,
			EObject defToMember, EObject mDefinition, EObject mModifier, EObject mModifierToTModifier,
			EObject mTypeToTType) {
		if (!tClass.equals(tModifier)) {
			if (!tClass.equals(tMember)) {
				if (!mClass.equals(tClass)) {
					if (!mClass.equals(tModifier)) {
						if (!mClass.equals(tMember)) {
							if (!mClass.equals(mDefinition)) {
								if (!mClass.equals(mModifier)) {
									if (!mClass.equals(mModifierToTModifier)) {
										if (!mClass.equals(mTypeToTType)) {
											if (!tMember.equals(tModifier)) {
												if (!defToMember.equals(tClass)) {
													if (!defToMember.equals(tModifier)) {
														if (!defToMember.equals(mClass)) {
															if (!defToMember.equals(tMember)) {
																if (!defToMember.equals(mDefinition)) {
																	if (!defToMember.equals(mModifier)) {
																		if (!defToMember.equals(mModifierToTModifier)) {
																			if (!defToMember.equals(mTypeToTType)) {
																				if (!mDefinition.equals(tClass)) {
																					if (!mDefinition
																							.equals(tModifier)) {
																						if (!mDefinition
																								.equals(tMember)) {
																							if (!mDefinition.equals(
																									mModifier)) {
																								if (!mDefinition.equals(
																										mModifierToTModifier)) {
																									if (!mDefinition
																											.equals(mTypeToTType)) {
																										if (!mModifier
																												.equals(tClass)) {
																											if (!mModifier
																													.equals(tModifier)) {
																												if (!mModifier
																														.equals(tMember)) {
																													if (!mModifier
																															.equals(mModifierToTModifier)) {
																														if (!mModifier
																																.equals(mTypeToTType)) {
																															if (!mModifierToTModifier
																																	.equals(tClass)) {
																																if (!mModifierToTModifier
																																		.equals(tModifier)) {
																																	if (!mModifierToTModifier
																																			.equals(tMember)) {
																																		if (!mModifierToTModifier
																																				.equals(mTypeToTType)) {
																																			if (!mTypeToTType
																																					.equals(tClass)) {
																																				if (!mTypeToTType
																																						.equals(tModifier)) {
																																					if (!mTypeToTType
																																							.equals(tMember)) {
																																						return new Object[] {
																																								ruleresult,
																																								tClass,
																																								tModifier,
																																								mClass,
																																								tMember,
																																								defToMember,
																																								mDefinition,
																																								mModifier,
																																								mModifierToTModifier,
																																								mTypeToTType };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MemberInClassVisibility_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tModifier, EObject tMember, EObject mDefinition, EObject mModifier,
			EObject mModifierToTModifier) {
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MemberInClassVisibility";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getTranslatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(tMember__tModifier____tModifier);
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		return new Object[] { ruleresult, tModifier, tMember, mDefinition, mModifier, mModifierToTModifier,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration,
				tMember__tModifier____tModifier, mModifierToTModifier__mModifier____source,
				mModifierToTModifier__tModifier____target };
	}

	public static final void pattern_MemberInClassVisibility_1_5_registerobjects_expressionBBBBBBBBBBB(
			MemberInClassVisibility _this, PerformRuleResult ruleresult, EObject tClass, EObject tModifier,
			EObject mClass, EObject tMember, EObject defToMember, EObject mDefinition, EObject mModifier,
			EObject mModifierToTModifier, EObject mTypeToTType) {
		_this.registerObjects_FWD(ruleresult, tClass, tModifier, mClass, tMember, defToMember, mDefinition, mModifier,
				mModifierToTModifier, mTypeToTType);

	}

	public static final PerformRuleResult pattern_MemberInClassVisibility_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_2_1_preparereturnvalue_bindingFB(
			MemberInClassVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MemberInClassVisibility _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_2_1_preparereturnvalue_bindingAndBlackFFB(
			MemberInClassVisibility _this) {
		Object[] result_pattern_MemberInClassVisibility_2_1_preparereturnvalue_binding = pattern_MemberInClassVisibility_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInClassVisibility_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MemberInClassVisibility_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInClassVisibility_2_1_preparereturnvalue_black = pattern_MemberInClassVisibility_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MemberInClassVisibility_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MemberInClassVisibility_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MemberInClassVisibility";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MemberInClassVisibility_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mClass");
		EObject _localVariable_1 = match.getObject("mDefinition");
		EObject _localVariable_2 = match.getObject("mModifier");
		EObject tmpMClass = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpMModifier = _localVariable_2;
		if (tmpMClass instanceof ClassDeclaration) {
			ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (tmpMModifier instanceof Modifier) {
					Modifier mModifier = (Modifier) tmpMModifier;
					return new Object[] { mClass, mDefinition, mModifier, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_2_2_corematch_blackFBFFBBFB(
			ClassDeclaration mClass, MDefinition mDefinition, Modifier mModifier, Match match) {
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
						_result.add(new Object[] { tClass, mClass, tMember, defToMember, mDefinition, mModifier,
								mTypeToTType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_2_3_findcontext_blackBBBBBBB(TClass tClass,
			ClassDeclaration mClass, TMember tMember, MDefinitionToTMember defToMember, MDefinition mDefinition,
			Modifier mModifier, TypeToTAbstractType mTypeToTType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMember.equals(defToMember.getTarget())) {
			if (mClass.getBodyDeclarations().contains(mDefinition)) {
				if (mDefinition.equals(defToMember.getSource())) {
					if (mModifier.equals(mDefinition.getModifier())) {
						if (tClass.getDefines().contains(tMember)) {
							if (tClass.equals(mTypeToTType.getTarget())) {
								if (mClass.equals(mTypeToTType.getSource())) {
									_result.add(new Object[] { tClass, mClass, tMember, defToMember, mDefinition,
											mModifier, mTypeToTType });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_2_3_findcontext_greenBBBBBBBFFFFFFFFFFF(TClass tClass,
			ClassDeclaration mClass, TMember tMember, MDefinitionToTMember defToMember, MDefinition mDefinition,
			Modifier mModifier, TypeToTAbstractType mTypeToTType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mClass__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String defToMember__tMember____target_name_prime = "target";
		String mClass__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String defToMember__mDefinition____source_name_prime = "source";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String tClass__tMember____defines_name_prime = "defines";
		String tMember__tClass____definedBy_name_prime = "definedBy";
		String mTypeToTType__tClass____target_name_prime = "target";
		String mTypeToTType__mClass____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(mClass);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mModifier);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		mClass__mDefinition____bodyDeclarations.setSrc(mClass);
		mClass__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mClass__mDefinition____bodyDeclarations);
		mDefinition__mClass____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mClass____abstractTypeDeclaration.setTrg(mClass);
		isApplicableMatch.getAllContextElements().add(mDefinition__mClass____abstractTypeDeclaration);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		isApplicableMatch.getAllContextElements().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mModifier__mDefinition____bodyDeclaration);
		tClass__tMember____defines.setSrc(tClass);
		tClass__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tClass__tMember____defines);
		tMember__tClass____definedBy.setSrc(tMember);
		tMember__tClass____definedBy.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tMember__tClass____definedBy);
		mTypeToTType__tClass____target.setSrc(mTypeToTType);
		mTypeToTType__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tClass____target);
		mTypeToTType__mClass____source.setSrc(mTypeToTType);
		mTypeToTType__mClass____source.setTrg(mClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mClass____source);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		mClass__mDefinition____bodyDeclarations.setName(mClass__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mClass____abstractTypeDeclaration
				.setName(mDefinition__mClass____abstractTypeDeclaration_name_prime);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		tClass__tMember____defines.setName(tClass__tMember____defines_name_prime);
		tMember__tClass____definedBy.setName(tMember__tClass____definedBy_name_prime);
		mTypeToTType__tClass____target.setName(mTypeToTType__tClass____target_name_prime);
		mTypeToTType__mClass____source.setName(mTypeToTType__mClass____source_name_prime);
		return new Object[] { tClass, mClass, tMember, defToMember, mDefinition, mModifier, mTypeToTType,
				isApplicableMatch, defToMember__tMember____target, mClass__mDefinition____bodyDeclarations,
				mDefinition__mClass____abstractTypeDeclaration, defToMember__mDefinition____source,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration,
				tClass__tMember____defines, tMember__tClass____definedBy, mTypeToTType__tClass____target,
				mTypeToTType__mClass____source };
	}

	public static final Object[] pattern_MemberInClassVisibility_2_4_solveCSP_bindingFBBBBBBBBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch, TClass tClass, ClassDeclaration mClass,
			TMember tMember, MDefinitionToTMember defToMember, MDefinition mDefinition, Modifier mModifier,
			TypeToTAbstractType mTypeToTType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tClass, mClass, tMember, defToMember,
				mDefinition, mModifier, mTypeToTType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, mClass, tMember, defToMember, mDefinition,
					mModifier, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch, TClass tClass, ClassDeclaration mClass,
			TMember tMember, MDefinitionToTMember defToMember, MDefinition mDefinition, Modifier mModifier,
			TypeToTAbstractType mTypeToTType) {
		Object[] result_pattern_MemberInClassVisibility_2_4_solveCSP_binding = pattern_MemberInClassVisibility_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tClass, mClass, tMember, defToMember, mDefinition, mModifier, mTypeToTType);
		if (result_pattern_MemberInClassVisibility_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInClassVisibility_2_4_solveCSP_binding[0];

			Object[] result_pattern_MemberInClassVisibility_2_4_solveCSP_black = pattern_MemberInClassVisibility_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInClassVisibility_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, mClass, tMember, defToMember, mDefinition,
						mModifier, mTypeToTType };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_2_5_checkCSP_expressionFBB(
			MemberInClassVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MemberInClassVisibility_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MemberInClassVisibility";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MemberInClassVisibility_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_10_1_initialbindings_blackBBBBB(
			MemberInClassVisibility _this, Match match, TClass tClass, TModifier tModifier, TMember tMember) {
		return new Object[] { _this, match, tClass, tModifier, tMember };
	}

	public static final Object[] pattern_MemberInClassVisibility_10_2_SolveCSP_bindingFBBBBB(
			MemberInClassVisibility _this, Match match, TClass tClass, TModifier tModifier, TMember tMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tClass, tModifier, tMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tClass, tModifier, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_10_2_SolveCSP_bindingAndBlackFBBBBB(
			MemberInClassVisibility _this, Match match, TClass tClass, TModifier tModifier, TMember tMember) {
		Object[] result_pattern_MemberInClassVisibility_10_2_SolveCSP_binding = pattern_MemberInClassVisibility_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tClass, tModifier, tMember);
		if (result_pattern_MemberInClassVisibility_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInClassVisibility_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MemberInClassVisibility_10_2_SolveCSP_black = pattern_MemberInClassVisibility_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MemberInClassVisibility_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tClass, tModifier, tMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_10_3_CheckCSP_expressionFBB(
			MemberInClassVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TClass tClass, TModifier tModifier, TMember tMember) {
		return new Object[] { match, tClass, tModifier, tMember };
	}

	public static final Object[] pattern_MemberInClassVisibility_10_4_collectelementstobetranslated_greenBBBF(
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

	public static final Object[] pattern_MemberInClassVisibility_10_5_collectcontextelements_blackBBBB(Match match,
			TClass tClass, TModifier tModifier, TMember tMember) {
		return new Object[] { match, tClass, tModifier, tMember };
	}

	public static final Object[] pattern_MemberInClassVisibility_10_5_collectcontextelements_greenBBBFF(Match match,
			TClass tClass, TMember tMember) {
		EMoflonEdge tClass__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tClass);
		match.getContextNodes().add(tMember);
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
		return new Object[] { match, tClass, tMember, tClass__tMember____defines, tMember__tClass____definedBy };
	}

	public static final void pattern_MemberInClassVisibility_10_6_registerobjectstomatch_expressionBBBBB(
			MemberInClassVisibility _this, Match match, TClass tClass, TModifier tModifier, TMember tMember) {
		_this.registerObjectsToMatch_BWD(match, tClass, tModifier, tMember);

	}

	public static final boolean pattern_MemberInClassVisibility_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInClassVisibility_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("tModifier");
		EObject _localVariable_2 = isApplicableMatch.getObject("mClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_4 = isApplicableMatch.getObject("defToMember");
		EObject _localVariable_5 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_6 = isApplicableMatch.getObject("mTypeToTType");
		EObject tmpTClass = _localVariable_0;
		EObject tmpTModifier = _localVariable_1;
		EObject tmpMClass = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		EObject tmpDefToMember = _localVariable_4;
		EObject tmpMDefinition = _localVariable_5;
		EObject tmpMTypeToTType = _localVariable_6;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tmpMClass instanceof ClassDeclaration) {
					ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
					if (tmpTMember instanceof TMember) {
						TMember tMember = (TMember) tmpTMember;
						if (tmpDefToMember instanceof MDefinitionToTMember) {
							MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
							if (tmpMDefinition instanceof MDefinition) {
								MDefinition mDefinition = (MDefinition) tmpMDefinition;
								if (tmpMTypeToTType instanceof TypeToTAbstractType) {
									TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
									return new Object[] { tClass, tModifier, mClass, tMember, defToMember, mDefinition,
											mTypeToTType, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_11_1_performtransformation_blackBBBBBBBFBB(
			TClass tClass, TModifier tModifier, ClassDeclaration mClass, TMember tMember,
			MDefinitionToTMember defToMember, MDefinition mDefinition, TypeToTAbstractType mTypeToTType,
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tClass, tModifier, mClass, tMember, defToMember, mDefinition, mTypeToTType, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MemberInClassVisibility_11_1_performtransformation_binding = pattern_MemberInClassVisibility_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MemberInClassVisibility_11_1_performtransformation_binding != null) {
			TClass tClass = (TClass) result_pattern_MemberInClassVisibility_11_1_performtransformation_binding[0];
			TModifier tModifier = (TModifier) result_pattern_MemberInClassVisibility_11_1_performtransformation_binding[1];
			ClassDeclaration mClass = (ClassDeclaration) result_pattern_MemberInClassVisibility_11_1_performtransformation_binding[2];
			TMember tMember = (TMember) result_pattern_MemberInClassVisibility_11_1_performtransformation_binding[3];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_MemberInClassVisibility_11_1_performtransformation_binding[4];
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInClassVisibility_11_1_performtransformation_binding[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MemberInClassVisibility_11_1_performtransformation_binding[6];

			Object[] result_pattern_MemberInClassVisibility_11_1_performtransformation_black = pattern_MemberInClassVisibility_11_1_performtransformation_blackBBBBBBBFBB(
					tClass, tModifier, mClass, tMember, defToMember, mDefinition, mTypeToTType, _this,
					isApplicableMatch);
			if (result_pattern_MemberInClassVisibility_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MemberInClassVisibility_11_1_performtransformation_black[7];

				return new Object[] { tClass, tModifier, mClass, tMember, defToMember, mDefinition, mTypeToTType, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_11_1_performtransformation_greenBBFFB(
			TModifier tModifier, MDefinition mDefinition, CSP csp) {
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
		return new Object[] { tModifier, mDefinition, mModifier, mModifierToTModifier, csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_11_2_collecttranslatedelements_blackBBB(
			TModifier tModifier, Modifier mModifier, MModifierToTModifier mModifierToTModifier) {
		return new Object[] { tModifier, mModifier, mModifierToTModifier };
	}

	public static final Object[] pattern_MemberInClassVisibility_11_2_collecttranslatedelements_greenFBBB(
			TModifier tModifier, Modifier mModifier, MModifierToTModifier mModifierToTModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tModifier);
		ruleresult.getCreatedElements().add(mModifier);
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		return new Object[] { ruleresult, tModifier, mModifier, mModifierToTModifier };
	}

	public static final Object[] pattern_MemberInClassVisibility_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tClass, EObject tModifier, EObject mClass, EObject tMember,
			EObject defToMember, EObject mDefinition, EObject mModifier, EObject mModifierToTModifier,
			EObject mTypeToTType) {
		if (!tClass.equals(tModifier)) {
			if (!tClass.equals(tMember)) {
				if (!mClass.equals(tClass)) {
					if (!mClass.equals(tModifier)) {
						if (!mClass.equals(tMember)) {
							if (!mClass.equals(mDefinition)) {
								if (!mClass.equals(mModifier)) {
									if (!mClass.equals(mModifierToTModifier)) {
										if (!mClass.equals(mTypeToTType)) {
											if (!tMember.equals(tModifier)) {
												if (!defToMember.equals(tClass)) {
													if (!defToMember.equals(tModifier)) {
														if (!defToMember.equals(mClass)) {
															if (!defToMember.equals(tMember)) {
																if (!defToMember.equals(mDefinition)) {
																	if (!defToMember.equals(mModifier)) {
																		if (!defToMember.equals(mModifierToTModifier)) {
																			if (!defToMember.equals(mTypeToTType)) {
																				if (!mDefinition.equals(tClass)) {
																					if (!mDefinition
																							.equals(tModifier)) {
																						if (!mDefinition
																								.equals(tMember)) {
																							if (!mDefinition.equals(
																									mModifier)) {
																								if (!mDefinition.equals(
																										mModifierToTModifier)) {
																									if (!mDefinition
																											.equals(mTypeToTType)) {
																										if (!mModifier
																												.equals(tClass)) {
																											if (!mModifier
																													.equals(tModifier)) {
																												if (!mModifier
																														.equals(tMember)) {
																													if (!mModifier
																															.equals(mModifierToTModifier)) {
																														if (!mModifier
																																.equals(mTypeToTType)) {
																															if (!mModifierToTModifier
																																	.equals(tClass)) {
																																if (!mModifierToTModifier
																																		.equals(tModifier)) {
																																	if (!mModifierToTModifier
																																			.equals(tMember)) {
																																		if (!mModifierToTModifier
																																				.equals(mTypeToTType)) {
																																			if (!mTypeToTType
																																					.equals(tClass)) {
																																				if (!mTypeToTType
																																						.equals(tModifier)) {
																																					if (!mTypeToTType
																																							.equals(tMember)) {
																																						return new Object[] {
																																								ruleresult,
																																								tClass,
																																								tModifier,
																																								mClass,
																																								tMember,
																																								defToMember,
																																								mDefinition,
																																								mModifier,
																																								mModifierToTModifier,
																																								mTypeToTType };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MemberInClassVisibility_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tModifier, EObject tMember, EObject mDefinition, EObject mModifier,
			EObject mModifierToTModifier) {
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MemberInClassVisibility";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getTranslatedEdges().add(tMember__tModifier____tModifier);
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		return new Object[] { ruleresult, tModifier, tMember, mDefinition, mModifier, mModifierToTModifier,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration,
				tMember__tModifier____tModifier, mModifierToTModifier__mModifier____source,
				mModifierToTModifier__tModifier____target };
	}

	public static final void pattern_MemberInClassVisibility_11_5_registerobjects_expressionBBBBBBBBBBB(
			MemberInClassVisibility _this, PerformRuleResult ruleresult, EObject tClass, EObject tModifier,
			EObject mClass, EObject tMember, EObject defToMember, EObject mDefinition, EObject mModifier,
			EObject mModifierToTModifier, EObject mTypeToTType) {
		_this.registerObjects_BWD(ruleresult, tClass, tModifier, mClass, tMember, defToMember, mDefinition, mModifier,
				mModifierToTModifier, mTypeToTType);

	}

	public static final PerformRuleResult pattern_MemberInClassVisibility_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_12_1_preparereturnvalue_bindingFB(
			MemberInClassVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MemberInClassVisibility _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_12_1_preparereturnvalue_bindingAndBlackFFB(
			MemberInClassVisibility _this) {
		Object[] result_pattern_MemberInClassVisibility_12_1_preparereturnvalue_binding = pattern_MemberInClassVisibility_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInClassVisibility_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MemberInClassVisibility_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInClassVisibility_12_1_preparereturnvalue_black = pattern_MemberInClassVisibility_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MemberInClassVisibility_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MemberInClassVisibility_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MemberInClassVisibility";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MemberInClassVisibility_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tClass");
		EObject _localVariable_1 = match.getObject("tModifier");
		EObject _localVariable_2 = match.getObject("tMember");
		EObject tmpTClass = _localVariable_0;
		EObject tmpTModifier = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					return new Object[] { tClass, tModifier, tMember, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_12_2_corematch_blackBBFBFFFB(TClass tClass,
			TModifier tModifier, TMember tMember, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
			BodyDeclaration tmpMDefinition = defToMember.getSource();
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tClass, TypeToTAbstractType.class, "target")) {
					Type tmpMClass = mTypeToTType.getSource();
					if (tmpMClass instanceof ClassDeclaration) {
						ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
						_result.add(new Object[] { tClass, tModifier, mClass, tMember, defToMember, mDefinition,
								mTypeToTType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_12_3_findcontext_blackBBBBBBB(TClass tClass,
			TModifier tModifier, ClassDeclaration mClass, TMember tMember, MDefinitionToTMember defToMember,
			MDefinition mDefinition, TypeToTAbstractType mTypeToTType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMember.equals(defToMember.getTarget())) {
			if (mClass.getBodyDeclarations().contains(mDefinition)) {
				if (mDefinition.equals(defToMember.getSource())) {
					if (tModifier.equals(tMember.getTModifier())) {
						if (tClass.getDefines().contains(tMember)) {
							if (tClass.equals(mTypeToTType.getTarget())) {
								if (mClass.equals(mTypeToTType.getSource())) {
									_result.add(new Object[] { tClass, tModifier, mClass, tMember, defToMember,
											mDefinition, mTypeToTType });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(TClass tClass,
			TModifier tModifier, ClassDeclaration mClass, TMember tMember, MDefinitionToTMember defToMember,
			MDefinition mDefinition, TypeToTAbstractType mTypeToTType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mClass__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String defToMember__tMember____target_name_prime = "target";
		String mClass__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String defToMember__mDefinition____source_name_prime = "source";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String tClass__tMember____defines_name_prime = "defines";
		String tMember__tClass____definedBy_name_prime = "definedBy";
		String mTypeToTType__tClass____target_name_prime = "target";
		String mTypeToTType__mClass____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(tModifier);
		isApplicableMatch.getAllContextElements().add(mClass);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		mClass__mDefinition____bodyDeclarations.setSrc(mClass);
		mClass__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mClass__mDefinition____bodyDeclarations);
		mDefinition__mClass____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mClass____abstractTypeDeclaration.setTrg(mClass);
		isApplicableMatch.getAllContextElements().add(mDefinition__mClass____abstractTypeDeclaration);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		isApplicableMatch.getAllContextElements().add(tMember__tModifier____tModifier);
		tClass__tMember____defines.setSrc(tClass);
		tClass__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tClass__tMember____defines);
		tMember__tClass____definedBy.setSrc(tMember);
		tMember__tClass____definedBy.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tMember__tClass____definedBy);
		mTypeToTType__tClass____target.setSrc(mTypeToTType);
		mTypeToTType__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tClass____target);
		mTypeToTType__mClass____source.setSrc(mTypeToTType);
		mTypeToTType__mClass____source.setTrg(mClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mClass____source);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		mClass__mDefinition____bodyDeclarations.setName(mClass__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mClass____abstractTypeDeclaration
				.setName(mDefinition__mClass____abstractTypeDeclaration_name_prime);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		tClass__tMember____defines.setName(tClass__tMember____defines_name_prime);
		tMember__tClass____definedBy.setName(tMember__tClass____definedBy_name_prime);
		mTypeToTType__tClass____target.setName(mTypeToTType__tClass____target_name_prime);
		mTypeToTType__mClass____source.setName(mTypeToTType__mClass____source_name_prime);
		return new Object[] { tClass, tModifier, mClass, tMember, defToMember, mDefinition, mTypeToTType,
				isApplicableMatch, defToMember__tMember____target, mClass__mDefinition____bodyDeclarations,
				mDefinition__mClass____abstractTypeDeclaration, defToMember__mDefinition____source,
				tMember__tModifier____tModifier, tClass__tMember____defines, tMember__tClass____definedBy,
				mTypeToTType__tClass____target, mTypeToTType__mClass____source };
	}

	public static final Object[] pattern_MemberInClassVisibility_12_4_solveCSP_bindingFBBBBBBBBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch, TClass tClass, TModifier tModifier,
			ClassDeclaration mClass, TMember tMember, MDefinitionToTMember defToMember, MDefinition mDefinition,
			TypeToTAbstractType mTypeToTType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tClass, tModifier, mClass, tMember,
				defToMember, mDefinition, mTypeToTType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, tModifier, mClass, tMember, defToMember,
					mDefinition, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch, TClass tClass, TModifier tModifier,
			ClassDeclaration mClass, TMember tMember, MDefinitionToTMember defToMember, MDefinition mDefinition,
			TypeToTAbstractType mTypeToTType) {
		Object[] result_pattern_MemberInClassVisibility_12_4_solveCSP_binding = pattern_MemberInClassVisibility_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tClass, tModifier, mClass, tMember, defToMember, mDefinition, mTypeToTType);
		if (result_pattern_MemberInClassVisibility_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInClassVisibility_12_4_solveCSP_binding[0];

			Object[] result_pattern_MemberInClassVisibility_12_4_solveCSP_black = pattern_MemberInClassVisibility_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInClassVisibility_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, tModifier, mClass, tMember, defToMember,
						mDefinition, mTypeToTType };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_12_5_checkCSP_expressionFBB(
			MemberInClassVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MemberInClassVisibility_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MemberInClassVisibility";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MemberInClassVisibility_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_20_1_preparereturnvalue_bindingFB(
			MemberInClassVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MemberInClassVisibility _this) {
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

	public static final Object[] pattern_MemberInClassVisibility_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MemberInClassVisibility _this) {
		Object[] result_pattern_MemberInClassVisibility_20_1_preparereturnvalue_binding = pattern_MemberInClassVisibility_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInClassVisibility_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MemberInClassVisibility_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInClassVisibility_20_1_preparereturnvalue_black = pattern_MemberInClassVisibility_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MemberInClassVisibility_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MemberInClassVisibility_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MemberInClassVisibility_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MemberInClassVisibility_20_2_testcorematchandDECs_black_nac_0BB(
			TModifier tModifier, TClass tClass) {
		for (TAbstractType __DEC_tModifier_tModifier_303309 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tClass.equals(__DEC_tModifier_tModifier_303309)) {
				return new Object[] { tModifier, tClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_20_2_testcorematchandDECs_black_nac_1BB(TClass tClass,
			TModifier tModifier) {
		if (tModifier.equals(tClass.getTModifier())) {
			return new Object[] { tClass, tModifier };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_20_2_testcorematchandDECs_blackFFFB(
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
						if (pattern_MemberInClassVisibility_20_2_testcorematchandDECs_black_nac_0BB(tModifier,
								tClass) == null) {
							if (pattern_MemberInClassVisibility_20_2_testcorematchandDECs_black_nac_1BB(tClass,
									tModifier) == null) {
								_result.add(new Object[] { tClass, tModifier, tMember, _edge_tModifier });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MemberInClassVisibility_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MemberInClassVisibility _this, Match match, TClass tClass, TModifier tModifier, TMember tMember) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass, tModifier, tMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MemberInClassVisibility_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MemberInClassVisibility _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MemberInClassVisibility_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_21_1_preparereturnvalue_bindingFB(
			MemberInClassVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MemberInClassVisibility _this) {
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

	public static final Object[] pattern_MemberInClassVisibility_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MemberInClassVisibility _this) {
		Object[] result_pattern_MemberInClassVisibility_21_1_preparereturnvalue_binding = pattern_MemberInClassVisibility_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInClassVisibility_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MemberInClassVisibility_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInClassVisibility_21_1_preparereturnvalue_black = pattern_MemberInClassVisibility_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MemberInClassVisibility_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MemberInClassVisibility_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MemberInClassVisibility_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_21_2_testcorematchandDECs_blackFFFB(
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
					if (tmpMClass instanceof ClassDeclaration) {
						ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
						_result.add(new Object[] { mClass, mDefinition, mModifier, _edge_modifier });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MemberInClassVisibility_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MemberInClassVisibility _this, Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mClass, mDefinition, mModifier);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MemberInClassVisibility_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MemberInClassVisibility _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MemberInClassVisibility_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_24_1_prepare_blackB(MemberInClassVisibility _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MemberInClassVisibility_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tClass");
		EObject _localVariable_1 = targetMatch.getObject("tModifier");
		EObject _localVariable_2 = sourceMatch.getObject("mClass");
		EObject _localVariable_3 = targetMatch.getObject("tMember");
		EObject _localVariable_4 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_5 = sourceMatch.getObject("mModifier");
		EObject tmpTClass = _localVariable_0;
		EObject tmpTModifier = _localVariable_1;
		EObject tmpMClass = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		EObject tmpMModifier = _localVariable_5;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tmpMClass instanceof ClassDeclaration) {
					ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
					if (tmpTMember instanceof TMember) {
						TMember tMember = (TMember) tmpTMember;
						if (tmpMDefinition instanceof MDefinition) {
							MDefinition mDefinition = (MDefinition) tmpMDefinition;
							if (tmpMModifier instanceof Modifier) {
								Modifier mModifier = (Modifier) tmpMModifier;
								return new Object[] { tClass, tModifier, mClass, tMember, mDefinition, mModifier,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_blackBBBBBBBB(TClass tClass,
			TModifier tModifier, ClassDeclaration mClass, TMember tMember, MDefinition mDefinition, Modifier mModifier,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tClass, tModifier, mClass, tMember, mDefinition, mModifier, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding = pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding != null) {
			TClass tClass = (TClass) result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding[0];
			TModifier tModifier = (TModifier) result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding[1];
			ClassDeclaration mClass = (ClassDeclaration) result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding[2];
			TMember tMember = (TMember) result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding[3];
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding[4];
			Modifier mModifier = (Modifier) result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_black = pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tClass, tModifier, mClass, tMember, mDefinition, mModifier, sourceMatch, targetMatch);
			if (result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tClass, tModifier, mClass, tMember, mDefinition, mModifier, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_24_3_solvecsp_bindingFBBBBBBBBB(
			MemberInClassVisibility _this, TClass tClass, TModifier tModifier, ClassDeclaration mClass, TMember tMember,
			MDefinition mDefinition, Modifier mModifier, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tClass, tModifier, mClass, tMember, mDefinition,
				mModifier, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tClass, tModifier, mClass, tMember, mDefinition, mModifier, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			MemberInClassVisibility _this, TClass tClass, TModifier tModifier, ClassDeclaration mClass, TMember tMember,
			MDefinition mDefinition, Modifier mModifier, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MemberInClassVisibility_24_3_solvecsp_binding = pattern_MemberInClassVisibility_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tClass, tModifier, mClass, tMember, mDefinition, mModifier, sourceMatch, targetMatch);
		if (result_pattern_MemberInClassVisibility_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInClassVisibility_24_3_solvecsp_binding[0];

			Object[] result_pattern_MemberInClassVisibility_24_3_solvecsp_black = pattern_MemberInClassVisibility_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MemberInClassVisibility_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tClass, tModifier, mClass, tMember, mDefinition, mModifier,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_24_5_matchcorrcontext_blackBBBFBFBB(
			TClass tClass, ClassDeclaration mClass, TMember tMember, MDefinition mDefinition, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
				if (mDefinition.equals(defToMember.getSource())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tClass, TypeToTAbstractType.class, "target")) {
						if (mClass.equals(mTypeToTType.getSource())) {
							_result.add(new Object[] { tClass, mClass, tMember, defToMember, mDefinition, mTypeToTType,
									sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_24_5_matchcorrcontext_greenBBBBF(
			MDefinitionToTMember defToMember, TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MemberInClassVisibility";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(defToMember);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { defToMember, mTypeToTType, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MemberInClassVisibility_24_6_createcorrespondence_blackBBBBBBB(TClass tClass,
			TModifier tModifier, ClassDeclaration mClass, TMember tMember, MDefinition mDefinition, Modifier mModifier,
			CCMatch ccMatch) {
		return new Object[] { tClass, tModifier, mClass, tMember, mDefinition, mModifier, ccMatch };
	}

	public static final Object[] pattern_MemberInClassVisibility_24_6_createcorrespondence_greenBBFB(
			TModifier tModifier, Modifier mModifier, CCMatch ccMatch) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		ccMatch.getCreateCorr().add(mModifierToTModifier);
		return new Object[] { tModifier, mModifier, mModifierToTModifier, ccMatch };
	}

	public static final Object[] pattern_MemberInClassVisibility_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MemberInClassVisibility_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MemberInClassVisibility";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MemberInClassVisibility_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_27_1_matchtggpattern_blackBBB(ClassDeclaration mClass,
			MDefinition mDefinition, Modifier mModifier) {
		if (mClass.getBodyDeclarations().contains(mDefinition)) {
			if (mModifier.equals(mDefinition.getModifier())) {
				return new Object[] { mClass, mDefinition, mModifier };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInClassVisibility_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_28_1_matchtggpattern_black_nac_0BB(TModifier tModifier,
			TClass tClass) {
		for (TAbstractType __DEC_tModifier_tModifier_239438 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tClass.equals(__DEC_tModifier_tModifier_239438)) {
				return new Object[] { tModifier, tClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_28_1_matchtggpattern_black_nac_1BB(TClass tClass,
			TModifier tModifier) {
		if (tModifier.equals(tClass.getTModifier())) {
			return new Object[] { tClass, tModifier };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_28_1_matchtggpattern_blackBBB(TClass tClass,
			TModifier tModifier, TMember tMember) {
		if (tModifier.equals(tMember.getTModifier())) {
			if (tClass.getDefines().contains(tMember)) {
				if (pattern_MemberInClassVisibility_28_1_matchtggpattern_black_nac_0BB(tModifier, tClass) == null) {
					if (pattern_MemberInClassVisibility_28_1_matchtggpattern_black_nac_1BB(tClass, tModifier) == null) {
						return new Object[] { tClass, tModifier, tMember };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInClassVisibility_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_1_createresult_blackB(
			MemberInClassVisibility _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MemberInClassVisibility_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TClass tClass) {
		if (ruleResult.getTargetObjects().contains(tClass)) {
			return new Object[] { ruleResult, tClass };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember defToMember) {
		if (ruleResult.getCorrObjects().contains(defToMember)) {
			return new Object[] { ruleResult, defToMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration mClass) {
		if (ruleResult.getSourceObjects().contains(mClass)) {
			return new Object[] { ruleResult, mClass };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_29_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList defToMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpDefToMember : defToMemberList.getEntryObjects()) {
				if (tmpDefToMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
					TMember tMember = defToMember.getTarget();
					if (tMember != null) {
						BodyDeclaration tmpMDefinition = defToMember.getSource();
						if (tmpMDefinition instanceof MDefinition) {
							MDefinition mDefinition = (MDefinition) tmpMDefinition;
							TAbstractType tmpTClass = tMember.getDefinedBy();
							if (tmpTClass instanceof TClass) {
								TClass tClass = (TClass) tmpTClass;
								AbstractTypeDeclaration tmpMClass = mDefinition.getAbstractTypeDeclaration();
								if (tmpMClass instanceof ClassDeclaration) {
									ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
									if (pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											defToMember) == null) {
										if (pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, tMember) == null) {
											if (pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_3BB(
													ruleResult, mDefinition) == null) {
												if (pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_0BB(
														ruleResult, tClass) == null) {
													if (pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_4BB(
															ruleResult, mClass) == null) {
														for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(tClass,
																		TypeToTAbstractType.class, "target")) {
															if (mClass.equals(mTypeToTType.getSource())) {
																if (pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult, mTypeToTType) == null) {
																	_result.add(new Object[] { defToMemberList, tClass,
																			tMember, defToMember, mDefinition, mClass,
																			mTypeToTType, ruleEntryContainer,
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

	public static final Object[] pattern_MemberInClassVisibility_29_3_solveCSP_bindingFBBBBBBBBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch, TClass tClass, ClassDeclaration mClass,
			TMember tMember, MDefinitionToTMember defToMember, MDefinition mDefinition,
			TypeToTAbstractType mTypeToTType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tClass, mClass, tMember, defToMember,
				mDefinition, mTypeToTType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, mClass, tMember, defToMember, mDefinition,
					mTypeToTType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch, TClass tClass, ClassDeclaration mClass,
			TMember tMember, MDefinitionToTMember defToMember, MDefinition mDefinition,
			TypeToTAbstractType mTypeToTType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MemberInClassVisibility_29_3_solveCSP_binding = pattern_MemberInClassVisibility_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tClass, mClass, tMember, defToMember, mDefinition, mTypeToTType, ruleResult);
		if (result_pattern_MemberInClassVisibility_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInClassVisibility_29_3_solveCSP_binding[0];

			Object[] result_pattern_MemberInClassVisibility_29_3_solveCSP_black = pattern_MemberInClassVisibility_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInClassVisibility_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, mClass, tMember, defToMember, mDefinition,
						mTypeToTType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_29_4_checkCSP_expressionFBB(
			MemberInClassVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_5_checknacs_blackBBBBBB(TClass tClass,
			ClassDeclaration mClass, TMember tMember, MDefinitionToTMember defToMember, MDefinition mDefinition,
			TypeToTAbstractType mTypeToTType) {
		return new Object[] { tClass, mClass, tMember, defToMember, mDefinition, mTypeToTType };
	}

	public static final Object[] pattern_MemberInClassVisibility_29_6_perform_blackBBBBBBB(TClass tClass,
			ClassDeclaration mClass, TMember tMember, MDefinitionToTMember defToMember, MDefinition mDefinition,
			TypeToTAbstractType mTypeToTType, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tClass, mClass, tMember, defToMember, mDefinition, mTypeToTType, ruleResult };
	}

	public static final Object[] pattern_MemberInClassVisibility_29_6_perform_greenFBBFFBB(TMember tMember,
			MDefinition mDefinition, ModelgeneratorRuleResult ruleResult, CSP csp) {
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
		return new Object[] { tModifier, tMember, mDefinition, mModifier, mModifierToTModifier, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MemberInClassVisibility_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MemberInClassVisibilityImpl
