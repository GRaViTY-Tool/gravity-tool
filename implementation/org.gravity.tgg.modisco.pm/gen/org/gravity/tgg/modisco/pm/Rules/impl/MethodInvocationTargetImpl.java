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
import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.BodyDeclaration;

import org.gravity.modisco.MDefinition;

import org.gravity.tgg.modisco.pm.AbstractMethodInvocationToTAccess;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;

import org.gravity.tgg.modisco.pm.Rules.MethodInvocationTarget;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.TAccess;
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
 * An implementation of the model object '<em><b>Method Invocation Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodInvocationTargetImpl extends AbstractRuleImpl implements MethodInvocationTarget {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodInvocationTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodInvocationTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember) {

		Object[] result1_black = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_0_1_initialbindings_blackBBBBB(this, match, invocation, mInvokedMember,
						mMember);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[invocation] = " + invocation + ", " + "[mInvokedMember] = "
					+ mInvokedMember + ", " + "[mMember] = " + mMember + ".");
		}

		Object[] result2_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, invocation,
						mInvokedMember, mMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[invocation] = " + invocation + ", " + "[mInvokedMember] = "
					+ mInvokedMember + ", " + "[mMember] = " + mMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodInvocationTargetImpl.pattern_MethodInvocationTarget_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_0_4_collectelementstobetranslated_blackBBBB(match, invocation,
							mInvokedMember, mMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[invocation] = " + invocation + ", " + "[mInvokedMember] = " + mInvokedMember + ", "
						+ "[mMember] = " + mMember + ".");
			}
			MethodInvocationTargetImpl.pattern_MethodInvocationTarget_0_4_collectelementstobetranslated_greenBBBFF(
					match, invocation, mInvokedMember);
			//nothing EMoflonEdge invocation__mInvokedMember____method = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mInvokedMember__invocation____usages = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_0_5_collectcontextelements_blackBBBB(match, invocation,
							mInvokedMember, mMember);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[invocation] = " + invocation + ", " + "[mInvokedMember] = " + mInvokedMember + ", "
						+ "[mMember] = " + mMember + ".");
			}
			MethodInvocationTargetImpl.pattern_MethodInvocationTarget_0_5_collectcontextelements_greenBBBBF(match,
					invocation, mInvokedMember, mMember);
			//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result5_green[4];

			// 
			MethodInvocationTargetImpl.pattern_MethodInvocationTarget_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, invocation, mInvokedMember, mMember);
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_0_7_expressionF();
		} else {
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TCall tAccess = (TCall) result1_bindingAndBlack[0];
		TMethodDefinition tInvokedMember = (TMethodDefinition) result1_bindingAndBlack[1];
		TMember tMember = (TMember) result1_bindingAndBlack[2];
		AbstractMethodInvocation invocation = (AbstractMethodInvocation) result1_bindingAndBlack[3];
		AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) result1_bindingAndBlack[4];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[5];
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[6];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_bindingAndBlack[7];
		MDefinitionToTMember mInvokedMemberToTInvokedMember = (MDefinitionToTMember) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		MethodInvocationTargetImpl.pattern_MethodInvocationTarget_1_1_performtransformation_greenBB(tAccess,
				tInvokedMember);

		Object[] result2_green = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, tAccess,
						tInvokedMember, tMember, invocation, mInvokedMember, mMember, mMemberToTMember,
						invocationToTAccess, mInvokedMemberToTInvokedMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tAccess] = " + tAccess + ", " + "[tInvokedMember] = " + tInvokedMember + ", "
					+ "[tMember] = " + tMember + ", " + "[invocation] = " + invocation + ", " + "[mInvokedMember] = "
					+ mInvokedMember + ", " + "[mMember] = " + mMember + ", " + "[mMemberToTMember] = "
					+ mMemberToTMember + ", " + "[invocationToTAccess] = " + invocationToTAccess + ", "
					+ "[mInvokedMemberToTInvokedMember] = " + mInvokedMemberToTInvokedMember + ".");
		}
		MethodInvocationTargetImpl.pattern_MethodInvocationTarget_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				tAccess, tInvokedMember, invocation, mInvokedMember);
		//nothing EMoflonEdge invocation__mInvokedMember____method = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mInvokedMember__invocation____usages = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tAccess__tInvokedMember____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tInvokedMember__tAccess____accessedBy = (EMoflonEdge) result3_green[8];

		// 
		// 
		MethodInvocationTargetImpl.pattern_MethodInvocationTarget_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember, mMemberToTMember,
				invocationToTAccess, mInvokedMemberToTInvokedMember);
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AbstractMethodInvocation invocation = (AbstractMethodInvocation) result2_binding[0];
		AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) result2_binding[1];
		MDefinition mMember = (MDefinition) result2_binding[2];
		for (Object[] result2_black : MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_2_2_corematch_blackFFFBBBFFFB(invocation, mInvokedMember, mMember,
						match)) {
			TCall tAccess = (TCall) result2_black[0];
			TMethodDefinition tInvokedMember = (TMethodDefinition) result2_black[1];
			TMember tMember = (TMember) result2_black[2];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[6];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[7];
			MDefinitionToTMember mInvokedMemberToTInvokedMember = (MDefinitionToTMember) result2_black[8];
			// ForEach 
			for (Object[] result3_black : MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_2_3_findcontext_blackBBBBBBBBB(tAccess, tInvokedMember, tMember,
							invocation, mInvokedMember, mMember, mMemberToTMember, invocationToTAccess,
							mInvokedMemberToTInvokedMember)) {
				Object[] result3_green = MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(tAccess,
								tInvokedMember, tMember, invocation, mInvokedMember, mMember, mMemberToTMember,
								invocationToTAccess, mInvokedMemberToTInvokedMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge tMember__tAccess____accessing = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tAccess__tMember____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge invocation__mInvokedMember____method = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mInvokedMember__invocation____usages = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mInvokedMemberToTInvokedMember__tInvokedMember____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mInvokedMemberToTInvokedMember__mInvokedMember____source = (EMoflonEdge) result3_green[20];

				Object[] result4_bindingAndBlack = MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, tAccess, tInvokedMember, tMember, invocation, mInvokedMember,
								mMember, mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAccess] = " + tAccess + ", "
							+ "[tInvokedMember] = " + tInvokedMember + ", " + "[tMember] = " + tMember + ", "
							+ "[invocation] = " + invocation + ", " + "[mInvokedMember] = " + mInvokedMember + ", "
							+ "[mMember] = " + mMember + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
							+ "[invocationToTAccess] = " + invocationToTAccess + ", "
							+ "[mInvokedMemberToTInvokedMember] = " + mInvokedMemberToTInvokedMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodInvocationTargetImpl.pattern_MethodInvocationTarget_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodInvocationTargetImpl
							.pattern_MethodInvocationTarget_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodInvocationTargetImpl.pattern_MethodInvocationTarget_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember) {
		match.registerObject("invocation", invocation);
		match.registerObject("mInvokedMember", mInvokedMember);
		match.registerObject("mMember", mMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinitionToTMember mInvokedMemberToTInvokedMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tInvokedMember", tInvokedMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("mInvokedMember", mInvokedMember);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
		isApplicableMatch.registerObject("mInvokedMemberToTInvokedMember", mInvokedMemberToTInvokedMember);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tAccess, EObject tInvokedMember,
			EObject tMember, EObject invocation, EObject mInvokedMember, EObject mMember, EObject mMemberToTMember,
			EObject invocationToTAccess, EObject mInvokedMemberToTInvokedMember) {
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("tInvokedMember", tInvokedMember);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("mInvokedMember", mInvokedMember);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);
		ruleresult.registerObject("mInvokedMemberToTInvokedMember", mInvokedMemberToTInvokedMember);

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
	public boolean isAppropriate_BWD(Match match, TCall tAccess, TMethodDefinition tInvokedMember, TMember tMember) {

		Object[] result1_black = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_10_1_initialbindings_blackBBBBB(this, match, tAccess, tInvokedMember,
						tMember);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAccess] = " + tAccess + ", " + "[tInvokedMember] = "
					+ tInvokedMember + ", " + "[tMember] = " + tMember + ".");
		}

		Object[] result2_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tAccess,
						tInvokedMember, tMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAccess] = " + tAccess + ", " + "[tInvokedMember] = "
					+ tInvokedMember + ", " + "[tMember] = " + tMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodInvocationTargetImpl.pattern_MethodInvocationTarget_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_10_4_collectelementstobetranslated_blackBBBB(match, tAccess,
							tInvokedMember, tMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAccess] = " + tAccess + ", " + "[tInvokedMember] = " + tInvokedMember + ", "
						+ "[tMember] = " + tMember + ".");
			}
			MethodInvocationTargetImpl.pattern_MethodInvocationTarget_10_4_collectelementstobetranslated_greenBBBFF(
					match, tAccess, tInvokedMember);
			//nothing EMoflonEdge tAccess__tInvokedMember____target = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tInvokedMember__tAccess____accessedBy = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_10_5_collectcontextelements_blackBBBB(match, tAccess,
							tInvokedMember, tMember);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAccess] = " + tAccess + ", " + "[tInvokedMember] = " + tInvokedMember + ", "
						+ "[tMember] = " + tMember + ".");
			}
			MethodInvocationTargetImpl.pattern_MethodInvocationTarget_10_5_collectcontextelements_greenBBBBFF(match,
					tAccess, tInvokedMember, tMember);
			//nothing EMoflonEdge tMember__tAccess____accessing = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge tAccess__tMember____source = (EMoflonEdge) result5_green[5];

			// 
			MethodInvocationTargetImpl.pattern_MethodInvocationTarget_10_6_registerobjectstomatch_expressionBBBBB(this,
					match, tAccess, tInvokedMember, tMember);
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_10_7_expressionF();
		} else {
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TCall tAccess = (TCall) result1_bindingAndBlack[0];
		TMethodDefinition tInvokedMember = (TMethodDefinition) result1_bindingAndBlack[1];
		TMember tMember = (TMember) result1_bindingAndBlack[2];
		AbstractMethodInvocation invocation = (AbstractMethodInvocation) result1_bindingAndBlack[3];
		AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) result1_bindingAndBlack[4];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[5];
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[6];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_bindingAndBlack[7];
		MDefinitionToTMember mInvokedMemberToTInvokedMember = (MDefinitionToTMember) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		MethodInvocationTargetImpl.pattern_MethodInvocationTarget_11_1_performtransformation_greenBB(invocation,
				mInvokedMember);

		Object[] result2_green = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, tAccess,
						tInvokedMember, tMember, invocation, mInvokedMember, mMember, mMemberToTMember,
						invocationToTAccess, mInvokedMemberToTInvokedMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tAccess] = " + tAccess + ", " + "[tInvokedMember] = " + tInvokedMember + ", "
					+ "[tMember] = " + tMember + ", " + "[invocation] = " + invocation + ", " + "[mInvokedMember] = "
					+ mInvokedMember + ", " + "[mMember] = " + mMember + ", " + "[mMemberToTMember] = "
					+ mMemberToTMember + ", " + "[invocationToTAccess] = " + invocationToTAccess + ", "
					+ "[mInvokedMemberToTInvokedMember] = " + mInvokedMemberToTInvokedMember + ".");
		}
		MethodInvocationTargetImpl.pattern_MethodInvocationTarget_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				tAccess, tInvokedMember, invocation, mInvokedMember);
		//nothing EMoflonEdge invocation__mInvokedMember____method = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mInvokedMember__invocation____usages = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tAccess__tInvokedMember____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tInvokedMember__tAccess____accessedBy = (EMoflonEdge) result3_green[8];

		// 
		// 
		MethodInvocationTargetImpl.pattern_MethodInvocationTarget_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember, mMemberToTMember,
				invocationToTAccess, mInvokedMemberToTInvokedMember);
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TCall tAccess = (TCall) result2_binding[0];
		TMethodDefinition tInvokedMember = (TMethodDefinition) result2_binding[1];
		TMember tMember = (TMember) result2_binding[2];
		for (Object[] result2_black : MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_12_2_corematch_blackBBBFFFFFFB(tAccess, tInvokedMember, tMember,
						match)) {
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result2_black[3];
			AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) result2_black[4];
			MDefinition mMember = (MDefinition) result2_black[5];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[6];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[7];
			MDefinitionToTMember mInvokedMemberToTInvokedMember = (MDefinitionToTMember) result2_black[8];
			// ForEach 
			for (Object[] result3_black : MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_12_3_findcontext_blackBBBBBBBBB(tAccess, tInvokedMember, tMember,
							invocation, mInvokedMember, mMember, mMemberToTMember, invocationToTAccess,
							mInvokedMemberToTInvokedMember)) {
				Object[] result3_green = MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(tAccess,
								tInvokedMember, tMember, invocation, mInvokedMember, mMember, mMemberToTMember,
								invocationToTAccess, mInvokedMemberToTInvokedMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge tMember__tAccess____accessing = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tAccess__tMember____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tAccess__tInvokedMember____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tInvokedMember__tAccess____accessedBy = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mInvokedMemberToTInvokedMember__tInvokedMember____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mInvokedMemberToTInvokedMember__mInvokedMember____source = (EMoflonEdge) result3_green[20];

				Object[] result4_bindingAndBlack = MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, tAccess, tInvokedMember, tMember, invocation, mInvokedMember,
								mMember, mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAccess] = " + tAccess + ", "
							+ "[tInvokedMember] = " + tInvokedMember + ", " + "[tMember] = " + tMember + ", "
							+ "[invocation] = " + invocation + ", " + "[mInvokedMember] = " + mInvokedMember + ", "
							+ "[mMember] = " + mMember + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
							+ "[invocationToTAccess] = " + invocationToTAccess + ", "
							+ "[mInvokedMemberToTInvokedMember] = " + mInvokedMemberToTInvokedMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodInvocationTargetImpl.pattern_MethodInvocationTarget_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodInvocationTargetImpl
							.pattern_MethodInvocationTarget_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodInvocationTargetImpl.pattern_MethodInvocationTarget_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TCall tAccess, TMethodDefinition tInvokedMember,
			TMember tMember) {
		match.registerObject("tAccess", tAccess);
		match.registerObject("tInvokedMember", tInvokedMember);
		match.registerObject("tMember", tMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TCall tAccess, TMethodDefinition tInvokedMember,
			TMember tMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinitionToTMember mInvokedMemberToTInvokedMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tInvokedMember", tInvokedMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("mInvokedMember", mInvokedMember);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
		isApplicableMatch.registerObject("mInvokedMemberToTInvokedMember", mInvokedMemberToTInvokedMember);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tAccess, EObject tInvokedMember,
			EObject tMember, EObject invocation, EObject mInvokedMember, EObject mMember, EObject mMemberToTMember,
			EObject invocationToTAccess, EObject mInvokedMemberToTInvokedMember) {
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("tInvokedMember", tInvokedMember);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("mInvokedMember", mInvokedMember);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);
		ruleresult.registerObject("mInvokedMemberToTInvokedMember", mInvokedMemberToTInvokedMember);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_2(EMoflonEdge _edge_target) {

		Object[] result1_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_20_2_testcorematchandDECs_blackFFFB(_edge_target)) {
			TCall tAccess = (TCall) result2_black[0];
			TMethodDefinition tInvokedMember = (TMethodDefinition) result2_black[1];
			TMember tMember = (TMember) result2_black[2];
			Object[] result2_green = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tAccess, tInvokedMember, tMember)) {
				// 
				if (MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodInvocationTargetImpl
							.pattern_MethodInvocationTarget_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodInvocationTargetImpl.pattern_MethodInvocationTarget_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(EMoflonEdge _edge_method) {

		Object[] result1_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_21_2_testcorematchandDECs_blackFFFB(_edge_method)) {
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result2_black[0];
			AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) result2_black[1];
			MDefinition mMember = (MDefinition) result2_black[2];
			Object[] result2_green = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, invocation, mInvokedMember, mMember)) {
				// 
				if (MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodInvocationTargetImpl
							.pattern_MethodInvocationTarget_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodInvocationTargetImpl.pattern_MethodInvocationTarget_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodInvocationTarget");
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
		ruleResult.setRule("MethodInvocationTarget");
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

		Object[] result1_black = MethodInvocationTargetImpl.pattern_MethodInvocationTarget_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodInvocationTargetImpl.pattern_MethodInvocationTarget_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TCall tAccess = (TCall) result2_bindingAndBlack[0];
		TMethodDefinition tInvokedMember = (TMethodDefinition) result2_bindingAndBlack[1];
		TMember tMember = (TMember) result2_bindingAndBlack[2];
		AbstractMethodInvocation invocation = (AbstractMethodInvocation) result2_bindingAndBlack[3];
		AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) result2_bindingAndBlack[4];
		MDefinition mMember = (MDefinition) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tAccess, tInvokedMember,
						tMember, invocation, mInvokedMember, mMember, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tAccess] = " + tAccess + ", " + "[tInvokedMember] = " + tInvokedMember + ", " + "[tMember] = "
					+ tMember + ", " + "[invocation] = " + invocation + ", " + "[mInvokedMember] = " + mInvokedMember
					+ ", " + "[mMember] = " + mMember + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodInvocationTargetImpl.pattern_MethodInvocationTarget_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_24_5_matchcorrcontext_blackBBBBBBFFFBB(tAccess, tInvokedMember,
							tMember, invocation, mInvokedMember, mMember, sourceMatch, targetMatch)) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result5_black[6];
				AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result5_black[7];
				MDefinitionToTMember mInvokedMemberToTInvokedMember = (MDefinitionToTMember) result5_black[8];
				Object[] result5_green = MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_24_5_matchcorrcontext_greenBBBBBF(mMemberToTMember,
								invocationToTAccess, mInvokedMemberToTInvokedMember, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[5];

				Object[] result6_black = MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_24_6_createcorrespondence_blackBBBBBBB(tAccess, tInvokedMember,
								tMember, invocation, mInvokedMember, mMember, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAccess] = " + tAccess
							+ ", " + "[tInvokedMember] = " + tInvokedMember + ", " + "[tMember] = " + tMember + ", "
							+ "[invocation] = " + invocation + ", " + "[mInvokedMember] = " + mInvokedMember + ", "
							+ "[mMember] = " + mMember + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodInvocationTargetImpl.pattern_MethodInvocationTarget_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TCall tAccess, TMethodDefinition tInvokedMember, TMember tMember,
			AbstractMethodInvocation invocation, AbstractMethodDeclaration mInvokedMember, MDefinition mMember,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(AbstractMethodInvocation invocation, AbstractMethodDeclaration mInvokedMember,
			MDefinition mMember) {// 
		Object[] result1_black = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_27_1_matchtggpattern_blackBBB(invocation, mInvokedMember, mMember);
		if (result1_black != null) {
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_27_2_expressionF();
		} else {
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TCall tAccess, TMethodDefinition tInvokedMember, TMember tMember) {// 
		Object[] result1_black = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_28_1_matchtggpattern_blackBBB(tAccess, tInvokedMember, tMember);
		if (result1_black != null) {
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_28_2_expressionF();
		} else {
			return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember mMemberToTMemberParameter,
			MDefinitionToTMember mInvokedMemberToTInvokedMemberParameter) {

		Object[] result1_black = MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodInvocationTargetImpl.pattern_MethodInvocationTarget_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodInvocationTargetImpl
				.pattern_MethodInvocationTarget_29_2_isapplicablecore_blackFFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mMemberToTMemberList = (RuleEntryList) result2_black[0];
			TCall tAccess = (TCall) result2_black[1];
			TMember tMember = (TMember) result2_black[2];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[3];
			MDefinition mMember = (MDefinition) result2_black[4];
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result2_black[5];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[6];
			//nothing RuleEntryList mInvokedMemberToTInvokedMemberList = (RuleEntryList) result2_black[7];
			TMethodDefinition tInvokedMember = (TMethodDefinition) result2_black[8];
			MDefinitionToTMember mInvokedMemberToTInvokedMember = (MDefinitionToTMember) result2_black[9];
			AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) result2_black[10];

			Object[] result3_bindingAndBlack = MethodInvocationTargetImpl
					.pattern_MethodInvocationTarget_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
							tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember, mMemberToTMember,
							invocationToTAccess, mInvokedMemberToTInvokedMember, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAccess] = " + tAccess + ", "
						+ "[tInvokedMember] = " + tInvokedMember + ", " + "[tMember] = " + tMember + ", "
						+ "[invocation] = " + invocation + ", " + "[mInvokedMember] = " + mInvokedMember + ", "
						+ "[mMember] = " + mMember + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
						+ "[invocationToTAccess] = " + invocationToTAccess + ", "
						+ "[mInvokedMemberToTInvokedMember] = " + mInvokedMemberToTInvokedMember + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodInvocationTargetImpl.pattern_MethodInvocationTarget_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodInvocationTargetImpl
						.pattern_MethodInvocationTarget_29_5_checknacs_blackBBBBBBBBB(tAccess, tInvokedMember, tMember,
								invocation, mInvokedMember, mMember, mMemberToTMember, invocationToTAccess,
								mInvokedMemberToTInvokedMember);
				if (result5_black != null) {

					Object[] result6_black = MethodInvocationTargetImpl
							.pattern_MethodInvocationTarget_29_6_perform_blackBBBBBBBBBB(tAccess, tInvokedMember,
									tMember, invocation, mInvokedMember, mMember, mMemberToTMember, invocationToTAccess,
									mInvokedMemberToTInvokedMember, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAccess] = "
								+ tAccess + ", " + "[tInvokedMember] = " + tInvokedMember + ", " + "[tMember] = "
								+ tMember + ", " + "[invocation] = " + invocation + ", " + "[mInvokedMember] = "
								+ mInvokedMember + ", " + "[mMember] = " + mMember + ", " + "[mMemberToTMember] = "
								+ mMemberToTMember + ", " + "[invocationToTAccess] = " + invocationToTAccess + ", "
								+ "[mInvokedMemberToTInvokedMember] = " + mInvokedMemberToTInvokedMember + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					MethodInvocationTargetImpl.pattern_MethodInvocationTarget_29_6_perform_greenBBBBB(tAccess,
							tInvokedMember, invocation, mInvokedMember, ruleResult);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationTargetImpl.pattern_MethodInvocationTarget_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess, MDefinitionToTMember mInvokedMemberToTInvokedMember,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tInvokedMember", tInvokedMember);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("mInvokedMember", mInvokedMember);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
		isApplicableMatch.registerObject("mInvokedMemberToTInvokedMember", mInvokedMemberToTInvokedMember);
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
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_FWD__MATCH_ABSTRACTMETHODINVOCATION_ABSTRACTMETHODDECLARATION_MDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (AbstractMethodInvocation) arguments.get(1),
					(AbstractMethodDeclaration) arguments.get(2), (MDefinition) arguments.get(3));
		case RulesPackage.METHOD_INVOCATION_TARGET___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ABSTRACTMETHODINVOCATION_ABSTRACTMETHODDECLARATION_MDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AbstractMethodInvocation) arguments.get(1),
					(AbstractMethodDeclaration) arguments.get(2), (MDefinition) arguments.get(3));
			return null;
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ABSTRACTMETHODINVOCATION_ABSTRACTMETHODDECLARATION_MDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AbstractMethodInvocation) arguments.get(1),
					(AbstractMethodDeclaration) arguments.get(2), (MDefinition) arguments.get(3));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TCALL_TMETHODDEFINITION_TMEMBER_ABSTRACTMETHODINVOCATION_ABSTRACTMETHODDECLARATION_MDEFINITION_MDEFINITIONTOTMEMBER_ABSTRACTMETHODINVOCATIONTOTACCESS_MDEFINITIONTOTMEMBER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TCall) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (TMember) arguments.get(3),
					(AbstractMethodInvocation) arguments.get(4), (AbstractMethodDeclaration) arguments.get(5),
					(MDefinition) arguments.get(6), (MDefinitionToTMember) arguments.get(7),
					(AbstractMethodInvocationToTAccess) arguments.get(8), (MDefinitionToTMember) arguments.get(9));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.METHOD_INVOCATION_TARGET___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_BWD__MATCH_TCALL_TMETHODDEFINITION_TMEMBER:
			return isAppropriate_BWD((Match) arguments.get(0), (TCall) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (TMember) arguments.get(3));
		case RulesPackage.METHOD_INVOCATION_TARGET___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCALL_TMETHODDEFINITION_TMEMBER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TCall) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (TMember) arguments.get(3));
			return null;
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCALL_TMETHODDEFINITION_TMEMBER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TCall) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (TMember) arguments.get(3));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCALL_TMETHODDEFINITION_TMEMBER_ABSTRACTMETHODINVOCATION_ABSTRACTMETHODDECLARATION_MDEFINITION_MDEFINITIONTOTMEMBER_ABSTRACTMETHODINVOCATIONTOTACCESS_MDEFINITIONTOTMEMBER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TCall) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (TMember) arguments.get(3),
					(AbstractMethodInvocation) arguments.get(4), (AbstractMethodDeclaration) arguments.get(5),
					(MDefinition) arguments.get(6), (MDefinitionToTMember) arguments.get(7),
					(AbstractMethodInvocationToTAccess) arguments.get(8), (MDefinitionToTMember) arguments.get(9));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.METHOD_INVOCATION_TARGET___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_2((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_SOLVE_CSP_CC__TCALL_TMETHODDEFINITION_TMEMBER_ABSTRACTMETHODINVOCATION_ABSTRACTMETHODDECLARATION_MDEFINITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TCall) arguments.get(0), (TMethodDefinition) arguments.get(1),
					(TMember) arguments.get(2), (AbstractMethodInvocation) arguments.get(3),
					(AbstractMethodDeclaration) arguments.get(4), (MDefinition) arguments.get(5),
					(Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.METHOD_INVOCATION_TARGET___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET___CHECK_DEC_FWD__ABSTRACTMETHODINVOCATION_ABSTRACTMETHODDECLARATION_MDEFINITION:
			return checkDEC_FWD((AbstractMethodInvocation) arguments.get(0),
					(AbstractMethodDeclaration) arguments.get(1), (MDefinition) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_TARGET___CHECK_DEC_BWD__TCALL_TMETHODDEFINITION_TMEMBER:
			return checkDEC_BWD((TCall) arguments.get(0), (TMethodDefinition) arguments.get(1),
					(TMember) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_TARGET___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1),
					(MDefinitionToTMember) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_TARGET___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCALL_TMETHODDEFINITION_TMEMBER_ABSTRACTMETHODINVOCATION_ABSTRACTMETHODDECLARATION_MDEFINITION_MDEFINITIONTOTMEMBER_ABSTRACTMETHODINVOCATIONTOTACCESS_MDEFINITIONTOTMEMBER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TCall) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (TMember) arguments.get(3),
					(AbstractMethodInvocation) arguments.get(4), (AbstractMethodDeclaration) arguments.get(5),
					(MDefinition) arguments.get(6), (MDefinitionToTMember) arguments.get(7),
					(AbstractMethodInvocationToTAccess) arguments.get(8), (MDefinitionToTMember) arguments.get(9),
					(ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.METHOD_INVOCATION_TARGET___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodInvocationTarget_0_1_initialbindings_blackBBBBB(
			MethodInvocationTarget _this, Match match, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember) {
		return new Object[] { _this, match, invocation, mInvokedMember, mMember };
	}

	public static final Object[] pattern_MethodInvocationTarget_0_2_SolveCSP_bindingFBBBBB(MethodInvocationTarget _this,
			Match match, AbstractMethodInvocation invocation, AbstractMethodDeclaration mInvokedMember,
			MDefinition mMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, invocation, mInvokedMember, mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, invocation, mInvokedMember, mMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTarget_0_2_SolveCSP_bindingAndBlackFBBBBB(
			MethodInvocationTarget _this, Match match, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember) {
		Object[] result_pattern_MethodInvocationTarget_0_2_SolveCSP_binding = pattern_MethodInvocationTarget_0_2_SolveCSP_bindingFBBBBB(
				_this, match, invocation, mInvokedMember, mMember);
		if (result_pattern_MethodInvocationTarget_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTarget_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodInvocationTarget_0_2_SolveCSP_black = pattern_MethodInvocationTarget_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationTarget_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, invocation, mInvokedMember, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTarget_0_3_CheckCSP_expressionFBB(MethodInvocationTarget _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_0_4_collectelementstobetranslated_blackBBBB(Match match,
			AbstractMethodInvocation invocation, AbstractMethodDeclaration mInvokedMember, MDefinition mMember) {
		return new Object[] { match, invocation, mInvokedMember, mMember };
	}

	public static final Object[] pattern_MethodInvocationTarget_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, AbstractMethodInvocation invocation, AbstractMethodDeclaration mInvokedMember) {
		EMoflonEdge invocation__mInvokedMember____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInvokedMember__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String invocation__mInvokedMember____method_name_prime = "method";
		String mInvokedMember__invocation____usages_name_prime = "usages";
		invocation__mInvokedMember____method.setSrc(invocation);
		invocation__mInvokedMember____method.setTrg(mInvokedMember);
		match.getToBeTranslatedEdges().add(invocation__mInvokedMember____method);
		mInvokedMember__invocation____usages.setSrc(mInvokedMember);
		mInvokedMember__invocation____usages.setTrg(invocation);
		match.getToBeTranslatedEdges().add(mInvokedMember__invocation____usages);
		invocation__mInvokedMember____method.setName(invocation__mInvokedMember____method_name_prime);
		mInvokedMember__invocation____usages.setName(mInvokedMember__invocation____usages_name_prime);
		return new Object[] { match, invocation, mInvokedMember, invocation__mInvokedMember____method,
				mInvokedMember__invocation____usages };
	}

	public static final Object[] pattern_MethodInvocationTarget_0_5_collectcontextelements_blackBBBB(Match match,
			AbstractMethodInvocation invocation, AbstractMethodDeclaration mInvokedMember, MDefinition mMember) {
		return new Object[] { match, invocation, mInvokedMember, mMember };
	}

	public static final Object[] pattern_MethodInvocationTarget_0_5_collectcontextelements_greenBBBBF(Match match,
			AbstractMethodInvocation invocation, AbstractMethodDeclaration mInvokedMember, MDefinition mMember) {
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(invocation);
		match.getContextNodes().add(mInvokedMember);
		match.getContextNodes().add(mMember);
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		match.getContextEdges().add(mMember__invocation____mMethodInvocations);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		return new Object[] { match, invocation, mInvokedMember, mMember, mMember__invocation____mMethodInvocations };
	}

	public static final void pattern_MethodInvocationTarget_0_6_registerobjectstomatch_expressionBBBBB(
			MethodInvocationTarget _this, Match match, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember) {
		_this.registerObjectsToMatch_FWD(match, invocation, mInvokedMember, mMember);

	}

	public static final boolean pattern_MethodInvocationTarget_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTarget_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_1 = isApplicableMatch.getObject("tInvokedMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("invocation");
		EObject _localVariable_4 = isApplicableMatch.getObject("mInvokedMember");
		EObject _localVariable_5 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_6 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_7 = isApplicableMatch.getObject("invocationToTAccess");
		EObject _localVariable_8 = isApplicableMatch.getObject("mInvokedMemberToTInvokedMember");
		EObject tmpTAccess = _localVariable_0;
		EObject tmpTInvokedMember = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpInvocation = _localVariable_3;
		EObject tmpMInvokedMember = _localVariable_4;
		EObject tmpMMember = _localVariable_5;
		EObject tmpMMemberToTMember = _localVariable_6;
		EObject tmpInvocationToTAccess = _localVariable_7;
		EObject tmpMInvokedMemberToTInvokedMember = _localVariable_8;
		if (tmpTAccess instanceof TCall) {
			TCall tAccess = (TCall) tmpTAccess;
			if (tmpTInvokedMember instanceof TMethodDefinition) {
				TMethodDefinition tInvokedMember = (TMethodDefinition) tmpTInvokedMember;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					if (tmpInvocation instanceof AbstractMethodInvocation) {
						AbstractMethodInvocation invocation = (AbstractMethodInvocation) tmpInvocation;
						if (tmpMInvokedMember instanceof AbstractMethodDeclaration) {
							AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) tmpMInvokedMember;
							if (tmpMMember instanceof MDefinition) {
								MDefinition mMember = (MDefinition) tmpMMember;
								if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
									MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
									if (tmpInvocationToTAccess instanceof AbstractMethodInvocationToTAccess) {
										AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) tmpInvocationToTAccess;
										if (tmpMInvokedMemberToTInvokedMember instanceof MDefinitionToTMember) {
											MDefinitionToTMember mInvokedMemberToTInvokedMember = (MDefinitionToTMember) tmpMInvokedMemberToTInvokedMember;
											return new Object[] { tAccess, tInvokedMember, tMember, invocation,
													mInvokedMember, mMember, mMemberToTMember, invocationToTAccess,
													mInvokedMemberToTInvokedMember, isApplicableMatch };
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

	public static final Object[] pattern_MethodInvocationTarget_1_1_performtransformation_blackBBBBBBBBBFBB(
			TCall tAccess, TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess, MDefinitionToTMember mInvokedMemberToTInvokedMember,
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch) {
		if (!tInvokedMember.equals(tMember)) {
			if (!mInvokedMemberToTInvokedMember.equals(mMemberToTMember)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember,
								mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember, csp, _this,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodInvocationTarget_1_1_performtransformation_binding = pattern_MethodInvocationTarget_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodInvocationTarget_1_1_performtransformation_binding != null) {
			TCall tAccess = (TCall) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[0];
			TMethodDefinition tInvokedMember = (TMethodDefinition) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[1];
			TMember tMember = (TMember) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[2];
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[3];
			AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[4];
			MDefinition mMember = (MDefinition) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[5];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[6];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[7];
			MDefinitionToTMember mInvokedMemberToTInvokedMember = (MDefinitionToTMember) result_pattern_MethodInvocationTarget_1_1_performtransformation_binding[8];

			Object[] result_pattern_MethodInvocationTarget_1_1_performtransformation_black = pattern_MethodInvocationTarget_1_1_performtransformation_blackBBBBBBBBBFBB(
					tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember, mMemberToTMember,
					invocationToTAccess, mInvokedMemberToTInvokedMember, _this, isApplicableMatch);
			if (result_pattern_MethodInvocationTarget_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodInvocationTarget_1_1_performtransformation_black[9];

				return new Object[] { tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember,
						mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_1_1_performtransformation_greenBB(TCall tAccess,
			TMethodDefinition tInvokedMember) {
		tAccess.setTarget(tInvokedMember);
		return new Object[] { tAccess, tInvokedMember };
	}

	public static final Object[] pattern_MethodInvocationTarget_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodInvocationTarget_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tAccess, EObject tInvokedMember, EObject tMember, EObject invocation,
			EObject mInvokedMember, EObject mMember, EObject mMemberToTMember, EObject invocationToTAccess,
			EObject mInvokedMemberToTInvokedMember) {
		if (!tAccess.equals(tInvokedMember)) {
			if (!tAccess.equals(tMember)) {
				if (!tInvokedMember.equals(tMember)) {
					if (!invocation.equals(tAccess)) {
						if (!invocation.equals(tInvokedMember)) {
							if (!invocation.equals(tMember)) {
								if (!invocation.equals(mInvokedMember)) {
									if (!invocation.equals(mMember)) {
										if (!invocation.equals(mMemberToTMember)) {
											if (!invocation.equals(invocationToTAccess)) {
												if (!invocation.equals(mInvokedMemberToTInvokedMember)) {
													if (!mInvokedMember.equals(tAccess)) {
														if (!mInvokedMember.equals(tInvokedMember)) {
															if (!mInvokedMember.equals(tMember)) {
																if (!mInvokedMember.equals(mMember)) {
																	if (!mInvokedMember.equals(mMemberToTMember)) {
																		if (!mInvokedMember.equals(
																				mInvokedMemberToTInvokedMember)) {
																			if (!mMember.equals(tAccess)) {
																				if (!mMember.equals(tInvokedMember)) {
																					if (!mMember.equals(tMember)) {
																						if (!mMember.equals(
																								mMemberToTMember)) {
																							if (!mMemberToTMember
																									.equals(tAccess)) {
																								if (!mMemberToTMember
																										.equals(tInvokedMember)) {
																									if (!mMemberToTMember
																											.equals(tMember)) {
																										if (!invocationToTAccess
																												.equals(tAccess)) {
																											if (!invocationToTAccess
																													.equals(tInvokedMember)) {
																												if (!invocationToTAccess
																														.equals(tMember)) {
																													if (!invocationToTAccess
																															.equals(mInvokedMember)) {
																														if (!invocationToTAccess
																																.equals(mMember)) {
																															if (!invocationToTAccess
																																	.equals(mMemberToTMember)) {
																																if (!invocationToTAccess
																																		.equals(mInvokedMemberToTInvokedMember)) {
																																	if (!mInvokedMemberToTInvokedMember
																																			.equals(tAccess)) {
																																		if (!mInvokedMemberToTInvokedMember
																																				.equals(tInvokedMember)) {
																																			if (!mInvokedMemberToTInvokedMember
																																					.equals(tMember)) {
																																				if (!mInvokedMemberToTInvokedMember
																																						.equals(mMember)) {
																																					if (!mInvokedMemberToTInvokedMember
																																							.equals(mMemberToTMember)) {
																																						return new Object[] {
																																								ruleresult,
																																								tAccess,
																																								tInvokedMember,
																																								tMember,
																																								invocation,
																																								mInvokedMember,
																																								mMember,
																																								mMemberToTMember,
																																								invocationToTAccess,
																																								mInvokedMemberToTInvokedMember };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodInvocationTarget_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject tAccess, EObject tInvokedMember, EObject invocation,
			EObject mInvokedMember) {
		EMoflonEdge invocation__mInvokedMember____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInvokedMember__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tInvokedMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInvokedMember__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodInvocationTarget";
		String invocation__mInvokedMember____method_name_prime = "method";
		String mInvokedMember__invocation____usages_name_prime = "usages";
		String tAccess__tInvokedMember____target_name_prime = "target";
		String tInvokedMember__tAccess____accessedBy_name_prime = "accessedBy";
		invocation__mInvokedMember____method.setSrc(invocation);
		invocation__mInvokedMember____method.setTrg(mInvokedMember);
		ruleresult.getTranslatedEdges().add(invocation__mInvokedMember____method);
		mInvokedMember__invocation____usages.setSrc(mInvokedMember);
		mInvokedMember__invocation____usages.setTrg(invocation);
		ruleresult.getTranslatedEdges().add(mInvokedMember__invocation____usages);
		tAccess__tInvokedMember____target.setSrc(tAccess);
		tAccess__tInvokedMember____target.setTrg(tInvokedMember);
		ruleresult.getCreatedEdges().add(tAccess__tInvokedMember____target);
		tInvokedMember__tAccess____accessedBy.setSrc(tInvokedMember);
		tInvokedMember__tAccess____accessedBy.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(tInvokedMember__tAccess____accessedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		invocation__mInvokedMember____method.setName(invocation__mInvokedMember____method_name_prime);
		mInvokedMember__invocation____usages.setName(mInvokedMember__invocation____usages_name_prime);
		tAccess__tInvokedMember____target.setName(tAccess__tInvokedMember____target_name_prime);
		tInvokedMember__tAccess____accessedBy.setName(tInvokedMember__tAccess____accessedBy_name_prime);
		return new Object[] { ruleresult, tAccess, tInvokedMember, invocation, mInvokedMember,
				invocation__mInvokedMember____method, mInvokedMember__invocation____usages,
				tAccess__tInvokedMember____target, tInvokedMember__tAccess____accessedBy };
	}

	public static final void pattern_MethodInvocationTarget_1_5_registerobjects_expressionBBBBBBBBBBB(
			MethodInvocationTarget _this, PerformRuleResult ruleresult, EObject tAccess, EObject tInvokedMember,
			EObject tMember, EObject invocation, EObject mInvokedMember, EObject mMember, EObject mMemberToTMember,
			EObject invocationToTAccess, EObject mInvokedMemberToTInvokedMember) {
		_this.registerObjects_FWD(ruleresult, tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember,
				mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember);

	}

	public static final PerformRuleResult pattern_MethodInvocationTarget_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_2_1_preparereturnvalue_bindingFB(
			MethodInvocationTarget _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodInvocationTarget _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodInvocationTarget _this) {
		Object[] result_pattern_MethodInvocationTarget_2_1_preparereturnvalue_binding = pattern_MethodInvocationTarget_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationTarget_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodInvocationTarget_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationTarget_2_1_preparereturnvalue_black = pattern_MethodInvocationTarget_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodInvocationTarget_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodInvocationTarget_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodInvocationTarget";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodInvocationTarget_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("invocation");
		EObject _localVariable_1 = match.getObject("mInvokedMember");
		EObject _localVariable_2 = match.getObject("mMember");
		EObject tmpInvocation = _localVariable_0;
		EObject tmpMInvokedMember = _localVariable_1;
		EObject tmpMMember = _localVariable_2;
		if (tmpInvocation instanceof AbstractMethodInvocation) {
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) tmpInvocation;
			if (tmpMInvokedMember instanceof AbstractMethodDeclaration) {
				AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) tmpMInvokedMember;
				if (tmpMMember instanceof MDefinition) {
					MDefinition mMember = (MDefinition) tmpMMember;
					return new Object[] { invocation, mInvokedMember, mMember, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_2_2_corematch_blackFFFBBBFFFB(
			AbstractMethodInvocation invocation, AbstractMethodDeclaration mInvokedMember, MDefinition mMember,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
			TMember tMember = mMemberToTMember.getTarget();
			if (tMember != null) {
				for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(invocation, AbstractMethodInvocationToTAccess.class, "source")) {
					TAccess tmpTAccess = invocationToTAccess.getTarget();
					if (tmpTAccess instanceof TCall) {
						TCall tAccess = (TCall) tmpTAccess;
						for (MDefinitionToTMember mInvokedMemberToTInvokedMember : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(mInvokedMember, MDefinitionToTMember.class, "source")) {
							if (!mInvokedMemberToTInvokedMember.equals(mMemberToTMember)) {
								TMember tmpTInvokedMember = mInvokedMemberToTInvokedMember.getTarget();
								if (tmpTInvokedMember instanceof TMethodDefinition) {
									TMethodDefinition tInvokedMember = (TMethodDefinition) tmpTInvokedMember;
									if (!tInvokedMember.equals(tMember)) {
										_result.add(new Object[] { tAccess, tInvokedMember, tMember, invocation,
												mInvokedMember, mMember, mMemberToTMember, invocationToTAccess,
												mInvokedMemberToTInvokedMember, match });
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

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_2_3_findcontext_blackBBBBBBBBB(TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinitionToTMember mInvokedMemberToTInvokedMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInvokedMember.equals(tMember)) {
			if (!mInvokedMemberToTInvokedMember.equals(mMemberToTMember)) {
				if (tMember.getAccessing().contains(tAccess)) {
					if (mInvokedMember.equals(invocation.getMethod())) {
						if (mMember.equals(mMemberToTMember.getSource())) {
							if (tAccess.equals(invocationToTAccess.getTarget())) {
								if (mMember.getMMethodInvocations().contains(invocation)) {
									if (invocation.equals(invocationToTAccess.getSource())) {
										if (tMember.equals(mMemberToTMember.getTarget())) {
											if (tInvokedMember.equals(mInvokedMemberToTInvokedMember.getTarget())) {
												if (mInvokedMember.equals(mInvokedMemberToTInvokedMember.getSource())) {
													_result.add(new Object[] { tAccess, tInvokedMember, tMember,
															invocation, mInvokedMember, mMember, mMemberToTMember,
															invocationToTAccess, mInvokedMemberToTInvokedMember });
												}
											}
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

	public static final Object[] pattern_MethodInvocationTarget_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(
			TCall tAccess, TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinitionToTMember mInvokedMemberToTInvokedMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tMember__tAccess____accessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocation__mInvokedMember____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInvokedMember__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInvokedMemberToTInvokedMember__tInvokedMember____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mInvokedMemberToTInvokedMember__mInvokedMember____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tMember__tAccess____accessing_name_prime = "accessing";
		String tAccess__tMember____source_name_prime = "source";
		String invocation__mInvokedMember____method_name_prime = "method";
		String mInvokedMember__invocation____usages_name_prime = "usages";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		String invocationToTAccess__invocation____source_name_prime = "source";
		String mMemberToTMember__tMember____target_name_prime = "target";
		String mInvokedMemberToTInvokedMember__tInvokedMember____target_name_prime = "target";
		String mInvokedMemberToTInvokedMember__mInvokedMember____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(tInvokedMember);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(mInvokedMember);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess);
		isApplicableMatch.getAllContextElements().add(mInvokedMemberToTInvokedMember);
		tMember__tAccess____accessing.setSrc(tMember);
		tMember__tAccess____accessing.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tMember__tAccess____accessing);
		tAccess__tMember____source.setSrc(tAccess);
		tAccess__tMember____source.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess__tMember____source);
		invocation__mInvokedMember____method.setSrc(invocation);
		invocation__mInvokedMember____method.setTrg(mInvokedMember);
		isApplicableMatch.getAllContextElements().add(invocation__mInvokedMember____method);
		mInvokedMember__invocation____usages.setSrc(mInvokedMember);
		mInvokedMember__invocation____usages.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(mInvokedMember__invocation____usages);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__tAccess____target);
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(mMember__invocation____mMethodInvocations);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__invocation____source);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mInvokedMemberToTInvokedMember__tInvokedMember____target.setSrc(mInvokedMemberToTInvokedMember);
		mInvokedMemberToTInvokedMember__tInvokedMember____target.setTrg(tInvokedMember);
		isApplicableMatch.getAllContextElements().add(mInvokedMemberToTInvokedMember__tInvokedMember____target);
		mInvokedMemberToTInvokedMember__mInvokedMember____source.setSrc(mInvokedMemberToTInvokedMember);
		mInvokedMemberToTInvokedMember__mInvokedMember____source.setTrg(mInvokedMember);
		isApplicableMatch.getAllContextElements().add(mInvokedMemberToTInvokedMember__mInvokedMember____source);
		tMember__tAccess____accessing.setName(tMember__tAccess____accessing_name_prime);
		tAccess__tMember____source.setName(tAccess__tMember____source_name_prime);
		invocation__mInvokedMember____method.setName(invocation__mInvokedMember____method_name_prime);
		mInvokedMember__invocation____usages.setName(mInvokedMember__invocation____usages_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		mInvokedMemberToTInvokedMember__tInvokedMember____target
				.setName(mInvokedMemberToTInvokedMember__tInvokedMember____target_name_prime);
		mInvokedMemberToTInvokedMember__mInvokedMember____source
				.setName(mInvokedMemberToTInvokedMember__mInvokedMember____source_name_prime);
		return new Object[] { tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember, mMemberToTMember,
				invocationToTAccess, mInvokedMemberToTInvokedMember, isApplicableMatch, tMember__tAccess____accessing,
				tAccess__tMember____source, invocation__mInvokedMember____method, mInvokedMember__invocation____usages,
				mMemberToTMember__mMember____source, invocationToTAccess__tAccess____target,
				mMember__invocation____mMethodInvocations, invocationToTAccess__invocation____source,
				mMemberToTMember__tMember____target, mInvokedMemberToTInvokedMember__tInvokedMember____target,
				mInvokedMemberToTInvokedMember__mInvokedMember____source };
	}

	public static final Object[] pattern_MethodInvocationTarget_2_4_solveCSP_bindingFBBBBBBBBBBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch, TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinitionToTMember mInvokedMemberToTInvokedMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tAccess, tInvokedMember, tMember,
				invocation, mInvokedMember, mMember, mMemberToTMember, invocationToTAccess,
				mInvokedMemberToTInvokedMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAccess, tInvokedMember, tMember, invocation,
					mInvokedMember, mMember, mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTarget_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch, TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinitionToTMember mInvokedMemberToTInvokedMember) {
		Object[] result_pattern_MethodInvocationTarget_2_4_solveCSP_binding = pattern_MethodInvocationTarget_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember,
				mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember);
		if (result_pattern_MethodInvocationTarget_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTarget_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationTarget_2_4_solveCSP_black = pattern_MethodInvocationTarget_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationTarget_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAccess, tInvokedMember, tMember, invocation,
						mInvokedMember, mMember, mMemberToTMember, invocationToTAccess,
						mInvokedMemberToTInvokedMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTarget_2_5_checkCSP_expressionFBB(MethodInvocationTarget _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodInvocationTarget_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodInvocationTarget";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationTarget_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_10_1_initialbindings_blackBBBBB(
			MethodInvocationTarget _this, Match match, TCall tAccess, TMethodDefinition tInvokedMember,
			TMember tMember) {
		if (!tInvokedMember.equals(tMember)) {
			return new Object[] { _this, match, tAccess, tInvokedMember, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_10_2_SolveCSP_bindingFBBBBB(
			MethodInvocationTarget _this, Match match, TCall tAccess, TMethodDefinition tInvokedMember,
			TMember tMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAccess, tInvokedMember, tMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAccess, tInvokedMember, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTarget_10_2_SolveCSP_bindingAndBlackFBBBBB(
			MethodInvocationTarget _this, Match match, TCall tAccess, TMethodDefinition tInvokedMember,
			TMember tMember) {
		Object[] result_pattern_MethodInvocationTarget_10_2_SolveCSP_binding = pattern_MethodInvocationTarget_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tAccess, tInvokedMember, tMember);
		if (result_pattern_MethodInvocationTarget_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTarget_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodInvocationTarget_10_2_SolveCSP_black = pattern_MethodInvocationTarget_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationTarget_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAccess, tInvokedMember, tMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTarget_10_3_CheckCSP_expressionFBB(MethodInvocationTarget _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TCall tAccess, TMethodDefinition tInvokedMember, TMember tMember) {
		if (!tInvokedMember.equals(tMember)) {
			return new Object[] { match, tAccess, tInvokedMember, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TCall tAccess, TMethodDefinition tInvokedMember) {
		EMoflonEdge tAccess__tInvokedMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInvokedMember__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAccess__tInvokedMember____target_name_prime = "target";
		String tInvokedMember__tAccess____accessedBy_name_prime = "accessedBy";
		tAccess__tInvokedMember____target.setSrc(tAccess);
		tAccess__tInvokedMember____target.setTrg(tInvokedMember);
		match.getToBeTranslatedEdges().add(tAccess__tInvokedMember____target);
		tInvokedMember__tAccess____accessedBy.setSrc(tInvokedMember);
		tInvokedMember__tAccess____accessedBy.setTrg(tAccess);
		match.getToBeTranslatedEdges().add(tInvokedMember__tAccess____accessedBy);
		tAccess__tInvokedMember____target.setName(tAccess__tInvokedMember____target_name_prime);
		tInvokedMember__tAccess____accessedBy.setName(tInvokedMember__tAccess____accessedBy_name_prime);
		return new Object[] { match, tAccess, tInvokedMember, tAccess__tInvokedMember____target,
				tInvokedMember__tAccess____accessedBy };
	}

	public static final Object[] pattern_MethodInvocationTarget_10_5_collectcontextelements_blackBBBB(Match match,
			TCall tAccess, TMethodDefinition tInvokedMember, TMember tMember) {
		if (!tInvokedMember.equals(tMember)) {
			return new Object[] { match, tAccess, tInvokedMember, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_10_5_collectcontextelements_greenBBBBFF(Match match,
			TCall tAccess, TMethodDefinition tInvokedMember, TMember tMember) {
		EMoflonEdge tMember__tAccess____accessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tAccess);
		match.getContextNodes().add(tInvokedMember);
		match.getContextNodes().add(tMember);
		String tMember__tAccess____accessing_name_prime = "accessing";
		String tAccess__tMember____source_name_prime = "source";
		tMember__tAccess____accessing.setSrc(tMember);
		tMember__tAccess____accessing.setTrg(tAccess);
		match.getContextEdges().add(tMember__tAccess____accessing);
		tAccess__tMember____source.setSrc(tAccess);
		tAccess__tMember____source.setTrg(tMember);
		match.getContextEdges().add(tAccess__tMember____source);
		tMember__tAccess____accessing.setName(tMember__tAccess____accessing_name_prime);
		tAccess__tMember____source.setName(tAccess__tMember____source_name_prime);
		return new Object[] { match, tAccess, tInvokedMember, tMember, tMember__tAccess____accessing,
				tAccess__tMember____source };
	}

	public static final void pattern_MethodInvocationTarget_10_6_registerobjectstomatch_expressionBBBBB(
			MethodInvocationTarget _this, Match match, TCall tAccess, TMethodDefinition tInvokedMember,
			TMember tMember) {
		_this.registerObjectsToMatch_BWD(match, tAccess, tInvokedMember, tMember);

	}

	public static final boolean pattern_MethodInvocationTarget_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTarget_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_1 = isApplicableMatch.getObject("tInvokedMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("invocation");
		EObject _localVariable_4 = isApplicableMatch.getObject("mInvokedMember");
		EObject _localVariable_5 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_6 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_7 = isApplicableMatch.getObject("invocationToTAccess");
		EObject _localVariable_8 = isApplicableMatch.getObject("mInvokedMemberToTInvokedMember");
		EObject tmpTAccess = _localVariable_0;
		EObject tmpTInvokedMember = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpInvocation = _localVariable_3;
		EObject tmpMInvokedMember = _localVariable_4;
		EObject tmpMMember = _localVariable_5;
		EObject tmpMMemberToTMember = _localVariable_6;
		EObject tmpInvocationToTAccess = _localVariable_7;
		EObject tmpMInvokedMemberToTInvokedMember = _localVariable_8;
		if (tmpTAccess instanceof TCall) {
			TCall tAccess = (TCall) tmpTAccess;
			if (tmpTInvokedMember instanceof TMethodDefinition) {
				TMethodDefinition tInvokedMember = (TMethodDefinition) tmpTInvokedMember;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					if (tmpInvocation instanceof AbstractMethodInvocation) {
						AbstractMethodInvocation invocation = (AbstractMethodInvocation) tmpInvocation;
						if (tmpMInvokedMember instanceof AbstractMethodDeclaration) {
							AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) tmpMInvokedMember;
							if (tmpMMember instanceof MDefinition) {
								MDefinition mMember = (MDefinition) tmpMMember;
								if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
									MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
									if (tmpInvocationToTAccess instanceof AbstractMethodInvocationToTAccess) {
										AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) tmpInvocationToTAccess;
										if (tmpMInvokedMemberToTInvokedMember instanceof MDefinitionToTMember) {
											MDefinitionToTMember mInvokedMemberToTInvokedMember = (MDefinitionToTMember) tmpMInvokedMemberToTInvokedMember;
											return new Object[] { tAccess, tInvokedMember, tMember, invocation,
													mInvokedMember, mMember, mMemberToTMember, invocationToTAccess,
													mInvokedMemberToTInvokedMember, isApplicableMatch };
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

	public static final Object[] pattern_MethodInvocationTarget_11_1_performtransformation_blackBBBBBBBBBFBB(
			TCall tAccess, TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess, MDefinitionToTMember mInvokedMemberToTInvokedMember,
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch) {
		if (!tInvokedMember.equals(tMember)) {
			if (!mInvokedMemberToTInvokedMember.equals(mMemberToTMember)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember,
								mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember, csp, _this,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodInvocationTarget_11_1_performtransformation_binding = pattern_MethodInvocationTarget_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodInvocationTarget_11_1_performtransformation_binding != null) {
			TCall tAccess = (TCall) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[0];
			TMethodDefinition tInvokedMember = (TMethodDefinition) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[1];
			TMember tMember = (TMember) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[2];
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[3];
			AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[4];
			MDefinition mMember = (MDefinition) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[5];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[6];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[7];
			MDefinitionToTMember mInvokedMemberToTInvokedMember = (MDefinitionToTMember) result_pattern_MethodInvocationTarget_11_1_performtransformation_binding[8];

			Object[] result_pattern_MethodInvocationTarget_11_1_performtransformation_black = pattern_MethodInvocationTarget_11_1_performtransformation_blackBBBBBBBBBFBB(
					tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember, mMemberToTMember,
					invocationToTAccess, mInvokedMemberToTInvokedMember, _this, isApplicableMatch);
			if (result_pattern_MethodInvocationTarget_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodInvocationTarget_11_1_performtransformation_black[9];

				return new Object[] { tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember,
						mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_11_1_performtransformation_greenBB(
			AbstractMethodInvocation invocation, AbstractMethodDeclaration mInvokedMember) {
		invocation.setMethod(mInvokedMember);
		return new Object[] { invocation, mInvokedMember };
	}

	public static final Object[] pattern_MethodInvocationTarget_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodInvocationTarget_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tAccess, EObject tInvokedMember, EObject tMember, EObject invocation,
			EObject mInvokedMember, EObject mMember, EObject mMemberToTMember, EObject invocationToTAccess,
			EObject mInvokedMemberToTInvokedMember) {
		if (!tAccess.equals(tInvokedMember)) {
			if (!tAccess.equals(tMember)) {
				if (!tInvokedMember.equals(tMember)) {
					if (!invocation.equals(tAccess)) {
						if (!invocation.equals(tInvokedMember)) {
							if (!invocation.equals(tMember)) {
								if (!invocation.equals(mInvokedMember)) {
									if (!invocation.equals(mMember)) {
										if (!invocation.equals(mMemberToTMember)) {
											if (!invocation.equals(invocationToTAccess)) {
												if (!invocation.equals(mInvokedMemberToTInvokedMember)) {
													if (!mInvokedMember.equals(tAccess)) {
														if (!mInvokedMember.equals(tInvokedMember)) {
															if (!mInvokedMember.equals(tMember)) {
																if (!mInvokedMember.equals(mMember)) {
																	if (!mInvokedMember.equals(mMemberToTMember)) {
																		if (!mInvokedMember.equals(
																				mInvokedMemberToTInvokedMember)) {
																			if (!mMember.equals(tAccess)) {
																				if (!mMember.equals(tInvokedMember)) {
																					if (!mMember.equals(tMember)) {
																						if (!mMember.equals(
																								mMemberToTMember)) {
																							if (!mMemberToTMember
																									.equals(tAccess)) {
																								if (!mMemberToTMember
																										.equals(tInvokedMember)) {
																									if (!mMemberToTMember
																											.equals(tMember)) {
																										if (!invocationToTAccess
																												.equals(tAccess)) {
																											if (!invocationToTAccess
																													.equals(tInvokedMember)) {
																												if (!invocationToTAccess
																														.equals(tMember)) {
																													if (!invocationToTAccess
																															.equals(mInvokedMember)) {
																														if (!invocationToTAccess
																																.equals(mMember)) {
																															if (!invocationToTAccess
																																	.equals(mMemberToTMember)) {
																																if (!invocationToTAccess
																																		.equals(mInvokedMemberToTInvokedMember)) {
																																	if (!mInvokedMemberToTInvokedMember
																																			.equals(tAccess)) {
																																		if (!mInvokedMemberToTInvokedMember
																																				.equals(tInvokedMember)) {
																																			if (!mInvokedMemberToTInvokedMember
																																					.equals(tMember)) {
																																				if (!mInvokedMemberToTInvokedMember
																																						.equals(mMember)) {
																																					if (!mInvokedMemberToTInvokedMember
																																							.equals(mMemberToTMember)) {
																																						return new Object[] {
																																								ruleresult,
																																								tAccess,
																																								tInvokedMember,
																																								tMember,
																																								invocation,
																																								mInvokedMember,
																																								mMember,
																																								mMemberToTMember,
																																								invocationToTAccess,
																																								mInvokedMemberToTInvokedMember };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodInvocationTarget_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject tAccess, EObject tInvokedMember, EObject invocation,
			EObject mInvokedMember) {
		EMoflonEdge invocation__mInvokedMember____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInvokedMember__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tInvokedMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInvokedMember__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodInvocationTarget";
		String invocation__mInvokedMember____method_name_prime = "method";
		String mInvokedMember__invocation____usages_name_prime = "usages";
		String tAccess__tInvokedMember____target_name_prime = "target";
		String tInvokedMember__tAccess____accessedBy_name_prime = "accessedBy";
		invocation__mInvokedMember____method.setSrc(invocation);
		invocation__mInvokedMember____method.setTrg(mInvokedMember);
		ruleresult.getCreatedEdges().add(invocation__mInvokedMember____method);
		mInvokedMember__invocation____usages.setSrc(mInvokedMember);
		mInvokedMember__invocation____usages.setTrg(invocation);
		ruleresult.getCreatedEdges().add(mInvokedMember__invocation____usages);
		tAccess__tInvokedMember____target.setSrc(tAccess);
		tAccess__tInvokedMember____target.setTrg(tInvokedMember);
		ruleresult.getTranslatedEdges().add(tAccess__tInvokedMember____target);
		tInvokedMember__tAccess____accessedBy.setSrc(tInvokedMember);
		tInvokedMember__tAccess____accessedBy.setTrg(tAccess);
		ruleresult.getTranslatedEdges().add(tInvokedMember__tAccess____accessedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		invocation__mInvokedMember____method.setName(invocation__mInvokedMember____method_name_prime);
		mInvokedMember__invocation____usages.setName(mInvokedMember__invocation____usages_name_prime);
		tAccess__tInvokedMember____target.setName(tAccess__tInvokedMember____target_name_prime);
		tInvokedMember__tAccess____accessedBy.setName(tInvokedMember__tAccess____accessedBy_name_prime);
		return new Object[] { ruleresult, tAccess, tInvokedMember, invocation, mInvokedMember,
				invocation__mInvokedMember____method, mInvokedMember__invocation____usages,
				tAccess__tInvokedMember____target, tInvokedMember__tAccess____accessedBy };
	}

	public static final void pattern_MethodInvocationTarget_11_5_registerobjects_expressionBBBBBBBBBBB(
			MethodInvocationTarget _this, PerformRuleResult ruleresult, EObject tAccess, EObject tInvokedMember,
			EObject tMember, EObject invocation, EObject mInvokedMember, EObject mMember, EObject mMemberToTMember,
			EObject invocationToTAccess, EObject mInvokedMemberToTInvokedMember) {
		_this.registerObjects_BWD(ruleresult, tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember,
				mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember);

	}

	public static final PerformRuleResult pattern_MethodInvocationTarget_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_12_1_preparereturnvalue_bindingFB(
			MethodInvocationTarget _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodInvocationTarget _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodInvocationTarget _this) {
		Object[] result_pattern_MethodInvocationTarget_12_1_preparereturnvalue_binding = pattern_MethodInvocationTarget_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationTarget_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodInvocationTarget_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationTarget_12_1_preparereturnvalue_black = pattern_MethodInvocationTarget_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodInvocationTarget_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodInvocationTarget_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodInvocationTarget";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodInvocationTarget_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAccess");
		EObject _localVariable_1 = match.getObject("tInvokedMember");
		EObject _localVariable_2 = match.getObject("tMember");
		EObject tmpTAccess = _localVariable_0;
		EObject tmpTInvokedMember = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		if (tmpTAccess instanceof TCall) {
			TCall tAccess = (TCall) tmpTAccess;
			if (tmpTInvokedMember instanceof TMethodDefinition) {
				TMethodDefinition tInvokedMember = (TMethodDefinition) tmpTInvokedMember;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					return new Object[] { tAccess, tInvokedMember, tMember, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_12_2_corematch_blackBBBFFFFFFB(TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInvokedMember.equals(tMember)) {
			for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAccess, AbstractMethodInvocationToTAccess.class, "target")) {
				AbstractMethodInvocation invocation = invocationToTAccess.getSource();
				if (invocation != null) {
					for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
						BodyDeclaration tmpMMember = mMemberToTMember.getSource();
						if (tmpMMember instanceof MDefinition) {
							MDefinition mMember = (MDefinition) tmpMMember;
							for (MDefinitionToTMember mInvokedMemberToTInvokedMember : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(tInvokedMember, MDefinitionToTMember.class, "target")) {
								if (!mInvokedMemberToTInvokedMember.equals(mMemberToTMember)) {
									BodyDeclaration tmpMInvokedMember = mInvokedMemberToTInvokedMember.getSource();
									if (tmpMInvokedMember instanceof AbstractMethodDeclaration) {
										AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) tmpMInvokedMember;
										_result.add(new Object[] { tAccess, tInvokedMember, tMember, invocation,
												mInvokedMember, mMember, mMemberToTMember, invocationToTAccess,
												mInvokedMemberToTInvokedMember, match });
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

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_12_3_findcontext_blackBBBBBBBBB(TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinitionToTMember mInvokedMemberToTInvokedMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInvokedMember.equals(tMember)) {
			if (!mInvokedMemberToTInvokedMember.equals(mMemberToTMember)) {
				if (tMember.getAccessing().contains(tAccess)) {
					if (tInvokedMember.equals(tAccess.getTarget())) {
						if (mMember.equals(mMemberToTMember.getSource())) {
							if (tAccess.equals(invocationToTAccess.getTarget())) {
								if (mMember.getMMethodInvocations().contains(invocation)) {
									if (invocation.equals(invocationToTAccess.getSource())) {
										if (tMember.equals(mMemberToTMember.getTarget())) {
											if (tInvokedMember.equals(mInvokedMemberToTInvokedMember.getTarget())) {
												if (mInvokedMember.equals(mInvokedMemberToTInvokedMember.getSource())) {
													_result.add(new Object[] { tAccess, tInvokedMember, tMember,
															invocation, mInvokedMember, mMember, mMemberToTMember,
															invocationToTAccess, mInvokedMemberToTInvokedMember });
												}
											}
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

	public static final Object[] pattern_MethodInvocationTarget_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(
			TCall tAccess, TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinitionToTMember mInvokedMemberToTInvokedMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tMember__tAccess____accessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tInvokedMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInvokedMember__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInvokedMemberToTInvokedMember__tInvokedMember____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mInvokedMemberToTInvokedMember__mInvokedMember____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tMember__tAccess____accessing_name_prime = "accessing";
		String tAccess__tMember____source_name_prime = "source";
		String tAccess__tInvokedMember____target_name_prime = "target";
		String tInvokedMember__tAccess____accessedBy_name_prime = "accessedBy";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		String invocationToTAccess__invocation____source_name_prime = "source";
		String mMemberToTMember__tMember____target_name_prime = "target";
		String mInvokedMemberToTInvokedMember__tInvokedMember____target_name_prime = "target";
		String mInvokedMemberToTInvokedMember__mInvokedMember____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(tInvokedMember);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(mInvokedMember);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess);
		isApplicableMatch.getAllContextElements().add(mInvokedMemberToTInvokedMember);
		tMember__tAccess____accessing.setSrc(tMember);
		tMember__tAccess____accessing.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tMember__tAccess____accessing);
		tAccess__tMember____source.setSrc(tAccess);
		tAccess__tMember____source.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess__tMember____source);
		tAccess__tInvokedMember____target.setSrc(tAccess);
		tAccess__tInvokedMember____target.setTrg(tInvokedMember);
		isApplicableMatch.getAllContextElements().add(tAccess__tInvokedMember____target);
		tInvokedMember__tAccess____accessedBy.setSrc(tInvokedMember);
		tInvokedMember__tAccess____accessedBy.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tInvokedMember__tAccess____accessedBy);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__tAccess____target);
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(mMember__invocation____mMethodInvocations);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__invocation____source);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mInvokedMemberToTInvokedMember__tInvokedMember____target.setSrc(mInvokedMemberToTInvokedMember);
		mInvokedMemberToTInvokedMember__tInvokedMember____target.setTrg(tInvokedMember);
		isApplicableMatch.getAllContextElements().add(mInvokedMemberToTInvokedMember__tInvokedMember____target);
		mInvokedMemberToTInvokedMember__mInvokedMember____source.setSrc(mInvokedMemberToTInvokedMember);
		mInvokedMemberToTInvokedMember__mInvokedMember____source.setTrg(mInvokedMember);
		isApplicableMatch.getAllContextElements().add(mInvokedMemberToTInvokedMember__mInvokedMember____source);
		tMember__tAccess____accessing.setName(tMember__tAccess____accessing_name_prime);
		tAccess__tMember____source.setName(tAccess__tMember____source_name_prime);
		tAccess__tInvokedMember____target.setName(tAccess__tInvokedMember____target_name_prime);
		tInvokedMember__tAccess____accessedBy.setName(tInvokedMember__tAccess____accessedBy_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		mInvokedMemberToTInvokedMember__tInvokedMember____target
				.setName(mInvokedMemberToTInvokedMember__tInvokedMember____target_name_prime);
		mInvokedMemberToTInvokedMember__mInvokedMember____source
				.setName(mInvokedMemberToTInvokedMember__mInvokedMember____source_name_prime);
		return new Object[] { tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember, mMemberToTMember,
				invocationToTAccess, mInvokedMemberToTInvokedMember, isApplicableMatch, tMember__tAccess____accessing,
				tAccess__tMember____source, tAccess__tInvokedMember____target, tInvokedMember__tAccess____accessedBy,
				mMemberToTMember__mMember____source, invocationToTAccess__tAccess____target,
				mMember__invocation____mMethodInvocations, invocationToTAccess__invocation____source,
				mMemberToTMember__tMember____target, mInvokedMemberToTInvokedMember__tInvokedMember____target,
				mInvokedMemberToTInvokedMember__mInvokedMember____source };
	}

	public static final Object[] pattern_MethodInvocationTarget_12_4_solveCSP_bindingFBBBBBBBBBBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch, TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinitionToTMember mInvokedMemberToTInvokedMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tAccess, tInvokedMember, tMember,
				invocation, mInvokedMember, mMember, mMemberToTMember, invocationToTAccess,
				mInvokedMemberToTInvokedMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAccess, tInvokedMember, tMember, invocation,
					mInvokedMember, mMember, mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTarget_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch, TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinitionToTMember mInvokedMemberToTInvokedMember) {
		Object[] result_pattern_MethodInvocationTarget_12_4_solveCSP_binding = pattern_MethodInvocationTarget_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember,
				mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember);
		if (result_pattern_MethodInvocationTarget_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTarget_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationTarget_12_4_solveCSP_black = pattern_MethodInvocationTarget_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationTarget_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAccess, tInvokedMember, tMember, invocation,
						mInvokedMember, mMember, mMemberToTMember, invocationToTAccess,
						mInvokedMemberToTInvokedMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTarget_12_5_checkCSP_expressionFBB(MethodInvocationTarget _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodInvocationTarget_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodInvocationTarget";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationTarget_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_20_1_preparereturnvalue_bindingFB(
			MethodInvocationTarget _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodInvocationTarget _this) {
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

	public static final Object[] pattern_MethodInvocationTarget_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodInvocationTarget _this) {
		Object[] result_pattern_MethodInvocationTarget_20_1_preparereturnvalue_binding = pattern_MethodInvocationTarget_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationTarget_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodInvocationTarget_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationTarget_20_1_preparereturnvalue_black = pattern_MethodInvocationTarget_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodInvocationTarget_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodInvocationTarget_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodInvocationTarget_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_target) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAccess = _edge_target.getSrc();
		if (tmpTAccess instanceof TCall) {
			TCall tAccess = (TCall) tmpTAccess;
			EObject tmpTInvokedMember = _edge_target.getTrg();
			if (tmpTInvokedMember instanceof TMethodDefinition) {
				TMethodDefinition tInvokedMember = (TMethodDefinition) tmpTInvokedMember;
				if (tInvokedMember.equals(tAccess.getTarget())) {
					TMember tMember = tAccess.getSource();
					if (tMember != null) {
						if (!tInvokedMember.equals(tMember)) {
							_result.add(new Object[] { tAccess, tInvokedMember, tMember, _edge_target });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodInvocationTarget_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodInvocationTarget _this, Match match, TCall tAccess, TMethodDefinition tInvokedMember,
			TMember tMember) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAccess, tInvokedMember, tMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTarget_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodInvocationTarget _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodInvocationTarget_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_21_1_preparereturnvalue_bindingFB(
			MethodInvocationTarget _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodInvocationTarget _this) {
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

	public static final Object[] pattern_MethodInvocationTarget_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodInvocationTarget _this) {
		Object[] result_pattern_MethodInvocationTarget_21_1_preparereturnvalue_binding = pattern_MethodInvocationTarget_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationTarget_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodInvocationTarget_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationTarget_21_1_preparereturnvalue_black = pattern_MethodInvocationTarget_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodInvocationTarget_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodInvocationTarget_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodInvocationTarget_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_method) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInvocation = _edge_method.getSrc();
		if (tmpInvocation instanceof AbstractMethodInvocation) {
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) tmpInvocation;
			EObject tmpMInvokedMember = _edge_method.getTrg();
			if (tmpMInvokedMember instanceof AbstractMethodDeclaration) {
				AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) tmpMInvokedMember;
				if (mInvokedMember.equals(invocation.getMethod())) {
					for (MDefinition mMember : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(invocation, MDefinition.class, "mMethodInvocations")) {
						_result.add(new Object[] { invocation, mInvokedMember, mMember, _edge_method });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodInvocationTarget_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodInvocationTarget _this, Match match, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, invocation, mInvokedMember, mMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTarget_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodInvocationTarget _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodInvocationTarget_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_24_1_prepare_blackB(MethodInvocationTarget _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodInvocationTarget_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tAccess");
		EObject _localVariable_1 = targetMatch.getObject("tInvokedMember");
		EObject _localVariable_2 = targetMatch.getObject("tMember");
		EObject _localVariable_3 = sourceMatch.getObject("invocation");
		EObject _localVariable_4 = sourceMatch.getObject("mInvokedMember");
		EObject _localVariable_5 = sourceMatch.getObject("mMember");
		EObject tmpTAccess = _localVariable_0;
		EObject tmpTInvokedMember = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpInvocation = _localVariable_3;
		EObject tmpMInvokedMember = _localVariable_4;
		EObject tmpMMember = _localVariable_5;
		if (tmpTAccess instanceof TCall) {
			TCall tAccess = (TCall) tmpTAccess;
			if (tmpTInvokedMember instanceof TMethodDefinition) {
				TMethodDefinition tInvokedMember = (TMethodDefinition) tmpTInvokedMember;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					if (tmpInvocation instanceof AbstractMethodInvocation) {
						AbstractMethodInvocation invocation = (AbstractMethodInvocation) tmpInvocation;
						if (tmpMInvokedMember instanceof AbstractMethodDeclaration) {
							AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) tmpMInvokedMember;
							if (tmpMMember instanceof MDefinition) {
								MDefinition mMember = (MDefinition) tmpMMember;
								return new Object[] { tAccess, tInvokedMember, tMember, invocation, mInvokedMember,
										mMember, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_blackBBBBBBBB(TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, Match sourceMatch, Match targetMatch) {
		if (!tInvokedMember.equals(tMember)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_binding = pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_binding != null) {
			TCall tAccess = (TCall) result_pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_binding[0];
			TMethodDefinition tInvokedMember = (TMethodDefinition) result_pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_binding[1];
			TMember tMember = (TMember) result_pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_binding[2];
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result_pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_binding[3];
			AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) result_pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_binding[4];
			MDefinition mMember = (MDefinition) result_pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_black = pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember, sourceMatch, targetMatch);
			if (result_pattern_MethodInvocationTarget_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_24_3_solvecsp_bindingFBBBBBBBBB(
			MethodInvocationTarget _this, TCall tAccess, TMethodDefinition tInvokedMember, TMember tMember,
			AbstractMethodInvocation invocation, AbstractMethodDeclaration mInvokedMember, MDefinition mMember,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tAccess, tInvokedMember, tMember, invocation,
				mInvokedMember, mMember, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTarget_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			MethodInvocationTarget _this, TCall tAccess, TMethodDefinition tInvokedMember, TMember tMember,
			AbstractMethodInvocation invocation, AbstractMethodDeclaration mInvokedMember, MDefinition mMember,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodInvocationTarget_24_3_solvecsp_binding = pattern_MethodInvocationTarget_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember, sourceMatch, targetMatch);
		if (result_pattern_MethodInvocationTarget_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTarget_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodInvocationTarget_24_3_solvecsp_black = pattern_MethodInvocationTarget_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodInvocationTarget_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTarget_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_24_5_matchcorrcontext_blackBBBBBBFFFBB(
			TCall tAccess, TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInvokedMember.equals(tMember)) {
			if (!sourceMatch.equals(targetMatch)) {
				for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
					if (tMember.equals(mMemberToTMember.getTarget())) {
						for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tAccess, AbstractMethodInvocationToTAccess.class,
										"target")) {
							if (invocation.equals(invocationToTAccess.getSource())) {
								for (MDefinitionToTMember mInvokedMemberToTInvokedMember : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(tInvokedMember, MDefinitionToTMember.class,
												"target")) {
									if (!mInvokedMemberToTInvokedMember.equals(mMemberToTMember)) {
										if (mInvokedMember.equals(mInvokedMemberToTInvokedMember.getSource())) {
											_result.add(new Object[] { tAccess, tInvokedMember, tMember, invocation,
													mInvokedMember, mMember, mMemberToTMember, invocationToTAccess,
													mInvokedMemberToTInvokedMember, sourceMatch, targetMatch });
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

	public static final Object[] pattern_MethodInvocationTarget_24_5_matchcorrcontext_greenBBBBBF(
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinitionToTMember mInvokedMemberToTInvokedMember, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodInvocationTarget";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mMemberToTMember);
		ccMatch.getAllContextElements().add(invocationToTAccess);
		ccMatch.getAllContextElements().add(mInvokedMemberToTInvokedMember);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember, sourceMatch,
				targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodInvocationTarget_24_6_createcorrespondence_blackBBBBBBB(TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, CCMatch ccMatch) {
		if (!tInvokedMember.equals(tMember)) {
			return new Object[] { tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodInvocationTarget_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodInvocationTarget";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationTarget_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_27_1_matchtggpattern_blackBBB(
			AbstractMethodInvocation invocation, AbstractMethodDeclaration mInvokedMember, MDefinition mMember) {
		if (mInvokedMember.equals(invocation.getMethod())) {
			if (mMember.getMMethodInvocations().contains(invocation)) {
				return new Object[] { invocation, mInvokedMember, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTarget_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTarget_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_28_1_matchtggpattern_blackBBB(TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember) {
		if (!tInvokedMember.equals(tMember)) {
			if (tMember.getAccessing().contains(tAccess)) {
				if (tInvokedMember.equals(tAccess.getTarget())) {
					return new Object[] { tAccess, tInvokedMember, tMember };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTarget_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTarget_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_1_createresult_blackB(MethodInvocationTarget _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodInvocationTarget_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TCall tAccess) {
		if (ruleResult.getTargetObjects().contains(tAccess)) {
			return new Object[] { ruleResult, tAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMemberToTMember) {
		if (ruleResult.getCorrObjects().contains(mMemberToTMember)) {
			return new Object[] { ruleResult, mMemberToTMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mMember) {
		if (ruleResult.getSourceObjects().contains(mMember)) {
			return new Object[] { ruleResult, mMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, AbstractMethodInvocation invocation) {
		if (ruleResult.getSourceObjects().contains(invocation)) {
			return new Object[] { ruleResult, invocation };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, AbstractMethodInvocationToTAccess invocationToTAccess) {
		if (ruleResult.getCorrObjects().contains(invocationToTAccess)) {
			return new Object[] { ruleResult, invocationToTAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, TMethodDefinition tInvokedMember) {
		if (ruleResult.getTargetObjects().contains(tInvokedMember)) {
			return new Object[] { ruleResult, tInvokedMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mInvokedMemberToTInvokedMember) {
		if (ruleResult.getCorrObjects().contains(mInvokedMemberToTInvokedMember)) {
			return new Object[] { ruleResult, mInvokedMemberToTInvokedMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, AbstractMethodDeclaration mInvokedMember) {
		if (ruleResult.getSourceObjects().contains(mInvokedMember)) {
			return new Object[] { ruleResult, mInvokedMember };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTarget_29_2_isapplicablecore_blackFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mMemberToTMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mInvokedMemberToTInvokedMemberList : ruleEntryContainer.getRuleEntryList()) {
				if (!mInvokedMemberToTInvokedMemberList.equals(mMemberToTMemberList)) {
					for (EObject tmpMMemberToTMember : mMemberToTMemberList.getEntryObjects()) {
						if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
							MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
							TMember tMember = mMemberToTMember.getTarget();
							if (tMember != null) {
								BodyDeclaration tmpMMember = mMemberToTMember.getSource();
								if (tmpMMember instanceof MDefinition) {
									MDefinition mMember = (MDefinition) tmpMMember;
									if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											mMemberToTMember) == null) {
										if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, tMember) == null) {
											if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_3BB(
													ruleResult, mMember) == null) {
												for (EObject tmpMInvokedMemberToTInvokedMember : mInvokedMemberToTInvokedMemberList
														.getEntryObjects()) {
													if (tmpMInvokedMemberToTInvokedMember instanceof MDefinitionToTMember) {
														MDefinitionToTMember mInvokedMemberToTInvokedMember = (MDefinitionToTMember) tmpMInvokedMemberToTInvokedMember;
														if (!mInvokedMemberToTInvokedMember.equals(mMemberToTMember)) {
															TMember tmpTInvokedMember = mInvokedMemberToTInvokedMember
																	.getTarget();
															if (tmpTInvokedMember instanceof TMethodDefinition) {
																TMethodDefinition tInvokedMember = (TMethodDefinition) tmpTInvokedMember;
																if (!tInvokedMember.equals(tMember)) {
																	BodyDeclaration tmpMInvokedMember = mInvokedMemberToTInvokedMember
																			.getSource();
																	if (tmpMInvokedMember instanceof AbstractMethodDeclaration) {
																		AbstractMethodDeclaration mInvokedMember = (AbstractMethodDeclaration) tmpMInvokedMember;
																		if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_7BB(
																				ruleResult,
																				mInvokedMemberToTInvokedMember) == null) {
																			if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_6BB(
																					ruleResult,
																					tInvokedMember) == null) {
																				if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_8BB(
																						ruleResult,
																						mInvokedMember) == null) {
																					for (TAccess tmpTAccess : tMember
																							.getAccessing()) {
																						if (tmpTAccess instanceof TCall) {
																							TCall tAccess = (TCall) tmpTAccess;
																							if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_0BB(
																									ruleResult,
																									tAccess) == null) {
																								for (AbstractMethodInvocation invocation : mMember
																										.getMMethodInvocations()) {
																									if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_4BB(
																											ruleResult,
																											invocation) == null) {
																										for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
																												.getOppositeReferenceTyped(
																														tAccess,
																														AbstractMethodInvocationToTAccess.class,
																														"target")) {
																											if (invocation
																													.equals(invocationToTAccess
																															.getSource())) {
																												if (pattern_MethodInvocationTarget_29_2_isapplicablecore_black_nac_5BB(
																														ruleResult,
																														invocationToTAccess) == null) {
																													_result.add(
																															new Object[] {
																																	mMemberToTMemberList,
																																	tAccess,
																																	tMember,
																																	mMemberToTMember,
																																	mMember,
																																	invocation,
																																	invocationToTAccess,
																																	mInvokedMemberToTInvokedMemberList,
																																	tInvokedMember,
																																	mInvokedMemberToTInvokedMember,
																																	mInvokedMember,
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
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_3_solveCSP_bindingFBBBBBBBBBBBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch, TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess, MDefinitionToTMember mInvokedMemberToTInvokedMember,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tAccess, tInvokedMember, tMember,
				invocation, mInvokedMember, mMember, mMemberToTMember, invocationToTAccess,
				mInvokedMemberToTInvokedMember, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAccess, tInvokedMember, tMember, invocation,
					mInvokedMember, mMember, mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTarget_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			MethodInvocationTarget _this, IsApplicableMatch isApplicableMatch, TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess, MDefinitionToTMember mInvokedMemberToTInvokedMember,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodInvocationTarget_29_3_solveCSP_binding = pattern_MethodInvocationTarget_29_3_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember,
				mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember, ruleResult);
		if (result_pattern_MethodInvocationTarget_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTarget_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationTarget_29_3_solveCSP_black = pattern_MethodInvocationTarget_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationTarget_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAccess, tInvokedMember, tMember, invocation,
						mInvokedMember, mMember, mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTarget_29_4_checkCSP_expressionFBB(MethodInvocationTarget _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_5_checknacs_blackBBBBBBBBB(TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess,
			MDefinitionToTMember mInvokedMemberToTInvokedMember) {
		if (!tInvokedMember.equals(tMember)) {
			if (!mInvokedMemberToTInvokedMember.equals(mMemberToTMember)) {
				return new Object[] { tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember,
						mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_6_perform_blackBBBBBBBBBB(TCall tAccess,
			TMethodDefinition tInvokedMember, TMember tMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, MDefinition mMember, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess, MDefinitionToTMember mInvokedMemberToTInvokedMember,
			ModelgeneratorRuleResult ruleResult) {
		if (!tInvokedMember.equals(tMember)) {
			if (!mInvokedMemberToTInvokedMember.equals(mMemberToTMember)) {
				return new Object[] { tAccess, tInvokedMember, tMember, invocation, mInvokedMember, mMember,
						mMemberToTMember, invocationToTAccess, mInvokedMemberToTInvokedMember, ruleResult };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTarget_29_6_perform_greenBBBBB(TCall tAccess,
			TMethodDefinition tInvokedMember, AbstractMethodInvocation invocation,
			AbstractMethodDeclaration mInvokedMember, ModelgeneratorRuleResult ruleResult) {
		invocation.setMethod(mInvokedMember);
		tAccess.setTarget(tInvokedMember);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tAccess, tInvokedMember, invocation, mInvokedMember, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodInvocationTarget_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodInvocationTargetImpl
