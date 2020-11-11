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
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodInvocation;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.AbstractMethodInvocationToTAccess;
import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.MethodInvocationRecursive;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TCall;
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
 * An implementation of the model object '<em><b>Method Invocation Recursive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodInvocationRecursiveImpl extends AbstractRuleImpl implements MethodInvocationRecursive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodInvocationRecursiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodInvocationRecursive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodDefinition mMember, MMethodInvocation invocation) {

		Object[] result1_black = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_0_1_initialbindings_blackBBBB(this, match, mMember, invocation);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mMember] = " + mMember + ", " + "[invocation] = " + invocation + ".");
		}

		Object[] result2_bindingAndBlack = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mMember, invocation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mMember] = " + mMember + ", " + "[invocation] = " + invocation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodInvocationRecursiveImpl
					.pattern_MethodInvocationRecursive_0_4_collectelementstobetranslated_blackBBB(match, mMember,
							invocation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mMember] = " + mMember + ", " + "[invocation] = " + invocation + ".");
			}
			MethodInvocationRecursiveImpl
					.pattern_MethodInvocationRecursive_0_4_collectelementstobetranslated_greenBBBFFF(match, mMember,
							invocation);
			//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge invocation__mMember____method = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mMember__invocation____usages = (EMoflonEdge) result4_green[5];

			Object[] result5_black = MethodInvocationRecursiveImpl
					.pattern_MethodInvocationRecursive_0_5_collectcontextelements_blackBBB(match, mMember, invocation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mMember] = " + mMember + ", " + "[invocation] = " + invocation + ".");
			}
			MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_0_5_collectcontextelements_greenBB(match,
					mMember);

			// 
			MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_0_6_registerobjectstomatch_expressionBBBB(
					this, match, mMember, invocation);
			return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_0_7_expressionF();
		} else {
			return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodDefinition mMember = (MMethodDefinition) result1_bindingAndBlack[0];
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[1];
		MMethodInvocation invocation = (MMethodInvocation) result1_bindingAndBlack[2];
		TMethodDefinition tMember = (TMethodDefinition) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_1_1_performtransformation_greenFBFFB(invocation, tMember);
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_green[0];
		TCall tAccess = (TCall) result1_green[2];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[3];

		Object[] result2_black = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_1_2_collecttranslatedelements_blackBBBB(invocationToTAccess,
						invocation, tAccess, mFlowElementToTFlowElement);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[invocationToTAccess] = "
					+ invocationToTAccess + ", " + "[invocation] = " + invocation + ", " + "[tAccess] = " + tAccess
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ".");
		}
		Object[] result2_green = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_1_2_collecttranslatedelements_greenFBBBB(invocationToTAccess,
						invocation, tAccess, mFlowElementToTFlowElement);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, mMember,
						invocationToTAccess, mMemberToTMember, invocation, tAccess, mFlowElementToTFlowElement,
						tMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mMember] = " + mMember + ", " + "[invocationToTAccess] = " + invocationToTAccess + ", "
					+ "[mMemberToTMember] = " + mMemberToTMember + ", " + "[invocation] = " + invocation + ", "
					+ "[tAccess] = " + tAccess + ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement
					+ ", " + "[tMember] = " + tMember + ".");
		}
		MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFFFFF(
				ruleresult, mMember, invocationToTAccess, invocation, tAccess, mFlowElementToTFlowElement, tMember);
		//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge invocation__mMember____method = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mMember__invocation____usages = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tAccess__tMember____tTarget = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tMember__tAccess____accessedBy = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowElementToTFlowElement__invocation____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tAccess____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result3_green[17];

		// 
		// 
		MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_1_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, mMember, invocationToTAccess, mMemberToTMember, invocation, tAccess,
				mFlowElementToTFlowElement, tMember);
		return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodDefinition mMember = (MMethodDefinition) result2_binding[0];
		MMethodInvocation invocation = (MMethodInvocation) result2_binding[1];
		for (Object[] result2_black : MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_2_2_corematch_blackBFBFB(mMember, invocation, match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[1];
			TMethodDefinition tMember = (TMethodDefinition) result2_black[3];
			// ForEach 
			for (Object[] result3_black : MethodInvocationRecursiveImpl
					.pattern_MethodInvocationRecursive_2_3_findcontext_blackBBBB(mMember, mMemberToTMember, invocation,
							tMember)) {
				Object[] result3_green = MethodInvocationRecursiveImpl
						.pattern_MethodInvocationRecursive_2_3_findcontext_greenBBBBFFFFFF(mMember, mMemberToTMember,
								invocation, tMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge invocation__mMember____method = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mMember__invocation____usages = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = MethodInvocationRecursiveImpl
						.pattern_MethodInvocationRecursive_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mMember, mMemberToTMember, invocation, tMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMember] = " + mMember + ", "
							+ "[mMemberToTMember] = " + mMemberToTMember + ", " + "[invocation] = " + invocation + ", "
							+ "[tMember] = " + tMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = MethodInvocationRecursiveImpl
							.pattern_MethodInvocationRecursive_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodDefinition mMember, MMethodInvocation invocation) {
		match.registerObject("mMember", mMember);
		match.registerObject("invocation", invocation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodDefinition mMember, MMethodInvocation invocation) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MMethodDefinition mMember,
			MDefinitionToTMember mMemberToTMember, MMethodInvocation invocation, TMethodDefinition tMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("tMember", tMember);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mMember, EObject invocationToTAccess,
			EObject mMemberToTMember, EObject invocation, EObject tAccess, EObject mFlowElementToTFlowElement,
			EObject tMember) {
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("tMember", tMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("invocation").eClass())
				.equals("modisco.MMethodInvocation.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TCall tAccess, TMethodDefinition tMember) {

		Object[] result1_black = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_10_1_initialbindings_blackBBBB(this, match, tAccess, tMember);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAccess] = " + tAccess + ", " + "[tMember] = " + tMember + ".");
		}

		Object[] result2_bindingAndBlack = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tAccess, tMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAccess] = " + tAccess + ", " + "[tMember] = " + tMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodInvocationRecursiveImpl
					.pattern_MethodInvocationRecursive_10_4_collectelementstobetranslated_blackBBB(match, tAccess,
							tMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAccess] = " + tAccess + ", " + "[tMember] = " + tMember + ".");
			}
			MethodInvocationRecursiveImpl
					.pattern_MethodInvocationRecursive_10_4_collectelementstobetranslated_greenBBBFFFF(match, tAccess,
							tMember);
			//nothing EMoflonEdge tAccess__tMember____tTarget = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tMember__tAccess____accessedBy = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result4_green[6];

			Object[] result5_black = MethodInvocationRecursiveImpl
					.pattern_MethodInvocationRecursive_10_5_collectcontextelements_blackBBB(match, tAccess, tMember);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAccess] = " + tAccess + ", " + "[tMember] = " + tMember + ".");
			}
			MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_10_5_collectcontextelements_greenBB(match,
					tMember);

			// 
			MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_10_6_registerobjectstomatch_expressionBBBB(
					this, match, tAccess, tMember);
			return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_10_7_expressionF();
		} else {
			return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodDefinition mMember = (MMethodDefinition) result1_bindingAndBlack[0];
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[1];
		TCall tAccess = (TCall) result1_bindingAndBlack[2];
		TMethodDefinition tMember = (TMethodDefinition) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_11_1_performtransformation_greenBFFBF(mMember, tAccess);
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_green[1];
		MMethodInvocation invocation = (MMethodInvocation) result1_green[2];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[4];

		Object[] result2_black = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_11_2_collecttranslatedelements_blackBBBB(invocationToTAccess,
						invocation, tAccess, mFlowElementToTFlowElement);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[invocationToTAccess] = "
					+ invocationToTAccess + ", " + "[invocation] = " + invocation + ", " + "[tAccess] = " + tAccess
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ".");
		}
		Object[] result2_green = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_11_2_collecttranslatedelements_greenFBBBB(invocationToTAccess,
						invocation, tAccess, mFlowElementToTFlowElement);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, mMember,
						invocationToTAccess, mMemberToTMember, invocation, tAccess, mFlowElementToTFlowElement,
						tMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mMember] = " + mMember + ", " + "[invocationToTAccess] = " + invocationToTAccess + ", "
					+ "[mMemberToTMember] = " + mMemberToTMember + ", " + "[invocation] = " + invocation + ", "
					+ "[tAccess] = " + tAccess + ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement
					+ ", " + "[tMember] = " + tMember + ".");
		}
		MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFFFFF(ruleresult, mMember,
						invocationToTAccess, invocation, tAccess, mFlowElementToTFlowElement, tMember);
		//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge invocation__mMember____method = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mMember__invocation____usages = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tAccess__tMember____tTarget = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tMember__tAccess____accessedBy = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowElementToTFlowElement__invocation____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tAccess____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result3_green[17];

		// 
		// 
		MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_11_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, mMember, invocationToTAccess, mMemberToTMember, invocation, tAccess,
				mFlowElementToTFlowElement, tMember);
		return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TCall tAccess = (TCall) result2_binding[0];
		TMethodDefinition tMember = (TMethodDefinition) result2_binding[1];
		for (Object[] result2_black : MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_12_2_corematch_blackFFBBB(tAccess, tMember, match)) {
			MMethodDefinition mMember = (MMethodDefinition) result2_black[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[1];
			// ForEach 
			for (Object[] result3_black : MethodInvocationRecursiveImpl
					.pattern_MethodInvocationRecursive_12_3_findcontext_blackBBBB(mMember, mMemberToTMember, tAccess,
							tMember)) {
				Object[] result3_green = MethodInvocationRecursiveImpl
						.pattern_MethodInvocationRecursive_12_3_findcontext_greenBBBBFFFFFFF(mMember, mMemberToTMember,
								tAccess, tMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge tAccess__tMember____tTarget = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge tMember__tAccess____accessedBy = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tMember__tAccess____tAccessing = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tAccess__tMember____tSource = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = MethodInvocationRecursiveImpl
						.pattern_MethodInvocationRecursive_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mMember, mMemberToTMember, tAccess, tMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMember] = " + mMember + ", "
							+ "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tAccess] = " + tAccess + ", "
							+ "[tMember] = " + tMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = MethodInvocationRecursiveImpl
							.pattern_MethodInvocationRecursive_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TCall tAccess, TMethodDefinition tMember) {
		match.registerObject("tAccess", tAccess);
		match.registerObject("tMember", tMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TCall tAccess, TMethodDefinition tMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodDefinition mMember,
			MDefinitionToTMember mMemberToTMember, TCall tAccess, TMethodDefinition tMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tMember", tMember);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mMember, EObject invocationToTAccess,
			EObject mMemberToTMember, EObject invocation, EObject tAccess, EObject mFlowElementToTFlowElement,
			EObject tMember) {
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("tMember", tMember);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_720(EMoflonEdge _edge_tTarget) {

		Object[] result1_bindingAndBlack = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_20_2_testcorematchandDECs_blackFFB(_edge_tTarget)) {
			TCall tAccess = (TCall) result2_black[0];
			TMethodDefinition tMember = (TMethodDefinition) result2_black[1];
			Object[] result2_green = MethodInvocationRecursiveImpl
					.pattern_MethodInvocationRecursive_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodInvocationRecursiveImpl
					.pattern_MethodInvocationRecursive_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tAccess, tMember)) {
				// 
				if (MethodInvocationRecursiveImpl
						.pattern_MethodInvocationRecursive_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodInvocationRecursiveImpl
							.pattern_MethodInvocationRecursive_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_740(EMoflonEdge _edge_mMethodInvocations) {

		Object[] result1_bindingAndBlack = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_21_2_testcorematchandDECs_blackFFB(_edge_mMethodInvocations)) {
			MMethodDefinition mMember = (MMethodDefinition) result2_black[0];
			MMethodInvocation invocation = (MMethodInvocation) result2_black[1];
			Object[] result2_green = MethodInvocationRecursiveImpl
					.pattern_MethodInvocationRecursive_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodInvocationRecursiveImpl
					.pattern_MethodInvocationRecursive_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, mMember, invocation)) {
				// 
				if (MethodInvocationRecursiveImpl
						.pattern_MethodInvocationRecursive_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodInvocationRecursiveImpl
							.pattern_MethodInvocationRecursive_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodInvocationRecursive");
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
		ruleResult.setRule("MethodInvocationRecursive");
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

		Object[] result1_black = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MMethodDefinition mMember = (MMethodDefinition) result2_bindingAndBlack[0];
		MMethodInvocation invocation = (MMethodInvocation) result2_bindingAndBlack[1];
		TCall tAccess = (TCall) result2_bindingAndBlack[2];
		TMethodDefinition tMember = (TMethodDefinition) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, mMember, invocation,
						tAccess, tMember, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mMember] = " + mMember + ", " + "[invocation] = " + invocation + ", " + "[tAccess] = " + tAccess
					+ ", " + "[tMember] = " + tMember + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodInvocationRecursiveImpl
					.pattern_MethodInvocationRecursive_24_5_matchcorrcontext_blackBFBBB(mMember, tMember, sourceMatch,
							targetMatch)) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result5_black[1];
				Object[] result5_green = MethodInvocationRecursiveImpl
						.pattern_MethodInvocationRecursive_24_5_matchcorrcontext_greenBBBF(mMemberToTMember,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = MethodInvocationRecursiveImpl
						.pattern_MethodInvocationRecursive_24_6_createcorrespondence_blackBBBBB(mMember, invocation,
								tAccess, tMember, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mMember] = " + mMember
							+ ", " + "[invocation] = " + invocation + ", " + "[tAccess] = " + tAccess + ", "
							+ "[tMember] = " + tMember + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_24_6_createcorrespondence_greenFBBFB(
						invocation, tAccess, ccMatch);
				//nothing AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result6_green[0];
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[3];

				Object[] result7_black = MethodInvocationRecursiveImpl
						.pattern_MethodInvocationRecursive_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MMethodDefinition mMember, MMethodInvocation invocation, TCall tAccess,
			TMethodDefinition tMember, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MMethodDefinition mMember, MMethodInvocation invocation) {// 
		Object[] result1_black = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_27_1_matchtggpattern_blackBB(mMember, invocation);
		if (result1_black != null) {
			return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_27_2_expressionF();
		} else {
			return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TCall tAccess, TMethodDefinition tMember) {// 
		Object[] result1_black = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_28_1_matchtggpattern_blackBB(tAccess, tMember);
		if (result1_black != null) {
			return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_28_2_expressionF();
		} else {
			return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember mMemberToTMemberParameter) {

		Object[] result1_black = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodInvocationRecursiveImpl
				.pattern_MethodInvocationRecursive_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mMemberToTMemberList = (RuleEntryList) result2_black[0];
			MMethodDefinition mMember = (MMethodDefinition) result2_black[1];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[2];
			TMethodDefinition tMember = (TMethodDefinition) result2_black[3];

			Object[] result3_bindingAndBlack = MethodInvocationRecursiveImpl
					.pattern_MethodInvocationRecursive_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							mMember, mMemberToTMember, tMember, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMember] = " + mMember + ", "
						+ "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tMember] = " + tMember + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = MethodInvocationRecursiveImpl
						.pattern_MethodInvocationRecursive_29_5_checknacs_blackBBB(mMember, mMemberToTMember, tMember);
				if (result5_black != null) {

					Object[] result6_black = MethodInvocationRecursiveImpl
							.pattern_MethodInvocationRecursive_29_6_perform_blackBBBB(mMember, mMemberToTMember,
									tMember, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mMember] = "
								+ mMember + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tMember] = "
								+ tMember + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_29_6_perform_greenBFFFFBB(mMember,
							tMember, ruleResult);
					//nothing AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result6_green[1];
					//nothing MMethodInvocation invocation = (MMethodInvocation) result6_green[2];
					//nothing TCall tAccess = (TCall) result6_green[3];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return MethodInvocationRecursiveImpl.pattern_MethodInvocationRecursive_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodDefinition mMember,
			MDefinitionToTMember mMemberToTMember, TMethodDefinition tMember, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("tMember", tMember);
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
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPROPRIATE_FWD__MATCH_MMETHODDEFINITION_MMETHODINVOCATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(MMethodInvocation) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODDEFINITION_MMETHODINVOCATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(MMethodInvocation) arguments.get(2));
			return null;
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODDEFINITION_MMETHODINVOCATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(MMethodInvocation) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MMETHODDEFINITION_MDEFINITIONTOTMEMBER_MMETHODINVOCATION_TMETHODDEFINITION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(MDefinitionToTMember) arguments.get(2), (MMethodInvocation) arguments.get(3),
					(TMethodDefinition) arguments.get(4));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPROPRIATE_BWD__MATCH_TCALL_TMETHODDEFINITION:
			return isAppropriate_BWD((Match) arguments.get(0), (TCall) arguments.get(1),
					(TMethodDefinition) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCALL_TMETHODDEFINITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TCall) arguments.get(1),
					(TMethodDefinition) arguments.get(2));
			return null;
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCALL_TMETHODDEFINITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TCall) arguments.get(1),
					(TMethodDefinition) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODDEFINITION_MDEFINITIONTOTMEMBER_TCALL_TMETHODDEFINITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(MDefinitionToTMember) arguments.get(2), (TCall) arguments.get(3),
					(TMethodDefinition) arguments.get(4));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_720__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_720((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_740__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_740((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPLICABLE_SOLVE_CSP_CC__MMETHODDEFINITION_MMETHODINVOCATION_TCALL_TMETHODDEFINITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MMethodDefinition) arguments.get(0), (MMethodInvocation) arguments.get(1),
					(TCall) arguments.get(2), (TMethodDefinition) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___CHECK_DEC_FWD__MMETHODDEFINITION_MMETHODINVOCATION:
			return checkDEC_FWD((MMethodDefinition) arguments.get(0), (MMethodInvocation) arguments.get(1));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___CHECK_DEC_BWD__TCALL_TMETHODDEFINITION:
			return checkDEC_BWD((TCall) arguments.get(0), (TMethodDefinition) arguments.get(1));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODDEFINITION_MDEFINITIONTOTMEMBER_TMETHODDEFINITION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MMethodDefinition) arguments.get(1), (MDefinitionToTMember) arguments.get(2),
					(TMethodDefinition) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.METHOD_INVOCATION_RECURSIVE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodInvocationRecursive_0_1_initialbindings_blackBBBB(
			MethodInvocationRecursive _this, Match match, MMethodDefinition mMember, MMethodInvocation invocation) {
		return new Object[] { _this, match, mMember, invocation };
	}

	public static final Object[] pattern_MethodInvocationRecursive_0_2_SolveCSP_bindingFBBBB(
			MethodInvocationRecursive _this, Match match, MMethodDefinition mMember, MMethodInvocation invocation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mMember, invocation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mMember, invocation };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationRecursive_0_2_SolveCSP_bindingAndBlackFBBBB(
			MethodInvocationRecursive _this, Match match, MMethodDefinition mMember, MMethodInvocation invocation) {
		Object[] result_pattern_MethodInvocationRecursive_0_2_SolveCSP_binding = pattern_MethodInvocationRecursive_0_2_SolveCSP_bindingFBBBB(
				_this, match, mMember, invocation);
		if (result_pattern_MethodInvocationRecursive_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationRecursive_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodInvocationRecursive_0_2_SolveCSP_black = pattern_MethodInvocationRecursive_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationRecursive_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mMember, invocation };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationRecursive_0_3_CheckCSP_expressionFBB(
			MethodInvocationRecursive _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_0_4_collectelementstobetranslated_blackBBB(
			Match match, MMethodDefinition mMember, MMethodInvocation invocation) {
		return new Object[] { match, mMember, invocation };
	}

	public static final Object[] pattern_MethodInvocationRecursive_0_4_collectelementstobetranslated_greenBBBFFF(
			Match match, MMethodDefinition mMember, MMethodInvocation invocation) {
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocation__mMember____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(invocation);
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		String invocation__mMember____method_name_prime = "method";
		String mMember__invocation____usages_name_prime = "usages";
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		match.getToBeTranslatedEdges().add(mMember__invocation____mMethodInvocations);
		invocation__mMember____method.setSrc(invocation);
		invocation__mMember____method.setTrg(mMember);
		match.getToBeTranslatedEdges().add(invocation__mMember____method);
		mMember__invocation____usages.setSrc(mMember);
		mMember__invocation____usages.setTrg(invocation);
		match.getToBeTranslatedEdges().add(mMember__invocation____usages);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		invocation__mMember____method.setName(invocation__mMember____method_name_prime);
		mMember__invocation____usages.setName(mMember__invocation____usages_name_prime);
		return new Object[] { match, mMember, invocation, mMember__invocation____mMethodInvocations,
				invocation__mMember____method, mMember__invocation____usages };
	}

	public static final Object[] pattern_MethodInvocationRecursive_0_5_collectcontextelements_blackBBB(Match match,
			MMethodDefinition mMember, MMethodInvocation invocation) {
		return new Object[] { match, mMember, invocation };
	}

	public static final Object[] pattern_MethodInvocationRecursive_0_5_collectcontextelements_greenBB(Match match,
			MMethodDefinition mMember) {
		match.getContextNodes().add(mMember);
		return new Object[] { match, mMember };
	}

	public static final void pattern_MethodInvocationRecursive_0_6_registerobjectstomatch_expressionBBBB(
			MethodInvocationRecursive _this, Match match, MMethodDefinition mMember, MMethodInvocation invocation) {
		_this.registerObjectsToMatch_FWD(match, mMember, invocation);

	}

	public static final boolean pattern_MethodInvocationRecursive_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationRecursive_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("invocation");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMember");
		EObject tmpMMember = _localVariable_0;
		EObject tmpMMemberToTMember = _localVariable_1;
		EObject tmpInvocation = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		if (tmpMMember instanceof MMethodDefinition) {
			MMethodDefinition mMember = (MMethodDefinition) tmpMMember;
			if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
				if (tmpInvocation instanceof MMethodInvocation) {
					MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
					if (tmpTMember instanceof TMethodDefinition) {
						TMethodDefinition tMember = (TMethodDefinition) tmpTMember;
						return new Object[] { mMember, mMemberToTMember, invocation, tMember, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_1_1_performtransformation_blackBBBBFBB(
			MMethodDefinition mMember, MDefinitionToTMember mMemberToTMember, MMethodInvocation invocation,
			TMethodDefinition tMember, MethodInvocationRecursive _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mMember, mMemberToTMember, invocation, tMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_1_1_performtransformation_bindingAndBlackFFFFFBB(
			MethodInvocationRecursive _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodInvocationRecursive_1_1_performtransformation_binding = pattern_MethodInvocationRecursive_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodInvocationRecursive_1_1_performtransformation_binding != null) {
			MMethodDefinition mMember = (MMethodDefinition) result_pattern_MethodInvocationRecursive_1_1_performtransformation_binding[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_MethodInvocationRecursive_1_1_performtransformation_binding[1];
			MMethodInvocation invocation = (MMethodInvocation) result_pattern_MethodInvocationRecursive_1_1_performtransformation_binding[2];
			TMethodDefinition tMember = (TMethodDefinition) result_pattern_MethodInvocationRecursive_1_1_performtransformation_binding[3];

			Object[] result_pattern_MethodInvocationRecursive_1_1_performtransformation_black = pattern_MethodInvocationRecursive_1_1_performtransformation_blackBBBBFBB(
					mMember, mMemberToTMember, invocation, tMember, _this, isApplicableMatch);
			if (result_pattern_MethodInvocationRecursive_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodInvocationRecursive_1_1_performtransformation_black[4];

				return new Object[] { mMember, mMemberToTMember, invocation, tMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_1_1_performtransformation_greenFBFFB(
			MMethodInvocation invocation, TMethodDefinition tMember) {
		AbstractMethodInvocationToTAccess invocationToTAccess = PmFactory.eINSTANCE
				.createAbstractMethodInvocationToTAccess();
		TCall tAccess = BasicFactory.eINSTANCE.createTCall();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		invocationToTAccess.setSource(invocation);
		invocationToTAccess.setTarget(tAccess);
		tAccess.setTTarget(tMember);
		tMember.getTAccessing().add(tAccess);
		mFlowElementToTFlowElement.setSource(invocation);
		mFlowElementToTFlowElement.setTarget(tAccess);
		return new Object[] { invocationToTAccess, invocation, tAccess, mFlowElementToTFlowElement, tMember };
	}

	public static final Object[] pattern_MethodInvocationRecursive_1_2_collecttranslatedelements_blackBBBB(
			AbstractMethodInvocationToTAccess invocationToTAccess, MMethodInvocation invocation, TCall tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		return new Object[] { invocationToTAccess, invocation, tAccess, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_MethodInvocationRecursive_1_2_collecttranslatedelements_greenFBBBB(
			AbstractMethodInvocationToTAccess invocationToTAccess, MMethodInvocation invocation, TCall tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(invocationToTAccess);
		ruleresult.getTranslatedElements().add(invocation);
		ruleresult.getCreatedElements().add(tAccess);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		return new Object[] { ruleresult, invocationToTAccess, invocation, tAccess, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_MethodInvocationRecursive_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject mMember, EObject invocationToTAccess, EObject mMemberToTMember,
			EObject invocation, EObject tAccess, EObject mFlowElementToTFlowElement, EObject tMember) {
		if (!mMember.equals(mMemberToTMember)) {
			if (!mMember.equals(tAccess)) {
				if (!mMember.equals(tMember)) {
					if (!invocationToTAccess.equals(mMember)) {
						if (!invocationToTAccess.equals(mMemberToTMember)) {
							if (!invocationToTAccess.equals(tAccess)) {
								if (!invocationToTAccess.equals(mFlowElementToTFlowElement)) {
									if (!invocationToTAccess.equals(tMember)) {
										if (!mMemberToTMember.equals(tAccess)) {
											if (!mMemberToTMember.equals(tMember)) {
												if (!invocation.equals(mMember)) {
													if (!invocation.equals(invocationToTAccess)) {
														if (!invocation.equals(mMemberToTMember)) {
															if (!invocation.equals(tAccess)) {
																if (!invocation.equals(mFlowElementToTFlowElement)) {
																	if (!invocation.equals(tMember)) {
																		if (!tAccess.equals(tMember)) {
																			if (!mFlowElementToTFlowElement
																					.equals(mMember)) {
																				if (!mFlowElementToTFlowElement
																						.equals(mMemberToTMember)) {
																					if (!mFlowElementToTFlowElement
																							.equals(tAccess)) {
																						if (!mFlowElementToTFlowElement
																								.equals(tMember)) {
																							return new Object[] {
																									ruleresult, mMember,
																									invocationToTAccess,
																									mMemberToTMember,
																									invocation, tAccess,
																									mFlowElementToTFlowElement,
																									tMember };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodInvocationRecursive_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mMember, EObject invocationToTAccess, EObject invocation,
			EObject tAccess, EObject mFlowElementToTFlowElement, EObject tMember) {
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocation__mMember____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodInvocationRecursive";
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		String invocationToTAccess__invocation____source_name_prime = "source";
		String invocation__mMember____method_name_prime = "method";
		String mMember__invocation____usages_name_prime = "usages";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		String tAccess__tMember____tTarget_name_prime = "tTarget";
		String tMember__tAccess____accessedBy_name_prime = "accessedBy";
		String mFlowElementToTFlowElement__invocation____source_name_prime = "source";
		String mFlowElementToTFlowElement__tAccess____target_name_prime = "target";
		String tMember__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tMember____tSource_name_prime = "tSource";
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		ruleresult.getTranslatedEdges().add(mMember__invocation____mMethodInvocations);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		ruleresult.getCreatedEdges().add(invocationToTAccess__invocation____source);
		invocation__mMember____method.setSrc(invocation);
		invocation__mMember____method.setTrg(mMember);
		ruleresult.getTranslatedEdges().add(invocation__mMember____method);
		mMember__invocation____usages.setSrc(mMember);
		mMember__invocation____usages.setTrg(invocation);
		ruleresult.getTranslatedEdges().add(mMember__invocation____usages);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(invocationToTAccess__tAccess____target);
		tAccess__tMember____tTarget.setSrc(tAccess);
		tAccess__tMember____tTarget.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tAccess__tMember____tTarget);
		tMember__tAccess____accessedBy.setSrc(tMember);
		tMember__tAccess____accessedBy.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(tMember__tAccess____accessedBy);
		mFlowElementToTFlowElement__invocation____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__invocation____source.setTrg(invocation);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__invocation____source);
		mFlowElementToTFlowElement__tAccess____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tAccess____target);
		tMember__tAccess____tAccessing.setSrc(tMember);
		tMember__tAccess____tAccessing.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(tMember__tAccess____tAccessing);
		tAccess__tMember____tSource.setSrc(tAccess);
		tAccess__tMember____tSource.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tAccess__tMember____tSource);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		invocation__mMember____method.setName(invocation__mMember____method_name_prime);
		mMember__invocation____usages.setName(mMember__invocation____usages_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		tAccess__tMember____tTarget.setName(tAccess__tMember____tTarget_name_prime);
		tMember__tAccess____accessedBy.setName(tMember__tAccess____accessedBy_name_prime);
		mFlowElementToTFlowElement__invocation____source
				.setName(mFlowElementToTFlowElement__invocation____source_name_prime);
		mFlowElementToTFlowElement__tAccess____target.setName(mFlowElementToTFlowElement__tAccess____target_name_prime);
		tMember__tAccess____tAccessing.setName(tMember__tAccess____tAccessing_name_prime);
		tAccess__tMember____tSource.setName(tAccess__tMember____tSource_name_prime);
		return new Object[] { ruleresult, mMember, invocationToTAccess, invocation, tAccess, mFlowElementToTFlowElement,
				tMember, mMember__invocation____mMethodInvocations, invocationToTAccess__invocation____source,
				invocation__mMember____method, mMember__invocation____usages, invocationToTAccess__tAccess____target,
				tAccess__tMember____tTarget, tMember__tAccess____accessedBy,
				mFlowElementToTFlowElement__invocation____source, mFlowElementToTFlowElement__tAccess____target,
				tMember__tAccess____tAccessing, tAccess__tMember____tSource };
	}

	public static final void pattern_MethodInvocationRecursive_1_5_registerobjects_expressionBBBBBBBBB(
			MethodInvocationRecursive _this, PerformRuleResult ruleresult, EObject mMember, EObject invocationToTAccess,
			EObject mMemberToTMember, EObject invocation, EObject tAccess, EObject mFlowElementToTFlowElement,
			EObject tMember) {
		_this.registerObjects_FWD(ruleresult, mMember, invocationToTAccess, mMemberToTMember, invocation, tAccess,
				mFlowElementToTFlowElement, tMember);

	}

	public static final PerformRuleResult pattern_MethodInvocationRecursive_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_2_1_preparereturnvalue_bindingFB(
			MethodInvocationRecursive _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodInvocationRecursive _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodInvocationRecursive _this) {
		Object[] result_pattern_MethodInvocationRecursive_2_1_preparereturnvalue_binding = pattern_MethodInvocationRecursive_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationRecursive_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodInvocationRecursive_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationRecursive_2_1_preparereturnvalue_black = pattern_MethodInvocationRecursive_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodInvocationRecursive_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodInvocationRecursive_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodInvocationRecursive";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodInvocationRecursive_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mMember");
		EObject _localVariable_1 = match.getObject("invocation");
		EObject tmpMMember = _localVariable_0;
		EObject tmpInvocation = _localVariable_1;
		if (tmpMMember instanceof MMethodDefinition) {
			MMethodDefinition mMember = (MMethodDefinition) tmpMMember;
			if (tmpInvocation instanceof MMethodInvocation) {
				MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
				return new Object[] { mMember, invocation, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationRecursive_2_2_corematch_blackBFBFB(
			MMethodDefinition mMember, MMethodInvocation invocation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
			TMember tmpTMember = mMemberToTMember.getTarget();
			if (tmpTMember instanceof TMethodDefinition) {
				TMethodDefinition tMember = (TMethodDefinition) tmpTMember;
				_result.add(new Object[] { mMember, mMemberToTMember, invocation, tMember, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationRecursive_2_3_findcontext_blackBBBB(
			MMethodDefinition mMember, MDefinitionToTMember mMemberToTMember, MMethodInvocation invocation,
			TMethodDefinition tMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mMember.equals(mMemberToTMember.getSource())) {
			if (mMember.getMMethodInvocations().contains(invocation)) {
				if (mMember.equals(invocation.getMethod())) {
					if (tMember.equals(mMemberToTMember.getTarget())) {
						_result.add(new Object[] { mMember, mMemberToTMember, invocation, tMember });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_2_3_findcontext_greenBBBBFFFFFF(
			MMethodDefinition mMember, MDefinitionToTMember mMemberToTMember, MMethodInvocation invocation,
			TMethodDefinition tMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocation__mMember____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMemberToTMember__mMember____source_name_prime = "source";
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		String invocation__mMember____method_name_prime = "method";
		String mMember__invocation____usages_name_prime = "usages";
		String mMemberToTMember__tMember____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(tMember);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(mMember__invocation____mMethodInvocations);
		invocation__mMember____method.setSrc(invocation);
		invocation__mMember____method.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(invocation__mMember____method);
		mMember__invocation____usages.setSrc(mMember);
		mMember__invocation____usages.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(mMember__invocation____usages);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		invocation__mMember____method.setName(invocation__mMember____method_name_prime);
		mMember__invocation____usages.setName(mMember__invocation____usages_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		return new Object[] { mMember, mMemberToTMember, invocation, tMember, isApplicableMatch,
				mMemberToTMember__mMember____source, mMember__invocation____mMethodInvocations,
				invocation__mMember____method, mMember__invocation____usages, mMemberToTMember__tMember____target };
	}

	public static final Object[] pattern_MethodInvocationRecursive_2_4_solveCSP_bindingFBBBBBB(
			MethodInvocationRecursive _this, IsApplicableMatch isApplicableMatch, MMethodDefinition mMember,
			MDefinitionToTMember mMemberToTMember, MMethodInvocation invocation, TMethodDefinition tMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mMember, mMemberToTMember, invocation,
				tMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMember, mMemberToTMember, invocation, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationRecursive_2_4_solveCSP_bindingAndBlackFBBBBBB(
			MethodInvocationRecursive _this, IsApplicableMatch isApplicableMatch, MMethodDefinition mMember,
			MDefinitionToTMember mMemberToTMember, MMethodInvocation invocation, TMethodDefinition tMember) {
		Object[] result_pattern_MethodInvocationRecursive_2_4_solveCSP_binding = pattern_MethodInvocationRecursive_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mMember, mMemberToTMember, invocation, tMember);
		if (result_pattern_MethodInvocationRecursive_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationRecursive_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationRecursive_2_4_solveCSP_black = pattern_MethodInvocationRecursive_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationRecursive_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMember, mMemberToTMember, invocation, tMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationRecursive_2_5_checkCSP_expressionFBB(
			MethodInvocationRecursive _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodInvocationRecursive_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodInvocationRecursive";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationRecursive_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_10_1_initialbindings_blackBBBB(
			MethodInvocationRecursive _this, Match match, TCall tAccess, TMethodDefinition tMember) {
		return new Object[] { _this, match, tAccess, tMember };
	}

	public static final Object[] pattern_MethodInvocationRecursive_10_2_SolveCSP_bindingFBBBB(
			MethodInvocationRecursive _this, Match match, TCall tAccess, TMethodDefinition tMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAccess, tMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAccess, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationRecursive_10_2_SolveCSP_bindingAndBlackFBBBB(
			MethodInvocationRecursive _this, Match match, TCall tAccess, TMethodDefinition tMember) {
		Object[] result_pattern_MethodInvocationRecursive_10_2_SolveCSP_binding = pattern_MethodInvocationRecursive_10_2_SolveCSP_bindingFBBBB(
				_this, match, tAccess, tMember);
		if (result_pattern_MethodInvocationRecursive_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationRecursive_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodInvocationRecursive_10_2_SolveCSP_black = pattern_MethodInvocationRecursive_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationRecursive_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAccess, tMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationRecursive_10_3_CheckCSP_expressionFBB(
			MethodInvocationRecursive _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_10_4_collectelementstobetranslated_blackBBB(
			Match match, TCall tAccess, TMethodDefinition tMember) {
		return new Object[] { match, tAccess, tMember };
	}

	public static final Object[] pattern_MethodInvocationRecursive_10_4_collectelementstobetranslated_greenBBBFFFF(
			Match match, TCall tAccess, TMethodDefinition tMember) {
		EMoflonEdge tAccess__tMember____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tAccess);
		String tAccess__tMember____tTarget_name_prime = "tTarget";
		String tMember__tAccess____accessedBy_name_prime = "accessedBy";
		String tMember__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tMember____tSource_name_prime = "tSource";
		tAccess__tMember____tTarget.setSrc(tAccess);
		tAccess__tMember____tTarget.setTrg(tMember);
		match.getToBeTranslatedEdges().add(tAccess__tMember____tTarget);
		tMember__tAccess____accessedBy.setSrc(tMember);
		tMember__tAccess____accessedBy.setTrg(tAccess);
		match.getToBeTranslatedEdges().add(tMember__tAccess____accessedBy);
		tMember__tAccess____tAccessing.setSrc(tMember);
		tMember__tAccess____tAccessing.setTrg(tAccess);
		match.getToBeTranslatedEdges().add(tMember__tAccess____tAccessing);
		tAccess__tMember____tSource.setSrc(tAccess);
		tAccess__tMember____tSource.setTrg(tMember);
		match.getToBeTranslatedEdges().add(tAccess__tMember____tSource);
		tAccess__tMember____tTarget.setName(tAccess__tMember____tTarget_name_prime);
		tMember__tAccess____accessedBy.setName(tMember__tAccess____accessedBy_name_prime);
		tMember__tAccess____tAccessing.setName(tMember__tAccess____tAccessing_name_prime);
		tAccess__tMember____tSource.setName(tAccess__tMember____tSource_name_prime);
		return new Object[] { match, tAccess, tMember, tAccess__tMember____tTarget, tMember__tAccess____accessedBy,
				tMember__tAccess____tAccessing, tAccess__tMember____tSource };
	}

	public static final Object[] pattern_MethodInvocationRecursive_10_5_collectcontextelements_blackBBB(Match match,
			TCall tAccess, TMethodDefinition tMember) {
		return new Object[] { match, tAccess, tMember };
	}

	public static final Object[] pattern_MethodInvocationRecursive_10_5_collectcontextelements_greenBB(Match match,
			TMethodDefinition tMember) {
		match.getContextNodes().add(tMember);
		return new Object[] { match, tMember };
	}

	public static final void pattern_MethodInvocationRecursive_10_6_registerobjectstomatch_expressionBBBB(
			MethodInvocationRecursive _this, Match match, TCall tAccess, TMethodDefinition tMember) {
		_this.registerObjectsToMatch_BWD(match, tAccess, tMember);

	}

	public static final boolean pattern_MethodInvocationRecursive_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationRecursive_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMember");
		EObject tmpMMember = _localVariable_0;
		EObject tmpMMemberToTMember = _localVariable_1;
		EObject tmpTAccess = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		if (tmpMMember instanceof MMethodDefinition) {
			MMethodDefinition mMember = (MMethodDefinition) tmpMMember;
			if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
				if (tmpTAccess instanceof TCall) {
					TCall tAccess = (TCall) tmpTAccess;
					if (tmpTMember instanceof TMethodDefinition) {
						TMethodDefinition tMember = (TMethodDefinition) tmpTMember;
						return new Object[] { mMember, mMemberToTMember, tAccess, tMember, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_11_1_performtransformation_blackBBBBFBB(
			MMethodDefinition mMember, MDefinitionToTMember mMemberToTMember, TCall tAccess, TMethodDefinition tMember,
			MethodInvocationRecursive _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mMember, mMemberToTMember, tAccess, tMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_11_1_performtransformation_bindingAndBlackFFFFFBB(
			MethodInvocationRecursive _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodInvocationRecursive_11_1_performtransformation_binding = pattern_MethodInvocationRecursive_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodInvocationRecursive_11_1_performtransformation_binding != null) {
			MMethodDefinition mMember = (MMethodDefinition) result_pattern_MethodInvocationRecursive_11_1_performtransformation_binding[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_MethodInvocationRecursive_11_1_performtransformation_binding[1];
			TCall tAccess = (TCall) result_pattern_MethodInvocationRecursive_11_1_performtransformation_binding[2];
			TMethodDefinition tMember = (TMethodDefinition) result_pattern_MethodInvocationRecursive_11_1_performtransformation_binding[3];

			Object[] result_pattern_MethodInvocationRecursive_11_1_performtransformation_black = pattern_MethodInvocationRecursive_11_1_performtransformation_blackBBBBFBB(
					mMember, mMemberToTMember, tAccess, tMember, _this, isApplicableMatch);
			if (result_pattern_MethodInvocationRecursive_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodInvocationRecursive_11_1_performtransformation_black[4];

				return new Object[] { mMember, mMemberToTMember, tAccess, tMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_11_1_performtransformation_greenBFFBF(
			MMethodDefinition mMember, TCall tAccess) {
		AbstractMethodInvocationToTAccess invocationToTAccess = PmFactory.eINSTANCE
				.createAbstractMethodInvocationToTAccess();
		MMethodInvocation invocation = ModiscoFactory.eINSTANCE.createMMethodInvocation();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		invocationToTAccess.setTarget(tAccess);
		mMember.getMMethodInvocations().add(invocation);
		invocationToTAccess.setSource(invocation);
		invocation.setMethod(mMember);
		mFlowElementToTFlowElement.setSource(invocation);
		mFlowElementToTFlowElement.setTarget(tAccess);
		return new Object[] { mMember, invocationToTAccess, invocation, tAccess, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_MethodInvocationRecursive_11_2_collecttranslatedelements_blackBBBB(
			AbstractMethodInvocationToTAccess invocationToTAccess, MMethodInvocation invocation, TCall tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		return new Object[] { invocationToTAccess, invocation, tAccess, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_MethodInvocationRecursive_11_2_collecttranslatedelements_greenFBBBB(
			AbstractMethodInvocationToTAccess invocationToTAccess, MMethodInvocation invocation, TCall tAccess,
			MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(invocationToTAccess);
		ruleresult.getCreatedElements().add(invocation);
		ruleresult.getTranslatedElements().add(tAccess);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		return new Object[] { ruleresult, invocationToTAccess, invocation, tAccess, mFlowElementToTFlowElement };
	}

	public static final Object[] pattern_MethodInvocationRecursive_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject mMember, EObject invocationToTAccess, EObject mMemberToTMember,
			EObject invocation, EObject tAccess, EObject mFlowElementToTFlowElement, EObject tMember) {
		if (!mMember.equals(mMemberToTMember)) {
			if (!mMember.equals(tAccess)) {
				if (!mMember.equals(tMember)) {
					if (!invocationToTAccess.equals(mMember)) {
						if (!invocationToTAccess.equals(mMemberToTMember)) {
							if (!invocationToTAccess.equals(tAccess)) {
								if (!invocationToTAccess.equals(mFlowElementToTFlowElement)) {
									if (!invocationToTAccess.equals(tMember)) {
										if (!mMemberToTMember.equals(tAccess)) {
											if (!mMemberToTMember.equals(tMember)) {
												if (!invocation.equals(mMember)) {
													if (!invocation.equals(invocationToTAccess)) {
														if (!invocation.equals(mMemberToTMember)) {
															if (!invocation.equals(tAccess)) {
																if (!invocation.equals(mFlowElementToTFlowElement)) {
																	if (!invocation.equals(tMember)) {
																		if (!tAccess.equals(tMember)) {
																			if (!mFlowElementToTFlowElement
																					.equals(mMember)) {
																				if (!mFlowElementToTFlowElement
																						.equals(mMemberToTMember)) {
																					if (!mFlowElementToTFlowElement
																							.equals(tAccess)) {
																						if (!mFlowElementToTFlowElement
																								.equals(tMember)) {
																							return new Object[] {
																									ruleresult, mMember,
																									invocationToTAccess,
																									mMemberToTMember,
																									invocation, tAccess,
																									mFlowElementToTFlowElement,
																									tMember };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodInvocationRecursive_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mMember, EObject invocationToTAccess, EObject invocation,
			EObject tAccess, EObject mFlowElementToTFlowElement, EObject tMember) {
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocation__mMember____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodInvocationRecursive";
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		String invocationToTAccess__invocation____source_name_prime = "source";
		String invocation__mMember____method_name_prime = "method";
		String mMember__invocation____usages_name_prime = "usages";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		String tAccess__tMember____tTarget_name_prime = "tTarget";
		String tMember__tAccess____accessedBy_name_prime = "accessedBy";
		String mFlowElementToTFlowElement__invocation____source_name_prime = "source";
		String mFlowElementToTFlowElement__tAccess____target_name_prime = "target";
		String tMember__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tMember____tSource_name_prime = "tSource";
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		ruleresult.getCreatedEdges().add(mMember__invocation____mMethodInvocations);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		ruleresult.getCreatedEdges().add(invocationToTAccess__invocation____source);
		invocation__mMember____method.setSrc(invocation);
		invocation__mMember____method.setTrg(mMember);
		ruleresult.getCreatedEdges().add(invocation__mMember____method);
		mMember__invocation____usages.setSrc(mMember);
		mMember__invocation____usages.setTrg(invocation);
		ruleresult.getCreatedEdges().add(mMember__invocation____usages);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(invocationToTAccess__tAccess____target);
		tAccess__tMember____tTarget.setSrc(tAccess);
		tAccess__tMember____tTarget.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tAccess__tMember____tTarget);
		tMember__tAccess____accessedBy.setSrc(tMember);
		tMember__tAccess____accessedBy.setTrg(tAccess);
		ruleresult.getTranslatedEdges().add(tMember__tAccess____accessedBy);
		mFlowElementToTFlowElement__invocation____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__invocation____source.setTrg(invocation);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__invocation____source);
		mFlowElementToTFlowElement__tAccess____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tAccess____target.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tAccess____target);
		tMember__tAccess____tAccessing.setSrc(tMember);
		tMember__tAccess____tAccessing.setTrg(tAccess);
		ruleresult.getTranslatedEdges().add(tMember__tAccess____tAccessing);
		tAccess__tMember____tSource.setSrc(tAccess);
		tAccess__tMember____tSource.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tAccess__tMember____tSource);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		invocation__mMember____method.setName(invocation__mMember____method_name_prime);
		mMember__invocation____usages.setName(mMember__invocation____usages_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		tAccess__tMember____tTarget.setName(tAccess__tMember____tTarget_name_prime);
		tMember__tAccess____accessedBy.setName(tMember__tAccess____accessedBy_name_prime);
		mFlowElementToTFlowElement__invocation____source
				.setName(mFlowElementToTFlowElement__invocation____source_name_prime);
		mFlowElementToTFlowElement__tAccess____target.setName(mFlowElementToTFlowElement__tAccess____target_name_prime);
		tMember__tAccess____tAccessing.setName(tMember__tAccess____tAccessing_name_prime);
		tAccess__tMember____tSource.setName(tAccess__tMember____tSource_name_prime);
		return new Object[] { ruleresult, mMember, invocationToTAccess, invocation, tAccess, mFlowElementToTFlowElement,
				tMember, mMember__invocation____mMethodInvocations, invocationToTAccess__invocation____source,
				invocation__mMember____method, mMember__invocation____usages, invocationToTAccess__tAccess____target,
				tAccess__tMember____tTarget, tMember__tAccess____accessedBy,
				mFlowElementToTFlowElement__invocation____source, mFlowElementToTFlowElement__tAccess____target,
				tMember__tAccess____tAccessing, tAccess__tMember____tSource };
	}

	public static final void pattern_MethodInvocationRecursive_11_5_registerobjects_expressionBBBBBBBBB(
			MethodInvocationRecursive _this, PerformRuleResult ruleresult, EObject mMember, EObject invocationToTAccess,
			EObject mMemberToTMember, EObject invocation, EObject tAccess, EObject mFlowElementToTFlowElement,
			EObject tMember) {
		_this.registerObjects_BWD(ruleresult, mMember, invocationToTAccess, mMemberToTMember, invocation, tAccess,
				mFlowElementToTFlowElement, tMember);

	}

	public static final PerformRuleResult pattern_MethodInvocationRecursive_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_12_1_preparereturnvalue_bindingFB(
			MethodInvocationRecursive _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodInvocationRecursive _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodInvocationRecursive _this) {
		Object[] result_pattern_MethodInvocationRecursive_12_1_preparereturnvalue_binding = pattern_MethodInvocationRecursive_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationRecursive_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodInvocationRecursive_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationRecursive_12_1_preparereturnvalue_black = pattern_MethodInvocationRecursive_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodInvocationRecursive_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodInvocationRecursive_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodInvocationRecursive";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodInvocationRecursive_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAccess");
		EObject _localVariable_1 = match.getObject("tMember");
		EObject tmpTAccess = _localVariable_0;
		EObject tmpTMember = _localVariable_1;
		if (tmpTAccess instanceof TCall) {
			TCall tAccess = (TCall) tmpTAccess;
			if (tmpTMember instanceof TMethodDefinition) {
				TMethodDefinition tMember = (TMethodDefinition) tmpTMember;
				return new Object[] { tAccess, tMember, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationRecursive_12_2_corematch_blackFFBBB(TCall tAccess,
			TMethodDefinition tMember, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
			BodyDeclaration tmpMMember = mMemberToTMember.getSource();
			if (tmpMMember instanceof MMethodDefinition) {
				MMethodDefinition mMember = (MMethodDefinition) tmpMMember;
				_result.add(new Object[] { mMember, mMemberToTMember, tAccess, tMember, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationRecursive_12_3_findcontext_blackBBBB(
			MMethodDefinition mMember, MDefinitionToTMember mMemberToTMember, TCall tAccess,
			TMethodDefinition tMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mMember.equals(mMemberToTMember.getSource())) {
			if (tMember.equals(tAccess.getTTarget())) {
				if (tMember.getTAccessing().contains(tAccess)) {
					if (tMember.equals(mMemberToTMember.getTarget())) {
						_result.add(new Object[] { mMember, mMemberToTMember, tAccess, tMember });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_12_3_findcontext_greenBBBBFFFFFFF(
			MMethodDefinition mMember, MDefinitionToTMember mMemberToTMember, TCall tAccess,
			TMethodDefinition tMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____tAccessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____tSource = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMemberToTMember__mMember____source_name_prime = "source";
		String tAccess__tMember____tTarget_name_prime = "tTarget";
		String tMember__tAccess____accessedBy_name_prime = "accessedBy";
		String tMember__tAccess____tAccessing_name_prime = "tAccessing";
		String tAccess__tMember____tSource_name_prime = "tSource";
		String mMemberToTMember__tMember____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(tMember);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		tAccess__tMember____tTarget.setSrc(tAccess);
		tAccess__tMember____tTarget.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess__tMember____tTarget);
		tMember__tAccess____accessedBy.setSrc(tMember);
		tMember__tAccess____accessedBy.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tMember__tAccess____accessedBy);
		tMember__tAccess____tAccessing.setSrc(tMember);
		tMember__tAccess____tAccessing.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tMember__tAccess____tAccessing);
		tAccess__tMember____tSource.setSrc(tAccess);
		tAccess__tMember____tSource.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess__tMember____tSource);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		tAccess__tMember____tTarget.setName(tAccess__tMember____tTarget_name_prime);
		tMember__tAccess____accessedBy.setName(tMember__tAccess____accessedBy_name_prime);
		tMember__tAccess____tAccessing.setName(tMember__tAccess____tAccessing_name_prime);
		tAccess__tMember____tSource.setName(tAccess__tMember____tSource_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		return new Object[] { mMember, mMemberToTMember, tAccess, tMember, isApplicableMatch,
				mMemberToTMember__mMember____source, tAccess__tMember____tTarget, tMember__tAccess____accessedBy,
				tMember__tAccess____tAccessing, tAccess__tMember____tSource, mMemberToTMember__tMember____target };
	}

	public static final Object[] pattern_MethodInvocationRecursive_12_4_solveCSP_bindingFBBBBBB(
			MethodInvocationRecursive _this, IsApplicableMatch isApplicableMatch, MMethodDefinition mMember,
			MDefinitionToTMember mMemberToTMember, TCall tAccess, TMethodDefinition tMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mMember, mMemberToTMember, tAccess,
				tMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMember, mMemberToTMember, tAccess, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationRecursive_12_4_solveCSP_bindingAndBlackFBBBBBB(
			MethodInvocationRecursive _this, IsApplicableMatch isApplicableMatch, MMethodDefinition mMember,
			MDefinitionToTMember mMemberToTMember, TCall tAccess, TMethodDefinition tMember) {
		Object[] result_pattern_MethodInvocationRecursive_12_4_solveCSP_binding = pattern_MethodInvocationRecursive_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mMember, mMemberToTMember, tAccess, tMember);
		if (result_pattern_MethodInvocationRecursive_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationRecursive_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationRecursive_12_4_solveCSP_black = pattern_MethodInvocationRecursive_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationRecursive_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMember, mMemberToTMember, tAccess, tMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationRecursive_12_5_checkCSP_expressionFBB(
			MethodInvocationRecursive _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodInvocationRecursive_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodInvocationRecursive";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationRecursive_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_20_1_preparereturnvalue_bindingFB(
			MethodInvocationRecursive _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodInvocationRecursive _this) {
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

	public static final Object[] pattern_MethodInvocationRecursive_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodInvocationRecursive _this) {
		Object[] result_pattern_MethodInvocationRecursive_20_1_preparereturnvalue_binding = pattern_MethodInvocationRecursive_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationRecursive_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodInvocationRecursive_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationRecursive_20_1_preparereturnvalue_black = pattern_MethodInvocationRecursive_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodInvocationRecursive_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodInvocationRecursive_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodInvocationRecursive_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodInvocationRecursive_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_tTarget) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAccess = _edge_tTarget.getSrc();
		if (tmpTAccess instanceof TCall) {
			TCall tAccess = (TCall) tmpTAccess;
			EObject tmpTMember = _edge_tTarget.getTrg();
			if (tmpTMember instanceof TMethodDefinition) {
				TMethodDefinition tMember = (TMethodDefinition) tmpTMember;
				if (tMember.equals(tAccess.getTTarget())) {
					if (tMember.getTAccessing().contains(tAccess)) {
						_result.add(new Object[] { tAccess, tMember, _edge_tTarget });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodInvocationRecursive_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodInvocationRecursive _this, Match match, TCall tAccess, TMethodDefinition tMember) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAccess, tMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodInvocationRecursive_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodInvocationRecursive _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodInvocationRecursive_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_21_1_preparereturnvalue_bindingFB(
			MethodInvocationRecursive _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodInvocationRecursive _this) {
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

	public static final Object[] pattern_MethodInvocationRecursive_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodInvocationRecursive _this) {
		Object[] result_pattern_MethodInvocationRecursive_21_1_preparereturnvalue_binding = pattern_MethodInvocationRecursive_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationRecursive_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodInvocationRecursive_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationRecursive_21_1_preparereturnvalue_black = pattern_MethodInvocationRecursive_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodInvocationRecursive_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodInvocationRecursive_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodInvocationRecursive_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodInvocationRecursive_21_2_testcorematchandDECs_black_nac_0B(
			MMethodInvocation invocation) {
		for (AnnotationMemberValuePair __DEC_invocation_value_520962 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(invocation, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { invocation };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_21_2_testcorematchandDECs_black_nac_1BB(
			MMethodInvocation invocation, MMethodDefinition mMember) {
		for (MDefinition __DEC_invocation_mMethodInvocations_413683 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(invocation, MDefinition.class, "mMethodInvocations")) {
			if (!mMember.equals(__DEC_invocation_mMethodInvocations_413683)) {
				return new Object[] { invocation, mMember };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationRecursive_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mMethodInvocations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMMember = _edge_mMethodInvocations.getSrc();
		if (tmpMMember instanceof MMethodDefinition) {
			MMethodDefinition mMember = (MMethodDefinition) tmpMMember;
			EObject tmpInvocation = _edge_mMethodInvocations.getTrg();
			if (tmpInvocation instanceof MMethodInvocation) {
				MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
				if (mMember.getMMethodInvocations().contains(invocation)) {
					if (mMember.equals(invocation.getMethod())) {
						if (pattern_MethodInvocationRecursive_21_2_testcorematchandDECs_black_nac_0B(
								invocation) == null) {
							if (pattern_MethodInvocationRecursive_21_2_testcorematchandDECs_black_nac_1BB(invocation,
									mMember) == null) {
								_result.add(new Object[] { mMember, invocation, _edge_mMethodInvocations });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodInvocationRecursive_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodInvocationRecursive _this, Match match, MMethodDefinition mMember, MMethodInvocation invocation) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mMember, invocation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodInvocationRecursive_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodInvocationRecursive _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodInvocationRecursive_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_24_1_prepare_blackB(
			MethodInvocationRecursive _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodInvocationRecursive_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodInvocationRecursive_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mMember");
		EObject _localVariable_1 = sourceMatch.getObject("invocation");
		EObject _localVariable_2 = targetMatch.getObject("tAccess");
		EObject _localVariable_3 = targetMatch.getObject("tMember");
		EObject tmpMMember = _localVariable_0;
		EObject tmpInvocation = _localVariable_1;
		EObject tmpTAccess = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		if (tmpMMember instanceof MMethodDefinition) {
			MMethodDefinition mMember = (MMethodDefinition) tmpMMember;
			if (tmpInvocation instanceof MMethodInvocation) {
				MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
				if (tmpTAccess instanceof TCall) {
					TCall tAccess = (TCall) tmpTAccess;
					if (tmpTMember instanceof TMethodDefinition) {
						TMethodDefinition tMember = (TMethodDefinition) tmpTMember;
						return new Object[] { mMember, invocation, tAccess, tMember, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_24_2_matchsrctrgcontext_blackBBBBBB(
			MMethodDefinition mMember, MMethodInvocation invocation, TCall tAccess, TMethodDefinition tMember,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mMember, invocation, tAccess, tMember, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodInvocationRecursive_24_2_matchsrctrgcontext_binding = pattern_MethodInvocationRecursive_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_MethodInvocationRecursive_24_2_matchsrctrgcontext_binding != null) {
			MMethodDefinition mMember = (MMethodDefinition) result_pattern_MethodInvocationRecursive_24_2_matchsrctrgcontext_binding[0];
			MMethodInvocation invocation = (MMethodInvocation) result_pattern_MethodInvocationRecursive_24_2_matchsrctrgcontext_binding[1];
			TCall tAccess = (TCall) result_pattern_MethodInvocationRecursive_24_2_matchsrctrgcontext_binding[2];
			TMethodDefinition tMember = (TMethodDefinition) result_pattern_MethodInvocationRecursive_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_MethodInvocationRecursive_24_2_matchsrctrgcontext_black = pattern_MethodInvocationRecursive_24_2_matchsrctrgcontext_blackBBBBBB(
					mMember, invocation, tAccess, tMember, sourceMatch, targetMatch);
			if (result_pattern_MethodInvocationRecursive_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mMember, invocation, tAccess, tMember, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_24_3_solvecsp_bindingFBBBBBBB(
			MethodInvocationRecursive _this, MMethodDefinition mMember, MMethodInvocation invocation, TCall tAccess,
			TMethodDefinition tMember, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(mMember, invocation, tAccess, tMember, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, mMember, invocation, tAccess, tMember, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationRecursive_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			MethodInvocationRecursive _this, MMethodDefinition mMember, MMethodInvocation invocation, TCall tAccess,
			TMethodDefinition tMember, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodInvocationRecursive_24_3_solvecsp_binding = pattern_MethodInvocationRecursive_24_3_solvecsp_bindingFBBBBBBB(
				_this, mMember, invocation, tAccess, tMember, sourceMatch, targetMatch);
		if (result_pattern_MethodInvocationRecursive_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationRecursive_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodInvocationRecursive_24_3_solvecsp_black = pattern_MethodInvocationRecursive_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodInvocationRecursive_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mMember, invocation, tAccess, tMember, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationRecursive_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationRecursive_24_5_matchcorrcontext_blackBFBBB(
			MMethodDefinition mMember, TMethodDefinition tMember, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
				if (tMember.equals(mMemberToTMember.getTarget())) {
					_result.add(new Object[] { mMember, mMemberToTMember, tMember, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_24_5_matchcorrcontext_greenBBBF(
			MDefinitionToTMember mMemberToTMember, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodInvocationRecursive";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mMemberToTMember);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mMemberToTMember, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodInvocationRecursive_24_6_createcorrespondence_blackBBBBB(
			MMethodDefinition mMember, MMethodInvocation invocation, TCall tAccess, TMethodDefinition tMember,
			CCMatch ccMatch) {
		return new Object[] { mMember, invocation, tAccess, tMember, ccMatch };
	}

	public static final Object[] pattern_MethodInvocationRecursive_24_6_createcorrespondence_greenFBBFB(
			MMethodInvocation invocation, TCall tAccess, CCMatch ccMatch) {
		AbstractMethodInvocationToTAccess invocationToTAccess = PmFactory.eINSTANCE
				.createAbstractMethodInvocationToTAccess();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		invocationToTAccess.setSource(invocation);
		invocationToTAccess.setTarget(tAccess);
		ccMatch.getCreateCorr().add(invocationToTAccess);
		mFlowElementToTFlowElement.setSource(invocation);
		mFlowElementToTFlowElement.setTarget(tAccess);
		ccMatch.getCreateCorr().add(mFlowElementToTFlowElement);
		return new Object[] { invocationToTAccess, invocation, tAccess, mFlowElementToTFlowElement, ccMatch };
	}

	public static final Object[] pattern_MethodInvocationRecursive_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodInvocationRecursive_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodInvocationRecursive";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationRecursive_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_27_1_matchtggpattern_black_nac_0B(
			MMethodInvocation invocation) {
		for (AnnotationMemberValuePair __DEC_invocation_value_440918 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(invocation, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { invocation };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_27_1_matchtggpattern_black_nac_1BB(
			MMethodInvocation invocation, MMethodDefinition mMember) {
		for (MDefinition __DEC_invocation_mMethodInvocations_259961 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(invocation, MDefinition.class, "mMethodInvocations")) {
			if (!mMember.equals(__DEC_invocation_mMethodInvocations_259961)) {
				return new Object[] { invocation, mMember };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_27_1_matchtggpattern_blackBB(
			MMethodDefinition mMember, MMethodInvocation invocation) {
		if (mMember.getMMethodInvocations().contains(invocation)) {
			if (mMember.equals(invocation.getMethod())) {
				if (pattern_MethodInvocationRecursive_27_1_matchtggpattern_black_nac_0B(invocation) == null) {
					if (pattern_MethodInvocationRecursive_27_1_matchtggpattern_black_nac_1BB(invocation,
							mMember) == null) {
						return new Object[] { mMember, invocation };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationRecursive_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationRecursive_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_28_1_matchtggpattern_blackBB(TCall tAccess,
			TMethodDefinition tMember) {
		if (tMember.equals(tAccess.getTTarget())) {
			if (tMember.getTAccessing().contains(tAccess)) {
				return new Object[] { tAccess, tMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationRecursive_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationRecursive_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_29_1_createresult_blackB(
			MethodInvocationRecursive _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodInvocationRecursive_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodInvocationRecursive_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MMethodDefinition mMember) {
		if (ruleResult.getSourceObjects().contains(mMember)) {
			return new Object[] { ruleResult, mMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMemberToTMember) {
		if (ruleResult.getCorrObjects().contains(mMemberToTMember)) {
			return new Object[] { ruleResult, mMemberToTMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMethodDefinition tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationRecursive_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mMemberToTMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMMemberToTMember : mMemberToTMemberList.getEntryObjects()) {
				if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
					BodyDeclaration tmpMMember = mMemberToTMember.getSource();
					if (tmpMMember instanceof MMethodDefinition) {
						MMethodDefinition mMember = (MMethodDefinition) tmpMMember;
						TMember tmpTMember = mMemberToTMember.getTarget();
						if (tmpTMember instanceof TMethodDefinition) {
							TMethodDefinition tMember = (TMethodDefinition) tmpTMember;
							if (pattern_MethodInvocationRecursive_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									mMemberToTMember) == null) {
								if (pattern_MethodInvocationRecursive_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										mMember) == null) {
									if (pattern_MethodInvocationRecursive_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, tMember) == null) {
										_result.add(new Object[] { mMemberToTMemberList, mMember, mMemberToTMember,
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

	public static final Object[] pattern_MethodInvocationRecursive_29_3_solveCSP_bindingFBBBBBB(
			MethodInvocationRecursive _this, IsApplicableMatch isApplicableMatch, MMethodDefinition mMember,
			MDefinitionToTMember mMemberToTMember, TMethodDefinition tMember, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mMember, mMemberToTMember, tMember,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMember, mMemberToTMember, tMember, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationRecursive_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationRecursive_29_3_solveCSP_bindingAndBlackFBBBBBB(
			MethodInvocationRecursive _this, IsApplicableMatch isApplicableMatch, MMethodDefinition mMember,
			MDefinitionToTMember mMemberToTMember, TMethodDefinition tMember, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodInvocationRecursive_29_3_solveCSP_binding = pattern_MethodInvocationRecursive_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mMember, mMemberToTMember, tMember, ruleResult);
		if (result_pattern_MethodInvocationRecursive_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationRecursive_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationRecursive_29_3_solveCSP_black = pattern_MethodInvocationRecursive_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationRecursive_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMember, mMemberToTMember, tMember, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationRecursive_29_4_checkCSP_expressionFBB(
			MethodInvocationRecursive _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationRecursive_29_5_checknacs_blackBBB(MMethodDefinition mMember,
			MDefinitionToTMember mMemberToTMember, TMethodDefinition tMember) {
		return new Object[] { mMember, mMemberToTMember, tMember };
	}

	public static final Object[] pattern_MethodInvocationRecursive_29_6_perform_blackBBBB(MMethodDefinition mMember,
			MDefinitionToTMember mMemberToTMember, TMethodDefinition tMember, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mMember, mMemberToTMember, tMember, ruleResult };
	}

	public static final Object[] pattern_MethodInvocationRecursive_29_6_perform_greenBFFFFBB(MMethodDefinition mMember,
			TMethodDefinition tMember, ModelgeneratorRuleResult ruleResult) {
		AbstractMethodInvocationToTAccess invocationToTAccess = PmFactory.eINSTANCE
				.createAbstractMethodInvocationToTAccess();
		MMethodInvocation invocation = ModiscoFactory.eINSTANCE.createMMethodInvocation();
		TCall tAccess = BasicFactory.eINSTANCE.createTCall();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(invocationToTAccess);
		mMember.getMMethodInvocations().add(invocation);
		invocationToTAccess.setSource(invocation);
		invocation.setMethod(mMember);
		ruleResult.getSourceObjects().add(invocation);
		invocationToTAccess.setTarget(tAccess);
		tAccess.setTTarget(tMember);
		tMember.getTAccessing().add(tAccess);
		ruleResult.getTargetObjects().add(tAccess);
		mFlowElementToTFlowElement.setSource(invocation);
		mFlowElementToTFlowElement.setTarget(tAccess);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mMember, invocationToTAccess, invocation, tAccess, mFlowElementToTFlowElement, tMember,
				ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodInvocationRecursive_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodInvocationRecursiveImpl
