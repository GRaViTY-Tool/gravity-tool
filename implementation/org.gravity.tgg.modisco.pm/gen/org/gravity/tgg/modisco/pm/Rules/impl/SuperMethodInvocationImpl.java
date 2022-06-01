/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.BodyDeclaration;

import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MSuperMethodInvocation;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.AbstractMethodInvocationToTAccess;
import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.RulesPackage;
import org.gravity.tgg.modisco.pm.Rules.SuperMethodInvocation;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TCall;
import org.gravity.typegraph.basic.TMember;

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
 * An implementation of the model object '<em><b>Super Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SuperMethodInvocationImpl extends AbstractRuleImpl implements SuperMethodInvocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperMethodInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSuperMethodInvocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MSuperMethodInvocation invocation, MDefinition mMember) {

		Object[] result1_black = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_0_1_initialbindings_blackBBBB(this, match, invocation, mMember);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[invocation] = " + invocation + ", " + "[mMember] = " + mMember + ".");
		}

		Object[] result2_bindingAndBlack = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, invocation, mMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[invocation] = " + invocation + ", " + "[mMember] = " + mMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SuperMethodInvocationImpl.pattern_SuperMethodInvocation_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SuperMethodInvocationImpl
					.pattern_SuperMethodInvocation_0_4_collectelementstobetranslated_blackBBB(match, invocation,
							mMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[invocation] = " + invocation + ", " + "[mMember] = " + mMember + ".");
			}
			SuperMethodInvocationImpl.pattern_SuperMethodInvocation_0_4_collectelementstobetranslated_greenBBBF(match,
					invocation, mMember);
			//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result4_green[3];

			Object[] result5_black = SuperMethodInvocationImpl
					.pattern_SuperMethodInvocation_0_5_collectcontextelements_blackBBB(match, invocation, mMember);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[invocation] = " + invocation + ", " + "[mMember] = " + mMember + ".");
			}
			SuperMethodInvocationImpl.pattern_SuperMethodInvocation_0_5_collectcontextelements_greenBB(match, mMember);

			// 
			SuperMethodInvocationImpl.pattern_SuperMethodInvocation_0_6_registerobjectstomatch_expressionBBBB(this,
					match, invocation, mMember);
			return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_0_7_expressionF();
		} else {
			return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MSuperMethodInvocation invocation = (MSuperMethodInvocation) result1_bindingAndBlack[0];
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[1];
		TMember tMember = (TMember) result1_bindingAndBlack[2];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_1_1_performtransformation_greenBBFFF(invocation, tMember);
		TCall tAccess = (TCall) result1_green[2];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[3];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_green[4];

		Object[] result2_black = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_1_2_collecttranslatedelements_blackBBBB(invocation, tAccess,
						mFlowElementToTFlowElement, invocationToTAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[invocation] = " + invocation
					+ ", " + "[tAccess] = " + tAccess + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[invocationToTAccess] = " + invocationToTAccess + ".");
		}
		Object[] result2_green = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_1_2_collecttranslatedelements_greenFBBBB(invocation, tAccess,
						mFlowElementToTFlowElement, invocationToTAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, invocation,
						mMemberToTMember, tMember, tAccess, mMember, mFlowElementToTFlowElement, invocationToTAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[invocation] = " + invocation + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
					+ "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ", " + "[mMember] = " + mMember
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", "
					+ "[invocationToTAccess] = " + invocationToTAccess + ".");
		}
		SuperMethodInvocationImpl.pattern_SuperMethodInvocation_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult,
				invocation, tMember, tAccess, mMember, mFlowElementToTFlowElement, invocationToTAccess);
		//nothing EMoflonEdge tMember__tAccess____accessing = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tAccess__tMember____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tAccess____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mFlowElementToTFlowElement__invocation____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result3_green[13];

		// 
		// 
		SuperMethodInvocationImpl.pattern_SuperMethodInvocation_1_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, invocation, mMemberToTMember, tMember, tAccess, mMember, mFlowElementToTFlowElement,
				invocationToTAccess);
		return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MSuperMethodInvocation invocation = (MSuperMethodInvocation) result2_binding[0];
		MDefinition mMember = (MDefinition) result2_binding[1];
		for (Object[] result2_black : SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_2_2_corematch_blackBFFBB(invocation, mMember, match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[1];
			TMember tMember = (TMember) result2_black[2];
			// ForEach 
			for (Object[] result3_black : SuperMethodInvocationImpl
					.pattern_SuperMethodInvocation_2_3_findcontext_blackBBBB(invocation, mMemberToTMember, tMember,
							mMember)) {
				Object[] result3_green = SuperMethodInvocationImpl
						.pattern_SuperMethodInvocation_2_3_findcontext_greenBBBBFFFF(invocation, mMemberToTMember,
								tMember, mMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = SuperMethodInvocationImpl
						.pattern_SuperMethodInvocation_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								invocation, mMemberToTMember, tMember, mMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[invocation] = " + invocation
							+ ", " + "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tMember] = " + tMember + ", "
							+ "[mMember] = " + mMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SuperMethodInvocationImpl.pattern_SuperMethodInvocation_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SuperMethodInvocationImpl
							.pattern_SuperMethodInvocation_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SuperMethodInvocationImpl.pattern_SuperMethodInvocation_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MSuperMethodInvocation invocation, MDefinition mMember) {
		match.registerObject("invocation", invocation);
		match.registerObject("mMember", mMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MSuperMethodInvocation invocation, MDefinition mMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MSuperMethodInvocation invocation,
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinition mMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("tMember", tMember);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject invocation, EObject mMemberToTMember,
			EObject tMember, EObject tAccess, EObject mMember, EObject mFlowElementToTFlowElement,
			EObject invocationToTAccess) {
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("invocation").eClass())
				.equals("modisco.MSuperMethodInvocation.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TMember tMember, TCall tAccess) {

		Object[] result1_black = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_10_1_initialbindings_blackBBBB(this, match, tMember, tAccess);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ".");
		}

		Object[] result2_bindingAndBlack = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tMember, tAccess);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SuperMethodInvocationImpl.pattern_SuperMethodInvocation_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SuperMethodInvocationImpl
					.pattern_SuperMethodInvocation_10_4_collectelementstobetranslated_blackBBB(match, tMember, tAccess);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ".");
			}
			SuperMethodInvocationImpl.pattern_SuperMethodInvocation_10_4_collectelementstobetranslated_greenBBBFF(match,
					tMember, tAccess);
			//nothing EMoflonEdge tMember__tAccess____accessing = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tAccess__tMember____source = (EMoflonEdge) result4_green[4];

			Object[] result5_black = SuperMethodInvocationImpl
					.pattern_SuperMethodInvocation_10_5_collectcontextelements_blackBBB(match, tMember, tAccess);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ".");
			}
			SuperMethodInvocationImpl.pattern_SuperMethodInvocation_10_5_collectcontextelements_greenBB(match, tMember);

			// 
			SuperMethodInvocationImpl.pattern_SuperMethodInvocation_10_6_registerobjectstomatch_expressionBBBB(this,
					match, tMember, tAccess);
			return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_10_7_expressionF();
		} else {
			return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[0];
		TMember tMember = (TMember) result1_bindingAndBlack[1];
		TCall tAccess = (TCall) result1_bindingAndBlack[2];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_11_1_performtransformation_greenFBBFF(tAccess, mMember);
		MSuperMethodInvocation invocation = (MSuperMethodInvocation) result1_green[0];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[3];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_green[4];

		Object[] result2_black = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_11_2_collecttranslatedelements_blackBBBB(invocation, tAccess,
						mFlowElementToTFlowElement, invocationToTAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[invocation] = " + invocation
					+ ", " + "[tAccess] = " + tAccess + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[invocationToTAccess] = " + invocationToTAccess + ".");
		}
		Object[] result2_green = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_11_2_collecttranslatedelements_greenFBBBB(invocation, tAccess,
						mFlowElementToTFlowElement, invocationToTAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, invocation,
						mMemberToTMember, tMember, tAccess, mMember, mFlowElementToTFlowElement, invocationToTAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[invocation] = " + invocation + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
					+ "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ", " + "[mMember] = " + mMember
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", "
					+ "[invocationToTAccess] = " + invocationToTAccess + ".");
		}
		SuperMethodInvocationImpl.pattern_SuperMethodInvocation_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult,
				invocation, tMember, tAccess, mMember, mFlowElementToTFlowElement, invocationToTAccess);
		//nothing EMoflonEdge tMember__tAccess____accessing = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tAccess__tMember____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tAccess____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mFlowElementToTFlowElement__invocation____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result3_green[13];

		// 
		// 
		SuperMethodInvocationImpl.pattern_SuperMethodInvocation_11_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, invocation, mMemberToTMember, tMember, tAccess, mMember, mFlowElementToTFlowElement,
				invocationToTAccess);
		return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMember tMember = (TMember) result2_binding[0];
		TCall tAccess = (TCall) result2_binding[1];
		for (Object[] result2_black : SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_12_2_corematch_blackFBBFB(tMember, tAccess, match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[0];
			MDefinition mMember = (MDefinition) result2_black[3];
			// ForEach 
			for (Object[] result3_black : SuperMethodInvocationImpl
					.pattern_SuperMethodInvocation_12_3_findcontext_blackBBBB(mMemberToTMember, tMember, tAccess,
							mMember)) {
				Object[] result3_green = SuperMethodInvocationImpl
						.pattern_SuperMethodInvocation_12_3_findcontext_greenBBBBFFFFF(mMemberToTMember, tMember,
								tAccess, mMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge tMember__tAccess____accessing = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge tAccess__tMember____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = SuperMethodInvocationImpl
						.pattern_SuperMethodInvocation_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mMemberToTMember, tMember, tAccess, mMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMemberToTMember] = "
							+ mMemberToTMember + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess
							+ ", " + "[mMember] = " + mMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SuperMethodInvocationImpl.pattern_SuperMethodInvocation_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SuperMethodInvocationImpl
							.pattern_SuperMethodInvocation_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SuperMethodInvocationImpl.pattern_SuperMethodInvocation_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMember tMember, TCall tAccess) {
		match.registerObject("tMember", tMember);
		match.registerObject("tAccess", tAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMember tMember, TCall tAccess) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			TMember tMember, TCall tAccess, MDefinition mMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("tAccess", tAccess);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject invocation, EObject mMemberToTMember,
			EObject tMember, EObject tAccess, EObject mMember, EObject mFlowElementToTFlowElement,
			EObject invocationToTAccess) {
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tAccess").eClass()).equals("basic.TCall.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_65(EMoflonEdge _edge_accessing) {

		Object[] result1_bindingAndBlack = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_20_2_testcorematchandDECs_blackFFB(_edge_accessing)) {
			TMember tMember = (TMember) result2_black[0];
			TCall tAccess = (TCall) result2_black[1];
			Object[] result2_green = SuperMethodInvocationImpl
					.pattern_SuperMethodInvocation_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SuperMethodInvocationImpl
					.pattern_SuperMethodInvocation_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, tMember, tAccess)) {
				// 
				if (SuperMethodInvocationImpl
						.pattern_SuperMethodInvocation_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = SuperMethodInvocationImpl
							.pattern_SuperMethodInvocation_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SuperMethodInvocationImpl.pattern_SuperMethodInvocation_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_66(EMoflonEdge _edge_mMethodInvocations) {

		Object[] result1_bindingAndBlack = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_21_2_testcorematchandDECs_blackFFB(_edge_mMethodInvocations)) {
			MSuperMethodInvocation invocation = (MSuperMethodInvocation) result2_black[0];
			MDefinition mMember = (MDefinition) result2_black[1];
			Object[] result2_green = SuperMethodInvocationImpl
					.pattern_SuperMethodInvocation_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SuperMethodInvocationImpl
					.pattern_SuperMethodInvocation_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, invocation, mMember)) {
				// 
				if (SuperMethodInvocationImpl
						.pattern_SuperMethodInvocation_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = SuperMethodInvocationImpl
							.pattern_SuperMethodInvocation_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SuperMethodInvocationImpl.pattern_SuperMethodInvocation_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SuperMethodInvocation");
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
		ruleResult.setRule("SuperMethodInvocation");
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

		Object[] result1_black = SuperMethodInvocationImpl.pattern_SuperMethodInvocation_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SuperMethodInvocationImpl.pattern_SuperMethodInvocation_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MSuperMethodInvocation invocation = (MSuperMethodInvocation) result2_bindingAndBlack[0];
		TMember tMember = (TMember) result2_bindingAndBlack[1];
		TCall tAccess = (TCall) result2_bindingAndBlack[2];
		MDefinition mMember = (MDefinition) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, invocation, tMember, tAccess,
						mMember, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[invocation] = " + invocation + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess
					+ ", " + "[mMember] = " + mMember + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (SuperMethodInvocationImpl.pattern_SuperMethodInvocation_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : SuperMethodInvocationImpl
					.pattern_SuperMethodInvocation_24_5_matchcorrcontext_blackFBBBB(tMember, mMember, sourceMatch,
							targetMatch)) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result5_black[0];
				Object[] result5_green = SuperMethodInvocationImpl
						.pattern_SuperMethodInvocation_24_5_matchcorrcontext_greenBBBF(mMemberToTMember, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = SuperMethodInvocationImpl
						.pattern_SuperMethodInvocation_24_6_createcorrespondence_blackBBBBB(invocation, tMember,
								tAccess, mMember, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[invocation] = "
							+ invocation + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ", "
							+ "[mMember] = " + mMember + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				SuperMethodInvocationImpl.pattern_SuperMethodInvocation_24_6_createcorrespondence_greenBBFFB(invocation,
						tAccess, ccMatch);
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[2];
				//nothing AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result6_green[3];

				Object[] result7_black = SuperMethodInvocationImpl
						.pattern_SuperMethodInvocation_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				SuperMethodInvocationImpl.pattern_SuperMethodInvocation_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MSuperMethodInvocation invocation, TMember tMember, TCall tAccess,
			MDefinition mMember, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MSuperMethodInvocation invocation, MDefinition mMember) {// 
		Object[] result1_black = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_27_1_matchtggpattern_blackBB(invocation, mMember);
		if (result1_black != null) {
			return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_27_2_expressionF();
		} else {
			return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMember tMember, TCall tAccess) {// 
		Object[] result1_black = SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_28_1_matchtggpattern_blackBB(tMember, tAccess);
		if (result1_black != null) {
			return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_28_2_expressionF();
		} else {
			return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember mMemberToTMemberParameter) {

		Object[] result1_black = SuperMethodInvocationImpl.pattern_SuperMethodInvocation_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SuperMethodInvocationImpl.pattern_SuperMethodInvocation_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : SuperMethodInvocationImpl
				.pattern_SuperMethodInvocation_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mMemberToTMemberList = (RuleEntryList) result2_black[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[1];
			MDefinition mMember = (MDefinition) result2_black[2];
			TMember tMember = (TMember) result2_black[3];

			Object[] result3_bindingAndBlack = SuperMethodInvocationImpl
					.pattern_SuperMethodInvocation_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							mMemberToTMember, tMember, mMember, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMemberToTMember] = "
						+ mMemberToTMember + ", " + "[tMember] = " + tMember + ", " + "[mMember] = " + mMember + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (SuperMethodInvocationImpl.pattern_SuperMethodInvocation_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = SuperMethodInvocationImpl
						.pattern_SuperMethodInvocation_29_5_checknacs_blackBBB(mMemberToTMember, tMember, mMember);
				if (result5_black != null) {

					Object[] result6_black = SuperMethodInvocationImpl
							.pattern_SuperMethodInvocation_29_6_perform_blackBBBB(mMemberToTMember, tMember, mMember,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mMemberToTMember] = "
								+ mMemberToTMember + ", " + "[tMember] = " + tMember + ", " + "[mMember] = " + mMember
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					SuperMethodInvocationImpl.pattern_SuperMethodInvocation_29_6_perform_greenFBFBFFB(tMember, mMember,
							ruleResult);
					//nothing MSuperMethodInvocation invocation = (MSuperMethodInvocation) result6_green[0];
					//nothing TCall tAccess = (TCall) result6_green[2];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[4];
					//nothing AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return SuperMethodInvocationImpl.pattern_SuperMethodInvocation_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			TMember tMember, MDefinition mMember, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("tMember", tMember);
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
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPROPRIATE_FWD__MATCH_MSUPERMETHODINVOCATION_MDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (MSuperMethodInvocation) arguments.get(1),
					(MDefinition) arguments.get(2));
		case RulesPackage.SUPER_METHOD_INVOCATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SUPER_METHOD_INVOCATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MSUPERMETHODINVOCATION_MDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MSuperMethodInvocation) arguments.get(1),
					(MDefinition) arguments.get(2));
			return null;
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MSUPERMETHODINVOCATION_MDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MSuperMethodInvocation) arguments.get(1),
					(MDefinition) arguments.get(2));
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MSUPERMETHODINVOCATION_MDEFINITIONTOTMEMBER_TMEMBER_MDEFINITION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MSuperMethodInvocation) arguments.get(1), (MDefinitionToTMember) arguments.get(2),
					(TMember) arguments.get(3), (MDefinition) arguments.get(4));
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SUPER_METHOD_INVOCATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.SUPER_METHOD_INVOCATION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPROPRIATE_BWD__MATCH_TMEMBER_TCALL:
			return isAppropriate_BWD((Match) arguments.get(0), (TMember) arguments.get(1), (TCall) arguments.get(2));
		case RulesPackage.SUPER_METHOD_INVOCATION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SUPER_METHOD_INVOCATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMEMBER_TCALL:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMember) arguments.get(1), (TCall) arguments.get(2));
			return null;
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMEMBER_TCALL:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TCall) arguments.get(2));
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_TMEMBER_TCALL_MDEFINITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (TMember) arguments.get(2), (TCall) arguments.get(3),
					(MDefinition) arguments.get(4));
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SUPER_METHOD_INVOCATION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.SUPER_METHOD_INVOCATION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_65__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_65((EMoflonEdge) arguments.get(0));
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_66__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_66((EMoflonEdge) arguments.get(0));
		case RulesPackage.SUPER_METHOD_INVOCATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SUPER_METHOD_INVOCATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPLICABLE_SOLVE_CSP_CC__MSUPERMETHODINVOCATION_TMEMBER_TCALL_MDEFINITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MSuperMethodInvocation) arguments.get(0), (TMember) arguments.get(1),
					(TCall) arguments.get(2), (MDefinition) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.SUPER_METHOD_INVOCATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SUPER_METHOD_INVOCATION___CHECK_DEC_FWD__MSUPERMETHODINVOCATION_MDEFINITION:
			return checkDEC_FWD((MSuperMethodInvocation) arguments.get(0), (MDefinition) arguments.get(1));
		case RulesPackage.SUPER_METHOD_INVOCATION___CHECK_DEC_BWD__TMEMBER_TCALL:
			return checkDEC_BWD((TMember) arguments.get(0), (TCall) arguments.get(1));
		case RulesPackage.SUPER_METHOD_INVOCATION___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
		case RulesPackage.SUPER_METHOD_INVOCATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_TMEMBER_MDEFINITION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (TMember) arguments.get(2), (MDefinition) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.SUPER_METHOD_INVOCATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SuperMethodInvocation_0_1_initialbindings_blackBBBB(
			SuperMethodInvocation _this, Match match, MSuperMethodInvocation invocation, MDefinition mMember) {
		return new Object[] { _this, match, invocation, mMember };
	}

	public static final Object[] pattern_SuperMethodInvocation_0_2_SolveCSP_bindingFBBBB(SuperMethodInvocation _this,
			Match match, MSuperMethodInvocation invocation, MDefinition mMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, invocation, mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, invocation, mMember };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SuperMethodInvocation_0_2_SolveCSP_bindingAndBlackFBBBB(
			SuperMethodInvocation _this, Match match, MSuperMethodInvocation invocation, MDefinition mMember) {
		Object[] result_pattern_SuperMethodInvocation_0_2_SolveCSP_binding = pattern_SuperMethodInvocation_0_2_SolveCSP_bindingFBBBB(
				_this, match, invocation, mMember);
		if (result_pattern_SuperMethodInvocation_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SuperMethodInvocation_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SuperMethodInvocation_0_2_SolveCSP_black = pattern_SuperMethodInvocation_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SuperMethodInvocation_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, invocation, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_SuperMethodInvocation_0_3_CheckCSP_expressionFBB(SuperMethodInvocation _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_0_4_collectelementstobetranslated_blackBBB(Match match,
			MSuperMethodInvocation invocation, MDefinition mMember) {
		return new Object[] { match, invocation, mMember };
	}

	public static final Object[] pattern_SuperMethodInvocation_0_4_collectelementstobetranslated_greenBBBF(Match match,
			MSuperMethodInvocation invocation, MDefinition mMember) {
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(invocation);
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		match.getToBeTranslatedEdges().add(mMember__invocation____mMethodInvocations);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		return new Object[] { match, invocation, mMember, mMember__invocation____mMethodInvocations };
	}

	public static final Object[] pattern_SuperMethodInvocation_0_5_collectcontextelements_blackBBB(Match match,
			MSuperMethodInvocation invocation, MDefinition mMember) {
		return new Object[] { match, invocation, mMember };
	}

	public static final Object[] pattern_SuperMethodInvocation_0_5_collectcontextelements_greenBB(Match match,
			MDefinition mMember) {
		match.getContextNodes().add(mMember);
		return new Object[] { match, mMember };
	}

	public static final void pattern_SuperMethodInvocation_0_6_registerobjectstomatch_expressionBBBB(
			SuperMethodInvocation _this, Match match, MSuperMethodInvocation invocation, MDefinition mMember) {
		_this.registerObjectsToMatch_FWD(match, invocation, mMember);

	}

	public static final boolean pattern_SuperMethodInvocation_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SuperMethodInvocation_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("invocation");
		EObject _localVariable_1 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("mMember");
		EObject tmpInvocation = _localVariable_0;
		EObject tmpMMemberToTMember = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpMMember = _localVariable_3;
		if (tmpInvocation instanceof MSuperMethodInvocation) {
			MSuperMethodInvocation invocation = (MSuperMethodInvocation) tmpInvocation;
			if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					if (tmpMMember instanceof MDefinition) {
						MDefinition mMember = (MDefinition) tmpMMember;
						return new Object[] { invocation, mMemberToTMember, tMember, mMember, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_1_1_performtransformation_blackBBBBFBB(
			MSuperMethodInvocation invocation, MDefinitionToTMember mMemberToTMember, TMember tMember,
			MDefinition mMember, SuperMethodInvocation _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { invocation, mMemberToTMember, tMember, mMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_1_1_performtransformation_bindingAndBlackFFFFFBB(
			SuperMethodInvocation _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SuperMethodInvocation_1_1_performtransformation_binding = pattern_SuperMethodInvocation_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_SuperMethodInvocation_1_1_performtransformation_binding != null) {
			MSuperMethodInvocation invocation = (MSuperMethodInvocation) result_pattern_SuperMethodInvocation_1_1_performtransformation_binding[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_SuperMethodInvocation_1_1_performtransformation_binding[1];
			TMember tMember = (TMember) result_pattern_SuperMethodInvocation_1_1_performtransformation_binding[2];
			MDefinition mMember = (MDefinition) result_pattern_SuperMethodInvocation_1_1_performtransformation_binding[3];

			Object[] result_pattern_SuperMethodInvocation_1_1_performtransformation_black = pattern_SuperMethodInvocation_1_1_performtransformation_blackBBBBFBB(
					invocation, mMemberToTMember, tMember, mMember, _this, isApplicableMatch);
			if (result_pattern_SuperMethodInvocation_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SuperMethodInvocation_1_1_performtransformation_black[4];

				return new Object[] { invocation, mMemberToTMember, tMember, mMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_1_1_performtransformation_greenBBFFF(
			MSuperMethodInvocation invocation, TMember tMember) {
		TCall tAccess = BasicFactory.eINSTANCE.createTCall();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		AbstractMethodInvocationToTAccess invocationToTAccess = PmFactory.eINSTANCE
				.createAbstractMethodInvocationToTAccess();
		tMember.getAccessing().add(tAccess);
		mFlowElementToTFlowElement.setTarget(tAccess);
		mFlowElementToTFlowElement.setSource(invocation);
		invocationToTAccess.setSource(invocation);
		invocationToTAccess.setTarget(tAccess);
		return new Object[] { invocation, tMember, tAccess, mFlowElementToTFlowElement, invocationToTAccess };
	}

	public static final Object[] pattern_SuperMethodInvocation_1_2_collecttranslatedelements_blackBBBB(
			MSuperMethodInvocation invocation, TCall tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		return new Object[] { invocation, tAccess, mFlowElementToTFlowElement, invocationToTAccess };
	}

	public static final Object[] pattern_SuperMethodInvocation_1_2_collecttranslatedelements_greenFBBBB(
			MSuperMethodInvocation invocation, TCall tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(invocation);
		ruleresult.getCreatedElements().add(tAccess);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(invocationToTAccess);
		return new Object[] { ruleresult, invocation, tAccess, mFlowElementToTFlowElement, invocationToTAccess };
	}

	public static final Object[] pattern_SuperMethodInvocation_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject invocation, EObject mMemberToTMember, EObject tMember,
			EObject tAccess, EObject mMember, EObject mFlowElementToTFlowElement, EObject invocationToTAccess) {
		if (!invocation.equals(mMemberToTMember)) {
			if (!invocation.equals(tMember)) {
				if (!invocation.equals(tAccess)) {
					if (!invocation.equals(mMember)) {
						if (!invocation.equals(mFlowElementToTFlowElement)) {
							if (!invocation.equals(invocationToTAccess)) {
								if (!mMemberToTMember.equals(tMember)) {
									if (!mMemberToTMember.equals(tAccess)) {
										if (!tAccess.equals(tMember)) {
											if (!mMember.equals(mMemberToTMember)) {
												if (!mMember.equals(tMember)) {
													if (!mMember.equals(tAccess)) {
														if (!mFlowElementToTFlowElement.equals(mMemberToTMember)) {
															if (!mFlowElementToTFlowElement.equals(tMember)) {
																if (!mFlowElementToTFlowElement.equals(tAccess)) {
																	if (!mFlowElementToTFlowElement.equals(mMember)) {
																		if (!invocationToTAccess
																				.equals(mMemberToTMember)) {
																			if (!invocationToTAccess.equals(tMember)) {
																				if (!invocationToTAccess
																						.equals(tAccess)) {
																					if (!invocationToTAccess
																							.equals(mMember)) {
																						if (!invocationToTAccess.equals(
																								mFlowElementToTFlowElement)) {
																							return new Object[] {
																									ruleresult,
																									invocation,
																									mMemberToTMember,
																									tMember, tAccess,
																									mMember,
																									mFlowElementToTFlowElement,
																									invocationToTAccess };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SuperMethodInvocation_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject invocation, EObject tMember, EObject tAccess, EObject mMember,
			EObject mFlowElementToTFlowElement, EObject invocationToTAccess) {
		EMoflonEdge tMember__tAccess____accessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SuperMethodInvocation";
		String tMember__tAccess____accessing_name_prime = "accessing";
		String tAccess__tMember____source_name_prime = "source";
		String mFlowElementToTFlowElement__tAccess____target_name_prime = "target";
		String invocationToTAccess__invocation____source_name_prime = "source";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		String mFlowElementToTFlowElement__invocation____source_name_prime = "source";
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		tMember__tAccess____accessing.setSrc(tMember);
		tMember__tAccess____accessing.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(tMember__tAccess____accessing);
		tAccess__tMember____source.setSrc(tAccess);
		tAccess__tMember____source.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tAccess__tMember____source);
		mFlowElementToTFlowElement__tAccess____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tAccess____target);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		ruleresult.getCreatedEdges().add(invocationToTAccess__invocation____source);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(invocationToTAccess__tAccess____target);
		mFlowElementToTFlowElement__invocation____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__invocation____source.setTrg(invocation);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__invocation____source);
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		ruleresult.getTranslatedEdges().add(mMember__invocation____mMethodInvocations);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMember__tAccess____accessing.setName(tMember__tAccess____accessing_name_prime);
		tAccess__tMember____source.setName(tAccess__tMember____source_name_prime);
		mFlowElementToTFlowElement__tAccess____target.setName(mFlowElementToTFlowElement__tAccess____target_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		mFlowElementToTFlowElement__invocation____source
				.setName(mFlowElementToTFlowElement__invocation____source_name_prime);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		return new Object[] { ruleresult, invocation, tMember, tAccess, mMember, mFlowElementToTFlowElement,
				invocationToTAccess, tMember__tAccess____accessing, tAccess__tMember____source,
				mFlowElementToTFlowElement__tAccess____target, invocationToTAccess__invocation____source,
				invocationToTAccess__tAccess____target, mFlowElementToTFlowElement__invocation____source,
				mMember__invocation____mMethodInvocations };
	}

	public static final void pattern_SuperMethodInvocation_1_5_registerobjects_expressionBBBBBBBBB(
			SuperMethodInvocation _this, PerformRuleResult ruleresult, EObject invocation, EObject mMemberToTMember,
			EObject tMember, EObject tAccess, EObject mMember, EObject mFlowElementToTFlowElement,
			EObject invocationToTAccess) {
		_this.registerObjects_FWD(ruleresult, invocation, mMemberToTMember, tMember, tAccess, mMember,
				mFlowElementToTFlowElement, invocationToTAccess);

	}

	public static final PerformRuleResult pattern_SuperMethodInvocation_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_2_1_preparereturnvalue_bindingFB(
			SuperMethodInvocation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_2_1_preparereturnvalue_blackFBB(EClass eClass,
			SuperMethodInvocation _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_2_1_preparereturnvalue_bindingAndBlackFFB(
			SuperMethodInvocation _this) {
		Object[] result_pattern_SuperMethodInvocation_2_1_preparereturnvalue_binding = pattern_SuperMethodInvocation_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SuperMethodInvocation_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SuperMethodInvocation_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SuperMethodInvocation_2_1_preparereturnvalue_black = pattern_SuperMethodInvocation_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SuperMethodInvocation_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SuperMethodInvocation_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SuperMethodInvocation";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SuperMethodInvocation_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("invocation");
		EObject _localVariable_1 = match.getObject("mMember");
		EObject tmpInvocation = _localVariable_0;
		EObject tmpMMember = _localVariable_1;
		if (tmpInvocation instanceof MSuperMethodInvocation) {
			MSuperMethodInvocation invocation = (MSuperMethodInvocation) tmpInvocation;
			if (tmpMMember instanceof MDefinition) {
				MDefinition mMember = (MDefinition) tmpMMember;
				return new Object[] { invocation, mMember, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SuperMethodInvocation_2_2_corematch_blackBFFBB(
			MSuperMethodInvocation invocation, MDefinition mMember, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
			TMember tMember = mMemberToTMember.getTarget();
			if (tMember != null) {
				_result.add(new Object[] { invocation, mMemberToTMember, tMember, mMember, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SuperMethodInvocation_2_3_findcontext_blackBBBB(
			MSuperMethodInvocation invocation, MDefinitionToTMember mMemberToTMember, TMember tMember,
			MDefinition mMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMember.equals(mMemberToTMember.getTarget())) {
			if (mMember.equals(mMemberToTMember.getSource())) {
				if (mMember.getMMethodInvocations().contains(invocation)) {
					_result.add(new Object[] { invocation, mMemberToTMember, tMember, mMember });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_2_3_findcontext_greenBBBBFFFF(
			MSuperMethodInvocation invocation, MDefinitionToTMember mMemberToTMember, TMember tMember,
			MDefinition mMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMemberToTMember__tMember____target_name_prime = "target";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(mMember);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(mMember__invocation____mMethodInvocations);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		return new Object[] { invocation, mMemberToTMember, tMember, mMember, isApplicableMatch,
				mMemberToTMember__tMember____target, mMemberToTMember__mMember____source,
				mMember__invocation____mMethodInvocations };
	}

	public static final Object[] pattern_SuperMethodInvocation_2_4_solveCSP_bindingFBBBBBB(SuperMethodInvocation _this,
			IsApplicableMatch isApplicableMatch, MSuperMethodInvocation invocation,
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinition mMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, invocation, mMemberToTMember, tMember,
				mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, invocation, mMemberToTMember, tMember, mMember };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SuperMethodInvocation_2_4_solveCSP_bindingAndBlackFBBBBBB(
			SuperMethodInvocation _this, IsApplicableMatch isApplicableMatch, MSuperMethodInvocation invocation,
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinition mMember) {
		Object[] result_pattern_SuperMethodInvocation_2_4_solveCSP_binding = pattern_SuperMethodInvocation_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, invocation, mMemberToTMember, tMember, mMember);
		if (result_pattern_SuperMethodInvocation_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SuperMethodInvocation_2_4_solveCSP_binding[0];

			Object[] result_pattern_SuperMethodInvocation_2_4_solveCSP_black = pattern_SuperMethodInvocation_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_SuperMethodInvocation_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, invocation, mMemberToTMember, tMember, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_SuperMethodInvocation_2_5_checkCSP_expressionFBB(SuperMethodInvocation _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SuperMethodInvocation_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SuperMethodInvocation";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SuperMethodInvocation_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_10_1_initialbindings_blackBBBB(
			SuperMethodInvocation _this, Match match, TMember tMember, TCall tAccess) {
		return new Object[] { _this, match, tMember, tAccess };
	}

	public static final Object[] pattern_SuperMethodInvocation_10_2_SolveCSP_bindingFBBBB(SuperMethodInvocation _this,
			Match match, TMember tMember, TCall tAccess) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tMember, tAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMember, tAccess };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SuperMethodInvocation_10_2_SolveCSP_bindingAndBlackFBBBB(
			SuperMethodInvocation _this, Match match, TMember tMember, TCall tAccess) {
		Object[] result_pattern_SuperMethodInvocation_10_2_SolveCSP_binding = pattern_SuperMethodInvocation_10_2_SolveCSP_bindingFBBBB(
				_this, match, tMember, tAccess);
		if (result_pattern_SuperMethodInvocation_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SuperMethodInvocation_10_2_SolveCSP_binding[0];

			Object[] result_pattern_SuperMethodInvocation_10_2_SolveCSP_black = pattern_SuperMethodInvocation_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SuperMethodInvocation_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tMember, tAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_SuperMethodInvocation_10_3_CheckCSP_expressionFBB(SuperMethodInvocation _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_10_4_collectelementstobetranslated_blackBBB(Match match,
			TMember tMember, TCall tAccess) {
		return new Object[] { match, tMember, tAccess };
	}

	public static final Object[] pattern_SuperMethodInvocation_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TMember tMember, TCall tAccess) {
		EMoflonEdge tMember__tAccess____accessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tAccess);
		String tMember__tAccess____accessing_name_prime = "accessing";
		String tAccess__tMember____source_name_prime = "source";
		tMember__tAccess____accessing.setSrc(tMember);
		tMember__tAccess____accessing.setTrg(tAccess);
		match.getToBeTranslatedEdges().add(tMember__tAccess____accessing);
		tAccess__tMember____source.setSrc(tAccess);
		tAccess__tMember____source.setTrg(tMember);
		match.getToBeTranslatedEdges().add(tAccess__tMember____source);
		tMember__tAccess____accessing.setName(tMember__tAccess____accessing_name_prime);
		tAccess__tMember____source.setName(tAccess__tMember____source_name_prime);
		return new Object[] { match, tMember, tAccess, tMember__tAccess____accessing, tAccess__tMember____source };
	}

	public static final Object[] pattern_SuperMethodInvocation_10_5_collectcontextelements_blackBBB(Match match,
			TMember tMember, TCall tAccess) {
		return new Object[] { match, tMember, tAccess };
	}

	public static final Object[] pattern_SuperMethodInvocation_10_5_collectcontextelements_greenBB(Match match,
			TMember tMember) {
		match.getContextNodes().add(tMember);
		return new Object[] { match, tMember };
	}

	public static final void pattern_SuperMethodInvocation_10_6_registerobjectstomatch_expressionBBBB(
			SuperMethodInvocation _this, Match match, TMember tMember, TCall tAccess) {
		_this.registerObjectsToMatch_BWD(match, tMember, tAccess);

	}

	public static final boolean pattern_SuperMethodInvocation_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SuperMethodInvocation_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_3 = isApplicableMatch.getObject("mMember");
		EObject tmpMMemberToTMember = _localVariable_0;
		EObject tmpTMember = _localVariable_1;
		EObject tmpTAccess = _localVariable_2;
		EObject tmpMMember = _localVariable_3;
		if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				if (tmpTAccess instanceof TCall) {
					TCall tAccess = (TCall) tmpTAccess;
					if (tmpMMember instanceof MDefinition) {
						MDefinition mMember = (MDefinition) tmpMMember;
						return new Object[] { mMemberToTMember, tMember, tAccess, mMember, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_11_1_performtransformation_blackBBBBFBB(
			MDefinitionToTMember mMemberToTMember, TMember tMember, TCall tAccess, MDefinition mMember,
			SuperMethodInvocation _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mMemberToTMember, tMember, tAccess, mMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_11_1_performtransformation_bindingAndBlackFFFFFBB(
			SuperMethodInvocation _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SuperMethodInvocation_11_1_performtransformation_binding = pattern_SuperMethodInvocation_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_SuperMethodInvocation_11_1_performtransformation_binding != null) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_SuperMethodInvocation_11_1_performtransformation_binding[0];
			TMember tMember = (TMember) result_pattern_SuperMethodInvocation_11_1_performtransformation_binding[1];
			TCall tAccess = (TCall) result_pattern_SuperMethodInvocation_11_1_performtransformation_binding[2];
			MDefinition mMember = (MDefinition) result_pattern_SuperMethodInvocation_11_1_performtransformation_binding[3];

			Object[] result_pattern_SuperMethodInvocation_11_1_performtransformation_black = pattern_SuperMethodInvocation_11_1_performtransformation_blackBBBBFBB(
					mMemberToTMember, tMember, tAccess, mMember, _this, isApplicableMatch);
			if (result_pattern_SuperMethodInvocation_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SuperMethodInvocation_11_1_performtransformation_black[4];

				return new Object[] { mMemberToTMember, tMember, tAccess, mMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_11_1_performtransformation_greenFBBFF(TCall tAccess,
			MDefinition mMember) {
		MSuperMethodInvocation invocation = ModiscoFactory.eINSTANCE.createMSuperMethodInvocation();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		AbstractMethodInvocationToTAccess invocationToTAccess = PmFactory.eINSTANCE
				.createAbstractMethodInvocationToTAccess();
		mMember.getMMethodInvocations().add(invocation);
		mFlowElementToTFlowElement.setTarget(tAccess);
		mFlowElementToTFlowElement.setSource(invocation);
		invocationToTAccess.setSource(invocation);
		invocationToTAccess.setTarget(tAccess);
		return new Object[] { invocation, tAccess, mMember, mFlowElementToTFlowElement, invocationToTAccess };
	}

	public static final Object[] pattern_SuperMethodInvocation_11_2_collecttranslatedelements_blackBBBB(
			MSuperMethodInvocation invocation, TCall tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		return new Object[] { invocation, tAccess, mFlowElementToTFlowElement, invocationToTAccess };
	}

	public static final Object[] pattern_SuperMethodInvocation_11_2_collecttranslatedelements_greenFBBBB(
			MSuperMethodInvocation invocation, TCall tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(invocation);
		ruleresult.getTranslatedElements().add(tAccess);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(invocationToTAccess);
		return new Object[] { ruleresult, invocation, tAccess, mFlowElementToTFlowElement, invocationToTAccess };
	}

	public static final Object[] pattern_SuperMethodInvocation_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject invocation, EObject mMemberToTMember, EObject tMember,
			EObject tAccess, EObject mMember, EObject mFlowElementToTFlowElement, EObject invocationToTAccess) {
		if (!invocation.equals(mMemberToTMember)) {
			if (!invocation.equals(tMember)) {
				if (!invocation.equals(tAccess)) {
					if (!invocation.equals(mMember)) {
						if (!invocation.equals(mFlowElementToTFlowElement)) {
							if (!invocation.equals(invocationToTAccess)) {
								if (!mMemberToTMember.equals(tMember)) {
									if (!mMemberToTMember.equals(tAccess)) {
										if (!tAccess.equals(tMember)) {
											if (!mMember.equals(mMemberToTMember)) {
												if (!mMember.equals(tMember)) {
													if (!mMember.equals(tAccess)) {
														if (!mFlowElementToTFlowElement.equals(mMemberToTMember)) {
															if (!mFlowElementToTFlowElement.equals(tMember)) {
																if (!mFlowElementToTFlowElement.equals(tAccess)) {
																	if (!mFlowElementToTFlowElement.equals(mMember)) {
																		if (!invocationToTAccess
																				.equals(mMemberToTMember)) {
																			if (!invocationToTAccess.equals(tMember)) {
																				if (!invocationToTAccess
																						.equals(tAccess)) {
																					if (!invocationToTAccess
																							.equals(mMember)) {
																						if (!invocationToTAccess.equals(
																								mFlowElementToTFlowElement)) {
																							return new Object[] {
																									ruleresult,
																									invocation,
																									mMemberToTMember,
																									tMember, tAccess,
																									mMember,
																									mFlowElementToTFlowElement,
																									invocationToTAccess };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SuperMethodInvocation_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject invocation, EObject tMember, EObject tAccess, EObject mMember,
			EObject mFlowElementToTFlowElement, EObject invocationToTAccess) {
		EMoflonEdge tMember__tAccess____accessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SuperMethodInvocation";
		String tMember__tAccess____accessing_name_prime = "accessing";
		String tAccess__tMember____source_name_prime = "source";
		String mFlowElementToTFlowElement__tAccess____target_name_prime = "target";
		String invocationToTAccess__invocation____source_name_prime = "source";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		String mFlowElementToTFlowElement__invocation____source_name_prime = "source";
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		tMember__tAccess____accessing.setSrc(tMember);
		tMember__tAccess____accessing.setTrg(tAccess);
		ruleresult.getTranslatedEdges().add(tMember__tAccess____accessing);
		tAccess__tMember____source.setSrc(tAccess);
		tAccess__tMember____source.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tAccess__tMember____source);
		mFlowElementToTFlowElement__tAccess____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tAccess____target);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		ruleresult.getCreatedEdges().add(invocationToTAccess__invocation____source);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(invocationToTAccess__tAccess____target);
		mFlowElementToTFlowElement__invocation____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__invocation____source.setTrg(invocation);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__invocation____source);
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		ruleresult.getCreatedEdges().add(mMember__invocation____mMethodInvocations);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMember__tAccess____accessing.setName(tMember__tAccess____accessing_name_prime);
		tAccess__tMember____source.setName(tAccess__tMember____source_name_prime);
		mFlowElementToTFlowElement__tAccess____target.setName(mFlowElementToTFlowElement__tAccess____target_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		mFlowElementToTFlowElement__invocation____source
				.setName(mFlowElementToTFlowElement__invocation____source_name_prime);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		return new Object[] { ruleresult, invocation, tMember, tAccess, mMember, mFlowElementToTFlowElement,
				invocationToTAccess, tMember__tAccess____accessing, tAccess__tMember____source,
				mFlowElementToTFlowElement__tAccess____target, invocationToTAccess__invocation____source,
				invocationToTAccess__tAccess____target, mFlowElementToTFlowElement__invocation____source,
				mMember__invocation____mMethodInvocations };
	}

	public static final void pattern_SuperMethodInvocation_11_5_registerobjects_expressionBBBBBBBBB(
			SuperMethodInvocation _this, PerformRuleResult ruleresult, EObject invocation, EObject mMemberToTMember,
			EObject tMember, EObject tAccess, EObject mMember, EObject mFlowElementToTFlowElement,
			EObject invocationToTAccess) {
		_this.registerObjects_BWD(ruleresult, invocation, mMemberToTMember, tMember, tAccess, mMember,
				mFlowElementToTFlowElement, invocationToTAccess);

	}

	public static final PerformRuleResult pattern_SuperMethodInvocation_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_12_1_preparereturnvalue_bindingFB(
			SuperMethodInvocation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_12_1_preparereturnvalue_blackFBB(EClass eClass,
			SuperMethodInvocation _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_12_1_preparereturnvalue_bindingAndBlackFFB(
			SuperMethodInvocation _this) {
		Object[] result_pattern_SuperMethodInvocation_12_1_preparereturnvalue_binding = pattern_SuperMethodInvocation_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SuperMethodInvocation_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SuperMethodInvocation_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SuperMethodInvocation_12_1_preparereturnvalue_black = pattern_SuperMethodInvocation_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SuperMethodInvocation_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SuperMethodInvocation_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SuperMethodInvocation";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SuperMethodInvocation_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tMember");
		EObject _localVariable_1 = match.getObject("tAccess");
		EObject tmpTMember = _localVariable_0;
		EObject tmpTAccess = _localVariable_1;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpTAccess instanceof TCall) {
				TCall tAccess = (TCall) tmpTAccess;
				return new Object[] { tMember, tAccess, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SuperMethodInvocation_12_2_corematch_blackFBBFB(TMember tMember,
			TCall tAccess, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
			BodyDeclaration tmpMMember = mMemberToTMember.getSource();
			if (tmpMMember instanceof MDefinition) {
				MDefinition mMember = (MDefinition) tmpMMember;
				_result.add(new Object[] { mMemberToTMember, tMember, tAccess, mMember, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SuperMethodInvocation_12_3_findcontext_blackBBBB(
			MDefinitionToTMember mMemberToTMember, TMember tMember, TCall tAccess, MDefinition mMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMember.getAccessing().contains(tAccess)) {
			if (tMember.equals(mMemberToTMember.getTarget())) {
				if (mMember.equals(mMemberToTMember.getSource())) {
					_result.add(new Object[] { mMemberToTMember, tMember, tAccess, mMember });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_12_3_findcontext_greenBBBBFFFFF(
			MDefinitionToTMember mMemberToTMember, TMember tMember, TCall tAccess, MDefinition mMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tMember__tAccess____accessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tMember__tAccess____accessing_name_prime = "accessing";
		String tAccess__tMember____source_name_prime = "source";
		String mMemberToTMember__tMember____target_name_prime = "target";
		String mMemberToTMember__mMember____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(mMember);
		tMember__tAccess____accessing.setSrc(tMember);
		tMember__tAccess____accessing.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tMember__tAccess____accessing);
		tAccess__tMember____source.setSrc(tAccess);
		tAccess__tMember____source.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess__tMember____source);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		tMember__tAccess____accessing.setName(tMember__tAccess____accessing_name_prime);
		tAccess__tMember____source.setName(tAccess__tMember____source_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		return new Object[] { mMemberToTMember, tMember, tAccess, mMember, isApplicableMatch,
				tMember__tAccess____accessing, tAccess__tMember____source, mMemberToTMember__tMember____target,
				mMemberToTMember__mMember____source };
	}

	public static final Object[] pattern_SuperMethodInvocation_12_4_solveCSP_bindingFBBBBBB(SuperMethodInvocation _this,
			IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember, TMember tMember, TCall tAccess,
			MDefinition mMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mMemberToTMember, tMember, tAccess,
				mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, tMember, tAccess, mMember };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SuperMethodInvocation_12_4_solveCSP_bindingAndBlackFBBBBBB(
			SuperMethodInvocation _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			TMember tMember, TCall tAccess, MDefinition mMember) {
		Object[] result_pattern_SuperMethodInvocation_12_4_solveCSP_binding = pattern_SuperMethodInvocation_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, tMember, tAccess, mMember);
		if (result_pattern_SuperMethodInvocation_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SuperMethodInvocation_12_4_solveCSP_binding[0];

			Object[] result_pattern_SuperMethodInvocation_12_4_solveCSP_black = pattern_SuperMethodInvocation_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_SuperMethodInvocation_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, tMember, tAccess, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_SuperMethodInvocation_12_5_checkCSP_expressionFBB(SuperMethodInvocation _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SuperMethodInvocation_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SuperMethodInvocation";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SuperMethodInvocation_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_20_1_preparereturnvalue_bindingFB(
			SuperMethodInvocation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SuperMethodInvocation _this) {
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

	public static final Object[] pattern_SuperMethodInvocation_20_1_preparereturnvalue_bindingAndBlackFFBF(
			SuperMethodInvocation _this) {
		Object[] result_pattern_SuperMethodInvocation_20_1_preparereturnvalue_binding = pattern_SuperMethodInvocation_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SuperMethodInvocation_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SuperMethodInvocation_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SuperMethodInvocation_20_1_preparereturnvalue_black = pattern_SuperMethodInvocation_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SuperMethodInvocation_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SuperMethodInvocation_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SuperMethodInvocation_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SuperMethodInvocation_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_accessing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMember = _edge_accessing.getSrc();
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			EObject tmpTAccess = _edge_accessing.getTrg();
			if (tmpTAccess instanceof TCall) {
				TCall tAccess = (TCall) tmpTAccess;
				if (tMember.getAccessing().contains(tAccess)) {
					_result.add(new Object[] { tMember, tAccess, _edge_accessing });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SuperMethodInvocation_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			SuperMethodInvocation _this, Match match, TMember tMember, TCall tAccess) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tMember, tAccess);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SuperMethodInvocation_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SuperMethodInvocation _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SuperMethodInvocation_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_21_1_preparereturnvalue_bindingFB(
			SuperMethodInvocation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SuperMethodInvocation _this) {
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

	public static final Object[] pattern_SuperMethodInvocation_21_1_preparereturnvalue_bindingAndBlackFFBF(
			SuperMethodInvocation _this) {
		Object[] result_pattern_SuperMethodInvocation_21_1_preparereturnvalue_binding = pattern_SuperMethodInvocation_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SuperMethodInvocation_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SuperMethodInvocation_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SuperMethodInvocation_21_1_preparereturnvalue_black = pattern_SuperMethodInvocation_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SuperMethodInvocation_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SuperMethodInvocation_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SuperMethodInvocation_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SuperMethodInvocation_21_2_testcorematchandDECs_black_nac_0B(
			MSuperMethodInvocation invocation) {
		for (AnnotationMemberValuePair __DEC_invocation_value_891152 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(invocation, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { invocation };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_21_2_testcorematchandDECs_black_nac_1BB(
			MSuperMethodInvocation invocation, MDefinition mMember) {
		for (MDefinition __DEC_invocation_mMethodInvocations_940527 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(invocation, MDefinition.class, "mMethodInvocations")) {
			if (!mMember.equals(__DEC_invocation_mMethodInvocations_940527)) {
				return new Object[] { invocation, mMember };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SuperMethodInvocation_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mMethodInvocations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMMember = _edge_mMethodInvocations.getSrc();
		if (tmpMMember instanceof MDefinition) {
			MDefinition mMember = (MDefinition) tmpMMember;
			EObject tmpInvocation = _edge_mMethodInvocations.getTrg();
			if (tmpInvocation instanceof MSuperMethodInvocation) {
				MSuperMethodInvocation invocation = (MSuperMethodInvocation) tmpInvocation;
				if (mMember.getMMethodInvocations().contains(invocation)) {
					if (pattern_SuperMethodInvocation_21_2_testcorematchandDECs_black_nac_0B(invocation) == null) {
						if (pattern_SuperMethodInvocation_21_2_testcorematchandDECs_black_nac_1BB(invocation,
								mMember) == null) {
							_result.add(new Object[] { invocation, mMember, _edge_mMethodInvocations });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SuperMethodInvocation_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			SuperMethodInvocation _this, Match match, MSuperMethodInvocation invocation, MDefinition mMember) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, invocation, mMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SuperMethodInvocation_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SuperMethodInvocation _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SuperMethodInvocation_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_24_1_prepare_blackB(SuperMethodInvocation _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SuperMethodInvocation_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_SuperMethodInvocation_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("invocation");
		EObject _localVariable_1 = targetMatch.getObject("tMember");
		EObject _localVariable_2 = targetMatch.getObject("tAccess");
		EObject _localVariable_3 = sourceMatch.getObject("mMember");
		EObject tmpInvocation = _localVariable_0;
		EObject tmpTMember = _localVariable_1;
		EObject tmpTAccess = _localVariable_2;
		EObject tmpMMember = _localVariable_3;
		if (tmpInvocation instanceof MSuperMethodInvocation) {
			MSuperMethodInvocation invocation = (MSuperMethodInvocation) tmpInvocation;
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				if (tmpTAccess instanceof TCall) {
					TCall tAccess = (TCall) tmpTAccess;
					if (tmpMMember instanceof MDefinition) {
						MDefinition mMember = (MDefinition) tmpMMember;
						return new Object[] { invocation, tMember, tAccess, mMember, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_24_2_matchsrctrgcontext_blackBBBBBB(
			MSuperMethodInvocation invocation, TMember tMember, TCall tAccess, MDefinition mMember, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { invocation, tMember, tAccess, mMember, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SuperMethodInvocation_24_2_matchsrctrgcontext_binding = pattern_SuperMethodInvocation_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_SuperMethodInvocation_24_2_matchsrctrgcontext_binding != null) {
			MSuperMethodInvocation invocation = (MSuperMethodInvocation) result_pattern_SuperMethodInvocation_24_2_matchsrctrgcontext_binding[0];
			TMember tMember = (TMember) result_pattern_SuperMethodInvocation_24_2_matchsrctrgcontext_binding[1];
			TCall tAccess = (TCall) result_pattern_SuperMethodInvocation_24_2_matchsrctrgcontext_binding[2];
			MDefinition mMember = (MDefinition) result_pattern_SuperMethodInvocation_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_SuperMethodInvocation_24_2_matchsrctrgcontext_black = pattern_SuperMethodInvocation_24_2_matchsrctrgcontext_blackBBBBBB(
					invocation, tMember, tAccess, mMember, sourceMatch, targetMatch);
			if (result_pattern_SuperMethodInvocation_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { invocation, tMember, tAccess, mMember, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_24_3_solvecsp_bindingFBBBBBBB(
			SuperMethodInvocation _this, MSuperMethodInvocation invocation, TMember tMember, TCall tAccess,
			MDefinition mMember, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(invocation, tMember, tAccess, mMember, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, invocation, tMember, tAccess, mMember, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SuperMethodInvocation_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			SuperMethodInvocation _this, MSuperMethodInvocation invocation, TMember tMember, TCall tAccess,
			MDefinition mMember, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SuperMethodInvocation_24_3_solvecsp_binding = pattern_SuperMethodInvocation_24_3_solvecsp_bindingFBBBBBBB(
				_this, invocation, tMember, tAccess, mMember, sourceMatch, targetMatch);
		if (result_pattern_SuperMethodInvocation_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_SuperMethodInvocation_24_3_solvecsp_binding[0];

			Object[] result_pattern_SuperMethodInvocation_24_3_solvecsp_black = pattern_SuperMethodInvocation_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_SuperMethodInvocation_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, invocation, tMember, tAccess, mMember, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_SuperMethodInvocation_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_SuperMethodInvocation_24_5_matchcorrcontext_blackFBBBB(
			TMember tMember, MDefinition mMember, Match sourceMatch, Match targetMatch) {
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

	public static final Object[] pattern_SuperMethodInvocation_24_5_matchcorrcontext_greenBBBF(
			MDefinitionToTMember mMemberToTMember, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "SuperMethodInvocation";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mMemberToTMember);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mMemberToTMember, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_SuperMethodInvocation_24_6_createcorrespondence_blackBBBBB(
			MSuperMethodInvocation invocation, TMember tMember, TCall tAccess, MDefinition mMember, CCMatch ccMatch) {
		return new Object[] { invocation, tMember, tAccess, mMember, ccMatch };
	}

	public static final Object[] pattern_SuperMethodInvocation_24_6_createcorrespondence_greenBBFFB(
			MSuperMethodInvocation invocation, TCall tAccess, CCMatch ccMatch) {
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		AbstractMethodInvocationToTAccess invocationToTAccess = PmFactory.eINSTANCE
				.createAbstractMethodInvocationToTAccess();
		mFlowElementToTFlowElement.setTarget(tAccess);
		mFlowElementToTFlowElement.setSource(invocation);
		ccMatch.getCreateCorr().add(mFlowElementToTFlowElement);
		invocationToTAccess.setSource(invocation);
		invocationToTAccess.setTarget(tAccess);
		ccMatch.getCreateCorr().add(invocationToTAccess);
		return new Object[] { invocation, tAccess, mFlowElementToTFlowElement, invocationToTAccess, ccMatch };
	}

	public static final Object[] pattern_SuperMethodInvocation_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_SuperMethodInvocation_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "SuperMethodInvocation";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_SuperMethodInvocation_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_27_1_matchtggpattern_black_nac_0B(
			MSuperMethodInvocation invocation) {
		for (AnnotationMemberValuePair __DEC_invocation_value_922243 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(invocation, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { invocation };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_27_1_matchtggpattern_black_nac_1BB(
			MSuperMethodInvocation invocation, MDefinition mMember) {
		for (MDefinition __DEC_invocation_mMethodInvocations_23905 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(invocation, MDefinition.class, "mMethodInvocations")) {
			if (!mMember.equals(__DEC_invocation_mMethodInvocations_23905)) {
				return new Object[] { invocation, mMember };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_27_1_matchtggpattern_blackBB(
			MSuperMethodInvocation invocation, MDefinition mMember) {
		if (mMember.getMMethodInvocations().contains(invocation)) {
			if (pattern_SuperMethodInvocation_27_1_matchtggpattern_black_nac_0B(invocation) == null) {
				if (pattern_SuperMethodInvocation_27_1_matchtggpattern_black_nac_1BB(invocation, mMember) == null) {
					return new Object[] { invocation, mMember };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_SuperMethodInvocation_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SuperMethodInvocation_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_28_1_matchtggpattern_blackBB(TMember tMember,
			TCall tAccess) {
		if (tMember.getAccessing().contains(tAccess)) {
			return new Object[] { tMember, tAccess };
		}
		return null;
	}

	public static final boolean pattern_SuperMethodInvocation_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SuperMethodInvocation_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_29_1_createresult_blackB(SuperMethodInvocation _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SuperMethodInvocation_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SuperMethodInvocation_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMemberToTMember) {
		if (ruleResult.getCorrObjects().contains(mMemberToTMember)) {
			return new Object[] { ruleResult, mMemberToTMember };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mMember) {
		if (ruleResult.getSourceObjects().contains(mMember)) {
			return new Object[] { ruleResult, mMember };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SuperMethodInvocation_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mMemberToTMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMMemberToTMember : mMemberToTMemberList.getEntryObjects()) {
				if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
					BodyDeclaration tmpMMember = mMemberToTMember.getSource();
					if (tmpMMember instanceof MDefinition) {
						MDefinition mMember = (MDefinition) tmpMMember;
						TMember tMember = mMemberToTMember.getTarget();
						if (tMember != null) {
							if (pattern_SuperMethodInvocation_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									mMemberToTMember) == null) {
								if (pattern_SuperMethodInvocation_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										mMember) == null) {
									if (pattern_SuperMethodInvocation_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											tMember) == null) {
										_result.add(new Object[] { mMemberToTMemberList, mMemberToTMember, mMember,
												tMember, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_SuperMethodInvocation_29_3_solveCSP_bindingFBBBBBB(SuperMethodInvocation _this,
			IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember, TMember tMember,
			MDefinition mMember, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mMemberToTMember, tMember, mMember,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, tMember, mMember, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SuperMethodInvocation_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SuperMethodInvocation_29_3_solveCSP_bindingAndBlackFBBBBBB(
			SuperMethodInvocation _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			TMember tMember, MDefinition mMember, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SuperMethodInvocation_29_3_solveCSP_binding = pattern_SuperMethodInvocation_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, tMember, mMember, ruleResult);
		if (result_pattern_SuperMethodInvocation_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SuperMethodInvocation_29_3_solveCSP_binding[0];

			Object[] result_pattern_SuperMethodInvocation_29_3_solveCSP_black = pattern_SuperMethodInvocation_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_SuperMethodInvocation_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, tMember, mMember, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SuperMethodInvocation_29_4_checkCSP_expressionFBB(SuperMethodInvocation _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SuperMethodInvocation_29_5_checknacs_blackBBB(
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinition mMember) {
		return new Object[] { mMemberToTMember, tMember, mMember };
	}

	public static final Object[] pattern_SuperMethodInvocation_29_6_perform_blackBBBB(
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinition mMember,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mMemberToTMember, tMember, mMember, ruleResult };
	}

	public static final Object[] pattern_SuperMethodInvocation_29_6_perform_greenFBFBFFB(TMember tMember,
			MDefinition mMember, ModelgeneratorRuleResult ruleResult) {
		MSuperMethodInvocation invocation = ModiscoFactory.eINSTANCE.createMSuperMethodInvocation();
		TCall tAccess = BasicFactory.eINSTANCE.createTCall();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		AbstractMethodInvocationToTAccess invocationToTAccess = PmFactory.eINSTANCE
				.createAbstractMethodInvocationToTAccess();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mMember.getMMethodInvocations().add(invocation);
		ruleResult.getSourceObjects().add(invocation);
		tMember.getAccessing().add(tAccess);
		ruleResult.getTargetObjects().add(tAccess);
		mFlowElementToTFlowElement.setTarget(tAccess);
		mFlowElementToTFlowElement.setSource(invocation);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		invocationToTAccess.setSource(invocation);
		invocationToTAccess.setTarget(tAccess);
		ruleResult.getCorrObjects().add(invocationToTAccess);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { invocation, tMember, tAccess, mMember, mFlowElementToTFlowElement, invocationToTAccess,
				ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_SuperMethodInvocation_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SuperMethodInvocationImpl
