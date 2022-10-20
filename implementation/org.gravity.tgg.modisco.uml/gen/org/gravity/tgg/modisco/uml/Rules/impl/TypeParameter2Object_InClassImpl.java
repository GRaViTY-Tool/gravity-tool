/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.TypeParameter;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.RulesPackage;
import org.gravity.tgg.modisco.uml.Rules.TypeParameter2Object_InClass;

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
 * An implementation of the model object '<em><b>Type Parameter2 Object In Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeParameter2Object_InClassImpl extends AbstractRuleImpl implements TypeParameter2Object_InClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParameter2Object_InClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTypeParameter2Object_InClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassDeclaration mowner, TypeParameter mparam) {

		Object[] result1_black = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_0_1_initialbindings_blackBBBB(this, match, mowner, mparam);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mowner] = " + mowner + ", " + "[mparam] = " + mparam + ".");
		}

		Object[] result2_bindingAndBlack = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mowner, mparam);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mowner] = " + mowner + ", " + "[mparam] = " + mparam + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_0_4_collectelementstobetranslated_blackBBB(match, mowner,
							mparam);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mowner] = " + mowner + ", " + "[mparam] = " + mparam + ".");
			}
			TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_0_4_collectelementstobetranslated_greenBBBF(match, mowner,
							mparam);
			//nothing EMoflonEdge mowner__mparam____typeParameters = (EMoflonEdge) result4_green[3];

			Object[] result5_black = TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_0_5_collectcontextelements_blackBBB(match, mowner, mparam);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mowner] = " + mowner + ", " + "[mparam] = " + mparam + ".");
			}
			TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_0_5_collectcontextelements_greenBB(match, mowner);

			// 
			TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_0_6_registerobjectstomatch_expressionBBBB(this, match, mowner,
							mparam);
			return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_0_7_expressionF();
		} else {
			return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassDeclaration mowner = (ClassDeclaration) result1_bindingAndBlack[0];
		org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[1];
		TypeParameter mparam = (TypeParameter) result1_bindingAndBlack[2];
		ASTNode2Element interface2interface = (ASTNode2Element) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_1_1_performtransformation_greenBFFB(uowner, mparam);
		org.eclipse.uml2.uml.Class uparam = (org.eclipse.uml2.uml.Class) result1_green[1];
		ASTNode2Element param2param = (ASTNode2Element) result1_green[2];

		Object[] result2_black = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_1_2_collecttranslatedelements_blackBBB(uparam, param2param,
						mparam);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[uparam] = " + uparam + ", "
					+ "[param2param] = " + param2param + ", " + "[mparam] = " + mparam + ".");
		}
		Object[] result2_green = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_1_2_collecttranslatedelements_greenFBBB(uparam, param2param,
						mparam);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, mowner, uowner,
						uparam, param2param, mparam, interface2interface);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mowner] = " + mowner + ", " + "[uowner] = " + uowner + ", " + "[uparam] = " + uparam
					+ ", " + "[param2param] = " + param2param + ", " + "[mparam] = " + mparam + ", "
					+ "[interface2interface] = " + interface2interface + ".");
		}
		TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_1_3_bookkeepingforedges_greenBBBBBBFFFF(
				ruleresult, mowner, uowner, uparam, param2param, mparam);
		//nothing EMoflonEdge param2param__uparam____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mowner__mparam____typeParameters = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge uowner__uparam____nestedClassifier = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge param2param__mparam____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_1_5_registerobjects_expressionBBBBBBBB(
				this, ruleresult, mowner, uowner, uparam, param2param, mparam, interface2interface);
		return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassDeclaration mowner = (ClassDeclaration) result2_binding[0];
		TypeParameter mparam = (TypeParameter) result2_binding[1];
		for (Object[] result2_black : TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_2_2_corematch_blackBFBFB(mowner, mparam, match)) {
			org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) result2_black[1];
			ASTNode2Element interface2interface = (ASTNode2Element) result2_black[3];
			// ForEach 
			for (Object[] result3_black : TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_2_3_findcontext_blackBBBB(mowner, uowner, mparam,
							interface2interface)) {
				Object[] result3_green = TypeParameter2Object_InClassImpl
						.pattern_TypeParameter2Object_InClass_2_3_findcontext_greenBBBBFFFF(mowner, uowner, mparam,
								interface2interface);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge interface2interface__uowner____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mowner__mparam____typeParameters = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge interface2interface__mowner____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = TypeParameter2Object_InClassImpl
						.pattern_TypeParameter2Object_InClass_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, mowner, uowner, mparam, interface2interface);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mowner] = " + mowner + ", "
							+ "[uowner] = " + uowner + ", " + "[mparam] = " + mparam + ", " + "[interface2interface] = "
							+ interface2interface + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeParameter2Object_InClassImpl
						.pattern_TypeParameter2Object_InClass_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeParameter2Object_InClassImpl
							.pattern_TypeParameter2Object_InClass_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeParameter2Object_InClassImpl
							.pattern_TypeParameter2Object_InClass_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassDeclaration mowner, TypeParameter mparam) {
		match.registerObject("mowner", mowner);
		match.registerObject("mparam", mparam);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDeclaration mowner, TypeParameter mparam) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ClassDeclaration mowner,
			org.eclipse.uml2.uml.Class uowner, TypeParameter mparam, ASTNode2Element interface2interface) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mowner", mowner);
		isApplicableMatch.registerObject("uowner", uowner);
		isApplicableMatch.registerObject("mparam", mparam);
		isApplicableMatch.registerObject("interface2interface", interface2interface);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mowner, EObject uowner, EObject uparam,
			EObject param2param, EObject mparam, EObject interface2interface) {
		ruleresult.registerObject("mowner", mowner);
		ruleresult.registerObject("uowner", uowner);
		ruleresult.registerObject("uparam", uparam);
		ruleresult.registerObject("param2param", param2param);
		ruleresult.registerObject("mparam", mparam);
		ruleresult.registerObject("interface2interface", interface2interface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mparam").eClass())
				.equals("java.TypeParameter.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Class uowner,
			org.eclipse.uml2.uml.Class uparam) {

		Object[] result1_black = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_10_1_initialbindings_blackBBBB(this, match, uowner, uparam);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[uowner] = " + uowner + ", " + "[uparam] = " + uparam + ".");
		}

		Object[] result2_bindingAndBlack = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, uowner, uparam);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[uowner] = " + uowner + ", " + "[uparam] = " + uparam + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_10_4_collectelementstobetranslated_blackBBB(match, uowner,
							uparam);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[uowner] = " + uowner + ", " + "[uparam] = " + uparam + ".");
			}
			TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_10_4_collectelementstobetranslated_greenBBBF(match, uowner,
							uparam);
			//nothing EMoflonEdge uowner__uparam____nestedClassifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_10_5_collectcontextelements_blackBBB(match, uowner, uparam);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[uowner] = " + uowner + ", " + "[uparam] = " + uparam + ".");
			}
			TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_10_5_collectcontextelements_greenBB(match, uowner);

			// 
			TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_10_6_registerobjectstomatch_expressionBBBB(this, match,
							uowner, uparam);
			return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_10_7_expressionF();
		} else {
			return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassDeclaration mowner = (ClassDeclaration) result1_bindingAndBlack[0];
		org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[1];
		org.eclipse.uml2.uml.Class uparam = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[2];
		ASTNode2Element interface2interface = (ASTNode2Element) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_11_1_performtransformation_greenBBFF(mowner, uparam);
		ASTNode2Element param2param = (ASTNode2Element) result1_green[2];
		TypeParameter mparam = (TypeParameter) result1_green[3];

		Object[] result2_black = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_11_2_collecttranslatedelements_blackBBB(uparam, param2param,
						mparam);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[uparam] = " + uparam + ", "
					+ "[param2param] = " + param2param + ", " + "[mparam] = " + mparam + ".");
		}
		Object[] result2_green = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_11_2_collecttranslatedelements_greenFBBB(uparam, param2param,
						mparam);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, mowner, uowner,
						uparam, param2param, mparam, interface2interface);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mowner] = " + mowner + ", " + "[uowner] = " + uowner + ", " + "[uparam] = " + uparam
					+ ", " + "[param2param] = " + param2param + ", " + "[mparam] = " + mparam + ", "
					+ "[interface2interface] = " + interface2interface + ".");
		}
		TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_11_3_bookkeepingforedges_greenBBBBBBFFFF(
				ruleresult, mowner, uowner, uparam, param2param, mparam);
		//nothing EMoflonEdge param2param__uparam____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mowner__mparam____typeParameters = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge uowner__uparam____nestedClassifier = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge param2param__mparam____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_11_5_registerobjects_expressionBBBBBBBB(
				this, ruleresult, mowner, uowner, uparam, param2param, mparam, interface2interface);
		return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) result2_binding[0];
		org.eclipse.uml2.uml.Class uparam = (org.eclipse.uml2.uml.Class) result2_binding[1];
		for (Object[] result2_black : TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_12_2_corematch_blackFBBFB(uowner, uparam, match)) {
			ClassDeclaration mowner = (ClassDeclaration) result2_black[0];
			ASTNode2Element interface2interface = (ASTNode2Element) result2_black[3];
			// ForEach 
			for (Object[] result3_black : TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_12_3_findcontext_blackBBBB(mowner, uowner, uparam,
							interface2interface)) {
				Object[] result3_green = TypeParameter2Object_InClassImpl
						.pattern_TypeParameter2Object_InClass_12_3_findcontext_greenBBBBFFFF(mowner, uowner, uparam,
								interface2interface);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge interface2interface__uowner____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge interface2interface__mowner____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge uowner__uparam____nestedClassifier = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = TypeParameter2Object_InClassImpl
						.pattern_TypeParameter2Object_InClass_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, mowner, uowner, uparam, interface2interface);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mowner] = " + mowner + ", "
							+ "[uowner] = " + uowner + ", " + "[uparam] = " + uparam + ", " + "[interface2interface] = "
							+ interface2interface + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeParameter2Object_InClassImpl
						.pattern_TypeParameter2Object_InClass_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeParameter2Object_InClassImpl
							.pattern_TypeParameter2Object_InClass_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeParameter2Object_InClassImpl
							.pattern_TypeParameter2Object_InClass_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Class uowner,
			org.eclipse.uml2.uml.Class uparam) {
		match.registerObject("uowner", uowner);
		match.registerObject("uparam", uparam);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Class uowner,
			org.eclipse.uml2.uml.Class uparam) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassDeclaration mowner,
			org.eclipse.uml2.uml.Class uowner, org.eclipse.uml2.uml.Class uparam, ASTNode2Element interface2interface) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mowner", mowner);
		isApplicableMatch.registerObject("uowner", uowner);
		isApplicableMatch.registerObject("uparam", uparam);
		isApplicableMatch.registerObject("interface2interface", interface2interface);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mowner, EObject uowner, EObject uparam,
			EObject param2param, EObject mparam, EObject interface2interface) {
		ruleresult.registerObject("mowner", mowner);
		ruleresult.registerObject("uowner", uowner);
		ruleresult.registerObject("uparam", uparam);
		ruleresult.registerObject("param2param", param2param);
		ruleresult.registerObject("mparam", mparam);
		ruleresult.registerObject("interface2interface", interface2interface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("uparam").eClass()).equals("uml.Class.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_123(EMoflonEdge _edge_nestedClassifier) {

		Object[] result1_bindingAndBlack = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_20_2_testcorematchandDECs_blackFFB(_edge_nestedClassifier)) {
			org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) result2_black[0];
			org.eclipse.uml2.uml.Class uparam = (org.eclipse.uml2.uml.Class) result2_black[1];
			Object[] result2_green = TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, uowner, uparam)) {
				// 
				if (TypeParameter2Object_InClassImpl
						.pattern_TypeParameter2Object_InClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeParameter2Object_InClassImpl
							.pattern_TypeParameter2Object_InClass_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeParameter2Object_InClassImpl
							.pattern_TypeParameter2Object_InClass_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_129(EMoflonEdge _edge_typeParameters) {

		Object[] result1_bindingAndBlack = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_21_2_testcorematchandDECs_blackFFB(_edge_typeParameters)) {
			ClassDeclaration mowner = (ClassDeclaration) result2_black[0];
			TypeParameter mparam = (TypeParameter) result2_black[1];
			Object[] result2_green = TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, mowner, mparam)) {
				// 
				if (TypeParameter2Object_InClassImpl
						.pattern_TypeParameter2Object_InClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeParameter2Object_InClassImpl
							.pattern_TypeParameter2Object_InClass_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeParameter2Object_InClassImpl
							.pattern_TypeParameter2Object_InClass_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TypeParameter2Object_InClass");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("uparam", "name", "T", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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
		ruleResult.setRule("TypeParameter2Object_InClass");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("uparam", "name", "T", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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

		Object[] result1_black = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		ClassDeclaration mowner = (ClassDeclaration) result2_bindingAndBlack[0];
		org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[1];
		org.eclipse.uml2.uml.Class uparam = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[2];
		TypeParameter mparam = (TypeParameter) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, mowner, uowner,
						uparam, mparam, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mowner] = " + mowner + ", " + "[uowner] = " + uowner + ", " + "[uparam] = " + uparam + ", "
					+ "[mparam] = " + mparam + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_24_5_matchcorrcontext_blackBBFBB(mowner, uowner, sourceMatch,
							targetMatch)) {
				ASTNode2Element interface2interface = (ASTNode2Element) result5_black[2];
				Object[] result5_green = TypeParameter2Object_InClassImpl
						.pattern_TypeParameter2Object_InClass_24_5_matchcorrcontext_greenBBBF(interface2interface,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = TypeParameter2Object_InClassImpl
						.pattern_TypeParameter2Object_InClass_24_6_createcorrespondence_blackBBBBB(mowner, uowner,
								uparam, mparam, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mowner] = " + mowner
							+ ", " + "[uowner] = " + uowner + ", " + "[uparam] = " + uparam + ", " + "[mparam] = "
							+ mparam + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeParameter2Object_InClassImpl
						.pattern_TypeParameter2Object_InClass_24_6_createcorrespondence_greenBFBB(uparam, mparam,
								ccMatch);
				//nothing ASTNode2Element param2param = (ASTNode2Element) result6_green[1];

				Object[] result7_black = TypeParameter2Object_InClassImpl
						.pattern_TypeParameter2Object_InClass_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeParameter2Object_InClassImpl
						.pattern_TypeParameter2Object_InClass_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(ClassDeclaration mowner, org.eclipse.uml2.uml.Class uowner,
			org.eclipse.uml2.uml.Class uparam, TypeParameter mparam, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(ClassDeclaration mowner, TypeParameter mparam) {// 
		Object[] result1_black = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_27_1_matchtggpattern_blackBB(mowner, mparam);
		if (result1_black != null) {
			return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_27_2_expressionF();
		} else {
			return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Class uowner, org.eclipse.uml2.uml.Class uparam) {// 
		Object[] result1_black = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_28_1_matchtggpattern_blackBB(uowner, uparam);
		if (result1_black != null) {
			TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_28_1_matchtggpattern_greenB(uparam);

			return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_28_2_expressionF();
		} else {
			return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ASTNode2Element interface2interfaceParameter) {

		Object[] result1_black = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : TypeParameter2Object_InClassImpl
				.pattern_TypeParameter2Object_InClass_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList interface2interfaceList = (RuleEntryList) result2_black[0];
			ClassDeclaration mowner = (ClassDeclaration) result2_black[1];
			ASTNode2Element interface2interface = (ASTNode2Element) result2_black[2];
			org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) result2_black[3];

			Object[] result3_bindingAndBlack = TypeParameter2Object_InClassImpl
					.pattern_TypeParameter2Object_InClass_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							mowner, uowner, interface2interface, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mowner] = " + mowner + ", "
						+ "[uowner] = " + uowner + ", " + "[interface2interface] = " + interface2interface + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = TypeParameter2Object_InClassImpl
						.pattern_TypeParameter2Object_InClass_29_5_checknacs_blackBBB(mowner, uowner,
								interface2interface);
				if (result5_black != null) {

					Object[] result6_black = TypeParameter2Object_InClassImpl
							.pattern_TypeParameter2Object_InClass_29_6_perform_blackBBBB(mowner, uowner,
									interface2interface, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mowner] = " + mowner
								+ ", " + "[uowner] = " + uowner + ", " + "[interface2interface] = "
								+ interface2interface + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					TypeParameter2Object_InClassImpl
							.pattern_TypeParameter2Object_InClass_29_6_perform_greenBBFFFB(mowner, uowner, ruleResult);
					//nothing org.eclipse.uml2.uml.Class uparam = (org.eclipse.uml2.uml.Class) result6_green[2];
					//nothing ASTNode2Element param2param = (ASTNode2Element) result6_green[3];
					//nothing TypeParameter mparam = (TypeParameter) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return TypeParameter2Object_InClassImpl.pattern_TypeParameter2Object_InClass_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassDeclaration mowner,
			org.eclipse.uml2.uml.Class uowner, ASTNode2Element interface2interface,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mowner", mowner);
		isApplicableMatch.registerObject("uowner", uowner);
		isApplicableMatch.registerObject("interface2interface", interface2interface);
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
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPROPRIATE_FWD__MATCH_CLASSDECLARATION_TYPEPARAMETER:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeParameter) arguments.get(2));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDECLARATION_TYPEPARAMETER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeParameter) arguments.get(2));
			return null;
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDECLARATION_TYPEPARAMETER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeParameter) arguments.get(2));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSDECLARATION_CLASS_TYPEPARAMETER_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (TypeParameter) arguments.get(3),
					(ASTNode2Element) arguments.get(4));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPROPRIATE_BWD__MATCH_CLASS_CLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CLASS_CLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
			return null;
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CLASS_CLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDECLARATION_CLASS_CLASS_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (org.eclipse.uml2.uml.Class) arguments.get(3),
					(ASTNode2Element) arguments.get(4));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_123__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_123((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_129__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_129((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__CLASSDECLARATION_CLASS_CLASS_TYPEPARAMETER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((ClassDeclaration) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (org.eclipse.uml2.uml.Class) arguments.get(2),
					(TypeParameter) arguments.get(3), (Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___CHECK_DEC_FWD__CLASSDECLARATION_TYPEPARAMETER:
			return checkDEC_FWD((ClassDeclaration) arguments.get(0), (TypeParameter) arguments.get(1));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___CHECK_DEC_BWD__CLASS_CLASS:
			return checkDEC_BWD((org.eclipse.uml2.uml.Class) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDECLARATION_CLASS_ASTNODE2ELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (ASTNode2Element) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.TYPE_PARAMETER2_OBJECT_IN_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_0_1_initialbindings_blackBBBB(
			TypeParameter2Object_InClass _this, Match match, ClassDeclaration mowner, TypeParameter mparam) {
		return new Object[] { _this, match, mowner, mparam };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_0_2_SolveCSP_bindingFBBBB(
			TypeParameter2Object_InClass _this, Match match, ClassDeclaration mowner, TypeParameter mparam) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mowner, mparam);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mowner, mparam };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_0_2_SolveCSP_bindingAndBlackFBBBB(
			TypeParameter2Object_InClass _this, Match match, ClassDeclaration mowner, TypeParameter mparam) {
		Object[] result_pattern_TypeParameter2Object_InClass_0_2_SolveCSP_binding = pattern_TypeParameter2Object_InClass_0_2_SolveCSP_bindingFBBBB(
				_this, match, mowner, mparam);
		if (result_pattern_TypeParameter2Object_InClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter2Object_InClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeParameter2Object_InClass_0_2_SolveCSP_black = pattern_TypeParameter2Object_InClass_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeParameter2Object_InClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mowner, mparam };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter2Object_InClass_0_3_CheckCSP_expressionFBB(
			TypeParameter2Object_InClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_0_4_collectelementstobetranslated_blackBBB(
			Match match, ClassDeclaration mowner, TypeParameter mparam) {
		return new Object[] { match, mowner, mparam };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_0_4_collectelementstobetranslated_greenBBBF(
			Match match, ClassDeclaration mowner, TypeParameter mparam) {
		EMoflonEdge mowner__mparam____typeParameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mparam);
		String mowner__mparam____typeParameters_name_prime = "typeParameters";
		mowner__mparam____typeParameters.setSrc(mowner);
		mowner__mparam____typeParameters.setTrg(mparam);
		match.getToBeTranslatedEdges().add(mowner__mparam____typeParameters);
		mowner__mparam____typeParameters.setName(mowner__mparam____typeParameters_name_prime);
		return new Object[] { match, mowner, mparam, mowner__mparam____typeParameters };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_0_5_collectcontextelements_blackBBB(Match match,
			ClassDeclaration mowner, TypeParameter mparam) {
		return new Object[] { match, mowner, mparam };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_0_5_collectcontextelements_greenBB(Match match,
			ClassDeclaration mowner) {
		match.getContextNodes().add(mowner);
		return new Object[] { match, mowner };
	}

	public static final void pattern_TypeParameter2Object_InClass_0_6_registerobjectstomatch_expressionBBBB(
			TypeParameter2Object_InClass _this, Match match, ClassDeclaration mowner, TypeParameter mparam) {
		_this.registerObjectsToMatch_FWD(match, mowner, mparam);

	}

	public static final boolean pattern_TypeParameter2Object_InClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeParameter2Object_InClass_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mowner");
		EObject _localVariable_1 = isApplicableMatch.getObject("uowner");
		EObject _localVariable_2 = isApplicableMatch.getObject("mparam");
		EObject _localVariable_3 = isApplicableMatch.getObject("interface2interface");
		EObject tmpMowner = _localVariable_0;
		EObject tmpUowner = _localVariable_1;
		EObject tmpMparam = _localVariable_2;
		EObject tmpInterface2interface = _localVariable_3;
		if (tmpMowner instanceof ClassDeclaration) {
			ClassDeclaration mowner = (ClassDeclaration) tmpMowner;
			if (tmpUowner instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) tmpUowner;
				if (tmpMparam instanceof TypeParameter) {
					TypeParameter mparam = (TypeParameter) tmpMparam;
					if (tmpInterface2interface instanceof ASTNode2Element) {
						ASTNode2Element interface2interface = (ASTNode2Element) tmpInterface2interface;
						return new Object[] { mowner, uowner, mparam, interface2interface, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_1_1_performtransformation_blackBBBBFBB(
			ClassDeclaration mowner, org.eclipse.uml2.uml.Class uowner, TypeParameter mparam,
			ASTNode2Element interface2interface, TypeParameter2Object_InClass _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mowner, uowner, mparam, interface2interface, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_1_1_performtransformation_bindingAndBlackFFFFFBB(
			TypeParameter2Object_InClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeParameter2Object_InClass_1_1_performtransformation_binding = pattern_TypeParameter2Object_InClass_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeParameter2Object_InClass_1_1_performtransformation_binding != null) {
			ClassDeclaration mowner = (ClassDeclaration) result_pattern_TypeParameter2Object_InClass_1_1_performtransformation_binding[0];
			org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) result_pattern_TypeParameter2Object_InClass_1_1_performtransformation_binding[1];
			TypeParameter mparam = (TypeParameter) result_pattern_TypeParameter2Object_InClass_1_1_performtransformation_binding[2];
			ASTNode2Element interface2interface = (ASTNode2Element) result_pattern_TypeParameter2Object_InClass_1_1_performtransformation_binding[3];

			Object[] result_pattern_TypeParameter2Object_InClass_1_1_performtransformation_black = pattern_TypeParameter2Object_InClass_1_1_performtransformation_blackBBBBFBB(
					mowner, uowner, mparam, interface2interface, _this, isApplicableMatch);
			if (result_pattern_TypeParameter2Object_InClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeParameter2Object_InClass_1_1_performtransformation_black[4];

				return new Object[] { mowner, uowner, mparam, interface2interface, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_1_1_performtransformation_greenBFFB(
			org.eclipse.uml2.uml.Class uowner, TypeParameter mparam) {
		org.eclipse.uml2.uml.Class uparam = UMLFactory.eINSTANCE.createClass();
		ASTNode2Element param2param = UmlFactory.eINSTANCE.createASTNode2Element();
		String uparam_name_prime = "T";
		uowner.getNestedClassifiers().add(uparam);
		param2param.setTarget(uparam);
		param2param.setSource(mparam);
		uparam.setName(uparam_name_prime);
		return new Object[] { uowner, uparam, param2param, mparam };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_1_2_collecttranslatedelements_blackBBB(
			org.eclipse.uml2.uml.Class uparam, ASTNode2Element param2param, TypeParameter mparam) {
		return new Object[] { uparam, param2param, mparam };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_1_2_collecttranslatedelements_greenFBBB(
			org.eclipse.uml2.uml.Class uparam, ASTNode2Element param2param, TypeParameter mparam) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(uparam);
		ruleresult.getCreatedLinkElements().add(param2param);
		ruleresult.getTranslatedElements().add(mparam);
		return new Object[] { ruleresult, uparam, param2param, mparam };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mowner, EObject uowner, EObject uparam, EObject param2param,
			EObject mparam, EObject interface2interface) {
		if (!mowner.equals(uowner)) {
			if (!mowner.equals(uparam)) {
				if (!mowner.equals(param2param)) {
					if (!mowner.equals(mparam)) {
						if (!uowner.equals(uparam)) {
							if (!param2param.equals(uowner)) {
								if (!param2param.equals(uparam)) {
									if (!mparam.equals(uowner)) {
										if (!mparam.equals(uparam)) {
											if (!mparam.equals(param2param)) {
												if (!interface2interface.equals(mowner)) {
													if (!interface2interface.equals(uowner)) {
														if (!interface2interface.equals(uparam)) {
															if (!interface2interface.equals(param2param)) {
																if (!interface2interface.equals(mparam)) {
																	return new Object[] { ruleresult, mowner, uowner,
																			uparam, param2param, mparam,
																			interface2interface };
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

	public static final Object[] pattern_TypeParameter2Object_InClass_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mowner, EObject uowner, EObject uparam, EObject param2param,
			EObject mparam) {
		EMoflonEdge param2param__uparam____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mowner__mparam____typeParameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uowner__uparam____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge param2param__mparam____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeParameter2Object_InClass";
		String param2param__uparam____target_name_prime = "target";
		String mowner__mparam____typeParameters_name_prime = "typeParameters";
		String uowner__uparam____nestedClassifier_name_prime = "nestedClassifier";
		String param2param__mparam____source_name_prime = "source";
		param2param__uparam____target.setSrc(param2param);
		param2param__uparam____target.setTrg(uparam);
		ruleresult.getCreatedEdges().add(param2param__uparam____target);
		mowner__mparam____typeParameters.setSrc(mowner);
		mowner__mparam____typeParameters.setTrg(mparam);
		ruleresult.getTranslatedEdges().add(mowner__mparam____typeParameters);
		uowner__uparam____nestedClassifier.setSrc(uowner);
		uowner__uparam____nestedClassifier.setTrg(uparam);
		ruleresult.getCreatedEdges().add(uowner__uparam____nestedClassifier);
		param2param__mparam____source.setSrc(param2param);
		param2param__mparam____source.setTrg(mparam);
		ruleresult.getCreatedEdges().add(param2param__mparam____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		param2param__uparam____target.setName(param2param__uparam____target_name_prime);
		mowner__mparam____typeParameters.setName(mowner__mparam____typeParameters_name_prime);
		uowner__uparam____nestedClassifier.setName(uowner__uparam____nestedClassifier_name_prime);
		param2param__mparam____source.setName(param2param__mparam____source_name_prime);
		return new Object[] { ruleresult, mowner, uowner, uparam, param2param, mparam, param2param__uparam____target,
				mowner__mparam____typeParameters, uowner__uparam____nestedClassifier, param2param__mparam____source };
	}

	public static final void pattern_TypeParameter2Object_InClass_1_5_registerobjects_expressionBBBBBBBB(
			TypeParameter2Object_InClass _this, PerformRuleResult ruleresult, EObject mowner, EObject uowner,
			EObject uparam, EObject param2param, EObject mparam, EObject interface2interface) {
		_this.registerObjects_FWD(ruleresult, mowner, uowner, uparam, param2param, mparam, interface2interface);

	}

	public static final PerformRuleResult pattern_TypeParameter2Object_InClass_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_2_1_preparereturnvalue_bindingFB(
			TypeParameter2Object_InClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_2_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeParameter2Object_InClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_2_1_preparereturnvalue_bindingAndBlackFFB(
			TypeParameter2Object_InClass _this) {
		Object[] result_pattern_TypeParameter2Object_InClass_2_1_preparereturnvalue_binding = pattern_TypeParameter2Object_InClass_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeParameter2Object_InClass_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeParameter2Object_InClass_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeParameter2Object_InClass_2_1_preparereturnvalue_black = pattern_TypeParameter2Object_InClass_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeParameter2Object_InClass_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeParameter2Object_InClass_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeParameter2Object_InClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mowner");
		EObject _localVariable_1 = match.getObject("mparam");
		EObject tmpMowner = _localVariable_0;
		EObject tmpMparam = _localVariable_1;
		if (tmpMowner instanceof ClassDeclaration) {
			ClassDeclaration mowner = (ClassDeclaration) tmpMowner;
			if (tmpMparam instanceof TypeParameter) {
				TypeParameter mparam = (TypeParameter) tmpMparam;
				return new Object[] { mowner, mparam, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeParameter2Object_InClass_2_2_corematch_blackBFBFB(
			ClassDeclaration mowner, TypeParameter mparam, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element interface2interface : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mowner, ASTNode2Element.class, "source")) {
			Element tmpUowner = interface2interface.getTarget();
			if (tmpUowner instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) tmpUowner;
				_result.add(new Object[] { mowner, uowner, mparam, interface2interface, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeParameter2Object_InClass_2_3_findcontext_blackBBBB(
			ClassDeclaration mowner, org.eclipse.uml2.uml.Class uowner, TypeParameter mparam,
			ASTNode2Element interface2interface) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (uowner.equals(interface2interface.getTarget())) {
			if (mowner.getTypeParameters().contains(mparam)) {
				if (mowner.equals(interface2interface.getSource())) {
					_result.add(new Object[] { mowner, uowner, mparam, interface2interface });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_2_3_findcontext_greenBBBBFFFF(
			ClassDeclaration mowner, org.eclipse.uml2.uml.Class uowner, TypeParameter mparam,
			ASTNode2Element interface2interface) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge interface2interface__uowner____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mowner__mparam____typeParameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge interface2interface__mowner____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String interface2interface__uowner____target_name_prime = "target";
		String mowner__mparam____typeParameters_name_prime = "typeParameters";
		String interface2interface__mowner____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mowner);
		isApplicableMatch.getAllContextElements().add(uowner);
		isApplicableMatch.getAllContextElements().add(mparam);
		isApplicableMatch.getAllContextElements().add(interface2interface);
		interface2interface__uowner____target.setSrc(interface2interface);
		interface2interface__uowner____target.setTrg(uowner);
		isApplicableMatch.getAllContextElements().add(interface2interface__uowner____target);
		mowner__mparam____typeParameters.setSrc(mowner);
		mowner__mparam____typeParameters.setTrg(mparam);
		isApplicableMatch.getAllContextElements().add(mowner__mparam____typeParameters);
		interface2interface__mowner____source.setSrc(interface2interface);
		interface2interface__mowner____source.setTrg(mowner);
		isApplicableMatch.getAllContextElements().add(interface2interface__mowner____source);
		interface2interface__uowner____target.setName(interface2interface__uowner____target_name_prime);
		mowner__mparam____typeParameters.setName(mowner__mparam____typeParameters_name_prime);
		interface2interface__mowner____source.setName(interface2interface__mowner____source_name_prime);
		return new Object[] { mowner, uowner, mparam, interface2interface, isApplicableMatch,
				interface2interface__uowner____target, mowner__mparam____typeParameters,
				interface2interface__mowner____source };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_2_4_solveCSP_bindingFBBBBBB(
			TypeParameter2Object_InClass _this, IsApplicableMatch isApplicableMatch, ClassDeclaration mowner,
			org.eclipse.uml2.uml.Class uowner, TypeParameter mparam, ASTNode2Element interface2interface) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mowner, uowner, mparam,
				interface2interface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mowner, uowner, mparam, interface2interface };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_2_4_solveCSP_bindingAndBlackFBBBBBB(
			TypeParameter2Object_InClass _this, IsApplicableMatch isApplicableMatch, ClassDeclaration mowner,
			org.eclipse.uml2.uml.Class uowner, TypeParameter mparam, ASTNode2Element interface2interface) {
		Object[] result_pattern_TypeParameter2Object_InClass_2_4_solveCSP_binding = pattern_TypeParameter2Object_InClass_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mowner, uowner, mparam, interface2interface);
		if (result_pattern_TypeParameter2Object_InClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter2Object_InClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypeParameter2Object_InClass_2_4_solveCSP_black = pattern_TypeParameter2Object_InClass_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeParameter2Object_InClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mowner, uowner, mparam, interface2interface };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter2Object_InClass_2_5_checkCSP_expressionFBB(
			TypeParameter2Object_InClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeParameter2Object_InClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeParameter2Object_InClass_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_10_1_initialbindings_blackBBBB(
			TypeParameter2Object_InClass _this, Match match, org.eclipse.uml2.uml.Class uowner,
			org.eclipse.uml2.uml.Class uparam) {
		if (!uowner.equals(uparam)) {
			return new Object[] { _this, match, uowner, uparam };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_10_2_SolveCSP_bindingFBBBB(
			TypeParameter2Object_InClass _this, Match match, org.eclipse.uml2.uml.Class uowner,
			org.eclipse.uml2.uml.Class uparam) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, uowner, uparam);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, uowner, uparam };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_10_2_SolveCSP_bindingAndBlackFBBBB(
			TypeParameter2Object_InClass _this, Match match, org.eclipse.uml2.uml.Class uowner,
			org.eclipse.uml2.uml.Class uparam) {
		Object[] result_pattern_TypeParameter2Object_InClass_10_2_SolveCSP_binding = pattern_TypeParameter2Object_InClass_10_2_SolveCSP_bindingFBBBB(
				_this, match, uowner, uparam);
		if (result_pattern_TypeParameter2Object_InClass_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter2Object_InClass_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeParameter2Object_InClass_10_2_SolveCSP_black = pattern_TypeParameter2Object_InClass_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeParameter2Object_InClass_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, uowner, uparam };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter2Object_InClass_10_3_CheckCSP_expressionFBB(
			TypeParameter2Object_InClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_10_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.uml2.uml.Class uowner, org.eclipse.uml2.uml.Class uparam) {
		if (!uowner.equals(uparam)) {
			return new Object[] { match, uowner, uparam };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_10_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.uml2.uml.Class uowner, org.eclipse.uml2.uml.Class uparam) {
		EMoflonEdge uowner__uparam____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(uparam);
		String uowner__uparam____nestedClassifier_name_prime = "nestedClassifier";
		uowner__uparam____nestedClassifier.setSrc(uowner);
		uowner__uparam____nestedClassifier.setTrg(uparam);
		match.getToBeTranslatedEdges().add(uowner__uparam____nestedClassifier);
		uowner__uparam____nestedClassifier.setName(uowner__uparam____nestedClassifier_name_prime);
		return new Object[] { match, uowner, uparam, uowner__uparam____nestedClassifier };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_10_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.uml2.uml.Class uowner, org.eclipse.uml2.uml.Class uparam) {
		if (!uowner.equals(uparam)) {
			return new Object[] { match, uowner, uparam };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_10_5_collectcontextelements_greenBB(Match match,
			org.eclipse.uml2.uml.Class uowner) {
		match.getContextNodes().add(uowner);
		return new Object[] { match, uowner };
	}

	public static final void pattern_TypeParameter2Object_InClass_10_6_registerobjectstomatch_expressionBBBB(
			TypeParameter2Object_InClass _this, Match match, org.eclipse.uml2.uml.Class uowner,
			org.eclipse.uml2.uml.Class uparam) {
		_this.registerObjectsToMatch_BWD(match, uowner, uparam);

	}

	public static final boolean pattern_TypeParameter2Object_InClass_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeParameter2Object_InClass_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mowner");
		EObject _localVariable_1 = isApplicableMatch.getObject("uowner");
		EObject _localVariable_2 = isApplicableMatch.getObject("uparam");
		EObject _localVariable_3 = isApplicableMatch.getObject("interface2interface");
		EObject tmpMowner = _localVariable_0;
		EObject tmpUowner = _localVariable_1;
		EObject tmpUparam = _localVariable_2;
		EObject tmpInterface2interface = _localVariable_3;
		if (tmpMowner instanceof ClassDeclaration) {
			ClassDeclaration mowner = (ClassDeclaration) tmpMowner;
			if (tmpUowner instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) tmpUowner;
				if (tmpUparam instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class uparam = (org.eclipse.uml2.uml.Class) tmpUparam;
					if (tmpInterface2interface instanceof ASTNode2Element) {
						ASTNode2Element interface2interface = (ASTNode2Element) tmpInterface2interface;
						return new Object[] { mowner, uowner, uparam, interface2interface, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_11_1_performtransformation_blackBBBBFBB(
			ClassDeclaration mowner, org.eclipse.uml2.uml.Class uowner, org.eclipse.uml2.uml.Class uparam,
			ASTNode2Element interface2interface, TypeParameter2Object_InClass _this,
			IsApplicableMatch isApplicableMatch) {
		if (!uowner.equals(uparam)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { mowner, uowner, uparam, interface2interface, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_11_1_performtransformation_bindingAndBlackFFFFFBB(
			TypeParameter2Object_InClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeParameter2Object_InClass_11_1_performtransformation_binding = pattern_TypeParameter2Object_InClass_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeParameter2Object_InClass_11_1_performtransformation_binding != null) {
			ClassDeclaration mowner = (ClassDeclaration) result_pattern_TypeParameter2Object_InClass_11_1_performtransformation_binding[0];
			org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) result_pattern_TypeParameter2Object_InClass_11_1_performtransformation_binding[1];
			org.eclipse.uml2.uml.Class uparam = (org.eclipse.uml2.uml.Class) result_pattern_TypeParameter2Object_InClass_11_1_performtransformation_binding[2];
			ASTNode2Element interface2interface = (ASTNode2Element) result_pattern_TypeParameter2Object_InClass_11_1_performtransformation_binding[3];

			Object[] result_pattern_TypeParameter2Object_InClass_11_1_performtransformation_black = pattern_TypeParameter2Object_InClass_11_1_performtransformation_blackBBBBFBB(
					mowner, uowner, uparam, interface2interface, _this, isApplicableMatch);
			if (result_pattern_TypeParameter2Object_InClass_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeParameter2Object_InClass_11_1_performtransformation_black[4];

				return new Object[] { mowner, uowner, uparam, interface2interface, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_11_1_performtransformation_greenBBFF(
			ClassDeclaration mowner, org.eclipse.uml2.uml.Class uparam) {
		ASTNode2Element param2param = UmlFactory.eINSTANCE.createASTNode2Element();
		TypeParameter mparam = JavaFactory.eINSTANCE.createTypeParameter();
		param2param.setTarget(uparam);
		mowner.getTypeParameters().add(mparam);
		param2param.setSource(mparam);
		return new Object[] { mowner, uparam, param2param, mparam };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_11_2_collecttranslatedelements_blackBBB(
			org.eclipse.uml2.uml.Class uparam, ASTNode2Element param2param, TypeParameter mparam) {
		return new Object[] { uparam, param2param, mparam };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_11_2_collecttranslatedelements_greenFBBB(
			org.eclipse.uml2.uml.Class uparam, ASTNode2Element param2param, TypeParameter mparam) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(uparam);
		ruleresult.getCreatedLinkElements().add(param2param);
		ruleresult.getCreatedElements().add(mparam);
		return new Object[] { ruleresult, uparam, param2param, mparam };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mowner, EObject uowner, EObject uparam, EObject param2param,
			EObject mparam, EObject interface2interface) {
		if (!mowner.equals(uowner)) {
			if (!mowner.equals(uparam)) {
				if (!mowner.equals(param2param)) {
					if (!mowner.equals(mparam)) {
						if (!uowner.equals(uparam)) {
							if (!param2param.equals(uowner)) {
								if (!param2param.equals(uparam)) {
									if (!mparam.equals(uowner)) {
										if (!mparam.equals(uparam)) {
											if (!mparam.equals(param2param)) {
												if (!interface2interface.equals(mowner)) {
													if (!interface2interface.equals(uowner)) {
														if (!interface2interface.equals(uparam)) {
															if (!interface2interface.equals(param2param)) {
																if (!interface2interface.equals(mparam)) {
																	return new Object[] { ruleresult, mowner, uowner,
																			uparam, param2param, mparam,
																			interface2interface };
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

	public static final Object[] pattern_TypeParameter2Object_InClass_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mowner, EObject uowner, EObject uparam, EObject param2param,
			EObject mparam) {
		EMoflonEdge param2param__uparam____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mowner__mparam____typeParameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uowner__uparam____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge param2param__mparam____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeParameter2Object_InClass";
		String param2param__uparam____target_name_prime = "target";
		String mowner__mparam____typeParameters_name_prime = "typeParameters";
		String uowner__uparam____nestedClassifier_name_prime = "nestedClassifier";
		String param2param__mparam____source_name_prime = "source";
		param2param__uparam____target.setSrc(param2param);
		param2param__uparam____target.setTrg(uparam);
		ruleresult.getCreatedEdges().add(param2param__uparam____target);
		mowner__mparam____typeParameters.setSrc(mowner);
		mowner__mparam____typeParameters.setTrg(mparam);
		ruleresult.getCreatedEdges().add(mowner__mparam____typeParameters);
		uowner__uparam____nestedClassifier.setSrc(uowner);
		uowner__uparam____nestedClassifier.setTrg(uparam);
		ruleresult.getTranslatedEdges().add(uowner__uparam____nestedClassifier);
		param2param__mparam____source.setSrc(param2param);
		param2param__mparam____source.setTrg(mparam);
		ruleresult.getCreatedEdges().add(param2param__mparam____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		param2param__uparam____target.setName(param2param__uparam____target_name_prime);
		mowner__mparam____typeParameters.setName(mowner__mparam____typeParameters_name_prime);
		uowner__uparam____nestedClassifier.setName(uowner__uparam____nestedClassifier_name_prime);
		param2param__mparam____source.setName(param2param__mparam____source_name_prime);
		return new Object[] { ruleresult, mowner, uowner, uparam, param2param, mparam, param2param__uparam____target,
				mowner__mparam____typeParameters, uowner__uparam____nestedClassifier, param2param__mparam____source };
	}

	public static final void pattern_TypeParameter2Object_InClass_11_5_registerobjects_expressionBBBBBBBB(
			TypeParameter2Object_InClass _this, PerformRuleResult ruleresult, EObject mowner, EObject uowner,
			EObject uparam, EObject param2param, EObject mparam, EObject interface2interface) {
		_this.registerObjects_BWD(ruleresult, mowner, uowner, uparam, param2param, mparam, interface2interface);

	}

	public static final PerformRuleResult pattern_TypeParameter2Object_InClass_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_12_1_preparereturnvalue_bindingFB(
			TypeParameter2Object_InClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_12_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeParameter2Object_InClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_12_1_preparereturnvalue_bindingAndBlackFFB(
			TypeParameter2Object_InClass _this) {
		Object[] result_pattern_TypeParameter2Object_InClass_12_1_preparereturnvalue_binding = pattern_TypeParameter2Object_InClass_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeParameter2Object_InClass_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeParameter2Object_InClass_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeParameter2Object_InClass_12_1_preparereturnvalue_black = pattern_TypeParameter2Object_InClass_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeParameter2Object_InClass_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeParameter2Object_InClass_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeParameter2Object_InClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("uowner");
		EObject _localVariable_1 = match.getObject("uparam");
		EObject tmpUowner = _localVariable_0;
		EObject tmpUparam = _localVariable_1;
		if (tmpUowner instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) tmpUowner;
			if (tmpUparam instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uparam = (org.eclipse.uml2.uml.Class) tmpUparam;
				return new Object[] { uowner, uparam, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeParameter2Object_InClass_12_2_corematch_blackFBBFB(
			org.eclipse.uml2.uml.Class uowner, org.eclipse.uml2.uml.Class uparam, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!uowner.equals(uparam)) {
			String uparam_name = uparam.getName();
			if (uparam_name.equals("T")) {
				for (ASTNode2Element interface2interface : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(uowner, ASTNode2Element.class, "target")) {
					ASTNode tmpMowner = interface2interface.getSource();
					if (tmpMowner instanceof ClassDeclaration) {
						ClassDeclaration mowner = (ClassDeclaration) tmpMowner;
						_result.add(new Object[] { mowner, uowner, uparam, interface2interface, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeParameter2Object_InClass_12_3_findcontext_blackBBBB(
			ClassDeclaration mowner, org.eclipse.uml2.uml.Class uowner, org.eclipse.uml2.uml.Class uparam,
			ASTNode2Element interface2interface) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!uowner.equals(uparam)) {
			if (uowner.equals(interface2interface.getTarget())) {
				if (mowner.equals(interface2interface.getSource())) {
					if (uowner.getNestedClassifiers().contains(uparam)) {
						String uparam_name = uparam.getName();
						if (uparam_name.equals("T")) {
							_result.add(new Object[] { mowner, uowner, uparam, interface2interface });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_12_3_findcontext_greenBBBBFFFF(
			ClassDeclaration mowner, org.eclipse.uml2.uml.Class uowner, org.eclipse.uml2.uml.Class uparam,
			ASTNode2Element interface2interface) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge interface2interface__uowner____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge interface2interface__mowner____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uowner__uparam____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String interface2interface__uowner____target_name_prime = "target";
		String interface2interface__mowner____source_name_prime = "source";
		String uowner__uparam____nestedClassifier_name_prime = "nestedClassifier";
		isApplicableMatch.getAllContextElements().add(mowner);
		isApplicableMatch.getAllContextElements().add(uowner);
		isApplicableMatch.getAllContextElements().add(uparam);
		isApplicableMatch.getAllContextElements().add(interface2interface);
		interface2interface__uowner____target.setSrc(interface2interface);
		interface2interface__uowner____target.setTrg(uowner);
		isApplicableMatch.getAllContextElements().add(interface2interface__uowner____target);
		interface2interface__mowner____source.setSrc(interface2interface);
		interface2interface__mowner____source.setTrg(mowner);
		isApplicableMatch.getAllContextElements().add(interface2interface__mowner____source);
		uowner__uparam____nestedClassifier.setSrc(uowner);
		uowner__uparam____nestedClassifier.setTrg(uparam);
		isApplicableMatch.getAllContextElements().add(uowner__uparam____nestedClassifier);
		interface2interface__uowner____target.setName(interface2interface__uowner____target_name_prime);
		interface2interface__mowner____source.setName(interface2interface__mowner____source_name_prime);
		uowner__uparam____nestedClassifier.setName(uowner__uparam____nestedClassifier_name_prime);
		return new Object[] { mowner, uowner, uparam, interface2interface, isApplicableMatch,
				interface2interface__uowner____target, interface2interface__mowner____source,
				uowner__uparam____nestedClassifier };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_12_4_solveCSP_bindingFBBBBBB(
			TypeParameter2Object_InClass _this, IsApplicableMatch isApplicableMatch, ClassDeclaration mowner,
			org.eclipse.uml2.uml.Class uowner, org.eclipse.uml2.uml.Class uparam, ASTNode2Element interface2interface) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mowner, uowner, uparam,
				interface2interface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mowner, uowner, uparam, interface2interface };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_12_4_solveCSP_bindingAndBlackFBBBBBB(
			TypeParameter2Object_InClass _this, IsApplicableMatch isApplicableMatch, ClassDeclaration mowner,
			org.eclipse.uml2.uml.Class uowner, org.eclipse.uml2.uml.Class uparam, ASTNode2Element interface2interface) {
		Object[] result_pattern_TypeParameter2Object_InClass_12_4_solveCSP_binding = pattern_TypeParameter2Object_InClass_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mowner, uowner, uparam, interface2interface);
		if (result_pattern_TypeParameter2Object_InClass_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter2Object_InClass_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypeParameter2Object_InClass_12_4_solveCSP_black = pattern_TypeParameter2Object_InClass_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeParameter2Object_InClass_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mowner, uowner, uparam, interface2interface };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter2Object_InClass_12_5_checkCSP_expressionFBB(
			TypeParameter2Object_InClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeParameter2Object_InClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeParameter2Object_InClass_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_20_1_preparereturnvalue_bindingFB(
			TypeParameter2Object_InClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypeParameter2Object_InClass _this) {
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

	public static final Object[] pattern_TypeParameter2Object_InClass_20_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeParameter2Object_InClass _this) {
		Object[] result_pattern_TypeParameter2Object_InClass_20_1_preparereturnvalue_binding = pattern_TypeParameter2Object_InClass_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeParameter2Object_InClass_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeParameter2Object_InClass_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeParameter2Object_InClass_20_1_preparereturnvalue_black = pattern_TypeParameter2Object_InClass_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeParameter2Object_InClass_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeParameter2Object_InClass_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeParameter2Object_InClass_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TypeParameter2Object_InClass_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_nestedClassifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUowner = _edge_nestedClassifier.getSrc();
		if (tmpUowner instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) tmpUowner;
			EObject tmpUparam = _edge_nestedClassifier.getTrg();
			if (tmpUparam instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uparam = (org.eclipse.uml2.uml.Class) tmpUparam;
				if (!uowner.equals(uparam)) {
					if (uowner.getNestedClassifiers().contains(uparam)) {
						String uparam_name = uparam.getName();
						if (uparam_name.equals("T")) {
							_result.add(new Object[] { uowner, uparam, _edge_nestedClassifier });
						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeParameter2Object_InClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TypeParameter2Object_InClass _this, Match match, org.eclipse.uml2.uml.Class uowner,
			org.eclipse.uml2.uml.Class uparam) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, uowner, uparam);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeParameter2Object_InClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeParameter2Object_InClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeParameter2Object_InClass_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_21_1_preparereturnvalue_bindingFB(
			TypeParameter2Object_InClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypeParameter2Object_InClass _this) {
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

	public static final Object[] pattern_TypeParameter2Object_InClass_21_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeParameter2Object_InClass _this) {
		Object[] result_pattern_TypeParameter2Object_InClass_21_1_preparereturnvalue_binding = pattern_TypeParameter2Object_InClass_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeParameter2Object_InClass_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeParameter2Object_InClass_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeParameter2Object_InClass_21_1_preparereturnvalue_black = pattern_TypeParameter2Object_InClass_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeParameter2Object_InClass_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeParameter2Object_InClass_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeParameter2Object_InClass_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_21_2_testcorematchandDECs_black_nac_0B(
			TypeParameter mparam) {
		for (AbstractMethodDeclaration __DEC_mparam_typeParameters_132034 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mparam, AbstractMethodDeclaration.class, "typeParameters")) {
			return new Object[] { mparam };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeParameter2Object_InClass_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_typeParameters) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMowner = _edge_typeParameters.getSrc();
		if (tmpMowner instanceof ClassDeclaration) {
			ClassDeclaration mowner = (ClassDeclaration) tmpMowner;
			EObject tmpMparam = _edge_typeParameters.getTrg();
			if (tmpMparam instanceof TypeParameter) {
				TypeParameter mparam = (TypeParameter) tmpMparam;
				if (mowner.getTypeParameters().contains(mparam)) {
					if (pattern_TypeParameter2Object_InClass_21_2_testcorematchandDECs_black_nac_0B(mparam) == null) {
						_result.add(new Object[] { mowner, mparam, _edge_typeParameters });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeParameter2Object_InClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TypeParameter2Object_InClass _this, Match match, ClassDeclaration mowner, TypeParameter mparam) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mowner, mparam);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeParameter2Object_InClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeParameter2Object_InClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeParameter2Object_InClass_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_24_1_prepare_blackB(
			TypeParameter2Object_InClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mowner");
		EObject _localVariable_1 = targetMatch.getObject("uowner");
		EObject _localVariable_2 = targetMatch.getObject("uparam");
		EObject _localVariable_3 = sourceMatch.getObject("mparam");
		EObject tmpMowner = _localVariable_0;
		EObject tmpUowner = _localVariable_1;
		EObject tmpUparam = _localVariable_2;
		EObject tmpMparam = _localVariable_3;
		if (tmpMowner instanceof ClassDeclaration) {
			ClassDeclaration mowner = (ClassDeclaration) tmpMowner;
			if (tmpUowner instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) tmpUowner;
				if (tmpUparam instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class uparam = (org.eclipse.uml2.uml.Class) tmpUparam;
					if (tmpMparam instanceof TypeParameter) {
						TypeParameter mparam = (TypeParameter) tmpMparam;
						return new Object[] { mowner, uowner, uparam, mparam, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_24_2_matchsrctrgcontext_blackBBBBBB(
			ClassDeclaration mowner, org.eclipse.uml2.uml.Class uowner, org.eclipse.uml2.uml.Class uparam,
			TypeParameter mparam, Match sourceMatch, Match targetMatch) {
		if (!uowner.equals(uparam)) {
			if (!sourceMatch.equals(targetMatch)) {
				String uparam_name = uparam.getName();
				if (uparam_name.equals("T")) {
					return new Object[] { mowner, uowner, uparam, mparam, sourceMatch, targetMatch };
				}

			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeParameter2Object_InClass_24_2_matchsrctrgcontext_binding = pattern_TypeParameter2Object_InClass_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_TypeParameter2Object_InClass_24_2_matchsrctrgcontext_binding != null) {
			ClassDeclaration mowner = (ClassDeclaration) result_pattern_TypeParameter2Object_InClass_24_2_matchsrctrgcontext_binding[0];
			org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) result_pattern_TypeParameter2Object_InClass_24_2_matchsrctrgcontext_binding[1];
			org.eclipse.uml2.uml.Class uparam = (org.eclipse.uml2.uml.Class) result_pattern_TypeParameter2Object_InClass_24_2_matchsrctrgcontext_binding[2];
			TypeParameter mparam = (TypeParameter) result_pattern_TypeParameter2Object_InClass_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_TypeParameter2Object_InClass_24_2_matchsrctrgcontext_black = pattern_TypeParameter2Object_InClass_24_2_matchsrctrgcontext_blackBBBBBB(
					mowner, uowner, uparam, mparam, sourceMatch, targetMatch);
			if (result_pattern_TypeParameter2Object_InClass_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mowner, uowner, uparam, mparam, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_24_3_solvecsp_bindingFBBBBBBB(
			TypeParameter2Object_InClass _this, ClassDeclaration mowner, org.eclipse.uml2.uml.Class uowner,
			org.eclipse.uml2.uml.Class uparam, TypeParameter mparam, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(mowner, uowner, uparam, mparam, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, mowner, uowner, uparam, mparam, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			TypeParameter2Object_InClass _this, ClassDeclaration mowner, org.eclipse.uml2.uml.Class uowner,
			org.eclipse.uml2.uml.Class uparam, TypeParameter mparam, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeParameter2Object_InClass_24_3_solvecsp_binding = pattern_TypeParameter2Object_InClass_24_3_solvecsp_bindingFBBBBBBB(
				_this, mowner, uowner, uparam, mparam, sourceMatch, targetMatch);
		if (result_pattern_TypeParameter2Object_InClass_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter2Object_InClass_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypeParameter2Object_InClass_24_3_solvecsp_black = pattern_TypeParameter2Object_InClass_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_TypeParameter2Object_InClass_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mowner, uowner, uparam, mparam, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter2Object_InClass_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeParameter2Object_InClass_24_5_matchcorrcontext_blackBBFBB(
			ClassDeclaration mowner, org.eclipse.uml2.uml.Class uowner, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element interface2interface : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(uowner, ASTNode2Element.class, "target")) {
				if (mowner.equals(interface2interface.getSource())) {
					_result.add(new Object[] { mowner, uowner, interface2interface, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_24_5_matchcorrcontext_greenBBBF(
			ASTNode2Element interface2interface, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TypeParameter2Object_InClass";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(interface2interface);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { interface2interface, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_24_6_createcorrespondence_blackBBBBB(
			ClassDeclaration mowner, org.eclipse.uml2.uml.Class uowner, org.eclipse.uml2.uml.Class uparam,
			TypeParameter mparam, CCMatch ccMatch) {
		if (!uowner.equals(uparam)) {
			return new Object[] { mowner, uowner, uparam, mparam, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_24_6_createcorrespondence_greenBFBB(
			org.eclipse.uml2.uml.Class uparam, TypeParameter mparam, CCMatch ccMatch) {
		ASTNode2Element param2param = UmlFactory.eINSTANCE.createASTNode2Element();
		param2param.setTarget(uparam);
		param2param.setSource(mparam);
		ccMatch.getCreateCorr().add(param2param);
		return new Object[] { uparam, param2param, mparam, ccMatch };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "TypeParameter2Object_InClass";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeParameter2Object_InClass_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_27_1_matchtggpattern_black_nac_0B(
			TypeParameter mparam) {
		for (AbstractMethodDeclaration __DEC_mparam_typeParameters_364389 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mparam, AbstractMethodDeclaration.class, "typeParameters")) {
			return new Object[] { mparam };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_27_1_matchtggpattern_blackBB(
			ClassDeclaration mowner, TypeParameter mparam) {
		if (mowner.getTypeParameters().contains(mparam)) {
			if (pattern_TypeParameter2Object_InClass_27_1_matchtggpattern_black_nac_0B(mparam) == null) {
				return new Object[] { mowner, mparam };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter2Object_InClass_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeParameter2Object_InClass_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_28_1_matchtggpattern_blackBB(
			org.eclipse.uml2.uml.Class uowner, org.eclipse.uml2.uml.Class uparam) {
		if (!uowner.equals(uparam)) {
			if (uowner.getNestedClassifiers().contains(uparam)) {
				return new Object[] { uowner, uparam };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_28_1_matchtggpattern_greenB(
			org.eclipse.uml2.uml.Class uparam) {
		String uparam_name_prime = "T";
		uparam.setName(uparam_name_prime);
		return new Object[] { uparam };
	}

	public static final boolean pattern_TypeParameter2Object_InClass_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeParameter2Object_InClass_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_29_1_createresult_blackB(
			TypeParameter2Object_InClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration mowner) {
		if (ruleResult.getSourceObjects().contains(mowner)) {
			return new Object[] { ruleResult, mowner };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element interface2interface) {
		if (ruleResult.getCorrObjects().contains(interface2interface)) {
			return new Object[] { ruleResult, interface2interface };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class uowner) {
		if (ruleResult.getTargetObjects().contains(uowner)) {
			return new Object[] { ruleResult, uowner };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeParameter2Object_InClass_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList interface2interfaceList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpInterface2interface : interface2interfaceList.getEntryObjects()) {
				if (tmpInterface2interface instanceof ASTNode2Element) {
					ASTNode2Element interface2interface = (ASTNode2Element) tmpInterface2interface;
					ASTNode tmpMowner = interface2interface.getSource();
					if (tmpMowner instanceof ClassDeclaration) {
						ClassDeclaration mowner = (ClassDeclaration) tmpMowner;
						Element tmpUowner = interface2interface.getTarget();
						if (tmpUowner instanceof org.eclipse.uml2.uml.Class) {
							org.eclipse.uml2.uml.Class uowner = (org.eclipse.uml2.uml.Class) tmpUowner;
							if (pattern_TypeParameter2Object_InClass_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									interface2interface) == null) {
								if (pattern_TypeParameter2Object_InClass_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										mowner) == null) {
									if (pattern_TypeParameter2Object_InClass_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, uowner) == null) {
										_result.add(new Object[] { interface2interfaceList, mowner, interface2interface,
												uowner, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_TypeParameter2Object_InClass_29_3_solveCSP_bindingFBBBBBB(
			TypeParameter2Object_InClass _this, IsApplicableMatch isApplicableMatch, ClassDeclaration mowner,
			org.eclipse.uml2.uml.Class uowner, ASTNode2Element interface2interface,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mowner, uowner, interface2interface,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mowner, uowner, interface2interface, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_29_3_solveCSP_bindingAndBlackFBBBBBB(
			TypeParameter2Object_InClass _this, IsApplicableMatch isApplicableMatch, ClassDeclaration mowner,
			org.eclipse.uml2.uml.Class uowner, ASTNode2Element interface2interface,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypeParameter2Object_InClass_29_3_solveCSP_binding = pattern_TypeParameter2Object_InClass_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mowner, uowner, interface2interface, ruleResult);
		if (result_pattern_TypeParameter2Object_InClass_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter2Object_InClass_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypeParameter2Object_InClass_29_3_solveCSP_black = pattern_TypeParameter2Object_InClass_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_TypeParameter2Object_InClass_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mowner, uowner, interface2interface, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter2Object_InClass_29_4_checkCSP_expressionFBB(
			TypeParameter2Object_InClass _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_29_5_checknacs_blackBBB(ClassDeclaration mowner,
			org.eclipse.uml2.uml.Class uowner, ASTNode2Element interface2interface) {
		return new Object[] { mowner, uowner, interface2interface };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_29_6_perform_blackBBBB(ClassDeclaration mowner,
			org.eclipse.uml2.uml.Class uowner, ASTNode2Element interface2interface,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mowner, uowner, interface2interface, ruleResult };
	}

	public static final Object[] pattern_TypeParameter2Object_InClass_29_6_perform_greenBBFFFB(ClassDeclaration mowner,
			org.eclipse.uml2.uml.Class uowner, ModelgeneratorRuleResult ruleResult) {
		org.eclipse.uml2.uml.Class uparam = UMLFactory.eINSTANCE.createClass();
		ASTNode2Element param2param = UmlFactory.eINSTANCE.createASTNode2Element();
		TypeParameter mparam = JavaFactory.eINSTANCE.createTypeParameter();
		String uparam_name_prime = "T";
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		uowner.getNestedClassifiers().add(uparam);
		ruleResult.getTargetObjects().add(uparam);
		param2param.setTarget(uparam);
		ruleResult.getCorrObjects().add(param2param);
		mowner.getTypeParameters().add(mparam);
		param2param.setSource(mparam);
		ruleResult.getSourceObjects().add(mparam);
		uparam.setName(uparam_name_prime);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mowner, uowner, uparam, param2param, mparam, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_TypeParameter2Object_InClass_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypeParameter2Object_InClassImpl
