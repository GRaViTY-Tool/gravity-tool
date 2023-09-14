/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.ClassInstanceCreation;

import org.gravity.tgg.modisco.uml.Rules.IgnoreClassInstanceCreation4ArrayInitializer;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

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
import org.gravity.tgg.modisco.uml.csp.constraints.*;
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
 * An implementation of the model object '<em><b>Ignore Class Instance Creation4 Array Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IgnoreClassInstanceCreation4ArrayInitializerImpl extends AbstractRuleImpl
		implements IgnoreClassInstanceCreation4ArrayInitializer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IgnoreClassInstanceCreation4ArrayInitializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getIgnoreClassInstanceCreation4ArrayInitializer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassInstanceCreation create, ArrayInitializer array) {

		Object[] result1_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_1_initialbindings_blackBBBB(this, match, create,
						array);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[create] = " + create + ", " + "[array] = " + array + ".");
		}

		Object[] result2_bindingAndBlack = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_2_SolveCSP_bindingAndBlackFBBBB(this, match,
						create, array);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[create] = " + create + ", " + "[array] = " + array + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_4_collectelementstobetranslated_blackBBB(
							match, create, array);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[create] = " + create + ", " + "[array] = " + array + ".");
			}
			IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_4_collectelementstobetranslated_greenBBBF(
							match, create, array);
			//nothing EMoflonEdge array__create____expressions = (EMoflonEdge) result4_green[3];

			Object[] result5_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_5_collectcontextelements_blackBBB(match,
							create, array);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[create] = " + create + ", " + "[array] = " + array + ".");
			}
			IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_5_collectcontextelements_greenBBB(match,
							create, array);

			// 
			IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_6_registerobjectstomatch_expressionBBBB(
							this, match, create, array);
			return IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_7_expressionF();
		} else {
			return IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_1_performtransformation_bindingAndBlackFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassInstanceCreation create = (ClassInstanceCreation) result1_bindingAndBlack[0];
		ArrayInitializer array = (ArrayInitializer) result1_bindingAndBlack[1];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[2];

		Object[] result2_green = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_3_bookkeepingforedges_blackBBB(ruleresult,
						create, array);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[create] = " + create + ", " + "[array] = " + array + ".");
		}
		IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_3_bookkeepingforedges_greenBBBF(ruleresult,
						create, array);
		//nothing EMoflonEdge array__create____expressions = (EMoflonEdge) result3_green[3];

		// 
		// 
		IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_5_registerobjects_expressionBBBB(this,
						ruleresult, create, array);
		return IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassInstanceCreation create = (ClassInstanceCreation) result2_binding[0];
		ArrayInitializer array = (ArrayInitializer) result2_binding[1];
		for (Object[] result2_black : IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_2_corematch_blackBBB(create, array, match)) {
			// ForEach 
			for (Object[] result3_black : IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_3_findcontext_blackBB(create, array)) {
				Object[] result3_green = IgnoreClassInstanceCreation4ArrayInitializerImpl
						.pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_3_findcontext_greenBBFF(create, array);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge array__create____expressions = (EMoflonEdge) result3_green[3];

				Object[] result4_bindingAndBlack = IgnoreClassInstanceCreation4ArrayInitializerImpl
						.pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_4_solveCSP_bindingAndBlackFBBBB(this,
								isApplicableMatch, create, array);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[create] = " + create + ", "
							+ "[array] = " + array + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (IgnoreClassInstanceCreation4ArrayInitializerImpl
						.pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
							.pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					IgnoreClassInstanceCreation4ArrayInitializerImpl
							.pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassInstanceCreation create, ArrayInitializer array) {
		match.registerObject("create", create);
		match.registerObject("array", array);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassInstanceCreation create, ArrayInitializer array) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ClassInstanceCreation create,
			ArrayInitializer array) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("create", create);
		isApplicableMatch.registerObject("array", array);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject create, EObject array) {
		ruleresult.registerObject("create", create);
		ruleresult.registerObject("array", array);

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

		Object[] result1_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_1_initialbindings_blackBB(this, match);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ".");
		}

		Object[] result2_bindingAndBlack = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_2_SolveCSP_bindingAndBlackFBB(this, match);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_4_collectelementstobetranslated_blackB(
							match);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ".");
			}

			Object[] result5_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_5_collectcontextelements_blackB(match);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ".");
			}
			// 
			IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_6_registerobjectstomatch_expressionBB(this,
							match);
			return IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_7_expressionF();
		} else {
			return IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_8_expressionF();
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_141(EMoflonEdge _edge_expressions) {

		Object[] result1_bindingAndBlack = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_2_testcorematchandDECs_blackFFB(
						_edge_expressions)) {
			ClassInstanceCreation create = (ClassInstanceCreation) result2_black[0];
			ArrayInitializer array = (ArrayInitializer) result2_black[1];
			Object[] result2_green = IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, create, array)) {
				// 
				if (IgnoreClassInstanceCreation4ArrayInitializerImpl
						.pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
							.pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					IgnoreClassInstanceCreation4ArrayInitializerImpl
							.pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("IgnoreClassInstanceCreation4ArrayInitializer");
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
		ruleResult.setRule("IgnoreClassInstanceCreation4ArrayInitializer");
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

		Object[] result1_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_2_matchsrctrgcontext_bindingAndBlackFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		ClassInstanceCreation create = (ClassInstanceCreation) result2_bindingAndBlack[0];
		ArrayInitializer array = (ArrayInitializer) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_3_solvecsp_bindingAndBlackFBBBBB(this, create,
						array, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[create] = " + create + ", " + "[array] = " + array + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_5_matchcorrcontext_blackBB(sourceMatch,
							targetMatch)) {
				Object[] result5_green = IgnoreClassInstanceCreation4ArrayInitializerImpl
						.pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_5_matchcorrcontext_greenBBF(
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
						.pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_6_createcorrespondence_blackBBB(create,
								array, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[create] = " + create
							+ ", " + "[array] = " + array + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
						.pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_7_addtoreturnedresult_blackBB(result,
								ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				IgnoreClassInstanceCreation4ArrayInitializerImpl
						.pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_7_addtoreturnedresult_greenBB(result,
								ccMatch);

			}

		} else {
		}
		return IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(ClassInstanceCreation create, ArrayInitializer array, Match sourceMatch,
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
	public boolean checkDEC_FWD(ClassInstanceCreation create, ArrayInitializer array) {// 
		Object[] result1_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_23_1_matchtggpattern_blackBB(create, array);
		if (result1_black != null) {
			return IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_23_2_expressionF();
		} else {
			return IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_23_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD() {// 
		return IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_24_2_expressionF();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ClassInstanceCreation createParameter, ArrayInitializer arrayParameter) {

		Object[] result1_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_2_isapplicablecore_blackFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList createList = (RuleEntryList) result2_black[0];
			ClassInstanceCreation create = (ClassInstanceCreation) result2_black[1];
			//nothing RuleEntryList arrayList = (RuleEntryList) result2_black[2];
			ArrayInitializer array = (ArrayInitializer) result2_black[3];

			Object[] result3_bindingAndBlack = IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_3_solveCSP_bindingAndBlackFBBBBB(this,
							isApplicableMatch, create, array, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[create] = " + create + ", "
						+ "[array] = " + array + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (IgnoreClassInstanceCreation4ArrayInitializerImpl
					.pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
						.pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_5_checknacs_blackBB(create, array);
				if (result5_black != null) {

					Object[] result6_black = IgnoreClassInstanceCreation4ArrayInitializerImpl
							.pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_6_perform_blackBBB(create, array,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[create] = " + create
								+ ", " + "[array] = " + array + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					IgnoreClassInstanceCreation4ArrayInitializerImpl
							.pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_6_perform_greenBBB(create, array,
									ruleResult);

				} else {
				}

			} else {
			}

		}
		return IgnoreClassInstanceCreation4ArrayInitializerImpl
				.pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassInstanceCreation create,
			ArrayInitializer array, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("create", create);
		isApplicableMatch.registerObject("array", array);
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
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___IS_APPROPRIATE_FWD__MATCH_CLASSINSTANCECREATION_ARRAYINITIALIZER:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassInstanceCreation) arguments.get(1),
					(ArrayInitializer) arguments.get(2));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSINSTANCECREATION_ARRAYINITIALIZER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassInstanceCreation) arguments.get(1),
					(ArrayInitializer) arguments.get(2));
			return null;
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSINSTANCECREATION_ARRAYINITIALIZER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassInstanceCreation) arguments.get(1),
					(ArrayInitializer) arguments.get(2));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSINSTANCECREATION_ARRAYINITIALIZER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(ClassInstanceCreation) arguments.get(1), (ArrayInitializer) arguments.get(2));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2));
			return null;
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___IS_APPROPRIATE_BWD__MATCH:
			return isAppropriate_BWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0));
			return null;
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_141__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_141((EMoflonEdge) arguments.get(0));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___IS_APPLICABLE_SOLVE_CSP_CC__CLASSINSTANCECREATION_ARRAYINITIALIZER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((ClassInstanceCreation) arguments.get(0),
					(ArrayInitializer) arguments.get(1), (Match) arguments.get(2), (Match) arguments.get(3));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___CHECK_DEC_FWD__CLASSINSTANCECREATION_ARRAYINITIALIZER:
			return checkDEC_FWD((ClassInstanceCreation) arguments.get(0), (ArrayInitializer) arguments.get(1));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___CHECK_DEC_BWD:
			return checkDEC_BWD();
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___GENERATE_MODEL__RULEENTRYCONTAINER_CLASSINSTANCECREATION_ARRAYINITIALIZER:
			return generateModel((RuleEntryContainer) arguments.get(0), (ClassInstanceCreation) arguments.get(1),
					(ArrayInitializer) arguments.get(2));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSINSTANCECREATION_ARRAYINITIALIZER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ClassInstanceCreation) arguments.get(1), (ArrayInitializer) arguments.get(2),
					(ModelgeneratorRuleResult) arguments.get(3));
		case RulesPackage.IGNORE_CLASS_INSTANCE_CREATION4_ARRAY_INITIALIZER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_1_initialbindings_blackBBBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, Match match, ClassInstanceCreation create,
			ArrayInitializer array) {
		return new Object[] { _this, match, create, array };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_2_SolveCSP_bindingFBBBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, Match match, ClassInstanceCreation create,
			ArrayInitializer array) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, create, array);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, create, array };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_2_SolveCSP_bindingAndBlackFBBBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, Match match, ClassInstanceCreation create,
			ArrayInitializer array) {
		Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_2_SolveCSP_binding = pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_2_SolveCSP_bindingFBBBB(
				_this, match, create, array);
		if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_2_SolveCSP_binding[0];

			Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_2_SolveCSP_black = pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, create, array };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_3_CheckCSP_expressionFBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_4_collectelementstobetranslated_blackBBB(
			Match match, ClassInstanceCreation create, ArrayInitializer array) {
		return new Object[] { match, create, array };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_4_collectelementstobetranslated_greenBBBF(
			Match match, ClassInstanceCreation create, ArrayInitializer array) {
		EMoflonEdge array__create____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String array__create____expressions_name_prime = "expressions";
		array__create____expressions.setSrc(array);
		array__create____expressions.setTrg(create);
		match.getToBeTranslatedEdges().add(array__create____expressions);
		array__create____expressions.setName(array__create____expressions_name_prime);
		return new Object[] { match, create, array, array__create____expressions };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_5_collectcontextelements_blackBBB(
			Match match, ClassInstanceCreation create, ArrayInitializer array) {
		return new Object[] { match, create, array };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_5_collectcontextelements_greenBBB(
			Match match, ClassInstanceCreation create, ArrayInitializer array) {
		match.getContextNodes().add(create);
		match.getContextNodes().add(array);
		return new Object[] { match, create, array };
	}

	public static final void pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_6_registerobjectstomatch_expressionBBBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, Match match, ClassInstanceCreation create,
			ArrayInitializer array) {
		_this.registerObjectsToMatch_FWD(match, create, array);

	}

	public static final boolean pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreClassInstanceCreation4ArrayInitializer_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("create");
		EObject _localVariable_1 = isApplicableMatch.getObject("array");
		EObject tmpCreate = _localVariable_0;
		EObject tmpArray = _localVariable_1;
		if (tmpCreate instanceof ClassInstanceCreation) {
			ClassInstanceCreation create = (ClassInstanceCreation) tmpCreate;
			if (tmpArray instanceof ArrayInitializer) {
				ArrayInitializer array = (ArrayInitializer) tmpArray;
				return new Object[] { create, array, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_1_performtransformation_blackBBFBB(
			ClassInstanceCreation create, ArrayInitializer array, IgnoreClassInstanceCreation4ArrayInitializer _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { create, array, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_1_performtransformation_bindingAndBlackFFFBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_1_performtransformation_binding = pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_1_performtransformation_binding != null) {
			ClassInstanceCreation create = (ClassInstanceCreation) result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_1_performtransformation_binding[0];
			ArrayInitializer array = (ArrayInitializer) result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_1_performtransformation_binding[1];

			Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_1_performtransformation_black = pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_1_performtransformation_blackBBFBB(
					create, array, _this, isApplicableMatch);
			if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_1_performtransformation_black[2];

				return new Object[] { create, array, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_3_bookkeepingforedges_blackBBB(
			PerformRuleResult ruleresult, EObject create, EObject array) {
		if (!array.equals(create)) {
			return new Object[] { ruleresult, create, array };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_3_bookkeepingforedges_greenBBBF(
			PerformRuleResult ruleresult, EObject create, EObject array) {
		EMoflonEdge array__create____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "IgnoreClassInstanceCreation4ArrayInitializer";
		String array__create____expressions_name_prime = "expressions";
		array__create____expressions.setSrc(array);
		array__create____expressions.setTrg(create);
		ruleresult.getTranslatedEdges().add(array__create____expressions);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		array__create____expressions.setName(array__create____expressions_name_prime);
		return new Object[] { ruleresult, create, array, array__create____expressions };
	}

	public static final void pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_5_registerobjects_expressionBBBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, PerformRuleResult ruleresult, EObject create,
			EObject array) {
		_this.registerObjects_FWD(ruleresult, create, array);

	}

	public static final PerformRuleResult pattern_IgnoreClassInstanceCreation4ArrayInitializer_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_1_preparereturnvalue_bindingFB(
			IgnoreClassInstanceCreation4ArrayInitializer _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_1_preparereturnvalue_blackFBB(
			EClass eClass, IgnoreClassInstanceCreation4ArrayInitializer _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_1_preparereturnvalue_bindingAndBlackFFB(
			IgnoreClassInstanceCreation4ArrayInitializer _this) {
		Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_1_preparereturnvalue_binding = pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_1_preparereturnvalue_black = pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "IgnoreClassInstanceCreation4ArrayInitializer";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_2_corematch_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("create");
		EObject _localVariable_1 = match.getObject("array");
		EObject tmpCreate = _localVariable_0;
		EObject tmpArray = _localVariable_1;
		if (tmpCreate instanceof ClassInstanceCreation) {
			ClassInstanceCreation create = (ClassInstanceCreation) tmpCreate;
			if (tmpArray instanceof ArrayInitializer) {
				ArrayInitializer array = (ArrayInitializer) tmpArray;
				return new Object[] { create, array, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_2_corematch_blackBBB(
			ClassInstanceCreation create, ArrayInitializer array, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { create, array, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_3_findcontext_blackBB(
			ClassInstanceCreation create, ArrayInitializer array) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (array.getExpressions().contains(create)) {
			_result.add(new Object[] { create, array });
		}
		return _result;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_3_findcontext_greenBBFF(
			ClassInstanceCreation create, ArrayInitializer array) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge array__create____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String array__create____expressions_name_prime = "expressions";
		isApplicableMatch.getAllContextElements().add(create);
		isApplicableMatch.getAllContextElements().add(array);
		array__create____expressions.setSrc(array);
		array__create____expressions.setTrg(create);
		isApplicableMatch.getAllContextElements().add(array__create____expressions);
		array__create____expressions.setName(array__create____expressions_name_prime);
		return new Object[] { create, array, isApplicableMatch, array__create____expressions };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_4_solveCSP_bindingFBBBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, IsApplicableMatch isApplicableMatch,
			ClassInstanceCreation create, ArrayInitializer array) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, create, array);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, create, array };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_4_solveCSP_bindingAndBlackFBBBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, IsApplicableMatch isApplicableMatch,
			ClassInstanceCreation create, ArrayInitializer array) {
		Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_4_solveCSP_binding = pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_4_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, create, array);
		if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_4_solveCSP_binding[0];

			Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_4_solveCSP_black = pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, create, array };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_5_checkCSP_expressionFBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "IgnoreClassInstanceCreation4ArrayInitializer";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_IgnoreClassInstanceCreation4ArrayInitializer_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_1_initialbindings_blackBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, Match match) {
		return new Object[] { _this, match };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_2_SolveCSP_bindingFBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, Match match) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_2_SolveCSP_bindingAndBlackFBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, Match match) {
		Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_2_SolveCSP_binding = pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_2_SolveCSP_bindingFBB(
				_this, match);
		if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_2_SolveCSP_binding[0];

			Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_2_SolveCSP_black = pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_3_CheckCSP_expressionFBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_4_collectelementstobetranslated_blackB(
			Match match) {
		return new Object[] { match };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_5_collectcontextelements_blackB(
			Match match) {
		return new Object[] { match };
	}

	public static final void pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_6_registerobjectstomatch_expressionBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, Match match) {
		_this.registerObjectsToMatch_BWD(match);

	}

	public static final boolean pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreClassInstanceCreation4ArrayInitializer_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_1_preparereturnvalue_bindingFB(
			IgnoreClassInstanceCreation4ArrayInitializer _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_1_preparereturnvalue_blackFBBF(
			EClass __eClass, IgnoreClassInstanceCreation4ArrayInitializer _this) {
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

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_1_preparereturnvalue_bindingAndBlackFFBF(
			IgnoreClassInstanceCreation4ArrayInitializer _this) {
		Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_1_preparereturnvalue_binding = pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_1_preparereturnvalue_black = pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_expressions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpArray = _edge_expressions.getSrc();
		if (tmpArray instanceof ArrayInitializer) {
			ArrayInitializer array = (ArrayInitializer) tmpArray;
			EObject tmpCreate = _edge_expressions.getTrg();
			if (tmpCreate instanceof ClassInstanceCreation) {
				ClassInstanceCreation create = (ClassInstanceCreation) tmpCreate;
				if (array.getExpressions().contains(create)) {
					_result.add(new Object[] { create, array, _edge_expressions });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, Match match, ClassInstanceCreation create,
			ArrayInitializer array) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, create, array);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_IgnoreClassInstanceCreation4ArrayInitializer_17_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_1_prepare_blackB(
			IgnoreClassInstanceCreation4ArrayInitializer _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_2_matchsrctrgcontext_bindingFFB(
			Match sourceMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("create");
		EObject _localVariable_1 = sourceMatch.getObject("array");
		EObject tmpCreate = _localVariable_0;
		EObject tmpArray = _localVariable_1;
		if (tmpCreate instanceof ClassInstanceCreation) {
			ClassInstanceCreation create = (ClassInstanceCreation) tmpCreate;
			if (tmpArray instanceof ArrayInitializer) {
				ArrayInitializer array = (ArrayInitializer) tmpArray;
				return new Object[] { create, array, sourceMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_2_matchsrctrgcontext_blackBBBB(
			ClassInstanceCreation create, ArrayInitializer array, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { create, array, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_2_matchsrctrgcontext_bindingAndBlackFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_2_matchsrctrgcontext_binding = pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_2_matchsrctrgcontext_bindingFFB(
				sourceMatch);
		if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_2_matchsrctrgcontext_binding != null) {
			ClassInstanceCreation create = (ClassInstanceCreation) result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_2_matchsrctrgcontext_binding[0];
			ArrayInitializer array = (ArrayInitializer) result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_2_matchsrctrgcontext_black = pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_2_matchsrctrgcontext_blackBBBB(
					create, array, sourceMatch, targetMatch);
			if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_2_matchsrctrgcontext_black != null) {

				return new Object[] { create, array, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_3_solvecsp_bindingFBBBBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, ClassInstanceCreation create, ArrayInitializer array,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(create, array, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, create, array, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_3_solvecsp_bindingAndBlackFBBBBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, ClassInstanceCreation create, ArrayInitializer array,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_3_solvecsp_binding = pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_3_solvecsp_bindingFBBBBB(
				_this, create, array, sourceMatch, targetMatch);
		if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_3_solvecsp_binding[0];

			Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_3_solvecsp_black = pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_3_solvecsp_blackB(
					csp);
			if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_3_solvecsp_black != null) {

				return new Object[] { csp, _this, create, array, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_4_checkCSP_expressionFB(
			CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_5_matchcorrcontext_blackBB(
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_5_matchcorrcontext_greenBBF(
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "IgnoreClassInstanceCreation4ArrayInitializer";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_6_createcorrespondence_blackBBB(
			ClassInstanceCreation create, ArrayInitializer array, CCMatch ccMatch) {
		return new Object[] { create, array, ccMatch };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "IgnoreClassInstanceCreation4ArrayInitializer";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_IgnoreClassInstanceCreation4ArrayInitializer_20_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_23_1_matchtggpattern_blackBB(
			ClassInstanceCreation create, ArrayInitializer array) {
		if (array.getExpressions().contains(create)) {
			return new Object[] { create, array };
		}
		return null;
	}

	public static final boolean pattern_IgnoreClassInstanceCreation4ArrayInitializer_23_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreClassInstanceCreation4ArrayInitializer_23_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final boolean pattern_IgnoreClassInstanceCreation4ArrayInitializer_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreClassInstanceCreation4ArrayInitializer_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_1_createresult_blackB(
			IgnoreClassInstanceCreation4ArrayInitializer _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ClassInstanceCreation create) {
		if (ruleResult.getSourceObjects().contains(create)) {
			return new Object[] { ruleResult, create };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ArrayInitializer array) {
		if (ruleResult.getSourceObjects().contains(array)) {
			return new Object[] { ruleResult, array };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList createList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList arrayList : ruleEntryContainer.getRuleEntryList()) {
				if (!arrayList.equals(createList)) {
					for (EObject tmpCreate : createList.getEntryObjects()) {
						if (tmpCreate instanceof ClassInstanceCreation) {
							ClassInstanceCreation create = (ClassInstanceCreation) tmpCreate;
							if (pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_2_isapplicablecore_black_nac_0BB(
									ruleResult, create) == null) {
								for (EObject tmpArray : arrayList.getEntryObjects()) {
									if (tmpArray instanceof ArrayInitializer) {
										ArrayInitializer array = (ArrayInitializer) tmpArray;
										if (pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_2_isapplicablecore_black_nac_1BB(
												ruleResult, array) == null) {
											_result.add(new Object[] { createList, create, arrayList, array,
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

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_3_solveCSP_bindingFBBBBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, IsApplicableMatch isApplicableMatch,
			ClassInstanceCreation create, ArrayInitializer array, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, create, array, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, create, array, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_3_solveCSP_bindingAndBlackFBBBBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, IsApplicableMatch isApplicableMatch,
			ClassInstanceCreation create, ArrayInitializer array, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_3_solveCSP_binding = pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_3_solveCSP_bindingFBBBBB(
				_this, isApplicableMatch, create, array, ruleResult);
		if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_3_solveCSP_binding[0];

			Object[] result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_3_solveCSP_black = pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_3_solveCSP_blackB(
					csp);
			if (result_pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, create, array, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_4_checkCSP_expressionFBB(
			IgnoreClassInstanceCreation4ArrayInitializer _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_5_checknacs_blackBB(
			ClassInstanceCreation create, ArrayInitializer array) {
		return new Object[] { create, array };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_6_perform_blackBBB(
			ClassInstanceCreation create, ArrayInitializer array, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { create, array, ruleResult };
	}

	public static final Object[] pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_6_perform_greenBBB(
			ClassInstanceCreation create, ArrayInitializer array, ModelgeneratorRuleResult ruleResult) {
		array.getExpressions().add(create);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { create, array, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_IgnoreClassInstanceCreation4ArrayInitializer_25_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //IgnoreClassInstanceCreation4ArrayInitializerImpl
