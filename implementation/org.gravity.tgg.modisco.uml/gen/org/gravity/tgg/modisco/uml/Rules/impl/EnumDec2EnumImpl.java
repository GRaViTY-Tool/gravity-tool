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

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage;
import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.EnumDec2Enum;
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
 * An implementation of the model object '<em><b>Enum Dec2 Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EnumDec2EnumImpl extends AbstractRuleImpl implements EnumDec2Enum {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumDec2EnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEnumDec2Enum();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, EnumDeclaration bodyDeclaration,
			org.eclipse.modisco.java.Package jPackage) {

		Object[] result1_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_0_1_initialbindings_blackBBBB(this, match,
				bodyDeclaration, jPackage);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jPackage] = "
					+ jPackage + ".");
		}

		Object[] result2_bindingAndBlack = EnumDec2EnumImpl.pattern_EnumDec2Enum_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, bodyDeclaration, jPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jPackage] = "
					+ jPackage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (EnumDec2EnumImpl.pattern_EnumDec2Enum_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = EnumDec2EnumImpl
					.pattern_EnumDec2Enum_0_4_collectelementstobetranslated_blackBBB(match, bodyDeclaration, jPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jPackage] = " + jPackage + ".");
			}
			EnumDec2EnumImpl.pattern_EnumDec2Enum_0_4_collectelementstobetranslated_greenBBBFF(match, bodyDeclaration,
					jPackage);
			//nothing EMoflonEdge jPackage__bodyDeclaration____ownedElements = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge bodyDeclaration__jPackage____package = (EMoflonEdge) result4_green[4];

			Object[] result5_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_0_5_collectcontextelements_blackBBB(match,
					bodyDeclaration, jPackage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jPackage] = " + jPackage + ".");
			}
			EnumDec2EnumImpl.pattern_EnumDec2Enum_0_5_collectcontextelements_greenBB(match, jPackage);

			// 
			EnumDec2EnumImpl.pattern_EnumDec2Enum_0_6_registerobjectstomatch_expressionBBBB(this, match,
					bodyDeclaration, jPackage);
			return EnumDec2EnumImpl.pattern_EnumDec2Enum_0_7_expressionF();
		} else {
			return EnumDec2EnumImpl.pattern_EnumDec2Enum_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = EnumDec2EnumImpl
				.pattern_EnumDec2Enum_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result1_bindingAndBlack[0];
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[1];
		EnumDeclaration bodyDeclaration = (EnumDeclaration) result1_bindingAndBlack[2];
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = EnumDec2EnumImpl.pattern_EnumDec2Enum_1_1_performtransformation_greenFFFBBB(umlPackage,
				bodyDeclaration, csp);
		ASTNode2Element b2e = (ASTNode2Element) result1_green[0];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[1];
		Enumeration feature = (Enumeration) result1_green[2];

		Object[] result2_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_1_2_collecttranslatedelements_blackBBBB(b2e,
				bd2ne, feature, bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[b2e] = " + b2e + ", " + "[bd2ne] = " + bd2ne + ", "
							+ "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = EnumDec2EnumImpl.pattern_EnumDec2Enum_1_2_collecttranslatedelements_greenFBBBB(b2e,
				bd2ne, feature, bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
				b2e, bd2ne, feature, jp2up, umlPackage, bodyDeclaration, jPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2e] = " + b2e + ", " + "[bd2ne] = " + bd2ne + ", " + "[feature] = " + feature + ", "
					+ "[jp2up] = " + jp2up + ", " + "[umlPackage] = " + umlPackage + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[jPackage] = " + jPackage + ".");
		}
		EnumDec2EnumImpl.pattern_EnumDec2Enum_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult, b2e, bd2ne,
				feature, umlPackage, bodyDeclaration, jPackage);
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge jPackage__bodyDeclaration____ownedElements = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge bodyDeclaration__jPackage____package = (EMoflonEdge) result3_green[13];

		// 
		// 
		EnumDec2EnumImpl.pattern_EnumDec2Enum_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, b2e, bd2ne,
				feature, jp2up, umlPackage, bodyDeclaration, jPackage);
		return EnumDec2EnumImpl.pattern_EnumDec2Enum_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = EnumDec2EnumImpl
				.pattern_EnumDec2Enum_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EnumDec2EnumImpl.pattern_EnumDec2Enum_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = EnumDec2EnumImpl.pattern_EnumDec2Enum_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		EnumDeclaration bodyDeclaration = (EnumDeclaration) result2_binding[0];
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_binding[1];
		for (Object[] result2_black : EnumDec2EnumImpl.pattern_EnumDec2Enum_2_2_corematch_blackFFBBB(bodyDeclaration,
				jPackage, match)) {
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result2_black[0];
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_black[1];
			// ForEach 
			for (Object[] result3_black : EnumDec2EnumImpl.pattern_EnumDec2Enum_2_3_findcontext_blackBBBB(jp2up,
					umlPackage, bodyDeclaration, jPackage)) {
				Object[] result3_green = EnumDec2EnumImpl.pattern_EnumDec2Enum_2_3_findcontext_greenBBBBFFFFF(jp2up,
						umlPackage, bodyDeclaration, jPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge jp2up__umlPackage____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge jp2up__jPackage____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jPackage__bodyDeclaration____ownedElements = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge bodyDeclaration__jPackage____package = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = EnumDec2EnumImpl
						.pattern_EnumDec2Enum_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, jp2up,
								umlPackage, bodyDeclaration, jPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jp2up] = " + jp2up + ", "
							+ "[umlPackage] = " + umlPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[jPackage] = " + jPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (EnumDec2EnumImpl.pattern_EnumDec2Enum_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = EnumDec2EnumImpl
							.pattern_EnumDec2Enum_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					EnumDec2EnumImpl.pattern_EnumDec2Enum_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return EnumDec2EnumImpl.pattern_EnumDec2Enum_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, EnumDeclaration bodyDeclaration,
			org.eclipse.modisco.java.Package jPackage) {
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("jPackage", jPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, EnumDeclaration bodyDeclaration,
			org.eclipse.modisco.java.Package jPackage) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Package umlPackage, EnumDeclaration bodyDeclaration,
			org.eclipse.modisco.java.Package jPackage) {// Create CSP
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
		isApplicableMatch.registerObject("jp2up", jp2up);
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("jPackage", jPackage);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject b2e, EObject bd2ne, EObject feature,
			EObject jp2up, EObject umlPackage, EObject bodyDeclaration, EObject jPackage) {
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("jp2up", jp2up);
		ruleresult.registerObject("umlPackage", umlPackage);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("jPackage", jPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
				.equals("java.EnumDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Enumeration feature, org.eclipse.uml2.uml.Package umlPackage) {

		Object[] result1_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_10_1_initialbindings_blackBBBB(this, match,
				feature, umlPackage);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[umlPackage] = " + umlPackage + ".");
		}

		Object[] result2_bindingAndBlack = EnumDec2EnumImpl
				.pattern_EnumDec2Enum_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, feature, umlPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[umlPackage] = " + umlPackage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (EnumDec2EnumImpl.pattern_EnumDec2Enum_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = EnumDec2EnumImpl
					.pattern_EnumDec2Enum_10_4_collectelementstobetranslated_blackBBB(match, feature, umlPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[umlPackage] = " + umlPackage + ".");
			}
			EnumDec2EnumImpl.pattern_EnumDec2Enum_10_4_collectelementstobetranslated_greenBBBF(match, feature,
					umlPackage);
			//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result4_green[3];

			Object[] result5_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_10_5_collectcontextelements_blackBBB(match,
					feature, umlPackage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[umlPackage] = " + umlPackage + ".");
			}
			EnumDec2EnumImpl.pattern_EnumDec2Enum_10_5_collectcontextelements_greenBB(match, umlPackage);

			// 
			EnumDec2EnumImpl.pattern_EnumDec2Enum_10_6_registerobjectstomatch_expressionBBBB(this, match, feature,
					umlPackage);
			return EnumDec2EnumImpl.pattern_EnumDec2Enum_10_7_expressionF();
		} else {
			return EnumDec2EnumImpl.pattern_EnumDec2Enum_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = EnumDec2EnumImpl
				.pattern_EnumDec2Enum_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Enumeration feature = (Enumeration) result1_bindingAndBlack[0];
		JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result1_bindingAndBlack[1];
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[2];
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = EnumDec2EnumImpl.pattern_EnumDec2Enum_11_1_performtransformation_greenFFBFBB(feature,
				jPackage, csp);
		ASTNode2Element b2e = (ASTNode2Element) result1_green[0];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[1];
		EnumDeclaration bodyDeclaration = (EnumDeclaration) result1_green[3];

		Object[] result2_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_11_2_collecttranslatedelements_blackBBBB(b2e,
				bd2ne, feature, bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[b2e] = " + b2e + ", " + "[bd2ne] = " + bd2ne + ", "
							+ "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = EnumDec2EnumImpl.pattern_EnumDec2Enum_11_2_collecttranslatedelements_greenFBBBB(b2e,
				bd2ne, feature, bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_11_3_bookkeepingforedges_blackBBBBBBBB(
				ruleresult, b2e, bd2ne, feature, jp2up, umlPackage, bodyDeclaration, jPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2e] = " + b2e + ", " + "[bd2ne] = " + bd2ne + ", " + "[feature] = " + feature + ", "
					+ "[jp2up] = " + jp2up + ", " + "[umlPackage] = " + umlPackage + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[jPackage] = " + jPackage + ".");
		}
		EnumDec2EnumImpl.pattern_EnumDec2Enum_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult, b2e, bd2ne,
				feature, umlPackage, bodyDeclaration, jPackage);
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge jPackage__bodyDeclaration____ownedElements = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge bodyDeclaration__jPackage____package = (EMoflonEdge) result3_green[13];

		// 
		// 
		EnumDec2EnumImpl.pattern_EnumDec2Enum_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, b2e, bd2ne,
				feature, jp2up, umlPackage, bodyDeclaration, jPackage);
		return EnumDec2EnumImpl.pattern_EnumDec2Enum_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = EnumDec2EnumImpl
				.pattern_EnumDec2Enum_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EnumDec2EnumImpl
				.pattern_EnumDec2Enum_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = EnumDec2EnumImpl.pattern_EnumDec2Enum_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Enumeration feature = (Enumeration) result2_binding[0];
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_binding[1];
		for (Object[] result2_black : EnumDec2EnumImpl.pattern_EnumDec2Enum_12_2_corematch_blackBFBFB(feature,
				umlPackage, match)) {
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result2_black[1];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_black[3];
			// ForEach 
			for (Object[] result3_black : EnumDec2EnumImpl.pattern_EnumDec2Enum_12_3_findcontext_blackBBBB(feature,
					jp2up, umlPackage, jPackage)) {
				Object[] result3_green = EnumDec2EnumImpl.pattern_EnumDec2Enum_12_3_findcontext_greenBBBBFFFF(feature,
						jp2up, umlPackage, jPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge jp2up__umlPackage____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jp2up__jPackage____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = EnumDec2EnumImpl
						.pattern_EnumDec2Enum_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, feature,
								jp2up, umlPackage, jPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[jp2up] = " + jp2up + ", " + "[umlPackage] = " + umlPackage + ", " + "[jPackage] = "
							+ jPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (EnumDec2EnumImpl.pattern_EnumDec2Enum_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = EnumDec2EnumImpl
							.pattern_EnumDec2Enum_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					EnumDec2EnumImpl.pattern_EnumDec2Enum_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return EnumDec2EnumImpl.pattern_EnumDec2Enum_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Enumeration feature, org.eclipse.uml2.uml.Package umlPackage) {
		match.registerObject("feature", feature);
		match.registerObject("umlPackage", umlPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Enumeration feature, org.eclipse.uml2.uml.Package umlPackage) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Enumeration feature,
			JavaPackage2UmlPackage jp2up, org.eclipse.uml2.uml.Package umlPackage,
			org.eclipse.modisco.java.Package jPackage) {// Create CSP
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
		isApplicableMatch.registerObject("jp2up", jp2up);
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("jPackage", jPackage);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject b2e, EObject bd2ne, EObject feature,
			EObject jp2up, EObject umlPackage, EObject bodyDeclaration, EObject jPackage) {
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("jp2up", jp2up);
		ruleresult.registerObject("umlPackage", umlPackage);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("jPackage", jPackage);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_302(EMoflonEdge _edge_packagedElement) {

		Object[] result1_bindingAndBlack = EnumDec2EnumImpl
				.pattern_EnumDec2Enum_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = EnumDec2EnumImpl.pattern_EnumDec2Enum_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : EnumDec2EnumImpl
				.pattern_EnumDec2Enum_20_2_testcorematchandDECs_blackFFB(_edge_packagedElement)) {
			Enumeration feature = (Enumeration) result2_black[0];
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_black[1];
			Object[] result2_green = EnumDec2EnumImpl.pattern_EnumDec2Enum_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (EnumDec2EnumImpl.pattern_EnumDec2Enum_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
					this, match, feature, umlPackage)) {
				// 
				if (EnumDec2EnumImpl
						.pattern_EnumDec2Enum_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_20_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					EnumDec2EnumImpl.pattern_EnumDec2Enum_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return EnumDec2EnumImpl.pattern_EnumDec2Enum_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_311(EMoflonEdge _edge_ownedElements) {

		Object[] result1_bindingAndBlack = EnumDec2EnumImpl
				.pattern_EnumDec2Enum_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = EnumDec2EnumImpl.pattern_EnumDec2Enum_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : EnumDec2EnumImpl
				.pattern_EnumDec2Enum_21_2_testcorematchandDECs_blackFFB(_edge_ownedElements)) {
			EnumDeclaration bodyDeclaration = (EnumDeclaration) result2_black[0];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_black[1];
			Object[] result2_green = EnumDec2EnumImpl.pattern_EnumDec2Enum_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (EnumDec2EnumImpl.pattern_EnumDec2Enum_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
					this, match, bodyDeclaration, jPackage)) {
				// 
				if (EnumDec2EnumImpl
						.pattern_EnumDec2Enum_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_21_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					EnumDec2EnumImpl.pattern_EnumDec2Enum_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return EnumDec2EnumImpl.pattern_EnumDec2Enum_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("EnumDec2Enum");
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

		eq0.setRuleName("EnumDec2Enum");
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
		ruleResult.setRule("EnumDec2Enum");
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

		eq0.setRuleName("EnumDec2Enum");
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

		Object[] result1_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EnumDec2EnumImpl.pattern_EnumDec2Enum_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = EnumDec2EnumImpl
				.pattern_EnumDec2Enum_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Enumeration feature = (Enumeration) result2_bindingAndBlack[0];
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_bindingAndBlack[1];
		EnumDeclaration bodyDeclaration = (EnumDeclaration) result2_bindingAndBlack[2];
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = EnumDec2EnumImpl.pattern_EnumDec2Enum_24_3_solvecsp_bindingAndBlackFBBBBBBB(
				this, feature, umlPackage, bodyDeclaration, jPackage, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[umlPackage] = " + umlPackage + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[jPackage] = " + jPackage + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (EnumDec2EnumImpl.pattern_EnumDec2Enum_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : EnumDec2EnumImpl.pattern_EnumDec2Enum_24_5_matchcorrcontext_blackFBBBB(
					umlPackage, jPackage, sourceMatch, targetMatch)) {
				JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result5_black[0];
				Object[] result5_green = EnumDec2EnumImpl.pattern_EnumDec2Enum_24_5_matchcorrcontext_greenBBBF(jp2up,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_24_6_createcorrespondence_blackBBBBB(
						feature, umlPackage, bodyDeclaration, jPackage, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[umlPackage] = " + umlPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration
							+ ", " + "[jPackage] = " + jPackage + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				EnumDec2EnumImpl.pattern_EnumDec2Enum_24_6_createcorrespondence_greenFFBBB(feature, bodyDeclaration,
						ccMatch);
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[0];
				//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[1];

				Object[] result7_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				EnumDec2EnumImpl.pattern_EnumDec2Enum_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return EnumDec2EnumImpl.pattern_EnumDec2Enum_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Enumeration feature, org.eclipse.uml2.uml.Package umlPackage,
			EnumDeclaration bodyDeclaration, org.eclipse.modisco.java.Package jPackage, Match sourceMatch,
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
	public boolean checkDEC_FWD(EnumDeclaration bodyDeclaration, org.eclipse.modisco.java.Package jPackage) {// 
		Object[] result1_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_27_1_matchtggpattern_blackBB(bodyDeclaration,
				jPackage);
		if (result1_black != null) {
			return EnumDec2EnumImpl.pattern_EnumDec2Enum_27_2_expressionF();
		} else {
			return EnumDec2EnumImpl.pattern_EnumDec2Enum_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Enumeration feature, org.eclipse.uml2.uml.Package umlPackage) {// 
		Object[] result1_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_28_1_matchtggpattern_blackBB(feature,
				umlPackage);
		if (result1_black != null) {
			return EnumDec2EnumImpl.pattern_EnumDec2Enum_28_2_expressionF();
		} else {
			return EnumDec2EnumImpl.pattern_EnumDec2Enum_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			JavaPackage2UmlPackage jp2upParameter) {

		Object[] result1_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EnumDec2EnumImpl.pattern_EnumDec2Enum_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : EnumDec2EnumImpl
				.pattern_EnumDec2Enum_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList jp2upList = (RuleEntryList) result2_black[0];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result2_black[1];
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_black[2];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_black[3];

			Object[] result3_bindingAndBlack = EnumDec2EnumImpl
					.pattern_EnumDec2Enum_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, jp2up,
							umlPackage, jPackage, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jp2up] = " + jp2up + ", "
						+ "[umlPackage] = " + umlPackage + ", " + "[jPackage] = " + jPackage + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (EnumDec2EnumImpl.pattern_EnumDec2Enum_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_29_5_checknacs_blackBBB(jp2up,
						umlPackage, jPackage);
				if (result5_black != null) {

					Object[] result6_black = EnumDec2EnumImpl.pattern_EnumDec2Enum_29_6_perform_blackBBBB(jp2up,
							umlPackage, jPackage, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jp2up] = " + jp2up
								+ ", " + "[umlPackage] = " + umlPackage + ", " + "[jPackage] = " + jPackage + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					EnumDec2EnumImpl.pattern_EnumDec2Enum_29_6_perform_greenFFFBFBBB(umlPackage, jPackage, ruleResult,
							csp);
					//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[0];
					//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[1];
					//nothing Enumeration feature = (Enumeration) result6_green[2];
					//nothing EnumDeclaration bodyDeclaration = (EnumDeclaration) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return EnumDec2EnumImpl.pattern_EnumDec2Enum_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("jp2up", jp2up);
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("jPackage", jPackage);
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
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPROPRIATE_FWD__MATCH_ENUMDECLARATION_PACKAGE:
			return isAppropriate_FWD((Match) arguments.get(0), (EnumDeclaration) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2));
		case RulesPackage.ENUM_DEC2_ENUM___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ENUM_DEC2_ENUM___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ENUMDECLARATION_PACKAGE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (EnumDeclaration) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2));
			return null;
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ENUMDECLARATION_PACKAGE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (EnumDeclaration) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2));
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_JAVAPACKAGE2UMLPACKAGE_PACKAGE_ENUMDECLARATION_PACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(JavaPackage2UmlPackage) arguments.get(1), (org.eclipse.uml2.uml.Package) arguments.get(2),
					(EnumDeclaration) arguments.get(3), (org.eclipse.modisco.java.Package) arguments.get(4));
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_DEC2_ENUM___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.ENUM_DEC2_ENUM___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPROPRIATE_BWD__MATCH_ENUMERATION_PACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0), (Enumeration) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
		case RulesPackage.ENUM_DEC2_ENUM___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ENUM_DEC2_ENUM___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ENUMERATION_PACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Enumeration) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
			return null;
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ENUMERATION_PACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Enumeration) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ENUMERATION_JAVAPACKAGE2UMLPACKAGE_PACKAGE_PACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Enumeration) arguments.get(1),
					(JavaPackage2UmlPackage) arguments.get(2), (org.eclipse.uml2.uml.Package) arguments.get(3),
					(org.eclipse.modisco.java.Package) arguments.get(4));
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_DEC2_ENUM___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.ENUM_DEC2_ENUM___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPROPRIATE_BWD_EMOFLON_EDGE_302__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_302((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPROPRIATE_FWD_EMOFLON_EDGE_311__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_311((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENUM_DEC2_ENUM___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENUM_DEC2_ENUM___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPLICABLE_SOLVE_CSP_CC__ENUMERATION_PACKAGE_ENUMDECLARATION_PACKAGE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Enumeration) arguments.get(0),
					(org.eclipse.uml2.uml.Package) arguments.get(1), (EnumDeclaration) arguments.get(2),
					(org.eclipse.modisco.java.Package) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.ENUM_DEC2_ENUM___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ENUM_DEC2_ENUM___CHECK_DEC_FWD__ENUMDECLARATION_PACKAGE:
			return checkDEC_FWD((EnumDeclaration) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1));
		case RulesPackage.ENUM_DEC2_ENUM___CHECK_DEC_BWD__ENUMERATION_PACKAGE:
			return checkDEC_BWD((Enumeration) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1));
		case RulesPackage.ENUM_DEC2_ENUM___GENERATE_MODEL__RULEENTRYCONTAINER_JAVAPACKAGE2UMLPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (JavaPackage2UmlPackage) arguments.get(1));
		case RulesPackage.ENUM_DEC2_ENUM___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAPACKAGE2UMLPACKAGE_PACKAGE_PACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(JavaPackage2UmlPackage) arguments.get(1), (org.eclipse.uml2.uml.Package) arguments.get(2),
					(org.eclipse.modisco.java.Package) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.ENUM_DEC2_ENUM___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EnumDec2Enum_0_1_initialbindings_blackBBBB(EnumDec2Enum _this, Match match,
			EnumDeclaration bodyDeclaration, org.eclipse.modisco.java.Package jPackage) {
		return new Object[] { _this, match, bodyDeclaration, jPackage };
	}

	public static final Object[] pattern_EnumDec2Enum_0_2_SolveCSP_bindingFBBBB(EnumDec2Enum _this, Match match,
			EnumDeclaration bodyDeclaration, org.eclipse.modisco.java.Package jPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration, jPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration, jPackage };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumDec2Enum_0_2_SolveCSP_bindingAndBlackFBBBB(EnumDec2Enum _this, Match match,
			EnumDeclaration bodyDeclaration, org.eclipse.modisco.java.Package jPackage) {
		Object[] result_pattern_EnumDec2Enum_0_2_SolveCSP_binding = pattern_EnumDec2Enum_0_2_SolveCSP_bindingFBBBB(
				_this, match, bodyDeclaration, jPackage);
		if (result_pattern_EnumDec2Enum_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumDec2Enum_0_2_SolveCSP_binding[0];

			Object[] result_pattern_EnumDec2Enum_0_2_SolveCSP_black = pattern_EnumDec2Enum_0_2_SolveCSP_blackB(csp);
			if (result_pattern_EnumDec2Enum_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration, jPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDec2Enum_0_3_CheckCSP_expressionFBB(EnumDec2Enum _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_0_4_collectelementstobetranslated_blackBBB(Match match,
			EnumDeclaration bodyDeclaration, org.eclipse.modisco.java.Package jPackage) {
		return new Object[] { match, bodyDeclaration, jPackage };
	}

	public static final Object[] pattern_EnumDec2Enum_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			EnumDeclaration bodyDeclaration, org.eclipse.modisco.java.Package jPackage) {
		EMoflonEdge jPackage__bodyDeclaration____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		String jPackage__bodyDeclaration____ownedElements_name_prime = "ownedElements";
		String bodyDeclaration__jPackage____package_name_prime = "package";
		jPackage__bodyDeclaration____ownedElements.setSrc(jPackage);
		jPackage__bodyDeclaration____ownedElements.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(jPackage__bodyDeclaration____ownedElements);
		bodyDeclaration__jPackage____package.setSrc(bodyDeclaration);
		bodyDeclaration__jPackage____package.setTrg(jPackage);
		match.getToBeTranslatedEdges().add(bodyDeclaration__jPackage____package);
		jPackage__bodyDeclaration____ownedElements.setName(jPackage__bodyDeclaration____ownedElements_name_prime);
		bodyDeclaration__jPackage____package.setName(bodyDeclaration__jPackage____package_name_prime);
		return new Object[] { match, bodyDeclaration, jPackage, jPackage__bodyDeclaration____ownedElements,
				bodyDeclaration__jPackage____package };
	}

	public static final Object[] pattern_EnumDec2Enum_0_5_collectcontextelements_blackBBB(Match match,
			EnumDeclaration bodyDeclaration, org.eclipse.modisco.java.Package jPackage) {
		return new Object[] { match, bodyDeclaration, jPackage };
	}

	public static final Object[] pattern_EnumDec2Enum_0_5_collectcontextelements_greenBB(Match match,
			org.eclipse.modisco.java.Package jPackage) {
		match.getContextNodes().add(jPackage);
		return new Object[] { match, jPackage };
	}

	public static final void pattern_EnumDec2Enum_0_6_registerobjectstomatch_expressionBBBB(EnumDec2Enum _this,
			Match match, EnumDeclaration bodyDeclaration, org.eclipse.modisco.java.Package jPackage) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration, jPackage);

	}

	public static final boolean pattern_EnumDec2Enum_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnumDec2Enum_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jp2up");
		EObject _localVariable_1 = isApplicableMatch.getObject("umlPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = isApplicableMatch.getObject("jPackage");
		EObject tmpJp2up = _localVariable_0;
		EObject tmpUmlPackage = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpJPackage = _localVariable_3;
		if (tmpJp2up instanceof JavaPackage2UmlPackage) {
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) tmpJp2up;
			if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
				if (tmpBodyDeclaration instanceof EnumDeclaration) {
					EnumDeclaration bodyDeclaration = (EnumDeclaration) tmpBodyDeclaration;
					if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
						org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
						return new Object[] { jp2up, umlPackage, bodyDeclaration, jPackage, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_1_1_performtransformation_blackBBBBFBB(
			JavaPackage2UmlPackage jp2up, org.eclipse.uml2.uml.Package umlPackage, EnumDeclaration bodyDeclaration,
			org.eclipse.modisco.java.Package jPackage, EnumDec2Enum _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jp2up, umlPackage, bodyDeclaration, jPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_1_1_performtransformation_bindingAndBlackFFFFFBB(
			EnumDec2Enum _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EnumDec2Enum_1_1_performtransformation_binding = pattern_EnumDec2Enum_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_EnumDec2Enum_1_1_performtransformation_binding != null) {
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result_pattern_EnumDec2Enum_1_1_performtransformation_binding[0];
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result_pattern_EnumDec2Enum_1_1_performtransformation_binding[1];
			EnumDeclaration bodyDeclaration = (EnumDeclaration) result_pattern_EnumDec2Enum_1_1_performtransformation_binding[2];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result_pattern_EnumDec2Enum_1_1_performtransformation_binding[3];

			Object[] result_pattern_EnumDec2Enum_1_1_performtransformation_black = pattern_EnumDec2Enum_1_1_performtransformation_blackBBBBFBB(
					jp2up, umlPackage, bodyDeclaration, jPackage, _this, isApplicableMatch);
			if (result_pattern_EnumDec2Enum_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnumDec2Enum_1_1_performtransformation_black[4];

				return new Object[] { jp2up, umlPackage, bodyDeclaration, jPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_1_1_performtransformation_greenFFFBBB(
			org.eclipse.uml2.uml.Package umlPackage, EnumDeclaration bodyDeclaration, CSP csp) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		Enumeration feature = UMLFactory.eINSTANCE.createEnumeration();
		Object _localVariable_0 = csp.getValue("feature", "name");
		b2e.setSource(bodyDeclaration);
		bd2ne.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		bd2ne.setTarget(feature);
		umlPackage.getPackagedElements().add(feature);
		String feature_name_prime = (String) _localVariable_0;
		feature.setName(feature_name_prime);
		return new Object[] { b2e, bd2ne, feature, umlPackage, bodyDeclaration, csp };
	}

	public static final Object[] pattern_EnumDec2Enum_1_2_collecttranslatedelements_blackBBBB(ASTNode2Element b2e,
			NamedElement2NamedElement bd2ne, Enumeration feature, EnumDeclaration bodyDeclaration) {
		return new Object[] { b2e, bd2ne, feature, bodyDeclaration };
	}

	public static final Object[] pattern_EnumDec2Enum_1_2_collecttranslatedelements_greenFBBBB(ASTNode2Element b2e,
			NamedElement2NamedElement bd2ne, Enumeration feature, EnumDeclaration bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, b2e, bd2ne, feature, bodyDeclaration };
	}

	public static final Object[] pattern_EnumDec2Enum_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2e, EObject bd2ne, EObject feature, EObject jp2up,
			EObject umlPackage, EObject bodyDeclaration, EObject jPackage) {
		if (!b2e.equals(bd2ne)) {
			if (!b2e.equals(feature)) {
				if (!b2e.equals(jp2up)) {
					if (!b2e.equals(umlPackage)) {
						if (!b2e.equals(bodyDeclaration)) {
							if (!b2e.equals(jPackage)) {
								if (!bd2ne.equals(feature)) {
									if (!bd2ne.equals(jp2up)) {
										if (!bd2ne.equals(umlPackage)) {
											if (!bd2ne.equals(bodyDeclaration)) {
												if (!bd2ne.equals(jPackage)) {
													if (!feature.equals(jp2up)) {
														if (!feature.equals(umlPackage)) {
															if (!feature.equals(jPackage)) {
																if (!jp2up.equals(umlPackage)) {
																	if (!bodyDeclaration.equals(feature)) {
																		if (!bodyDeclaration.equals(jp2up)) {
																			if (!bodyDeclaration.equals(umlPackage)) {
																				if (!bodyDeclaration.equals(jPackage)) {
																					if (!jPackage.equals(jp2up)) {
																						if (!jPackage
																								.equals(umlPackage)) {
																							return new Object[] {
																									ruleresult, b2e,
																									bd2ne, feature,
																									jp2up, umlPackage,
																									bodyDeclaration,
																									jPackage };
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

	public static final Object[] pattern_EnumDec2Enum_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject b2e, EObject bd2ne, EObject feature, EObject umlPackage,
			EObject bodyDeclaration, EObject jPackage) {
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jPackage__bodyDeclaration____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnumDec2Enum";
		String b2e__feature____target_name_prime = "target";
		String bd2ne__feature____target_name_prime = "target";
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String jPackage__bodyDeclaration____ownedElements_name_prime = "ownedElements";
		String bodyDeclaration__jPackage____package_name_prime = "package";
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		ruleresult.getCreatedEdges().add(umlPackage__feature____packagedElement);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		jPackage__bodyDeclaration____ownedElements.setSrc(jPackage);
		jPackage__bodyDeclaration____ownedElements.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(jPackage__bodyDeclaration____ownedElements);
		bodyDeclaration__jPackage____package.setSrc(bodyDeclaration);
		bodyDeclaration__jPackage____package.setTrg(jPackage);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__jPackage____package);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		jPackage__bodyDeclaration____ownedElements.setName(jPackage__bodyDeclaration____ownedElements_name_prime);
		bodyDeclaration__jPackage____package.setName(bodyDeclaration__jPackage____package_name_prime);
		return new Object[] { ruleresult, b2e, bd2ne, feature, umlPackage, bodyDeclaration, jPackage,
				b2e__feature____target, bd2ne__feature____target, umlPackage__feature____packagedElement,
				bd2ne__bodyDeclaration____source, b2e__bodyDeclaration____source,
				jPackage__bodyDeclaration____ownedElements, bodyDeclaration__jPackage____package };
	}

	public static final void pattern_EnumDec2Enum_1_5_registerobjects_expressionBBBBBBBBB(EnumDec2Enum _this,
			PerformRuleResult ruleresult, EObject b2e, EObject bd2ne, EObject feature, EObject jp2up,
			EObject umlPackage, EObject bodyDeclaration, EObject jPackage) {
		_this.registerObjects_FWD(ruleresult, b2e, bd2ne, feature, jp2up, umlPackage, bodyDeclaration, jPackage);

	}

	public static final PerformRuleResult pattern_EnumDec2Enum_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_2_1_preparereturnvalue_bindingFB(EnumDec2Enum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_2_1_preparereturnvalue_blackFBB(EClass eClass,
			EnumDec2Enum _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_2_1_preparereturnvalue_bindingAndBlackFFB(EnumDec2Enum _this) {
		Object[] result_pattern_EnumDec2Enum_2_1_preparereturnvalue_binding = pattern_EnumDec2Enum_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnumDec2Enum_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_EnumDec2Enum_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnumDec2Enum_2_1_preparereturnvalue_black = pattern_EnumDec2Enum_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_EnumDec2Enum_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EnumDec2Enum_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "EnumDec2Enum";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EnumDec2Enum_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject _localVariable_1 = match.getObject("jPackage");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpJPackage = _localVariable_1;
		if (tmpBodyDeclaration instanceof EnumDeclaration) {
			EnumDeclaration bodyDeclaration = (EnumDeclaration) tmpBodyDeclaration;
			if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
				return new Object[] { bodyDeclaration, jPackage, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumDec2Enum_2_2_corematch_blackFFBBB(
			EnumDeclaration bodyDeclaration, org.eclipse.modisco.java.Package jPackage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jPackage,
				JavaPackage2UmlPackage.class, "source")) {
			org.eclipse.uml2.uml.Package umlPackage = jp2up.getTarget();
			if (umlPackage != null) {
				_result.add(new Object[] { jp2up, umlPackage, bodyDeclaration, jPackage, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnumDec2Enum_2_3_findcontext_blackBBBB(JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Package umlPackage, EnumDeclaration bodyDeclaration,
			org.eclipse.modisco.java.Package jPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (umlPackage.equals(jp2up.getTarget())) {
			if (jPackage.equals(jp2up.getSource())) {
				if (jPackage.getOwnedElements().contains(bodyDeclaration)) {
					_result.add(new Object[] { jp2up, umlPackage, bodyDeclaration, jPackage });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_2_3_findcontext_greenBBBBFFFFF(JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Package umlPackage, EnumDeclaration bodyDeclaration,
			org.eclipse.modisco.java.Package jPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jp2up__umlPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__jPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jPackage__bodyDeclaration____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jp2up__umlPackage____target_name_prime = "target";
		String jp2up__jPackage____source_name_prime = "source";
		String jPackage__bodyDeclaration____ownedElements_name_prime = "ownedElements";
		String bodyDeclaration__jPackage____package_name_prime = "package";
		isApplicableMatch.getAllContextElements().add(jp2up);
		isApplicableMatch.getAllContextElements().add(umlPackage);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jPackage);
		jp2up__umlPackage____target.setSrc(jp2up);
		jp2up__umlPackage____target.setTrg(umlPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__umlPackage____target);
		jp2up__jPackage____source.setSrc(jp2up);
		jp2up__jPackage____source.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__jPackage____source);
		jPackage__bodyDeclaration____ownedElements.setSrc(jPackage);
		jPackage__bodyDeclaration____ownedElements.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jPackage__bodyDeclaration____ownedElements);
		bodyDeclaration__jPackage____package.setSrc(bodyDeclaration);
		bodyDeclaration__jPackage____package.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__jPackage____package);
		jp2up__umlPackage____target.setName(jp2up__umlPackage____target_name_prime);
		jp2up__jPackage____source.setName(jp2up__jPackage____source_name_prime);
		jPackage__bodyDeclaration____ownedElements.setName(jPackage__bodyDeclaration____ownedElements_name_prime);
		bodyDeclaration__jPackage____package.setName(bodyDeclaration__jPackage____package_name_prime);
		return new Object[] { jp2up, umlPackage, bodyDeclaration, jPackage, isApplicableMatch,
				jp2up__umlPackage____target, jp2up__jPackage____source, jPackage__bodyDeclaration____ownedElements,
				bodyDeclaration__jPackage____package };
	}

	public static final Object[] pattern_EnumDec2Enum_2_4_solveCSP_bindingFBBBBBB(EnumDec2Enum _this,
			IsApplicableMatch isApplicableMatch, JavaPackage2UmlPackage jp2up, org.eclipse.uml2.uml.Package umlPackage,
			EnumDeclaration bodyDeclaration, org.eclipse.modisco.java.Package jPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, jp2up, umlPackage, bodyDeclaration,
				jPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jp2up, umlPackage, bodyDeclaration, jPackage };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumDec2Enum_2_4_solveCSP_bindingAndBlackFBBBBBB(EnumDec2Enum _this,
			IsApplicableMatch isApplicableMatch, JavaPackage2UmlPackage jp2up, org.eclipse.uml2.uml.Package umlPackage,
			EnumDeclaration bodyDeclaration, org.eclipse.modisco.java.Package jPackage) {
		Object[] result_pattern_EnumDec2Enum_2_4_solveCSP_binding = pattern_EnumDec2Enum_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jp2up, umlPackage, bodyDeclaration, jPackage);
		if (result_pattern_EnumDec2Enum_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumDec2Enum_2_4_solveCSP_binding[0];

			Object[] result_pattern_EnumDec2Enum_2_4_solveCSP_black = pattern_EnumDec2Enum_2_4_solveCSP_blackB(csp);
			if (result_pattern_EnumDec2Enum_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jp2up, umlPackage, bodyDeclaration, jPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDec2Enum_2_5_checkCSP_expressionFBB(EnumDec2Enum _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EnumDec2Enum_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EnumDec2Enum";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EnumDec2Enum_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_10_1_initialbindings_blackBBBB(EnumDec2Enum _this, Match match,
			Enumeration feature, org.eclipse.uml2.uml.Package umlPackage) {
		return new Object[] { _this, match, feature, umlPackage };
	}

	public static final Object[] pattern_EnumDec2Enum_10_2_SolveCSP_bindingFBBBB(EnumDec2Enum _this, Match match,
			Enumeration feature, org.eclipse.uml2.uml.Package umlPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, umlPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, umlPackage };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumDec2Enum_10_2_SolveCSP_bindingAndBlackFBBBB(EnumDec2Enum _this,
			Match match, Enumeration feature, org.eclipse.uml2.uml.Package umlPackage) {
		Object[] result_pattern_EnumDec2Enum_10_2_SolveCSP_binding = pattern_EnumDec2Enum_10_2_SolveCSP_bindingFBBBB(
				_this, match, feature, umlPackage);
		if (result_pattern_EnumDec2Enum_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumDec2Enum_10_2_SolveCSP_binding[0];

			Object[] result_pattern_EnumDec2Enum_10_2_SolveCSP_black = pattern_EnumDec2Enum_10_2_SolveCSP_blackB(csp);
			if (result_pattern_EnumDec2Enum_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, umlPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDec2Enum_10_3_CheckCSP_expressionFBB(EnumDec2Enum _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_10_4_collectelementstobetranslated_blackBBB(Match match,
			Enumeration feature, org.eclipse.uml2.uml.Package umlPackage) {
		return new Object[] { match, feature, umlPackage };
	}

	public static final Object[] pattern_EnumDec2Enum_10_4_collectelementstobetranslated_greenBBBF(Match match,
			Enumeration feature, org.eclipse.uml2.uml.Package umlPackage) {
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(feature);
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		match.getToBeTranslatedEdges().add(umlPackage__feature____packagedElement);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		return new Object[] { match, feature, umlPackage, umlPackage__feature____packagedElement };
	}

	public static final Object[] pattern_EnumDec2Enum_10_5_collectcontextelements_blackBBB(Match match,
			Enumeration feature, org.eclipse.uml2.uml.Package umlPackage) {
		return new Object[] { match, feature, umlPackage };
	}

	public static final Object[] pattern_EnumDec2Enum_10_5_collectcontextelements_greenBB(Match match,
			org.eclipse.uml2.uml.Package umlPackage) {
		match.getContextNodes().add(umlPackage);
		return new Object[] { match, umlPackage };
	}

	public static final void pattern_EnumDec2Enum_10_6_registerobjectstomatch_expressionBBBB(EnumDec2Enum _this,
			Match match, Enumeration feature, org.eclipse.uml2.uml.Package umlPackage) {
		_this.registerObjectsToMatch_BWD(match, feature, umlPackage);

	}

	public static final boolean pattern_EnumDec2Enum_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnumDec2Enum_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("jp2up");
		EObject _localVariable_2 = isApplicableMatch.getObject("umlPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("jPackage");
		EObject tmpFeature = _localVariable_0;
		EObject tmpJp2up = _localVariable_1;
		EObject tmpUmlPackage = _localVariable_2;
		EObject tmpJPackage = _localVariable_3;
		if (tmpFeature instanceof Enumeration) {
			Enumeration feature = (Enumeration) tmpFeature;
			if (tmpJp2up instanceof JavaPackage2UmlPackage) {
				JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) tmpJp2up;
				if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
					org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
					if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
						org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
						return new Object[] { feature, jp2up, umlPackage, jPackage, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_11_1_performtransformation_blackBBBBFBB(Enumeration feature,
			JavaPackage2UmlPackage jp2up, org.eclipse.uml2.uml.Package umlPackage,
			org.eclipse.modisco.java.Package jPackage, EnumDec2Enum _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { feature, jp2up, umlPackage, jPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_11_1_performtransformation_bindingAndBlackFFFFFBB(
			EnumDec2Enum _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EnumDec2Enum_11_1_performtransformation_binding = pattern_EnumDec2Enum_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_EnumDec2Enum_11_1_performtransformation_binding != null) {
			Enumeration feature = (Enumeration) result_pattern_EnumDec2Enum_11_1_performtransformation_binding[0];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result_pattern_EnumDec2Enum_11_1_performtransformation_binding[1];
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result_pattern_EnumDec2Enum_11_1_performtransformation_binding[2];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result_pattern_EnumDec2Enum_11_1_performtransformation_binding[3];

			Object[] result_pattern_EnumDec2Enum_11_1_performtransformation_black = pattern_EnumDec2Enum_11_1_performtransformation_blackBBBBFBB(
					feature, jp2up, umlPackage, jPackage, _this, isApplicableMatch);
			if (result_pattern_EnumDec2Enum_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnumDec2Enum_11_1_performtransformation_black[4];

				return new Object[] { feature, jp2up, umlPackage, jPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_11_1_performtransformation_greenFFBFBB(Enumeration feature,
			org.eclipse.modisco.java.Package jPackage, CSP csp) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		EnumDeclaration bodyDeclaration = JavaFactory.eINSTANCE.createEnumDeclaration();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		b2e.setTarget(feature);
		bd2ne.setTarget(feature);
		bd2ne.setSource(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		jPackage.getOwnedElements().add(bodyDeclaration);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		return new Object[] { b2e, bd2ne, feature, bodyDeclaration, jPackage, csp };
	}

	public static final Object[] pattern_EnumDec2Enum_11_2_collecttranslatedelements_blackBBBB(ASTNode2Element b2e,
			NamedElement2NamedElement bd2ne, Enumeration feature, EnumDeclaration bodyDeclaration) {
		return new Object[] { b2e, bd2ne, feature, bodyDeclaration };
	}

	public static final Object[] pattern_EnumDec2Enum_11_2_collecttranslatedelements_greenFBBBB(ASTNode2Element b2e,
			NamedElement2NamedElement bd2ne, Enumeration feature, EnumDeclaration bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, b2e, bd2ne, feature, bodyDeclaration };
	}

	public static final Object[] pattern_EnumDec2Enum_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2e, EObject bd2ne, EObject feature, EObject jp2up,
			EObject umlPackage, EObject bodyDeclaration, EObject jPackage) {
		if (!b2e.equals(bd2ne)) {
			if (!b2e.equals(feature)) {
				if (!b2e.equals(jp2up)) {
					if (!b2e.equals(umlPackage)) {
						if (!b2e.equals(bodyDeclaration)) {
							if (!b2e.equals(jPackage)) {
								if (!bd2ne.equals(feature)) {
									if (!bd2ne.equals(jp2up)) {
										if (!bd2ne.equals(umlPackage)) {
											if (!bd2ne.equals(bodyDeclaration)) {
												if (!bd2ne.equals(jPackage)) {
													if (!feature.equals(jp2up)) {
														if (!feature.equals(umlPackage)) {
															if (!feature.equals(jPackage)) {
																if (!jp2up.equals(umlPackage)) {
																	if (!bodyDeclaration.equals(feature)) {
																		if (!bodyDeclaration.equals(jp2up)) {
																			if (!bodyDeclaration.equals(umlPackage)) {
																				if (!bodyDeclaration.equals(jPackage)) {
																					if (!jPackage.equals(jp2up)) {
																						if (!jPackage
																								.equals(umlPackage)) {
																							return new Object[] {
																									ruleresult, b2e,
																									bd2ne, feature,
																									jp2up, umlPackage,
																									bodyDeclaration,
																									jPackage };
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

	public static final Object[] pattern_EnumDec2Enum_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject b2e, EObject bd2ne, EObject feature, EObject umlPackage,
			EObject bodyDeclaration, EObject jPackage) {
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jPackage__bodyDeclaration____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnumDec2Enum";
		String b2e__feature____target_name_prime = "target";
		String bd2ne__feature____target_name_prime = "target";
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String jPackage__bodyDeclaration____ownedElements_name_prime = "ownedElements";
		String bodyDeclaration__jPackage____package_name_prime = "package";
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		ruleresult.getTranslatedEdges().add(umlPackage__feature____packagedElement);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		jPackage__bodyDeclaration____ownedElements.setSrc(jPackage);
		jPackage__bodyDeclaration____ownedElements.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(jPackage__bodyDeclaration____ownedElements);
		bodyDeclaration__jPackage____package.setSrc(bodyDeclaration);
		bodyDeclaration__jPackage____package.setTrg(jPackage);
		ruleresult.getCreatedEdges().add(bodyDeclaration__jPackage____package);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		jPackage__bodyDeclaration____ownedElements.setName(jPackage__bodyDeclaration____ownedElements_name_prime);
		bodyDeclaration__jPackage____package.setName(bodyDeclaration__jPackage____package_name_prime);
		return new Object[] { ruleresult, b2e, bd2ne, feature, umlPackage, bodyDeclaration, jPackage,
				b2e__feature____target, bd2ne__feature____target, umlPackage__feature____packagedElement,
				bd2ne__bodyDeclaration____source, b2e__bodyDeclaration____source,
				jPackage__bodyDeclaration____ownedElements, bodyDeclaration__jPackage____package };
	}

	public static final void pattern_EnumDec2Enum_11_5_registerobjects_expressionBBBBBBBBB(EnumDec2Enum _this,
			PerformRuleResult ruleresult, EObject b2e, EObject bd2ne, EObject feature, EObject jp2up,
			EObject umlPackage, EObject bodyDeclaration, EObject jPackage) {
		_this.registerObjects_BWD(ruleresult, b2e, bd2ne, feature, jp2up, umlPackage, bodyDeclaration, jPackage);

	}

	public static final PerformRuleResult pattern_EnumDec2Enum_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_12_1_preparereturnvalue_bindingFB(EnumDec2Enum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_12_1_preparereturnvalue_blackFBB(EClass eClass,
			EnumDec2Enum _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_12_1_preparereturnvalue_bindingAndBlackFFB(EnumDec2Enum _this) {
		Object[] result_pattern_EnumDec2Enum_12_1_preparereturnvalue_binding = pattern_EnumDec2Enum_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnumDec2Enum_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_EnumDec2Enum_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnumDec2Enum_12_1_preparereturnvalue_black = pattern_EnumDec2Enum_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_EnumDec2Enum_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EnumDec2Enum_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "EnumDec2Enum";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EnumDec2Enum_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("umlPackage");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUmlPackage = _localVariable_1;
		if (tmpFeature instanceof Enumeration) {
			Enumeration feature = (Enumeration) tmpFeature;
			if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
				return new Object[] { feature, umlPackage, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumDec2Enum_12_2_corematch_blackBFBFB(Enumeration feature,
			org.eclipse.uml2.uml.Package umlPackage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(umlPackage, JavaPackage2UmlPackage.class, "target")) {
			org.eclipse.modisco.java.Package jPackage = jp2up.getSource();
			if (jPackage != null) {
				_result.add(new Object[] { feature, jp2up, umlPackage, jPackage, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnumDec2Enum_12_3_findcontext_blackBBBB(Enumeration feature,
			JavaPackage2UmlPackage jp2up, org.eclipse.uml2.uml.Package umlPackage,
			org.eclipse.modisco.java.Package jPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (umlPackage.getPackagedElements().contains(feature)) {
			if (umlPackage.equals(jp2up.getTarget())) {
				if (jPackage.equals(jp2up.getSource())) {
					_result.add(new Object[] { feature, jp2up, umlPackage, jPackage });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_12_3_findcontext_greenBBBBFFFF(Enumeration feature,
			JavaPackage2UmlPackage jp2up, org.eclipse.uml2.uml.Package umlPackage,
			org.eclipse.modisco.java.Package jPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__umlPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__jPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		String jp2up__umlPackage____target_name_prime = "target";
		String jp2up__jPackage____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(jp2up);
		isApplicableMatch.getAllContextElements().add(umlPackage);
		isApplicableMatch.getAllContextElements().add(jPackage);
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
		return new Object[] { feature, jp2up, umlPackage, jPackage, isApplicableMatch,
				umlPackage__feature____packagedElement, jp2up__umlPackage____target, jp2up__jPackage____source };
	}

	public static final Object[] pattern_EnumDec2Enum_12_4_solveCSP_bindingFBBBBBB(EnumDec2Enum _this,
			IsApplicableMatch isApplicableMatch, Enumeration feature, JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, jp2up, umlPackage, jPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, jp2up, umlPackage, jPackage };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumDec2Enum_12_4_solveCSP_bindingAndBlackFBBBBBB(EnumDec2Enum _this,
			IsApplicableMatch isApplicableMatch, Enumeration feature, JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage) {
		Object[] result_pattern_EnumDec2Enum_12_4_solveCSP_binding = pattern_EnumDec2Enum_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, feature, jp2up, umlPackage, jPackage);
		if (result_pattern_EnumDec2Enum_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumDec2Enum_12_4_solveCSP_binding[0];

			Object[] result_pattern_EnumDec2Enum_12_4_solveCSP_black = pattern_EnumDec2Enum_12_4_solveCSP_blackB(csp);
			if (result_pattern_EnumDec2Enum_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, jp2up, umlPackage, jPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDec2Enum_12_5_checkCSP_expressionFBB(EnumDec2Enum _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EnumDec2Enum_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EnumDec2Enum";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EnumDec2Enum_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_20_1_preparereturnvalue_bindingFB(EnumDec2Enum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			EnumDec2Enum _this) {
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

	public static final Object[] pattern_EnumDec2Enum_20_1_preparereturnvalue_bindingAndBlackFFBF(EnumDec2Enum _this) {
		Object[] result_pattern_EnumDec2Enum_20_1_preparereturnvalue_binding = pattern_EnumDec2Enum_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnumDec2Enum_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_EnumDec2Enum_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnumDec2Enum_20_1_preparereturnvalue_black = pattern_EnumDec2Enum_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_EnumDec2Enum_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EnumDec2Enum_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_EnumDec2Enum_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EnumDec2Enum_20_2_testcorematchandDECs_black_nac_0B(Enumeration feature) {
		for (org.eclipse.uml2.uml.Class __DEC_feature_nestedClassifier_499828 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Class.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_20_2_testcorematchandDECs_black_nac_1B(Enumeration feature) {
		for (Interface __DEC_feature_nestedClassifier_526420 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, Interface.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumDec2Enum_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUmlPackage = _edge_packagedElement.getSrc();
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			EObject tmpFeature = _edge_packagedElement.getTrg();
			if (tmpFeature instanceof Enumeration) {
				Enumeration feature = (Enumeration) tmpFeature;
				if (umlPackage.getPackagedElements().contains(feature)) {
					if (pattern_EnumDec2Enum_20_2_testcorematchandDECs_black_nac_0B(feature) == null) {
						if (pattern_EnumDec2Enum_20_2_testcorematchandDECs_black_nac_1B(feature) == null) {
							_result.add(new Object[] { feature, umlPackage, _edge_packagedElement });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EnumDec2Enum_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			EnumDec2Enum _this, Match match, Enumeration feature, org.eclipse.uml2.uml.Package umlPackage) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, umlPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EnumDec2Enum_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			EnumDec2Enum _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_EnumDec2Enum_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_21_1_preparereturnvalue_bindingFB(EnumDec2Enum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			EnumDec2Enum _this) {
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

	public static final Object[] pattern_EnumDec2Enum_21_1_preparereturnvalue_bindingAndBlackFFBF(EnumDec2Enum _this) {
		Object[] result_pattern_EnumDec2Enum_21_1_preparereturnvalue_binding = pattern_EnumDec2Enum_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnumDec2Enum_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_EnumDec2Enum_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnumDec2Enum_21_1_preparereturnvalue_black = pattern_EnumDec2Enum_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_EnumDec2Enum_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EnumDec2Enum_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_EnumDec2Enum_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EnumDec2Enum_21_2_testcorematchandDECs_black_nac_0B(
			EnumDeclaration bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_16463 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_16463 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_21_2_testcorematchandDECs_black_nac_1B(
			EnumDeclaration bodyDeclaration) {
		AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_436136 = bodyDeclaration
				.getAbstractTypeDeclaration();
		if (__DEC_bodyDeclaration_bodyDeclarations_436136 != null) {
			if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_436136)) {
				return new Object[] { bodyDeclaration };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_21_2_testcorematchandDECs_black_nac_2B(
			EnumDeclaration bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_625631 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_625631 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_21_2_testcorematchandDECs_black_nac_3B(
			EnumDeclaration bodyDeclaration) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_260307 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { bodyDeclaration };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumDec2Enum_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJPackage = _edge_ownedElements.getSrc();
		if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
			EObject tmpBodyDeclaration = _edge_ownedElements.getTrg();
			if (tmpBodyDeclaration instanceof EnumDeclaration) {
				EnumDeclaration bodyDeclaration = (EnumDeclaration) tmpBodyDeclaration;
				if (jPackage.getOwnedElements().contains(bodyDeclaration)) {
					if (pattern_EnumDec2Enum_21_2_testcorematchandDECs_black_nac_0B(bodyDeclaration) == null) {
						if (pattern_EnumDec2Enum_21_2_testcorematchandDECs_black_nac_1B(bodyDeclaration) == null) {
							if (pattern_EnumDec2Enum_21_2_testcorematchandDECs_black_nac_2B(bodyDeclaration) == null) {
								if (pattern_EnumDec2Enum_21_2_testcorematchandDECs_black_nac_3B(
										bodyDeclaration) == null) {
									_result.add(new Object[] { bodyDeclaration, jPackage, _edge_ownedElements });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EnumDec2Enum_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			EnumDec2Enum _this, Match match, EnumDeclaration bodyDeclaration,
			org.eclipse.modisco.java.Package jPackage) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration, jPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EnumDec2Enum_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			EnumDec2Enum _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_EnumDec2Enum_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_24_1_prepare_blackB(EnumDec2Enum _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EnumDec2Enum_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_EnumDec2Enum_24_2_matchsrctrgcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = targetMatch.getObject("umlPackage");
		EObject _localVariable_2 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = sourceMatch.getObject("jPackage");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUmlPackage = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpJPackage = _localVariable_3;
		if (tmpFeature instanceof Enumeration) {
			Enumeration feature = (Enumeration) tmpFeature;
			if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
				if (tmpBodyDeclaration instanceof EnumDeclaration) {
					EnumDeclaration bodyDeclaration = (EnumDeclaration) tmpBodyDeclaration;
					if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
						org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
						return new Object[] { feature, umlPackage, bodyDeclaration, jPackage, targetMatch,
								sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_24_2_matchsrctrgcontext_blackBBBBBB(Enumeration feature,
			org.eclipse.uml2.uml.Package umlPackage, EnumDeclaration bodyDeclaration,
			org.eclipse.modisco.java.Package jPackage, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { feature, umlPackage, bodyDeclaration, jPackage, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_EnumDec2Enum_24_2_matchsrctrgcontext_binding = pattern_EnumDec2Enum_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_EnumDec2Enum_24_2_matchsrctrgcontext_binding != null) {
			Enumeration feature = (Enumeration) result_pattern_EnumDec2Enum_24_2_matchsrctrgcontext_binding[0];
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result_pattern_EnumDec2Enum_24_2_matchsrctrgcontext_binding[1];
			EnumDeclaration bodyDeclaration = (EnumDeclaration) result_pattern_EnumDec2Enum_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result_pattern_EnumDec2Enum_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_EnumDec2Enum_24_2_matchsrctrgcontext_black = pattern_EnumDec2Enum_24_2_matchsrctrgcontext_blackBBBBBB(
					feature, umlPackage, bodyDeclaration, jPackage, sourceMatch, targetMatch);
			if (result_pattern_EnumDec2Enum_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, umlPackage, bodyDeclaration, jPackage, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_24_3_solvecsp_bindingFBBBBBBB(EnumDec2Enum _this,
			Enumeration feature, org.eclipse.uml2.uml.Package umlPackage, EnumDeclaration bodyDeclaration,
			org.eclipse.modisco.java.Package jPackage, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(feature, umlPackage, bodyDeclaration, jPackage,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, feature, umlPackage, bodyDeclaration, jPackage, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumDec2Enum_24_3_solvecsp_bindingAndBlackFBBBBBBB(EnumDec2Enum _this,
			Enumeration feature, org.eclipse.uml2.uml.Package umlPackage, EnumDeclaration bodyDeclaration,
			org.eclipse.modisco.java.Package jPackage, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_EnumDec2Enum_24_3_solvecsp_binding = pattern_EnumDec2Enum_24_3_solvecsp_bindingFBBBBBBB(
				_this, feature, umlPackage, bodyDeclaration, jPackage, sourceMatch, targetMatch);
		if (result_pattern_EnumDec2Enum_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_EnumDec2Enum_24_3_solvecsp_binding[0];

			Object[] result_pattern_EnumDec2Enum_24_3_solvecsp_black = pattern_EnumDec2Enum_24_3_solvecsp_blackB(csp);
			if (result_pattern_EnumDec2Enum_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, umlPackage, bodyDeclaration, jPackage, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDec2Enum_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnumDec2Enum_24_5_matchcorrcontext_blackFBBBB(
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(umlPackage, JavaPackage2UmlPackage.class, "target")) {
				if (jPackage.equals(jp2up.getSource())) {
					_result.add(new Object[] { jp2up, umlPackage, jPackage, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_24_5_matchcorrcontext_greenBBBF(JavaPackage2UmlPackage jp2up,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "EnumDec2Enum";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(jp2up);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { jp2up, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_EnumDec2Enum_24_6_createcorrespondence_blackBBBBB(Enumeration feature,
			org.eclipse.uml2.uml.Package umlPackage, EnumDeclaration bodyDeclaration,
			org.eclipse.modisco.java.Package jPackage, CCMatch ccMatch) {
		return new Object[] { feature, umlPackage, bodyDeclaration, jPackage, ccMatch };
	}

	public static final Object[] pattern_EnumDec2Enum_24_6_createcorrespondence_greenFFBBB(Enumeration feature,
			EnumDeclaration bodyDeclaration, CCMatch ccMatch) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		b2e.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		ccMatch.getCreateCorr().add(b2e);
		bd2ne.setTarget(feature);
		bd2ne.setSource(bodyDeclaration);
		ccMatch.getCreateCorr().add(bd2ne);
		return new Object[] { b2e, bd2ne, feature, bodyDeclaration, ccMatch };
	}

	public static final Object[] pattern_EnumDec2Enum_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_EnumDec2Enum_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "EnumDec2Enum";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_EnumDec2Enum_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_27_1_matchtggpattern_black_nac_0B(
			EnumDeclaration bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_747095 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_747095 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_27_1_matchtggpattern_black_nac_1B(
			EnumDeclaration bodyDeclaration) {
		AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_913793 = bodyDeclaration
				.getAbstractTypeDeclaration();
		if (__DEC_bodyDeclaration_bodyDeclarations_913793 != null) {
			if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_913793)) {
				return new Object[] { bodyDeclaration };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_27_1_matchtggpattern_black_nac_2B(
			EnumDeclaration bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_567501 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_567501 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_27_1_matchtggpattern_black_nac_3B(
			EnumDeclaration bodyDeclaration) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_129874 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_27_1_matchtggpattern_blackBB(EnumDeclaration bodyDeclaration,
			org.eclipse.modisco.java.Package jPackage) {
		if (jPackage.getOwnedElements().contains(bodyDeclaration)) {
			if (pattern_EnumDec2Enum_27_1_matchtggpattern_black_nac_0B(bodyDeclaration) == null) {
				if (pattern_EnumDec2Enum_27_1_matchtggpattern_black_nac_1B(bodyDeclaration) == null) {
					if (pattern_EnumDec2Enum_27_1_matchtggpattern_black_nac_2B(bodyDeclaration) == null) {
						if (pattern_EnumDec2Enum_27_1_matchtggpattern_black_nac_3B(bodyDeclaration) == null) {
							return new Object[] { bodyDeclaration, jPackage };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDec2Enum_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnumDec2Enum_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_28_1_matchtggpattern_black_nac_0B(Enumeration feature) {
		for (org.eclipse.uml2.uml.Class __DEC_feature_nestedClassifier_614757 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Class.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_28_1_matchtggpattern_black_nac_1B(Enumeration feature) {
		for (Interface __DEC_feature_nestedClassifier_77788 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, Interface.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_28_1_matchtggpattern_blackBB(Enumeration feature,
			org.eclipse.uml2.uml.Package umlPackage) {
		if (umlPackage.getPackagedElements().contains(feature)) {
			if (pattern_EnumDec2Enum_28_1_matchtggpattern_black_nac_0B(feature) == null) {
				if (pattern_EnumDec2Enum_28_1_matchtggpattern_black_nac_1B(feature) == null) {
					return new Object[] { feature, umlPackage };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDec2Enum_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnumDec2Enum_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_29_1_createresult_blackB(EnumDec2Enum _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EnumDec2Enum_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_EnumDec2Enum_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, JavaPackage2UmlPackage jp2up) {
		if (ruleResult.getCorrObjects().contains(jp2up)) {
			return new Object[] { ruleResult, jp2up };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Package umlPackage) {
		if (ruleResult.getTargetObjects().contains(umlPackage)) {
			return new Object[] { ruleResult, umlPackage };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package jPackage) {
		if (ruleResult.getSourceObjects().contains(jPackage)) {
			return new Object[] { ruleResult, jPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumDec2Enum_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_EnumDec2Enum_29_2_isapplicablecore_black_nac_0BB(ruleResult, jp2up) == null) {
								if (pattern_EnumDec2Enum_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										umlPackage) == null) {
									if (pattern_EnumDec2Enum_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											jPackage) == null) {
										_result.add(new Object[] { jp2upList, jp2up, umlPackage, jPackage,
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

	public static final Object[] pattern_EnumDec2Enum_29_3_solveCSP_bindingFBBBBBB(EnumDec2Enum _this,
			IsApplicableMatch isApplicableMatch, JavaPackage2UmlPackage jp2up, org.eclipse.uml2.uml.Package umlPackage,
			org.eclipse.modisco.java.Package jPackage, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, jp2up, umlPackage, jPackage,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jp2up, umlPackage, jPackage, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_EnumDec2Enum_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumDec2Enum_29_3_solveCSP_bindingAndBlackFBBBBBB(EnumDec2Enum _this,
			IsApplicableMatch isApplicableMatch, JavaPackage2UmlPackage jp2up, org.eclipse.uml2.uml.Package umlPackage,
			org.eclipse.modisco.java.Package jPackage, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_EnumDec2Enum_29_3_solveCSP_binding = pattern_EnumDec2Enum_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jp2up, umlPackage, jPackage, ruleResult);
		if (result_pattern_EnumDec2Enum_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumDec2Enum_29_3_solveCSP_binding[0];

			Object[] result_pattern_EnumDec2Enum_29_3_solveCSP_black = pattern_EnumDec2Enum_29_3_solveCSP_blackB(csp);
			if (result_pattern_EnumDec2Enum_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jp2up, umlPackage, jPackage, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumDec2Enum_29_4_checkCSP_expressionFBB(EnumDec2Enum _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumDec2Enum_29_5_checknacs_blackBBB(JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage) {
		return new Object[] { jp2up, umlPackage, jPackage };
	}

	public static final Object[] pattern_EnumDec2Enum_29_6_perform_blackBBBB(JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { jp2up, umlPackage, jPackage, ruleResult };
	}

	public static final Object[] pattern_EnumDec2Enum_29_6_perform_greenFFFBFBBB(
			org.eclipse.uml2.uml.Package umlPackage, org.eclipse.modisco.java.Package jPackage,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		Enumeration feature = UMLFactory.eINSTANCE.createEnumeration();
		EnumDeclaration bodyDeclaration = JavaFactory.eINSTANCE.createEnumDeclaration();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("bodyDeclaration", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(b2e);
		ruleResult.getCorrObjects().add(bd2ne);
		b2e.setTarget(feature);
		bd2ne.setTarget(feature);
		umlPackage.getPackagedElements().add(feature);
		ruleResult.getTargetObjects().add(feature);
		bd2ne.setSource(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		jPackage.getOwnedElements().add(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		String feature_name_prime = (String) _localVariable_0;
		String bodyDeclaration_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		feature.setName(feature_name_prime);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { b2e, bd2ne, feature, umlPackage, bodyDeclaration, jPackage, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_EnumDec2Enum_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EnumDec2EnumImpl
