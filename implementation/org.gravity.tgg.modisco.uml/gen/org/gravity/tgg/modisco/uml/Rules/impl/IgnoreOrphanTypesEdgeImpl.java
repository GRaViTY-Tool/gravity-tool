/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.ParameterizedType;

import org.gravity.tgg.modisco.uml.Rules.IgnoreOrphanTypesEdge;
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
 * An implementation of the model object '<em><b>Ignore Orphan Types Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IgnoreOrphanTypesEdgeImpl extends AbstractRuleImpl implements IgnoreOrphanTypesEdge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IgnoreOrphanTypesEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getIgnoreOrphanTypesEdge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Model model, ParameterizedType pt) {

		Object[] result1_black = IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_0_1_initialbindings_blackBBBB(this, match, model, pt);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[model] = " + model + ", " + "[pt] = " + pt + ".");
		}

		Object[] result2_bindingAndBlack = IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, model, pt);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[model] = " + model + ", " + "[pt] = " + pt + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = IgnoreOrphanTypesEdgeImpl
					.pattern_IgnoreOrphanTypesEdge_0_4_collectelementstobetranslated_blackBBB(match, model, pt);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ", " + "[pt] = " + pt + ".");
			}
			IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_0_4_collectelementstobetranslated_greenBBBF(match,
					model, pt);
			//nothing EMoflonEdge model__pt____orphanTypes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = IgnoreOrphanTypesEdgeImpl
					.pattern_IgnoreOrphanTypesEdge_0_5_collectcontextelements_blackBBB(match, model, pt);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ", " + "[pt] = " + pt + ".");
			}
			IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_0_5_collectcontextelements_greenBBB(match, model,
					pt);

			// 
			IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_0_6_registerobjectstomatch_expressionBBBB(this,
					match, model, pt);
			return IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_0_7_expressionF();
		} else {
			return IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_1_1_performtransformation_bindingAndBlackFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Model model = (Model) result1_bindingAndBlack[0];
		ParameterizedType pt = (ParameterizedType) result1_bindingAndBlack[1];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[2];

		Object[] result2_green = IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_1_3_bookkeepingforedges_blackBBB(ruleresult, model, pt);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[model] = " + model + ", " + "[pt] = " + pt + ".");
		}
		IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_1_3_bookkeepingforedges_greenBBBF(ruleresult, model,
				pt);
		//nothing EMoflonEdge model__pt____orphanTypes = (EMoflonEdge) result3_green[3];

		// 
		// 
		IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_1_5_registerobjects_expressionBBBB(this, ruleresult,
				model, pt);
		return IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Model model = (Model) result2_binding[0];
		ParameterizedType pt = (ParameterizedType) result2_binding[1];
		for (Object[] result2_black : IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_2_2_corematch_blackBBB(model, pt, match)) {
			// ForEach 
			for (Object[] result3_black : IgnoreOrphanTypesEdgeImpl
					.pattern_IgnoreOrphanTypesEdge_2_3_findcontext_blackBB(model, pt)) {
				Object[] result3_green = IgnoreOrphanTypesEdgeImpl
						.pattern_IgnoreOrphanTypesEdge_2_3_findcontext_greenBBFF(model, pt);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge model__pt____orphanTypes = (EMoflonEdge) result3_green[3];

				Object[] result4_bindingAndBlack = IgnoreOrphanTypesEdgeImpl
						.pattern_IgnoreOrphanTypesEdge_2_4_solveCSP_bindingAndBlackFBBBB(this, isApplicableMatch, model,
								pt);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", "
							+ "[pt] = " + pt + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = IgnoreOrphanTypesEdgeImpl
							.pattern_IgnoreOrphanTypesEdge_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Model model, ParameterizedType pt) {
		match.registerObject("model", model);
		match.registerObject("pt", pt);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Model model, ParameterizedType pt) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Model model, ParameterizedType pt) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("pt", pt);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject model, EObject pt) {
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("pt", pt);

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

		Object[] result1_black = IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_10_1_initialbindings_blackBB(this, match);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ".");
		}

		Object[] result2_bindingAndBlack = IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_10_2_SolveCSP_bindingAndBlackFBB(this, match);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = IgnoreOrphanTypesEdgeImpl
					.pattern_IgnoreOrphanTypesEdge_10_4_collectelementstobetranslated_blackB(match);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ".");
			}

			Object[] result5_black = IgnoreOrphanTypesEdgeImpl
					.pattern_IgnoreOrphanTypesEdge_10_5_collectcontextelements_blackB(match);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ".");
			}
			// 
			IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_10_6_registerobjectstomatch_expressionBB(this,
					match);
			return IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_10_7_expressionF();
		} else {
			return IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_10_8_expressionF();
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_132(EMoflonEdge _edge_orphanTypes) {

		Object[] result1_bindingAndBlack = IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_17_2_testcorematchandDECs_blackFFB(_edge_orphanTypes)) {
			Model model = (Model) result2_black[0];
			ParameterizedType pt = (ParameterizedType) result2_black[1];
			Object[] result2_green = IgnoreOrphanTypesEdgeImpl
					.pattern_IgnoreOrphanTypesEdge_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (IgnoreOrphanTypesEdgeImpl
					.pattern_IgnoreOrphanTypesEdge_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, model, pt)) {
				// 
				if (IgnoreOrphanTypesEdgeImpl
						.pattern_IgnoreOrphanTypesEdge_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = IgnoreOrphanTypesEdgeImpl
							.pattern_IgnoreOrphanTypesEdge_17_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_17_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("IgnoreOrphanTypesEdge");
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
		ruleResult.setRule("IgnoreOrphanTypesEdge");
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

		Object[] result1_black = IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_20_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_20_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_20_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Model model = (Model) result2_bindingAndBlack[0];
		ParameterizedType pt = (ParameterizedType) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_20_3_solvecsp_bindingAndBlackFBBBBB(this, model, pt, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[model] = " + model + ", " + "[pt] = " + pt + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_20_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : IgnoreOrphanTypesEdgeImpl
					.pattern_IgnoreOrphanTypesEdge_20_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = IgnoreOrphanTypesEdgeImpl
						.pattern_IgnoreOrphanTypesEdge_20_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = IgnoreOrphanTypesEdgeImpl
						.pattern_IgnoreOrphanTypesEdge_20_6_createcorrespondence_blackBBB(model, pt, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model + ", "
							+ "[pt] = " + pt + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = IgnoreOrphanTypesEdgeImpl
						.pattern_IgnoreOrphanTypesEdge_20_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_20_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_20_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Model model, ParameterizedType pt, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Model model, ParameterizedType pt) {// 
		Object[] result1_black = IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_23_1_matchtggpattern_blackBB(model, pt);
		if (result1_black != null) {
			return IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_23_2_expressionF();
		} else {
			return IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_23_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD() {// 
		return IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_24_2_expressionF();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, Model modelParameter,
			ParameterizedType ptParameter) {

		Object[] result1_black = IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_25_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_25_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : IgnoreOrphanTypesEdgeImpl
				.pattern_IgnoreOrphanTypesEdge_25_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList modelList = (RuleEntryList) result2_black[0];
			Model model = (Model) result2_black[1];
			//nothing RuleEntryList ptList = (RuleEntryList) result2_black[2];
			ParameterizedType pt = (ParameterizedType) result2_black[3];

			Object[] result3_bindingAndBlack = IgnoreOrphanTypesEdgeImpl
					.pattern_IgnoreOrphanTypesEdge_25_3_solveCSP_bindingAndBlackFBBBBB(this, isApplicableMatch, model,
							pt, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", " + "[pt] = "
						+ pt + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_25_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = IgnoreOrphanTypesEdgeImpl
						.pattern_IgnoreOrphanTypesEdge_25_5_checknacs_blackBB(model, pt);
				if (result5_black != null) {

					Object[] result6_black = IgnoreOrphanTypesEdgeImpl
							.pattern_IgnoreOrphanTypesEdge_25_6_perform_blackBBB(model, pt, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model
								+ ", " + "[pt] = " + pt + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_25_6_perform_greenBBB(model, pt,
							ruleResult);

				} else {
				}

			} else {
			}

		}
		return IgnoreOrphanTypesEdgeImpl.pattern_IgnoreOrphanTypesEdge_25_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Model model, ParameterizedType pt,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("pt", pt);
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
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___IS_APPROPRIATE_FWD__MATCH_MODEL_PARAMETERIZEDTYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(ParameterizedType) arguments.get(2));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_PARAMETERIZEDTYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(ParameterizedType) arguments.get(2));
			return null;
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_PARAMETERIZEDTYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(ParameterizedType) arguments.get(2));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL_PARAMETERIZEDTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(ParameterizedType) arguments.get(2));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2));
			return null;
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___IS_APPROPRIATE_BWD__MATCH:
			return isAppropriate_BWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0));
			return null;
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_132__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_132((EMoflonEdge) arguments.get(0));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_PARAMETERIZEDTYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Model) arguments.get(0), (ParameterizedType) arguments.get(1),
					(Match) arguments.get(2), (Match) arguments.get(3));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___CHECK_DEC_FWD__MODEL_PARAMETERIZEDTYPE:
			return checkDEC_FWD((Model) arguments.get(0), (ParameterizedType) arguments.get(1));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___CHECK_DEC_BWD:
			return checkDEC_BWD();
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___GENERATE_MODEL__RULEENTRYCONTAINER_MODEL_PARAMETERIZEDTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (Model) arguments.get(1),
					(ParameterizedType) arguments.get(2));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_PARAMETERIZEDTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(ParameterizedType) arguments.get(2), (ModelgeneratorRuleResult) arguments.get(3));
		case RulesPackage.IGNORE_ORPHAN_TYPES_EDGE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_0_1_initialbindings_blackBBBB(
			IgnoreOrphanTypesEdge _this, Match match, Model model, ParameterizedType pt) {
		return new Object[] { _this, match, model, pt };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_0_2_SolveCSP_bindingFBBBB(IgnoreOrphanTypesEdge _this,
			Match match, Model model, ParameterizedType pt) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, model, pt);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, model, pt };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_0_2_SolveCSP_bindingAndBlackFBBBB(
			IgnoreOrphanTypesEdge _this, Match match, Model model, ParameterizedType pt) {
		Object[] result_pattern_IgnoreOrphanTypesEdge_0_2_SolveCSP_binding = pattern_IgnoreOrphanTypesEdge_0_2_SolveCSP_bindingFBBBB(
				_this, match, model, pt);
		if (result_pattern_IgnoreOrphanTypesEdge_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreOrphanTypesEdge_0_2_SolveCSP_binding[0];

			Object[] result_pattern_IgnoreOrphanTypesEdge_0_2_SolveCSP_black = pattern_IgnoreOrphanTypesEdge_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_IgnoreOrphanTypesEdge_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, model, pt };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreOrphanTypesEdge_0_3_CheckCSP_expressionFBB(IgnoreOrphanTypesEdge _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_0_4_collectelementstobetranslated_blackBBB(Match match,
			Model model, ParameterizedType pt) {
		return new Object[] { match, model, pt };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Model model, ParameterizedType pt) {
		EMoflonEdge model__pt____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String model__pt____orphanTypes_name_prime = "orphanTypes";
		model__pt____orphanTypes.setSrc(model);
		model__pt____orphanTypes.setTrg(pt);
		match.getToBeTranslatedEdges().add(model__pt____orphanTypes);
		model__pt____orphanTypes.setName(model__pt____orphanTypes_name_prime);
		return new Object[] { match, model, pt, model__pt____orphanTypes };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_0_5_collectcontextelements_blackBBB(Match match,
			Model model, ParameterizedType pt) {
		return new Object[] { match, model, pt };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_0_5_collectcontextelements_greenBBB(Match match,
			Model model, ParameterizedType pt) {
		match.getContextNodes().add(model);
		match.getContextNodes().add(pt);
		return new Object[] { match, model, pt };
	}

	public static final void pattern_IgnoreOrphanTypesEdge_0_6_registerobjectstomatch_expressionBBBB(
			IgnoreOrphanTypesEdge _this, Match match, Model model, ParameterizedType pt) {
		_this.registerObjectsToMatch_FWD(match, model, pt);

	}

	public static final boolean pattern_IgnoreOrphanTypesEdge_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreOrphanTypesEdge_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_1_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("model");
		EObject _localVariable_1 = isApplicableMatch.getObject("pt");
		EObject tmpModel = _localVariable_0;
		EObject tmpPt = _localVariable_1;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			if (tmpPt instanceof ParameterizedType) {
				ParameterizedType pt = (ParameterizedType) tmpPt;
				return new Object[] { model, pt, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_1_1_performtransformation_blackBBFBB(Model model,
			ParameterizedType pt, IgnoreOrphanTypesEdge _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { model, pt, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_1_1_performtransformation_bindingAndBlackFFFBB(
			IgnoreOrphanTypesEdge _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_IgnoreOrphanTypesEdge_1_1_performtransformation_binding = pattern_IgnoreOrphanTypesEdge_1_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_IgnoreOrphanTypesEdge_1_1_performtransformation_binding != null) {
			Model model = (Model) result_pattern_IgnoreOrphanTypesEdge_1_1_performtransformation_binding[0];
			ParameterizedType pt = (ParameterizedType) result_pattern_IgnoreOrphanTypesEdge_1_1_performtransformation_binding[1];

			Object[] result_pattern_IgnoreOrphanTypesEdge_1_1_performtransformation_black = pattern_IgnoreOrphanTypesEdge_1_1_performtransformation_blackBBFBB(
					model, pt, _this, isApplicableMatch);
			if (result_pattern_IgnoreOrphanTypesEdge_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_IgnoreOrphanTypesEdge_1_1_performtransformation_black[2];

				return new Object[] { model, pt, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_1_3_bookkeepingforedges_blackBBB(
			PerformRuleResult ruleresult, EObject model, EObject pt) {
		if (!model.equals(pt)) {
			return new Object[] { ruleresult, model, pt };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_1_3_bookkeepingforedges_greenBBBF(
			PerformRuleResult ruleresult, EObject model, EObject pt) {
		EMoflonEdge model__pt____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "IgnoreOrphanTypesEdge";
		String model__pt____orphanTypes_name_prime = "orphanTypes";
		model__pt____orphanTypes.setSrc(model);
		model__pt____orphanTypes.setTrg(pt);
		ruleresult.getTranslatedEdges().add(model__pt____orphanTypes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		model__pt____orphanTypes.setName(model__pt____orphanTypes_name_prime);
		return new Object[] { ruleresult, model, pt, model__pt____orphanTypes };
	}

	public static final void pattern_IgnoreOrphanTypesEdge_1_5_registerobjects_expressionBBBB(
			IgnoreOrphanTypesEdge _this, PerformRuleResult ruleresult, EObject model, EObject pt) {
		_this.registerObjects_FWD(ruleresult, model, pt);

	}

	public static final PerformRuleResult pattern_IgnoreOrphanTypesEdge_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_2_1_preparereturnvalue_bindingFB(
			IgnoreOrphanTypesEdge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_2_1_preparereturnvalue_blackFBB(EClass eClass,
			IgnoreOrphanTypesEdge _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_2_1_preparereturnvalue_bindingAndBlackFFB(
			IgnoreOrphanTypesEdge _this) {
		Object[] result_pattern_IgnoreOrphanTypesEdge_2_1_preparereturnvalue_binding = pattern_IgnoreOrphanTypesEdge_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_IgnoreOrphanTypesEdge_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_IgnoreOrphanTypesEdge_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_IgnoreOrphanTypesEdge_2_1_preparereturnvalue_black = pattern_IgnoreOrphanTypesEdge_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_IgnoreOrphanTypesEdge_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_IgnoreOrphanTypesEdge_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "IgnoreOrphanTypesEdge";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("model");
		EObject _localVariable_1 = match.getObject("pt");
		EObject tmpModel = _localVariable_0;
		EObject tmpPt = _localVariable_1;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			if (tmpPt instanceof ParameterizedType) {
				ParameterizedType pt = (ParameterizedType) tmpPt;
				return new Object[] { model, pt, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_IgnoreOrphanTypesEdge_2_2_corematch_blackBBB(Model model,
			ParameterizedType pt, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { model, pt, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_IgnoreOrphanTypesEdge_2_3_findcontext_blackBB(Model model,
			ParameterizedType pt) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (model.getOrphanTypes().contains(pt)) {
			_result.add(new Object[] { model, pt });
		}
		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_2_3_findcontext_greenBBFF(Model model,
			ParameterizedType pt) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge model__pt____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String model__pt____orphanTypes_name_prime = "orphanTypes";
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(pt);
		model__pt____orphanTypes.setSrc(model);
		model__pt____orphanTypes.setTrg(pt);
		isApplicableMatch.getAllContextElements().add(model__pt____orphanTypes);
		model__pt____orphanTypes.setName(model__pt____orphanTypes_name_prime);
		return new Object[] { model, pt, isApplicableMatch, model__pt____orphanTypes };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_2_4_solveCSP_bindingFBBBB(IgnoreOrphanTypesEdge _this,
			IsApplicableMatch isApplicableMatch, Model model, ParameterizedType pt) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, model, pt);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, pt };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_2_4_solveCSP_bindingAndBlackFBBBB(
			IgnoreOrphanTypesEdge _this, IsApplicableMatch isApplicableMatch, Model model, ParameterizedType pt) {
		Object[] result_pattern_IgnoreOrphanTypesEdge_2_4_solveCSP_binding = pattern_IgnoreOrphanTypesEdge_2_4_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, model, pt);
		if (result_pattern_IgnoreOrphanTypesEdge_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreOrphanTypesEdge_2_4_solveCSP_binding[0];

			Object[] result_pattern_IgnoreOrphanTypesEdge_2_4_solveCSP_black = pattern_IgnoreOrphanTypesEdge_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_IgnoreOrphanTypesEdge_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, pt };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreOrphanTypesEdge_2_5_checkCSP_expressionFBB(IgnoreOrphanTypesEdge _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "IgnoreOrphanTypesEdge";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_IgnoreOrphanTypesEdge_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_10_1_initialbindings_blackBB(IgnoreOrphanTypesEdge _this,
			Match match) {
		return new Object[] { _this, match };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_10_2_SolveCSP_bindingFBB(IgnoreOrphanTypesEdge _this,
			Match match) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_10_2_SolveCSP_bindingAndBlackFBB(
			IgnoreOrphanTypesEdge _this, Match match) {
		Object[] result_pattern_IgnoreOrphanTypesEdge_10_2_SolveCSP_binding = pattern_IgnoreOrphanTypesEdge_10_2_SolveCSP_bindingFBB(
				_this, match);
		if (result_pattern_IgnoreOrphanTypesEdge_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreOrphanTypesEdge_10_2_SolveCSP_binding[0];

			Object[] result_pattern_IgnoreOrphanTypesEdge_10_2_SolveCSP_black = pattern_IgnoreOrphanTypesEdge_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_IgnoreOrphanTypesEdge_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreOrphanTypesEdge_10_3_CheckCSP_expressionFBB(IgnoreOrphanTypesEdge _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_10_4_collectelementstobetranslated_blackB(Match match) {
		return new Object[] { match };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_10_5_collectcontextelements_blackB(Match match) {
		return new Object[] { match };
	}

	public static final void pattern_IgnoreOrphanTypesEdge_10_6_registerobjectstomatch_expressionBB(
			IgnoreOrphanTypesEdge _this, Match match) {
		_this.registerObjectsToMatch_BWD(match);

	}

	public static final boolean pattern_IgnoreOrphanTypesEdge_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreOrphanTypesEdge_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_17_1_preparereturnvalue_bindingFB(
			IgnoreOrphanTypesEdge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			IgnoreOrphanTypesEdge _this) {
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

	public static final Object[] pattern_IgnoreOrphanTypesEdge_17_1_preparereturnvalue_bindingAndBlackFFBF(
			IgnoreOrphanTypesEdge _this) {
		Object[] result_pattern_IgnoreOrphanTypesEdge_17_1_preparereturnvalue_binding = pattern_IgnoreOrphanTypesEdge_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_IgnoreOrphanTypesEdge_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_IgnoreOrphanTypesEdge_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_IgnoreOrphanTypesEdge_17_1_preparereturnvalue_black = pattern_IgnoreOrphanTypesEdge_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_IgnoreOrphanTypesEdge_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_IgnoreOrphanTypesEdge_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_IgnoreOrphanTypesEdge_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_IgnoreOrphanTypesEdge_17_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_orphanTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpModel = _edge_orphanTypes.getSrc();
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			EObject tmpPt = _edge_orphanTypes.getTrg();
			if (tmpPt instanceof ParameterizedType) {
				ParameterizedType pt = (ParameterizedType) tmpPt;
				if (model.getOrphanTypes().contains(pt)) {
					_result.add(new Object[] { model, pt, _edge_orphanTypes });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_IgnoreOrphanTypesEdge_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			IgnoreOrphanTypesEdge _this, Match match, Model model, ParameterizedType pt) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, model, pt);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_IgnoreOrphanTypesEdge_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			IgnoreOrphanTypesEdge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_IgnoreOrphanTypesEdge_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_20_1_prepare_blackB(IgnoreOrphanTypesEdge _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_20_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_20_2_matchsrctrgcontext_bindingFFB(Match sourceMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("model");
		EObject _localVariable_1 = sourceMatch.getObject("pt");
		EObject tmpModel = _localVariable_0;
		EObject tmpPt = _localVariable_1;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			if (tmpPt instanceof ParameterizedType) {
				ParameterizedType pt = (ParameterizedType) tmpPt;
				return new Object[] { model, pt, sourceMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_20_2_matchsrctrgcontext_blackBBBB(Model model,
			ParameterizedType pt, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { model, pt, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_20_2_matchsrctrgcontext_bindingAndBlackFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_IgnoreOrphanTypesEdge_20_2_matchsrctrgcontext_binding = pattern_IgnoreOrphanTypesEdge_20_2_matchsrctrgcontext_bindingFFB(
				sourceMatch);
		if (result_pattern_IgnoreOrphanTypesEdge_20_2_matchsrctrgcontext_binding != null) {
			Model model = (Model) result_pattern_IgnoreOrphanTypesEdge_20_2_matchsrctrgcontext_binding[0];
			ParameterizedType pt = (ParameterizedType) result_pattern_IgnoreOrphanTypesEdge_20_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_IgnoreOrphanTypesEdge_20_2_matchsrctrgcontext_black = pattern_IgnoreOrphanTypesEdge_20_2_matchsrctrgcontext_blackBBBB(
					model, pt, sourceMatch, targetMatch);
			if (result_pattern_IgnoreOrphanTypesEdge_20_2_matchsrctrgcontext_black != null) {

				return new Object[] { model, pt, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_20_3_solvecsp_bindingFBBBBB(IgnoreOrphanTypesEdge _this,
			Model model, ParameterizedType pt, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(model, pt, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, model, pt, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_20_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_20_3_solvecsp_bindingAndBlackFBBBBB(
			IgnoreOrphanTypesEdge _this, Model model, ParameterizedType pt, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_IgnoreOrphanTypesEdge_20_3_solvecsp_binding = pattern_IgnoreOrphanTypesEdge_20_3_solvecsp_bindingFBBBBB(
				_this, model, pt, sourceMatch, targetMatch);
		if (result_pattern_IgnoreOrphanTypesEdge_20_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreOrphanTypesEdge_20_3_solvecsp_binding[0];

			Object[] result_pattern_IgnoreOrphanTypesEdge_20_3_solvecsp_black = pattern_IgnoreOrphanTypesEdge_20_3_solvecsp_blackB(
					csp);
			if (result_pattern_IgnoreOrphanTypesEdge_20_3_solvecsp_black != null) {

				return new Object[] { csp, _this, model, pt, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreOrphanTypesEdge_20_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_IgnoreOrphanTypesEdge_20_5_matchcorrcontext_blackBB(
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_20_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "IgnoreOrphanTypesEdge";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_20_6_createcorrespondence_blackBBB(Model model,
			ParameterizedType pt, CCMatch ccMatch) {
		return new Object[] { model, pt, ccMatch };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_20_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_20_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "IgnoreOrphanTypesEdge";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_IgnoreOrphanTypesEdge_20_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_23_1_matchtggpattern_blackBB(Model model,
			ParameterizedType pt) {
		if (model.getOrphanTypes().contains(pt)) {
			return new Object[] { model, pt };
		}
		return null;
	}

	public static final boolean pattern_IgnoreOrphanTypesEdge_23_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreOrphanTypesEdge_23_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final boolean pattern_IgnoreOrphanTypesEdge_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreOrphanTypesEdge_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_25_1_createresult_blackB(IgnoreOrphanTypesEdge _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_25_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_25_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Model model) {
		if (ruleResult.getSourceObjects().contains(model)) {
			return new Object[] { ruleResult, model };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_25_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ParameterizedType pt) {
		if (ruleResult.getSourceObjects().contains(pt)) {
			return new Object[] { ruleResult, pt };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_IgnoreOrphanTypesEdge_25_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList modelList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList ptList : ruleEntryContainer.getRuleEntryList()) {
				if (!modelList.equals(ptList)) {
					for (EObject tmpModel : modelList.getEntryObjects()) {
						if (tmpModel instanceof Model) {
							Model model = (Model) tmpModel;
							if (pattern_IgnoreOrphanTypesEdge_25_2_isapplicablecore_black_nac_0BB(ruleResult,
									model) == null) {
								for (EObject tmpPt : ptList.getEntryObjects()) {
									if (tmpPt instanceof ParameterizedType) {
										ParameterizedType pt = (ParameterizedType) tmpPt;
										if (pattern_IgnoreOrphanTypesEdge_25_2_isapplicablecore_black_nac_1BB(
												ruleResult, pt) == null) {
											_result.add(new Object[] { modelList, model, ptList, pt, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_25_3_solveCSP_bindingFBBBBB(IgnoreOrphanTypesEdge _this,
			IsApplicableMatch isApplicableMatch, Model model, ParameterizedType pt,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, model, pt, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, pt, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_25_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_25_3_solveCSP_bindingAndBlackFBBBBB(
			IgnoreOrphanTypesEdge _this, IsApplicableMatch isApplicableMatch, Model model, ParameterizedType pt,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_IgnoreOrphanTypesEdge_25_3_solveCSP_binding = pattern_IgnoreOrphanTypesEdge_25_3_solveCSP_bindingFBBBBB(
				_this, isApplicableMatch, model, pt, ruleResult);
		if (result_pattern_IgnoreOrphanTypesEdge_25_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreOrphanTypesEdge_25_3_solveCSP_binding[0];

			Object[] result_pattern_IgnoreOrphanTypesEdge_25_3_solveCSP_black = pattern_IgnoreOrphanTypesEdge_25_3_solveCSP_blackB(
					csp);
			if (result_pattern_IgnoreOrphanTypesEdge_25_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, pt, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreOrphanTypesEdge_25_4_checkCSP_expressionFBB(IgnoreOrphanTypesEdge _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_25_5_checknacs_blackBB(Model model,
			ParameterizedType pt) {
		return new Object[] { model, pt };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_25_6_perform_blackBBB(Model model, ParameterizedType pt,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { model, pt, ruleResult };
	}

	public static final Object[] pattern_IgnoreOrphanTypesEdge_25_6_perform_greenBBB(Model model, ParameterizedType pt,
			ModelgeneratorRuleResult ruleResult) {
		model.getOrphanTypes().add(pt);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { model, pt, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_IgnoreOrphanTypesEdge_25_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //IgnoreOrphanTypesEdgeImpl
