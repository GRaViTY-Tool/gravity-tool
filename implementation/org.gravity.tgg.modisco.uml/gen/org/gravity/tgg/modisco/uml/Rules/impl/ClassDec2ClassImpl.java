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

import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MClass;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.ClassDec2Class;
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
 * An implementation of the model object '<em><b>Class Dec2 Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClassDec2ClassImpl extends AbstractRuleImpl implements ClassDec2Class {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDec2ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getClassDec2Class();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MClass bodyDeclaration) {

		Object[] result1_black = ClassDec2ClassImpl.pattern_ClassDec2Class_0_1_initialbindings_blackBBB(this, match,
				bodyDeclaration);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}

		Object[] result2_bindingAndBlack = ClassDec2ClassImpl
				.pattern_ClassDec2Class_0_2_SolveCSP_bindingAndBlackFBBB(this, match, bodyDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassDec2ClassImpl.pattern_ClassDec2Class_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassDec2ClassImpl
					.pattern_ClassDec2Class_0_4_collectelementstobetranslated_blackBB(match, bodyDeclaration);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			ClassDec2ClassImpl.pattern_ClassDec2Class_0_4_collectelementstobetranslated_greenBB(match, bodyDeclaration);

			Object[] result5_black = ClassDec2ClassImpl.pattern_ClassDec2Class_0_5_collectcontextelements_blackBB(match,
					bodyDeclaration);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			// 
			ClassDec2ClassImpl.pattern_ClassDec2Class_0_6_registerobjectstomatch_expressionBBB(this, match,
					bodyDeclaration);
			return ClassDec2ClassImpl.pattern_ClassDec2Class_0_7_expressionF();
		} else {
			return ClassDec2ClassImpl.pattern_ClassDec2Class_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassDec2ClassImpl
				.pattern_ClassDec2Class_1_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MClass bodyDeclaration = (MClass) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = ClassDec2ClassImpl
				.pattern_ClassDec2Class_1_1_performtransformation_greenFBFB(bodyDeclaration, csp);
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result1_green[0];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[2];

		Object[] result2_black = ClassDec2ClassImpl
				.pattern_ClassDec2Class_1_2_collecttranslatedelements_blackBBB(feature, bodyDeclaration, b2e);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[b2e] = " + b2e + ".");
		}
		Object[] result2_green = ClassDec2ClassImpl
				.pattern_ClassDec2Class_1_2_collecttranslatedelements_greenFBBB(feature, bodyDeclaration, b2e);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassDec2ClassImpl.pattern_ClassDec2Class_1_3_bookkeepingforedges_blackBBBB(ruleresult,
				feature, bodyDeclaration, b2e);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[b2e] = " + b2e + ".");
		}
		ClassDec2ClassImpl.pattern_ClassDec2Class_1_3_bookkeepingforedges_greenBBBBFF(ruleresult, feature,
				bodyDeclaration, b2e);
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		ClassDec2ClassImpl.pattern_ClassDec2Class_1_5_registerobjects_expressionBBBBB(this, ruleresult, feature,
				bodyDeclaration, b2e);
		return ClassDec2ClassImpl.pattern_ClassDec2Class_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ClassDec2ClassImpl
				.pattern_ClassDec2Class_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassDec2ClassImpl
				.pattern_ClassDec2Class_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassDec2ClassImpl.pattern_ClassDec2Class_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MClass bodyDeclaration = (MClass) result2_binding[0];
		for (Object[] result2_black : ClassDec2ClassImpl.pattern_ClassDec2Class_2_2_corematch_blackBB(bodyDeclaration,
				match)) {
			// ForEach 
			for (Object[] result3_black : ClassDec2ClassImpl
					.pattern_ClassDec2Class_2_3_findcontext_blackB(bodyDeclaration)) {
				Object[] result3_green = ClassDec2ClassImpl
						.pattern_ClassDec2Class_2_3_findcontext_greenBF(bodyDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = ClassDec2ClassImpl
						.pattern_ClassDec2Class_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
								bodyDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassDec2ClassImpl.pattern_ClassDec2Class_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ClassDec2ClassImpl
							.pattern_ClassDec2Class_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassDec2ClassImpl.pattern_ClassDec2Class_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ClassDec2ClassImpl.pattern_ClassDec2Class_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MClass bodyDeclaration) {
		match.registerObject("bodyDeclaration", bodyDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MClass bodyDeclaration) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MClass bodyDeclaration) {// Create CSP
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration,
			EObject b2e) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("b2e", b2e);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
				.equals("modisco.MClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Class feature) {

		Object[] result1_black = ClassDec2ClassImpl.pattern_ClassDec2Class_10_1_initialbindings_blackBBB(this, match,
				feature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ".");
		}

		Object[] result2_bindingAndBlack = ClassDec2ClassImpl
				.pattern_ClassDec2Class_10_2_SolveCSP_bindingAndBlackFBBB(this, match, feature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassDec2ClassImpl.pattern_ClassDec2Class_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassDec2ClassImpl
					.pattern_ClassDec2Class_10_4_collectelementstobetranslated_blackBB(match, feature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ".");
			}
			ClassDec2ClassImpl.pattern_ClassDec2Class_10_4_collectelementstobetranslated_greenBB(match, feature);

			Object[] result5_black = ClassDec2ClassImpl
					.pattern_ClassDec2Class_10_5_collectcontextelements_blackBB(match, feature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ".");
			}
			// 
			ClassDec2ClassImpl.pattern_ClassDec2Class_10_6_registerobjectstomatch_expressionBBB(this, match, feature);
			return ClassDec2ClassImpl.pattern_ClassDec2Class_10_7_expressionF();
		} else {
			return ClassDec2ClassImpl.pattern_ClassDec2Class_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassDec2ClassImpl
				.pattern_ClassDec2Class_11_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = ClassDec2ClassImpl.pattern_ClassDec2Class_11_1_performtransformation_greenBFFB(feature,
				csp);
		MClass bodyDeclaration = (MClass) result1_green[1];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[2];

		Object[] result2_black = ClassDec2ClassImpl
				.pattern_ClassDec2Class_11_2_collecttranslatedelements_blackBBB(feature, bodyDeclaration, b2e);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[b2e] = " + b2e + ".");
		}
		Object[] result2_green = ClassDec2ClassImpl
				.pattern_ClassDec2Class_11_2_collecttranslatedelements_greenFBBB(feature, bodyDeclaration, b2e);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassDec2ClassImpl
				.pattern_ClassDec2Class_11_3_bookkeepingforedges_blackBBBB(ruleresult, feature, bodyDeclaration, b2e);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[b2e] = " + b2e + ".");
		}
		ClassDec2ClassImpl.pattern_ClassDec2Class_11_3_bookkeepingforedges_greenBBBBFF(ruleresult, feature,
				bodyDeclaration, b2e);
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		ClassDec2ClassImpl.pattern_ClassDec2Class_11_5_registerobjects_expressionBBBBB(this, ruleresult, feature,
				bodyDeclaration, b2e);
		return ClassDec2ClassImpl.pattern_ClassDec2Class_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ClassDec2ClassImpl
				.pattern_ClassDec2Class_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassDec2ClassImpl
				.pattern_ClassDec2Class_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassDec2ClassImpl.pattern_ClassDec2Class_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_binding[0];
		for (Object[] result2_black : ClassDec2ClassImpl.pattern_ClassDec2Class_12_2_corematch_blackBB(feature,
				match)) {
			// ForEach 
			for (Object[] result3_black : ClassDec2ClassImpl.pattern_ClassDec2Class_12_3_findcontext_blackB(feature)) {
				Object[] result3_green = ClassDec2ClassImpl.pattern_ClassDec2Class_12_3_findcontext_greenBF(feature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = ClassDec2ClassImpl
						.pattern_ClassDec2Class_12_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, feature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassDec2ClassImpl.pattern_ClassDec2Class_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ClassDec2ClassImpl
							.pattern_ClassDec2Class_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassDec2ClassImpl.pattern_ClassDec2Class_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ClassDec2ClassImpl.pattern_ClassDec2Class_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Class feature) {
		match.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Class feature) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class feature) {// Create CSP
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration,
			EObject b2e) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("b2e", b2e);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("feature").eClass()).equals("uml.Class.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_Class_1(org.eclipse.uml2.uml.Class feature) {

		Object[] result1_bindingAndBlack = ClassDec2ClassImpl
				.pattern_ClassDec2Class_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassDec2ClassImpl.pattern_ClassDec2Class_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassDec2ClassImpl
				.pattern_ClassDec2Class_20_2_testcorematchandDECs_blackB(feature)) {
			Object[] result2_green = ClassDec2ClassImpl
					.pattern_ClassDec2Class_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassDec2ClassImpl.pattern_ClassDec2Class_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
					this, match, feature)) {
				// 
				if (ClassDec2ClassImpl
						.pattern_ClassDec2Class_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = ClassDec2ClassImpl
							.pattern_ClassDec2Class_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassDec2ClassImpl.pattern_ClassDec2Class_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassDec2ClassImpl.pattern_ClassDec2Class_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_MClass_0(MClass bodyDeclaration) {

		Object[] result1_bindingAndBlack = ClassDec2ClassImpl
				.pattern_ClassDec2Class_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassDec2ClassImpl.pattern_ClassDec2Class_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassDec2ClassImpl
				.pattern_ClassDec2Class_21_2_testcorematchandDECs_blackB(bodyDeclaration)) {
			Object[] result2_green = ClassDec2ClassImpl
					.pattern_ClassDec2Class_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassDec2ClassImpl.pattern_ClassDec2Class_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
					this, match, bodyDeclaration)) {
				// 
				if (ClassDec2ClassImpl
						.pattern_ClassDec2Class_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = ClassDec2ClassImpl
							.pattern_ClassDec2Class_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassDec2ClassImpl.pattern_ClassDec2Class_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassDec2ClassImpl.pattern_ClassDec2Class_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ClassDec2Class");
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

		eq0.setRuleName("ClassDec2Class");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		nonParameterizedName1.setRuleName("ClassDec2Class");
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
		ruleResult.setRule("ClassDec2Class");
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

		nonParameterizedName0.setRuleName("ClassDec2Class");
		nonParameterizedName0.solve(var_feature_name);

		eq1.setRuleName("ClassDec2Class");
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

		Object[] result1_black = ClassDec2ClassImpl.pattern_ClassDec2Class_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassDec2ClassImpl.pattern_ClassDec2Class_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ClassDec2ClassImpl
				.pattern_ClassDec2Class_24_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[0];
		MClass bodyDeclaration = (MClass) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = ClassDec2ClassImpl
				.pattern_ClassDec2Class_24_3_solvecsp_bindingAndBlackFBBBBB(this, feature, bodyDeclaration, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ClassDec2ClassImpl.pattern_ClassDec2Class_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ClassDec2ClassImpl
					.pattern_ClassDec2Class_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = ClassDec2ClassImpl
						.pattern_ClassDec2Class_24_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = ClassDec2ClassImpl
						.pattern_ClassDec2Class_24_6_createcorrespondence_blackBBB(feature, bodyDeclaration, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ClassDec2ClassImpl.pattern_ClassDec2Class_24_6_createcorrespondence_greenBBFB(feature, bodyDeclaration,
						ccMatch);
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[2];

				Object[] result7_black = ClassDec2ClassImpl
						.pattern_ClassDec2Class_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ClassDec2ClassImpl.pattern_ClassDec2Class_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return ClassDec2ClassImpl.pattern_ClassDec2Class_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Class feature, MClass bodyDeclaration, Match sourceMatch,
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
	public boolean checkDEC_FWD(MClass bodyDeclaration) {// 
		Object[] result1_black = ClassDec2ClassImpl.pattern_ClassDec2Class_27_1_matchtggpattern_blackB(bodyDeclaration);
		if (result1_black != null) {
			return ClassDec2ClassImpl.pattern_ClassDec2Class_27_2_expressionF();
		} else {
			return ClassDec2ClassImpl.pattern_ClassDec2Class_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Class feature) {// 
		Object[] result1_black = ClassDec2ClassImpl.pattern_ClassDec2Class_28_1_matchtggpattern_blackB(feature);
		if (result1_black != null) {
			return ClassDec2ClassImpl.pattern_ClassDec2Class_28_2_expressionF();
		} else {
			return ClassDec2ClassImpl.pattern_ClassDec2Class_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = ClassDec2ClassImpl.pattern_ClassDec2Class_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassDec2ClassImpl.pattern_ClassDec2Class_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = ClassDec2ClassImpl.pattern_ClassDec2Class_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = ClassDec2ClassImpl
					.pattern_ClassDec2Class_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ClassDec2ClassImpl.pattern_ClassDec2Class_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = ClassDec2ClassImpl.pattern_ClassDec2Class_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				ClassDec2ClassImpl.pattern_ClassDec2Class_29_6_perform_greenFFFBB(ruleResult, csp);
				//nothing org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result6_green[0];
				//nothing MClass bodyDeclaration = (MClass) result6_green[1];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[2];

			} else {
			}

		} else {
		}
		return ClassDec2ClassImpl.pattern_ClassDec2Class_29_7_expressionFB(ruleResult);
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
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPROPRIATE_FWD__MATCH_MCLASS:
			return isAppropriate_FWD((Match) arguments.get(0), (MClass) arguments.get(1));
		case RulesPackage.CLASS_DEC2_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MCLASS:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MClass) arguments.get(1));
			return null;
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MCLASS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MClass) arguments.get(1));
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MCLASS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MClass) arguments.get(1));
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.CLASS_DEC2_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPROPRIATE_BWD__MATCH_CLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1));
		case RulesPackage.CLASS_DEC2_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1));
			return null;
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1));
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1));
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.CLASS_DEC2_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPROPRIATE_BWD_CLASS_1__CLASS:
			return isAppropriate_BWD_Class_1((org.eclipse.uml2.uml.Class) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPROPRIATE_FWD_MCLASS_0__MCLASS:
			return isAppropriate_FWD_MClass_0((MClass) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__CLASS_MCLASS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Class) arguments.get(0), (MClass) arguments.get(1),
					(Match) arguments.get(2), (Match) arguments.get(3));
		case RulesPackage.CLASS_DEC2_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___CHECK_DEC_FWD__MCLASS:
			return checkDEC_FWD((MClass) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___CHECK_DEC_BWD__CLASS:
			return checkDEC_BWD((org.eclipse.uml2.uml.Class) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.CLASS_DEC2_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.CLASS_DEC2_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ClassDec2Class_0_1_initialbindings_blackBBB(ClassDec2Class _this, Match match,
			MClass bodyDeclaration) {
		return new Object[] { _this, match, bodyDeclaration };
	}

	public static final Object[] pattern_ClassDec2Class_0_2_SolveCSP_bindingFBBB(ClassDec2Class _this, Match match,
			MClass bodyDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassDec2Class_0_2_SolveCSP_bindingAndBlackFBBB(ClassDec2Class _this,
			Match match, MClass bodyDeclaration) {
		Object[] result_pattern_ClassDec2Class_0_2_SolveCSP_binding = pattern_ClassDec2Class_0_2_SolveCSP_bindingFBBB(
				_this, match, bodyDeclaration);
		if (result_pattern_ClassDec2Class_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassDec2Class_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassDec2Class_0_2_SolveCSP_black = pattern_ClassDec2Class_0_2_SolveCSP_blackB(csp);
			if (result_pattern_ClassDec2Class_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassDec2Class_0_3_CheckCSP_expressionFBB(ClassDec2Class _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_0_4_collectelementstobetranslated_blackBB(Match match,
			MClass bodyDeclaration) {
		return new Object[] { match, bodyDeclaration };
	}

	public static final Object[] pattern_ClassDec2Class_0_4_collectelementstobetranslated_greenBB(Match match,
			MClass bodyDeclaration) {
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		return new Object[] { match, bodyDeclaration };
	}

	public static final Object[] pattern_ClassDec2Class_0_5_collectcontextelements_blackBB(Match match,
			MClass bodyDeclaration) {
		return new Object[] { match, bodyDeclaration };
	}

	public static final void pattern_ClassDec2Class_0_6_registerobjectstomatch_expressionBBB(ClassDec2Class _this,
			Match match, MClass bodyDeclaration) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration);

	}

	public static final boolean pattern_ClassDec2Class_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassDec2Class_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("bodyDeclaration");
		EObject tmpBodyDeclaration = _localVariable_0;
		if (tmpBodyDeclaration instanceof MClass) {
			MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
			return new Object[] { bodyDeclaration, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_1_1_performtransformation_blackBFBB(MClass bodyDeclaration,
			ClassDec2Class _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { bodyDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_1_1_performtransformation_bindingAndBlackFFBB(
			ClassDec2Class _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassDec2Class_1_1_performtransformation_binding = pattern_ClassDec2Class_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_ClassDec2Class_1_1_performtransformation_binding != null) {
			MClass bodyDeclaration = (MClass) result_pattern_ClassDec2Class_1_1_performtransformation_binding[0];

			Object[] result_pattern_ClassDec2Class_1_1_performtransformation_black = pattern_ClassDec2Class_1_1_performtransformation_blackBFBB(
					bodyDeclaration, _this, isApplicableMatch);
			if (result_pattern_ClassDec2Class_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassDec2Class_1_1_performtransformation_black[1];

				return new Object[] { bodyDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_1_1_performtransformation_greenFBFB(MClass bodyDeclaration,
			CSP csp) {
		org.eclipse.uml2.uml.Class feature = UMLFactory.eINSTANCE.createClass();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("feature", "name");
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		String feature_name_prime = (String) _localVariable_0;
		feature.setName(feature_name_prime);
		return new Object[] { feature, bodyDeclaration, b2e, csp };
	}

	public static final Object[] pattern_ClassDec2Class_1_2_collecttranslatedelements_blackBBB(
			org.eclipse.uml2.uml.Class feature, MClass bodyDeclaration, ASTNode2Element b2e) {
		return new Object[] { feature, bodyDeclaration, b2e };
	}

	public static final Object[] pattern_ClassDec2Class_1_2_collecttranslatedelements_greenFBBB(
			org.eclipse.uml2.uml.Class feature, MClass bodyDeclaration, ASTNode2Element b2e) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		ruleresult.getCreatedLinkElements().add(b2e);
		return new Object[] { ruleresult, feature, bodyDeclaration, b2e };
	}

	public static final Object[] pattern_ClassDec2Class_1_3_bookkeepingforedges_blackBBBB(PerformRuleResult ruleresult,
			EObject feature, EObject bodyDeclaration, EObject b2e) {
		if (!bodyDeclaration.equals(feature)) {
			if (!b2e.equals(feature)) {
				if (!b2e.equals(bodyDeclaration)) {
					return new Object[] { ruleresult, feature, bodyDeclaration, b2e };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_1_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration, EObject b2e) {
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassDec2Class";
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
		return new Object[] { ruleresult, feature, bodyDeclaration, b2e, b2e__bodyDeclaration____source,
				b2e__feature____target };
	}

	public static final void pattern_ClassDec2Class_1_5_registerobjects_expressionBBBBB(ClassDec2Class _this,
			PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration, EObject b2e) {
		_this.registerObjects_FWD(ruleresult, feature, bodyDeclaration, b2e);

	}

	public static final PerformRuleResult pattern_ClassDec2Class_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_2_1_preparereturnvalue_bindingFB(ClassDec2Class _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassDec2Class _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_2_1_preparereturnvalue_bindingAndBlackFFB(
			ClassDec2Class _this) {
		Object[] result_pattern_ClassDec2Class_2_1_preparereturnvalue_binding = pattern_ClassDec2Class_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassDec2Class_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassDec2Class_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassDec2Class_2_1_preparereturnvalue_black = pattern_ClassDec2Class_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassDec2Class_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassDec2Class_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassDec2Class";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassDec2Class_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject tmpBodyDeclaration = _localVariable_0;
		if (tmpBodyDeclaration instanceof MClass) {
			MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
			return new Object[] { bodyDeclaration, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassDec2Class_2_2_corematch_blackBB(MClass bodyDeclaration,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { bodyDeclaration, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassDec2Class_2_3_findcontext_blackB(MClass bodyDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { bodyDeclaration });
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_2_3_findcontext_greenBF(MClass bodyDeclaration) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		return new Object[] { bodyDeclaration, isApplicableMatch };
	}

	public static final Object[] pattern_ClassDec2Class_2_4_solveCSP_bindingFBBB(ClassDec2Class _this,
			IsApplicableMatch isApplicableMatch, MClass bodyDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassDec2Class_2_4_solveCSP_bindingAndBlackFBBB(ClassDec2Class _this,
			IsApplicableMatch isApplicableMatch, MClass bodyDeclaration) {
		Object[] result_pattern_ClassDec2Class_2_4_solveCSP_binding = pattern_ClassDec2Class_2_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, bodyDeclaration);
		if (result_pattern_ClassDec2Class_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassDec2Class_2_4_solveCSP_binding[0];

			Object[] result_pattern_ClassDec2Class_2_4_solveCSP_black = pattern_ClassDec2Class_2_4_solveCSP_blackB(csp);
			if (result_pattern_ClassDec2Class_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassDec2Class_2_5_checkCSP_expressionFBB(ClassDec2Class _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassDec2Class_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassDec2Class";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassDec2Class_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_10_1_initialbindings_blackBBB(ClassDec2Class _this, Match match,
			org.eclipse.uml2.uml.Class feature) {
		return new Object[] { _this, match, feature };
	}

	public static final Object[] pattern_ClassDec2Class_10_2_SolveCSP_bindingFBBB(ClassDec2Class _this, Match match,
			org.eclipse.uml2.uml.Class feature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature };
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassDec2Class_10_2_SolveCSP_bindingAndBlackFBBB(ClassDec2Class _this,
			Match match, org.eclipse.uml2.uml.Class feature) {
		Object[] result_pattern_ClassDec2Class_10_2_SolveCSP_binding = pattern_ClassDec2Class_10_2_SolveCSP_bindingFBBB(
				_this, match, feature);
		if (result_pattern_ClassDec2Class_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassDec2Class_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassDec2Class_10_2_SolveCSP_black = pattern_ClassDec2Class_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassDec2Class_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassDec2Class_10_3_CheckCSP_expressionFBB(ClassDec2Class _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_10_4_collectelementstobetranslated_blackBB(Match match,
			org.eclipse.uml2.uml.Class feature) {
		return new Object[] { match, feature };
	}

	public static final Object[] pattern_ClassDec2Class_10_4_collectelementstobetranslated_greenBB(Match match,
			org.eclipse.uml2.uml.Class feature) {
		match.getToBeTranslatedNodes().add(feature);
		return new Object[] { match, feature };
	}

	public static final Object[] pattern_ClassDec2Class_10_5_collectcontextelements_blackBB(Match match,
			org.eclipse.uml2.uml.Class feature) {
		return new Object[] { match, feature };
	}

	public static final void pattern_ClassDec2Class_10_6_registerobjectstomatch_expressionBBB(ClassDec2Class _this,
			Match match, org.eclipse.uml2.uml.Class feature) {
		_this.registerObjectsToMatch_BWD(match, feature);

	}

	public static final boolean pattern_ClassDec2Class_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassDec2Class_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject tmpFeature = _localVariable_0;
		if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
			return new Object[] { feature, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_11_1_performtransformation_blackBFBB(
			org.eclipse.uml2.uml.Class feature, ClassDec2Class _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { feature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_11_1_performtransformation_bindingAndBlackFFBB(
			ClassDec2Class _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassDec2Class_11_1_performtransformation_binding = pattern_ClassDec2Class_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_ClassDec2Class_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result_pattern_ClassDec2Class_11_1_performtransformation_binding[0];

			Object[] result_pattern_ClassDec2Class_11_1_performtransformation_black = pattern_ClassDec2Class_11_1_performtransformation_blackBFBB(
					feature, _this, isApplicableMatch);
			if (result_pattern_ClassDec2Class_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassDec2Class_11_1_performtransformation_black[1];

				return new Object[] { feature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_11_1_performtransformation_greenBFFB(
			org.eclipse.uml2.uml.Class feature, CSP csp) {
		MClass bodyDeclaration = ModiscoFactory.eINSTANCE.createMClass();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		return new Object[] { feature, bodyDeclaration, b2e, csp };
	}

	public static final Object[] pattern_ClassDec2Class_11_2_collecttranslatedelements_blackBBB(
			org.eclipse.uml2.uml.Class feature, MClass bodyDeclaration, ASTNode2Element b2e) {
		return new Object[] { feature, bodyDeclaration, b2e };
	}

	public static final Object[] pattern_ClassDec2Class_11_2_collecttranslatedelements_greenFBBB(
			org.eclipse.uml2.uml.Class feature, MClass bodyDeclaration, ASTNode2Element b2e) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		ruleresult.getCreatedLinkElements().add(b2e);
		return new Object[] { ruleresult, feature, bodyDeclaration, b2e };
	}

	public static final Object[] pattern_ClassDec2Class_11_3_bookkeepingforedges_blackBBBB(PerformRuleResult ruleresult,
			EObject feature, EObject bodyDeclaration, EObject b2e) {
		if (!bodyDeclaration.equals(feature)) {
			if (!b2e.equals(feature)) {
				if (!b2e.equals(bodyDeclaration)) {
					return new Object[] { ruleresult, feature, bodyDeclaration, b2e };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_11_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration, EObject b2e) {
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassDec2Class";
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
		return new Object[] { ruleresult, feature, bodyDeclaration, b2e, b2e__bodyDeclaration____source,
				b2e__feature____target };
	}

	public static final void pattern_ClassDec2Class_11_5_registerobjects_expressionBBBBB(ClassDec2Class _this,
			PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration, EObject b2e) {
		_this.registerObjects_BWD(ruleresult, feature, bodyDeclaration, b2e);

	}

	public static final PerformRuleResult pattern_ClassDec2Class_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_12_1_preparereturnvalue_bindingFB(ClassDec2Class _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassDec2Class _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_12_1_preparereturnvalue_bindingAndBlackFFB(
			ClassDec2Class _this) {
		Object[] result_pattern_ClassDec2Class_12_1_preparereturnvalue_binding = pattern_ClassDec2Class_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassDec2Class_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassDec2Class_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassDec2Class_12_1_preparereturnvalue_black = pattern_ClassDec2Class_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassDec2Class_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassDec2Class_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassDec2Class";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassDec2Class_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject tmpFeature = _localVariable_0;
		if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
			return new Object[] { feature, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassDec2Class_12_2_corematch_blackBB(
			org.eclipse.uml2.uml.Class feature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassDec2Class_12_3_findcontext_blackB(
			org.eclipse.uml2.uml.Class feature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature });
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_12_3_findcontext_greenBF(org.eclipse.uml2.uml.Class feature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(feature);
		return new Object[] { feature, isApplicableMatch };
	}

	public static final Object[] pattern_ClassDec2Class_12_4_solveCSP_bindingFBBB(ClassDec2Class _this,
			IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class feature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature };
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassDec2Class_12_4_solveCSP_bindingAndBlackFBBB(ClassDec2Class _this,
			IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class feature) {
		Object[] result_pattern_ClassDec2Class_12_4_solveCSP_binding = pattern_ClassDec2Class_12_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, feature);
		if (result_pattern_ClassDec2Class_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassDec2Class_12_4_solveCSP_binding[0];

			Object[] result_pattern_ClassDec2Class_12_4_solveCSP_black = pattern_ClassDec2Class_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassDec2Class_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassDec2Class_12_5_checkCSP_expressionFBB(ClassDec2Class _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassDec2Class_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassDec2Class";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassDec2Class_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_20_1_preparereturnvalue_bindingFB(ClassDec2Class _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassDec2Class _this) {
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

	public static final Object[] pattern_ClassDec2Class_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassDec2Class _this) {
		Object[] result_pattern_ClassDec2Class_20_1_preparereturnvalue_binding = pattern_ClassDec2Class_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassDec2Class_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassDec2Class_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassDec2Class_20_1_preparereturnvalue_black = pattern_ClassDec2Class_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassDec2Class_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassDec2Class_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassDec2Class_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ClassDec2Class_20_2_testcorematchandDECs_blackB(
			org.eclipse.uml2.uml.Class feature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature });
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassDec2Class_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			ClassDec2Class _this, Match match, org.eclipse.uml2.uml.Class feature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassDec2Class_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassDec2Class _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassDec2Class_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_21_1_preparereturnvalue_bindingFB(ClassDec2Class _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassDec2Class _this) {
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

	public static final Object[] pattern_ClassDec2Class_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassDec2Class _this) {
		Object[] result_pattern_ClassDec2Class_21_1_preparereturnvalue_binding = pattern_ClassDec2Class_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassDec2Class_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassDec2Class_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassDec2Class_21_1_preparereturnvalue_black = pattern_ClassDec2Class_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassDec2Class_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassDec2Class_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassDec2Class_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassDec2Class_21_2_testcorematchandDECs_black_nac_0B(MClass bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_343851 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_343851 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_ClassDec2Class_21_2_testcorematchandDECs_blackB(
			MClass bodyDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pattern_ClassDec2Class_21_2_testcorematchandDECs_black_nac_0B(bodyDeclaration) == null) {
			_result.add(new Object[] { bodyDeclaration });
		}
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassDec2Class_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			ClassDec2Class _this, Match match, MClass bodyDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassDec2Class_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassDec2Class _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassDec2Class_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_24_1_prepare_blackB(ClassDec2Class _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassDec2Class_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ClassDec2Class_24_2_matchsrctrgcontext_bindingFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("bodyDeclaration");
		EObject tmpFeature = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
			if (tmpBodyDeclaration instanceof MClass) {
				MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
				return new Object[] { feature, bodyDeclaration, targetMatch, sourceMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_24_2_matchsrctrgcontext_blackBBBB(
			org.eclipse.uml2.uml.Class feature, MClass bodyDeclaration, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { feature, bodyDeclaration, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_24_2_matchsrctrgcontext_bindingAndBlackFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_ClassDec2Class_24_2_matchsrctrgcontext_binding = pattern_ClassDec2Class_24_2_matchsrctrgcontext_bindingFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ClassDec2Class_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result_pattern_ClassDec2Class_24_2_matchsrctrgcontext_binding[0];
			MClass bodyDeclaration = (MClass) result_pattern_ClassDec2Class_24_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_ClassDec2Class_24_2_matchsrctrgcontext_black = pattern_ClassDec2Class_24_2_matchsrctrgcontext_blackBBBB(
					feature, bodyDeclaration, sourceMatch, targetMatch);
			if (result_pattern_ClassDec2Class_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, bodyDeclaration, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_24_3_solvecsp_bindingFBBBBB(ClassDec2Class _this,
			org.eclipse.uml2.uml.Class feature, MClass bodyDeclaration, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(feature, bodyDeclaration, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, feature, bodyDeclaration, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassDec2Class_24_3_solvecsp_bindingAndBlackFBBBBB(ClassDec2Class _this,
			org.eclipse.uml2.uml.Class feature, MClass bodyDeclaration, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassDec2Class_24_3_solvecsp_binding = pattern_ClassDec2Class_24_3_solvecsp_bindingFBBBBB(
				_this, feature, bodyDeclaration, sourceMatch, targetMatch);
		if (result_pattern_ClassDec2Class_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ClassDec2Class_24_3_solvecsp_binding[0];

			Object[] result_pattern_ClassDec2Class_24_3_solvecsp_black = pattern_ClassDec2Class_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ClassDec2Class_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, bodyDeclaration, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassDec2Class_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassDec2Class_24_5_matchcorrcontext_blackBB(Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ClassDec2Class";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ClassDec2Class_24_6_createcorrespondence_blackBBB(
			org.eclipse.uml2.uml.Class feature, MClass bodyDeclaration, CCMatch ccMatch) {
		return new Object[] { feature, bodyDeclaration, ccMatch };
	}

	public static final Object[] pattern_ClassDec2Class_24_6_createcorrespondence_greenBBFB(
			org.eclipse.uml2.uml.Class feature, MClass bodyDeclaration, CCMatch ccMatch) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		ccMatch.getCreateCorr().add(b2e);
		return new Object[] { feature, bodyDeclaration, b2e, ccMatch };
	}

	public static final Object[] pattern_ClassDec2Class_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ClassDec2Class_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ClassDec2Class";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassDec2Class_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_27_1_matchtggpattern_black_nac_0B(MClass bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_758420 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_758420 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_ClassDec2Class_27_1_matchtggpattern_blackB(MClass bodyDeclaration) {
		if (pattern_ClassDec2Class_27_1_matchtggpattern_black_nac_0B(bodyDeclaration) == null) {
			return new Object[] { bodyDeclaration };
		}
		return null;
	}

	public static final boolean pattern_ClassDec2Class_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassDec2Class_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_28_1_matchtggpattern_blackB(
			org.eclipse.uml2.uml.Class feature) {
		return new Object[] { feature };
	}

	public static final boolean pattern_ClassDec2Class_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassDec2Class_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_29_1_createresult_blackB(ClassDec2Class _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassDec2Class_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ClassDec2Class_29_2_isapplicablecore_blackB(ClassDec2Class _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassDec2Class_29_3_solveCSP_bindingFBBB(ClassDec2Class _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ClassDec2Class_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassDec2Class_29_3_solveCSP_bindingAndBlackFBBB(ClassDec2Class _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ClassDec2Class_29_3_solveCSP_binding = pattern_ClassDec2Class_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_ClassDec2Class_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassDec2Class_29_3_solveCSP_binding[0];

			Object[] result_pattern_ClassDec2Class_29_3_solveCSP_black = pattern_ClassDec2Class_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ClassDec2Class_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassDec2Class_29_4_checkCSP_expressionFBB(ClassDec2Class _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassDec2Class_29_6_perform_blackB(ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_ClassDec2Class_29_6_perform_greenFFFBB(ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		org.eclipse.uml2.uml.Class feature = UMLFactory.eINSTANCE.createClass();
		MClass bodyDeclaration = ModiscoFactory.eINSTANCE.createMClass();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("bodyDeclaration", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(feature);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		ruleResult.getCorrObjects().add(b2e);
		String feature_name_prime = (String) _localVariable_0;
		String bodyDeclaration_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		feature.setName(feature_name_prime);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { feature, bodyDeclaration, b2e, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ClassDec2Class_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ClassDec2ClassImpl
