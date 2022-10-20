/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.Modifier;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.InterfaceDec2Interface;
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
 * An implementation of the model object '<em><b>Interface Dec2 Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InterfaceDec2InterfaceImpl extends AbstractRuleImpl implements InterfaceDec2Interface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDec2InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getInterfaceDec2Interface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, InterfaceDeclaration bodyDeclaration) {

		Object[] result1_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_0_1_initialbindings_blackBBB(this, match, bodyDeclaration);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}

		Object[] result2_bindingAndBlack = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_0_2_SolveCSP_bindingAndBlackFBBB(this, match, bodyDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_0_4_collectelementstobetranslated_blackBB(match, bodyDeclaration);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_0_4_collectelementstobetranslated_greenBB(match,
					bodyDeclaration);

			Object[] result5_black = InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_0_5_collectcontextelements_blackBB(match, bodyDeclaration);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			// 
			InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_0_6_registerobjectstomatch_expressionBBB(this,
					match, bodyDeclaration);
			return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_0_7_expressionF();
		} else {
			return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_1_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_1_1_performtransformation_greenBFFB(bodyDeclaration, csp);
		ASTNode2Element b2e = (ASTNode2Element) result1_green[1];
		Interface feature = (Interface) result1_green[2];

		Object[] result2_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_1_2_collecttranslatedelements_blackBBB(bodyDeclaration, b2e, feature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[b2e] = " + b2e + ", " + "[feature] = " + feature + ".");
		}
		Object[] result2_green = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_1_2_collecttranslatedelements_greenFBBB(bodyDeclaration, b2e, feature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_1_3_bookkeepingforedges_blackBBBB(ruleresult, bodyDeclaration, b2e,
						feature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[b2e] = " + b2e + ", " + "[feature] = "
					+ feature + ".");
		}
		InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_1_3_bookkeepingforedges_greenBBBBFF(ruleresult,
				bodyDeclaration, b2e, feature);
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_1_5_registerobjects_expressionBBBBB(this, ruleresult,
				bodyDeclaration, b2e, feature);
		return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result2_binding[0];
		for (Object[] result2_black : InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_2_2_corematch_blackBB(bodyDeclaration, match)) {
			// ForEach 
			for (Object[] result3_black : InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_2_3_findcontext_blackB(bodyDeclaration)) {
				Object[] result3_green = InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_2_3_findcontext_greenBF(bodyDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
								bodyDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InterfaceDec2InterfaceImpl
							.pattern_InterfaceDec2Interface_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, InterfaceDeclaration bodyDeclaration) {
		match.registerObject("bodyDeclaration", bodyDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, InterfaceDeclaration bodyDeclaration) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, InterfaceDeclaration bodyDeclaration) {// Create CSP
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
		NonParameterizedName nonParameterizedName = new NonParameterizedName();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(nonParameterizedName);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		nonParameterizedName.setRuleName("NoRuleName");
		nonParameterizedName.solve(var_feature_name);

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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject bodyDeclaration, EObject b2e,
			EObject feature) {
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
				.equals("java.InterfaceDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Interface feature) {

		Object[] result1_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_10_1_initialbindings_blackBBB(this, match, feature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ".");
		}

		Object[] result2_bindingAndBlack = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_10_2_SolveCSP_bindingAndBlackFBBB(this, match, feature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_10_4_collectelementstobetranslated_blackBB(match, feature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ".");
			}
			InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_10_4_collectelementstobetranslated_greenBB(match,
					feature);

			Object[] result5_black = InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_10_5_collectcontextelements_blackBB(match, feature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ".");
			}
			// 
			InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_10_6_registerobjectstomatch_expressionBBB(this,
					match, feature);
			return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_10_7_expressionF();
		} else {
			return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_11_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Interface feature = (Interface) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_11_1_performtransformation_greenFFBB(feature, csp);
		InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result1_green[0];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[1];

		Object[] result2_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_11_2_collecttranslatedelements_blackBBB(bodyDeclaration, b2e, feature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[b2e] = " + b2e + ", " + "[feature] = " + feature + ".");
		}
		Object[] result2_green = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_11_2_collecttranslatedelements_greenFBBB(bodyDeclaration, b2e, feature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_11_3_bookkeepingforedges_blackBBBB(ruleresult, bodyDeclaration, b2e,
						feature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[b2e] = " + b2e + ", " + "[feature] = "
					+ feature + ".");
		}
		InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_11_3_bookkeepingforedges_greenBBBBFF(ruleresult,
				bodyDeclaration, b2e, feature);
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_11_5_registerobjects_expressionBBBBB(this, ruleresult,
				bodyDeclaration, b2e, feature);
		return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Interface feature = (Interface) result2_binding[0];
		for (Object[] result2_black : InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_12_2_corematch_blackBB(feature, match)) {
			// ForEach 
			for (Object[] result3_black : InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_12_3_findcontext_blackB(feature)) {
				Object[] result3_green = InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_12_3_findcontext_greenBF(feature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_12_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
								feature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InterfaceDec2InterfaceImpl
							.pattern_InterfaceDec2Interface_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Interface feature) {
		match.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Interface feature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables

		// Create constraints
		NonParameterizedName nonParameterizedName = new NonParameterizedName();

		csp.getConstraints().add(nonParameterizedName);

		// Solve CSP
		nonParameterizedName.setRuleName("NoRuleName");
		nonParameterizedName.solve(var_feature_name);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Interface feature) {// Create CSP
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject bodyDeclaration, EObject b2e,
			EObject feature) {
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("feature").eClass()).equals("uml.Interface.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_Interface_1(Interface feature) {

		Object[] result1_bindingAndBlack = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_20_2_testcorematchandDECs_blackB(feature)) {
			Object[] result2_green = InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, feature)) {
				// 
				if (InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InterfaceDec2InterfaceImpl
							.pattern_InterfaceDec2Interface_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_InterfaceDeclaration_0(InterfaceDeclaration bodyDeclaration) {

		Object[] result1_bindingAndBlack = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_blackB(bodyDeclaration)) {
			Object[] result2_green = InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, bodyDeclaration)) {
				// 
				if (InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InterfaceDec2InterfaceImpl
							.pattern_InterfaceDec2Interface_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("InterfaceDec2Interface");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		NonParameterizedName nonParameterizedName1 = new NonParameterizedName();
		csp.getConstraints().add(nonParameterizedName1);

		eq0.setRuleName("InterfaceDec2Interface");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		nonParameterizedName1.setRuleName("InterfaceDec2Interface");
		nonParameterizedName1.solve(var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_feature_name.setBound(false);
			var_feature_name.setBound(false);
			eq0.solve(var_bodyDeclaration_name, var_feature_name);
			nonParameterizedName1.solve(var_feature_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("feature", "name", var_feature_name.getValue());
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
		ruleResult.setRule("InterfaceDec2Interface");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		NonParameterizedName nonParameterizedName0 = new NonParameterizedName();
		csp.getConstraints().add(nonParameterizedName0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		nonParameterizedName0.setRuleName("InterfaceDec2Interface");
		nonParameterizedName0.solve(var_feature_name);

		eq1.setRuleName("InterfaceDec2Interface");
		eq1.solve(var_bodyDeclaration_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_bodyDeclaration_name.setBound(false);
			nonParameterizedName0.solve(var_feature_name);
			eq1.solve(var_bodyDeclaration_name, var_feature_name);
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

		Object[] result1_black = InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result2_bindingAndBlack[0];
		Interface feature = (Interface) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_24_3_solvecsp_bindingAndBlackFBBBBB(this, bodyDeclaration, feature,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[feature] = " + feature + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_24_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_24_6_createcorrespondence_blackBBB(bodyDeclaration, feature,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[bodyDeclaration] = " + bodyDeclaration
									+ ", " + "[feature] = " + feature + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_24_6_createcorrespondence_greenBFBB(
						bodyDeclaration, feature, ccMatch);
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[1];

				Object[] result7_black = InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(InterfaceDeclaration bodyDeclaration, Interface feature, Match sourceMatch,
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
		NonParameterizedName nonParameterizedName = new NonParameterizedName();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(nonParameterizedName);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		nonParameterizedName.setRuleName("NoRuleName");
		nonParameterizedName.solve(var_feature_name);
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
	public boolean checkDEC_FWD(InterfaceDeclaration bodyDeclaration) {// 
		Object[] result1_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_27_1_matchtggpattern_blackB(bodyDeclaration);
		if (result1_black != null) {
			return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_27_2_expressionF();
		} else {
			return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Interface feature) {// 
		Object[] result1_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_28_1_matchtggpattern_blackB(feature);
		if (result1_black != null) {
			return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_28_2_expressionF();
		} else {
			return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_29_6_perform_greenFFFBB(ruleResult, csp);
				//nothing InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result6_green[0];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[1];
				//nothing Interface feature = (Interface) result6_green[2];

			} else {
			}

		} else {
		}
		return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_29_7_expressionFB(ruleResult);
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
		NonParameterizedName nonParameterizedName = new NonParameterizedName();
		Eq eq = new Eq();

		csp.getConstraints().add(nonParameterizedName);
		csp.getConstraints().add(eq);

		// Solve CSP
		nonParameterizedName.setRuleName("NoRuleName");
		nonParameterizedName.solve(var_feature_name);
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
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_FWD__MATCH_INTERFACEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERFACEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1));
			return null;
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERFACEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERFACEDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.INTERFACE_DEC2_INTERFACE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_BWD__MATCH_INTERFACE:
			return isAppropriate_BWD((Match) arguments.get(0), (Interface) arguments.get(1));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERFACE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Interface) arguments.get(1));
			return null;
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERFACE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Interface) arguments.get(1));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Interface) arguments.get(1));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.INTERFACE_DEC2_INTERFACE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_BWD_INTERFACE_1__INTERFACE:
			return isAppropriate_BWD_Interface_1((Interface) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_FWD_INTERFACE_DECLARATION_0__INTERFACEDECLARATION:
			return isAppropriate_FWD_InterfaceDeclaration_0((InterfaceDeclaration) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_SOLVE_CSP_CC__INTERFACEDECLARATION_INTERFACE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((InterfaceDeclaration) arguments.get(0), (Interface) arguments.get(1),
					(Match) arguments.get(2), (Match) arguments.get(3));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___CHECK_DEC_FWD__INTERFACEDECLARATION:
			return checkDEC_FWD((InterfaceDeclaration) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___CHECK_DEC_BWD__INTERFACE:
			return checkDEC_BWD((Interface) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InterfaceDec2Interface_0_1_initialbindings_blackBBB(
			InterfaceDec2Interface _this, Match match, InterfaceDeclaration bodyDeclaration) {
		return new Object[] { _this, match, bodyDeclaration };
	}

	public static final Object[] pattern_InterfaceDec2Interface_0_2_SolveCSP_bindingFBBB(InterfaceDec2Interface _this,
			Match match, InterfaceDeclaration bodyDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_0_2_SolveCSP_bindingAndBlackFBBB(
			InterfaceDec2Interface _this, Match match, InterfaceDeclaration bodyDeclaration) {
		Object[] result_pattern_InterfaceDec2Interface_0_2_SolveCSP_binding = pattern_InterfaceDec2Interface_0_2_SolveCSP_bindingFBBB(
				_this, match, bodyDeclaration);
		if (result_pattern_InterfaceDec2Interface_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceDec2Interface_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_0_2_SolveCSP_black = pattern_InterfaceDec2Interface_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InterfaceDec2Interface_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceDec2Interface_0_3_CheckCSP_expressionFBB(InterfaceDec2Interface _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_0_4_collectelementstobetranslated_blackBB(Match match,
			InterfaceDeclaration bodyDeclaration) {
		return new Object[] { match, bodyDeclaration };
	}

	public static final Object[] pattern_InterfaceDec2Interface_0_4_collectelementstobetranslated_greenBB(Match match,
			InterfaceDeclaration bodyDeclaration) {
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		return new Object[] { match, bodyDeclaration };
	}

	public static final Object[] pattern_InterfaceDec2Interface_0_5_collectcontextelements_blackBB(Match match,
			InterfaceDeclaration bodyDeclaration) {
		return new Object[] { match, bodyDeclaration };
	}

	public static final void pattern_InterfaceDec2Interface_0_6_registerobjectstomatch_expressionBBB(
			InterfaceDec2Interface _this, Match match, InterfaceDeclaration bodyDeclaration) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration);

	}

	public static final boolean pattern_InterfaceDec2Interface_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceDec2Interface_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("bodyDeclaration");
		EObject tmpBodyDeclaration = _localVariable_0;
		if (tmpBodyDeclaration instanceof InterfaceDeclaration) {
			InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) tmpBodyDeclaration;
			return new Object[] { bodyDeclaration, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_1_1_performtransformation_blackBFBB(
			InterfaceDeclaration bodyDeclaration, InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { bodyDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_1_1_performtransformation_bindingAndBlackFFBB(
			InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InterfaceDec2Interface_1_1_performtransformation_binding = pattern_InterfaceDec2Interface_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_InterfaceDec2Interface_1_1_performtransformation_binding != null) {
			InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result_pattern_InterfaceDec2Interface_1_1_performtransformation_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_1_1_performtransformation_black = pattern_InterfaceDec2Interface_1_1_performtransformation_blackBFBB(
					bodyDeclaration, _this, isApplicableMatch);
			if (result_pattern_InterfaceDec2Interface_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InterfaceDec2Interface_1_1_performtransformation_black[1];

				return new Object[] { bodyDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_1_1_performtransformation_greenBFFB(
			InterfaceDeclaration bodyDeclaration, CSP csp) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Interface feature = UMLFactory.eINSTANCE.createInterface();
		Object _localVariable_0 = csp.getValue("feature", "name");
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		String feature_name_prime = (String) _localVariable_0;
		feature.setName(feature_name_prime);
		return new Object[] { bodyDeclaration, b2e, feature, csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_1_2_collecttranslatedelements_blackBBB(
			InterfaceDeclaration bodyDeclaration, ASTNode2Element b2e, Interface feature) {
		return new Object[] { bodyDeclaration, b2e, feature };
	}

	public static final Object[] pattern_InterfaceDec2Interface_1_2_collecttranslatedelements_greenFBBB(
			InterfaceDeclaration bodyDeclaration, ASTNode2Element b2e, Interface feature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedElements().add(feature);
		return new Object[] { ruleresult, bodyDeclaration, b2e, feature };
	}

	public static final Object[] pattern_InterfaceDec2Interface_1_3_bookkeepingforedges_blackBBBB(
			PerformRuleResult ruleresult, EObject bodyDeclaration, EObject b2e, EObject feature) {
		if (!bodyDeclaration.equals(feature)) {
			if (!b2e.equals(bodyDeclaration)) {
				if (!b2e.equals(feature)) {
					return new Object[] { ruleresult, bodyDeclaration, b2e, feature };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_1_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject bodyDeclaration, EObject b2e, EObject feature) {
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InterfaceDec2Interface";
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
		return new Object[] { ruleresult, bodyDeclaration, b2e, feature, b2e__bodyDeclaration____source,
				b2e__feature____target };
	}

	public static final void pattern_InterfaceDec2Interface_1_5_registerobjects_expressionBBBBB(
			InterfaceDec2Interface _this, PerformRuleResult ruleresult, EObject bodyDeclaration, EObject b2e,
			EObject feature) {
		_this.registerObjects_FWD(ruleresult, bodyDeclaration, b2e, feature);

	}

	public static final PerformRuleResult pattern_InterfaceDec2Interface_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_2_1_preparereturnvalue_bindingFB(
			InterfaceDec2Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_2_1_preparereturnvalue_blackFBB(EClass eClass,
			InterfaceDec2Interface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_2_1_preparereturnvalue_bindingAndBlackFFB(
			InterfaceDec2Interface _this) {
		Object[] result_pattern_InterfaceDec2Interface_2_1_preparereturnvalue_binding = pattern_InterfaceDec2Interface_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceDec2Interface_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InterfaceDec2Interface_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_2_1_preparereturnvalue_black = pattern_InterfaceDec2Interface_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InterfaceDec2Interface_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InterfaceDec2Interface_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InterfaceDec2Interface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InterfaceDec2Interface_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject tmpBodyDeclaration = _localVariable_0;
		if (tmpBodyDeclaration instanceof InterfaceDeclaration) {
			InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) tmpBodyDeclaration;
			return new Object[] { bodyDeclaration, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceDec2Interface_2_2_corematch_blackBB(
			InterfaceDeclaration bodyDeclaration, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { bodyDeclaration, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceDec2Interface_2_3_findcontext_blackB(
			InterfaceDeclaration bodyDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { bodyDeclaration });
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_2_3_findcontext_greenBF(
			InterfaceDeclaration bodyDeclaration) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		return new Object[] { bodyDeclaration, isApplicableMatch };
	}

	public static final Object[] pattern_InterfaceDec2Interface_2_4_solveCSP_bindingFBBB(InterfaceDec2Interface _this,
			IsApplicableMatch isApplicableMatch, InterfaceDeclaration bodyDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_2_4_solveCSP_bindingAndBlackFBBB(
			InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch, InterfaceDeclaration bodyDeclaration) {
		Object[] result_pattern_InterfaceDec2Interface_2_4_solveCSP_binding = pattern_InterfaceDec2Interface_2_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, bodyDeclaration);
		if (result_pattern_InterfaceDec2Interface_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceDec2Interface_2_4_solveCSP_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_2_4_solveCSP_black = pattern_InterfaceDec2Interface_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceDec2Interface_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceDec2Interface_2_5_checkCSP_expressionFBB(InterfaceDec2Interface _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InterfaceDec2Interface_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InterfaceDec2Interface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InterfaceDec2Interface_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_10_1_initialbindings_blackBBB(
			InterfaceDec2Interface _this, Match match, Interface feature) {
		return new Object[] { _this, match, feature };
	}

	public static final Object[] pattern_InterfaceDec2Interface_10_2_SolveCSP_bindingFBBB(InterfaceDec2Interface _this,
			Match match, Interface feature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_10_2_SolveCSP_bindingAndBlackFBBB(
			InterfaceDec2Interface _this, Match match, Interface feature) {
		Object[] result_pattern_InterfaceDec2Interface_10_2_SolveCSP_binding = pattern_InterfaceDec2Interface_10_2_SolveCSP_bindingFBBB(
				_this, match, feature);
		if (result_pattern_InterfaceDec2Interface_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceDec2Interface_10_2_SolveCSP_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_10_2_SolveCSP_black = pattern_InterfaceDec2Interface_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InterfaceDec2Interface_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceDec2Interface_10_3_CheckCSP_expressionFBB(InterfaceDec2Interface _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_10_4_collectelementstobetranslated_blackBB(Match match,
			Interface feature) {
		return new Object[] { match, feature };
	}

	public static final Object[] pattern_InterfaceDec2Interface_10_4_collectelementstobetranslated_greenBB(Match match,
			Interface feature) {
		match.getToBeTranslatedNodes().add(feature);
		return new Object[] { match, feature };
	}

	public static final Object[] pattern_InterfaceDec2Interface_10_5_collectcontextelements_blackBB(Match match,
			Interface feature) {
		return new Object[] { match, feature };
	}

	public static final void pattern_InterfaceDec2Interface_10_6_registerobjectstomatch_expressionBBB(
			InterfaceDec2Interface _this, Match match, Interface feature) {
		_this.registerObjectsToMatch_BWD(match, feature);

	}

	public static final boolean pattern_InterfaceDec2Interface_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceDec2Interface_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject tmpFeature = _localVariable_0;
		if (tmpFeature instanceof Interface) {
			Interface feature = (Interface) tmpFeature;
			return new Object[] { feature, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_11_1_performtransformation_blackBFBB(Interface feature,
			InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { feature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_11_1_performtransformation_bindingAndBlackFFBB(
			InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InterfaceDec2Interface_11_1_performtransformation_binding = pattern_InterfaceDec2Interface_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_InterfaceDec2Interface_11_1_performtransformation_binding != null) {
			Interface feature = (Interface) result_pattern_InterfaceDec2Interface_11_1_performtransformation_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_11_1_performtransformation_black = pattern_InterfaceDec2Interface_11_1_performtransformation_blackBFBB(
					feature, _this, isApplicableMatch);
			if (result_pattern_InterfaceDec2Interface_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InterfaceDec2Interface_11_1_performtransformation_black[1];

				return new Object[] { feature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_11_1_performtransformation_greenFFBB(Interface feature,
			CSP csp) {
		InterfaceDeclaration bodyDeclaration = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		return new Object[] { bodyDeclaration, b2e, feature, csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_11_2_collecttranslatedelements_blackBBB(
			InterfaceDeclaration bodyDeclaration, ASTNode2Element b2e, Interface feature) {
		return new Object[] { bodyDeclaration, b2e, feature };
	}

	public static final Object[] pattern_InterfaceDec2Interface_11_2_collecttranslatedelements_greenFBBB(
			InterfaceDeclaration bodyDeclaration, ASTNode2Element b2e, Interface feature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(bodyDeclaration);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getTranslatedElements().add(feature);
		return new Object[] { ruleresult, bodyDeclaration, b2e, feature };
	}

	public static final Object[] pattern_InterfaceDec2Interface_11_3_bookkeepingforedges_blackBBBB(
			PerformRuleResult ruleresult, EObject bodyDeclaration, EObject b2e, EObject feature) {
		if (!bodyDeclaration.equals(feature)) {
			if (!b2e.equals(bodyDeclaration)) {
				if (!b2e.equals(feature)) {
					return new Object[] { ruleresult, bodyDeclaration, b2e, feature };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_11_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject bodyDeclaration, EObject b2e, EObject feature) {
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InterfaceDec2Interface";
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
		return new Object[] { ruleresult, bodyDeclaration, b2e, feature, b2e__bodyDeclaration____source,
				b2e__feature____target };
	}

	public static final void pattern_InterfaceDec2Interface_11_5_registerobjects_expressionBBBBB(
			InterfaceDec2Interface _this, PerformRuleResult ruleresult, EObject bodyDeclaration, EObject b2e,
			EObject feature) {
		_this.registerObjects_BWD(ruleresult, bodyDeclaration, b2e, feature);

	}

	public static final PerformRuleResult pattern_InterfaceDec2Interface_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_12_1_preparereturnvalue_bindingFB(
			InterfaceDec2Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_12_1_preparereturnvalue_blackFBB(EClass eClass,
			InterfaceDec2Interface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_12_1_preparereturnvalue_bindingAndBlackFFB(
			InterfaceDec2Interface _this) {
		Object[] result_pattern_InterfaceDec2Interface_12_1_preparereturnvalue_binding = pattern_InterfaceDec2Interface_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceDec2Interface_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InterfaceDec2Interface_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_12_1_preparereturnvalue_black = pattern_InterfaceDec2Interface_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InterfaceDec2Interface_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InterfaceDec2Interface_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InterfaceDec2Interface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InterfaceDec2Interface_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject tmpFeature = _localVariable_0;
		if (tmpFeature instanceof Interface) {
			Interface feature = (Interface) tmpFeature;
			return new Object[] { feature, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceDec2Interface_12_2_corematch_blackBB(Interface feature,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceDec2Interface_12_3_findcontext_blackB(Interface feature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature });
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_12_3_findcontext_greenBF(Interface feature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(feature);
		return new Object[] { feature, isApplicableMatch };
	}

	public static final Object[] pattern_InterfaceDec2Interface_12_4_solveCSP_bindingFBBB(InterfaceDec2Interface _this,
			IsApplicableMatch isApplicableMatch, Interface feature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_12_4_solveCSP_bindingAndBlackFBBB(
			InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch, Interface feature) {
		Object[] result_pattern_InterfaceDec2Interface_12_4_solveCSP_binding = pattern_InterfaceDec2Interface_12_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, feature);
		if (result_pattern_InterfaceDec2Interface_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceDec2Interface_12_4_solveCSP_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_12_4_solveCSP_black = pattern_InterfaceDec2Interface_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceDec2Interface_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceDec2Interface_12_5_checkCSP_expressionFBB(InterfaceDec2Interface _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InterfaceDec2Interface_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InterfaceDec2Interface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InterfaceDec2Interface_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_20_1_preparereturnvalue_bindingFB(
			InterfaceDec2Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			InterfaceDec2Interface _this) {
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

	public static final Object[] pattern_InterfaceDec2Interface_20_1_preparereturnvalue_bindingAndBlackFFBF(
			InterfaceDec2Interface _this) {
		Object[] result_pattern_InterfaceDec2Interface_20_1_preparereturnvalue_binding = pattern_InterfaceDec2Interface_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceDec2Interface_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InterfaceDec2Interface_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_20_1_preparereturnvalue_black = pattern_InterfaceDec2Interface_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InterfaceDec2Interface_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InterfaceDec2Interface_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InterfaceDec2Interface_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_InterfaceDec2Interface_20_2_testcorematchandDECs_blackB(
			Interface feature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature });
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InterfaceDec2Interface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			InterfaceDec2Interface _this, Match match, Interface feature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InterfaceDec2Interface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InterfaceDec2Interface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InterfaceDec2Interface_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_21_1_preparereturnvalue_bindingFB(
			InterfaceDec2Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			InterfaceDec2Interface _this) {
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

	public static final Object[] pattern_InterfaceDec2Interface_21_1_preparereturnvalue_bindingAndBlackFFBF(
			InterfaceDec2Interface _this) {
		Object[] result_pattern_InterfaceDec2Interface_21_1_preparereturnvalue_binding = pattern_InterfaceDec2Interface_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceDec2Interface_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InterfaceDec2Interface_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_21_1_preparereturnvalue_black = pattern_InterfaceDec2Interface_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InterfaceDec2Interface_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InterfaceDec2Interface_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InterfaceDec2Interface_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_black_nac_0B(
			InterfaceDeclaration bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_284571 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_284571 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_blackB(
			InterfaceDeclaration bodyDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_black_nac_0B(bodyDeclaration) == null) {
			_result.add(new Object[] { bodyDeclaration });
		}
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InterfaceDec2Interface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			InterfaceDec2Interface _this, Match match, InterfaceDeclaration bodyDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InterfaceDec2Interface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InterfaceDec2Interface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InterfaceDec2Interface_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_1_prepare_blackB(InterfaceDec2Interface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_bindingFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_1 = targetMatch.getObject("feature");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		if (tmpBodyDeclaration instanceof InterfaceDeclaration) {
			InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) tmpBodyDeclaration;
			if (tmpFeature instanceof Interface) {
				Interface feature = (Interface) tmpFeature;
				return new Object[] { bodyDeclaration, feature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_blackBBBB(
			InterfaceDeclaration bodyDeclaration, Interface feature, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { bodyDeclaration, feature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_bindingAndBlackFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_binding = pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_bindingFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_binding != null) {
			InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result_pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_binding[0];
			Interface feature = (Interface) result_pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_black = pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_blackBBBB(
					bodyDeclaration, feature, sourceMatch, targetMatch);
			if (result_pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { bodyDeclaration, feature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_3_solvecsp_bindingFBBBBB(
			InterfaceDec2Interface _this, InterfaceDeclaration bodyDeclaration, Interface feature, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(bodyDeclaration, feature, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, bodyDeclaration, feature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_3_solvecsp_bindingAndBlackFBBBBB(
			InterfaceDec2Interface _this, InterfaceDeclaration bodyDeclaration, Interface feature, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_InterfaceDec2Interface_24_3_solvecsp_binding = pattern_InterfaceDec2Interface_24_3_solvecsp_bindingFBBBBB(
				_this, bodyDeclaration, feature, sourceMatch, targetMatch);
		if (result_pattern_InterfaceDec2Interface_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceDec2Interface_24_3_solvecsp_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_24_3_solvecsp_black = pattern_InterfaceDec2Interface_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_InterfaceDec2Interface_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, bodyDeclaration, feature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceDec2Interface_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceDec2Interface_24_5_matchcorrcontext_blackBB(
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "InterfaceDec2Interface";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_6_createcorrespondence_blackBBB(
			InterfaceDeclaration bodyDeclaration, Interface feature, CCMatch ccMatch) {
		return new Object[] { bodyDeclaration, feature, ccMatch };
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_6_createcorrespondence_greenBFBB(
			InterfaceDeclaration bodyDeclaration, Interface feature, CCMatch ccMatch) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		ccMatch.getCreateCorr().add(b2e);
		return new Object[] { bodyDeclaration, b2e, feature, ccMatch };
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "InterfaceDec2Interface";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_InterfaceDec2Interface_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_27_1_matchtggpattern_black_nac_0B(
			InterfaceDeclaration bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_346951 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_346951 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_27_1_matchtggpattern_blackB(
			InterfaceDeclaration bodyDeclaration) {
		if (pattern_InterfaceDec2Interface_27_1_matchtggpattern_black_nac_0B(bodyDeclaration) == null) {
			return new Object[] { bodyDeclaration };
		}
		return null;
	}

	public static final boolean pattern_InterfaceDec2Interface_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceDec2Interface_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_28_1_matchtggpattern_blackB(Interface feature) {
		return new Object[] { feature };
	}

	public static final boolean pattern_InterfaceDec2Interface_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceDec2Interface_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_29_1_createresult_blackB(InterfaceDec2Interface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InterfaceDec2Interface_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_InterfaceDec2Interface_29_2_isapplicablecore_blackB(
			InterfaceDec2Interface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InterfaceDec2Interface_29_3_solveCSP_bindingFBBB(InterfaceDec2Interface _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_29_3_solveCSP_bindingAndBlackFBBB(
			InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InterfaceDec2Interface_29_3_solveCSP_binding = pattern_InterfaceDec2Interface_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_InterfaceDec2Interface_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceDec2Interface_29_3_solveCSP_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_29_3_solveCSP_black = pattern_InterfaceDec2Interface_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceDec2Interface_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceDec2Interface_29_4_checkCSP_expressionFBB(InterfaceDec2Interface _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_29_6_perform_blackB(
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_InterfaceDec2Interface_29_6_perform_greenFFFBB(
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		InterfaceDeclaration bodyDeclaration = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Interface feature = UMLFactory.eINSTANCE.createInterface();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		Object _localVariable_1 = csp.getValue("feature", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		ruleResult.getCorrObjects().add(b2e);
		b2e.setTarget(feature);
		ruleResult.getTargetObjects().add(feature);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		String feature_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		feature.setName(feature_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { bodyDeclaration, b2e, feature, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_InterfaceDec2Interface_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InterfaceDec2InterfaceImpl
