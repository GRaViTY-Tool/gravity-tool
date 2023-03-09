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

import org.gravity.tgg.modisco.uml.JavaModel2UMLPackage;
import org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage;

import org.gravity.tgg.modisco.uml.Rules.JavaPackageToUMLPackage_underModel;
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
 * An implementation of the model object '<em><b>Java Package To UML Package under Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class JavaPackageToUMLPackage_underModelImpl extends AbstractRuleImpl
		implements JavaPackageToUMLPackage_underModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaPackageToUMLPackage_underModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getJavaPackageToUMLPackage_underModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Package jp, Model jm) {

		Object[] result1_black = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_0_1_initialbindings_blackBBBB(this, match, jp, jm);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jp] = " + jp + ", " + "[jm] = " + jm + ".");
		}

		Object[] result2_bindingAndBlack = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, jp, jm);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jp] = " + jp + ", " + "[jm] = " + jm + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_0_4_collectelementstobetranslated_blackBBB(match, jp,
							jm);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jp] = " + jp + ", " + "[jm] = " + jm + ".");
			}
			JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_0_4_collectelementstobetranslated_greenBBBFF(match, jp,
							jm);
			//nothing EMoflonEdge jm__jp____ownedElements = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge jp__jm____model = (EMoflonEdge) result4_green[4];

			Object[] result5_black = JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_0_5_collectcontextelements_blackBBB(match, jp, jm);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jp] = " + jp + ", " + "[jm] = " + jm + ".");
			}
			JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_0_5_collectcontextelements_greenBB(match, jm);

			// 
			JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_0_6_registerobjectstomatch_expressionBBBB(this, match,
							jp, jm);
			return JavaPackageToUMLPackage_underModelImpl.pattern_JavaPackageToUMLPackage_underModel_0_7_expressionF();
		} else {
			return JavaPackageToUMLPackage_underModelImpl.pattern_JavaPackageToUMLPackage_underModel_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[0];
		org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result1_bindingAndBlack[1];
		Model jm = (Model) result1_bindingAndBlack[2];
		JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_greenFBBFB(jp, um, csp);
		JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result1_green[0];
		org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result1_green[3];

		Object[] result2_black = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_1_2_collecttranslatedelements_blackBBB(jp2up, jp, up);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jp2up] = " + jp2up + ", "
					+ "[jp] = " + jp + ", " + "[up] = " + up + ".");
		}
		Object[] result2_green = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_1_2_collecttranslatedelements_greenFBBB(jp2up, jp, up);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, jp2up, jp,
						um, jm, jm2um, up);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[jp2up] = " + jp2up + ", " + "[jp] = " + jp + ", " + "[um] = " + um + ", " + "[jm] = "
					+ jm + ", " + "[jm2um] = " + jm2um + ", " + "[up] = " + up + ".");
		}
		JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, jp2up,
						jp, um, jm, up);
		//nothing EMoflonEdge jp2up__jp____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge um__up____packagedElement = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge jp2up__up____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge jm__jp____ownedElements = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge jp__jm____model = (EMoflonEdge) result3_green[10];

		// 
		// 
		JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						jp2up, jp, um, jm, jm2um, up);
		return JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result2_binding[0];
		Model jm = (Model) result2_binding[1];
		for (Object[] result2_black : JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_2_2_corematch_blackBFBFB(jp, jm, match)) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result2_black[1];
			JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result2_black[3];
			// ForEach 
			for (Object[] result3_black : JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_2_3_findcontext_blackBBBB(jp, um, jm, jm2um)) {
				Object[] result3_green = JavaPackageToUMLPackage_underModelImpl
						.pattern_JavaPackageToUMLPackage_underModel_2_3_findcontext_greenBBBBFFFFF(jp, um, jm, jm2um);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge jm2um__um____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge jm__jp____ownedElements = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jp__jm____model = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge jm2um__jm____source = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = JavaPackageToUMLPackage_underModelImpl
						.pattern_JavaPackageToUMLPackage_underModel_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, jp, um, jm, jm2um);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jp] = " + jp + ", " + "[um] = "
							+ um + ", " + "[jm] = " + jm + ", " + "[jm2um] = " + jm2um + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (JavaPackageToUMLPackage_underModelImpl
						.pattern_JavaPackageToUMLPackage_underModel_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = JavaPackageToUMLPackage_underModelImpl
							.pattern_JavaPackageToUMLPackage_underModel_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					JavaPackageToUMLPackage_underModelImpl
							.pattern_JavaPackageToUMLPackage_underModel_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.Package jp, Model jm) {
		match.registerObject("jp", jp);
		match.registerObject("jm", jm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.Package jp, Model jm) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package jp,
			org.eclipse.uml2.uml.Model um, Model jm, JavaModel2UMLPackage jm2um) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_jm_name = CSPFactoryHelper.eINSTANCE.createVariable("jm.name", true, csp);
		var_jm_name.setValue(jm.getName());
		var_jm_name.setType("String");
		Variable var_um_name = CSPFactoryHelper.eINSTANCE.createVariable("um.name", true, csp);
		var_um_name.setValue(um.getName());
		var_um_name.setType("String");
		Variable var_jp_name = CSPFactoryHelper.eINSTANCE.createVariable("jp.name", true, csp);
		var_jp_name.setValue(jp.getName());
		var_jp_name.setType("String");

		// Create unbound variables
		Variable var_up_name = CSPFactoryHelper.eINSTANCE.createVariable("up.name", csp);
		var_up_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_jm_name, var_um_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_up_name, var_jp_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jp", jp);
		isApplicableMatch.registerObject("um", um);
		isApplicableMatch.registerObject("jm", jm);
		isApplicableMatch.registerObject("jm2um", jm2um);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject jp2up, EObject jp, EObject um, EObject jm,
			EObject jm2um, EObject up) {
		ruleresult.registerObject("jp2up", jp2up);
		ruleresult.registerObject("jp", jp);
		ruleresult.registerObject("um", um);
		ruleresult.registerObject("jm", jm);
		ruleresult.registerObject("jm2um", jm2um);
		ruleresult.registerObject("up", up);

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
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Model um, org.eclipse.uml2.uml.Package up) {

		Object[] result1_black = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_10_1_initialbindings_blackBBBB(this, match, um, up);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[um] = " + um + ", " + "[up] = " + up + ".");
		}

		Object[] result2_bindingAndBlack = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, um, up);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[um] = " + um + ", " + "[up] = " + up + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_10_4_collectelementstobetranslated_blackBBB(match, um,
							up);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[um] = " + um + ", " + "[up] = " + up + ".");
			}
			JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_10_4_collectelementstobetranslated_greenBBBF(match, um,
							up);
			//nothing EMoflonEdge um__up____packagedElement = (EMoflonEdge) result4_green[3];

			Object[] result5_black = JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_10_5_collectcontextelements_blackBBB(match, um, up);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[um] = " + um + ", " + "[up] = " + up + ".");
			}
			JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_10_5_collectcontextelements_greenBB(match, um);

			// 
			JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_10_6_registerobjectstomatch_expressionBBBB(this, match,
							um, up);
			return JavaPackageToUMLPackage_underModelImpl.pattern_JavaPackageToUMLPackage_underModel_10_7_expressionF();
		} else {
			return JavaPackageToUMLPackage_underModelImpl.pattern_JavaPackageToUMLPackage_underModel_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result1_bindingAndBlack[0];
		Model jm = (Model) result1_bindingAndBlack[1];
		JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_greenFFBBB(jm, up, csp);
		JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result1_green[0];
		org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result1_green[1];

		Object[] result2_black = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_11_2_collecttranslatedelements_blackBBB(jp2up, jp, up);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jp2up] = " + jp2up + ", "
					+ "[jp] = " + jp + ", " + "[up] = " + up + ".");
		}
		Object[] result2_green = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_11_2_collecttranslatedelements_greenFBBB(jp2up, jp, up);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, jp2up, jp,
						um, jm, jm2um, up);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[jp2up] = " + jp2up + ", " + "[jp] = " + jp + ", " + "[um] = " + um + ", " + "[jm] = "
					+ jm + ", " + "[jm2um] = " + jm2um + ", " + "[up] = " + up + ".");
		}
		JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, jp2up,
						jp, um, jm, up);
		//nothing EMoflonEdge jp2up__jp____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge um__up____packagedElement = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge jp2up__up____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge jm__jp____ownedElements = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge jp__jm____model = (EMoflonEdge) result3_green[10];

		// 
		// 
		JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						jp2up, jp, um, jm, jm2um, up);
		return JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result2_binding[0];
		org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result2_binding[1];
		for (Object[] result2_black : JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_12_2_corematch_blackBFFBB(um, up, match)) {
			Model jm = (Model) result2_black[1];
			JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result2_black[2];
			// ForEach 
			for (Object[] result3_black : JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_12_3_findcontext_blackBBBB(um, jm, jm2um, up)) {
				Object[] result3_green = JavaPackageToUMLPackage_underModelImpl
						.pattern_JavaPackageToUMLPackage_underModel_12_3_findcontext_greenBBBBFFFF(um, jm, jm2um, up);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge um__up____packagedElement = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge jm2um__um____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jm2um__jm____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = JavaPackageToUMLPackage_underModelImpl
						.pattern_JavaPackageToUMLPackage_underModel_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, um, jm, jm2um, up);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[um] = " + um + ", " + "[jm] = "
							+ jm + ", " + "[jm2um] = " + jm2um + ", " + "[up] = " + up + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (JavaPackageToUMLPackage_underModelImpl
						.pattern_JavaPackageToUMLPackage_underModel_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = JavaPackageToUMLPackage_underModelImpl
							.pattern_JavaPackageToUMLPackage_underModel_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					JavaPackageToUMLPackage_underModelImpl
							.pattern_JavaPackageToUMLPackage_underModel_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Model um,
			org.eclipse.uml2.uml.Package up) {
		match.registerObject("um", um);
		match.registerObject("up", up);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Model um, org.eclipse.uml2.uml.Package up) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Model um, Model jm,
			JavaModel2UMLPackage jm2um, org.eclipse.uml2.uml.Package up) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_jm_name = CSPFactoryHelper.eINSTANCE.createVariable("jm.name", true, csp);
		var_jm_name.setValue(jm.getName());
		var_jm_name.setType("String");
		Variable var_um_name = CSPFactoryHelper.eINSTANCE.createVariable("um.name", true, csp);
		var_um_name.setValue(um.getName());
		var_um_name.setType("String");
		Variable var_up_name = CSPFactoryHelper.eINSTANCE.createVariable("up.name", true, csp);
		var_up_name.setValue(up.getName());
		var_up_name.setType("String");

		// Create unbound variables
		Variable var_jp_name = CSPFactoryHelper.eINSTANCE.createVariable("jp.name", csp);
		var_jp_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_jm_name, var_um_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_up_name, var_jp_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("um", um);
		isApplicableMatch.registerObject("jm", jm);
		isApplicableMatch.registerObject("jm2um", jm2um);
		isApplicableMatch.registerObject("up", up);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject jp2up, EObject jp, EObject um, EObject jm,
			EObject jm2um, EObject up) {
		ruleresult.registerObject("jp2up", jp2up);
		ruleresult.registerObject("jp", jp);
		ruleresult.registerObject("um", um);
		ruleresult.registerObject("jm", jm);
		ruleresult.registerObject("jm2um", jm2um);
		ruleresult.registerObject("up", up);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_120(EMoflonEdge _edge_packagedElement) {

		Object[] result1_bindingAndBlack = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_20_2_testcorematchandDECs_blackFFB(_edge_packagedElement)) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result2_black[0];
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result2_black[1];
			Object[] result2_green = JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, um, up)) {
				// 
				if (JavaPackageToUMLPackage_underModelImpl
						.pattern_JavaPackageToUMLPackage_underModel_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = JavaPackageToUMLPackage_underModelImpl
							.pattern_JavaPackageToUMLPackage_underModel_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					JavaPackageToUMLPackage_underModelImpl
							.pattern_JavaPackageToUMLPackage_underModel_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_131(EMoflonEdge _edge_ownedElements) {

		Object[] result1_bindingAndBlack = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_21_2_testcorematchandDECs_blackFFB(_edge_ownedElements)) {
			org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result2_black[0];
			Model jm = (Model) result2_black[1];
			Object[] result2_green = JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, jp, jm)) {
				// 
				if (JavaPackageToUMLPackage_underModelImpl
						.pattern_JavaPackageToUMLPackage_underModel_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = JavaPackageToUMLPackage_underModelImpl
							.pattern_JavaPackageToUMLPackage_underModel_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					JavaPackageToUMLPackage_underModelImpl
							.pattern_JavaPackageToUMLPackage_underModel_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("JavaPackageToUMLPackage_underModel");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_um_name = CSPFactoryHelper.eINSTANCE.createVariable("um", true, csp);
		var_um_name.setValue(__helper.getValue("um", "name"));
		var_um_name.setType("String");

		Variable var_jm_name = CSPFactoryHelper.eINSTANCE.createVariable("jm", true, csp);
		var_jm_name.setValue(__helper.getValue("jm", "name"));
		var_jm_name.setType("String");

		Variable var_jp_name = CSPFactoryHelper.eINSTANCE.createVariable("jp", true, csp);
		var_jp_name.setValue(__helper.getValue("jp", "name"));
		var_jp_name.setType("String");

		Variable var_up_name = CSPFactoryHelper.eINSTANCE.createVariable("up", true, csp);
		var_up_name.setValue(__helper.getValue("up", "name"));
		var_up_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("JavaPackageToUMLPackage_underModel");
		eq0.solve(var_jm_name, var_um_name);

		eq1.setRuleName("JavaPackageToUMLPackage_underModel");
		eq1.solve(var_up_name, var_jp_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_up_name.setBound(false);
			eq0.solve(var_jm_name, var_um_name);
			eq1.solve(var_up_name, var_jp_name);
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
		ruleResult.setRule("JavaPackageToUMLPackage_underModel");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_um_name = CSPFactoryHelper.eINSTANCE.createVariable("um", true, csp);
		var_um_name.setValue(__helper.getValue("um", "name"));
		var_um_name.setType("String");

		Variable var_jm_name = CSPFactoryHelper.eINSTANCE.createVariable("jm", true, csp);
		var_jm_name.setValue(__helper.getValue("jm", "name"));
		var_jm_name.setType("String");

		Variable var_jp_name = CSPFactoryHelper.eINSTANCE.createVariable("jp", true, csp);
		var_jp_name.setValue(__helper.getValue("jp", "name"));
		var_jp_name.setType("String");

		Variable var_up_name = CSPFactoryHelper.eINSTANCE.createVariable("up", true, csp);
		var_up_name.setValue(__helper.getValue("up", "name"));
		var_up_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("JavaPackageToUMLPackage_underModel");
		eq0.solve(var_jm_name, var_um_name);

		eq1.setRuleName("JavaPackageToUMLPackage_underModel");
		eq1.solve(var_up_name, var_jp_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_jp_name.setBound(false);
			eq0.solve(var_jm_name, var_um_name);
			eq1.solve(var_up_name, var_jp_name);
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

		Object[] result1_black = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[0];
		org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result2_bindingAndBlack[1];
		Model jm = (Model) result2_bindingAndBlack[2];
		org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, jp, um, jm, up,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[jp] = " + jp + ", " + "[um] = " + um + ", " + "[jm] = " + jm + ", " + "[up] = " + up + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_24_5_matchcorrcontext_blackBBFBB(um, jm, sourceMatch,
							targetMatch)) {
				JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result5_black[2];
				Object[] result5_green = JavaPackageToUMLPackage_underModelImpl
						.pattern_JavaPackageToUMLPackage_underModel_24_5_matchcorrcontext_greenBBBF(jm2um, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = JavaPackageToUMLPackage_underModelImpl
						.pattern_JavaPackageToUMLPackage_underModel_24_6_createcorrespondence_blackBBBBB(jp, um, jm, up,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[jp] = " + jp + ", " + "[um] = " + um + ", "
									+ "[jm] = " + jm + ", " + "[up] = " + up + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				JavaPackageToUMLPackage_underModelImpl
						.pattern_JavaPackageToUMLPackage_underModel_24_6_createcorrespondence_greenFBBB(jp, up,
								ccMatch);
				//nothing JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result6_green[0];

				Object[] result7_black = JavaPackageToUMLPackage_underModelImpl
						.pattern_JavaPackageToUMLPackage_underModel_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				JavaPackageToUMLPackage_underModelImpl
						.pattern_JavaPackageToUMLPackage_underModel_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.modisco.java.Package jp, org.eclipse.uml2.uml.Model um, Model jm,
			org.eclipse.uml2.uml.Package up, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_jm_name = CSPFactoryHelper.eINSTANCE.createVariable("jm.name", true, csp);
		var_jm_name.setValue(jm.getName());
		var_jm_name.setType("String");
		Variable var_um_name = CSPFactoryHelper.eINSTANCE.createVariable("um.name", true, csp);
		var_um_name.setValue(um.getName());
		var_um_name.setType("String");
		Variable var_up_name = CSPFactoryHelper.eINSTANCE.createVariable("up.name", true, csp);
		var_up_name.setValue(up.getName());
		var_up_name.setType("String");
		Variable var_jp_name = CSPFactoryHelper.eINSTANCE.createVariable("jp.name", true, csp);
		var_jp_name.setValue(jp.getName());
		var_jp_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_jm_name, var_um_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_up_name, var_jp_name);
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.Package jp, Model jm) {// 
		Object[] result1_black = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_27_1_matchtggpattern_blackBB(jp, jm);
		if (result1_black != null) {
			return JavaPackageToUMLPackage_underModelImpl.pattern_JavaPackageToUMLPackage_underModel_27_2_expressionF();
		} else {
			return JavaPackageToUMLPackage_underModelImpl.pattern_JavaPackageToUMLPackage_underModel_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Model um, org.eclipse.uml2.uml.Package up) {// 
		Object[] result1_black = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_28_1_matchtggpattern_blackBB(um, up);
		if (result1_black != null) {
			return JavaPackageToUMLPackage_underModelImpl.pattern_JavaPackageToUMLPackage_underModel_28_2_expressionF();
		} else {
			return JavaPackageToUMLPackage_underModelImpl.pattern_JavaPackageToUMLPackage_underModel_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			JavaModel2UMLPackage jm2umParameter) {

		Object[] result1_black = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList jm2umList = (RuleEntryList) result2_black[0];
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result2_black[1];
			JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result2_black[2];
			Model jm = (Model) result2_black[3];

			Object[] result3_bindingAndBlack = JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_29_3_solveCSP_bindingAndBlackFBBBBBB(this,
							isApplicableMatch, um, jm, jm2um, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[um] = " + um + ", " + "[jm] = " + jm
						+ ", " + "[jm2um] = " + jm2um + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (JavaPackageToUMLPackage_underModelImpl
					.pattern_JavaPackageToUMLPackage_underModel_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = JavaPackageToUMLPackage_underModelImpl
						.pattern_JavaPackageToUMLPackage_underModel_29_5_checknacs_blackBBB(um, jm, jm2um);
				if (result5_black != null) {

					Object[] result6_black = JavaPackageToUMLPackage_underModelImpl
							.pattern_JavaPackageToUMLPackage_underModel_29_6_perform_blackBBBB(um, jm, jm2um,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[um] = " + um + ", " + "[jm] = " + jm
										+ ", " + "[jm2um] = " + jm2um + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					JavaPackageToUMLPackage_underModelImpl
							.pattern_JavaPackageToUMLPackage_underModel_29_6_perform_greenFFBBFBB(um, jm, ruleResult,
									csp);
					//nothing JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result6_green[0];
					//nothing org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result6_green[1];
					//nothing org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return JavaPackageToUMLPackage_underModelImpl
				.pattern_JavaPackageToUMLPackage_underModel_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Model um, Model jm,
			JavaModel2UMLPackage jm2um, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_jm_name = CSPFactoryHelper.eINSTANCE.createVariable("jm.name", true, csp);
		var_jm_name.setValue(jm.getName());
		var_jm_name.setType("String");
		Variable var_um_name = CSPFactoryHelper.eINSTANCE.createVariable("um.name", true, csp);
		var_um_name.setValue(um.getName());
		var_um_name.setType("String");

		// Create unbound variables
		Variable var_up_name = CSPFactoryHelper.eINSTANCE.createVariable("up.name", csp);
		var_up_name.setType("String");
		Variable var_jp_name = CSPFactoryHelper.eINSTANCE.createVariable("jp.name", csp);
		var_jp_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_jm_name, var_um_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_up_name, var_jp_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("um", um);
		isApplicableMatch.registerObject("jm", jm);
		isApplicableMatch.registerObject("jm2um", jm2um);
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
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPROPRIATE_FWD__MATCH_PACKAGE_MODEL:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_MODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(Model) arguments.get(2));
			return null;
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_MODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (Model) arguments.get(2));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGE_MODEL_MODEL_JAVAMODEL2UMLPACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (org.eclipse.uml2.uml.Model) arguments.get(2),
					(Model) arguments.get(3), (JavaModel2UMLPackage) arguments.get(4));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPROPRIATE_BWD__MATCH_MODEL_PACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Model) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MODEL_PACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Model) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
			return null;
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MODEL_PACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Model) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_MODEL_JAVAMODEL2UMLPACKAGE_PACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Model) arguments.get(1), (Model) arguments.get(2),
					(JavaModel2UMLPackage) arguments.get(3), (org.eclipse.uml2.uml.Package) arguments.get(4));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPROPRIATE_BWD_EMOFLON_EDGE_120__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_120((EMoflonEdge) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPROPRIATE_FWD_EMOFLON_EDGE_131__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_131((EMoflonEdge) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPLICABLE_SOLVE_CSP_CC__PACKAGE_MODEL_MODEL_PACKAGE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.modisco.java.Package) arguments.get(0),
					(org.eclipse.uml2.uml.Model) arguments.get(1), (Model) arguments.get(2),
					(org.eclipse.uml2.uml.Package) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___CHECK_DEC_FWD__PACKAGE_MODEL:
			return checkDEC_FWD((org.eclipse.modisco.java.Package) arguments.get(0), (Model) arguments.get(1));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___CHECK_DEC_BWD__MODEL_PACKAGE:
			return checkDEC_BWD((org.eclipse.uml2.uml.Model) arguments.get(0),
					(org.eclipse.uml2.uml.Package) arguments.get(1));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___GENERATE_MODEL__RULEENTRYCONTAINER_JAVAMODEL2UMLPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (JavaModel2UMLPackage) arguments.get(1));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_MODEL_JAVAMODEL2UMLPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Model) arguments.get(1), (Model) arguments.get(2),
					(JavaModel2UMLPackage) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.JAVA_PACKAGE_TO_UML_PACKAGE_UNDER_MODEL___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_0_1_initialbindings_blackBBBB(
			JavaPackageToUMLPackage_underModel _this, Match match, org.eclipse.modisco.java.Package jp, Model jm) {
		return new Object[] { _this, match, jp, jm };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_0_2_SolveCSP_bindingFBBBB(
			JavaPackageToUMLPackage_underModel _this, Match match, org.eclipse.modisco.java.Package jp, Model jm) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jp, jm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jp, jm };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_0_2_SolveCSP_bindingAndBlackFBBBB(
			JavaPackageToUMLPackage_underModel _this, Match match, org.eclipse.modisco.java.Package jp, Model jm) {
		Object[] result_pattern_JavaPackageToUMLPackage_underModel_0_2_SolveCSP_binding = pattern_JavaPackageToUMLPackage_underModel_0_2_SolveCSP_bindingFBBBB(
				_this, match, jp, jm);
		if (result_pattern_JavaPackageToUMLPackage_underModel_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underModel_0_2_SolveCSP_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underModel_0_2_SolveCSP_black = pattern_JavaPackageToUMLPackage_underModel_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_JavaPackageToUMLPackage_underModel_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, jp, jm };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_0_3_CheckCSP_expressionFBB(
			JavaPackageToUMLPackage_underModel _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_0_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.modisco.java.Package jp, Model jm) {
		return new Object[] { match, jp, jm };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, org.eclipse.modisco.java.Package jp, Model jm) {
		EMoflonEdge jm__jp____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp__jm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(jp);
		String jm__jp____ownedElements_name_prime = "ownedElements";
		String jp__jm____model_name_prime = "model";
		jm__jp____ownedElements.setSrc(jm);
		jm__jp____ownedElements.setTrg(jp);
		match.getToBeTranslatedEdges().add(jm__jp____ownedElements);
		jp__jm____model.setSrc(jp);
		jp__jm____model.setTrg(jm);
		match.getToBeTranslatedEdges().add(jp__jm____model);
		jm__jp____ownedElements.setName(jm__jp____ownedElements_name_prime);
		jp__jm____model.setName(jp__jm____model_name_prime);
		return new Object[] { match, jp, jm, jm__jp____ownedElements, jp__jm____model };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_0_5_collectcontextelements_blackBBB(
			Match match, org.eclipse.modisco.java.Package jp, Model jm) {
		return new Object[] { match, jp, jm };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_0_5_collectcontextelements_greenBB(
			Match match, Model jm) {
		match.getContextNodes().add(jm);
		return new Object[] { match, jm };
	}

	public static final void pattern_JavaPackageToUMLPackage_underModel_0_6_registerobjectstomatch_expressionBBBB(
			JavaPackageToUMLPackage_underModel _this, Match match, org.eclipse.modisco.java.Package jp, Model jm) {
		_this.registerObjectsToMatch_FWD(match, jp, jm);

	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jp");
		EObject _localVariable_1 = isApplicableMatch.getObject("um");
		EObject _localVariable_2 = isApplicableMatch.getObject("jm");
		EObject _localVariable_3 = isApplicableMatch.getObject("jm2um");
		EObject tmpJp = _localVariable_0;
		EObject tmpUm = _localVariable_1;
		EObject tmpJm = _localVariable_2;
		EObject tmpJm2um = _localVariable_3;
		if (tmpJp instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) tmpJp;
			if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
				org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
				if (tmpJm instanceof Model) {
					Model jm = (Model) tmpJm;
					if (tmpJm2um instanceof JavaModel2UMLPackage) {
						JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) tmpJm2um;
						return new Object[] { jp, um, jm, jm2um, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_blackBBBBFBB(
			org.eclipse.modisco.java.Package jp, org.eclipse.uml2.uml.Model um, Model jm, JavaModel2UMLPackage jm2um,
			JavaPackageToUMLPackage_underModel _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jp, um, jm, jm2um, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_bindingAndBlackFFFFFBB(
			JavaPackageToUMLPackage_underModel _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_binding = pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_binding != null) {
			org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result_pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_binding[0];
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result_pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_binding[1];
			Model jm = (Model) result_pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_binding[2];
			JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result_pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_binding[3];

			Object[] result_pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_black = pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_blackBBBBFBB(
					jp, um, jm, jm2um, _this, isApplicableMatch);
			if (result_pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_black[4];

				return new Object[] { jp, um, jm, jm2um, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_1_1_performtransformation_greenFBBFB(
			org.eclipse.modisco.java.Package jp, org.eclipse.uml2.uml.Model um, CSP csp) {
		JavaPackage2UmlPackage jp2up = UmlFactory.eINSTANCE.createJavaPackage2UmlPackage();
		org.eclipse.uml2.uml.Package up = UMLFactory.eINSTANCE.createPackage();
		Object _localVariable_0 = csp.getValue("up", "name");
		jp2up.setSource(jp);
		um.getPackagedElements().add(up);
		jp2up.setTarget(up);
		String up_name_prime = (String) _localVariable_0;
		up.setName(up_name_prime);
		return new Object[] { jp2up, jp, um, up, csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_1_2_collecttranslatedelements_blackBBB(
			JavaPackage2UmlPackage jp2up, org.eclipse.modisco.java.Package jp, org.eclipse.uml2.uml.Package up) {
		return new Object[] { jp2up, jp, up };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_1_2_collecttranslatedelements_greenFBBB(
			JavaPackage2UmlPackage jp2up, org.eclipse.modisco.java.Package jp, org.eclipse.uml2.uml.Package up) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(jp2up);
		ruleresult.getTranslatedElements().add(jp);
		ruleresult.getCreatedElements().add(up);
		return new Object[] { ruleresult, jp2up, jp, up };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jp2up, EObject jp, EObject um, EObject jm, EObject jm2um,
			EObject up) {
		if (!jp2up.equals(um)) {
			if (!jp2up.equals(up)) {
				if (!jp.equals(jp2up)) {
					if (!jp.equals(um)) {
						if (!jp.equals(up)) {
							if (!um.equals(up)) {
								if (!jm.equals(jp2up)) {
									if (!jm.equals(jp)) {
										if (!jm.equals(um)) {
											if (!jm.equals(jm2um)) {
												if (!jm.equals(up)) {
													if (!jm2um.equals(jp2up)) {
														if (!jm2um.equals(jp)) {
															if (!jm2um.equals(um)) {
																if (!jm2um.equals(up)) {
																	return new Object[] { ruleresult, jp2up, jp, um, jm,
																			jm2um, up };
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

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject jp2up, EObject jp, EObject um, EObject jm, EObject up) {
		EMoflonEdge jp2up__jp____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge um__up____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__up____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm__jp____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp__jm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "JavaPackageToUMLPackage_underModel";
		String jp2up__jp____source_name_prime = "source";
		String um__up____packagedElement_name_prime = "packagedElement";
		String jp2up__up____target_name_prime = "target";
		String jm__jp____ownedElements_name_prime = "ownedElements";
		String jp__jm____model_name_prime = "model";
		jp2up__jp____source.setSrc(jp2up);
		jp2up__jp____source.setTrg(jp);
		ruleresult.getCreatedEdges().add(jp2up__jp____source);
		um__up____packagedElement.setSrc(um);
		um__up____packagedElement.setTrg(up);
		ruleresult.getCreatedEdges().add(um__up____packagedElement);
		jp2up__up____target.setSrc(jp2up);
		jp2up__up____target.setTrg(up);
		ruleresult.getCreatedEdges().add(jp2up__up____target);
		jm__jp____ownedElements.setSrc(jm);
		jm__jp____ownedElements.setTrg(jp);
		ruleresult.getTranslatedEdges().add(jm__jp____ownedElements);
		jp__jm____model.setSrc(jp);
		jp__jm____model.setTrg(jm);
		ruleresult.getTranslatedEdges().add(jp__jm____model);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jp2up__jp____source.setName(jp2up__jp____source_name_prime);
		um__up____packagedElement.setName(um__up____packagedElement_name_prime);
		jp2up__up____target.setName(jp2up__up____target_name_prime);
		jm__jp____ownedElements.setName(jm__jp____ownedElements_name_prime);
		jp__jm____model.setName(jp__jm____model_name_prime);
		return new Object[] { ruleresult, jp2up, jp, um, jm, up, jp2up__jp____source, um__up____packagedElement,
				jp2up__up____target, jm__jp____ownedElements, jp__jm____model };
	}

	public static final void pattern_JavaPackageToUMLPackage_underModel_1_5_registerobjects_expressionBBBBBBBB(
			JavaPackageToUMLPackage_underModel _this, PerformRuleResult ruleresult, EObject jp2up, EObject jp,
			EObject um, EObject jm, EObject jm2um, EObject up) {
		_this.registerObjects_FWD(ruleresult, jp2up, jp, um, jm, jm2um, up);

	}

	public static final PerformRuleResult pattern_JavaPackageToUMLPackage_underModel_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_2_1_preparereturnvalue_bindingFB(
			JavaPackageToUMLPackage_underModel _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_2_1_preparereturnvalue_blackFBB(
			EClass eClass, JavaPackageToUMLPackage_underModel _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_2_1_preparereturnvalue_bindingAndBlackFFB(
			JavaPackageToUMLPackage_underModel _this) {
		Object[] result_pattern_JavaPackageToUMLPackage_underModel_2_1_preparereturnvalue_binding = pattern_JavaPackageToUMLPackage_underModel_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaPackageToUMLPackage_underModel_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_JavaPackageToUMLPackage_underModel_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underModel_2_1_preparereturnvalue_black = pattern_JavaPackageToUMLPackage_underModel_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_JavaPackageToUMLPackage_underModel_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_JavaPackageToUMLPackage_underModel_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "JavaPackageToUMLPackage_underModel";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("jp");
		EObject _localVariable_1 = match.getObject("jm");
		EObject tmpJp = _localVariable_0;
		EObject tmpJm = _localVariable_1;
		if (tmpJp instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) tmpJp;
			if (tmpJm instanceof Model) {
				Model jm = (Model) tmpJm;
				return new Object[] { jp, jm, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underModel_2_2_corematch_blackBFBFB(
			org.eclipse.modisco.java.Package jp, Model jm, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (JavaModel2UMLPackage jm2um : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jm,
				JavaModel2UMLPackage.class, "source")) {
			org.eclipse.uml2.uml.Package tmpUm = jm2um.getTarget();
			if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
				org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
				_result.add(new Object[] { jp, um, jm, jm2um, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underModel_2_3_findcontext_blackBBBB(
			org.eclipse.modisco.java.Package jp, org.eclipse.uml2.uml.Model um, Model jm, JavaModel2UMLPackage jm2um) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (um.equals(jm2um.getTarget())) {
			if (jm.getOwnedElements().contains(jp)) {
				if (jm.equals(jm2um.getSource())) {
					_result.add(new Object[] { jp, um, jm, jm2um });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_2_3_findcontext_greenBBBBFFFFF(
			org.eclipse.modisco.java.Package jp, org.eclipse.uml2.uml.Model um, Model jm, JavaModel2UMLPackage jm2um) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jm2um__um____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm__jp____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp__jm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um__jm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jm2um__um____target_name_prime = "target";
		String jm__jp____ownedElements_name_prime = "ownedElements";
		String jp__jm____model_name_prime = "model";
		String jm2um__jm____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(jp);
		isApplicableMatch.getAllContextElements().add(um);
		isApplicableMatch.getAllContextElements().add(jm);
		isApplicableMatch.getAllContextElements().add(jm2um);
		jm2um__um____target.setSrc(jm2um);
		jm2um__um____target.setTrg(um);
		isApplicableMatch.getAllContextElements().add(jm2um__um____target);
		jm__jp____ownedElements.setSrc(jm);
		jm__jp____ownedElements.setTrg(jp);
		isApplicableMatch.getAllContextElements().add(jm__jp____ownedElements);
		jp__jm____model.setSrc(jp);
		jp__jm____model.setTrg(jm);
		isApplicableMatch.getAllContextElements().add(jp__jm____model);
		jm2um__jm____source.setSrc(jm2um);
		jm2um__jm____source.setTrg(jm);
		isApplicableMatch.getAllContextElements().add(jm2um__jm____source);
		jm2um__um____target.setName(jm2um__um____target_name_prime);
		jm__jp____ownedElements.setName(jm__jp____ownedElements_name_prime);
		jp__jm____model.setName(jp__jm____model_name_prime);
		jm2um__jm____source.setName(jm2um__jm____source_name_prime);
		return new Object[] { jp, um, jm, jm2um, isApplicableMatch, jm2um__um____target, jm__jp____ownedElements,
				jp__jm____model, jm2um__jm____source };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_2_4_solveCSP_bindingFBBBBBB(
			JavaPackageToUMLPackage_underModel _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package jp, org.eclipse.uml2.uml.Model um, Model jm, JavaModel2UMLPackage jm2um) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, jp, um, jm, jm2um);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jp, um, jm, jm2um };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_2_4_solveCSP_bindingAndBlackFBBBBBB(
			JavaPackageToUMLPackage_underModel _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package jp, org.eclipse.uml2.uml.Model um, Model jm, JavaModel2UMLPackage jm2um) {
		Object[] result_pattern_JavaPackageToUMLPackage_underModel_2_4_solveCSP_binding = pattern_JavaPackageToUMLPackage_underModel_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jp, um, jm, jm2um);
		if (result_pattern_JavaPackageToUMLPackage_underModel_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underModel_2_4_solveCSP_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underModel_2_4_solveCSP_black = pattern_JavaPackageToUMLPackage_underModel_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_JavaPackageToUMLPackage_underModel_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jp, um, jm, jm2um };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_2_5_checkCSP_expressionFBB(
			JavaPackageToUMLPackage_underModel _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "JavaPackageToUMLPackage_underModel";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaPackageToUMLPackage_underModel_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_10_1_initialbindings_blackBBBB(
			JavaPackageToUMLPackage_underModel _this, Match match, org.eclipse.uml2.uml.Model um,
			org.eclipse.uml2.uml.Package up) {
		if (!um.equals(up)) {
			return new Object[] { _this, match, um, up };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_10_2_SolveCSP_bindingFBBBB(
			JavaPackageToUMLPackage_underModel _this, Match match, org.eclipse.uml2.uml.Model um,
			org.eclipse.uml2.uml.Package up) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, um, up);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, um, up };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_10_2_SolveCSP_bindingAndBlackFBBBB(
			JavaPackageToUMLPackage_underModel _this, Match match, org.eclipse.uml2.uml.Model um,
			org.eclipse.uml2.uml.Package up) {
		Object[] result_pattern_JavaPackageToUMLPackage_underModel_10_2_SolveCSP_binding = pattern_JavaPackageToUMLPackage_underModel_10_2_SolveCSP_bindingFBBBB(
				_this, match, um, up);
		if (result_pattern_JavaPackageToUMLPackage_underModel_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underModel_10_2_SolveCSP_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underModel_10_2_SolveCSP_black = pattern_JavaPackageToUMLPackage_underModel_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_JavaPackageToUMLPackage_underModel_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, um, up };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_10_3_CheckCSP_expressionFBB(
			JavaPackageToUMLPackage_underModel _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_10_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.uml2.uml.Model um, org.eclipse.uml2.uml.Package up) {
		if (!um.equals(up)) {
			return new Object[] { match, um, up };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_10_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.uml2.uml.Model um, org.eclipse.uml2.uml.Package up) {
		EMoflonEdge um__up____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(up);
		String um__up____packagedElement_name_prime = "packagedElement";
		um__up____packagedElement.setSrc(um);
		um__up____packagedElement.setTrg(up);
		match.getToBeTranslatedEdges().add(um__up____packagedElement);
		um__up____packagedElement.setName(um__up____packagedElement_name_prime);
		return new Object[] { match, um, up, um__up____packagedElement };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_10_5_collectcontextelements_blackBBB(
			Match match, org.eclipse.uml2.uml.Model um, org.eclipse.uml2.uml.Package up) {
		if (!um.equals(up)) {
			return new Object[] { match, um, up };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_10_5_collectcontextelements_greenBB(
			Match match, org.eclipse.uml2.uml.Model um) {
		match.getContextNodes().add(um);
		return new Object[] { match, um };
	}

	public static final void pattern_JavaPackageToUMLPackage_underModel_10_6_registerobjectstomatch_expressionBBBB(
			JavaPackageToUMLPackage_underModel _this, Match match, org.eclipse.uml2.uml.Model um,
			org.eclipse.uml2.uml.Package up) {
		_this.registerObjectsToMatch_BWD(match, um, up);

	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("um");
		EObject _localVariable_1 = isApplicableMatch.getObject("jm");
		EObject _localVariable_2 = isApplicableMatch.getObject("jm2um");
		EObject _localVariable_3 = isApplicableMatch.getObject("up");
		EObject tmpUm = _localVariable_0;
		EObject tmpJm = _localVariable_1;
		EObject tmpJm2um = _localVariable_2;
		EObject tmpUp = _localVariable_3;
		if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
			if (tmpJm instanceof Model) {
				Model jm = (Model) tmpJm;
				if (tmpJm2um instanceof JavaModel2UMLPackage) {
					JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) tmpJm2um;
					if (tmpUp instanceof org.eclipse.uml2.uml.Package) {
						org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) tmpUp;
						return new Object[] { um, jm, jm2um, up, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_blackBBBBFBB(
			org.eclipse.uml2.uml.Model um, Model jm, JavaModel2UMLPackage jm2um, org.eclipse.uml2.uml.Package up,
			JavaPackageToUMLPackage_underModel _this, IsApplicableMatch isApplicableMatch) {
		if (!um.equals(up)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { um, jm, jm2um, up, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_bindingAndBlackFFFFFBB(
			JavaPackageToUMLPackage_underModel _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_binding = pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result_pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_binding[0];
			Model jm = (Model) result_pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_binding[1];
			JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result_pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result_pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_binding[3];

			Object[] result_pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_black = pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_blackBBBBFBB(
					um, jm, jm2um, up, _this, isApplicableMatch);
			if (result_pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_black[4];

				return new Object[] { um, jm, jm2um, up, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_11_1_performtransformation_greenFFBBB(
			Model jm, org.eclipse.uml2.uml.Package up, CSP csp) {
		JavaPackage2UmlPackage jp2up = UmlFactory.eINSTANCE.createJavaPackage2UmlPackage();
		org.eclipse.modisco.java.Package jp = JavaFactory.eINSTANCE.createPackage();
		Object _localVariable_0 = csp.getValue("jp", "name");
		jp2up.setTarget(up);
		jp2up.setSource(jp);
		jm.getOwnedElements().add(jp);
		String jp_name_prime = (String) _localVariable_0;
		jp.setName(jp_name_prime);
		return new Object[] { jp2up, jp, jm, up, csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_11_2_collecttranslatedelements_blackBBB(
			JavaPackage2UmlPackage jp2up, org.eclipse.modisco.java.Package jp, org.eclipse.uml2.uml.Package up) {
		return new Object[] { jp2up, jp, up };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_11_2_collecttranslatedelements_greenFBBB(
			JavaPackage2UmlPackage jp2up, org.eclipse.modisco.java.Package jp, org.eclipse.uml2.uml.Package up) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(jp2up);
		ruleresult.getCreatedElements().add(jp);
		ruleresult.getTranslatedElements().add(up);
		return new Object[] { ruleresult, jp2up, jp, up };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jp2up, EObject jp, EObject um, EObject jm, EObject jm2um,
			EObject up) {
		if (!jp2up.equals(um)) {
			if (!jp2up.equals(up)) {
				if (!jp.equals(jp2up)) {
					if (!jp.equals(um)) {
						if (!jp.equals(up)) {
							if (!um.equals(up)) {
								if (!jm.equals(jp2up)) {
									if (!jm.equals(jp)) {
										if (!jm.equals(um)) {
											if (!jm.equals(jm2um)) {
												if (!jm.equals(up)) {
													if (!jm2um.equals(jp2up)) {
														if (!jm2um.equals(jp)) {
															if (!jm2um.equals(um)) {
																if (!jm2um.equals(up)) {
																	return new Object[] { ruleresult, jp2up, jp, um, jm,
																			jm2um, up };
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

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject jp2up, EObject jp, EObject um, EObject jm, EObject up) {
		EMoflonEdge jp2up__jp____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge um__up____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__up____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm__jp____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp__jm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "JavaPackageToUMLPackage_underModel";
		String jp2up__jp____source_name_prime = "source";
		String um__up____packagedElement_name_prime = "packagedElement";
		String jp2up__up____target_name_prime = "target";
		String jm__jp____ownedElements_name_prime = "ownedElements";
		String jp__jm____model_name_prime = "model";
		jp2up__jp____source.setSrc(jp2up);
		jp2up__jp____source.setTrg(jp);
		ruleresult.getCreatedEdges().add(jp2up__jp____source);
		um__up____packagedElement.setSrc(um);
		um__up____packagedElement.setTrg(up);
		ruleresult.getTranslatedEdges().add(um__up____packagedElement);
		jp2up__up____target.setSrc(jp2up);
		jp2up__up____target.setTrg(up);
		ruleresult.getCreatedEdges().add(jp2up__up____target);
		jm__jp____ownedElements.setSrc(jm);
		jm__jp____ownedElements.setTrg(jp);
		ruleresult.getCreatedEdges().add(jm__jp____ownedElements);
		jp__jm____model.setSrc(jp);
		jp__jm____model.setTrg(jm);
		ruleresult.getCreatedEdges().add(jp__jm____model);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jp2up__jp____source.setName(jp2up__jp____source_name_prime);
		um__up____packagedElement.setName(um__up____packagedElement_name_prime);
		jp2up__up____target.setName(jp2up__up____target_name_prime);
		jm__jp____ownedElements.setName(jm__jp____ownedElements_name_prime);
		jp__jm____model.setName(jp__jm____model_name_prime);
		return new Object[] { ruleresult, jp2up, jp, um, jm, up, jp2up__jp____source, um__up____packagedElement,
				jp2up__up____target, jm__jp____ownedElements, jp__jm____model };
	}

	public static final void pattern_JavaPackageToUMLPackage_underModel_11_5_registerobjects_expressionBBBBBBBB(
			JavaPackageToUMLPackage_underModel _this, PerformRuleResult ruleresult, EObject jp2up, EObject jp,
			EObject um, EObject jm, EObject jm2um, EObject up) {
		_this.registerObjects_BWD(ruleresult, jp2up, jp, um, jm, jm2um, up);

	}

	public static final PerformRuleResult pattern_JavaPackageToUMLPackage_underModel_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_12_1_preparereturnvalue_bindingFB(
			JavaPackageToUMLPackage_underModel _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_12_1_preparereturnvalue_blackFBB(
			EClass eClass, JavaPackageToUMLPackage_underModel _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_12_1_preparereturnvalue_bindingAndBlackFFB(
			JavaPackageToUMLPackage_underModel _this) {
		Object[] result_pattern_JavaPackageToUMLPackage_underModel_12_1_preparereturnvalue_binding = pattern_JavaPackageToUMLPackage_underModel_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaPackageToUMLPackage_underModel_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_JavaPackageToUMLPackage_underModel_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underModel_12_1_preparereturnvalue_black = pattern_JavaPackageToUMLPackage_underModel_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_JavaPackageToUMLPackage_underModel_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_JavaPackageToUMLPackage_underModel_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "JavaPackageToUMLPackage_underModel";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("um");
		EObject _localVariable_1 = match.getObject("up");
		EObject tmpUm = _localVariable_0;
		EObject tmpUp = _localVariable_1;
		if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
			if (tmpUp instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) tmpUp;
				return new Object[] { um, up, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underModel_12_2_corematch_blackBFFBB(
			org.eclipse.uml2.uml.Model um, org.eclipse.uml2.uml.Package up, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!um.equals(up)) {
			for (JavaModel2UMLPackage jm2um : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(um,
					JavaModel2UMLPackage.class, "target")) {
				Model jm = jm2um.getSource();
				if (jm != null) {
					_result.add(new Object[] { um, jm, jm2um, up, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underModel_12_3_findcontext_blackBBBB(
			org.eclipse.uml2.uml.Model um, Model jm, JavaModel2UMLPackage jm2um, org.eclipse.uml2.uml.Package up) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!um.equals(up)) {
			if (um.getPackagedElements().contains(up)) {
				if (um.equals(jm2um.getTarget())) {
					if (jm.equals(jm2um.getSource())) {
						_result.add(new Object[] { um, jm, jm2um, up });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_12_3_findcontext_greenBBBBFFFF(
			org.eclipse.uml2.uml.Model um, Model jm, JavaModel2UMLPackage jm2um, org.eclipse.uml2.uml.Package up) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge um__up____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um__um____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um__jm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String um__up____packagedElement_name_prime = "packagedElement";
		String jm2um__um____target_name_prime = "target";
		String jm2um__jm____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(um);
		isApplicableMatch.getAllContextElements().add(jm);
		isApplicableMatch.getAllContextElements().add(jm2um);
		isApplicableMatch.getAllContextElements().add(up);
		um__up____packagedElement.setSrc(um);
		um__up____packagedElement.setTrg(up);
		isApplicableMatch.getAllContextElements().add(um__up____packagedElement);
		jm2um__um____target.setSrc(jm2um);
		jm2um__um____target.setTrg(um);
		isApplicableMatch.getAllContextElements().add(jm2um__um____target);
		jm2um__jm____source.setSrc(jm2um);
		jm2um__jm____source.setTrg(jm);
		isApplicableMatch.getAllContextElements().add(jm2um__jm____source);
		um__up____packagedElement.setName(um__up____packagedElement_name_prime);
		jm2um__um____target.setName(jm2um__um____target_name_prime);
		jm2um__jm____source.setName(jm2um__jm____source_name_prime);
		return new Object[] { um, jm, jm2um, up, isApplicableMatch, um__up____packagedElement, jm2um__um____target,
				jm2um__jm____source };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_12_4_solveCSP_bindingFBBBBBB(
			JavaPackageToUMLPackage_underModel _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Model um, Model jm, JavaModel2UMLPackage jm2um, org.eclipse.uml2.uml.Package up) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, um, jm, jm2um, up);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, um, jm, jm2um, up };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_12_4_solveCSP_bindingAndBlackFBBBBBB(
			JavaPackageToUMLPackage_underModel _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Model um, Model jm, JavaModel2UMLPackage jm2um, org.eclipse.uml2.uml.Package up) {
		Object[] result_pattern_JavaPackageToUMLPackage_underModel_12_4_solveCSP_binding = pattern_JavaPackageToUMLPackage_underModel_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, um, jm, jm2um, up);
		if (result_pattern_JavaPackageToUMLPackage_underModel_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underModel_12_4_solveCSP_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underModel_12_4_solveCSP_black = pattern_JavaPackageToUMLPackage_underModel_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_JavaPackageToUMLPackage_underModel_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, um, jm, jm2um, up };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_12_5_checkCSP_expressionFBB(
			JavaPackageToUMLPackage_underModel _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "JavaPackageToUMLPackage_underModel";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaPackageToUMLPackage_underModel_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_20_1_preparereturnvalue_bindingFB(
			JavaPackageToUMLPackage_underModel _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, JavaPackageToUMLPackage_underModel _this) {
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

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_20_1_preparereturnvalue_bindingAndBlackFFBF(
			JavaPackageToUMLPackage_underModel _this) {
		Object[] result_pattern_JavaPackageToUMLPackage_underModel_20_1_preparereturnvalue_binding = pattern_JavaPackageToUMLPackage_underModel_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaPackageToUMLPackage_underModel_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_JavaPackageToUMLPackage_underModel_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underModel_20_1_preparereturnvalue_black = pattern_JavaPackageToUMLPackage_underModel_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_JavaPackageToUMLPackage_underModel_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_JavaPackageToUMLPackage_underModel_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_JavaPackageToUMLPackage_underModel_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underModel_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUm = _edge_packagedElement.getSrc();
		if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
			EObject tmpUp = _edge_packagedElement.getTrg();
			if (tmpUp instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) tmpUp;
				if (!um.equals(up)) {
					if (um.getPackagedElements().contains(up)) {
						_result.add(new Object[] { um, up, _edge_packagedElement });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			JavaPackageToUMLPackage_underModel _this, Match match, org.eclipse.uml2.uml.Model um,
			org.eclipse.uml2.uml.Package up) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, um, up);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			JavaPackageToUMLPackage_underModel _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_JavaPackageToUMLPackage_underModel_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_21_1_preparereturnvalue_bindingFB(
			JavaPackageToUMLPackage_underModel _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, JavaPackageToUMLPackage_underModel _this) {
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

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_21_1_preparereturnvalue_bindingAndBlackFFBF(
			JavaPackageToUMLPackage_underModel _this) {
		Object[] result_pattern_JavaPackageToUMLPackage_underModel_21_1_preparereturnvalue_binding = pattern_JavaPackageToUMLPackage_underModel_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaPackageToUMLPackage_underModel_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_JavaPackageToUMLPackage_underModel_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underModel_21_1_preparereturnvalue_black = pattern_JavaPackageToUMLPackage_underModel_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_JavaPackageToUMLPackage_underModel_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_JavaPackageToUMLPackage_underModel_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_JavaPackageToUMLPackage_underModel_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_21_2_testcorematchandDECs_black_nac_0B(
			org.eclipse.modisco.java.Package jp) {
		org.eclipse.modisco.java.Package __DEC_jp_ownedPackages_902671 = jp.getPackage();
		if (__DEC_jp_ownedPackages_902671 != null) {
			if (!jp.equals(__DEC_jp_ownedPackages_902671)) {
				return new Object[] { jp };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underModel_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJm = _edge_ownedElements.getSrc();
		if (tmpJm instanceof Model) {
			Model jm = (Model) tmpJm;
			EObject tmpJp = _edge_ownedElements.getTrg();
			if (tmpJp instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) tmpJp;
				if (jm.getOwnedElements().contains(jp)) {
					if (pattern_JavaPackageToUMLPackage_underModel_21_2_testcorematchandDECs_black_nac_0B(jp) == null) {
						_result.add(new Object[] { jp, jm, _edge_ownedElements });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			JavaPackageToUMLPackage_underModel _this, Match match, org.eclipse.modisco.java.Package jp, Model jm) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jp, jm);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			JavaPackageToUMLPackage_underModel _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_JavaPackageToUMLPackage_underModel_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_24_1_prepare_blackB(
			JavaPackageToUMLPackage_underModel _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("jp");
		EObject _localVariable_1 = targetMatch.getObject("um");
		EObject _localVariable_2 = sourceMatch.getObject("jm");
		EObject _localVariable_3 = targetMatch.getObject("up");
		EObject tmpJp = _localVariable_0;
		EObject tmpUm = _localVariable_1;
		EObject tmpJm = _localVariable_2;
		EObject tmpUp = _localVariable_3;
		if (tmpJp instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) tmpJp;
			if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
				org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
				if (tmpJm instanceof Model) {
					Model jm = (Model) tmpJm;
					if (tmpUp instanceof org.eclipse.uml2.uml.Package) {
						org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) tmpUp;
						return new Object[] { jp, um, jm, up, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_24_2_matchsrctrgcontext_blackBBBBBB(
			org.eclipse.modisco.java.Package jp, org.eclipse.uml2.uml.Model um, Model jm,
			org.eclipse.uml2.uml.Package up, Match sourceMatch, Match targetMatch) {
		if (!um.equals(up)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { jp, um, jm, up, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_JavaPackageToUMLPackage_underModel_24_2_matchsrctrgcontext_binding = pattern_JavaPackageToUMLPackage_underModel_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_JavaPackageToUMLPackage_underModel_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.modisco.java.Package jp = (org.eclipse.modisco.java.Package) result_pattern_JavaPackageToUMLPackage_underModel_24_2_matchsrctrgcontext_binding[0];
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result_pattern_JavaPackageToUMLPackage_underModel_24_2_matchsrctrgcontext_binding[1];
			Model jm = (Model) result_pattern_JavaPackageToUMLPackage_underModel_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result_pattern_JavaPackageToUMLPackage_underModel_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_JavaPackageToUMLPackage_underModel_24_2_matchsrctrgcontext_black = pattern_JavaPackageToUMLPackage_underModel_24_2_matchsrctrgcontext_blackBBBBBB(
					jp, um, jm, up, sourceMatch, targetMatch);
			if (result_pattern_JavaPackageToUMLPackage_underModel_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { jp, um, jm, up, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_24_3_solvecsp_bindingFBBBBBBB(
			JavaPackageToUMLPackage_underModel _this, org.eclipse.modisco.java.Package jp,
			org.eclipse.uml2.uml.Model um, Model jm, org.eclipse.uml2.uml.Package up, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(jp, um, jm, up, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, jp, um, jm, up, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			JavaPackageToUMLPackage_underModel _this, org.eclipse.modisco.java.Package jp,
			org.eclipse.uml2.uml.Model um, Model jm, org.eclipse.uml2.uml.Package up, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_JavaPackageToUMLPackage_underModel_24_3_solvecsp_binding = pattern_JavaPackageToUMLPackage_underModel_24_3_solvecsp_bindingFBBBBBBB(
				_this, jp, um, jm, up, sourceMatch, targetMatch);
		if (result_pattern_JavaPackageToUMLPackage_underModel_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underModel_24_3_solvecsp_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underModel_24_3_solvecsp_black = pattern_JavaPackageToUMLPackage_underModel_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_JavaPackageToUMLPackage_underModel_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, jp, um, jm, up, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underModel_24_5_matchcorrcontext_blackBBFBB(
			org.eclipse.uml2.uml.Model um, Model jm, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (JavaModel2UMLPackage jm2um : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(um,
					JavaModel2UMLPackage.class, "target")) {
				if (jm.equals(jm2um.getSource())) {
					_result.add(new Object[] { um, jm, jm2um, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_24_5_matchcorrcontext_greenBBBF(
			JavaModel2UMLPackage jm2um, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "JavaPackageToUMLPackage_underModel";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(jm2um);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { jm2um, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_24_6_createcorrespondence_blackBBBBB(
			org.eclipse.modisco.java.Package jp, org.eclipse.uml2.uml.Model um, Model jm,
			org.eclipse.uml2.uml.Package up, CCMatch ccMatch) {
		if (!um.equals(up)) {
			return new Object[] { jp, um, jm, up, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_24_6_createcorrespondence_greenFBBB(
			org.eclipse.modisco.java.Package jp, org.eclipse.uml2.uml.Package up, CCMatch ccMatch) {
		JavaPackage2UmlPackage jp2up = UmlFactory.eINSTANCE.createJavaPackage2UmlPackage();
		jp2up.setSource(jp);
		jp2up.setTarget(up);
		ccMatch.getCreateCorr().add(jp2up);
		return new Object[] { jp2up, jp, up, ccMatch };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "JavaPackageToUMLPackage_underModel";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaPackageToUMLPackage_underModel_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_27_1_matchtggpattern_black_nac_0B(
			org.eclipse.modisco.java.Package jp) {
		org.eclipse.modisco.java.Package __DEC_jp_ownedPackages_291526 = jp.getPackage();
		if (__DEC_jp_ownedPackages_291526 != null) {
			if (!jp.equals(__DEC_jp_ownedPackages_291526)) {
				return new Object[] { jp };
			}
		}

		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_27_1_matchtggpattern_blackBB(
			org.eclipse.modisco.java.Package jp, Model jm) {
		if (jm.getOwnedElements().contains(jp)) {
			if (pattern_JavaPackageToUMLPackage_underModel_27_1_matchtggpattern_black_nac_0B(jp) == null) {
				return new Object[] { jp, jm };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_28_1_matchtggpattern_blackBB(
			org.eclipse.uml2.uml.Model um, org.eclipse.uml2.uml.Package up) {
		if (!um.equals(up)) {
			if (um.getPackagedElements().contains(up)) {
				return new Object[] { um, up };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_29_1_createresult_blackB(
			JavaPackageToUMLPackage_underModel _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Model um) {
		if (ruleResult.getTargetObjects().contains(um)) {
			return new Object[] { ruleResult, um };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, JavaModel2UMLPackage jm2um) {
		if (ruleResult.getCorrObjects().contains(jm2um)) {
			return new Object[] { ruleResult, jm2um };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Model jm) {
		if (ruleResult.getSourceObjects().contains(jm)) {
			return new Object[] { ruleResult, jm };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaPackageToUMLPackage_underModel_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList jm2umList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpJm2um : jm2umList.getEntryObjects()) {
				if (tmpJm2um instanceof JavaModel2UMLPackage) {
					JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) tmpJm2um;
					org.eclipse.uml2.uml.Package tmpUm = jm2um.getTarget();
					if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
						org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
						Model jm = jm2um.getSource();
						if (jm != null) {
							if (pattern_JavaPackageToUMLPackage_underModel_29_2_isapplicablecore_black_nac_1BB(
									ruleResult, jm2um) == null) {
								if (pattern_JavaPackageToUMLPackage_underModel_29_2_isapplicablecore_black_nac_0BB(
										ruleResult, um) == null) {
									if (pattern_JavaPackageToUMLPackage_underModel_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, jm) == null) {
										_result.add(new Object[] { jm2umList, um, jm2um, jm, ruleEntryContainer,
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

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_29_3_solveCSP_bindingFBBBBBB(
			JavaPackageToUMLPackage_underModel _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Model um, Model jm, JavaModel2UMLPackage jm2um, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, um, jm, jm2um, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, um, jm, jm2um, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_29_3_solveCSP_bindingAndBlackFBBBBBB(
			JavaPackageToUMLPackage_underModel _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Model um, Model jm, JavaModel2UMLPackage jm2um, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_JavaPackageToUMLPackage_underModel_29_3_solveCSP_binding = pattern_JavaPackageToUMLPackage_underModel_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, um, jm, jm2um, ruleResult);
		if (result_pattern_JavaPackageToUMLPackage_underModel_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaPackageToUMLPackage_underModel_29_3_solveCSP_binding[0];

			Object[] result_pattern_JavaPackageToUMLPackage_underModel_29_3_solveCSP_black = pattern_JavaPackageToUMLPackage_underModel_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_JavaPackageToUMLPackage_underModel_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, um, jm, jm2um, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaPackageToUMLPackage_underModel_29_4_checkCSP_expressionFBB(
			JavaPackageToUMLPackage_underModel _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_29_5_checknacs_blackBBB(
			org.eclipse.uml2.uml.Model um, Model jm, JavaModel2UMLPackage jm2um) {
		return new Object[] { um, jm, jm2um };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_29_6_perform_blackBBBB(
			org.eclipse.uml2.uml.Model um, Model jm, JavaModel2UMLPackage jm2um, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { um, jm, jm2um, ruleResult };
	}

	public static final Object[] pattern_JavaPackageToUMLPackage_underModel_29_6_perform_greenFFBBFBB(
			org.eclipse.uml2.uml.Model um, Model jm, ModelgeneratorRuleResult ruleResult, CSP csp) {
		JavaPackage2UmlPackage jp2up = UmlFactory.eINSTANCE.createJavaPackage2UmlPackage();
		org.eclipse.modisco.java.Package jp = JavaFactory.eINSTANCE.createPackage();
		org.eclipse.uml2.uml.Package up = UMLFactory.eINSTANCE.createPackage();
		Object _localVariable_0 = csp.getValue("jp", "name");
		Object _localVariable_1 = csp.getValue("up", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(jp2up);
		jp2up.setSource(jp);
		jm.getOwnedElements().add(jp);
		ruleResult.getSourceObjects().add(jp);
		um.getPackagedElements().add(up);
		jp2up.setTarget(up);
		ruleResult.getTargetObjects().add(up);
		String jp_name_prime = (String) _localVariable_0;
		String up_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		jp.setName(jp_name_prime);
		up.setName(up_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { jp2up, jp, um, jm, up, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_JavaPackageToUMLPackage_underModel_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //JavaPackageToUMLPackage_underModelImpl
