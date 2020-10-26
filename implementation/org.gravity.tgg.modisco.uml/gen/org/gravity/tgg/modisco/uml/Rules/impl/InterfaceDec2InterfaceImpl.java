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
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.Modifier;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage;
import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.InterfaceDec2Interface;
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
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Package jPackage,
			InterfaceDeclaration bodyDeclaration) {

		Object[] result1_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_0_1_initialbindings_blackBBBB(this, match, jPackage, bodyDeclaration);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jPackage] = " + jPackage + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ".");
		}

		Object[] result2_bindingAndBlack = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, jPackage,
						bodyDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jPackage] = " + jPackage + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_0_4_collectelementstobetranslated_blackBBB(match, jPackage,
							bodyDeclaration);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jPackage] = " + jPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_0_4_collectelementstobetranslated_greenBBBFF(
					match, jPackage, bodyDeclaration);
			//nothing EMoflonEdge jPackage__bodyDeclaration____ownedElements = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge bodyDeclaration__jPackage____package = (EMoflonEdge) result4_green[4];

			Object[] result5_black = InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_0_5_collectcontextelements_blackBBB(match, jPackage,
							bodyDeclaration);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jPackage] = " + jPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_0_5_collectcontextelements_greenBB(match,
					jPackage);

			// 
			InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_0_6_registerobjectstomatch_expressionBBBB(this,
					match, jPackage, bodyDeclaration);
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
				.pattern_InterfaceDec2Interface_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[0];
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[1];
		JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result1_bindingAndBlack[2];
		InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_1_1_performtransformation_greenFFBFBB(umlPackage, bodyDeclaration, csp);
		ASTNode2Element b2e = (ASTNode2Element) result1_green[0];
		Interface feature = (Interface) result1_green[1];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[3];

		Object[] result2_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_1_2_collecttranslatedelements_blackBBBB(b2e, feature, bd2ne,
						bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[b2e] = " + b2e + ", " + "[feature] = " + feature
							+ ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_1_2_collecttranslatedelements_greenFBBBB(b2e, feature, bd2ne,
						bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, b2e, jPackage,
						feature, umlPackage, bd2ne, jp2up, bodyDeclaration);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2e] = " + b2e + ", " + "[jPackage] = " + jPackage + ", " + "[feature] = " + feature
					+ ", " + "[umlPackage] = " + umlPackage + ", " + "[bd2ne] = " + bd2ne + ", " + "[jp2up] = " + jp2up
					+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
				ruleresult, b2e, jPackage, feature, umlPackage, bd2ne, bodyDeclaration);
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge jPackage__bodyDeclaration____ownedElements = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge bodyDeclaration__jPackage____package = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[13];

		// 
		// 
		InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_1_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, b2e, jPackage, feature, umlPackage, bd2ne, jp2up, bodyDeclaration);
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
				.pattern_InterfaceDec2Interface_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_binding[0];
		InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result2_binding[1];
		for (Object[] result2_black : InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_2_2_corematch_blackBFFBB(jPackage, bodyDeclaration, match)) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_black[1];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result2_black[2];
			// ForEach 
			for (Object[] result3_black : InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_2_3_findcontext_blackBBBB(jPackage, umlPackage, jp2up,
							bodyDeclaration)) {
				Object[] result3_green = InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_2_3_findcontext_greenBBBBFFFFF(jPackage, umlPackage, jp2up,
								bodyDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge jPackage__bodyDeclaration____ownedElements = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge bodyDeclaration__jPackage____package = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jp2up__umlPackage____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge jp2up__jPackage____source = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								jPackage, umlPackage, jp2up, bodyDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jPackage] = " + jPackage + ", "
							+ "[umlPackage] = " + umlPackage + ", " + "[jp2up] = " + jp2up + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ".");
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
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.Package jPackage,
			InterfaceDeclaration bodyDeclaration) {
		match.registerObject("jPackage", jPackage);
		match.registerObject("bodyDeclaration", bodyDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.Package jPackage,
			InterfaceDeclaration bodyDeclaration) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package jPackage,
			org.eclipse.uml2.uml.Package umlPackage, JavaPackage2UmlPackage jp2up,
			InterfaceDeclaration bodyDeclaration) {// Create CSP
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
		isApplicableMatch.registerObject("jPackage", jPackage);
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("jp2up", jp2up);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject b2e, EObject jPackage, EObject feature,
			EObject umlPackage, EObject bd2ne, EObject jp2up, EObject bodyDeclaration) {
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("jPackage", jPackage);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("umlPackage", umlPackage);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("jp2up", jp2up);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);

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
	public boolean isAppropriate_BWD(Match match, Interface feature, org.eclipse.uml2.uml.Package umlPackage) {

		Object[] result1_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_10_1_initialbindings_blackBBBB(this, match, feature, umlPackage);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[umlPackage] = " + umlPackage + ".");
		}

		Object[] result2_bindingAndBlack = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, feature, umlPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[umlPackage] = " + umlPackage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_10_4_collectelementstobetranslated_blackBBB(match, feature,
							umlPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[umlPackage] = " + umlPackage + ".");
			}
			InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_10_4_collectelementstobetranslated_greenBBBF(
					match, feature, umlPackage);
			//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result4_green[3];

			Object[] result5_black = InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_10_5_collectcontextelements_blackBBB(match, feature, umlPackage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[umlPackage] = " + umlPackage + ".");
			}
			InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_10_5_collectcontextelements_greenBB(match,
					umlPackage);

			// 
			InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_10_6_registerobjectstomatch_expressionBBBB(this,
					match, feature, umlPackage);
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
				.pattern_InterfaceDec2Interface_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[0];
		Interface feature = (Interface) result1_bindingAndBlack[1];
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[2];
		JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_11_1_performtransformation_greenFBBFFB(jPackage, feature, csp);
		ASTNode2Element b2e = (ASTNode2Element) result1_green[0];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[3];
		InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result1_green[4];

		Object[] result2_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_11_2_collecttranslatedelements_blackBBBB(b2e, feature, bd2ne,
						bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[b2e] = " + b2e + ", " + "[feature] = " + feature
							+ ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_11_2_collecttranslatedelements_greenFBBBB(b2e, feature, bd2ne,
						bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, b2e, jPackage,
						feature, umlPackage, bd2ne, jp2up, bodyDeclaration);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2e] = " + b2e + ", " + "[jPackage] = " + jPackage + ", " + "[feature] = " + feature
					+ ", " + "[umlPackage] = " + umlPackage + ", " + "[bd2ne] = " + bd2ne + ", " + "[jp2up] = " + jp2up
					+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
				ruleresult, b2e, jPackage, feature, umlPackage, bd2ne, bodyDeclaration);
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge jPackage__bodyDeclaration____ownedElements = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge bodyDeclaration__jPackage____package = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[13];

		// 
		// 
		InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_11_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, b2e, jPackage, feature, umlPackage, bd2ne, jp2up, bodyDeclaration);
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
				.pattern_InterfaceDec2Interface_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Interface feature = (Interface) result2_binding[0];
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_binding[1];
		for (Object[] result2_black : InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_12_2_corematch_blackFBBFB(feature, umlPackage, match)) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_black[0];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result2_black[3];
			// ForEach 
			for (Object[] result3_black : InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_12_3_findcontext_blackBBBB(jPackage, feature, umlPackage, jp2up)) {
				Object[] result3_green = InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_12_3_findcontext_greenBBBBFFFF(jPackage, feature, umlPackage,
								jp2up);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge jp2up__umlPackage____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge jp2up__jPackage____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								jPackage, feature, umlPackage, jp2up);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jPackage] = " + jPackage + ", "
							+ "[feature] = " + feature + ", " + "[umlPackage] = " + umlPackage + ", " + "[jp2up] = "
							+ jp2up + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Interface feature, org.eclipse.uml2.uml.Package umlPackage) {
		match.registerObject("feature", feature);
		match.registerObject("umlPackage", umlPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Interface feature, org.eclipse.uml2.uml.Package umlPackage) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package jPackage,
			Interface feature, org.eclipse.uml2.uml.Package umlPackage, JavaPackage2UmlPackage jp2up) {// Create CSP
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
		isApplicableMatch.registerObject("jPackage", jPackage);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("umlPackage", umlPackage);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject b2e, EObject jPackage, EObject feature,
			EObject umlPackage, EObject bd2ne, EObject jp2up, EObject bodyDeclaration) {
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("jPackage", jPackage);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("umlPackage", umlPackage);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("jp2up", jp2up);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_90(EMoflonEdge _edge_packagedElement) {

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
				.pattern_InterfaceDec2Interface_20_2_testcorematchandDECs_blackFFB(_edge_packagedElement)) {
			Interface feature = (Interface) result2_black[0];
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_black[1];
			Object[] result2_green = InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, feature, umlPackage)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_94(EMoflonEdge _edge_ownedElements) {

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
				.pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_blackFFB(_edge_ownedElements)) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_black[0];
			InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result2_black[1];
			Object[] result2_green = InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, jPackage, bodyDeclaration)) {
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

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

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

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

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
				.pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[0];
		Interface feature = (Interface) result2_bindingAndBlack[1];
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_bindingAndBlack[2];
		InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, jPackage, feature,
						umlPackage, bodyDeclaration, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[jPackage] = " + jPackage + ", " + "[feature] = " + feature + ", " + "[umlPackage] = "
					+ umlPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_24_5_matchcorrcontext_blackBBFBB(jPackage, umlPackage, sourceMatch,
							targetMatch)) {
				JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result5_black[2];
				Object[] result5_green = InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_24_5_matchcorrcontext_greenBBBF(jp2up, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_24_6_createcorrespondence_blackBBBBB(jPackage, feature,
								umlPackage, bodyDeclaration, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jPackage] = " + jPackage
							+ ", " + "[feature] = " + feature + ", " + "[umlPackage] = " + umlPackage + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_24_6_createcorrespondence_greenFBFBB(feature,
						bodyDeclaration, ccMatch);
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[0];
				//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[2];

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
	public CSP isApplicable_solveCsp_CC(org.eclipse.modisco.java.Package jPackage, Interface feature,
			org.eclipse.uml2.uml.Package umlPackage, InterfaceDeclaration bodyDeclaration, Match sourceMatch,
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.Package jPackage, InterfaceDeclaration bodyDeclaration) {// 
		Object[] result1_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_27_1_matchtggpattern_blackBB(jPackage, bodyDeclaration);
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
	public boolean checkDEC_BWD(Interface feature, org.eclipse.uml2.uml.Package umlPackage) {// 
		Object[] result1_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_28_1_matchtggpattern_blackBB(feature, umlPackage);
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
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			JavaPackage2UmlPackage jp2upParameter) {

		Object[] result1_black = InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : InterfaceDec2InterfaceImpl
				.pattern_InterfaceDec2Interface_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList jp2upList = (RuleEntryList) result2_black[0];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_black[1];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result2_black[2];
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_black[3];

			Object[] result3_bindingAndBlack = InterfaceDec2InterfaceImpl
					.pattern_InterfaceDec2Interface_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							jPackage, umlPackage, jp2up, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jPackage] = " + jPackage + ", "
						+ "[umlPackage] = " + umlPackage + ", " + "[jp2up] = " + jp2up + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = InterfaceDec2InterfaceImpl
						.pattern_InterfaceDec2Interface_29_5_checknacs_blackBBB(jPackage, umlPackage, jp2up);
				if (result5_black != null) {

					Object[] result6_black = InterfaceDec2InterfaceImpl
							.pattern_InterfaceDec2Interface_29_6_perform_blackBBBB(jPackage, umlPackage, jp2up,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jPackage] = "
								+ jPackage + ", " + "[umlPackage] = " + umlPackage + ", " + "[jp2up] = " + jp2up + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_29_6_perform_greenFBFBFFBB(jPackage,
							umlPackage, ruleResult, csp);
					//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[0];
					//nothing Interface feature = (Interface) result6_green[2];
					//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[4];
					//nothing InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return InterfaceDec2InterfaceImpl.pattern_InterfaceDec2Interface_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package umlPackage,
			JavaPackage2UmlPackage jp2up, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("jPackage", jPackage);
		isApplicableMatch.registerObject("umlPackage", umlPackage);
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
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_FWD__MATCH_PACKAGE_INTERFACEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_INTERFACEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
			return null;
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_INTERFACEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (InterfaceDeclaration) arguments.get(2));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGE_PACKAGE_JAVAPACKAGE2UMLPACKAGE_INTERFACEDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2), (JavaPackage2UmlPackage) arguments.get(3),
					(InterfaceDeclaration) arguments.get(4));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.INTERFACE_DEC2_INTERFACE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_BWD__MATCH_INTERFACE_PACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERFACE_PACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
			return null;
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERFACE_PACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGE_INTERFACE_PACKAGE_JAVAPACKAGE2UMLPACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (Interface) arguments.get(2),
					(org.eclipse.uml2.uml.Package) arguments.get(3), (JavaPackage2UmlPackage) arguments.get(4));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.INTERFACE_DEC2_INTERFACE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_90__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_90((EMoflonEdge) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_94__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_94((EMoflonEdge) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_SOLVE_CSP_CC__PACKAGE_INTERFACE_PACKAGE_INTERFACEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.modisco.java.Package) arguments.get(0),
					(Interface) arguments.get(1), (org.eclipse.uml2.uml.Package) arguments.get(2),
					(InterfaceDeclaration) arguments.get(3), (Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___CHECK_DEC_FWD__PACKAGE_INTERFACEDECLARATION:
			return checkDEC_FWD((org.eclipse.modisco.java.Package) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___CHECK_DEC_BWD__INTERFACE_PACKAGE:
			return checkDEC_BWD((Interface) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___GENERATE_MODEL__RULEENTRYCONTAINER_JAVAPACKAGE2UMLPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (JavaPackage2UmlPackage) arguments.get(1));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGE_PACKAGE_JAVAPACKAGE2UMLPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2), (JavaPackage2UmlPackage) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.INTERFACE_DEC2_INTERFACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InterfaceDec2Interface_0_1_initialbindings_blackBBBB(
			InterfaceDec2Interface _this, Match match, org.eclipse.modisco.java.Package jPackage,
			InterfaceDeclaration bodyDeclaration) {
		return new Object[] { _this, match, jPackage, bodyDeclaration };
	}

	public static final Object[] pattern_InterfaceDec2Interface_0_2_SolveCSP_bindingFBBBB(InterfaceDec2Interface _this,
			Match match, org.eclipse.modisco.java.Package jPackage, InterfaceDeclaration bodyDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jPackage, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jPackage, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_0_2_SolveCSP_bindingAndBlackFBBBB(
			InterfaceDec2Interface _this, Match match, org.eclipse.modisco.java.Package jPackage,
			InterfaceDeclaration bodyDeclaration) {
		Object[] result_pattern_InterfaceDec2Interface_0_2_SolveCSP_binding = pattern_InterfaceDec2Interface_0_2_SolveCSP_bindingFBBBB(
				_this, match, jPackage, bodyDeclaration);
		if (result_pattern_InterfaceDec2Interface_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceDec2Interface_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_0_2_SolveCSP_black = pattern_InterfaceDec2Interface_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InterfaceDec2Interface_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, jPackage, bodyDeclaration };
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

	public static final Object[] pattern_InterfaceDec2Interface_0_4_collectelementstobetranslated_blackBBB(Match match,
			org.eclipse.modisco.java.Package jPackage, InterfaceDeclaration bodyDeclaration) {
		return new Object[] { match, jPackage, bodyDeclaration };
	}

	public static final Object[] pattern_InterfaceDec2Interface_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, org.eclipse.modisco.java.Package jPackage, InterfaceDeclaration bodyDeclaration) {
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
		return new Object[] { match, jPackage, bodyDeclaration, jPackage__bodyDeclaration____ownedElements,
				bodyDeclaration__jPackage____package };
	}

	public static final Object[] pattern_InterfaceDec2Interface_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.modisco.java.Package jPackage, InterfaceDeclaration bodyDeclaration) {
		return new Object[] { match, jPackage, bodyDeclaration };
	}

	public static final Object[] pattern_InterfaceDec2Interface_0_5_collectcontextelements_greenBB(Match match,
			org.eclipse.modisco.java.Package jPackage) {
		match.getContextNodes().add(jPackage);
		return new Object[] { match, jPackage };
	}

	public static final void pattern_InterfaceDec2Interface_0_6_registerobjectstomatch_expressionBBBB(
			InterfaceDec2Interface _this, Match match, org.eclipse.modisco.java.Package jPackage,
			InterfaceDeclaration bodyDeclaration) {
		_this.registerObjectsToMatch_FWD(match, jPackage, bodyDeclaration);

	}

	public static final boolean pattern_InterfaceDec2Interface_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceDec2Interface_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("umlPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("jp2up");
		EObject _localVariable_3 = isApplicableMatch.getObject("bodyDeclaration");
		EObject tmpJPackage = _localVariable_0;
		EObject tmpUmlPackage = _localVariable_1;
		EObject tmpJp2up = _localVariable_2;
		EObject tmpBodyDeclaration = _localVariable_3;
		if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
			if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
				if (tmpJp2up instanceof JavaPackage2UmlPackage) {
					JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) tmpJp2up;
					if (tmpBodyDeclaration instanceof InterfaceDeclaration) {
						InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) tmpBodyDeclaration;
						return new Object[] { jPackage, umlPackage, jp2up, bodyDeclaration, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_1_1_performtransformation_blackBBBBFBB(
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package umlPackage,
			JavaPackage2UmlPackage jp2up, InterfaceDeclaration bodyDeclaration, InterfaceDec2Interface _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jPackage, umlPackage, jp2up, bodyDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_1_1_performtransformation_bindingAndBlackFFFFFBB(
			InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InterfaceDec2Interface_1_1_performtransformation_binding = pattern_InterfaceDec2Interface_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_InterfaceDec2Interface_1_1_performtransformation_binding != null) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result_pattern_InterfaceDec2Interface_1_1_performtransformation_binding[0];
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result_pattern_InterfaceDec2Interface_1_1_performtransformation_binding[1];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result_pattern_InterfaceDec2Interface_1_1_performtransformation_binding[2];
			InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result_pattern_InterfaceDec2Interface_1_1_performtransformation_binding[3];

			Object[] result_pattern_InterfaceDec2Interface_1_1_performtransformation_black = pattern_InterfaceDec2Interface_1_1_performtransformation_blackBBBBFBB(
					jPackage, umlPackage, jp2up, bodyDeclaration, _this, isApplicableMatch);
			if (result_pattern_InterfaceDec2Interface_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InterfaceDec2Interface_1_1_performtransformation_black[4];

				return new Object[] { jPackage, umlPackage, jp2up, bodyDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_1_1_performtransformation_greenFFBFBB(
			org.eclipse.uml2.uml.Package umlPackage, InterfaceDeclaration bodyDeclaration, CSP csp) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Interface feature = UMLFactory.eINSTANCE.createInterface();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		Object _localVariable_0 = csp.getValue("feature", "name");
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		umlPackage.getPackagedElements().add(feature);
		bd2ne.setTarget(feature);
		bd2ne.setSource(bodyDeclaration);
		String feature_name_prime = (String) _localVariable_0;
		feature.setName(feature_name_prime);
		return new Object[] { b2e, feature, umlPackage, bd2ne, bodyDeclaration, csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_1_2_collecttranslatedelements_blackBBBB(
			ASTNode2Element b2e, Interface feature, NamedElement2NamedElement bd2ne,
			InterfaceDeclaration bodyDeclaration) {
		return new Object[] { b2e, feature, bd2ne, bodyDeclaration };
	}

	public static final Object[] pattern_InterfaceDec2Interface_1_2_collecttranslatedelements_greenFBBBB(
			ASTNode2Element b2e, Interface feature, NamedElement2NamedElement bd2ne,
			InterfaceDeclaration bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, b2e, feature, bd2ne, bodyDeclaration };
	}

	public static final Object[] pattern_InterfaceDec2Interface_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2e, EObject jPackage, EObject feature, EObject umlPackage,
			EObject bd2ne, EObject jp2up, EObject bodyDeclaration) {
		if (!b2e.equals(jPackage)) {
			if (!b2e.equals(feature)) {
				if (!b2e.equals(umlPackage)) {
					if (!b2e.equals(bd2ne)) {
						if (!b2e.equals(jp2up)) {
							if (!b2e.equals(bodyDeclaration)) {
								if (!jPackage.equals(umlPackage)) {
									if (!jPackage.equals(jp2up)) {
										if (!feature.equals(jPackage)) {
											if (!feature.equals(umlPackage)) {
												if (!feature.equals(jp2up)) {
													if (!bd2ne.equals(jPackage)) {
														if (!bd2ne.equals(feature)) {
															if (!bd2ne.equals(umlPackage)) {
																if (!bd2ne.equals(jp2up)) {
																	if (!bd2ne.equals(bodyDeclaration)) {
																		if (!jp2up.equals(umlPackage)) {
																			if (!bodyDeclaration.equals(jPackage)) {
																				if (!bodyDeclaration.equals(feature)) {
																					if (!bodyDeclaration
																							.equals(umlPackage)) {
																						if (!bodyDeclaration
																								.equals(jp2up)) {
																							return new Object[] {
																									ruleresult, b2e,
																									jPackage, feature,
																									umlPackage, bd2ne,
																									jp2up,
																									bodyDeclaration };
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

	public static final Object[] pattern_InterfaceDec2Interface_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject b2e, EObject jPackage, EObject feature, EObject umlPackage,
			EObject bd2ne, EObject bodyDeclaration) {
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jPackage__bodyDeclaration____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InterfaceDec2Interface";
		String b2e__feature____target_name_prime = "target";
		String bd2ne__feature____target_name_prime = "target";
		String jPackage__bodyDeclaration____ownedElements_name_prime = "ownedElements";
		String bodyDeclaration__jPackage____package_name_prime = "package";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		jPackage__bodyDeclaration____ownedElements.setSrc(jPackage);
		jPackage__bodyDeclaration____ownedElements.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(jPackage__bodyDeclaration____ownedElements);
		bodyDeclaration__jPackage____package.setSrc(bodyDeclaration);
		bodyDeclaration__jPackage____package.setTrg(jPackage);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__jPackage____package);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		ruleresult.getCreatedEdges().add(umlPackage__feature____packagedElement);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		jPackage__bodyDeclaration____ownedElements.setName(jPackage__bodyDeclaration____ownedElements_name_prime);
		bodyDeclaration__jPackage____package.setName(bodyDeclaration__jPackage____package_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		return new Object[] { ruleresult, b2e, jPackage, feature, umlPackage, bd2ne, bodyDeclaration,
				b2e__feature____target, bd2ne__feature____target, jPackage__bodyDeclaration____ownedElements,
				bodyDeclaration__jPackage____package, b2e__bodyDeclaration____source,
				umlPackage__feature____packagedElement, bd2ne__bodyDeclaration____source };
	}

	public static final void pattern_InterfaceDec2Interface_1_5_registerobjects_expressionBBBBBBBBB(
			InterfaceDec2Interface _this, PerformRuleResult ruleresult, EObject b2e, EObject jPackage, EObject feature,
			EObject umlPackage, EObject bd2ne, EObject jp2up, EObject bodyDeclaration) {
		_this.registerObjects_FWD(ruleresult, b2e, jPackage, feature, umlPackage, bd2ne, jp2up, bodyDeclaration);

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

	public static final Object[] pattern_InterfaceDec2Interface_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("jPackage");
		EObject _localVariable_1 = match.getObject("bodyDeclaration");
		EObject tmpJPackage = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
			if (tmpBodyDeclaration instanceof InterfaceDeclaration) {
				InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) tmpBodyDeclaration;
				return new Object[] { jPackage, bodyDeclaration, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceDec2Interface_2_2_corematch_blackBFFBB(
			org.eclipse.modisco.java.Package jPackage, InterfaceDeclaration bodyDeclaration, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jPackage,
				JavaPackage2UmlPackage.class, "source")) {
			org.eclipse.uml2.uml.Package umlPackage = jp2up.getTarget();
			if (umlPackage != null) {
				_result.add(new Object[] { jPackage, umlPackage, jp2up, bodyDeclaration, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceDec2Interface_2_3_findcontext_blackBBBB(
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package umlPackage,
			JavaPackage2UmlPackage jp2up, InterfaceDeclaration bodyDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jPackage.getOwnedElements().contains(bodyDeclaration)) {
			if (umlPackage.equals(jp2up.getTarget())) {
				if (jPackage.equals(jp2up.getSource())) {
					_result.add(new Object[] { jPackage, umlPackage, jp2up, bodyDeclaration });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_2_3_findcontext_greenBBBBFFFFF(
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package umlPackage,
			JavaPackage2UmlPackage jp2up, InterfaceDeclaration bodyDeclaration) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jPackage__bodyDeclaration____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__umlPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__jPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jPackage__bodyDeclaration____ownedElements_name_prime = "ownedElements";
		String bodyDeclaration__jPackage____package_name_prime = "package";
		String jp2up__umlPackage____target_name_prime = "target";
		String jp2up__jPackage____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(jPackage);
		isApplicableMatch.getAllContextElements().add(umlPackage);
		isApplicableMatch.getAllContextElements().add(jp2up);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		jPackage__bodyDeclaration____ownedElements.setSrc(jPackage);
		jPackage__bodyDeclaration____ownedElements.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jPackage__bodyDeclaration____ownedElements);
		bodyDeclaration__jPackage____package.setSrc(bodyDeclaration);
		bodyDeclaration__jPackage____package.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__jPackage____package);
		jp2up__umlPackage____target.setSrc(jp2up);
		jp2up__umlPackage____target.setTrg(umlPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__umlPackage____target);
		jp2up__jPackage____source.setSrc(jp2up);
		jp2up__jPackage____source.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__jPackage____source);
		jPackage__bodyDeclaration____ownedElements.setName(jPackage__bodyDeclaration____ownedElements_name_prime);
		bodyDeclaration__jPackage____package.setName(bodyDeclaration__jPackage____package_name_prime);
		jp2up__umlPackage____target.setName(jp2up__umlPackage____target_name_prime);
		jp2up__jPackage____source.setName(jp2up__jPackage____source_name_prime);
		return new Object[] { jPackage, umlPackage, jp2up, bodyDeclaration, isApplicableMatch,
				jPackage__bodyDeclaration____ownedElements, bodyDeclaration__jPackage____package,
				jp2up__umlPackage____target, jp2up__jPackage____source };
	}

	public static final Object[] pattern_InterfaceDec2Interface_2_4_solveCSP_bindingFBBBBBB(
			InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package umlPackage,
			JavaPackage2UmlPackage jp2up, InterfaceDeclaration bodyDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, jPackage, umlPackage, jp2up,
				bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jPackage, umlPackage, jp2up, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_2_4_solveCSP_bindingAndBlackFBBBBBB(
			InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package umlPackage,
			JavaPackage2UmlPackage jp2up, InterfaceDeclaration bodyDeclaration) {
		Object[] result_pattern_InterfaceDec2Interface_2_4_solveCSP_binding = pattern_InterfaceDec2Interface_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jPackage, umlPackage, jp2up, bodyDeclaration);
		if (result_pattern_InterfaceDec2Interface_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceDec2Interface_2_4_solveCSP_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_2_4_solveCSP_black = pattern_InterfaceDec2Interface_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceDec2Interface_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jPackage, umlPackage, jp2up, bodyDeclaration };
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

	public static final Object[] pattern_InterfaceDec2Interface_10_1_initialbindings_blackBBBB(
			InterfaceDec2Interface _this, Match match, Interface feature, org.eclipse.uml2.uml.Package umlPackage) {
		return new Object[] { _this, match, feature, umlPackage };
	}

	public static final Object[] pattern_InterfaceDec2Interface_10_2_SolveCSP_bindingFBBBB(InterfaceDec2Interface _this,
			Match match, Interface feature, org.eclipse.uml2.uml.Package umlPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, umlPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, umlPackage };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_10_2_SolveCSP_bindingAndBlackFBBBB(
			InterfaceDec2Interface _this, Match match, Interface feature, org.eclipse.uml2.uml.Package umlPackage) {
		Object[] result_pattern_InterfaceDec2Interface_10_2_SolveCSP_binding = pattern_InterfaceDec2Interface_10_2_SolveCSP_bindingFBBBB(
				_this, match, feature, umlPackage);
		if (result_pattern_InterfaceDec2Interface_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceDec2Interface_10_2_SolveCSP_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_10_2_SolveCSP_black = pattern_InterfaceDec2Interface_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InterfaceDec2Interface_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, umlPackage };
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

	public static final Object[] pattern_InterfaceDec2Interface_10_4_collectelementstobetranslated_blackBBB(Match match,
			Interface feature, org.eclipse.uml2.uml.Package umlPackage) {
		return new Object[] { match, feature, umlPackage };
	}

	public static final Object[] pattern_InterfaceDec2Interface_10_4_collectelementstobetranslated_greenBBBF(
			Match match, Interface feature, org.eclipse.uml2.uml.Package umlPackage) {
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(feature);
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		match.getToBeTranslatedEdges().add(umlPackage__feature____packagedElement);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		return new Object[] { match, feature, umlPackage, umlPackage__feature____packagedElement };
	}

	public static final Object[] pattern_InterfaceDec2Interface_10_5_collectcontextelements_blackBBB(Match match,
			Interface feature, org.eclipse.uml2.uml.Package umlPackage) {
		return new Object[] { match, feature, umlPackage };
	}

	public static final Object[] pattern_InterfaceDec2Interface_10_5_collectcontextelements_greenBB(Match match,
			org.eclipse.uml2.uml.Package umlPackage) {
		match.getContextNodes().add(umlPackage);
		return new Object[] { match, umlPackage };
	}

	public static final void pattern_InterfaceDec2Interface_10_6_registerobjectstomatch_expressionBBBB(
			InterfaceDec2Interface _this, Match match, Interface feature, org.eclipse.uml2.uml.Package umlPackage) {
		_this.registerObjectsToMatch_BWD(match, feature, umlPackage);

	}

	public static final boolean pattern_InterfaceDec2Interface_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceDec2Interface_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("feature");
		EObject _localVariable_2 = isApplicableMatch.getObject("umlPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("jp2up");
		EObject tmpJPackage = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpUmlPackage = _localVariable_2;
		EObject tmpJp2up = _localVariable_3;
		if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
			if (tmpFeature instanceof Interface) {
				Interface feature = (Interface) tmpFeature;
				if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
					org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
					if (tmpJp2up instanceof JavaPackage2UmlPackage) {
						JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) tmpJp2up;
						return new Object[] { jPackage, feature, umlPackage, jp2up, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_11_1_performtransformation_blackBBBBFBB(
			org.eclipse.modisco.java.Package jPackage, Interface feature, org.eclipse.uml2.uml.Package umlPackage,
			JavaPackage2UmlPackage jp2up, InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jPackage, feature, umlPackage, jp2up, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_11_1_performtransformation_bindingAndBlackFFFFFBB(
			InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InterfaceDec2Interface_11_1_performtransformation_binding = pattern_InterfaceDec2Interface_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_InterfaceDec2Interface_11_1_performtransformation_binding != null) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result_pattern_InterfaceDec2Interface_11_1_performtransformation_binding[0];
			Interface feature = (Interface) result_pattern_InterfaceDec2Interface_11_1_performtransformation_binding[1];
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result_pattern_InterfaceDec2Interface_11_1_performtransformation_binding[2];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result_pattern_InterfaceDec2Interface_11_1_performtransformation_binding[3];

			Object[] result_pattern_InterfaceDec2Interface_11_1_performtransformation_black = pattern_InterfaceDec2Interface_11_1_performtransformation_blackBBBBFBB(
					jPackage, feature, umlPackage, jp2up, _this, isApplicableMatch);
			if (result_pattern_InterfaceDec2Interface_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InterfaceDec2Interface_11_1_performtransformation_black[4];

				return new Object[] { jPackage, feature, umlPackage, jp2up, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_11_1_performtransformation_greenFBBFFB(
			org.eclipse.modisco.java.Package jPackage, Interface feature, CSP csp) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		InterfaceDeclaration bodyDeclaration = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		b2e.setTarget(feature);
		bd2ne.setTarget(feature);
		jPackage.getOwnedElements().add(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		bd2ne.setSource(bodyDeclaration);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		return new Object[] { b2e, jPackage, feature, bd2ne, bodyDeclaration, csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_11_2_collecttranslatedelements_blackBBBB(
			ASTNode2Element b2e, Interface feature, NamedElement2NamedElement bd2ne,
			InterfaceDeclaration bodyDeclaration) {
		return new Object[] { b2e, feature, bd2ne, bodyDeclaration };
	}

	public static final Object[] pattern_InterfaceDec2Interface_11_2_collecttranslatedelements_greenFBBBB(
			ASTNode2Element b2e, Interface feature, NamedElement2NamedElement bd2ne,
			InterfaceDeclaration bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, b2e, feature, bd2ne, bodyDeclaration };
	}

	public static final Object[] pattern_InterfaceDec2Interface_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2e, EObject jPackage, EObject feature, EObject umlPackage,
			EObject bd2ne, EObject jp2up, EObject bodyDeclaration) {
		if (!b2e.equals(jPackage)) {
			if (!b2e.equals(feature)) {
				if (!b2e.equals(umlPackage)) {
					if (!b2e.equals(bd2ne)) {
						if (!b2e.equals(jp2up)) {
							if (!b2e.equals(bodyDeclaration)) {
								if (!jPackage.equals(umlPackage)) {
									if (!jPackage.equals(jp2up)) {
										if (!feature.equals(jPackage)) {
											if (!feature.equals(umlPackage)) {
												if (!feature.equals(jp2up)) {
													if (!bd2ne.equals(jPackage)) {
														if (!bd2ne.equals(feature)) {
															if (!bd2ne.equals(umlPackage)) {
																if (!bd2ne.equals(jp2up)) {
																	if (!bd2ne.equals(bodyDeclaration)) {
																		if (!jp2up.equals(umlPackage)) {
																			if (!bodyDeclaration.equals(jPackage)) {
																				if (!bodyDeclaration.equals(feature)) {
																					if (!bodyDeclaration
																							.equals(umlPackage)) {
																						if (!bodyDeclaration
																								.equals(jp2up)) {
																							return new Object[] {
																									ruleresult, b2e,
																									jPackage, feature,
																									umlPackage, bd2ne,
																									jp2up,
																									bodyDeclaration };
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

	public static final Object[] pattern_InterfaceDec2Interface_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject b2e, EObject jPackage, EObject feature, EObject umlPackage,
			EObject bd2ne, EObject bodyDeclaration) {
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jPackage__bodyDeclaration____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InterfaceDec2Interface";
		String b2e__feature____target_name_prime = "target";
		String bd2ne__feature____target_name_prime = "target";
		String jPackage__bodyDeclaration____ownedElements_name_prime = "ownedElements";
		String bodyDeclaration__jPackage____package_name_prime = "package";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		jPackage__bodyDeclaration____ownedElements.setSrc(jPackage);
		jPackage__bodyDeclaration____ownedElements.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(jPackage__bodyDeclaration____ownedElements);
		bodyDeclaration__jPackage____package.setSrc(bodyDeclaration);
		bodyDeclaration__jPackage____package.setTrg(jPackage);
		ruleresult.getCreatedEdges().add(bodyDeclaration__jPackage____package);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		ruleresult.getTranslatedEdges().add(umlPackage__feature____packagedElement);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		jPackage__bodyDeclaration____ownedElements.setName(jPackage__bodyDeclaration____ownedElements_name_prime);
		bodyDeclaration__jPackage____package.setName(bodyDeclaration__jPackage____package_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		return new Object[] { ruleresult, b2e, jPackage, feature, umlPackage, bd2ne, bodyDeclaration,
				b2e__feature____target, bd2ne__feature____target, jPackage__bodyDeclaration____ownedElements,
				bodyDeclaration__jPackage____package, b2e__bodyDeclaration____source,
				umlPackage__feature____packagedElement, bd2ne__bodyDeclaration____source };
	}

	public static final void pattern_InterfaceDec2Interface_11_5_registerobjects_expressionBBBBBBBBB(
			InterfaceDec2Interface _this, PerformRuleResult ruleresult, EObject b2e, EObject jPackage, EObject feature,
			EObject umlPackage, EObject bd2ne, EObject jp2up, EObject bodyDeclaration) {
		_this.registerObjects_BWD(ruleresult, b2e, jPackage, feature, umlPackage, bd2ne, jp2up, bodyDeclaration);

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

	public static final Object[] pattern_InterfaceDec2Interface_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("umlPackage");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUmlPackage = _localVariable_1;
		if (tmpFeature instanceof Interface) {
			Interface feature = (Interface) tmpFeature;
			if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
				return new Object[] { feature, umlPackage, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceDec2Interface_12_2_corematch_blackFBBFB(Interface feature,
			org.eclipse.uml2.uml.Package umlPackage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(umlPackage, JavaPackage2UmlPackage.class, "target")) {
			org.eclipse.modisco.java.Package jPackage = jp2up.getSource();
			if (jPackage != null) {
				_result.add(new Object[] { jPackage, feature, umlPackage, jp2up, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceDec2Interface_12_3_findcontext_blackBBBB(
			org.eclipse.modisco.java.Package jPackage, Interface feature, org.eclipse.uml2.uml.Package umlPackage,
			JavaPackage2UmlPackage jp2up) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (umlPackage.equals(jp2up.getTarget())) {
			if (jPackage.equals(jp2up.getSource())) {
				if (umlPackage.getPackagedElements().contains(feature)) {
					_result.add(new Object[] { jPackage, feature, umlPackage, jp2up });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_12_3_findcontext_greenBBBBFFFF(
			org.eclipse.modisco.java.Package jPackage, Interface feature, org.eclipse.uml2.uml.Package umlPackage,
			JavaPackage2UmlPackage jp2up) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jp2up__umlPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__jPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jp2up__umlPackage____target_name_prime = "target";
		String jp2up__jPackage____source_name_prime = "source";
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		isApplicableMatch.getAllContextElements().add(jPackage);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(umlPackage);
		isApplicableMatch.getAllContextElements().add(jp2up);
		jp2up__umlPackage____target.setSrc(jp2up);
		jp2up__umlPackage____target.setTrg(umlPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__umlPackage____target);
		jp2up__jPackage____source.setSrc(jp2up);
		jp2up__jPackage____source.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__jPackage____source);
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(umlPackage__feature____packagedElement);
		jp2up__umlPackage____target.setName(jp2up__umlPackage____target_name_prime);
		jp2up__jPackage____source.setName(jp2up__jPackage____source_name_prime);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		return new Object[] { jPackage, feature, umlPackage, jp2up, isApplicableMatch, jp2up__umlPackage____target,
				jp2up__jPackage____source, umlPackage__feature____packagedElement };
	}

	public static final Object[] pattern_InterfaceDec2Interface_12_4_solveCSP_bindingFBBBBBB(
			InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package jPackage, Interface feature, org.eclipse.uml2.uml.Package umlPackage,
			JavaPackage2UmlPackage jp2up) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, jPackage, feature, umlPackage, jp2up);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jPackage, feature, umlPackage, jp2up };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_12_4_solveCSP_bindingAndBlackFBBBBBB(
			InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package jPackage, Interface feature, org.eclipse.uml2.uml.Package umlPackage,
			JavaPackage2UmlPackage jp2up) {
		Object[] result_pattern_InterfaceDec2Interface_12_4_solveCSP_binding = pattern_InterfaceDec2Interface_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jPackage, feature, umlPackage, jp2up);
		if (result_pattern_InterfaceDec2Interface_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceDec2Interface_12_4_solveCSP_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_12_4_solveCSP_black = pattern_InterfaceDec2Interface_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceDec2Interface_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jPackage, feature, umlPackage, jp2up };
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

	public static final Object[] pattern_InterfaceDec2Interface_20_2_testcorematchandDECs_black_nac_0B(
			Interface feature) {
		for (org.eclipse.uml2.uml.Class __DEC_feature_nestedClassifier_261628 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Class.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_20_2_testcorematchandDECs_black_nac_1B(
			Interface feature) {
		for (Interface __DEC_feature_nestedClassifier_35148 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, Interface.class, "nestedClassifier")) {
			if (!feature.equals(__DEC_feature_nestedClassifier_35148)) {
				return new Object[] { feature };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceDec2Interface_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUmlPackage = _edge_packagedElement.getSrc();
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			EObject tmpFeature = _edge_packagedElement.getTrg();
			if (tmpFeature instanceof Interface) {
				Interface feature = (Interface) tmpFeature;
				if (umlPackage.getPackagedElements().contains(feature)) {
					if (pattern_InterfaceDec2Interface_20_2_testcorematchandDECs_black_nac_0B(feature) == null) {
						if (pattern_InterfaceDec2Interface_20_2_testcorematchandDECs_black_nac_1B(feature) == null) {
							_result.add(new Object[] { feature, umlPackage, _edge_packagedElement });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InterfaceDec2Interface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			InterfaceDec2Interface _this, Match match, Interface feature, org.eclipse.uml2.uml.Package umlPackage) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, umlPackage);
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
		Modifier __DEC_bodyDeclaration_modifier_788201 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_788201 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_black_nac_1B(
			InterfaceDeclaration bodyDeclaration) {
		AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_942609 = bodyDeclaration
				.getAbstractTypeDeclaration();
		if (__DEC_bodyDeclaration_bodyDeclarations_942609 != null) {
			if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_942609)) {
				return new Object[] { bodyDeclaration };
			}
		}

		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_black_nac_2B(
			InterfaceDeclaration bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_213473 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_213473 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_black_nac_3B(
			InterfaceDeclaration bodyDeclaration) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_880553 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { bodyDeclaration };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJPackage = _edge_ownedElements.getSrc();
		if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
			EObject tmpBodyDeclaration = _edge_ownedElements.getTrg();
			if (tmpBodyDeclaration instanceof InterfaceDeclaration) {
				InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) tmpBodyDeclaration;
				if (jPackage.getOwnedElements().contains(bodyDeclaration)) {
					if (pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_black_nac_0B(
							bodyDeclaration) == null) {
						if (pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_black_nac_1B(
								bodyDeclaration) == null) {
							if (pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_black_nac_2B(
									bodyDeclaration) == null) {
								if (pattern_InterfaceDec2Interface_21_2_testcorematchandDECs_black_nac_3B(
										bodyDeclaration) == null) {
									_result.add(new Object[] { jPackage, bodyDeclaration, _edge_ownedElements });
								}
							}
						}
					}
				}
			}

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

	public static final boolean pattern_InterfaceDec2Interface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			InterfaceDec2Interface _this, Match match, org.eclipse.modisco.java.Package jPackage,
			InterfaceDeclaration bodyDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jPackage, bodyDeclaration);
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

	public static final Object[] pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("jPackage");
		EObject _localVariable_1 = targetMatch.getObject("feature");
		EObject _localVariable_2 = targetMatch.getObject("umlPackage");
		EObject _localVariable_3 = sourceMatch.getObject("bodyDeclaration");
		EObject tmpJPackage = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpUmlPackage = _localVariable_2;
		EObject tmpBodyDeclaration = _localVariable_3;
		if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
			if (tmpFeature instanceof Interface) {
				Interface feature = (Interface) tmpFeature;
				if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
					org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
					if (tmpBodyDeclaration instanceof InterfaceDeclaration) {
						InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) tmpBodyDeclaration;
						return new Object[] { jPackage, feature, umlPackage, bodyDeclaration, sourceMatch,
								targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_blackBBBBBB(
			org.eclipse.modisco.java.Package jPackage, Interface feature, org.eclipse.uml2.uml.Package umlPackage,
			InterfaceDeclaration bodyDeclaration, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { jPackage, feature, umlPackage, bodyDeclaration, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_binding = pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result_pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_binding[0];
			Interface feature = (Interface) result_pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_binding[1];
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result_pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_binding[2];
			InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result_pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_black = pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_blackBBBBBB(
					jPackage, feature, umlPackage, bodyDeclaration, sourceMatch, targetMatch);
			if (result_pattern_InterfaceDec2Interface_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { jPackage, feature, umlPackage, bodyDeclaration, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_3_solvecsp_bindingFBBBBBBB(
			InterfaceDec2Interface _this, org.eclipse.modisco.java.Package jPackage, Interface feature,
			org.eclipse.uml2.uml.Package umlPackage, InterfaceDeclaration bodyDeclaration, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(jPackage, feature, umlPackage, bodyDeclaration,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, jPackage, feature, umlPackage, bodyDeclaration, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			InterfaceDec2Interface _this, org.eclipse.modisco.java.Package jPackage, Interface feature,
			org.eclipse.uml2.uml.Package umlPackage, InterfaceDeclaration bodyDeclaration, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_InterfaceDec2Interface_24_3_solvecsp_binding = pattern_InterfaceDec2Interface_24_3_solvecsp_bindingFBBBBBBB(
				_this, jPackage, feature, umlPackage, bodyDeclaration, sourceMatch, targetMatch);
		if (result_pattern_InterfaceDec2Interface_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceDec2Interface_24_3_solvecsp_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_24_3_solvecsp_black = pattern_InterfaceDec2Interface_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_InterfaceDec2Interface_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, jPackage, feature, umlPackage, bodyDeclaration, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceDec2Interface_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceDec2Interface_24_5_matchcorrcontext_blackBBFBB(
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package umlPackage, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(umlPackage, JavaPackage2UmlPackage.class, "target")) {
				if (jPackage.equals(jp2up.getSource())) {
					_result.add(new Object[] { jPackage, umlPackage, jp2up, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_5_matchcorrcontext_greenBBBF(
			JavaPackage2UmlPackage jp2up, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "InterfaceDec2Interface";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(jp2up);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { jp2up, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_6_createcorrespondence_blackBBBBB(
			org.eclipse.modisco.java.Package jPackage, Interface feature, org.eclipse.uml2.uml.Package umlPackage,
			InterfaceDeclaration bodyDeclaration, CCMatch ccMatch) {
		return new Object[] { jPackage, feature, umlPackage, bodyDeclaration, ccMatch };
	}

	public static final Object[] pattern_InterfaceDec2Interface_24_6_createcorrespondence_greenFBFBB(Interface feature,
			InterfaceDeclaration bodyDeclaration, CCMatch ccMatch) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		b2e.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		ccMatch.getCreateCorr().add(b2e);
		bd2ne.setTarget(feature);
		bd2ne.setSource(bodyDeclaration);
		ccMatch.getCreateCorr().add(bd2ne);
		return new Object[] { b2e, feature, bd2ne, bodyDeclaration, ccMatch };
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
		Modifier __DEC_bodyDeclaration_modifier_717910 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_717910 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_27_1_matchtggpattern_black_nac_1B(
			InterfaceDeclaration bodyDeclaration) {
		AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_298150 = bodyDeclaration
				.getAbstractTypeDeclaration();
		if (__DEC_bodyDeclaration_bodyDeclarations_298150 != null) {
			if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_298150)) {
				return new Object[] { bodyDeclaration };
			}
		}

		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_27_1_matchtggpattern_black_nac_2B(
			InterfaceDeclaration bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_609028 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_609028 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_27_1_matchtggpattern_black_nac_3B(
			InterfaceDeclaration bodyDeclaration) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_754546 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_27_1_matchtggpattern_blackBB(
			org.eclipse.modisco.java.Package jPackage, InterfaceDeclaration bodyDeclaration) {
		if (jPackage.getOwnedElements().contains(bodyDeclaration)) {
			if (pattern_InterfaceDec2Interface_27_1_matchtggpattern_black_nac_0B(bodyDeclaration) == null) {
				if (pattern_InterfaceDec2Interface_27_1_matchtggpattern_black_nac_1B(bodyDeclaration) == null) {
					if (pattern_InterfaceDec2Interface_27_1_matchtggpattern_black_nac_2B(bodyDeclaration) == null) {
						if (pattern_InterfaceDec2Interface_27_1_matchtggpattern_black_nac_3B(bodyDeclaration) == null) {
							return new Object[] { jPackage, bodyDeclaration };
						}
					}
				}
			}
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

	public static final Object[] pattern_InterfaceDec2Interface_28_1_matchtggpattern_black_nac_0B(Interface feature) {
		for (org.eclipse.uml2.uml.Class __DEC_feature_nestedClassifier_76382 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Class.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_28_1_matchtggpattern_black_nac_1B(Interface feature) {
		for (Interface __DEC_feature_nestedClassifier_175585 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, Interface.class, "nestedClassifier")) {
			if (!feature.equals(__DEC_feature_nestedClassifier_175585)) {
				return new Object[] { feature };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_28_1_matchtggpattern_blackBB(Interface feature,
			org.eclipse.uml2.uml.Package umlPackage) {
		if (umlPackage.getPackagedElements().contains(feature)) {
			if (pattern_InterfaceDec2Interface_28_1_matchtggpattern_black_nac_0B(feature) == null) {
				if (pattern_InterfaceDec2Interface_28_1_matchtggpattern_black_nac_1B(feature) == null) {
					return new Object[] { feature, umlPackage };
				}
			}
		}
		return null;
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

	public static final Object[] pattern_InterfaceDec2Interface_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package jPackage) {
		if (ruleResult.getSourceObjects().contains(jPackage)) {
			return new Object[] { ruleResult, jPackage };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, JavaPackage2UmlPackage jp2up) {
		if (ruleResult.getCorrObjects().contains(jp2up)) {
			return new Object[] { ruleResult, jp2up };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Package umlPackage) {
		if (ruleResult.getTargetObjects().contains(umlPackage)) {
			return new Object[] { ruleResult, umlPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceDec2Interface_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList jp2upList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpJp2up : jp2upList.getEntryObjects()) {
				if (tmpJp2up instanceof JavaPackage2UmlPackage) {
					JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) tmpJp2up;
					org.eclipse.modisco.java.Package jPackage = jp2up.getSource();
					if (jPackage != null) {
						org.eclipse.uml2.uml.Package umlPackage = jp2up.getTarget();
						if (umlPackage != null) {
							if (pattern_InterfaceDec2Interface_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									jp2up) == null) {
								if (pattern_InterfaceDec2Interface_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										jPackage) == null) {
									if (pattern_InterfaceDec2Interface_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											umlPackage) == null) {
										_result.add(new Object[] { jp2upList, jPackage, jp2up, umlPackage,
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

	public static final Object[] pattern_InterfaceDec2Interface_29_3_solveCSP_bindingFBBBBBB(
			InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package umlPackage,
			JavaPackage2UmlPackage jp2up, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, jPackage, umlPackage, jp2up,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jPackage, umlPackage, jp2up, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceDec2Interface_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceDec2Interface_29_3_solveCSP_bindingAndBlackFBBBBBB(
			InterfaceDec2Interface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package umlPackage,
			JavaPackage2UmlPackage jp2up, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InterfaceDec2Interface_29_3_solveCSP_binding = pattern_InterfaceDec2Interface_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jPackage, umlPackage, jp2up, ruleResult);
		if (result_pattern_InterfaceDec2Interface_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceDec2Interface_29_3_solveCSP_binding[0];

			Object[] result_pattern_InterfaceDec2Interface_29_3_solveCSP_black = pattern_InterfaceDec2Interface_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceDec2Interface_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jPackage, umlPackage, jp2up, ruleResult };
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

	public static final Object[] pattern_InterfaceDec2Interface_29_5_checknacs_blackBBB(
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package umlPackage,
			JavaPackage2UmlPackage jp2up) {
		return new Object[] { jPackage, umlPackage, jp2up };
	}

	public static final Object[] pattern_InterfaceDec2Interface_29_6_perform_blackBBBB(
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package umlPackage,
			JavaPackage2UmlPackage jp2up, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { jPackage, umlPackage, jp2up, ruleResult };
	}

	public static final Object[] pattern_InterfaceDec2Interface_29_6_perform_greenFBFBFFBB(
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package umlPackage,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Interface feature = UMLFactory.eINSTANCE.createInterface();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		InterfaceDeclaration bodyDeclaration = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("bodyDeclaration", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(b2e);
		b2e.setTarget(feature);
		umlPackage.getPackagedElements().add(feature);
		ruleResult.getTargetObjects().add(feature);
		bd2ne.setTarget(feature);
		ruleResult.getCorrObjects().add(bd2ne);
		jPackage.getOwnedElements().add(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		bd2ne.setSource(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		String feature_name_prime = (String) _localVariable_0;
		String bodyDeclaration_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		feature.setName(feature_name_prime);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { b2e, jPackage, feature, umlPackage, bd2ne, bodyDeclaration, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_InterfaceDec2Interface_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InterfaceDec2InterfaceImpl
