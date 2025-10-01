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

import org.gravity.tgg.modisco.pm.Rules.DataFlowIn;
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
 * An implementation of the model object '<em><b>Data Flow In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DataFlowInImpl extends AbstractRuleImpl implements DataFlowIn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getDataFlowIn();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MFlow mSource, MAbstractFlowElement mTarget) {

		Object[] result1_black = DataFlowInImpl.pattern_DataFlowIn_0_1_initialbindings_blackBBBB(this, match, mSource,
				mTarget);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mSource] = " + mSource + ", " + "[mTarget] = " + mTarget + ".");
		}

		Object[] result2_bindingAndBlack = DataFlowInImpl.pattern_DataFlowIn_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, mSource, mTarget);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mSource] = " + mSource + ", " + "[mTarget] = " + mTarget + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (DataFlowInImpl.pattern_DataFlowIn_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = DataFlowInImpl.pattern_DataFlowIn_0_4_collectelementstobetranslated_blackBBB(match,
					mSource, mTarget);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mSource] = " + mSource + ", " + "[mTarget] = " + mTarget + ".");
			}
			DataFlowInImpl.pattern_DataFlowIn_0_4_collectelementstobetranslated_greenBBBFF(match, mSource, mTarget);
			//nothing EMoflonEdge mTarget__mSource____incomingFlows = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mSource__mTarget____flowTarget = (EMoflonEdge) result4_green[4];

			Object[] result5_black = DataFlowInImpl.pattern_DataFlowIn_0_5_collectcontextelements_blackBBB(match,
					mSource, mTarget);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mSource] = " + mSource + ", " + "[mTarget] = " + mTarget + ".");
			}
			DataFlowInImpl.pattern_DataFlowIn_0_5_collectcontextelements_greenBBB(match, mSource, mTarget);

			// 
			DataFlowInImpl.pattern_DataFlowIn_0_6_registerobjectstomatch_expressionBBBB(this, match, mSource, mTarget);
			return DataFlowInImpl.pattern_DataFlowIn_0_7_expressionF();
		} else {
			return DataFlowInImpl.pattern_DataFlowIn_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = DataFlowInImpl
				.pattern_DataFlowIn_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MFlow mSource = (MFlow) result1_bindingAndBlack[0];
		MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result1_bindingAndBlack[1];
		TAbstractFlowElement tFlow = (TAbstractFlowElement) result1_bindingAndBlack[2];
		MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result1_bindingAndBlack[3];
		MAbstractFlowElement mTarget = (MAbstractFlowElement) result1_bindingAndBlack[4];
		TAbstractFlowElement tSource = (TAbstractFlowElement) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		DataFlowInImpl.pattern_DataFlowIn_1_1_performtransformation_greenBB(tFlow, tSource);

		Object[] result2_green = DataFlowInImpl.pattern_DataFlowIn_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = DataFlowInImpl.pattern_DataFlowIn_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mSource] = " + mSource + ", " + "[mFlowToTFlow] = " + mFlowToTFlow + ", " + "[tFlow] = "
					+ tFlow + ", " + "[mSourceToTSource] = " + mSourceToTSource + ", " + "[mTarget] = " + mTarget + ", "
					+ "[tSource] = " + tSource + ".");
		}
		DataFlowInImpl.pattern_DataFlowIn_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, mSource, tFlow, mTarget,
				tSource);
		//nothing EMoflonEdge tFlow__tSource____incomingFlows = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge tSource__tFlow____outgoingFlows = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mTarget__mSource____incomingFlows = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mSource__mTarget____flowTarget = (EMoflonEdge) result3_green[8];

		// 
		// 
		DataFlowInImpl.pattern_DataFlowIn_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, mSource,
				mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource);
		return DataFlowInImpl.pattern_DataFlowIn_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = DataFlowInImpl
				.pattern_DataFlowIn_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = DataFlowInImpl.pattern_DataFlowIn_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = DataFlowInImpl.pattern_DataFlowIn_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MFlow mSource = (MFlow) result2_binding[0];
		MAbstractFlowElement mTarget = (MAbstractFlowElement) result2_binding[1];
		for (Object[] result2_black : DataFlowInImpl.pattern_DataFlowIn_2_2_corematch_blackBFFFBFB(mSource, mTarget,
				match)) {
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result2_black[1];
			TAbstractFlowElement tFlow = (TAbstractFlowElement) result2_black[2];
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result2_black[3];
			TAbstractFlowElement tSource = (TAbstractFlowElement) result2_black[5];
			// ForEach 
			for (Object[] result3_black : DataFlowInImpl.pattern_DataFlowIn_2_3_findcontext_blackBBBBBB(mSource,
					mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource)) {
				Object[] result3_green = DataFlowInImpl.pattern_DataFlowIn_2_3_findcontext_greenBBBBBBFFFFFFF(mSource,
						mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mFlowToTFlow__tFlow____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mFlowToTFlow__mTarget____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mTarget__mSource____incomingFlows = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mSource__mTarget____flowTarget = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mSourceToTSource__tSource____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mSourceToTSource__mSource____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = DataFlowInImpl
						.pattern_DataFlowIn_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, mSource,
								mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSource] = " + mSource + ", "
							+ "[mFlowToTFlow] = " + mFlowToTFlow + ", " + "[tFlow] = " + tFlow + ", "
							+ "[mSourceToTSource] = " + mSourceToTSource + ", " + "[mTarget] = " + mTarget + ", "
							+ "[tSource] = " + tSource + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (DataFlowInImpl.pattern_DataFlowIn_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = DataFlowInImpl
							.pattern_DataFlowIn_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					DataFlowInImpl.pattern_DataFlowIn_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return DataFlowInImpl.pattern_DataFlowIn_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MFlow mSource, MAbstractFlowElement mTarget) {
		match.registerObject("mSource", mSource);
		match.registerObject("mTarget", mTarget);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MFlow mSource, MAbstractFlowElement mTarget) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, TAbstractFlowElement tFlow,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSource", mSource);
		isApplicableMatch.registerObject("mFlowToTFlow", mFlowToTFlow);
		isApplicableMatch.registerObject("tFlow", tFlow);
		isApplicableMatch.registerObject("mSourceToTSource", mSourceToTSource);
		isApplicableMatch.registerObject("mTarget", mTarget);
		isApplicableMatch.registerObject("tSource", tSource);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mSource, EObject mFlowToTFlow, EObject tFlow,
			EObject mSourceToTSource, EObject mTarget, EObject tSource) {
		ruleresult.registerObject("mSource", mSource);
		ruleresult.registerObject("mFlowToTFlow", mFlowToTFlow);
		ruleresult.registerObject("tFlow", tFlow);
		ruleresult.registerObject("mSourceToTSource", mSourceToTSource);
		ruleresult.registerObject("mTarget", mTarget);
		ruleresult.registerObject("tSource", tSource);

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
	public boolean isAppropriate_BWD(Match match, TAbstractFlowElement tFlow, TAbstractFlowElement tSource) {

		Object[] result1_black = DataFlowInImpl.pattern_DataFlowIn_10_1_initialbindings_blackBBBB(this, match, tFlow,
				tSource);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tFlow] = " + tFlow + ", " + "[tSource] = " + tSource + ".");
		}

		Object[] result2_bindingAndBlack = DataFlowInImpl.pattern_DataFlowIn_10_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, tFlow, tSource);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tFlow] = " + tFlow + ", " + "[tSource] = " + tSource + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (DataFlowInImpl.pattern_DataFlowIn_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = DataFlowInImpl
					.pattern_DataFlowIn_10_4_collectelementstobetranslated_blackBBB(match, tFlow, tSource);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tFlow] = " + tFlow + ", " + "[tSource] = " + tSource + ".");
			}
			DataFlowInImpl.pattern_DataFlowIn_10_4_collectelementstobetranslated_greenBBBFF(match, tFlow, tSource);
			//nothing EMoflonEdge tFlow__tSource____incomingFlows = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tSource__tFlow____outgoingFlows = (EMoflonEdge) result4_green[4];

			Object[] result5_black = DataFlowInImpl.pattern_DataFlowIn_10_5_collectcontextelements_blackBBB(match,
					tFlow, tSource);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tFlow] = " + tFlow + ", " + "[tSource] = " + tSource + ".");
			}
			DataFlowInImpl.pattern_DataFlowIn_10_5_collectcontextelements_greenBBB(match, tFlow, tSource);

			// 
			DataFlowInImpl.pattern_DataFlowIn_10_6_registerobjectstomatch_expressionBBBB(this, match, tFlow, tSource);
			return DataFlowInImpl.pattern_DataFlowIn_10_7_expressionF();
		} else {
			return DataFlowInImpl.pattern_DataFlowIn_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = DataFlowInImpl
				.pattern_DataFlowIn_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MFlow mSource = (MFlow) result1_bindingAndBlack[0];
		MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result1_bindingAndBlack[1];
		TAbstractFlowElement tFlow = (TAbstractFlowElement) result1_bindingAndBlack[2];
		MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result1_bindingAndBlack[3];
		MAbstractFlowElement mTarget = (MAbstractFlowElement) result1_bindingAndBlack[4];
		TAbstractFlowElement tSource = (TAbstractFlowElement) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		DataFlowInImpl.pattern_DataFlowIn_11_1_performtransformation_greenBB(mSource, mTarget);

		Object[] result2_green = DataFlowInImpl.pattern_DataFlowIn_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = DataFlowInImpl.pattern_DataFlowIn_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mSource] = " + mSource + ", " + "[mFlowToTFlow] = " + mFlowToTFlow + ", " + "[tFlow] = "
					+ tFlow + ", " + "[mSourceToTSource] = " + mSourceToTSource + ", " + "[mTarget] = " + mTarget + ", "
					+ "[tSource] = " + tSource + ".");
		}
		DataFlowInImpl.pattern_DataFlowIn_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, mSource, tFlow, mTarget,
				tSource);
		//nothing EMoflonEdge tFlow__tSource____incomingFlows = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge tSource__tFlow____outgoingFlows = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mTarget__mSource____incomingFlows = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mSource__mTarget____flowTarget = (EMoflonEdge) result3_green[8];

		// 
		// 
		DataFlowInImpl.pattern_DataFlowIn_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, mSource,
				mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource);
		return DataFlowInImpl.pattern_DataFlowIn_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = DataFlowInImpl
				.pattern_DataFlowIn_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = DataFlowInImpl.pattern_DataFlowIn_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = DataFlowInImpl.pattern_DataFlowIn_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAbstractFlowElement tFlow = (TAbstractFlowElement) result2_binding[0];
		TAbstractFlowElement tSource = (TAbstractFlowElement) result2_binding[1];
		for (Object[] result2_black : DataFlowInImpl.pattern_DataFlowIn_12_2_corematch_blackFFBFFBB(tFlow, tSource,
				match)) {
			MFlow mSource = (MFlow) result2_black[0];
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result2_black[1];
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result2_black[3];
			MAbstractFlowElement mTarget = (MAbstractFlowElement) result2_black[4];
			// ForEach 
			for (Object[] result3_black : DataFlowInImpl.pattern_DataFlowIn_12_3_findcontext_blackBBBBBB(mSource,
					mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource)) {
				Object[] result3_green = DataFlowInImpl.pattern_DataFlowIn_12_3_findcontext_greenBBBBBBFFFFFFF(mSource,
						mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mFlowToTFlow__tFlow____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tFlow__tSource____incomingFlows = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tSource__tFlow____outgoingFlows = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mFlowToTFlow__mTarget____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mSourceToTSource__tSource____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mSourceToTSource__mSource____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = DataFlowInImpl
						.pattern_DataFlowIn_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, mSource,
								mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSource] = " + mSource + ", "
							+ "[mFlowToTFlow] = " + mFlowToTFlow + ", " + "[tFlow] = " + tFlow + ", "
							+ "[mSourceToTSource] = " + mSourceToTSource + ", " + "[mTarget] = " + mTarget + ", "
							+ "[tSource] = " + tSource + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (DataFlowInImpl.pattern_DataFlowIn_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = DataFlowInImpl
							.pattern_DataFlowIn_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					DataFlowInImpl.pattern_DataFlowIn_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return DataFlowInImpl.pattern_DataFlowIn_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAbstractFlowElement tFlow, TAbstractFlowElement tSource) {
		match.registerObject("tFlow", tFlow);
		match.registerObject("tSource", tSource);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractFlowElement tFlow, TAbstractFlowElement tSource) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, TAbstractFlowElement tFlow,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSource", mSource);
		isApplicableMatch.registerObject("mFlowToTFlow", mFlowToTFlow);
		isApplicableMatch.registerObject("tFlow", tFlow);
		isApplicableMatch.registerObject("mSourceToTSource", mSourceToTSource);
		isApplicableMatch.registerObject("mTarget", mTarget);
		isApplicableMatch.registerObject("tSource", tSource);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mSource, EObject mFlowToTFlow, EObject tFlow,
			EObject mSourceToTSource, EObject mTarget, EObject tSource) {
		ruleresult.registerObject("mSource", mSource);
		ruleresult.registerObject("mFlowToTFlow", mFlowToTFlow);
		ruleresult.registerObject("tFlow", tFlow);
		ruleresult.registerObject("mSourceToTSource", mSourceToTSource);
		ruleresult.registerObject("mTarget", mTarget);
		ruleresult.registerObject("tSource", tSource);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_62(EMoflonEdge _edge_incomingFlows) {

		Object[] result1_bindingAndBlack = DataFlowInImpl
				.pattern_DataFlowIn_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = DataFlowInImpl.pattern_DataFlowIn_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : DataFlowInImpl
				.pattern_DataFlowIn_20_2_testcorematchandDECs_blackFFB(_edge_incomingFlows)) {
			TAbstractFlowElement tFlow = (TAbstractFlowElement) result2_black[0];
			TAbstractFlowElement tSource = (TAbstractFlowElement) result2_black[1];
			Object[] result2_green = DataFlowInImpl.pattern_DataFlowIn_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (DataFlowInImpl.pattern_DataFlowIn_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, tFlow, tSource)) {
				// 
				if (DataFlowInImpl.pattern_DataFlowIn_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = DataFlowInImpl.pattern_DataFlowIn_20_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					DataFlowInImpl.pattern_DataFlowIn_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return DataFlowInImpl.pattern_DataFlowIn_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_66(EMoflonEdge _edge_incomingFlows) {

		Object[] result1_bindingAndBlack = DataFlowInImpl
				.pattern_DataFlowIn_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = DataFlowInImpl.pattern_DataFlowIn_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : DataFlowInImpl
				.pattern_DataFlowIn_21_2_testcorematchandDECs_blackFFB(_edge_incomingFlows)) {
			MFlow mSource = (MFlow) result2_black[0];
			MAbstractFlowElement mTarget = (MAbstractFlowElement) result2_black[1];
			Object[] result2_green = DataFlowInImpl.pattern_DataFlowIn_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (DataFlowInImpl.pattern_DataFlowIn_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, mSource, mTarget)) {
				// 
				if (DataFlowInImpl.pattern_DataFlowIn_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = DataFlowInImpl.pattern_DataFlowIn_21_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					DataFlowInImpl.pattern_DataFlowIn_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return DataFlowInImpl.pattern_DataFlowIn_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("DataFlowIn");
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
		ruleResult.setRule("DataFlowIn");
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

		Object[] result1_black = DataFlowInImpl.pattern_DataFlowIn_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = DataFlowInImpl.pattern_DataFlowIn_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = DataFlowInImpl
				.pattern_DataFlowIn_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MFlow mSource = (MFlow) result2_bindingAndBlack[0];
		TAbstractFlowElement tFlow = (TAbstractFlowElement) result2_bindingAndBlack[1];
		MAbstractFlowElement mTarget = (MAbstractFlowElement) result2_bindingAndBlack[2];
		TAbstractFlowElement tSource = (TAbstractFlowElement) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = DataFlowInImpl.pattern_DataFlowIn_24_3_solvecsp_bindingAndBlackFBBBBBBB(this,
				mSource, tFlow, mTarget, tSource, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mSource] = " + mSource + ", " + "[tFlow] = " + tFlow + ", " + "[mTarget] = " + mTarget + ", "
					+ "[tSource] = " + tSource + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (DataFlowInImpl.pattern_DataFlowIn_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : DataFlowInImpl.pattern_DataFlowIn_24_5_matchcorrcontext_blackBFBFBBBB(mSource,
					tFlow, mTarget, tSource, sourceMatch, targetMatch)) {
				MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result5_black[1];
				MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result5_black[3];
				Object[] result5_green = DataFlowInImpl.pattern_DataFlowIn_24_5_matchcorrcontext_greenBBBBF(
						mFlowToTFlow, mSourceToTSource, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = DataFlowInImpl.pattern_DataFlowIn_24_6_createcorrespondence_blackBBBBB(mSource,
						tFlow, mTarget, tSource, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mSource] = " + mSource
							+ ", " + "[tFlow] = " + tFlow + ", " + "[mTarget] = " + mTarget + ", " + "[tSource] = "
							+ tSource + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = DataFlowInImpl.pattern_DataFlowIn_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				DataFlowInImpl.pattern_DataFlowIn_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return DataFlowInImpl.pattern_DataFlowIn_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MFlow mSource, TAbstractFlowElement tFlow, MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MFlow mSource, MAbstractFlowElement mTarget) {// 
		Object[] result1_black = DataFlowInImpl.pattern_DataFlowIn_27_1_matchtggpattern_blackBB(mSource, mTarget);
		if (result1_black != null) {
			return DataFlowInImpl.pattern_DataFlowIn_27_2_expressionF();
		} else {
			return DataFlowInImpl.pattern_DataFlowIn_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractFlowElement tFlow, TAbstractFlowElement tSource) {// 
		Object[] result1_black = DataFlowInImpl.pattern_DataFlowIn_28_1_matchtggpattern_blackBB(tFlow, tSource);
		if (result1_black != null) {
			return DataFlowInImpl.pattern_DataFlowIn_28_2_expressionF();
		} else {
			return DataFlowInImpl.pattern_DataFlowIn_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSourceParameter,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlowParameter) {

		Object[] result1_black = DataFlowInImpl.pattern_DataFlowIn_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = DataFlowInImpl.pattern_DataFlowIn_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : DataFlowInImpl
				.pattern_DataFlowIn_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mSourceToTSourceList = (RuleEntryList) result2_black[0];
			MFlow mSource = (MFlow) result2_black[1];
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result2_black[2];
			TAbstractFlowElement tSource = (TAbstractFlowElement) result2_black[3];
			//nothing RuleEntryList mFlowToTFlowList = (RuleEntryList) result2_black[4];
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result2_black[5];
			TAbstractFlowElement tFlow = (TAbstractFlowElement) result2_black[6];
			MAbstractFlowElement mTarget = (MAbstractFlowElement) result2_black[7];

			Object[] result3_bindingAndBlack = DataFlowInImpl
					.pattern_DataFlowIn_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, mSource,
							mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSource] = " + mSource + ", "
						+ "[mFlowToTFlow] = " + mFlowToTFlow + ", " + "[tFlow] = " + tFlow + ", "
						+ "[mSourceToTSource] = " + mSourceToTSource + ", " + "[mTarget] = " + mTarget + ", "
						+ "[tSource] = " + tSource + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (DataFlowInImpl.pattern_DataFlowIn_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = DataFlowInImpl.pattern_DataFlowIn_29_5_checknacs_blackBBBBBB(mSource,
						mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource);
				if (result5_black != null) {

					Object[] result6_black = DataFlowInImpl.pattern_DataFlowIn_29_6_perform_blackBBBBBBB(mSource,
							mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mSource] = "
								+ mSource + ", " + "[mFlowToTFlow] = " + mFlowToTFlow + ", " + "[tFlow] = " + tFlow
								+ ", " + "[mSourceToTSource] = " + mSourceToTSource + ", " + "[mTarget] = " + mTarget
								+ ", " + "[tSource] = " + tSource + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					DataFlowInImpl.pattern_DataFlowIn_29_6_perform_greenBBBBB(mSource, tFlow, mTarget, tSource,
							ruleResult);

				} else {
				}

			} else {
			}

		}
		return DataFlowInImpl.pattern_DataFlowIn_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, TAbstractFlowElement tFlow,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSource", mSource);
		isApplicableMatch.registerObject("mFlowToTFlow", mFlowToTFlow);
		isApplicableMatch.registerObject("tFlow", tFlow);
		isApplicableMatch.registerObject("mSourceToTSource", mSourceToTSource);
		isApplicableMatch.registerObject("mTarget", mTarget);
		isApplicableMatch.registerObject("tSource", tSource);
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
			case RulesPackage.DATA_FLOW_IN___IS_APPROPRIATE_FWD__MATCH_MFLOW_MABSTRACTFLOWELEMENT:
				return isAppropriate_FWD((Match) arguments.get(0), (MFlow) arguments.get(1),
						(MAbstractFlowElement) arguments.get(2));
			case RulesPackage.DATA_FLOW_IN___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.DATA_FLOW_IN___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.DATA_FLOW_IN___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MFLOW_MABSTRACTFLOWELEMENT:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (MFlow) arguments.get(1),
						(MAbstractFlowElement) arguments.get(2));
				return null;
			case RulesPackage.DATA_FLOW_IN___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MFLOW_MABSTRACTFLOWELEMENT:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MFlow) arguments.get(1),
						(MAbstractFlowElement) arguments.get(2));
			case RulesPackage.DATA_FLOW_IN___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.DATA_FLOW_IN___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MFLOW_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT_MABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MFlow) arguments.get(1),
						(MAbstractFlowElementToTAbstractFlowElement) arguments.get(2),
						(TAbstractFlowElement) arguments.get(3),
						(MAbstractFlowElementToTAbstractFlowElement) arguments.get(4),
						(MAbstractFlowElement) arguments.get(5), (TAbstractFlowElement) arguments.get(6));
			case RulesPackage.DATA_FLOW_IN___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.DATA_FLOW_IN___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6));
				return null;
			case RulesPackage.DATA_FLOW_IN___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.DATA_FLOW_IN___IS_APPROPRIATE_BWD__MATCH_TABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT:
				return isAppropriate_BWD((Match) arguments.get(0), (TAbstractFlowElement) arguments.get(1),
						(TAbstractFlowElement) arguments.get(2));
			case RulesPackage.DATA_FLOW_IN___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.DATA_FLOW_IN___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.DATA_FLOW_IN___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractFlowElement) arguments.get(1),
						(TAbstractFlowElement) arguments.get(2));
				return null;
			case RulesPackage.DATA_FLOW_IN___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractFlowElement) arguments.get(1),
						(TAbstractFlowElement) arguments.get(2));
			case RulesPackage.DATA_FLOW_IN___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.DATA_FLOW_IN___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MFLOW_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT_MABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MFlow) arguments.get(1),
						(MAbstractFlowElementToTAbstractFlowElement) arguments.get(2),
						(TAbstractFlowElement) arguments.get(3),
						(MAbstractFlowElementToTAbstractFlowElement) arguments.get(4),
						(MAbstractFlowElement) arguments.get(5), (TAbstractFlowElement) arguments.get(6));
			case RulesPackage.DATA_FLOW_IN___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.DATA_FLOW_IN___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6));
				return null;
			case RulesPackage.DATA_FLOW_IN___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.DATA_FLOW_IN___IS_APPROPRIATE_BWD_EMOFLON_EDGE_62__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_62((EMoflonEdge) arguments.get(0));
			case RulesPackage.DATA_FLOW_IN___IS_APPROPRIATE_FWD_EMOFLON_EDGE_66__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_66((EMoflonEdge) arguments.get(0));
			case RulesPackage.DATA_FLOW_IN___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.DATA_FLOW_IN___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.DATA_FLOW_IN___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.DATA_FLOW_IN___IS_APPLICABLE_SOLVE_CSP_CC__MFLOW_TABSTRACTFLOWELEMENT_MABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT_MATCH_MATCH:
				return isApplicable_solveCsp_CC((MFlow) arguments.get(0), (TAbstractFlowElement) arguments.get(1),
						(MAbstractFlowElement) arguments.get(2), (TAbstractFlowElement) arguments.get(3),
						(Match) arguments.get(4), (Match) arguments.get(5));
			case RulesPackage.DATA_FLOW_IN___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.DATA_FLOW_IN___CHECK_DEC_FWD__MFLOW_MABSTRACTFLOWELEMENT:
				return checkDEC_FWD((MFlow) arguments.get(0), (MAbstractFlowElement) arguments.get(1));
			case RulesPackage.DATA_FLOW_IN___CHECK_DEC_BWD__TABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT:
				return checkDEC_BWD((TAbstractFlowElement) arguments.get(0), (TAbstractFlowElement) arguments.get(1));
			case RulesPackage.DATA_FLOW_IN___GENERATE_MODEL__RULEENTRYCONTAINER_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT:
				return generateModel((RuleEntryContainer) arguments.get(0),
						(MAbstractFlowElementToTAbstractFlowElement) arguments.get(1),
						(MAbstractFlowElementToTAbstractFlowElement) arguments.get(2));
			case RulesPackage.DATA_FLOW_IN___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MFLOW_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT_MABSTRACTFLOWELEMENTTOTABSTRACTFLOWELEMENT_MABSTRACTFLOWELEMENT_TABSTRACTFLOWELEMENT_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MFlow) arguments.get(1),
						(MAbstractFlowElementToTAbstractFlowElement) arguments.get(2),
						(TAbstractFlowElement) arguments.get(3),
						(MAbstractFlowElementToTAbstractFlowElement) arguments.get(4),
						(MAbstractFlowElement) arguments.get(5), (TAbstractFlowElement) arguments.get(6),
						(ModelgeneratorRuleResult) arguments.get(7));
			case RulesPackage.DATA_FLOW_IN___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_DataFlowIn_0_1_initialbindings_blackBBBB(DataFlowIn _this, Match match,
			MFlow mSource, MAbstractFlowElement mTarget) {
		if (!mSource.equals(mTarget)) {
			return new Object[] { _this, match, mSource, mTarget };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_0_2_SolveCSP_bindingFBBBB(DataFlowIn _this, Match match,
			MFlow mSource, MAbstractFlowElement mTarget) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mSource, mTarget);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mSource, mTarget };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DataFlowIn_0_2_SolveCSP_bindingAndBlackFBBBB(DataFlowIn _this, Match match,
			MFlow mSource, MAbstractFlowElement mTarget) {
		Object[] result_pattern_DataFlowIn_0_2_SolveCSP_binding = pattern_DataFlowIn_0_2_SolveCSP_bindingFBBBB(_this,
				match, mSource, mTarget);
		if (result_pattern_DataFlowIn_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_DataFlowIn_0_2_SolveCSP_binding[0];

			Object[] result_pattern_DataFlowIn_0_2_SolveCSP_black = pattern_DataFlowIn_0_2_SolveCSP_blackB(csp);
			if (result_pattern_DataFlowIn_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mSource, mTarget };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowIn_0_3_CheckCSP_expressionFBB(DataFlowIn _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_0_4_collectelementstobetranslated_blackBBB(Match match,
			MFlow mSource, MAbstractFlowElement mTarget) {
		if (!mSource.equals(mTarget)) {
			return new Object[] { match, mSource, mTarget };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MFlow mSource, MAbstractFlowElement mTarget) {
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
		return new Object[] { match, mSource, mTarget, mTarget__mSource____incomingFlows,
				mSource__mTarget____flowTarget };
	}

	public static final Object[] pattern_DataFlowIn_0_5_collectcontextelements_blackBBB(Match match, MFlow mSource,
			MAbstractFlowElement mTarget) {
		if (!mSource.equals(mTarget)) {
			return new Object[] { match, mSource, mTarget };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_0_5_collectcontextelements_greenBBB(Match match, MFlow mSource,
			MAbstractFlowElement mTarget) {
		match.getContextNodes().add(mSource);
		match.getContextNodes().add(mTarget);
		return new Object[] { match, mSource, mTarget };
	}

	public static final void pattern_DataFlowIn_0_6_registerobjectstomatch_expressionBBBB(DataFlowIn _this, Match match,
			MFlow mSource, MAbstractFlowElement mTarget) {
		_this.registerObjectsToMatch_FWD(match, mSource, mTarget);

	}

	public static final boolean pattern_DataFlowIn_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_DataFlowIn_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mSource");
		EObject _localVariable_1 = isApplicableMatch.getObject("mFlowToTFlow");
		EObject _localVariable_2 = isApplicableMatch.getObject("tFlow");
		EObject _localVariable_3 = isApplicableMatch.getObject("mSourceToTSource");
		EObject _localVariable_4 = isApplicableMatch.getObject("mTarget");
		EObject _localVariable_5 = isApplicableMatch.getObject("tSource");
		EObject tmpMSource = _localVariable_0;
		EObject tmpMFlowToTFlow = _localVariable_1;
		EObject tmpTFlow = _localVariable_2;
		EObject tmpMSourceToTSource = _localVariable_3;
		EObject tmpMTarget = _localVariable_4;
		EObject tmpTSource = _localVariable_5;
		if (tmpMSource instanceof MFlow) {
			MFlow mSource = (MFlow) tmpMSource;
			if (tmpMFlowToTFlow instanceof MAbstractFlowElementToTAbstractFlowElement) {
				MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) tmpMFlowToTFlow;
				if (tmpTFlow instanceof TAbstractFlowElement) {
					TAbstractFlowElement tFlow = (TAbstractFlowElement) tmpTFlow;
					if (tmpMSourceToTSource instanceof MAbstractFlowElementToTAbstractFlowElement) {
						MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) tmpMSourceToTSource;
						if (tmpMTarget instanceof MAbstractFlowElement) {
							MAbstractFlowElement mTarget = (MAbstractFlowElement) tmpMTarget;
							if (tmpTSource instanceof TAbstractFlowElement) {
								TAbstractFlowElement tSource = (TAbstractFlowElement) tmpTSource;
								return new Object[] { mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_1_1_performtransformation_blackBBBBBBFBB(MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, TAbstractFlowElement tFlow,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, DataFlowIn _this, IsApplicableMatch isApplicableMatch) {
		if (!mSource.equals(mTarget)) {
			if (!mFlowToTFlow.equals(mSourceToTSource)) {
				if (!tFlow.equals(tSource)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource, csp,
									_this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_1_1_performtransformation_bindingAndBlackFFFFFFFBB(DataFlowIn _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_DataFlowIn_1_1_performtransformation_binding = pattern_DataFlowIn_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_DataFlowIn_1_1_performtransformation_binding != null) {
			MFlow mSource = (MFlow) result_pattern_DataFlowIn_1_1_performtransformation_binding[0];
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result_pattern_DataFlowIn_1_1_performtransformation_binding[1];
			TAbstractFlowElement tFlow = (TAbstractFlowElement) result_pattern_DataFlowIn_1_1_performtransformation_binding[2];
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result_pattern_DataFlowIn_1_1_performtransformation_binding[3];
			MAbstractFlowElement mTarget = (MAbstractFlowElement) result_pattern_DataFlowIn_1_1_performtransformation_binding[4];
			TAbstractFlowElement tSource = (TAbstractFlowElement) result_pattern_DataFlowIn_1_1_performtransformation_binding[5];

			Object[] result_pattern_DataFlowIn_1_1_performtransformation_black = pattern_DataFlowIn_1_1_performtransformation_blackBBBBBBFBB(
					mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource, _this, isApplicableMatch);
			if (result_pattern_DataFlowIn_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_DataFlowIn_1_1_performtransformation_black[6];

				return new Object[] { mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_1_1_performtransformation_greenBB(TAbstractFlowElement tFlow,
			TAbstractFlowElement tSource) {
		tFlow.getIncomingFlows().add(tSource);
		return new Object[] { tFlow, tSource };
	}

	public static final Object[] pattern_DataFlowIn_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_DataFlowIn_1_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject mSource, EObject mFlowToTFlow, EObject tFlow, EObject mSourceToTSource, EObject mTarget,
			EObject tSource) {
		if (!mSource.equals(tFlow)) {
			if (!mSource.equals(mSourceToTSource)) {
				if (!mSource.equals(mTarget)) {
					if (!mSource.equals(tSource)) {
						if (!mFlowToTFlow.equals(mSource)) {
							if (!mFlowToTFlow.equals(tFlow)) {
								if (!mFlowToTFlow.equals(mSourceToTSource)) {
									if (!mFlowToTFlow.equals(mTarget)) {
										if (!mFlowToTFlow.equals(tSource)) {
											if (!tFlow.equals(tSource)) {
												if (!mSourceToTSource.equals(tFlow)) {
													if (!mSourceToTSource.equals(mTarget)) {
														if (!mSourceToTSource.equals(tSource)) {
															if (!mTarget.equals(tFlow)) {
																if (!mTarget.equals(tSource)) {
																	return new Object[] { ruleresult, mSource,
																			mFlowToTFlow, tFlow, mSourceToTSource,
																			mTarget, tSource };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_DataFlowIn_1_3_bookkeepingforedges_greenBBBBBFFFF(PerformRuleResult ruleresult,
			EObject mSource, EObject tFlow, EObject mTarget, EObject tSource) {
		EMoflonEdge tFlow__tSource____incomingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSource__tFlow____outgoingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTarget__mSource____incomingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSource__mTarget____flowTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "DataFlowIn";
		String tFlow__tSource____incomingFlows_name_prime = "incomingFlows";
		String tSource__tFlow____outgoingFlows_name_prime = "outgoingFlows";
		String mTarget__mSource____incomingFlows_name_prime = "incomingFlows";
		String mSource__mTarget____flowTarget_name_prime = "flowTarget";
		tFlow__tSource____incomingFlows.setSrc(tFlow);
		tFlow__tSource____incomingFlows.setTrg(tSource);
		ruleresult.getCreatedEdges().add(tFlow__tSource____incomingFlows);
		tSource__tFlow____outgoingFlows.setSrc(tSource);
		tSource__tFlow____outgoingFlows.setTrg(tFlow);
		ruleresult.getCreatedEdges().add(tSource__tFlow____outgoingFlows);
		mTarget__mSource____incomingFlows.setSrc(mTarget);
		mTarget__mSource____incomingFlows.setTrg(mSource);
		ruleresult.getTranslatedEdges().add(mTarget__mSource____incomingFlows);
		mSource__mTarget____flowTarget.setSrc(mSource);
		mSource__mTarget____flowTarget.setTrg(mTarget);
		ruleresult.getTranslatedEdges().add(mSource__mTarget____flowTarget);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tFlow__tSource____incomingFlows.setName(tFlow__tSource____incomingFlows_name_prime);
		tSource__tFlow____outgoingFlows.setName(tSource__tFlow____outgoingFlows_name_prime);
		mTarget__mSource____incomingFlows.setName(mTarget__mSource____incomingFlows_name_prime);
		mSource__mTarget____flowTarget.setName(mSource__mTarget____flowTarget_name_prime);
		return new Object[] { ruleresult, mSource, tFlow, mTarget, tSource, tFlow__tSource____incomingFlows,
				tSource__tFlow____outgoingFlows, mTarget__mSource____incomingFlows, mSource__mTarget____flowTarget };
	}

	public static final void pattern_DataFlowIn_1_5_registerobjects_expressionBBBBBBBB(DataFlowIn _this,
			PerformRuleResult ruleresult, EObject mSource, EObject mFlowToTFlow, EObject tFlow,
			EObject mSourceToTSource, EObject mTarget, EObject tSource) {
		_this.registerObjects_FWD(ruleresult, mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource);

	}

	public static final PerformRuleResult pattern_DataFlowIn_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_2_1_preparereturnvalue_bindingFB(DataFlowIn _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_2_1_preparereturnvalue_blackFBB(EClass eClass, DataFlowIn _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_2_1_preparereturnvalue_bindingAndBlackFFB(DataFlowIn _this) {
		Object[] result_pattern_DataFlowIn_2_1_preparereturnvalue_binding = pattern_DataFlowIn_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_DataFlowIn_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_DataFlowIn_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_DataFlowIn_2_1_preparereturnvalue_black = pattern_DataFlowIn_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_DataFlowIn_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_DataFlowIn_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "DataFlowIn";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_DataFlowIn_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mSource");
		EObject _localVariable_1 = match.getObject("mTarget");
		EObject tmpMSource = _localVariable_0;
		EObject tmpMTarget = _localVariable_1;
		if (tmpMSource instanceof MFlow) {
			MFlow mSource = (MFlow) tmpMSource;
			if (tmpMTarget instanceof MAbstractFlowElement) {
				MAbstractFlowElement mTarget = (MAbstractFlowElement) tmpMTarget;
				return new Object[] { mSource, mTarget, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DataFlowIn_2_2_corematch_blackBFFFBFB(MFlow mSource,
			MAbstractFlowElement mTarget, Match match) {
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
									_result.add(new Object[] { mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget,
											tSource, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_DataFlowIn_2_3_findcontext_blackBBBBBB(MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, TAbstractFlowElement tFlow,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mSource.equals(mTarget)) {
			if (!mFlowToTFlow.equals(mSourceToTSource)) {
				if (!tFlow.equals(tSource)) {
					if (tFlow.equals(mFlowToTFlow.getTarget())) {
						if (mTarget.equals(mFlowToTFlow.getSource())) {
							if (mTarget.getIncomingFlows().contains(mSource)) {
								if (tSource.equals(mSourceToTSource.getTarget())) {
									if (mSource.equals(mSourceToTSource.getSource())) {
										_result.add(new Object[] { mSource, mFlowToTFlow, tFlow, mSourceToTSource,
												mTarget, tSource });
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

	public static final Object[] pattern_DataFlowIn_2_3_findcontext_greenBBBBBBFFFFFFF(MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, TAbstractFlowElement tFlow,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mFlowToTFlow__tFlow____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowToTFlow__mTarget____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTarget__mSource____incomingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSource__mTarget____flowTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSourceToTSource__tSource____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSourceToTSource__mSource____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mFlowToTFlow__tFlow____target_name_prime = "target";
		String mFlowToTFlow__mTarget____source_name_prime = "source";
		String mTarget__mSource____incomingFlows_name_prime = "incomingFlows";
		String mSource__mTarget____flowTarget_name_prime = "flowTarget";
		String mSourceToTSource__tSource____target_name_prime = "target";
		String mSourceToTSource__mSource____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mSource);
		isApplicableMatch.getAllContextElements().add(mFlowToTFlow);
		isApplicableMatch.getAllContextElements().add(tFlow);
		isApplicableMatch.getAllContextElements().add(mSourceToTSource);
		isApplicableMatch.getAllContextElements().add(mTarget);
		isApplicableMatch.getAllContextElements().add(tSource);
		mFlowToTFlow__tFlow____target.setSrc(mFlowToTFlow);
		mFlowToTFlow__tFlow____target.setTrg(tFlow);
		isApplicableMatch.getAllContextElements().add(mFlowToTFlow__tFlow____target);
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
		mFlowToTFlow__tFlow____target.setName(mFlowToTFlow__tFlow____target_name_prime);
		mFlowToTFlow__mTarget____source.setName(mFlowToTFlow__mTarget____source_name_prime);
		mTarget__mSource____incomingFlows.setName(mTarget__mSource____incomingFlows_name_prime);
		mSource__mTarget____flowTarget.setName(mSource__mTarget____flowTarget_name_prime);
		mSourceToTSource__tSource____target.setName(mSourceToTSource__tSource____target_name_prime);
		mSourceToTSource__mSource____source.setName(mSourceToTSource__mSource____source_name_prime);
		return new Object[] { mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource, isApplicableMatch,
				mFlowToTFlow__tFlow____target, mFlowToTFlow__mTarget____source, mTarget__mSource____incomingFlows,
				mSource__mTarget____flowTarget, mSourceToTSource__tSource____target,
				mSourceToTSource__mSource____source };
	}

	public static final Object[] pattern_DataFlowIn_2_4_solveCSP_bindingFBBBBBBBB(DataFlowIn _this,
			IsApplicableMatch isApplicableMatch, MFlow mSource, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow,
			TAbstractFlowElement tFlow, MAbstractFlowElementToTAbstractFlowElement mSourceToTSource,
			MAbstractFlowElement mTarget, TAbstractFlowElement tSource) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mSource, mFlowToTFlow, tFlow,
				mSourceToTSource, mTarget, tSource);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSource, mFlowToTFlow, tFlow, mSourceToTSource,
					mTarget, tSource };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DataFlowIn_2_4_solveCSP_bindingAndBlackFBBBBBBBB(DataFlowIn _this,
			IsApplicableMatch isApplicableMatch, MFlow mSource, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow,
			TAbstractFlowElement tFlow, MAbstractFlowElementToTAbstractFlowElement mSourceToTSource,
			MAbstractFlowElement mTarget, TAbstractFlowElement tSource) {
		Object[] result_pattern_DataFlowIn_2_4_solveCSP_binding = pattern_DataFlowIn_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource);
		if (result_pattern_DataFlowIn_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_DataFlowIn_2_4_solveCSP_binding[0];

			Object[] result_pattern_DataFlowIn_2_4_solveCSP_black = pattern_DataFlowIn_2_4_solveCSP_blackB(csp);
			if (result_pattern_DataFlowIn_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSource, mFlowToTFlow, tFlow, mSourceToTSource,
						mTarget, tSource };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowIn_2_5_checkCSP_expressionFBB(DataFlowIn _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_DataFlowIn_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "DataFlowIn";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_DataFlowIn_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_10_1_initialbindings_blackBBBB(DataFlowIn _this, Match match,
			TAbstractFlowElement tFlow, TAbstractFlowElement tSource) {
		if (!tFlow.equals(tSource)) {
			return new Object[] { _this, match, tFlow, tSource };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_10_2_SolveCSP_bindingFBBBB(DataFlowIn _this, Match match,
			TAbstractFlowElement tFlow, TAbstractFlowElement tSource) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tFlow, tSource);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tFlow, tSource };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DataFlowIn_10_2_SolveCSP_bindingAndBlackFBBBB(DataFlowIn _this, Match match,
			TAbstractFlowElement tFlow, TAbstractFlowElement tSource) {
		Object[] result_pattern_DataFlowIn_10_2_SolveCSP_binding = pattern_DataFlowIn_10_2_SolveCSP_bindingFBBBB(_this,
				match, tFlow, tSource);
		if (result_pattern_DataFlowIn_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_DataFlowIn_10_2_SolveCSP_binding[0];

			Object[] result_pattern_DataFlowIn_10_2_SolveCSP_black = pattern_DataFlowIn_10_2_SolveCSP_blackB(csp);
			if (result_pattern_DataFlowIn_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tFlow, tSource };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowIn_10_3_CheckCSP_expressionFBB(DataFlowIn _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_10_4_collectelementstobetranslated_blackBBB(Match match,
			TAbstractFlowElement tFlow, TAbstractFlowElement tSource) {
		if (!tFlow.equals(tSource)) {
			return new Object[] { match, tFlow, tSource };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TAbstractFlowElement tFlow, TAbstractFlowElement tSource) {
		EMoflonEdge tFlow__tSource____incomingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSource__tFlow____outgoingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tFlow__tSource____incomingFlows_name_prime = "incomingFlows";
		String tSource__tFlow____outgoingFlows_name_prime = "outgoingFlows";
		tFlow__tSource____incomingFlows.setSrc(tFlow);
		tFlow__tSource____incomingFlows.setTrg(tSource);
		match.getToBeTranslatedEdges().add(tFlow__tSource____incomingFlows);
		tSource__tFlow____outgoingFlows.setSrc(tSource);
		tSource__tFlow____outgoingFlows.setTrg(tFlow);
		match.getToBeTranslatedEdges().add(tSource__tFlow____outgoingFlows);
		tFlow__tSource____incomingFlows.setName(tFlow__tSource____incomingFlows_name_prime);
		tSource__tFlow____outgoingFlows.setName(tSource__tFlow____outgoingFlows_name_prime);
		return new Object[] { match, tFlow, tSource, tFlow__tSource____incomingFlows, tSource__tFlow____outgoingFlows };
	}

	public static final Object[] pattern_DataFlowIn_10_5_collectcontextelements_blackBBB(Match match,
			TAbstractFlowElement tFlow, TAbstractFlowElement tSource) {
		if (!tFlow.equals(tSource)) {
			return new Object[] { match, tFlow, tSource };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractFlowElement tFlow, TAbstractFlowElement tSource) {
		match.getContextNodes().add(tFlow);
		match.getContextNodes().add(tSource);
		return new Object[] { match, tFlow, tSource };
	}

	public static final void pattern_DataFlowIn_10_6_registerobjectstomatch_expressionBBBB(DataFlowIn _this,
			Match match, TAbstractFlowElement tFlow, TAbstractFlowElement tSource) {
		_this.registerObjectsToMatch_BWD(match, tFlow, tSource);

	}

	public static final boolean pattern_DataFlowIn_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_DataFlowIn_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mSource");
		EObject _localVariable_1 = isApplicableMatch.getObject("mFlowToTFlow");
		EObject _localVariable_2 = isApplicableMatch.getObject("tFlow");
		EObject _localVariable_3 = isApplicableMatch.getObject("mSourceToTSource");
		EObject _localVariable_4 = isApplicableMatch.getObject("mTarget");
		EObject _localVariable_5 = isApplicableMatch.getObject("tSource");
		EObject tmpMSource = _localVariable_0;
		EObject tmpMFlowToTFlow = _localVariable_1;
		EObject tmpTFlow = _localVariable_2;
		EObject tmpMSourceToTSource = _localVariable_3;
		EObject tmpMTarget = _localVariable_4;
		EObject tmpTSource = _localVariable_5;
		if (tmpMSource instanceof MFlow) {
			MFlow mSource = (MFlow) tmpMSource;
			if (tmpMFlowToTFlow instanceof MAbstractFlowElementToTAbstractFlowElement) {
				MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) tmpMFlowToTFlow;
				if (tmpTFlow instanceof TAbstractFlowElement) {
					TAbstractFlowElement tFlow = (TAbstractFlowElement) tmpTFlow;
					if (tmpMSourceToTSource instanceof MAbstractFlowElementToTAbstractFlowElement) {
						MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) tmpMSourceToTSource;
						if (tmpMTarget instanceof MAbstractFlowElement) {
							MAbstractFlowElement mTarget = (MAbstractFlowElement) tmpMTarget;
							if (tmpTSource instanceof TAbstractFlowElement) {
								TAbstractFlowElement tSource = (TAbstractFlowElement) tmpTSource;
								return new Object[] { mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_11_1_performtransformation_blackBBBBBBFBB(MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, TAbstractFlowElement tFlow,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, DataFlowIn _this, IsApplicableMatch isApplicableMatch) {
		if (!mSource.equals(mTarget)) {
			if (!mFlowToTFlow.equals(mSourceToTSource)) {
				if (!tFlow.equals(tSource)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource, csp,
									_this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			DataFlowIn _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_DataFlowIn_11_1_performtransformation_binding = pattern_DataFlowIn_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_DataFlowIn_11_1_performtransformation_binding != null) {
			MFlow mSource = (MFlow) result_pattern_DataFlowIn_11_1_performtransformation_binding[0];
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) result_pattern_DataFlowIn_11_1_performtransformation_binding[1];
			TAbstractFlowElement tFlow = (TAbstractFlowElement) result_pattern_DataFlowIn_11_1_performtransformation_binding[2];
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) result_pattern_DataFlowIn_11_1_performtransformation_binding[3];
			MAbstractFlowElement mTarget = (MAbstractFlowElement) result_pattern_DataFlowIn_11_1_performtransformation_binding[4];
			TAbstractFlowElement tSource = (TAbstractFlowElement) result_pattern_DataFlowIn_11_1_performtransformation_binding[5];

			Object[] result_pattern_DataFlowIn_11_1_performtransformation_black = pattern_DataFlowIn_11_1_performtransformation_blackBBBBBBFBB(
					mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource, _this, isApplicableMatch);
			if (result_pattern_DataFlowIn_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_DataFlowIn_11_1_performtransformation_black[6];

				return new Object[] { mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_11_1_performtransformation_greenBB(MFlow mSource,
			MAbstractFlowElement mTarget) {
		mTarget.getIncomingFlows().add(mSource);
		return new Object[] { mSource, mTarget };
	}

	public static final Object[] pattern_DataFlowIn_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_DataFlowIn_11_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject mSource, EObject mFlowToTFlow, EObject tFlow, EObject mSourceToTSource, EObject mTarget,
			EObject tSource) {
		if (!mSource.equals(tFlow)) {
			if (!mSource.equals(mSourceToTSource)) {
				if (!mSource.equals(mTarget)) {
					if (!mSource.equals(tSource)) {
						if (!mFlowToTFlow.equals(mSource)) {
							if (!mFlowToTFlow.equals(tFlow)) {
								if (!mFlowToTFlow.equals(mSourceToTSource)) {
									if (!mFlowToTFlow.equals(mTarget)) {
										if (!mFlowToTFlow.equals(tSource)) {
											if (!tFlow.equals(tSource)) {
												if (!mSourceToTSource.equals(tFlow)) {
													if (!mSourceToTSource.equals(mTarget)) {
														if (!mSourceToTSource.equals(tSource)) {
															if (!mTarget.equals(tFlow)) {
																if (!mTarget.equals(tSource)) {
																	return new Object[] { ruleresult, mSource,
																			mFlowToTFlow, tFlow, mSourceToTSource,
																			mTarget, tSource };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_DataFlowIn_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mSource, EObject tFlow, EObject mTarget, EObject tSource) {
		EMoflonEdge tFlow__tSource____incomingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSource__tFlow____outgoingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTarget__mSource____incomingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSource__mTarget____flowTarget = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "DataFlowIn";
		String tFlow__tSource____incomingFlows_name_prime = "incomingFlows";
		String tSource__tFlow____outgoingFlows_name_prime = "outgoingFlows";
		String mTarget__mSource____incomingFlows_name_prime = "incomingFlows";
		String mSource__mTarget____flowTarget_name_prime = "flowTarget";
		tFlow__tSource____incomingFlows.setSrc(tFlow);
		tFlow__tSource____incomingFlows.setTrg(tSource);
		ruleresult.getTranslatedEdges().add(tFlow__tSource____incomingFlows);
		tSource__tFlow____outgoingFlows.setSrc(tSource);
		tSource__tFlow____outgoingFlows.setTrg(tFlow);
		ruleresult.getTranslatedEdges().add(tSource__tFlow____outgoingFlows);
		mTarget__mSource____incomingFlows.setSrc(mTarget);
		mTarget__mSource____incomingFlows.setTrg(mSource);
		ruleresult.getCreatedEdges().add(mTarget__mSource____incomingFlows);
		mSource__mTarget____flowTarget.setSrc(mSource);
		mSource__mTarget____flowTarget.setTrg(mTarget);
		ruleresult.getCreatedEdges().add(mSource__mTarget____flowTarget);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tFlow__tSource____incomingFlows.setName(tFlow__tSource____incomingFlows_name_prime);
		tSource__tFlow____outgoingFlows.setName(tSource__tFlow____outgoingFlows_name_prime);
		mTarget__mSource____incomingFlows.setName(mTarget__mSource____incomingFlows_name_prime);
		mSource__mTarget____flowTarget.setName(mSource__mTarget____flowTarget_name_prime);
		return new Object[] { ruleresult, mSource, tFlow, mTarget, tSource, tFlow__tSource____incomingFlows,
				tSource__tFlow____outgoingFlows, mTarget__mSource____incomingFlows, mSource__mTarget____flowTarget };
	}

	public static final void pattern_DataFlowIn_11_5_registerobjects_expressionBBBBBBBB(DataFlowIn _this,
			PerformRuleResult ruleresult, EObject mSource, EObject mFlowToTFlow, EObject tFlow,
			EObject mSourceToTSource, EObject mTarget, EObject tSource) {
		_this.registerObjects_BWD(ruleresult, mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource);

	}

	public static final PerformRuleResult pattern_DataFlowIn_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_12_1_preparereturnvalue_bindingFB(DataFlowIn _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_12_1_preparereturnvalue_blackFBB(EClass eClass, DataFlowIn _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_12_1_preparereturnvalue_bindingAndBlackFFB(DataFlowIn _this) {
		Object[] result_pattern_DataFlowIn_12_1_preparereturnvalue_binding = pattern_DataFlowIn_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_DataFlowIn_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_DataFlowIn_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_DataFlowIn_12_1_preparereturnvalue_black = pattern_DataFlowIn_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_DataFlowIn_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_DataFlowIn_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "DataFlowIn";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_DataFlowIn_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tFlow");
		EObject _localVariable_1 = match.getObject("tSource");
		EObject tmpTFlow = _localVariable_0;
		EObject tmpTSource = _localVariable_1;
		if (tmpTFlow instanceof TAbstractFlowElement) {
			TAbstractFlowElement tFlow = (TAbstractFlowElement) tmpTFlow;
			if (tmpTSource instanceof TAbstractFlowElement) {
				TAbstractFlowElement tSource = (TAbstractFlowElement) tmpTSource;
				return new Object[] { tFlow, tSource, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DataFlowIn_12_2_corematch_blackFFBFFBB(TAbstractFlowElement tFlow,
			TAbstractFlowElement tSource, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tFlow.equals(tSource)) {
			for (MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tFlow, MAbstractFlowElementToTAbstractFlowElement.class, "target")) {
				MAbstractFlowElement mTarget = mFlowToTFlow.getSource();
				if (mTarget != null) {
					for (MAbstractFlowElementToTAbstractFlowElement mSourceToTSource : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tSource, MAbstractFlowElementToTAbstractFlowElement.class,
									"target")) {
						if (!mFlowToTFlow.equals(mSourceToTSource)) {
							MAbstractFlowElement tmpMSource = mSourceToTSource.getSource();
							if (tmpMSource instanceof MFlow) {
								MFlow mSource = (MFlow) tmpMSource;
								if (!mSource.equals(mTarget)) {
									_result.add(new Object[] { mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget,
											tSource, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_DataFlowIn_12_3_findcontext_blackBBBBBB(MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, TAbstractFlowElement tFlow,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mSource.equals(mTarget)) {
			if (!mFlowToTFlow.equals(mSourceToTSource)) {
				if (!tFlow.equals(tSource)) {
					if (tFlow.equals(mFlowToTFlow.getTarget())) {
						if (tFlow.getIncomingFlows().contains(tSource)) {
							if (mTarget.equals(mFlowToTFlow.getSource())) {
								if (tSource.equals(mSourceToTSource.getTarget())) {
									if (mSource.equals(mSourceToTSource.getSource())) {
										_result.add(new Object[] { mSource, mFlowToTFlow, tFlow, mSourceToTSource,
												mTarget, tSource });
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

	public static final Object[] pattern_DataFlowIn_12_3_findcontext_greenBBBBBBFFFFFFF(MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, TAbstractFlowElement tFlow,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mFlowToTFlow__tFlow____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tFlow__tSource____incomingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSource__tFlow____outgoingFlows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowToTFlow__mTarget____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSourceToTSource__tSource____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSourceToTSource__mSource____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mFlowToTFlow__tFlow____target_name_prime = "target";
		String tFlow__tSource____incomingFlows_name_prime = "incomingFlows";
		String tSource__tFlow____outgoingFlows_name_prime = "outgoingFlows";
		String mFlowToTFlow__mTarget____source_name_prime = "source";
		String mSourceToTSource__tSource____target_name_prime = "target";
		String mSourceToTSource__mSource____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mSource);
		isApplicableMatch.getAllContextElements().add(mFlowToTFlow);
		isApplicableMatch.getAllContextElements().add(tFlow);
		isApplicableMatch.getAllContextElements().add(mSourceToTSource);
		isApplicableMatch.getAllContextElements().add(mTarget);
		isApplicableMatch.getAllContextElements().add(tSource);
		mFlowToTFlow__tFlow____target.setSrc(mFlowToTFlow);
		mFlowToTFlow__tFlow____target.setTrg(tFlow);
		isApplicableMatch.getAllContextElements().add(mFlowToTFlow__tFlow____target);
		tFlow__tSource____incomingFlows.setSrc(tFlow);
		tFlow__tSource____incomingFlows.setTrg(tSource);
		isApplicableMatch.getAllContextElements().add(tFlow__tSource____incomingFlows);
		tSource__tFlow____outgoingFlows.setSrc(tSource);
		tSource__tFlow____outgoingFlows.setTrg(tFlow);
		isApplicableMatch.getAllContextElements().add(tSource__tFlow____outgoingFlows);
		mFlowToTFlow__mTarget____source.setSrc(mFlowToTFlow);
		mFlowToTFlow__mTarget____source.setTrg(mTarget);
		isApplicableMatch.getAllContextElements().add(mFlowToTFlow__mTarget____source);
		mSourceToTSource__tSource____target.setSrc(mSourceToTSource);
		mSourceToTSource__tSource____target.setTrg(tSource);
		isApplicableMatch.getAllContextElements().add(mSourceToTSource__tSource____target);
		mSourceToTSource__mSource____source.setSrc(mSourceToTSource);
		mSourceToTSource__mSource____source.setTrg(mSource);
		isApplicableMatch.getAllContextElements().add(mSourceToTSource__mSource____source);
		mFlowToTFlow__tFlow____target.setName(mFlowToTFlow__tFlow____target_name_prime);
		tFlow__tSource____incomingFlows.setName(tFlow__tSource____incomingFlows_name_prime);
		tSource__tFlow____outgoingFlows.setName(tSource__tFlow____outgoingFlows_name_prime);
		mFlowToTFlow__mTarget____source.setName(mFlowToTFlow__mTarget____source_name_prime);
		mSourceToTSource__tSource____target.setName(mSourceToTSource__tSource____target_name_prime);
		mSourceToTSource__mSource____source.setName(mSourceToTSource__mSource____source_name_prime);
		return new Object[] { mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource, isApplicableMatch,
				mFlowToTFlow__tFlow____target, tFlow__tSource____incomingFlows, tSource__tFlow____outgoingFlows,
				mFlowToTFlow__mTarget____source, mSourceToTSource__tSource____target,
				mSourceToTSource__mSource____source };
	}

	public static final Object[] pattern_DataFlowIn_12_4_solveCSP_bindingFBBBBBBBB(DataFlowIn _this,
			IsApplicableMatch isApplicableMatch, MFlow mSource, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow,
			TAbstractFlowElement tFlow, MAbstractFlowElementToTAbstractFlowElement mSourceToTSource,
			MAbstractFlowElement mTarget, TAbstractFlowElement tSource) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mSource, mFlowToTFlow, tFlow,
				mSourceToTSource, mTarget, tSource);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSource, mFlowToTFlow, tFlow, mSourceToTSource,
					mTarget, tSource };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DataFlowIn_12_4_solveCSP_bindingAndBlackFBBBBBBBB(DataFlowIn _this,
			IsApplicableMatch isApplicableMatch, MFlow mSource, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow,
			TAbstractFlowElement tFlow, MAbstractFlowElementToTAbstractFlowElement mSourceToTSource,
			MAbstractFlowElement mTarget, TAbstractFlowElement tSource) {
		Object[] result_pattern_DataFlowIn_12_4_solveCSP_binding = pattern_DataFlowIn_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource);
		if (result_pattern_DataFlowIn_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_DataFlowIn_12_4_solveCSP_binding[0];

			Object[] result_pattern_DataFlowIn_12_4_solveCSP_black = pattern_DataFlowIn_12_4_solveCSP_blackB(csp);
			if (result_pattern_DataFlowIn_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSource, mFlowToTFlow, tFlow, mSourceToTSource,
						mTarget, tSource };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowIn_12_5_checkCSP_expressionFBB(DataFlowIn _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_DataFlowIn_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "DataFlowIn";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_DataFlowIn_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_20_1_preparereturnvalue_bindingFB(DataFlowIn _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			DataFlowIn _this) {
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

	public static final Object[] pattern_DataFlowIn_20_1_preparereturnvalue_bindingAndBlackFFBF(DataFlowIn _this) {
		Object[] result_pattern_DataFlowIn_20_1_preparereturnvalue_binding = pattern_DataFlowIn_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_DataFlowIn_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_DataFlowIn_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_DataFlowIn_20_1_preparereturnvalue_black = pattern_DataFlowIn_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_DataFlowIn_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_DataFlowIn_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_DataFlowIn_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_DataFlowIn_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_incomingFlows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTFlow = _edge_incomingFlows.getSrc();
		if (tmpTFlow instanceof TAbstractFlowElement) {
			TAbstractFlowElement tFlow = (TAbstractFlowElement) tmpTFlow;
			EObject tmpTSource = _edge_incomingFlows.getTrg();
			if (tmpTSource instanceof TAbstractFlowElement) {
				TAbstractFlowElement tSource = (TAbstractFlowElement) tmpTSource;
				if (!tFlow.equals(tSource)) {
					if (tFlow.getIncomingFlows().contains(tSource)) {
						_result.add(new Object[] { tFlow, tSource, _edge_incomingFlows });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_DataFlowIn_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_DataFlowIn_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			DataFlowIn _this, Match match, TAbstractFlowElement tFlow, TAbstractFlowElement tSource) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tFlow, tSource);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_DataFlowIn_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			DataFlowIn _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_DataFlowIn_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_21_1_preparereturnvalue_bindingFB(DataFlowIn _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			DataFlowIn _this) {
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

	public static final Object[] pattern_DataFlowIn_21_1_preparereturnvalue_bindingAndBlackFFBF(DataFlowIn _this) {
		Object[] result_pattern_DataFlowIn_21_1_preparereturnvalue_binding = pattern_DataFlowIn_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_DataFlowIn_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_DataFlowIn_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_DataFlowIn_21_1_preparereturnvalue_black = pattern_DataFlowIn_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_DataFlowIn_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_DataFlowIn_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_DataFlowIn_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_DataFlowIn_21_2_testcorematchandDECs_blackFFB(
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
						_result.add(new Object[] { mSource, mTarget, _edge_incomingFlows });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_DataFlowIn_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_DataFlowIn_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			DataFlowIn _this, Match match, MFlow mSource, MAbstractFlowElement mTarget) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mSource, mTarget);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_DataFlowIn_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			DataFlowIn _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_DataFlowIn_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_24_1_prepare_blackB(DataFlowIn _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_DataFlowIn_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_DataFlowIn_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mSource");
		EObject _localVariable_1 = targetMatch.getObject("tFlow");
		EObject _localVariable_2 = sourceMatch.getObject("mTarget");
		EObject _localVariable_3 = targetMatch.getObject("tSource");
		EObject tmpMSource = _localVariable_0;
		EObject tmpTFlow = _localVariable_1;
		EObject tmpMTarget = _localVariable_2;
		EObject tmpTSource = _localVariable_3;
		if (tmpMSource instanceof MFlow) {
			MFlow mSource = (MFlow) tmpMSource;
			if (tmpTFlow instanceof TAbstractFlowElement) {
				TAbstractFlowElement tFlow = (TAbstractFlowElement) tmpTFlow;
				if (tmpMTarget instanceof MAbstractFlowElement) {
					MAbstractFlowElement mTarget = (MAbstractFlowElement) tmpMTarget;
					if (tmpTSource instanceof TAbstractFlowElement) {
						TAbstractFlowElement tSource = (TAbstractFlowElement) tmpTSource;
						return new Object[] { mSource, tFlow, mTarget, tSource, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_24_2_matchsrctrgcontext_blackBBBBBB(MFlow mSource,
			TAbstractFlowElement tFlow, MAbstractFlowElement mTarget, TAbstractFlowElement tSource, Match sourceMatch,
			Match targetMatch) {
		if (!mSource.equals(mTarget)) {
			if (!tFlow.equals(tSource)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { mSource, tFlow, mTarget, tSource, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_DataFlowIn_24_2_matchsrctrgcontext_binding = pattern_DataFlowIn_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_DataFlowIn_24_2_matchsrctrgcontext_binding != null) {
			MFlow mSource = (MFlow) result_pattern_DataFlowIn_24_2_matchsrctrgcontext_binding[0];
			TAbstractFlowElement tFlow = (TAbstractFlowElement) result_pattern_DataFlowIn_24_2_matchsrctrgcontext_binding[1];
			MAbstractFlowElement mTarget = (MAbstractFlowElement) result_pattern_DataFlowIn_24_2_matchsrctrgcontext_binding[2];
			TAbstractFlowElement tSource = (TAbstractFlowElement) result_pattern_DataFlowIn_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_DataFlowIn_24_2_matchsrctrgcontext_black = pattern_DataFlowIn_24_2_matchsrctrgcontext_blackBBBBBB(
					mSource, tFlow, mTarget, tSource, sourceMatch, targetMatch);
			if (result_pattern_DataFlowIn_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mSource, tFlow, mTarget, tSource, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_24_3_solvecsp_bindingFBBBBBBB(DataFlowIn _this, MFlow mSource,
			TAbstractFlowElement tFlow, MAbstractFlowElement mTarget, TAbstractFlowElement tSource, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(mSource, tFlow, mTarget, tSource, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, mSource, tFlow, mTarget, tSource, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DataFlowIn_24_3_solvecsp_bindingAndBlackFBBBBBBB(DataFlowIn _this,
			MFlow mSource, TAbstractFlowElement tFlow, MAbstractFlowElement mTarget, TAbstractFlowElement tSource,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_DataFlowIn_24_3_solvecsp_binding = pattern_DataFlowIn_24_3_solvecsp_bindingFBBBBBBB(
				_this, mSource, tFlow, mTarget, tSource, sourceMatch, targetMatch);
		if (result_pattern_DataFlowIn_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_DataFlowIn_24_3_solvecsp_binding[0];

			Object[] result_pattern_DataFlowIn_24_3_solvecsp_black = pattern_DataFlowIn_24_3_solvecsp_blackB(csp);
			if (result_pattern_DataFlowIn_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mSource, tFlow, mTarget, tSource, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowIn_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_DataFlowIn_24_5_matchcorrcontext_blackBFBFBBBB(MFlow mSource,
			TAbstractFlowElement tFlow, MAbstractFlowElement mTarget, TAbstractFlowElement tSource, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mSource.equals(mTarget)) {
			if (!tFlow.equals(tSource)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tFlow, MAbstractFlowElementToTAbstractFlowElement.class,
									"target")) {
						if (mTarget.equals(mFlowToTFlow.getSource())) {
							for (MAbstractFlowElementToTAbstractFlowElement mSourceToTSource : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(tSource,
											MAbstractFlowElementToTAbstractFlowElement.class, "target")) {
								if (!mFlowToTFlow.equals(mSourceToTSource)) {
									if (mSource.equals(mSourceToTSource.getSource())) {
										_result.add(new Object[] { mSource, mFlowToTFlow, tFlow, mSourceToTSource,
												mTarget, tSource, sourceMatch, targetMatch });
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

	public static final Object[] pattern_DataFlowIn_24_5_matchcorrcontext_greenBBBBF(
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "DataFlowIn";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mFlowToTFlow);
		ccMatch.getAllContextElements().add(mSourceToTSource);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mFlowToTFlow, mSourceToTSource, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_DataFlowIn_24_6_createcorrespondence_blackBBBBB(MFlow mSource,
			TAbstractFlowElement tFlow, MAbstractFlowElement mTarget, TAbstractFlowElement tSource, CCMatch ccMatch) {
		if (!mSource.equals(mTarget)) {
			if (!tFlow.equals(tSource)) {
				return new Object[] { mSource, tFlow, mTarget, tSource, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_DataFlowIn_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "DataFlowIn";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_DataFlowIn_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_27_1_matchtggpattern_blackBB(MFlow mSource,
			MAbstractFlowElement mTarget) {
		if (!mSource.equals(mTarget)) {
			if (mTarget.getIncomingFlows().contains(mSource)) {
				return new Object[] { mSource, mTarget };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowIn_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_DataFlowIn_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_28_1_matchtggpattern_blackBB(TAbstractFlowElement tFlow,
			TAbstractFlowElement tSource) {
		if (!tFlow.equals(tSource)) {
			if (tFlow.getIncomingFlows().contains(tSource)) {
				return new Object[] { tFlow, tSource };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowIn_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_DataFlowIn_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_29_1_createresult_blackB(DataFlowIn _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_DataFlowIn_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_DataFlowIn_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MFlow mSource) {
		if (ruleResult.getSourceObjects().contains(mSource)) {
			return new Object[] { ruleResult, mSource };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MAbstractFlowElementToTAbstractFlowElement mSourceToTSource) {
		if (ruleResult.getCorrObjects().contains(mSourceToTSource)) {
			return new Object[] { ruleResult, mSourceToTSource };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TAbstractFlowElement tSource) {
		if (ruleResult.getTargetObjects().contains(tSource)) {
			return new Object[] { ruleResult, tSource };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow) {
		if (ruleResult.getCorrObjects().contains(mFlowToTFlow)) {
			return new Object[] { ruleResult, mFlowToTFlow };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TAbstractFlowElement tFlow) {
		if (ruleResult.getTargetObjects().contains(tFlow)) {
			return new Object[] { ruleResult, tFlow };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MAbstractFlowElement mTarget) {
		if (ruleResult.getSourceObjects().contains(mTarget)) {
			return new Object[] { ruleResult, mTarget };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_DataFlowIn_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mSourceToTSourceList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mFlowToTFlowList : ruleEntryContainer.getRuleEntryList()) {
				if (!mFlowToTFlowList.equals(mSourceToTSourceList)) {
					for (EObject tmpMSourceToTSource : mSourceToTSourceList.getEntryObjects()) {
						if (tmpMSourceToTSource instanceof MAbstractFlowElementToTAbstractFlowElement) {
							MAbstractFlowElementToTAbstractFlowElement mSourceToTSource = (MAbstractFlowElementToTAbstractFlowElement) tmpMSourceToTSource;
							MAbstractFlowElement tmpMSource = mSourceToTSource.getSource();
							if (tmpMSource instanceof MFlow) {
								MFlow mSource = (MFlow) tmpMSource;
								TAbstractFlowElement tSource = mSourceToTSource.getTarget();
								if (tSource != null) {
									if (pattern_DataFlowIn_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mSourceToTSource) == null) {
										if (pattern_DataFlowIn_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												mSource) == null) {
											if (pattern_DataFlowIn_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													tSource) == null) {
												for (EObject tmpMFlowToTFlow : mFlowToTFlowList.getEntryObjects()) {
													if (tmpMFlowToTFlow instanceof MAbstractFlowElementToTAbstractFlowElement) {
														MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow = (MAbstractFlowElementToTAbstractFlowElement) tmpMFlowToTFlow;
														if (!mFlowToTFlow.equals(mSourceToTSource)) {
															TAbstractFlowElement tFlow = mFlowToTFlow.getTarget();
															if (tFlow != null) {
																if (!tFlow.equals(tSource)) {
																	MAbstractFlowElement mTarget = mFlowToTFlow
																			.getSource();
																	if (mTarget != null) {
																		if (!mSource.equals(mTarget)) {
																			if (pattern_DataFlowIn_29_2_isapplicablecore_black_nac_3BB(
																					ruleResult, mFlowToTFlow) == null) {
																				if (pattern_DataFlowIn_29_2_isapplicablecore_black_nac_4BB(
																						ruleResult, tFlow) == null) {
																					if (pattern_DataFlowIn_29_2_isapplicablecore_black_nac_5BB(
																							ruleResult,
																							mTarget) == null) {
																						_result.add(new Object[] {
																								mSourceToTSourceList,
																								mSource,
																								mSourceToTSource,
																								tSource,
																								mFlowToTFlowList,
																								mFlowToTFlow, tFlow,
																								mTarget,
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

	public static final Object[] pattern_DataFlowIn_29_3_solveCSP_bindingFBBBBBBBBB(DataFlowIn _this,
			IsApplicableMatch isApplicableMatch, MFlow mSource, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow,
			TAbstractFlowElement tFlow, MAbstractFlowElementToTAbstractFlowElement mSourceToTSource,
			MAbstractFlowElement mTarget, TAbstractFlowElement tSource, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mSource, mFlowToTFlow, tFlow,
				mSourceToTSource, mTarget, tSource, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSource, mFlowToTFlow, tFlow, mSourceToTSource,
					mTarget, tSource, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_DataFlowIn_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(DataFlowIn _this,
			IsApplicableMatch isApplicableMatch, MFlow mSource, MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow,
			TAbstractFlowElement tFlow, MAbstractFlowElementToTAbstractFlowElement mSourceToTSource,
			MAbstractFlowElement mTarget, TAbstractFlowElement tSource, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_DataFlowIn_29_3_solveCSP_binding = pattern_DataFlowIn_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource, ruleResult);
		if (result_pattern_DataFlowIn_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_DataFlowIn_29_3_solveCSP_binding[0];

			Object[] result_pattern_DataFlowIn_29_3_solveCSP_black = pattern_DataFlowIn_29_3_solveCSP_blackB(csp);
			if (result_pattern_DataFlowIn_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSource, mFlowToTFlow, tFlow, mSourceToTSource,
						mTarget, tSource, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_DataFlowIn_29_4_checkCSP_expressionFBB(DataFlowIn _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_DataFlowIn_29_5_checknacs_blackBBBBBB(MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, TAbstractFlowElement tFlow,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource) {
		if (!mSource.equals(mTarget)) {
			if (!mFlowToTFlow.equals(mSourceToTSource)) {
				if (!tFlow.equals(tSource)) {
					return new Object[] { mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_29_6_perform_blackBBBBBBB(MFlow mSource,
			MAbstractFlowElementToTAbstractFlowElement mFlowToTFlow, TAbstractFlowElement tFlow,
			MAbstractFlowElementToTAbstractFlowElement mSourceToTSource, MAbstractFlowElement mTarget,
			TAbstractFlowElement tSource, ModelgeneratorRuleResult ruleResult) {
		if (!mSource.equals(mTarget)) {
			if (!mFlowToTFlow.equals(mSourceToTSource)) {
				if (!tFlow.equals(tSource)) {
					return new Object[] { mSource, mFlowToTFlow, tFlow, mSourceToTSource, mTarget, tSource,
							ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_DataFlowIn_29_6_perform_greenBBBBB(MFlow mSource, TAbstractFlowElement tFlow,
			MAbstractFlowElement mTarget, TAbstractFlowElement tSource, ModelgeneratorRuleResult ruleResult) {
		tFlow.getIncomingFlows().add(tSource);
		mTarget.getIncomingFlows().add(mSource);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mSource, tFlow, mTarget, tSource, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_DataFlowIn_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //DataFlowInImpl
