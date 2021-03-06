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

import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.JavaModel2UMLPackage;
import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeShort;
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
 * An implementation of the model object '<em><b>Primitive Type Short</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PrimitiveTypeShortImpl extends AbstractRuleImpl implements PrimitiveTypeShort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeShortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPrimitiveTypeShort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Model jm, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {

		Object[] result1_black = PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_0_1_initialbindings_blackBBBB(this,
				match, jm, jpt);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jm] = " + jm + ", " + "[jpt] = " + jpt + ".");
		}

		Object[] result2_bindingAndBlack = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, jm, jpt);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jm] = " + jm + ", " + "[jpt] = " + jpt + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = PrimitiveTypeShortImpl
					.pattern_PrimitiveTypeShort_0_4_collectelementstobetranslated_blackBBB(match, jm, jpt);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jm] = " + jm + ", " + "[jpt] = " + jpt + ".");
			}
			PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_0_4_collectelementstobetranslated_greenBBBF(match, jm,
					jpt);
			//nothing EMoflonEdge jm__jpt____orphanTypes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = PrimitiveTypeShortImpl
					.pattern_PrimitiveTypeShort_0_5_collectcontextelements_blackBBB(match, jm, jpt);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jm] = " + jm + ", " + "[jpt] = " + jpt + ".");
			}
			PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_0_5_collectcontextelements_greenBB(match, jm);

			// 
			PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_0_6_registerobjectstomatch_expressionBBBB(this, match, jm,
					jpt);
			return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_0_7_expressionF();
		} else {
			return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		JavaModel2UMLPackage jm2up = (JavaModel2UMLPackage) result1_bindingAndBlack[0];
		Model jm = (Model) result1_bindingAndBlack[1];
		org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[2];
		org.eclipse.modisco.java.PrimitiveTypeShort jpt = (org.eclipse.modisco.java.PrimitiveTypeShort) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_1_1_performtransformation_greenFBFBB(up, jpt, csp);
		PrimitiveType umpt = (PrimitiveType) result1_green[0];
		NamedElement2NamedElement jpt2upt2 = (NamedElement2NamedElement) result1_green[2];

		Object[] result2_black = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_1_2_collecttranslatedelements_blackBBB(umpt, jpt2upt2, jpt);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[umpt] = " + umpt + ", "
					+ "[jpt2upt2] = " + jpt2upt2 + ", " + "[jpt] = " + jpt + ".");
		}
		Object[] result2_green = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_1_2_collecttranslatedelements_greenFBBB(umpt, jpt2upt2, jpt);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_1_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, jm2up, jm, umpt, up, jpt2upt2, jpt);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[jm2up] = " + jm2up + ", " + "[jm] = " + jm + ", " + "[umpt] = " + umpt + ", " + "[up] = "
					+ up + ", " + "[jpt2upt2] = " + jpt2upt2 + ", " + "[jpt] = " + jpt + ".");
		}
		PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, jm, umpt,
				up, jpt2upt2, jpt);
		//nothing EMoflonEdge up__umpt____packagedElement = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge jm__jpt____orphanTypes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge jpt2upt2__jpt____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge jpt2upt2__umpt____target = (EMoflonEdge) result3_green[9];

		// 
		// 
		PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				jm2up, jm, umpt, up, jpt2upt2, jpt);
		return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Model jm = (Model) result2_binding[0];
		org.eclipse.modisco.java.PrimitiveTypeShort jpt = (org.eclipse.modisco.java.PrimitiveTypeShort) result2_binding[1];
		for (Object[] result2_black : PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_2_2_corematch_blackFBFBB(jm,
				jpt, match)) {
			JavaModel2UMLPackage jm2up = (JavaModel2UMLPackage) result2_black[0];
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result2_black[2];
			// ForEach 
			for (Object[] result3_black : PrimitiveTypeShortImpl
					.pattern_PrimitiveTypeShort_2_3_findcontext_blackBBBB(jm2up, jm, up, jpt)) {
				Object[] result3_green = PrimitiveTypeShortImpl
						.pattern_PrimitiveTypeShort_2_3_findcontext_greenBBBBFFFF(jm2up, jm, up, jpt);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge jm__jpt____orphanTypes = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge jm2up__up____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jm2up__jm____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = PrimitiveTypeShortImpl
						.pattern_PrimitiveTypeShort_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, jm2up,
								jm, up, jpt);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jm2up] = " + jm2up + ", "
							+ "[jm] = " + jm + ", " + "[up] = " + up + ", " + "[jpt] = " + jpt + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = PrimitiveTypeShortImpl
							.pattern_PrimitiveTypeShort_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Model jm, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		match.registerObject("jm", jm);
		match.registerObject("jpt", jpt);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Model jm, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jm2up, Model jm,
			org.eclipse.uml2.uml.Package up, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_jpt_name = CSPFactoryHelper.eINSTANCE.createVariable("jpt.name", true, csp);
		var_jpt_name.setValue(jpt.getName());
		var_jpt_name.setType("String");

		// Create unbound variables
		Variable var_umpt_name = CSPFactoryHelper.eINSTANCE.createVariable("umpt.name", csp);
		var_umpt_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_jpt_name, var_umpt_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jm2up", jm2up);
		isApplicableMatch.registerObject("jm", jm);
		isApplicableMatch.registerObject("up", up);
		isApplicableMatch.registerObject("jpt", jpt);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject jm2up, EObject jm, EObject umpt, EObject up,
			EObject jpt2upt2, EObject jpt) {
		ruleresult.registerObject("jm2up", jm2up);
		ruleresult.registerObject("jm", jm);
		ruleresult.registerObject("umpt", umpt);
		ruleresult.registerObject("up", up);
		ruleresult.registerObject("jpt2upt2", jpt2upt2);
		ruleresult.registerObject("jpt", jpt);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("jpt").eClass())
				.equals("java.PrimitiveTypeShort.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {

		Object[] result1_black = PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_10_1_initialbindings_blackBBBB(this,
				match, umpt, up);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[umpt] = " + umpt + ", " + "[up] = " + up + ".");
		}

		Object[] result2_bindingAndBlack = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, umpt, up);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[umpt] = " + umpt + ", " + "[up] = " + up + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = PrimitiveTypeShortImpl
					.pattern_PrimitiveTypeShort_10_4_collectelementstobetranslated_blackBBB(match, umpt, up);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umpt] = " + umpt + ", " + "[up] = " + up + ".");
			}
			PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_10_4_collectelementstobetranslated_greenBBBF(match, umpt,
					up);
			//nothing EMoflonEdge up__umpt____packagedElement = (EMoflonEdge) result4_green[3];

			Object[] result5_black = PrimitiveTypeShortImpl
					.pattern_PrimitiveTypeShort_10_5_collectcontextelements_blackBBB(match, umpt, up);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umpt] = " + umpt + ", " + "[up] = " + up + ".");
			}
			PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_10_5_collectcontextelements_greenBB(match, up);

			// 
			PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_10_6_registerobjectstomatch_expressionBBBB(this, match,
					umpt, up);
			return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_10_7_expressionF();
		} else {
			return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		JavaModel2UMLPackage jm2up = (JavaModel2UMLPackage) result1_bindingAndBlack[0];
		Model jm = (Model) result1_bindingAndBlack[1];
		PrimitiveType umpt = (PrimitiveType) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_11_1_performtransformation_greenBBFFB(jm, umpt, csp);
		NamedElement2NamedElement jpt2upt2 = (NamedElement2NamedElement) result1_green[2];
		org.eclipse.modisco.java.PrimitiveTypeShort jpt = (org.eclipse.modisco.java.PrimitiveTypeShort) result1_green[3];

		Object[] result2_black = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_11_2_collecttranslatedelements_blackBBB(umpt, jpt2upt2, jpt);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[umpt] = " + umpt + ", "
					+ "[jpt2upt2] = " + jpt2upt2 + ", " + "[jpt] = " + jpt + ".");
		}
		Object[] result2_green = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_11_2_collecttranslatedelements_greenFBBB(umpt, jpt2upt2, jpt);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, jm2up, jm, umpt, up,
						jpt2upt2, jpt);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[jm2up] = " + jm2up + ", " + "[jm] = " + jm + ", " + "[umpt] = " + umpt + ", " + "[up] = "
					+ up + ", " + "[jpt2upt2] = " + jpt2upt2 + ", " + "[jpt] = " + jpt + ".");
		}
		PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, jm, umpt,
				up, jpt2upt2, jpt);
		//nothing EMoflonEdge up__umpt____packagedElement = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge jm__jpt____orphanTypes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge jpt2upt2__jpt____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge jpt2upt2__umpt____target = (EMoflonEdge) result3_green[9];

		// 
		// 
		PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				jm2up, jm, umpt, up, jpt2upt2, jpt);
		return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		PrimitiveType umpt = (PrimitiveType) result2_binding[0];
		org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result2_binding[1];
		for (Object[] result2_black : PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_12_2_corematch_blackFFBBB(umpt,
				up, match)) {
			JavaModel2UMLPackage jm2up = (JavaModel2UMLPackage) result2_black[0];
			Model jm = (Model) result2_black[1];
			// ForEach 
			for (Object[] result3_black : PrimitiveTypeShortImpl
					.pattern_PrimitiveTypeShort_12_3_findcontext_blackBBBB(jm2up, jm, umpt, up)) {
				Object[] result3_green = PrimitiveTypeShortImpl
						.pattern_PrimitiveTypeShort_12_3_findcontext_greenBBBBFFFF(jm2up, jm, umpt, up);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge up__umpt____packagedElement = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge jm2up__up____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jm2up__jm____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = PrimitiveTypeShortImpl
						.pattern_PrimitiveTypeShort_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, jm2up,
								jm, umpt, up);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jm2up] = " + jm2up + ", "
							+ "[jm] = " + jm + ", " + "[umpt] = " + umpt + ", " + "[up] = " + up + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = PrimitiveTypeShortImpl
							.pattern_PrimitiveTypeShort_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {
		match.registerObject("umpt", umpt);
		match.registerObject("up", up);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jm2up, Model jm,
			PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_umpt_name = CSPFactoryHelper.eINSTANCE.createVariable("umpt.name", true, csp);
		var_umpt_name.setValue(umpt.getName());
		var_umpt_name.setType("String");

		// Create unbound variables
		Variable var_jpt_name = CSPFactoryHelper.eINSTANCE.createVariable("jpt.name", csp);
		var_jpt_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_jpt_name, var_umpt_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jm2up", jm2up);
		isApplicableMatch.registerObject("jm", jm);
		isApplicableMatch.registerObject("umpt", umpt);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject jm2up, EObject jm, EObject umpt, EObject up,
			EObject jpt2upt2, EObject jpt) {
		ruleresult.registerObject("jm2up", jm2up);
		ruleresult.registerObject("jm", jm);
		ruleresult.registerObject("umpt", umpt);
		ruleresult.registerObject("up", up);
		ruleresult.registerObject("jpt2upt2", jpt2upt2);
		ruleresult.registerObject("jpt", jpt);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("umpt").eClass()).equals("uml.PrimitiveType.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_354(EMoflonEdge _edge_packagedElement) {

		Object[] result1_bindingAndBlack = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_20_2_testcorematchandDECs_blackFFB(_edge_packagedElement)) {
			PrimitiveType umpt = (PrimitiveType) result2_black[0];
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result2_black[1];
			Object[] result2_green = PrimitiveTypeShortImpl
					.pattern_PrimitiveTypeShort_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (PrimitiveTypeShortImpl
					.pattern_PrimitiveTypeShort_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, umpt, up)) {
				// 
				if (PrimitiveTypeShortImpl
						.pattern_PrimitiveTypeShort_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = PrimitiveTypeShortImpl
							.pattern_PrimitiveTypeShort_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_364(EMoflonEdge _edge_orphanTypes) {

		Object[] result1_bindingAndBlack = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_21_2_testcorematchandDECs_blackFFB(_edge_orphanTypes)) {
			Model jm = (Model) result2_black[0];
			org.eclipse.modisco.java.PrimitiveTypeShort jpt = (org.eclipse.modisco.java.PrimitiveTypeShort) result2_black[1];
			Object[] result2_green = PrimitiveTypeShortImpl
					.pattern_PrimitiveTypeShort_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (PrimitiveTypeShortImpl
					.pattern_PrimitiveTypeShort_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, jm, jpt)) {
				// 
				if (PrimitiveTypeShortImpl
						.pattern_PrimitiveTypeShort_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = PrimitiveTypeShortImpl
							.pattern_PrimitiveTypeShort_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PrimitiveTypeShort");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("up", "name", "Common Java datatypes", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_umpt_name = CSPFactoryHelper.eINSTANCE.createVariable("umpt", true, csp);
		var_umpt_name.setValue(__helper.getValue("umpt", "name"));
		var_umpt_name.setType("String");

		Variable var_jpt_name = CSPFactoryHelper.eINSTANCE.createVariable("jpt", true, csp);
		var_jpt_name.setValue(__helper.getValue("jpt", "name"));
		var_jpt_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("PrimitiveTypeShort");
		eq0.solve(var_jpt_name, var_umpt_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_umpt_name.setBound(false);
			eq0.solve(var_jpt_name, var_umpt_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("umpt", "name", var_umpt_name.getValue());
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
		ruleResult.setRule("PrimitiveTypeShort");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("up", "name", "Common Java datatypes", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_umpt_name = CSPFactoryHelper.eINSTANCE.createVariable("umpt", true, csp);
		var_umpt_name.setValue(__helper.getValue("umpt", "name"));
		var_umpt_name.setType("String");

		Variable var_jpt_name = CSPFactoryHelper.eINSTANCE.createVariable("jpt", true, csp);
		var_jpt_name.setValue(__helper.getValue("jpt", "name"));
		var_jpt_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("PrimitiveTypeShort");
		eq0.solve(var_jpt_name, var_umpt_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_jpt_name.setBound(false);
			eq0.solve(var_jpt_name, var_umpt_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("jpt", "name", var_jpt_name.getValue());
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

		Object[] result1_black = PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Model jm = (Model) result2_bindingAndBlack[0];
		PrimitiveType umpt = (PrimitiveType) result2_bindingAndBlack[1];
		org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result2_bindingAndBlack[2];
		org.eclipse.modisco.java.PrimitiveTypeShort jpt = (org.eclipse.modisco.java.PrimitiveTypeShort) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, jm, umpt, up, jpt, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[jm] = " + jm + ", " + "[umpt] = " + umpt + ", " + "[up] = " + up + ", " + "[jpt] = " + jpt
					+ ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : PrimitiveTypeShortImpl
					.pattern_PrimitiveTypeShort_24_5_matchcorrcontext_blackFBBBB(jm, up, sourceMatch, targetMatch)) {
				JavaModel2UMLPackage jm2up = (JavaModel2UMLPackage) result5_black[0];
				Object[] result5_green = PrimitiveTypeShortImpl
						.pattern_PrimitiveTypeShort_24_5_matchcorrcontext_greenBBBF(jm2up, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = PrimitiveTypeShortImpl
						.pattern_PrimitiveTypeShort_24_6_createcorrespondence_blackBBBBB(jm, umpt, up, jpt, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jm] = " + jm + ", "
							+ "[umpt] = " + umpt + ", " + "[up] = " + up + ", " + "[jpt] = " + jpt + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_24_6_createcorrespondence_greenBFBB(umpt, jpt,
						ccMatch);
				//nothing NamedElement2NamedElement jpt2upt2 = (NamedElement2NamedElement) result6_green[1];

				Object[] result7_black = PrimitiveTypeShortImpl
						.pattern_PrimitiveTypeShort_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Model jm, PrimitiveType umpt, org.eclipse.uml2.uml.Package up,
			org.eclipse.modisco.java.PrimitiveTypeShort jpt, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_jpt_name = CSPFactoryHelper.eINSTANCE.createVariable("jpt.name", true, csp);
		var_jpt_name.setValue(jpt.getName());
		var_jpt_name.setType("String");
		Variable var_umpt_name = CSPFactoryHelper.eINSTANCE.createVariable("umpt.name", true, csp);
		var_umpt_name.setValue(umpt.getName());
		var_umpt_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_jpt_name, var_umpt_name);
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
	public boolean checkDEC_FWD(Model jm, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {// 
		Object[] result1_black = PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_27_1_matchtggpattern_blackBB(jm,
				jpt);
		if (result1_black != null) {
			return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_27_2_expressionF();
		} else {
			return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {// 
		Object[] result1_black = PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_28_1_matchtggpattern_blackBB(umpt,
				up);
		if (result1_black != null) {
			return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_28_2_expressionF();
		} else {
			return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			JavaModel2UMLPackage jm2upParameter) {

		Object[] result1_black = PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : PrimitiveTypeShortImpl
				.pattern_PrimitiveTypeShort_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList jm2upList = (RuleEntryList) result2_black[0];
			JavaModel2UMLPackage jm2up = (JavaModel2UMLPackage) result2_black[1];
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result2_black[2];
			Model jm = (Model) result2_black[3];

			Object[] result3_bindingAndBlack = PrimitiveTypeShortImpl
					.pattern_PrimitiveTypeShort_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, jm2up, jm,
							up, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jm2up] = " + jm2up + ", " + "[jm] = "
						+ jm + ", " + "[up] = " + up + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = PrimitiveTypeShortImpl
						.pattern_PrimitiveTypeShort_29_5_checknacs_blackBBB(jm2up, jm, up);
				if (result5_black != null) {

					Object[] result6_black = PrimitiveTypeShortImpl
							.pattern_PrimitiveTypeShort_29_6_perform_blackBBBB(jm2up, jm, up, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[jm2up] = " + jm2up + ", " + "[jm] = "
										+ jm + ", " + "[up] = " + up + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_29_6_perform_greenBFBFFBB(jm, up, ruleResult,
							csp);
					//nothing PrimitiveType umpt = (PrimitiveType) result6_green[1];
					//nothing NamedElement2NamedElement jpt2upt2 = (NamedElement2NamedElement) result6_green[3];
					//nothing org.eclipse.modisco.java.PrimitiveTypeShort jpt = (org.eclipse.modisco.java.PrimitiveTypeShort) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return PrimitiveTypeShortImpl.pattern_PrimitiveTypeShort_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jm2up, Model jm,
			org.eclipse.uml2.uml.Package up, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_jpt_name = CSPFactoryHelper.eINSTANCE.createVariable("jpt.name", csp);
		var_jpt_name.setType("String");
		Variable var_umpt_name = CSPFactoryHelper.eINSTANCE.createVariable("umpt.name", csp);
		var_umpt_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_jpt_name, var_umpt_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jm2up", jm2up);
		isApplicableMatch.registerObject("jm", jm);
		isApplicableMatch.registerObject("up", up);
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
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPROPRIATE_FWD__MATCH_MODEL_PRIMITIVETYPESHORT:
			return isAppropriate_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(org.eclipse.modisco.java.PrimitiveTypeShort) arguments.get(2));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_PRIMITIVETYPESHORT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(org.eclipse.modisco.java.PrimitiveTypeShort) arguments.get(2));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_PRIMITIVETYPESHORT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(org.eclipse.modisco.java.PrimitiveTypeShort) arguments.get(2));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_JAVAMODEL2UMLPACKAGE_MODEL_PACKAGE_PRIMITIVETYPESHORT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(JavaModel2UMLPackage) arguments.get(1), (Model) arguments.get(2),
					(org.eclipse.uml2.uml.Package) arguments.get(3),
					(org.eclipse.modisco.java.PrimitiveTypeShort) arguments.get(4));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_SHORT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPROPRIATE_BWD__MATCH_PRIMITIVETYPE_PACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0), (PrimitiveType) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PRIMITIVETYPE_PACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (PrimitiveType) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PRIMITIVETYPE_PACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (PrimitiveType) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAMODEL2UMLPACKAGE_MODEL_PRIMITIVETYPE_PACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(JavaModel2UMLPackage) arguments.get(1), (Model) arguments.get(2), (PrimitiveType) arguments.get(3),
					(org.eclipse.uml2.uml.Package) arguments.get(4));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_SHORT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_354__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_354((EMoflonEdge) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_364__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_364((EMoflonEdge) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_PRIMITIVETYPE_PACKAGE_PRIMITIVETYPESHORT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Model) arguments.get(0), (PrimitiveType) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2),
					(org.eclipse.modisco.java.PrimitiveTypeShort) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___CHECK_DEC_FWD__MODEL_PRIMITIVETYPESHORT:
			return checkDEC_FWD((Model) arguments.get(0),
					(org.eclipse.modisco.java.PrimitiveTypeShort) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___CHECK_DEC_BWD__PRIMITIVETYPE_PACKAGE:
			return checkDEC_BWD((PrimitiveType) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___GENERATE_MODEL__RULEENTRYCONTAINER_JAVAMODEL2UMLPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (JavaModel2UMLPackage) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAMODEL2UMLPACKAGE_MODEL_PACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(JavaModel2UMLPackage) arguments.get(1), (Model) arguments.get(2),
					(org.eclipse.uml2.uml.Package) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.PRIMITIVE_TYPE_SHORT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PrimitiveTypeShort_0_1_initialbindings_blackBBBB(PrimitiveTypeShort _this,
			Match match, Model jm, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		return new Object[] { _this, match, jm, jpt };
	}

	public static final Object[] pattern_PrimitiveTypeShort_0_2_SolveCSP_bindingFBBBB(PrimitiveTypeShort _this,
			Match match, Model jm, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jm, jpt);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jm, jpt };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeShort_0_2_SolveCSP_bindingAndBlackFBBBB(PrimitiveTypeShort _this,
			Match match, Model jm, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		Object[] result_pattern_PrimitiveTypeShort_0_2_SolveCSP_binding = pattern_PrimitiveTypeShort_0_2_SolveCSP_bindingFBBBB(
				_this, match, jm, jpt);
		if (result_pattern_PrimitiveTypeShort_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeShort_0_2_SolveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeShort_0_2_SolveCSP_black = pattern_PrimitiveTypeShort_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeShort_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, jm, jpt };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeShort_0_3_CheckCSP_expressionFBB(PrimitiveTypeShort _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_0_4_collectelementstobetranslated_blackBBB(Match match,
			Model jm, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		return new Object[] { match, jm, jpt };
	}

	public static final Object[] pattern_PrimitiveTypeShort_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Model jm, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		EMoflonEdge jm__jpt____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(jpt);
		String jm__jpt____orphanTypes_name_prime = "orphanTypes";
		jm__jpt____orphanTypes.setSrc(jm);
		jm__jpt____orphanTypes.setTrg(jpt);
		match.getToBeTranslatedEdges().add(jm__jpt____orphanTypes);
		jm__jpt____orphanTypes.setName(jm__jpt____orphanTypes_name_prime);
		return new Object[] { match, jm, jpt, jm__jpt____orphanTypes };
	}

	public static final Object[] pattern_PrimitiveTypeShort_0_5_collectcontextelements_blackBBB(Match match, Model jm,
			org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		return new Object[] { match, jm, jpt };
	}

	public static final Object[] pattern_PrimitiveTypeShort_0_5_collectcontextelements_greenBB(Match match, Model jm) {
		match.getContextNodes().add(jm);
		return new Object[] { match, jm };
	}

	public static final void pattern_PrimitiveTypeShort_0_6_registerobjectstomatch_expressionBBBB(
			PrimitiveTypeShort _this, Match match, Model jm, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		_this.registerObjectsToMatch_FWD(match, jm, jpt);

	}

	public static final boolean pattern_PrimitiveTypeShort_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeShort_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jm2up");
		EObject _localVariable_1 = isApplicableMatch.getObject("jm");
		EObject _localVariable_2 = isApplicableMatch.getObject("up");
		EObject _localVariable_3 = isApplicableMatch.getObject("jpt");
		EObject tmpJm2up = _localVariable_0;
		EObject tmpJm = _localVariable_1;
		EObject tmpUp = _localVariable_2;
		EObject tmpJpt = _localVariable_3;
		if (tmpJm2up instanceof JavaModel2UMLPackage) {
			JavaModel2UMLPackage jm2up = (JavaModel2UMLPackage) tmpJm2up;
			if (tmpJm instanceof Model) {
				Model jm = (Model) tmpJm;
				if (tmpUp instanceof org.eclipse.uml2.uml.Package) {
					org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) tmpUp;
					if (tmpJpt instanceof org.eclipse.modisco.java.PrimitiveTypeShort) {
						org.eclipse.modisco.java.PrimitiveTypeShort jpt = (org.eclipse.modisco.java.PrimitiveTypeShort) tmpJpt;
						return new Object[] { jm2up, jm, up, jpt, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_1_1_performtransformation_blackBBBBFBB(
			JavaModel2UMLPackage jm2up, Model jm, org.eclipse.uml2.uml.Package up,
			org.eclipse.modisco.java.PrimitiveTypeShort jpt, PrimitiveTypeShort _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jm2up, jm, up, jpt, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_1_1_performtransformation_bindingAndBlackFFFFFBB(
			PrimitiveTypeShort _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PrimitiveTypeShort_1_1_performtransformation_binding = pattern_PrimitiveTypeShort_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_PrimitiveTypeShort_1_1_performtransformation_binding != null) {
			JavaModel2UMLPackage jm2up = (JavaModel2UMLPackage) result_pattern_PrimitiveTypeShort_1_1_performtransformation_binding[0];
			Model jm = (Model) result_pattern_PrimitiveTypeShort_1_1_performtransformation_binding[1];
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result_pattern_PrimitiveTypeShort_1_1_performtransformation_binding[2];
			org.eclipse.modisco.java.PrimitiveTypeShort jpt = (org.eclipse.modisco.java.PrimitiveTypeShort) result_pattern_PrimitiveTypeShort_1_1_performtransformation_binding[3];

			Object[] result_pattern_PrimitiveTypeShort_1_1_performtransformation_black = pattern_PrimitiveTypeShort_1_1_performtransformation_blackBBBBFBB(
					jm2up, jm, up, jpt, _this, isApplicableMatch);
			if (result_pattern_PrimitiveTypeShort_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PrimitiveTypeShort_1_1_performtransformation_black[4];

				return new Object[] { jm2up, jm, up, jpt, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_1_1_performtransformation_greenFBFBB(
			org.eclipse.uml2.uml.Package up, org.eclipse.modisco.java.PrimitiveTypeShort jpt, CSP csp) {
		PrimitiveType umpt = UMLFactory.eINSTANCE.createPrimitiveType();
		NamedElement2NamedElement jpt2upt2 = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		Object _localVariable_0 = csp.getValue("umpt", "name");
		up.getPackagedElements().add(umpt);
		jpt2upt2.setSource(jpt);
		jpt2upt2.setTarget(umpt);
		String umpt_name_prime = (String) _localVariable_0;
		umpt.setName(umpt_name_prime);
		return new Object[] { umpt, up, jpt2upt2, jpt, csp };
	}

	public static final Object[] pattern_PrimitiveTypeShort_1_2_collecttranslatedelements_blackBBB(PrimitiveType umpt,
			NamedElement2NamedElement jpt2upt2, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		return new Object[] { umpt, jpt2upt2, jpt };
	}

	public static final Object[] pattern_PrimitiveTypeShort_1_2_collecttranslatedelements_greenFBBB(PrimitiveType umpt,
			NamedElement2NamedElement jpt2upt2, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(umpt);
		ruleresult.getCreatedLinkElements().add(jpt2upt2);
		ruleresult.getTranslatedElements().add(jpt);
		return new Object[] { ruleresult, umpt, jpt2upt2, jpt };
	}

	public static final Object[] pattern_PrimitiveTypeShort_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jm2up, EObject jm, EObject umpt, EObject up, EObject jpt2upt2,
			EObject jpt) {
		if (!jm2up.equals(umpt)) {
			if (!jm2up.equals(up)) {
				if (!jm2up.equals(jpt2upt2)) {
					if (!jm2up.equals(jpt)) {
						if (!jm.equals(jm2up)) {
							if (!jm.equals(umpt)) {
								if (!jm.equals(up)) {
									if (!jm.equals(jpt2upt2)) {
										if (!jm.equals(jpt)) {
											if (!umpt.equals(up)) {
												if (!jpt2upt2.equals(umpt)) {
													if (!jpt2upt2.equals(up)) {
														if (!jpt.equals(umpt)) {
															if (!jpt.equals(up)) {
																if (!jpt.equals(jpt2upt2)) {
																	return new Object[] { ruleresult, jm2up, jm, umpt,
																			up, jpt2upt2, jpt };
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

	public static final Object[] pattern_PrimitiveTypeShort_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject jm, EObject umpt, EObject up, EObject jpt2upt2, EObject jpt) {
		EMoflonEdge up__umpt____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm__jpt____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jpt2upt2__jpt____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jpt2upt2__umpt____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PrimitiveTypeShort";
		String up__umpt____packagedElement_name_prime = "packagedElement";
		String jm__jpt____orphanTypes_name_prime = "orphanTypes";
		String jpt2upt2__jpt____source_name_prime = "source";
		String jpt2upt2__umpt____target_name_prime = "target";
		up__umpt____packagedElement.setSrc(up);
		up__umpt____packagedElement.setTrg(umpt);
		ruleresult.getCreatedEdges().add(up__umpt____packagedElement);
		jm__jpt____orphanTypes.setSrc(jm);
		jm__jpt____orphanTypes.setTrg(jpt);
		ruleresult.getTranslatedEdges().add(jm__jpt____orphanTypes);
		jpt2upt2__jpt____source.setSrc(jpt2upt2);
		jpt2upt2__jpt____source.setTrg(jpt);
		ruleresult.getCreatedEdges().add(jpt2upt2__jpt____source);
		jpt2upt2__umpt____target.setSrc(jpt2upt2);
		jpt2upt2__umpt____target.setTrg(umpt);
		ruleresult.getCreatedEdges().add(jpt2upt2__umpt____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		up__umpt____packagedElement.setName(up__umpt____packagedElement_name_prime);
		jm__jpt____orphanTypes.setName(jm__jpt____orphanTypes_name_prime);
		jpt2upt2__jpt____source.setName(jpt2upt2__jpt____source_name_prime);
		jpt2upt2__umpt____target.setName(jpt2upt2__umpt____target_name_prime);
		return new Object[] { ruleresult, jm, umpt, up, jpt2upt2, jpt, up__umpt____packagedElement,
				jm__jpt____orphanTypes, jpt2upt2__jpt____source, jpt2upt2__umpt____target };
	}

	public static final void pattern_PrimitiveTypeShort_1_5_registerobjects_expressionBBBBBBBB(PrimitiveTypeShort _this,
			PerformRuleResult ruleresult, EObject jm2up, EObject jm, EObject umpt, EObject up, EObject jpt2upt2,
			EObject jpt) {
		_this.registerObjects_FWD(ruleresult, jm2up, jm, umpt, up, jpt2upt2, jpt);

	}

	public static final PerformRuleResult pattern_PrimitiveTypeShort_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_2_1_preparereturnvalue_bindingFB(PrimitiveTypeShort _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_2_1_preparereturnvalue_blackFBB(EClass eClass,
			PrimitiveTypeShort _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_2_1_preparereturnvalue_bindingAndBlackFFB(
			PrimitiveTypeShort _this) {
		Object[] result_pattern_PrimitiveTypeShort_2_1_preparereturnvalue_binding = pattern_PrimitiveTypeShort_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeShort_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PrimitiveTypeShort_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeShort_2_1_preparereturnvalue_black = pattern_PrimitiveTypeShort_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PrimitiveTypeShort_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PrimitiveTypeShort_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "PrimitiveTypeShort";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PrimitiveTypeShort_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("jm");
		EObject _localVariable_1 = match.getObject("jpt");
		EObject tmpJm = _localVariable_0;
		EObject tmpJpt = _localVariable_1;
		if (tmpJm instanceof Model) {
			Model jm = (Model) tmpJm;
			if (tmpJpt instanceof org.eclipse.modisco.java.PrimitiveTypeShort) {
				org.eclipse.modisco.java.PrimitiveTypeShort jpt = (org.eclipse.modisco.java.PrimitiveTypeShort) tmpJpt;
				return new Object[] { jm, jpt, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeShort_2_2_corematch_blackFBFBB(Model jm,
			org.eclipse.modisco.java.PrimitiveTypeShort jpt, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (JavaModel2UMLPackage jm2up : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jm,
				JavaModel2UMLPackage.class, "source")) {
			org.eclipse.uml2.uml.Package up = jm2up.getTarget();
			if (up != null) {
				String up_name = up.getName();
				if (up_name.equals("Common Java datatypes")) {
					_result.add(new Object[] { jm2up, jm, up, jpt, match });
				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeShort_2_3_findcontext_blackBBBB(
			JavaModel2UMLPackage jm2up, Model jm, org.eclipse.uml2.uml.Package up,
			org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jm.getOrphanTypes().contains(jpt)) {
			if (up.equals(jm2up.getTarget())) {
				if (jm.equals(jm2up.getSource())) {
					String up_name = up.getName();
					if (up_name.equals("Common Java datatypes")) {
						_result.add(new Object[] { jm2up, jm, up, jpt });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_2_3_findcontext_greenBBBBFFFF(JavaModel2UMLPackage jm2up,
			Model jm, org.eclipse.uml2.uml.Package up, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jm__jpt____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2up__up____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2up__jm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jm__jpt____orphanTypes_name_prime = "orphanTypes";
		String jm2up__up____target_name_prime = "target";
		String jm2up__jm____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(jm2up);
		isApplicableMatch.getAllContextElements().add(jm);
		isApplicableMatch.getAllContextElements().add(up);
		isApplicableMatch.getAllContextElements().add(jpt);
		jm__jpt____orphanTypes.setSrc(jm);
		jm__jpt____orphanTypes.setTrg(jpt);
		isApplicableMatch.getAllContextElements().add(jm__jpt____orphanTypes);
		jm2up__up____target.setSrc(jm2up);
		jm2up__up____target.setTrg(up);
		isApplicableMatch.getAllContextElements().add(jm2up__up____target);
		jm2up__jm____source.setSrc(jm2up);
		jm2up__jm____source.setTrg(jm);
		isApplicableMatch.getAllContextElements().add(jm2up__jm____source);
		jm__jpt____orphanTypes.setName(jm__jpt____orphanTypes_name_prime);
		jm2up__up____target.setName(jm2up__up____target_name_prime);
		jm2up__jm____source.setName(jm2up__jm____source_name_prime);
		return new Object[] { jm2up, jm, up, jpt, isApplicableMatch, jm__jpt____orphanTypes, jm2up__up____target,
				jm2up__jm____source };
	}

	public static final Object[] pattern_PrimitiveTypeShort_2_4_solveCSP_bindingFBBBBBB(PrimitiveTypeShort _this,
			IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jm2up, Model jm, org.eclipse.uml2.uml.Package up,
			org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, jm2up, jm, up, jpt);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jm2up, jm, up, jpt };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeShort_2_4_solveCSP_bindingAndBlackFBBBBBB(
			PrimitiveTypeShort _this, IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jm2up, Model jm,
			org.eclipse.uml2.uml.Package up, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		Object[] result_pattern_PrimitiveTypeShort_2_4_solveCSP_binding = pattern_PrimitiveTypeShort_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jm2up, jm, up, jpt);
		if (result_pattern_PrimitiveTypeShort_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeShort_2_4_solveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeShort_2_4_solveCSP_black = pattern_PrimitiveTypeShort_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeShort_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jm2up, jm, up, jpt };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeShort_2_5_checkCSP_expressionFBB(PrimitiveTypeShort _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PrimitiveTypeShort_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PrimitiveTypeShort";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PrimitiveTypeShort_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_10_1_initialbindings_blackBBBB(PrimitiveTypeShort _this,
			Match match, PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {
		return new Object[] { _this, match, umpt, up };
	}

	public static final Object[] pattern_PrimitiveTypeShort_10_2_SolveCSP_bindingFBBBB(PrimitiveTypeShort _this,
			Match match, PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, umpt, up);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, umpt, up };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeShort_10_2_SolveCSP_bindingAndBlackFBBBB(PrimitiveTypeShort _this,
			Match match, PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {
		Object[] result_pattern_PrimitiveTypeShort_10_2_SolveCSP_binding = pattern_PrimitiveTypeShort_10_2_SolveCSP_bindingFBBBB(
				_this, match, umpt, up);
		if (result_pattern_PrimitiveTypeShort_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeShort_10_2_SolveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeShort_10_2_SolveCSP_black = pattern_PrimitiveTypeShort_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeShort_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, umpt, up };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeShort_10_3_CheckCSP_expressionFBB(PrimitiveTypeShort _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_10_4_collectelementstobetranslated_blackBBB(Match match,
			PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {
		return new Object[] { match, umpt, up };
	}

	public static final Object[] pattern_PrimitiveTypeShort_10_4_collectelementstobetranslated_greenBBBF(Match match,
			PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {
		EMoflonEdge up__umpt____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(umpt);
		String up__umpt____packagedElement_name_prime = "packagedElement";
		up__umpt____packagedElement.setSrc(up);
		up__umpt____packagedElement.setTrg(umpt);
		match.getToBeTranslatedEdges().add(up__umpt____packagedElement);
		up__umpt____packagedElement.setName(up__umpt____packagedElement_name_prime);
		return new Object[] { match, umpt, up, up__umpt____packagedElement };
	}

	public static final Object[] pattern_PrimitiveTypeShort_10_5_collectcontextelements_blackBBB(Match match,
			PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {
		return new Object[] { match, umpt, up };
	}

	public static final Object[] pattern_PrimitiveTypeShort_10_5_collectcontextelements_greenBB(Match match,
			org.eclipse.uml2.uml.Package up) {
		match.getContextNodes().add(up);
		return new Object[] { match, up };
	}

	public static final void pattern_PrimitiveTypeShort_10_6_registerobjectstomatch_expressionBBBB(
			PrimitiveTypeShort _this, Match match, PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {
		_this.registerObjectsToMatch_BWD(match, umpt, up);

	}

	public static final boolean pattern_PrimitiveTypeShort_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeShort_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jm2up");
		EObject _localVariable_1 = isApplicableMatch.getObject("jm");
		EObject _localVariable_2 = isApplicableMatch.getObject("umpt");
		EObject _localVariable_3 = isApplicableMatch.getObject("up");
		EObject tmpJm2up = _localVariable_0;
		EObject tmpJm = _localVariable_1;
		EObject tmpUmpt = _localVariable_2;
		EObject tmpUp = _localVariable_3;
		if (tmpJm2up instanceof JavaModel2UMLPackage) {
			JavaModel2UMLPackage jm2up = (JavaModel2UMLPackage) tmpJm2up;
			if (tmpJm instanceof Model) {
				Model jm = (Model) tmpJm;
				if (tmpUmpt instanceof PrimitiveType) {
					PrimitiveType umpt = (PrimitiveType) tmpUmpt;
					if (tmpUp instanceof org.eclipse.uml2.uml.Package) {
						org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) tmpUp;
						return new Object[] { jm2up, jm, umpt, up, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_11_1_performtransformation_blackBBBBFBB(
			JavaModel2UMLPackage jm2up, Model jm, PrimitiveType umpt, org.eclipse.uml2.uml.Package up,
			PrimitiveTypeShort _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jm2up, jm, umpt, up, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_11_1_performtransformation_bindingAndBlackFFFFFBB(
			PrimitiveTypeShort _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PrimitiveTypeShort_11_1_performtransformation_binding = pattern_PrimitiveTypeShort_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_PrimitiveTypeShort_11_1_performtransformation_binding != null) {
			JavaModel2UMLPackage jm2up = (JavaModel2UMLPackage) result_pattern_PrimitiveTypeShort_11_1_performtransformation_binding[0];
			Model jm = (Model) result_pattern_PrimitiveTypeShort_11_1_performtransformation_binding[1];
			PrimitiveType umpt = (PrimitiveType) result_pattern_PrimitiveTypeShort_11_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result_pattern_PrimitiveTypeShort_11_1_performtransformation_binding[3];

			Object[] result_pattern_PrimitiveTypeShort_11_1_performtransformation_black = pattern_PrimitiveTypeShort_11_1_performtransformation_blackBBBBFBB(
					jm2up, jm, umpt, up, _this, isApplicableMatch);
			if (result_pattern_PrimitiveTypeShort_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PrimitiveTypeShort_11_1_performtransformation_black[4];

				return new Object[] { jm2up, jm, umpt, up, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_11_1_performtransformation_greenBBFFB(Model jm,
			PrimitiveType umpt, CSP csp) {
		NamedElement2NamedElement jpt2upt2 = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		org.eclipse.modisco.java.PrimitiveTypeShort jpt = JavaFactory.eINSTANCE.createPrimitiveTypeShort();
		Object _localVariable_0 = csp.getValue("jpt", "name");
		jpt2upt2.setTarget(umpt);
		jm.getOrphanTypes().add(jpt);
		jpt2upt2.setSource(jpt);
		String jpt_name_prime = (String) _localVariable_0;
		jpt.setName(jpt_name_prime);
		return new Object[] { jm, umpt, jpt2upt2, jpt, csp };
	}

	public static final Object[] pattern_PrimitiveTypeShort_11_2_collecttranslatedelements_blackBBB(PrimitiveType umpt,
			NamedElement2NamedElement jpt2upt2, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		return new Object[] { umpt, jpt2upt2, jpt };
	}

	public static final Object[] pattern_PrimitiveTypeShort_11_2_collecttranslatedelements_greenFBBB(PrimitiveType umpt,
			NamedElement2NamedElement jpt2upt2, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(umpt);
		ruleresult.getCreatedLinkElements().add(jpt2upt2);
		ruleresult.getCreatedElements().add(jpt);
		return new Object[] { ruleresult, umpt, jpt2upt2, jpt };
	}

	public static final Object[] pattern_PrimitiveTypeShort_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jm2up, EObject jm, EObject umpt, EObject up, EObject jpt2upt2,
			EObject jpt) {
		if (!jm2up.equals(umpt)) {
			if (!jm2up.equals(up)) {
				if (!jm2up.equals(jpt2upt2)) {
					if (!jm2up.equals(jpt)) {
						if (!jm.equals(jm2up)) {
							if (!jm.equals(umpt)) {
								if (!jm.equals(up)) {
									if (!jm.equals(jpt2upt2)) {
										if (!jm.equals(jpt)) {
											if (!umpt.equals(up)) {
												if (!jpt2upt2.equals(umpt)) {
													if (!jpt2upt2.equals(up)) {
														if (!jpt.equals(umpt)) {
															if (!jpt.equals(up)) {
																if (!jpt.equals(jpt2upt2)) {
																	return new Object[] { ruleresult, jm2up, jm, umpt,
																			up, jpt2upt2, jpt };
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

	public static final Object[] pattern_PrimitiveTypeShort_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject jm, EObject umpt, EObject up, EObject jpt2upt2, EObject jpt) {
		EMoflonEdge up__umpt____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm__jpt____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jpt2upt2__jpt____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jpt2upt2__umpt____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PrimitiveTypeShort";
		String up__umpt____packagedElement_name_prime = "packagedElement";
		String jm__jpt____orphanTypes_name_prime = "orphanTypes";
		String jpt2upt2__jpt____source_name_prime = "source";
		String jpt2upt2__umpt____target_name_prime = "target";
		up__umpt____packagedElement.setSrc(up);
		up__umpt____packagedElement.setTrg(umpt);
		ruleresult.getTranslatedEdges().add(up__umpt____packagedElement);
		jm__jpt____orphanTypes.setSrc(jm);
		jm__jpt____orphanTypes.setTrg(jpt);
		ruleresult.getCreatedEdges().add(jm__jpt____orphanTypes);
		jpt2upt2__jpt____source.setSrc(jpt2upt2);
		jpt2upt2__jpt____source.setTrg(jpt);
		ruleresult.getCreatedEdges().add(jpt2upt2__jpt____source);
		jpt2upt2__umpt____target.setSrc(jpt2upt2);
		jpt2upt2__umpt____target.setTrg(umpt);
		ruleresult.getCreatedEdges().add(jpt2upt2__umpt____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		up__umpt____packagedElement.setName(up__umpt____packagedElement_name_prime);
		jm__jpt____orphanTypes.setName(jm__jpt____orphanTypes_name_prime);
		jpt2upt2__jpt____source.setName(jpt2upt2__jpt____source_name_prime);
		jpt2upt2__umpt____target.setName(jpt2upt2__umpt____target_name_prime);
		return new Object[] { ruleresult, jm, umpt, up, jpt2upt2, jpt, up__umpt____packagedElement,
				jm__jpt____orphanTypes, jpt2upt2__jpt____source, jpt2upt2__umpt____target };
	}

	public static final void pattern_PrimitiveTypeShort_11_5_registerobjects_expressionBBBBBBBB(
			PrimitiveTypeShort _this, PerformRuleResult ruleresult, EObject jm2up, EObject jm, EObject umpt, EObject up,
			EObject jpt2upt2, EObject jpt) {
		_this.registerObjects_BWD(ruleresult, jm2up, jm, umpt, up, jpt2upt2, jpt);

	}

	public static final PerformRuleResult pattern_PrimitiveTypeShort_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_12_1_preparereturnvalue_bindingFB(
			PrimitiveTypeShort _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_12_1_preparereturnvalue_blackFBB(EClass eClass,
			PrimitiveTypeShort _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_12_1_preparereturnvalue_bindingAndBlackFFB(
			PrimitiveTypeShort _this) {
		Object[] result_pattern_PrimitiveTypeShort_12_1_preparereturnvalue_binding = pattern_PrimitiveTypeShort_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeShort_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PrimitiveTypeShort_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeShort_12_1_preparereturnvalue_black = pattern_PrimitiveTypeShort_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PrimitiveTypeShort_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PrimitiveTypeShort_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "PrimitiveTypeShort";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PrimitiveTypeShort_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("umpt");
		EObject _localVariable_1 = match.getObject("up");
		EObject tmpUmpt = _localVariable_0;
		EObject tmpUp = _localVariable_1;
		if (tmpUmpt instanceof PrimitiveType) {
			PrimitiveType umpt = (PrimitiveType) tmpUmpt;
			if (tmpUp instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) tmpUp;
				return new Object[] { umpt, up, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeShort_12_2_corematch_blackFFBBB(PrimitiveType umpt,
			org.eclipse.uml2.uml.Package up, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		String up_name = up.getName();
		if (up_name.equals("Common Java datatypes")) {
			for (JavaModel2UMLPackage jm2up : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(up,
					JavaModel2UMLPackage.class, "target")) {
				Model jm = jm2up.getSource();
				if (jm != null) {
					_result.add(new Object[] { jm2up, jm, umpt, up, match });
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeShort_12_3_findcontext_blackBBBB(
			JavaModel2UMLPackage jm2up, Model jm, PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (up.getPackagedElements().contains(umpt)) {
			if (up.equals(jm2up.getTarget())) {
				if (jm.equals(jm2up.getSource())) {
					String up_name = up.getName();
					if (up_name.equals("Common Java datatypes")) {
						_result.add(new Object[] { jm2up, jm, umpt, up });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_12_3_findcontext_greenBBBBFFFF(JavaModel2UMLPackage jm2up,
			Model jm, PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge up__umpt____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2up__up____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2up__jm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String up__umpt____packagedElement_name_prime = "packagedElement";
		String jm2up__up____target_name_prime = "target";
		String jm2up__jm____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(jm2up);
		isApplicableMatch.getAllContextElements().add(jm);
		isApplicableMatch.getAllContextElements().add(umpt);
		isApplicableMatch.getAllContextElements().add(up);
		up__umpt____packagedElement.setSrc(up);
		up__umpt____packagedElement.setTrg(umpt);
		isApplicableMatch.getAllContextElements().add(up__umpt____packagedElement);
		jm2up__up____target.setSrc(jm2up);
		jm2up__up____target.setTrg(up);
		isApplicableMatch.getAllContextElements().add(jm2up__up____target);
		jm2up__jm____source.setSrc(jm2up);
		jm2up__jm____source.setTrg(jm);
		isApplicableMatch.getAllContextElements().add(jm2up__jm____source);
		up__umpt____packagedElement.setName(up__umpt____packagedElement_name_prime);
		jm2up__up____target.setName(jm2up__up____target_name_prime);
		jm2up__jm____source.setName(jm2up__jm____source_name_prime);
		return new Object[] { jm2up, jm, umpt, up, isApplicableMatch, up__umpt____packagedElement, jm2up__up____target,
				jm2up__jm____source };
	}

	public static final Object[] pattern_PrimitiveTypeShort_12_4_solveCSP_bindingFBBBBBB(PrimitiveTypeShort _this,
			IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jm2up, Model jm, PrimitiveType umpt,
			org.eclipse.uml2.uml.Package up) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, jm2up, jm, umpt, up);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jm2up, jm, umpt, up };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeShort_12_4_solveCSP_bindingAndBlackFBBBBBB(
			PrimitiveTypeShort _this, IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jm2up, Model jm,
			PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {
		Object[] result_pattern_PrimitiveTypeShort_12_4_solveCSP_binding = pattern_PrimitiveTypeShort_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jm2up, jm, umpt, up);
		if (result_pattern_PrimitiveTypeShort_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeShort_12_4_solveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeShort_12_4_solveCSP_black = pattern_PrimitiveTypeShort_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeShort_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jm2up, jm, umpt, up };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeShort_12_5_checkCSP_expressionFBB(PrimitiveTypeShort _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PrimitiveTypeShort_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PrimitiveTypeShort";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PrimitiveTypeShort_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_20_1_preparereturnvalue_bindingFB(
			PrimitiveTypeShort _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PrimitiveTypeShort _this) {
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

	public static final Object[] pattern_PrimitiveTypeShort_20_1_preparereturnvalue_bindingAndBlackFFBF(
			PrimitiveTypeShort _this) {
		Object[] result_pattern_PrimitiveTypeShort_20_1_preparereturnvalue_binding = pattern_PrimitiveTypeShort_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeShort_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PrimitiveTypeShort_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeShort_20_1_preparereturnvalue_black = pattern_PrimitiveTypeShort_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PrimitiveTypeShort_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PrimitiveTypeShort_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PrimitiveTypeShort_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PrimitiveTypeShort_20_2_testcorematchandDECs_black_nac_0B(PrimitiveType umpt) {
		for (org.eclipse.uml2.uml.Class __DEC_umpt_nestedClassifier_529605 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(umpt, org.eclipse.uml2.uml.Class.class, "nestedClassifier")) {
			return new Object[] { umpt };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_20_2_testcorematchandDECs_black_nac_1B(PrimitiveType umpt) {
		for (Interface __DEC_umpt_nestedClassifier_928531 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(umpt, Interface.class, "nestedClassifier")) {
			return new Object[] { umpt };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeShort_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUp = _edge_packagedElement.getSrc();
		if (tmpUp instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) tmpUp;
			EObject tmpUmpt = _edge_packagedElement.getTrg();
			if (tmpUmpt instanceof PrimitiveType) {
				PrimitiveType umpt = (PrimitiveType) tmpUmpt;
				if (up.getPackagedElements().contains(umpt)) {
					String up_name = up.getName();
					if (up_name.equals("Common Java datatypes")) {
						if (pattern_PrimitiveTypeShort_20_2_testcorematchandDECs_black_nac_0B(umpt) == null) {
							if (pattern_PrimitiveTypeShort_20_2_testcorematchandDECs_black_nac_1B(umpt) == null) {
								_result.add(new Object[] { umpt, up, _edge_packagedElement });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PrimitiveTypeShort_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			PrimitiveTypeShort _this, Match match, PrimitiveType umpt, org.eclipse.uml2.uml.Package up) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, umpt, up);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeShort_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PrimitiveTypeShort _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PrimitiveTypeShort_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_21_1_preparereturnvalue_bindingFB(
			PrimitiveTypeShort _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PrimitiveTypeShort _this) {
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

	public static final Object[] pattern_PrimitiveTypeShort_21_1_preparereturnvalue_bindingAndBlackFFBF(
			PrimitiveTypeShort _this) {
		Object[] result_pattern_PrimitiveTypeShort_21_1_preparereturnvalue_binding = pattern_PrimitiveTypeShort_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeShort_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PrimitiveTypeShort_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeShort_21_1_preparereturnvalue_black = pattern_PrimitiveTypeShort_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PrimitiveTypeShort_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PrimitiveTypeShort_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PrimitiveTypeShort_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeShort_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_orphanTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJm = _edge_orphanTypes.getSrc();
		if (tmpJm instanceof Model) {
			Model jm = (Model) tmpJm;
			EObject tmpJpt = _edge_orphanTypes.getTrg();
			if (tmpJpt instanceof org.eclipse.modisco.java.PrimitiveTypeShort) {
				org.eclipse.modisco.java.PrimitiveTypeShort jpt = (org.eclipse.modisco.java.PrimitiveTypeShort) tmpJpt;
				if (jm.getOrphanTypes().contains(jpt)) {
					_result.add(new Object[] { jm, jpt, _edge_orphanTypes });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PrimitiveTypeShort_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			PrimitiveTypeShort _this, Match match, Model jm, org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jm, jpt);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeShort_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PrimitiveTypeShort _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PrimitiveTypeShort_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_24_1_prepare_blackB(PrimitiveTypeShort _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PrimitiveTypeShort_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_PrimitiveTypeShort_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("jm");
		EObject _localVariable_1 = targetMatch.getObject("umpt");
		EObject _localVariable_2 = targetMatch.getObject("up");
		EObject _localVariable_3 = sourceMatch.getObject("jpt");
		EObject tmpJm = _localVariable_0;
		EObject tmpUmpt = _localVariable_1;
		EObject tmpUp = _localVariable_2;
		EObject tmpJpt = _localVariable_3;
		if (tmpJm instanceof Model) {
			Model jm = (Model) tmpJm;
			if (tmpUmpt instanceof PrimitiveType) {
				PrimitiveType umpt = (PrimitiveType) tmpUmpt;
				if (tmpUp instanceof org.eclipse.uml2.uml.Package) {
					org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) tmpUp;
					if (tmpJpt instanceof org.eclipse.modisco.java.PrimitiveTypeShort) {
						org.eclipse.modisco.java.PrimitiveTypeShort jpt = (org.eclipse.modisco.java.PrimitiveTypeShort) tmpJpt;
						return new Object[] { jm, umpt, up, jpt, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_24_2_matchsrctrgcontext_blackBBBBBB(Model jm,
			PrimitiveType umpt, org.eclipse.uml2.uml.Package up, org.eclipse.modisco.java.PrimitiveTypeShort jpt,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			String up_name = up.getName();
			if (up_name.equals("Common Java datatypes")) {
				return new Object[] { jm, umpt, up, jpt, sourceMatch, targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_PrimitiveTypeShort_24_2_matchsrctrgcontext_binding = pattern_PrimitiveTypeShort_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_PrimitiveTypeShort_24_2_matchsrctrgcontext_binding != null) {
			Model jm = (Model) result_pattern_PrimitiveTypeShort_24_2_matchsrctrgcontext_binding[0];
			PrimitiveType umpt = (PrimitiveType) result_pattern_PrimitiveTypeShort_24_2_matchsrctrgcontext_binding[1];
			org.eclipse.uml2.uml.Package up = (org.eclipse.uml2.uml.Package) result_pattern_PrimitiveTypeShort_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.modisco.java.PrimitiveTypeShort jpt = (org.eclipse.modisco.java.PrimitiveTypeShort) result_pattern_PrimitiveTypeShort_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_PrimitiveTypeShort_24_2_matchsrctrgcontext_black = pattern_PrimitiveTypeShort_24_2_matchsrctrgcontext_blackBBBBBB(
					jm, umpt, up, jpt, sourceMatch, targetMatch);
			if (result_pattern_PrimitiveTypeShort_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { jm, umpt, up, jpt, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_24_3_solvecsp_bindingFBBBBBBB(PrimitiveTypeShort _this,
			Model jm, PrimitiveType umpt, org.eclipse.uml2.uml.Package up,
			org.eclipse.modisco.java.PrimitiveTypeShort jpt, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(jm, umpt, up, jpt, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, jm, umpt, up, jpt, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeShort_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			PrimitiveTypeShort _this, Model jm, PrimitiveType umpt, org.eclipse.uml2.uml.Package up,
			org.eclipse.modisco.java.PrimitiveTypeShort jpt, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_PrimitiveTypeShort_24_3_solvecsp_binding = pattern_PrimitiveTypeShort_24_3_solvecsp_bindingFBBBBBBB(
				_this, jm, umpt, up, jpt, sourceMatch, targetMatch);
		if (result_pattern_PrimitiveTypeShort_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeShort_24_3_solvecsp_binding[0];

			Object[] result_pattern_PrimitiveTypeShort_24_3_solvecsp_black = pattern_PrimitiveTypeShort_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_PrimitiveTypeShort_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, jm, umpt, up, jpt, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeShort_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeShort_24_5_matchcorrcontext_blackFBBBB(Model jm,
			org.eclipse.uml2.uml.Package up, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			String up_name = up.getName();
			if (up_name.equals("Common Java datatypes")) {
				for (JavaModel2UMLPackage jm2up : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(up,
						JavaModel2UMLPackage.class, "target")) {
					if (jm.equals(jm2up.getSource())) {
						_result.add(new Object[] { jm2up, jm, up, sourceMatch, targetMatch });
					}
				}
			}

		}
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_24_5_matchcorrcontext_greenBBBF(JavaModel2UMLPackage jm2up,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "PrimitiveTypeShort";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(jm2up);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { jm2up, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_PrimitiveTypeShort_24_6_createcorrespondence_blackBBBBB(Model jm,
			PrimitiveType umpt, org.eclipse.uml2.uml.Package up, org.eclipse.modisco.java.PrimitiveTypeShort jpt,
			CCMatch ccMatch) {
		return new Object[] { jm, umpt, up, jpt, ccMatch };
	}

	public static final Object[] pattern_PrimitiveTypeShort_24_6_createcorrespondence_greenBFBB(PrimitiveType umpt,
			org.eclipse.modisco.java.PrimitiveTypeShort jpt, CCMatch ccMatch) {
		NamedElement2NamedElement jpt2upt2 = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		jpt2upt2.setSource(jpt);
		jpt2upt2.setTarget(umpt);
		ccMatch.getCreateCorr().add(jpt2upt2);
		return new Object[] { umpt, jpt2upt2, jpt, ccMatch };
	}

	public static final Object[] pattern_PrimitiveTypeShort_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_PrimitiveTypeShort_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "PrimitiveTypeShort";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_PrimitiveTypeShort_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_27_1_matchtggpattern_blackBB(Model jm,
			org.eclipse.modisco.java.PrimitiveTypeShort jpt) {
		if (jm.getOrphanTypes().contains(jpt)) {
			return new Object[] { jm, jpt };
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeShort_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeShort_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_28_1_matchtggpattern_black_nac_0B(PrimitiveType umpt) {
		for (org.eclipse.uml2.uml.Class __DEC_umpt_nestedClassifier_248301 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(umpt, org.eclipse.uml2.uml.Class.class, "nestedClassifier")) {
			return new Object[] { umpt };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_28_1_matchtggpattern_black_nac_1B(PrimitiveType umpt) {
		for (Interface __DEC_umpt_nestedClassifier_9541 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(umpt, Interface.class, "nestedClassifier")) {
			return new Object[] { umpt };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_28_1_matchtggpattern_blackBB(PrimitiveType umpt,
			org.eclipse.uml2.uml.Package up) {
		if (up.getPackagedElements().contains(umpt)) {
			String up_name = up.getName();
			if (up_name.equals("Common Java datatypes")) {
				if (pattern_PrimitiveTypeShort_28_1_matchtggpattern_black_nac_0B(umpt) == null) {
					if (pattern_PrimitiveTypeShort_28_1_matchtggpattern_black_nac_1B(umpt) == null) {
						return new Object[] { umpt, up };
					}
				}
			}

		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeShort_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeShort_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_29_1_createresult_blackB(PrimitiveTypeShort _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PrimitiveTypeShort_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_PrimitiveTypeShort_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, JavaModel2UMLPackage jm2up) {
		if (ruleResult.getCorrObjects().contains(jm2up)) {
			return new Object[] { ruleResult, jm2up };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Package up) {
		if (ruleResult.getTargetObjects().contains(up)) {
			return new Object[] { ruleResult, up };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Model jm) {
		if (ruleResult.getSourceObjects().contains(jm)) {
			return new Object[] { ruleResult, jm };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeShort_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList jm2upList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpJm2up : jm2upList.getEntryObjects()) {
				if (tmpJm2up instanceof JavaModel2UMLPackage) {
					JavaModel2UMLPackage jm2up = (JavaModel2UMLPackage) tmpJm2up;
					org.eclipse.uml2.uml.Package up = jm2up.getTarget();
					if (up != null) {
						Model jm = jm2up.getSource();
						if (jm != null) {
							String up_name = up.getName();
							if (up_name.equals("Common Java datatypes")) {
								if (pattern_PrimitiveTypeShort_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										jm2up) == null) {
									if (pattern_PrimitiveTypeShort_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											up) == null) {
										if (pattern_PrimitiveTypeShort_29_2_isapplicablecore_black_nac_2BB(ruleResult,
												jm) == null) {
											_result.add(new Object[] { jm2upList, jm2up, up, jm, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_29_3_solveCSP_bindingFBBBBBB(PrimitiveTypeShort _this,
			IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jm2up, Model jm, org.eclipse.uml2.uml.Package up,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, jm2up, jm, up, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jm2up, jm, up, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeShort_29_3_solveCSP_bindingAndBlackFBBBBBB(
			PrimitiveTypeShort _this, IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jm2up, Model jm,
			org.eclipse.uml2.uml.Package up, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_PrimitiveTypeShort_29_3_solveCSP_binding = pattern_PrimitiveTypeShort_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jm2up, jm, up, ruleResult);
		if (result_pattern_PrimitiveTypeShort_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeShort_29_3_solveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeShort_29_3_solveCSP_black = pattern_PrimitiveTypeShort_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeShort_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jm2up, jm, up, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeShort_29_4_checkCSP_expressionFBB(PrimitiveTypeShort _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeShort_29_5_checknacs_blackBBB(JavaModel2UMLPackage jm2up,
			Model jm, org.eclipse.uml2.uml.Package up) {
		String up_name = up.getName();
		if (up_name.equals("Common Java datatypes")) {
			return new Object[] { jm2up, jm, up };
		}

		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_29_6_perform_blackBBBB(JavaModel2UMLPackage jm2up, Model jm,
			org.eclipse.uml2.uml.Package up, ModelgeneratorRuleResult ruleResult) {
		String up_name = up.getName();
		if (up_name.equals("Common Java datatypes")) {
			return new Object[] { jm2up, jm, up, ruleResult };
		}

		return null;
	}

	public static final Object[] pattern_PrimitiveTypeShort_29_6_perform_greenBFBFFBB(Model jm,
			org.eclipse.uml2.uml.Package up, ModelgeneratorRuleResult ruleResult, CSP csp) {
		PrimitiveType umpt = UMLFactory.eINSTANCE.createPrimitiveType();
		NamedElement2NamedElement jpt2upt2 = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		org.eclipse.modisco.java.PrimitiveTypeShort jpt = JavaFactory.eINSTANCE.createPrimitiveTypeShort();
		Object _localVariable_0 = csp.getValue("umpt", "name");
		Object _localVariable_1 = csp.getValue("jpt", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		up.getPackagedElements().add(umpt);
		ruleResult.getTargetObjects().add(umpt);
		jpt2upt2.setTarget(umpt);
		ruleResult.getCorrObjects().add(jpt2upt2);
		jm.getOrphanTypes().add(jpt);
		jpt2upt2.setSource(jpt);
		ruleResult.getSourceObjects().add(jpt);
		String umpt_name_prime = (String) _localVariable_0;
		String jpt_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		umpt.setName(umpt_name_prime);
		jpt.setName(jpt_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { jm, umpt, up, jpt2upt2, jpt, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_PrimitiveTypeShort_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PrimitiveTypeShortImpl
