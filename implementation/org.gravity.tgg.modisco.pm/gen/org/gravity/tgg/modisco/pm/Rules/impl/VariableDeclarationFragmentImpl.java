/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.BodyDeclaration;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MFieldDefinition;

import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.RulesPackage;
import org.gravity.tgg.modisco.pm.Rules.VariableDeclarationFragment;

import org.gravity.tgg.modisco.pm.VariableDeclarationFragmentToTFieldDefinition;

import org.gravity.typegraph.basic.TFieldDefinition;
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
 * An implementation of the model object '<em><b>Variable Declaration Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationFragmentImpl extends AbstractRuleImpl implements VariableDeclarationFragment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getVariableDeclarationFragment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment,
			MFieldDefinition mDefinition) {

		Object[] result1_black = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_0_1_initialbindings_blackBBBB(this, match, varDeclFragment,
						mDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[varDeclFragment] = " + varDeclFragment + ", " + "[mDefinition] = "
					+ mDefinition + ".");
		}

		Object[] result2_bindingAndBlack = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, varDeclFragment,
						mDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[varDeclFragment] = " + varDeclFragment + ", " + "[mDefinition] = "
					+ mDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_0_4_collectelementstobetranslated_blackBBB(match,
							varDeclFragment, mDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[varDeclFragment] = " + varDeclFragment + ", " + "[mDefinition] = " + mDefinition + ".");
			}
			VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_0_4_collectelementstobetranslated_greenBBBFF(match,
							varDeclFragment, mDefinition);
			//nothing EMoflonEdge varDeclFragment__mDefinition____variablesContainer = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mDefinition__varDeclFragment____fragments = (EMoflonEdge) result4_green[4];

			Object[] result5_black = VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_0_5_collectcontextelements_blackBBB(match, varDeclFragment,
							mDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[varDeclFragment] = " + varDeclFragment + ", " + "[mDefinition] = " + mDefinition + ".");
			}
			VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_0_5_collectcontextelements_greenBB(match, mDefinition);

			// 
			VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_0_6_registerobjectstomatch_expressionBBBB(this, match,
							varDeclFragment, mDefinition);
			return VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_0_7_expressionF();
		} else {
			return VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment = (org.eclipse.modisco.java.VariableDeclarationFragment) result1_bindingAndBlack[0];
		MDefinitionToTMember eFieldDeclarationToTFieldDefinition = (MDefinitionToTMember) result1_bindingAndBlack[1];
		MFieldDefinition mDefinition = (MFieldDefinition) result1_bindingAndBlack[2];
		TFieldDefinition tDefinition = (TFieldDefinition) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_1_1_performtransformation_greenBBF(varDeclFragment, tDefinition);
		VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition = (VariableDeclarationFragmentToTFieldDefinition) result1_green[2];

		Object[] result2_black = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_1_2_collecttranslatedelements_blackBB(varDeclFragment,
						varDeclFragmentToTFieldDefinition);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[varDeclFragment] = " + varDeclFragment + ", "
							+ "[varDeclFragmentToTFieldDefinition] = " + varDeclFragmentToTFieldDefinition + ".");
		}
		Object[] result2_green = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_1_2_collecttranslatedelements_greenFBB(varDeclFragment,
						varDeclFragmentToTFieldDefinition);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_1_3_bookkeepingforedges_blackBBBBBB(ruleresult, varDeclFragment,
						eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition,
						varDeclFragmentToTFieldDefinition);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[varDeclFragment] = " + varDeclFragment + ", "
					+ "[eFieldDeclarationToTFieldDefinition] = " + eFieldDeclarationToTFieldDefinition + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = " + tDefinition + ", "
					+ "[varDeclFragmentToTFieldDefinition] = " + varDeclFragmentToTFieldDefinition + ".");
		}
		VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_1_3_bookkeepingforedges_greenBBBBBFFFF(
				ruleresult, varDeclFragment, mDefinition, tDefinition, varDeclFragmentToTFieldDefinition);
		//nothing EMoflonEdge varDeclFragment__mDefinition____variablesContainer = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mDefinition__varDeclFragment____fragments = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge varDeclFragmentToTFieldDefinition__tDefinition____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge varDeclFragmentToTFieldDefinition__varDeclFragment____source = (EMoflonEdge) result3_green[8];

		// 
		// 
		VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_1_5_registerobjects_expressionBBBBBBB(this,
				ruleresult, varDeclFragment, eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition,
				varDeclFragmentToTFieldDefinition);
		return VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment = (org.eclipse.modisco.java.VariableDeclarationFragment) result2_binding[0];
		MFieldDefinition mDefinition = (MFieldDefinition) result2_binding[1];
		for (Object[] result2_black : VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_2_2_corematch_blackBFBFB(varDeclFragment, mDefinition, match)) {
			MDefinitionToTMember eFieldDeclarationToTFieldDefinition = (MDefinitionToTMember) result2_black[1];
			TFieldDefinition tDefinition = (TFieldDefinition) result2_black[3];
			// ForEach 
			for (Object[] result3_black : VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_2_3_findcontext_blackBBBB(varDeclFragment,
							eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition)) {
				Object[] result3_green = VariableDeclarationFragmentImpl
						.pattern_VariableDeclarationFragment_2_3_findcontext_greenBBBBFFFFF(varDeclFragment,
								eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge varDeclFragment__mDefinition____variablesContainer = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mDefinition__varDeclFragment____fragments = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge eFieldDeclarationToTFieldDefinition__mDefinition____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge eFieldDeclarationToTFieldDefinition__tDefinition____target = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = VariableDeclarationFragmentImpl
						.pattern_VariableDeclarationFragment_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, varDeclFragment, eFieldDeclarationToTFieldDefinition, mDefinition,
								tDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[varDeclFragment] = "
							+ varDeclFragment + ", " + "[eFieldDeclarationToTFieldDefinition] = "
							+ eFieldDeclarationToTFieldDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[tDefinition] = " + tDefinition + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = VariableDeclarationFragmentImpl
							.pattern_VariableDeclarationFragment_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					VariableDeclarationFragmentImpl
							.pattern_VariableDeclarationFragment_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment, MFieldDefinition mDefinition) {
		match.registerObject("varDeclFragment", varDeclFragment);
		match.registerObject("mDefinition", mDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment, MFieldDefinition mDefinition) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment,
			MDefinitionToTMember eFieldDeclarationToTFieldDefinition, MFieldDefinition mDefinition,
			TFieldDefinition tDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("varDeclFragment", varDeclFragment);
		isApplicableMatch.registerObject("eFieldDeclarationToTFieldDefinition", eFieldDeclarationToTFieldDefinition);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject varDeclFragment,
			EObject eFieldDeclarationToTFieldDefinition, EObject mDefinition, EObject tDefinition,
			EObject varDeclFragmentToTFieldDefinition) {
		ruleresult.registerObject("varDeclFragment", varDeclFragment);
		ruleresult.registerObject("eFieldDeclarationToTFieldDefinition", eFieldDeclarationToTFieldDefinition);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("varDeclFragmentToTFieldDefinition", varDeclFragmentToTFieldDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("varDeclFragment").eClass())
				.equals("java.VariableDeclarationFragment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TFieldDefinition tDefinition) {

		Object[] result1_black = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_10_1_initialbindings_blackBBB(this, match, tDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tDefinition] = " + tDefinition + ".");
		}

		Object[] result2_bindingAndBlack = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_10_2_SolveCSP_bindingAndBlackFBBB(this, match, tDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tDefinition] = " + tDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_10_4_collectelementstobetranslated_blackBB(match, tDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tDefinition] = " + tDefinition + ".");
			}

			Object[] result5_black = VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_10_5_collectcontextelements_blackBB(match, tDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tDefinition] = " + tDefinition + ".");
			}
			VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_10_5_collectcontextelements_greenBB(match, tDefinition);

			// 
			VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_10_6_registerobjectstomatch_expressionBBB(this, match,
							tDefinition);
			return VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_10_7_expressionF();
		} else {
			return VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_10_8_expressionF();
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
	public void registerObjectsToMatch_BWD(Match match, TFieldDefinition tDefinition) {
		match.registerObject("tDefinition", tDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TFieldDefinition tDefinition) {// Create CSP
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
	public EObjectContainer isAppropriate_BWD_TFieldDefinition_0(TFieldDefinition tDefinition) {

		Object[] result1_bindingAndBlack = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_17_2_testcorematchandDECs_blackB(tDefinition)) {
			Object[] result2_green = VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
							this, match, tDefinition)) {
				// 
				if (VariableDeclarationFragmentImpl
						.pattern_VariableDeclarationFragment_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = VariableDeclarationFragmentImpl
							.pattern_VariableDeclarationFragment_17_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					VariableDeclarationFragmentImpl
							.pattern_VariableDeclarationFragment_17_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_6(EMoflonEdge _edge_variablesContainer) {

		Object[] result1_bindingAndBlack = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_18_2_testcorematchandDECs_blackFFB(_edge_variablesContainer)) {
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment = (org.eclipse.modisco.java.VariableDeclarationFragment) result2_black[0];
			MFieldDefinition mDefinition = (MFieldDefinition) result2_black[1];
			Object[] result2_green = VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, varDeclFragment, mDefinition)) {
				// 
				if (VariableDeclarationFragmentImpl
						.pattern_VariableDeclarationFragment_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = VariableDeclarationFragmentImpl
							.pattern_VariableDeclarationFragment_18_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					VariableDeclarationFragmentImpl
							.pattern_VariableDeclarationFragment_18_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("VariableDeclarationFragment");
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
		ruleResult.setRule("VariableDeclarationFragment");
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

		Object[] result1_black = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_21_2_matchsrctrgcontext_bindingAndBlackFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment = (org.eclipse.modisco.java.VariableDeclarationFragment) result2_bindingAndBlack[0];
		MFieldDefinition mDefinition = (MFieldDefinition) result2_bindingAndBlack[1];
		TFieldDefinition tDefinition = (TFieldDefinition) result2_bindingAndBlack[2];

		Object[] result3_bindingAndBlack = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_21_3_solvecsp_bindingAndBlackFBBBBBB(this, varDeclFragment,
						mDefinition, tDefinition, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[varDeclFragment] = " + varDeclFragment + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[tDefinition] = " + tDefinition + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_21_5_matchcorrcontext_blackFBBBB(mDefinition, tDefinition,
							sourceMatch, targetMatch)) {
				MDefinitionToTMember eFieldDeclarationToTFieldDefinition = (MDefinitionToTMember) result5_black[0];
				Object[] result5_green = VariableDeclarationFragmentImpl
						.pattern_VariableDeclarationFragment_21_5_matchcorrcontext_greenBBBF(
								eFieldDeclarationToTFieldDefinition, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = VariableDeclarationFragmentImpl
						.pattern_VariableDeclarationFragment_21_6_createcorrespondence_blackBBBB(varDeclFragment,
								mDefinition, tDefinition, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[varDeclFragment] = "
							+ varDeclFragment + ", " + "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = "
							+ tDefinition + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_21_6_createcorrespondence_greenBBFB(
						varDeclFragment, tDefinition, ccMatch);
				//nothing VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition = (VariableDeclarationFragmentToTFieldDefinition) result6_green[2];

				Object[] result7_black = VariableDeclarationFragmentImpl
						.pattern_VariableDeclarationFragment_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VariableDeclarationFragmentImpl
						.pattern_VariableDeclarationFragment_21_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment,
			MFieldDefinition mDefinition, TFieldDefinition tDefinition, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment,
			MFieldDefinition mDefinition) {// 
		Object[] result1_black = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_24_1_matchtggpattern_blackBB(varDeclFragment, mDefinition);
		if (result1_black != null) {
			return VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_24_2_expressionF();
		} else {
			return VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TFieldDefinition tDefinition) {// 
		Object[] result1_black = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_25_1_matchtggpattern_blackB(tDefinition);
		if (result1_black != null) {
			return VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_25_2_expressionF();
		} else {
			return VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember eFieldDeclarationToTFieldDefinitionParameter) {

		Object[] result1_black = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : VariableDeclarationFragmentImpl
				.pattern_VariableDeclarationFragment_26_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList eFieldDeclarationToTFieldDefinitionList = (RuleEntryList) result2_black[0];
			MDefinitionToTMember eFieldDeclarationToTFieldDefinition = (MDefinitionToTMember) result2_black[1];
			MFieldDefinition mDefinition = (MFieldDefinition) result2_black[2];
			TFieldDefinition tDefinition = (TFieldDefinition) result2_black[3];

			Object[] result3_bindingAndBlack = VariableDeclarationFragmentImpl
					.pattern_VariableDeclarationFragment_26_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", "
						+ "[eFieldDeclarationToTFieldDefinition] = " + eFieldDeclarationToTFieldDefinition + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = " + tDefinition + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_26_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = VariableDeclarationFragmentImpl
						.pattern_VariableDeclarationFragment_26_5_checknacs_blackBBB(
								eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition);
				if (result5_black != null) {

					Object[] result6_black = VariableDeclarationFragmentImpl
							.pattern_VariableDeclarationFragment_26_6_perform_blackBBBB(
									eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[eFieldDeclarationToTFieldDefinition] = " + eFieldDeclarationToTFieldDefinition
								+ ", " + "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = " + tDefinition
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_26_6_perform_greenFBBFB(
							mDefinition, tDefinition, ruleResult);
					//nothing org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment = (org.eclipse.modisco.java.VariableDeclarationFragment) result6_green[0];
					//nothing VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition = (VariableDeclarationFragmentToTFieldDefinition) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return VariableDeclarationFragmentImpl.pattern_VariableDeclarationFragment_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember eFieldDeclarationToTFieldDefinition, MFieldDefinition mDefinition,
			TFieldDefinition tDefinition, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eFieldDeclarationToTFieldDefinition", eFieldDeclarationToTFieldDefinition);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
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
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___IS_APPROPRIATE_FWD__MATCH_VARIABLEDECLARATIONFRAGMENT_MFIELDDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.VariableDeclarationFragment) arguments.get(1),
					(MFieldDefinition) arguments.get(2));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_VARIABLEDECLARATIONFRAGMENT_MFIELDDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.VariableDeclarationFragment) arguments.get(1),
					(MFieldDefinition) arguments.get(2));
			return null;
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_VARIABLEDECLARATIONFRAGMENT_MFIELDDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.VariableDeclarationFragment) arguments.get(1),
					(MFieldDefinition) arguments.get(2));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_VARIABLEDECLARATIONFRAGMENT_MDEFINITIONTOTMEMBER_MFIELDDEFINITION_TFIELDDEFINITION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.VariableDeclarationFragment) arguments.get(1),
					(MDefinitionToTMember) arguments.get(2), (MFieldDefinition) arguments.get(3),
					(TFieldDefinition) arguments.get(4));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5));
			return null;
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___IS_APPROPRIATE_BWD__MATCH_TFIELDDEFINITION:
			return isAppropriate_BWD((Match) arguments.get(0), (TFieldDefinition) arguments.get(1));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TFIELDDEFINITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TFieldDefinition) arguments.get(1));
			return null;
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TFIELDDEFINITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TFieldDefinition) arguments.get(1));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___IS_APPROPRIATE_BWD_TFIELD_DEFINITION_0__TFIELDDEFINITION:
			return isAppropriate_BWD_TFieldDefinition_0((TFieldDefinition) arguments.get(0));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_6__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_6((EMoflonEdge) arguments.get(0));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___IS_APPLICABLE_SOLVE_CSP_CC__VARIABLEDECLARATIONFRAGMENT_MFIELDDEFINITION_TFIELDDEFINITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.modisco.java.VariableDeclarationFragment) arguments.get(0),
					(MFieldDefinition) arguments.get(1), (TFieldDefinition) arguments.get(2), (Match) arguments.get(3),
					(Match) arguments.get(4));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___CHECK_DEC_FWD__VARIABLEDECLARATIONFRAGMENT_MFIELDDEFINITION:
			return checkDEC_FWD((org.eclipse.modisco.java.VariableDeclarationFragment) arguments.get(0),
					(MFieldDefinition) arguments.get(1));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___CHECK_DEC_BWD__TFIELDDEFINITION:
			return checkDEC_BWD((TFieldDefinition) arguments.get(0));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_MFIELDDEFINITION_TFIELDDEFINITION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (MFieldDefinition) arguments.get(2),
					(TFieldDefinition) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_VariableDeclarationFragment_0_1_initialbindings_blackBBBB(
			VariableDeclarationFragment _this, Match match,
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment, MFieldDefinition mDefinition) {
		return new Object[] { _this, match, varDeclFragment, mDefinition };
	}

	public static final Object[] pattern_VariableDeclarationFragment_0_2_SolveCSP_bindingFBBBB(
			VariableDeclarationFragment _this, Match match,
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment, MFieldDefinition mDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, varDeclFragment, mDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, varDeclFragment, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDeclarationFragment_0_2_SolveCSP_bindingAndBlackFBBBB(
			VariableDeclarationFragment _this, Match match,
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment, MFieldDefinition mDefinition) {
		Object[] result_pattern_VariableDeclarationFragment_0_2_SolveCSP_binding = pattern_VariableDeclarationFragment_0_2_SolveCSP_bindingFBBBB(
				_this, match, varDeclFragment, mDefinition);
		if (result_pattern_VariableDeclarationFragment_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDeclarationFragment_0_2_SolveCSP_binding[0];

			Object[] result_pattern_VariableDeclarationFragment_0_2_SolveCSP_black = pattern_VariableDeclarationFragment_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VariableDeclarationFragment_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, varDeclFragment, mDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDeclarationFragment_0_3_CheckCSP_expressionFBB(
			VariableDeclarationFragment _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_0_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment,
			MFieldDefinition mDefinition) {
		return new Object[] { match, varDeclFragment, mDefinition };
	}

	public static final Object[] pattern_VariableDeclarationFragment_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment,
			MFieldDefinition mDefinition) {
		EMoflonEdge varDeclFragment__mDefinition____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__varDeclFragment____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(varDeclFragment);
		String varDeclFragment__mDefinition____variablesContainer_name_prime = "variablesContainer";
		String mDefinition__varDeclFragment____fragments_name_prime = "fragments";
		varDeclFragment__mDefinition____variablesContainer.setSrc(varDeclFragment);
		varDeclFragment__mDefinition____variablesContainer.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(varDeclFragment__mDefinition____variablesContainer);
		mDefinition__varDeclFragment____fragments.setSrc(mDefinition);
		mDefinition__varDeclFragment____fragments.setTrg(varDeclFragment);
		match.getToBeTranslatedEdges().add(mDefinition__varDeclFragment____fragments);
		varDeclFragment__mDefinition____variablesContainer
				.setName(varDeclFragment__mDefinition____variablesContainer_name_prime);
		mDefinition__varDeclFragment____fragments.setName(mDefinition__varDeclFragment____fragments_name_prime);
		return new Object[] { match, varDeclFragment, mDefinition, varDeclFragment__mDefinition____variablesContainer,
				mDefinition__varDeclFragment____fragments };
	}

	public static final Object[] pattern_VariableDeclarationFragment_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment, MFieldDefinition mDefinition) {
		return new Object[] { match, varDeclFragment, mDefinition };
	}

	public static final Object[] pattern_VariableDeclarationFragment_0_5_collectcontextelements_greenBB(Match match,
			MFieldDefinition mDefinition) {
		match.getContextNodes().add(mDefinition);
		return new Object[] { match, mDefinition };
	}

	public static final void pattern_VariableDeclarationFragment_0_6_registerobjectstomatch_expressionBBBB(
			VariableDeclarationFragment _this, Match match,
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment, MFieldDefinition mDefinition) {
		_this.registerObjectsToMatch_FWD(match, varDeclFragment, mDefinition);

	}

	public static final boolean pattern_VariableDeclarationFragment_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VariableDeclarationFragment_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("varDeclFragment");
		EObject _localVariable_1 = isApplicableMatch.getObject("eFieldDeclarationToTFieldDefinition");
		EObject _localVariable_2 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_3 = isApplicableMatch.getObject("tDefinition");
		EObject tmpVarDeclFragment = _localVariable_0;
		EObject tmpEFieldDeclarationToTFieldDefinition = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		EObject tmpTDefinition = _localVariable_3;
		if (tmpVarDeclFragment instanceof org.eclipse.modisco.java.VariableDeclarationFragment) {
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment = (org.eclipse.modisco.java.VariableDeclarationFragment) tmpVarDeclFragment;
			if (tmpEFieldDeclarationToTFieldDefinition instanceof MDefinitionToTMember) {
				MDefinitionToTMember eFieldDeclarationToTFieldDefinition = (MDefinitionToTMember) tmpEFieldDeclarationToTFieldDefinition;
				if (tmpMDefinition instanceof MFieldDefinition) {
					MFieldDefinition mDefinition = (MFieldDefinition) tmpMDefinition;
					if (tmpTDefinition instanceof TFieldDefinition) {
						TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
						return new Object[] { varDeclFragment, eFieldDeclarationToTFieldDefinition, mDefinition,
								tDefinition, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_1_1_performtransformation_blackBBBBFBB(
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment,
			MDefinitionToTMember eFieldDeclarationToTFieldDefinition, MFieldDefinition mDefinition,
			TFieldDefinition tDefinition, VariableDeclarationFragment _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { varDeclFragment, eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_1_1_performtransformation_bindingAndBlackFFFFFBB(
			VariableDeclarationFragment _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_VariableDeclarationFragment_1_1_performtransformation_binding = pattern_VariableDeclarationFragment_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_VariableDeclarationFragment_1_1_performtransformation_binding != null) {
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment = (org.eclipse.modisco.java.VariableDeclarationFragment) result_pattern_VariableDeclarationFragment_1_1_performtransformation_binding[0];
			MDefinitionToTMember eFieldDeclarationToTFieldDefinition = (MDefinitionToTMember) result_pattern_VariableDeclarationFragment_1_1_performtransformation_binding[1];
			MFieldDefinition mDefinition = (MFieldDefinition) result_pattern_VariableDeclarationFragment_1_1_performtransformation_binding[2];
			TFieldDefinition tDefinition = (TFieldDefinition) result_pattern_VariableDeclarationFragment_1_1_performtransformation_binding[3];

			Object[] result_pattern_VariableDeclarationFragment_1_1_performtransformation_black = pattern_VariableDeclarationFragment_1_1_performtransformation_blackBBBBFBB(
					varDeclFragment, eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition, _this,
					isApplicableMatch);
			if (result_pattern_VariableDeclarationFragment_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_VariableDeclarationFragment_1_1_performtransformation_black[4];

				return new Object[] { varDeclFragment, eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_1_1_performtransformation_greenBBF(
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment, TFieldDefinition tDefinition) {
		VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition = PmFactory.eINSTANCE
				.createVariableDeclarationFragmentToTFieldDefinition();
		varDeclFragmentToTFieldDefinition.setTarget(tDefinition);
		varDeclFragmentToTFieldDefinition.setSource(varDeclFragment);
		return new Object[] { varDeclFragment, tDefinition, varDeclFragmentToTFieldDefinition };
	}

	public static final Object[] pattern_VariableDeclarationFragment_1_2_collecttranslatedelements_blackBB(
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment,
			VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition) {
		return new Object[] { varDeclFragment, varDeclFragmentToTFieldDefinition };
	}

	public static final Object[] pattern_VariableDeclarationFragment_1_2_collecttranslatedelements_greenFBB(
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment,
			VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(varDeclFragment);
		ruleresult.getCreatedLinkElements().add(varDeclFragmentToTFieldDefinition);
		return new Object[] { ruleresult, varDeclFragment, varDeclFragmentToTFieldDefinition };
	}

	public static final Object[] pattern_VariableDeclarationFragment_1_3_bookkeepingforedges_blackBBBBBB(
			PerformRuleResult ruleresult, EObject varDeclFragment, EObject eFieldDeclarationToTFieldDefinition,
			EObject mDefinition, EObject tDefinition, EObject varDeclFragmentToTFieldDefinition) {
		if (!varDeclFragment.equals(varDeclFragmentToTFieldDefinition)) {
			if (!eFieldDeclarationToTFieldDefinition.equals(varDeclFragment)) {
				if (!eFieldDeclarationToTFieldDefinition.equals(mDefinition)) {
					if (!eFieldDeclarationToTFieldDefinition.equals(tDefinition)) {
						if (!eFieldDeclarationToTFieldDefinition.equals(varDeclFragmentToTFieldDefinition)) {
							if (!mDefinition.equals(varDeclFragment)) {
								if (!mDefinition.equals(tDefinition)) {
									if (!mDefinition.equals(varDeclFragmentToTFieldDefinition)) {
										if (!tDefinition.equals(varDeclFragment)) {
											if (!tDefinition.equals(varDeclFragmentToTFieldDefinition)) {
												return new Object[] { ruleresult, varDeclFragment,
														eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition,
														varDeclFragmentToTFieldDefinition };
											}
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

	public static final Object[] pattern_VariableDeclarationFragment_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject varDeclFragment, EObject mDefinition, EObject tDefinition,
			EObject varDeclFragmentToTFieldDefinition) {
		EMoflonEdge varDeclFragment__mDefinition____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__varDeclFragment____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge varDeclFragmentToTFieldDefinition__tDefinition____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge varDeclFragmentToTFieldDefinition__varDeclFragment____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "VariableDeclarationFragment";
		String varDeclFragment__mDefinition____variablesContainer_name_prime = "variablesContainer";
		String mDefinition__varDeclFragment____fragments_name_prime = "fragments";
		String varDeclFragmentToTFieldDefinition__tDefinition____target_name_prime = "target";
		String varDeclFragmentToTFieldDefinition__varDeclFragment____source_name_prime = "source";
		varDeclFragment__mDefinition____variablesContainer.setSrc(varDeclFragment);
		varDeclFragment__mDefinition____variablesContainer.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(varDeclFragment__mDefinition____variablesContainer);
		mDefinition__varDeclFragment____fragments.setSrc(mDefinition);
		mDefinition__varDeclFragment____fragments.setTrg(varDeclFragment);
		ruleresult.getTranslatedEdges().add(mDefinition__varDeclFragment____fragments);
		varDeclFragmentToTFieldDefinition__tDefinition____target.setSrc(varDeclFragmentToTFieldDefinition);
		varDeclFragmentToTFieldDefinition__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(varDeclFragmentToTFieldDefinition__tDefinition____target);
		varDeclFragmentToTFieldDefinition__varDeclFragment____source.setSrc(varDeclFragmentToTFieldDefinition);
		varDeclFragmentToTFieldDefinition__varDeclFragment____source.setTrg(varDeclFragment);
		ruleresult.getCreatedEdges().add(varDeclFragmentToTFieldDefinition__varDeclFragment____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		varDeclFragment__mDefinition____variablesContainer
				.setName(varDeclFragment__mDefinition____variablesContainer_name_prime);
		mDefinition__varDeclFragment____fragments.setName(mDefinition__varDeclFragment____fragments_name_prime);
		varDeclFragmentToTFieldDefinition__tDefinition____target
				.setName(varDeclFragmentToTFieldDefinition__tDefinition____target_name_prime);
		varDeclFragmentToTFieldDefinition__varDeclFragment____source
				.setName(varDeclFragmentToTFieldDefinition__varDeclFragment____source_name_prime);
		return new Object[] { ruleresult, varDeclFragment, mDefinition, tDefinition, varDeclFragmentToTFieldDefinition,
				varDeclFragment__mDefinition____variablesContainer, mDefinition__varDeclFragment____fragments,
				varDeclFragmentToTFieldDefinition__tDefinition____target,
				varDeclFragmentToTFieldDefinition__varDeclFragment____source };
	}

	public static final void pattern_VariableDeclarationFragment_1_5_registerobjects_expressionBBBBBBB(
			VariableDeclarationFragment _this, PerformRuleResult ruleresult, EObject varDeclFragment,
			EObject eFieldDeclarationToTFieldDefinition, EObject mDefinition, EObject tDefinition,
			EObject varDeclFragmentToTFieldDefinition) {
		_this.registerObjects_FWD(ruleresult, varDeclFragment, eFieldDeclarationToTFieldDefinition, mDefinition,
				tDefinition, varDeclFragmentToTFieldDefinition);

	}

	public static final PerformRuleResult pattern_VariableDeclarationFragment_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_2_1_preparereturnvalue_bindingFB(
			VariableDeclarationFragment _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_2_1_preparereturnvalue_blackFBB(EClass eClass,
			VariableDeclarationFragment _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_2_1_preparereturnvalue_bindingAndBlackFFB(
			VariableDeclarationFragment _this) {
		Object[] result_pattern_VariableDeclarationFragment_2_1_preparereturnvalue_binding = pattern_VariableDeclarationFragment_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VariableDeclarationFragment_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_VariableDeclarationFragment_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VariableDeclarationFragment_2_1_preparereturnvalue_black = pattern_VariableDeclarationFragment_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_VariableDeclarationFragment_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_VariableDeclarationFragment_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "VariableDeclarationFragment";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_VariableDeclarationFragment_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("varDeclFragment");
		EObject _localVariable_1 = match.getObject("mDefinition");
		EObject tmpVarDeclFragment = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		if (tmpVarDeclFragment instanceof org.eclipse.modisco.java.VariableDeclarationFragment) {
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment = (org.eclipse.modisco.java.VariableDeclarationFragment) tmpVarDeclFragment;
			if (tmpMDefinition instanceof MFieldDefinition) {
				MFieldDefinition mDefinition = (MFieldDefinition) tmpMDefinition;
				return new Object[] { varDeclFragment, mDefinition, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VariableDeclarationFragment_2_2_corematch_blackBFBFB(
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment, MFieldDefinition mDefinition,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember eFieldDeclarationToTFieldDefinition : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
			TMember tmpTDefinition = eFieldDeclarationToTFieldDefinition.getTarget();
			if (tmpTDefinition instanceof TFieldDefinition) {
				TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
				_result.add(new Object[] { varDeclFragment, eFieldDeclarationToTFieldDefinition, mDefinition,
						tDefinition, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_VariableDeclarationFragment_2_3_findcontext_blackBBBB(
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment,
			MDefinitionToTMember eFieldDeclarationToTFieldDefinition, MFieldDefinition mDefinition,
			TFieldDefinition tDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mDefinition.equals(varDeclFragment.getVariablesContainer())) {
			if (mDefinition.equals(eFieldDeclarationToTFieldDefinition.getSource())) {
				if (tDefinition.equals(eFieldDeclarationToTFieldDefinition.getTarget())) {
					_result.add(new Object[] { varDeclFragment, eFieldDeclarationToTFieldDefinition, mDefinition,
							tDefinition });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_2_3_findcontext_greenBBBBFFFFF(
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment,
			MDefinitionToTMember eFieldDeclarationToTFieldDefinition, MFieldDefinition mDefinition,
			TFieldDefinition tDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge varDeclFragment__mDefinition____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__varDeclFragment____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTFieldDefinition__mDefinition____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTFieldDefinition__tDefinition____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String varDeclFragment__mDefinition____variablesContainer_name_prime = "variablesContainer";
		String mDefinition__varDeclFragment____fragments_name_prime = "fragments";
		String eFieldDeclarationToTFieldDefinition__mDefinition____source_name_prime = "source";
		String eFieldDeclarationToTFieldDefinition__tDefinition____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(varDeclFragment);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTFieldDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		varDeclFragment__mDefinition____variablesContainer.setSrc(varDeclFragment);
		varDeclFragment__mDefinition____variablesContainer.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(varDeclFragment__mDefinition____variablesContainer);
		mDefinition__varDeclFragment____fragments.setSrc(mDefinition);
		mDefinition__varDeclFragment____fragments.setTrg(varDeclFragment);
		isApplicableMatch.getAllContextElements().add(mDefinition__varDeclFragment____fragments);
		eFieldDeclarationToTFieldDefinition__mDefinition____source.setSrc(eFieldDeclarationToTFieldDefinition);
		eFieldDeclarationToTFieldDefinition__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTFieldDefinition__mDefinition____source);
		eFieldDeclarationToTFieldDefinition__tDefinition____target.setSrc(eFieldDeclarationToTFieldDefinition);
		eFieldDeclarationToTFieldDefinition__tDefinition____target.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(eFieldDeclarationToTFieldDefinition__tDefinition____target);
		varDeclFragment__mDefinition____variablesContainer
				.setName(varDeclFragment__mDefinition____variablesContainer_name_prime);
		mDefinition__varDeclFragment____fragments.setName(mDefinition__varDeclFragment____fragments_name_prime);
		eFieldDeclarationToTFieldDefinition__mDefinition____source
				.setName(eFieldDeclarationToTFieldDefinition__mDefinition____source_name_prime);
		eFieldDeclarationToTFieldDefinition__tDefinition____target
				.setName(eFieldDeclarationToTFieldDefinition__tDefinition____target_name_prime);
		return new Object[] { varDeclFragment, eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition,
				isApplicableMatch, varDeclFragment__mDefinition____variablesContainer,
				mDefinition__varDeclFragment____fragments, eFieldDeclarationToTFieldDefinition__mDefinition____source,
				eFieldDeclarationToTFieldDefinition__tDefinition____target };
	}

	public static final Object[] pattern_VariableDeclarationFragment_2_4_solveCSP_bindingFBBBBBB(
			VariableDeclarationFragment _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment,
			MDefinitionToTMember eFieldDeclarationToTFieldDefinition, MFieldDefinition mDefinition,
			TFieldDefinition tDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, varDeclFragment,
				eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, varDeclFragment, eFieldDeclarationToTFieldDefinition,
					mDefinition, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDeclarationFragment_2_4_solveCSP_bindingAndBlackFBBBBBB(
			VariableDeclarationFragment _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment,
			MDefinitionToTMember eFieldDeclarationToTFieldDefinition, MFieldDefinition mDefinition,
			TFieldDefinition tDefinition) {
		Object[] result_pattern_VariableDeclarationFragment_2_4_solveCSP_binding = pattern_VariableDeclarationFragment_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, varDeclFragment, eFieldDeclarationToTFieldDefinition, mDefinition,
				tDefinition);
		if (result_pattern_VariableDeclarationFragment_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDeclarationFragment_2_4_solveCSP_binding[0];

			Object[] result_pattern_VariableDeclarationFragment_2_4_solveCSP_black = pattern_VariableDeclarationFragment_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_VariableDeclarationFragment_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, varDeclFragment,
						eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDeclarationFragment_2_5_checkCSP_expressionFBB(
			VariableDeclarationFragment _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_VariableDeclarationFragment_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "VariableDeclarationFragment";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_VariableDeclarationFragment_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_10_1_initialbindings_blackBBB(
			VariableDeclarationFragment _this, Match match, TFieldDefinition tDefinition) {
		return new Object[] { _this, match, tDefinition };
	}

	public static final Object[] pattern_VariableDeclarationFragment_10_2_SolveCSP_bindingFBBB(
			VariableDeclarationFragment _this, Match match, TFieldDefinition tDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDeclarationFragment_10_2_SolveCSP_bindingAndBlackFBBB(
			VariableDeclarationFragment _this, Match match, TFieldDefinition tDefinition) {
		Object[] result_pattern_VariableDeclarationFragment_10_2_SolveCSP_binding = pattern_VariableDeclarationFragment_10_2_SolveCSP_bindingFBBB(
				_this, match, tDefinition);
		if (result_pattern_VariableDeclarationFragment_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDeclarationFragment_10_2_SolveCSP_binding[0];

			Object[] result_pattern_VariableDeclarationFragment_10_2_SolveCSP_black = pattern_VariableDeclarationFragment_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VariableDeclarationFragment_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDeclarationFragment_10_3_CheckCSP_expressionFBB(
			VariableDeclarationFragment _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_10_4_collectelementstobetranslated_blackBB(
			Match match, TFieldDefinition tDefinition) {
		return new Object[] { match, tDefinition };
	}

	public static final Object[] pattern_VariableDeclarationFragment_10_5_collectcontextelements_blackBB(Match match,
			TFieldDefinition tDefinition) {
		return new Object[] { match, tDefinition };
	}

	public static final Object[] pattern_VariableDeclarationFragment_10_5_collectcontextelements_greenBB(Match match,
			TFieldDefinition tDefinition) {
		match.getContextNodes().add(tDefinition);
		return new Object[] { match, tDefinition };
	}

	public static final void pattern_VariableDeclarationFragment_10_6_registerobjectstomatch_expressionBBB(
			VariableDeclarationFragment _this, Match match, TFieldDefinition tDefinition) {
		_this.registerObjectsToMatch_BWD(match, tDefinition);

	}

	public static final boolean pattern_VariableDeclarationFragment_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VariableDeclarationFragment_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_17_1_preparereturnvalue_bindingFB(
			VariableDeclarationFragment _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			VariableDeclarationFragment _this) {
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

	public static final Object[] pattern_VariableDeclarationFragment_17_1_preparereturnvalue_bindingAndBlackFFBF(
			VariableDeclarationFragment _this) {
		Object[] result_pattern_VariableDeclarationFragment_17_1_preparereturnvalue_binding = pattern_VariableDeclarationFragment_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VariableDeclarationFragment_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_VariableDeclarationFragment_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VariableDeclarationFragment_17_1_preparereturnvalue_black = pattern_VariableDeclarationFragment_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_VariableDeclarationFragment_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_VariableDeclarationFragment_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_VariableDeclarationFragment_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_VariableDeclarationFragment_17_2_testcorematchandDECs_blackB(
			TFieldDefinition tDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { tDefinition });
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_17_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_VariableDeclarationFragment_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			VariableDeclarationFragment _this, Match match, TFieldDefinition tDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_VariableDeclarationFragment_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			VariableDeclarationFragment _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_VariableDeclarationFragment_17_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_18_1_preparereturnvalue_bindingFB(
			VariableDeclarationFragment _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			VariableDeclarationFragment _this) {
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

	public static final Object[] pattern_VariableDeclarationFragment_18_1_preparereturnvalue_bindingAndBlackFFBF(
			VariableDeclarationFragment _this) {
		Object[] result_pattern_VariableDeclarationFragment_18_1_preparereturnvalue_binding = pattern_VariableDeclarationFragment_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VariableDeclarationFragment_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_VariableDeclarationFragment_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VariableDeclarationFragment_18_1_preparereturnvalue_black = pattern_VariableDeclarationFragment_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_VariableDeclarationFragment_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_VariableDeclarationFragment_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_VariableDeclarationFragment_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_VariableDeclarationFragment_18_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_variablesContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpVarDeclFragment = _edge_variablesContainer.getSrc();
		if (tmpVarDeclFragment instanceof org.eclipse.modisco.java.VariableDeclarationFragment) {
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment = (org.eclipse.modisco.java.VariableDeclarationFragment) tmpVarDeclFragment;
			EObject tmpMDefinition = _edge_variablesContainer.getTrg();
			if (tmpMDefinition instanceof MFieldDefinition) {
				MFieldDefinition mDefinition = (MFieldDefinition) tmpMDefinition;
				if (mDefinition.equals(varDeclFragment.getVariablesContainer())) {
					_result.add(new Object[] { varDeclFragment, mDefinition, _edge_variablesContainer });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_18_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_VariableDeclarationFragment_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			VariableDeclarationFragment _this, Match match,
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment, MFieldDefinition mDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, varDeclFragment, mDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_VariableDeclarationFragment_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			VariableDeclarationFragment _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_VariableDeclarationFragment_18_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_21_1_prepare_blackB(
			VariableDeclarationFragment _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_VariableDeclarationFragment_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_VariableDeclarationFragment_21_2_matchsrctrgcontext_bindingFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("varDeclFragment");
		EObject _localVariable_1 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_2 = targetMatch.getObject("tDefinition");
		EObject tmpVarDeclFragment = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpTDefinition = _localVariable_2;
		if (tmpVarDeclFragment instanceof org.eclipse.modisco.java.VariableDeclarationFragment) {
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment = (org.eclipse.modisco.java.VariableDeclarationFragment) tmpVarDeclFragment;
			if (tmpMDefinition instanceof MFieldDefinition) {
				MFieldDefinition mDefinition = (MFieldDefinition) tmpMDefinition;
				if (tmpTDefinition instanceof TFieldDefinition) {
					TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
					return new Object[] { varDeclFragment, mDefinition, tDefinition, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_21_2_matchsrctrgcontext_blackBBBBB(
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment, MFieldDefinition mDefinition,
			TFieldDefinition tDefinition, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { varDeclFragment, mDefinition, tDefinition, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_21_2_matchsrctrgcontext_bindingAndBlackFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VariableDeclarationFragment_21_2_matchsrctrgcontext_binding = pattern_VariableDeclarationFragment_21_2_matchsrctrgcontext_bindingFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_VariableDeclarationFragment_21_2_matchsrctrgcontext_binding != null) {
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment = (org.eclipse.modisco.java.VariableDeclarationFragment) result_pattern_VariableDeclarationFragment_21_2_matchsrctrgcontext_binding[0];
			MFieldDefinition mDefinition = (MFieldDefinition) result_pattern_VariableDeclarationFragment_21_2_matchsrctrgcontext_binding[1];
			TFieldDefinition tDefinition = (TFieldDefinition) result_pattern_VariableDeclarationFragment_21_2_matchsrctrgcontext_binding[2];

			Object[] result_pattern_VariableDeclarationFragment_21_2_matchsrctrgcontext_black = pattern_VariableDeclarationFragment_21_2_matchsrctrgcontext_blackBBBBB(
					varDeclFragment, mDefinition, tDefinition, sourceMatch, targetMatch);
			if (result_pattern_VariableDeclarationFragment_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { varDeclFragment, mDefinition, tDefinition, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_21_3_solvecsp_bindingFBBBBBB(
			VariableDeclarationFragment _this, org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment,
			MFieldDefinition mDefinition, TFieldDefinition tDefinition, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_3 = _this.isApplicable_solveCsp_CC(varDeclFragment, mDefinition, tDefinition, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_3;
		if (csp != null) {
			return new Object[] { csp, _this, varDeclFragment, mDefinition, tDefinition, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDeclarationFragment_21_3_solvecsp_bindingAndBlackFBBBBBB(
			VariableDeclarationFragment _this, org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment,
			MFieldDefinition mDefinition, TFieldDefinition tDefinition, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VariableDeclarationFragment_21_3_solvecsp_binding = pattern_VariableDeclarationFragment_21_3_solvecsp_bindingFBBBBBB(
				_this, varDeclFragment, mDefinition, tDefinition, sourceMatch, targetMatch);
		if (result_pattern_VariableDeclarationFragment_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDeclarationFragment_21_3_solvecsp_binding[0];

			Object[] result_pattern_VariableDeclarationFragment_21_3_solvecsp_black = pattern_VariableDeclarationFragment_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_VariableDeclarationFragment_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, varDeclFragment, mDefinition, tDefinition, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDeclarationFragment_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_VariableDeclarationFragment_21_5_matchcorrcontext_blackFBBBB(
			MFieldDefinition mDefinition, TFieldDefinition tDefinition, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MDefinitionToTMember eFieldDeclarationToTFieldDefinition : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
				if (tDefinition.equals(eFieldDeclarationToTFieldDefinition.getTarget())) {
					_result.add(new Object[] { eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition,
							sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_21_5_matchcorrcontext_greenBBBF(
			MDefinitionToTMember eFieldDeclarationToTFieldDefinition, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "VariableDeclarationFragment";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eFieldDeclarationToTFieldDefinition);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eFieldDeclarationToTFieldDefinition, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_VariableDeclarationFragment_21_6_createcorrespondence_blackBBBB(
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment, MFieldDefinition mDefinition,
			TFieldDefinition tDefinition, CCMatch ccMatch) {
		return new Object[] { varDeclFragment, mDefinition, tDefinition, ccMatch };
	}

	public static final Object[] pattern_VariableDeclarationFragment_21_6_createcorrespondence_greenBBFB(
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment, TFieldDefinition tDefinition,
			CCMatch ccMatch) {
		VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition = PmFactory.eINSTANCE
				.createVariableDeclarationFragmentToTFieldDefinition();
		varDeclFragmentToTFieldDefinition.setTarget(tDefinition);
		varDeclFragmentToTFieldDefinition.setSource(varDeclFragment);
		ccMatch.getCreateCorr().add(varDeclFragmentToTFieldDefinition);
		return new Object[] { varDeclFragment, tDefinition, varDeclFragmentToTFieldDefinition, ccMatch };
	}

	public static final Object[] pattern_VariableDeclarationFragment_21_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_VariableDeclarationFragment_21_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "VariableDeclarationFragment";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_VariableDeclarationFragment_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_24_1_matchtggpattern_blackBB(
			org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment, MFieldDefinition mDefinition) {
		if (mDefinition.equals(varDeclFragment.getVariablesContainer())) {
			return new Object[] { varDeclFragment, mDefinition };
		}
		return null;
	}

	public static final boolean pattern_VariableDeclarationFragment_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VariableDeclarationFragment_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_25_1_matchtggpattern_blackB(
			TFieldDefinition tDefinition) {
		return new Object[] { tDefinition };
	}

	public static final boolean pattern_VariableDeclarationFragment_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VariableDeclarationFragment_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_26_1_createresult_blackB(
			VariableDeclarationFragment _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_VariableDeclarationFragment_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_VariableDeclarationFragment_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember eFieldDeclarationToTFieldDefinition) {
		if (ruleResult.getCorrObjects().contains(eFieldDeclarationToTFieldDefinition)) {
			return new Object[] { ruleResult, eFieldDeclarationToTFieldDefinition };
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MFieldDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TFieldDefinition tDefinition) {
		if (ruleResult.getTargetObjects().contains(tDefinition)) {
			return new Object[] { ruleResult, tDefinition };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VariableDeclarationFragment_26_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eFieldDeclarationToTFieldDefinitionList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEFieldDeclarationToTFieldDefinition : eFieldDeclarationToTFieldDefinitionList
					.getEntryObjects()) {
				if (tmpEFieldDeclarationToTFieldDefinition instanceof MDefinitionToTMember) {
					MDefinitionToTMember eFieldDeclarationToTFieldDefinition = (MDefinitionToTMember) tmpEFieldDeclarationToTFieldDefinition;
					BodyDeclaration tmpMDefinition = eFieldDeclarationToTFieldDefinition.getSource();
					if (tmpMDefinition instanceof MFieldDefinition) {
						MFieldDefinition mDefinition = (MFieldDefinition) tmpMDefinition;
						TMember tmpTDefinition = eFieldDeclarationToTFieldDefinition.getTarget();
						if (tmpTDefinition instanceof TFieldDefinition) {
							TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
							if (pattern_VariableDeclarationFragment_26_2_isapplicablecore_black_nac_0BB(ruleResult,
									eFieldDeclarationToTFieldDefinition) == null) {
								if (pattern_VariableDeclarationFragment_26_2_isapplicablecore_black_nac_1BB(ruleResult,
										mDefinition) == null) {
									if (pattern_VariableDeclarationFragment_26_2_isapplicablecore_black_nac_2BB(
											ruleResult, tDefinition) == null) {
										_result.add(new Object[] { eFieldDeclarationToTFieldDefinitionList,
												eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition,
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

	public static final Object[] pattern_VariableDeclarationFragment_26_3_solveCSP_bindingFBBBBBB(
			VariableDeclarationFragment _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember eFieldDeclarationToTFieldDefinition, MFieldDefinition mDefinition,
			TFieldDefinition tDefinition, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eFieldDeclarationToTFieldDefinition,
				mDefinition, tDefinition, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eFieldDeclarationToTFieldDefinition, mDefinition,
					tDefinition, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_VariableDeclarationFragment_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDeclarationFragment_26_3_solveCSP_bindingAndBlackFBBBBBB(
			VariableDeclarationFragment _this, IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember eFieldDeclarationToTFieldDefinition, MFieldDefinition mDefinition,
			TFieldDefinition tDefinition, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_VariableDeclarationFragment_26_3_solveCSP_binding = pattern_VariableDeclarationFragment_26_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition, ruleResult);
		if (result_pattern_VariableDeclarationFragment_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDeclarationFragment_26_3_solveCSP_binding[0];

			Object[] result_pattern_VariableDeclarationFragment_26_3_solveCSP_black = pattern_VariableDeclarationFragment_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_VariableDeclarationFragment_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eFieldDeclarationToTFieldDefinition, mDefinition,
						tDefinition, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDeclarationFragment_26_4_checkCSP_expressionFBB(
			VariableDeclarationFragment _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDeclarationFragment_26_5_checknacs_blackBBB(
			MDefinitionToTMember eFieldDeclarationToTFieldDefinition, MFieldDefinition mDefinition,
			TFieldDefinition tDefinition) {
		return new Object[] { eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition };
	}

	public static final Object[] pattern_VariableDeclarationFragment_26_6_perform_blackBBBB(
			MDefinitionToTMember eFieldDeclarationToTFieldDefinition, MFieldDefinition mDefinition,
			TFieldDefinition tDefinition, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { eFieldDeclarationToTFieldDefinition, mDefinition, tDefinition, ruleResult };
	}

	public static final Object[] pattern_VariableDeclarationFragment_26_6_perform_greenFBBFB(
			MFieldDefinition mDefinition, TFieldDefinition tDefinition, ModelgeneratorRuleResult ruleResult) {
		org.eclipse.modisco.java.VariableDeclarationFragment varDeclFragment = JavaFactory.eINSTANCE
				.createVariableDeclarationFragment();
		VariableDeclarationFragmentToTFieldDefinition varDeclFragmentToTFieldDefinition = PmFactory.eINSTANCE
				.createVariableDeclarationFragmentToTFieldDefinition();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		varDeclFragment.setVariablesContainer(mDefinition);
		ruleResult.getSourceObjects().add(varDeclFragment);
		varDeclFragmentToTFieldDefinition.setTarget(tDefinition);
		varDeclFragmentToTFieldDefinition.setSource(varDeclFragment);
		ruleResult.getCorrObjects().add(varDeclFragmentToTFieldDefinition);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { varDeclFragment, mDefinition, tDefinition, varDeclFragmentToTFieldDefinition,
				ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_VariableDeclarationFragment_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //VariableDeclarationFragmentImpl
