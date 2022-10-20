/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.Model;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage;

import org.gravity.tgg.modisco.uml.Rules.JavaPackageToUMLPackage_underPackage;
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
 * An implementation of the model object '<em><b>Java Package To UML Package under Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class JavaPackageToUMLPackage_underPackageImpl extends AbstractRuleImpl
		implements JavaPackageToUMLPackage_underPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaPackageToUMLPackage_underPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getJavaPackageToUMLPackage_underPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp) {

		Object[] result1_black = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_0_1_initialbindings_blackBBBB(this, match, jParent, jp);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jParent] = " + jParent + ", " + "[jp] = " + jp + ".");
		}

		Object[] result2_bindingAndBlack = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, jParent,
						jp);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jParent] = " + jParent + ", " + "[jp] = " + jp + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_0_4_collectelementstobetranslated_blackBBB(match,
							jParent, jp);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jParent] = " + jParent + ", " + "[jp] = " + jp + ".");
			}
			JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_0_4_collectelementstobetranslated_greenBBBFF(match,
							jParent, jp);
			//nothing EMoflonEdge jParent__jp____ownedPackages = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge jp__jParent____package = (EMoflonEdge) result4_green[4];

			Object[] result5_black = JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_0_5_collectcontextelements_blackBBB(match, jParent,
							jp);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jParent] = " + jParent + ", " + "[jp] = " + jp + ".");
			}
			JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_0_5_collectcontextelements_greenBB(match, jParent);

			// 
			JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_0_6_registerobjectstomatch_expressionBBBB(this, match,
							jParent, jp);
			return JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_0_7_expressionF();
		} else {
			return JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result1_bindingAndBlack[0];
		org.eclipse.uml2.uml.Package uParent = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[1];
		org.eclipse.modisco.java.Package jParent = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[2];
		org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_greenFFBBB(uParent, jp, csp);
		org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result1_green[0];
		JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result1_green[1];

		Object[] result2_black = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_1_2_collecttranslatedelements_blackBBB(up, jp2up, jp);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[up] = " + up + ", "
					+ "[jp2up] = " + jp2up + ", " + "[jp] = " + jp + ".");
		}
		Object[] result2_green = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_1_2_collecttranslatedelements_greenFBBB(up, jp2up, jp);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, up, p2p,
						jp2up, uParent, jParent, jp);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[up] = " + up + ", " + "[p2p] = " + p2p + ", " + "[jp2up] = " + jp2up + ", "
					+ "[uParent] = " + uParent + ", " + "[jParent] = " + jParent + ", " + "[jp] = " + jp + ".");
		}
		JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, up,
						jp2up, uParent, jParent, jp);
		//nothing EMoflonEdge jp2up__up____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge uParent__up____packagedElement = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge jp2up__jp____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge jParent__jp____ownedPackages = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge jp__jParent____package = (EMoflonEdge) result3_green[10];

		// 
		// 
		JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						up, p2p, jp2up, uParent, jParent, jp);
		return JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.Package jParent = (org.eclipse.modisco.java.Package) result2_binding[0];
		org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result2_binding[1];
		for (Object[] result2_black : JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_2_2_corematch_blackFFBBB(jParent, jp, match)) {
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result2_black[0];
			org.eclipse.uml2.uml.Package uParent = (org.eclipse.uml2.uml.Package) result2_black[1];
			// ForEach 
			for (Object[] result3_black : JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_2_3_findcontext_blackBBBB(p2p, uParent, jParent,
							jp)) {
				Object[] result3_green = JavaPackageToUMLPackage_underPackageImpl
						.pattern_JavaPackageToUMLPackage_underPackage_2_3_findcontext_greenBBBBFFFFF(p2p, uParent,
								jParent, jp);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge p2p__uParent____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge p2p__jParent____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jParent__jp____ownedPackages = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge jp__jParent____package = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = JavaPackageToUMLPackage_underPackageImpl
						.pattern_JavaPackageToUMLPackage_underPackage_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, p2p, uParent, jParent, jp);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p2p] = " + p2p + ", "
							+ "[uParent] = " + uParent + ", " + "[jParent] = " + jParent + ", " + "[jp] = " + jp + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (JavaPackageToUMLPackage_underPackageImpl
						.pattern_JavaPackageToUMLPackage_underPackage_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = JavaPackageToUMLPackage_underPackageImpl
							.pattern_JavaPackageToUMLPackage_underPackage_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					JavaPackageToUMLPackage_underPackageImpl
							.pattern_JavaPackageToUMLPackage_underPackage_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp) {
		match.registerObject("jParent", jParent);
		match.registerObject("jp", jp);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, JavaPackage2UmlPackage p2p,
			org.eclipse.uml2.uml.Package uParent, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_jp_name = CSPFactoryHelper.eINSTANCE.createVariable("jp.name", true, csp);
		var_jp_name.setValue(jp.getName());
		var_jp_name.setType("String");

		// Create unbound variables
		Variable var_up_name = CSPFactoryHelper.eINSTANCE.createVariable("up.name", csp);
		var_up_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_up_name, var_jp_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p2p", p2p);
		isApplicableMatch.registerObject("uParent", uParent);
		isApplicableMatch.registerObject("jParent", jParent);
		isApplicableMatch.registerObject("jp", jp);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject up, EObject p2p, EObject jp2up,
			EObject uParent, EObject jParent, EObject jp) {
		ruleresult.registerObject("up", up);
		ruleresult.registerObject("p2p", p2p);
		ruleresult.registerObject("jp2up", jp2up);
		ruleresult.registerObject("uParent", uParent);
		ruleresult.registerObject("jParent", jParent);
		ruleresult.registerObject("jp", jp);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("jp").eClass()).equals("java.Package.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Package up,
			org.eclipse.uml2.uml.Package uParent) {

		Object[] result1_black = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_10_1_initialbindings_blackBBBB(this, match, up, uParent);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[up] = " + up + ", " + "[uParent] = " + uParent + ".");
		}

		Object[] result2_bindingAndBlack = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, up,
						uParent);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[up] = " + up + ", " + "[uParent] = " + uParent + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_10_4_collectelementstobetranslated_blackBBB(match, up,
							uParent);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[up] = " + up + ", " + "[uParent] = " + uParent + ".");
			}
			JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_10_4_collectelementstobetranslated_greenBBBF(match,
							up, uParent);
			//nothing EMoflonEdge uParent__up____packagedElement = (EMoflonEdge) result4_green[3];

			Object[] result5_black = JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_10_5_collectcontextelements_blackBBB(match, up,
							uParent);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[up] = " + up + ", " + "[uParent] = " + uParent + ".");
			}
			JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_10_5_collectcontextelements_greenBB(match, uParent);

			// 
			JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_10_6_registerobjectstomatch_expressionBBBB(this,
							match, up, uParent);
			return JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_10_7_expressionF();
		} else {
			return JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[0];
		JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result1_bindingAndBlack[1];
		org.eclipse.uml2.uml.Package uParent = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[2];
		org.eclipse.modisco.java.Package jParent = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_greenBFBFB(up, jParent, csp);
		JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result1_green[1];
		org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result1_green[3];

		Object[] result2_black = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_11_2_collecttranslatedelements_blackBBB(up, jp2up, jp);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[up] = " + up + ", "
					+ "[jp2up] = " + jp2up + ", " + "[jp] = " + jp + ".");
		}
		Object[] result2_green = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_11_2_collecttranslatedelements_greenFBBB(up, jp2up, jp);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, up, p2p,
						jp2up, uParent, jParent, jp);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[up] = " + up + ", " + "[p2p] = " + p2p + ", " + "[jp2up] = " + jp2up + ", "
					+ "[uParent] = " + uParent + ", " + "[jParent] = " + jParent + ", " + "[jp] = " + jp + ".");
		}
		JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, up,
						jp2up, uParent, jParent, jp);
		//nothing EMoflonEdge jp2up__up____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge uParent__up____packagedElement = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge jp2up__jp____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge jParent__jp____ownedPackages = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge jp__jParent____package = (EMoflonEdge) result3_green[10];

		// 
		// 
		JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						up, p2p, jp2up, uParent, jParent, jp);
		return JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result2_binding[0];
		org.eclipse.uml2.uml.Package uParent = (org.eclipse.uml2.uml.Package) result2_binding[1];
		for (Object[] result2_black : JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_12_2_corematch_blackBFBFB(up, uParent, match)) {
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result2_black[1];
			org.eclipse.modisco.java.Package jParent = (org.eclipse.modisco.java.Package) result2_black[3];
			// ForEach 
			for (Object[] result3_black : JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_12_3_findcontext_blackBBBB(up, p2p, uParent,
							jParent)) {
				Object[] result3_green = JavaPackageToUMLPackage_underPackageImpl
						.pattern_JavaPackageToUMLPackage_underPackage_12_3_findcontext_greenBBBBFFFF(up, p2p, uParent,
								jParent);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge p2p__uParent____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge uParent__up____packagedElement = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge p2p__jParent____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = JavaPackageToUMLPackage_underPackageImpl
						.pattern_JavaPackageToUMLPackage_underPackage_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, up, p2p, uParent, jParent);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[up] = " + up + ", " + "[p2p] = "
							+ p2p + ", " + "[uParent] = " + uParent + ", " + "[jParent] = " + jParent + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (JavaPackageToUMLPackage_underPackageImpl
						.pattern_JavaPackageToUMLPackage_underPackage_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = JavaPackageToUMLPackage_underPackageImpl
							.pattern_JavaPackageToUMLPackage_underPackage_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					JavaPackageToUMLPackage_underPackageImpl
							.pattern_JavaPackageToUMLPackage_underPackage_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Package up,
			org.eclipse.uml2.uml.Package uParent) {
		match.registerObject("up", up);
		match.registerObject("uParent", uParent);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Package up,
			org.eclipse.uml2.uml.Package uParent) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Package up,
			JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uParent,
			org.eclipse.modisco.java.Package jParent) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_up_name = CSPFactoryHelper.eINSTANCE.createVariable("up.name", true, csp);
		var_up_name.setValue(up.getName());
		var_up_name.setType("String");

		// Create unbound variables
		Variable var_jp_name = CSPFactoryHelper.eINSTANCE.createVariable("jp.name", csp);
		var_jp_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_up_name, var_jp_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("up", up);
		isApplicableMatch.registerObject("p2p", p2p);
		isApplicableMatch.registerObject("uParent", uParent);
		isApplicableMatch.registerObject("jParent", jParent);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject up, EObject p2p, EObject jp2up,
			EObject uParent, EObject jParent, EObject jp) {
		ruleresult.registerObject("up", up);
		ruleresult.registerObject("p2p", p2p);
		ruleresult.registerObject("jp2up", jp2up);
		ruleresult.registerObject("uParent", uParent);
		ruleresult.registerObject("jParent", jParent);
		ruleresult.registerObject("jp", jp);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("up").eClass()).equals("uml.Package.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_95(EMoflonEdge _edge_packagedElement) {

		Object[] result1_bindingAndBlack = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_20_2_testcorematchandDECs_blackFFB(
						_edge_packagedElement)) {
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result2_black[0];
			org.eclipse.uml2.uml.Package uParent = (org.eclipse.uml2.uml.Package) result2_black[1];
			Object[] result2_green = JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, up, uParent)) {
				// 
				if (JavaPackageToUMLPackage_underPackageImpl
						.pattern_JavaPackageToUMLPackage_underPackage_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = JavaPackageToUMLPackage_underPackageImpl
							.pattern_JavaPackageToUMLPackage_underPackage_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					JavaPackageToUMLPackage_underPackageImpl
							.pattern_JavaPackageToUMLPackage_underPackage_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_101(EMoflonEdge _edge_ownedPackages) {

		Object[] result1_bindingAndBlack = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_21_2_testcorematchandDECs_blackFFB(_edge_ownedPackages)) {
			org.eclipse.modisco.java.Package jParent = (org.eclipse.modisco.java.Package) result2_black[0];
			org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result2_black[1];
			Object[] result2_green = JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, jParent, jp)) {
				// 
				if (JavaPackageToUMLPackage_underPackageImpl
						.pattern_JavaPackageToUMLPackage_underPackage_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = JavaPackageToUMLPackage_underPackageImpl
							.pattern_JavaPackageToUMLPackage_underPackage_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					JavaPackageToUMLPackage_underPackageImpl
							.pattern_JavaPackageToUMLPackage_underPackage_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("JavaPackageToUMLPackage_underPackage");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_jp_name = CSPFactoryHelper.eINSTANCE.createVariable("jp", true, csp);
		var_jp_name.setValue(__helper.getValue("jp", "name"));
		var_jp_name.setType("String");

		Variable var_up_name = CSPFactoryHelper.eINSTANCE.createVariable("up", true, csp);
		var_up_name.setValue(__helper.getValue("up", "name"));
		var_up_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("JavaPackageToUMLPackage_underPackage");
		eq0.solve(var_up_name, var_jp_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_up_name.setBound(false);
			eq0.solve(var_up_name, var_jp_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("up", "name", var_up_name.getValue());
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
		ruleResult.setRule("JavaPackageToUMLPackage_underPackage");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_jp_name = CSPFactoryHelper.eINSTANCE.createVariable("jp", true, csp);
		var_jp_name.setValue(__helper.getValue("jp", "name"));
		var_jp_name.setType("String");

		Variable var_up_name = CSPFactoryHelper.eINSTANCE.createVariable("up", true, csp);
		var_up_name.setValue(__helper.getValue("up", "name"));
		var_up_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("JavaPackageToUMLPackage_underPackage");
		eq0.solve(var_up_name, var_jp_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_jp_name.setBound(false);
			eq0.solve(var_up_name, var_jp_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("jp", "name", var_jp_name.getValue());
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

		Object[] result1_black = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result2_bindingAndBlack[0];
		org.eclipse.uml2.uml.Package uParent = (org.eclipse.uml2.uml.Package) result2_bindingAndBlack[1];
		org.eclipse.modisco.java.Package jParent = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[2];
		org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, up, uParent,
						jParent, jp, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[up] = " + up + ", "
							+ "[uParent] = " + uParent + ", " + "[jParent] = " + jParent + ", " + "[jp] = " + jp + ", "
							+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_24_5_matchcorrcontext_blackFBBBB(uParent, jParent,
							sourceMatch, targetMatch)) {
				JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result5_black[0];
				Object[] result5_green = JavaPackageToUMLPackage_underPackageImpl
						.pattern_JavaPackageToUMLPackage_underPackage_24_5_matchcorrcontext_greenBBBF(p2p, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = JavaPackageToUMLPackage_underPackageImpl
						.pattern_JavaPackageToUMLPackage_underPackage_24_6_createcorrespondence_blackBBBBB(up, uParent,
								jParent, jp, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[up] = " + up + ", "
							+ "[uParent] = " + uParent + ", " + "[jParent] = " + jParent + ", " + "[jp] = " + jp + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				JavaPackageToUMLPackage_underPackageImpl
						.pattern_JavaPackageToUMLPackage_underPackage_24_6_createcorrespondence_greenBFBB(up, jp,
								ccMatch);
				//nothing JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result6_green[1];

				Object[] result7_black = JavaPackageToUMLPackage_underPackageImpl
						.pattern_JavaPackageToUMLPackage_underPackage_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				JavaPackageToUMLPackage_underPackageImpl
						.pattern_JavaPackageToUMLPackage_underPackage_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Package up, org.eclipse.uml2.uml.Package uParent,
			org.eclipse.modisco.java.Package jParent, org.eclipse.modisco.java.Package jp, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_up_name = CSPFactoryHelper.eINSTANCE.createVariable("up.name", true, csp);
		var_up_name.setValue(up.getName());
		var_up_name.setType("String");
		Variable var_jp_name = CSPFactoryHelper.eINSTANCE.createVariable("jp.name", true, csp);
		var_jp_name.setValue(jp.getName());
		var_jp_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_up_name, var_jp_name);
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.Package jParent, org.eclipse.modisco.java.Package jp) {// 
		Object[] result1_black = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_27_1_matchtggpattern_blackBB(jParent, jp);
		if (result1_black != null) {
			return JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_27_2_expressionF();
		} else {
			return JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Package up, org.eclipse.uml2.uml.Package uParent) {// 
		Object[] result1_black = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_28_1_matchtggpattern_blackBB(up, uParent);
		if (result1_black != null) {
			return JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_28_2_expressionF();
		} else {
			return JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			JavaPackage2UmlPackage p2pParameter) {

		Object[] result1_black = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList p2pList = (RuleEntryList) result2_black[0];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result2_black[1];
			org.eclipse.uml2.uml.Package uParent = (org.eclipse.uml2.uml.Package) result2_black[2];
			org.eclipse.modisco.java.Package jParent = (org.eclipse.modisco.java.Package) result2_black[3];

			Object[] result3_bindingAndBlack = JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_29_3_solveCSP_bindingAndBlackFBBBBBB(this,
							isApplicableMatch, p2p, uParent, jParent, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p2p] = " + p2p + ", " + "[uParent] = "
						+ uParent + ", " + "[jParent] = " + jParent + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (JavaPackageToUMLPackage_underPackageImpl
					.pattern_JavaPackageToUMLPackage_underPackage_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = JavaPackageToUMLPackage_underPackageImpl
						.pattern_JavaPackageToUMLPackage_underPackage_29_5_checknacs_blackBBB(p2p, uParent, jParent);
				if (result5_black != null) {

					Object[] result6_black = JavaPackageToUMLPackage_underPackageImpl
							.pattern_JavaPackageToUMLPackage_underPackage_29_6_perform_blackBBBB(p2p, uParent, jParent,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[p2p] = " + p2p + ", "
								+ "[uParent] = " + uParent + ", " + "[jParent] = " + jParent + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					JavaPackageToUMLPackage_underPackageImpl
							.pattern_JavaPackageToUMLPackage_underPackage_29_6_perform_greenFFBBFBB(uParent, jParent,
									ruleResult, csp);
					//nothing org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result6_green[0];
					//nothing JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result6_green[1];
					//nothing org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return JavaPackageToUMLPackage_underPackageImpl
				.pattern_JavaPackageToUMLPackage_underPackage_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaPackage2UmlPackage p2p,
			org.eclipse.uml2.uml.Package uParent, org.eclipse.modisco.java.Package jParent,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_up_name = CSPFactoryHelper.eINSTANCE.createVariable("up.name", csp);
		var_up_name.setType("String");
		Variable var_jp_name = CSPFactoryHelper.eINSTANCE.createVariable("jp.name", csp);
		var_jp_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_up_name, var_jp_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p2p", p2p);
		isApplicableMatch.registerObject("uParent", uParent);
		isApplicableMatch.registerObject("jParent", jParent);
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
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPROPRIATE_FWD__MATCH_PACKAGE_PACKAGE:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_PACKAGE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2));
			return null;
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_PACKAGE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_JAVAPACKAGE2UMLPACKAGE_PACKAGE_PACKAGE_PACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(JavaPackage2UmlPackage) arguments.get(1), (org.eclipse.uml2.uml.Package) arguments.get(2),
					(org.eclipse.modisco.java.Package) arguments.get(3),
					(org.eclipse.modisco.java.Package) arguments.get(4));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_PACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_PACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
			return null;
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_PACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGE_JAVAPACKAGE2UMLPACKAGE_PACKAGE_PACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Package) arguments.get(1), (JavaPackage2UmlPackage) arguments.get(2),
					(org.eclipse.uml2.uml.Package) arguments.get(3),
					(org.eclipse.modisco.java.Package) arguments.get(4));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_95__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_95((EMoflonEdge) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_101__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_101((EMoflonEdge) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPLICABLE_SOLVE_CSP_CC__PACKAGE_PACKAGE_PACKAGE_PACKAGE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Package) arguments.get(0),
					(org.eclipse.uml2.uml.Package) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2),
					(org.eclipse.modisco.java.Package) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___CHECK_DEC_FWD__PACKAGE_PACKAGE:
			return checkDEC_FWD((org.eclipse.modisco.java.Package) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___CHECK_DEC_BWD__PACKAGE_PACKAGE:
			return checkDEC_BWD((org.eclipse.uml2.uml.Package) arguments.get(0),
					(org.eclipse.uml2.uml.Package) arguments.get(1));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___GENERATE_MODEL__RULEENTRYCONTAINER_JAVAPACKAGE2UMLPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (JavaPackage2UmlPackage) arguments.get(1));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAPACKAGE2UMLPACKAGE_PACKAGE_PACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(JavaPackage2UmlPackage) arguments.get(1), (org.eclipse.uml2.uml.Package) arguments.get(2),
					(org.eclipse.modisco.java.Package) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_PACKAGE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_0_1_initialbindings_blackBBBB(
			JavaPackageToUMLPackage_underPackage _this, Match match, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp) {
		if (!jParent.equals(jp)) {
			return new Object[] { _this, match, jParent, jp };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_0_2_SolveCSP_bindingFBBBB(
			JavaPackageToUMLPackage_underPackage _this, Match match, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jParent, jp);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jParent, jp };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_0_2_SolveCSP_bindingAndBlackFBBBB(
			JavaPackageToUMLPackage_underPackage _this, Match match, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp) {
		Object[] result_pattern_JavaPackageToUMLPackage_underPackage_0_2_SolveCSP_binding = pattern_JavaPackageToUMLPackage_underPackage_0_2_SolveCSP_bindingFBBBB(
				_this, match, jParent, jp);
		if (result_pattern_JavaPackageToUMLPackage_underPackage_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underPackage_0_2_SolveCSP_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underPackage_0_2_SolveCSP_black = pattern_JavaPackageToUMLPackage_underPackage_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_JavaPackageToUMLPackage_underPackage_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, jParent, jp };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_0_3_CheckCSP_expressionFBB(
			JavaPackageToUMLPackage_underPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_0_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.modisco.java.Package jParent, org.eclipse.modisco.java.Package jp) {
		if (!jParent.equals(jp)) {
			return new Object[] { match, jParent, jp };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, org.eclipse.modisco.java.Package jParent, org.eclipse.modisco.java.Package jp) {
		EMoflonEdge jParent__jp____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp__jParent____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(jp);
		String jParent__jp____ownedPackages_name_prime = "ownedPackages";
		String jp__jParent____package_name_prime = "package";
		jParent__jp____ownedPackages.setSrc(jParent);
		jParent__jp____ownedPackages.setTrg(jp);
		match.getToBeTranslatedEdges().add(jParent__jp____ownedPackages);
		jp__jParent____package.setSrc(jp);
		jp__jParent____package.setTrg(jParent);
		match.getToBeTranslatedEdges().add(jp__jParent____package);
		jParent__jp____ownedPackages.setName(jParent__jp____ownedPackages_name_prime);
		jp__jParent____package.setName(jp__jParent____package_name_prime);
		return new Object[] { match, jParent, jp, jParent__jp____ownedPackages, jp__jParent____package };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_0_5_collectcontextelements_blackBBB(
			Match match, org.eclipse.modisco.java.Package jParent, org.eclipse.modisco.java.Package jp) {
		if (!jParent.equals(jp)) {
			return new Object[] { match, jParent, jp };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_0_5_collectcontextelements_greenBB(
			Match match, org.eclipse.modisco.java.Package jParent) {
		match.getContextNodes().add(jParent);
		return new Object[] { match, jParent };
	}

	public static final void pattern_JavaPackageToUMLPackage_underPackage_0_6_registerobjectstomatch_expressionBBBB(
			JavaPackageToUMLPackage_underPackage _this, Match match, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp) {
		_this.registerObjectsToMatch_FWD(match, jParent, jp);

	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("p2p");
		EObject _localVariable_1 = isApplicableMatch.getObject("uParent");
		EObject _localVariable_2 = isApplicableMatch.getObject("jParent");
		EObject _localVariable_3 = isApplicableMatch.getObject("jp");
		EObject tmpP2p = _localVariable_0;
		EObject tmpUParent = _localVariable_1;
		EObject tmpJParent = _localVariable_2;
		EObject tmpJp = _localVariable_3;
		if (tmpP2p instanceof JavaPackage2UmlPackage) {
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) tmpP2p;
			if (tmpUParent instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package uParent = (org.eclipse.uml2.uml.Package) tmpUParent;
				if (tmpJParent instanceof org.eclipse.modisco.java.Package) {
					org.eclipse.modisco.java.Package jParent = (org.eclipse.modisco.java.Package) tmpJParent;
					if (tmpJp instanceof org.eclipse.modisco.java.Package) {
						org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) tmpJp;
						return new Object[] { p2p, uParent, jParent, jp, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_blackBBBBFBB(
			JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uParent, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp, JavaPackageToUMLPackage_underPackage _this,
			IsApplicableMatch isApplicableMatch) {
		if (!jParent.equals(jp)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { p2p, uParent, jParent, jp, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_bindingAndBlackFFFFFBB(
			JavaPackageToUMLPackage_underPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_binding = pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_binding != null) {
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result_pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_binding[0];
			org.eclipse.uml2.uml.Package uParent = (org.eclipse.uml2.uml.Package) result_pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_binding[1];
			org.eclipse.modisco.java.Package jParent = (org.eclipse.modisco.java.Package) result_pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_binding[2];
			org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result_pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_binding[3];

			Object[] result_pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_black = pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_blackBBBBFBB(
					p2p, uParent, jParent, jp, _this, isApplicableMatch);
			if (result_pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_black[4];

				return new Object[] { p2p, uParent, jParent, jp, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_1_1_performtransformation_greenFFBBB(
			org.eclipse.uml2.uml.Package uParent, org.eclipse.modisco.java.Package jp, CSP csp) {
		org.eclipse.uml2.uml.Package up = UMLFactory.eINSTANCE.createPackage();
		JavaPackage2UmlPackage jp2up = UmlFactory.eINSTANCE.createJavaPackage2UmlPackage();
		Object _localVariable_0 = csp.getValue("up", "name");
		uParent.getPackagedElements().add(up);
		jp2up.setTarget(up);
		jp2up.setSource(jp);
		String up_name_prime = (String) _localVariable_0;
		up.setName(up_name_prime);
		return new Object[] { up, jp2up, uParent, jp, csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_1_2_collecttranslatedelements_blackBBB(
			org.eclipse.uml2.uml.Package up, JavaPackage2UmlPackage jp2up, org.eclipse.modisco.java.Package jp) {
		return new Object[] { up, jp2up, jp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_1_2_collecttranslatedelements_greenFBBB(
			org.eclipse.uml2.uml.Package up, JavaPackage2UmlPackage jp2up, org.eclipse.modisco.java.Package jp) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(up);
		ruleresult.getCreatedLinkElements().add(jp2up);
		ruleresult.getTranslatedElements().add(jp);
		return new Object[] { ruleresult, up, jp2up, jp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject up, EObject p2p, EObject jp2up, EObject uParent, EObject jParent,
			EObject jp) {
		if (!p2p.equals(up)) {
			if (!p2p.equals(uParent)) {
				if (!jp2up.equals(up)) {
					if (!jp2up.equals(p2p)) {
						if (!jp2up.equals(uParent)) {
							if (!uParent.equals(up)) {
								if (!jParent.equals(up)) {
									if (!jParent.equals(p2p)) {
										if (!jParent.equals(jp2up)) {
											if (!jParent.equals(uParent)) {
												if (!jParent.equals(jp)) {
													if (!jp.equals(up)) {
														if (!jp.equals(p2p)) {
															if (!jp.equals(jp2up)) {
																if (!jp.equals(uParent)) {
																	return new Object[] { ruleresult, up, p2p, jp2up,
																			uParent, jParent, jp };
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

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject up, EObject jp2up, EObject uParent, EObject jParent, EObject jp) {
		EMoflonEdge jp2up__up____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uParent__up____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__jp____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jParent__jp____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp__jParent____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "JavaPackageToUMLPackage_underPackage";
		String jp2up__up____target_name_prime = "target";
		String uParent__up____packagedElement_name_prime = "packagedElement";
		String jp2up__jp____source_name_prime = "source";
		String jParent__jp____ownedPackages_name_prime = "ownedPackages";
		String jp__jParent____package_name_prime = "package";
		jp2up__up____target.setSrc(jp2up);
		jp2up__up____target.setTrg(up);
		ruleresult.getCreatedEdges().add(jp2up__up____target);
		uParent__up____packagedElement.setSrc(uParent);
		uParent__up____packagedElement.setTrg(up);
		ruleresult.getCreatedEdges().add(uParent__up____packagedElement);
		jp2up__jp____source.setSrc(jp2up);
		jp2up__jp____source.setTrg(jp);
		ruleresult.getCreatedEdges().add(jp2up__jp____source);
		jParent__jp____ownedPackages.setSrc(jParent);
		jParent__jp____ownedPackages.setTrg(jp);
		ruleresult.getTranslatedEdges().add(jParent__jp____ownedPackages);
		jp__jParent____package.setSrc(jp);
		jp__jParent____package.setTrg(jParent);
		ruleresult.getTranslatedEdges().add(jp__jParent____package);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jp2up__up____target.setName(jp2up__up____target_name_prime);
		uParent__up____packagedElement.setName(uParent__up____packagedElement_name_prime);
		jp2up__jp____source.setName(jp2up__jp____source_name_prime);
		jParent__jp____ownedPackages.setName(jParent__jp____ownedPackages_name_prime);
		jp__jParent____package.setName(jp__jParent____package_name_prime);
		return new Object[] { ruleresult, up, jp2up, uParent, jParent, jp, jp2up__up____target,
				uParent__up____packagedElement, jp2up__jp____source, jParent__jp____ownedPackages,
				jp__jParent____package };
	}

	public static final void pattern_JavaPackageToUMLPackage_underPackage_1_5_registerobjects_expressionBBBBBBBB(
			JavaPackageToUMLPackage_underPackage _this, PerformRuleResult ruleresult, EObject up, EObject p2p,
			EObject jp2up, EObject uParent, EObject jParent, EObject jp) {
		_this.registerObjects_FWD(ruleresult, up, p2p, jp2up, uParent, jParent, jp);

	}

	public static final PerformRuleResult pattern_JavaPackageToUMLPackage_underPackage_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_2_1_preparereturnvalue_bindingFB(
			JavaPackageToUMLPackage_underPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_2_1_preparereturnvalue_blackFBB(
			EClass eClass, JavaPackageToUMLPackage_underPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_2_1_preparereturnvalue_bindingAndBlackFFB(
			JavaPackageToUMLPackage_underPackage _this) {
		Object[] result_pattern_JavaPackageToUMLPackage_underPackage_2_1_preparereturnvalue_binding = pattern_JavaPackageToUMLPackage_underPackage_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaPackageToUMLPackage_underPackage_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_JavaPackageToUMLPackage_underPackage_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underPackage_2_1_preparereturnvalue_black = pattern_JavaPackageToUMLPackage_underPackage_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_JavaPackageToUMLPackage_underPackage_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_JavaPackageToUMLPackage_underPackage_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "JavaPackageToUMLPackage_underPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("jParent");
		EObject _localVariable_1 = match.getObject("jp");
		EObject tmpJParent = _localVariable_0;
		EObject tmpJp = _localVariable_1;
		if (tmpJParent instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jParent = (org.eclipse.modisco.java.Package) tmpJParent;
			if (tmpJp instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) tmpJp;
				return new Object[] { jParent, jp, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underPackage_2_2_corematch_blackFFBBB(
			org.eclipse.modisco.java.Package jParent, org.eclipse.modisco.java.Package jp, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jParent.equals(jp)) {
			for (JavaPackage2UmlPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(jParent, JavaPackage2UmlPackage.class, "source")) {
				org.eclipse.uml2.uml.Package uParent = p2p.getTarget();
				if (uParent != null) {
					_result.add(new Object[] { p2p, uParent, jParent, jp, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underPackage_2_3_findcontext_blackBBBB(
			JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uParent, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jParent.equals(jp)) {
			if (uParent.equals(p2p.getTarget())) {
				if (jParent.equals(p2p.getSource())) {
					if (jParent.getOwnedPackages().contains(jp)) {
						_result.add(new Object[] { p2p, uParent, jParent, jp });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_2_3_findcontext_greenBBBBFFFFF(
			JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uParent, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge p2p__uParent____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__jParent____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jParent__jp____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp__jParent____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String p2p__uParent____target_name_prime = "target";
		String p2p__jParent____source_name_prime = "source";
		String jParent__jp____ownedPackages_name_prime = "ownedPackages";
		String jp__jParent____package_name_prime = "package";
		isApplicableMatch.getAllContextElements().add(p2p);
		isApplicableMatch.getAllContextElements().add(uParent);
		isApplicableMatch.getAllContextElements().add(jParent);
		isApplicableMatch.getAllContextElements().add(jp);
		p2p__uParent____target.setSrc(p2p);
		p2p__uParent____target.setTrg(uParent);
		isApplicableMatch.getAllContextElements().add(p2p__uParent____target);
		p2p__jParent____source.setSrc(p2p);
		p2p__jParent____source.setTrg(jParent);
		isApplicableMatch.getAllContextElements().add(p2p__jParent____source);
		jParent__jp____ownedPackages.setSrc(jParent);
		jParent__jp____ownedPackages.setTrg(jp);
		isApplicableMatch.getAllContextElements().add(jParent__jp____ownedPackages);
		jp__jParent____package.setSrc(jp);
		jp__jParent____package.setTrg(jParent);
		isApplicableMatch.getAllContextElements().add(jp__jParent____package);
		p2p__uParent____target.setName(p2p__uParent____target_name_prime);
		p2p__jParent____source.setName(p2p__jParent____source_name_prime);
		jParent__jp____ownedPackages.setName(jParent__jp____ownedPackages_name_prime);
		jp__jParent____package.setName(jp__jParent____package_name_prime);
		return new Object[] { p2p, uParent, jParent, jp, isApplicableMatch, p2p__uParent____target,
				p2p__jParent____source, jParent__jp____ownedPackages, jp__jParent____package };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_2_4_solveCSP_bindingFBBBBBB(
			JavaPackageToUMLPackage_underPackage _this, IsApplicableMatch isApplicableMatch, JavaPackage2UmlPackage p2p,
			org.eclipse.uml2.uml.Package uParent, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, p2p, uParent, jParent, jp);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p2p, uParent, jParent, jp };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_2_4_solveCSP_bindingAndBlackFBBBBBB(
			JavaPackageToUMLPackage_underPackage _this, IsApplicableMatch isApplicableMatch, JavaPackage2UmlPackage p2p,
			org.eclipse.uml2.uml.Package uParent, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp) {
		Object[] result_pattern_JavaPackageToUMLPackage_underPackage_2_4_solveCSP_binding = pattern_JavaPackageToUMLPackage_underPackage_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, p2p, uParent, jParent, jp);
		if (result_pattern_JavaPackageToUMLPackage_underPackage_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underPackage_2_4_solveCSP_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underPackage_2_4_solveCSP_black = pattern_JavaPackageToUMLPackage_underPackage_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_JavaPackageToUMLPackage_underPackage_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p2p, uParent, jParent, jp };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_2_5_checkCSP_expressionFBB(
			JavaPackageToUMLPackage_underPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "JavaPackageToUMLPackage_underPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaPackageToUMLPackage_underPackage_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_10_1_initialbindings_blackBBBB(
			JavaPackageToUMLPackage_underPackage _this, Match match, org.eclipse.uml2.uml.Package up,
			org.eclipse.uml2.uml.Package uParent) {
		if (!uParent.equals(up)) {
			return new Object[] { _this, match, up, uParent };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_10_2_SolveCSP_bindingFBBBB(
			JavaPackageToUMLPackage_underPackage _this, Match match, org.eclipse.uml2.uml.Package up,
			org.eclipse.uml2.uml.Package uParent) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, up, uParent);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, up, uParent };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_10_2_SolveCSP_bindingAndBlackFBBBB(
			JavaPackageToUMLPackage_underPackage _this, Match match, org.eclipse.uml2.uml.Package up,
			org.eclipse.uml2.uml.Package uParent) {
		Object[] result_pattern_JavaPackageToUMLPackage_underPackage_10_2_SolveCSP_binding = pattern_JavaPackageToUMLPackage_underPackage_10_2_SolveCSP_bindingFBBBB(
				_this, match, up, uParent);
		if (result_pattern_JavaPackageToUMLPackage_underPackage_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underPackage_10_2_SolveCSP_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underPackage_10_2_SolveCSP_black = pattern_JavaPackageToUMLPackage_underPackage_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_JavaPackageToUMLPackage_underPackage_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, up, uParent };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_10_3_CheckCSP_expressionFBB(
			JavaPackageToUMLPackage_underPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_10_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.uml2.uml.Package up, org.eclipse.uml2.uml.Package uParent) {
		if (!uParent.equals(up)) {
			return new Object[] { match, up, uParent };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_10_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.uml2.uml.Package up, org.eclipse.uml2.uml.Package uParent) {
		EMoflonEdge uParent__up____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(up);
		String uParent__up____packagedElement_name_prime = "packagedElement";
		uParent__up____packagedElement.setSrc(uParent);
		uParent__up____packagedElement.setTrg(up);
		match.getToBeTranslatedEdges().add(uParent__up____packagedElement);
		uParent__up____packagedElement.setName(uParent__up____packagedElement_name_prime);
		return new Object[] { match, up, uParent, uParent__up____packagedElement };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_10_5_collectcontextelements_blackBBB(
			Match match, org.eclipse.uml2.uml.Package up, org.eclipse.uml2.uml.Package uParent) {
		if (!uParent.equals(up)) {
			return new Object[] { match, up, uParent };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_10_5_collectcontextelements_greenBB(
			Match match, org.eclipse.uml2.uml.Package uParent) {
		match.getContextNodes().add(uParent);
		return new Object[] { match, uParent };
	}

	public static final void pattern_JavaPackageToUMLPackage_underPackage_10_6_registerobjectstomatch_expressionBBBB(
			JavaPackageToUMLPackage_underPackage _this, Match match, org.eclipse.uml2.uml.Package up,
			org.eclipse.uml2.uml.Package uParent) {
		_this.registerObjectsToMatch_BWD(match, up, uParent);

	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("up");
		EObject _localVariable_1 = isApplicableMatch.getObject("p2p");
		EObject _localVariable_2 = isApplicableMatch.getObject("uParent");
		EObject _localVariable_3 = isApplicableMatch.getObject("jParent");
		EObject tmpUp = _localVariable_0;
		EObject tmpP2p = _localVariable_1;
		EObject tmpUParent = _localVariable_2;
		EObject tmpJParent = _localVariable_3;
		if (tmpUp instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) tmpUp;
			if (tmpP2p instanceof JavaPackage2UmlPackage) {
				JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) tmpP2p;
				if (tmpUParent instanceof org.eclipse.uml2.uml.Package) {
					org.eclipse.uml2.uml.Package uParent = (org.eclipse.uml2.uml.Package) tmpUParent;
					if (tmpJParent instanceof org.eclipse.modisco.java.Package) {
						org.eclipse.modisco.java.Package jParent = (org.eclipse.modisco.java.Package) tmpJParent;
						return new Object[] { up, p2p, uParent, jParent, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_blackBBBBFBB(
			org.eclipse.uml2.uml.Package up, JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uParent,
			org.eclipse.modisco.java.Package jParent, JavaPackageToUMLPackage_underPackage _this,
			IsApplicableMatch isApplicableMatch) {
		if (!uParent.equals(up)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { up, p2p, uParent, jParent, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_bindingAndBlackFFFFFBB(
			JavaPackageToUMLPackage_underPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_binding = pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result_pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_binding[0];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result_pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_binding[1];
			org.eclipse.uml2.uml.Package uParent = (org.eclipse.uml2.uml.Package) result_pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_binding[2];
			org.eclipse.modisco.java.Package jParent = (org.eclipse.modisco.java.Package) result_pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_binding[3];

			Object[] result_pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_black = pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_blackBBBBFBB(
					up, p2p, uParent, jParent, _this, isApplicableMatch);
			if (result_pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_black[4];

				return new Object[] { up, p2p, uParent, jParent, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_11_1_performtransformation_greenBFBFB(
			org.eclipse.uml2.uml.Package up, org.eclipse.modisco.java.Package jParent, CSP csp) {
		JavaPackage2UmlPackage jp2up = UmlFactory.eINSTANCE.createJavaPackage2UmlPackage();
		org.eclipse.modisco.java.Package jp = JavaFactory.eINSTANCE.createPackage();
		Object _localVariable_0 = csp.getValue("jp", "name");
		jp2up.setTarget(up);
		jp2up.setSource(jp);
		jParent.getOwnedPackages().add(jp);
		String jp_name_prime = (String) _localVariable_0;
		jp.setName(jp_name_prime);
		return new Object[] { up, jp2up, jParent, jp, csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_11_2_collecttranslatedelements_blackBBB(
			org.eclipse.uml2.uml.Package up, JavaPackage2UmlPackage jp2up, org.eclipse.modisco.java.Package jp) {
		return new Object[] { up, jp2up, jp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_11_2_collecttranslatedelements_greenFBBB(
			org.eclipse.uml2.uml.Package up, JavaPackage2UmlPackage jp2up, org.eclipse.modisco.java.Package jp) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(up);
		ruleresult.getCreatedLinkElements().add(jp2up);
		ruleresult.getCreatedElements().add(jp);
		return new Object[] { ruleresult, up, jp2up, jp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject up, EObject p2p, EObject jp2up, EObject uParent, EObject jParent,
			EObject jp) {
		if (!p2p.equals(up)) {
			if (!p2p.equals(uParent)) {
				if (!jp2up.equals(up)) {
					if (!jp2up.equals(p2p)) {
						if (!jp2up.equals(uParent)) {
							if (!uParent.equals(up)) {
								if (!jParent.equals(up)) {
									if (!jParent.equals(p2p)) {
										if (!jParent.equals(jp2up)) {
											if (!jParent.equals(uParent)) {
												if (!jParent.equals(jp)) {
													if (!jp.equals(up)) {
														if (!jp.equals(p2p)) {
															if (!jp.equals(jp2up)) {
																if (!jp.equals(uParent)) {
																	return new Object[] { ruleresult, up, p2p, jp2up,
																			uParent, jParent, jp };
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

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject up, EObject jp2up, EObject uParent, EObject jParent, EObject jp) {
		EMoflonEdge jp2up__up____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uParent__up____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__jp____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jParent__jp____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp__jParent____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "JavaPackageToUMLPackage_underPackage";
		String jp2up__up____target_name_prime = "target";
		String uParent__up____packagedElement_name_prime = "packagedElement";
		String jp2up__jp____source_name_prime = "source";
		String jParent__jp____ownedPackages_name_prime = "ownedPackages";
		String jp__jParent____package_name_prime = "package";
		jp2up__up____target.setSrc(jp2up);
		jp2up__up____target.setTrg(up);
		ruleresult.getCreatedEdges().add(jp2up__up____target);
		uParent__up____packagedElement.setSrc(uParent);
		uParent__up____packagedElement.setTrg(up);
		ruleresult.getTranslatedEdges().add(uParent__up____packagedElement);
		jp2up__jp____source.setSrc(jp2up);
		jp2up__jp____source.setTrg(jp);
		ruleresult.getCreatedEdges().add(jp2up__jp____source);
		jParent__jp____ownedPackages.setSrc(jParent);
		jParent__jp____ownedPackages.setTrg(jp);
		ruleresult.getCreatedEdges().add(jParent__jp____ownedPackages);
		jp__jParent____package.setSrc(jp);
		jp__jParent____package.setTrg(jParent);
		ruleresult.getCreatedEdges().add(jp__jParent____package);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jp2up__up____target.setName(jp2up__up____target_name_prime);
		uParent__up____packagedElement.setName(uParent__up____packagedElement_name_prime);
		jp2up__jp____source.setName(jp2up__jp____source_name_prime);
		jParent__jp____ownedPackages.setName(jParent__jp____ownedPackages_name_prime);
		jp__jParent____package.setName(jp__jParent____package_name_prime);
		return new Object[] { ruleresult, up, jp2up, uParent, jParent, jp, jp2up__up____target,
				uParent__up____packagedElement, jp2up__jp____source, jParent__jp____ownedPackages,
				jp__jParent____package };
	}

	public static final void pattern_JavaPackageToUMLPackage_underPackage_11_5_registerobjects_expressionBBBBBBBB(
			JavaPackageToUMLPackage_underPackage _this, PerformRuleResult ruleresult, EObject up, EObject p2p,
			EObject jp2up, EObject uParent, EObject jParent, EObject jp) {
		_this.registerObjects_BWD(ruleresult, up, p2p, jp2up, uParent, jParent, jp);

	}

	public static final PerformRuleResult pattern_JavaPackageToUMLPackage_underPackage_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_12_1_preparereturnvalue_bindingFB(
			JavaPackageToUMLPackage_underPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_12_1_preparereturnvalue_blackFBB(
			EClass eClass, JavaPackageToUMLPackage_underPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_12_1_preparereturnvalue_bindingAndBlackFFB(
			JavaPackageToUMLPackage_underPackage _this) {
		Object[] result_pattern_JavaPackageToUMLPackage_underPackage_12_1_preparereturnvalue_binding = pattern_JavaPackageToUMLPackage_underPackage_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaPackageToUMLPackage_underPackage_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_JavaPackageToUMLPackage_underPackage_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underPackage_12_1_preparereturnvalue_black = pattern_JavaPackageToUMLPackage_underPackage_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_JavaPackageToUMLPackage_underPackage_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_JavaPackageToUMLPackage_underPackage_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "JavaPackageToUMLPackage_underPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("up");
		EObject _localVariable_1 = match.getObject("uParent");
		EObject tmpUp = _localVariable_0;
		EObject tmpUParent = _localVariable_1;
		if (tmpUp instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) tmpUp;
			if (tmpUParent instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package uParent = (org.eclipse.uml2.uml.Package) tmpUParent;
				return new Object[] { up, uParent, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underPackage_12_2_corematch_blackBFBFB(
			org.eclipse.uml2.uml.Package up, org.eclipse.uml2.uml.Package uParent, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!uParent.equals(up)) {
			for (JavaPackage2UmlPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(uParent, JavaPackage2UmlPackage.class, "target")) {
				org.eclipse.modisco.java.Package jParent = p2p.getSource();
				if (jParent != null) {
					_result.add(new Object[] { up, p2p, uParent, jParent, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underPackage_12_3_findcontext_blackBBBB(
			org.eclipse.uml2.uml.Package up, JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uParent,
			org.eclipse.modisco.java.Package jParent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!uParent.equals(up)) {
			if (uParent.equals(p2p.getTarget())) {
				if (uParent.getPackagedElements().contains(up)) {
					if (jParent.equals(p2p.getSource())) {
						_result.add(new Object[] { up, p2p, uParent, jParent });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_12_3_findcontext_greenBBBBFFFF(
			org.eclipse.uml2.uml.Package up, JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uParent,
			org.eclipse.modisco.java.Package jParent) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge p2p__uParent____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uParent__up____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__jParent____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String p2p__uParent____target_name_prime = "target";
		String uParent__up____packagedElement_name_prime = "packagedElement";
		String p2p__jParent____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(up);
		isApplicableMatch.getAllContextElements().add(p2p);
		isApplicableMatch.getAllContextElements().add(uParent);
		isApplicableMatch.getAllContextElements().add(jParent);
		p2p__uParent____target.setSrc(p2p);
		p2p__uParent____target.setTrg(uParent);
		isApplicableMatch.getAllContextElements().add(p2p__uParent____target);
		uParent__up____packagedElement.setSrc(uParent);
		uParent__up____packagedElement.setTrg(up);
		isApplicableMatch.getAllContextElements().add(uParent__up____packagedElement);
		p2p__jParent____source.setSrc(p2p);
		p2p__jParent____source.setTrg(jParent);
		isApplicableMatch.getAllContextElements().add(p2p__jParent____source);
		p2p__uParent____target.setName(p2p__uParent____target_name_prime);
		uParent__up____packagedElement.setName(uParent__up____packagedElement_name_prime);
		p2p__jParent____source.setName(p2p__jParent____source_name_prime);
		return new Object[] { up, p2p, uParent, jParent, isApplicableMatch, p2p__uParent____target,
				uParent__up____packagedElement, p2p__jParent____source };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_12_4_solveCSP_bindingFBBBBBB(
			JavaPackageToUMLPackage_underPackage _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package up, JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uParent,
			org.eclipse.modisco.java.Package jParent) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, up, p2p, uParent, jParent);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, up, p2p, uParent, jParent };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_12_4_solveCSP_bindingAndBlackFBBBBBB(
			JavaPackageToUMLPackage_underPackage _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package up, JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uParent,
			org.eclipse.modisco.java.Package jParent) {
		Object[] result_pattern_JavaPackageToUMLPackage_underPackage_12_4_solveCSP_binding = pattern_JavaPackageToUMLPackage_underPackage_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, up, p2p, uParent, jParent);
		if (result_pattern_JavaPackageToUMLPackage_underPackage_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underPackage_12_4_solveCSP_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underPackage_12_4_solveCSP_black = pattern_JavaPackageToUMLPackage_underPackage_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_JavaPackageToUMLPackage_underPackage_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, up, p2p, uParent, jParent };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_12_5_checkCSP_expressionFBB(
			JavaPackageToUMLPackage_underPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "JavaPackageToUMLPackage_underPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaPackageToUMLPackage_underPackage_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_20_1_preparereturnvalue_bindingFB(
			JavaPackageToUMLPackage_underPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, JavaPackageToUMLPackage_underPackage _this) {
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

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_20_1_preparereturnvalue_bindingAndBlackFFBF(
			JavaPackageToUMLPackage_underPackage _this) {
		Object[] result_pattern_JavaPackageToUMLPackage_underPackage_20_1_preparereturnvalue_binding = pattern_JavaPackageToUMLPackage_underPackage_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaPackageToUMLPackage_underPackage_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_JavaPackageToUMLPackage_underPackage_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underPackage_20_1_preparereturnvalue_black = pattern_JavaPackageToUMLPackage_underPackage_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_JavaPackageToUMLPackage_underPackage_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_JavaPackageToUMLPackage_underPackage_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_JavaPackageToUMLPackage_underPackage_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underPackage_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUParent = _edge_packagedElement.getSrc();
		if (tmpUParent instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package uParent = (org.eclipse.uml2.uml.Package) tmpUParent;
			EObject tmpUp = _edge_packagedElement.getTrg();
			if (tmpUp instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) tmpUp;
				if (!uParent.equals(up)) {
					if (uParent.getPackagedElements().contains(up)) {
						_result.add(new Object[] { up, uParent, _edge_packagedElement });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			JavaPackageToUMLPackage_underPackage _this, Match match, org.eclipse.uml2.uml.Package up,
			org.eclipse.uml2.uml.Package uParent) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, up, uParent);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			JavaPackageToUMLPackage_underPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_JavaPackageToUMLPackage_underPackage_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_21_1_preparereturnvalue_bindingFB(
			JavaPackageToUMLPackage_underPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, JavaPackageToUMLPackage_underPackage _this) {
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

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_21_1_preparereturnvalue_bindingAndBlackFFBF(
			JavaPackageToUMLPackage_underPackage _this) {
		Object[] result_pattern_JavaPackageToUMLPackage_underPackage_21_1_preparereturnvalue_binding = pattern_JavaPackageToUMLPackage_underPackage_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaPackageToUMLPackage_underPackage_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_JavaPackageToUMLPackage_underPackage_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underPackage_21_1_preparereturnvalue_black = pattern_JavaPackageToUMLPackage_underPackage_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_JavaPackageToUMLPackage_underPackage_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_JavaPackageToUMLPackage_underPackage_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_JavaPackageToUMLPackage_underPackage_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_21_2_testcorematchandDECs_black_nac_0B(
			org.eclipse.modisco.java.Package jp) {
		Model __DEC_jp_ownedElements_228068 = jp.getModel();
		if (__DEC_jp_ownedElements_228068 != null) {
			return new Object[] { jp };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underPackage_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedPackages) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJParent = _edge_ownedPackages.getSrc();
		if (tmpJParent instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jParent = (org.eclipse.modisco.java.Package) tmpJParent;
			EObject tmpJp = _edge_ownedPackages.getTrg();
			if (tmpJp instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) tmpJp;
				if (!jParent.equals(jp)) {
					if (jParent.getOwnedPackages().contains(jp)) {
						if (pattern_JavaPackageToUMLPackage_underPackage_21_2_testcorematchandDECs_black_nac_0B(
								jp) == null) {
							_result.add(new Object[] { jParent, jp, _edge_ownedPackages });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			JavaPackageToUMLPackage_underPackage _this, Match match, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jParent, jp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			JavaPackageToUMLPackage_underPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_JavaPackageToUMLPackage_underPackage_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_24_1_prepare_blackB(
			JavaPackageToUMLPackage_underPackage _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("up");
		EObject _localVariable_1 = targetMatch.getObject("uParent");
		EObject _localVariable_2 = sourceMatch.getObject("jParent");
		EObject _localVariable_3 = sourceMatch.getObject("jp");
		EObject tmpUp = _localVariable_0;
		EObject tmpUParent = _localVariable_1;
		EObject tmpJParent = _localVariable_2;
		EObject tmpJp = _localVariable_3;
		if (tmpUp instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) tmpUp;
			if (tmpUParent instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package uParent = (org.eclipse.uml2.uml.Package) tmpUParent;
				if (tmpJParent instanceof org.eclipse.modisco.java.Package) {
					org.eclipse.modisco.java.Package jParent = (org.eclipse.modisco.java.Package) tmpJParent;
					if (tmpJp instanceof org.eclipse.modisco.java.Package) {
						org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) tmpJp;
						return new Object[] { up, uParent, jParent, jp, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_24_2_matchsrctrgcontext_blackBBBBBB(
			org.eclipse.uml2.uml.Package up, org.eclipse.uml2.uml.Package uParent,
			org.eclipse.modisco.java.Package jParent, org.eclipse.modisco.java.Package jp, Match sourceMatch,
			Match targetMatch) {
		if (!uParent.equals(up)) {
			if (!jParent.equals(jp)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { up, uParent, jParent, jp, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_JavaPackageToUMLPackage_underPackage_24_2_matchsrctrgcontext_binding = pattern_JavaPackageToUMLPackage_underPackage_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_JavaPackageToUMLPackage_underPackage_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result_pattern_JavaPackageToUMLPackage_underPackage_24_2_matchsrctrgcontext_binding[0];
			org.eclipse.uml2.uml.Package uParent = (org.eclipse.uml2.uml.Package) result_pattern_JavaPackageToUMLPackage_underPackage_24_2_matchsrctrgcontext_binding[1];
			org.eclipse.modisco.java.Package jParent = (org.eclipse.modisco.java.Package) result_pattern_JavaPackageToUMLPackage_underPackage_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result_pattern_JavaPackageToUMLPackage_underPackage_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_JavaPackageToUMLPackage_underPackage_24_2_matchsrctrgcontext_black = pattern_JavaPackageToUMLPackage_underPackage_24_2_matchsrctrgcontext_blackBBBBBB(
					up, uParent, jParent, jp, sourceMatch, targetMatch);
			if (result_pattern_JavaPackageToUMLPackage_underPackage_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { up, uParent, jParent, jp, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_24_3_solvecsp_bindingFBBBBBBB(
			JavaPackageToUMLPackage_underPackage _this, org.eclipse.uml2.uml.Package up,
			org.eclipse.uml2.uml.Package uParent, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(up, uParent, jParent, jp, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, up, uParent, jParent, jp, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			JavaPackageToUMLPackage_underPackage _this, org.eclipse.uml2.uml.Package up,
			org.eclipse.uml2.uml.Package uParent, org.eclipse.modisco.java.Package jParent,
			org.eclipse.modisco.java.Package jp, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_JavaPackageToUMLPackage_underPackage_24_3_solvecsp_binding = pattern_JavaPackageToUMLPackage_underPackage_24_3_solvecsp_bindingFBBBBBBB(
				_this, up, uParent, jParent, jp, sourceMatch, targetMatch);
		if (result_pattern_JavaPackageToUMLPackage_underPackage_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underPackage_24_3_solvecsp_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underPackage_24_3_solvecsp_black = pattern_JavaPackageToUMLPackage_underPackage_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_JavaPackageToUMLPackage_underPackage_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, up, uParent, jParent, jp, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underPackage_24_5_matchcorrcontext_blackFBBBB(
			org.eclipse.uml2.uml.Package uParent, org.eclipse.modisco.java.Package jParent, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (JavaPackage2UmlPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(uParent, JavaPackage2UmlPackage.class, "target")) {
				if (jParent.equals(p2p.getSource())) {
					_result.add(new Object[] { p2p, uParent, jParent, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_24_5_matchcorrcontext_greenBBBF(
			JavaPackage2UmlPackage p2p, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "JavaPackageToUMLPackage_underPackage";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(p2p);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { p2p, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_24_6_createcorrespondence_blackBBBBB(
			org.eclipse.uml2.uml.Package up, org.eclipse.uml2.uml.Package uParent,
			org.eclipse.modisco.java.Package jParent, org.eclipse.modisco.java.Package jp, CCMatch ccMatch) {
		if (!uParent.equals(up)) {
			if (!jParent.equals(jp)) {
				return new Object[] { up, uParent, jParent, jp, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_24_6_createcorrespondence_greenBFBB(
			org.eclipse.uml2.uml.Package up, org.eclipse.modisco.java.Package jp, CCMatch ccMatch) {
		JavaPackage2UmlPackage jp2up = UmlFactory.eINSTANCE.createJavaPackage2UmlPackage();
		jp2up.setTarget(up);
		jp2up.setSource(jp);
		ccMatch.getCreateCorr().add(jp2up);
		return new Object[] { up, jp2up, jp, ccMatch };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "JavaPackageToUMLPackage_underPackage";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaPackageToUMLPackage_underPackage_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_27_1_matchtggpattern_black_nac_0B(
			org.eclipse.modisco.java.Package jp) {
		Model __DEC_jp_ownedElements_16384 = jp.getModel();
		if (__DEC_jp_ownedElements_16384 != null) {
			return new Object[] { jp };
		}

		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_27_1_matchtggpattern_blackBB(
			org.eclipse.modisco.java.Package jParent, org.eclipse.modisco.java.Package jp) {
		if (!jParent.equals(jp)) {
			if (jParent.getOwnedPackages().contains(jp)) {
				if (pattern_JavaPackageToUMLPackage_underPackage_27_1_matchtggpattern_black_nac_0B(jp) == null) {
					return new Object[] { jParent, jp };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_28_1_matchtggpattern_blackBB(
			org.eclipse.uml2.uml.Package up, org.eclipse.uml2.uml.Package uParent) {
		if (!uParent.equals(up)) {
			if (uParent.getPackagedElements().contains(up)) {
				return new Object[] { up, uParent };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_29_1_createresult_blackB(
			JavaPackageToUMLPackage_underPackage _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, JavaPackage2UmlPackage p2p) {
		if (ruleResult.getCorrObjects().contains(p2p)) {
			return new Object[] { ruleResult, p2p };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Package uParent) {
		if (ruleResult.getTargetObjects().contains(uParent)) {
			return new Object[] { ruleResult, uParent };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package jParent) {
		if (ruleResult.getSourceObjects().contains(jParent)) {
			return new Object[] { ruleResult, jParent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underPackage_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList p2pList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpP2p : p2pList.getEntryObjects()) {
				if (tmpP2p instanceof JavaPackage2UmlPackage) {
					JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) tmpP2p;
					org.eclipse.uml2.uml.Package uParent = p2p.getTarget();
					if (uParent != null) {
						org.eclipse.modisco.java.Package jParent = p2p.getSource();
						if (jParent != null) {
							if (pattern_JavaPackageToUMLPackage_underPackage_29_2_isapplicablecore_black_nac_0BB(
									ruleResult, p2p) == null) {
								if (pattern_JavaPackageToUMLPackage_underPackage_29_2_isapplicablecore_black_nac_1BB(
										ruleResult, uParent) == null) {
									if (pattern_JavaPackageToUMLPackage_underPackage_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, jParent) == null) {
										_result.add(new Object[] { p2pList, p2p, uParent, jParent, ruleEntryContainer,
												ruleResult });
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

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_29_3_solveCSP_bindingFBBBBBB(
			JavaPackageToUMLPackage_underPackage _this, IsApplicableMatch isApplicableMatch, JavaPackage2UmlPackage p2p,
			org.eclipse.uml2.uml.Package uParent, org.eclipse.modisco.java.Package jParent,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, p2p, uParent, jParent, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p2p, uParent, jParent, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_29_3_solveCSP_bindingAndBlackFBBBBBB(
			JavaPackageToUMLPackage_underPackage _this, IsApplicableMatch isApplicableMatch, JavaPackage2UmlPackage p2p,
			org.eclipse.uml2.uml.Package uParent, org.eclipse.modisco.java.Package jParent,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_JavaPackageToUMLPackage_underPackage_29_3_solveCSP_binding = pattern_JavaPackageToUMLPackage_underPackage_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, p2p, uParent, jParent, ruleResult);
		if (result_pattern_JavaPackageToUMLPackage_underPackage_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underPackage_29_3_solveCSP_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underPackage_29_3_solveCSP_black = pattern_JavaPackageToUMLPackage_underPackage_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_JavaPackageToUMLPackage_underPackage_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p2p, uParent, jParent, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underPackage_29_4_checkCSP_expressionFBB(
			JavaPackageToUMLPackage_underPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_29_5_checknacs_blackBBB(
			JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uParent,
			org.eclipse.modisco.java.Package jParent) {
		return new Object[] { p2p, uParent, jParent };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_29_6_perform_blackBBBB(
			JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uParent, org.eclipse.modisco.java.Package jParent,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { p2p, uParent, jParent, ruleResult };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underPackage_29_6_perform_greenFFBBFBB(
			org.eclipse.uml2.uml.Package uParent, org.eclipse.modisco.java.Package jParent,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		org.eclipse.uml2.uml.Package up = UMLFactory.eINSTANCE.createPackage();
		JavaPackage2UmlPackage jp2up = UmlFactory.eINSTANCE.createJavaPackage2UmlPackage();
		org.eclipse.modisco.java.Package jp = JavaFactory.eINSTANCE.createPackage();
		Object _localVariable_0 = csp.getValue("up", "name");
		Object _localVariable_1 = csp.getValue("jp", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		uParent.getPackagedElements().add(up);
		ruleResult.getTargetObjects().add(up);
		jp2up.setTarget(up);
		ruleResult.getCorrObjects().add(jp2up);
		jp2up.setSource(jp);
		jParent.getOwnedPackages().add(jp);
		ruleResult.getSourceObjects().add(jp);
		String up_name_prime = (String) _localVariable_0;
		String jp_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		up.setName(up_name_prime);
		jp.setName(jp_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { up, jp2up, uParent, jParent, jp, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_JavaPackageToUMLPackage_underPackage_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //JavaPackageToUMLPackage_underPackageImpl
