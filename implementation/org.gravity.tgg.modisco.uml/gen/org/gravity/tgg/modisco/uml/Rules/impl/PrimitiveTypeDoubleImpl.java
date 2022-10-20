/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.PrimitiveTypeDouble;
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
 * An implementation of the model object '<em><b>Primitive Type Double</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PrimitiveTypeDoubleImpl extends AbstractRuleImpl implements PrimitiveTypeDouble {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeDoubleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPrimitiveTypeDouble();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {

		Object[] result1_black = PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_0_1_initialbindings_blackBBB(this,
				match, jpt);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jpt] = " + jpt + ".");
		}

		Object[] result2_bindingAndBlack = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_0_2_SolveCSP_bindingAndBlackFBBB(this, match, jpt);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jpt] = " + jpt + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = PrimitiveTypeDoubleImpl
					.pattern_PrimitiveTypeDouble_0_4_collectelementstobetranslated_blackBB(match, jpt);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jpt] = " + jpt + ".");
			}
			PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_0_4_collectelementstobetranslated_greenBB(match, jpt);

			Object[] result5_black = PrimitiveTypeDoubleImpl
					.pattern_PrimitiveTypeDouble_0_5_collectcontextelements_blackBB(match, jpt);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jpt] = " + jpt + ".");
			}
			// 
			PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_0_6_registerobjectstomatch_expressionBBB(this, match,
					jpt);
			return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_0_7_expressionF();
		} else {
			return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_1_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.modisco.java.PrimitiveTypeDouble jpt = (org.eclipse.modisco.java.PrimitiveTypeDouble) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_1_1_performtransformation_greenFFBB(jpt, csp);
		ASTNode2Element a2a = (ASTNode2Element) result1_green[0];
		PrimitiveType umpt = (PrimitiveType) result1_green[1];

		Object[] result2_black = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_1_2_collecttranslatedelements_blackBBB(a2a, umpt, jpt);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2a] = " + a2a + ", "
					+ "[umpt] = " + umpt + ", " + "[jpt] = " + jpt + ".");
		}
		Object[] result2_green = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_1_2_collecttranslatedelements_greenFBBB(a2a, umpt, jpt);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_1_3_bookkeepingforedges_blackBBBB(ruleresult, a2a, umpt, jpt);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2a] = " + a2a + ", " + "[umpt] = " + umpt + ", " + "[jpt] = " + jpt + ".");
		}
		PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_1_3_bookkeepingforedges_greenBBBBFF(ruleresult, a2a, umpt,
				jpt);
		//nothing EMoflonEdge a2a__jpt____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge a2a__umpt____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_1_5_registerobjects_expressionBBBBB(this, ruleresult, a2a,
				umpt, jpt);
		return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.PrimitiveTypeDouble jpt = (org.eclipse.modisco.java.PrimitiveTypeDouble) result2_binding[0];
		for (Object[] result2_black : PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_2_2_corematch_blackBB(jpt,
				match)) {
			// ForEach 
			for (Object[] result3_black : PrimitiveTypeDoubleImpl
					.pattern_PrimitiveTypeDouble_2_3_findcontext_blackB(jpt)) {
				Object[] result3_green = PrimitiveTypeDoubleImpl
						.pattern_PrimitiveTypeDouble_2_3_findcontext_greenBF(jpt);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = PrimitiveTypeDoubleImpl
						.pattern_PrimitiveTypeDouble_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, jpt);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jpt] = " + jpt + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = PrimitiveTypeDoubleImpl
							.pattern_PrimitiveTypeDouble_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		match.registerObject("jpt", jpt);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {// Create CSP
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
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {// Create CSP
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a2a, EObject umpt, EObject jpt) {
		ruleresult.registerObject("a2a", a2a);
		ruleresult.registerObject("umpt", umpt);
		ruleresult.registerObject("jpt", jpt);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("jpt").eClass())
				.equals("java.PrimitiveTypeDouble.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, PrimitiveType umpt) {

		Object[] result1_black = PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_10_1_initialbindings_blackBBB(this,
				match, umpt);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[umpt] = " + umpt + ".");
		}

		Object[] result2_bindingAndBlack = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_10_2_SolveCSP_bindingAndBlackFBBB(this, match, umpt);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[umpt] = " + umpt + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = PrimitiveTypeDoubleImpl
					.pattern_PrimitiveTypeDouble_10_4_collectelementstobetranslated_blackBB(match, umpt);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umpt] = " + umpt + ".");
			}
			PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_10_4_collectelementstobetranslated_greenBB(match, umpt);

			Object[] result5_black = PrimitiveTypeDoubleImpl
					.pattern_PrimitiveTypeDouble_10_5_collectcontextelements_blackBB(match, umpt);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umpt] = " + umpt + ".");
			}
			// 
			PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_10_6_registerobjectstomatch_expressionBBB(this, match,
					umpt);
			return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_10_7_expressionF();
		} else {
			return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_11_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PrimitiveType umpt = (PrimitiveType) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_11_1_performtransformation_greenFBFB(umpt, csp);
		ASTNode2Element a2a = (ASTNode2Element) result1_green[0];
		org.eclipse.modisco.java.PrimitiveTypeDouble jpt = (org.eclipse.modisco.java.PrimitiveTypeDouble) result1_green[2];

		Object[] result2_black = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_11_2_collecttranslatedelements_blackBBB(a2a, umpt, jpt);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2a] = " + a2a + ", "
					+ "[umpt] = " + umpt + ", " + "[jpt] = " + jpt + ".");
		}
		Object[] result2_green = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_11_2_collecttranslatedelements_greenFBBB(a2a, umpt, jpt);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_11_3_bookkeepingforedges_blackBBBB(ruleresult, a2a, umpt, jpt);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2a] = " + a2a + ", " + "[umpt] = " + umpt + ", " + "[jpt] = " + jpt + ".");
		}
		PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_11_3_bookkeepingforedges_greenBBBBFF(ruleresult, a2a, umpt,
				jpt);
		//nothing EMoflonEdge a2a__jpt____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge a2a__umpt____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_11_5_registerobjects_expressionBBBBB(this, ruleresult, a2a,
				umpt, jpt);
		return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		PrimitiveType umpt = (PrimitiveType) result2_binding[0];
		for (Object[] result2_black : PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_12_2_corematch_blackBB(umpt,
				match)) {
			// ForEach 
			for (Object[] result3_black : PrimitiveTypeDoubleImpl
					.pattern_PrimitiveTypeDouble_12_3_findcontext_blackB(umpt)) {
				Object[] result3_green = PrimitiveTypeDoubleImpl
						.pattern_PrimitiveTypeDouble_12_3_findcontext_greenBF(umpt);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = PrimitiveTypeDoubleImpl
						.pattern_PrimitiveTypeDouble_12_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, umpt);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[umpt] = " + umpt + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = PrimitiveTypeDoubleImpl
							.pattern_PrimitiveTypeDouble_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, PrimitiveType umpt) {
		match.registerObject("umpt", umpt);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, PrimitiveType umpt) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, PrimitiveType umpt) {// Create CSP
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
		isApplicableMatch.registerObject("umpt", umpt);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a2a, EObject umpt, EObject jpt) {
		ruleresult.registerObject("a2a", a2a);
		ruleresult.registerObject("umpt", umpt);
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
	public EObjectContainer isAppropriate_BWD_PrimitiveType_8(PrimitiveType umpt) {

		Object[] result1_bindingAndBlack = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_20_2_testcorematchandDECs_blackB(umpt)) {
			Object[] result2_green = PrimitiveTypeDoubleImpl
					.pattern_PrimitiveTypeDouble_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (PrimitiveTypeDoubleImpl
					.pattern_PrimitiveTypeDouble_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, umpt)) {
				// 
				if (PrimitiveTypeDoubleImpl
						.pattern_PrimitiveTypeDouble_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = PrimitiveTypeDoubleImpl
							.pattern_PrimitiveTypeDouble_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_PrimitiveTypeDouble_0(org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {

		Object[] result1_bindingAndBlack = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_21_2_testcorematchandDECs_blackB(jpt)) {
			Object[] result2_green = PrimitiveTypeDoubleImpl
					.pattern_PrimitiveTypeDouble_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (PrimitiveTypeDoubleImpl
					.pattern_PrimitiveTypeDouble_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, jpt)) {
				// 
				if (PrimitiveTypeDoubleImpl
						.pattern_PrimitiveTypeDouble_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = PrimitiveTypeDoubleImpl
							.pattern_PrimitiveTypeDouble_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PrimitiveTypeDouble");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_jpt_name = CSPFactoryHelper.eINSTANCE.createVariable("jpt", true, csp);
		var_jpt_name.setValue(__helper.getValue("jpt", "name"));
		var_jpt_name.setType("String");

		Variable var_umpt_name = CSPFactoryHelper.eINSTANCE.createVariable("umpt", true, csp);
		var_umpt_name.setValue(__helper.getValue("umpt", "name"));
		var_umpt_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("PrimitiveTypeDouble");
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
		ruleResult.setRule("PrimitiveTypeDouble");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_jpt_name = CSPFactoryHelper.eINSTANCE.createVariable("jpt", true, csp);
		var_jpt_name.setValue(__helper.getValue("jpt", "name"));
		var_jpt_name.setType("String");

		Variable var_umpt_name = CSPFactoryHelper.eINSTANCE.createVariable("umpt", true, csp);
		var_umpt_name.setValue(__helper.getValue("umpt", "name"));
		var_umpt_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("PrimitiveTypeDouble");
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

		Object[] result1_black = PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_24_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		PrimitiveType umpt = (PrimitiveType) result2_bindingAndBlack[0];
		org.eclipse.modisco.java.PrimitiveTypeDouble jpt = (org.eclipse.modisco.java.PrimitiveTypeDouble) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = PrimitiveTypeDoubleImpl
				.pattern_PrimitiveTypeDouble_24_3_solvecsp_bindingAndBlackFBBBBB(this, umpt, jpt, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[umpt] = " + umpt + ", " + "[jpt] = " + jpt + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : PrimitiveTypeDoubleImpl
					.pattern_PrimitiveTypeDouble_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = PrimitiveTypeDoubleImpl
						.pattern_PrimitiveTypeDouble_24_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = PrimitiveTypeDoubleImpl
						.pattern_PrimitiveTypeDouble_24_6_createcorrespondence_blackBBB(umpt, jpt, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[umpt] = " + umpt + ", "
							+ "[jpt] = " + jpt + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_24_6_createcorrespondence_greenFBBB(umpt, jpt,
						ccMatch);
				//nothing ASTNode2Element a2a = (ASTNode2Element) result6_green[0];

				Object[] result7_black = PrimitiveTypeDoubleImpl
						.pattern_PrimitiveTypeDouble_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(PrimitiveType umpt, org.eclipse.modisco.java.PrimitiveTypeDouble jpt,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {// 
		Object[] result1_black = PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_27_1_matchtggpattern_blackB(jpt);
		if (result1_black != null) {
			return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_27_2_expressionF();
		} else {
			return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(PrimitiveType umpt) {// 
		Object[] result1_black = PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_28_1_matchtggpattern_blackB(umpt);
		if (result1_black != null) {
			return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_28_2_expressionF();
		} else {
			return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = PrimitiveTypeDoubleImpl
					.pattern_PrimitiveTypeDouble_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = PrimitiveTypeDoubleImpl
						.pattern_PrimitiveTypeDouble_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_29_6_perform_greenFFFBB(ruleResult, csp);
				//nothing ASTNode2Element a2a = (ASTNode2Element) result6_green[0];
				//nothing PrimitiveType umpt = (PrimitiveType) result6_green[1];
				//nothing org.eclipse.modisco.java.PrimitiveTypeDouble jpt = (org.eclipse.modisco.java.PrimitiveTypeDouble) result6_green[2];

			} else {
			}

		} else {
		}
		return PrimitiveTypeDoubleImpl.pattern_PrimitiveTypeDouble_29_7_expressionFB(ruleResult);
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
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPROPRIATE_FWD__MATCH_PRIMITIVETYPEDOUBLE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.PrimitiveTypeDouble) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PRIMITIVETYPEDOUBLE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.PrimitiveTypeDouble) arguments.get(1));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PRIMITIVETYPEDOUBLE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.PrimitiveTypeDouble) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PRIMITIVETYPEDOUBLE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.PrimitiveTypeDouble) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPROPRIATE_BWD__MATCH_PRIMITIVETYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (PrimitiveType) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PRIMITIVETYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (PrimitiveType) arguments.get(1));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PRIMITIVETYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (PrimitiveType) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PRIMITIVETYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (PrimitiveType) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPROPRIATE_BWD_PRIMITIVE_TYPE_8__PRIMITIVETYPE:
			return isAppropriate_BWD_PrimitiveType_8((PrimitiveType) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPROPRIATE_FWD_PRIMITIVE_TYPE_DOUBLE_0__PRIMITIVETYPEDOUBLE:
			return isAppropriate_FWD_PrimitiveTypeDouble_0(
					(org.eclipse.modisco.java.PrimitiveTypeDouble) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPLICABLE_SOLVE_CSP_CC__PRIMITIVETYPE_PRIMITIVETYPEDOUBLE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((PrimitiveType) arguments.get(0),
					(org.eclipse.modisco.java.PrimitiveTypeDouble) arguments.get(1), (Match) arguments.get(2),
					(Match) arguments.get(3));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___CHECK_DEC_FWD__PRIMITIVETYPEDOUBLE:
			return checkDEC_FWD((org.eclipse.modisco.java.PrimitiveTypeDouble) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___CHECK_DEC_BWD__PRIMITIVETYPE:
			return checkDEC_BWD((PrimitiveType) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_DOUBLE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PrimitiveTypeDouble_0_1_initialbindings_blackBBB(PrimitiveTypeDouble _this,
			Match match, org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		return new Object[] { _this, match, jpt };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_0_2_SolveCSP_bindingFBBB(PrimitiveTypeDouble _this,
			Match match, org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jpt);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jpt };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_0_2_SolveCSP_bindingAndBlackFBBB(PrimitiveTypeDouble _this,
			Match match, org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		Object[] result_pattern_PrimitiveTypeDouble_0_2_SolveCSP_binding = pattern_PrimitiveTypeDouble_0_2_SolveCSP_bindingFBBB(
				_this, match, jpt);
		if (result_pattern_PrimitiveTypeDouble_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeDouble_0_2_SolveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeDouble_0_2_SolveCSP_black = pattern_PrimitiveTypeDouble_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeDouble_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, jpt };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeDouble_0_3_CheckCSP_expressionFBB(PrimitiveTypeDouble _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_0_4_collectelementstobetranslated_blackBB(Match match,
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		return new Object[] { match, jpt };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_0_4_collectelementstobetranslated_greenBB(Match match,
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		match.getToBeTranslatedNodes().add(jpt);
		return new Object[] { match, jpt };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_0_5_collectcontextelements_blackBB(Match match,
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		return new Object[] { match, jpt };
	}

	public static final void pattern_PrimitiveTypeDouble_0_6_registerobjectstomatch_expressionBBB(
			PrimitiveTypeDouble _this, Match match, org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		_this.registerObjectsToMatch_FWD(match, jpt);

	}

	public static final boolean pattern_PrimitiveTypeDouble_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeDouble_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jpt");
		EObject tmpJpt = _localVariable_0;
		if (tmpJpt instanceof org.eclipse.modisco.java.PrimitiveTypeDouble) {
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt = (org.eclipse.modisco.java.PrimitiveTypeDouble) tmpJpt;
			return new Object[] { jpt, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_1_1_performtransformation_blackBFBB(
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt, PrimitiveTypeDouble _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jpt, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_1_1_performtransformation_bindingAndBlackFFBB(
			PrimitiveTypeDouble _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PrimitiveTypeDouble_1_1_performtransformation_binding = pattern_PrimitiveTypeDouble_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_PrimitiveTypeDouble_1_1_performtransformation_binding != null) {
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt = (org.eclipse.modisco.java.PrimitiveTypeDouble) result_pattern_PrimitiveTypeDouble_1_1_performtransformation_binding[0];

			Object[] result_pattern_PrimitiveTypeDouble_1_1_performtransformation_black = pattern_PrimitiveTypeDouble_1_1_performtransformation_blackBFBB(
					jpt, _this, isApplicableMatch);
			if (result_pattern_PrimitiveTypeDouble_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PrimitiveTypeDouble_1_1_performtransformation_black[1];

				return new Object[] { jpt, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_1_1_performtransformation_greenFFBB(
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt, CSP csp) {
		ASTNode2Element a2a = UmlFactory.eINSTANCE.createASTNode2Element();
		PrimitiveType umpt = UMLFactory.eINSTANCE.createPrimitiveType();
		Object _localVariable_0 = csp.getValue("umpt", "name");
		a2a.setSource(jpt);
		a2a.setTarget(umpt);
		String umpt_name_prime = (String) _localVariable_0;
		umpt.setName(umpt_name_prime);
		return new Object[] { a2a, umpt, jpt, csp };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_1_2_collecttranslatedelements_blackBBB(ASTNode2Element a2a,
			PrimitiveType umpt, org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		return new Object[] { a2a, umpt, jpt };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_1_2_collecttranslatedelements_greenFBBB(
			ASTNode2Element a2a, PrimitiveType umpt, org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2a);
		ruleresult.getCreatedElements().add(umpt);
		ruleresult.getTranslatedElements().add(jpt);
		return new Object[] { ruleresult, a2a, umpt, jpt };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_1_3_bookkeepingforedges_blackBBBB(
			PerformRuleResult ruleresult, EObject a2a, EObject umpt, EObject jpt) {
		if (!a2a.equals(umpt)) {
			if (!a2a.equals(jpt)) {
				if (!jpt.equals(umpt)) {
					return new Object[] { ruleresult, a2a, umpt, jpt };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_1_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject a2a, EObject umpt, EObject jpt) {
		EMoflonEdge a2a__jpt____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2a__umpt____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PrimitiveTypeDouble";
		String a2a__jpt____source_name_prime = "source";
		String a2a__umpt____target_name_prime = "target";
		a2a__jpt____source.setSrc(a2a);
		a2a__jpt____source.setTrg(jpt);
		ruleresult.getCreatedEdges().add(a2a__jpt____source);
		a2a__umpt____target.setSrc(a2a);
		a2a__umpt____target.setTrg(umpt);
		ruleresult.getCreatedEdges().add(a2a__umpt____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2a__jpt____source.setName(a2a__jpt____source_name_prime);
		a2a__umpt____target.setName(a2a__umpt____target_name_prime);
		return new Object[] { ruleresult, a2a, umpt, jpt, a2a__jpt____source, a2a__umpt____target };
	}

	public static final void pattern_PrimitiveTypeDouble_1_5_registerobjects_expressionBBBBB(PrimitiveTypeDouble _this,
			PerformRuleResult ruleresult, EObject a2a, EObject umpt, EObject jpt) {
		_this.registerObjects_FWD(ruleresult, a2a, umpt, jpt);

	}

	public static final PerformRuleResult pattern_PrimitiveTypeDouble_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_2_1_preparereturnvalue_bindingFB(
			PrimitiveTypeDouble _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_2_1_preparereturnvalue_blackFBB(EClass eClass,
			PrimitiveTypeDouble _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_2_1_preparereturnvalue_bindingAndBlackFFB(
			PrimitiveTypeDouble _this) {
		Object[] result_pattern_PrimitiveTypeDouble_2_1_preparereturnvalue_binding = pattern_PrimitiveTypeDouble_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeDouble_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PrimitiveTypeDouble_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeDouble_2_1_preparereturnvalue_black = pattern_PrimitiveTypeDouble_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PrimitiveTypeDouble_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PrimitiveTypeDouble_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "PrimitiveTypeDouble";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("jpt");
		EObject tmpJpt = _localVariable_0;
		if (tmpJpt instanceof org.eclipse.modisco.java.PrimitiveTypeDouble) {
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt = (org.eclipse.modisco.java.PrimitiveTypeDouble) tmpJpt;
			return new Object[] { jpt, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeDouble_2_2_corematch_blackBB(
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { jpt, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeDouble_2_3_findcontext_blackB(
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { jpt });
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_2_3_findcontext_greenBF(
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(jpt);
		return new Object[] { jpt, isApplicableMatch };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_2_4_solveCSP_bindingFBBB(PrimitiveTypeDouble _this,
			IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, jpt);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jpt };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_2_4_solveCSP_bindingAndBlackFBBB(PrimitiveTypeDouble _this,
			IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		Object[] result_pattern_PrimitiveTypeDouble_2_4_solveCSP_binding = pattern_PrimitiveTypeDouble_2_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, jpt);
		if (result_pattern_PrimitiveTypeDouble_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeDouble_2_4_solveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeDouble_2_4_solveCSP_black = pattern_PrimitiveTypeDouble_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeDouble_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jpt };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeDouble_2_5_checkCSP_expressionFBB(PrimitiveTypeDouble _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PrimitiveTypeDouble";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PrimitiveTypeDouble_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_10_1_initialbindings_blackBBB(PrimitiveTypeDouble _this,
			Match match, PrimitiveType umpt) {
		return new Object[] { _this, match, umpt };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_10_2_SolveCSP_bindingFBBB(PrimitiveTypeDouble _this,
			Match match, PrimitiveType umpt) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, umpt);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, umpt };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_10_2_SolveCSP_bindingAndBlackFBBB(
			PrimitiveTypeDouble _this, Match match, PrimitiveType umpt) {
		Object[] result_pattern_PrimitiveTypeDouble_10_2_SolveCSP_binding = pattern_PrimitiveTypeDouble_10_2_SolveCSP_bindingFBBB(
				_this, match, umpt);
		if (result_pattern_PrimitiveTypeDouble_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeDouble_10_2_SolveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeDouble_10_2_SolveCSP_black = pattern_PrimitiveTypeDouble_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeDouble_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, umpt };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeDouble_10_3_CheckCSP_expressionFBB(PrimitiveTypeDouble _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_10_4_collectelementstobetranslated_blackBB(Match match,
			PrimitiveType umpt) {
		return new Object[] { match, umpt };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_10_4_collectelementstobetranslated_greenBB(Match match,
			PrimitiveType umpt) {
		match.getToBeTranslatedNodes().add(umpt);
		return new Object[] { match, umpt };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_10_5_collectcontextelements_blackBB(Match match,
			PrimitiveType umpt) {
		return new Object[] { match, umpt };
	}

	public static final void pattern_PrimitiveTypeDouble_10_6_registerobjectstomatch_expressionBBB(
			PrimitiveTypeDouble _this, Match match, PrimitiveType umpt) {
		_this.registerObjectsToMatch_BWD(match, umpt);

	}

	public static final boolean pattern_PrimitiveTypeDouble_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeDouble_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("umpt");
		EObject tmpUmpt = _localVariable_0;
		if (tmpUmpt instanceof PrimitiveType) {
			PrimitiveType umpt = (PrimitiveType) tmpUmpt;
			return new Object[] { umpt, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_11_1_performtransformation_blackBFBB(PrimitiveType umpt,
			PrimitiveTypeDouble _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { umpt, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_11_1_performtransformation_bindingAndBlackFFBB(
			PrimitiveTypeDouble _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PrimitiveTypeDouble_11_1_performtransformation_binding = pattern_PrimitiveTypeDouble_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_PrimitiveTypeDouble_11_1_performtransformation_binding != null) {
			PrimitiveType umpt = (PrimitiveType) result_pattern_PrimitiveTypeDouble_11_1_performtransformation_binding[0];

			Object[] result_pattern_PrimitiveTypeDouble_11_1_performtransformation_black = pattern_PrimitiveTypeDouble_11_1_performtransformation_blackBFBB(
					umpt, _this, isApplicableMatch);
			if (result_pattern_PrimitiveTypeDouble_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PrimitiveTypeDouble_11_1_performtransformation_black[1];

				return new Object[] { umpt, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_11_1_performtransformation_greenFBFB(PrimitiveType umpt,
			CSP csp) {
		ASTNode2Element a2a = UmlFactory.eINSTANCE.createASTNode2Element();
		org.eclipse.modisco.java.PrimitiveTypeDouble jpt = JavaFactory.eINSTANCE.createPrimitiveTypeDouble();
		Object _localVariable_0 = csp.getValue("jpt", "name");
		a2a.setTarget(umpt);
		a2a.setSource(jpt);
		String jpt_name_prime = (String) _localVariable_0;
		jpt.setName(jpt_name_prime);
		return new Object[] { a2a, umpt, jpt, csp };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_11_2_collecttranslatedelements_blackBBB(
			ASTNode2Element a2a, PrimitiveType umpt, org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		return new Object[] { a2a, umpt, jpt };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_11_2_collecttranslatedelements_greenFBBB(
			ASTNode2Element a2a, PrimitiveType umpt, org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2a);
		ruleresult.getTranslatedElements().add(umpt);
		ruleresult.getCreatedElements().add(jpt);
		return new Object[] { ruleresult, a2a, umpt, jpt };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_11_3_bookkeepingforedges_blackBBBB(
			PerformRuleResult ruleresult, EObject a2a, EObject umpt, EObject jpt) {
		if (!a2a.equals(umpt)) {
			if (!a2a.equals(jpt)) {
				if (!jpt.equals(umpt)) {
					return new Object[] { ruleresult, a2a, umpt, jpt };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_11_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject a2a, EObject umpt, EObject jpt) {
		EMoflonEdge a2a__jpt____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2a__umpt____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PrimitiveTypeDouble";
		String a2a__jpt____source_name_prime = "source";
		String a2a__umpt____target_name_prime = "target";
		a2a__jpt____source.setSrc(a2a);
		a2a__jpt____source.setTrg(jpt);
		ruleresult.getCreatedEdges().add(a2a__jpt____source);
		a2a__umpt____target.setSrc(a2a);
		a2a__umpt____target.setTrg(umpt);
		ruleresult.getCreatedEdges().add(a2a__umpt____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2a__jpt____source.setName(a2a__jpt____source_name_prime);
		a2a__umpt____target.setName(a2a__umpt____target_name_prime);
		return new Object[] { ruleresult, a2a, umpt, jpt, a2a__jpt____source, a2a__umpt____target };
	}

	public static final void pattern_PrimitiveTypeDouble_11_5_registerobjects_expressionBBBBB(PrimitiveTypeDouble _this,
			PerformRuleResult ruleresult, EObject a2a, EObject umpt, EObject jpt) {
		_this.registerObjects_BWD(ruleresult, a2a, umpt, jpt);

	}

	public static final PerformRuleResult pattern_PrimitiveTypeDouble_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_12_1_preparereturnvalue_bindingFB(
			PrimitiveTypeDouble _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_12_1_preparereturnvalue_blackFBB(EClass eClass,
			PrimitiveTypeDouble _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_12_1_preparereturnvalue_bindingAndBlackFFB(
			PrimitiveTypeDouble _this) {
		Object[] result_pattern_PrimitiveTypeDouble_12_1_preparereturnvalue_binding = pattern_PrimitiveTypeDouble_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeDouble_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PrimitiveTypeDouble_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeDouble_12_1_preparereturnvalue_black = pattern_PrimitiveTypeDouble_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PrimitiveTypeDouble_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PrimitiveTypeDouble_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "PrimitiveTypeDouble";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("umpt");
		EObject tmpUmpt = _localVariable_0;
		if (tmpUmpt instanceof PrimitiveType) {
			PrimitiveType umpt = (PrimitiveType) tmpUmpt;
			return new Object[] { umpt, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeDouble_12_2_corematch_blackBB(PrimitiveType umpt,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { umpt, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeDouble_12_3_findcontext_blackB(PrimitiveType umpt) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { umpt });
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_12_3_findcontext_greenBF(PrimitiveType umpt) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(umpt);
		return new Object[] { umpt, isApplicableMatch };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_12_4_solveCSP_bindingFBBB(PrimitiveTypeDouble _this,
			IsApplicableMatch isApplicableMatch, PrimitiveType umpt) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, umpt);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, umpt };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_12_4_solveCSP_bindingAndBlackFBBB(
			PrimitiveTypeDouble _this, IsApplicableMatch isApplicableMatch, PrimitiveType umpt) {
		Object[] result_pattern_PrimitiveTypeDouble_12_4_solveCSP_binding = pattern_PrimitiveTypeDouble_12_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, umpt);
		if (result_pattern_PrimitiveTypeDouble_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeDouble_12_4_solveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeDouble_12_4_solveCSP_black = pattern_PrimitiveTypeDouble_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeDouble_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, umpt };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeDouble_12_5_checkCSP_expressionFBB(PrimitiveTypeDouble _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PrimitiveTypeDouble";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PrimitiveTypeDouble_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_20_1_preparereturnvalue_bindingFB(
			PrimitiveTypeDouble _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PrimitiveTypeDouble _this) {
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

	public static final Object[] pattern_PrimitiveTypeDouble_20_1_preparereturnvalue_bindingAndBlackFFBF(
			PrimitiveTypeDouble _this) {
		Object[] result_pattern_PrimitiveTypeDouble_20_1_preparereturnvalue_binding = pattern_PrimitiveTypeDouble_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeDouble_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PrimitiveTypeDouble_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeDouble_20_1_preparereturnvalue_black = pattern_PrimitiveTypeDouble_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PrimitiveTypeDouble_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PrimitiveTypeDouble_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PrimitiveTypeDouble_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeDouble_20_2_testcorematchandDECs_blackB(
			PrimitiveType umpt) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { umpt });
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PrimitiveTypeDouble_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			PrimitiveTypeDouble _this, Match match, PrimitiveType umpt) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, umpt);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeDouble_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PrimitiveTypeDouble _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PrimitiveTypeDouble_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_21_1_preparereturnvalue_bindingFB(
			PrimitiveTypeDouble _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PrimitiveTypeDouble _this) {
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

	public static final Object[] pattern_PrimitiveTypeDouble_21_1_preparereturnvalue_bindingAndBlackFFBF(
			PrimitiveTypeDouble _this) {
		Object[] result_pattern_PrimitiveTypeDouble_21_1_preparereturnvalue_binding = pattern_PrimitiveTypeDouble_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeDouble_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PrimitiveTypeDouble_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeDouble_21_1_preparereturnvalue_black = pattern_PrimitiveTypeDouble_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PrimitiveTypeDouble_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PrimitiveTypeDouble_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PrimitiveTypeDouble_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeDouble_21_2_testcorematchandDECs_blackB(
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { jpt });
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PrimitiveTypeDouble_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			PrimitiveTypeDouble _this, Match match, org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jpt);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeDouble_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PrimitiveTypeDouble _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PrimitiveTypeDouble_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_24_1_prepare_blackB(PrimitiveTypeDouble _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_24_2_matchsrctrgcontext_bindingFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("umpt");
		EObject _localVariable_1 = sourceMatch.getObject("jpt");
		EObject tmpUmpt = _localVariable_0;
		EObject tmpJpt = _localVariable_1;
		if (tmpUmpt instanceof PrimitiveType) {
			PrimitiveType umpt = (PrimitiveType) tmpUmpt;
			if (tmpJpt instanceof org.eclipse.modisco.java.PrimitiveTypeDouble) {
				org.eclipse.modisco.java.PrimitiveTypeDouble jpt = (org.eclipse.modisco.java.PrimitiveTypeDouble) tmpJpt;
				return new Object[] { umpt, jpt, targetMatch, sourceMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_24_2_matchsrctrgcontext_blackBBBB(PrimitiveType umpt,
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { umpt, jpt, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_24_2_matchsrctrgcontext_bindingAndBlackFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_PrimitiveTypeDouble_24_2_matchsrctrgcontext_binding = pattern_PrimitiveTypeDouble_24_2_matchsrctrgcontext_bindingFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_PrimitiveTypeDouble_24_2_matchsrctrgcontext_binding != null) {
			PrimitiveType umpt = (PrimitiveType) result_pattern_PrimitiveTypeDouble_24_2_matchsrctrgcontext_binding[0];
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt = (org.eclipse.modisco.java.PrimitiveTypeDouble) result_pattern_PrimitiveTypeDouble_24_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_PrimitiveTypeDouble_24_2_matchsrctrgcontext_black = pattern_PrimitiveTypeDouble_24_2_matchsrctrgcontext_blackBBBB(
					umpt, jpt, sourceMatch, targetMatch);
			if (result_pattern_PrimitiveTypeDouble_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { umpt, jpt, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_24_3_solvecsp_bindingFBBBBB(PrimitiveTypeDouble _this,
			PrimitiveType umpt, org.eclipse.modisco.java.PrimitiveTypeDouble jpt, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(umpt, jpt, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, umpt, jpt, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_24_3_solvecsp_bindingAndBlackFBBBBB(
			PrimitiveTypeDouble _this, PrimitiveType umpt, org.eclipse.modisco.java.PrimitiveTypeDouble jpt,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_PrimitiveTypeDouble_24_3_solvecsp_binding = pattern_PrimitiveTypeDouble_24_3_solvecsp_bindingFBBBBB(
				_this, umpt, jpt, sourceMatch, targetMatch);
		if (result_pattern_PrimitiveTypeDouble_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeDouble_24_3_solvecsp_binding[0];

			Object[] result_pattern_PrimitiveTypeDouble_24_3_solvecsp_black = pattern_PrimitiveTypeDouble_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_PrimitiveTypeDouble_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, umpt, jpt, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeDouble_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeDouble_24_5_matchcorrcontext_blackBB(Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "PrimitiveTypeDouble";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_24_6_createcorrespondence_blackBBB(PrimitiveType umpt,
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt, CCMatch ccMatch) {
		return new Object[] { umpt, jpt, ccMatch };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_24_6_createcorrespondence_greenFBBB(PrimitiveType umpt,
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt, CCMatch ccMatch) {
		ASTNode2Element a2a = UmlFactory.eINSTANCE.createASTNode2Element();
		a2a.setSource(jpt);
		a2a.setTarget(umpt);
		ccMatch.getCreateCorr().add(a2a);
		return new Object[] { a2a, umpt, jpt, ccMatch };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "PrimitiveTypeDouble";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_PrimitiveTypeDouble_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_27_1_matchtggpattern_blackB(
			org.eclipse.modisco.java.PrimitiveTypeDouble jpt) {
		return new Object[] { jpt };
	}

	public static final boolean pattern_PrimitiveTypeDouble_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeDouble_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_28_1_matchtggpattern_blackB(PrimitiveType umpt) {
		return new Object[] { umpt };
	}

	public static final boolean pattern_PrimitiveTypeDouble_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeDouble_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_29_1_createresult_blackB(PrimitiveTypeDouble _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_29_2_isapplicablecore_blackB(PrimitiveTypeDouble _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_29_3_solveCSP_bindingFBBB(PrimitiveTypeDouble _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_29_3_solveCSP_bindingAndBlackFBBB(
			PrimitiveTypeDouble _this, IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_PrimitiveTypeDouble_29_3_solveCSP_binding = pattern_PrimitiveTypeDouble_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_PrimitiveTypeDouble_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeDouble_29_3_solveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeDouble_29_3_solveCSP_black = pattern_PrimitiveTypeDouble_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeDouble_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeDouble_29_4_checkCSP_expressionFBB(PrimitiveTypeDouble _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeDouble_29_6_perform_blackB(ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_PrimitiveTypeDouble_29_6_perform_greenFFFBB(
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		ASTNode2Element a2a = UmlFactory.eINSTANCE.createASTNode2Element();
		PrimitiveType umpt = UMLFactory.eINSTANCE.createPrimitiveType();
		org.eclipse.modisco.java.PrimitiveTypeDouble jpt = JavaFactory.eINSTANCE.createPrimitiveTypeDouble();
		Object _localVariable_0 = csp.getValue("umpt", "name");
		Object _localVariable_1 = csp.getValue("jpt", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(a2a);
		a2a.setTarget(umpt);
		ruleResult.getTargetObjects().add(umpt);
		a2a.setSource(jpt);
		ruleResult.getSourceObjects().add(jpt);
		String umpt_name_prime = (String) _localVariable_0;
		String jpt_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		umpt.setName(umpt_name_prime);
		jpt.setName(jpt_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a2a, umpt, jpt, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_PrimitiveTypeDouble_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PrimitiveTypeDoubleImpl
