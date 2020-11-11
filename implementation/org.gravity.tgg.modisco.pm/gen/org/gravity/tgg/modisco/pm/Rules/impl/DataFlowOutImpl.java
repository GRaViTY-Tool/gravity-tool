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

import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;

import org.gravity.tgg.modisco.pm.Rules.DataFlowOut;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.TAbstractFlowElement;

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
 * An implementation of the model object '<em><b>Data Flow Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DataFlowOutImpl extends AbstractRuleImpl implements DataFlowOut {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowOutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getDataFlowOut();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MAbstractFlowElement mTarget, MFlow mSource) {

		Object[] result1_black = DataFlowOutImpl.pattern_DataFlowOut_0_1_initialbindings_blackBBBB(this, match, mTarget,
				mSource);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mTarget] = " + mTarget + ", " + "[mSource] = " + mSource + ".");
		}

		Object[] result2_bindingAndBlack = DataFlowOutImpl.pattern_DataFlowOut_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, mTarget, mSource);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mTarget] = " + mTarget + ", " + "[mSource] = " + mSource + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (DataFlowOutImpl.pattern_DataFlowOut_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = DataFlowOutImpl
					.pattern_DataFlowOut_0_4_collectelementstobetranslated_blackBBB(match, mTarget, mSource);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mTarget] = " + mTarget + ", " + "[mSource] = " + mSource + ".");
			}
			DataFlowOutImpl.pattern_DataFlowOut_0_4_collectelementstobetranslated_greenBBBFF(match, mTarget, mSource);
			//nothing EMoflonEdge mTarget__mSource____incomingFlows = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mSource__mTarget____flowTarget = (EMoflonEdge) result4_green[4];

			Object[] result5_black = DataFlowOutImpl.pattern_DataFlowOut_0_5_collectcontextelements_blackBBB(match,
					mTarget, mSource);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mTarget] = " + mTarget + ", " + "[mSource] = " + mSource + ".");
			}
			DataFlowOutImpl.pattern_DataFlowOut_0_5_collectcontextelements_greenBBB(match, mTarget, mSource);

			// 
			DataFlowOutImpl.pattern_DataFlowOut_0_6_registerobjectstomatch_expressionBBBB(this, match, mTarget,
					mSource);
			return DataFlowOutImpl.pattern_DataFlowOut_0_7_expressionF();
		} else {
			return DataFlowOutImpl.pattern_DataFlowOut_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = DataFlowOutImpl
				.pattern_DataFlowOut_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MAbstractFlowElement mTarget = (MAbstractFlowElement) result1_bindingAndBlack[0];
		TAbstractFlowElement tSource = (TAbstractFlowElement) result1_bindingAndBlack[1];
		MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result1_bindingAndBlack[2];
		MFlow mSource = (MFlow) result1_bindingAndBlack[3];
		MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result1_bindingAndBlack[4];
		TAbstractFlowElement tFlow = (TAbstractFlowElement) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		DataFlowOutImpl.pattern_DataFlowOut_1_1_performtransformation_greenBB(tSource, tFlow);

		Object[] result2_green = DataFlowOutImpl.pattern_DataFlowOut_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = DataFlowOutImpl.pattern_DataFlowOut_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mTarget] = " + mTarget + ", " + "[tSource] = " + tSource + ", " + "[mFlowToTFlow] = "
					+ mFlowToTFlow + ", " + "[mSource] = " + mSource + ", " + "[mSourceToTSource] = " + mSourceToTSource
					+ ", " + "[tFlow] = " + tFlow + ".");
		}
		DataFlowOutImpl.pattern_DataFlowOut_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, mTarget, tSource,
				mSource, tFlow);
		//nothing EMoflonEdge mTarget__mSource____incomingFlows = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mSource__mTarget____flowTarget = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tFlow__tSource____outgoingFlows = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tSource__tFlow____incomingFlows = (EMoflonEdge) result3_green[8];

		// 
		// 
		DataFlowOutImpl.pattern_DataFlowOut_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, mTarget, tSource,
				mFlowToTFlow, mSource, mSourceToTSource, tFlow);
		return DataFlowOutImpl.pattern_DataFlowOut_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = DataFlowOutImpl
				.pattern_DataFlowOut_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = DataFlowOutImpl.pattern_DataFlowOut_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = DataFlowOutImpl.pattern_DataFlowOut_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MAbstractFlowElement mTarget = (MAbstractFlowElement) result2_binding[0];
		MFlow mSource = (MFlow) result2_binding[1];
		for (Object[] result2_black : DataFlowOutImpl.pattern_DataFlowOut_2_2_corematch_blackBFFBFFB(mTarget, mSource,
				match)) {
			TAbstractFlowElement tSource = (TAbstractFlowElement) result2_black[1];
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result2_black[2];
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result2_black[4];
			TAbstractFlowElement tFlow = (TAbstractFlowElement) result2_black[5];
			// ForEach 
			for (Object[] result3_black : DataFlowOutImpl.pattern_DataFlowOut_2_3_findcontext_blackBBBBBB(mTarget,
					tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow)) {
				Object[] result3_green = DataFlowOutImpl.pattern_DataFlowOut_2_3_findcontext_greenBBBBBBFFFFFFF(mTarget,
						tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mFlowToTFlow__mTarget____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mTarget__mSource____incomingFlows = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mSource__mTarget____flowTarget = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mSourceToTSource__tSource____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mSourceToTSource__mSource____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mFlowToTFlow__tFlow____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = DataFlowOutImpl
						.pattern_DataFlowOut_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, mTarget,
								tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTarget] = " + mTarget + ", "
							+ "[tSource] = " + tSource + ", " + "[mFlowToTFlow] = " + mFlowToTFlow + ", "
							+ "[mSource] = " + mSource + ", " + "[mSourceToTSource] = " + mSourceToTSource + ", "
							+ "[tFlow] = " + tFlow + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (DataFlowOutImpl.pattern_DataFlowOut_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = DataFlowOutImpl
							.pattern_DataFlowOut_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					DataFlowOutImpl.pattern_DataFlowOut_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return DataFlowOutImpl.pattern_DataFlowOut_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MAbstractFlowElement mTarget, MFlow mSource) {
		match.registerObject("mTarget", mTarget);
		match.registerObject("mSource", mSource);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MAbstractFlowElement mTarget, MFlow mSource) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTarget", mTarget);
		isApplicableMatch.registerObject("tSource", tSource);
		isApplicableMatch.registerObject("mFlowToTFlow", mFlowToTFlow);
		isApplicableMatch.registerObject("mSource", mSource);
		isApplicableMatch.registerObject("mSourceToTSource", mSourceToTSource);
		isApplicableMatch.registerObject("tFlow", tFlow);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mTarget, EObject tSource,
			EObject mFlowToTFlow, EObject mSource, EObject mSourceToTSource, EObject tFlow) {
		ruleresult.registerObject("mTarget", mTarget);
		ruleresult.registerObject("tSource", tSource);
		ruleresult.registerObject("mFlowToTFlow", mFlowToTFlow);
		ruleresult.registerObject("mSource", mSource);
		ruleresult.registerObject("mSourceToTSource", mSourceToTSource);
		ruleresult.registerObject("tFlow", tFlow);

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
	public boolean isAppropriate_BWD(Match match, TAbstractFlowElement tSource, TAbstractFlowElement tFlow) {

		Object[] result1_black = DataFlowOutImpl.pattern_DataFlowOut_10_1_initialbindings_blackBBBB(this, match,
				tSource, tFlow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSource] = " + tSource + ", " + "[tFlow] = " + tFlow + ".");
		}

		Object[] result2_bindingAndBlack = DataFlowOutImpl.pattern_DataFlowOut_10_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, tSource, tFlow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSource] = " + tSource + ", " + "[tFlow] = " + tFlow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (DataFlowOutImpl.pattern_DataFlowOut_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = DataFlowOutImpl
					.pattern_DataFlowOut_10_4_collectelementstobetranslated_blackBBB(match, tSource, tFlow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSource] = " + tSource + ", " + "[tFlow] = " + tFlow + ".");
			}
			DataFlowOutImpl.pattern_DataFlowOut_10_4_collectelementstobetranslated_greenBBBFF(match, tSource, tFlow);
			//nothing EMoflonEdge tFlow__tSource____outgoingFlows = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tSource__tFlow____incomingFlows = (EMoflonEdge) result4_green[4];

			Object[] result5_black = DataFlowOutImpl.pattern_DataFlowOut_10_5_collectcontextelements_blackBBB(match,
					tSource, tFlow);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSource] = " + tSource + ", " + "[tFlow] = " + tFlow + ".");
			}
			DataFlowOutImpl.pattern_DataFlowOut_10_5_collectcontextelements_greenBBB(match, tSource, tFlow);

			// 
			DataFlowOutImpl.pattern_DataFlowOut_10_6_registerobjectstomatch_expressionBBBB(this, match, tSource, tFlow);
			return DataFlowOutImpl.pattern_DataFlowOut_10_7_expressionF();
		} else {
			return DataFlowOutImpl.pattern_DataFlowOut_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = DataFlowOutImpl
				.pattern_DataFlowOut_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MAbstractFlowElement mTarget = (MAbstractFlowElement) result1_bindingAndBlack[0];
		TAbstractFlowElement tSource = (TAbstractFlowElement) result1_bindingAndBlack[1];
		MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result1_bindingAndBlack[2];
		MFlow mSource = (MFlow) result1_bindingAndBlack[3];
		MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result1_bindingAndBlack[4];
		TAbstractFlowElement tFlow = (TAbstractFlowElement) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		DataFlowOutImpl.pattern_DataFlowOut_11_1_performtransformation_greenBB(mTarget, mSource);

		Object[] result2_green = DataFlowOutImpl.pattern_DataFlowOut_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = DataFlowOutImpl.pattern_DataFlowOut_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mTarget] = " + mTarget + ", " + "[tSource] = " + tSource + ", " + "[mFlowToTFlow] = "
					+ mFlowToTFlow + ", " + "[mSource] = " + mSource + ", " + "[mSourceToTSource] = " + mSourceToTSource
					+ ", " + "[tFlow] = " + tFlow + ".");
		}
		DataFlowOutImpl.pattern_DataFlowOut_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, mTarget, tSource,
				mSource, tFlow);
		//nothing EMoflonEdge mTarget__mSource____incomingFlows = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mSource__mTarget____flowTarget = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tFlow__tSource____outgoingFlows = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tSource__tFlow____incomingFlows = (EMoflonEdge) result3_green[8];

		// 
		// 
		DataFlowOutImpl.pattern_DataFlowOut_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, mTarget, tSource,
				mFlowToTFlow, mSource, mSourceToTSource, tFlow);
		return DataFlowOutImpl.pattern_DataFlowOut_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = DataFlowOutImpl
				.pattern_DataFlowOut_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = DataFlowOutImpl.pattern_DataFlowOut_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = DataFlowOutImpl.pattern_DataFlowOut_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAbstractFlowElement tSource = (TAbstractFlowElement) result2_binding[0];
		TAbstractFlowElement tFlow = (TAbstractFlowElement) result2_binding[1];
		for (Object[] result2_black : DataFlowOutImpl.pattern_DataFlowOut_12_2_corematch_blackFBFFFBB(tSource, tFlow,
				match)) {
			MAbstractFlowElement mTarget = (MAbstractFlowElement) result2_black[0];
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result2_black[2];
			MFlow mSource = (MFlow) result2_black[3];
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result2_black[4];
			// ForEach 
			for (Object[] result3_black : DataFlowOutImpl.pattern_DataFlowOut_12_3_findcontext_blackBBBBBB(mTarget,
					tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow)) {
				Object[] result3_green = DataFlowOutImpl.pattern_DataFlowOut_12_3_findcontext_greenBBBBBBFFFFFFF(
						mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mFlowToTFlow__mTarget____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mSourceToTSource__tSource____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mSourceToTSource__mSource____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tFlow__tSource____outgoingFlows = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tSource__tFlow____incomingFlows = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mFlowToTFlow__tFlow____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = DataFlowOutImpl
						.pattern_DataFlowOut_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, mTarget,
								tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTarget] = " + mTarget + ", "
							+ "[tSource] = " + tSource + ", " + "[mFlowToTFlow] = " + mFlowToTFlow + ", "
							+ "[mSource] = " + mSource + ", " + "[mSourceToTSource] = " + mSourceToTSource + ", "
							+ "[tFlow] = " + tFlow + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (DataFlowOutImpl.pattern_DataFlowOut_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = DataFlowOutImpl
							.pattern_DataFlowOut_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					DataFlowOutImpl.pattern_DataFlowOut_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return DataFlowOutImpl.pattern_DataFlowOut_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAbstractFlowElement tSource, TAbstractFlowElement tFlow) {
		match.registerObject("tSource", tSource);
		match.registerObject("tFlow", tFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractFlowElement tSource, TAbstractFlowElement tFlow) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTarget", mTarget);
		isApplicableMatch.registerObject("tSource", tSource);
		isApplicableMatch.registerObject("mFlowToTFlow", mFlowToTFlow);
		isApplicableMatch.registerObject("mSource", mSource);
		isApplicableMatch.registerObject("mSourceToTSource", mSourceToTSource);
		isApplicableMatch.registerObject("tFlow", tFlow);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mTarget, EObject tSource,
			EObject mFlowToTFlow, EObject mSource, EObject mSourceToTSource, EObject tFlow) {
		ruleresult.registerObject("mTarget", mTarget);
		ruleresult.registerObject("tSource", tSource);
		ruleresult.registerObject("mFlowToTFlow", mFlowToTFlow);
		ruleresult.registerObject("mSource", mSource);
		ruleresult.registerObject("mSourceToTSource", mSourceToTSource);
		ruleresult.registerObject("tFlow", tFlow);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_687(EMoflonEdge _edge_outgoingFlows) {

		Object[] result1_bindingAndBlack = DataFlowOutImpl
				.pattern_DataFlowOut_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = DataFlowOutImpl.pattern_DataFlowOut_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : DataFlowOutImpl
				.pattern_DataFlowOut_20_2_testcorematchandDECs_blackFFB(_edge_outgoingFlows)) {
			TAbstractFlowElement tSource = (TAbstractFlowElement) result2_black[0];
			TAbstractFlowElement tFlow = (TAbstractFlowElement) result2_black[1];
			Object[] result2_green = DataFlowOutImpl.pattern_DataFlowOut_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (DataFlowOutImpl.pattern_DataFlowOut_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, tSource, tFlow)) {
				// 
				if (DataFlowOutImpl
						.pattern_DataFlowOut_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = DataFlowOutImpl.pattern_DataFlowOut_20_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					DataFlowOutImpl.pattern_DataFlowOut_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return DataFlowOutImpl.pattern_DataFlowOut_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_705(EMoflonEdge _edge_incomingFlows) {

		Object[] result1_bindingAndBlack = DataFlowOutImpl
				.pattern_DataFlowOut_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = DataFlowOutImpl.pattern_DataFlowOut_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : DataFlowOutImpl
				.pattern_DataFlowOut_21_2_testcorematchandDECs_blackFFB(_edge_incomingFlows)) {
			MAbstractFlowElement mTarget = (MAbstractFlowElement) result2_black[0];
			MFlow mSource = (MFlow) result2_black[1];
			Object[] result2_green = DataFlowOutImpl.pattern_DataFlowOut_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (DataFlowOutImpl.pattern_DataFlowOut_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, mTarget, mSource)) {
				// 
				if (DataFlowOutImpl
						.pattern_DataFlowOut_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = DataFlowOutImpl.pattern_DataFlowOut_21_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					DataFlowOutImpl.pattern_DataFlowOut_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return DataFlowOutImpl.pattern_DataFlowOut_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("DataFlowOut");
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
		ruleResult.setRule("DataFlowOut");
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

		Object[] result1_black = DataFlowOutImpl.pattern_DataFlowOut_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = DataFlowOutImpl.pattern_DataFlowOut_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = DataFlowOutImpl
				.pattern_DataFlowOut_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MAbstractFlowElement mTarget = (MAbstractFlowElement) result2_bindingAndBlack[0];
		TAbstractFlowElement tSource = (TAbstractFlowElement) result2_bindingAndBlack[1];
		MFlow mSource = (MFlow) result2_bindingAndBlack[2];
		TAbstractFlowElement tFlow = (TAbstractFlowElement) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = DataFlowOutImpl.pattern_DataFlowOut_24_3_solvecsp_bindingAndBlackFBBBBBBB(
				this, mTarget, tSource, mSource, tFlow, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mTarget] = " + mTarget + ", " + "[tSource] = " + tSource + ", " + "[mSource] = " + mSource
					+ ", " + "[tFlow] = " + tFlow + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (DataFlowOutImpl.pattern_DataFlowOut_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : DataFlowOutImpl.pattern_DataFlowOut_24_5_matchcorrcontext_blackBBFBFBBB(
					mTarget, tSource, mSource, tFlow, sourceMatch, targetMatch)) {
				MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result5_black[2];
				MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result5_black[4];
				Object[] result5_green = DataFlowOutImpl.pattern_DataFlowOut_24_5_matchcorrcontext_greenBBBBF(
						mFlowToTFlow, mSourceToTSource, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = DataFlowOutImpl.pattern_DataFlowOut_24_6_createcorrespondence_blackBBBBB(
						mTarget, tSource, mSource, tFlow, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTarget] = " + mTarget
							+ ", " + "[tSource] = " + tSource + ", " + "[mSource] = " + mSource + ", " + "[tFlow] = "
							+ tFlow + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = DataFlowOutImpl.pattern_DataFlowOut_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				DataFlowOutImpl.pattern_DataFlowOut_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return DataFlowOutImpl.pattern_DataFlowOut_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MAbstractFlowElement mTarget, TAbstractFlowElement tSource, MFlow mSource,
			TAbstractFlowElement tFlow, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MAbstractFlowElement mTarget, MFlow mSource) {// 
		Object[] result1_black = DataFlowOutImpl.pattern_DataFlowOut_27_1_matchtggpattern_blackBB(mTarget, mSource);
		if (result1_black != null) {
			return DataFlowOutImpl.pattern_DataFlowOut_27_2_expressionF();
		} else {
			return DataFlowOutImpl.pattern_DataFlowOut_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractFlowElement tSource, TAbstractFlowElement tFlow) {// 
		Object[] result1_black = DataFlowOutImpl.pattern_DataFlowOut_28_1_matchtggpattern_blackBB(tSource, tFlow);
		if (result1_black != null) {
			return DataFlowOutImpl.pattern_DataFlowOut_28_2_expressionF();
		} else {
			return DataFlowOutImpl.pattern_DataFlowOut_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlowParameter,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSourceParameter) {

		Object[] result1_black = DataFlowOutImpl.pattern_DataFlowOut_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = DataFlowOutImpl.pattern_DataFlowOut_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : DataFlowOutImpl
				.pattern_DataFlowOut_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mFlowToTFlowList = (RuleEntryList) result2_black[0];
			MAbstractFlowElement mTarget = (MAbstractFlowElement) result2_black[1];
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result2_black[2];
			TAbstractFlowElement tFlow = (TAbstractFlowElement) result2_black[3];
			//nothing RuleEntryList mSourceToTSourceList = (RuleEntryList) result2_black[4];
			TAbstractFlowElement tSource = (TAbstractFlowElement) result2_black[5];
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result2_black[6];
			MFlow mSource = (MFlow) result2_black[7];

			Object[] result3_bindingAndBlack = DataFlowOutImpl
					.pattern_DataFlowOut_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, mTarget,
							tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTarget] = " + mTarget + ", "
						+ "[tSource] = " + tSource + ", " + "[mFlowToTFlow] = " + mFlowToTFlow + ", " + "[mSource] = "
						+ mSource + ", " + "[mSourceToTSource] = " + mSourceToTSource + ", " + "[tFlow] = " + tFlow
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (DataFlowOutImpl.pattern_DataFlowOut_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = DataFlowOutImpl.pattern_DataFlowOut_29_5_checknacs_blackBBBBBB(mTarget,
						tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow);
				if (result5_black != null) {

					Object[] result6_black = DataFlowOutImpl.pattern_DataFlowOut_29_6_perform_blackBBBBBBB(mTarget,
							tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTarget] = "
								+ mTarget + ", " + "[tSource] = " + tSource + ", " + "[mFlowToTFlow] = " + mFlowToTFlow
								+ ", " + "[mSource] = " + mSource + ", " + "[mSourceToTSource] = " + mSourceToTSource
								+ ", " + "[tFlow] = " + tFlow + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					DataFlowOutImpl.pattern_DataFlowOut_29_6_perform_greenBBBBB(mTarget, tSource, mSource, tFlow,
							ruleResult);

				} else {
				}

			} else {
			}

		}
		return DataFlowOutImpl.pattern_DataFlowOut_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTarget", mTarget);
		isApplicableMatch.registerObject("tSource", tSource);
		isApplicableMatch.registerObject("mFlowToTFlow", mFlowToTFlow);
		isApplicableMatch.registerObject("mSource", mSource);
		isApplicableMatch.registerObject("mSourceToTSource", mSourceToTSource);
		isApplicableMatch.registerObject("tFlow", tFlow);
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
		case RulesPackage.DATA_FLOW_OUT___IS_APPROPRIATE_FWD__MATCH_MABSTRACTFLOWELEMENT_MFLOW:
			return isAppropriate_FWD((Match) arguments.get(0), (MAbstractFlowElement) arguments.get(1),
					(MFlow) arguments.get(2));
		case RulesPackage.DATA_FLOW_OUT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DATA_FLOW_OUT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DATA_FLOW_OUT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MABSTRACTFLOWELEMENT_MFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MAbstractFlowElement) arguments.get(1),
					(MFlow) arguments.get(2));
			return null;
		case RulesPackage.DATA_FLOW_OUT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MABSTRACTFLOWELEMENT_MFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MAbstractFlowElement) arguments.get(1),
					(MFlow) arguments.get(2));
		case RulesPackage.DATA_FLOW_OUT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DATA_FLOW_OUT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT_MFLOW_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MAbstractFlowElement) arguments.get(1), (TAbstractFlowElement) arguments.get(2),
					(MAbstractFlowElementToTAbstractFlowElement) arguments.get(3), (MFlow) arguments.get(4),
					(MAbstractFlowElementToTAbstractFlowElement) arguments.get(5),
					(TAbstractFlowElement) arguments.get(6));
		case RulesPackage.DATA_FLOW_OUT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DATA_FLOW_OUT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.DATA_FLOW_OUT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DATA_FLOW_OUT___IS_APPROPRIATE_BWD__MATCH_TABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractFlowElement) arguments.get(1),
					(TAbstractFlowElement) arguments.get(2));
		case RulesPackage.DATA_FLOW_OUT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DATA_FLOW_OUT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DATA_FLOW_OUT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractFlowElement) arguments.get(1),
					(TAbstractFlowElement) arguments.get(2));
			return null;
		case RulesPackage.DATA_FLOW_OUT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractFlowElement) arguments.get(1),
					(TAbstractFlowElement) arguments.get(2));
		case RulesPackage.DATA_FLOW_OUT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DATA_FLOW_OUT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT_MFLOW_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MAbstractFlowElement) arguments.get(1), (TAbstractFlowElement) arguments.get(2),
					(MAbstractFlowElementToTAbstractFlowElement) arguments.get(3), (MFlow) arguments.get(4),
					(MAbstractFlowElementToTAbstractFlowElement) arguments.get(5),
					(TAbstractFlowElement) arguments.get(6));
		case RulesPackage.DATA_FLOW_OUT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DATA_FLOW_OUT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.DATA_FLOW_OUT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DATA_FLOW_OUT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_687__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_687((EMoflonEdge) arguments.get(0));
		case RulesPackage.DATA_FLOW_OUT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_705__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_705((EMoflonEdge) arguments.get(0));
		case RulesPackage.DATA_FLOW_OUT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DATA_FLOW_OUT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DATA_FLOW_OUT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DATA_FLOW_OUT___IS_APPLICABLE_SOLVE_CSP_CC__MABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT_MFLOW_TABSTRACTFLOWELEMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MAbstractFlowElement) arguments.get(0),
					(TAbstractFlowElement) arguments.get(1), (MFlow) arguments.get(2),
					(TAbstractFlowElement) arguments.get(3), (Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.DATA_FLOW_OUT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DATA_FLOW_OUT___CHECK_DEC_FWD__MABSTRACTFLOWELEMENT_MFLOW:
			return checkDEC_FWD((MAbstractFlowElement) arguments.get(0), (MFlow) arguments.get(1));
		case RulesPackage.DATA_FLOW_OUT___CHECK_DEC_BWD__TABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT:
			return checkDEC_BWD((TAbstractFlowElement) arguments.get(0), (TAbstractFlowElement) arguments.get(1));
		case RulesPackage.DATA_FLOW_OUT___GENERATE_MODEL__RULEENTRYCONTAINER_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(MAbstractFlowElementToTAbstractFlowElement) arguments.get(1),
					(MAbstractFlowElementToTAbstractFlowElement) arguments.get(2));
		case RulesPackage.DATA_FLOW_OUT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT_MFLOW_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MAbstractFlowElement) arguments.get(1), (TAbstractFlowElement) arguments.get(2),
					(MAbstractFlowElementToTAbstractFlowElement) arguments.get(3), (MFlow) arguments.get(4),
					(MAbstractFlowElementToTAbstractFlowElement) arguments.get(5),
					(TAbstractFlowElement) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.DATA_FLOW_OUT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_DataFlowOut_0_1_initialbindings_blackBBBB(DataFlowOut _this, Match match,
			MAbstractFlowElement mTarget, MFlow mSource) {
		if (!mSource.equals(mTarget)) {
			return new Object[] { _this, match, mTarget, mSource };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_0_2_SolveCSP_bindingFBBBB(DataFlowOut _this, Match match,
			MAbstractFlowElement mTarget, MFlow mSource) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mTarget, mSource);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mTarget, mSource };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DataFlowOut_0_2_SolveCSP_bindingAndBlackFBBBB(DataFlowOut _this, Match match,
			MAbstractFlowElement mTarget, MFlow mSource) {
		Object[] result_pattern_DataFlowOut_0_2_SolveCSP_binding = pattern_DataFlowOut_0_2_SolveCSP_bindingFBBBB(_this,
				match, mTarget, mSource);
		if (result_pattern_DataFlowOut_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_DataFlowOut_0_2_SolveCSP_binding[0];

			Object[] result_pattern_DataFlowOut_0_2_SolveCSP_black = pattern_DataFlowOut_0_2_SolveCSP_blackB(csp);
			if (result_pattern_DataFlowOut_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mTarget, mSource };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowOut_0_3_CheckCSP_expressionFBB(DataFlowOut _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_0_4_collectelementstobetranslated_blackBBB(Match match,
			MAbstractFlowElement mTarget, MFlow mSource) {
		if (!mSource.equals(mTarget)) {
			return new Object[] { match, mTarget, mSource };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MAbstractFlowElement mTarget, MFlow mSource) {
		EMoflonEdge mTarget__mSource____incomingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSource__mTarget____flowTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mTarget__mSource____incomingFlows_name_prime = "incomingFlows";
		String mSource__mTarget____flowTarget_name_prime = "flowTarget";
		mTarget__mSource____incomingFlows.setSrc(mTarget);
		mTarget__mSource____incomingFlows.setTrg(mSource);
		match.getToBeTranslatedEdges().add(mTarget__mSource____incomingFlows);
		mSource__mTarget____flowTarget.setSrc(mSource);
		mSource__mTarget____flowTarget.setTrg(mTarget);
		match.getToBeTranslatedEdges().add(mSource__mTarget____flowTarget);
		mTarget__mSource____incomingFlows.setName(mTarget__mSource____incomingFlows_name_prime);
		mSource__mTarget____flowTarget.setName(mSource__mTarget____flowTarget_name_prime);
		return new Object[] { match, mTarget, mSource, mTarget__mSource____incomingFlows,
				mSource__mTarget____flowTarget };
	}

	public static final Object[] pattern_DataFlowOut_0_5_collectcontextelements_blackBBB(Match match,
			MAbstractFlowElement mTarget, MFlow mSource) {
		if (!mSource.equals(mTarget)) {
			return new Object[] { match, mTarget, mSource };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_0_5_collectcontextelements_greenBBB(Match match,
			MAbstractFlowElement mTarget, MFlow mSource) {
		match.getContextNodes().add(mTarget);
		match.getContextNodes().add(mSource);
		return new Object[] { match, mTarget, mSource };
	}

	public static final void pattern_DataFlowOut_0_6_registerobjectstomatch_expressionBBBB(DataFlowOut _this,
			Match match, MAbstractFlowElement mTarget, MFlow mSource) {
		_this.registerObjectsToMatch_FWD(match, mTarget, mSource);

	}

	public static final boolean pattern_DataFlowOut_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_DataFlowOut_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTarget");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSource");
		EObject _localVariable_2 = isApplicableMatch.getObject("mFlowToTFlow");
		EObject _localVariable_3 = isApplicableMatch.getObject("mSource");
		EObject _localVariable_4 = isApplicableMatch.getObject("mSourceToTSource");
		EObject _localVariable_5 = isApplicableMatch.getObject("tFlow");
		EObject tmpMTarget = _localVariable_0;
		EObject tmpTSource = _localVariable_1;
		EObject tmpMFlowToTFlow = _localVariable_2;
		EObject tmpMSource = _localVariable_3;
		EObject tmpMSourceToTSource = _localVariable_4;
		EObject tmpTFlow = _localVariable_5;
		if (tmpMTarget instanceof MAbstractFlowElement) {
			MAbstractFlowElement mTarget = (MAbstractFlowElement) tmpMTarget;
			if (tmpTSource instanceof TAbstractFlowElement) {
				TAbstractFlowElement tSource = (TAbstractFlowElement) tmpTSource;
				if (tmpMFlowToTFlow instanceof MAbstractFlowElementToTAbstractFlowElement) {
					MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) tmpMFlowToTFlow;
					if (tmpMSource instanceof MFlow) {
						MFlow mSource = (MFlow) tmpMSource;
						if (tmpMSourceToTSource instanceof MAbstractFlowElementToTAbstractFlowElement) {
							MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) tmpMSourceToTSource;
							if (tmpTFlow instanceof TAbstractFlowElement) {
								TAbstractFlowElement tFlow = (TAbstractFlowElement) tmpTFlow;
								return new Object[] { mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_1_1_performtransformation_blackBBBBBBFBB(
			MAbstractFlowElement mTarget, TAbstractFlowElement tSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow, DataFlowOut _this,
			IsApplicableMatch isApplicableMatch) {
		if (!mFlowToTFlow.equals(mSourceToTSource)) {
			if (!mSource.equals(mTarget)) {
				if (!tFlow.equals(tSource)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow, csp,
									_this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			DataFlowOut _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_DataFlowOut_1_1_performtransformation_binding = pattern_DataFlowOut_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_DataFlowOut_1_1_performtransformation_binding != null) {
			MAbstractFlowElement mTarget = (MAbstractFlowElement) result_pattern_DataFlowOut_1_1_performtransformation_binding[0];
			TAbstractFlowElement tSource = (TAbstractFlowElement) result_pattern_DataFlowOut_1_1_performtransformation_binding[1];
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result_pattern_DataFlowOut_1_1_performtransformation_binding[2];
			MFlow mSource = (MFlow) result_pattern_DataFlowOut_1_1_performtransformation_binding[3];
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result_pattern_DataFlowOut_1_1_performtransformation_binding[4];
			TAbstractFlowElement tFlow = (TAbstractFlowElement) result_pattern_DataFlowOut_1_1_performtransformation_binding[5];

			Object[] result_pattern_DataFlowOut_1_1_performtransformation_black = pattern_DataFlowOut_1_1_performtransformation_blackBBBBBBFBB(
					mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow, _this, isApplicableMatch);
			if (result_pattern_DataFlowOut_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_DataFlowOut_1_1_performtransformation_black[6];

				return new Object[] { mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_1_1_performtransformation_greenBB(TAbstractFlowElement tSource,
			TAbstractFlowElement tFlow) {
		tFlow.getOutgoingFlows().add(tSource);
		return new Object[] { tSource, tFlow };
	}

	public static final Object[] pattern_DataFlowOut_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_DataFlowOut_1_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject mTarget, EObject tSource, EObject mFlowToTFlow, EObject mSource, EObject mSourceToTSource,
			EObject tFlow) {
		if (!mTarget.equals(tSource)) {
			if (!mTarget.equals(tFlow)) {
				if (!mFlowToTFlow.equals(mTarget)) {
					if (!mFlowToTFlow.equals(tSource)) {
						if (!mFlowToTFlow.equals(mSource)) {
							if (!mFlowToTFlow.equals(mSourceToTSource)) {
								if (!mFlowToTFlow.equals(tFlow)) {
									if (!mSource.equals(mTarget)) {
										if (!mSource.equals(tSource)) {
											if (!mSource.equals(mSourceToTSource)) {
												if (!mSource.equals(tFlow)) {
													if (!mSourceToTSource.equals(mTarget)) {
														if (!mSourceToTSource.equals(tSource)) {
															if (!mSourceToTSource.equals(tFlow)) {
																if (!tFlow.equals(tSource)) {
																	return new Object[] { ruleresult, mTarget, tSource,
																			mFlowToTFlow, mSource, mSourceToTSource,
																			tFlow };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_DataFlowOut_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mTarget, EObject tSource, EObject mSource, EObject tFlow) {
		EMoflonEdge mTarget__mSource____incomingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSource__mTarget____flowTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFlow__tSource____outgoingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSource__tFlow____incomingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "DataFlowOut";
		String mTarget__mSource____incomingFlows_name_prime = "incomingFlows";
		String mSource__mTarget____flowTarget_name_prime = "flowTarget";
		String tFlow__tSource____outgoingFlows_name_prime = "outgoingFlows";
		String tSource__tFlow____incomingFlows_name_prime = "incomingFlows";
		mTarget__mSource____incomingFlows.setSrc(mTarget);
		mTarget__mSource____incomingFlows.setTrg(mSource);
		ruleresult.getTranslatedEdges().add(mTarget__mSource____incomingFlows);
		mSource__mTarget____flowTarget.setSrc(mSource);
		mSource__mTarget____flowTarget.setTrg(mTarget);
		ruleresult.getTranslatedEdges().add(mSource__mTarget____flowTarget);
		tFlow__tSource____outgoingFlows.setSrc(tFlow);
		tFlow__tSource____outgoingFlows.setTrg(tSource);
		ruleresult.getCreatedEdges().add(tFlow__tSource____outgoingFlows);
		tSource__tFlow____incomingFlows.setSrc(tSource);
		tSource__tFlow____incomingFlows.setTrg(tFlow);
		ruleresult.getCreatedEdges().add(tSource__tFlow____incomingFlows);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mTarget__mSource____incomingFlows.setName(mTarget__mSource____incomingFlows_name_prime);
		mSource__mTarget____flowTarget.setName(mSource__mTarget____flowTarget_name_prime);
		tFlow__tSource____outgoingFlows.setName(tFlow__tSource____outgoingFlows_name_prime);
		tSource__tFlow____incomingFlows.setName(tSource__tFlow____incomingFlows_name_prime);
		return new Object[] { ruleresult, mTarget, tSource, mSource, tFlow, mTarget__mSource____incomingFlows,
				mSource__mTarget____flowTarget, tFlow__tSource____outgoingFlows, tSource__tFlow____incomingFlows };
	}

	public static final void pattern_DataFlowOut_1_5_registerobjects_expressionBBBBBBBB(DataFlowOut _this,
			PerformRuleResult ruleresult, EObject mTarget, EObject tSource, EObject mFlowToTFlow, EObject mSource,
			EObject mSourceToTSource, EObject tFlow) {
		_this.registerObjects_FWD(ruleresult, mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow);

	}

	public static final PerformRuleResult pattern_DataFlowOut_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_2_1_preparereturnvalue_bindingFB(DataFlowOut _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_2_1_preparereturnvalue_blackFBB(EClass eClass, DataFlowOut _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_2_1_preparereturnvalue_bindingAndBlackFFB(DataFlowOut _this) {
		Object[] result_pattern_DataFlowOut_2_1_preparereturnvalue_binding = pattern_DataFlowOut_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_DataFlowOut_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_DataFlowOut_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_DataFlowOut_2_1_preparereturnvalue_black = pattern_DataFlowOut_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_DataFlowOut_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_DataFlowOut_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "DataFlowOut";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_DataFlowOut_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mTarget");
		EObject _localVariable_1 = match.getObject("mSource");
		EObject tmpMTarget = _localVariable_0;
		EObject tmpMSource = _localVariable_1;
		if (tmpMTarget instanceof MAbstractFlowElement) {
			MAbstractFlowElement mTarget = (MAbstractFlowElement) tmpMTarget;
			if (tmpMSource instanceof MFlow) {
				MFlow mSource = (MFlow) tmpMSource;
				return new Object[] { mTarget, mSource, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DataFlowOut_2_2_corematch_blackBFFBFFB(MAbstractFlowElement mTarget,
			MFlow mSource, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mSource.equals(mTarget)) {
			for (MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mTarget, MAbstractFlowElementToTAbstractFlowElement.class, "source")) {
				TAbstractFlowElement tFlow = mFlowToTFlow.getTarget();
				if (tFlow != null) {
					for (MAbstractFlowElementToTAbstractFlowElement mSourceToTSource : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mSource, MAbstractFlowElementToTAbstractFlowElement.class,
									"source")) {
						if (!mFlowToTFlow.equals(mSourceToTSource)) {
							TAbstractFlowElement tSource = mSourceToTSource.getTarget();
							if (tSource != null) {
								if (!tFlow.equals(tSource)) {
									_result.add(new Object[] { mTarget, tSource, mFlowToTFlow, mSource,
											mSourceToTSource, tFlow, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_DataFlowOut_2_3_findcontext_blackBBBBBB(MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mFlowToTFlow.equals(mSourceToTSource)) {
			if (!mSource.equals(mTarget)) {
				if (!tFlow.equals(tSource)) {
					if (mTarget.equals(mFlowToTFlow.getSource())) {
						if (mTarget.getIncomingFlows().contains(mSource)) {
							if (tSource.equals(mSourceToTSource.getTarget())) {
								if (mSource.equals(mSourceToTSource.getSource())) {
									if (tFlow.equals(mFlowToTFlow.getTarget())) {
										_result.add(new Object[] { mTarget, tSource, mFlowToTFlow, mSource,
												mSourceToTSource, tFlow });
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

	public static final Object[] pattern_DataFlowOut_2_3_findcontext_greenBBBBBBFFFFFFF(MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mFlowToTFlow__mTarget____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTarget__mSource____incomingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSource__mTarget____flowTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSourceToTSource__tSource____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSourceToTSource__mSource____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowToTFlow__tFlow____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mFlowToTFlow__mTarget____source_name_prime = "source";
		String mTarget__mSource____incomingFlows_name_prime = "incomingFlows";
		String mSource__mTarget____flowTarget_name_prime = "flowTarget";
		String mSourceToTSource__tSource____target_name_prime = "target";
		String mSourceToTSource__mSource____source_name_prime = "source";
		String mFlowToTFlow__tFlow____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mTarget);
		isApplicableMatch.getAllContextElements().add(tSource);
		isApplicableMatch.getAllContextElements().add(mFlowToTFlow);
		isApplicableMatch.getAllContextElements().add(mSource);
		isApplicableMatch.getAllContextElements().add(mSourceToTSource);
		isApplicableMatch.getAllContextElements().add(tFlow);
		mFlowToTFlow__mTarget____source.setSrc(mFlowToTFlow);
		mFlowToTFlow__mTarget____source.setTrg(mTarget);
		isApplicableMatch.getAllContextElements().add(mFlowToTFlow__mTarget____source);
		mTarget__mSource____incomingFlows.setSrc(mTarget);
		mTarget__mSource____incomingFlows.setTrg(mSource);
		isApplicableMatch.getAllContextElements().add(mTarget__mSource____incomingFlows);
		mSource__mTarget____flowTarget.setSrc(mSource);
		mSource__mTarget____flowTarget.setTrg(mTarget);
		isApplicableMatch.getAllContextElements().add(mSource__mTarget____flowTarget);
		mSourceToTSource__tSource____target.setSrc(mSourceToTSource);
		mSourceToTSource__tSource____target.setTrg(tSource);
		isApplicableMatch.getAllContextElements().add(mSourceToTSource__tSource____target);
		mSourceToTSource__mSource____source.setSrc(mSourceToTSource);
		mSourceToTSource__mSource____source.setTrg(mSource);
		isApplicableMatch.getAllContextElements().add(mSourceToTSource__mSource____source);
		mFlowToTFlow__tFlow____target.setSrc(mFlowToTFlow);
		mFlowToTFlow__tFlow____target.setTrg(tFlow);
		isApplicableMatch.getAllContextElements().add(mFlowToTFlow__tFlow____target);
		mFlowToTFlow__mTarget____source.setName(mFlowToTFlow__mTarget____source_name_prime);
		mTarget__mSource____incomingFlows.setName(mTarget__mSource____incomingFlows_name_prime);
		mSource__mTarget____flowTarget.setName(mSource__mTarget____flowTarget_name_prime);
		mSourceToTSource__tSource____target.setName(mSourceToTSource__tSource____target_name_prime);
		mSourceToTSource__mSource____source.setName(mSourceToTSource__mSource____source_name_prime);
		mFlowToTFlow__tFlow____target.setName(mFlowToTFlow__tFlow____target_name_prime);
		return new Object[] { mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow, isApplicableMatch,
				mFlowToTFlow__mTarget____source, mTarget__mSource____incomingFlows, mSource__mTarget____flowTarget,
				mSourceToTSource__tSource____target, mSourceToTSource__mSource____source,
				mFlowToTFlow__tFlow____target };
	}

	public static final Object[] pattern_DataFlowOut_2_4_solveCSP_bindingFBBBBBBBB(DataFlowOut _this,
			IsApplicableMatch isApplicableMatch, MAbstractFlowElement mTarget, TAbstractFlowElement tSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mTarget, tSource, mFlowToTFlow,
				mSource, mSourceToTSource, tFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTarget, tSource, mFlowToTFlow, mSource,
					mSourceToTSource, tFlow };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DataFlowOut_2_4_solveCSP_bindingAndBlackFBBBBBBBB(DataFlowOut _this,
			IsApplicableMatch isApplicableMatch, MAbstractFlowElement mTarget, TAbstractFlowElement tSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow) {
		Object[] result_pattern_DataFlowOut_2_4_solveCSP_binding = pattern_DataFlowOut_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow);
		if (result_pattern_DataFlowOut_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_DataFlowOut_2_4_solveCSP_binding[0];

			Object[] result_pattern_DataFlowOut_2_4_solveCSP_black = pattern_DataFlowOut_2_4_solveCSP_blackB(csp);
			if (result_pattern_DataFlowOut_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTarget, tSource, mFlowToTFlow, mSource,
						mSourceToTSource, tFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowOut_2_5_checkCSP_expressionFBB(DataFlowOut _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_DataFlowOut_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "DataFlowOut";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_DataFlowOut_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_10_1_initialbindings_blackBBBB(DataFlowOut _this, Match match,
			TAbstractFlowElement tSource, TAbstractFlowElement tFlow) {
		if (!tFlow.equals(tSource)) {
			return new Object[] { _this, match, tSource, tFlow };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_10_2_SolveCSP_bindingFBBBB(DataFlowOut _this, Match match,
			TAbstractFlowElement tSource, TAbstractFlowElement tFlow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSource, tFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSource, tFlow };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DataFlowOut_10_2_SolveCSP_bindingAndBlackFBBBB(DataFlowOut _this, Match match,
			TAbstractFlowElement tSource, TAbstractFlowElement tFlow) {
		Object[] result_pattern_DataFlowOut_10_2_SolveCSP_binding = pattern_DataFlowOut_10_2_SolveCSP_bindingFBBBB(
				_this, match, tSource, tFlow);
		if (result_pattern_DataFlowOut_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_DataFlowOut_10_2_SolveCSP_binding[0];

			Object[] result_pattern_DataFlowOut_10_2_SolveCSP_black = pattern_DataFlowOut_10_2_SolveCSP_blackB(csp);
			if (result_pattern_DataFlowOut_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSource, tFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowOut_10_3_CheckCSP_expressionFBB(DataFlowOut _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_10_4_collectelementstobetranslated_blackBBB(Match match,
			TAbstractFlowElement tSource, TAbstractFlowElement tFlow) {
		if (!tFlow.equals(tSource)) {
			return new Object[] { match, tSource, tFlow };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TAbstractFlowElement tSource, TAbstractFlowElement tFlow) {
		EMoflonEdge tFlow__tSource____outgoingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSource__tFlow____incomingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tFlow__tSource____outgoingFlows_name_prime = "outgoingFlows";
		String tSource__tFlow____incomingFlows_name_prime = "incomingFlows";
		tFlow__tSource____outgoingFlows.setSrc(tFlow);
		tFlow__tSource____outgoingFlows.setTrg(tSource);
		match.getToBeTranslatedEdges().add(tFlow__tSource____outgoingFlows);
		tSource__tFlow____incomingFlows.setSrc(tSource);
		tSource__tFlow____incomingFlows.setTrg(tFlow);
		match.getToBeTranslatedEdges().add(tSource__tFlow____incomingFlows);
		tFlow__tSource____outgoingFlows.setName(tFlow__tSource____outgoingFlows_name_prime);
		tSource__tFlow____incomingFlows.setName(tSource__tFlow____incomingFlows_name_prime);
		return new Object[] { match, tSource, tFlow, tFlow__tSource____outgoingFlows, tSource__tFlow____incomingFlows };
	}

	public static final Object[] pattern_DataFlowOut_10_5_collectcontextelements_blackBBB(Match match,
			TAbstractFlowElement tSource, TAbstractFlowElement tFlow) {
		if (!tFlow.equals(tSource)) {
			return new Object[] { match, tSource, tFlow };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractFlowElement tSource, TAbstractFlowElement tFlow) {
		match.getContextNodes().add(tSource);
		match.getContextNodes().add(tFlow);
		return new Object[] { match, tSource, tFlow };
	}

	public static final void pattern_DataFlowOut_10_6_registerobjectstomatch_expressionBBBB(DataFlowOut _this,
			Match match, TAbstractFlowElement tSource, TAbstractFlowElement tFlow) {
		_this.registerObjectsToMatch_BWD(match, tSource, tFlow);

	}

	public static final boolean pattern_DataFlowOut_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_DataFlowOut_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTarget");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSource");
		EObject _localVariable_2 = isApplicableMatch.getObject("mFlowToTFlow");
		EObject _localVariable_3 = isApplicableMatch.getObject("mSource");
		EObject _localVariable_4 = isApplicableMatch.getObject("mSourceToTSource");
		EObject _localVariable_5 = isApplicableMatch.getObject("tFlow");
		EObject tmpMTarget = _localVariable_0;
		EObject tmpTSource = _localVariable_1;
		EObject tmpMFlowToTFlow = _localVariable_2;
		EObject tmpMSource = _localVariable_3;
		EObject tmpMSourceToTSource = _localVariable_4;
		EObject tmpTFlow = _localVariable_5;
		if (tmpMTarget instanceof MAbstractFlowElement) {
			MAbstractFlowElement mTarget = (MAbstractFlowElement) tmpMTarget;
			if (tmpTSource instanceof TAbstractFlowElement) {
				TAbstractFlowElement tSource = (TAbstractFlowElement) tmpTSource;
				if (tmpMFlowToTFlow instanceof MAbstractFlowElementToTAbstractFlowElement) {
					MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) tmpMFlowToTFlow;
					if (tmpMSource instanceof MFlow) {
						MFlow mSource = (MFlow) tmpMSource;
						if (tmpMSourceToTSource instanceof MAbstractFlowElementToTAbstractFlowElement) {
							MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) tmpMSourceToTSource;
							if (tmpTFlow instanceof TAbstractFlowElement) {
								TAbstractFlowElement tFlow = (TAbstractFlowElement) tmpTFlow;
								return new Object[] { mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_11_1_performtransformation_blackBBBBBBFBB(
			MAbstractFlowElement mTarget, TAbstractFlowElement tSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow, DataFlowOut _this,
			IsApplicableMatch isApplicableMatch) {
		if (!mFlowToTFlow.equals(mSourceToTSource)) {
			if (!mSource.equals(mTarget)) {
				if (!tFlow.equals(tSource)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow, csp,
									_this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			DataFlowOut _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_DataFlowOut_11_1_performtransformation_binding = pattern_DataFlowOut_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_DataFlowOut_11_1_performtransformation_binding != null) {
			MAbstractFlowElement mTarget = (MAbstractFlowElement) result_pattern_DataFlowOut_11_1_performtransformation_binding[0];
			TAbstractFlowElement tSource = (TAbstractFlowElement) result_pattern_DataFlowOut_11_1_performtransformation_binding[1];
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result_pattern_DataFlowOut_11_1_performtransformation_binding[2];
			MFlow mSource = (MFlow) result_pattern_DataFlowOut_11_1_performtransformation_binding[3];
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result_pattern_DataFlowOut_11_1_performtransformation_binding[4];
			TAbstractFlowElement tFlow = (TAbstractFlowElement) result_pattern_DataFlowOut_11_1_performtransformation_binding[5];

			Object[] result_pattern_DataFlowOut_11_1_performtransformation_black = pattern_DataFlowOut_11_1_performtransformation_blackBBBBBBFBB(
					mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow, _this, isApplicableMatch);
			if (result_pattern_DataFlowOut_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_DataFlowOut_11_1_performtransformation_black[6];

				return new Object[] { mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_11_1_performtransformation_greenBB(MAbstractFlowElement mTarget,
			MFlow mSource) {
		mTarget.getIncomingFlows().add(mSource);
		return new Object[] { mTarget, mSource };
	}

	public static final Object[] pattern_DataFlowOut_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_DataFlowOut_11_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject mTarget, EObject tSource, EObject mFlowToTFlow, EObject mSource, EObject mSourceToTSource,
			EObject tFlow) {
		if (!mTarget.equals(tSource)) {
			if (!mTarget.equals(tFlow)) {
				if (!mFlowToTFlow.equals(mTarget)) {
					if (!mFlowToTFlow.equals(tSource)) {
						if (!mFlowToTFlow.equals(mSource)) {
							if (!mFlowToTFlow.equals(mSourceToTSource)) {
								if (!mFlowToTFlow.equals(tFlow)) {
									if (!mSource.equals(mTarget)) {
										if (!mSource.equals(tSource)) {
											if (!mSource.equals(mSourceToTSource)) {
												if (!mSource.equals(tFlow)) {
													if (!mSourceToTSource.equals(mTarget)) {
														if (!mSourceToTSource.equals(tSource)) {
															if (!mSourceToTSource.equals(tFlow)) {
																if (!tFlow.equals(tSource)) {
																	return new Object[] { ruleresult, mTarget, tSource,
																			mFlowToTFlow, mSource, mSourceToTSource,
																			tFlow };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_DataFlowOut_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mTarget, EObject tSource, EObject mSource, EObject tFlow) {
		EMoflonEdge mTarget__mSource____incomingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSource__mTarget____flowTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFlow__tSource____outgoingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSource__tFlow____incomingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "DataFlowOut";
		String mTarget__mSource____incomingFlows_name_prime = "incomingFlows";
		String mSource__mTarget____flowTarget_name_prime = "flowTarget";
		String tFlow__tSource____outgoingFlows_name_prime = "outgoingFlows";
		String tSource__tFlow____incomingFlows_name_prime = "incomingFlows";
		mTarget__mSource____incomingFlows.setSrc(mTarget);
		mTarget__mSource____incomingFlows.setTrg(mSource);
		ruleresult.getCreatedEdges().add(mTarget__mSource____incomingFlows);
		mSource__mTarget____flowTarget.setSrc(mSource);
		mSource__mTarget____flowTarget.setTrg(mTarget);
		ruleresult.getCreatedEdges().add(mSource__mTarget____flowTarget);
		tFlow__tSource____outgoingFlows.setSrc(tFlow);
		tFlow__tSource____outgoingFlows.setTrg(tSource);
		ruleresult.getTranslatedEdges().add(tFlow__tSource____outgoingFlows);
		tSource__tFlow____incomingFlows.setSrc(tSource);
		tSource__tFlow____incomingFlows.setTrg(tFlow);
		ruleresult.getTranslatedEdges().add(tSource__tFlow____incomingFlows);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mTarget__mSource____incomingFlows.setName(mTarget__mSource____incomingFlows_name_prime);
		mSource__mTarget____flowTarget.setName(mSource__mTarget____flowTarget_name_prime);
		tFlow__tSource____outgoingFlows.setName(tFlow__tSource____outgoingFlows_name_prime);
		tSource__tFlow____incomingFlows.setName(tSource__tFlow____incomingFlows_name_prime);
		return new Object[] { ruleresult, mTarget, tSource, mSource, tFlow, mTarget__mSource____incomingFlows,
				mSource__mTarget____flowTarget, tFlow__tSource____outgoingFlows, tSource__tFlow____incomingFlows };
	}

	public static final void pattern_DataFlowOut_11_5_registerobjects_expressionBBBBBBBB(DataFlowOut _this,
			PerformRuleResult ruleresult, EObject mTarget, EObject tSource, EObject mFlowToTFlow, EObject mSource,
			EObject mSourceToTSource, EObject tFlow) {
		_this.registerObjects_BWD(ruleresult, mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow);

	}

	public static final PerformRuleResult pattern_DataFlowOut_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_12_1_preparereturnvalue_bindingFB(DataFlowOut _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_12_1_preparereturnvalue_blackFBB(EClass eClass,
			DataFlowOut _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_12_1_preparereturnvalue_bindingAndBlackFFB(DataFlowOut _this) {
		Object[] result_pattern_DataFlowOut_12_1_preparereturnvalue_binding = pattern_DataFlowOut_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_DataFlowOut_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_DataFlowOut_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_DataFlowOut_12_1_preparereturnvalue_black = pattern_DataFlowOut_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_DataFlowOut_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_DataFlowOut_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "DataFlowOut";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_DataFlowOut_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tSource");
		EObject _localVariable_1 = match.getObject("tFlow");
		EObject tmpTSource = _localVariable_0;
		EObject tmpTFlow = _localVariable_1;
		if (tmpTSource instanceof TAbstractFlowElement) {
			TAbstractFlowElement tSource = (TAbstractFlowElement) tmpTSource;
			if (tmpTFlow instanceof TAbstractFlowElement) {
				TAbstractFlowElement tFlow = (TAbstractFlowElement) tmpTFlow;
				return new Object[] { tSource, tFlow, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DataFlowOut_12_2_corematch_blackFBFFFBB(TAbstractFlowElement tSource,
			TAbstractFlowElement tFlow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tFlow.equals(tSource)) {
			for (MAbstractFlowElementToTAbstractFlowElement mSourceToTSource : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tSource, MAbstractFlowElementToTAbstractFlowElement.class, "target")) {
				MAbstractFlowElement tmpMSource = mSourceToTSource.getSource();
				if (tmpMSource instanceof MFlow) {
					MFlow mSource = (MFlow) tmpMSource;
					for (MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tFlow, MAbstractFlowElementToTAbstractFlowElement.class,
									"target")) {
						if (!mFlowToTFlow.equals(mSourceToTSource)) {
							MAbstractFlowElement mTarget = mFlowToTFlow.getSource();
							if (mTarget != null) {
								if (!mSource.equals(mTarget)) {
									_result.add(new Object[] { mTarget, tSource, mFlowToTFlow, mSource,
											mSourceToTSource, tFlow, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_DataFlowOut_12_3_findcontext_blackBBBBBB(
			MAbstractFlowElement mTarget, TAbstractFlowElement tSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mFlowToTFlow.equals(mSourceToTSource)) {
			if (!mSource.equals(mTarget)) {
				if (!tFlow.equals(tSource)) {
					if (mTarget.equals(mFlowToTFlow.getSource())) {
						if (tSource.equals(mSourceToTSource.getTarget())) {
							if (mSource.equals(mSourceToTSource.getSource())) {
								if (tFlow.getOutgoingFlows().contains(tSource)) {
									if (tFlow.equals(mFlowToTFlow.getTarget())) {
										_result.add(new Object[] { mTarget, tSource, mFlowToTFlow, mSource,
												mSourceToTSource, tFlow });
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

	public static final Object[] pattern_DataFlowOut_12_3_findcontext_greenBBBBBBFFFFFFF(MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mFlowToTFlow__mTarget____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSourceToTSource__tSource____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSourceToTSource__mSource____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFlow__tSource____outgoingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSource__tFlow____incomingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowToTFlow__tFlow____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mFlowToTFlow__mTarget____source_name_prime = "source";
		String mSourceToTSource__tSource____target_name_prime = "target";
		String mSourceToTSource__mSource____source_name_prime = "source";
		String tFlow__tSource____outgoingFlows_name_prime = "outgoingFlows";
		String tSource__tFlow____incomingFlows_name_prime = "incomingFlows";
		String mFlowToTFlow__tFlow____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mTarget);
		isApplicableMatch.getAllContextElements().add(tSource);
		isApplicableMatch.getAllContextElements().add(mFlowToTFlow);
		isApplicableMatch.getAllContextElements().add(mSource);
		isApplicableMatch.getAllContextElements().add(mSourceToTSource);
		isApplicableMatch.getAllContextElements().add(tFlow);
		mFlowToTFlow__mTarget____source.setSrc(mFlowToTFlow);
		mFlowToTFlow__mTarget____source.setTrg(mTarget);
		isApplicableMatch.getAllContextElements().add(mFlowToTFlow__mTarget____source);
		mSourceToTSource__tSource____target.setSrc(mSourceToTSource);
		mSourceToTSource__tSource____target.setTrg(tSource);
		isApplicableMatch.getAllContextElements().add(mSourceToTSource__tSource____target);
		mSourceToTSource__mSource____source.setSrc(mSourceToTSource);
		mSourceToTSource__mSource____source.setTrg(mSource);
		isApplicableMatch.getAllContextElements().add(mSourceToTSource__mSource____source);
		tFlow__tSource____outgoingFlows.setSrc(tFlow);
		tFlow__tSource____outgoingFlows.setTrg(tSource);
		isApplicableMatch.getAllContextElements().add(tFlow__tSource____outgoingFlows);
		tSource__tFlow____incomingFlows.setSrc(tSource);
		tSource__tFlow____incomingFlows.setTrg(tFlow);
		isApplicableMatch.getAllContextElements().add(tSource__tFlow____incomingFlows);
		mFlowToTFlow__tFlow____target.setSrc(mFlowToTFlow);
		mFlowToTFlow__tFlow____target.setTrg(tFlow);
		isApplicableMatch.getAllContextElements().add(mFlowToTFlow__tFlow____target);
		mFlowToTFlow__mTarget____source.setName(mFlowToTFlow__mTarget____source_name_prime);
		mSourceToTSource__tSource____target.setName(mSourceToTSource__tSource____target_name_prime);
		mSourceToTSource__mSource____source.setName(mSourceToTSource__mSource____source_name_prime);
		tFlow__tSource____outgoingFlows.setName(tFlow__tSource____outgoingFlows_name_prime);
		tSource__tFlow____incomingFlows.setName(tSource__tFlow____incomingFlows_name_prime);
		mFlowToTFlow__tFlow____target.setName(mFlowToTFlow__tFlow____target_name_prime);
		return new Object[] { mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow, isApplicableMatch,
				mFlowToTFlow__mTarget____source, mSourceToTSource__tSource____target,
				mSourceToTSource__mSource____source, tFlow__tSource____outgoingFlows, tSource__tFlow____incomingFlows,
				mFlowToTFlow__tFlow____target };
	}

	public static final Object[] pattern_DataFlowOut_12_4_solveCSP_bindingFBBBBBBBB(DataFlowOut _this,
			IsApplicableMatch isApplicableMatch, MAbstractFlowElement mTarget, TAbstractFlowElement tSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mTarget, tSource, mFlowToTFlow,
				mSource, mSourceToTSource, tFlow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTarget, tSource, mFlowToTFlow, mSource,
					mSourceToTSource, tFlow };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DataFlowOut_12_4_solveCSP_bindingAndBlackFBBBBBBBB(DataFlowOut _this,
			IsApplicableMatch isApplicableMatch, MAbstractFlowElement mTarget, TAbstractFlowElement tSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow) {
		Object[] result_pattern_DataFlowOut_12_4_solveCSP_binding = pattern_DataFlowOut_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow);
		if (result_pattern_DataFlowOut_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_DataFlowOut_12_4_solveCSP_binding[0];

			Object[] result_pattern_DataFlowOut_12_4_solveCSP_black = pattern_DataFlowOut_12_4_solveCSP_blackB(csp);
			if (result_pattern_DataFlowOut_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTarget, tSource, mFlowToTFlow, mSource,
						mSourceToTSource, tFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowOut_12_5_checkCSP_expressionFBB(DataFlowOut _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_DataFlowOut_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "DataFlowOut";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_DataFlowOut_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_20_1_preparereturnvalue_bindingFB(DataFlowOut _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			DataFlowOut _this) {
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

	public static final Object[] pattern_DataFlowOut_20_1_preparereturnvalue_bindingAndBlackFFBF(DataFlowOut _this) {
		Object[] result_pattern_DataFlowOut_20_1_preparereturnvalue_binding = pattern_DataFlowOut_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_DataFlowOut_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_DataFlowOut_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_DataFlowOut_20_1_preparereturnvalue_black = pattern_DataFlowOut_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_DataFlowOut_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_DataFlowOut_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_DataFlowOut_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_DataFlowOut_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_outgoingFlows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTFlow = _edge_outgoingFlows.getSrc();
		if (tmpTFlow instanceof TAbstractFlowElement) {
			TAbstractFlowElement tFlow = (TAbstractFlowElement) tmpTFlow;
			EObject tmpTSource = _edge_outgoingFlows.getTrg();
			if (tmpTSource instanceof TAbstractFlowElement) {
				TAbstractFlowElement tSource = (TAbstractFlowElement) tmpTSource;
				if (!tFlow.equals(tSource)) {
					if (tFlow.getOutgoingFlows().contains(tSource)) {
						_result.add(new Object[] { tSource, tFlow, _edge_outgoingFlows });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_DataFlowOut_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_DataFlowOut_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			DataFlowOut _this, Match match, TAbstractFlowElement tSource, TAbstractFlowElement tFlow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSource, tFlow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_DataFlowOut_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			DataFlowOut _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_DataFlowOut_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_21_1_preparereturnvalue_bindingFB(DataFlowOut _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			DataFlowOut _this) {
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

	public static final Object[] pattern_DataFlowOut_21_1_preparereturnvalue_bindingAndBlackFFBF(DataFlowOut _this) {
		Object[] result_pattern_DataFlowOut_21_1_preparereturnvalue_binding = pattern_DataFlowOut_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_DataFlowOut_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_DataFlowOut_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_DataFlowOut_21_1_preparereturnvalue_black = pattern_DataFlowOut_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_DataFlowOut_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_DataFlowOut_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_DataFlowOut_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_DataFlowOut_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_incomingFlows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMTarget = _edge_incomingFlows.getSrc();
		if (tmpMTarget instanceof MAbstractFlowElement) {
			MAbstractFlowElement mTarget = (MAbstractFlowElement) tmpMTarget;
			EObject tmpMSource = _edge_incomingFlows.getTrg();
			if (tmpMSource instanceof MFlow) {
				MFlow mSource = (MFlow) tmpMSource;
				if (!mSource.equals(mTarget)) {
					if (mTarget.getIncomingFlows().contains(mSource)) {
						_result.add(new Object[] { mTarget, mSource, _edge_incomingFlows });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_DataFlowOut_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_DataFlowOut_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			DataFlowOut _this, Match match, MAbstractFlowElement mTarget, MFlow mSource) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mTarget, mSource);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_DataFlowOut_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			DataFlowOut _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_DataFlowOut_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_24_1_prepare_blackB(DataFlowOut _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_DataFlowOut_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_DataFlowOut_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mTarget");
		EObject _localVariable_1 = targetMatch.getObject("tSource");
		EObject _localVariable_2 = sourceMatch.getObject("mSource");
		EObject _localVariable_3 = targetMatch.getObject("tFlow");
		EObject tmpMTarget = _localVariable_0;
		EObject tmpTSource = _localVariable_1;
		EObject tmpMSource = _localVariable_2;
		EObject tmpTFlow = _localVariable_3;
		if (tmpMTarget instanceof MAbstractFlowElement) {
			MAbstractFlowElement mTarget = (MAbstractFlowElement) tmpMTarget;
			if (tmpTSource instanceof TAbstractFlowElement) {
				TAbstractFlowElement tSource = (TAbstractFlowElement) tmpTSource;
				if (tmpMSource instanceof MFlow) {
					MFlow mSource = (MFlow) tmpMSource;
					if (tmpTFlow instanceof TAbstractFlowElement) {
						TAbstractFlowElement tFlow = (TAbstractFlowElement) tmpTFlow;
						return new Object[] { mTarget, tSource, mSource, tFlow, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_24_2_matchsrctrgcontext_blackBBBBBB(MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, MFlow mSource, TAbstractFlowElement tFlow, Match sourceMatch,
			Match targetMatch) {
		if (!mSource.equals(mTarget)) {
			if (!tFlow.equals(tSource)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { mTarget, tSource, mSource, tFlow, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_DataFlowOut_24_2_matchsrctrgcontext_binding = pattern_DataFlowOut_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_DataFlowOut_24_2_matchsrctrgcontext_binding != null) {
			MAbstractFlowElement mTarget = (MAbstractFlowElement) result_pattern_DataFlowOut_24_2_matchsrctrgcontext_binding[0];
			TAbstractFlowElement tSource = (TAbstractFlowElement) result_pattern_DataFlowOut_24_2_matchsrctrgcontext_binding[1];
			MFlow mSource = (MFlow) result_pattern_DataFlowOut_24_2_matchsrctrgcontext_binding[2];
			TAbstractFlowElement tFlow = (TAbstractFlowElement) result_pattern_DataFlowOut_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_DataFlowOut_24_2_matchsrctrgcontext_black = pattern_DataFlowOut_24_2_matchsrctrgcontext_blackBBBBBB(
					mTarget, tSource, mSource, tFlow, sourceMatch, targetMatch);
			if (result_pattern_DataFlowOut_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mTarget, tSource, mSource, tFlow, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_24_3_solvecsp_bindingFBBBBBBB(DataFlowOut _this,
			MAbstractFlowElement mTarget, TAbstractFlowElement tSource, MFlow mSource, TAbstractFlowElement tFlow,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(mTarget, tSource, mSource, tFlow, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, mTarget, tSource, mSource, tFlow, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DataFlowOut_24_3_solvecsp_bindingAndBlackFBBBBBBB(DataFlowOut _this,
			MAbstractFlowElement mTarget, TAbstractFlowElement tSource, MFlow mSource, TAbstractFlowElement tFlow,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_DataFlowOut_24_3_solvecsp_binding = pattern_DataFlowOut_24_3_solvecsp_bindingFBBBBBBB(
				_this, mTarget, tSource, mSource, tFlow, sourceMatch, targetMatch);
		if (result_pattern_DataFlowOut_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_DataFlowOut_24_3_solvecsp_binding[0];

			Object[] result_pattern_DataFlowOut_24_3_solvecsp_black = pattern_DataFlowOut_24_3_solvecsp_blackB(csp);
			if (result_pattern_DataFlowOut_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mTarget, tSource, mSource, tFlow, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowOut_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_DataFlowOut_24_5_matchcorrcontext_blackBBFBFBBB(
			MAbstractFlowElement mTarget, TAbstractFlowElement tSource, MFlow mSource, TAbstractFlowElement tFlow,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mSource.equals(mTarget)) {
			if (!tFlow.equals(tSource)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mTarget, MAbstractFlowElementToTAbstractFlowElement.class,
									"source")) {
						if (tFlow.equals(mFlowToTFlow.getTarget())) {
							for (MAbstractFlowElementToTAbstractFlowElement mSourceToTSource : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(tSource,
											MAbstractFlowElementToTAbstractFlowElement.class, "target")) {
								if (!mFlowToTFlow.equals(mSourceToTSource)) {
									if (mSource.equals(mSourceToTSource.getSource())) {
										_result.add(new Object[] { mTarget, tSource, mFlowToTFlow, mSource,
												mSourceToTSource, tFlow, sourceMatch, targetMatch });
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

	public static final Object[] pattern_DataFlowOut_24_5_matchcorrcontext_greenBBBBF(
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "DataFlowOut";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mFlowToTFlow);
		ccMatch.getAllContextElements().add(mSourceToTSource);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mFlowToTFlow, mSourceToTSource, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_DataFlowOut_24_6_createcorrespondence_blackBBBBB(MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, MFlow mSource, TAbstractFlowElement tFlow, CCMatch ccMatch) {
		if (!mSource.equals(mTarget)) {
			if (!tFlow.equals(tSource)) {
				return new Object[] { mTarget, tSource, mSource, tFlow, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_DataFlowOut_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "DataFlowOut";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_DataFlowOut_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_27_1_matchtggpattern_blackBB(MAbstractFlowElement mTarget,
			MFlow mSource) {
		if (!mSource.equals(mTarget)) {
			if (mTarget.getIncomingFlows().contains(mSource)) {
				return new Object[] { mTarget, mSource };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowOut_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_DataFlowOut_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_28_1_matchtggpattern_blackBB(TAbstractFlowElement tSource,
			TAbstractFlowElement tFlow) {
		if (!tFlow.equals(tSource)) {
			if (tFlow.getOutgoingFlows().contains(tSource)) {
				return new Object[] { tSource, tFlow };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowOut_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_DataFlowOut_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_29_1_createresult_blackB(DataFlowOut _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_DataFlowOut_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_DataFlowOut_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MAbstractFlowElement mTarget) {
		if (ruleResult.getSourceObjects().contains(mTarget)) {
			return new Object[] { ruleResult, mTarget };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow) {
		if (ruleResult.getCorrObjects().contains(mFlowToTFlow)) {
			return new Object[] { ruleResult, mFlowToTFlow };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TAbstractFlowElement tFlow) {
		if (ruleResult.getTargetObjects().contains(tFlow)) {
			return new Object[] { ruleResult, tFlow };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAbstractFlowElement tSource) {
		if (ruleResult.getTargetObjects().contains(tSource)) {
			return new Object[] { ruleResult, tSource };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, MAbstractFlowElementToTAbstractFlowElement mSourceToTSource) {
		if (ruleResult.getCorrObjects().contains(mSourceToTSource)) {
			return new Object[] { ruleResult, mSourceToTSource };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MFlow mSource) {
		if (ruleResult.getSourceObjects().contains(mSource)) {
			return new Object[] { ruleResult, mSource };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DataFlowOut_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mFlowToTFlowList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mSourceToTSourceList : ruleEntryContainer.getRuleEntryList()) {
				if (!mFlowToTFlowList.equals(mSourceToTSourceList)) {
					for (EObject tmpMFlowToTFlow : mFlowToTFlowList.getEntryObjects()) {
						if (tmpMFlowToTFlow instanceof MAbstractFlowElementToTAbstractFlowElement) {
							MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) tmpMFlowToTFlow;
							MAbstractFlowElement mTarget = mFlowToTFlow.getSource();
							if (mTarget != null) {
								TAbstractFlowElement tFlow = mFlowToTFlow.getTarget();
								if (tFlow != null) {
									if (pattern_DataFlowOut_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mFlowToTFlow) == null) {
										if (pattern_DataFlowOut_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												mTarget) == null) {
											if (pattern_DataFlowOut_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													tFlow) == null) {
												for (EObject tmpMSourceToTSource : mSourceToTSourceList
														.getEntryObjects()) {
													if (tmpMSourceToTSource instanceof MAbstractFlowElementToTAbstractFlowElement) {
														MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) tmpMSourceToTSource;
														if (!mFlowToTFlow.equals(mSourceToTSource)) {
															TAbstractFlowElement tSource = mSourceToTSource.getTarget();
															if (tSource != null) {
																if (!tFlow.equals(tSource)) {
																	MAbstractFlowElement tmpMSource = mSourceToTSource
																			.getSource();
																	if (tmpMSource instanceof MFlow) {
																		MFlow mSource = (MFlow) tmpMSource;
																		if (!mSource.equals(mTarget)) {
																			if (pattern_DataFlowOut_29_2_isapplicablecore_black_nac_4BB(
																					ruleResult,
																					mSourceToTSource) == null) {
																				if (pattern_DataFlowOut_29_2_isapplicablecore_black_nac_3BB(
																						ruleResult, tSource) == null) {
																					if (pattern_DataFlowOut_29_2_isapplicablecore_black_nac_5BB(
																							ruleResult,
																							mSource) == null) {
																						_result.add(new Object[] {
																								mFlowToTFlowList,
																								mTarget, mFlowToTFlow,
																								tFlow,
																								mSourceToTSourceList,
																								tSource,
																								mSourceToTSource,
																								mSource,
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

	public static final Object[] pattern_DataFlowOut_29_3_solveCSP_bindingFBBBBBBBBB(DataFlowOut _this,
			IsApplicableMatch isApplicableMatch, MAbstractFlowElement mTarget, TAbstractFlowElement tSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mTarget, tSource, mFlowToTFlow,
				mSource, mSourceToTSource, tFlow, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTarget, tSource, mFlowToTFlow, mSource,
					mSourceToTSource, tFlow, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DataFlowOut_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(DataFlowOut _this,
			IsApplicableMatch isApplicableMatch, MAbstractFlowElement mTarget, TAbstractFlowElement tSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_DataFlowOut_29_3_solveCSP_binding = pattern_DataFlowOut_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow, ruleResult);
		if (result_pattern_DataFlowOut_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_DataFlowOut_29_3_solveCSP_binding[0];

			Object[] result_pattern_DataFlowOut_29_3_solveCSP_black = pattern_DataFlowOut_29_3_solveCSP_blackB(csp);
			if (result_pattern_DataFlowOut_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTarget, tSource, mFlowToTFlow, mSource,
						mSourceToTSource, tFlow, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowOut_29_4_checkCSP_expressionFBB(DataFlowOut _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DataFlowOut_29_5_checknacs_blackBBBBBB(MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow) {
		if (!mFlowToTFlow.equals(mSourceToTSource)) {
			if (!mSource.equals(mTarget)) {
				if (!tFlow.equals(tSource)) {
					return new Object[] { mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_29_6_perform_blackBBBBBBB(MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, TAbstractFlowElement tFlow,
			ModelgeneratorRuleResult ruleResult) {
		if (!mFlowToTFlow.equals(mSourceToTSource)) {
			if (!mSource.equals(mTarget)) {
				if (!tFlow.equals(tSource)) {
					return new Object[] { mTarget, tSource, mFlowToTFlow, mSource, mSourceToTSource, tFlow,
							ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowOut_29_6_perform_greenBBBBB(MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, MFlow mSource, TAbstractFlowElement tFlow,
			ModelgeneratorRuleResult ruleResult) {
		mTarget.getIncomingFlows().add(mSource);
		tFlow.getOutgoingFlows().add(tSource);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mTarget, tSource, mSource, tFlow, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_DataFlowOut_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //DataFlowOutImpl
