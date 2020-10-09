/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.EnumDeclaration;
import org.eclipse.modisco.java.Modifier;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.VisibilityKind;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage;
import org.gravity.tgg.modisco.uml.Modifier2NamedElement;
import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.EnumDecWithModifier2Enum;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

import org.gravity.tgg.modisco.uml.UmlFactory;

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
 * An implementation of the model object '<em><b>Enum Dec With Modifier2 Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EnumDecWithModifier2EnumImpl extends AbstractRuleImpl implements EnumDecWithModifier2Enum {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumDecWithModifier2EnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEnumDecWithModifier2Enum();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration) {

		Object[] result1_black = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_0_1_initialbindings_blackBBBBB(this, match, jPackage, modifier,
						bodyDeclaration);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jPackage] = " + jPackage + ", " + "[modifier] = " + modifier
					+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}

		Object[] result2_bindingAndBlack = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, jPackage, modifier,
						bodyDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jPackage] = " + jPackage + ", " + "[modifier] = " + modifier
					+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = EnumDecWithModifier2EnumImpl
					.pattern_EnumDecWithModifier2Enum_0_4_collectelementstobetranslated_blackBBBB(match, jPackage,
							modifier, bodyDeclaration);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jPackage] = " + jPackage + ", " + "[modifier] = " + modifier + ", " + "[bodyDeclaration] = "
						+ bodyDeclaration + ".");
			}
			EnumDecWithModifier2EnumImpl
					.pattern_EnumDecWithModifier2Enum_0_4_collectelementstobetranslated_greenBBBBFFFF(match, jPackage,
							modifier, bodyDeclaration);
			//nothing EMoflonEdge jPackage__bodyDeclaration____ownedElements = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge bodyDeclaration__jPackage____package = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result4_green[7];

			Object[] result5_black = EnumDecWithModifier2EnumImpl
					.pattern_EnumDecWithModifier2Enum_0_5_collectcontextelements_blackBBBB(match, jPackage, modifier,
							bodyDeclaration);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jPackage] = " + jPackage + ", " + "[modifier] = " + modifier + ", " + "[bodyDeclaration] = "
						+ bodyDeclaration + ".");
			}
			EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_0_5_collectcontextelements_greenBB(match,
					jPackage);

			// 
			EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_0_6_registerobjectstomatch_expressionBBBBB(
					this, match, jPackage, modifier, bodyDeclaration);
			return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_0_7_expressionF();
		} else {
			return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[0];
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[1];
		Modifier modifier = (Modifier) result1_bindingAndBlack[2];
		EnumDeclaration bodyDeclaration = (EnumDeclaration) result1_bindingAndBlack[3];
		JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_1_1_performtransformation_greenFBFFFBBB(umlPackage, modifier,
						bodyDeclaration, csp);
		Modifier2NamedElement m2f = (Modifier2NamedElement) result1_green[0];
		Enumeration feature = (Enumeration) result1_green[2];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[3];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[4];

		Object[] result2_black = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_1_2_collecttranslatedelements_blackBBBBBB(m2f, feature, bd2ne, b2e,
						modifier, bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2f] = " + m2f + ", "
					+ "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", " + "[b2e] = " + b2e + ", "
					+ "[modifier] = " + modifier + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_1_2_collecttranslatedelements_greenFBBBBBB(m2f, feature, bd2ne, b2e,
						modifier, bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, m2f, umlPackage,
						feature, bd2ne, b2e, jPackage, modifier, bodyDeclaration, jp2up);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[umlPackage] = " + umlPackage + ", " + "[feature] = " + feature
					+ ", " + "[bd2ne] = " + bd2ne + ", " + "[b2e] = " + b2e + ", " + "[jPackage] = " + jPackage + ", "
					+ "[modifier] = " + modifier + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jp2up] = "
					+ jp2up + ".");
		}
		EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(
				ruleresult, m2f, umlPackage, feature, bd2ne, b2e, jPackage, modifier, bodyDeclaration);
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge jPackage__bodyDeclaration____ownedElements = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge bodyDeclaration__jPackage____package = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[19];

		// 
		// 
		EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, m2f, umlPackage, feature, bd2ne, b2e, jPackage, modifier, bodyDeclaration, jp2up);
		return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_binding[0];
		Modifier modifier = (Modifier) result2_binding[1];
		EnumDeclaration bodyDeclaration = (EnumDeclaration) result2_binding[2];
		for (Object[] result2_black : EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_2_2_corematch_blackFBBBFB(jPackage, modifier, bodyDeclaration,
						match)) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_black[0];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result2_black[4];
			// ForEach 
			for (Object[] result3_black : EnumDecWithModifier2EnumImpl
					.pattern_EnumDecWithModifier2Enum_2_3_findcontext_blackBBBBB(umlPackage, jPackage, modifier,
							bodyDeclaration, jp2up)) {
				Object[] result3_green = EnumDecWithModifier2EnumImpl
						.pattern_EnumDecWithModifier2Enum_2_3_findcontext_greenBBBBBFFFFFFF(umlPackage, jPackage,
								modifier, bodyDeclaration, jp2up);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge jPackage__bodyDeclaration____ownedElements = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge bodyDeclaration__jPackage____package = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge jp2up__umlPackage____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge jp2up__jPackage____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = EnumDecWithModifier2EnumImpl
						.pattern_EnumDecWithModifier2Enum_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								umlPackage, jPackage, modifier, bodyDeclaration, jp2up);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[umlPackage] = " + umlPackage
							+ ", " + "[jPackage] = " + jPackage + ", " + "[modifier] = " + modifier + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jp2up] = " + jp2up + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = EnumDecWithModifier2EnumImpl
							.pattern_EnumDecWithModifier2Enum_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration) {
		match.registerObject("jPackage", jPackage);
		match.registerObject("modifier", modifier);
		match.registerObject("bodyDeclaration", bodyDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Package umlPackage,
			org.eclipse.modisco.java.Package jPackage, Modifier modifier, EnumDeclaration bodyDeclaration,
			JavaPackage2UmlPackage jp2up) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", true, csp);
		var_modifier_visibility.setValue(modifier.getVisibility());
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");

		// Create unbound variables
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", csp);
		var_feature_visibility.setType("uml.VisibilityKind");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();
		Eq eq = new Eq();

		csp.getConstraints().add(jVisibility2umlVisibility);
		csp.getConstraints().add(eq);

		// Solve CSP
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("jPackage", jPackage);
		isApplicableMatch.registerObject("modifier", modifier);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("jp2up", jp2up);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject m2f, EObject umlPackage, EObject feature,
			EObject bd2ne, EObject b2e, EObject jPackage, EObject modifier, EObject bodyDeclaration, EObject jp2up) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("umlPackage", umlPackage);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("jPackage", jPackage);
		ruleresult.registerObject("modifier", modifier);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("jp2up", jp2up);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("modifier").eClass()).equals("java.Modifier.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
						.equals("java.EnumDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Package umlPackage, Enumeration feature) {

		Object[] result1_black = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_10_1_initialbindings_blackBBBB(this, match, umlPackage, feature);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[umlPackage] = " + umlPackage + ", " + "[feature] = " + feature + ".");
		}

		Object[] result2_bindingAndBlack = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, umlPackage, feature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[umlPackage] = " + umlPackage + ", " + "[feature] = " + feature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = EnumDecWithModifier2EnumImpl
					.pattern_EnumDecWithModifier2Enum_10_4_collectelementstobetranslated_blackBBB(match, umlPackage,
							feature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umlPackage] = " + umlPackage + ", " + "[feature] = " + feature + ".");
			}
			EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_10_4_collectelementstobetranslated_greenBBBF(
					match, umlPackage, feature);
			//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result4_green[3];

			Object[] result5_black = EnumDecWithModifier2EnumImpl
					.pattern_EnumDecWithModifier2Enum_10_5_collectcontextelements_blackBBB(match, umlPackage, feature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umlPackage] = " + umlPackage + ", " + "[feature] = " + feature + ".");
			}
			EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_10_5_collectcontextelements_greenBB(match,
					umlPackage);

			// 
			EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_10_6_registerobjectstomatch_expressionBBBB(
					this, match, umlPackage, feature);
			return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_10_7_expressionF();
		} else {
			return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[0];
		Enumeration feature = (Enumeration) result1_bindingAndBlack[1];
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[2];
		JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_11_1_performtransformation_greenFBFFBFFB(feature, jPackage, csp);
		Modifier2NamedElement m2f = (Modifier2NamedElement) result1_green[0];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[2];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[3];
		Modifier modifier = (Modifier) result1_green[5];
		EnumDeclaration bodyDeclaration = (EnumDeclaration) result1_green[6];

		Object[] result2_black = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_11_2_collecttranslatedelements_blackBBBBBB(m2f, feature, bd2ne, b2e,
						modifier, bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2f] = " + m2f + ", "
					+ "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", " + "[b2e] = " + b2e + ", "
					+ "[modifier] = " + modifier + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_11_2_collecttranslatedelements_greenFBBBBBB(m2f, feature, bd2ne, b2e,
						modifier, bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, m2f, umlPackage,
						feature, bd2ne, b2e, jPackage, modifier, bodyDeclaration, jp2up);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[umlPackage] = " + umlPackage + ", " + "[feature] = " + feature
					+ ", " + "[bd2ne] = " + bd2ne + ", " + "[b2e] = " + b2e + ", " + "[jPackage] = " + jPackage + ", "
					+ "[modifier] = " + modifier + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jp2up] = "
					+ jp2up + ".");
		}
		EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(ruleresult, m2f,
						umlPackage, feature, bd2ne, b2e, jPackage, modifier, bodyDeclaration);
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge jPackage__bodyDeclaration____ownedElements = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge bodyDeclaration__jPackage____package = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[19];

		// 
		// 
		EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, m2f, umlPackage, feature, bd2ne, b2e, jPackage, modifier, bodyDeclaration, jp2up);
		return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_binding[0];
		Enumeration feature = (Enumeration) result2_binding[1];
		for (Object[] result2_black : EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_12_2_corematch_blackBBFFB(umlPackage, feature, match)) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_black[2];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result2_black[3];
			// ForEach 
			for (Object[] result3_black : EnumDecWithModifier2EnumImpl
					.pattern_EnumDecWithModifier2Enum_12_3_findcontext_blackBBBB(umlPackage, feature, jPackage,
							jp2up)) {
				Object[] result3_green = EnumDecWithModifier2EnumImpl
						.pattern_EnumDecWithModifier2Enum_12_3_findcontext_greenBBBBFFFF(umlPackage, feature, jPackage,
								jp2up);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge jp2up__umlPackage____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jp2up__jPackage____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = EnumDecWithModifier2EnumImpl
						.pattern_EnumDecWithModifier2Enum_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								umlPackage, feature, jPackage, jp2up);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[umlPackage] = " + umlPackage
							+ ", " + "[feature] = " + feature + ", " + "[jPackage] = " + jPackage + ", " + "[jp2up] = "
							+ jp2up + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = EnumDecWithModifier2EnumImpl
							.pattern_EnumDecWithModifier2Enum_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Package umlPackage, Enumeration feature) {
		match.registerObject("umlPackage", umlPackage);
		match.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Package umlPackage, Enumeration feature) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Package umlPackage,
			Enumeration feature, org.eclipse.modisco.java.Package jPackage, JavaPackage2UmlPackage jp2up) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", true, csp);
		var_feature_visibility.setValue(feature.getVisibility());
		var_feature_visibility.setType("uml.VisibilityKind");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", csp);
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");

		// Create constraints
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();
		Eq eq = new Eq();

		csp.getConstraints().add(jVisibility2umlVisibility);
		csp.getConstraints().add(eq);

		// Solve CSP
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("jPackage", jPackage);
		isApplicableMatch.registerObject("jp2up", jp2up);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject m2f, EObject umlPackage, EObject feature,
			EObject bd2ne, EObject b2e, EObject jPackage, EObject modifier, EObject bodyDeclaration, EObject jp2up) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("umlPackage", umlPackage);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("jPackage", jPackage);
		ruleresult.registerObject("modifier", modifier);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("jp2up", jp2up);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("feature").eClass())
				.equals("uml.Enumeration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_264(EMoflonEdge _edge_packagedElement) {

		Object[] result1_bindingAndBlack = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_20_2_testcorematchandDECs_blackFFB(_edge_packagedElement)) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_black[0];
			Enumeration feature = (Enumeration) result2_black[1];
			Object[] result2_green = EnumDecWithModifier2EnumImpl
					.pattern_EnumDecWithModifier2Enum_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (EnumDecWithModifier2EnumImpl
					.pattern_EnumDecWithModifier2Enum_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, umlPackage, feature)) {
				// 
				if (EnumDecWithModifier2EnumImpl
						.pattern_EnumDecWithModifier2Enum_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = EnumDecWithModifier2EnumImpl
							.pattern_EnumDecWithModifier2Enum_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_273(EMoflonEdge _edge_ownedElements) {

		Object[] result1_bindingAndBlack = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_21_2_testcorematchandDECs_blackFFFB(_edge_ownedElements)) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_black[0];
			Modifier modifier = (Modifier) result2_black[1];
			EnumDeclaration bodyDeclaration = (EnumDeclaration) result2_black[2];
			Object[] result2_green = EnumDecWithModifier2EnumImpl
					.pattern_EnumDecWithModifier2Enum_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (EnumDecWithModifier2EnumImpl
					.pattern_EnumDecWithModifier2Enum_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, jPackage, modifier, bodyDeclaration)) {
				// 
				if (EnumDecWithModifier2EnumImpl
						.pattern_EnumDecWithModifier2Enum_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = EnumDecWithModifier2EnumImpl
							.pattern_EnumDecWithModifier2Enum_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("EnumDecWithModifier2Enum");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_visibility.setValue(__helper.getValue("feature", "visibility"));
		var_feature_visibility.setType("uml.VisibilityKind");

		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_visibility.setValue(__helper.getValue("modifier", "visibility"));
		var_modifier_visibility.setType("java.VisibilityKind");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		JVisibility2umlVisibility jVisibility2umlVisibility0 = new JVisibility2umlVisibility();
		csp.getConstraints().add(jVisibility2umlVisibility0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		jVisibility2umlVisibility0.setRuleName("EnumDecWithModifier2Enum");
		jVisibility2umlVisibility0.solve(var_modifier_visibility, var_feature_visibility);

		eq1.setRuleName("EnumDecWithModifier2Enum");
		eq1.solve(var_bodyDeclaration_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_feature_visibility.setBound(false);
			var_feature_name.setBound(false);
			jVisibility2umlVisibility0.solve(var_modifier_visibility, var_feature_visibility);
			eq1.solve(var_bodyDeclaration_name, var_feature_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("feature", "visibility", var_feature_visibility.getValue());
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
		ruleResult.setRule("EnumDecWithModifier2Enum");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_visibility.setValue(__helper.getValue("feature", "visibility"));
		var_feature_visibility.setType("uml.VisibilityKind");

		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_visibility.setValue(__helper.getValue("modifier", "visibility"));
		var_modifier_visibility.setType("java.VisibilityKind");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		JVisibility2umlVisibility jVisibility2umlVisibility0 = new JVisibility2umlVisibility();
		csp.getConstraints().add(jVisibility2umlVisibility0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		jVisibility2umlVisibility0.setRuleName("EnumDecWithModifier2Enum");
		jVisibility2umlVisibility0.solve(var_modifier_visibility, var_feature_visibility);

		eq1.setRuleName("EnumDecWithModifier2Enum");
		eq1.solve(var_bodyDeclaration_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_modifier_visibility.setBound(false);
			var_bodyDeclaration_name.setBound(false);
			jVisibility2umlVisibility0.solve(var_modifier_visibility, var_feature_visibility);
			eq1.solve(var_bodyDeclaration_name, var_feature_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("modifier", "visibility", var_modifier_visibility.getValue());
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

		Object[] result1_black = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_bindingAndBlack[0];
		Enumeration feature = (Enumeration) result2_bindingAndBlack[1];
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[2];
		Modifier modifier = (Modifier) result2_bindingAndBlack[3];
		EnumDeclaration bodyDeclaration = (EnumDeclaration) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, umlPackage, feature,
						jPackage, modifier, bodyDeclaration, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[umlPackage] = " + umlPackage + ", " + "[feature] = " + feature + ", " + "[jPackage] = "
					+ jPackage + ", " + "[modifier] = " + modifier + ", " + "[bodyDeclaration] = " + bodyDeclaration
					+ ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : EnumDecWithModifier2EnumImpl
					.pattern_EnumDecWithModifier2Enum_24_5_matchcorrcontext_blackBBFBB(umlPackage, jPackage,
							sourceMatch, targetMatch)) {
				JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result5_black[2];
				Object[] result5_green = EnumDecWithModifier2EnumImpl
						.pattern_EnumDecWithModifier2Enum_24_5_matchcorrcontext_greenBBBF(jp2up, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = EnumDecWithModifier2EnumImpl
						.pattern_EnumDecWithModifier2Enum_24_6_createcorrespondence_blackBBBBBB(umlPackage, feature,
								jPackage, modifier, bodyDeclaration, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[umlPackage] = "
							+ umlPackage + ", " + "[feature] = " + feature + ", " + "[jPackage] = " + jPackage + ", "
							+ "[modifier] = " + modifier + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_24_6_createcorrespondence_greenFBFFBBB(
						feature, modifier, bodyDeclaration, ccMatch);
				//nothing Modifier2NamedElement m2f = (Modifier2NamedElement) result6_green[0];
				//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[2];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[3];

				Object[] result7_black = EnumDecWithModifier2EnumImpl
						.pattern_EnumDecWithModifier2Enum_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Package umlPackage, Enumeration feature,
			org.eclipse.modisco.java.Package jPackage, Modifier modifier, EnumDeclaration bodyDeclaration,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", true, csp);
		var_modifier_visibility.setValue(modifier.getVisibility());
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", true, csp);
		var_feature_visibility.setValue(feature.getVisibility());
		var_feature_visibility.setType("uml.VisibilityKind");
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables

		// Create constraints
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();
		Eq eq = new Eq();

		csp.getConstraints().add(jVisibility2umlVisibility);
		csp.getConstraints().add(eq);

		// Solve CSP
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration) {// 
		Object[] result1_black = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_27_1_matchtggpattern_blackBBB(jPackage, modifier, bodyDeclaration);
		if (result1_black != null) {
			return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_27_2_expressionF();
		} else {
			return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Package umlPackage, Enumeration feature) {// 
		Object[] result1_black = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_28_1_matchtggpattern_blackBB(umlPackage, feature);
		if (result1_black != null) {
			return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_28_2_expressionF();
		} else {
			return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			JavaPackage2UmlPackage jp2upParameter) {

		Object[] result1_black = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : EnumDecWithModifier2EnumImpl
				.pattern_EnumDecWithModifier2Enum_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList jp2upList = (RuleEntryList) result2_black[0];
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_black[1];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result2_black[2];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_black[3];

			Object[] result3_bindingAndBlack = EnumDecWithModifier2EnumImpl
					.pattern_EnumDecWithModifier2Enum_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							umlPackage, jPackage, jp2up, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[umlPackage] = " + umlPackage + ", "
						+ "[jPackage] = " + jPackage + ", " + "[jp2up] = " + jp2up + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = EnumDecWithModifier2EnumImpl
						.pattern_EnumDecWithModifier2Enum_29_5_checknacs_blackBBB(umlPackage, jPackage, jp2up);
				if (result5_black != null) {

					Object[] result6_black = EnumDecWithModifier2EnumImpl
							.pattern_EnumDecWithModifier2Enum_29_6_perform_blackBBBB(umlPackage, jPackage, jp2up,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[umlPackage] = "
								+ umlPackage + ", " + "[jPackage] = " + jPackage + ", " + "[jp2up] = " + jp2up + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_29_6_perform_greenFBFFFBFFBB(
							umlPackage, jPackage, ruleResult, csp);
					//nothing Modifier2NamedElement m2f = (Modifier2NamedElement) result6_green[0];
					//nothing Enumeration feature = (Enumeration) result6_green[2];
					//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[3];
					//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[4];
					//nothing Modifier modifier = (Modifier) result6_green[6];
					//nothing EnumDeclaration bodyDeclaration = (EnumDeclaration) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return EnumDecWithModifier2EnumImpl.pattern_EnumDecWithModifier2Enum_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Package umlPackage,
			org.eclipse.modisco.java.Package jPackage, JavaPackage2UmlPackage jp2up,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", csp);
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", csp);
		var_feature_visibility.setType("uml.VisibilityKind");
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();
		Eq eq = new Eq();

		csp.getConstraints().add(jVisibility2umlVisibility);
		csp.getConstraints().add(eq);

		// Solve CSP
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("jPackage", jPackage);
		isApplicableMatch.registerObject("jp2up", jp2up);
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
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPROPRIATE_FWD__MATCH_PACKAGE_MODIFIER_ENUMDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(Modifier) arguments.get(2), (EnumDeclaration) arguments.get(3));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_MODIFIER_ENUMDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(Modifier) arguments.get(2), (EnumDeclaration) arguments.get(3));
			return null;
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_MODIFIER_ENUMDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (Modifier) arguments.get(2),
					(EnumDeclaration) arguments.get(3));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGE_PACKAGE_MODIFIER_ENUMDECLARATION_JAVAPACKAGE2UMLPACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Package) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2), (Modifier) arguments.get(3),
					(EnumDeclaration) arguments.get(4), (JavaPackage2UmlPackage) arguments.get(5));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPROPRIATE_BWD__MATCH_PACKAGE_ENUMERATION:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(Enumeration) arguments.get(2));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_ENUMERATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(Enumeration) arguments.get(2));
			return null;
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_ENUMERATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(Enumeration) arguments.get(2));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGE_ENUMERATION_PACKAGE_JAVAPACKAGE2UMLPACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Package) arguments.get(1), (Enumeration) arguments.get(2),
					(org.eclipse.modisco.java.Package) arguments.get(3), (JavaPackage2UmlPackage) arguments.get(4));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPROPRIATE_BWD_EMOFLON_EDGE_264__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_264((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPROPRIATE_FWD_EMOFLON_EDGE_273__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_273((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPLICABLE_SOLVE_CSP_CC__PACKAGE_ENUMERATION_PACKAGE_MODIFIER_ENUMDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Package) arguments.get(0),
					(Enumeration) arguments.get(1), (org.eclipse.modisco.java.Package) arguments.get(2),
					(Modifier) arguments.get(3), (EnumDeclaration) arguments.get(4), (Match) arguments.get(5),
					(Match) arguments.get(6));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___CHECK_DEC_FWD__PACKAGE_MODIFIER_ENUMDECLARATION:
			return checkDEC_FWD((org.eclipse.modisco.java.Package) arguments.get(0), (Modifier) arguments.get(1),
					(EnumDeclaration) arguments.get(2));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___CHECK_DEC_BWD__PACKAGE_ENUMERATION:
			return checkDEC_BWD((org.eclipse.uml2.uml.Package) arguments.get(0), (Enumeration) arguments.get(1));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___GENERATE_MODEL__RULEENTRYCONTAINER_JAVAPACKAGE2UMLPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (JavaPackage2UmlPackage) arguments.get(1));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGE_PACKAGE_JAVAPACKAGE2UMLPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Package) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2), (JavaPackage2UmlPackage) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.ENUM_DEC_WITH_MODIFIER2_ENUM___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_0_1_initialbindings_blackBBBBB(
			EnumDecWithModifier2Enum _this, Match match, org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration) {
		return new Object[] { _this, match, jPackage, modifier, bodyDeclaration };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_0_2_SolveCSP_bindingFBBBBB(
			EnumDecWithModifier2Enum _this, Match match, org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jPackage, modifier, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jPackage, modifier, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_0_2_SolveCSP_bindingAndBlackFBBBBB(
			EnumDecWithModifier2Enum _this, Match match, org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration) {
		Object[] result_pattern_EnumDecWithModifier2Enum_0_2_SolveCSP_binding = pattern_EnumDecWithModifier2Enum_0_2_SolveCSP_bindingFBBBBB(
				_this, match, jPackage, modifier, bodyDeclaration);
		if (result_pattern_EnumDecWithModifier2Enum_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumDecWithModifier2Enum_0_2_SolveCSP_binding[0];

			Object[] result_pattern_EnumDecWithModifier2Enum_0_2_SolveCSP_black = pattern_EnumDecWithModifier2Enum_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_EnumDecWithModifier2Enum_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, jPackage, modifier, bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDecWithModifier2Enum_0_3_CheckCSP_expressionFBB(
			EnumDecWithModifier2Enum _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_0_4_collectelementstobetranslated_blackBBBB(
			Match match, org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration) {
		return new Object[] { match, jPackage, modifier, bodyDeclaration };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_0_4_collectelementstobetranslated_greenBBBBFFFF(
			Match match, org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration) {
		EMoflonEdge jPackage__bodyDeclaration____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(modifier);
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		String jPackage__bodyDeclaration____ownedElements_name_prime = "ownedElements";
		String bodyDeclaration__jPackage____package_name_prime = "package";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		jPackage__bodyDeclaration____ownedElements.setSrc(jPackage);
		jPackage__bodyDeclaration____ownedElements.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(jPackage__bodyDeclaration____ownedElements);
		bodyDeclaration__jPackage____package.setSrc(bodyDeclaration);
		bodyDeclaration__jPackage____package.setTrg(jPackage);
		match.getToBeTranslatedEdges().add(bodyDeclaration__jPackage____package);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		match.getToBeTranslatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		jPackage__bodyDeclaration____ownedElements.setName(jPackage__bodyDeclaration____ownedElements_name_prime);
		bodyDeclaration__jPackage____package.setName(bodyDeclaration__jPackage____package_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		return new Object[] { match, jPackage, modifier, bodyDeclaration, jPackage__bodyDeclaration____ownedElements,
				bodyDeclaration__jPackage____package, bodyDeclaration__modifier____modifier,
				modifier__bodyDeclaration____bodyDeclaration };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_0_5_collectcontextelements_blackBBBB(Match match,
			org.eclipse.modisco.java.Package jPackage, Modifier modifier, EnumDeclaration bodyDeclaration) {
		return new Object[] { match, jPackage, modifier, bodyDeclaration };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_0_5_collectcontextelements_greenBB(Match match,
			org.eclipse.modisco.java.Package jPackage) {
		match.getContextNodes().add(jPackage);
		return new Object[] { match, jPackage };
	}

	public static final void pattern_EnumDecWithModifier2Enum_0_6_registerobjectstomatch_expressionBBBBB(
			EnumDecWithModifier2Enum _this, Match match, org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration) {
		_this.registerObjectsToMatch_FWD(match, jPackage, modifier, bodyDeclaration);

	}

	public static final boolean pattern_EnumDecWithModifier2Enum_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnumDecWithModifier2Enum_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("umlPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("jPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("modifier");
		EObject _localVariable_3 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_4 = isApplicableMatch.getObject("jp2up");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpJPackage = _localVariable_1;
		EObject tmpModifier = _localVariable_2;
		EObject tmpBodyDeclaration = _localVariable_3;
		EObject tmpJp2up = _localVariable_4;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
				if (tmpModifier instanceof Modifier) {
					Modifier modifier = (Modifier) tmpModifier;
					if (tmpBodyDeclaration instanceof EnumDeclaration) {
						EnumDeclaration bodyDeclaration = (EnumDeclaration) tmpBodyDeclaration;
						if (tmpJp2up instanceof JavaPackage2UmlPackage) {
							JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) tmpJp2up;
							return new Object[] { umlPackage, jPackage, modifier, bodyDeclaration, jp2up,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_1_1_performtransformation_blackBBBBBFBB(
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration, JavaPackage2UmlPackage jp2up, EnumDecWithModifier2Enum _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { umlPackage, jPackage, modifier, bodyDeclaration, jp2up, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			EnumDecWithModifier2Enum _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EnumDecWithModifier2Enum_1_1_performtransformation_binding = pattern_EnumDecWithModifier2Enum_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_EnumDecWithModifier2Enum_1_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result_pattern_EnumDecWithModifier2Enum_1_1_performtransformation_binding[0];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result_pattern_EnumDecWithModifier2Enum_1_1_performtransformation_binding[1];
			Modifier modifier = (Modifier) result_pattern_EnumDecWithModifier2Enum_1_1_performtransformation_binding[2];
			EnumDeclaration bodyDeclaration = (EnumDeclaration) result_pattern_EnumDecWithModifier2Enum_1_1_performtransformation_binding[3];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result_pattern_EnumDecWithModifier2Enum_1_1_performtransformation_binding[4];

			Object[] result_pattern_EnumDecWithModifier2Enum_1_1_performtransformation_black = pattern_EnumDecWithModifier2Enum_1_1_performtransformation_blackBBBBBFBB(
					umlPackage, jPackage, modifier, bodyDeclaration, jp2up, _this, isApplicableMatch);
			if (result_pattern_EnumDecWithModifier2Enum_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnumDecWithModifier2Enum_1_1_performtransformation_black[5];

				return new Object[] { umlPackage, jPackage, modifier, bodyDeclaration, jp2up, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_1_1_performtransformation_greenFBFFFBBB(
			org.eclipse.uml2.uml.Package umlPackage, Modifier modifier, EnumDeclaration bodyDeclaration, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		Enumeration feature = UMLFactory.eINSTANCE.createEnumeration();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("feature", "visibility");
		Object _localVariable_1 = csp.getValue("feature", "name");
		m2f.setSource(modifier);
		m2f.setTarget(feature);
		umlPackage.getPackagedElements().add(feature);
		bd2ne.setSource(bodyDeclaration);
		bd2ne.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_0;
		String feature_name_prime = (String) _localVariable_1;
		feature.setVisibility(feature_visibility_prime);
		feature.setName(feature_name_prime);
		return new Object[] { m2f, umlPackage, feature, bd2ne, b2e, modifier, bodyDeclaration, csp };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_1_2_collecttranslatedelements_blackBBBBBB(
			Modifier2NamedElement m2f, Enumeration feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			Modifier modifier, EnumDeclaration bodyDeclaration) {
		return new Object[] { m2f, feature, bd2ne, b2e, modifier, bodyDeclaration };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_1_2_collecttranslatedelements_greenFBBBBBB(
			Modifier2NamedElement m2f, Enumeration feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			Modifier modifier, EnumDeclaration bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2f);
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getTranslatedElements().add(modifier);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, m2f, feature, bd2ne, b2e, modifier, bodyDeclaration };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject umlPackage, EObject feature, EObject bd2ne, EObject b2e,
			EObject jPackage, EObject modifier, EObject bodyDeclaration, EObject jp2up) {
		if (!m2f.equals(umlPackage)) {
			if (!m2f.equals(modifier)) {
				if (!feature.equals(m2f)) {
					if (!feature.equals(umlPackage)) {
						if (!feature.equals(jPackage)) {
							if (!feature.equals(modifier)) {
								if (!feature.equals(jp2up)) {
									if (!bd2ne.equals(m2f)) {
										if (!bd2ne.equals(umlPackage)) {
											if (!bd2ne.equals(feature)) {
												if (!bd2ne.equals(jPackage)) {
													if (!bd2ne.equals(modifier)) {
														if (!bd2ne.equals(bodyDeclaration)) {
															if (!bd2ne.equals(jp2up)) {
																if (!b2e.equals(m2f)) {
																	if (!b2e.equals(umlPackage)) {
																		if (!b2e.equals(feature)) {
																			if (!b2e.equals(bd2ne)) {
																				if (!b2e.equals(jPackage)) {
																					if (!b2e.equals(modifier)) {
																						if (!b2e.equals(
																								bodyDeclaration)) {
																							if (!b2e.equals(jp2up)) {
																								if (!jPackage
																										.equals(m2f)) {
																									if (!jPackage
																											.equals(umlPackage)) {
																										if (!jPackage
																												.equals(modifier)) {
																											if (!jPackage
																													.equals(jp2up)) {
																												if (!modifier
																														.equals(umlPackage)) {
																													if (!bodyDeclaration
																															.equals(m2f)) {
																														if (!bodyDeclaration
																																.equals(umlPackage)) {
																															if (!bodyDeclaration
																																	.equals(feature)) {
																																if (!bodyDeclaration
																																		.equals(jPackage)) {
																																	if (!bodyDeclaration
																																			.equals(modifier)) {
																																		if (!bodyDeclaration
																																				.equals(jp2up)) {
																																			if (!jp2up
																																					.equals(m2f)) {
																																				if (!jp2up
																																						.equals(umlPackage)) {
																																					if (!jp2up
																																							.equals(modifier)) {
																																						return new Object[] {
																																								ruleresult,
																																								m2f,
																																								umlPackage,
																																								feature,
																																								bd2ne,
																																								b2e,
																																								jPackage,
																																								modifier,
																																								bodyDeclaration,
																																								jp2up };
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

	public static final Object[] pattern_EnumDecWithModifier2Enum_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject m2f, EObject umlPackage, EObject feature, EObject bd2ne, EObject b2e,
			EObject jPackage, EObject modifier, EObject bodyDeclaration) {
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jPackage__bodyDeclaration____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnumDecWithModifier2Enum";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String jPackage__bodyDeclaration____ownedElements_name_prime = "ownedElements";
		String bodyDeclaration__jPackage____package_name_prime = "package";
		String m2f__feature____target_name_prime = "target";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String bd2ne__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		String m2f__modifier____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		jPackage__bodyDeclaration____ownedElements.setSrc(jPackage);
		jPackage__bodyDeclaration____ownedElements.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(jPackage__bodyDeclaration____ownedElements);
		bodyDeclaration__jPackage____package.setSrc(bodyDeclaration);
		bodyDeclaration__jPackage____package.setTrg(jPackage);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__jPackage____package);
		m2f__feature____target.setSrc(m2f);
		m2f__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(m2f__feature____target);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		ruleresult.getCreatedEdges().add(umlPackage__feature____packagedElement);
		m2f__modifier____source.setSrc(m2f);
		m2f__modifier____source.setTrg(modifier);
		ruleresult.getCreatedEdges().add(m2f__modifier____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		jPackage__bodyDeclaration____ownedElements.setName(jPackage__bodyDeclaration____ownedElements_name_prime);
		bodyDeclaration__jPackage____package.setName(bodyDeclaration__jPackage____package_name_prime);
		m2f__feature____target.setName(m2f__feature____target_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, umlPackage, feature, bd2ne, b2e, jPackage, modifier, bodyDeclaration,
				bd2ne__bodyDeclaration____source, jPackage__bodyDeclaration____ownedElements,
				bodyDeclaration__jPackage____package, m2f__feature____target, bodyDeclaration__modifier____modifier,
				modifier__bodyDeclaration____bodyDeclaration, bd2ne__feature____target, b2e__bodyDeclaration____source,
				umlPackage__feature____packagedElement, m2f__modifier____source, b2e__feature____target };
	}

	public static final void pattern_EnumDecWithModifier2Enum_1_5_registerobjects_expressionBBBBBBBBBBB(
			EnumDecWithModifier2Enum _this, PerformRuleResult ruleresult, EObject m2f, EObject umlPackage,
			EObject feature, EObject bd2ne, EObject b2e, EObject jPackage, EObject modifier, EObject bodyDeclaration,
			EObject jp2up) {
		_this.registerObjects_FWD(ruleresult, m2f, umlPackage, feature, bd2ne, b2e, jPackage, modifier, bodyDeclaration,
				jp2up);

	}

	public static final PerformRuleResult pattern_EnumDecWithModifier2Enum_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_2_1_preparereturnvalue_bindingFB(
			EnumDecWithModifier2Enum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_2_1_preparereturnvalue_blackFBB(EClass eClass,
			EnumDecWithModifier2Enum _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_2_1_preparereturnvalue_bindingAndBlackFFB(
			EnumDecWithModifier2Enum _this) {
		Object[] result_pattern_EnumDecWithModifier2Enum_2_1_preparereturnvalue_binding = pattern_EnumDecWithModifier2Enum_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnumDecWithModifier2Enum_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_EnumDecWithModifier2Enum_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnumDecWithModifier2Enum_2_1_preparereturnvalue_black = pattern_EnumDecWithModifier2Enum_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_EnumDecWithModifier2Enum_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EnumDecWithModifier2Enum_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "EnumDecWithModifier2Enum";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("jPackage");
		EObject _localVariable_1 = match.getObject("modifier");
		EObject _localVariable_2 = match.getObject("bodyDeclaration");
		EObject tmpJPackage = _localVariable_0;
		EObject tmpModifier = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
			if (tmpModifier instanceof Modifier) {
				Modifier modifier = (Modifier) tmpModifier;
				if (tmpBodyDeclaration instanceof EnumDeclaration) {
					EnumDeclaration bodyDeclaration = (EnumDeclaration) tmpBodyDeclaration;
					return new Object[] { jPackage, modifier, bodyDeclaration, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumDecWithModifier2Enum_2_2_corematch_blackFBBBFB(
			org.eclipse.modisco.java.Package jPackage, Modifier modifier, EnumDeclaration bodyDeclaration,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jPackage,
				JavaPackage2UmlPackage.class, "source")) {
			org.eclipse.uml2.uml.Package umlPackage = jp2up.getTarget();
			if (umlPackage != null) {
				_result.add(new Object[] { umlPackage, jPackage, modifier, bodyDeclaration, jp2up, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnumDecWithModifier2Enum_2_3_findcontext_blackBBBBB(
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration, JavaPackage2UmlPackage jp2up) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jPackage.getOwnedElements().contains(bodyDeclaration)) {
			if (modifier.equals(bodyDeclaration.getModifier())) {
				if (umlPackage.equals(jp2up.getTarget())) {
					if (jPackage.equals(jp2up.getSource())) {
						_result.add(new Object[] { umlPackage, jPackage, modifier, bodyDeclaration, jp2up });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_2_3_findcontext_greenBBBBBFFFFFFF(
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration, JavaPackage2UmlPackage jp2up) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jPackage__bodyDeclaration____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__umlPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__jPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jPackage__bodyDeclaration____ownedElements_name_prime = "ownedElements";
		String bodyDeclaration__jPackage____package_name_prime = "package";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String jp2up__umlPackage____target_name_prime = "target";
		String jp2up__jPackage____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(umlPackage);
		isApplicableMatch.getAllContextElements().add(jPackage);
		isApplicableMatch.getAllContextElements().add(modifier);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jp2up);
		jPackage__bodyDeclaration____ownedElements.setSrc(jPackage);
		jPackage__bodyDeclaration____ownedElements.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jPackage__bodyDeclaration____ownedElements);
		bodyDeclaration__jPackage____package.setSrc(bodyDeclaration);
		bodyDeclaration__jPackage____package.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__jPackage____package);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(modifier__bodyDeclaration____bodyDeclaration);
		jp2up__umlPackage____target.setSrc(jp2up);
		jp2up__umlPackage____target.setTrg(umlPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__umlPackage____target);
		jp2up__jPackage____source.setSrc(jp2up);
		jp2up__jPackage____source.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__jPackage____source);
		jPackage__bodyDeclaration____ownedElements.setName(jPackage__bodyDeclaration____ownedElements_name_prime);
		bodyDeclaration__jPackage____package.setName(bodyDeclaration__jPackage____package_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		jp2up__umlPackage____target.setName(jp2up__umlPackage____target_name_prime);
		jp2up__jPackage____source.setName(jp2up__jPackage____source_name_prime);
		return new Object[] { umlPackage, jPackage, modifier, bodyDeclaration, jp2up, isApplicableMatch,
				jPackage__bodyDeclaration____ownedElements, bodyDeclaration__jPackage____package,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration,
				jp2up__umlPackage____target, jp2up__jPackage____source };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_2_4_solveCSP_bindingFBBBBBBB(
			EnumDecWithModifier2Enum _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration, JavaPackage2UmlPackage jp2up) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, umlPackage, jPackage, modifier,
				bodyDeclaration, jp2up);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, umlPackage, jPackage, modifier, bodyDeclaration,
					jp2up };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			EnumDecWithModifier2Enum _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration, JavaPackage2UmlPackage jp2up) {
		Object[] result_pattern_EnumDecWithModifier2Enum_2_4_solveCSP_binding = pattern_EnumDecWithModifier2Enum_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, umlPackage, jPackage, modifier, bodyDeclaration, jp2up);
		if (result_pattern_EnumDecWithModifier2Enum_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumDecWithModifier2Enum_2_4_solveCSP_binding[0];

			Object[] result_pattern_EnumDecWithModifier2Enum_2_4_solveCSP_black = pattern_EnumDecWithModifier2Enum_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_EnumDecWithModifier2Enum_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, umlPackage, jPackage, modifier, bodyDeclaration,
						jp2up };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDecWithModifier2Enum_2_5_checkCSP_expressionFBB(
			EnumDecWithModifier2Enum _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EnumDecWithModifier2Enum";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EnumDecWithModifier2Enum_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_10_1_initialbindings_blackBBBB(
			EnumDecWithModifier2Enum _this, Match match, org.eclipse.uml2.uml.Package umlPackage, Enumeration feature) {
		return new Object[] { _this, match, umlPackage, feature };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_10_2_SolveCSP_bindingFBBBB(
			EnumDecWithModifier2Enum _this, Match match, org.eclipse.uml2.uml.Package umlPackage, Enumeration feature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, umlPackage, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, umlPackage, feature };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_10_2_SolveCSP_bindingAndBlackFBBBB(
			EnumDecWithModifier2Enum _this, Match match, org.eclipse.uml2.uml.Package umlPackage, Enumeration feature) {
		Object[] result_pattern_EnumDecWithModifier2Enum_10_2_SolveCSP_binding = pattern_EnumDecWithModifier2Enum_10_2_SolveCSP_bindingFBBBB(
				_this, match, umlPackage, feature);
		if (result_pattern_EnumDecWithModifier2Enum_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumDecWithModifier2Enum_10_2_SolveCSP_binding[0];

			Object[] result_pattern_EnumDecWithModifier2Enum_10_2_SolveCSP_black = pattern_EnumDecWithModifier2Enum_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_EnumDecWithModifier2Enum_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, umlPackage, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDecWithModifier2Enum_10_3_CheckCSP_expressionFBB(
			EnumDecWithModifier2Enum _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_10_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.uml2.uml.Package umlPackage, Enumeration feature) {
		return new Object[] { match, umlPackage, feature };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_10_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.uml2.uml.Package umlPackage, Enumeration feature) {
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(feature);
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		match.getToBeTranslatedEdges().add(umlPackage__feature____packagedElement);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		return new Object[] { match, umlPackage, feature, umlPackage__feature____packagedElement };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_10_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.uml2.uml.Package umlPackage, Enumeration feature) {
		return new Object[] { match, umlPackage, feature };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_10_5_collectcontextelements_greenBB(Match match,
			org.eclipse.uml2.uml.Package umlPackage) {
		match.getContextNodes().add(umlPackage);
		return new Object[] { match, umlPackage };
	}

	public static final void pattern_EnumDecWithModifier2Enum_10_6_registerobjectstomatch_expressionBBBB(
			EnumDecWithModifier2Enum _this, Match match, org.eclipse.uml2.uml.Package umlPackage, Enumeration feature) {
		_this.registerObjectsToMatch_BWD(match, umlPackage, feature);

	}

	public static final boolean pattern_EnumDecWithModifier2Enum_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnumDecWithModifier2Enum_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("umlPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("feature");
		EObject _localVariable_2 = isApplicableMatch.getObject("jPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("jp2up");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpJPackage = _localVariable_2;
		EObject tmpJp2up = _localVariable_3;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			if (tmpFeature instanceof Enumeration) {
				Enumeration feature = (Enumeration) tmpFeature;
				if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
					org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
					if (tmpJp2up instanceof JavaPackage2UmlPackage) {
						JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) tmpJp2up;
						return new Object[] { umlPackage, feature, jPackage, jp2up, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_11_1_performtransformation_blackBBBBFBB(
			org.eclipse.uml2.uml.Package umlPackage, Enumeration feature, org.eclipse.modisco.java.Package jPackage,
			JavaPackage2UmlPackage jp2up, EnumDecWithModifier2Enum _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { umlPackage, feature, jPackage, jp2up, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_11_1_performtransformation_bindingAndBlackFFFFFBB(
			EnumDecWithModifier2Enum _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EnumDecWithModifier2Enum_11_1_performtransformation_binding = pattern_EnumDecWithModifier2Enum_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_EnumDecWithModifier2Enum_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result_pattern_EnumDecWithModifier2Enum_11_1_performtransformation_binding[0];
			Enumeration feature = (Enumeration) result_pattern_EnumDecWithModifier2Enum_11_1_performtransformation_binding[1];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result_pattern_EnumDecWithModifier2Enum_11_1_performtransformation_binding[2];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result_pattern_EnumDecWithModifier2Enum_11_1_performtransformation_binding[3];

			Object[] result_pattern_EnumDecWithModifier2Enum_11_1_performtransformation_black = pattern_EnumDecWithModifier2Enum_11_1_performtransformation_blackBBBBFBB(
					umlPackage, feature, jPackage, jp2up, _this, isApplicableMatch);
			if (result_pattern_EnumDecWithModifier2Enum_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnumDecWithModifier2Enum_11_1_performtransformation_black[4];

				return new Object[] { umlPackage, feature, jPackage, jp2up, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_11_1_performtransformation_greenFBFFBFFB(
			Enumeration feature, org.eclipse.modisco.java.Package jPackage, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Modifier modifier = JavaFactory.eINSTANCE.createModifier();
		EnumDeclaration bodyDeclaration = JavaFactory.eINSTANCE.createEnumDeclaration();
		Object _localVariable_0 = csp.getValue("modifier", "visibility");
		Object _localVariable_1 = csp.getValue("bodyDeclaration", "name");
		m2f.setTarget(feature);
		bd2ne.setTarget(feature);
		b2e.setTarget(feature);
		m2f.setSource(modifier);
		bd2ne.setSource(bodyDeclaration);
		jPackage.getOwnedElements().add(bodyDeclaration);
		bodyDeclaration.setModifier(modifier);
		b2e.setSource(bodyDeclaration);
		org.eclipse.modisco.java.VisibilityKind modifier_visibility_prime = (org.eclipse.modisco.java.VisibilityKind) _localVariable_0;
		String bodyDeclaration_name_prime = (String) _localVariable_1;
		modifier.setVisibility(modifier_visibility_prime);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		return new Object[] { m2f, feature, bd2ne, b2e, jPackage, modifier, bodyDeclaration, csp };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_11_2_collecttranslatedelements_blackBBBBBB(
			Modifier2NamedElement m2f, Enumeration feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			Modifier modifier, EnumDeclaration bodyDeclaration) {
		return new Object[] { m2f, feature, bd2ne, b2e, modifier, bodyDeclaration };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_11_2_collecttranslatedelements_greenFBBBBBB(
			Modifier2NamedElement m2f, Enumeration feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			Modifier modifier, EnumDeclaration bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2f);
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedElements().add(modifier);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, m2f, feature, bd2ne, b2e, modifier, bodyDeclaration };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject umlPackage, EObject feature, EObject bd2ne, EObject b2e,
			EObject jPackage, EObject modifier, EObject bodyDeclaration, EObject jp2up) {
		if (!m2f.equals(umlPackage)) {
			if (!m2f.equals(modifier)) {
				if (!feature.equals(m2f)) {
					if (!feature.equals(umlPackage)) {
						if (!feature.equals(jPackage)) {
							if (!feature.equals(modifier)) {
								if (!feature.equals(jp2up)) {
									if (!bd2ne.equals(m2f)) {
										if (!bd2ne.equals(umlPackage)) {
											if (!bd2ne.equals(feature)) {
												if (!bd2ne.equals(jPackage)) {
													if (!bd2ne.equals(modifier)) {
														if (!bd2ne.equals(bodyDeclaration)) {
															if (!bd2ne.equals(jp2up)) {
																if (!b2e.equals(m2f)) {
																	if (!b2e.equals(umlPackage)) {
																		if (!b2e.equals(feature)) {
																			if (!b2e.equals(bd2ne)) {
																				if (!b2e.equals(jPackage)) {
																					if (!b2e.equals(modifier)) {
																						if (!b2e.equals(
																								bodyDeclaration)) {
																							if (!b2e.equals(jp2up)) {
																								if (!jPackage
																										.equals(m2f)) {
																									if (!jPackage
																											.equals(umlPackage)) {
																										if (!jPackage
																												.equals(modifier)) {
																											if (!jPackage
																													.equals(jp2up)) {
																												if (!modifier
																														.equals(umlPackage)) {
																													if (!bodyDeclaration
																															.equals(m2f)) {
																														if (!bodyDeclaration
																																.equals(umlPackage)) {
																															if (!bodyDeclaration
																																	.equals(feature)) {
																																if (!bodyDeclaration
																																		.equals(jPackage)) {
																																	if (!bodyDeclaration
																																			.equals(modifier)) {
																																		if (!bodyDeclaration
																																				.equals(jp2up)) {
																																			if (!jp2up
																																					.equals(m2f)) {
																																				if (!jp2up
																																						.equals(umlPackage)) {
																																					if (!jp2up
																																							.equals(modifier)) {
																																						return new Object[] {
																																								ruleresult,
																																								m2f,
																																								umlPackage,
																																								feature,
																																								bd2ne,
																																								b2e,
																																								jPackage,
																																								modifier,
																																								bodyDeclaration,
																																								jp2up };
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

	public static final Object[] pattern_EnumDecWithModifier2Enum_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject m2f, EObject umlPackage, EObject feature, EObject bd2ne, EObject b2e,
			EObject jPackage, EObject modifier, EObject bodyDeclaration) {
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jPackage__bodyDeclaration____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnumDecWithModifier2Enum";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String jPackage__bodyDeclaration____ownedElements_name_prime = "ownedElements";
		String bodyDeclaration__jPackage____package_name_prime = "package";
		String m2f__feature____target_name_prime = "target";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String bd2ne__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		String m2f__modifier____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		jPackage__bodyDeclaration____ownedElements.setSrc(jPackage);
		jPackage__bodyDeclaration____ownedElements.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(jPackage__bodyDeclaration____ownedElements);
		bodyDeclaration__jPackage____package.setSrc(bodyDeclaration);
		bodyDeclaration__jPackage____package.setTrg(jPackage);
		ruleresult.getCreatedEdges().add(bodyDeclaration__jPackage____package);
		m2f__feature____target.setSrc(m2f);
		m2f__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(m2f__feature____target);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		ruleresult.getCreatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		ruleresult.getTranslatedEdges().add(umlPackage__feature____packagedElement);
		m2f__modifier____source.setSrc(m2f);
		m2f__modifier____source.setTrg(modifier);
		ruleresult.getCreatedEdges().add(m2f__modifier____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		jPackage__bodyDeclaration____ownedElements.setName(jPackage__bodyDeclaration____ownedElements_name_prime);
		bodyDeclaration__jPackage____package.setName(bodyDeclaration__jPackage____package_name_prime);
		m2f__feature____target.setName(m2f__feature____target_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, umlPackage, feature, bd2ne, b2e, jPackage, modifier, bodyDeclaration,
				bd2ne__bodyDeclaration____source, jPackage__bodyDeclaration____ownedElements,
				bodyDeclaration__jPackage____package, m2f__feature____target, bodyDeclaration__modifier____modifier,
				modifier__bodyDeclaration____bodyDeclaration, bd2ne__feature____target, b2e__bodyDeclaration____source,
				umlPackage__feature____packagedElement, m2f__modifier____source, b2e__feature____target };
	}

	public static final void pattern_EnumDecWithModifier2Enum_11_5_registerobjects_expressionBBBBBBBBBBB(
			EnumDecWithModifier2Enum _this, PerformRuleResult ruleresult, EObject m2f, EObject umlPackage,
			EObject feature, EObject bd2ne, EObject b2e, EObject jPackage, EObject modifier, EObject bodyDeclaration,
			EObject jp2up) {
		_this.registerObjects_BWD(ruleresult, m2f, umlPackage, feature, bd2ne, b2e, jPackage, modifier, bodyDeclaration,
				jp2up);

	}

	public static final PerformRuleResult pattern_EnumDecWithModifier2Enum_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_12_1_preparereturnvalue_bindingFB(
			EnumDecWithModifier2Enum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_12_1_preparereturnvalue_blackFBB(EClass eClass,
			EnumDecWithModifier2Enum _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_12_1_preparereturnvalue_bindingAndBlackFFB(
			EnumDecWithModifier2Enum _this) {
		Object[] result_pattern_EnumDecWithModifier2Enum_12_1_preparereturnvalue_binding = pattern_EnumDecWithModifier2Enum_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnumDecWithModifier2Enum_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_EnumDecWithModifier2Enum_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnumDecWithModifier2Enum_12_1_preparereturnvalue_black = pattern_EnumDecWithModifier2Enum_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_EnumDecWithModifier2Enum_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EnumDecWithModifier2Enum_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "EnumDecWithModifier2Enum";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("umlPackage");
		EObject _localVariable_1 = match.getObject("feature");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			if (tmpFeature instanceof Enumeration) {
				Enumeration feature = (Enumeration) tmpFeature;
				return new Object[] { umlPackage, feature, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumDecWithModifier2Enum_12_2_corematch_blackBBFFB(
			org.eclipse.uml2.uml.Package umlPackage, Enumeration feature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(umlPackage, JavaPackage2UmlPackage.class, "target")) {
			org.eclipse.modisco.java.Package jPackage = jp2up.getSource();
			if (jPackage != null) {
				_result.add(new Object[] { umlPackage, feature, jPackage, jp2up, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnumDecWithModifier2Enum_12_3_findcontext_blackBBBB(
			org.eclipse.uml2.uml.Package umlPackage, Enumeration feature, org.eclipse.modisco.java.Package jPackage,
			JavaPackage2UmlPackage jp2up) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (umlPackage.getPackagedElements().contains(feature)) {
			if (umlPackage.equals(jp2up.getTarget())) {
				if (jPackage.equals(jp2up.getSource())) {
					_result.add(new Object[] { umlPackage, feature, jPackage, jp2up });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_12_3_findcontext_greenBBBBFFFF(
			org.eclipse.uml2.uml.Package umlPackage, Enumeration feature, org.eclipse.modisco.java.Package jPackage,
			JavaPackage2UmlPackage jp2up) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__umlPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__jPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		String jp2up__umlPackage____target_name_prime = "target";
		String jp2up__jPackage____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(umlPackage);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(jPackage);
		isApplicableMatch.getAllContextElements().add(jp2up);
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(umlPackage__feature____packagedElement);
		jp2up__umlPackage____target.setSrc(jp2up);
		jp2up__umlPackage____target.setTrg(umlPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__umlPackage____target);
		jp2up__jPackage____source.setSrc(jp2up);
		jp2up__jPackage____source.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__jPackage____source);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		jp2up__umlPackage____target.setName(jp2up__umlPackage____target_name_prime);
		jp2up__jPackage____source.setName(jp2up__jPackage____source_name_prime);
		return new Object[] { umlPackage, feature, jPackage, jp2up, isApplicableMatch,
				umlPackage__feature____packagedElement, jp2up__umlPackage____target, jp2up__jPackage____source };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_12_4_solveCSP_bindingFBBBBBB(
			EnumDecWithModifier2Enum _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, Enumeration feature, org.eclipse.modisco.java.Package jPackage,
			JavaPackage2UmlPackage jp2up) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, umlPackage, feature, jPackage, jp2up);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, umlPackage, feature, jPackage, jp2up };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_12_4_solveCSP_bindingAndBlackFBBBBBB(
			EnumDecWithModifier2Enum _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, Enumeration feature, org.eclipse.modisco.java.Package jPackage,
			JavaPackage2UmlPackage jp2up) {
		Object[] result_pattern_EnumDecWithModifier2Enum_12_4_solveCSP_binding = pattern_EnumDecWithModifier2Enum_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, umlPackage, feature, jPackage, jp2up);
		if (result_pattern_EnumDecWithModifier2Enum_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumDecWithModifier2Enum_12_4_solveCSP_binding[0];

			Object[] result_pattern_EnumDecWithModifier2Enum_12_4_solveCSP_black = pattern_EnumDecWithModifier2Enum_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_EnumDecWithModifier2Enum_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, umlPackage, feature, jPackage, jp2up };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDecWithModifier2Enum_12_5_checkCSP_expressionFBB(
			EnumDecWithModifier2Enum _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EnumDecWithModifier2Enum";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EnumDecWithModifier2Enum_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_20_1_preparereturnvalue_bindingFB(
			EnumDecWithModifier2Enum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			EnumDecWithModifier2Enum _this) {
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

	public static final Object[] pattern_EnumDecWithModifier2Enum_20_1_preparereturnvalue_bindingAndBlackFFBF(
			EnumDecWithModifier2Enum _this) {
		Object[] result_pattern_EnumDecWithModifier2Enum_20_1_preparereturnvalue_binding = pattern_EnumDecWithModifier2Enum_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnumDecWithModifier2Enum_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_EnumDecWithModifier2Enum_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnumDecWithModifier2Enum_20_1_preparereturnvalue_black = pattern_EnumDecWithModifier2Enum_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_EnumDecWithModifier2Enum_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EnumDecWithModifier2Enum_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_EnumDecWithModifier2Enum_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_20_2_testcorematchandDECs_black_nac_0B(
			Enumeration feature) {
		for (org.eclipse.uml2.uml.Class __DEC_feature_nestedClassifier_962222 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Class.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_20_2_testcorematchandDECs_black_nac_1B(
			Enumeration feature) {
		for (Interface __DEC_feature_nestedClassifier_920801 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, Interface.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumDecWithModifier2Enum_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUmlPackage = _edge_packagedElement.getSrc();
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			EObject tmpFeature = _edge_packagedElement.getTrg();
			if (tmpFeature instanceof Enumeration) {
				Enumeration feature = (Enumeration) tmpFeature;
				if (umlPackage.getPackagedElements().contains(feature)) {
					if (pattern_EnumDecWithModifier2Enum_20_2_testcorematchandDECs_black_nac_0B(feature) == null) {
						if (pattern_EnumDecWithModifier2Enum_20_2_testcorematchandDECs_black_nac_1B(feature) == null) {
							_result.add(new Object[] { umlPackage, feature, _edge_packagedElement });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EnumDecWithModifier2Enum_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			EnumDecWithModifier2Enum _this, Match match, org.eclipse.uml2.uml.Package umlPackage, Enumeration feature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, umlPackage, feature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EnumDecWithModifier2Enum_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			EnumDecWithModifier2Enum _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_EnumDecWithModifier2Enum_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_21_1_preparereturnvalue_bindingFB(
			EnumDecWithModifier2Enum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			EnumDecWithModifier2Enum _this) {
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

	public static final Object[] pattern_EnumDecWithModifier2Enum_21_1_preparereturnvalue_bindingAndBlackFFBF(
			EnumDecWithModifier2Enum _this) {
		Object[] result_pattern_EnumDecWithModifier2Enum_21_1_preparereturnvalue_binding = pattern_EnumDecWithModifier2Enum_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnumDecWithModifier2Enum_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_EnumDecWithModifier2Enum_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnumDecWithModifier2Enum_21_1_preparereturnvalue_black = pattern_EnumDecWithModifier2Enum_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_EnumDecWithModifier2Enum_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EnumDecWithModifier2Enum_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_EnumDecWithModifier2Enum_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_21_2_testcorematchandDECs_black_nac_0B(
			EnumDeclaration bodyDeclaration) {
		AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_313855 = bodyDeclaration
				.getAbstractTypeDeclaration();
		if (__DEC_bodyDeclaration_bodyDeclarations_313855 != null) {
			if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_313855)) {
				return new Object[] { bodyDeclaration };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_21_2_testcorematchandDECs_black_nac_1B(
			EnumDeclaration bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_50266 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_50266 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_21_2_testcorematchandDECs_black_nac_2B(
			EnumDeclaration bodyDeclaration) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_584390 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { bodyDeclaration };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumDecWithModifier2Enum_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_ownedElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJPackage = _edge_ownedElements.getSrc();
		if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
			EObject tmpBodyDeclaration = _edge_ownedElements.getTrg();
			if (tmpBodyDeclaration instanceof EnumDeclaration) {
				EnumDeclaration bodyDeclaration = (EnumDeclaration) tmpBodyDeclaration;
				if (jPackage.getOwnedElements().contains(bodyDeclaration)) {
					Modifier modifier = bodyDeclaration.getModifier();
					if (modifier != null) {
						if (pattern_EnumDecWithModifier2Enum_21_2_testcorematchandDECs_black_nac_0B(
								bodyDeclaration) == null) {
							if (pattern_EnumDecWithModifier2Enum_21_2_testcorematchandDECs_black_nac_1B(
									bodyDeclaration) == null) {
								if (pattern_EnumDecWithModifier2Enum_21_2_testcorematchandDECs_black_nac_2B(
										bodyDeclaration) == null) {
									_result.add(
											new Object[] { jPackage, modifier, bodyDeclaration, _edge_ownedElements });
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EnumDecWithModifier2Enum_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			EnumDecWithModifier2Enum _this, Match match, org.eclipse.modisco.java.Package jPackage, Modifier modifier,
			EnumDeclaration bodyDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jPackage, modifier, bodyDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EnumDecWithModifier2Enum_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			EnumDecWithModifier2Enum _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_EnumDecWithModifier2Enum_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_24_1_prepare_blackB(EnumDecWithModifier2Enum _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_24_2_matchsrctrgcontext_bindingFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("umlPackage");
		EObject _localVariable_1 = targetMatch.getObject("feature");
		EObject _localVariable_2 = sourceMatch.getObject("jPackage");
		EObject _localVariable_3 = sourceMatch.getObject("modifier");
		EObject _localVariable_4 = sourceMatch.getObject("bodyDeclaration");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpJPackage = _localVariable_2;
		EObject tmpModifier = _localVariable_3;
		EObject tmpBodyDeclaration = _localVariable_4;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			if (tmpFeature instanceof Enumeration) {
				Enumeration feature = (Enumeration) tmpFeature;
				if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
					org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
					if (tmpModifier instanceof Modifier) {
						Modifier modifier = (Modifier) tmpModifier;
						if (tmpBodyDeclaration instanceof EnumDeclaration) {
							EnumDeclaration bodyDeclaration = (EnumDeclaration) tmpBodyDeclaration;
							return new Object[] { umlPackage, feature, jPackage, modifier, bodyDeclaration, targetMatch,
									sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_24_2_matchsrctrgcontext_blackBBBBBBB(
			org.eclipse.uml2.uml.Package umlPackage, Enumeration feature, org.eclipse.modisco.java.Package jPackage,
			Modifier modifier, EnumDeclaration bodyDeclaration, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { umlPackage, feature, jPackage, modifier, bodyDeclaration, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_EnumDecWithModifier2Enum_24_2_matchsrctrgcontext_binding = pattern_EnumDecWithModifier2Enum_24_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_EnumDecWithModifier2Enum_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result_pattern_EnumDecWithModifier2Enum_24_2_matchsrctrgcontext_binding[0];
			Enumeration feature = (Enumeration) result_pattern_EnumDecWithModifier2Enum_24_2_matchsrctrgcontext_binding[1];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result_pattern_EnumDecWithModifier2Enum_24_2_matchsrctrgcontext_binding[2];
			Modifier modifier = (Modifier) result_pattern_EnumDecWithModifier2Enum_24_2_matchsrctrgcontext_binding[3];
			EnumDeclaration bodyDeclaration = (EnumDeclaration) result_pattern_EnumDecWithModifier2Enum_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_EnumDecWithModifier2Enum_24_2_matchsrctrgcontext_black = pattern_EnumDecWithModifier2Enum_24_2_matchsrctrgcontext_blackBBBBBBB(
					umlPackage, feature, jPackage, modifier, bodyDeclaration, sourceMatch, targetMatch);
			if (result_pattern_EnumDecWithModifier2Enum_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { umlPackage, feature, jPackage, modifier, bodyDeclaration, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_24_3_solvecsp_bindingFBBBBBBBB(
			EnumDecWithModifier2Enum _this, org.eclipse.uml2.uml.Package umlPackage, Enumeration feature,
			org.eclipse.modisco.java.Package jPackage, Modifier modifier, EnumDeclaration bodyDeclaration,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(umlPackage, feature, jPackage, modifier, bodyDeclaration,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, umlPackage, feature, jPackage, modifier, bodyDeclaration, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			EnumDecWithModifier2Enum _this, org.eclipse.uml2.uml.Package umlPackage, Enumeration feature,
			org.eclipse.modisco.java.Package jPackage, Modifier modifier, EnumDeclaration bodyDeclaration,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_EnumDecWithModifier2Enum_24_3_solvecsp_binding = pattern_EnumDecWithModifier2Enum_24_3_solvecsp_bindingFBBBBBBBB(
				_this, umlPackage, feature, jPackage, modifier, bodyDeclaration, sourceMatch, targetMatch);
		if (result_pattern_EnumDecWithModifier2Enum_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_EnumDecWithModifier2Enum_24_3_solvecsp_binding[0];

			Object[] result_pattern_EnumDecWithModifier2Enum_24_3_solvecsp_black = pattern_EnumDecWithModifier2Enum_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_EnumDecWithModifier2Enum_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, umlPackage, feature, jPackage, modifier, bodyDeclaration, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDecWithModifier2Enum_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnumDecWithModifier2Enum_24_5_matchcorrcontext_blackBBFBB(
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(umlPackage, JavaPackage2UmlPackage.class, "target")) {
				if (jPackage.equals(jp2up.getSource())) {
					_result.add(new Object[] { umlPackage, jPackage, jp2up, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_24_5_matchcorrcontext_greenBBBF(
			JavaPackage2UmlPackage jp2up, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "EnumDecWithModifier2Enum";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(jp2up);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { jp2up, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_24_6_createcorrespondence_blackBBBBBB(
			org.eclipse.uml2.uml.Package umlPackage, Enumeration feature, org.eclipse.modisco.java.Package jPackage,
			Modifier modifier, EnumDeclaration bodyDeclaration, CCMatch ccMatch) {
		return new Object[] { umlPackage, feature, jPackage, modifier, bodyDeclaration, ccMatch };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_24_6_createcorrespondence_greenFBFFBBB(
			Enumeration feature, Modifier modifier, EnumDeclaration bodyDeclaration, CCMatch ccMatch) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		m2f.setTarget(feature);
		m2f.setSource(modifier);
		ccMatch.getCreateCorr().add(m2f);
		bd2ne.setSource(bodyDeclaration);
		bd2ne.setTarget(feature);
		ccMatch.getCreateCorr().add(bd2ne);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		ccMatch.getCreateCorr().add(b2e);
		return new Object[] { m2f, feature, bd2ne, b2e, modifier, bodyDeclaration, ccMatch };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "EnumDecWithModifier2Enum";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_EnumDecWithModifier2Enum_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_27_1_matchtggpattern_black_nac_0B(
			EnumDeclaration bodyDeclaration) {
		AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_940700 = bodyDeclaration
				.getAbstractTypeDeclaration();
		if (__DEC_bodyDeclaration_bodyDeclarations_940700 != null) {
			if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_940700)) {
				return new Object[] { bodyDeclaration };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_27_1_matchtggpattern_black_nac_1B(
			EnumDeclaration bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_851302 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_851302 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_27_1_matchtggpattern_black_nac_2B(
			EnumDeclaration bodyDeclaration) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_435443 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_27_1_matchtggpattern_blackBBB(
			org.eclipse.modisco.java.Package jPackage, Modifier modifier, EnumDeclaration bodyDeclaration) {
		if (jPackage.getOwnedElements().contains(bodyDeclaration)) {
			if (modifier.equals(bodyDeclaration.getModifier())) {
				if (pattern_EnumDecWithModifier2Enum_27_1_matchtggpattern_black_nac_0B(bodyDeclaration) == null) {
					if (pattern_EnumDecWithModifier2Enum_27_1_matchtggpattern_black_nac_1B(bodyDeclaration) == null) {
						if (pattern_EnumDecWithModifier2Enum_27_1_matchtggpattern_black_nac_2B(
								bodyDeclaration) == null) {
							return new Object[] { jPackage, modifier, bodyDeclaration };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDecWithModifier2Enum_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnumDecWithModifier2Enum_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_28_1_matchtggpattern_black_nac_0B(
			Enumeration feature) {
		for (org.eclipse.uml2.uml.Class __DEC_feature_nestedClassifier_409720 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Class.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_28_1_matchtggpattern_black_nac_1B(
			Enumeration feature) {
		for (Interface __DEC_feature_nestedClassifier_159080 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, Interface.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_28_1_matchtggpattern_blackBB(
			org.eclipse.uml2.uml.Package umlPackage, Enumeration feature) {
		if (umlPackage.getPackagedElements().contains(feature)) {
			if (pattern_EnumDecWithModifier2Enum_28_1_matchtggpattern_black_nac_0B(feature) == null) {
				if (pattern_EnumDecWithModifier2Enum_28_1_matchtggpattern_black_nac_1B(feature) == null) {
					return new Object[] { umlPackage, feature };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDecWithModifier2Enum_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnumDecWithModifier2Enum_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_29_1_createresult_blackB(
			EnumDecWithModifier2Enum _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Package umlPackage) {
		if (ruleResult.getTargetObjects().contains(umlPackage)) {
			return new Object[] { ruleResult, umlPackage };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, JavaPackage2UmlPackage jp2up) {
		if (ruleResult.getCorrObjects().contains(jp2up)) {
			return new Object[] { ruleResult, jp2up };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package jPackage) {
		if (ruleResult.getSourceObjects().contains(jPackage)) {
			return new Object[] { ruleResult, jPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumDecWithModifier2Enum_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList jp2upList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpJp2up : jp2upList.getEntryObjects()) {
				if (tmpJp2up instanceof JavaPackage2UmlPackage) {
					JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) tmpJp2up;
					org.eclipse.uml2.uml.Package umlPackage = jp2up.getTarget();
					if (umlPackage != null) {
						org.eclipse.modisco.java.Package jPackage = jp2up.getSource();
						if (jPackage != null) {
							if (pattern_EnumDecWithModifier2Enum_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									jp2up) == null) {
								if (pattern_EnumDecWithModifier2Enum_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										umlPackage) == null) {
									if (pattern_EnumDecWithModifier2Enum_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											jPackage) == null) {
										_result.add(new Object[] { jp2upList, umlPackage, jp2up, jPackage,
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

	public static final Object[] pattern_EnumDecWithModifier2Enum_29_3_solveCSP_bindingFBBBBBB(
			EnumDecWithModifier2Enum _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage,
			JavaPackage2UmlPackage jp2up, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, umlPackage, jPackage, jp2up,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, umlPackage, jPackage, jp2up, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_29_3_solveCSP_bindingAndBlackFBBBBBB(
			EnumDecWithModifier2Enum _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage,
			JavaPackage2UmlPackage jp2up, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_EnumDecWithModifier2Enum_29_3_solveCSP_binding = pattern_EnumDecWithModifier2Enum_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, umlPackage, jPackage, jp2up, ruleResult);
		if (result_pattern_EnumDecWithModifier2Enum_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumDecWithModifier2Enum_29_3_solveCSP_binding[0];

			Object[] result_pattern_EnumDecWithModifier2Enum_29_3_solveCSP_black = pattern_EnumDecWithModifier2Enum_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_EnumDecWithModifier2Enum_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, umlPackage, jPackage, jp2up, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDecWithModifier2Enum_29_4_checkCSP_expressionFBB(
			EnumDecWithModifier2Enum _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_29_5_checknacs_blackBBB(
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage,
			JavaPackage2UmlPackage jp2up) {
		return new Object[] { umlPackage, jPackage, jp2up };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_29_6_perform_blackBBBB(
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage,
			JavaPackage2UmlPackage jp2up, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { umlPackage, jPackage, jp2up, ruleResult };
	}

	public static final Object[] pattern_EnumDecWithModifier2Enum_29_6_perform_greenFBFFFBFFBB(
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		Enumeration feature = UMLFactory.eINSTANCE.createEnumeration();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Modifier modifier = JavaFactory.eINSTANCE.createModifier();
		EnumDeclaration bodyDeclaration = JavaFactory.eINSTANCE.createEnumDeclaration();
		Object _localVariable_0 = csp.getValue("feature", "visibility");
		Object _localVariable_1 = csp.getValue("feature", "name");
		Object _localVariable_2 = csp.getValue("modifier", "visibility");
		Object _localVariable_3 = csp.getValue("bodyDeclaration", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(m2f);
		m2f.setTarget(feature);
		umlPackage.getPackagedElements().add(feature);
		ruleResult.getTargetObjects().add(feature);
		bd2ne.setTarget(feature);
		ruleResult.getCorrObjects().add(bd2ne);
		b2e.setTarget(feature);
		ruleResult.getCorrObjects().add(b2e);
		m2f.setSource(modifier);
		ruleResult.getSourceObjects().add(modifier);
		bd2ne.setSource(bodyDeclaration);
		jPackage.getOwnedElements().add(bodyDeclaration);
		bodyDeclaration.setModifier(modifier);
		b2e.setSource(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_0;
		String feature_name_prime = (String) _localVariable_1;
		org.eclipse.modisco.java.VisibilityKind modifier_visibility_prime = (org.eclipse.modisco.java.VisibilityKind) _localVariable_2;
		String bodyDeclaration_name_prime = (String) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		feature.setVisibility(feature_visibility_prime);
		feature.setName(feature_name_prime);
		modifier.setVisibility(modifier_visibility_prime);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { m2f, umlPackage, feature, bd2ne, b2e, jPackage, modifier, bodyDeclaration, ruleResult,
				csp };
	}

	public static final ModelgeneratorRuleResult pattern_EnumDecWithModifier2Enum_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EnumDecWithModifier2EnumImpl
