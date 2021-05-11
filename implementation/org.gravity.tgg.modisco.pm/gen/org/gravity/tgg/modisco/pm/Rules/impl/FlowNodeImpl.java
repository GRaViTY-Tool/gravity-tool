/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.gravity.modisco.MAbstractFlowElement;
import org.gravity.modisco.MFlow;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MFlowToTFlow;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.FlowNode;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractFlowElement;
import org.gravity.typegraph.basic.TFlow;

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
 * An implementation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FlowNodeImpl extends AbstractRuleImpl implements FlowNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFlowNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MFlow mFlow, MAbstractFlowElement mOwner) {

		Object[] result1_black = FlowNodeImpl.pattern_FlowNode_0_1_initialbindings_blackBBBB(this, match, mFlow,
				mOwner);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mFlow] = " + mFlow + ", " + "[mOwner] = " + mOwner + ".");
		}

		Object[] result2_bindingAndBlack = FlowNodeImpl.pattern_FlowNode_0_2_SolveCSP_bindingAndBlackFBBBB(this, match,
				mFlow, mOwner);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mFlow] = " + mFlow + ", " + "[mOwner] = " + mOwner + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FlowNodeImpl.pattern_FlowNode_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FlowNodeImpl.pattern_FlowNode_0_4_collectelementstobetranslated_blackBBB(match,
					mFlow, mOwner);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mFlow] = " + mFlow + ", " + "[mOwner] = " + mOwner + ".");
			}
			FlowNodeImpl.pattern_FlowNode_0_4_collectelementstobetranslated_greenBBBFF(match, mFlow, mOwner);
			//nothing EMoflonEdge mOwner__mFlow____ownedFlows = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mFlow__mOwner____flowOwner = (EMoflonEdge) result4_green[4];

			Object[] result5_black = FlowNodeImpl.pattern_FlowNode_0_5_collectcontextelements_blackBBB(match, mFlow,
					mOwner);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mFlow] = " + mFlow + ", " + "[mOwner] = " + mOwner + ".");
			}
			FlowNodeImpl.pattern_FlowNode_0_5_collectcontextelements_greenBB(match, mOwner);

			// 
			FlowNodeImpl.pattern_FlowNode_0_6_registerobjectstomatch_expressionBBBB(this, match, mFlow, mOwner);
			return FlowNodeImpl.pattern_FlowNode_0_7_expressionF();
		} else {
			return FlowNodeImpl.pattern_FlowNode_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FlowNodeImpl
				.pattern_FlowNode_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MFlow mFlow = (MFlow) result1_bindingAndBlack[0];
		MAbstractFlowElement mOwner = (MAbstractFlowElement) result1_bindingAndBlack[1];
		TAbstractFlowElement tOwner = (TAbstractFlowElement) result1_bindingAndBlack[2];
		MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner = (MAbstractFlowElementToTAbstractFlowElement) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = FlowNodeImpl.pattern_FlowNode_1_1_performtransformation_greenBFBFF(mFlow, tOwner);
		MAbstractFlowElementToTAbstractFlowElement mAbstFlowToTAbstFlow = (MAbstractFlowElementToTAbstractFlowElement) result1_green[1];
		TFlow tFlow = (TFlow) result1_green[3];
		MFlowToTFlow mFlowToTFlow = (MFlowToTFlow) result1_green[4];

		Object[] result2_black = FlowNodeImpl.pattern_FlowNode_1_2_collecttranslatedelements_blackBBBB(mFlow,
				mAbstFlowToTAbstFlow, tFlow, mFlowToTFlow);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mFlow] = " + mFlow + ", "
					+ "[mAbstFlowToTAbstFlow] = " + mAbstFlowToTAbstFlow + ", " + "[tFlow] = " + tFlow + ", "
					+ "[mFlowToTFlow] = " + mFlowToTFlow + ".");
		}
		Object[] result2_green = FlowNodeImpl.pattern_FlowNode_1_2_collecttranslatedelements_greenFBBBB(mFlow,
				mAbstFlowToTAbstFlow, tFlow, mFlowToTFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FlowNodeImpl.pattern_FlowNode_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, mFlow,
				mOwner, mAbstFlowToTAbstFlow, tOwner, tFlow, mFlowToTFlow, mOwnerToTOwner);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mFlow] = " + mFlow + ", " + "[mOwner] = " + mOwner + ", " + "[mAbstFlowToTAbstFlow] = "
					+ mAbstFlowToTAbstFlow + ", " + "[tOwner] = " + tOwner + ", " + "[tFlow] = " + tFlow + ", "
					+ "[mFlowToTFlow] = " + mFlowToTFlow + ", " + "[mOwnerToTOwner] = " + mOwnerToTOwner + ".");
		}
		FlowNodeImpl.pattern_FlowNode_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(ruleresult, mFlow, mOwner,
				mAbstFlowToTAbstFlow, tOwner, tFlow, mFlowToTFlow);
		//nothing EMoflonEdge mOwner__mFlow____ownedFlows = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mFlow__mOwner____flowOwner = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tOwner__tFlow____ownedFlows = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tFlow__tOwner____flowOwner = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mAbstFlowToTAbstFlow__tFlow____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mFlowToTFlow__tFlow____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mAbstFlowToTAbstFlow__mFlow____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowToTFlow__mFlow____source = (EMoflonEdge) result3_green[14];

		// 
		// 
		FlowNodeImpl.pattern_FlowNode_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, mFlow, mOwner,
				mAbstFlowToTAbstFlow, tOwner, tFlow, mFlowToTFlow, mOwnerToTOwner);
		return FlowNodeImpl.pattern_FlowNode_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = FlowNodeImpl
				.pattern_FlowNode_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FlowNodeImpl.pattern_FlowNode_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FlowNodeImpl.pattern_FlowNode_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MFlow mFlow = (MFlow) result2_binding[0];
		MAbstractFlowElement mOwner = (MAbstractFlowElement) result2_binding[1];
		for (Object[] result2_black : FlowNodeImpl.pattern_FlowNode_2_2_corematch_blackBBFFB(mFlow, mOwner, match)) {
			TAbstractFlowElement tOwner = (TAbstractFlowElement) result2_black[2];
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner = (MAbstractFlowElementToTAbstractFlowElement) result2_black[3];
			// ForEach 
			for (Object[] result3_black : FlowNodeImpl.pattern_FlowNode_2_3_findcontext_blackBBBB(mFlow, mOwner, tOwner,
					mOwnerToTOwner)) {
				Object[] result3_green = FlowNodeImpl.pattern_FlowNode_2_3_findcontext_greenBBBBFFFFF(mFlow, mOwner,
						tOwner, mOwnerToTOwner);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mOwner__mFlow____ownedFlows = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mFlow__mOwner____flowOwner = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mOwnerToTOwner__mOwner____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mOwnerToTOwner__tOwner____target = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = FlowNodeImpl.pattern_FlowNode_2_4_solveCSP_bindingAndBlackFBBBBBB(
						this, isApplicableMatch, mFlow, mOwner, tOwner, mOwnerToTOwner);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mFlow] = " + mFlow + ", "
							+ "[mOwner] = " + mOwner + ", " + "[tOwner] = " + tOwner + ", " + "[mOwnerToTOwner] = "
							+ mOwnerToTOwner + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FlowNodeImpl.pattern_FlowNode_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FlowNodeImpl.pattern_FlowNode_2_6_addmatchtoruleresult_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FlowNodeImpl.pattern_FlowNode_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return FlowNodeImpl.pattern_FlowNode_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MFlow mFlow, MAbstractFlowElement mOwner) {
		match.registerObject("mFlow", mFlow);
		match.registerObject("mOwner", mOwner);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MFlow mFlow, MAbstractFlowElement mOwner) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MFlow mFlow, MAbstractFlowElement mOwner,
			TAbstractFlowElement tOwner, MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mFlow", mFlow);
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("tOwner", tOwner);
		isApplicableMatch.registerObject("mOwnerToTOwner", mOwnerToTOwner);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mFlow, EObject mOwner,
			EObject mAbstFlowToTAbstFlow, EObject tOwner, EObject tFlow, EObject mFlowToTFlow, EObject mOwnerToTOwner) {
		ruleresult.registerObject("mFlow", mFlow);
		ruleresult.registerObject("mOwner", mOwner);
		ruleresult.registerObject("mAbstFlowToTAbstFlow", mAbstFlowToTAbstFlow);
		ruleresult.registerObject("tOwner", tOwner);
		ruleresult.registerObject("tFlow", tFlow);
		ruleresult.registerObject("mFlowToTFlow", mFlowToTFlow);
		ruleresult.registerObject("mOwnerToTOwner", mOwnerToTOwner);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mFlow").eClass()).equals("modisco.MFlow.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAbstractFlowElement tOwner, TFlow tFlow) {

		Object[] result1_black = FlowNodeImpl.pattern_FlowNode_10_1_initialbindings_blackBBBB(this, match, tOwner,
				tFlow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tOwner] = " + tOwner + ", " + "[tFlow] = " + tFlow + ".");
		}

		Object[] result2_bindingAndBlack = FlowNodeImpl.pattern_FlowNode_10_2_SolveCSP_bindingAndBlackFBBBB(this, match,
				tOwner, tFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tOwner] = " + tOwner + ", " + "[tFlow] = " + tFlow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FlowNodeImpl.pattern_FlowNode_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FlowNodeImpl.pattern_FlowNode_10_4_collectelementstobetranslated_blackBBB(match,
					tOwner, tFlow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tOwner] = " + tOwner + ", " + "[tFlow] = " + tFlow + ".");
			}
			FlowNodeImpl.pattern_FlowNode_10_4_collectelementstobetranslated_greenBBBFF(match, tOwner, tFlow);
			//nothing EMoflonEdge tOwner__tFlow____ownedFlows = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tFlow__tOwner____flowOwner = (EMoflonEdge) result4_green[4];

			Object[] result5_black = FlowNodeImpl.pattern_FlowNode_10_5_collectcontextelements_blackBBB(match, tOwner,
					tFlow);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tOwner] = " + tOwner + ", " + "[tFlow] = " + tFlow + ".");
			}
			FlowNodeImpl.pattern_FlowNode_10_5_collectcontextelements_greenBB(match, tOwner);

			// 
			FlowNodeImpl.pattern_FlowNode_10_6_registerobjectstomatch_expressionBBBB(this, match, tOwner, tFlow);
			return FlowNodeImpl.pattern_FlowNode_10_7_expressionF();
		} else {
			return FlowNodeImpl.pattern_FlowNode_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FlowNodeImpl
				.pattern_FlowNode_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MAbstractFlowElement mOwner = (MAbstractFlowElement) result1_bindingAndBlack[0];
		TAbstractFlowElement tOwner = (TAbstractFlowElement) result1_bindingAndBlack[1];
		TFlow tFlow = (TFlow) result1_bindingAndBlack[2];
		MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner = (MAbstractFlowElementToTAbstractFlowElement) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = FlowNodeImpl.pattern_FlowNode_11_1_performtransformation_greenFBFBF(mOwner, tFlow);
		MFlow mFlow = (MFlow) result1_green[0];
		MAbstractFlowElementToTAbstractFlowElement mAbstFlowToTAbstFlow = (MAbstractFlowElementToTAbstractFlowElement) result1_green[2];
		MFlowToTFlow mFlowToTFlow = (MFlowToTFlow) result1_green[4];

		Object[] result2_black = FlowNodeImpl.pattern_FlowNode_11_2_collecttranslatedelements_blackBBBB(mFlow,
				mAbstFlowToTAbstFlow, tFlow, mFlowToTFlow);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mFlow] = " + mFlow + ", "
					+ "[mAbstFlowToTAbstFlow] = " + mAbstFlowToTAbstFlow + ", " + "[tFlow] = " + tFlow + ", "
					+ "[mFlowToTFlow] = " + mFlowToTFlow + ".");
		}
		Object[] result2_green = FlowNodeImpl.pattern_FlowNode_11_2_collecttranslatedelements_greenFBBBB(mFlow,
				mAbstFlowToTAbstFlow, tFlow, mFlowToTFlow);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FlowNodeImpl.pattern_FlowNode_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, mFlow,
				mOwner, mAbstFlowToTAbstFlow, tOwner, tFlow, mFlowToTFlow, mOwnerToTOwner);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mFlow] = " + mFlow + ", " + "[mOwner] = " + mOwner + ", " + "[mAbstFlowToTAbstFlow] = "
					+ mAbstFlowToTAbstFlow + ", " + "[tOwner] = " + tOwner + ", " + "[tFlow] = " + tFlow + ", "
					+ "[mFlowToTFlow] = " + mFlowToTFlow + ", " + "[mOwnerToTOwner] = " + mOwnerToTOwner + ".");
		}
		FlowNodeImpl.pattern_FlowNode_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(ruleresult, mFlow, mOwner,
				mAbstFlowToTAbstFlow, tOwner, tFlow, mFlowToTFlow);
		//nothing EMoflonEdge mOwner__mFlow____ownedFlows = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mFlow__mOwner____flowOwner = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tOwner__tFlow____ownedFlows = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tFlow__tOwner____flowOwner = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mAbstFlowToTAbstFlow__tFlow____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mFlowToTFlow__tFlow____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mAbstFlowToTAbstFlow__mFlow____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mFlowToTFlow__mFlow____source = (EMoflonEdge) result3_green[14];

		// 
		// 
		FlowNodeImpl.pattern_FlowNode_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, mFlow, mOwner,
				mAbstFlowToTAbstFlow, tOwner, tFlow, mFlowToTFlow, mOwnerToTOwner);
		return FlowNodeImpl.pattern_FlowNode_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = FlowNodeImpl
				.pattern_FlowNode_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FlowNodeImpl.pattern_FlowNode_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FlowNodeImpl.pattern_FlowNode_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAbstractFlowElement tOwner = (TAbstractFlowElement) result2_binding[0];
		TFlow tFlow = (TFlow) result2_binding[1];
		for (Object[] result2_black : FlowNodeImpl.pattern_FlowNode_12_2_corematch_blackFBBFB(tOwner, tFlow, match)) {
			MAbstractFlowElement mOwner = (MAbstractFlowElement) result2_black[0];
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner = (MAbstractFlowElementToTAbstractFlowElement) result2_black[3];
			// ForEach 
			for (Object[] result3_black : FlowNodeImpl.pattern_FlowNode_12_3_findcontext_blackBBBB(mOwner, tOwner,
					tFlow, mOwnerToTOwner)) {
				Object[] result3_green = FlowNodeImpl.pattern_FlowNode_12_3_findcontext_greenBBBBFFFFF(mOwner, tOwner,
						tFlow, mOwnerToTOwner);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge tOwner__tFlow____ownedFlows = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge tFlow__tOwner____flowOwner = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mOwnerToTOwner__mOwner____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mOwnerToTOwner__tOwner____target = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = FlowNodeImpl.pattern_FlowNode_12_4_solveCSP_bindingAndBlackFBBBBBB(
						this, isApplicableMatch, mOwner, tOwner, tFlow, mOwnerToTOwner);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mOwner] = " + mOwner + ", "
							+ "[tOwner] = " + tOwner + ", " + "[tFlow] = " + tFlow + ", " + "[mOwnerToTOwner] = "
							+ mOwnerToTOwner + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FlowNodeImpl.pattern_FlowNode_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FlowNodeImpl.pattern_FlowNode_12_6_addmatchtoruleresult_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FlowNodeImpl.pattern_FlowNode_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return FlowNodeImpl.pattern_FlowNode_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAbstractFlowElement tOwner, TFlow tFlow) {
		match.registerObject("tOwner", tOwner);
		match.registerObject("tFlow", tFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractFlowElement tOwner, TFlow tFlow) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MAbstractFlowElement mOwner,
			TAbstractFlowElement tOwner, TFlow tFlow, MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("tOwner", tOwner);
		isApplicableMatch.registerObject("tFlow", tFlow);
		isApplicableMatch.registerObject("mOwnerToTOwner", mOwnerToTOwner);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mFlow, EObject mOwner,
			EObject mAbstFlowToTAbstFlow, EObject tOwner, EObject tFlow, EObject mFlowToTFlow, EObject mOwnerToTOwner) {
		ruleresult.registerObject("mFlow", mFlow);
		ruleresult.registerObject("mOwner", mOwner);
		ruleresult.registerObject("mAbstFlowToTAbstFlow", mAbstFlowToTAbstFlow);
		ruleresult.registerObject("tOwner", tOwner);
		ruleresult.registerObject("tFlow", tFlow);
		ruleresult.registerObject("mFlowToTFlow", mFlowToTFlow);
		ruleresult.registerObject("mOwnerToTOwner", mOwnerToTOwner);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tFlow").eClass()).equals("basic.TFlow.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_48(EMoflonEdge _edge_ownedFlows) {

		Object[] result1_bindingAndBlack = FlowNodeImpl
				.pattern_FlowNode_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FlowNodeImpl.pattern_FlowNode_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FlowNodeImpl
				.pattern_FlowNode_20_2_testcorematchandDECs_blackFFB(_edge_ownedFlows)) {
			TAbstractFlowElement tOwner = (TAbstractFlowElement) result2_black[0];
			TFlow tFlow = (TFlow) result2_black[1];
			Object[] result2_green = FlowNodeImpl.pattern_FlowNode_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FlowNodeImpl.pattern_FlowNode_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, tOwner, tFlow)) {
				// 
				if (FlowNodeImpl.pattern_FlowNode_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
						match)) {

					Object[] result5_black = FlowNodeImpl.pattern_FlowNode_20_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FlowNodeImpl.pattern_FlowNode_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FlowNodeImpl.pattern_FlowNode_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_51(EMoflonEdge _edge_ownedFlows) {

		Object[] result1_bindingAndBlack = FlowNodeImpl
				.pattern_FlowNode_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FlowNodeImpl.pattern_FlowNode_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FlowNodeImpl
				.pattern_FlowNode_21_2_testcorematchandDECs_blackFFB(_edge_ownedFlows)) {
			MFlow mFlow = (MFlow) result2_black[0];
			MAbstractFlowElement mOwner = (MAbstractFlowElement) result2_black[1];
			Object[] result2_green = FlowNodeImpl.pattern_FlowNode_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FlowNodeImpl.pattern_FlowNode_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, mFlow, mOwner)) {
				// 
				if (FlowNodeImpl.pattern_FlowNode_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
						match)) {

					Object[] result5_black = FlowNodeImpl.pattern_FlowNode_21_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FlowNodeImpl.pattern_FlowNode_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FlowNodeImpl.pattern_FlowNode_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FlowNode");
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
		ruleResult.setRule("FlowNode");
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

		Object[] result1_black = FlowNodeImpl.pattern_FlowNode_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FlowNodeImpl.pattern_FlowNode_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = FlowNodeImpl
				.pattern_FlowNode_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MFlow mFlow = (MFlow) result2_bindingAndBlack[0];
		MAbstractFlowElement mOwner = (MAbstractFlowElement) result2_bindingAndBlack[1];
		TAbstractFlowElement tOwner = (TAbstractFlowElement) result2_bindingAndBlack[2];
		TFlow tFlow = (TFlow) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = FlowNodeImpl.pattern_FlowNode_24_3_solvecsp_bindingAndBlackFBBBBBBB(this,
				mFlow, mOwner, tOwner, tFlow, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mFlow] = " + mFlow + ", " + "[mOwner] = " + mOwner + ", " + "[tOwner] = " + tOwner + ", "
					+ "[tFlow] = " + tFlow + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (FlowNodeImpl.pattern_FlowNode_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : FlowNodeImpl.pattern_FlowNode_24_5_matchcorrcontext_blackBBFBB(mOwner, tOwner,
					sourceMatch, targetMatch)) {
				MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner = (MAbstractFlowElementToTAbstractFlowElement) result5_black[2];
				Object[] result5_green = FlowNodeImpl.pattern_FlowNode_24_5_matchcorrcontext_greenBBBF(mOwnerToTOwner,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = FlowNodeImpl.pattern_FlowNode_24_6_createcorrespondence_blackBBBBB(mFlow,
						mOwner, tOwner, tFlow, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mFlow] = " + mFlow + ", "
							+ "[mOwner] = " + mOwner + ", " + "[tOwner] = " + tOwner + ", " + "[tFlow] = " + tFlow
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FlowNodeImpl.pattern_FlowNode_24_6_createcorrespondence_greenBFBFB(mFlow, tFlow, ccMatch);
				//nothing MAbstractFlowElementToTAbstractFlowElement mAbstFlowToTAbstFlow = (MAbstractFlowElementToTAbstractFlowElement) result6_green[1];
				//nothing MFlowToTFlow mFlowToTFlow = (MFlowToTFlow) result6_green[3];

				Object[] result7_black = FlowNodeImpl.pattern_FlowNode_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FlowNodeImpl.pattern_FlowNode_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return FlowNodeImpl.pattern_FlowNode_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MFlow mFlow, MAbstractFlowElement mOwner, TAbstractFlowElement tOwner,
			TFlow tFlow, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MFlow mFlow, MAbstractFlowElement mOwner) {// 
		Object[] result1_black = FlowNodeImpl.pattern_FlowNode_27_1_matchtggpattern_blackBB(mFlow, mOwner);
		if (result1_black != null) {
			return FlowNodeImpl.pattern_FlowNode_27_2_expressionF();
		} else {
			return FlowNodeImpl.pattern_FlowNode_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractFlowElement tOwner, TFlow tFlow) {// 
		Object[] result1_black = FlowNodeImpl.pattern_FlowNode_28_1_matchtggpattern_blackBB(tOwner, tFlow);
		if (result1_black != null) {
			return FlowNodeImpl.pattern_FlowNode_28_2_expressionF();
		} else {
			return FlowNodeImpl.pattern_FlowNode_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwnerParameter) {

		Object[] result1_black = FlowNodeImpl.pattern_FlowNode_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FlowNodeImpl.pattern_FlowNode_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : FlowNodeImpl
				.pattern_FlowNode_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mOwnerToTOwnerList = (RuleEntryList) result2_black[0];
			MAbstractFlowElement mOwner = (MAbstractFlowElement) result2_black[1];
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner = (MAbstractFlowElementToTAbstractFlowElement) result2_black[2];
			TAbstractFlowElement tOwner = (TAbstractFlowElement) result2_black[3];

			Object[] result3_bindingAndBlack = FlowNodeImpl.pattern_FlowNode_29_3_solveCSP_bindingAndBlackFBBBBBB(this,
					isApplicableMatch, mOwner, tOwner, mOwnerToTOwner, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mOwner] = " + mOwner + ", "
						+ "[tOwner] = " + tOwner + ", " + "[mOwnerToTOwner] = " + mOwnerToTOwner + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (FlowNodeImpl.pattern_FlowNode_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = FlowNodeImpl.pattern_FlowNode_29_5_checknacs_blackBBB(mOwner, tOwner,
						mOwnerToTOwner);
				if (result5_black != null) {

					Object[] result6_black = FlowNodeImpl.pattern_FlowNode_29_6_perform_blackBBBB(mOwner, tOwner,
							mOwnerToTOwner, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mOwner] = " + mOwner
								+ ", " + "[tOwner] = " + tOwner + ", " + "[mOwnerToTOwner] = " + mOwnerToTOwner + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					FlowNodeImpl.pattern_FlowNode_29_6_perform_greenFBFBFFB(mOwner, tOwner, ruleResult);
					//nothing MFlow mFlow = (MFlow) result6_green[0];
					//nothing MAbstractFlowElementToTAbstractFlowElement mAbstFlowToTAbstFlow = (MAbstractFlowElementToTAbstractFlowElement) result6_green[2];
					//nothing TFlow tFlow = (TFlow) result6_green[4];
					//nothing MFlowToTFlow mFlowToTFlow = (MFlowToTFlow) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return FlowNodeImpl.pattern_FlowNode_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MAbstractFlowElement mOwner,
			TAbstractFlowElement tOwner, MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("tOwner", tOwner);
		isApplicableMatch.registerObject("mOwnerToTOwner", mOwnerToTOwner);
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
		case RulesPackage.FLOW_NODE___IS_APPROPRIATE_FWD__MATCH_MFLOW_MABSTRACTFLOWELEMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (MFlow) arguments.get(1),
					(MAbstractFlowElement) arguments.get(2));
		case RulesPackage.FLOW_NODE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FLOW_NODE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FLOW_NODE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MFLOW_MABSTRACTFLOWELEMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MFlow) arguments.get(1),
					(MAbstractFlowElement) arguments.get(2));
			return null;
		case RulesPackage.FLOW_NODE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MFLOW_MABSTRACTFLOWELEMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MFlow) arguments.get(1),
					(MAbstractFlowElement) arguments.get(2));
		case RulesPackage.FLOW_NODE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FLOW_NODE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MFLOW_MABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MFlow) arguments.get(1),
					(MAbstractFlowElement) arguments.get(2), (TAbstractFlowElement) arguments.get(3),
					(MAbstractFlowElementToTAbstractFlowElement) arguments.get(4));
		case RulesPackage.FLOW_NODE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FLOW_NODE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.FLOW_NODE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FLOW_NODE___IS_APPROPRIATE_BWD__MATCH_TABSTRACTFLOWELEMENT_TFLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractFlowElement) arguments.get(1),
					(TFlow) arguments.get(2));
		case RulesPackage.FLOW_NODE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FLOW_NODE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FLOW_NODE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTFLOWELEMENT_TFLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractFlowElement) arguments.get(1),
					(TFlow) arguments.get(2));
			return null;
		case RulesPackage.FLOW_NODE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTFLOWELEMENT_TFLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractFlowElement) arguments.get(1),
					(TFlow) arguments.get(2));
		case RulesPackage.FLOW_NODE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FLOW_NODE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT_TFLOW_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MAbstractFlowElement) arguments.get(1), (TAbstractFlowElement) arguments.get(2),
					(TFlow) arguments.get(3), (MAbstractFlowElementToTAbstractFlowElement) arguments.get(4));
		case RulesPackage.FLOW_NODE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FLOW_NODE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.FLOW_NODE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FLOW_NODE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_48__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_48((EMoflonEdge) arguments.get(0));
		case RulesPackage.FLOW_NODE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_51__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_51((EMoflonEdge) arguments.get(0));
		case RulesPackage.FLOW_NODE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FLOW_NODE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FLOW_NODE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FLOW_NODE___IS_APPLICABLE_SOLVE_CSP_CC__MFLOW_MABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT_TFLOW_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MFlow) arguments.get(0), (MAbstractFlowElement) arguments.get(1),
					(TAbstractFlowElement) arguments.get(2), (TFlow) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.FLOW_NODE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FLOW_NODE___CHECK_DEC_FWD__MFLOW_MABSTRACTFLOWELEMENT:
			return checkDEC_FWD((MFlow) arguments.get(0), (MAbstractFlowElement) arguments.get(1));
		case RulesPackage.FLOW_NODE___CHECK_DEC_BWD__TABSTRACTFLOWELEMENT_TFLOW:
			return checkDEC_BWD((TAbstractFlowElement) arguments.get(0), (TFlow) arguments.get(1));
		case RulesPackage.FLOW_NODE___GENERATE_MODEL__RULEENTRYCONTAINER_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(MAbstractFlowElementToTAbstractFlowElement) arguments.get(1));
		case RulesPackage.FLOW_NODE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MAbstractFlowElement) arguments.get(1), (TAbstractFlowElement) arguments.get(2),
					(MAbstractFlowElementToTAbstractFlowElement) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.FLOW_NODE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FlowNode_0_1_initialbindings_blackBBBB(FlowNode _this, Match match,
			MFlow mFlow, MAbstractFlowElement mOwner) {
		if (!mFlow.equals(mOwner)) {
			return new Object[] { _this, match, mFlow, mOwner };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_0_2_SolveCSP_bindingFBBBB(FlowNode _this, Match match, MFlow mFlow,
			MAbstractFlowElement mOwner) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mFlow, mOwner);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mFlow, mOwner };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FlowNode_0_2_SolveCSP_bindingAndBlackFBBBB(FlowNode _this, Match match,
			MFlow mFlow, MAbstractFlowElement mOwner) {
		Object[] result_pattern_FlowNode_0_2_SolveCSP_binding = pattern_FlowNode_0_2_SolveCSP_bindingFBBBB(_this, match,
				mFlow, mOwner);
		if (result_pattern_FlowNode_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FlowNode_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FlowNode_0_2_SolveCSP_black = pattern_FlowNode_0_2_SolveCSP_blackB(csp);
			if (result_pattern_FlowNode_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mFlow, mOwner };
			}
		}
		return null;
	}

	public static final boolean pattern_FlowNode_0_3_CheckCSP_expressionFBB(FlowNode _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FlowNode_0_4_collectelementstobetranslated_blackBBB(Match match, MFlow mFlow,
			MAbstractFlowElement mOwner) {
		if (!mFlow.equals(mOwner)) {
			return new Object[] { match, mFlow, mOwner };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_0_4_collectelementstobetranslated_greenBBBFF(Match match, MFlow mFlow,
			MAbstractFlowElement mOwner) {
		EMoflonEdge mOwner__mFlow____ownedFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlow__mOwner____flowOwner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mFlow);
		String mOwner__mFlow____ownedFlows_name_prime = "ownedFlows";
		String mFlow__mOwner____flowOwner_name_prime = "flowOwner";
		mOwner__mFlow____ownedFlows.setSrc(mOwner);
		mOwner__mFlow____ownedFlows.setTrg(mFlow);
		match.getToBeTranslatedEdges().add(mOwner__mFlow____ownedFlows);
		mFlow__mOwner____flowOwner.setSrc(mFlow);
		mFlow__mOwner____flowOwner.setTrg(mOwner);
		match.getToBeTranslatedEdges().add(mFlow__mOwner____flowOwner);
		mOwner__mFlow____ownedFlows.setName(mOwner__mFlow____ownedFlows_name_prime);
		mFlow__mOwner____flowOwner.setName(mFlow__mOwner____flowOwner_name_prime);
		return new Object[] { match, mFlow, mOwner, mOwner__mFlow____ownedFlows, mFlow__mOwner____flowOwner };
	}

	public static final Object[] pattern_FlowNode_0_5_collectcontextelements_blackBBB(Match match, MFlow mFlow,
			MAbstractFlowElement mOwner) {
		if (!mFlow.equals(mOwner)) {
			return new Object[] { match, mFlow, mOwner };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_0_5_collectcontextelements_greenBB(Match match,
			MAbstractFlowElement mOwner) {
		match.getContextNodes().add(mOwner);
		return new Object[] { match, mOwner };
	}

	public static final void pattern_FlowNode_0_6_registerobjectstomatch_expressionBBBB(FlowNode _this, Match match,
			MFlow mFlow, MAbstractFlowElement mOwner) {
		_this.registerObjectsToMatch_FWD(match, mFlow, mOwner);

	}

	public static final boolean pattern_FlowNode_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FlowNode_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FlowNode_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("mOwner");
		EObject _localVariable_2 = isApplicableMatch.getObject("tOwner");
		EObject _localVariable_3 = isApplicableMatch.getObject("mOwnerToTOwner");
		EObject tmpMFlow = _localVariable_0;
		EObject tmpMOwner = _localVariable_1;
		EObject tmpTOwner = _localVariable_2;
		EObject tmpMOwnerToTOwner = _localVariable_3;
		if (tmpMFlow instanceof MFlow) {
			MFlow mFlow = (MFlow) tmpMFlow;
			if (tmpMOwner instanceof MAbstractFlowElement) {
				MAbstractFlowElement mOwner = (MAbstractFlowElement) tmpMOwner;
				if (tmpTOwner instanceof TAbstractFlowElement) {
					TAbstractFlowElement tOwner = (TAbstractFlowElement) tmpTOwner;
					if (tmpMOwnerToTOwner instanceof MAbstractFlowElementToTAbstractFlowElement) {
						MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner = (MAbstractFlowElementToTAbstractFlowElement) tmpMOwnerToTOwner;
						return new Object[] { mFlow, mOwner, tOwner, mOwnerToTOwner, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_1_1_performtransformation_blackBBBBFBB(MFlow mFlow,
			MAbstractFlowElement mOwner, TAbstractFlowElement tOwner,
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner, FlowNode _this,
			IsApplicableMatch isApplicableMatch) {
		if (!mFlow.equals(mOwner)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { mFlow, mOwner, tOwner, mOwnerToTOwner, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_1_1_performtransformation_bindingAndBlackFFFFFBB(FlowNode _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FlowNode_1_1_performtransformation_binding = pattern_FlowNode_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_FlowNode_1_1_performtransformation_binding != null) {
			MFlow mFlow = (MFlow) result_pattern_FlowNode_1_1_performtransformation_binding[0];
			MAbstractFlowElement mOwner = (MAbstractFlowElement) result_pattern_FlowNode_1_1_performtransformation_binding[1];
			TAbstractFlowElement tOwner = (TAbstractFlowElement) result_pattern_FlowNode_1_1_performtransformation_binding[2];
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner = (MAbstractFlowElementToTAbstractFlowElement) result_pattern_FlowNode_1_1_performtransformation_binding[3];

			Object[] result_pattern_FlowNode_1_1_performtransformation_black = pattern_FlowNode_1_1_performtransformation_blackBBBBFBB(
					mFlow, mOwner, tOwner, mOwnerToTOwner, _this, isApplicableMatch);
			if (result_pattern_FlowNode_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FlowNode_1_1_performtransformation_black[4];

				return new Object[] { mFlow, mOwner, tOwner, mOwnerToTOwner, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_1_1_performtransformation_greenBFBFF(MFlow mFlow,
			TAbstractFlowElement tOwner) {
		MAbstractFlowElementToTAbstractFlowElement mAbstFlowToTAbstFlow = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		TFlow tFlow = BasicFactory.eINSTANCE.createTFlow();
		MFlowToTFlow mFlowToTFlow = PmFactory.eINSTANCE.createMFlowToTFlow();
		mAbstFlowToTAbstFlow.setSource(mFlow);
		tOwner.getOwnedFlows().add(tFlow);
		mAbstFlowToTAbstFlow.setTarget(tFlow);
		mFlowToTFlow.setTarget(tFlow);
		mFlowToTFlow.setSource(mFlow);
		return new Object[] { mFlow, mAbstFlowToTAbstFlow, tOwner, tFlow, mFlowToTFlow };
	}

	public static final Object[] pattern_FlowNode_1_2_collecttranslatedelements_blackBBBB(MFlow mFlow,
			MAbstractFlowElementToTAbstractFlowElement mAbstFlowToTAbstFlow, TFlow tFlow, MFlowToTFlow mFlowToTFlow) {
		return new Object[] { mFlow, mAbstFlowToTAbstFlow, tFlow, mFlowToTFlow };
	}

	public static final Object[] pattern_FlowNode_1_2_collecttranslatedelements_greenFBBBB(MFlow mFlow,
			MAbstractFlowElementToTAbstractFlowElement mAbstFlowToTAbstFlow, TFlow tFlow, MFlowToTFlow mFlowToTFlow) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mFlow);
		ruleresult.getCreatedLinkElements().add(mAbstFlowToTAbstFlow);
		ruleresult.getCreatedElements().add(tFlow);
		ruleresult.getCreatedLinkElements().add(mFlowToTFlow);
		return new Object[] { ruleresult, mFlow, mAbstFlowToTAbstFlow, tFlow, mFlowToTFlow };
	}

	public static final Object[] pattern_FlowNode_1_3_bookkeepingforedges_blackBBBBBBBB(PerformRuleResult ruleresult,
			EObject mFlow, EObject mOwner, EObject mAbstFlowToTAbstFlow, EObject tOwner, EObject tFlow,
			EObject mFlowToTFlow, EObject mOwnerToTOwner) {
		if (!mFlow.equals(mOwner)) {
			if (!mFlow.equals(tOwner)) {
				if (!mFlow.equals(tFlow)) {
					if (!mFlow.equals(mFlowToTFlow)) {
						if (!mFlow.equals(mOwnerToTOwner)) {
							if (!mOwner.equals(tOwner)) {
								if (!mOwner.equals(tFlow)) {
									if (!mOwner.equals(mOwnerToTOwner)) {
										if (!mAbstFlowToTAbstFlow.equals(mFlow)) {
											if (!mAbstFlowToTAbstFlow.equals(mOwner)) {
												if (!mAbstFlowToTAbstFlow.equals(tOwner)) {
													if (!mAbstFlowToTAbstFlow.equals(tFlow)) {
														if (!mAbstFlowToTAbstFlow.equals(mFlowToTFlow)) {
															if (!mAbstFlowToTAbstFlow.equals(mOwnerToTOwner)) {
																if (!tFlow.equals(tOwner)) {
																	if (!mFlowToTFlow.equals(mOwner)) {
																		if (!mFlowToTFlow.equals(tOwner)) {
																			if (!mFlowToTFlow.equals(tFlow)) {
																				if (!mFlowToTFlow
																						.equals(mOwnerToTOwner)) {
																					if (!mOwnerToTOwner
																							.equals(tOwner)) {
																						if (!mOwnerToTOwner
																								.equals(tFlow)) {
																							return new Object[] {
																									ruleresult, mFlow,
																									mOwner,
																									mAbstFlowToTAbstFlow,
																									tOwner, tFlow,
																									mFlowToTFlow,
																									mOwnerToTOwner };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_FlowNode_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject mFlow, EObject mOwner, EObject mAbstFlowToTAbstFlow, EObject tOwner,
			EObject tFlow, EObject mFlowToTFlow) {
		EMoflonEdge mOwner__mFlow____ownedFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlow__mOwner____flowOwner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOwner__tFlow____ownedFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFlow__tOwner____flowOwner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAbstFlowToTAbstFlow__tFlow____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowToTFlow__tFlow____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAbstFlowToTAbstFlow__mFlow____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowToTFlow__mFlow____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FlowNode";
		String mOwner__mFlow____ownedFlows_name_prime = "ownedFlows";
		String mFlow__mOwner____flowOwner_name_prime = "flowOwner";
		String tOwner__tFlow____ownedFlows_name_prime = "ownedFlows";
		String tFlow__tOwner____flowOwner_name_prime = "flowOwner";
		String mAbstFlowToTAbstFlow__tFlow____target_name_prime = "target";
		String mFlowToTFlow__tFlow____target_name_prime = "target";
		String mAbstFlowToTAbstFlow__mFlow____source_name_prime = "source";
		String mFlowToTFlow__mFlow____source_name_prime = "source";
		mOwner__mFlow____ownedFlows.setSrc(mOwner);
		mOwner__mFlow____ownedFlows.setTrg(mFlow);
		ruleresult.getTranslatedEdges().add(mOwner__mFlow____ownedFlows);
		mFlow__mOwner____flowOwner.setSrc(mFlow);
		mFlow__mOwner____flowOwner.setTrg(mOwner);
		ruleresult.getTranslatedEdges().add(mFlow__mOwner____flowOwner);
		tOwner__tFlow____ownedFlows.setSrc(tOwner);
		tOwner__tFlow____ownedFlows.setTrg(tFlow);
		ruleresult.getCreatedEdges().add(tOwner__tFlow____ownedFlows);
		tFlow__tOwner____flowOwner.setSrc(tFlow);
		tFlow__tOwner____flowOwner.setTrg(tOwner);
		ruleresult.getCreatedEdges().add(tFlow__tOwner____flowOwner);
		mAbstFlowToTAbstFlow__tFlow____target.setSrc(mAbstFlowToTAbstFlow);
		mAbstFlowToTAbstFlow__tFlow____target.setTrg(tFlow);
		ruleresult.getCreatedEdges().add(mAbstFlowToTAbstFlow__tFlow____target);
		mFlowToTFlow__tFlow____target.setSrc(mFlowToTFlow);
		mFlowToTFlow__tFlow____target.setTrg(tFlow);
		ruleresult.getCreatedEdges().add(mFlowToTFlow__tFlow____target);
		mAbstFlowToTAbstFlow__mFlow____source.setSrc(mAbstFlowToTAbstFlow);
		mAbstFlowToTAbstFlow__mFlow____source.setTrg(mFlow);
		ruleresult.getCreatedEdges().add(mAbstFlowToTAbstFlow__mFlow____source);
		mFlowToTFlow__mFlow____source.setSrc(mFlowToTFlow);
		mFlowToTFlow__mFlow____source.setTrg(mFlow);
		ruleresult.getCreatedEdges().add(mFlowToTFlow__mFlow____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mOwner__mFlow____ownedFlows.setName(mOwner__mFlow____ownedFlows_name_prime);
		mFlow__mOwner____flowOwner.setName(mFlow__mOwner____flowOwner_name_prime);
		tOwner__tFlow____ownedFlows.setName(tOwner__tFlow____ownedFlows_name_prime);
		tFlow__tOwner____flowOwner.setName(tFlow__tOwner____flowOwner_name_prime);
		mAbstFlowToTAbstFlow__tFlow____target.setName(mAbstFlowToTAbstFlow__tFlow____target_name_prime);
		mFlowToTFlow__tFlow____target.setName(mFlowToTFlow__tFlow____target_name_prime);
		mAbstFlowToTAbstFlow__mFlow____source.setName(mAbstFlowToTAbstFlow__mFlow____source_name_prime);
		mFlowToTFlow__mFlow____source.setName(mFlowToTFlow__mFlow____source_name_prime);
		return new Object[] { ruleresult, mFlow, mOwner, mAbstFlowToTAbstFlow, tOwner, tFlow, mFlowToTFlow,
				mOwner__mFlow____ownedFlows, mFlow__mOwner____flowOwner, tOwner__tFlow____ownedFlows,
				tFlow__tOwner____flowOwner, mAbstFlowToTAbstFlow__tFlow____target, mFlowToTFlow__tFlow____target,
				mAbstFlowToTAbstFlow__mFlow____source, mFlowToTFlow__mFlow____source };
	}

	public static final void pattern_FlowNode_1_5_registerobjects_expressionBBBBBBBBB(FlowNode _this,
			PerformRuleResult ruleresult, EObject mFlow, EObject mOwner, EObject mAbstFlowToTAbstFlow, EObject tOwner,
			EObject tFlow, EObject mFlowToTFlow, EObject mOwnerToTOwner) {
		_this.registerObjects_FWD(ruleresult, mFlow, mOwner, mAbstFlowToTAbstFlow, tOwner, tFlow, mFlowToTFlow,
				mOwnerToTOwner);

	}

	public static final PerformRuleResult pattern_FlowNode_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FlowNode_2_1_preparereturnvalue_bindingFB(FlowNode _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_2_1_preparereturnvalue_blackFBB(EClass eClass, FlowNode _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FlowNode_2_1_preparereturnvalue_bindingAndBlackFFB(FlowNode _this) {
		Object[] result_pattern_FlowNode_2_1_preparereturnvalue_binding = pattern_FlowNode_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FlowNode_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FlowNode_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FlowNode_2_1_preparereturnvalue_black = pattern_FlowNode_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FlowNode_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FlowNode_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FlowNode";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FlowNode_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mFlow");
		EObject _localVariable_1 = match.getObject("mOwner");
		EObject tmpMFlow = _localVariable_0;
		EObject tmpMOwner = _localVariable_1;
		if (tmpMFlow instanceof MFlow) {
			MFlow mFlow = (MFlow) tmpMFlow;
			if (tmpMOwner instanceof MAbstractFlowElement) {
				MAbstractFlowElement mOwner = (MAbstractFlowElement) tmpMOwner;
				return new Object[] { mFlow, mOwner, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FlowNode_2_2_corematch_blackBBFFB(MFlow mFlow,
			MAbstractFlowElement mOwner, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mFlow.equals(mOwner)) {
			for (MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mOwner, MAbstractFlowElementToTAbstractFlowElement.class, "source")) {
				TAbstractFlowElement tOwner = mOwnerToTOwner.getTarget();
				if (tOwner != null) {
					_result.add(new Object[] { mFlow, mOwner, tOwner, mOwnerToTOwner, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FlowNode_2_3_findcontext_blackBBBB(MFlow mFlow,
			MAbstractFlowElement mOwner, TAbstractFlowElement tOwner,
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mFlow.equals(mOwner)) {
			if (mOwner.getOwnedFlows().contains(mFlow)) {
				if (mOwner.equals(mOwnerToTOwner.getSource())) {
					if (tOwner.equals(mOwnerToTOwner.getTarget())) {
						_result.add(new Object[] { mFlow, mOwner, tOwner, mOwnerToTOwner });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FlowNode_2_3_findcontext_greenBBBBFFFFF(MFlow mFlow,
			MAbstractFlowElement mOwner, TAbstractFlowElement tOwner,
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mOwner__mFlow____ownedFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlow__mOwner____flowOwner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOwnerToTOwner__mOwner____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOwnerToTOwner__tOwner____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mOwner__mFlow____ownedFlows_name_prime = "ownedFlows";
		String mFlow__mOwner____flowOwner_name_prime = "flowOwner";
		String mOwnerToTOwner__mOwner____source_name_prime = "source";
		String mOwnerToTOwner__tOwner____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mFlow);
		isApplicableMatch.getAllContextElements().add(mOwner);
		isApplicableMatch.getAllContextElements().add(tOwner);
		isApplicableMatch.getAllContextElements().add(mOwnerToTOwner);
		mOwner__mFlow____ownedFlows.setSrc(mOwner);
		mOwner__mFlow____ownedFlows.setTrg(mFlow);
		isApplicableMatch.getAllContextElements().add(mOwner__mFlow____ownedFlows);
		mFlow__mOwner____flowOwner.setSrc(mFlow);
		mFlow__mOwner____flowOwner.setTrg(mOwner);
		isApplicableMatch.getAllContextElements().add(mFlow__mOwner____flowOwner);
		mOwnerToTOwner__mOwner____source.setSrc(mOwnerToTOwner);
		mOwnerToTOwner__mOwner____source.setTrg(mOwner);
		isApplicableMatch.getAllContextElements().add(mOwnerToTOwner__mOwner____source);
		mOwnerToTOwner__tOwner____target.setSrc(mOwnerToTOwner);
		mOwnerToTOwner__tOwner____target.setTrg(tOwner);
		isApplicableMatch.getAllContextElements().add(mOwnerToTOwner__tOwner____target);
		mOwner__mFlow____ownedFlows.setName(mOwner__mFlow____ownedFlows_name_prime);
		mFlow__mOwner____flowOwner.setName(mFlow__mOwner____flowOwner_name_prime);
		mOwnerToTOwner__mOwner____source.setName(mOwnerToTOwner__mOwner____source_name_prime);
		mOwnerToTOwner__tOwner____target.setName(mOwnerToTOwner__tOwner____target_name_prime);
		return new Object[] { mFlow, mOwner, tOwner, mOwnerToTOwner, isApplicableMatch, mOwner__mFlow____ownedFlows,
				mFlow__mOwner____flowOwner, mOwnerToTOwner__mOwner____source, mOwnerToTOwner__tOwner____target };
	}

	public static final Object[] pattern_FlowNode_2_4_solveCSP_bindingFBBBBBB(FlowNode _this,
			IsApplicableMatch isApplicableMatch, MFlow mFlow, MAbstractFlowElement mOwner, TAbstractFlowElement tOwner,
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mFlow, mOwner, tOwner,
				mOwnerToTOwner);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mFlow, mOwner, tOwner, mOwnerToTOwner };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FlowNode_2_4_solveCSP_bindingAndBlackFBBBBBB(FlowNode _this,
			IsApplicableMatch isApplicableMatch, MFlow mFlow, MAbstractFlowElement mOwner, TAbstractFlowElement tOwner,
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner) {
		Object[] result_pattern_FlowNode_2_4_solveCSP_binding = pattern_FlowNode_2_4_solveCSP_bindingFBBBBBB(_this,
				isApplicableMatch, mFlow, mOwner, tOwner, mOwnerToTOwner);
		if (result_pattern_FlowNode_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FlowNode_2_4_solveCSP_binding[0];

			Object[] result_pattern_FlowNode_2_4_solveCSP_black = pattern_FlowNode_2_4_solveCSP_blackB(csp);
			if (result_pattern_FlowNode_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mFlow, mOwner, tOwner, mOwnerToTOwner };
			}
		}
		return null;
	}

	public static final boolean pattern_FlowNode_2_5_checkCSP_expressionFBB(FlowNode _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FlowNode_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FlowNode_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FlowNode";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FlowNode_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FlowNode_10_1_initialbindings_blackBBBB(FlowNode _this, Match match,
			TAbstractFlowElement tOwner, TFlow tFlow) {
		if (!tFlow.equals(tOwner)) {
			return new Object[] { _this, match, tOwner, tFlow };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_10_2_SolveCSP_bindingFBBBB(FlowNode _this, Match match,
			TAbstractFlowElement tOwner, TFlow tFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tOwner, tFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tOwner, tFlow };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FlowNode_10_2_SolveCSP_bindingAndBlackFBBBB(FlowNode _this, Match match,
			TAbstractFlowElement tOwner, TFlow tFlow) {
		Object[] result_pattern_FlowNode_10_2_SolveCSP_binding = pattern_FlowNode_10_2_SolveCSP_bindingFBBBB(_this,
				match, tOwner, tFlow);
		if (result_pattern_FlowNode_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FlowNode_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FlowNode_10_2_SolveCSP_black = pattern_FlowNode_10_2_SolveCSP_blackB(csp);
			if (result_pattern_FlowNode_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tOwner, tFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_FlowNode_10_3_CheckCSP_expressionFBB(FlowNode _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FlowNode_10_4_collectelementstobetranslated_blackBBB(Match match,
			TAbstractFlowElement tOwner, TFlow tFlow) {
		if (!tFlow.equals(tOwner)) {
			return new Object[] { match, tOwner, tFlow };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TAbstractFlowElement tOwner, TFlow tFlow) {
		EMoflonEdge tOwner__tFlow____ownedFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFlow__tOwner____flowOwner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tFlow);
		String tOwner__tFlow____ownedFlows_name_prime = "ownedFlows";
		String tFlow__tOwner____flowOwner_name_prime = "flowOwner";
		tOwner__tFlow____ownedFlows.setSrc(tOwner);
		tOwner__tFlow____ownedFlows.setTrg(tFlow);
		match.getToBeTranslatedEdges().add(tOwner__tFlow____ownedFlows);
		tFlow__tOwner____flowOwner.setSrc(tFlow);
		tFlow__tOwner____flowOwner.setTrg(tOwner);
		match.getToBeTranslatedEdges().add(tFlow__tOwner____flowOwner);
		tOwner__tFlow____ownedFlows.setName(tOwner__tFlow____ownedFlows_name_prime);
		tFlow__tOwner____flowOwner.setName(tFlow__tOwner____flowOwner_name_prime);
		return new Object[] { match, tOwner, tFlow, tOwner__tFlow____ownedFlows, tFlow__tOwner____flowOwner };
	}

	public static final Object[] pattern_FlowNode_10_5_collectcontextelements_blackBBB(Match match,
			TAbstractFlowElement tOwner, TFlow tFlow) {
		if (!tFlow.equals(tOwner)) {
			return new Object[] { match, tOwner, tFlow };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_10_5_collectcontextelements_greenBB(Match match,
			TAbstractFlowElement tOwner) {
		match.getContextNodes().add(tOwner);
		return new Object[] { match, tOwner };
	}

	public static final void pattern_FlowNode_10_6_registerobjectstomatch_expressionBBBB(FlowNode _this, Match match,
			TAbstractFlowElement tOwner, TFlow tFlow) {
		_this.registerObjectsToMatch_BWD(match, tOwner, tFlow);

	}

	public static final boolean pattern_FlowNode_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FlowNode_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FlowNode_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mOwner");
		EObject _localVariable_1 = isApplicableMatch.getObject("tOwner");
		EObject _localVariable_2 = isApplicableMatch.getObject("tFlow");
		EObject _localVariable_3 = isApplicableMatch.getObject("mOwnerToTOwner");
		EObject tmpMOwner = _localVariable_0;
		EObject tmpTOwner = _localVariable_1;
		EObject tmpTFlow = _localVariable_2;
		EObject tmpMOwnerToTOwner = _localVariable_3;
		if (tmpMOwner instanceof MAbstractFlowElement) {
			MAbstractFlowElement mOwner = (MAbstractFlowElement) tmpMOwner;
			if (tmpTOwner instanceof TAbstractFlowElement) {
				TAbstractFlowElement tOwner = (TAbstractFlowElement) tmpTOwner;
				if (tmpTFlow instanceof TFlow) {
					TFlow tFlow = (TFlow) tmpTFlow;
					if (tmpMOwnerToTOwner instanceof MAbstractFlowElementToTAbstractFlowElement) {
						MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner = (MAbstractFlowElementToTAbstractFlowElement) tmpMOwnerToTOwner;
						return new Object[] { mOwner, tOwner, tFlow, mOwnerToTOwner, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_11_1_performtransformation_blackBBBBFBB(MAbstractFlowElement mOwner,
			TAbstractFlowElement tOwner, TFlow tFlow, MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner,
			FlowNode _this, IsApplicableMatch isApplicableMatch) {
		if (!tFlow.equals(tOwner)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { mOwner, tOwner, tFlow, mOwnerToTOwner, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_11_1_performtransformation_bindingAndBlackFFFFFBB(FlowNode _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FlowNode_11_1_performtransformation_binding = pattern_FlowNode_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_FlowNode_11_1_performtransformation_binding != null) {
			MAbstractFlowElement mOwner = (MAbstractFlowElement) result_pattern_FlowNode_11_1_performtransformation_binding[0];
			TAbstractFlowElement tOwner = (TAbstractFlowElement) result_pattern_FlowNode_11_1_performtransformation_binding[1];
			TFlow tFlow = (TFlow) result_pattern_FlowNode_11_1_performtransformation_binding[2];
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner = (MAbstractFlowElementToTAbstractFlowElement) result_pattern_FlowNode_11_1_performtransformation_binding[3];

			Object[] result_pattern_FlowNode_11_1_performtransformation_black = pattern_FlowNode_11_1_performtransformation_blackBBBBFBB(
					mOwner, tOwner, tFlow, mOwnerToTOwner, _this, isApplicableMatch);
			if (result_pattern_FlowNode_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FlowNode_11_1_performtransformation_black[4];

				return new Object[] { mOwner, tOwner, tFlow, mOwnerToTOwner, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_11_1_performtransformation_greenFBFBF(MAbstractFlowElement mOwner,
			TFlow tFlow) {
		MFlow mFlow = ModiscoFactory.eINSTANCE.createMFlow();
		MAbstractFlowElementToTAbstractFlowElement mAbstFlowToTAbstFlow = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MFlowToTFlow mFlowToTFlow = PmFactory.eINSTANCE.createMFlowToTFlow();
		mOwner.getOwnedFlows().add(mFlow);
		mAbstFlowToTAbstFlow.setTarget(tFlow);
		mAbstFlowToTAbstFlow.setSource(mFlow);
		mFlowToTFlow.setTarget(tFlow);
		mFlowToTFlow.setSource(mFlow);
		return new Object[] { mFlow, mOwner, mAbstFlowToTAbstFlow, tFlow, mFlowToTFlow };
	}

	public static final Object[] pattern_FlowNode_11_2_collecttranslatedelements_blackBBBB(MFlow mFlow,
			MAbstractFlowElementToTAbstractFlowElement mAbstFlowToTAbstFlow, TFlow tFlow, MFlowToTFlow mFlowToTFlow) {
		return new Object[] { mFlow, mAbstFlowToTAbstFlow, tFlow, mFlowToTFlow };
	}

	public static final Object[] pattern_FlowNode_11_2_collecttranslatedelements_greenFBBBB(MFlow mFlow,
			MAbstractFlowElementToTAbstractFlowElement mAbstFlowToTAbstFlow, TFlow tFlow, MFlowToTFlow mFlowToTFlow) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mFlow);
		ruleresult.getCreatedLinkElements().add(mAbstFlowToTAbstFlow);
		ruleresult.getTranslatedElements().add(tFlow);
		ruleresult.getCreatedLinkElements().add(mFlowToTFlow);
		return new Object[] { ruleresult, mFlow, mAbstFlowToTAbstFlow, tFlow, mFlowToTFlow };
	}

	public static final Object[] pattern_FlowNode_11_3_bookkeepingforedges_blackBBBBBBBB(PerformRuleResult ruleresult,
			EObject mFlow, EObject mOwner, EObject mAbstFlowToTAbstFlow, EObject tOwner, EObject tFlow,
			EObject mFlowToTFlow, EObject mOwnerToTOwner) {
		if (!mFlow.equals(mOwner)) {
			if (!mFlow.equals(tOwner)) {
				if (!mFlow.equals(tFlow)) {
					if (!mFlow.equals(mFlowToTFlow)) {
						if (!mFlow.equals(mOwnerToTOwner)) {
							if (!mOwner.equals(tOwner)) {
								if (!mOwner.equals(tFlow)) {
									if (!mOwner.equals(mOwnerToTOwner)) {
										if (!mAbstFlowToTAbstFlow.equals(mFlow)) {
											if (!mAbstFlowToTAbstFlow.equals(mOwner)) {
												if (!mAbstFlowToTAbstFlow.equals(tOwner)) {
													if (!mAbstFlowToTAbstFlow.equals(tFlow)) {
														if (!mAbstFlowToTAbstFlow.equals(mFlowToTFlow)) {
															if (!mAbstFlowToTAbstFlow.equals(mOwnerToTOwner)) {
																if (!tFlow.equals(tOwner)) {
																	if (!mFlowToTFlow.equals(mOwner)) {
																		if (!mFlowToTFlow.equals(tOwner)) {
																			if (!mFlowToTFlow.equals(tFlow)) {
																				if (!mFlowToTFlow
																						.equals(mOwnerToTOwner)) {
																					if (!mOwnerToTOwner
																							.equals(tOwner)) {
																						if (!mOwnerToTOwner
																								.equals(tFlow)) {
																							return new Object[] {
																									ruleresult, mFlow,
																									mOwner,
																									mAbstFlowToTAbstFlow,
																									tOwner, tFlow,
																									mFlowToTFlow,
																									mOwnerToTOwner };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_FlowNode_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject mFlow, EObject mOwner, EObject mAbstFlowToTAbstFlow, EObject tOwner,
			EObject tFlow, EObject mFlowToTFlow) {
		EMoflonEdge mOwner__mFlow____ownedFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlow__mOwner____flowOwner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOwner__tFlow____ownedFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFlow__tOwner____flowOwner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAbstFlowToTAbstFlow__tFlow____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowToTFlow__tFlow____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAbstFlowToTAbstFlow__mFlow____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowToTFlow__mFlow____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FlowNode";
		String mOwner__mFlow____ownedFlows_name_prime = "ownedFlows";
		String mFlow__mOwner____flowOwner_name_prime = "flowOwner";
		String tOwner__tFlow____ownedFlows_name_prime = "ownedFlows";
		String tFlow__tOwner____flowOwner_name_prime = "flowOwner";
		String mAbstFlowToTAbstFlow__tFlow____target_name_prime = "target";
		String mFlowToTFlow__tFlow____target_name_prime = "target";
		String mAbstFlowToTAbstFlow__mFlow____source_name_prime = "source";
		String mFlowToTFlow__mFlow____source_name_prime = "source";
		mOwner__mFlow____ownedFlows.setSrc(mOwner);
		mOwner__mFlow____ownedFlows.setTrg(mFlow);
		ruleresult.getCreatedEdges().add(mOwner__mFlow____ownedFlows);
		mFlow__mOwner____flowOwner.setSrc(mFlow);
		mFlow__mOwner____flowOwner.setTrg(mOwner);
		ruleresult.getCreatedEdges().add(mFlow__mOwner____flowOwner);
		tOwner__tFlow____ownedFlows.setSrc(tOwner);
		tOwner__tFlow____ownedFlows.setTrg(tFlow);
		ruleresult.getTranslatedEdges().add(tOwner__tFlow____ownedFlows);
		tFlow__tOwner____flowOwner.setSrc(tFlow);
		tFlow__tOwner____flowOwner.setTrg(tOwner);
		ruleresult.getTranslatedEdges().add(tFlow__tOwner____flowOwner);
		mAbstFlowToTAbstFlow__tFlow____target.setSrc(mAbstFlowToTAbstFlow);
		mAbstFlowToTAbstFlow__tFlow____target.setTrg(tFlow);
		ruleresult.getCreatedEdges().add(mAbstFlowToTAbstFlow__tFlow____target);
		mFlowToTFlow__tFlow____target.setSrc(mFlowToTFlow);
		mFlowToTFlow__tFlow____target.setTrg(tFlow);
		ruleresult.getCreatedEdges().add(mFlowToTFlow__tFlow____target);
		mAbstFlowToTAbstFlow__mFlow____source.setSrc(mAbstFlowToTAbstFlow);
		mAbstFlowToTAbstFlow__mFlow____source.setTrg(mFlow);
		ruleresult.getCreatedEdges().add(mAbstFlowToTAbstFlow__mFlow____source);
		mFlowToTFlow__mFlow____source.setSrc(mFlowToTFlow);
		mFlowToTFlow__mFlow____source.setTrg(mFlow);
		ruleresult.getCreatedEdges().add(mFlowToTFlow__mFlow____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mOwner__mFlow____ownedFlows.setName(mOwner__mFlow____ownedFlows_name_prime);
		mFlow__mOwner____flowOwner.setName(mFlow__mOwner____flowOwner_name_prime);
		tOwner__tFlow____ownedFlows.setName(tOwner__tFlow____ownedFlows_name_prime);
		tFlow__tOwner____flowOwner.setName(tFlow__tOwner____flowOwner_name_prime);
		mAbstFlowToTAbstFlow__tFlow____target.setName(mAbstFlowToTAbstFlow__tFlow____target_name_prime);
		mFlowToTFlow__tFlow____target.setName(mFlowToTFlow__tFlow____target_name_prime);
		mAbstFlowToTAbstFlow__mFlow____source.setName(mAbstFlowToTAbstFlow__mFlow____source_name_prime);
		mFlowToTFlow__mFlow____source.setName(mFlowToTFlow__mFlow____source_name_prime);
		return new Object[] { ruleresult, mFlow, mOwner, mAbstFlowToTAbstFlow, tOwner, tFlow, mFlowToTFlow,
				mOwner__mFlow____ownedFlows, mFlow__mOwner____flowOwner, tOwner__tFlow____ownedFlows,
				tFlow__tOwner____flowOwner, mAbstFlowToTAbstFlow__tFlow____target, mFlowToTFlow__tFlow____target,
				mAbstFlowToTAbstFlow__mFlow____source, mFlowToTFlow__mFlow____source };
	}

	public static final void pattern_FlowNode_11_5_registerobjects_expressionBBBBBBBBB(FlowNode _this,
			PerformRuleResult ruleresult, EObject mFlow, EObject mOwner, EObject mAbstFlowToTAbstFlow, EObject tOwner,
			EObject tFlow, EObject mFlowToTFlow, EObject mOwnerToTOwner) {
		_this.registerObjects_BWD(ruleresult, mFlow, mOwner, mAbstFlowToTAbstFlow, tOwner, tFlow, mFlowToTFlow,
				mOwnerToTOwner);

	}

	public static final PerformRuleResult pattern_FlowNode_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FlowNode_12_1_preparereturnvalue_bindingFB(FlowNode _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_12_1_preparereturnvalue_blackFBB(EClass eClass, FlowNode _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FlowNode_12_1_preparereturnvalue_bindingAndBlackFFB(FlowNode _this) {
		Object[] result_pattern_FlowNode_12_1_preparereturnvalue_binding = pattern_FlowNode_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FlowNode_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FlowNode_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FlowNode_12_1_preparereturnvalue_black = pattern_FlowNode_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FlowNode_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FlowNode_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FlowNode";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FlowNode_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tOwner");
		EObject _localVariable_1 = match.getObject("tFlow");
		EObject tmpTOwner = _localVariable_0;
		EObject tmpTFlow = _localVariable_1;
		if (tmpTOwner instanceof TAbstractFlowElement) {
			TAbstractFlowElement tOwner = (TAbstractFlowElement) tmpTOwner;
			if (tmpTFlow instanceof TFlow) {
				TFlow tFlow = (TFlow) tmpTFlow;
				return new Object[] { tOwner, tFlow, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FlowNode_12_2_corematch_blackFBBFB(TAbstractFlowElement tOwner,
			TFlow tFlow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tFlow.equals(tOwner)) {
			for (MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tOwner, MAbstractFlowElementToTAbstractFlowElement.class, "target")) {
				MAbstractFlowElement mOwner = mOwnerToTOwner.getSource();
				if (mOwner != null) {
					_result.add(new Object[] { mOwner, tOwner, tFlow, mOwnerToTOwner, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FlowNode_12_3_findcontext_blackBBBB(MAbstractFlowElement mOwner,
			TAbstractFlowElement tOwner, TFlow tFlow, MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tFlow.equals(tOwner)) {
			if (tOwner.getOwnedFlows().contains(tFlow)) {
				if (mOwner.equals(mOwnerToTOwner.getSource())) {
					if (tOwner.equals(mOwnerToTOwner.getTarget())) {
						_result.add(new Object[] { mOwner, tOwner, tFlow, mOwnerToTOwner });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FlowNode_12_3_findcontext_greenBBBBFFFFF(MAbstractFlowElement mOwner,
			TAbstractFlowElement tOwner, TFlow tFlow, MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tOwner__tFlow____ownedFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFlow__tOwner____flowOwner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOwnerToTOwner__mOwner____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOwnerToTOwner__tOwner____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tOwner__tFlow____ownedFlows_name_prime = "ownedFlows";
		String tFlow__tOwner____flowOwner_name_prime = "flowOwner";
		String mOwnerToTOwner__mOwner____source_name_prime = "source";
		String mOwnerToTOwner__tOwner____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mOwner);
		isApplicableMatch.getAllContextElements().add(tOwner);
		isApplicableMatch.getAllContextElements().add(tFlow);
		isApplicableMatch.getAllContextElements().add(mOwnerToTOwner);
		tOwner__tFlow____ownedFlows.setSrc(tOwner);
		tOwner__tFlow____ownedFlows.setTrg(tFlow);
		isApplicableMatch.getAllContextElements().add(tOwner__tFlow____ownedFlows);
		tFlow__tOwner____flowOwner.setSrc(tFlow);
		tFlow__tOwner____flowOwner.setTrg(tOwner);
		isApplicableMatch.getAllContextElements().add(tFlow__tOwner____flowOwner);
		mOwnerToTOwner__mOwner____source.setSrc(mOwnerToTOwner);
		mOwnerToTOwner__mOwner____source.setTrg(mOwner);
		isApplicableMatch.getAllContextElements().add(mOwnerToTOwner__mOwner____source);
		mOwnerToTOwner__tOwner____target.setSrc(mOwnerToTOwner);
		mOwnerToTOwner__tOwner____target.setTrg(tOwner);
		isApplicableMatch.getAllContextElements().add(mOwnerToTOwner__tOwner____target);
		tOwner__tFlow____ownedFlows.setName(tOwner__tFlow____ownedFlows_name_prime);
		tFlow__tOwner____flowOwner.setName(tFlow__tOwner____flowOwner_name_prime);
		mOwnerToTOwner__mOwner____source.setName(mOwnerToTOwner__mOwner____source_name_prime);
		mOwnerToTOwner__tOwner____target.setName(mOwnerToTOwner__tOwner____target_name_prime);
		return new Object[] { mOwner, tOwner, tFlow, mOwnerToTOwner, isApplicableMatch, tOwner__tFlow____ownedFlows,
				tFlow__tOwner____flowOwner, mOwnerToTOwner__mOwner____source, mOwnerToTOwner__tOwner____target };
	}

	public static final Object[] pattern_FlowNode_12_4_solveCSP_bindingFBBBBBB(FlowNode _this,
			IsApplicableMatch isApplicableMatch, MAbstractFlowElement mOwner, TAbstractFlowElement tOwner, TFlow tFlow,
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mOwner, tOwner, tFlow,
				mOwnerToTOwner);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mOwner, tOwner, tFlow, mOwnerToTOwner };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FlowNode_12_4_solveCSP_bindingAndBlackFBBBBBB(FlowNode _this,
			IsApplicableMatch isApplicableMatch, MAbstractFlowElement mOwner, TAbstractFlowElement tOwner, TFlow tFlow,
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner) {
		Object[] result_pattern_FlowNode_12_4_solveCSP_binding = pattern_FlowNode_12_4_solveCSP_bindingFBBBBBB(_this,
				isApplicableMatch, mOwner, tOwner, tFlow, mOwnerToTOwner);
		if (result_pattern_FlowNode_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FlowNode_12_4_solveCSP_binding[0];

			Object[] result_pattern_FlowNode_12_4_solveCSP_black = pattern_FlowNode_12_4_solveCSP_blackB(csp);
			if (result_pattern_FlowNode_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mOwner, tOwner, tFlow, mOwnerToTOwner };
			}
		}
		return null;
	}

	public static final boolean pattern_FlowNode_12_5_checkCSP_expressionFBB(FlowNode _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FlowNode_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FlowNode_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FlowNode";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FlowNode_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FlowNode_20_1_preparereturnvalue_bindingFB(FlowNode _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_20_1_preparereturnvalue_blackFBBF(EClass __eClass, FlowNode _this) {
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

	public static final Object[] pattern_FlowNode_20_1_preparereturnvalue_bindingAndBlackFFBF(FlowNode _this) {
		Object[] result_pattern_FlowNode_20_1_preparereturnvalue_binding = pattern_FlowNode_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FlowNode_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FlowNode_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FlowNode_20_1_preparereturnvalue_black = pattern_FlowNode_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FlowNode_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FlowNode_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FlowNode_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FlowNode_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedFlows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTOwner = _edge_ownedFlows.getSrc();
		if (tmpTOwner instanceof TAbstractFlowElement) {
			TAbstractFlowElement tOwner = (TAbstractFlowElement) tmpTOwner;
			EObject tmpTFlow = _edge_ownedFlows.getTrg();
			if (tmpTFlow instanceof TFlow) {
				TFlow tFlow = (TFlow) tmpTFlow;
				if (!tFlow.equals(tOwner)) {
					if (tOwner.getOwnedFlows().contains(tFlow)) {
						_result.add(new Object[] { tOwner, tFlow, _edge_ownedFlows });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FlowNode_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FlowNode_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FlowNode _this, Match match, TAbstractFlowElement tOwner, TFlow tFlow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tOwner, tFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FlowNode_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FlowNode _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FlowNode_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FlowNode_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FlowNode_21_1_preparereturnvalue_bindingFB(FlowNode _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_21_1_preparereturnvalue_blackFBBF(EClass __eClass, FlowNode _this) {
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

	public static final Object[] pattern_FlowNode_21_1_preparereturnvalue_bindingAndBlackFFBF(FlowNode _this) {
		Object[] result_pattern_FlowNode_21_1_preparereturnvalue_binding = pattern_FlowNode_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FlowNode_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FlowNode_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FlowNode_21_1_preparereturnvalue_black = pattern_FlowNode_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FlowNode_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FlowNode_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FlowNode_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FlowNode_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedFlows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMOwner = _edge_ownedFlows.getSrc();
		if (tmpMOwner instanceof MAbstractFlowElement) {
			MAbstractFlowElement mOwner = (MAbstractFlowElement) tmpMOwner;
			EObject tmpMFlow = _edge_ownedFlows.getTrg();
			if (tmpMFlow instanceof MFlow) {
				MFlow mFlow = (MFlow) tmpMFlow;
				if (!mFlow.equals(mOwner)) {
					if (mOwner.getOwnedFlows().contains(mFlow)) {
						_result.add(new Object[] { mFlow, mOwner, _edge_ownedFlows });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FlowNode_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FlowNode_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FlowNode _this, Match match, MFlow mFlow, MAbstractFlowElement mOwner) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mFlow, mOwner);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FlowNode_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FlowNode _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FlowNode_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FlowNode_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FlowNode_24_1_prepare_blackB(FlowNode _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FlowNode_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FlowNode_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mFlow");
		EObject _localVariable_1 = sourceMatch.getObject("mOwner");
		EObject _localVariable_2 = targetMatch.getObject("tOwner");
		EObject _localVariable_3 = targetMatch.getObject("tFlow");
		EObject tmpMFlow = _localVariable_0;
		EObject tmpMOwner = _localVariable_1;
		EObject tmpTOwner = _localVariable_2;
		EObject tmpTFlow = _localVariable_3;
		if (tmpMFlow instanceof MFlow) {
			MFlow mFlow = (MFlow) tmpMFlow;
			if (tmpMOwner instanceof MAbstractFlowElement) {
				MAbstractFlowElement mOwner = (MAbstractFlowElement) tmpMOwner;
				if (tmpTOwner instanceof TAbstractFlowElement) {
					TAbstractFlowElement tOwner = (TAbstractFlowElement) tmpTOwner;
					if (tmpTFlow instanceof TFlow) {
						TFlow tFlow = (TFlow) tmpTFlow;
						return new Object[] { mFlow, mOwner, tOwner, tFlow, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_24_2_matchsrctrgcontext_blackBBBBBB(MFlow mFlow,
			MAbstractFlowElement mOwner, TAbstractFlowElement tOwner, TFlow tFlow, Match sourceMatch,
			Match targetMatch) {
		if (!mFlow.equals(mOwner)) {
			if (!tFlow.equals(tOwner)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { mFlow, mOwner, tOwner, tFlow, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_FlowNode_24_2_matchsrctrgcontext_binding = pattern_FlowNode_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_FlowNode_24_2_matchsrctrgcontext_binding != null) {
			MFlow mFlow = (MFlow) result_pattern_FlowNode_24_2_matchsrctrgcontext_binding[0];
			MAbstractFlowElement mOwner = (MAbstractFlowElement) result_pattern_FlowNode_24_2_matchsrctrgcontext_binding[1];
			TAbstractFlowElement tOwner = (TAbstractFlowElement) result_pattern_FlowNode_24_2_matchsrctrgcontext_binding[2];
			TFlow tFlow = (TFlow) result_pattern_FlowNode_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_FlowNode_24_2_matchsrctrgcontext_black = pattern_FlowNode_24_2_matchsrctrgcontext_blackBBBBBB(
					mFlow, mOwner, tOwner, tFlow, sourceMatch, targetMatch);
			if (result_pattern_FlowNode_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mFlow, mOwner, tOwner, tFlow, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_24_3_solvecsp_bindingFBBBBBBB(FlowNode _this, MFlow mFlow,
			MAbstractFlowElement mOwner, TAbstractFlowElement tOwner, TFlow tFlow, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(mFlow, mOwner, tOwner, tFlow, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, mFlow, mOwner, tOwner, tFlow, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FlowNode_24_3_solvecsp_bindingAndBlackFBBBBBBB(FlowNode _this, MFlow mFlow,
			MAbstractFlowElement mOwner, TAbstractFlowElement tOwner, TFlow tFlow, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_FlowNode_24_3_solvecsp_binding = pattern_FlowNode_24_3_solvecsp_bindingFBBBBBBB(_this,
				mFlow, mOwner, tOwner, tFlow, sourceMatch, targetMatch);
		if (result_pattern_FlowNode_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_FlowNode_24_3_solvecsp_binding[0];

			Object[] result_pattern_FlowNode_24_3_solvecsp_black = pattern_FlowNode_24_3_solvecsp_blackB(csp);
			if (result_pattern_FlowNode_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mFlow, mOwner, tOwner, tFlow, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_FlowNode_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_FlowNode_24_5_matchcorrcontext_blackBBFBB(
			MAbstractFlowElement mOwner, TAbstractFlowElement tOwner, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mOwner, MAbstractFlowElementToTAbstractFlowElement.class, "source")) {
				if (tOwner.equals(mOwnerToTOwner.getTarget())) {
					_result.add(new Object[] { mOwner, tOwner, mOwnerToTOwner, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FlowNode_24_5_matchcorrcontext_greenBBBF(
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "FlowNode";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mOwnerToTOwner);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mOwnerToTOwner, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_FlowNode_24_6_createcorrespondence_blackBBBBB(MFlow mFlow,
			MAbstractFlowElement mOwner, TAbstractFlowElement tOwner, TFlow tFlow, CCMatch ccMatch) {
		if (!mFlow.equals(mOwner)) {
			if (!tFlow.equals(tOwner)) {
				return new Object[] { mFlow, mOwner, tOwner, tFlow, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_24_6_createcorrespondence_greenBFBFB(MFlow mFlow, TFlow tFlow,
			CCMatch ccMatch) {
		MAbstractFlowElementToTAbstractFlowElement mAbstFlowToTAbstFlow = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MFlowToTFlow mFlowToTFlow = PmFactory.eINSTANCE.createMFlowToTFlow();
		mAbstFlowToTAbstFlow.setTarget(tFlow);
		mAbstFlowToTAbstFlow.setSource(mFlow);
		ccMatch.getCreateCorr().add(mAbstFlowToTAbstFlow);
		mFlowToTFlow.setTarget(tFlow);
		mFlowToTFlow.setSource(mFlow);
		ccMatch.getCreateCorr().add(mFlowToTFlow);
		return new Object[] { mFlow, mAbstFlowToTAbstFlow, tFlow, mFlowToTFlow, ccMatch };
	}

	public static final Object[] pattern_FlowNode_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_FlowNode_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "FlowNode";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_FlowNode_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FlowNode_27_1_matchtggpattern_blackBB(MFlow mFlow,
			MAbstractFlowElement mOwner) {
		if (!mFlow.equals(mOwner)) {
			if (mOwner.getOwnedFlows().contains(mFlow)) {
				return new Object[] { mFlow, mOwner };
			}
		}
		return null;
	}

	public static final boolean pattern_FlowNode_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FlowNode_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FlowNode_28_1_matchtggpattern_blackBB(TAbstractFlowElement tOwner,
			TFlow tFlow) {
		if (!tFlow.equals(tOwner)) {
			if (tOwner.getOwnedFlows().contains(tFlow)) {
				return new Object[] { tOwner, tFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_FlowNode_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FlowNode_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FlowNode_29_1_createresult_blackB(FlowNode _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FlowNode_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FlowNode_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MAbstractFlowElement mOwner) {
		if (ruleResult.getSourceObjects().contains(mOwner)) {
			return new Object[] { ruleResult, mOwner };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner) {
		if (ruleResult.getCorrObjects().contains(mOwnerToTOwner)) {
			return new Object[] { ruleResult, mOwnerToTOwner };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TAbstractFlowElement tOwner) {
		if (ruleResult.getTargetObjects().contains(tOwner)) {
			return new Object[] { ruleResult, tOwner };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FlowNode_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mOwnerToTOwnerList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMOwnerToTOwner : mOwnerToTOwnerList.getEntryObjects()) {
				if (tmpMOwnerToTOwner instanceof MAbstractFlowElementToTAbstractFlowElement) {
					MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner = (MAbstractFlowElementToTAbstractFlowElement) tmpMOwnerToTOwner;
					MAbstractFlowElement mOwner = mOwnerToTOwner.getSource();
					if (mOwner != null) {
						TAbstractFlowElement tOwner = mOwnerToTOwner.getTarget();
						if (tOwner != null) {
							if (pattern_FlowNode_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									mOwnerToTOwner) == null) {
								if (pattern_FlowNode_29_2_isapplicablecore_black_nac_0BB(ruleResult, mOwner) == null) {
									if (pattern_FlowNode_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											tOwner) == null) {
										_result.add(new Object[] { mOwnerToTOwnerList, mOwner, mOwnerToTOwner, tOwner,
												ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_FlowNode_29_3_solveCSP_bindingFBBBBBB(FlowNode _this,
			IsApplicableMatch isApplicableMatch, MAbstractFlowElement mOwner, TAbstractFlowElement tOwner,
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mOwner, tOwner, mOwnerToTOwner,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mOwner, tOwner, mOwnerToTOwner, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FlowNode_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FlowNode_29_3_solveCSP_bindingAndBlackFBBBBBB(FlowNode _this,
			IsApplicableMatch isApplicableMatch, MAbstractFlowElement mOwner, TAbstractFlowElement tOwner,
			MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FlowNode_29_3_solveCSP_binding = pattern_FlowNode_29_3_solveCSP_bindingFBBBBBB(_this,
				isApplicableMatch, mOwner, tOwner, mOwnerToTOwner, ruleResult);
		if (result_pattern_FlowNode_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FlowNode_29_3_solveCSP_binding[0];

			Object[] result_pattern_FlowNode_29_3_solveCSP_black = pattern_FlowNode_29_3_solveCSP_blackB(csp);
			if (result_pattern_FlowNode_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mOwner, tOwner, mOwnerToTOwner, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FlowNode_29_4_checkCSP_expressionFBB(FlowNode _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FlowNode_29_5_checknacs_blackBBB(MAbstractFlowElement mOwner,
			TAbstractFlowElement tOwner, MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner) {
		return new Object[] { mOwner, tOwner, mOwnerToTOwner };
	}

	public static final Object[] pattern_FlowNode_29_6_perform_blackBBBB(MAbstractFlowElement mOwner,
			TAbstractFlowElement tOwner, MAbstractFlowElementToTAbstractFlowElement mOwnerToTOwner,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mOwner, tOwner, mOwnerToTOwner, ruleResult };
	}

	public static final Object[] pattern_FlowNode_29_6_perform_greenFBFBFFB(MAbstractFlowElement mOwner,
			TAbstractFlowElement tOwner, ModelgeneratorRuleResult ruleResult) {
		MFlow mFlow = ModiscoFactory.eINSTANCE.createMFlow();
		MAbstractFlowElementToTAbstractFlowElement mAbstFlowToTAbstFlow = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		TFlow tFlow = BasicFactory.eINSTANCE.createTFlow();
		MFlowToTFlow mFlowToTFlow = PmFactory.eINSTANCE.createMFlowToTFlow();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mOwner.getOwnedFlows().add(mFlow);
		ruleResult.getSourceObjects().add(mFlow);
		mAbstFlowToTAbstFlow.setSource(mFlow);
		ruleResult.getCorrObjects().add(mAbstFlowToTAbstFlow);
		tOwner.getOwnedFlows().add(tFlow);
		mAbstFlowToTAbstFlow.setTarget(tFlow);
		ruleResult.getTargetObjects().add(tFlow);
		mFlowToTFlow.setTarget(tFlow);
		mFlowToTFlow.setSource(mFlow);
		ruleResult.getCorrObjects().add(mFlowToTFlow);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mFlow, mOwner, mAbstFlowToTAbstFlow, tOwner, tFlow, mFlowToTFlow, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_FlowNode_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FlowNodeImpl
