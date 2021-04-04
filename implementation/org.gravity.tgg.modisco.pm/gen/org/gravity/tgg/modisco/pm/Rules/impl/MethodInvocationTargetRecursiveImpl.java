/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.BodyDeclaration;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.pm.AbstractMethodInvocationToTAccess;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;

import org.gravity.tgg.modisco.pm.Rules.MethodInvocationTargetRecursive;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.TAccess;
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
 * An implementation of the model object '<em><b>Method Invocation Target Recursive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodInvocationTargetRecursiveImpl extends AbstractRuleImpl implements MethodInvocationTargetRecursive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodInvocationTargetRecursiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodInvocationTargetRecursive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AbstractMethodInvocation invocation,
			MAbstractMethodDefinition mMember) {

		Object[] result1_black = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_0_1_initialbindings_blackBBBB(this, match, invocation,
						mMember);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[invocation] = " + invocation + ", " + "[mMember] = " + mMember + ".");
		}

		Object[] result2_bindingAndBlack = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, invocation,
						mMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[invocation] = " + invocation + ", " + "[mMember] = " + mMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodInvocationTargetRecursiveImpl.pattern_MethodInvocationTargetRecursive_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_0_4_collectelementstobetranslated_blackBBB(match,
							invocation, mMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[invocation] = " + invocation + ", " + "[mMember] = " + mMember + ".");
			}
			MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_0_4_collectelementstobetranslated_greenBBBFF(match,
							invocation, mMember);
			//nothing EMoflonEdge invocation__mMember____method = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mMember__invocation____usages = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_0_5_collectcontextelements_blackBBB(match, invocation,
							mMember);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[invocation] = " + invocation + ", " + "[mMember] = " + mMember + ".");
			}
			MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_0_5_collectcontextelements_greenBBBF(match, invocation,
							mMember);
			//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result5_green[3];

			// 
			MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_0_6_registerobjectstomatch_expressionBBBB(this, match,
							invocation, mMember);
			return MethodInvocationTargetRecursiveImpl.pattern_MethodInvocationTargetRecursive_0_7_expressionF();
		} else {
			return MethodInvocationTargetRecursiveImpl.pattern_MethodInvocationTargetRecursive_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[0];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_bindingAndBlack[1];
		TMember tMember = (TMember) result1_bindingAndBlack[2];
		AbstractMethodInvocation invocation = (AbstractMethodInvocation) result1_bindingAndBlack[3];
		MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) result1_bindingAndBlack[4];
		TCall tAccess = (TCall) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_1_1_performtransformation_greenBB(tMember, tAccess);

		Object[] result2_green = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
						mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mMemberToTMember] = " + mMemberToTMember + ", " + "[invocationToTAccess] = "
					+ invocationToTAccess + ", " + "[tMember] = " + tMember + ", " + "[invocation] = " + invocation
					+ ", " + "[mMember] = " + mMember + ", " + "[tAccess] = " + tAccess + ".");
		}
		MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, tMember,
						invocation, mMember, tAccess);
		//nothing EMoflonEdge invocation__mMember____method = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mMember__invocation____usages = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tAccess__tMember____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tMember__tAccess____accessedBy = (EMoflonEdge) result3_green[8];

		// 
		// 
		MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess);
		return MethodInvocationTargetRecursiveImpl.pattern_MethodInvocationTargetRecursive_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AbstractMethodInvocation invocation = (AbstractMethodInvocation) result2_binding[0];
		MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) result2_binding[1];
		for (Object[] result2_black : MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_2_2_corematch_blackFFFBBFB(invocation, mMember, match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[0];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[1];
			TMember tMember = (TMember) result2_black[2];
			TCall tAccess = (TCall) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_2_3_findcontext_blackBBBBBB(mMemberToTMember,
							invocationToTAccess, tMember, invocation, mMember, tAccess)) {
				Object[] result3_green = MethodInvocationTargetRecursiveImpl
						.pattern_MethodInvocationTargetRecursive_2_3_findcontext_greenBBBBBBFFFFFFFFFF(mMemberToTMember,
								invocationToTAccess, tMember, invocation, mMember, tAccess);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge invocation__mMember____method = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mMember__invocation____usages = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tMember__tAccess____accessing = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tAccess__tMember____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = MethodInvocationTargetRecursiveImpl
						.pattern_MethodInvocationTargetRecursive_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, mMemberToTMember, invocationToTAccess, tMember, invocation, mMember,
								tAccess);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMemberToTMember] = "
							+ mMemberToTMember + ", " + "[invocationToTAccess] = " + invocationToTAccess + ", "
							+ "[tMember] = " + tMember + ", " + "[invocation] = " + invocation + ", " + "[mMember] = "
							+ mMember + ", " + "[tAccess] = " + tAccess + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodInvocationTargetRecursiveImpl
						.pattern_MethodInvocationTargetRecursive_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodInvocationTargetRecursiveImpl
							.pattern_MethodInvocationTargetRecursive_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodInvocationTargetRecursiveImpl
							.pattern_MethodInvocationTargetRecursive_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MethodInvocationTargetRecursiveImpl.pattern_MethodInvocationTargetRecursive_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AbstractMethodInvocation invocation,
			MAbstractMethodDefinition mMember) {
		match.registerObject("invocation", invocation);
		match.registerObject("mMember", mMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AbstractMethodInvocation invocation,
			MAbstractMethodDefinition mMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess, TMember tMember, AbstractMethodInvocation invocation,
			MAbstractMethodDefinition mMember, TCall tAccess) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("tAccess", tAccess);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mMemberToTMember, EObject invocationToTAccess,
			EObject tMember, EObject invocation, EObject mMember, EObject tAccess) {
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("tAccess", tAccess);

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
	public boolean isAppropriate_BWD(Match match, TMember tMember, TCall tAccess) {

		Object[] result1_black = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_10_1_initialbindings_blackBBBB(this, match, tMember, tAccess);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ".");
		}

		Object[] result2_bindingAndBlack = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tMember,
						tAccess);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_10_4_collectelementstobetranslated_blackBBB(match, tMember,
							tAccess);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ".");
			}
			MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_10_4_collectelementstobetranslated_greenBBBFF(match,
							tMember, tAccess);
			//nothing EMoflonEdge tAccess__tMember____target = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tMember__tAccess____accessedBy = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_10_5_collectcontextelements_blackBBB(match, tMember,
							tAccess);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMember] = " + tMember + ", " + "[tAccess] = " + tAccess + ".");
			}
			MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_10_5_collectcontextelements_greenBBBFF(match, tMember,
							tAccess);
			//nothing EMoflonEdge tMember__tAccess____accessing = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tAccess__tMember____source = (EMoflonEdge) result5_green[4];

			// 
			MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_10_6_registerobjectstomatch_expressionBBBB(this, match,
							tMember, tAccess);
			return MethodInvocationTargetRecursiveImpl.pattern_MethodInvocationTargetRecursive_10_7_expressionF();
		} else {
			return MethodInvocationTargetRecursiveImpl.pattern_MethodInvocationTargetRecursive_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[0];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_bindingAndBlack[1];
		TMember tMember = (TMember) result1_bindingAndBlack[2];
		AbstractMethodInvocation invocation = (AbstractMethodInvocation) result1_bindingAndBlack[3];
		MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) result1_bindingAndBlack[4];
		TCall tAccess = (TCall) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_11_1_performtransformation_greenBB(invocation, mMember);

		Object[] result2_green = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
						mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mMemberToTMember] = " + mMemberToTMember + ", " + "[invocationToTAccess] = "
					+ invocationToTAccess + ", " + "[tMember] = " + tMember + ", " + "[invocation] = " + invocation
					+ ", " + "[mMember] = " + mMember + ", " + "[tAccess] = " + tAccess + ".");
		}
		MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, tMember,
						invocation, mMember, tAccess);
		//nothing EMoflonEdge invocation__mMember____method = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mMember__invocation____usages = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tAccess__tMember____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tMember__tAccess____accessedBy = (EMoflonEdge) result3_green[8];

		// 
		// 
		MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess);
		return MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMember tMember = (TMember) result2_binding[0];
		TCall tAccess = (TCall) result2_binding[1];
		for (Object[] result2_black : MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_12_2_corematch_blackFFBFFBB(tMember, tAccess, match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[0];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[1];
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result2_black[3];
			MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) result2_black[4];
			// ForEach 
			for (Object[] result3_black : MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_12_3_findcontext_blackBBBBBB(mMemberToTMember,
							invocationToTAccess, tMember, invocation, mMember, tAccess)) {
				Object[] result3_green = MethodInvocationTargetRecursiveImpl
						.pattern_MethodInvocationTargetRecursive_12_3_findcontext_greenBBBBBBFFFFFFFFFF(
								mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mMember__invocation____mMethodInvocations = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tMember__tAccess____accessing = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tAccess__tMember____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tAccess__tMember____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tMember__tAccess____accessedBy = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = MethodInvocationTargetRecursiveImpl
						.pattern_MethodInvocationTargetRecursive_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, mMemberToTMember, invocationToTAccess, tMember, invocation, mMember,
								tAccess);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMemberToTMember] = "
							+ mMemberToTMember + ", " + "[invocationToTAccess] = " + invocationToTAccess + ", "
							+ "[tMember] = " + tMember + ", " + "[invocation] = " + invocation + ", " + "[mMember] = "
							+ mMember + ", " + "[tAccess] = " + tAccess + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodInvocationTargetRecursiveImpl
						.pattern_MethodInvocationTargetRecursive_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodInvocationTargetRecursiveImpl
							.pattern_MethodInvocationTargetRecursive_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodInvocationTargetRecursiveImpl
							.pattern_MethodInvocationTargetRecursive_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_12_7_expressionFB(ruleresult);
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
			AbstractMethodInvocationToTAccess invocationToTAccess, TMember tMember, AbstractMethodInvocation invocation,
			MAbstractMethodDefinition mMember, TCall tAccess) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("tAccess", tAccess);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mMemberToTMember, EObject invocationToTAccess,
			EObject tMember, EObject invocation, EObject mMember, EObject tAccess) {
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("tAccess", tAccess);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_31(EMoflonEdge _edge_target) {

		Object[] result1_bindingAndBlack = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_20_2_testcorematchandDECs_blackFFB(_edge_target)) {
			TMember tMember = (TMember) result2_black[0];
			TCall tAccess = (TCall) result2_black[1];
			Object[] result2_green = MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tMember, tAccess)) {
				// 
				if (MethodInvocationTargetRecursiveImpl
						.pattern_MethodInvocationTargetRecursive_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodInvocationTargetRecursiveImpl
							.pattern_MethodInvocationTargetRecursive_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodInvocationTargetRecursiveImpl
							.pattern_MethodInvocationTargetRecursive_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationTargetRecursiveImpl.pattern_MethodInvocationTargetRecursive_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_33(EMoflonEdge _edge_method) {

		Object[] result1_bindingAndBlack = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_21_2_testcorematchandDECs_blackFFB(_edge_method)) {
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result2_black[0];
			MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) result2_black[1];
			Object[] result2_green = MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, invocation, mMember)) {
				// 
				if (MethodInvocationTargetRecursiveImpl
						.pattern_MethodInvocationTargetRecursive_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodInvocationTargetRecursiveImpl
							.pattern_MethodInvocationTargetRecursive_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodInvocationTargetRecursiveImpl
							.pattern_MethodInvocationTargetRecursive_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationTargetRecursiveImpl.pattern_MethodInvocationTargetRecursive_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodInvocationTargetRecursive");
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
		ruleResult.setRule("MethodInvocationTargetRecursive");
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

		Object[] result1_black = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TMember tMember = (TMember) result2_bindingAndBlack[0];
		AbstractMethodInvocation invocation = (AbstractMethodInvocation) result2_bindingAndBlack[1];
		MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) result2_bindingAndBlack[2];
		TCall tAccess = (TCall) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, tMember,
						invocation, mMember, tAccess, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tMember] = " + tMember + ", " + "[invocation] = " + invocation + ", " + "[mMember] = " + mMember
					+ ", " + "[tAccess] = " + tAccess + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_24_5_matchcorrcontext_blackFFBBBBBB(tMember, invocation,
							mMember, tAccess, sourceMatch, targetMatch)) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result5_black[0];
				AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result5_black[1];
				Object[] result5_green = MethodInvocationTargetRecursiveImpl
						.pattern_MethodInvocationTargetRecursive_24_5_matchcorrcontext_greenBBBBF(mMemberToTMember,
								invocationToTAccess, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodInvocationTargetRecursiveImpl
						.pattern_MethodInvocationTargetRecursive_24_6_createcorrespondence_blackBBBBB(tMember,
								invocation, mMember, tAccess, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tMember] = " + tMember
							+ ", " + "[invocation] = " + invocation + ", " + "[mMember] = " + mMember + ", "
							+ "[tAccess] = " + tAccess + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = MethodInvocationTargetRecursiveImpl
						.pattern_MethodInvocationTargetRecursive_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodInvocationTargetRecursiveImpl
						.pattern_MethodInvocationTargetRecursive_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodInvocationTargetRecursiveImpl.pattern_MethodInvocationTargetRecursive_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TMember tMember, AbstractMethodInvocation invocation,
			MAbstractMethodDefinition mMember, TCall tAccess, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember) {// 
		Object[] result1_black = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_27_1_matchtggpattern_blackBB(invocation, mMember);
		if (result1_black != null) {
			return MethodInvocationTargetRecursiveImpl.pattern_MethodInvocationTargetRecursive_27_2_expressionF();
		} else {
			return MethodInvocationTargetRecursiveImpl.pattern_MethodInvocationTargetRecursive_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMember tMember, TCall tAccess) {// 
		Object[] result1_black = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_28_1_matchtggpattern_blackBB(tMember, tAccess);
		if (result1_black != null) {
			return MethodInvocationTargetRecursiveImpl.pattern_MethodInvocationTargetRecursive_28_2_expressionF();
		} else {
			return MethodInvocationTargetRecursiveImpl.pattern_MethodInvocationTargetRecursive_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember mMemberToTMemberParameter) {

		Object[] result1_black = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_29_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mMemberToTMemberList = (RuleEntryList) result2_black[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[1];
			TMember tMember = (TMember) result2_black[2];
			TCall tAccess = (TCall) result2_black[3];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[4];
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result2_black[5];
			MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) result2_black[6];

			Object[] result3_bindingAndBlack = MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, mMemberToTMember, invocationToTAccess, tMember, invocation, mMember,
							tAccess, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMemberToTMember] = "
						+ mMemberToTMember + ", " + "[invocationToTAccess] = " + invocationToTAccess + ", "
						+ "[tMember] = " + tMember + ", " + "[invocation] = " + invocation + ", " + "[mMember] = "
						+ mMember + ", " + "[tAccess] = " + tAccess + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodInvocationTargetRecursiveImpl
					.pattern_MethodInvocationTargetRecursive_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodInvocationTargetRecursiveImpl
						.pattern_MethodInvocationTargetRecursive_29_5_checknacs_blackBBBBBB(mMemberToTMember,
								invocationToTAccess, tMember, invocation, mMember, tAccess);
				if (result5_black != null) {

					Object[] result6_black = MethodInvocationTargetRecursiveImpl
							.pattern_MethodInvocationTargetRecursive_29_6_perform_blackBBBBBBB(mMemberToTMember,
									invocationToTAccess, tMember, invocation, mMember, tAccess, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mMemberToTMember] = "
								+ mMemberToTMember + ", " + "[invocationToTAccess] = " + invocationToTAccess + ", "
								+ "[tMember] = " + tMember + ", " + "[invocation] = " + invocation + ", "
								+ "[mMember] = " + mMember + ", " + "[tAccess] = " + tAccess + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					MethodInvocationTargetRecursiveImpl.pattern_MethodInvocationTargetRecursive_29_6_perform_greenBBBBB(
							tMember, invocation, mMember, tAccess, ruleResult);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationTargetRecursiveImpl
				.pattern_MethodInvocationTargetRecursive_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			AbstractMethodInvocationToTAccess invocationToTAccess, TMember tMember, AbstractMethodInvocation invocation,
			MAbstractMethodDefinition mMember, TCall tAccess, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("tAccess", tAccess);
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
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPROPRIATE_FWD__MATCH_ABSTRACTMETHODINVOCATION_MABSTRACTMETHODDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (AbstractMethodInvocation) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ABSTRACTMETHODINVOCATION_MABSTRACTMETHODDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AbstractMethodInvocation) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2));
			return null;
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ABSTRACTMETHODINVOCATION_MABSTRACTMETHODDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AbstractMethodInvocation) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_ABSTRACTMETHODINVOCATIONTOTACCESS_TMEMBER_ABSTRACTMETHODINVOCATION_MABSTRACTMETHODDEFINITION_TCALL:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (AbstractMethodInvocationToTAccess) arguments.get(2),
					(TMember) arguments.get(3), (AbstractMethodInvocation) arguments.get(4),
					(MAbstractMethodDefinition) arguments.get(5), (TCall) arguments.get(6));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPROPRIATE_BWD__MATCH_TMEMBER_TCALL:
			return isAppropriate_BWD((Match) arguments.get(0), (TMember) arguments.get(1), (TCall) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMEMBER_TCALL:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMember) arguments.get(1), (TCall) arguments.get(2));
			return null;
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMEMBER_TCALL:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TCall) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_ABSTRACTMETHODINVOCATIONTOTACCESS_TMEMBER_ABSTRACTMETHODINVOCATION_MABSTRACTMETHODDEFINITION_TCALL:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (AbstractMethodInvocationToTAccess) arguments.get(2),
					(TMember) arguments.get(3), (AbstractMethodInvocation) arguments.get(4),
					(MAbstractMethodDefinition) arguments.get(5), (TCall) arguments.get(6));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_31__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_31((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_33__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_33((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPLICABLE_SOLVE_CSP_CC__TMEMBER_ABSTRACTMETHODINVOCATION_MABSTRACTMETHODDEFINITION_TCALL_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TMember) arguments.get(0), (AbstractMethodInvocation) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2), (TCall) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___CHECK_DEC_FWD__ABSTRACTMETHODINVOCATION_MABSTRACTMETHODDEFINITION:
			return checkDEC_FWD((AbstractMethodInvocation) arguments.get(0),
					(MAbstractMethodDefinition) arguments.get(1));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___CHECK_DEC_BWD__TMEMBER_TCALL:
			return checkDEC_BWD((TMember) arguments.get(0), (TCall) arguments.get(1));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_ABSTRACTMETHODINVOCATIONTOTACCESS_TMEMBER_ABSTRACTMETHODINVOCATION_MABSTRACTMETHODDEFINITION_TCALL_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (AbstractMethodInvocationToTAccess) arguments.get(2),
					(TMember) arguments.get(3), (AbstractMethodInvocation) arguments.get(4),
					(MAbstractMethodDefinition) arguments.get(5), (TCall) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.METHOD_INVOCATION_TARGET_RECURSIVE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_0_1_initialbindings_blackBBBB(
			MethodInvocationTargetRecursive _this, Match match, AbstractMethodInvocation invocation,
			MAbstractMethodDefinition mMember) {
		return new Object[] { _this, match, invocation, mMember };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_0_2_SolveCSP_bindingFBBBB(
			MethodInvocationTargetRecursive _this, Match match, AbstractMethodInvocation invocation,
			MAbstractMethodDefinition mMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, invocation, mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, invocation, mMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_0_2_SolveCSP_bindingAndBlackFBBBB(
			MethodInvocationTargetRecursive _this, Match match, AbstractMethodInvocation invocation,
			MAbstractMethodDefinition mMember) {
		Object[] result_pattern_MethodInvocationTargetRecursive_0_2_SolveCSP_binding = pattern_MethodInvocationTargetRecursive_0_2_SolveCSP_bindingFBBBB(
				_this, match, invocation, mMember);
		if (result_pattern_MethodInvocationTargetRecursive_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTargetRecursive_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodInvocationTargetRecursive_0_2_SolveCSP_black = pattern_MethodInvocationTargetRecursive_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationTargetRecursive_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, invocation, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTargetRecursive_0_3_CheckCSP_expressionFBB(
			MethodInvocationTargetRecursive _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_0_4_collectelementstobetranslated_blackBBB(
			Match match, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember) {
		return new Object[] { match, invocation, mMember };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember) {
		EMoflonEdge invocation__mMember____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String invocation__mMember____method_name_prime = "method";
		String mMember__invocation____usages_name_prime = "usages";
		invocation__mMember____method.setSrc(invocation);
		invocation__mMember____method.setTrg(mMember);
		match.getToBeTranslatedEdges().add(invocation__mMember____method);
		mMember__invocation____usages.setSrc(mMember);
		mMember__invocation____usages.setTrg(invocation);
		match.getToBeTranslatedEdges().add(mMember__invocation____usages);
		invocation__mMember____method.setName(invocation__mMember____method_name_prime);
		mMember__invocation____usages.setName(mMember__invocation____usages_name_prime);
		return new Object[] { match, invocation, mMember, invocation__mMember____method,
				mMember__invocation____usages };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_0_5_collectcontextelements_blackBBB(
			Match match, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember) {
		return new Object[] { match, invocation, mMember };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_0_5_collectcontextelements_greenBBBF(
			Match match, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember) {
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(invocation);
		match.getContextNodes().add(mMember);
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		match.getContextEdges().add(mMember__invocation____mMethodInvocations);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		return new Object[] { match, invocation, mMember, mMember__invocation____mMethodInvocations };
	}

	public static final void pattern_MethodInvocationTargetRecursive_0_6_registerobjectstomatch_expressionBBBB(
			MethodInvocationTargetRecursive _this, Match match, AbstractMethodInvocation invocation,
			MAbstractMethodDefinition mMember) {
		_this.registerObjectsToMatch_FWD(match, invocation, mMember);

	}

	public static final boolean pattern_MethodInvocationTargetRecursive_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTargetRecursive_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("invocationToTAccess");
		EObject _localVariable_2 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("invocation");
		EObject _localVariable_4 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_5 = isApplicableMatch.getObject("tAccess");
		EObject tmpMMemberToTMember = _localVariable_0;
		EObject tmpInvocationToTAccess = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpInvocation = _localVariable_3;
		EObject tmpMMember = _localVariable_4;
		EObject tmpTAccess = _localVariable_5;
		if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
			if (tmpInvocationToTAccess instanceof AbstractMethodInvocationToTAccess) {
				AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) tmpInvocationToTAccess;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					if (tmpInvocation instanceof AbstractMethodInvocation) {
						AbstractMethodInvocation invocation = (AbstractMethodInvocation) tmpInvocation;
						if (tmpMMember instanceof MAbstractMethodDefinition) {
							MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) tmpMMember;
							if (tmpTAccess instanceof TCall) {
								TCall tAccess = (TCall) tmpTAccess;
								return new Object[] { mMemberToTMember, invocationToTAccess, tMember, invocation,
										mMember, tAccess, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_1_1_performtransformation_blackBBBBBBFBB(
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess,
			MethodInvocationTargetRecursive _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			MethodInvocationTargetRecursive _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodInvocationTargetRecursive_1_1_performtransformation_binding = pattern_MethodInvocationTargetRecursive_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodInvocationTargetRecursive_1_1_performtransformation_binding != null) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_MethodInvocationTargetRecursive_1_1_performtransformation_binding[0];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result_pattern_MethodInvocationTargetRecursive_1_1_performtransformation_binding[1];
			TMember tMember = (TMember) result_pattern_MethodInvocationTargetRecursive_1_1_performtransformation_binding[2];
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result_pattern_MethodInvocationTargetRecursive_1_1_performtransformation_binding[3];
			MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) result_pattern_MethodInvocationTargetRecursive_1_1_performtransformation_binding[4];
			TCall tAccess = (TCall) result_pattern_MethodInvocationTargetRecursive_1_1_performtransformation_binding[5];

			Object[] result_pattern_MethodInvocationTargetRecursive_1_1_performtransformation_black = pattern_MethodInvocationTargetRecursive_1_1_performtransformation_blackBBBBBBFBB(
					mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess, _this,
					isApplicableMatch);
			if (result_pattern_MethodInvocationTargetRecursive_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodInvocationTargetRecursive_1_1_performtransformation_black[6];

				return new Object[] { mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_1_1_performtransformation_greenBB(
			TMember tMember, TCall tAccess) {
		tAccess.setTarget(tMember);
		return new Object[] { tMember, tAccess };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mMemberToTMember, EObject invocationToTAccess, EObject tMember,
			EObject invocation, EObject mMember, EObject tAccess) {
		if (!mMemberToTMember.equals(tMember)) {
			if (!mMemberToTMember.equals(tAccess)) {
				if (!invocationToTAccess.equals(mMemberToTMember)) {
					if (!invocationToTAccess.equals(tMember)) {
						if (!invocationToTAccess.equals(mMember)) {
							if (!invocationToTAccess.equals(tAccess)) {
								if (!invocation.equals(mMemberToTMember)) {
									if (!invocation.equals(invocationToTAccess)) {
										if (!invocation.equals(tMember)) {
											if (!invocation.equals(mMember)) {
												if (!invocation.equals(tAccess)) {
													if (!mMember.equals(mMemberToTMember)) {
														if (!mMember.equals(tMember)) {
															if (!mMember.equals(tAccess)) {
																if (!tAccess.equals(tMember)) {
																	return new Object[] { ruleresult, mMemberToTMember,
																			invocationToTAccess, tMember, invocation,
																			mMember, tAccess };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodInvocationTargetRecursive_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject tMember, EObject invocation, EObject mMember, EObject tAccess) {
		EMoflonEdge invocation__mMember____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodInvocationTargetRecursive";
		String invocation__mMember____method_name_prime = "method";
		String mMember__invocation____usages_name_prime = "usages";
		String tAccess__tMember____target_name_prime = "target";
		String tMember__tAccess____accessedBy_name_prime = "accessedBy";
		invocation__mMember____method.setSrc(invocation);
		invocation__mMember____method.setTrg(mMember);
		ruleresult.getTranslatedEdges().add(invocation__mMember____method);
		mMember__invocation____usages.setSrc(mMember);
		mMember__invocation____usages.setTrg(invocation);
		ruleresult.getTranslatedEdges().add(mMember__invocation____usages);
		tAccess__tMember____target.setSrc(tAccess);
		tAccess__tMember____target.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tAccess__tMember____target);
		tMember__tAccess____accessedBy.setSrc(tMember);
		tMember__tAccess____accessedBy.setTrg(tAccess);
		ruleresult.getCreatedEdges().add(tMember__tAccess____accessedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		invocation__mMember____method.setName(invocation__mMember____method_name_prime);
		mMember__invocation____usages.setName(mMember__invocation____usages_name_prime);
		tAccess__tMember____target.setName(tAccess__tMember____target_name_prime);
		tMember__tAccess____accessedBy.setName(tMember__tAccess____accessedBy_name_prime);
		return new Object[] { ruleresult, tMember, invocation, mMember, tAccess, invocation__mMember____method,
				mMember__invocation____usages, tAccess__tMember____target, tMember__tAccess____accessedBy };
	}

	public static final void pattern_MethodInvocationTargetRecursive_1_5_registerobjects_expressionBBBBBBBB(
			MethodInvocationTargetRecursive _this, PerformRuleResult ruleresult, EObject mMemberToTMember,
			EObject invocationToTAccess, EObject tMember, EObject invocation, EObject mMember, EObject tAccess) {
		_this.registerObjects_FWD(ruleresult, mMemberToTMember, invocationToTAccess, tMember, invocation, mMember,
				tAccess);

	}

	public static final PerformRuleResult pattern_MethodInvocationTargetRecursive_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_2_1_preparereturnvalue_bindingFB(
			MethodInvocationTargetRecursive _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodInvocationTargetRecursive _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodInvocationTargetRecursive _this) {
		Object[] result_pattern_MethodInvocationTargetRecursive_2_1_preparereturnvalue_binding = pattern_MethodInvocationTargetRecursive_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationTargetRecursive_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodInvocationTargetRecursive_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationTargetRecursive_2_1_preparereturnvalue_black = pattern_MethodInvocationTargetRecursive_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodInvocationTargetRecursive_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodInvocationTargetRecursive_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodInvocationTargetRecursive";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("invocation");
		EObject _localVariable_1 = match.getObject("mMember");
		EObject tmpInvocation = _localVariable_0;
		EObject tmpMMember = _localVariable_1;
		if (tmpInvocation instanceof AbstractMethodInvocation) {
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) tmpInvocation;
			if (tmpMMember instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) tmpMMember;
				return new Object[] { invocation, mMember, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTargetRecursive_2_2_corematch_blackFFFBBFB(
			AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, Match match) {
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
						_result.add(new Object[] { mMemberToTMember, invocationToTAccess, tMember, invocation, mMember,
								tAccess, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTargetRecursive_2_3_findcontext_blackBBBBBB(
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mMember.getMMethodInvocations().contains(invocation)) {
			if (tMember.equals(mMemberToTMember.getTarget())) {
				if (mMember.equals(invocation.getMethod())) {
					if (tMember.getAccessing().contains(tAccess)) {
						if (mMember.equals(mMemberToTMember.getSource())) {
							if (tAccess.equals(invocationToTAccess.getTarget())) {
								if (invocation.equals(invocationToTAccess.getSource())) {
									_result.add(new Object[] { mMemberToTMember, invocationToTAccess, tMember,
											invocation, mMember, tAccess });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_2_3_findcontext_greenBBBBBBFFFFFFFFFF(
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocation__mMember____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____accessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		String mMemberToTMember__tMember____target_name_prime = "target";
		String invocation__mMember____method_name_prime = "method";
		String mMember__invocation____usages_name_prime = "usages";
		String tMember__tAccess____accessing_name_prime = "accessing";
		String tAccess__tMember____source_name_prime = "source";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		String invocationToTAccess__invocation____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(tAccess);
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(mMember__invocation____mMethodInvocations);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		invocation__mMember____method.setSrc(invocation);
		invocation__mMember____method.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(invocation__mMember____method);
		mMember__invocation____usages.setSrc(mMember);
		mMember__invocation____usages.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(mMember__invocation____usages);
		tMember__tAccess____accessing.setSrc(tMember);
		tMember__tAccess____accessing.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tMember__tAccess____accessing);
		tAccess__tMember____source.setSrc(tAccess);
		tAccess__tMember____source.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess__tMember____source);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__tAccess____target);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__invocation____source);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		invocation__mMember____method.setName(invocation__mMember____method_name_prime);
		mMember__invocation____usages.setName(mMember__invocation____usages_name_prime);
		tMember__tAccess____accessing.setName(tMember__tAccess____accessing_name_prime);
		tAccess__tMember____source.setName(tAccess__tMember____source_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		return new Object[] { mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess,
				isApplicableMatch, mMember__invocation____mMethodInvocations, mMemberToTMember__tMember____target,
				invocation__mMember____method, mMember__invocation____usages, tMember__tAccess____accessing,
				tAccess__tMember____source, mMemberToTMember__mMember____source, invocationToTAccess__tAccess____target,
				invocationToTAccess__invocation____source };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_2_4_solveCSP_bindingFBBBBBBBB(
			MethodInvocationTargetRecursive _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mMemberToTMember, invocationToTAccess,
				tMember, invocation, mMember, tAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, invocationToTAccess, tMember,
					invocation, mMember, tAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			MethodInvocationTargetRecursive _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess) {
		Object[] result_pattern_MethodInvocationTargetRecursive_2_4_solveCSP_binding = pattern_MethodInvocationTargetRecursive_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess);
		if (result_pattern_MethodInvocationTargetRecursive_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTargetRecursive_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationTargetRecursive_2_4_solveCSP_black = pattern_MethodInvocationTargetRecursive_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationTargetRecursive_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, invocationToTAccess, tMember,
						invocation, mMember, tAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTargetRecursive_2_5_checkCSP_expressionFBB(
			MethodInvocationTargetRecursive _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodInvocationTargetRecursive";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationTargetRecursive_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_10_1_initialbindings_blackBBBB(
			MethodInvocationTargetRecursive _this, Match match, TMember tMember, TCall tAccess) {
		return new Object[] { _this, match, tMember, tAccess };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_10_2_SolveCSP_bindingFBBBB(
			MethodInvocationTargetRecursive _this, Match match, TMember tMember, TCall tAccess) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tMember, tAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMember, tAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_10_2_SolveCSP_bindingAndBlackFBBBB(
			MethodInvocationTargetRecursive _this, Match match, TMember tMember, TCall tAccess) {
		Object[] result_pattern_MethodInvocationTargetRecursive_10_2_SolveCSP_binding = pattern_MethodInvocationTargetRecursive_10_2_SolveCSP_bindingFBBBB(
				_this, match, tMember, tAccess);
		if (result_pattern_MethodInvocationTargetRecursive_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTargetRecursive_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodInvocationTargetRecursive_10_2_SolveCSP_black = pattern_MethodInvocationTargetRecursive_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationTargetRecursive_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tMember, tAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTargetRecursive_10_3_CheckCSP_expressionFBB(
			MethodInvocationTargetRecursive _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_10_4_collectelementstobetranslated_blackBBB(
			Match match, TMember tMember, TCall tAccess) {
		return new Object[] { match, tMember, tAccess };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TMember tMember, TCall tAccess) {
		EMoflonEdge tAccess__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAccess__tMember____target_name_prime = "target";
		String tMember__tAccess____accessedBy_name_prime = "accessedBy";
		tAccess__tMember____target.setSrc(tAccess);
		tAccess__tMember____target.setTrg(tMember);
		match.getToBeTranslatedEdges().add(tAccess__tMember____target);
		tMember__tAccess____accessedBy.setSrc(tMember);
		tMember__tAccess____accessedBy.setTrg(tAccess);
		match.getToBeTranslatedEdges().add(tMember__tAccess____accessedBy);
		tAccess__tMember____target.setName(tAccess__tMember____target_name_prime);
		tMember__tAccess____accessedBy.setName(tMember__tAccess____accessedBy_name_prime);
		return new Object[] { match, tMember, tAccess, tAccess__tMember____target, tMember__tAccess____accessedBy };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_10_5_collectcontextelements_blackBBB(
			Match match, TMember tMember, TCall tAccess) {
		return new Object[] { match, tMember, tAccess };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_10_5_collectcontextelements_greenBBBFF(
			Match match, TMember tMember, TCall tAccess) {
		EMoflonEdge tMember__tAccess____accessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tMember);
		match.getContextNodes().add(tAccess);
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
		return new Object[] { match, tMember, tAccess, tMember__tAccess____accessing, tAccess__tMember____source };
	}

	public static final void pattern_MethodInvocationTargetRecursive_10_6_registerobjectstomatch_expressionBBBB(
			MethodInvocationTargetRecursive _this, Match match, TMember tMember, TCall tAccess) {
		_this.registerObjectsToMatch_BWD(match, tMember, tAccess);

	}

	public static final boolean pattern_MethodInvocationTargetRecursive_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTargetRecursive_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("invocationToTAccess");
		EObject _localVariable_2 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("invocation");
		EObject _localVariable_4 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_5 = isApplicableMatch.getObject("tAccess");
		EObject tmpMMemberToTMember = _localVariable_0;
		EObject tmpInvocationToTAccess = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpInvocation = _localVariable_3;
		EObject tmpMMember = _localVariable_4;
		EObject tmpTAccess = _localVariable_5;
		if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
			if (tmpInvocationToTAccess instanceof AbstractMethodInvocationToTAccess) {
				AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) tmpInvocationToTAccess;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					if (tmpInvocation instanceof AbstractMethodInvocation) {
						AbstractMethodInvocation invocation = (AbstractMethodInvocation) tmpInvocation;
						if (tmpMMember instanceof MAbstractMethodDefinition) {
							MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) tmpMMember;
							if (tmpTAccess instanceof TCall) {
								TCall tAccess = (TCall) tmpTAccess;
								return new Object[] { mMemberToTMember, invocationToTAccess, tMember, invocation,
										mMember, tAccess, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_11_1_performtransformation_blackBBBBBBFBB(
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess,
			MethodInvocationTargetRecursive _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			MethodInvocationTargetRecursive _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodInvocationTargetRecursive_11_1_performtransformation_binding = pattern_MethodInvocationTargetRecursive_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodInvocationTargetRecursive_11_1_performtransformation_binding != null) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_MethodInvocationTargetRecursive_11_1_performtransformation_binding[0];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result_pattern_MethodInvocationTargetRecursive_11_1_performtransformation_binding[1];
			TMember tMember = (TMember) result_pattern_MethodInvocationTargetRecursive_11_1_performtransformation_binding[2];
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result_pattern_MethodInvocationTargetRecursive_11_1_performtransformation_binding[3];
			MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) result_pattern_MethodInvocationTargetRecursive_11_1_performtransformation_binding[4];
			TCall tAccess = (TCall) result_pattern_MethodInvocationTargetRecursive_11_1_performtransformation_binding[5];

			Object[] result_pattern_MethodInvocationTargetRecursive_11_1_performtransformation_black = pattern_MethodInvocationTargetRecursive_11_1_performtransformation_blackBBBBBBFBB(
					mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess, _this,
					isApplicableMatch);
			if (result_pattern_MethodInvocationTargetRecursive_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodInvocationTargetRecursive_11_1_performtransformation_black[6];

				return new Object[] { mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_11_1_performtransformation_greenBB(
			AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember) {
		invocation.setMethod(mMember);
		return new Object[] { invocation, mMember };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mMemberToTMember, EObject invocationToTAccess, EObject tMember,
			EObject invocation, EObject mMember, EObject tAccess) {
		if (!mMemberToTMember.equals(tMember)) {
			if (!mMemberToTMember.equals(tAccess)) {
				if (!invocationToTAccess.equals(mMemberToTMember)) {
					if (!invocationToTAccess.equals(tMember)) {
						if (!invocationToTAccess.equals(mMember)) {
							if (!invocationToTAccess.equals(tAccess)) {
								if (!invocation.equals(mMemberToTMember)) {
									if (!invocation.equals(invocationToTAccess)) {
										if (!invocation.equals(tMember)) {
											if (!invocation.equals(mMember)) {
												if (!invocation.equals(tAccess)) {
													if (!mMember.equals(mMemberToTMember)) {
														if (!mMember.equals(tMember)) {
															if (!mMember.equals(tAccess)) {
																if (!tAccess.equals(tMember)) {
																	return new Object[] { ruleresult, mMemberToTMember,
																			invocationToTAccess, tMember, invocation,
																			mMember, tAccess };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodInvocationTargetRecursive_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject tMember, EObject invocation, EObject mMember, EObject tAccess) {
		EMoflonEdge invocation__mMember____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodInvocationTargetRecursive";
		String invocation__mMember____method_name_prime = "method";
		String mMember__invocation____usages_name_prime = "usages";
		String tAccess__tMember____target_name_prime = "target";
		String tMember__tAccess____accessedBy_name_prime = "accessedBy";
		invocation__mMember____method.setSrc(invocation);
		invocation__mMember____method.setTrg(mMember);
		ruleresult.getCreatedEdges().add(invocation__mMember____method);
		mMember__invocation____usages.setSrc(mMember);
		mMember__invocation____usages.setTrg(invocation);
		ruleresult.getCreatedEdges().add(mMember__invocation____usages);
		tAccess__tMember____target.setSrc(tAccess);
		tAccess__tMember____target.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tAccess__tMember____target);
		tMember__tAccess____accessedBy.setSrc(tMember);
		tMember__tAccess____accessedBy.setTrg(tAccess);
		ruleresult.getTranslatedEdges().add(tMember__tAccess____accessedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		invocation__mMember____method.setName(invocation__mMember____method_name_prime);
		mMember__invocation____usages.setName(mMember__invocation____usages_name_prime);
		tAccess__tMember____target.setName(tAccess__tMember____target_name_prime);
		tMember__tAccess____accessedBy.setName(tMember__tAccess____accessedBy_name_prime);
		return new Object[] { ruleresult, tMember, invocation, mMember, tAccess, invocation__mMember____method,
				mMember__invocation____usages, tAccess__tMember____target, tMember__tAccess____accessedBy };
	}

	public static final void pattern_MethodInvocationTargetRecursive_11_5_registerobjects_expressionBBBBBBBB(
			MethodInvocationTargetRecursive _this, PerformRuleResult ruleresult, EObject mMemberToTMember,
			EObject invocationToTAccess, EObject tMember, EObject invocation, EObject mMember, EObject tAccess) {
		_this.registerObjects_BWD(ruleresult, mMemberToTMember, invocationToTAccess, tMember, invocation, mMember,
				tAccess);

	}

	public static final PerformRuleResult pattern_MethodInvocationTargetRecursive_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_12_1_preparereturnvalue_bindingFB(
			MethodInvocationTargetRecursive _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodInvocationTargetRecursive _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodInvocationTargetRecursive _this) {
		Object[] result_pattern_MethodInvocationTargetRecursive_12_1_preparereturnvalue_binding = pattern_MethodInvocationTargetRecursive_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationTargetRecursive_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodInvocationTargetRecursive_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationTargetRecursive_12_1_preparereturnvalue_black = pattern_MethodInvocationTargetRecursive_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodInvocationTargetRecursive_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodInvocationTargetRecursive_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodInvocationTargetRecursive";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_12_2_corematch_bindingFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_MethodInvocationTargetRecursive_12_2_corematch_blackFFBFFBB(
			TMember tMember, TCall tAccess, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
			BodyDeclaration tmpMMember = mMemberToTMember.getSource();
			if (tmpMMember instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) tmpMMember;
				for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tAccess, AbstractMethodInvocationToTAccess.class, "target")) {
					AbstractMethodInvocation invocation = invocationToTAccess.getSource();
					if (invocation != null) {
						_result.add(new Object[] { mMemberToTMember, invocationToTAccess, tMember, invocation, mMember,
								tAccess, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTargetRecursive_12_3_findcontext_blackBBBBBB(
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mMember.getMMethodInvocations().contains(invocation)) {
			if (tMember.equals(mMemberToTMember.getTarget())) {
				if (tMember.getAccessing().contains(tAccess)) {
					if (mMember.equals(mMemberToTMember.getSource())) {
						if (tMember.equals(tAccess.getTarget())) {
							if (tAccess.equals(invocationToTAccess.getTarget())) {
								if (invocation.equals(invocationToTAccess.getSource())) {
									_result.add(new Object[] { mMemberToTMember, invocationToTAccess, tMember,
											invocation, mMember, tAccess });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_12_3_findcontext_greenBBBBBBFFFFFFFFFF(
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMember__invocation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____accessing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAccess____accessedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMember__invocation____mMethodInvocations_name_prime = "mMethodInvocations";
		String mMemberToTMember__tMember____target_name_prime = "target";
		String tMember__tAccess____accessing_name_prime = "accessing";
		String tAccess__tMember____source_name_prime = "source";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String tAccess__tMember____target_name_prime = "target";
		String tMember__tAccess____accessedBy_name_prime = "accessedBy";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		String invocationToTAccess__invocation____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(tAccess);
		mMember__invocation____mMethodInvocations.setSrc(mMember);
		mMember__invocation____mMethodInvocations.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(mMember__invocation____mMethodInvocations);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		tMember__tAccess____accessing.setSrc(tMember);
		tMember__tAccess____accessing.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tMember__tAccess____accessing);
		tAccess__tMember____source.setSrc(tAccess);
		tAccess__tMember____source.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess__tMember____source);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		tAccess__tMember____target.setSrc(tAccess);
		tAccess__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAccess__tMember____target);
		tMember__tAccess____accessedBy.setSrc(tMember);
		tMember__tAccess____accessedBy.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(tMember__tAccess____accessedBy);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__tAccess____target);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__invocation____source);
		mMember__invocation____mMethodInvocations.setName(mMember__invocation____mMethodInvocations_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		tMember__tAccess____accessing.setName(tMember__tAccess____accessing_name_prime);
		tAccess__tMember____source.setName(tAccess__tMember____source_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		tAccess__tMember____target.setName(tAccess__tMember____target_name_prime);
		tMember__tAccess____accessedBy.setName(tMember__tAccess____accessedBy_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		return new Object[] { mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess,
				isApplicableMatch, mMember__invocation____mMethodInvocations, mMemberToTMember__tMember____target,
				tMember__tAccess____accessing, tAccess__tMember____source, mMemberToTMember__mMember____source,
				tAccess__tMember____target, tMember__tAccess____accessedBy, invocationToTAccess__tAccess____target,
				invocationToTAccess__invocation____source };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_12_4_solveCSP_bindingFBBBBBBBB(
			MethodInvocationTargetRecursive _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mMemberToTMember, invocationToTAccess,
				tMember, invocation, mMember, tAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, invocationToTAccess, tMember,
					invocation, mMember, tAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			MethodInvocationTargetRecursive _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess) {
		Object[] result_pattern_MethodInvocationTargetRecursive_12_4_solveCSP_binding = pattern_MethodInvocationTargetRecursive_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess);
		if (result_pattern_MethodInvocationTargetRecursive_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTargetRecursive_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationTargetRecursive_12_4_solveCSP_black = pattern_MethodInvocationTargetRecursive_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationTargetRecursive_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, invocationToTAccess, tMember,
						invocation, mMember, tAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTargetRecursive_12_5_checkCSP_expressionFBB(
			MethodInvocationTargetRecursive _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodInvocationTargetRecursive";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationTargetRecursive_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_20_1_preparereturnvalue_bindingFB(
			MethodInvocationTargetRecursive _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, MethodInvocationTargetRecursive _this) {
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

	public static final Object[] pattern_MethodInvocationTargetRecursive_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodInvocationTargetRecursive _this) {
		Object[] result_pattern_MethodInvocationTargetRecursive_20_1_preparereturnvalue_binding = pattern_MethodInvocationTargetRecursive_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationTargetRecursive_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodInvocationTargetRecursive_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationTargetRecursive_20_1_preparereturnvalue_black = pattern_MethodInvocationTargetRecursive_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodInvocationTargetRecursive_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodInvocationTargetRecursive_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodInvocationTargetRecursive_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTargetRecursive_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_target) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAccess = _edge_target.getSrc();
		if (tmpTAccess instanceof TCall) {
			TCall tAccess = (TCall) tmpTAccess;
			EObject tmpTMember = _edge_target.getTrg();
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				if (tMember.getAccessing().contains(tAccess)) {
					if (tMember.equals(tAccess.getTarget())) {
						_result.add(new Object[] { tMember, tAccess, _edge_target });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodInvocationTargetRecursive_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodInvocationTargetRecursive _this, Match match, TMember tMember, TCall tAccess) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tMember, tAccess);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTargetRecursive_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodInvocationTargetRecursive _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodInvocationTargetRecursive_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_21_1_preparereturnvalue_bindingFB(
			MethodInvocationTargetRecursive _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, MethodInvocationTargetRecursive _this) {
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

	public static final Object[] pattern_MethodInvocationTargetRecursive_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodInvocationTargetRecursive _this) {
		Object[] result_pattern_MethodInvocationTargetRecursive_21_1_preparereturnvalue_binding = pattern_MethodInvocationTargetRecursive_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationTargetRecursive_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodInvocationTargetRecursive_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationTargetRecursive_21_1_preparereturnvalue_black = pattern_MethodInvocationTargetRecursive_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodInvocationTargetRecursive_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodInvocationTargetRecursive_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodInvocationTargetRecursive_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTargetRecursive_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_method) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInvocation = _edge_method.getSrc();
		if (tmpInvocation instanceof AbstractMethodInvocation) {
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) tmpInvocation;
			EObject tmpMMember = _edge_method.getTrg();
			if (tmpMMember instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) tmpMMember;
				if (mMember.getMMethodInvocations().contains(invocation)) {
					if (mMember.equals(invocation.getMethod())) {
						_result.add(new Object[] { invocation, mMember, _edge_method });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodInvocationTargetRecursive_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodInvocationTargetRecursive _this, Match match, AbstractMethodInvocation invocation,
			MAbstractMethodDefinition mMember) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, invocation, mMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTargetRecursive_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodInvocationTargetRecursive _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodInvocationTargetRecursive_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_24_1_prepare_blackB(
			MethodInvocationTargetRecursive _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tMember");
		EObject _localVariable_1 = sourceMatch.getObject("invocation");
		EObject _localVariable_2 = sourceMatch.getObject("mMember");
		EObject _localVariable_3 = targetMatch.getObject("tAccess");
		EObject tmpTMember = _localVariable_0;
		EObject tmpInvocation = _localVariable_1;
		EObject tmpMMember = _localVariable_2;
		EObject tmpTAccess = _localVariable_3;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpInvocation instanceof AbstractMethodInvocation) {
				AbstractMethodInvocation invocation = (AbstractMethodInvocation) tmpInvocation;
				if (tmpMMember instanceof MAbstractMethodDefinition) {
					MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) tmpMMember;
					if (tmpTAccess instanceof TCall) {
						TCall tAccess = (TCall) tmpTAccess;
						return new Object[] { tMember, invocation, mMember, tAccess, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_24_2_matchsrctrgcontext_blackBBBBBB(
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tMember, invocation, mMember, tAccess, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodInvocationTargetRecursive_24_2_matchsrctrgcontext_binding = pattern_MethodInvocationTargetRecursive_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_MethodInvocationTargetRecursive_24_2_matchsrctrgcontext_binding != null) {
			TMember tMember = (TMember) result_pattern_MethodInvocationTargetRecursive_24_2_matchsrctrgcontext_binding[0];
			AbstractMethodInvocation invocation = (AbstractMethodInvocation) result_pattern_MethodInvocationTargetRecursive_24_2_matchsrctrgcontext_binding[1];
			MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) result_pattern_MethodInvocationTargetRecursive_24_2_matchsrctrgcontext_binding[2];
			TCall tAccess = (TCall) result_pattern_MethodInvocationTargetRecursive_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_MethodInvocationTargetRecursive_24_2_matchsrctrgcontext_black = pattern_MethodInvocationTargetRecursive_24_2_matchsrctrgcontext_blackBBBBBB(
					tMember, invocation, mMember, tAccess, sourceMatch, targetMatch);
			if (result_pattern_MethodInvocationTargetRecursive_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tMember, invocation, mMember, tAccess, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_24_3_solvecsp_bindingFBBBBBBB(
			MethodInvocationTargetRecursive _this, TMember tMember, AbstractMethodInvocation invocation,
			MAbstractMethodDefinition mMember, TCall tAccess, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(tMember, invocation, mMember, tAccess, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, tMember, invocation, mMember, tAccess, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			MethodInvocationTargetRecursive _this, TMember tMember, AbstractMethodInvocation invocation,
			MAbstractMethodDefinition mMember, TCall tAccess, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodInvocationTargetRecursive_24_3_solvecsp_binding = pattern_MethodInvocationTargetRecursive_24_3_solvecsp_bindingFBBBBBBB(
				_this, tMember, invocation, mMember, tAccess, sourceMatch, targetMatch);
		if (result_pattern_MethodInvocationTargetRecursive_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTargetRecursive_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodInvocationTargetRecursive_24_3_solvecsp_black = pattern_MethodInvocationTargetRecursive_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodInvocationTargetRecursive_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tMember, invocation, mMember, tAccess, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTargetRecursive_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTargetRecursive_24_5_matchcorrcontext_blackFFBBBBBB(
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
				if (mMember.equals(mMemberToTMember.getSource())) {
					for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tAccess, AbstractMethodInvocationToTAccess.class, "target")) {
						if (invocation.equals(invocationToTAccess.getSource())) {
							_result.add(new Object[] { mMemberToTMember, invocationToTAccess, tMember, invocation,
									mMember, tAccess, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_24_5_matchcorrcontext_greenBBBBF(
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodInvocationTargetRecursive";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mMemberToTMember);
		ccMatch.getAllContextElements().add(invocationToTAccess);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mMemberToTMember, invocationToTAccess, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_24_6_createcorrespondence_blackBBBBB(
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess,
			CCMatch ccMatch) {
		return new Object[] { tMember, invocation, mMember, tAccess, ccMatch };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodInvocationTargetRecursive";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationTargetRecursive_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_27_1_matchtggpattern_blackBB(
			AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember) {
		if (mMember.getMMethodInvocations().contains(invocation)) {
			if (mMember.equals(invocation.getMethod())) {
				return new Object[] { invocation, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTargetRecursive_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTargetRecursive_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_28_1_matchtggpattern_blackBB(TMember tMember,
			TCall tAccess) {
		if (tMember.getAccessing().contains(tAccess)) {
			if (tMember.equals(tAccess.getTarget())) {
				return new Object[] { tMember, tAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTargetRecursive_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationTargetRecursive_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_29_1_createresult_blackB(
			MethodInvocationTargetRecursive _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMemberToTMember) {
		if (ruleResult.getCorrObjects().contains(mMemberToTMember)) {
			return new Object[] { ruleResult, mMemberToTMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TCall tAccess) {
		if (ruleResult.getTargetObjects().contains(tAccess)) {
			return new Object[] { ruleResult, tAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AbstractMethodInvocationToTAccess invocationToTAccess) {
		if (ruleResult.getCorrObjects().contains(invocationToTAccess)) {
			return new Object[] { ruleResult, invocationToTAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, AbstractMethodInvocation invocation) {
		if (ruleResult.getSourceObjects().contains(invocation)) {
			return new Object[] { ruleResult, invocation };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MAbstractMethodDefinition mMember) {
		if (ruleResult.getSourceObjects().contains(mMember)) {
			return new Object[] { ruleResult, mMember };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationTargetRecursive_29_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mMemberToTMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMMemberToTMember : mMemberToTMemberList.getEntryObjects()) {
				if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
					TMember tMember = mMemberToTMember.getTarget();
					if (tMember != null) {
						BodyDeclaration tmpMMember = mMemberToTMember.getSource();
						if (tmpMMember instanceof MAbstractMethodDefinition) {
							MAbstractMethodDefinition mMember = (MAbstractMethodDefinition) tmpMMember;
							if (pattern_MethodInvocationTargetRecursive_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									mMemberToTMember) == null) {
								if (pattern_MethodInvocationTargetRecursive_29_2_isapplicablecore_black_nac_1BB(
										ruleResult, tMember) == null) {
									if (pattern_MethodInvocationTargetRecursive_29_2_isapplicablecore_black_nac_5BB(
											ruleResult, mMember) == null) {
										for (TAccess tmpTAccess : tMember.getAccessing()) {
											if (tmpTAccess instanceof TCall) {
												TCall tAccess = (TCall) tmpTAccess;
												if (pattern_MethodInvocationTargetRecursive_29_2_isapplicablecore_black_nac_2BB(
														ruleResult, tAccess) == null) {
													for (AbstractMethodInvocation invocation : mMember
															.getMMethodInvocations()) {
														if (pattern_MethodInvocationTargetRecursive_29_2_isapplicablecore_black_nac_4BB(
																ruleResult, invocation) == null) {
															for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(tAccess,
																			AbstractMethodInvocationToTAccess.class,
																			"target")) {
																if (invocation
																		.equals(invocationToTAccess.getSource())) {
																	if (pattern_MethodInvocationTargetRecursive_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, invocationToTAccess) == null) {
																		_result.add(new Object[] { mMemberToTMemberList,
																				mMemberToTMember, tMember, tAccess,
																				invocationToTAccess, invocation,
																				mMember, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_29_3_solveCSP_bindingFBBBBBBBBB(
			MethodInvocationTargetRecursive _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mMemberToTMember,
				invocationToTAccess, tMember, invocation, mMember, tAccess, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, invocationToTAccess, tMember,
					invocation, mMember, tAccess, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodInvocationTargetRecursive _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodInvocationTargetRecursive_29_3_solveCSP_binding = pattern_MethodInvocationTargetRecursive_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess,
				ruleResult);
		if (result_pattern_MethodInvocationTargetRecursive_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationTargetRecursive_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationTargetRecursive_29_3_solveCSP_black = pattern_MethodInvocationTargetRecursive_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationTargetRecursive_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, invocationToTAccess, tMember,
						invocation, mMember, tAccess, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationTargetRecursive_29_4_checkCSP_expressionFBB(
			MethodInvocationTargetRecursive _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_29_5_checknacs_blackBBBBBB(
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess) {
		return new Object[] { mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_29_6_perform_blackBBBBBBB(
			MDefinitionToTMember mMemberToTMember, AbstractMethodInvocationToTAccess invocationToTAccess,
			TMember tMember, AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mMemberToTMember, invocationToTAccess, tMember, invocation, mMember, tAccess,
				ruleResult };
	}

	public static final Object[] pattern_MethodInvocationTargetRecursive_29_6_perform_greenBBBBB(TMember tMember,
			AbstractMethodInvocation invocation, MAbstractMethodDefinition mMember, TCall tAccess,
			ModelgeneratorRuleResult ruleResult) {
		invocation.setMethod(mMember);
		tAccess.setTarget(tMember);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tMember, invocation, mMember, tAccess, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodInvocationTargetRecursive_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodInvocationTargetRecursiveImpl
