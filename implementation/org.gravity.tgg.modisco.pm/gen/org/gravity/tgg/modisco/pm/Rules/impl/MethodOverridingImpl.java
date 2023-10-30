/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.BodyDeclaration;

import org.gravity.modisco.MMethodDefinition;

import org.gravity.tgg.modisco.pm.MDefinitionToTMember;

import org.gravity.tgg.modisco.pm.Rules.MethodOverriding;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;

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
 * An implementation of the model object '<em><b>Method Overriding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodOverridingImpl extends AbstractRuleImpl implements MethodOverriding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodOverridingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodOverriding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodDefinition mMethod, MMethodDefinition mOverriding) {

		Object[] result1_black = MethodOverridingImpl.pattern_MethodOverriding_0_1_initialbindings_blackBBBB(this,
				match, mMethod, mOverriding);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mMethod] = " + mMethod + ", " + "[mOverriding] = " + mOverriding + ".");
		}

		Object[] result2_bindingAndBlack = MethodOverridingImpl
				.pattern_MethodOverriding_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mMethod, mOverriding);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mMethod] = " + mMethod + ", " + "[mOverriding] = " + mOverriding + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodOverridingImpl.pattern_MethodOverriding_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodOverridingImpl
					.pattern_MethodOverriding_0_4_collectelementstobetranslated_blackBBB(match, mMethod, mOverriding);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mMethod] = " + mMethod + ", " + "[mOverriding] = " + mOverriding + ".");
			}
			MethodOverridingImpl.pattern_MethodOverriding_0_4_collectelementstobetranslated_greenBBBFF(match, mMethod,
					mOverriding);
			//nothing EMoflonEdge mMethod__mOverriding____redefinitions = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mOverriding__mMethod____redefinedMethodDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MethodOverridingImpl
					.pattern_MethodOverriding_0_5_collectcontextelements_blackBBB(match, mMethod, mOverriding);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mMethod] = " + mMethod + ", " + "[mOverriding] = " + mOverriding + ".");
			}
			MethodOverridingImpl.pattern_MethodOverriding_0_5_collectcontextelements_greenBBB(match, mMethod,
					mOverriding);

			// 
			MethodOverridingImpl.pattern_MethodOverriding_0_6_registerobjectstomatch_expressionBBBB(this, match,
					mMethod, mOverriding);
			return MethodOverridingImpl.pattern_MethodOverriding_0_7_expressionF();
		} else {
			return MethodOverridingImpl.pattern_MethodOverriding_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodOverridingImpl
				.pattern_MethodOverriding_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodDefinition mMethod = (MMethodDefinition) result1_bindingAndBlack[0];
		TMethodDefinition tMethod = (TMethodDefinition) result1_bindingAndBlack[1];
		MMethodDefinition mOverriding = (MMethodDefinition) result1_bindingAndBlack[2];
		MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result1_bindingAndBlack[3];
		MDefinitionToTMember mOverridingToTOverriding = (MDefinitionToTMember) result1_bindingAndBlack[4];
		TMethodDefinition tOverriding = (TMethodDefinition) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		MethodOverridingImpl.pattern_MethodOverriding_1_1_performtransformation_greenBB(tMethod, tOverriding);

		Object[] result2_green = MethodOverridingImpl.pattern_MethodOverriding_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodOverridingImpl.pattern_MethodOverriding_1_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding, tOverriding);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[mMethod] = "
							+ mMethod + ", " + "[tMethod] = " + tMethod + ", " + "[mOverriding] = " + mOverriding + ", "
							+ "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[mOverridingToTOverriding] = "
							+ mOverridingToTOverriding + ", " + "[tOverriding] = " + tOverriding + ".");
		}
		MethodOverridingImpl.pattern_MethodOverriding_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, mMethod,
				tMethod, mOverriding, tOverriding);
		//nothing EMoflonEdge mMethod__mOverriding____redefinitions = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mOverriding__mMethod____redefinedMethodDeclaration = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tMethod__tOverriding____overriddenBy = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tOverriding__tMethod____overriding = (EMoflonEdge) result3_green[8];

		// 
		// 
		MethodOverridingImpl.pattern_MethodOverriding_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, mMethod,
				tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding, tOverriding);
		return MethodOverridingImpl.pattern_MethodOverriding_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodOverridingImpl
				.pattern_MethodOverriding_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodOverridingImpl
				.pattern_MethodOverriding_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodOverridingImpl.pattern_MethodOverriding_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodDefinition mMethod = (MMethodDefinition) result2_binding[0];
		MMethodDefinition mOverriding = (MMethodDefinition) result2_binding[1];
		for (Object[] result2_black : MethodOverridingImpl.pattern_MethodOverriding_2_2_corematch_blackBFBFFFB(mMethod,
				mOverriding, match)) {
			TMethodDefinition tMethod = (TMethodDefinition) result2_black[1];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[3];
			MDefinitionToTMember mOverridingToTOverriding = (MDefinitionToTMember) result2_black[4];
			TMethodDefinition tOverriding = (TMethodDefinition) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MethodOverridingImpl.pattern_MethodOverriding_2_3_findcontext_blackBBBBBB(
					mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding, tOverriding)) {
				Object[] result3_green = MethodOverridingImpl
						.pattern_MethodOverriding_2_3_findcontext_greenBBBBBBFFFFFFF(mMethod, tMethod, mOverriding,
								mMethodToTMethod, mOverridingToTOverriding, tOverriding);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mMethod__mOverriding____redefinitions = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mOverriding__mMethod____redefinedMethodDeclaration = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mMethodToTMethod__mMethod____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mOverridingToTOverriding__mOverriding____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mMethodToTMethod__tMethod____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mOverridingToTOverriding__tOverriding____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = MethodOverridingImpl
						.pattern_MethodOverriding_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding, tOverriding);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMethod] = " + mMethod + ", "
							+ "[tMethod] = " + tMethod + ", " + "[mOverriding] = " + mOverriding + ", "
							+ "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[mOverridingToTOverriding] = "
							+ mOverridingToTOverriding + ", " + "[tOverriding] = " + tOverriding + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodOverridingImpl.pattern_MethodOverriding_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodOverridingImpl
							.pattern_MethodOverriding_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodOverridingImpl.pattern_MethodOverriding_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodOverridingImpl.pattern_MethodOverriding_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodDefinition mMethod, MMethodDefinition mOverriding) {
		match.registerObject("mMethod", mMethod);
		match.registerObject("mOverriding", mOverriding);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodDefinition mMethod, MMethodDefinition mOverriding) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MMethodDefinition mMethod,
			TMethodDefinition tMethod, MMethodDefinition mOverriding, MDefinitionToTMember mMethodToTMethod,
			MDefinitionToTMember mOverridingToTOverriding, TMethodDefinition tOverriding) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMethod", mMethod);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("mOverriding", mOverriding);
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("mOverridingToTOverriding", mOverridingToTOverriding);
		isApplicableMatch.registerObject("tOverriding", tOverriding);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mMethod, EObject tMethod, EObject mOverriding,
			EObject mMethodToTMethod, EObject mOverridingToTOverriding, EObject tOverriding) {
		ruleresult.registerObject("mMethod", mMethod);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("mOverriding", mOverriding);
		ruleresult.registerObject("mMethodToTMethod", mMethodToTMethod);
		ruleresult.registerObject("mOverridingToTOverriding", mOverridingToTOverriding);
		ruleresult.registerObject("tOverriding", tOverriding);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TMethodDefinition tMethod, TMethodDefinition tOverriding) {

		Object[] result1_black = MethodOverridingImpl.pattern_MethodOverriding_10_1_initialbindings_blackBBBB(this,
				match, tMethod, tOverriding);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tMethod] = " + tMethod + ", " + "[tOverriding] = " + tOverriding + ".");
		}

		Object[] result2_bindingAndBlack = MethodOverridingImpl
				.pattern_MethodOverriding_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tMethod, tOverriding);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tMethod] = " + tMethod + ", " + "[tOverriding] = " + tOverriding + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodOverridingImpl.pattern_MethodOverriding_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodOverridingImpl
					.pattern_MethodOverriding_10_4_collectelementstobetranslated_blackBBB(match, tMethod, tOverriding);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMethod] = " + tMethod + ", " + "[tOverriding] = " + tOverriding + ".");
			}
			MethodOverridingImpl.pattern_MethodOverriding_10_4_collectelementstobetranslated_greenBBBFF(match, tMethod,
					tOverriding);
			//nothing EMoflonEdge tMethod__tOverriding____overriddenBy = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tOverriding__tMethod____overriding = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MethodOverridingImpl
					.pattern_MethodOverriding_10_5_collectcontextelements_blackBBB(match, tMethod, tOverriding);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMethod] = " + tMethod + ", " + "[tOverriding] = " + tOverriding + ".");
			}
			MethodOverridingImpl.pattern_MethodOverriding_10_5_collectcontextelements_greenBBB(match, tMethod,
					tOverriding);

			// 
			MethodOverridingImpl.pattern_MethodOverriding_10_6_registerobjectstomatch_expressionBBBB(this, match,
					tMethod, tOverriding);
			return MethodOverridingImpl.pattern_MethodOverriding_10_7_expressionF();
		} else {
			return MethodOverridingImpl.pattern_MethodOverriding_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodOverridingImpl
				.pattern_MethodOverriding_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodDefinition mMethod = (MMethodDefinition) result1_bindingAndBlack[0];
		TMethodDefinition tMethod = (TMethodDefinition) result1_bindingAndBlack[1];
		MMethodDefinition mOverriding = (MMethodDefinition) result1_bindingAndBlack[2];
		MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result1_bindingAndBlack[3];
		MDefinitionToTMember mOverridingToTOverriding = (MDefinitionToTMember) result1_bindingAndBlack[4];
		TMethodDefinition tOverriding = (TMethodDefinition) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		MethodOverridingImpl.pattern_MethodOverriding_11_1_performtransformation_greenBB(mMethod, mOverriding);

		Object[] result2_green = MethodOverridingImpl.pattern_MethodOverriding_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodOverridingImpl.pattern_MethodOverriding_11_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding, tOverriding);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[mMethod] = "
							+ mMethod + ", " + "[tMethod] = " + tMethod + ", " + "[mOverriding] = " + mOverriding + ", "
							+ "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[mOverridingToTOverriding] = "
							+ mOverridingToTOverriding + ", " + "[tOverriding] = " + tOverriding + ".");
		}
		MethodOverridingImpl.pattern_MethodOverriding_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, mMethod,
				tMethod, mOverriding, tOverriding);
		//nothing EMoflonEdge mMethod__mOverriding____redefinitions = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mOverriding__mMethod____redefinedMethodDeclaration = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tMethod__tOverriding____overriddenBy = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tOverriding__tMethod____overriding = (EMoflonEdge) result3_green[8];

		// 
		// 
		MethodOverridingImpl.pattern_MethodOverriding_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, mMethod,
				tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding, tOverriding);
		return MethodOverridingImpl.pattern_MethodOverriding_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodOverridingImpl
				.pattern_MethodOverriding_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodOverridingImpl
				.pattern_MethodOverriding_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodOverridingImpl.pattern_MethodOverriding_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMethodDefinition tMethod = (TMethodDefinition) result2_binding[0];
		TMethodDefinition tOverriding = (TMethodDefinition) result2_binding[1];
		for (Object[] result2_black : MethodOverridingImpl.pattern_MethodOverriding_12_2_corematch_blackFBFFFBB(tMethod,
				tOverriding, match)) {
			MMethodDefinition mMethod = (MMethodDefinition) result2_black[0];
			MMethodDefinition mOverriding = (MMethodDefinition) result2_black[2];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[3];
			MDefinitionToTMember mOverridingToTOverriding = (MDefinitionToTMember) result2_black[4];
			// ForEach 
			for (Object[] result3_black : MethodOverridingImpl.pattern_MethodOverriding_12_3_findcontext_blackBBBBBB(
					mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding, tOverriding)) {
				Object[] result3_green = MethodOverridingImpl
						.pattern_MethodOverriding_12_3_findcontext_greenBBBBBBFFFFFFF(mMethod, tMethod, mOverriding,
								mMethodToTMethod, mOverridingToTOverriding, tOverriding);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge tMethod__tOverriding____overriddenBy = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tOverriding__tMethod____overriding = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mMethodToTMethod__mMethod____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mOverridingToTOverriding__mOverriding____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mMethodToTMethod__tMethod____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mOverridingToTOverriding__tOverriding____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = MethodOverridingImpl
						.pattern_MethodOverriding_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding, tOverriding);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMethod] = " + mMethod + ", "
							+ "[tMethod] = " + tMethod + ", " + "[mOverriding] = " + mOverriding + ", "
							+ "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[mOverridingToTOverriding] = "
							+ mOverridingToTOverriding + ", " + "[tOverriding] = " + tOverriding + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodOverridingImpl.pattern_MethodOverriding_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodOverridingImpl
							.pattern_MethodOverriding_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodOverridingImpl.pattern_MethodOverriding_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodOverridingImpl.pattern_MethodOverriding_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMethodDefinition tMethod, TMethodDefinition tOverriding) {
		match.registerObject("tMethod", tMethod);
		match.registerObject("tOverriding", tOverriding);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMethodDefinition tMethod, TMethodDefinition tOverriding) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodDefinition mMethod,
			TMethodDefinition tMethod, MMethodDefinition mOverriding, MDefinitionToTMember mMethodToTMethod,
			MDefinitionToTMember mOverridingToTOverriding, TMethodDefinition tOverriding) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMethod", mMethod);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("mOverriding", mOverriding);
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("mOverridingToTOverriding", mOverridingToTOverriding);
		isApplicableMatch.registerObject("tOverriding", tOverriding);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mMethod, EObject tMethod, EObject mOverriding,
			EObject mMethodToTMethod, EObject mOverridingToTOverriding, EObject tOverriding) {
		ruleresult.registerObject("mMethod", mMethod);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("mOverriding", mOverriding);
		ruleresult.registerObject("mMethodToTMethod", mMethodToTMethod);
		ruleresult.registerObject("mOverridingToTOverriding", mOverridingToTOverriding);
		ruleresult.registerObject("tOverriding", tOverriding);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_6(EMoflonEdge _edge_overriddenBy) {

		Object[] result1_bindingAndBlack = MethodOverridingImpl
				.pattern_MethodOverriding_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodOverridingImpl.pattern_MethodOverriding_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodOverridingImpl
				.pattern_MethodOverriding_20_2_testcorematchandDECs_blackFFB(_edge_overriddenBy)) {
			TMethodDefinition tMethod = (TMethodDefinition) result2_black[0];
			TMethodDefinition tOverriding = (TMethodDefinition) result2_black[1];
			Object[] result2_green = MethodOverridingImpl
					.pattern_MethodOverriding_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodOverridingImpl
					.pattern_MethodOverriding_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, tMethod, tOverriding)) {
				// 
				if (MethodOverridingImpl
						.pattern_MethodOverriding_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = MethodOverridingImpl
							.pattern_MethodOverriding_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodOverridingImpl.pattern_MethodOverriding_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodOverridingImpl.pattern_MethodOverriding_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_6(EMoflonEdge _edge_redefinitions) {

		Object[] result1_bindingAndBlack = MethodOverridingImpl
				.pattern_MethodOverriding_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodOverridingImpl.pattern_MethodOverriding_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodOverridingImpl
				.pattern_MethodOverriding_21_2_testcorematchandDECs_blackFFB(_edge_redefinitions)) {
			MMethodDefinition mMethod = (MMethodDefinition) result2_black[0];
			MMethodDefinition mOverriding = (MMethodDefinition) result2_black[1];
			Object[] result2_green = MethodOverridingImpl
					.pattern_MethodOverriding_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodOverridingImpl
					.pattern_MethodOverriding_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mMethod, mOverriding)) {
				// 
				if (MethodOverridingImpl
						.pattern_MethodOverriding_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = MethodOverridingImpl
							.pattern_MethodOverriding_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodOverridingImpl.pattern_MethodOverriding_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodOverridingImpl.pattern_MethodOverriding_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodOverriding");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
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
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodOverriding");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
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

		Object[] result1_black = MethodOverridingImpl.pattern_MethodOverriding_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodOverridingImpl.pattern_MethodOverriding_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodOverridingImpl
				.pattern_MethodOverriding_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MMethodDefinition mMethod = (MMethodDefinition) result2_bindingAndBlack[0];
		TMethodDefinition tMethod = (TMethodDefinition) result2_bindingAndBlack[1];
		MMethodDefinition mOverriding = (MMethodDefinition) result2_bindingAndBlack[2];
		TMethodDefinition tOverriding = (TMethodDefinition) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = MethodOverridingImpl
				.pattern_MethodOverriding_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, mMethod, tMethod, mOverriding,
						tOverriding, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mMethod] = " + mMethod + ", " + "[tMethod] = " + tMethod + ", " + "[mOverriding] = "
					+ mOverriding + ", " + "[tOverriding] = " + tOverriding + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodOverridingImpl.pattern_MethodOverriding_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodOverridingImpl
					.pattern_MethodOverriding_24_5_matchcorrcontext_blackBBBFFBBB(mMethod, tMethod, mOverriding,
							tOverriding, sourceMatch, targetMatch)) {
				MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result5_black[3];
				MDefinitionToTMember mOverridingToTOverriding = (MDefinitionToTMember) result5_black[4];
				Object[] result5_green = MethodOverridingImpl.pattern_MethodOverriding_24_5_matchcorrcontext_greenBBBBF(
						mMethodToTMethod, mOverridingToTOverriding, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodOverridingImpl
						.pattern_MethodOverriding_24_6_createcorrespondence_blackBBBBB(mMethod, tMethod, mOverriding,
								tOverriding, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mMethod] = " + mMethod
							+ ", " + "[tMethod] = " + tMethod + ", " + "[mOverriding] = " + mOverriding + ", "
							+ "[tOverriding] = " + tOverriding + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = MethodOverridingImpl
						.pattern_MethodOverriding_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodOverridingImpl.pattern_MethodOverriding_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodOverridingImpl.pattern_MethodOverriding_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MMethodDefinition mMethod, TMethodDefinition tMethod,
			MMethodDefinition mOverriding, TMethodDefinition tOverriding, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(MMethodDefinition mMethod, MMethodDefinition mOverriding) {// 
		Object[] result1_black = MethodOverridingImpl.pattern_MethodOverriding_27_1_matchtggpattern_blackBB(mMethod,
				mOverriding);
		if (result1_black != null) {
			return MethodOverridingImpl.pattern_MethodOverriding_27_2_expressionF();
		} else {
			return MethodOverridingImpl.pattern_MethodOverriding_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMethodDefinition tMethod, TMethodDefinition tOverriding) {// 
		Object[] result1_black = MethodOverridingImpl.pattern_MethodOverriding_28_1_matchtggpattern_blackBB(tMethod,
				tOverriding);
		if (result1_black != null) {
			return MethodOverridingImpl.pattern_MethodOverriding_28_2_expressionF();
		} else {
			return MethodOverridingImpl.pattern_MethodOverriding_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember mMethodToTMethodParameter, MDefinitionToTMember mOverridingToTOverridingParameter) {

		Object[] result1_black = MethodOverridingImpl.pattern_MethodOverriding_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodOverridingImpl.pattern_MethodOverriding_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodOverridingImpl
				.pattern_MethodOverriding_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mMethodToTMethodList = (RuleEntryList) result2_black[0];
			MMethodDefinition mMethod = (MMethodDefinition) result2_black[1];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[2];
			TMethodDefinition tMethod = (TMethodDefinition) result2_black[3];
			//nothing RuleEntryList mOverridingToTOverridingList = (RuleEntryList) result2_black[4];
			MMethodDefinition mOverriding = (MMethodDefinition) result2_black[5];
			MDefinitionToTMember mOverridingToTOverriding = (MDefinitionToTMember) result2_black[6];
			TMethodDefinition tOverriding = (TMethodDefinition) result2_black[7];

			Object[] result3_bindingAndBlack = MethodOverridingImpl
					.pattern_MethodOverriding_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, mMethod,
							tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding, tOverriding, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMethod] = " + mMethod + ", "
						+ "[tMethod] = " + tMethod + ", " + "[mOverriding] = " + mOverriding + ", "
						+ "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[mOverridingToTOverriding] = "
						+ mOverridingToTOverriding + ", " + "[tOverriding] = " + tOverriding + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodOverridingImpl.pattern_MethodOverriding_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodOverridingImpl.pattern_MethodOverriding_29_5_checknacs_blackBBBBBB(
						mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding, tOverriding);
				if (result5_black != null) {

					Object[] result6_black = MethodOverridingImpl.pattern_MethodOverriding_29_6_perform_blackBBBBBBB(
							mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding, tOverriding,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mMethod] = "
								+ mMethod + ", " + "[tMethod] = " + tMethod + ", " + "[mOverriding] = " + mOverriding
								+ ", " + "[mMethodToTMethod] = " + mMethodToTMethod + ", "
								+ "[mOverridingToTOverriding] = " + mOverridingToTOverriding + ", " + "[tOverriding] = "
								+ tOverriding + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodOverridingImpl.pattern_MethodOverriding_29_6_perform_greenBBBBB(mMethod, tMethod, mOverriding,
							tOverriding, ruleResult);

				} else {
				}

			} else {
			}

		}
		return MethodOverridingImpl.pattern_MethodOverriding_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodDefinition mMethod,
			TMethodDefinition tMethod, MMethodDefinition mOverriding, MDefinitionToTMember mMethodToTMethod,
			MDefinitionToTMember mOverridingToTOverriding, TMethodDefinition tOverriding,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMethod", mMethod);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("mOverriding", mOverriding);
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("mOverridingToTOverriding", mOverridingToTOverriding);
		isApplicableMatch.registerObject("tOverriding", tOverriding);
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
		case RulesPackage.METHOD_OVERRIDING___IS_APPROPRIATE_FWD__MATCH_MMETHODDEFINITION_MMETHODDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(MMethodDefinition) arguments.get(2));
		case RulesPackage.METHOD_OVERRIDING___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_OVERRIDING___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_OVERRIDING___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODDEFINITION_MMETHODDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(MMethodDefinition) arguments.get(2));
			return null;
		case RulesPackage.METHOD_OVERRIDING___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODDEFINITION_MMETHODDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(MMethodDefinition) arguments.get(2));
		case RulesPackage.METHOD_OVERRIDING___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_OVERRIDING___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MMETHODDEFINITION_TMETHODDEFINITION_MMETHODDEFINITION_MDEFINITIONTOTMEMBER_MDEFINITIONTOTMEMBER_TMETHODDEFINITION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (MMethodDefinition) arguments.get(3),
					(MDefinitionToTMember) arguments.get(4), (MDefinitionToTMember) arguments.get(5),
					(TMethodDefinition) arguments.get(6));
		case RulesPackage.METHOD_OVERRIDING___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_OVERRIDING___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_OVERRIDING___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_OVERRIDING___IS_APPROPRIATE_BWD__MATCH_TMETHODDEFINITION_TMETHODDEFINITION:
			return isAppropriate_BWD((Match) arguments.get(0), (TMethodDefinition) arguments.get(1),
					(TMethodDefinition) arguments.get(2));
		case RulesPackage.METHOD_OVERRIDING___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_OVERRIDING___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_OVERRIDING___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODDEFINITION_TMETHODDEFINITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMethodDefinition) arguments.get(1),
					(TMethodDefinition) arguments.get(2));
			return null;
		case RulesPackage.METHOD_OVERRIDING___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODDEFINITION_TMETHODDEFINITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMethodDefinition) arguments.get(1),
					(TMethodDefinition) arguments.get(2));
		case RulesPackage.METHOD_OVERRIDING___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_OVERRIDING___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODDEFINITION_TMETHODDEFINITION_MMETHODDEFINITION_MDEFINITIONTOTMEMBER_MDEFINITIONTOTMEMBER_TMETHODDEFINITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (MMethodDefinition) arguments.get(3),
					(MDefinitionToTMember) arguments.get(4), (MDefinitionToTMember) arguments.get(5),
					(TMethodDefinition) arguments.get(6));
		case RulesPackage.METHOD_OVERRIDING___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_OVERRIDING___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_OVERRIDING___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_OVERRIDING___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_6((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_OVERRIDING___IS_APPROPRIATE_FWD_EMOFLON_EDGE_6__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_6((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_OVERRIDING___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_OVERRIDING___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_OVERRIDING___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_OVERRIDING___IS_APPLICABLE_SOLVE_CSP_CC__MMETHODDEFINITION_TMETHODDEFINITION_MMETHODDEFINITION_TMETHODDEFINITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MMethodDefinition) arguments.get(0), (TMethodDefinition) arguments.get(1),
					(MMethodDefinition) arguments.get(2), (TMethodDefinition) arguments.get(3),
					(Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.METHOD_OVERRIDING___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_OVERRIDING___CHECK_DEC_FWD__MMETHODDEFINITION_MMETHODDEFINITION:
			return checkDEC_FWD((MMethodDefinition) arguments.get(0), (MMethodDefinition) arguments.get(1));
		case RulesPackage.METHOD_OVERRIDING___CHECK_DEC_BWD__TMETHODDEFINITION_TMETHODDEFINITION:
			return checkDEC_BWD((TMethodDefinition) arguments.get(0), (TMethodDefinition) arguments.get(1));
		case RulesPackage.METHOD_OVERRIDING___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1),
					(MDefinitionToTMember) arguments.get(2));
		case RulesPackage.METHOD_OVERRIDING___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODDEFINITION_TMETHODDEFINITION_MMETHODDEFINITION_MDEFINITIONTOTMEMBER_MDEFINITIONTOTMEMBER_TMETHODDEFINITION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MMethodDefinition) arguments.get(1), (TMethodDefinition) arguments.get(2),
					(MMethodDefinition) arguments.get(3), (MDefinitionToTMember) arguments.get(4),
					(MDefinitionToTMember) arguments.get(5), (TMethodDefinition) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.METHOD_OVERRIDING___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodOverriding_0_1_initialbindings_blackBBBB(MethodOverriding _this,
			Match match, MMethodDefinition mMethod, MMethodDefinition mOverriding) {
		if (!mMethod.equals(mOverriding)) {
			return new Object[] { _this, match, mMethod, mOverriding };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_0_2_SolveCSP_bindingFBBBB(MethodOverriding _this, Match match,
			MMethodDefinition mMethod, MMethodDefinition mOverriding) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mMethod, mOverriding);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mMethod, mOverriding };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodOverriding_0_2_SolveCSP_bindingAndBlackFBBBB(MethodOverriding _this,
			Match match, MMethodDefinition mMethod, MMethodDefinition mOverriding) {
		Object[] result_pattern_MethodOverriding_0_2_SolveCSP_binding = pattern_MethodOverriding_0_2_SolveCSP_bindingFBBBB(
				_this, match, mMethod, mOverriding);
		if (result_pattern_MethodOverriding_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodOverriding_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodOverriding_0_2_SolveCSP_black = pattern_MethodOverriding_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodOverriding_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mMethod, mOverriding };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodOverriding_0_3_CheckCSP_expressionFBB(MethodOverriding _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_0_4_collectelementstobetranslated_blackBBB(Match match,
			MMethodDefinition mMethod, MMethodDefinition mOverriding) {
		if (!mMethod.equals(mOverriding)) {
			return new Object[] { match, mMethod, mOverriding };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MMethodDefinition mMethod, MMethodDefinition mOverriding) {
		EMoflonEdge mMethod__mOverriding____redefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOverriding__mMethod____redefinedMethodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMethod__mOverriding____redefinitions_name_prime = "redefinitions";
		String mOverriding__mMethod____redefinedMethodDeclaration_name_prime = "redefinedMethodDeclaration";
		mMethod__mOverriding____redefinitions.setSrc(mMethod);
		mMethod__mOverriding____redefinitions.setTrg(mOverriding);
		match.getToBeTranslatedEdges().add(mMethod__mOverriding____redefinitions);
		mOverriding__mMethod____redefinedMethodDeclaration.setSrc(mOverriding);
		mOverriding__mMethod____redefinedMethodDeclaration.setTrg(mMethod);
		match.getToBeTranslatedEdges().add(mOverriding__mMethod____redefinedMethodDeclaration);
		mMethod__mOverriding____redefinitions.setName(mMethod__mOverriding____redefinitions_name_prime);
		mOverriding__mMethod____redefinedMethodDeclaration
				.setName(mOverriding__mMethod____redefinedMethodDeclaration_name_prime);
		return new Object[] { match, mMethod, mOverriding, mMethod__mOverriding____redefinitions,
				mOverriding__mMethod____redefinedMethodDeclaration };
	}

	public static final Object[] pattern_MethodOverriding_0_5_collectcontextelements_blackBBB(Match match,
			MMethodDefinition mMethod, MMethodDefinition mOverriding) {
		if (!mMethod.equals(mOverriding)) {
			return new Object[] { match, mMethod, mOverriding };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_0_5_collectcontextelements_greenBBB(Match match,
			MMethodDefinition mMethod, MMethodDefinition mOverriding) {
		match.getContextNodes().add(mMethod);
		match.getContextNodes().add(mOverriding);
		return new Object[] { match, mMethod, mOverriding };
	}

	public static final void pattern_MethodOverriding_0_6_registerobjectstomatch_expressionBBBB(MethodOverriding _this,
			Match match, MMethodDefinition mMethod, MMethodDefinition mOverriding) {
		_this.registerObjectsToMatch_FWD(match, mMethod, mOverriding);

	}

	public static final boolean pattern_MethodOverriding_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodOverriding_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMethod");
		EObject _localVariable_1 = isApplicableMatch.getObject("tMethod");
		EObject _localVariable_2 = isApplicableMatch.getObject("mOverriding");
		EObject _localVariable_3 = isApplicableMatch.getObject("mMethodToTMethod");
		EObject _localVariable_4 = isApplicableMatch.getObject("mOverridingToTOverriding");
		EObject _localVariable_5 = isApplicableMatch.getObject("tOverriding");
		EObject tmpMMethod = _localVariable_0;
		EObject tmpTMethod = _localVariable_1;
		EObject tmpMOverriding = _localVariable_2;
		EObject tmpMMethodToTMethod = _localVariable_3;
		EObject tmpMOverridingToTOverriding = _localVariable_4;
		EObject tmpTOverriding = _localVariable_5;
		if (tmpMMethod instanceof MMethodDefinition) {
			MMethodDefinition mMethod = (MMethodDefinition) tmpMMethod;
			if (tmpTMethod instanceof TMethodDefinition) {
				TMethodDefinition tMethod = (TMethodDefinition) tmpTMethod;
				if (tmpMOverriding instanceof MMethodDefinition) {
					MMethodDefinition mOverriding = (MMethodDefinition) tmpMOverriding;
					if (tmpMMethodToTMethod instanceof MDefinitionToTMember) {
						MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) tmpMMethodToTMethod;
						if (tmpMOverridingToTOverriding instanceof MDefinitionToTMember) {
							MDefinitionToTMember mOverridingToTOverriding = (MDefinitionToTMember) tmpMOverridingToTOverriding;
							if (tmpTOverriding instanceof TMethodDefinition) {
								TMethodDefinition tOverriding = (TMethodDefinition) tmpTOverriding;
								return new Object[] { mMethod, tMethod, mOverriding, mMethodToTMethod,
										mOverridingToTOverriding, tOverriding, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_1_1_performtransformation_blackBBBBBBFBB(
			MMethodDefinition mMethod, TMethodDefinition tMethod, MMethodDefinition mOverriding,
			MDefinitionToTMember mMethodToTMethod, MDefinitionToTMember mOverridingToTOverriding,
			TMethodDefinition tOverriding, MethodOverriding _this, IsApplicableMatch isApplicableMatch) {
		if (!mMethod.equals(mOverriding)) {
			if (!tMethod.equals(tOverriding)) {
				if (!mMethodToTMethod.equals(mOverridingToTOverriding)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { mMethod, tMethod, mOverriding, mMethodToTMethod,
									mOverridingToTOverriding, tOverriding, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			MethodOverriding _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodOverriding_1_1_performtransformation_binding = pattern_MethodOverriding_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodOverriding_1_1_performtransformation_binding != null) {
			MMethodDefinition mMethod = (MMethodDefinition) result_pattern_MethodOverriding_1_1_performtransformation_binding[0];
			TMethodDefinition tMethod = (TMethodDefinition) result_pattern_MethodOverriding_1_1_performtransformation_binding[1];
			MMethodDefinition mOverriding = (MMethodDefinition) result_pattern_MethodOverriding_1_1_performtransformation_binding[2];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result_pattern_MethodOverriding_1_1_performtransformation_binding[3];
			MDefinitionToTMember mOverridingToTOverriding = (MDefinitionToTMember) result_pattern_MethodOverriding_1_1_performtransformation_binding[4];
			TMethodDefinition tOverriding = (TMethodDefinition) result_pattern_MethodOverriding_1_1_performtransformation_binding[5];

			Object[] result_pattern_MethodOverriding_1_1_performtransformation_black = pattern_MethodOverriding_1_1_performtransformation_blackBBBBBBFBB(
					mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding, tOverriding, _this,
					isApplicableMatch);
			if (result_pattern_MethodOverriding_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodOverriding_1_1_performtransformation_black[6];

				return new Object[] { mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding,
						tOverriding, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_1_1_performtransformation_greenBB(TMethodDefinition tMethod,
			TMethodDefinition tOverriding) {
		tMethod.getOverriddenBy().add(tOverriding);
		return new Object[] { tMethod, tOverriding };
	}

	public static final Object[] pattern_MethodOverriding_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodOverriding_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mMethod, EObject tMethod, EObject mOverriding,
			EObject mMethodToTMethod, EObject mOverridingToTOverriding, EObject tOverriding) {
		if (!mMethod.equals(tMethod)) {
			if (!mMethod.equals(mOverriding)) {
				if (!mMethod.equals(mMethodToTMethod)) {
					if (!mMethod.equals(mOverridingToTOverriding)) {
						if (!mMethod.equals(tOverriding)) {
							if (!tMethod.equals(tOverriding)) {
								if (!mOverriding.equals(tMethod)) {
									if (!mOverriding.equals(mOverridingToTOverriding)) {
										if (!mOverriding.equals(tOverriding)) {
											if (!mMethodToTMethod.equals(tMethod)) {
												if (!mMethodToTMethod.equals(mOverriding)) {
													if (!mMethodToTMethod.equals(mOverridingToTOverriding)) {
														if (!mMethodToTMethod.equals(tOverriding)) {
															if (!mOverridingToTOverriding.equals(tMethod)) {
																if (!mOverridingToTOverriding.equals(tOverriding)) {
																	return new Object[] { ruleresult, mMethod, tMethod,
																			mOverriding, mMethodToTMethod,
																			mOverridingToTOverriding, tOverriding };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodOverriding_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mMethod, EObject tMethod, EObject mOverriding, EObject tOverriding) {
		EMoflonEdge mMethod__mOverriding____redefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOverriding__mMethod____redefinedMethodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethod__tOverriding____overriddenBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOverriding__tMethod____overriding = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodOverriding";
		String mMethod__mOverriding____redefinitions_name_prime = "redefinitions";
		String mOverriding__mMethod____redefinedMethodDeclaration_name_prime = "redefinedMethodDeclaration";
		String tMethod__tOverriding____overriddenBy_name_prime = "overriddenBy";
		String tOverriding__tMethod____overriding_name_prime = "overriding";
		mMethod__mOverriding____redefinitions.setSrc(mMethod);
		mMethod__mOverriding____redefinitions.setTrg(mOverriding);
		ruleresult.getTranslatedEdges().add(mMethod__mOverriding____redefinitions);
		mOverriding__mMethod____redefinedMethodDeclaration.setSrc(mOverriding);
		mOverriding__mMethod____redefinedMethodDeclaration.setTrg(mMethod);
		ruleresult.getTranslatedEdges().add(mOverriding__mMethod____redefinedMethodDeclaration);
		tMethod__tOverriding____overriddenBy.setSrc(tMethod);
		tMethod__tOverriding____overriddenBy.setTrg(tOverriding);
		ruleresult.getCreatedEdges().add(tMethod__tOverriding____overriddenBy);
		tOverriding__tMethod____overriding.setSrc(tOverriding);
		tOverriding__tMethod____overriding.setTrg(tMethod);
		ruleresult.getCreatedEdges().add(tOverriding__tMethod____overriding);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mMethod__mOverriding____redefinitions.setName(mMethod__mOverriding____redefinitions_name_prime);
		mOverriding__mMethod____redefinedMethodDeclaration
				.setName(mOverriding__mMethod____redefinedMethodDeclaration_name_prime);
		tMethod__tOverriding____overriddenBy.setName(tMethod__tOverriding____overriddenBy_name_prime);
		tOverriding__tMethod____overriding.setName(tOverriding__tMethod____overriding_name_prime);
		return new Object[] { ruleresult, mMethod, tMethod, mOverriding, tOverriding,
				mMethod__mOverriding____redefinitions, mOverriding__mMethod____redefinedMethodDeclaration,
				tMethod__tOverriding____overriddenBy, tOverriding__tMethod____overriding };
	}

	public static final void pattern_MethodOverriding_1_5_registerobjects_expressionBBBBBBBB(MethodOverriding _this,
			PerformRuleResult ruleresult, EObject mMethod, EObject tMethod, EObject mOverriding,
			EObject mMethodToTMethod, EObject mOverridingToTOverriding, EObject tOverriding) {
		_this.registerObjects_FWD(ruleresult, mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding,
				tOverriding);

	}

	public static final PerformRuleResult pattern_MethodOverriding_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_2_1_preparereturnvalue_bindingFB(MethodOverriding _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodOverriding _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodOverriding _this) {
		Object[] result_pattern_MethodOverriding_2_1_preparereturnvalue_binding = pattern_MethodOverriding_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodOverriding_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodOverriding_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodOverriding_2_1_preparereturnvalue_black = pattern_MethodOverriding_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodOverriding_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodOverriding_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodOverriding";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodOverriding_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mMethod");
		EObject _localVariable_1 = match.getObject("mOverriding");
		EObject tmpMMethod = _localVariable_0;
		EObject tmpMOverriding = _localVariable_1;
		if (tmpMMethod instanceof MMethodDefinition) {
			MMethodDefinition mMethod = (MMethodDefinition) tmpMMethod;
			if (tmpMOverriding instanceof MMethodDefinition) {
				MMethodDefinition mOverriding = (MMethodDefinition) tmpMOverriding;
				return new Object[] { mMethod, mOverriding, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodOverriding_2_2_corematch_blackBFBFFFB(
			MMethodDefinition mMethod, MMethodDefinition mOverriding, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mMethod.equals(mOverriding)) {
			for (MDefinitionToTMember mMethodToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mMethod, MDefinitionToTMember.class, "source")) {
				TMember tmpTMethod = mMethodToTMethod.getTarget();
				if (tmpTMethod instanceof TMethodDefinition) {
					TMethodDefinition tMethod = (TMethodDefinition) tmpTMethod;
					for (MDefinitionToTMember mOverridingToTOverriding : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mOverriding, MDefinitionToTMember.class, "source")) {
						if (!mMethodToTMethod.equals(mOverridingToTOverriding)) {
							TMember tmpTOverriding = mOverridingToTOverriding.getTarget();
							if (tmpTOverriding instanceof TMethodDefinition) {
								TMethodDefinition tOverriding = (TMethodDefinition) tmpTOverriding;
								if (!tMethod.equals(tOverriding)) {
									_result.add(new Object[] { mMethod, tMethod, mOverriding, mMethodToTMethod,
											mOverridingToTOverriding, tOverriding, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodOverriding_2_3_findcontext_blackBBBBBB(
			MMethodDefinition mMethod, TMethodDefinition tMethod, MMethodDefinition mOverriding,
			MDefinitionToTMember mMethodToTMethod, MDefinitionToTMember mOverridingToTOverriding,
			TMethodDefinition tOverriding) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mMethod.equals(mOverriding)) {
			if (!tMethod.equals(tOverriding)) {
				if (!mMethodToTMethod.equals(mOverridingToTOverriding)) {
					if (mMethod.getRedefinitions().contains(mOverriding)) {
						if (mMethod.equals(mMethodToTMethod.getSource())) {
							if (mOverriding.equals(mOverridingToTOverriding.getSource())) {
								if (tMethod.equals(mMethodToTMethod.getTarget())) {
									if (tOverriding.equals(mOverridingToTOverriding.getTarget())) {
										_result.add(new Object[] { mMethod, tMethod, mOverriding, mMethodToTMethod,
												mOverridingToTOverriding, tOverriding });
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

	public static final Object[] pattern_MethodOverriding_2_3_findcontext_greenBBBBBBFFFFFFF(MMethodDefinition mMethod,
			TMethodDefinition tMethod, MMethodDefinition mOverriding, MDefinitionToTMember mMethodToTMethod,
			MDefinitionToTMember mOverridingToTOverriding, TMethodDefinition tOverriding) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMethod__mOverriding____redefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOverriding__mMethod____redefinedMethodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__mMethod____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOverridingToTOverriding__mOverriding____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__tMethod____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOverridingToTOverriding__tOverriding____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMethod__mOverriding____redefinitions_name_prime = "redefinitions";
		String mOverriding__mMethod____redefinedMethodDeclaration_name_prime = "redefinedMethodDeclaration";
		String mMethodToTMethod__mMethod____source_name_prime = "source";
		String mOverridingToTOverriding__mOverriding____source_name_prime = "source";
		String mMethodToTMethod__tMethod____target_name_prime = "target";
		String mOverridingToTOverriding__tOverriding____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mMethod);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(mOverriding);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod);
		isApplicableMatch.getAllContextElements().add(mOverridingToTOverriding);
		isApplicableMatch.getAllContextElements().add(tOverriding);
		mMethod__mOverriding____redefinitions.setSrc(mMethod);
		mMethod__mOverriding____redefinitions.setTrg(mOverriding);
		isApplicableMatch.getAllContextElements().add(mMethod__mOverriding____redefinitions);
		mOverriding__mMethod____redefinedMethodDeclaration.setSrc(mOverriding);
		mOverriding__mMethod____redefinedMethodDeclaration.setTrg(mMethod);
		isApplicableMatch.getAllContextElements().add(mOverriding__mMethod____redefinedMethodDeclaration);
		mMethodToTMethod__mMethod____source.setSrc(mMethodToTMethod);
		mMethodToTMethod__mMethod____source.setTrg(mMethod);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__mMethod____source);
		mOverridingToTOverriding__mOverriding____source.setSrc(mOverridingToTOverriding);
		mOverridingToTOverriding__mOverriding____source.setTrg(mOverriding);
		isApplicableMatch.getAllContextElements().add(mOverridingToTOverriding__mOverriding____source);
		mMethodToTMethod__tMethod____target.setSrc(mMethodToTMethod);
		mMethodToTMethod__tMethod____target.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__tMethod____target);
		mOverridingToTOverriding__tOverriding____target.setSrc(mOverridingToTOverriding);
		mOverridingToTOverriding__tOverriding____target.setTrg(tOverriding);
		isApplicableMatch.getAllContextElements().add(mOverridingToTOverriding__tOverriding____target);
		mMethod__mOverriding____redefinitions.setName(mMethod__mOverriding____redefinitions_name_prime);
		mOverriding__mMethod____redefinedMethodDeclaration
				.setName(mOverriding__mMethod____redefinedMethodDeclaration_name_prime);
		mMethodToTMethod__mMethod____source.setName(mMethodToTMethod__mMethod____source_name_prime);
		mOverridingToTOverriding__mOverriding____source
				.setName(mOverridingToTOverriding__mOverriding____source_name_prime);
		mMethodToTMethod__tMethod____target.setName(mMethodToTMethod__tMethod____target_name_prime);
		mOverridingToTOverriding__tOverriding____target
				.setName(mOverridingToTOverriding__tOverriding____target_name_prime);
		return new Object[] { mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding, tOverriding,
				isApplicableMatch, mMethod__mOverriding____redefinitions,
				mOverriding__mMethod____redefinedMethodDeclaration, mMethodToTMethod__mMethod____source,
				mOverridingToTOverriding__mOverriding____source, mMethodToTMethod__tMethod____target,
				mOverridingToTOverriding__tOverriding____target };
	}

	public static final Object[] pattern_MethodOverriding_2_4_solveCSP_bindingFBBBBBBBB(MethodOverriding _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition mMethod, TMethodDefinition tMethod,
			MMethodDefinition mOverriding, MDefinitionToTMember mMethodToTMethod,
			MDefinitionToTMember mOverridingToTOverriding, TMethodDefinition tOverriding) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mMethod, tMethod, mOverriding,
				mMethodToTMethod, mOverridingToTOverriding, tOverriding);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMethod, tMethod, mOverriding, mMethodToTMethod,
					mOverridingToTOverriding, tOverriding };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodOverriding_2_4_solveCSP_bindingAndBlackFBBBBBBBB(MethodOverriding _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition mMethod, TMethodDefinition tMethod,
			MMethodDefinition mOverriding, MDefinitionToTMember mMethodToTMethod,
			MDefinitionToTMember mOverridingToTOverriding, TMethodDefinition tOverriding) {
		Object[] result_pattern_MethodOverriding_2_4_solveCSP_binding = pattern_MethodOverriding_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding,
				tOverriding);
		if (result_pattern_MethodOverriding_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodOverriding_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodOverriding_2_4_solveCSP_black = pattern_MethodOverriding_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodOverriding_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMethod, tMethod, mOverriding, mMethodToTMethod,
						mOverridingToTOverriding, tOverriding };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodOverriding_2_5_checkCSP_expressionFBB(MethodOverriding _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodOverriding_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodOverriding";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodOverriding_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_10_1_initialbindings_blackBBBB(MethodOverriding _this,
			Match match, TMethodDefinition tMethod, TMethodDefinition tOverriding) {
		if (!tMethod.equals(tOverriding)) {
			return new Object[] { _this, match, tMethod, tOverriding };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_10_2_SolveCSP_bindingFBBBB(MethodOverriding _this,
			Match match, TMethodDefinition tMethod, TMethodDefinition tOverriding) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tMethod, tOverriding);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMethod, tOverriding };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodOverriding_10_2_SolveCSP_bindingAndBlackFBBBB(MethodOverriding _this,
			Match match, TMethodDefinition tMethod, TMethodDefinition tOverriding) {
		Object[] result_pattern_MethodOverriding_10_2_SolveCSP_binding = pattern_MethodOverriding_10_2_SolveCSP_bindingFBBBB(
				_this, match, tMethod, tOverriding);
		if (result_pattern_MethodOverriding_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodOverriding_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodOverriding_10_2_SolveCSP_black = pattern_MethodOverriding_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodOverriding_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tMethod, tOverriding };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodOverriding_10_3_CheckCSP_expressionFBB(MethodOverriding _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_10_4_collectelementstobetranslated_blackBBB(Match match,
			TMethodDefinition tMethod, TMethodDefinition tOverriding) {
		if (!tMethod.equals(tOverriding)) {
			return new Object[] { match, tMethod, tOverriding };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TMethodDefinition tMethod, TMethodDefinition tOverriding) {
		EMoflonEdge tMethod__tOverriding____overriddenBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOverriding__tMethod____overriding = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tMethod__tOverriding____overriddenBy_name_prime = "overriddenBy";
		String tOverriding__tMethod____overriding_name_prime = "overriding";
		tMethod__tOverriding____overriddenBy.setSrc(tMethod);
		tMethod__tOverriding____overriddenBy.setTrg(tOverriding);
		match.getToBeTranslatedEdges().add(tMethod__tOverriding____overriddenBy);
		tOverriding__tMethod____overriding.setSrc(tOverriding);
		tOverriding__tMethod____overriding.setTrg(tMethod);
		match.getToBeTranslatedEdges().add(tOverriding__tMethod____overriding);
		tMethod__tOverriding____overriddenBy.setName(tMethod__tOverriding____overriddenBy_name_prime);
		tOverriding__tMethod____overriding.setName(tOverriding__tMethod____overriding_name_prime);
		return new Object[] { match, tMethod, tOverriding, tMethod__tOverriding____overriddenBy,
				tOverriding__tMethod____overriding };
	}

	public static final Object[] pattern_MethodOverriding_10_5_collectcontextelements_blackBBB(Match match,
			TMethodDefinition tMethod, TMethodDefinition tOverriding) {
		if (!tMethod.equals(tOverriding)) {
			return new Object[] { match, tMethod, tOverriding };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_10_5_collectcontextelements_greenBBB(Match match,
			TMethodDefinition tMethod, TMethodDefinition tOverriding) {
		match.getContextNodes().add(tMethod);
		match.getContextNodes().add(tOverriding);
		return new Object[] { match, tMethod, tOverriding };
	}

	public static final void pattern_MethodOverriding_10_6_registerobjectstomatch_expressionBBBB(MethodOverriding _this,
			Match match, TMethodDefinition tMethod, TMethodDefinition tOverriding) {
		_this.registerObjectsToMatch_BWD(match, tMethod, tOverriding);

	}

	public static final boolean pattern_MethodOverriding_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodOverriding_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMethod");
		EObject _localVariable_1 = isApplicableMatch.getObject("tMethod");
		EObject _localVariable_2 = isApplicableMatch.getObject("mOverriding");
		EObject _localVariable_3 = isApplicableMatch.getObject("mMethodToTMethod");
		EObject _localVariable_4 = isApplicableMatch.getObject("mOverridingToTOverriding");
		EObject _localVariable_5 = isApplicableMatch.getObject("tOverriding");
		EObject tmpMMethod = _localVariable_0;
		EObject tmpTMethod = _localVariable_1;
		EObject tmpMOverriding = _localVariable_2;
		EObject tmpMMethodToTMethod = _localVariable_3;
		EObject tmpMOverridingToTOverriding = _localVariable_4;
		EObject tmpTOverriding = _localVariable_5;
		if (tmpMMethod instanceof MMethodDefinition) {
			MMethodDefinition mMethod = (MMethodDefinition) tmpMMethod;
			if (tmpTMethod instanceof TMethodDefinition) {
				TMethodDefinition tMethod = (TMethodDefinition) tmpTMethod;
				if (tmpMOverriding instanceof MMethodDefinition) {
					MMethodDefinition mOverriding = (MMethodDefinition) tmpMOverriding;
					if (tmpMMethodToTMethod instanceof MDefinitionToTMember) {
						MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) tmpMMethodToTMethod;
						if (tmpMOverridingToTOverriding instanceof MDefinitionToTMember) {
							MDefinitionToTMember mOverridingToTOverriding = (MDefinitionToTMember) tmpMOverridingToTOverriding;
							if (tmpTOverriding instanceof TMethodDefinition) {
								TMethodDefinition tOverriding = (TMethodDefinition) tmpTOverriding;
								return new Object[] { mMethod, tMethod, mOverriding, mMethodToTMethod,
										mOverridingToTOverriding, tOverriding, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_11_1_performtransformation_blackBBBBBBFBB(
			MMethodDefinition mMethod, TMethodDefinition tMethod, MMethodDefinition mOverriding,
			MDefinitionToTMember mMethodToTMethod, MDefinitionToTMember mOverridingToTOverriding,
			TMethodDefinition tOverriding, MethodOverriding _this, IsApplicableMatch isApplicableMatch) {
		if (!mMethod.equals(mOverriding)) {
			if (!tMethod.equals(tOverriding)) {
				if (!mMethodToTMethod.equals(mOverridingToTOverriding)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { mMethod, tMethod, mOverriding, mMethodToTMethod,
									mOverridingToTOverriding, tOverriding, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			MethodOverriding _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodOverriding_11_1_performtransformation_binding = pattern_MethodOverriding_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodOverriding_11_1_performtransformation_binding != null) {
			MMethodDefinition mMethod = (MMethodDefinition) result_pattern_MethodOverriding_11_1_performtransformation_binding[0];
			TMethodDefinition tMethod = (TMethodDefinition) result_pattern_MethodOverriding_11_1_performtransformation_binding[1];
			MMethodDefinition mOverriding = (MMethodDefinition) result_pattern_MethodOverriding_11_1_performtransformation_binding[2];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result_pattern_MethodOverriding_11_1_performtransformation_binding[3];
			MDefinitionToTMember mOverridingToTOverriding = (MDefinitionToTMember) result_pattern_MethodOverriding_11_1_performtransformation_binding[4];
			TMethodDefinition tOverriding = (TMethodDefinition) result_pattern_MethodOverriding_11_1_performtransformation_binding[5];

			Object[] result_pattern_MethodOverriding_11_1_performtransformation_black = pattern_MethodOverriding_11_1_performtransformation_blackBBBBBBFBB(
					mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding, tOverriding, _this,
					isApplicableMatch);
			if (result_pattern_MethodOverriding_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodOverriding_11_1_performtransformation_black[6];

				return new Object[] { mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding,
						tOverriding, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_11_1_performtransformation_greenBB(MMethodDefinition mMethod,
			MMethodDefinition mOverriding) {
		mMethod.getRedefinitions().add(mOverriding);
		return new Object[] { mMethod, mOverriding };
	}

	public static final Object[] pattern_MethodOverriding_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodOverriding_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mMethod, EObject tMethod, EObject mOverriding,
			EObject mMethodToTMethod, EObject mOverridingToTOverriding, EObject tOverriding) {
		if (!mMethod.equals(tMethod)) {
			if (!mMethod.equals(mOverriding)) {
				if (!mMethod.equals(mMethodToTMethod)) {
					if (!mMethod.equals(mOverridingToTOverriding)) {
						if (!mMethod.equals(tOverriding)) {
							if (!tMethod.equals(tOverriding)) {
								if (!mOverriding.equals(tMethod)) {
									if (!mOverriding.equals(mOverridingToTOverriding)) {
										if (!mOverriding.equals(tOverriding)) {
											if (!mMethodToTMethod.equals(tMethod)) {
												if (!mMethodToTMethod.equals(mOverriding)) {
													if (!mMethodToTMethod.equals(mOverridingToTOverriding)) {
														if (!mMethodToTMethod.equals(tOverriding)) {
															if (!mOverridingToTOverriding.equals(tMethod)) {
																if (!mOverridingToTOverriding.equals(tOverriding)) {
																	return new Object[] { ruleresult, mMethod, tMethod,
																			mOverriding, mMethodToTMethod,
																			mOverridingToTOverriding, tOverriding };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodOverriding_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mMethod, EObject tMethod, EObject mOverriding, EObject tOverriding) {
		EMoflonEdge mMethod__mOverriding____redefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOverriding__mMethod____redefinedMethodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethod__tOverriding____overriddenBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOverriding__tMethod____overriding = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodOverriding";
		String mMethod__mOverriding____redefinitions_name_prime = "redefinitions";
		String mOverriding__mMethod____redefinedMethodDeclaration_name_prime = "redefinedMethodDeclaration";
		String tMethod__tOverriding____overriddenBy_name_prime = "overriddenBy";
		String tOverriding__tMethod____overriding_name_prime = "overriding";
		mMethod__mOverriding____redefinitions.setSrc(mMethod);
		mMethod__mOverriding____redefinitions.setTrg(mOverriding);
		ruleresult.getCreatedEdges().add(mMethod__mOverriding____redefinitions);
		mOverriding__mMethod____redefinedMethodDeclaration.setSrc(mOverriding);
		mOverriding__mMethod____redefinedMethodDeclaration.setTrg(mMethod);
		ruleresult.getCreatedEdges().add(mOverriding__mMethod____redefinedMethodDeclaration);
		tMethod__tOverriding____overriddenBy.setSrc(tMethod);
		tMethod__tOverriding____overriddenBy.setTrg(tOverriding);
		ruleresult.getTranslatedEdges().add(tMethod__tOverriding____overriddenBy);
		tOverriding__tMethod____overriding.setSrc(tOverriding);
		tOverriding__tMethod____overriding.setTrg(tMethod);
		ruleresult.getTranslatedEdges().add(tOverriding__tMethod____overriding);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mMethod__mOverriding____redefinitions.setName(mMethod__mOverriding____redefinitions_name_prime);
		mOverriding__mMethod____redefinedMethodDeclaration
				.setName(mOverriding__mMethod____redefinedMethodDeclaration_name_prime);
		tMethod__tOverriding____overriddenBy.setName(tMethod__tOverriding____overriddenBy_name_prime);
		tOverriding__tMethod____overriding.setName(tOverriding__tMethod____overriding_name_prime);
		return new Object[] { ruleresult, mMethod, tMethod, mOverriding, tOverriding,
				mMethod__mOverriding____redefinitions, mOverriding__mMethod____redefinedMethodDeclaration,
				tMethod__tOverriding____overriddenBy, tOverriding__tMethod____overriding };
	}

	public static final void pattern_MethodOverriding_11_5_registerobjects_expressionBBBBBBBB(MethodOverriding _this,
			PerformRuleResult ruleresult, EObject mMethod, EObject tMethod, EObject mOverriding,
			EObject mMethodToTMethod, EObject mOverridingToTOverriding, EObject tOverriding) {
		_this.registerObjects_BWD(ruleresult, mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding,
				tOverriding);

	}

	public static final PerformRuleResult pattern_MethodOverriding_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_12_1_preparereturnvalue_bindingFB(MethodOverriding _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodOverriding _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodOverriding _this) {
		Object[] result_pattern_MethodOverriding_12_1_preparereturnvalue_binding = pattern_MethodOverriding_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodOverriding_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodOverriding_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodOverriding_12_1_preparereturnvalue_black = pattern_MethodOverriding_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodOverriding_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodOverriding_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodOverriding";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodOverriding_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tMethod");
		EObject _localVariable_1 = match.getObject("tOverriding");
		EObject tmpTMethod = _localVariable_0;
		EObject tmpTOverriding = _localVariable_1;
		if (tmpTMethod instanceof TMethodDefinition) {
			TMethodDefinition tMethod = (TMethodDefinition) tmpTMethod;
			if (tmpTOverriding instanceof TMethodDefinition) {
				TMethodDefinition tOverriding = (TMethodDefinition) tmpTOverriding;
				return new Object[] { tMethod, tOverriding, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodOverriding_12_2_corematch_blackFBFFFBB(
			TMethodDefinition tMethod, TMethodDefinition tOverriding, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tMethod.equals(tOverriding)) {
			for (MDefinitionToTMember mMethodToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tMethod, MDefinitionToTMember.class, "target")) {
				BodyDeclaration tmpMMethod = mMethodToTMethod.getSource();
				if (tmpMMethod instanceof MMethodDefinition) {
					MMethodDefinition mMethod = (MMethodDefinition) tmpMMethod;
					for (MDefinitionToTMember mOverridingToTOverriding : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tOverriding, MDefinitionToTMember.class, "target")) {
						if (!mMethodToTMethod.equals(mOverridingToTOverriding)) {
							BodyDeclaration tmpMOverriding = mOverridingToTOverriding.getSource();
							if (tmpMOverriding instanceof MMethodDefinition) {
								MMethodDefinition mOverriding = (MMethodDefinition) tmpMOverriding;
								if (!mMethod.equals(mOverriding)) {
									_result.add(new Object[] { mMethod, tMethod, mOverriding, mMethodToTMethod,
											mOverridingToTOverriding, tOverriding, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodOverriding_12_3_findcontext_blackBBBBBB(
			MMethodDefinition mMethod, TMethodDefinition tMethod, MMethodDefinition mOverriding,
			MDefinitionToTMember mMethodToTMethod, MDefinitionToTMember mOverridingToTOverriding,
			TMethodDefinition tOverriding) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mMethod.equals(mOverriding)) {
			if (!tMethod.equals(tOverriding)) {
				if (!mMethodToTMethod.equals(mOverridingToTOverriding)) {
					if (tMethod.getOverriddenBy().contains(tOverriding)) {
						if (mMethod.equals(mMethodToTMethod.getSource())) {
							if (mOverriding.equals(mOverridingToTOverriding.getSource())) {
								if (tMethod.equals(mMethodToTMethod.getTarget())) {
									if (tOverriding.equals(mOverridingToTOverriding.getTarget())) {
										_result.add(new Object[] { mMethod, tMethod, mOverriding, mMethodToTMethod,
												mOverridingToTOverriding, tOverriding });
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

	public static final Object[] pattern_MethodOverriding_12_3_findcontext_greenBBBBBBFFFFFFF(MMethodDefinition mMethod,
			TMethodDefinition tMethod, MMethodDefinition mOverriding, MDefinitionToTMember mMethodToTMethod,
			MDefinitionToTMember mOverridingToTOverriding, TMethodDefinition tOverriding) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tMethod__tOverriding____overriddenBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOverriding__tMethod____overriding = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__mMethod____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOverridingToTOverriding__mOverriding____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__tMethod____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOverridingToTOverriding__tOverriding____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tMethod__tOverriding____overriddenBy_name_prime = "overriddenBy";
		String tOverriding__tMethod____overriding_name_prime = "overriding";
		String mMethodToTMethod__mMethod____source_name_prime = "source";
		String mOverridingToTOverriding__mOverriding____source_name_prime = "source";
		String mMethodToTMethod__tMethod____target_name_prime = "target";
		String mOverridingToTOverriding__tOverriding____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mMethod);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(mOverriding);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod);
		isApplicableMatch.getAllContextElements().add(mOverridingToTOverriding);
		isApplicableMatch.getAllContextElements().add(tOverriding);
		tMethod__tOverriding____overriddenBy.setSrc(tMethod);
		tMethod__tOverriding____overriddenBy.setTrg(tOverriding);
		isApplicableMatch.getAllContextElements().add(tMethod__tOverriding____overriddenBy);
		tOverriding__tMethod____overriding.setSrc(tOverriding);
		tOverriding__tMethod____overriding.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(tOverriding__tMethod____overriding);
		mMethodToTMethod__mMethod____source.setSrc(mMethodToTMethod);
		mMethodToTMethod__mMethod____source.setTrg(mMethod);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__mMethod____source);
		mOverridingToTOverriding__mOverriding____source.setSrc(mOverridingToTOverriding);
		mOverridingToTOverriding__mOverriding____source.setTrg(mOverriding);
		isApplicableMatch.getAllContextElements().add(mOverridingToTOverriding__mOverriding____source);
		mMethodToTMethod__tMethod____target.setSrc(mMethodToTMethod);
		mMethodToTMethod__tMethod____target.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__tMethod____target);
		mOverridingToTOverriding__tOverriding____target.setSrc(mOverridingToTOverriding);
		mOverridingToTOverriding__tOverriding____target.setTrg(tOverriding);
		isApplicableMatch.getAllContextElements().add(mOverridingToTOverriding__tOverriding____target);
		tMethod__tOverriding____overriddenBy.setName(tMethod__tOverriding____overriddenBy_name_prime);
		tOverriding__tMethod____overriding.setName(tOverriding__tMethod____overriding_name_prime);
		mMethodToTMethod__mMethod____source.setName(mMethodToTMethod__mMethod____source_name_prime);
		mOverridingToTOverriding__mOverriding____source
				.setName(mOverridingToTOverriding__mOverriding____source_name_prime);
		mMethodToTMethod__tMethod____target.setName(mMethodToTMethod__tMethod____target_name_prime);
		mOverridingToTOverriding__tOverriding____target
				.setName(mOverridingToTOverriding__tOverriding____target_name_prime);
		return new Object[] { mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding, tOverriding,
				isApplicableMatch, tMethod__tOverriding____overriddenBy, tOverriding__tMethod____overriding,
				mMethodToTMethod__mMethod____source, mOverridingToTOverriding__mOverriding____source,
				mMethodToTMethod__tMethod____target, mOverridingToTOverriding__tOverriding____target };
	}

	public static final Object[] pattern_MethodOverriding_12_4_solveCSP_bindingFBBBBBBBB(MethodOverriding _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition mMethod, TMethodDefinition tMethod,
			MMethodDefinition mOverriding, MDefinitionToTMember mMethodToTMethod,
			MDefinitionToTMember mOverridingToTOverriding, TMethodDefinition tOverriding) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mMethod, tMethod, mOverriding,
				mMethodToTMethod, mOverridingToTOverriding, tOverriding);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMethod, tMethod, mOverriding, mMethodToTMethod,
					mOverridingToTOverriding, tOverriding };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodOverriding_12_4_solveCSP_bindingAndBlackFBBBBBBBB(MethodOverriding _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition mMethod, TMethodDefinition tMethod,
			MMethodDefinition mOverriding, MDefinitionToTMember mMethodToTMethod,
			MDefinitionToTMember mOverridingToTOverriding, TMethodDefinition tOverriding) {
		Object[] result_pattern_MethodOverriding_12_4_solveCSP_binding = pattern_MethodOverriding_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding,
				tOverriding);
		if (result_pattern_MethodOverriding_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodOverriding_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodOverriding_12_4_solveCSP_black = pattern_MethodOverriding_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodOverriding_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMethod, tMethod, mOverriding, mMethodToTMethod,
						mOverridingToTOverriding, tOverriding };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodOverriding_12_5_checkCSP_expressionFBB(MethodOverriding _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodOverriding_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodOverriding";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodOverriding_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_20_1_preparereturnvalue_bindingFB(MethodOverriding _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodOverriding _this) {
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

	public static final Object[] pattern_MethodOverriding_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodOverriding _this) {
		Object[] result_pattern_MethodOverriding_20_1_preparereturnvalue_binding = pattern_MethodOverriding_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodOverriding_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodOverriding_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodOverriding_20_1_preparereturnvalue_black = pattern_MethodOverriding_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodOverriding_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodOverriding_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodOverriding_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodOverriding_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_overriddenBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMethod = _edge_overriddenBy.getSrc();
		if (tmpTMethod instanceof TMethodDefinition) {
			TMethodDefinition tMethod = (TMethodDefinition) tmpTMethod;
			EObject tmpTOverriding = _edge_overriddenBy.getTrg();
			if (tmpTOverriding instanceof TMethodDefinition) {
				TMethodDefinition tOverriding = (TMethodDefinition) tmpTOverriding;
				if (!tMethod.equals(tOverriding)) {
					if (tMethod.getOverriddenBy().contains(tOverriding)) {
						_result.add(new Object[] { tMethod, tOverriding, _edge_overriddenBy });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodOverriding_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodOverriding_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodOverriding _this, Match match, TMethodDefinition tMethod, TMethodDefinition tOverriding) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tMethod, tOverriding);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodOverriding_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodOverriding _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodOverriding_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_21_1_preparereturnvalue_bindingFB(MethodOverriding _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodOverriding _this) {
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

	public static final Object[] pattern_MethodOverriding_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodOverriding _this) {
		Object[] result_pattern_MethodOverriding_21_1_preparereturnvalue_binding = pattern_MethodOverriding_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodOverriding_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodOverriding_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodOverriding_21_1_preparereturnvalue_black = pattern_MethodOverriding_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodOverriding_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodOverriding_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodOverriding_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodOverriding_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_redefinitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMMethod = _edge_redefinitions.getSrc();
		if (tmpMMethod instanceof MMethodDefinition) {
			MMethodDefinition mMethod = (MMethodDefinition) tmpMMethod;
			EObject tmpMOverriding = _edge_redefinitions.getTrg();
			if (tmpMOverriding instanceof MMethodDefinition) {
				MMethodDefinition mOverriding = (MMethodDefinition) tmpMOverriding;
				if (!mMethod.equals(mOverriding)) {
					if (mMethod.getRedefinitions().contains(mOverriding)) {
						_result.add(new Object[] { mMethod, mOverriding, _edge_redefinitions });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodOverriding_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodOverriding_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodOverriding _this, Match match, MMethodDefinition mMethod, MMethodDefinition mOverriding) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mMethod, mOverriding);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodOverriding_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodOverriding _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodOverriding_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_24_1_prepare_blackB(MethodOverriding _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodOverriding_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodOverriding_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mMethod");
		EObject _localVariable_1 = targetMatch.getObject("tMethod");
		EObject _localVariable_2 = sourceMatch.getObject("mOverriding");
		EObject _localVariable_3 = targetMatch.getObject("tOverriding");
		EObject tmpMMethod = _localVariable_0;
		EObject tmpTMethod = _localVariable_1;
		EObject tmpMOverriding = _localVariable_2;
		EObject tmpTOverriding = _localVariable_3;
		if (tmpMMethod instanceof MMethodDefinition) {
			MMethodDefinition mMethod = (MMethodDefinition) tmpMMethod;
			if (tmpTMethod instanceof TMethodDefinition) {
				TMethodDefinition tMethod = (TMethodDefinition) tmpTMethod;
				if (tmpMOverriding instanceof MMethodDefinition) {
					MMethodDefinition mOverriding = (MMethodDefinition) tmpMOverriding;
					if (tmpTOverriding instanceof TMethodDefinition) {
						TMethodDefinition tOverriding = (TMethodDefinition) tmpTOverriding;
						return new Object[] { mMethod, tMethod, mOverriding, tOverriding, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_24_2_matchsrctrgcontext_blackBBBBBB(MMethodDefinition mMethod,
			TMethodDefinition tMethod, MMethodDefinition mOverriding, TMethodDefinition tOverriding, Match sourceMatch,
			Match targetMatch) {
		if (!mMethod.equals(mOverriding)) {
			if (!tMethod.equals(tOverriding)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { mMethod, tMethod, mOverriding, tOverriding, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodOverriding_24_2_matchsrctrgcontext_binding = pattern_MethodOverriding_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_MethodOverriding_24_2_matchsrctrgcontext_binding != null) {
			MMethodDefinition mMethod = (MMethodDefinition) result_pattern_MethodOverriding_24_2_matchsrctrgcontext_binding[0];
			TMethodDefinition tMethod = (TMethodDefinition) result_pattern_MethodOverriding_24_2_matchsrctrgcontext_binding[1];
			MMethodDefinition mOverriding = (MMethodDefinition) result_pattern_MethodOverriding_24_2_matchsrctrgcontext_binding[2];
			TMethodDefinition tOverriding = (TMethodDefinition) result_pattern_MethodOverriding_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_MethodOverriding_24_2_matchsrctrgcontext_black = pattern_MethodOverriding_24_2_matchsrctrgcontext_blackBBBBBB(
					mMethod, tMethod, mOverriding, tOverriding, sourceMatch, targetMatch);
			if (result_pattern_MethodOverriding_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mMethod, tMethod, mOverriding, tOverriding, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_24_3_solvecsp_bindingFBBBBBBB(MethodOverriding _this,
			MMethodDefinition mMethod, TMethodDefinition tMethod, MMethodDefinition mOverriding,
			TMethodDefinition tOverriding, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(mMethod, tMethod, mOverriding, tOverriding, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, mMethod, tMethod, mOverriding, tOverriding, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodOverriding_24_3_solvecsp_bindingAndBlackFBBBBBBB(MethodOverriding _this,
			MMethodDefinition mMethod, TMethodDefinition tMethod, MMethodDefinition mOverriding,
			TMethodDefinition tOverriding, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodOverriding_24_3_solvecsp_binding = pattern_MethodOverriding_24_3_solvecsp_bindingFBBBBBBB(
				_this, mMethod, tMethod, mOverriding, tOverriding, sourceMatch, targetMatch);
		if (result_pattern_MethodOverriding_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodOverriding_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodOverriding_24_3_solvecsp_black = pattern_MethodOverriding_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodOverriding_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mMethod, tMethod, mOverriding, tOverriding, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodOverriding_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodOverriding_24_5_matchcorrcontext_blackBBBFFBBB(
			MMethodDefinition mMethod, TMethodDefinition tMethod, MMethodDefinition mOverriding,
			TMethodDefinition tOverriding, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mMethod.equals(mOverriding)) {
			if (!tMethod.equals(tOverriding)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (MDefinitionToTMember mMethodToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mMethod, MDefinitionToTMember.class, "source")) {
						if (tMethod.equals(mMethodToTMethod.getTarget())) {
							for (MDefinitionToTMember mOverridingToTOverriding : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mOverriding, MDefinitionToTMember.class, "source")) {
								if (!mMethodToTMethod.equals(mOverridingToTOverriding)) {
									if (tOverriding.equals(mOverridingToTOverriding.getTarget())) {
										_result.add(new Object[] { mMethod, tMethod, mOverriding, mMethodToTMethod,
												mOverridingToTOverriding, tOverriding, sourceMatch, targetMatch });
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

	public static final Object[] pattern_MethodOverriding_24_5_matchcorrcontext_greenBBBBF(
			MDefinitionToTMember mMethodToTMethod, MDefinitionToTMember mOverridingToTOverriding, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodOverriding";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mMethodToTMethod);
		ccMatch.getAllContextElements().add(mOverridingToTOverriding);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mMethodToTMethod, mOverridingToTOverriding, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodOverriding_24_6_createcorrespondence_blackBBBBB(
			MMethodDefinition mMethod, TMethodDefinition tMethod, MMethodDefinition mOverriding,
			TMethodDefinition tOverriding, CCMatch ccMatch) {
		if (!mMethod.equals(mOverriding)) {
			if (!tMethod.equals(tOverriding)) {
				return new Object[] { mMethod, tMethod, mOverriding, tOverriding, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodOverriding_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodOverriding";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodOverriding_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_27_1_matchtggpattern_blackBB(MMethodDefinition mMethod,
			MMethodDefinition mOverriding) {
		if (!mMethod.equals(mOverriding)) {
			if (mMethod.getRedefinitions().contains(mOverriding)) {
				return new Object[] { mMethod, mOverriding };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodOverriding_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodOverriding_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_28_1_matchtggpattern_blackBB(TMethodDefinition tMethod,
			TMethodDefinition tOverriding) {
		if (!tMethod.equals(tOverriding)) {
			if (tMethod.getOverriddenBy().contains(tOverriding)) {
				return new Object[] { tMethod, tOverriding };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodOverriding_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodOverriding_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_29_1_createresult_blackB(MethodOverriding _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodOverriding_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodOverriding_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MMethodDefinition mMethod) {
		if (ruleResult.getSourceObjects().contains(mMethod)) {
			return new Object[] { ruleResult, mMethod };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMethodToTMethod) {
		if (ruleResult.getCorrObjects().contains(mMethodToTMethod)) {
			return new Object[] { ruleResult, mMethodToTMethod };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMethodDefinition tMethod) {
		if (ruleResult.getTargetObjects().contains(tMethod)) {
			return new Object[] { ruleResult, tMethod };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MMethodDefinition mOverriding) {
		if (ruleResult.getSourceObjects().contains(mOverriding)) {
			return new Object[] { ruleResult, mOverriding };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mOverridingToTOverriding) {
		if (ruleResult.getCorrObjects().contains(mOverridingToTOverriding)) {
			return new Object[] { ruleResult, mOverridingToTOverriding };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TMethodDefinition tOverriding) {
		if (ruleResult.getTargetObjects().contains(tOverriding)) {
			return new Object[] { ruleResult, tOverriding };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodOverriding_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mMethodToTMethodList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mOverridingToTOverridingList : ruleEntryContainer.getRuleEntryList()) {
				if (!mMethodToTMethodList.equals(mOverridingToTOverridingList)) {
					for (EObject tmpMMethodToTMethod : mMethodToTMethodList.getEntryObjects()) {
						if (tmpMMethodToTMethod instanceof MDefinitionToTMember) {
							MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) tmpMMethodToTMethod;
							BodyDeclaration tmpMMethod = mMethodToTMethod.getSource();
							if (tmpMMethod instanceof MMethodDefinition) {
								MMethodDefinition mMethod = (MMethodDefinition) tmpMMethod;
								TMember tmpTMethod = mMethodToTMethod.getTarget();
								if (tmpTMethod instanceof TMethodDefinition) {
									TMethodDefinition tMethod = (TMethodDefinition) tmpTMethod;
									if (pattern_MethodOverriding_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mMethodToTMethod) == null) {
										if (pattern_MethodOverriding_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												mMethod) == null) {
											if (pattern_MethodOverriding_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													tMethod) == null) {
												for (EObject tmpMOverridingToTOverriding : mOverridingToTOverridingList
														.getEntryObjects()) {
													if (tmpMOverridingToTOverriding instanceof MDefinitionToTMember) {
														MDefinitionToTMember mOverridingToTOverriding = (MDefinitionToTMember) tmpMOverridingToTOverriding;
														if (!mMethodToTMethod.equals(mOverridingToTOverriding)) {
															BodyDeclaration tmpMOverriding = mOverridingToTOverriding
																	.getSource();
															if (tmpMOverriding instanceof MMethodDefinition) {
																MMethodDefinition mOverriding = (MMethodDefinition) tmpMOverriding;
																if (!mMethod.equals(mOverriding)) {
																	TMember tmpTOverriding = mOverridingToTOverriding
																			.getTarget();
																	if (tmpTOverriding instanceof TMethodDefinition) {
																		TMethodDefinition tOverriding = (TMethodDefinition) tmpTOverriding;
																		if (!tMethod.equals(tOverriding)) {
																			if (pattern_MethodOverriding_29_2_isapplicablecore_black_nac_4BB(
																					ruleResult,
																					mOverridingToTOverriding) == null) {
																				if (pattern_MethodOverriding_29_2_isapplicablecore_black_nac_3BB(
																						ruleResult,
																						mOverriding) == null) {
																					if (pattern_MethodOverriding_29_2_isapplicablecore_black_nac_5BB(
																							ruleResult,
																							tOverriding) == null) {
																						_result.add(new Object[] {
																								mMethodToTMethodList,
																								mMethod,
																								mMethodToTMethod,
																								tMethod,
																								mOverridingToTOverridingList,
																								mOverriding,
																								mOverridingToTOverriding,
																								tOverriding,
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
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_29_3_solveCSP_bindingFBBBBBBBBB(MethodOverriding _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition mMethod, TMethodDefinition tMethod,
			MMethodDefinition mOverriding, MDefinitionToTMember mMethodToTMethod,
			MDefinitionToTMember mOverridingToTOverriding, TMethodDefinition tOverriding,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mMethod, tMethod, mOverriding,
				mMethodToTMethod, mOverridingToTOverriding, tOverriding, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMethod, tMethod, mOverriding, mMethodToTMethod,
					mOverridingToTOverriding, tOverriding, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodOverriding_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodOverriding _this, IsApplicableMatch isApplicableMatch, MMethodDefinition mMethod,
			TMethodDefinition tMethod, MMethodDefinition mOverriding, MDefinitionToTMember mMethodToTMethod,
			MDefinitionToTMember mOverridingToTOverriding, TMethodDefinition tOverriding,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodOverriding_29_3_solveCSP_binding = pattern_MethodOverriding_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding,
				tOverriding, ruleResult);
		if (result_pattern_MethodOverriding_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodOverriding_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodOverriding_29_3_solveCSP_black = pattern_MethodOverriding_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodOverriding_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMethod, tMethod, mOverriding, mMethodToTMethod,
						mOverridingToTOverriding, tOverriding, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodOverriding_29_4_checkCSP_expressionFBB(MethodOverriding _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodOverriding_29_5_checknacs_blackBBBBBB(MMethodDefinition mMethod,
			TMethodDefinition tMethod, MMethodDefinition mOverriding, MDefinitionToTMember mMethodToTMethod,
			MDefinitionToTMember mOverridingToTOverriding, TMethodDefinition tOverriding) {
		if (!mMethod.equals(mOverriding)) {
			if (!tMethod.equals(tOverriding)) {
				if (!mMethodToTMethod.equals(mOverridingToTOverriding)) {
					return new Object[] { mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding,
							tOverriding };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_29_6_perform_blackBBBBBBB(MMethodDefinition mMethod,
			TMethodDefinition tMethod, MMethodDefinition mOverriding, MDefinitionToTMember mMethodToTMethod,
			MDefinitionToTMember mOverridingToTOverriding, TMethodDefinition tOverriding,
			ModelgeneratorRuleResult ruleResult) {
		if (!mMethod.equals(mOverriding)) {
			if (!tMethod.equals(tOverriding)) {
				if (!mMethodToTMethod.equals(mOverridingToTOverriding)) {
					return new Object[] { mMethod, tMethod, mOverriding, mMethodToTMethod, mOverridingToTOverriding,
							tOverriding, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodOverriding_29_6_perform_greenBBBBB(MMethodDefinition mMethod,
			TMethodDefinition tMethod, MMethodDefinition mOverriding, TMethodDefinition tOverriding,
			ModelgeneratorRuleResult ruleResult) {
		mMethod.getRedefinitions().add(mOverriding);
		tMethod.getOverriddenBy().add(tOverriding);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mMethod, tMethod, mOverriding, tOverriding, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodOverriding_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodOverridingImpl
