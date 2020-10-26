/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;

import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MSuperConstructorInvocation;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.AbstractMethodInvocationToTAccess;
import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.RulesPackage;
import org.gravity.tgg.modisco.pm.Rules.SuperConstructorInvocation;

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
 * An implementation of the model object '<em><b>Super Constructor Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SuperConstructorInvocationImpl extends AbstractRuleImpl implements SuperConstructorInvocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperConstructorInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSuperConstructorInvocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MSuperConstructorInvocation invocation, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {

		Object[] result1_black = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_0_1_initialbindings_blackBBBBB(this, match, invocation, mMember,
						mMethod);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[invocation] = " + invocation + ", " + "[mMember] = " + mMember
					+ ", " + "[mMethod] = " + mMethod + ".");
		}

		Object[] result2_bindingAndBlack = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, invocation, mMember,
						mMethod);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[invocation] = " + invocation + ", " + "[mMember] = " + mMember
					+ ", " + "[mMethod] = " + mMethod + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_0_4_collectelementstobetranslated_blackBBBB(match, invocation,
							mMember, mMethod);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[invocation] = "
								+ invocation + ", " + "[mMember] = " + mMember + ", " + "[mMethod] = " + mMethod + ".");
			}
			SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_0_4_collectelementstobetranslated_greenBBBBFFF(match,
							invocation, mMember, mMethod);
			//nothing EMoflonEdge invocation__mMethod____method = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mMethod__invocation____usages = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result4_green[6];

			Object[] result5_black = SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_0_5_collectcontextelements_blackBBBB(match, invocation, mMember,
							mMethod);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[invocation] = "
								+ invocation + ", " + "[mMember] = " + mMember + ", " + "[mMethod] = " + mMethod + ".");
			}
			SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_0_5_collectcontextelements_greenBBB(match,
					mMember, mMethod);

			// 
			SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_0_6_registerobjectstomatch_expressionBBBBB(this, match,
							invocation, mMember, mMethod);
			return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_0_7_expressionF();
		} else {
			return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MSuperConstructorInvocation invocation = (MSuperConstructorInvocation) result1_bindingAndBlack[0];
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[1];
		TMember tMember = (TMember) result1_bindingAndBlack[2];
		MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result1_bindingAndBlack[3];
		TMember tMethod = (TMember) result1_bindingAndBlack[4];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[5];
		AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_1_1_performtransformation_greenBBFBFF(invocation, tMember, tMethod);
		TCall tAccess = (TCall) result1_green[2];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[4];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_green[5];

		Object[] result2_black = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_1_2_collecttranslatedelements_blackBBBB(invocation, tAccess,
						mFlowElementToTFlowElement, invocationToTAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[invocation] = " + invocation
					+ ", " + "[tAccess] = " + tAccess + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[invocationToTAccess] = " + invocationToTAccess + ".");
		}
		Object[] result2_green = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_1_2_collecttranslatedelements_greenFBBBB(invocation, tAccess,
						mFlowElementToTFlowElement, invocationToTAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, invocation,
						mMemberToTMember, tMember, tAccess, mMethodToTMethod, tMethod, mMember,
						mFlowElementToTFlowElement, invocationToTAccess, mMethod);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[invocation] = " + invocation + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
					+ "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ", " + "[mMethodToTMethod] = "
					+ mMethodToTMethod + ", " + "[tMethod] = " + tMethod + ", " + "[mMember] = " + mMember + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[invocationToTAccess] = "
					+ invocationToTAccess + ", " + "[mMethod] = " + mMethod + ".");
		}
		SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(ruleresult,
						invocation, tMember, tAccess, tMethod, mMember, mFlowElementToTFlowElement, invocationToTAccess,
						mMethod);
		//nothing EMoflonEdge invocation__mMethod____method = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mMethod__invocation____usages = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tAccess____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mFlowElementToTFlowElement__invocation____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tAccess__tMethod____tTarget = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tMethod__tAccess____accessedBy = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result3_green[19];

		// 
		// 
		SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_1_5_registerobjects_expressionBBBBBBBBBBBB(
				this, ruleresult, invocation, mMemberToTMember, tMember, tAccess, mMethodToTMethod, tMethod, mMember,
				mFlowElementToTFlowElement, invocationToTAccess, mMethod);
		return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MSuperConstructorInvocation invocation = (MSuperConstructorInvocation) result2_binding[0];
		MDefinition mMember = (MDefinition) result2_binding[1];
		AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) result2_binding[2];
		for (Object[] result2_black : SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_2_2_corematch_blackBFFFFBBB(invocation, mMember, mMethod, match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[1];
			TMember tMember = (TMember) result2_black[2];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[3];
			TMember tMethod = (TMember) result2_black[4];
			// ForEach 
			for (Object[] result3_black : SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_2_3_findcontext_blackBBBBBBB(invocation, mMemberToTMember,
							tMember, mMethodToTMethod, tMethod, mMember, mMethod)) {
				Object[] result3_green = SuperConstructorInvocationImpl
						.pattern_SuperConstructorInvocation_2_3_findcontext_greenBBBBBBBFFFFFFFF(invocation,
								mMemberToTMember, tMember, mMethodToTMethod, tMethod, mMember, mMethod);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge invocation__mMethod____method = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mMethod__invocation____usages = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mMethodToTMethod__tMethod____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mMethodToTMethod__mMethod____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = SuperConstructorInvocationImpl
						.pattern_SuperConstructorInvocation_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, invocation, mMemberToTMember, tMember, mMethodToTMethod, tMethod,
								mMember, mMethod);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[invocation] = " + invocation
							+ ", " + "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tMember] = " + tMember + ", "
							+ "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[tMethod] = " + tMethod + ", "
							+ "[mMember] = " + mMember + ", " + "[mMethod] = " + mMethod + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = SuperConstructorInvocationImpl
							.pattern_SuperConstructorInvocation_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MSuperConstructorInvocation invocation, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		match.registerObject("invocation", invocation);
		match.registerObject("mMember", mMember);
		match.registerObject("mMethod", mMethod);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MSuperConstructorInvocation invocation, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MSuperConstructorInvocation invocation,
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinitionToTMember mMethodToTMethod,
			TMember tMethod, MDefinition mMember, AbstractMethodDeclaration mMethod) {// Create CSP
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
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMethod", mMethod);
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
			EObject tMember, EObject tAccess, EObject mMethodToTMethod, EObject tMethod, EObject mMember,
			EObject mFlowElementToTFlowElement, EObject invocationToTAccess, EObject mMethod) {
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("mMethodToTMethod", mMethodToTMethod);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);
		ruleresult.registerObject("mMethod", mMethod);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("invocation").eClass())
				.equals("modisco.MSuperConstructorInvocation.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TMember tMember, TCall tAccess, TMember tMethod) {

		Object[] result1_black = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_10_1_initialbindings_blackBBBBB(this, match, tMember, tAccess,
						tMethod);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ", "
					+ "[tMethod] = " + tMethod + ".");
		}

		Object[] result2_bindingAndBlack = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tMember, tAccess,
						tMethod);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ", "
					+ "[tMethod] = " + tMethod + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_10_4_collectelementstobetranslated_blackBBBB(match, tMember,
							tAccess, tMethod);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tMember] = "
								+ tMember + ", " + "[tAccess] = " + tAccess + ", " + "[tMethod] = " + tMethod + ".");
			}
			SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_10_4_collectelementstobetranslated_greenBBBBFFFF(match, tMember,
							tAccess, tMethod);
			//nothing EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tAccess__tMethod____tTarget = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tMethod__tAccess____accessedBy = (EMoflonEdge) result4_green[7];

			Object[] result5_black = SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_10_5_collectcontextelements_blackBBBB(match, tMember, tAccess,
							tMethod);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tMember] = "
								+ tMember + ", " + "[tAccess] = " + tAccess + ", " + "[tMethod] = " + tMethod + ".");
			}
			SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_10_5_collectcontextelements_greenBBB(match, tMember, tMethod);

			// 
			SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							tMember, tAccess, tMethod);
			return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_10_7_expressionF();
		} else {
			return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[0];
		TMember tMember = (TMember) result1_bindingAndBlack[1];
		TCall tAccess = (TCall) result1_bindingAndBlack[2];
		MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result1_bindingAndBlack[3];
		TMember tMethod = (TMember) result1_bindingAndBlack[4];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[5];
		AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_11_1_performtransformation_greenFBBFFB(tAccess, mMember, mMethod);
		MSuperConstructorInvocation invocation = (MSuperConstructorInvocation) result1_green[0];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[3];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_green[4];

		Object[] result2_black = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_11_2_collecttranslatedelements_blackBBBB(invocation, tAccess,
						mFlowElementToTFlowElement, invocationToTAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[invocation] = " + invocation
					+ ", " + "[tAccess] = " + tAccess + ", " + "[mFlowElementToTFlowElement] = "
					+ mFlowElementToTFlowElement + ", " + "[invocationToTAccess] = " + invocationToTAccess + ".");
		}
		Object[] result2_green = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_11_2_collecttranslatedelements_greenFBBBB(invocation, tAccess,
						mFlowElementToTFlowElement, invocationToTAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, invocation,
						mMemberToTMember, tMember, tAccess, mMethodToTMethod, tMethod, mMember,
						mFlowElementToTFlowElement, invocationToTAccess, mMethod);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[invocation] = " + invocation + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
					+ "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ", " + "[mMethodToTMethod] = "
					+ mMethodToTMethod + ", " + "[tMethod] = " + tMethod + ", " + "[mMember] = " + mMember + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[invocationToTAccess] = "
					+ invocationToTAccess + ", " + "[mMethod] = " + mMethod + ".");
		}
		SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(ruleresult,
						invocation, tMember, tAccess, tMethod, mMember, mFlowElementToTFlowElement, invocationToTAccess,
						mMethod);
		//nothing EMoflonEdge invocation__mMethod____method = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mMethod__invocation____usages = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tAccess____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mFlowElementToTFlowElement__invocation____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tAccess__tMethod____tTarget = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tMethod__tAccess____accessedBy = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result3_green[19];

		// 
		// 
		SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_11_5_registerobjects_expressionBBBBBBBBBBBB(
				this, ruleresult, invocation, mMemberToTMember, tMember, tAccess, mMethodToTMethod, tMethod, mMember,
				mFlowElementToTFlowElement, invocationToTAccess, mMethod);
		return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMember tMember = (TMember) result2_binding[0];
		TCall tAccess = (TCall) result2_binding[1];
		TMember tMethod = (TMember) result2_binding[2];
		for (Object[] result2_black : SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_12_2_corematch_blackFBBFBFFB(tMember, tAccess, tMethod, match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[0];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[3];
			MDefinition mMember = (MDefinition) result2_black[5];
			AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) result2_black[6];
			// ForEach 
			for (Object[] result3_black : SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_12_3_findcontext_blackBBBBBBB(mMemberToTMember, tMember,
							tAccess, mMethodToTMethod, tMethod, mMember, mMethod)) {
				Object[] result3_green = SuperConstructorInvocationImpl
						.pattern_SuperConstructorInvocation_12_3_findcontext_greenBBBBBBBFFFFFFFFF(mMemberToTMember,
								tMember, tAccess, mMethodToTMethod, tMethod, mMember, mMethod);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mMethodToTMethod__tMethod____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mMethodToTMethod__mMethod____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tAccess__tMethod____tTarget = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tMethod__tAccess____accessedBy = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = SuperConstructorInvocationImpl
						.pattern_SuperConstructorInvocation_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, mMemberToTMember, tMember, tAccess, mMethodToTMethod, tMethod,
								mMember, mMethod);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMemberToTMember] = "
							+ mMemberToTMember + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess
							+ ", " + "[mMethodToTMethod] = " + mMethodToTMethod + ", " + "[tMethod] = " + tMethod + ", "
							+ "[mMember] = " + mMember + ", " + "[mMethod] = " + mMethod + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = SuperConstructorInvocationImpl
							.pattern_SuperConstructorInvocation_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMember tMember, TCall tAccess, TMember tMethod) {
		match.registerObject("tMember", tMember);
		match.registerObject("tAccess", tAccess);
		match.registerObject("tMethod", tMethod);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMember tMember, TCall tAccess, TMember tMethod) {// Create CSP
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
			TMember tMember, TCall tAccess, MDefinitionToTMember mMethodToTMethod, TMember tMethod, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {// Create CSP
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
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMethod", mMethod);
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
			EObject tMember, EObject tAccess, EObject mMethodToTMethod, EObject tMethod, EObject mMember,
			EObject mFlowElementToTFlowElement, EObject invocationToTAccess, EObject mMethod) {
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("mMethodToTMethod", mMethodToTMethod);
		ruleresult.registerObject("tMethod", tMethod);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);
		ruleresult.registerObject("mMethod", mMethod);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_79(EMoflonEdge _edge_tAccessing) {

		Object[] result1_bindingAndBlack = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_20_2_testcorematchandDECs_blackFFFB(_edge_tAccessing)) {
			TMember tMember = (TMember) result2_black[0];
			TCall tAccess = (TCall) result2_black[1];
			TMember tMethod = (TMember) result2_black[2];
			Object[] result2_green = SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tMember, tAccess, tMethod)) {
				// 
				if (SuperConstructorInvocationImpl
						.pattern_SuperConstructorInvocation_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = SuperConstructorInvocationImpl
							.pattern_SuperConstructorInvocation_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SuperConstructorInvocationImpl
							.pattern_SuperConstructorInvocation_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_83(EMoflonEdge _edge_method) {

		Object[] result1_bindingAndBlack = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_21_2_testcorematchandDECs_blackFFFB(_edge_method)) {
			MSuperConstructorInvocation invocation = (MSuperConstructorInvocation) result2_black[0];
			MDefinition mMember = (MDefinition) result2_black[1];
			AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) result2_black[2];
			Object[] result2_green = SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, invocation, mMember, mMethod)) {
				// 
				if (SuperConstructorInvocationImpl
						.pattern_SuperConstructorInvocation_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = SuperConstructorInvocationImpl
							.pattern_SuperConstructorInvocation_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SuperConstructorInvocationImpl
							.pattern_SuperConstructorInvocation_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SuperConstructorInvocation");
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
		ruleResult.setRule("SuperConstructorInvocation");
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

		Object[] result1_black = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MSuperConstructorInvocation invocation = (MSuperConstructorInvocation) result2_bindingAndBlack[0];
		TMember tMember = (TMember) result2_bindingAndBlack[1];
		TCall tAccess = (TCall) result2_bindingAndBlack[2];
		TMember tMethod = (TMember) result2_bindingAndBlack[3];
		MDefinition mMember = (MDefinition) result2_bindingAndBlack[4];
		AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, invocation, tMember,
						tAccess, tMethod, mMember, mMethod, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[invocation] = " + invocation + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess
					+ ", " + "[tMethod] = " + tMethod + ", " + "[mMember] = " + mMember + ", " + "[mMethod] = "
					+ mMethod + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_24_5_matchcorrcontext_blackFBFBBBBB(tMember, tMethod, mMember,
							mMethod, sourceMatch, targetMatch)) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result5_black[0];
				MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result5_black[2];
				Object[] result5_green = SuperConstructorInvocationImpl
						.pattern_SuperConstructorInvocation_24_5_matchcorrcontext_greenBBBBF(mMemberToTMember,
								mMethodToTMethod, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = SuperConstructorInvocationImpl
						.pattern_SuperConstructorInvocation_24_6_createcorrespondence_blackBBBBBBB(invocation, tMember,
								tAccess, tMethod, mMember, mMethod, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[invocation] = "
							+ invocation + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ", "
							+ "[tMethod] = " + tMethod + ", " + "[mMember] = " + mMember + ", " + "[mMethod] = "
							+ mMethod + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_24_6_createcorrespondence_greenBBFFB(
						invocation, tAccess, ccMatch);
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[2];
				//nothing AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result6_green[3];

				Object[] result7_black = SuperConstructorInvocationImpl
						.pattern_SuperConstructorInvocation_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				SuperConstructorInvocationImpl
						.pattern_SuperConstructorInvocation_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MSuperConstructorInvocation invocation, TMember tMember, TCall tAccess,
			TMember tMethod, MDefinition mMember, AbstractMethodDeclaration mMethod, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MSuperConstructorInvocation invocation, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {// 
		Object[] result1_black = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_27_1_matchtggpattern_blackBBB(invocation, mMember, mMethod);
		if (result1_black != null) {
			return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_27_2_expressionF();
		} else {
			return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMember tMember, TCall tAccess, TMember tMethod) {// 
		Object[] result1_black = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_28_1_matchtggpattern_blackBBB(tMember, tAccess, tMethod);
		if (result1_black != null) {
			return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_28_2_expressionF();
		} else {
			return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember mMemberToTMemberParameter, MDefinitionToTMember mMethodToTMethodParameter) {

		Object[] result1_black = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : SuperConstructorInvocationImpl
				.pattern_SuperConstructorInvocation_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mMemberToTMemberList = (RuleEntryList) result2_black[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[1];
			MDefinition mMember = (MDefinition) result2_black[2];
			TMember tMember = (TMember) result2_black[3];
			//nothing RuleEntryList mMethodToTMethodList = (RuleEntryList) result2_black[4];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result2_black[5];
			TMember tMethod = (TMember) result2_black[6];
			AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = SuperConstructorInvocationImpl
					.pattern_SuperConstructorInvocation_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mMemberToTMember, tMember, mMethodToTMethod, tMethod, mMember, mMethod, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMemberToTMember] = "
						+ mMemberToTMember + ", " + "[tMember] = " + tMember + ", " + "[mMethodToTMethod] = "
						+ mMethodToTMethod + ", " + "[tMethod] = " + tMethod + ", " + "[mMember] = " + mMember + ", "
						+ "[mMethod] = " + mMethod + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = SuperConstructorInvocationImpl
						.pattern_SuperConstructorInvocation_29_5_checknacs_blackBBBBBB(mMemberToTMember, tMember,
								mMethodToTMethod, tMethod, mMember, mMethod);
				if (result5_black != null) {

					Object[] result6_black = SuperConstructorInvocationImpl
							.pattern_SuperConstructorInvocation_29_6_perform_blackBBBBBBB(mMemberToTMember, tMember,
									mMethodToTMethod, tMethod, mMember, mMethod, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mMemberToTMember] = "
								+ mMemberToTMember + ", " + "[tMember] = " + tMember + ", " + "[mMethodToTMethod] = "
								+ mMethodToTMethod + ", " + "[tMethod] = " + tMethod + ", " + "[mMember] = " + mMember
								+ ", " + "[mMethod] = " + mMethod + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_29_6_perform_greenFBFBBFFBB(
							tMember, tMethod, mMember, mMethod, ruleResult);
					//nothing MSuperConstructorInvocation invocation = (MSuperConstructorInvocation) result6_green[0];
					//nothing TCall tAccess = (TCall) result6_green[2];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[5];
					//nothing AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return SuperConstructorInvocationImpl.pattern_SuperConstructorInvocation_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			TMember tMember, MDefinitionToTMember mMethodToTMethod, TMember tMethod, MDefinition mMember,
			AbstractMethodDeclaration mMethod, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("mMethodToTMethod", mMethodToTMethod);
		isApplicableMatch.registerObject("tMethod", tMethod);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMethod", mMethod);
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
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPROPRIATE_FWD__MATCH_MSUPERCONSTRUCTORINVOCATION_MDEFINITION_ABSTRACTMETHODDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MSuperConstructorInvocation) arguments.get(1),
					(MDefinition) arguments.get(2), (AbstractMethodDeclaration) arguments.get(3));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MSUPERCONSTRUCTORINVOCATION_MDEFINITION_ABSTRACTMETHODDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MSuperConstructorInvocation) arguments.get(1),
					(MDefinition) arguments.get(2), (AbstractMethodDeclaration) arguments.get(3));
			return null;
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MSUPERCONSTRUCTORINVOCATION_MDEFINITION_ABSTRACTMETHODDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MSuperConstructorInvocation) arguments.get(1),
					(MDefinition) arguments.get(2), (AbstractMethodDeclaration) arguments.get(3));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MSUPERCONSTRUCTORINVOCATION_MDEFINITIONTOTMEMBER_TMEMBER_MDEFINITIONTOTMEMBER_TMEMBER_MDEFINITION_ABSTRACTMETHODDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MSuperConstructorInvocation) arguments.get(1), (MDefinitionToTMember) arguments.get(2),
					(TMember) arguments.get(3), (MDefinitionToTMember) arguments.get(4), (TMember) arguments.get(5),
					(MDefinition) arguments.get(6), (AbstractMethodDeclaration) arguments.get(7));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPROPRIATE_BWD__MATCH_TMEMBER_TCALL_TMEMBER:
			return isAppropriate_BWD((Match) arguments.get(0), (TMember) arguments.get(1), (TCall) arguments.get(2),
					(TMember) arguments.get(3));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMEMBER_TCALL_TMEMBER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMember) arguments.get(1), (TCall) arguments.get(2),
					(TMember) arguments.get(3));
			return null;
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMEMBER_TCALL_TMEMBER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TCall) arguments.get(2), (TMember) arguments.get(3));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_TMEMBER_TCALL_MDEFINITIONTOTMEMBER_TMEMBER_MDEFINITION_ABSTRACTMETHODDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (TMember) arguments.get(2), (TCall) arguments.get(3),
					(MDefinitionToTMember) arguments.get(4), (TMember) arguments.get(5), (MDefinition) arguments.get(6),
					(AbstractMethodDeclaration) arguments.get(7));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_79__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_79((EMoflonEdge) arguments.get(0));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_83__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_83((EMoflonEdge) arguments.get(0));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPLICABLE_SOLVE_CSP_CC__MSUPERCONSTRUCTORINVOCATION_TMEMBER_TCALL_TMEMBER_MDEFINITION_ABSTRACTMETHODDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MSuperConstructorInvocation) arguments.get(0), (TMember) arguments.get(1),
					(TCall) arguments.get(2), (TMember) arguments.get(3), (MDefinition) arguments.get(4),
					(AbstractMethodDeclaration) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___CHECK_DEC_FWD__MSUPERCONSTRUCTORINVOCATION_MDEFINITION_ABSTRACTMETHODDECLARATION:
			return checkDEC_FWD((MSuperConstructorInvocation) arguments.get(0), (MDefinition) arguments.get(1),
					(AbstractMethodDeclaration) arguments.get(2));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___CHECK_DEC_BWD__TMEMBER_TCALL_TMEMBER:
			return checkDEC_BWD((TMember) arguments.get(0), (TCall) arguments.get(1), (TMember) arguments.get(2));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1),
					(MDefinitionToTMember) arguments.get(2));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_TMEMBER_MDEFINITIONTOTMEMBER_TMEMBER_MDEFINITION_ABSTRACTMETHODDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (TMember) arguments.get(2),
					(MDefinitionToTMember) arguments.get(3), (TMember) arguments.get(4), (MDefinition) arguments.get(5),
					(AbstractMethodDeclaration) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SuperConstructorInvocation_0_1_initialbindings_blackBBBBB(
			SuperConstructorInvocation _this, Match match, MSuperConstructorInvocation invocation, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		return new Object[] { _this, match, invocation, mMember, mMethod };
	}

	public static final Object[] pattern_SuperConstructorInvocation_0_2_SolveCSP_bindingFBBBBB(
			SuperConstructorInvocation _this, Match match, MSuperConstructorInvocation invocation, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, invocation, mMember, mMethod);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, invocation, mMember, mMethod };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SuperConstructorInvocation_0_2_SolveCSP_bindingAndBlackFBBBBB(
			SuperConstructorInvocation _this, Match match, MSuperConstructorInvocation invocation, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		Object[] result_pattern_SuperConstructorInvocation_0_2_SolveCSP_binding = pattern_SuperConstructorInvocation_0_2_SolveCSP_bindingFBBBBB(
				_this, match, invocation, mMember, mMethod);
		if (result_pattern_SuperConstructorInvocation_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SuperConstructorInvocation_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SuperConstructorInvocation_0_2_SolveCSP_black = pattern_SuperConstructorInvocation_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SuperConstructorInvocation_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, invocation, mMember, mMethod };
			}
		}
		return null;
	}

	public static final boolean pattern_SuperConstructorInvocation_0_3_CheckCSP_expressionFBB(
			SuperConstructorInvocation _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_0_4_collectelementstobetranslated_blackBBBB(
			Match match, MSuperConstructorInvocation invocation, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		return new Object[] { match, invocation, mMember, mMethod };
	}

	public static final Object[] pattern_SuperConstructorInvocation_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, MSuperConstructorInvocation invocation, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		EMoflonEdge invocation__mMethod____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethod__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(invocation);
		String invocation__mMethod____method_name_prime = "method";
		String mMethod__invocation____usages_name_prime = "usages";
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		invocation__mMethod____method.setSrc(invocation);
		invocation__mMethod____method.setTrg(mMethod);
		match.getToBeTranslatedEdges().add(invocation__mMethod____method);
		mMethod__invocation____usages.setSrc(mMethod);
		mMethod__invocation____usages.setTrg(invocation);
		match.getToBeTranslatedEdges().add(mMethod__invocation____usages);
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		match.getToBeTranslatedEdges().add(mMember__invocation____mMethodInvocations);
		invocation__mMethod____method.setName(invocation__mMethod____method_name_prime);
		mMethod__invocation____usages.setName(mMethod__invocation____usages_name_prime);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		return new Object[] { match, invocation, mMember, mMethod, invocation__mMethod____method,
				mMethod__invocation____usages, mMember__invocation____mMethodInvocations };
	}

	public static final Object[] pattern_SuperConstructorInvocation_0_5_collectcontextelements_blackBBBB(Match match,
			MSuperConstructorInvocation invocation, MDefinition mMember, AbstractMethodDeclaration mMethod) {
		return new Object[] { match, invocation, mMember, mMethod };
	}

	public static final Object[] pattern_SuperConstructorInvocation_0_5_collectcontextelements_greenBBB(Match match,
			MDefinition mMember, AbstractMethodDeclaration mMethod) {
		match.getContextNodes().add(mMember);
		match.getContextNodes().add(mMethod);
		return new Object[] { match, mMember, mMethod };
	}

	public static final void pattern_SuperConstructorInvocation_0_6_registerobjectstomatch_expressionBBBBB(
			SuperConstructorInvocation _this, Match match, MSuperConstructorInvocation invocation, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		_this.registerObjectsToMatch_FWD(match, invocation, mMember, mMethod);

	}

	public static final boolean pattern_SuperConstructorInvocation_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SuperConstructorInvocation_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("invocation");
		EObject _localVariable_1 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("mMethodToTMethod");
		EObject _localVariable_4 = isApplicableMatch.getObject("tMethod");
		EObject _localVariable_5 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_6 = isApplicableMatch.getObject("mMethod");
		EObject tmpInvocation = _localVariable_0;
		EObject tmpMMemberToTMember = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpMMethodToTMethod = _localVariable_3;
		EObject tmpTMethod = _localVariable_4;
		EObject tmpMMember = _localVariable_5;
		EObject tmpMMethod = _localVariable_6;
		if (tmpInvocation instanceof MSuperConstructorInvocation) {
			MSuperConstructorInvocation invocation = (MSuperConstructorInvocation) tmpInvocation;
			if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					if (tmpMMethodToTMethod instanceof MDefinitionToTMember) {
						MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) tmpMMethodToTMethod;
						if (tmpTMethod instanceof TMember) {
							TMember tMethod = (TMember) tmpTMethod;
							if (tmpMMember instanceof MDefinition) {
								MDefinition mMember = (MDefinition) tmpMMember;
								if (tmpMMethod instanceof AbstractMethodDeclaration) {
									AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) tmpMMethod;
									return new Object[] { invocation, mMemberToTMember, tMember, mMethodToTMethod,
											tMethod, mMember, mMethod, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_1_1_performtransformation_blackBBBBBBBFBB(
			MSuperConstructorInvocation invocation, MDefinitionToTMember mMemberToTMember, TMember tMember,
			MDefinitionToTMember mMethodToTMethod, TMember tMethod, MDefinition mMember,
			AbstractMethodDeclaration mMethod, SuperConstructorInvocation _this, IsApplicableMatch isApplicableMatch) {
		if (!mMemberToTMember.equals(mMethodToTMethod)) {
			if (!tMember.equals(tMethod)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { invocation, mMemberToTMember, tMember, mMethodToTMethod, tMethod, mMember,
								mMethod, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			SuperConstructorInvocation _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SuperConstructorInvocation_1_1_performtransformation_binding = pattern_SuperConstructorInvocation_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SuperConstructorInvocation_1_1_performtransformation_binding != null) {
			MSuperConstructorInvocation invocation = (MSuperConstructorInvocation) result_pattern_SuperConstructorInvocation_1_1_performtransformation_binding[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_SuperConstructorInvocation_1_1_performtransformation_binding[1];
			TMember tMember = (TMember) result_pattern_SuperConstructorInvocation_1_1_performtransformation_binding[2];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result_pattern_SuperConstructorInvocation_1_1_performtransformation_binding[3];
			TMember tMethod = (TMember) result_pattern_SuperConstructorInvocation_1_1_performtransformation_binding[4];
			MDefinition mMember = (MDefinition) result_pattern_SuperConstructorInvocation_1_1_performtransformation_binding[5];
			AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) result_pattern_SuperConstructorInvocation_1_1_performtransformation_binding[6];

			Object[] result_pattern_SuperConstructorInvocation_1_1_performtransformation_black = pattern_SuperConstructorInvocation_1_1_performtransformation_blackBBBBBBBFBB(
					invocation, mMemberToTMember, tMember, mMethodToTMethod, tMethod, mMember, mMethod, _this,
					isApplicableMatch);
			if (result_pattern_SuperConstructorInvocation_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SuperConstructorInvocation_1_1_performtransformation_black[7];

				return new Object[] { invocation, mMemberToTMember, tMember, mMethodToTMethod, tMethod, mMember,
						mMethod, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_1_1_performtransformation_greenBBFBFF(
			MSuperConstructorInvocation invocation, TMember tMember, TMember tMethod) {
		TCall tAccess = BasicFactory.eINSTANCE.createTCall();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		AbstractMethodInvocationToTAccess invocationToTAccess = PmFactory.eINSTANCE
				.createAbstractMethodInvocationToTAccess();
		tMember.getTAccessing().add(tAccess);
		tAccess.setTTarget(tMethod);
		mFlowElementToTFlowElement.setTarget(tAccess);
		mFlowElementToTFlowElement.setSource(invocation);
		invocationToTAccess.setSource(invocation);
		invocationToTAccess.setTarget(tAccess);
		return new Object[] { invocation, tMember, tAccess, tMethod, mFlowElementToTFlowElement, invocationToTAccess };
	}

	public static final Object[] pattern_SuperConstructorInvocation_1_2_collecttranslatedelements_blackBBBB(
			MSuperConstructorInvocation invocation, TCall tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		return new Object[] { invocation, tAccess, mFlowElementToTFlowElement, invocationToTAccess };
	}

	public static final Object[] pattern_SuperConstructorInvocation_1_2_collecttranslatedelements_greenFBBBB(
			MSuperConstructorInvocation invocation, TCall tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(invocation);
		ruleresult.getCreatedElements().add(tAccess);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(invocationToTAccess);
		return new Object[] { ruleresult, invocation, tAccess, mFlowElementToTFlowElement, invocationToTAccess };
	}

	public static final Object[] pattern_SuperConstructorInvocation_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject invocation, EObject mMemberToTMember, EObject tMember,
			EObject tAccess, EObject mMethodToTMethod, EObject tMethod, EObject mMember,
			EObject mFlowElementToTFlowElement, EObject invocationToTAccess, EObject mMethod) {
		if (!invocation.equals(mMemberToTMember)) {
			if (!invocation.equals(tMember)) {
				if (!invocation.equals(tAccess)) {
					if (!invocation.equals(mMethodToTMethod)) {
						if (!invocation.equals(tMethod)) {
							if (!invocation.equals(mMember)) {
								if (!invocation.equals(mFlowElementToTFlowElement)) {
									if (!invocation.equals(invocationToTAccess)) {
										if (!invocation.equals(mMethod)) {
											if (!mMemberToTMember.equals(tMember)) {
												if (!mMemberToTMember.equals(tAccess)) {
													if (!mMemberToTMember.equals(mMethodToTMethod)) {
														if (!mMemberToTMember.equals(tMethod)) {
															if (!mMemberToTMember.equals(mMethod)) {
																if (!tMember.equals(tMethod)) {
																	if (!tAccess.equals(tMember)) {
																		if (!tAccess.equals(tMethod)) {
																			if (!mMethodToTMethod.equals(tMember)) {
																				if (!mMethodToTMethod.equals(tAccess)) {
																					if (!mMethodToTMethod
																							.equals(tMethod)) {
																						if (!mMember.equals(
																								mMemberToTMember)) {
																							if (!mMember
																									.equals(tMember)) {
																								if (!mMember.equals(
																										tAccess)) {
																									if (!mMember.equals(
																											mMethodToTMethod)) {
																										if (!mMember
																												.equals(tMethod)) {
																											if (!mMember
																													.equals(mMethod)) {
																												if (!mFlowElementToTFlowElement
																														.equals(mMemberToTMember)) {
																													if (!mFlowElementToTFlowElement
																															.equals(tMember)) {
																														if (!mFlowElementToTFlowElement
																																.equals(tAccess)) {
																															if (!mFlowElementToTFlowElement
																																	.equals(mMethodToTMethod)) {
																																if (!mFlowElementToTFlowElement
																																		.equals(tMethod)) {
																																	if (!mFlowElementToTFlowElement
																																			.equals(mMember)) {
																																		if (!mFlowElementToTFlowElement
																																				.equals(mMethod)) {
																																			if (!invocationToTAccess
																																					.equals(mMemberToTMember)) {
																																				if (!invocationToTAccess
																																						.equals(tMember)) {
																																					if (!invocationToTAccess
																																							.equals(tAccess)) {
																																						if (!invocationToTAccess
																																								.equals(mMethodToTMethod)) {
																																							if (!invocationToTAccess
																																									.equals(tMethod)) {
																																								if (!invocationToTAccess
																																										.equals(mMember)) {
																																									if (!invocationToTAccess
																																											.equals(mFlowElementToTFlowElement)) {
																																										if (!invocationToTAccess
																																												.equals(mMethod)) {
																																											if (!mMethod
																																													.equals(tMember)) {
																																												if (!mMethod
																																														.equals(tAccess)) {
																																													if (!mMethod
																																															.equals(mMethodToTMethod)) {
																																														if (!mMethod
																																																.equals(tMethod)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	invocation,
																																																	mMemberToTMember,
																																																	tMember,
																																																	tAccess,
																																																	mMethodToTMethod,
																																																	tMethod,
																																																	mMember,
																																																	mFlowElementToTFlowElement,
																																																	invocationToTAccess,
																																																	mMethod };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SuperConstructorInvocation_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject invocation, EObject tMember, EObject tAccess, EObject tMethod,
			EObject mMember, EObject mFlowElementToTFlowElement, EObject invocationToTAccess, EObject mMethod) {
		EMoflonEdge invocation__mMethod____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethod__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMethod____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethod__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SuperConstructorInvocation";
		String invocation__mMethod____method_name_prime = "method";
		String mMethod__invocation____usages_name_prime = "usages";
		String tMember__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tMember____tSource_name_prime = "tSource";
		String mFlowElementToTFlowElement__tAccess____target_name_prime = "target";
		String invocationToTAccess__invocation____source_name_prime = "source";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		String mFlowElementToTFlowElement__invocation____source_name_prime = "source";
		String tAccess__tMethod____tTarget_name_prime = "tTarget";
		String tMethod__tAccess____accessedBy_name_prime = "accessedBy";
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		invocation__mMethod____method.setSrc(invocation);
		invocation__mMethod____method.setTrg(mMethod);
		ruleresult.getTranslatedEdges().add(invocation__mMethod____method);
		mMethod__invocation____usages.setSrc(mMethod);
		mMethod__invocation____usages.setTrg(invocation);
		ruleresult.getTranslatedEdges().add(mMethod__invocation____usages);
		tMember__tAccess____tAccessing.setSrc(tMember);
		tMember__tAccess____tAccessing.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(tMember__tAccess____tAccessing);
		tAccess__tMember____tSource.setSrc(tAccess);
		tAccess__tMember____tSource.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tAccess__tMember____tSource);
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
		tAccess__tMethod____tTarget.setSrc(tAccess);
		tAccess__tMethod____tTarget.setTrg(tMethod);
		ruleresult.getCreatedEdges().add(tAccess__tMethod____tTarget);
		tMethod__tAccess____accessedBy.setSrc(tMethod);
		tMethod__tAccess____accessedBy.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(tMethod__tAccess____accessedBy);
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		ruleresult.getTranslatedEdges().add(mMember__invocation____mMethodInvocations);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		invocation__mMethod____method.setName(invocation__mMethod____method_name_prime);
		mMethod__invocation____usages.setName(mMethod__invocation____usages_name_prime);
		tMember__tAccess____tAccessing.setName(tMember__tAccess____tAccessing_name_prime);
		tAccess__tMember____tSource.setName(tAccess__tMember____tSource_name_prime);
		mFlowElementToTFlowElement__tAccess____target.setName(mFlowElementToTFlowElement__tAccess____target_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		mFlowElementToTFlowElement__invocation____source
				.setName(mFlowElementToTFlowElement__invocation____source_name_prime);
		tAccess__tMethod____tTarget.setName(tAccess__tMethod____tTarget_name_prime);
		tMethod__tAccess____accessedBy.setName(tMethod__tAccess____accessedBy_name_prime);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		return new Object[] { ruleresult, invocation, tMember, tAccess, tMethod, mMember, mFlowElementToTFlowElement,
				invocationToTAccess, mMethod, invocation__mMethod____method, mMethod__invocation____usages,
				tMember__tAccess____tAccessing, tAccess__tMember____tSource,
				mFlowElementToTFlowElement__tAccess____target, invocationToTAccess__invocation____source,
				invocationToTAccess__tAccess____target, mFlowElementToTFlowElement__invocation____source,
				tAccess__tMethod____tTarget, tMethod__tAccess____accessedBy,
				mMember__invocation____mMethodInvocations };
	}

	public static final void pattern_SuperConstructorInvocation_1_5_registerobjects_expressionBBBBBBBBBBBB(
			SuperConstructorInvocation _this, PerformRuleResult ruleresult, EObject invocation,
			EObject mMemberToTMember, EObject tMember, EObject tAccess, EObject mMethodToTMethod, EObject tMethod,
			EObject mMember, EObject mFlowElementToTFlowElement, EObject invocationToTAccess, EObject mMethod) {
		_this.registerObjects_FWD(ruleresult, invocation, mMemberToTMember, tMember, tAccess, mMethodToTMethod, tMethod,
				mMember, mFlowElementToTFlowElement, invocationToTAccess, mMethod);

	}

	public static final PerformRuleResult pattern_SuperConstructorInvocation_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_2_1_preparereturnvalue_bindingFB(
			SuperConstructorInvocation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_2_1_preparereturnvalue_blackFBB(EClass eClass,
			SuperConstructorInvocation _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_2_1_preparereturnvalue_bindingAndBlackFFB(
			SuperConstructorInvocation _this) {
		Object[] result_pattern_SuperConstructorInvocation_2_1_preparereturnvalue_binding = pattern_SuperConstructorInvocation_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SuperConstructorInvocation_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SuperConstructorInvocation_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SuperConstructorInvocation_2_1_preparereturnvalue_black = pattern_SuperConstructorInvocation_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SuperConstructorInvocation_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SuperConstructorInvocation_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SuperConstructorInvocation";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SuperConstructorInvocation_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("invocation");
		EObject _localVariable_1 = match.getObject("mMember");
		EObject _localVariable_2 = match.getObject("mMethod");
		EObject tmpInvocation = _localVariable_0;
		EObject tmpMMember = _localVariable_1;
		EObject tmpMMethod = _localVariable_2;
		if (tmpInvocation instanceof MSuperConstructorInvocation) {
			MSuperConstructorInvocation invocation = (MSuperConstructorInvocation) tmpInvocation;
			if (tmpMMember instanceof MDefinition) {
				MDefinition mMember = (MDefinition) tmpMMember;
				if (tmpMMethod instanceof AbstractMethodDeclaration) {
					AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) tmpMMethod;
					return new Object[] { invocation, mMember, mMethod, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SuperConstructorInvocation_2_2_corematch_blackBFFFFBBB(
			MSuperConstructorInvocation invocation, MDefinition mMember, AbstractMethodDeclaration mMethod,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMethodToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mMethod, MDefinitionToTMember.class, "source")) {
			TMember tMethod = mMethodToTMethod.getTarget();
			if (tMethod != null) {
				for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
					if (!mMemberToTMember.equals(mMethodToTMethod)) {
						TMember tMember = mMemberToTMember.getTarget();
						if (tMember != null) {
							if (!tMember.equals(tMethod)) {
								_result.add(new Object[] { invocation, mMemberToTMember, tMember, mMethodToTMethod,
										tMethod, mMember, mMethod, match });
							}
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SuperConstructorInvocation_2_3_findcontext_blackBBBBBBB(
			MSuperConstructorInvocation invocation, MDefinitionToTMember mMemberToTMember, TMember tMember,
			MDefinitionToTMember mMethodToTMethod, TMember tMethod, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mMemberToTMember.equals(mMethodToTMethod)) {
			if (!tMember.equals(tMethod)) {
				if (mMethod.equals(invocation.getMethod())) {
					if (tMethod.equals(mMethodToTMethod.getTarget())) {
						if (tMember.equals(mMemberToTMember.getTarget())) {
							if (mMethod.equals(mMethodToTMethod.getSource())) {
								if (mMember.equals(mMemberToTMember.getSource())) {
									if (mMember.getMMethodInvocations().contains(invocation)) {
										_result.add(new Object[] { invocation, mMemberToTMember, tMember,
												mMethodToTMethod, tMethod, mMember, mMethod });
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

	public static final Object[] pattern_SuperConstructorInvocation_2_3_findcontext_greenBBBBBBBFFFFFFFF(
			MSuperConstructorInvocation invocation, MDefinitionToTMember mMemberToTMember, TMember tMember,
			MDefinitionToTMember mMethodToTMethod, TMember tMethod, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge invocation__mMethod____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethod__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__tMethod____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__mMethod____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String invocation__mMethod____method_name_prime = "method";
		String mMethod__invocation____usages_name_prime = "usages";
		String mMethodToTMethod__tMethod____target_name_prime = "target";
		String mMemberToTMember__tMember____target_name_prime = "target";
		String mMethodToTMethod__mMethod____source_name_prime = "source";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(mMethod);
		invocation__mMethod____method.setSrc(invocation);
		invocation__mMethod____method.setTrg(mMethod);
		isApplicableMatch.getAllContextElements().add(invocation__mMethod____method);
		mMethod__invocation____usages.setSrc(mMethod);
		mMethod__invocation____usages.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(mMethod__invocation____usages);
		mMethodToTMethod__tMethod____target.setSrc(mMethodToTMethod);
		mMethodToTMethod__tMethod____target.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__tMethod____target);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mMethodToTMethod__mMethod____source.setSrc(mMethodToTMethod);
		mMethodToTMethod__mMethod____source.setTrg(mMethod);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__mMethod____source);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(mMember__invocation____mMethodInvocations);
		invocation__mMethod____method.setName(invocation__mMethod____method_name_prime);
		mMethod__invocation____usages.setName(mMethod__invocation____usages_name_prime);
		mMethodToTMethod__tMethod____target.setName(mMethodToTMethod__tMethod____target_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		mMethodToTMethod__mMethod____source.setName(mMethodToTMethod__mMethod____source_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		return new Object[] { invocation, mMemberToTMember, tMember, mMethodToTMethod, tMethod, mMember, mMethod,
				isApplicableMatch, invocation__mMethod____method, mMethod__invocation____usages,
				mMethodToTMethod__tMethod____target, mMemberToTMember__tMember____target,
				mMethodToTMethod__mMethod____source, mMemberToTMember__mMember____source,
				mMember__invocation____mMethodInvocations };
	}

	public static final Object[] pattern_SuperConstructorInvocation_2_4_solveCSP_bindingFBBBBBBBBB(
			SuperConstructorInvocation _this, IsApplicableMatch isApplicableMatch,
			MSuperConstructorInvocation invocation, MDefinitionToTMember mMemberToTMember, TMember tMember,
			MDefinitionToTMember mMethodToTMethod, TMember tMethod, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, invocation, mMemberToTMember, tMember,
				mMethodToTMethod, tMethod, mMember, mMethod);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, invocation, mMemberToTMember, tMember,
					mMethodToTMethod, tMethod, mMember, mMethod };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SuperConstructorInvocation_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			SuperConstructorInvocation _this, IsApplicableMatch isApplicableMatch,
			MSuperConstructorInvocation invocation, MDefinitionToTMember mMemberToTMember, TMember tMember,
			MDefinitionToTMember mMethodToTMethod, TMember tMethod, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		Object[] result_pattern_SuperConstructorInvocation_2_4_solveCSP_binding = pattern_SuperConstructorInvocation_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, invocation, mMemberToTMember, tMember, mMethodToTMethod, tMethod, mMember,
				mMethod);
		if (result_pattern_SuperConstructorInvocation_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SuperConstructorInvocation_2_4_solveCSP_binding[0];

			Object[] result_pattern_SuperConstructorInvocation_2_4_solveCSP_black = pattern_SuperConstructorInvocation_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_SuperConstructorInvocation_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, invocation, mMemberToTMember, tMember,
						mMethodToTMethod, tMethod, mMember, mMethod };
			}
		}
		return null;
	}

	public static final boolean pattern_SuperConstructorInvocation_2_5_checkCSP_expressionFBB(
			SuperConstructorInvocation _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SuperConstructorInvocation_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SuperConstructorInvocation";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SuperConstructorInvocation_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_10_1_initialbindings_blackBBBBB(
			SuperConstructorInvocation _this, Match match, TMember tMember, TCall tAccess, TMember tMethod) {
		if (!tMember.equals(tMethod)) {
			return new Object[] { _this, match, tMember, tAccess, tMethod };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_10_2_SolveCSP_bindingFBBBBB(
			SuperConstructorInvocation _this, Match match, TMember tMember, TCall tAccess, TMember tMethod) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tMember, tAccess, tMethod);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMember, tAccess, tMethod };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SuperConstructorInvocation_10_2_SolveCSP_bindingAndBlackFBBBBB(
			SuperConstructorInvocation _this, Match match, TMember tMember, TCall tAccess, TMember tMethod) {
		Object[] result_pattern_SuperConstructorInvocation_10_2_SolveCSP_binding = pattern_SuperConstructorInvocation_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tMember, tAccess, tMethod);
		if (result_pattern_SuperConstructorInvocation_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SuperConstructorInvocation_10_2_SolveCSP_binding[0];

			Object[] result_pattern_SuperConstructorInvocation_10_2_SolveCSP_black = pattern_SuperConstructorInvocation_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SuperConstructorInvocation_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tMember, tAccess, tMethod };
			}
		}
		return null;
	}

	public static final boolean pattern_SuperConstructorInvocation_10_3_CheckCSP_expressionFBB(
			SuperConstructorInvocation _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TMember tMember, TCall tAccess, TMember tMethod) {
		if (!tMember.equals(tMethod)) {
			return new Object[] { match, tMember, tAccess, tMethod };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_10_4_collectelementstobetranslated_greenBBBBFFFF(
			Match match, TMember tMember, TCall tAccess, TMember tMethod) {
		EMoflonEdge tMember__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMethod____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethod__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tAccess);
		String tMember__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tMember____tSource_name_prime = "tSource";
		String tAccess__tMethod____tTarget_name_prime = "tTarget";
		String tMethod__tAccess____accessedBy_name_prime = "accessedBy";
		tMember__tAccess____tAccessing.setSrc(tMember);
		tMember__tAccess____tAccessing.setTrg(tAccess);
		match.getToBeTranslatedEdges().add(tMember__tAccess____tAccessing);
		tAccess__tMember____tSource.setSrc(tAccess);
		tAccess__tMember____tSource.setTrg(tMember);
		match.getToBeTranslatedEdges().add(tAccess__tMember____tSource);
		tAccess__tMethod____tTarget.setSrc(tAccess);
		tAccess__tMethod____tTarget.setTrg(tMethod);
		match.getToBeTranslatedEdges().add(tAccess__tMethod____tTarget);
		tMethod__tAccess____accessedBy.setSrc(tMethod);
		tMethod__tAccess____accessedBy.setTrg(tAccess);
		match.getToBeTranslatedEdges().add(tMethod__tAccess____accessedBy);
		tMember__tAccess____tAccessing.setName(tMember__tAccess____tAccessing_name_prime);
		tAccess__tMember____tSource.setName(tAccess__tMember____tSource_name_prime);
		tAccess__tMethod____tTarget.setName(tAccess__tMethod____tTarget_name_prime);
		tMethod__tAccess____accessedBy.setName(tMethod__tAccess____accessedBy_name_prime);
		return new Object[] { match, tMember, tAccess, tMethod, tMember__tAccess____tAccessing,
				tAccess__tMember____tSource, tAccess__tMethod____tTarget, tMethod__tAccess____accessedBy };
	}

	public static final Object[] pattern_SuperConstructorInvocation_10_5_collectcontextelements_blackBBBB(Match match,
			TMember tMember, TCall tAccess, TMember tMethod) {
		if (!tMember.equals(tMethod)) {
			return new Object[] { match, tMember, tAccess, tMethod };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_10_5_collectcontextelements_greenBBB(Match match,
			TMember tMember, TMember tMethod) {
		match.getContextNodes().add(tMember);
		match.getContextNodes().add(tMethod);
		return new Object[] { match, tMember, tMethod };
	}

	public static final void pattern_SuperConstructorInvocation_10_6_registerobjectstomatch_expressionBBBBB(
			SuperConstructorInvocation _this, Match match, TMember tMember, TCall tAccess, TMember tMethod) {
		_this.registerObjectsToMatch_BWD(match, tMember, tAccess, tMethod);

	}

	public static final boolean pattern_SuperConstructorInvocation_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SuperConstructorInvocation_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_3 = isApplicableMatch.getObject("mMethodToTMethod");
		EObject _localVariable_4 = isApplicableMatch.getObject("tMethod");
		EObject _localVariable_5 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_6 = isApplicableMatch.getObject("mMethod");
		EObject tmpMMemberToTMember = _localVariable_0;
		EObject tmpTMember = _localVariable_1;
		EObject tmpTAccess = _localVariable_2;
		EObject tmpMMethodToTMethod = _localVariable_3;
		EObject tmpTMethod = _localVariable_4;
		EObject tmpMMember = _localVariable_5;
		EObject tmpMMethod = _localVariable_6;
		if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				if (tmpTAccess instanceof TCall) {
					TCall tAccess = (TCall) tmpTAccess;
					if (tmpMMethodToTMethod instanceof MDefinitionToTMember) {
						MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) tmpMMethodToTMethod;
						if (tmpTMethod instanceof TMember) {
							TMember tMethod = (TMember) tmpTMethod;
							if (tmpMMember instanceof MDefinition) {
								MDefinition mMember = (MDefinition) tmpMMember;
								if (tmpMMethod instanceof AbstractMethodDeclaration) {
									AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) tmpMMethod;
									return new Object[] { mMemberToTMember, tMember, tAccess, mMethodToTMethod, tMethod,
											mMember, mMethod, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_11_1_performtransformation_blackBBBBBBBFBB(
			MDefinitionToTMember mMemberToTMember, TMember tMember, TCall tAccess,
			MDefinitionToTMember mMethodToTMethod, TMember tMethod, MDefinition mMember,
			AbstractMethodDeclaration mMethod, SuperConstructorInvocation _this, IsApplicableMatch isApplicableMatch) {
		if (!mMemberToTMember.equals(mMethodToTMethod)) {
			if (!tMember.equals(tMethod)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { mMemberToTMember, tMember, tAccess, mMethodToTMethod, tMethod, mMember,
								mMethod, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			SuperConstructorInvocation _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SuperConstructorInvocation_11_1_performtransformation_binding = pattern_SuperConstructorInvocation_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SuperConstructorInvocation_11_1_performtransformation_binding != null) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_SuperConstructorInvocation_11_1_performtransformation_binding[0];
			TMember tMember = (TMember) result_pattern_SuperConstructorInvocation_11_1_performtransformation_binding[1];
			TCall tAccess = (TCall) result_pattern_SuperConstructorInvocation_11_1_performtransformation_binding[2];
			MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) result_pattern_SuperConstructorInvocation_11_1_performtransformation_binding[3];
			TMember tMethod = (TMember) result_pattern_SuperConstructorInvocation_11_1_performtransformation_binding[4];
			MDefinition mMember = (MDefinition) result_pattern_SuperConstructorInvocation_11_1_performtransformation_binding[5];
			AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) result_pattern_SuperConstructorInvocation_11_1_performtransformation_binding[6];

			Object[] result_pattern_SuperConstructorInvocation_11_1_performtransformation_black = pattern_SuperConstructorInvocation_11_1_performtransformation_blackBBBBBBBFBB(
					mMemberToTMember, tMember, tAccess, mMethodToTMethod, tMethod, mMember, mMethod, _this,
					isApplicableMatch);
			if (result_pattern_SuperConstructorInvocation_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SuperConstructorInvocation_11_1_performtransformation_black[7];

				return new Object[] { mMemberToTMember, tMember, tAccess, mMethodToTMethod, tMethod, mMember, mMethod,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_11_1_performtransformation_greenFBBFFB(
			TCall tAccess, MDefinition mMember, AbstractMethodDeclaration mMethod) {
		MSuperConstructorInvocation invocation = ModiscoFactory.eINSTANCE.createMSuperConstructorInvocation();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		AbstractMethodInvocationToTAccess invocationToTAccess = PmFactory.eINSTANCE
				.createAbstractMethodInvocationToTAccess();
		invocation.setMethod(mMethod);
		mMember.getMMethodInvocations().add(invocation);
		mFlowElementToTFlowElement.setTarget(tAccess);
		mFlowElementToTFlowElement.setSource(invocation);
		invocationToTAccess.setSource(invocation);
		invocationToTAccess.setTarget(tAccess);
		return new Object[] { invocation, tAccess, mMember, mFlowElementToTFlowElement, invocationToTAccess, mMethod };
	}

	public static final Object[] pattern_SuperConstructorInvocation_11_2_collecttranslatedelements_blackBBBB(
			MSuperConstructorInvocation invocation, TCall tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		return new Object[] { invocation, tAccess, mFlowElementToTFlowElement, invocationToTAccess };
	}

	public static final Object[] pattern_SuperConstructorInvocation_11_2_collecttranslatedelements_greenFBBBB(
			MSuperConstructorInvocation invocation, TCall tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(invocation);
		ruleresult.getTranslatedElements().add(tAccess);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(invocationToTAccess);
		return new Object[] { ruleresult, invocation, tAccess, mFlowElementToTFlowElement, invocationToTAccess };
	}

	public static final Object[] pattern_SuperConstructorInvocation_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject invocation, EObject mMemberToTMember, EObject tMember,
			EObject tAccess, EObject mMethodToTMethod, EObject tMethod, EObject mMember,
			EObject mFlowElementToTFlowElement, EObject invocationToTAccess, EObject mMethod) {
		if (!invocation.equals(mMemberToTMember)) {
			if (!invocation.equals(tMember)) {
				if (!invocation.equals(tAccess)) {
					if (!invocation.equals(mMethodToTMethod)) {
						if (!invocation.equals(tMethod)) {
							if (!invocation.equals(mMember)) {
								if (!invocation.equals(mFlowElementToTFlowElement)) {
									if (!invocation.equals(invocationToTAccess)) {
										if (!invocation.equals(mMethod)) {
											if (!mMemberToTMember.equals(tMember)) {
												if (!mMemberToTMember.equals(tAccess)) {
													if (!mMemberToTMember.equals(mMethodToTMethod)) {
														if (!mMemberToTMember.equals(tMethod)) {
															if (!mMemberToTMember.equals(mMethod)) {
																if (!tMember.equals(tMethod)) {
																	if (!tAccess.equals(tMember)) {
																		if (!tAccess.equals(tMethod)) {
																			if (!mMethodToTMethod.equals(tMember)) {
																				if (!mMethodToTMethod.equals(tAccess)) {
																					if (!mMethodToTMethod
																							.equals(tMethod)) {
																						if (!mMember.equals(
																								mMemberToTMember)) {
																							if (!mMember
																									.equals(tMember)) {
																								if (!mMember.equals(
																										tAccess)) {
																									if (!mMember.equals(
																											mMethodToTMethod)) {
																										if (!mMember
																												.equals(tMethod)) {
																											if (!mMember
																													.equals(mMethod)) {
																												if (!mFlowElementToTFlowElement
																														.equals(mMemberToTMember)) {
																													if (!mFlowElementToTFlowElement
																															.equals(tMember)) {
																														if (!mFlowElementToTFlowElement
																																.equals(tAccess)) {
																															if (!mFlowElementToTFlowElement
																																	.equals(mMethodToTMethod)) {
																																if (!mFlowElementToTFlowElement
																																		.equals(tMethod)) {
																																	if (!mFlowElementToTFlowElement
																																			.equals(mMember)) {
																																		if (!mFlowElementToTFlowElement
																																				.equals(mMethod)) {
																																			if (!invocationToTAccess
																																					.equals(mMemberToTMember)) {
																																				if (!invocationToTAccess
																																						.equals(tMember)) {
																																					if (!invocationToTAccess
																																							.equals(tAccess)) {
																																						if (!invocationToTAccess
																																								.equals(mMethodToTMethod)) {
																																							if (!invocationToTAccess
																																									.equals(tMethod)) {
																																								if (!invocationToTAccess
																																										.equals(mMember)) {
																																									if (!invocationToTAccess
																																											.equals(mFlowElementToTFlowElement)) {
																																										if (!invocationToTAccess
																																												.equals(mMethod)) {
																																											if (!mMethod
																																													.equals(tMember)) {
																																												if (!mMethod
																																														.equals(tAccess)) {
																																													if (!mMethod
																																															.equals(mMethodToTMethod)) {
																																														if (!mMethod
																																																.equals(tMethod)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	invocation,
																																																	mMemberToTMember,
																																																	tMember,
																																																	tAccess,
																																																	mMethodToTMethod,
																																																	tMethod,
																																																	mMember,
																																																	mFlowElementToTFlowElement,
																																																	invocationToTAccess,
																																																	mMethod };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SuperConstructorInvocation_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject invocation, EObject tMember, EObject tAccess, EObject tMethod,
			EObject mMember, EObject mFlowElementToTFlowElement, EObject invocationToTAccess, EObject mMethod) {
		EMoflonEdge invocation__mMethod____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethod__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMethod____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethod__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SuperConstructorInvocation";
		String invocation__mMethod____method_name_prime = "method";
		String mMethod__invocation____usages_name_prime = "usages";
		String tMember__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tMember____tSource_name_prime = "tSource";
		String mFlowElementToTFlowElement__tAccess____target_name_prime = "target";
		String invocationToTAccess__invocation____source_name_prime = "source";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		String mFlowElementToTFlowElement__invocation____source_name_prime = "source";
		String tAccess__tMethod____tTarget_name_prime = "tTarget";
		String tMethod__tAccess____accessedBy_name_prime = "accessedBy";
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		invocation__mMethod____method.setSrc(invocation);
		invocation__mMethod____method.setTrg(mMethod);
		ruleresult.getCreatedEdges().add(invocation__mMethod____method);
		mMethod__invocation____usages.setSrc(mMethod);
		mMethod__invocation____usages.setTrg(invocation);
		ruleresult.getCreatedEdges().add(mMethod__invocation____usages);
		tMember__tAccess____tAccessing.setSrc(tMember);
		tMember__tAccess____tAccessing.setTrg(tAccess);
		ruleresult.getTranslatedEdges().add(tMember__tAccess____tAccessing);
		tAccess__tMember____tSource.setSrc(tAccess);
		tAccess__tMember____tSource.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tAccess__tMember____tSource);
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
		tAccess__tMethod____tTarget.setSrc(tAccess);
		tAccess__tMethod____tTarget.setTrg(tMethod);
		ruleresult.getTranslatedEdges().add(tAccess__tMethod____tTarget);
		tMethod__tAccess____accessedBy.setSrc(tMethod);
		tMethod__tAccess____accessedBy.setTrg(tAccess);
		ruleresult.getTranslatedEdges().add(tMethod__tAccess____accessedBy);
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		ruleresult.getCreatedEdges().add(mMember__invocation____mMethodInvocations);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		invocation__mMethod____method.setName(invocation__mMethod____method_name_prime);
		mMethod__invocation____usages.setName(mMethod__invocation____usages_name_prime);
		tMember__tAccess____tAccessing.setName(tMember__tAccess____tAccessing_name_prime);
		tAccess__tMember____tSource.setName(tAccess__tMember____tSource_name_prime);
		mFlowElementToTFlowElement__tAccess____target.setName(mFlowElementToTFlowElement__tAccess____target_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		mFlowElementToTFlowElement__invocation____source
				.setName(mFlowElementToTFlowElement__invocation____source_name_prime);
		tAccess__tMethod____tTarget.setName(tAccess__tMethod____tTarget_name_prime);
		tMethod__tAccess____accessedBy.setName(tMethod__tAccess____accessedBy_name_prime);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		return new Object[] { ruleresult, invocation, tMember, tAccess, tMethod, mMember, mFlowElementToTFlowElement,
				invocationToTAccess, mMethod, invocation__mMethod____method, mMethod__invocation____usages,
				tMember__tAccess____tAccessing, tAccess__tMember____tSource,
				mFlowElementToTFlowElement__tAccess____target, invocationToTAccess__invocation____source,
				invocationToTAccess__tAccess____target, mFlowElementToTFlowElement__invocation____source,
				tAccess__tMethod____tTarget, tMethod__tAccess____accessedBy,
				mMember__invocation____mMethodInvocations };
	}

	public static final void pattern_SuperConstructorInvocation_11_5_registerobjects_expressionBBBBBBBBBBBB(
			SuperConstructorInvocation _this, PerformRuleResult ruleresult, EObject invocation,
			EObject mMemberToTMember, EObject tMember, EObject tAccess, EObject mMethodToTMethod, EObject tMethod,
			EObject mMember, EObject mFlowElementToTFlowElement, EObject invocationToTAccess, EObject mMethod) {
		_this.registerObjects_BWD(ruleresult, invocation, mMemberToTMember, tMember, tAccess, mMethodToTMethod, tMethod,
				mMember, mFlowElementToTFlowElement, invocationToTAccess, mMethod);

	}

	public static final PerformRuleResult pattern_SuperConstructorInvocation_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_12_1_preparereturnvalue_bindingFB(
			SuperConstructorInvocation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_12_1_preparereturnvalue_blackFBB(EClass eClass,
			SuperConstructorInvocation _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_12_1_preparereturnvalue_bindingAndBlackFFB(
			SuperConstructorInvocation _this) {
		Object[] result_pattern_SuperConstructorInvocation_12_1_preparereturnvalue_binding = pattern_SuperConstructorInvocation_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SuperConstructorInvocation_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SuperConstructorInvocation_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SuperConstructorInvocation_12_1_preparereturnvalue_black = pattern_SuperConstructorInvocation_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SuperConstructorInvocation_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SuperConstructorInvocation_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SuperConstructorInvocation";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SuperConstructorInvocation_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tMember");
		EObject _localVariable_1 = match.getObject("tAccess");
		EObject _localVariable_2 = match.getObject("tMethod");
		EObject tmpTMember = _localVariable_0;
		EObject tmpTAccess = _localVariable_1;
		EObject tmpTMethod = _localVariable_2;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpTAccess instanceof TCall) {
				TCall tAccess = (TCall) tmpTAccess;
				if (tmpTMethod instanceof TMember) {
					TMember tMethod = (TMember) tmpTMethod;
					return new Object[] { tMember, tAccess, tMethod, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SuperConstructorInvocation_12_2_corematch_blackFBBFBFFB(
			TMember tMember, TCall tAccess, TMember tMethod, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tMember.equals(tMethod)) {
			for (MDefinitionToTMember mMethodToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tMethod, MDefinitionToTMember.class, "target")) {
				BodyDeclaration tmpMMethod = mMethodToTMethod.getSource();
				if (tmpMMethod instanceof AbstractMethodDeclaration) {
					AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) tmpMMethod;
					for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
						if (!mMemberToTMember.equals(mMethodToTMethod)) {
							BodyDeclaration tmpMMember = mMemberToTMember.getSource();
							if (tmpMMember instanceof MDefinition) {
								MDefinition mMember = (MDefinition) tmpMMember;
								_result.add(new Object[] { mMemberToTMember, tMember, tAccess, mMethodToTMethod,
										tMethod, mMember, mMethod, match });
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SuperConstructorInvocation_12_3_findcontext_blackBBBBBBB(
			MDefinitionToTMember mMemberToTMember, TMember tMember, TCall tAccess,
			MDefinitionToTMember mMethodToTMethod, TMember tMethod, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mMemberToTMember.equals(mMethodToTMethod)) {
			if (!tMember.equals(tMethod)) {
				if (tMethod.equals(mMethodToTMethod.getTarget())) {
					if (tMember.getTAccessing().contains(tAccess)) {
						if (tMember.equals(mMemberToTMember.getTarget())) {
							if (mMethod.equals(mMethodToTMethod.getSource())) {
								if (mMember.equals(mMemberToTMember.getSource())) {
									if (tMethod.equals(tAccess.getTTarget())) {
										_result.add(new Object[] { mMemberToTMember, tMember, tAccess, mMethodToTMethod,
												tMethod, mMember, mMethod });
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

	public static final Object[] pattern_SuperConstructorInvocation_12_3_findcontext_greenBBBBBBBFFFFFFFFF(
			MDefinitionToTMember mMemberToTMember, TMember tMember, TCall tAccess,
			MDefinitionToTMember mMethodToTMethod, TMember tMethod, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMethodToTMethod__tMethod____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTMethod__mMethod____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMethod____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethod__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMethodToTMethod__tMethod____target_name_prime = "target";
		String tMember__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tMember____tSource_name_prime = "tSource";
		String mMemberToTMember__tMember____target_name_prime = "target";
		String mMethodToTMethod__mMethod____source_name_prime = "source";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String tAccess__tMethod____tTarget_name_prime = "tTarget";
		String tMethod__tAccess____accessedBy_name_prime = "accessedBy";
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod);
		isApplicableMatch.getAllContextElements().add(tMethod);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(mMethod);
		mMethodToTMethod__tMethod____target.setSrc(mMethodToTMethod);
		mMethodToTMethod__tMethod____target.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__tMethod____target);
		tMember__tAccess____tAccessing.setSrc(tMember);
		tMember__tAccess____tAccessing.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tMember__tAccess____tAccessing);
		tAccess__tMember____tSource.setSrc(tAccess);
		tAccess__tMember____tSource.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess__tMember____tSource);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mMethodToTMethod__mMethod____source.setSrc(mMethodToTMethod);
		mMethodToTMethod__mMethod____source.setTrg(mMethod);
		isApplicableMatch.getAllContextElements().add(mMethodToTMethod__mMethod____source);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		tAccess__tMethod____tTarget.setSrc(tAccess);
		tAccess__tMethod____tTarget.setTrg(tMethod);
		isApplicableMatch.getAllContextElements().add(tAccess__tMethod____tTarget);
		tMethod__tAccess____accessedBy.setSrc(tMethod);
		tMethod__tAccess____accessedBy.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tMethod__tAccess____accessedBy);
		mMethodToTMethod__tMethod____target.setName(mMethodToTMethod__tMethod____target_name_prime);
		tMember__tAccess____tAccessing.setName(tMember__tAccess____tAccessing_name_prime);
		tAccess__tMember____tSource.setName(tAccess__tMember____tSource_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		mMethodToTMethod__mMethod____source.setName(mMethodToTMethod__mMethod____source_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		tAccess__tMethod____tTarget.setName(tAccess__tMethod____tTarget_name_prime);
		tMethod__tAccess____accessedBy.setName(tMethod__tAccess____accessedBy_name_prime);
		return new Object[] { mMemberToTMember, tMember, tAccess, mMethodToTMethod, tMethod, mMember, mMethod,
				isApplicableMatch, mMethodToTMethod__tMethod____target, tMember__tAccess____tAccessing,
				tAccess__tMember____tSource, mMemberToTMember__tMember____target, mMethodToTMethod__mMethod____source,
				mMemberToTMember__mMember____source, tAccess__tMethod____tTarget, tMethod__tAccess____accessedBy };
	}

	public static final Object[] pattern_SuperConstructorInvocation_12_4_solveCSP_bindingFBBBBBBBBB(
			SuperConstructorInvocation _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TCall tAccess,
			MDefinitionToTMember mMethodToTMethod, TMember tMethod, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mMemberToTMember, tMember, tAccess,
				mMethodToTMethod, tMethod, mMember, mMethod);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, tMember, tAccess, mMethodToTMethod,
					tMethod, mMember, mMethod };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SuperConstructorInvocation_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			SuperConstructorInvocation _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember mMemberToTMember, TMember tMember, TCall tAccess,
			MDefinitionToTMember mMethodToTMethod, TMember tMethod, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		Object[] result_pattern_SuperConstructorInvocation_12_4_solveCSP_binding = pattern_SuperConstructorInvocation_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, tMember, tAccess, mMethodToTMethod, tMethod, mMember,
				mMethod);
		if (result_pattern_SuperConstructorInvocation_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SuperConstructorInvocation_12_4_solveCSP_binding[0];

			Object[] result_pattern_SuperConstructorInvocation_12_4_solveCSP_black = pattern_SuperConstructorInvocation_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_SuperConstructorInvocation_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, tMember, tAccess,
						mMethodToTMethod, tMethod, mMember, mMethod };
			}
		}
		return null;
	}

	public static final boolean pattern_SuperConstructorInvocation_12_5_checkCSP_expressionFBB(
			SuperConstructorInvocation _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SuperConstructorInvocation_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SuperConstructorInvocation";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SuperConstructorInvocation_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_20_1_preparereturnvalue_bindingFB(
			SuperConstructorInvocation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SuperConstructorInvocation _this) {
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

	public static final Object[] pattern_SuperConstructorInvocation_20_1_preparereturnvalue_bindingAndBlackFFBF(
			SuperConstructorInvocation _this) {
		Object[] result_pattern_SuperConstructorInvocation_20_1_preparereturnvalue_binding = pattern_SuperConstructorInvocation_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SuperConstructorInvocation_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SuperConstructorInvocation_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SuperConstructorInvocation_20_1_preparereturnvalue_black = pattern_SuperConstructorInvocation_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SuperConstructorInvocation_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SuperConstructorInvocation_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SuperConstructorInvocation_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SuperConstructorInvocation_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_tAccessing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMember = _edge_tAccessing.getSrc();
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			EObject tmpTAccess = _edge_tAccessing.getTrg();
			if (tmpTAccess instanceof TCall) {
				TCall tAccess = (TCall) tmpTAccess;
				if (tMember.getTAccessing().contains(tAccess)) {
					TMember tMethod = tAccess.getTTarget();
					if (tMethod != null) {
						if (!tMember.equals(tMethod)) {
							_result.add(new Object[] { tMember, tAccess, tMethod, _edge_tAccessing });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SuperConstructorInvocation_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			SuperConstructorInvocation _this, Match match, TMember tMember, TCall tAccess, TMember tMethod) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tMember, tAccess, tMethod);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SuperConstructorInvocation_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SuperConstructorInvocation _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SuperConstructorInvocation_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_21_1_preparereturnvalue_bindingFB(
			SuperConstructorInvocation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SuperConstructorInvocation _this) {
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

	public static final Object[] pattern_SuperConstructorInvocation_21_1_preparereturnvalue_bindingAndBlackFFBF(
			SuperConstructorInvocation _this) {
		Object[] result_pattern_SuperConstructorInvocation_21_1_preparereturnvalue_binding = pattern_SuperConstructorInvocation_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SuperConstructorInvocation_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SuperConstructorInvocation_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SuperConstructorInvocation_21_1_preparereturnvalue_black = pattern_SuperConstructorInvocation_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SuperConstructorInvocation_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SuperConstructorInvocation_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SuperConstructorInvocation_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SuperConstructorInvocation_21_2_testcorematchandDECs_black_nac_0BB(
			MSuperConstructorInvocation invocation, MDefinition mMember) {
		for (MDefinition __DEC_invocation_mMethodInvocations_638818 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(invocation, MDefinition.class, "mMethodInvocations")) {
			if (!mMember.equals(__DEC_invocation_mMethodInvocations_638818)) {
				return new Object[] { invocation, mMember };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SuperConstructorInvocation_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_method) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInvocation = _edge_method.getSrc();
		if (tmpInvocation instanceof MSuperConstructorInvocation) {
			MSuperConstructorInvocation invocation = (MSuperConstructorInvocation) tmpInvocation;
			EObject tmpMMethod = _edge_method.getTrg();
			if (tmpMMethod instanceof AbstractMethodDeclaration) {
				AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) tmpMMethod;
				if (mMethod.equals(invocation.getMethod())) {
					for (MDefinition mMember : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(invocation, MDefinition.class, "mMethodInvocations")) {
						if (pattern_SuperConstructorInvocation_21_2_testcorematchandDECs_black_nac_0BB(invocation,
								mMember) == null) {
							_result.add(new Object[] { invocation, mMember, mMethod, _edge_method });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SuperConstructorInvocation_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			SuperConstructorInvocation _this, Match match, MSuperConstructorInvocation invocation, MDefinition mMember,
			AbstractMethodDeclaration mMethod) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, invocation, mMember, mMethod);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SuperConstructorInvocation_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SuperConstructorInvocation _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SuperConstructorInvocation_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_24_1_prepare_blackB(
			SuperConstructorInvocation _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SuperConstructorInvocation_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("invocation");
		EObject _localVariable_1 = targetMatch.getObject("tMember");
		EObject _localVariable_2 = targetMatch.getObject("tAccess");
		EObject _localVariable_3 = targetMatch.getObject("tMethod");
		EObject _localVariable_4 = sourceMatch.getObject("mMember");
		EObject _localVariable_5 = sourceMatch.getObject("mMethod");
		EObject tmpInvocation = _localVariable_0;
		EObject tmpTMember = _localVariable_1;
		EObject tmpTAccess = _localVariable_2;
		EObject tmpTMethod = _localVariable_3;
		EObject tmpMMember = _localVariable_4;
		EObject tmpMMethod = _localVariable_5;
		if (tmpInvocation instanceof MSuperConstructorInvocation) {
			MSuperConstructorInvocation invocation = (MSuperConstructorInvocation) tmpInvocation;
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				if (tmpTAccess instanceof TCall) {
					TCall tAccess = (TCall) tmpTAccess;
					if (tmpTMethod instanceof TMember) {
						TMember tMethod = (TMember) tmpTMethod;
						if (tmpMMember instanceof MDefinition) {
							MDefinition mMember = (MDefinition) tmpMMember;
							if (tmpMMethod instanceof AbstractMethodDeclaration) {
								AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) tmpMMethod;
								return new Object[] { invocation, tMember, tAccess, tMethod, mMember, mMethod,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_blackBBBBBBBB(
			MSuperConstructorInvocation invocation, TMember tMember, TCall tAccess, TMember tMethod,
			MDefinition mMember, AbstractMethodDeclaration mMethod, Match sourceMatch, Match targetMatch) {
		if (!tMember.equals(tMethod)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { invocation, tMember, tAccess, tMethod, mMember, mMethod, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_binding = pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_binding != null) {
			MSuperConstructorInvocation invocation = (MSuperConstructorInvocation) result_pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_binding[0];
			TMember tMember = (TMember) result_pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_binding[1];
			TCall tAccess = (TCall) result_pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_binding[2];
			TMember tMethod = (TMember) result_pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_binding[3];
			MDefinition mMember = (MDefinition) result_pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_binding[4];
			AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) result_pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_black = pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_blackBBBBBBBB(
					invocation, tMember, tAccess, tMethod, mMember, mMethod, sourceMatch, targetMatch);
			if (result_pattern_SuperConstructorInvocation_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { invocation, tMember, tAccess, tMethod, mMember, mMethod, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_24_3_solvecsp_bindingFBBBBBBBBB(
			SuperConstructorInvocation _this, MSuperConstructorInvocation invocation, TMember tMember, TCall tAccess,
			TMember tMethod, MDefinition mMember, AbstractMethodDeclaration mMethod, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(invocation, tMember, tAccess, tMethod, mMember, mMethod,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, invocation, tMember, tAccess, tMethod, mMember, mMethod, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SuperConstructorInvocation_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			SuperConstructorInvocation _this, MSuperConstructorInvocation invocation, TMember tMember, TCall tAccess,
			TMember tMethod, MDefinition mMember, AbstractMethodDeclaration mMethod, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_SuperConstructorInvocation_24_3_solvecsp_binding = pattern_SuperConstructorInvocation_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, invocation, tMember, tAccess, tMethod, mMember, mMethod, sourceMatch, targetMatch);
		if (result_pattern_SuperConstructorInvocation_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_SuperConstructorInvocation_24_3_solvecsp_binding[0];

			Object[] result_pattern_SuperConstructorInvocation_24_3_solvecsp_black = pattern_SuperConstructorInvocation_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_SuperConstructorInvocation_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, invocation, tMember, tAccess, tMethod, mMember, mMethod, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_SuperConstructorInvocation_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_SuperConstructorInvocation_24_5_matchcorrcontext_blackFBFBBBBB(
			TMember tMember, TMember tMethod, MDefinition mMember, AbstractMethodDeclaration mMethod, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tMember.equals(tMethod)) {
			if (!sourceMatch.equals(targetMatch)) {
				for (MDefinitionToTMember mMethodToTMethod : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tMethod, MDefinitionToTMember.class, "target")) {
					if (mMethod.equals(mMethodToTMethod.getSource())) {
						for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
							if (!mMemberToTMember.equals(mMethodToTMethod)) {
								if (mMember.equals(mMemberToTMember.getSource())) {
									_result.add(new Object[] { mMemberToTMember, tMember, mMethodToTMethod, tMethod,
											mMember, mMethod, sourceMatch, targetMatch });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_24_5_matchcorrcontext_greenBBBBF(
			MDefinitionToTMember mMemberToTMember, MDefinitionToTMember mMethodToTMethod, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "SuperConstructorInvocation";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mMemberToTMember);
		ccMatch.getAllContextElements().add(mMethodToTMethod);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mMemberToTMember, mMethodToTMethod, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_SuperConstructorInvocation_24_6_createcorrespondence_blackBBBBBBB(
			MSuperConstructorInvocation invocation, TMember tMember, TCall tAccess, TMember tMethod,
			MDefinition mMember, AbstractMethodDeclaration mMethod, CCMatch ccMatch) {
		if (!tMember.equals(tMethod)) {
			return new Object[] { invocation, tMember, tAccess, tMethod, mMember, mMethod, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_24_6_createcorrespondence_greenBBFFB(
			MSuperConstructorInvocation invocation, TCall tAccess, CCMatch ccMatch) {
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

	public static final Object[] pattern_SuperConstructorInvocation_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_SuperConstructorInvocation_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "SuperConstructorInvocation";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_SuperConstructorInvocation_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_27_1_matchtggpattern_black_nac_0BB(
			MSuperConstructorInvocation invocation, MDefinition mMember) {
		for (MDefinition __DEC_invocation_mMethodInvocations_164445 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(invocation, MDefinition.class, "mMethodInvocations")) {
			if (!mMember.equals(__DEC_invocation_mMethodInvocations_164445)) {
				return new Object[] { invocation, mMember };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_27_1_matchtggpattern_blackBBB(
			MSuperConstructorInvocation invocation, MDefinition mMember, AbstractMethodDeclaration mMethod) {
		if (mMethod.equals(invocation.getMethod())) {
			if (mMember.getMMethodInvocations().contains(invocation)) {
				if (pattern_SuperConstructorInvocation_27_1_matchtggpattern_black_nac_0BB(invocation,
						mMember) == null) {
					return new Object[] { invocation, mMember, mMethod };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_SuperConstructorInvocation_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SuperConstructorInvocation_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_28_1_matchtggpattern_blackBBB(TMember tMember,
			TCall tAccess, TMember tMethod) {
		if (!tMember.equals(tMethod)) {
			if (tMember.getTAccessing().contains(tAccess)) {
				if (tMethod.equals(tAccess.getTTarget())) {
					return new Object[] { tMember, tAccess, tMethod };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_SuperConstructorInvocation_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SuperConstructorInvocation_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_29_1_createresult_blackB(
			SuperConstructorInvocation _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SuperConstructorInvocation_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SuperConstructorInvocation_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMemberToTMember) {
		if (ruleResult.getCorrObjects().contains(mMemberToTMember)) {
			return new Object[] { ruleResult, mMemberToTMember };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mMember) {
		if (ruleResult.getSourceObjects().contains(mMember)) {
			return new Object[] { ruleResult, mMember };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMethodToTMethod) {
		if (ruleResult.getCorrObjects().contains(mMethodToTMethod)) {
			return new Object[] { ruleResult, mMethodToTMethod };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TMember tMethod) {
		if (ruleResult.getTargetObjects().contains(tMethod)) {
			return new Object[] { ruleResult, tMethod };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, AbstractMethodDeclaration mMethod) {
		if (ruleResult.getSourceObjects().contains(mMethod)) {
			return new Object[] { ruleResult, mMethod };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SuperConstructorInvocation_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mMemberToTMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mMethodToTMethodList : ruleEntryContainer.getRuleEntryList()) {
				if (!mMemberToTMemberList.equals(mMethodToTMethodList)) {
					for (EObject tmpMMemberToTMember : mMemberToTMemberList.getEntryObjects()) {
						if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
							MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
							BodyDeclaration tmpMMember = mMemberToTMember.getSource();
							if (tmpMMember instanceof MDefinition) {
								MDefinition mMember = (MDefinition) tmpMMember;
								TMember tMember = mMemberToTMember.getTarget();
								if (tMember != null) {
									if (pattern_SuperConstructorInvocation_29_2_isapplicablecore_black_nac_0BB(
											ruleResult, mMemberToTMember) == null) {
										if (pattern_SuperConstructorInvocation_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, mMember) == null) {
											if (pattern_SuperConstructorInvocation_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tMember) == null) {
												for (EObject tmpMMethodToTMethod : mMethodToTMethodList
														.getEntryObjects()) {
													if (tmpMMethodToTMethod instanceof MDefinitionToTMember) {
														MDefinitionToTMember mMethodToTMethod = (MDefinitionToTMember) tmpMMethodToTMethod;
														if (!mMemberToTMember.equals(mMethodToTMethod)) {
															TMember tMethod = mMethodToTMethod.getTarget();
															if (tMethod != null) {
																if (!tMember.equals(tMethod)) {
																	BodyDeclaration tmpMMethod = mMethodToTMethod
																			.getSource();
																	if (tmpMMethod instanceof AbstractMethodDeclaration) {
																		AbstractMethodDeclaration mMethod = (AbstractMethodDeclaration) tmpMMethod;
																		if (pattern_SuperConstructorInvocation_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, mMethodToTMethod) == null) {
																			if (pattern_SuperConstructorInvocation_29_2_isapplicablecore_black_nac_4BB(
																					ruleResult, tMethod) == null) {
																				if (pattern_SuperConstructorInvocation_29_2_isapplicablecore_black_nac_5BB(
																						ruleResult, mMethod) == null) {
																					_result.add(new Object[] {
																							mMemberToTMemberList,
																							mMemberToTMember, mMember,
																							tMember,
																							mMethodToTMethodList,
																							mMethodToTMethod, tMethod,
																							mMethod, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_29_3_solveCSP_bindingFBBBBBBBBB(
			SuperConstructorInvocation _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinitionToTMember mMethodToTMethod,
			TMember tMethod, MDefinition mMember, AbstractMethodDeclaration mMethod,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mMemberToTMember, tMember,
				mMethodToTMethod, tMethod, mMember, mMethod, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, tMember, mMethodToTMethod, tMethod,
					mMember, mMethod, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SuperConstructorInvocation_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			SuperConstructorInvocation _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinitionToTMember mMethodToTMethod,
			TMember tMethod, MDefinition mMember, AbstractMethodDeclaration mMethod,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SuperConstructorInvocation_29_3_solveCSP_binding = pattern_SuperConstructorInvocation_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, tMember, mMethodToTMethod, tMethod, mMember, mMethod,
				ruleResult);
		if (result_pattern_SuperConstructorInvocation_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SuperConstructorInvocation_29_3_solveCSP_binding[0];

			Object[] result_pattern_SuperConstructorInvocation_29_3_solveCSP_black = pattern_SuperConstructorInvocation_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_SuperConstructorInvocation_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, tMember, mMethodToTMethod,
						tMethod, mMember, mMethod, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SuperConstructorInvocation_29_4_checkCSP_expressionFBB(
			SuperConstructorInvocation _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SuperConstructorInvocation_29_5_checknacs_blackBBBBBB(
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinitionToTMember mMethodToTMethod,
			TMember tMethod, MDefinition mMember, AbstractMethodDeclaration mMethod) {
		if (!mMemberToTMember.equals(mMethodToTMethod)) {
			if (!tMember.equals(tMethod)) {
				return new Object[] { mMemberToTMember, tMember, mMethodToTMethod, tMethod, mMember, mMethod };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_29_6_perform_blackBBBBBBB(
			MDefinitionToTMember mMemberToTMember, TMember tMember, MDefinitionToTMember mMethodToTMethod,
			TMember tMethod, MDefinition mMember, AbstractMethodDeclaration mMethod,
			ModelgeneratorRuleResult ruleResult) {
		if (!mMemberToTMember.equals(mMethodToTMethod)) {
			if (!tMember.equals(tMethod)) {
				return new Object[] { mMemberToTMember, tMember, mMethodToTMethod, tMethod, mMember, mMethod,
						ruleResult };
			}
		}
		return null;
	}

	public static final Object[] pattern_SuperConstructorInvocation_29_6_perform_greenFBFBBFFBB(TMember tMember,
			TMember tMethod, MDefinition mMember, AbstractMethodDeclaration mMethod,
			ModelgeneratorRuleResult ruleResult) {
		MSuperConstructorInvocation invocation = ModiscoFactory.eINSTANCE.createMSuperConstructorInvocation();
		TCall tAccess = BasicFactory.eINSTANCE.createTCall();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		AbstractMethodInvocationToTAccess invocationToTAccess = PmFactory.eINSTANCE
				.createAbstractMethodInvocationToTAccess();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		invocation.setMethod(mMethod);
		mMember.getMMethodInvocations().add(invocation);
		ruleResult.getSourceObjects().add(invocation);
		tMember.getTAccessing().add(tAccess);
		tAccess.setTTarget(tMethod);
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
		return new Object[] { invocation, tMember, tAccess, tMethod, mMember, mFlowElementToTFlowElement,
				invocationToTAccess, mMethod, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_SuperConstructorInvocation_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SuperConstructorInvocationImpl
