/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.Modifier;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

import org.gravity.tgg.modisco.uml.UmlFactory;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;

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
 * An implementation of the model object '<em><b>Method Dec2 Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodDec2OperationImpl extends AbstractRuleImpl implements MethodDec2Operation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDec2OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodDec2Operation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodDefinition bodyDeclaration) {

		Object[] result1_black = MethodDec2OperationImpl.pattern_MethodDec2Operation_0_1_initialbindings_blackBBB(this,
				match, bodyDeclaration);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}

		Object[] result2_bindingAndBlack = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_0_2_SolveCSP_bindingAndBlackFBBB(this, match, bodyDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodDec2OperationImpl.pattern_MethodDec2Operation_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodDec2OperationImpl
					.pattern_MethodDec2Operation_0_4_collectelementstobetranslated_blackBB(match, bodyDeclaration);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			MethodDec2OperationImpl.pattern_MethodDec2Operation_0_4_collectelementstobetranslated_greenBB(match,
					bodyDeclaration);

			Object[] result5_black = MethodDec2OperationImpl
					.pattern_MethodDec2Operation_0_5_collectcontextelements_blackBB(match, bodyDeclaration);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			// 
			MethodDec2OperationImpl.pattern_MethodDec2Operation_0_6_registerobjectstomatch_expressionBBB(this, match,
					bodyDeclaration);
			return MethodDec2OperationImpl.pattern_MethodDec2Operation_0_7_expressionF();
		} else {
			return MethodDec2OperationImpl.pattern_MethodDec2Operation_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_1_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodDefinition bodyDeclaration = (MMethodDefinition) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_1_1_performtransformation_greenFBFB(bodyDeclaration, csp);
		ASTNode2Element b2e = (ASTNode2Element) result1_green[0];
		Operation feature = (Operation) result1_green[2];

		Object[] result2_black = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_1_2_collecttranslatedelements_blackBBB(b2e, bodyDeclaration, feature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b2e] = " + b2e + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[feature] = " + feature + ".");
		}
		Object[] result2_green = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_1_2_collecttranslatedelements_greenFBBB(b2e, bodyDeclaration, feature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodDec2OperationImpl.pattern_MethodDec2Operation_1_3_bookkeepingforedges_blackBBBB(
				ruleresult, b2e, bodyDeclaration, feature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2e] = " + b2e + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[feature] = "
					+ feature + ".");
		}
		MethodDec2OperationImpl.pattern_MethodDec2Operation_1_3_bookkeepingforedges_greenBBBBFF(ruleresult, b2e,
				bodyDeclaration, feature);
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		MethodDec2OperationImpl.pattern_MethodDec2Operation_1_5_registerobjects_expressionBBBBB(this, ruleresult, b2e,
				bodyDeclaration, feature);
		return MethodDec2OperationImpl.pattern_MethodDec2Operation_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodDec2OperationImpl.pattern_MethodDec2Operation_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodDefinition bodyDeclaration = (MMethodDefinition) result2_binding[0];
		for (Object[] result2_black : MethodDec2OperationImpl
				.pattern_MethodDec2Operation_2_2_corematch_blackBB(bodyDeclaration, match)) {
			// ForEach 
			for (Object[] result3_black : MethodDec2OperationImpl
					.pattern_MethodDec2Operation_2_3_findcontext_blackB(bodyDeclaration)) {
				Object[] result3_green = MethodDec2OperationImpl
						.pattern_MethodDec2Operation_2_3_findcontext_greenBF(bodyDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = MethodDec2OperationImpl
						.pattern_MethodDec2Operation_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
								bodyDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodDec2OperationImpl.pattern_MethodDec2Operation_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodDec2OperationImpl
							.pattern_MethodDec2Operation_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodDec2OperationImpl.pattern_MethodDec2Operation_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodDec2OperationImpl.pattern_MethodDec2Operation_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodDefinition bodyDeclaration) {
		match.registerObject("bodyDeclaration", bodyDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodDefinition bodyDeclaration) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MMethodDefinition bodyDeclaration) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");

		// Create unbound variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject b2e, EObject bodyDeclaration,
			EObject feature) {
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
				.equals("modisco.MMethodDefinition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Operation feature) {

		Object[] result1_black = MethodDec2OperationImpl.pattern_MethodDec2Operation_10_1_initialbindings_blackBBB(this,
				match, feature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ".");
		}

		Object[] result2_bindingAndBlack = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_10_2_SolveCSP_bindingAndBlackFBBB(this, match, feature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodDec2OperationImpl.pattern_MethodDec2Operation_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodDec2OperationImpl
					.pattern_MethodDec2Operation_10_4_collectelementstobetranslated_blackBB(match, feature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ".");
			}
			MethodDec2OperationImpl.pattern_MethodDec2Operation_10_4_collectelementstobetranslated_greenBB(match,
					feature);

			Object[] result5_black = MethodDec2OperationImpl
					.pattern_MethodDec2Operation_10_5_collectcontextelements_blackBB(match, feature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ".");
			}
			// 
			MethodDec2OperationImpl.pattern_MethodDec2Operation_10_6_registerobjectstomatch_expressionBBB(this, match,
					feature);
			return MethodDec2OperationImpl.pattern_MethodDec2Operation_10_7_expressionF();
		} else {
			return MethodDec2OperationImpl.pattern_MethodDec2Operation_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_11_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Operation feature = (Operation) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_11_1_performtransformation_greenFFBB(feature, csp);
		ASTNode2Element b2e = (ASTNode2Element) result1_green[0];
		MMethodDefinition bodyDeclaration = (MMethodDefinition) result1_green[1];

		Object[] result2_black = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_11_2_collecttranslatedelements_blackBBB(b2e, bodyDeclaration, feature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b2e] = " + b2e + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[feature] = " + feature + ".");
		}
		Object[] result2_green = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_11_2_collecttranslatedelements_greenFBBB(b2e, bodyDeclaration, feature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodDec2OperationImpl.pattern_MethodDec2Operation_11_3_bookkeepingforedges_blackBBBB(
				ruleresult, b2e, bodyDeclaration, feature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2e] = " + b2e + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[feature] = "
					+ feature + ".");
		}
		MethodDec2OperationImpl.pattern_MethodDec2Operation_11_3_bookkeepingforedges_greenBBBBFF(ruleresult, b2e,
				bodyDeclaration, feature);
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		MethodDec2OperationImpl.pattern_MethodDec2Operation_11_5_registerobjects_expressionBBBBB(this, ruleresult, b2e,
				bodyDeclaration, feature);
		return MethodDec2OperationImpl.pattern_MethodDec2Operation_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodDec2OperationImpl.pattern_MethodDec2Operation_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Operation feature = (Operation) result2_binding[0];
		for (Object[] result2_black : MethodDec2OperationImpl
				.pattern_MethodDec2Operation_12_2_corematch_blackBB(feature, match)) {
			// ForEach 
			for (Object[] result3_black : MethodDec2OperationImpl
					.pattern_MethodDec2Operation_12_3_findcontext_blackB(feature)) {
				Object[] result3_green = MethodDec2OperationImpl
						.pattern_MethodDec2Operation_12_3_findcontext_greenBF(feature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = MethodDec2OperationImpl
						.pattern_MethodDec2Operation_12_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
								feature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodDec2OperationImpl.pattern_MethodDec2Operation_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodDec2OperationImpl
							.pattern_MethodDec2Operation_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodDec2OperationImpl.pattern_MethodDec2Operation_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodDec2OperationImpl.pattern_MethodDec2Operation_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Operation feature) {
		match.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Operation feature) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Operation feature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject b2e, EObject bodyDeclaration,
			EObject feature) {
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("feature").eClass()).equals("uml.Operation.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_Operation_1(Operation feature) {

		Object[] result1_bindingAndBlack = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodDec2OperationImpl.pattern_MethodDec2Operation_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodDec2OperationImpl
				.pattern_MethodDec2Operation_20_2_testcorematchandDECs_blackB(feature)) {
			Object[] result2_green = MethodDec2OperationImpl
					.pattern_MethodDec2Operation_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodDec2OperationImpl
					.pattern_MethodDec2Operation_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, feature)) {
				// 
				if (MethodDec2OperationImpl
						.pattern_MethodDec2Operation_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodDec2OperationImpl
							.pattern_MethodDec2Operation_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodDec2OperationImpl.pattern_MethodDec2Operation_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodDec2OperationImpl.pattern_MethodDec2Operation_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_MMethodDefinition_0(MMethodDefinition bodyDeclaration) {

		Object[] result1_bindingAndBlack = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodDec2OperationImpl.pattern_MethodDec2Operation_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodDec2OperationImpl
				.pattern_MethodDec2Operation_21_2_testcorematchandDECs_blackB(bodyDeclaration)) {
			Object[] result2_green = MethodDec2OperationImpl
					.pattern_MethodDec2Operation_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodDec2OperationImpl
					.pattern_MethodDec2Operation_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, bodyDeclaration)) {
				// 
				if (MethodDec2OperationImpl
						.pattern_MethodDec2Operation_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodDec2OperationImpl
							.pattern_MethodDec2Operation_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodDec2OperationImpl.pattern_MethodDec2Operation_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodDec2OperationImpl.pattern_MethodDec2Operation_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodDec2Operation");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("MethodDec2Operation");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_feature_name.setBound(false);
			eq0.solve(var_bodyDeclaration_name, var_feature_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("feature", "name", var_feature_name.getValue());
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
		ruleResult.setRule("MethodDec2Operation");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("MethodDec2Operation");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_bodyDeclaration_name.setBound(false);
			eq0.solve(var_bodyDeclaration_name, var_feature_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("bodyDeclaration", "name", var_bodyDeclaration_name.getValue());
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

		Object[] result1_black = MethodDec2OperationImpl.pattern_MethodDec2Operation_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodDec2OperationImpl.pattern_MethodDec2Operation_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_24_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MMethodDefinition bodyDeclaration = (MMethodDefinition) result2_bindingAndBlack[0];
		Operation feature = (Operation) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_24_3_solvecsp_bindingAndBlackFBBBBB(this, bodyDeclaration, feature,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[feature] = " + feature + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodDec2OperationImpl.pattern_MethodDec2Operation_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodDec2OperationImpl
					.pattern_MethodDec2Operation_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = MethodDec2OperationImpl
						.pattern_MethodDec2Operation_24_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = MethodDec2OperationImpl
						.pattern_MethodDec2Operation_24_6_createcorrespondence_blackBBB(bodyDeclaration, feature,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[bodyDeclaration] = " + bodyDeclaration
									+ ", " + "[feature] = " + feature + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodDec2OperationImpl.pattern_MethodDec2Operation_24_6_createcorrespondence_greenFBBB(bodyDeclaration,
						feature, ccMatch);
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[0];

				Object[] result7_black = MethodDec2OperationImpl
						.pattern_MethodDec2Operation_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodDec2OperationImpl.pattern_MethodDec2Operation_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodDec2OperationImpl.pattern_MethodDec2Operation_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MMethodDefinition bodyDeclaration, Operation feature, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
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
	public boolean checkDEC_FWD(MMethodDefinition bodyDeclaration) {// 
		Object[] result1_black = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_27_1_matchtggpattern_blackB(bodyDeclaration);
		if (result1_black != null) {
			return MethodDec2OperationImpl.pattern_MethodDec2Operation_27_2_expressionF();
		} else {
			return MethodDec2OperationImpl.pattern_MethodDec2Operation_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Operation feature) {// 
		Object[] result1_black = MethodDec2OperationImpl
				.pattern_MethodDec2Operation_28_1_matchtggpattern_blackB(feature);
		if (result1_black != null) {
			return MethodDec2OperationImpl.pattern_MethodDec2Operation_28_2_expressionF();
		} else {
			return MethodDec2OperationImpl.pattern_MethodDec2Operation_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = MethodDec2OperationImpl.pattern_MethodDec2Operation_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodDec2OperationImpl.pattern_MethodDec2Operation_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = MethodDec2OperationImpl.pattern_MethodDec2Operation_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = MethodDec2OperationImpl
					.pattern_MethodDec2Operation_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodDec2OperationImpl.pattern_MethodDec2Operation_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = MethodDec2OperationImpl
						.pattern_MethodDec2Operation_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				MethodDec2OperationImpl.pattern_MethodDec2Operation_29_6_perform_greenFFFBB(ruleResult, csp);
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[0];
				//nothing MMethodDefinition bodyDeclaration = (MMethodDefinition) result6_green[1];
				//nothing Operation feature = (Operation) result6_green[2];

			} else {
			}

		} else {
		}
		return MethodDec2OperationImpl.pattern_MethodDec2Operation_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
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
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPROPRIATE_FWD__MATCH_MMETHODDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1));
		case RulesPackage.METHOD_DEC2_OPERATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1));
			return null;
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1));
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MMETHODDEFINITION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MMethodDefinition) arguments.get(1));
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.METHOD_DEC2_OPERATION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPROPRIATE_BWD__MATCH_OPERATION:
			return isAppropriate_BWD((Match) arguments.get(0), (Operation) arguments.get(1));
		case RulesPackage.METHOD_DEC2_OPERATION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_OPERATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Operation) arguments.get(1));
			return null;
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_OPERATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Operation) arguments.get(1));
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_OPERATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Operation) arguments.get(1));
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.METHOD_DEC2_OPERATION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPROPRIATE_BWD_OPERATION_1__OPERATION:
			return isAppropriate_BWD_Operation_1((Operation) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPROPRIATE_FWD_MMETHOD_DEFINITION_0__MMETHODDEFINITION:
			return isAppropriate_FWD_MMethodDefinition_0((MMethodDefinition) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPLICABLE_SOLVE_CSP_CC__MMETHODDEFINITION_OPERATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MMethodDefinition) arguments.get(0), (Operation) arguments.get(1),
					(Match) arguments.get(2), (Match) arguments.get(3));
		case RulesPackage.METHOD_DEC2_OPERATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___CHECK_DEC_FWD__MMETHODDEFINITION:
			return checkDEC_FWD((MMethodDefinition) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___CHECK_DEC_BWD__OPERATION:
			return checkDEC_BWD((Operation) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.METHOD_DEC2_OPERATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodDec2Operation_0_1_initialbindings_blackBBB(MethodDec2Operation _this,
			Match match, MMethodDefinition bodyDeclaration) {
		return new Object[] { _this, match, bodyDeclaration };
	}

	public static final Object[] pattern_MethodDec2Operation_0_2_SolveCSP_bindingFBBB(MethodDec2Operation _this,
			Match match, MMethodDefinition bodyDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDec2Operation_0_2_SolveCSP_bindingAndBlackFBBB(MethodDec2Operation _this,
			Match match, MMethodDefinition bodyDeclaration) {
		Object[] result_pattern_MethodDec2Operation_0_2_SolveCSP_binding = pattern_MethodDec2Operation_0_2_SolveCSP_bindingFBBB(
				_this, match, bodyDeclaration);
		if (result_pattern_MethodDec2Operation_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDec2Operation_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodDec2Operation_0_2_SolveCSP_black = pattern_MethodDec2Operation_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodDec2Operation_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDec2Operation_0_3_CheckCSP_expressionFBB(MethodDec2Operation _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_0_4_collectelementstobetranslated_blackBB(Match match,
			MMethodDefinition bodyDeclaration) {
		return new Object[] { match, bodyDeclaration };
	}

	public static final Object[] pattern_MethodDec2Operation_0_4_collectelementstobetranslated_greenBB(Match match,
			MMethodDefinition bodyDeclaration) {
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		return new Object[] { match, bodyDeclaration };
	}

	public static final Object[] pattern_MethodDec2Operation_0_5_collectcontextelements_blackBB(Match match,
			MMethodDefinition bodyDeclaration) {
		return new Object[] { match, bodyDeclaration };
	}

	public static final void pattern_MethodDec2Operation_0_6_registerobjectstomatch_expressionBBB(
			MethodDec2Operation _this, Match match, MMethodDefinition bodyDeclaration) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration);

	}

	public static final boolean pattern_MethodDec2Operation_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDec2Operation_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("bodyDeclaration");
		EObject tmpBodyDeclaration = _localVariable_0;
		if (tmpBodyDeclaration instanceof MMethodDefinition) {
			MMethodDefinition bodyDeclaration = (MMethodDefinition) tmpBodyDeclaration;
			return new Object[] { bodyDeclaration, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_1_1_performtransformation_blackBFBB(
			MMethodDefinition bodyDeclaration, MethodDec2Operation _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { bodyDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_1_1_performtransformation_bindingAndBlackFFBB(
			MethodDec2Operation _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodDec2Operation_1_1_performtransformation_binding = pattern_MethodDec2Operation_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_MethodDec2Operation_1_1_performtransformation_binding != null) {
			MMethodDefinition bodyDeclaration = (MMethodDefinition) result_pattern_MethodDec2Operation_1_1_performtransformation_binding[0];

			Object[] result_pattern_MethodDec2Operation_1_1_performtransformation_black = pattern_MethodDec2Operation_1_1_performtransformation_blackBFBB(
					bodyDeclaration, _this, isApplicableMatch);
			if (result_pattern_MethodDec2Operation_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodDec2Operation_1_1_performtransformation_black[1];

				return new Object[] { bodyDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_1_1_performtransformation_greenFBFB(
			MMethodDefinition bodyDeclaration, CSP csp) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Operation feature = UMLFactory.eINSTANCE.createOperation();
		Object _localVariable_0 = csp.getValue("feature", "name");
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		String feature_name_prime = (String) _localVariable_0;
		feature.setName(feature_name_prime);
		return new Object[] { b2e, bodyDeclaration, feature, csp };
	}

	public static final Object[] pattern_MethodDec2Operation_1_2_collecttranslatedelements_blackBBB(ASTNode2Element b2e,
			MMethodDefinition bodyDeclaration, Operation feature) {
		return new Object[] { b2e, bodyDeclaration, feature };
	}

	public static final Object[] pattern_MethodDec2Operation_1_2_collecttranslatedelements_greenFBBB(
			ASTNode2Element b2e, MMethodDefinition bodyDeclaration, Operation feature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		ruleresult.getCreatedElements().add(feature);
		return new Object[] { ruleresult, b2e, bodyDeclaration, feature };
	}

	public static final Object[] pattern_MethodDec2Operation_1_3_bookkeepingforedges_blackBBBB(
			PerformRuleResult ruleresult, EObject b2e, EObject bodyDeclaration, EObject feature) {
		if (!b2e.equals(bodyDeclaration)) {
			if (!b2e.equals(feature)) {
				if (!bodyDeclaration.equals(feature)) {
					return new Object[] { ruleresult, b2e, bodyDeclaration, feature };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_1_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject b2e, EObject bodyDeclaration, EObject feature) {
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodDec2Operation";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, b2e, bodyDeclaration, feature, b2e__bodyDeclaration____source,
				b2e__feature____target };
	}

	public static final void pattern_MethodDec2Operation_1_5_registerobjects_expressionBBBBB(MethodDec2Operation _this,
			PerformRuleResult ruleresult, EObject b2e, EObject bodyDeclaration, EObject feature) {
		_this.registerObjects_FWD(ruleresult, b2e, bodyDeclaration, feature);

	}

	public static final PerformRuleResult pattern_MethodDec2Operation_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_2_1_preparereturnvalue_bindingFB(
			MethodDec2Operation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodDec2Operation _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodDec2Operation _this) {
		Object[] result_pattern_MethodDec2Operation_2_1_preparereturnvalue_binding = pattern_MethodDec2Operation_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDec2Operation_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodDec2Operation_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDec2Operation_2_1_preparereturnvalue_black = pattern_MethodDec2Operation_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodDec2Operation_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodDec2Operation_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodDec2Operation";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodDec2Operation_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject tmpBodyDeclaration = _localVariable_0;
		if (tmpBodyDeclaration instanceof MMethodDefinition) {
			MMethodDefinition bodyDeclaration = (MMethodDefinition) tmpBodyDeclaration;
			return new Object[] { bodyDeclaration, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDec2Operation_2_2_corematch_blackBB(
			MMethodDefinition bodyDeclaration, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { bodyDeclaration, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDec2Operation_2_3_findcontext_blackB(
			MMethodDefinition bodyDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { bodyDeclaration });
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_2_3_findcontext_greenBF(
			MMethodDefinition bodyDeclaration) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		return new Object[] { bodyDeclaration, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDec2Operation_2_4_solveCSP_bindingFBBB(MethodDec2Operation _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition bodyDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDec2Operation_2_4_solveCSP_bindingAndBlackFBBB(MethodDec2Operation _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition bodyDeclaration) {
		Object[] result_pattern_MethodDec2Operation_2_4_solveCSP_binding = pattern_MethodDec2Operation_2_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, bodyDeclaration);
		if (result_pattern_MethodDec2Operation_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDec2Operation_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodDec2Operation_2_4_solveCSP_black = pattern_MethodDec2Operation_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDec2Operation_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDec2Operation_2_5_checkCSP_expressionFBB(MethodDec2Operation _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDec2Operation_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodDec2Operation";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDec2Operation_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_10_1_initialbindings_blackBBB(MethodDec2Operation _this,
			Match match, Operation feature) {
		return new Object[] { _this, match, feature };
	}

	public static final Object[] pattern_MethodDec2Operation_10_2_SolveCSP_bindingFBBB(MethodDec2Operation _this,
			Match match, Operation feature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDec2Operation_10_2_SolveCSP_bindingAndBlackFBBB(
			MethodDec2Operation _this, Match match, Operation feature) {
		Object[] result_pattern_MethodDec2Operation_10_2_SolveCSP_binding = pattern_MethodDec2Operation_10_2_SolveCSP_bindingFBBB(
				_this, match, feature);
		if (result_pattern_MethodDec2Operation_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDec2Operation_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodDec2Operation_10_2_SolveCSP_black = pattern_MethodDec2Operation_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodDec2Operation_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDec2Operation_10_3_CheckCSP_expressionFBB(MethodDec2Operation _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_10_4_collectelementstobetranslated_blackBB(Match match,
			Operation feature) {
		return new Object[] { match, feature };
	}

	public static final Object[] pattern_MethodDec2Operation_10_4_collectelementstobetranslated_greenBB(Match match,
			Operation feature) {
		match.getToBeTranslatedNodes().add(feature);
		return new Object[] { match, feature };
	}

	public static final Object[] pattern_MethodDec2Operation_10_5_collectcontextelements_blackBB(Match match,
			Operation feature) {
		return new Object[] { match, feature };
	}

	public static final void pattern_MethodDec2Operation_10_6_registerobjectstomatch_expressionBBB(
			MethodDec2Operation _this, Match match, Operation feature) {
		_this.registerObjectsToMatch_BWD(match, feature);

	}

	public static final boolean pattern_MethodDec2Operation_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDec2Operation_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject tmpFeature = _localVariable_0;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			return new Object[] { feature, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_11_1_performtransformation_blackBFBB(Operation feature,
			MethodDec2Operation _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { feature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_11_1_performtransformation_bindingAndBlackFFBB(
			MethodDec2Operation _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodDec2Operation_11_1_performtransformation_binding = pattern_MethodDec2Operation_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_MethodDec2Operation_11_1_performtransformation_binding != null) {
			Operation feature = (Operation) result_pattern_MethodDec2Operation_11_1_performtransformation_binding[0];

			Object[] result_pattern_MethodDec2Operation_11_1_performtransformation_black = pattern_MethodDec2Operation_11_1_performtransformation_blackBFBB(
					feature, _this, isApplicableMatch);
			if (result_pattern_MethodDec2Operation_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodDec2Operation_11_1_performtransformation_black[1];

				return new Object[] { feature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_11_1_performtransformation_greenFFBB(Operation feature,
			CSP csp) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		MMethodDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMMethodDefinition();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		b2e.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		return new Object[] { b2e, bodyDeclaration, feature, csp };
	}

	public static final Object[] pattern_MethodDec2Operation_11_2_collecttranslatedelements_blackBBB(
			ASTNode2Element b2e, MMethodDefinition bodyDeclaration, Operation feature) {
		return new Object[] { b2e, bodyDeclaration, feature };
	}

	public static final Object[] pattern_MethodDec2Operation_11_2_collecttranslatedelements_greenFBBB(
			ASTNode2Element b2e, MMethodDefinition bodyDeclaration, Operation feature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		ruleresult.getTranslatedElements().add(feature);
		return new Object[] { ruleresult, b2e, bodyDeclaration, feature };
	}

	public static final Object[] pattern_MethodDec2Operation_11_3_bookkeepingforedges_blackBBBB(
			PerformRuleResult ruleresult, EObject b2e, EObject bodyDeclaration, EObject feature) {
		if (!b2e.equals(bodyDeclaration)) {
			if (!b2e.equals(feature)) {
				if (!bodyDeclaration.equals(feature)) {
					return new Object[] { ruleresult, b2e, bodyDeclaration, feature };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_11_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject b2e, EObject bodyDeclaration, EObject feature) {
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodDec2Operation";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, b2e, bodyDeclaration, feature, b2e__bodyDeclaration____source,
				b2e__feature____target };
	}

	public static final void pattern_MethodDec2Operation_11_5_registerobjects_expressionBBBBB(MethodDec2Operation _this,
			PerformRuleResult ruleresult, EObject b2e, EObject bodyDeclaration, EObject feature) {
		_this.registerObjects_BWD(ruleresult, b2e, bodyDeclaration, feature);

	}

	public static final PerformRuleResult pattern_MethodDec2Operation_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_12_1_preparereturnvalue_bindingFB(
			MethodDec2Operation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodDec2Operation _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodDec2Operation _this) {
		Object[] result_pattern_MethodDec2Operation_12_1_preparereturnvalue_binding = pattern_MethodDec2Operation_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDec2Operation_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodDec2Operation_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDec2Operation_12_1_preparereturnvalue_black = pattern_MethodDec2Operation_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodDec2Operation_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodDec2Operation_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodDec2Operation";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodDec2Operation_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject tmpFeature = _localVariable_0;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			return new Object[] { feature, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDec2Operation_12_2_corematch_blackBB(Operation feature,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDec2Operation_12_3_findcontext_blackB(Operation feature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature });
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_12_3_findcontext_greenBF(Operation feature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(feature);
		return new Object[] { feature, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDec2Operation_12_4_solveCSP_bindingFBBB(MethodDec2Operation _this,
			IsApplicableMatch isApplicableMatch, Operation feature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDec2Operation_12_4_solveCSP_bindingAndBlackFBBB(
			MethodDec2Operation _this, IsApplicableMatch isApplicableMatch, Operation feature) {
		Object[] result_pattern_MethodDec2Operation_12_4_solveCSP_binding = pattern_MethodDec2Operation_12_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, feature);
		if (result_pattern_MethodDec2Operation_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDec2Operation_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodDec2Operation_12_4_solveCSP_black = pattern_MethodDec2Operation_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDec2Operation_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDec2Operation_12_5_checkCSP_expressionFBB(MethodDec2Operation _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDec2Operation_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodDec2Operation";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDec2Operation_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_20_1_preparereturnvalue_bindingFB(
			MethodDec2Operation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodDec2Operation _this) {
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

	public static final Object[] pattern_MethodDec2Operation_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodDec2Operation _this) {
		Object[] result_pattern_MethodDec2Operation_20_1_preparereturnvalue_binding = pattern_MethodDec2Operation_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDec2Operation_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDec2Operation_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDec2Operation_20_1_preparereturnvalue_black = pattern_MethodDec2Operation_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodDec2Operation_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDec2Operation_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodDec2Operation_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodDec2Operation_20_2_testcorematchandDECs_blackB(
			Operation feature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature });
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDec2Operation_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			MethodDec2Operation _this, Match match, Operation feature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDec2Operation_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodDec2Operation _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodDec2Operation_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_21_1_preparereturnvalue_bindingFB(
			MethodDec2Operation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodDec2Operation _this) {
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

	public static final Object[] pattern_MethodDec2Operation_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodDec2Operation _this) {
		Object[] result_pattern_MethodDec2Operation_21_1_preparereturnvalue_binding = pattern_MethodDec2Operation_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDec2Operation_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDec2Operation_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDec2Operation_21_1_preparereturnvalue_black = pattern_MethodDec2Operation_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodDec2Operation_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDec2Operation_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodDec2Operation_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodDec2Operation_21_2_testcorematchandDECs_black_nac_0B(
			MMethodDefinition bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_114825 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_114825 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDec2Operation_21_2_testcorematchandDECs_blackB(
			MMethodDefinition bodyDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pattern_MethodDec2Operation_21_2_testcorematchandDECs_black_nac_0B(bodyDeclaration) == null) {
			_result.add(new Object[] { bodyDeclaration });
		}
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDec2Operation_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			MethodDec2Operation _this, Match match, MMethodDefinition bodyDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDec2Operation_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodDec2Operation _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodDec2Operation_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_24_1_prepare_blackB(MethodDec2Operation _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodDec2Operation_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodDec2Operation_24_2_matchsrctrgcontext_bindingFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_1 = targetMatch.getObject("feature");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		if (tmpBodyDeclaration instanceof MMethodDefinition) {
			MMethodDefinition bodyDeclaration = (MMethodDefinition) tmpBodyDeclaration;
			if (tmpFeature instanceof Operation) {
				Operation feature = (Operation) tmpFeature;
				return new Object[] { bodyDeclaration, feature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_24_2_matchsrctrgcontext_blackBBBB(
			MMethodDefinition bodyDeclaration, Operation feature, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { bodyDeclaration, feature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_24_2_matchsrctrgcontext_bindingAndBlackFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodDec2Operation_24_2_matchsrctrgcontext_binding = pattern_MethodDec2Operation_24_2_matchsrctrgcontext_bindingFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_MethodDec2Operation_24_2_matchsrctrgcontext_binding != null) {
			MMethodDefinition bodyDeclaration = (MMethodDefinition) result_pattern_MethodDec2Operation_24_2_matchsrctrgcontext_binding[0];
			Operation feature = (Operation) result_pattern_MethodDec2Operation_24_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_MethodDec2Operation_24_2_matchsrctrgcontext_black = pattern_MethodDec2Operation_24_2_matchsrctrgcontext_blackBBBB(
					bodyDeclaration, feature, sourceMatch, targetMatch);
			if (result_pattern_MethodDec2Operation_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { bodyDeclaration, feature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_24_3_solvecsp_bindingFBBBBB(MethodDec2Operation _this,
			MMethodDefinition bodyDeclaration, Operation feature, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(bodyDeclaration, feature, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, bodyDeclaration, feature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDec2Operation_24_3_solvecsp_bindingAndBlackFBBBBB(
			MethodDec2Operation _this, MMethodDefinition bodyDeclaration, Operation feature, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_MethodDec2Operation_24_3_solvecsp_binding = pattern_MethodDec2Operation_24_3_solvecsp_bindingFBBBBB(
				_this, bodyDeclaration, feature, sourceMatch, targetMatch);
		if (result_pattern_MethodDec2Operation_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDec2Operation_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodDec2Operation_24_3_solvecsp_black = pattern_MethodDec2Operation_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodDec2Operation_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, bodyDeclaration, feature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDec2Operation_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDec2Operation_24_5_matchcorrcontext_blackBB(Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodDec2Operation";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodDec2Operation_24_6_createcorrespondence_blackBBB(
			MMethodDefinition bodyDeclaration, Operation feature, CCMatch ccMatch) {
		return new Object[] { bodyDeclaration, feature, ccMatch };
	}

	public static final Object[] pattern_MethodDec2Operation_24_6_createcorrespondence_greenFBBB(
			MMethodDefinition bodyDeclaration, Operation feature, CCMatch ccMatch) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		ccMatch.getCreateCorr().add(b2e);
		return new Object[] { b2e, bodyDeclaration, feature, ccMatch };
	}

	public static final Object[] pattern_MethodDec2Operation_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodDec2Operation_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodDec2Operation";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDec2Operation_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_27_1_matchtggpattern_black_nac_0B(
			MMethodDefinition bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_248407 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_248407 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_27_1_matchtggpattern_blackB(
			MMethodDefinition bodyDeclaration) {
		if (pattern_MethodDec2Operation_27_1_matchtggpattern_black_nac_0B(bodyDeclaration) == null) {
			return new Object[] { bodyDeclaration };
		}
		return null;
	}

	public static final boolean pattern_MethodDec2Operation_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDec2Operation_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_28_1_matchtggpattern_blackB(Operation feature) {
		return new Object[] { feature };
	}

	public static final boolean pattern_MethodDec2Operation_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDec2Operation_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_29_1_createresult_blackB(MethodDec2Operation _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodDec2Operation_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodDec2Operation_29_2_isapplicablecore_blackB(MethodDec2Operation _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodDec2Operation_29_3_solveCSP_bindingFBBB(MethodDec2Operation _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDec2Operation_29_3_solveCSP_bindingAndBlackFBBB(
			MethodDec2Operation _this, IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodDec2Operation_29_3_solveCSP_binding = pattern_MethodDec2Operation_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_MethodDec2Operation_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDec2Operation_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodDec2Operation_29_3_solveCSP_black = pattern_MethodDec2Operation_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDec2Operation_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDec2Operation_29_4_checkCSP_expressionFBB(MethodDec2Operation _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation_29_6_perform_blackB(ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_MethodDec2Operation_29_6_perform_greenFFFBB(
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		MMethodDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMMethodDefinition();
		Operation feature = UMLFactory.eINSTANCE.createOperation();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		Object _localVariable_1 = csp.getValue("feature", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(b2e);
		b2e.setSource(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		b2e.setTarget(feature);
		ruleResult.getTargetObjects().add(feature);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		String feature_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		feature.setName(feature_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { b2e, bodyDeclaration, feature, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MethodDec2Operation_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodDec2OperationImpl
