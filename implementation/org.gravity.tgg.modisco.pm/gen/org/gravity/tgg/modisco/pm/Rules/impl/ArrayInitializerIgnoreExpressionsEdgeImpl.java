/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.MethodInvocation;

import org.gravity.tgg.modisco.pm.Rules.ArrayInitializerIgnoreExpressionsEdge;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Array Initializer Ignore Expressions Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ArrayInitializerIgnoreExpressionsEdgeImpl extends AbstractRuleImpl
		implements ArrayInitializerIgnoreExpressionsEdge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayInitializerIgnoreExpressionsEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getArrayInitializerIgnoreExpressionsEdge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ArrayInitializer array, MethodInvocation invocation) {

		Object[] result1_black = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_0_1_initialbindings_blackBBBB(this, match, array,
						invocation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[array] = " + array + ", " + "[invocation] = " + invocation + ".");
		}

		Object[] result2_bindingAndBlack = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, array,
						invocation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[array] = " + array + ", " + "[invocation] = " + invocation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_0_4_collectelementstobetranslated_blackBBB(match,
							array, invocation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[array] = " + array + ", " + "[invocation] = " + invocation + ".");
			}
			ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_0_4_collectelementstobetranslated_greenBBBF(match,
							array, invocation);
			//nothing EMoflonEdge array__invocation____expressions = (EMoflonEdge) result4_green[3];

			Object[] result5_black = ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_0_5_collectcontextelements_blackBBB(match, array,
							invocation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[array] = " + array + ", " + "[invocation] = " + invocation + ".");
			}
			ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_0_5_collectcontextelements_greenBBB(match, array,
							invocation);

			// 
			ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_0_6_registerobjectstomatch_expressionBBBB(this,
							match, array, invocation);
			return ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_0_7_expressionF();
		} else {
			return ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_1_1_performtransformation_bindingAndBlackFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ArrayInitializer array = (ArrayInitializer) result1_bindingAndBlack[0];
		MethodInvocation invocation = (MethodInvocation) result1_bindingAndBlack[1];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[2];

		Object[] result2_green = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_1_3_bookkeepingforedges_blackBBB(ruleresult, array,
						invocation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[array] = " + array + ", " + "[invocation] = " + invocation + ".");
		}
		ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_1_3_bookkeepingforedges_greenBBBF(ruleresult, array,
						invocation);
		//nothing EMoflonEdge array__invocation____expressions = (EMoflonEdge) result3_green[3];

		// 
		// 
		ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_1_5_registerobjects_expressionBBBB(this, ruleresult,
						array, invocation);
		return ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ArrayInitializer array = (ArrayInitializer) result2_binding[0];
		MethodInvocation invocation = (MethodInvocation) result2_binding[1];
		for (Object[] result2_black : ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_2_2_corematch_blackBBB(array, invocation, match)) {
			// ForEach 
			for (Object[] result3_black : ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_2_3_findcontext_blackBB(array, invocation)) {
				Object[] result3_green = ArrayInitializerIgnoreExpressionsEdgeImpl
						.pattern_ArrayInitializerIgnoreExpressionsEdge_2_3_findcontext_greenBBFF(array, invocation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge array__invocation____expressions = (EMoflonEdge) result3_green[3];

				Object[] result4_bindingAndBlack = ArrayInitializerIgnoreExpressionsEdgeImpl
						.pattern_ArrayInitializerIgnoreExpressionsEdge_2_4_solveCSP_bindingAndBlackFBBBB(this,
								isApplicableMatch, array, invocation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[array] = " + array + ", "
							+ "[invocation] = " + invocation + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ArrayInitializerIgnoreExpressionsEdgeImpl
						.pattern_ArrayInitializerIgnoreExpressionsEdge_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ArrayInitializerIgnoreExpressionsEdgeImpl
							.pattern_ArrayInitializerIgnoreExpressionsEdge_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ArrayInitializerIgnoreExpressionsEdgeImpl
							.pattern_ArrayInitializerIgnoreExpressionsEdge_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ArrayInitializer array, MethodInvocation invocation) {
		match.registerObject("array", array);
		match.registerObject("invocation", invocation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ArrayInitializer array, MethodInvocation invocation) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ArrayInitializer array,
			MethodInvocation invocation) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("array", array);
		isApplicableMatch.registerObject("invocation", invocation);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject array, EObject invocation) {
		ruleresult.registerObject("array", array);
		ruleresult.registerObject("invocation", invocation);

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
	public boolean isAppropriate_BWD(Match match) {

		Object[] result1_black = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_10_1_initialbindings_blackBB(this, match);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ".");
		}

		Object[] result2_bindingAndBlack = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_10_2_SolveCSP_bindingAndBlackFBB(this, match);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_10_4_collectelementstobetranslated_blackB(match);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ".");
			}

			Object[] result5_black = ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_10_5_collectcontextelements_blackB(match);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ".");
			}
			// 
			ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_10_6_registerobjectstomatch_expressionBB(this,
							match);
			return ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_10_7_expressionF();
		} else {
			return ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match) {// Create CSP
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
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_182(EMoflonEdge _edge_expressions) {

		Object[] result1_bindingAndBlack = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_17_2_testcorematchandDECs_blackFFB(_edge_expressions)) {
			ArrayInitializer array = (ArrayInitializer) result2_black[0];
			MethodInvocation invocation = (MethodInvocation) result2_black[1];
			Object[] result2_green = ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, array, invocation)) {
				// 
				if (ArrayInitializerIgnoreExpressionsEdgeImpl
						.pattern_ArrayInitializerIgnoreExpressionsEdge_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ArrayInitializerIgnoreExpressionsEdgeImpl
							.pattern_ArrayInitializerIgnoreExpressionsEdge_17_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ArrayInitializerIgnoreExpressionsEdgeImpl
							.pattern_ArrayInitializerIgnoreExpressionsEdge_17_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ArrayInitializerIgnoreExpressionsEdge");
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
		ruleResult.setRule("ArrayInitializerIgnoreExpressionsEdge");
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

		Object[] result1_black = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_20_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_20_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_20_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		ArrayInitializer array = (ArrayInitializer) result2_bindingAndBlack[0];
		MethodInvocation invocation = (MethodInvocation) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_20_3_solvecsp_bindingAndBlackFBBBBB(this, array,
						invocation, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[array] = " + array + ", " + "[invocation] = " + invocation + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_20_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_20_5_matchcorrcontext_blackBB(sourceMatch,
							targetMatch)) {
				Object[] result5_green = ArrayInitializerIgnoreExpressionsEdgeImpl
						.pattern_ArrayInitializerIgnoreExpressionsEdge_20_5_matchcorrcontext_greenBBF(sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = ArrayInitializerIgnoreExpressionsEdgeImpl
						.pattern_ArrayInitializerIgnoreExpressionsEdge_20_6_createcorrespondence_blackBBB(array,
								invocation, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[array] = " + array + ", "
							+ "[invocation] = " + invocation + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = ArrayInitializerIgnoreExpressionsEdgeImpl
						.pattern_ArrayInitializerIgnoreExpressionsEdge_20_7_addtoreturnedresult_blackBB(result,
								ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ArrayInitializerIgnoreExpressionsEdgeImpl
						.pattern_ArrayInitializerIgnoreExpressionsEdge_20_7_addtoreturnedresult_greenBB(result,
								ccMatch);

			}

		} else {
		}
		return ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_20_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(ArrayInitializer array, MethodInvocation invocation, Match sourceMatch,
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
	public boolean checkDEC_FWD(ArrayInitializer array, MethodInvocation invocation) {// 
		Object[] result1_black = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_23_1_matchtggpattern_blackBB(array, invocation);
		if (result1_black != null) {
			return ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_23_2_expressionF();
		} else {
			return ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_23_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD() {// 
		return ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_24_2_expressionF();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ArrayInitializer arrayParameter, MethodInvocation invocationParameter) {

		Object[] result1_black = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_25_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_25_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_25_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList arrayList = (RuleEntryList) result2_black[0];
			ArrayInitializer array = (ArrayInitializer) result2_black[1];
			//nothing RuleEntryList invocationList = (RuleEntryList) result2_black[2];
			MethodInvocation invocation = (MethodInvocation) result2_black[3];

			Object[] result3_bindingAndBlack = ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_25_3_solveCSP_bindingAndBlackFBBBBB(this,
							isApplicableMatch, array, invocation, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[array] = " + array + ", "
						+ "[invocation] = " + invocation + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ArrayInitializerIgnoreExpressionsEdgeImpl
					.pattern_ArrayInitializerIgnoreExpressionsEdge_25_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ArrayInitializerIgnoreExpressionsEdgeImpl
						.pattern_ArrayInitializerIgnoreExpressionsEdge_25_5_checknacs_blackBB(array, invocation);
				if (result5_black != null) {

					Object[] result6_black = ArrayInitializerIgnoreExpressionsEdgeImpl
							.pattern_ArrayInitializerIgnoreExpressionsEdge_25_6_perform_blackBBB(array, invocation,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[array] = " + array
								+ ", " + "[invocation] = " + invocation + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					ArrayInitializerIgnoreExpressionsEdgeImpl
							.pattern_ArrayInitializerIgnoreExpressionsEdge_25_6_perform_greenBBB(array, invocation,
									ruleResult);

				} else {
				}

			} else {
			}

		}
		return ArrayInitializerIgnoreExpressionsEdgeImpl
				.pattern_ArrayInitializerIgnoreExpressionsEdge_25_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ArrayInitializer array,
			MethodInvocation invocation, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("array", array);
		isApplicableMatch.registerObject("invocation", invocation);
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
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___IS_APPROPRIATE_FWD__MATCH_ARRAYINITIALIZER_METHODINVOCATION:
			return isAppropriate_FWD((Match) arguments.get(0), (ArrayInitializer) arguments.get(1),
					(MethodInvocation) arguments.get(2));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ARRAYINITIALIZER_METHODINVOCATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ArrayInitializer) arguments.get(1),
					(MethodInvocation) arguments.get(2));
			return null;
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ARRAYINITIALIZER_METHODINVOCATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ArrayInitializer) arguments.get(1),
					(MethodInvocation) arguments.get(2));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ARRAYINITIALIZER_METHODINVOCATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ArrayInitializer) arguments.get(1),
					(MethodInvocation) arguments.get(2));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2));
			return null;
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___IS_APPROPRIATE_BWD__MATCH:
			return isAppropriate_BWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0));
			return null;
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_182__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_182((EMoflonEdge) arguments.get(0));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___IS_APPLICABLE_SOLVE_CSP_CC__ARRAYINITIALIZER_METHODINVOCATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((ArrayInitializer) arguments.get(0), (MethodInvocation) arguments.get(1),
					(Match) arguments.get(2), (Match) arguments.get(3));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___CHECK_DEC_FWD__ARRAYINITIALIZER_METHODINVOCATION:
			return checkDEC_FWD((ArrayInitializer) arguments.get(0), (MethodInvocation) arguments.get(1));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___CHECK_DEC_BWD:
			return checkDEC_BWD();
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___GENERATE_MODEL__RULEENTRYCONTAINER_ARRAYINITIALIZER_METHODINVOCATION:
			return generateModel((RuleEntryContainer) arguments.get(0), (ArrayInitializer) arguments.get(1),
					(MethodInvocation) arguments.get(2));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ARRAYINITIALIZER_METHODINVOCATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ArrayInitializer) arguments.get(1),
					(MethodInvocation) arguments.get(2), (ModelgeneratorRuleResult) arguments.get(3));
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_0_1_initialbindings_blackBBBB(
			ArrayInitializerIgnoreExpressionsEdge _this, Match match, ArrayInitializer array,
			MethodInvocation invocation) {
		return new Object[] { _this, match, array, invocation };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_0_2_SolveCSP_bindingFBBBB(
			ArrayInitializerIgnoreExpressionsEdge _this, Match match, ArrayInitializer array,
			MethodInvocation invocation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, array, invocation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, array, invocation };
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_0_2_SolveCSP_bindingAndBlackFBBBB(
			ArrayInitializerIgnoreExpressionsEdge _this, Match match, ArrayInitializer array,
			MethodInvocation invocation) {
		Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_0_2_SolveCSP_binding = pattern_ArrayInitializerIgnoreExpressionsEdge_0_2_SolveCSP_bindingFBBBB(
				_this, match, array, invocation);
		if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayInitializerIgnoreExpressionsEdge_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_0_2_SolveCSP_black = pattern_ArrayInitializerIgnoreExpressionsEdge_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, array, invocation };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayInitializerIgnoreExpressionsEdge_0_3_CheckCSP_expressionFBB(
			ArrayInitializerIgnoreExpressionsEdge _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_0_4_collectelementstobetranslated_blackBBB(
			Match match, ArrayInitializer array, MethodInvocation invocation) {
		return new Object[] { match, array, invocation };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_0_4_collectelementstobetranslated_greenBBBF(
			Match match, ArrayInitializer array, MethodInvocation invocation) {
		EMoflonEdge array__invocation____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String array__invocation____expressions_name_prime = "expressions";
		array__invocation____expressions.setSrc(array);
		array__invocation____expressions.setTrg(invocation);
		match.getToBeTranslatedEdges().add(array__invocation____expressions);
		array__invocation____expressions.setName(array__invocation____expressions_name_prime);
		return new Object[] { match, array, invocation, array__invocation____expressions };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_0_5_collectcontextelements_blackBBB(
			Match match, ArrayInitializer array, MethodInvocation invocation) {
		return new Object[] { match, array, invocation };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_0_5_collectcontextelements_greenBBB(
			Match match, ArrayInitializer array, MethodInvocation invocation) {
		match.getContextNodes().add(array);
		match.getContextNodes().add(invocation);
		return new Object[] { match, array, invocation };
	}

	public static final void pattern_ArrayInitializerIgnoreExpressionsEdge_0_6_registerobjectstomatch_expressionBBBB(
			ArrayInitializerIgnoreExpressionsEdge _this, Match match, ArrayInitializer array,
			MethodInvocation invocation) {
		_this.registerObjectsToMatch_FWD(match, array, invocation);

	}

	public static final boolean pattern_ArrayInitializerIgnoreExpressionsEdge_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayInitializerIgnoreExpressionsEdge_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_1_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("array");
		EObject _localVariable_1 = isApplicableMatch.getObject("invocation");
		EObject tmpArray = _localVariable_0;
		EObject tmpInvocation = _localVariable_1;
		if (tmpArray instanceof ArrayInitializer) {
			ArrayInitializer array = (ArrayInitializer) tmpArray;
			if (tmpInvocation instanceof MethodInvocation) {
				MethodInvocation invocation = (MethodInvocation) tmpInvocation;
				return new Object[] { array, invocation, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_1_1_performtransformation_blackBBFBB(
			ArrayInitializer array, MethodInvocation invocation, ArrayInitializerIgnoreExpressionsEdge _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { array, invocation, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_1_1_performtransformation_bindingAndBlackFFFBB(
			ArrayInitializerIgnoreExpressionsEdge _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_1_1_performtransformation_binding = pattern_ArrayInitializerIgnoreExpressionsEdge_1_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_1_1_performtransformation_binding != null) {
			ArrayInitializer array = (ArrayInitializer) result_pattern_ArrayInitializerIgnoreExpressionsEdge_1_1_performtransformation_binding[0];
			MethodInvocation invocation = (MethodInvocation) result_pattern_ArrayInitializerIgnoreExpressionsEdge_1_1_performtransformation_binding[1];

			Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_1_1_performtransformation_black = pattern_ArrayInitializerIgnoreExpressionsEdge_1_1_performtransformation_blackBBFBB(
					array, invocation, _this, isApplicableMatch);
			if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ArrayInitializerIgnoreExpressionsEdge_1_1_performtransformation_black[2];

				return new Object[] { array, invocation, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_1_3_bookkeepingforedges_blackBBB(
			PerformRuleResult ruleresult, EObject array, EObject invocation) {
		if (!array.equals(invocation)) {
			return new Object[] { ruleresult, array, invocation };
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_1_3_bookkeepingforedges_greenBBBF(
			PerformRuleResult ruleresult, EObject array, EObject invocation) {
		EMoflonEdge array__invocation____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ArrayInitializerIgnoreExpressionsEdge";
		String array__invocation____expressions_name_prime = "expressions";
		array__invocation____expressions.setSrc(array);
		array__invocation____expressions.setTrg(invocation);
		ruleresult.getTranslatedEdges().add(array__invocation____expressions);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		array__invocation____expressions.setName(array__invocation____expressions_name_prime);
		return new Object[] { ruleresult, array, invocation, array__invocation____expressions };
	}

	public static final void pattern_ArrayInitializerIgnoreExpressionsEdge_1_5_registerobjects_expressionBBBB(
			ArrayInitializerIgnoreExpressionsEdge _this, PerformRuleResult ruleresult, EObject array,
			EObject invocation) {
		_this.registerObjects_FWD(ruleresult, array, invocation);

	}

	public static final PerformRuleResult pattern_ArrayInitializerIgnoreExpressionsEdge_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_2_1_preparereturnvalue_bindingFB(
			ArrayInitializerIgnoreExpressionsEdge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_2_1_preparereturnvalue_blackFBB(
			EClass eClass, ArrayInitializerIgnoreExpressionsEdge _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_2_1_preparereturnvalue_bindingAndBlackFFB(
			ArrayInitializerIgnoreExpressionsEdge _this) {
		Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_2_1_preparereturnvalue_binding = pattern_ArrayInitializerIgnoreExpressionsEdge_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ArrayInitializerIgnoreExpressionsEdge_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_2_1_preparereturnvalue_black = pattern_ArrayInitializerIgnoreExpressionsEdge_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ArrayInitializerIgnoreExpressionsEdge_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ArrayInitializerIgnoreExpressionsEdge";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("array");
		EObject _localVariable_1 = match.getObject("invocation");
		EObject tmpArray = _localVariable_0;
		EObject tmpInvocation = _localVariable_1;
		if (tmpArray instanceof ArrayInitializer) {
			ArrayInitializer array = (ArrayInitializer) tmpArray;
			if (tmpInvocation instanceof MethodInvocation) {
				MethodInvocation invocation = (MethodInvocation) tmpInvocation;
				return new Object[] { array, invocation, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayInitializerIgnoreExpressionsEdge_2_2_corematch_blackBBB(
			ArrayInitializer array, MethodInvocation invocation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { array, invocation, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_ArrayInitializerIgnoreExpressionsEdge_2_3_findcontext_blackBB(
			ArrayInitializer array, MethodInvocation invocation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (array.getExpressions().contains(invocation)) {
			_result.add(new Object[] { array, invocation });
		}
		return _result;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_2_3_findcontext_greenBBFF(
			ArrayInitializer array, MethodInvocation invocation) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge array__invocation____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String array__invocation____expressions_name_prime = "expressions";
		isApplicableMatch.getAllContextElements().add(array);
		isApplicableMatch.getAllContextElements().add(invocation);
		array__invocation____expressions.setSrc(array);
		array__invocation____expressions.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(array__invocation____expressions);
		array__invocation____expressions.setName(array__invocation____expressions_name_prime);
		return new Object[] { array, invocation, isApplicableMatch, array__invocation____expressions };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_2_4_solveCSP_bindingFBBBB(
			ArrayInitializerIgnoreExpressionsEdge _this, IsApplicableMatch isApplicableMatch, ArrayInitializer array,
			MethodInvocation invocation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, array, invocation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, array, invocation };
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_2_4_solveCSP_bindingAndBlackFBBBB(
			ArrayInitializerIgnoreExpressionsEdge _this, IsApplicableMatch isApplicableMatch, ArrayInitializer array,
			MethodInvocation invocation) {
		Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_2_4_solveCSP_binding = pattern_ArrayInitializerIgnoreExpressionsEdge_2_4_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, array, invocation);
		if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayInitializerIgnoreExpressionsEdge_2_4_solveCSP_binding[0];

			Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_2_4_solveCSP_black = pattern_ArrayInitializerIgnoreExpressionsEdge_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, array, invocation };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayInitializerIgnoreExpressionsEdge_2_5_checkCSP_expressionFBB(
			ArrayInitializerIgnoreExpressionsEdge _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ArrayInitializerIgnoreExpressionsEdge";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ArrayInitializerIgnoreExpressionsEdge_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_10_1_initialbindings_blackBB(
			ArrayInitializerIgnoreExpressionsEdge _this, Match match) {
		return new Object[] { _this, match };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_10_2_SolveCSP_bindingFBB(
			ArrayInitializerIgnoreExpressionsEdge _this, Match match) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match };
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_10_2_SolveCSP_bindingAndBlackFBB(
			ArrayInitializerIgnoreExpressionsEdge _this, Match match) {
		Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_10_2_SolveCSP_binding = pattern_ArrayInitializerIgnoreExpressionsEdge_10_2_SolveCSP_bindingFBB(
				_this, match);
		if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayInitializerIgnoreExpressionsEdge_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_10_2_SolveCSP_black = pattern_ArrayInitializerIgnoreExpressionsEdge_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayInitializerIgnoreExpressionsEdge_10_3_CheckCSP_expressionFBB(
			ArrayInitializerIgnoreExpressionsEdge _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_10_4_collectelementstobetranslated_blackB(
			Match match) {
		return new Object[] { match };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_10_5_collectcontextelements_blackB(
			Match match) {
		return new Object[] { match };
	}

	public static final void pattern_ArrayInitializerIgnoreExpressionsEdge_10_6_registerobjectstomatch_expressionBB(
			ArrayInitializerIgnoreExpressionsEdge _this, Match match) {
		_this.registerObjectsToMatch_BWD(match);

	}

	public static final boolean pattern_ArrayInitializerIgnoreExpressionsEdge_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayInitializerIgnoreExpressionsEdge_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_17_1_preparereturnvalue_bindingFB(
			ArrayInitializerIgnoreExpressionsEdge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_17_1_preparereturnvalue_blackFBBF(
			EClass __eClass, ArrayInitializerIgnoreExpressionsEdge _this) {
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

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_17_1_preparereturnvalue_bindingAndBlackFFBF(
			ArrayInitializerIgnoreExpressionsEdge _this) {
		Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_17_1_preparereturnvalue_binding = pattern_ArrayInitializerIgnoreExpressionsEdge_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ArrayInitializerIgnoreExpressionsEdge_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_17_1_preparereturnvalue_black = pattern_ArrayInitializerIgnoreExpressionsEdge_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ArrayInitializerIgnoreExpressionsEdge_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ArrayInitializerIgnoreExpressionsEdge_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ArrayInitializerIgnoreExpressionsEdge_17_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_expressions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpArray = _edge_expressions.getSrc();
		if (tmpArray instanceof ArrayInitializer) {
			ArrayInitializer array = (ArrayInitializer) tmpArray;
			EObject tmpInvocation = _edge_expressions.getTrg();
			if (tmpInvocation instanceof MethodInvocation) {
				MethodInvocation invocation = (MethodInvocation) tmpInvocation;
				if (array.getExpressions().contains(invocation)) {
					_result.add(new Object[] { array, invocation, _edge_expressions });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_17_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ArrayInitializerIgnoreExpressionsEdge_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ArrayInitializerIgnoreExpressionsEdge _this, Match match, ArrayInitializer array,
			MethodInvocation invocation) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, array, invocation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ArrayInitializerIgnoreExpressionsEdge_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ArrayInitializerIgnoreExpressionsEdge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_17_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_17_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ArrayInitializerIgnoreExpressionsEdge_17_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_20_1_prepare_blackB(
			ArrayInitializerIgnoreExpressionsEdge _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_20_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_20_2_matchsrctrgcontext_bindingFFB(
			Match sourceMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("array");
		EObject _localVariable_1 = sourceMatch.getObject("invocation");
		EObject tmpArray = _localVariable_0;
		EObject tmpInvocation = _localVariable_1;
		if (tmpArray instanceof ArrayInitializer) {
			ArrayInitializer array = (ArrayInitializer) tmpArray;
			if (tmpInvocation instanceof MethodInvocation) {
				MethodInvocation invocation = (MethodInvocation) tmpInvocation;
				return new Object[] { array, invocation, sourceMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_20_2_matchsrctrgcontext_blackBBBB(
			ArrayInitializer array, MethodInvocation invocation, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { array, invocation, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_20_2_matchsrctrgcontext_bindingAndBlackFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_20_2_matchsrctrgcontext_binding = pattern_ArrayInitializerIgnoreExpressionsEdge_20_2_matchsrctrgcontext_bindingFFB(
				sourceMatch);
		if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_20_2_matchsrctrgcontext_binding != null) {
			ArrayInitializer array = (ArrayInitializer) result_pattern_ArrayInitializerIgnoreExpressionsEdge_20_2_matchsrctrgcontext_binding[0];
			MethodInvocation invocation = (MethodInvocation) result_pattern_ArrayInitializerIgnoreExpressionsEdge_20_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_20_2_matchsrctrgcontext_black = pattern_ArrayInitializerIgnoreExpressionsEdge_20_2_matchsrctrgcontext_blackBBBB(
					array, invocation, sourceMatch, targetMatch);
			if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_20_2_matchsrctrgcontext_black != null) {

				return new Object[] { array, invocation, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_20_3_solvecsp_bindingFBBBBB(
			ArrayInitializerIgnoreExpressionsEdge _this, ArrayInitializer array, MethodInvocation invocation,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(array, invocation, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, array, invocation, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_20_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_20_3_solvecsp_bindingAndBlackFBBBBB(
			ArrayInitializerIgnoreExpressionsEdge _this, ArrayInitializer array, MethodInvocation invocation,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_20_3_solvecsp_binding = pattern_ArrayInitializerIgnoreExpressionsEdge_20_3_solvecsp_bindingFBBBBB(
				_this, array, invocation, sourceMatch, targetMatch);
		if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_20_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayInitializerIgnoreExpressionsEdge_20_3_solvecsp_binding[0];

			Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_20_3_solvecsp_black = pattern_ArrayInitializerIgnoreExpressionsEdge_20_3_solvecsp_blackB(
					csp);
			if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_20_3_solvecsp_black != null) {

				return new Object[] { csp, _this, array, invocation, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayInitializerIgnoreExpressionsEdge_20_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ArrayInitializerIgnoreExpressionsEdge_20_5_matchcorrcontext_blackBB(
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_20_5_matchcorrcontext_greenBBF(
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ArrayInitializerIgnoreExpressionsEdge";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_20_6_createcorrespondence_blackBBB(
			ArrayInitializer array, MethodInvocation invocation, CCMatch ccMatch) {
		return new Object[] { array, invocation, ccMatch };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_20_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_20_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ArrayInitializerIgnoreExpressionsEdge";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ArrayInitializerIgnoreExpressionsEdge_20_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_23_1_matchtggpattern_blackBB(
			ArrayInitializer array, MethodInvocation invocation) {
		if (array.getExpressions().contains(invocation)) {
			return new Object[] { array, invocation };
		}
		return null;
	}

	public static final boolean pattern_ArrayInitializerIgnoreExpressionsEdge_23_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayInitializerIgnoreExpressionsEdge_23_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final boolean pattern_ArrayInitializerIgnoreExpressionsEdge_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayInitializerIgnoreExpressionsEdge_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_25_1_createresult_blackB(
			ArrayInitializerIgnoreExpressionsEdge _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_25_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_25_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ArrayInitializer array) {
		if (ruleResult.getSourceObjects().contains(array)) {
			return new Object[] { ruleResult, array };
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_25_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MethodInvocation invocation) {
		if (ruleResult.getSourceObjects().contains(invocation)) {
			return new Object[] { ruleResult, invocation };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayInitializerIgnoreExpressionsEdge_25_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList arrayList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList invocationList : ruleEntryContainer.getRuleEntryList()) {
				if (!arrayList.equals(invocationList)) {
					for (EObject tmpArray : arrayList.getEntryObjects()) {
						if (tmpArray instanceof ArrayInitializer) {
							ArrayInitializer array = (ArrayInitializer) tmpArray;
							if (pattern_ArrayInitializerIgnoreExpressionsEdge_25_2_isapplicablecore_black_nac_0BB(
									ruleResult, array) == null) {
								for (EObject tmpInvocation : invocationList.getEntryObjects()) {
									if (tmpInvocation instanceof MethodInvocation) {
										MethodInvocation invocation = (MethodInvocation) tmpInvocation;
										if (pattern_ArrayInitializerIgnoreExpressionsEdge_25_2_isapplicablecore_black_nac_1BB(
												ruleResult, invocation) == null) {
											_result.add(new Object[] { arrayList, array, invocationList, invocation,
													ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_25_3_solveCSP_bindingFBBBBB(
			ArrayInitializerIgnoreExpressionsEdge _this, IsApplicableMatch isApplicableMatch, ArrayInitializer array,
			MethodInvocation invocation, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, array, invocation, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, array, invocation, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_25_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_25_3_solveCSP_bindingAndBlackFBBBBB(
			ArrayInitializerIgnoreExpressionsEdge _this, IsApplicableMatch isApplicableMatch, ArrayInitializer array,
			MethodInvocation invocation, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_25_3_solveCSP_binding = pattern_ArrayInitializerIgnoreExpressionsEdge_25_3_solveCSP_bindingFBBBBB(
				_this, isApplicableMatch, array, invocation, ruleResult);
		if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_25_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayInitializerIgnoreExpressionsEdge_25_3_solveCSP_binding[0];

			Object[] result_pattern_ArrayInitializerIgnoreExpressionsEdge_25_3_solveCSP_black = pattern_ArrayInitializerIgnoreExpressionsEdge_25_3_solveCSP_blackB(
					csp);
			if (result_pattern_ArrayInitializerIgnoreExpressionsEdge_25_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, array, invocation, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayInitializerIgnoreExpressionsEdge_25_4_checkCSP_expressionFBB(
			ArrayInitializerIgnoreExpressionsEdge _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_25_5_checknacs_blackBB(
			ArrayInitializer array, MethodInvocation invocation) {
		return new Object[] { array, invocation };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_25_6_perform_blackBBB(
			ArrayInitializer array, MethodInvocation invocation, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { array, invocation, ruleResult };
	}

	public static final Object[] pattern_ArrayInitializerIgnoreExpressionsEdge_25_6_perform_greenBBB(
			ArrayInitializer array, MethodInvocation invocation, ModelgeneratorRuleResult ruleResult) {
		array.getExpressions().add(invocation);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { array, invocation, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ArrayInitializerIgnoreExpressionsEdge_25_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ArrayInitializerIgnoreExpressionsEdgeImpl
