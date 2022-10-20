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
import org.eclipse.modisco.java.VariableDeclarationFragment;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.FieldDec2Property;
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
 * An implementation of the model object '<em><b>Field Dec2 Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldDec2PropertyImpl extends AbstractRuleImpl implements FieldDec2Property {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldDec2PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldDec2Property();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration) {

		Object[] result1_black = FieldDec2PropertyImpl.pattern_FieldDec2Property_0_1_initialbindings_blackBBBB(this,
				match, vdf, bodyDeclaration);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[vdf] = " + vdf + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}

		Object[] result2_bindingAndBlack = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, vdf, bodyDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[vdf] = " + vdf + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldDec2PropertyImpl.pattern_FieldDec2Property_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldDec2PropertyImpl
					.pattern_FieldDec2Property_0_4_collectelementstobetranslated_blackBBB(match, vdf, bodyDeclaration);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[vdf] = " + vdf + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			FieldDec2PropertyImpl.pattern_FieldDec2Property_0_4_collectelementstobetranslated_greenBBBFF(match, vdf,
					bodyDeclaration);
			//nothing EMoflonEdge vdf__bodyDeclaration____variablesContainer = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge bodyDeclaration__vdf____fragments = (EMoflonEdge) result4_green[4];

			Object[] result5_black = FieldDec2PropertyImpl
					.pattern_FieldDec2Property_0_5_collectcontextelements_blackBBB(match, vdf, bodyDeclaration);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[vdf] = " + vdf + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			// 
			FieldDec2PropertyImpl.pattern_FieldDec2Property_0_6_registerobjectstomatch_expressionBBBB(this, match, vdf,
					bodyDeclaration);
			return FieldDec2PropertyImpl.pattern_FieldDec2Property_0_7_expressionF();
		} else {
			return FieldDec2PropertyImpl.pattern_FieldDec2Property_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_1_1_performtransformation_bindingAndBlackFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		VariableDeclarationFragment vdf = (VariableDeclarationFragment) result1_bindingAndBlack[0];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result1_bindingAndBlack[1];
		CSP csp = (CSP) result1_bindingAndBlack[2];
		Object[] result1_green = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_1_1_performtransformation_greenBFFB(bodyDeclaration, csp);
		Property feature = (Property) result1_green[1];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[2];

		Object[] result2_black = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_1_2_collecttranslatedelements_blackBBBB(vdf, bodyDeclaration, feature, b2e);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[vdf] = " + vdf + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[feature] = " + feature + ", " + "[b2e] = " + b2e + ".");
		}
		Object[] result2_green = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_1_2_collecttranslatedelements_greenFBBBB(vdf, bodyDeclaration, feature, b2e);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldDec2PropertyImpl.pattern_FieldDec2Property_1_3_bookkeepingforedges_blackBBBBB(
				ruleresult, vdf, bodyDeclaration, feature, b2e);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[vdf] = " + vdf + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[feature] = "
					+ feature + ", " + "[b2e] = " + b2e + ".");
		}
		FieldDec2PropertyImpl.pattern_FieldDec2Property_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, vdf,
				bodyDeclaration, feature, b2e);
		//nothing EMoflonEdge vdf__bodyDeclaration____variablesContainer = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge bodyDeclaration__vdf____fragments = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[8];

		// 
		// 
		FieldDec2PropertyImpl.pattern_FieldDec2Property_1_5_registerobjects_expressionBBBBBB(this, ruleresult, vdf,
				bodyDeclaration, feature, b2e);
		return FieldDec2PropertyImpl.pattern_FieldDec2Property_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldDec2PropertyImpl.pattern_FieldDec2Property_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		VariableDeclarationFragment vdf = (VariableDeclarationFragment) result2_binding[0];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_binding[1];
		for (Object[] result2_black : FieldDec2PropertyImpl.pattern_FieldDec2Property_2_2_corematch_blackBBB(vdf,
				bodyDeclaration, match)) {
			// ForEach 
			for (Object[] result3_black : FieldDec2PropertyImpl.pattern_FieldDec2Property_2_3_findcontext_blackBB(vdf,
					bodyDeclaration)) {
				Object[] result3_green = FieldDec2PropertyImpl.pattern_FieldDec2Property_2_3_findcontext_greenBBFFF(vdf,
						bodyDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge vdf__bodyDeclaration____variablesContainer = (EMoflonEdge) result3_green[3];
				//nothing EMoflonEdge bodyDeclaration__vdf____fragments = (EMoflonEdge) result3_green[4];

				Object[] result4_bindingAndBlack = FieldDec2PropertyImpl
						.pattern_FieldDec2Property_2_4_solveCSP_bindingAndBlackFBBBB(this, isApplicableMatch, vdf,
								bodyDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[vdf] = " + vdf + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldDec2PropertyImpl.pattern_FieldDec2Property_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldDec2PropertyImpl
							.pattern_FieldDec2Property_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldDec2PropertyImpl.pattern_FieldDec2Property_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldDec2PropertyImpl.pattern_FieldDec2Property_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, VariableDeclarationFragment vdf,
			MFieldDefinition bodyDeclaration) {
		match.registerObject("vdf", vdf);
		match.registerObject("bodyDeclaration", bodyDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, VariableDeclarationFragment vdf,
			MFieldDefinition bodyDeclaration) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, VariableDeclarationFragment vdf,
			MFieldDefinition bodyDeclaration) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf.name", true, csp);
		var_vdf_name.setValue(vdf.getName());
		var_vdf_name.setType("String");

		// Create unbound variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_vdf_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("vdf", vdf);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject vdf, EObject bodyDeclaration, EObject feature,
			EObject b2e) {
		ruleresult.registerObject("vdf", vdf);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("b2e", b2e);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("vdf").eClass())
						.equals("java.VariableDeclarationFragment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
						.equals("modisco.MFieldDefinition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Property feature) {

		Object[] result1_black = FieldDec2PropertyImpl.pattern_FieldDec2Property_10_1_initialbindings_blackBBB(this,
				match, feature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ".");
		}

		Object[] result2_bindingAndBlack = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_10_2_SolveCSP_bindingAndBlackFBBB(this, match, feature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldDec2PropertyImpl.pattern_FieldDec2Property_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldDec2PropertyImpl
					.pattern_FieldDec2Property_10_4_collectelementstobetranslated_blackBB(match, feature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ".");
			}
			FieldDec2PropertyImpl.pattern_FieldDec2Property_10_4_collectelementstobetranslated_greenBB(match, feature);

			Object[] result5_black = FieldDec2PropertyImpl
					.pattern_FieldDec2Property_10_5_collectcontextelements_blackBB(match, feature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ".");
			}
			// 
			FieldDec2PropertyImpl.pattern_FieldDec2Property_10_6_registerobjectstomatch_expressionBBB(this, match,
					feature);
			return FieldDec2PropertyImpl.pattern_FieldDec2Property_10_7_expressionF();
		} else {
			return FieldDec2PropertyImpl.pattern_FieldDec2Property_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_11_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Property feature = (Property) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_11_1_performtransformation_greenFFBFB(feature, csp);
		VariableDeclarationFragment vdf = (VariableDeclarationFragment) result1_green[0];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result1_green[1];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[3];

		Object[] result2_black = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_11_2_collecttranslatedelements_blackBBBB(vdf, bodyDeclaration, feature, b2e);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[vdf] = " + vdf + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[feature] = " + feature + ", " + "[b2e] = " + b2e + ".");
		}
		Object[] result2_green = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_11_2_collecttranslatedelements_greenFBBBB(vdf, bodyDeclaration, feature,
						b2e);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldDec2PropertyImpl.pattern_FieldDec2Property_11_3_bookkeepingforedges_blackBBBBB(
				ruleresult, vdf, bodyDeclaration, feature, b2e);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[vdf] = " + vdf + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[feature] = "
					+ feature + ", " + "[b2e] = " + b2e + ".");
		}
		FieldDec2PropertyImpl.pattern_FieldDec2Property_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, vdf,
				bodyDeclaration, feature, b2e);
		//nothing EMoflonEdge vdf__bodyDeclaration____variablesContainer = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge bodyDeclaration__vdf____fragments = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[8];

		// 
		// 
		FieldDec2PropertyImpl.pattern_FieldDec2Property_11_5_registerobjects_expressionBBBBBB(this, ruleresult, vdf,
				bodyDeclaration, feature, b2e);
		return FieldDec2PropertyImpl.pattern_FieldDec2Property_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldDec2PropertyImpl.pattern_FieldDec2Property_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Property feature = (Property) result2_binding[0];
		for (Object[] result2_black : FieldDec2PropertyImpl.pattern_FieldDec2Property_12_2_corematch_blackBB(feature,
				match)) {
			// ForEach 
			for (Object[] result3_black : FieldDec2PropertyImpl
					.pattern_FieldDec2Property_12_3_findcontext_blackB(feature)) {
				Object[] result3_green = FieldDec2PropertyImpl
						.pattern_FieldDec2Property_12_3_findcontext_greenBF(feature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = FieldDec2PropertyImpl
						.pattern_FieldDec2Property_12_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, feature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldDec2PropertyImpl.pattern_FieldDec2Property_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldDec2PropertyImpl
							.pattern_FieldDec2Property_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldDec2PropertyImpl.pattern_FieldDec2Property_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return FieldDec2PropertyImpl.pattern_FieldDec2Property_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Property feature) {
		match.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Property feature) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Property feature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables
		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf.name", csp);
		var_vdf_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_vdf_name, var_feature_name);

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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject vdf, EObject bodyDeclaration, EObject feature,
			EObject b2e) {
		ruleresult.registerObject("vdf", vdf);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("b2e", b2e);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("feature").eClass()).equals("uml.Property.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_Property_0(Property feature) {

		Object[] result1_bindingAndBlack = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldDec2PropertyImpl.pattern_FieldDec2Property_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldDec2PropertyImpl
				.pattern_FieldDec2Property_20_2_testcorematchandDECs_blackB(feature)) {
			Object[] result2_green = FieldDec2PropertyImpl
					.pattern_FieldDec2Property_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldDec2PropertyImpl
					.pattern_FieldDec2Property_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, feature)) {
				// 
				if (FieldDec2PropertyImpl
						.pattern_FieldDec2Property_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = FieldDec2PropertyImpl
							.pattern_FieldDec2Property_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldDec2PropertyImpl.pattern_FieldDec2Property_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldDec2PropertyImpl.pattern_FieldDec2Property_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_146(EMoflonEdge _edge_variablesContainer) {

		Object[] result1_bindingAndBlack = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldDec2PropertyImpl.pattern_FieldDec2Property_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldDec2PropertyImpl
				.pattern_FieldDec2Property_21_2_testcorematchandDECs_blackFFB(_edge_variablesContainer)) {
			VariableDeclarationFragment vdf = (VariableDeclarationFragment) result2_black[0];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_black[1];
			Object[] result2_green = FieldDec2PropertyImpl
					.pattern_FieldDec2Property_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldDec2PropertyImpl
					.pattern_FieldDec2Property_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, vdf, bodyDeclaration)) {
				// 
				if (FieldDec2PropertyImpl
						.pattern_FieldDec2Property_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = FieldDec2PropertyImpl
							.pattern_FieldDec2Property_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldDec2PropertyImpl.pattern_FieldDec2Property_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldDec2PropertyImpl.pattern_FieldDec2Property_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldDec2Property");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf", true, csp);
		var_vdf_name.setValue(__helper.getValue("vdf", "name"));
		var_vdf_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("FieldDec2Property");
		eq0.solve(var_vdf_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_feature_name.setBound(false);
			eq0.solve(var_vdf_name, var_feature_name);
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
		ruleResult.setRule("FieldDec2Property");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf", true, csp);
		var_vdf_name.setValue(__helper.getValue("vdf", "name"));
		var_vdf_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("FieldDec2Property");
		eq0.solve(var_vdf_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_vdf_name.setBound(false);
			eq0.solve(var_vdf_name, var_feature_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("vdf", "name", var_vdf_name.getValue());
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

		Object[] result1_black = FieldDec2PropertyImpl.pattern_FieldDec2Property_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldDec2PropertyImpl.pattern_FieldDec2Property_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_24_2_matchsrctrgcontext_bindingAndBlackFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		VariableDeclarationFragment vdf = (VariableDeclarationFragment) result2_bindingAndBlack[0];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_bindingAndBlack[1];
		Property feature = (Property) result2_bindingAndBlack[2];

		Object[] result3_bindingAndBlack = FieldDec2PropertyImpl
				.pattern_FieldDec2Property_24_3_solvecsp_bindingAndBlackFBBBBBB(this, vdf, bodyDeclaration, feature,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[vdf] = " + vdf + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[feature] = " + feature + ", "
							+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (FieldDec2PropertyImpl.pattern_FieldDec2Property_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : FieldDec2PropertyImpl
					.pattern_FieldDec2Property_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = FieldDec2PropertyImpl
						.pattern_FieldDec2Property_24_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = FieldDec2PropertyImpl
						.pattern_FieldDec2Property_24_6_createcorrespondence_blackBBBB(vdf, bodyDeclaration, feature,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[vdf] = " + vdf + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[feature] = " + feature + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				FieldDec2PropertyImpl.pattern_FieldDec2Property_24_6_createcorrespondence_greenBBFB(bodyDeclaration,
						feature, ccMatch);
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[2];

				Object[] result7_black = FieldDec2PropertyImpl
						.pattern_FieldDec2Property_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldDec2PropertyImpl.pattern_FieldDec2Property_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return FieldDec2PropertyImpl.pattern_FieldDec2Property_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration,
			Property feature, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf.name", true, csp);
		var_vdf_name.setValue(vdf.getName());
		var_vdf_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_vdf_name, var_feature_name);
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
	public boolean checkDEC_FWD(VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration) {// 
		Object[] result1_black = FieldDec2PropertyImpl.pattern_FieldDec2Property_27_1_matchtggpattern_blackBB(vdf,
				bodyDeclaration);
		if (result1_black != null) {
			return FieldDec2PropertyImpl.pattern_FieldDec2Property_27_2_expressionF();
		} else {
			return FieldDec2PropertyImpl.pattern_FieldDec2Property_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Property feature) {// 
		Object[] result1_black = FieldDec2PropertyImpl.pattern_FieldDec2Property_28_1_matchtggpattern_blackB(feature);
		if (result1_black != null) {
			return FieldDec2PropertyImpl.pattern_FieldDec2Property_28_2_expressionF();
		} else {
			return FieldDec2PropertyImpl.pattern_FieldDec2Property_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = FieldDec2PropertyImpl.pattern_FieldDec2Property_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldDec2PropertyImpl.pattern_FieldDec2Property_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = FieldDec2PropertyImpl.pattern_FieldDec2Property_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = FieldDec2PropertyImpl
					.pattern_FieldDec2Property_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (FieldDec2PropertyImpl.pattern_FieldDec2Property_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = FieldDec2PropertyImpl
						.pattern_FieldDec2Property_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				FieldDec2PropertyImpl.pattern_FieldDec2Property_29_6_perform_greenFFFFBB(ruleResult, csp);
				//nothing VariableDeclarationFragment vdf = (VariableDeclarationFragment) result6_green[0];
				//nothing MFieldDefinition bodyDeclaration = (MFieldDefinition) result6_green[1];
				//nothing Property feature = (Property) result6_green[2];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[3];

			} else {
			}

		} else {
		}
		return FieldDec2PropertyImpl.pattern_FieldDec2Property_29_7_expressionFB(ruleResult);
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
		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf.name", csp);
		var_vdf_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_vdf_name, var_feature_name);

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
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPROPRIATE_FWD__MATCH_VARIABLEDECLARATIONFRAGMENT_MFIELDDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (VariableDeclarationFragment) arguments.get(1),
					(MFieldDefinition) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_VARIABLEDECLARATIONFRAGMENT_MFIELDDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (VariableDeclarationFragment) arguments.get(1),
					(MFieldDefinition) arguments.get(2));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_VARIABLEDECLARATIONFRAGMENT_MFIELDDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (VariableDeclarationFragment) arguments.get(1),
					(MFieldDefinition) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_VARIABLEDECLARATIONFRAGMENT_MFIELDDEFINITION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(VariableDeclarationFragment) arguments.get(1), (MFieldDefinition) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPROPRIATE_BWD__MATCH_PROPERTY:
			return isAppropriate_BWD((Match) arguments.get(0), (Property) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PROPERTY:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Property) arguments.get(1));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PROPERTY:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Property) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROPERTY:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Property) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPROPRIATE_BWD_PROPERTY_0__PROPERTY:
			return isAppropriate_BWD_Property_0((Property) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_146__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_146((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPLICABLE_SOLVE_CSP_CC__VARIABLEDECLARATIONFRAGMENT_MFIELDDEFINITION_PROPERTY_MATCH_MATCH:
			return isApplicable_solveCsp_CC((VariableDeclarationFragment) arguments.get(0),
					(MFieldDefinition) arguments.get(1), (Property) arguments.get(2), (Match) arguments.get(3),
					(Match) arguments.get(4));
		case RulesPackage.FIELD_DEC2_PROPERTY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___CHECK_DEC_FWD__VARIABLEDECLARATIONFRAGMENT_MFIELDDEFINITION:
			return checkDEC_FWD((VariableDeclarationFragment) arguments.get(0), (MFieldDefinition) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY___CHECK_DEC_BWD__PROPERTY:
			return checkDEC_BWD((Property) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldDec2Property_0_1_initialbindings_blackBBBB(FieldDec2Property _this,
			Match match, VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration) {
		return new Object[] { _this, match, vdf, bodyDeclaration };
	}

	public static final Object[] pattern_FieldDec2Property_0_2_SolveCSP_bindingFBBBB(FieldDec2Property _this,
			Match match, VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, vdf, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, vdf, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property_0_2_SolveCSP_bindingAndBlackFBBBB(FieldDec2Property _this,
			Match match, VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration) {
		Object[] result_pattern_FieldDec2Property_0_2_SolveCSP_binding = pattern_FieldDec2Property_0_2_SolveCSP_bindingFBBBB(
				_this, match, vdf, bodyDeclaration);
		if (result_pattern_FieldDec2Property_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property_0_2_SolveCSP_black = pattern_FieldDec2Property_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, vdf, bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_0_3_CheckCSP_expressionFBB(FieldDec2Property _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_0_4_collectelementstobetranslated_blackBBB(Match match,
			VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration) {
		return new Object[] { match, vdf, bodyDeclaration };
	}

	public static final Object[] pattern_FieldDec2Property_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration) {
		EMoflonEdge vdf__bodyDeclaration____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__vdf____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(vdf);
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		String vdf__bodyDeclaration____variablesContainer_name_prime = "variablesContainer";
		String bodyDeclaration__vdf____fragments_name_prime = "fragments";
		vdf__bodyDeclaration____variablesContainer.setSrc(vdf);
		vdf__bodyDeclaration____variablesContainer.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(vdf__bodyDeclaration____variablesContainer);
		bodyDeclaration__vdf____fragments.setSrc(bodyDeclaration);
		bodyDeclaration__vdf____fragments.setTrg(vdf);
		match.getToBeTranslatedEdges().add(bodyDeclaration__vdf____fragments);
		vdf__bodyDeclaration____variablesContainer.setName(vdf__bodyDeclaration____variablesContainer_name_prime);
		bodyDeclaration__vdf____fragments.setName(bodyDeclaration__vdf____fragments_name_prime);
		return new Object[] { match, vdf, bodyDeclaration, vdf__bodyDeclaration____variablesContainer,
				bodyDeclaration__vdf____fragments };
	}

	public static final Object[] pattern_FieldDec2Property_0_5_collectcontextelements_blackBBB(Match match,
			VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration) {
		return new Object[] { match, vdf, bodyDeclaration };
	}

	public static final void pattern_FieldDec2Property_0_6_registerobjectstomatch_expressionBBBB(
			FieldDec2Property _this, Match match, VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration) {
		_this.registerObjectsToMatch_FWD(match, vdf, bodyDeclaration);

	}

	public static final boolean pattern_FieldDec2Property_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_1_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("vdf");
		EObject _localVariable_1 = isApplicableMatch.getObject("bodyDeclaration");
		EObject tmpVdf = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		if (tmpVdf instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment vdf = (VariableDeclarationFragment) tmpVdf;
			if (tmpBodyDeclaration instanceof MFieldDefinition) {
				MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
				return new Object[] { vdf, bodyDeclaration, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_1_1_performtransformation_blackBBFBB(
			VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration, FieldDec2Property _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { vdf, bodyDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_1_1_performtransformation_bindingAndBlackFFFBB(
			FieldDec2Property _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldDec2Property_1_1_performtransformation_binding = pattern_FieldDec2Property_1_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_FieldDec2Property_1_1_performtransformation_binding != null) {
			VariableDeclarationFragment vdf = (VariableDeclarationFragment) result_pattern_FieldDec2Property_1_1_performtransformation_binding[0];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result_pattern_FieldDec2Property_1_1_performtransformation_binding[1];

			Object[] result_pattern_FieldDec2Property_1_1_performtransformation_black = pattern_FieldDec2Property_1_1_performtransformation_blackBBFBB(
					vdf, bodyDeclaration, _this, isApplicableMatch);
			if (result_pattern_FieldDec2Property_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldDec2Property_1_1_performtransformation_black[2];

				return new Object[] { vdf, bodyDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_1_1_performtransformation_greenBFFB(
			MFieldDefinition bodyDeclaration, CSP csp) {
		Property feature = UMLFactory.eINSTANCE.createProperty();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("feature", "name");
		b2e.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		String feature_name_prime = (String) _localVariable_0;
		feature.setName(feature_name_prime);
		return new Object[] { bodyDeclaration, feature, b2e, csp };
	}

	public static final Object[] pattern_FieldDec2Property_1_2_collecttranslatedelements_blackBBBB(
			VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration, Property feature, ASTNode2Element b2e) {
		return new Object[] { vdf, bodyDeclaration, feature, b2e };
	}

	public static final Object[] pattern_FieldDec2Property_1_2_collecttranslatedelements_greenFBBBB(
			VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration, Property feature, ASTNode2Element b2e) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(vdf);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(b2e);
		return new Object[] { ruleresult, vdf, bodyDeclaration, feature, b2e };
	}

	public static final Object[] pattern_FieldDec2Property_1_3_bookkeepingforedges_blackBBBBB(
			PerformRuleResult ruleresult, EObject vdf, EObject bodyDeclaration, EObject feature, EObject b2e) {
		if (!bodyDeclaration.equals(vdf)) {
			if (!bodyDeclaration.equals(feature)) {
				if (!feature.equals(vdf)) {
					if (!b2e.equals(vdf)) {
						if (!b2e.equals(bodyDeclaration)) {
							if (!b2e.equals(feature)) {
								return new Object[] { ruleresult, vdf, bodyDeclaration, feature, b2e };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject vdf, EObject bodyDeclaration, EObject feature, EObject b2e) {
		EMoflonEdge vdf__bodyDeclaration____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__vdf____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldDec2Property";
		String vdf__bodyDeclaration____variablesContainer_name_prime = "variablesContainer";
		String bodyDeclaration__vdf____fragments_name_prime = "fragments";
		String b2e__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		vdf__bodyDeclaration____variablesContainer.setSrc(vdf);
		vdf__bodyDeclaration____variablesContainer.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(vdf__bodyDeclaration____variablesContainer);
		bodyDeclaration__vdf____fragments.setSrc(bodyDeclaration);
		bodyDeclaration__vdf____fragments.setTrg(vdf);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__vdf____fragments);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		vdf__bodyDeclaration____variablesContainer.setName(vdf__bodyDeclaration____variablesContainer_name_prime);
		bodyDeclaration__vdf____fragments.setName(bodyDeclaration__vdf____fragments_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		return new Object[] { ruleresult, vdf, bodyDeclaration, feature, b2e,
				vdf__bodyDeclaration____variablesContainer, bodyDeclaration__vdf____fragments, b2e__feature____target,
				b2e__bodyDeclaration____source };
	}

	public static final void pattern_FieldDec2Property_1_5_registerobjects_expressionBBBBBB(FieldDec2Property _this,
			PerformRuleResult ruleresult, EObject vdf, EObject bodyDeclaration, EObject feature, EObject b2e) {
		_this.registerObjects_FWD(ruleresult, vdf, bodyDeclaration, feature, b2e);

	}

	public static final PerformRuleResult pattern_FieldDec2Property_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_2_1_preparereturnvalue_bindingFB(FieldDec2Property _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_2_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldDec2Property _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_2_1_preparereturnvalue_bindingAndBlackFFB(
			FieldDec2Property _this) {
		Object[] result_pattern_FieldDec2Property_2_1_preparereturnvalue_binding = pattern_FieldDec2Property_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldDec2Property_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property_2_1_preparereturnvalue_black = pattern_FieldDec2Property_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldDec2Property_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldDec2Property_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldDec2Property";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldDec2Property_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("vdf");
		EObject _localVariable_1 = match.getObject("bodyDeclaration");
		EObject tmpVdf = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		if (tmpVdf instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment vdf = (VariableDeclarationFragment) tmpVdf;
			if (tmpBodyDeclaration instanceof MFieldDefinition) {
				MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
				return new Object[] { vdf, bodyDeclaration, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property_2_2_corematch_blackBBB(
			VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { vdf, bodyDeclaration, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property_2_3_findcontext_blackBB(
			VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (bodyDeclaration.equals(vdf.getVariablesContainer())) {
			_result.add(new Object[] { vdf, bodyDeclaration });
		}
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_2_3_findcontext_greenBBFFF(VariableDeclarationFragment vdf,
			MFieldDefinition bodyDeclaration) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge vdf__bodyDeclaration____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__vdf____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String vdf__bodyDeclaration____variablesContainer_name_prime = "variablesContainer";
		String bodyDeclaration__vdf____fragments_name_prime = "fragments";
		isApplicableMatch.getAllContextElements().add(vdf);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		vdf__bodyDeclaration____variablesContainer.setSrc(vdf);
		vdf__bodyDeclaration____variablesContainer.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(vdf__bodyDeclaration____variablesContainer);
		bodyDeclaration__vdf____fragments.setSrc(bodyDeclaration);
		bodyDeclaration__vdf____fragments.setTrg(vdf);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__vdf____fragments);
		vdf__bodyDeclaration____variablesContainer.setName(vdf__bodyDeclaration____variablesContainer_name_prime);
		bodyDeclaration__vdf____fragments.setName(bodyDeclaration__vdf____fragments_name_prime);
		return new Object[] { vdf, bodyDeclaration, isApplicableMatch, vdf__bodyDeclaration____variablesContainer,
				bodyDeclaration__vdf____fragments };
	}

	public static final Object[] pattern_FieldDec2Property_2_4_solveCSP_bindingFBBBB(FieldDec2Property _this,
			IsApplicableMatch isApplicableMatch, VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, vdf, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, vdf, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property_2_4_solveCSP_bindingAndBlackFBBBB(FieldDec2Property _this,
			IsApplicableMatch isApplicableMatch, VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration) {
		Object[] result_pattern_FieldDec2Property_2_4_solveCSP_binding = pattern_FieldDec2Property_2_4_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, vdf, bodyDeclaration);
		if (result_pattern_FieldDec2Property_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property_2_4_solveCSP_black = pattern_FieldDec2Property_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, vdf, bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_2_5_checkCSP_expressionFBB(FieldDec2Property _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDec2Property_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldDec2Property";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDec2Property_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_10_1_initialbindings_blackBBB(FieldDec2Property _this,
			Match match, Property feature) {
		return new Object[] { _this, match, feature };
	}

	public static final Object[] pattern_FieldDec2Property_10_2_SolveCSP_bindingFBBB(FieldDec2Property _this,
			Match match, Property feature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property_10_2_SolveCSP_bindingAndBlackFBBB(FieldDec2Property _this,
			Match match, Property feature) {
		Object[] result_pattern_FieldDec2Property_10_2_SolveCSP_binding = pattern_FieldDec2Property_10_2_SolveCSP_bindingFBBB(
				_this, match, feature);
		if (result_pattern_FieldDec2Property_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property_10_2_SolveCSP_black = pattern_FieldDec2Property_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_10_3_CheckCSP_expressionFBB(FieldDec2Property _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_10_4_collectelementstobetranslated_blackBB(Match match,
			Property feature) {
		return new Object[] { match, feature };
	}

	public static final Object[] pattern_FieldDec2Property_10_4_collectelementstobetranslated_greenBB(Match match,
			Property feature) {
		match.getToBeTranslatedNodes().add(feature);
		return new Object[] { match, feature };
	}

	public static final Object[] pattern_FieldDec2Property_10_5_collectcontextelements_blackBB(Match match,
			Property feature) {
		return new Object[] { match, feature };
	}

	public static final void pattern_FieldDec2Property_10_6_registerobjectstomatch_expressionBBB(
			FieldDec2Property _this, Match match, Property feature) {
		_this.registerObjectsToMatch_BWD(match, feature);

	}

	public static final boolean pattern_FieldDec2Property_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject tmpFeature = _localVariable_0;
		if (tmpFeature instanceof Property) {
			Property feature = (Property) tmpFeature;
			return new Object[] { feature, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_11_1_performtransformation_blackBFBB(Property feature,
			FieldDec2Property _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { feature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_11_1_performtransformation_bindingAndBlackFFBB(
			FieldDec2Property _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldDec2Property_11_1_performtransformation_binding = pattern_FieldDec2Property_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_FieldDec2Property_11_1_performtransformation_binding != null) {
			Property feature = (Property) result_pattern_FieldDec2Property_11_1_performtransformation_binding[0];

			Object[] result_pattern_FieldDec2Property_11_1_performtransformation_black = pattern_FieldDec2Property_11_1_performtransformation_blackBFBB(
					feature, _this, isApplicableMatch);
			if (result_pattern_FieldDec2Property_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldDec2Property_11_1_performtransformation_black[1];

				return new Object[] { feature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_11_1_performtransformation_greenFFBFB(Property feature,
			CSP csp) {
		VariableDeclarationFragment vdf = JavaFactory.eINSTANCE.createVariableDeclarationFragment();
		MFieldDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("vdf", "name");
		vdf.setVariablesContainer(bodyDeclaration);
		b2e.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		String vdf_name_prime = (String) _localVariable_0;
		vdf.setName(vdf_name_prime);
		return new Object[] { vdf, bodyDeclaration, feature, b2e, csp };
	}

	public static final Object[] pattern_FieldDec2Property_11_2_collecttranslatedelements_blackBBBB(
			VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration, Property feature, ASTNode2Element b2e) {
		return new Object[] { vdf, bodyDeclaration, feature, b2e };
	}

	public static final Object[] pattern_FieldDec2Property_11_2_collecttranslatedelements_greenFBBBB(
			VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration, Property feature, ASTNode2Element b2e) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(vdf);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(b2e);
		return new Object[] { ruleresult, vdf, bodyDeclaration, feature, b2e };
	}

	public static final Object[] pattern_FieldDec2Property_11_3_bookkeepingforedges_blackBBBBB(
			PerformRuleResult ruleresult, EObject vdf, EObject bodyDeclaration, EObject feature, EObject b2e) {
		if (!bodyDeclaration.equals(vdf)) {
			if (!bodyDeclaration.equals(feature)) {
				if (!feature.equals(vdf)) {
					if (!b2e.equals(vdf)) {
						if (!b2e.equals(bodyDeclaration)) {
							if (!b2e.equals(feature)) {
								return new Object[] { ruleresult, vdf, bodyDeclaration, feature, b2e };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject vdf, EObject bodyDeclaration, EObject feature, EObject b2e) {
		EMoflonEdge vdf__bodyDeclaration____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__vdf____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldDec2Property";
		String vdf__bodyDeclaration____variablesContainer_name_prime = "variablesContainer";
		String bodyDeclaration__vdf____fragments_name_prime = "fragments";
		String b2e__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		vdf__bodyDeclaration____variablesContainer.setSrc(vdf);
		vdf__bodyDeclaration____variablesContainer.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(vdf__bodyDeclaration____variablesContainer);
		bodyDeclaration__vdf____fragments.setSrc(bodyDeclaration);
		bodyDeclaration__vdf____fragments.setTrg(vdf);
		ruleresult.getCreatedEdges().add(bodyDeclaration__vdf____fragments);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		vdf__bodyDeclaration____variablesContainer.setName(vdf__bodyDeclaration____variablesContainer_name_prime);
		bodyDeclaration__vdf____fragments.setName(bodyDeclaration__vdf____fragments_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		return new Object[] { ruleresult, vdf, bodyDeclaration, feature, b2e,
				vdf__bodyDeclaration____variablesContainer, bodyDeclaration__vdf____fragments, b2e__feature____target,
				b2e__bodyDeclaration____source };
	}

	public static final void pattern_FieldDec2Property_11_5_registerobjects_expressionBBBBBB(FieldDec2Property _this,
			PerformRuleResult ruleresult, EObject vdf, EObject bodyDeclaration, EObject feature, EObject b2e) {
		_this.registerObjects_BWD(ruleresult, vdf, bodyDeclaration, feature, b2e);

	}

	public static final PerformRuleResult pattern_FieldDec2Property_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_12_1_preparereturnvalue_bindingFB(FieldDec2Property _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_12_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldDec2Property _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_12_1_preparereturnvalue_bindingAndBlackFFB(
			FieldDec2Property _this) {
		Object[] result_pattern_FieldDec2Property_12_1_preparereturnvalue_binding = pattern_FieldDec2Property_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldDec2Property_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property_12_1_preparereturnvalue_black = pattern_FieldDec2Property_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldDec2Property_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldDec2Property_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldDec2Property";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldDec2Property_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject tmpFeature = _localVariable_0;
		if (tmpFeature instanceof Property) {
			Property feature = (Property) tmpFeature;
			return new Object[] { feature, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property_12_2_corematch_blackBB(Property feature,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property_12_3_findcontext_blackB(Property feature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature });
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_12_3_findcontext_greenBF(Property feature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(feature);
		return new Object[] { feature, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDec2Property_12_4_solveCSP_bindingFBBB(FieldDec2Property _this,
			IsApplicableMatch isApplicableMatch, Property feature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property_12_4_solveCSP_bindingAndBlackFBBB(FieldDec2Property _this,
			IsApplicableMatch isApplicableMatch, Property feature) {
		Object[] result_pattern_FieldDec2Property_12_4_solveCSP_binding = pattern_FieldDec2Property_12_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, feature);
		if (result_pattern_FieldDec2Property_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property_12_4_solveCSP_black = pattern_FieldDec2Property_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_12_5_checkCSP_expressionFBB(FieldDec2Property _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDec2Property_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldDec2Property";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDec2Property_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_20_1_preparereturnvalue_bindingFB(FieldDec2Property _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldDec2Property _this) {
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

	public static final Object[] pattern_FieldDec2Property_20_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldDec2Property _this) {
		Object[] result_pattern_FieldDec2Property_20_1_preparereturnvalue_binding = pattern_FieldDec2Property_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldDec2Property_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property_20_1_preparereturnvalue_black = pattern_FieldDec2Property_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldDec2Property_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldDec2Property_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldDec2Property_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldDec2Property_20_2_testcorematchandDECs_black_nac_0B(Property feature) {
		Type __DEC_feature_type_180899 = feature.getType();
		if (__DEC_feature_type_180899 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property_20_2_testcorematchandDECs_blackB(
			Property feature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pattern_FieldDec2Property_20_2_testcorematchandDECs_black_nac_0B(feature) == null) {
			_result.add(new Object[] { feature });
		}
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldDec2Property_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			FieldDec2Property _this, Match match, Property feature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldDec2Property _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldDec2Property_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_21_1_preparereturnvalue_bindingFB(FieldDec2Property _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldDec2Property _this) {
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

	public static final Object[] pattern_FieldDec2Property_21_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldDec2Property _this) {
		Object[] result_pattern_FieldDec2Property_21_1_preparereturnvalue_binding = pattern_FieldDec2Property_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldDec2Property_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property_21_1_preparereturnvalue_black = pattern_FieldDec2Property_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldDec2Property_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldDec2Property_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldDec2Property_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldDec2Property_21_2_testcorematchandDECs_black_nac_0B(
			MFieldDefinition bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_54703 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_54703 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_FieldDec2Property_21_2_testcorematchandDECs_black_nac_1BB(
			MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		for (VariableDeclarationFragment __DEC_bodyDeclaration_variablesContainer_392428 : bodyDeclaration
				.getFragments()) {
			if (!vdf.equals(__DEC_bodyDeclaration_variablesContainer_392428)) {
				return new Object[] { bodyDeclaration, vdf };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_variablesContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpVdf = _edge_variablesContainer.getSrc();
		if (tmpVdf instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment vdf = (VariableDeclarationFragment) tmpVdf;
			EObject tmpBodyDeclaration = _edge_variablesContainer.getTrg();
			if (tmpBodyDeclaration instanceof MFieldDefinition) {
				MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
				if (bodyDeclaration.equals(vdf.getVariablesContainer())) {
					if (pattern_FieldDec2Property_21_2_testcorematchandDECs_black_nac_0B(bodyDeclaration) == null) {
						if (pattern_FieldDec2Property_21_2_testcorematchandDECs_black_nac_1BB(bodyDeclaration,
								vdf) == null) {
							_result.add(new Object[] { vdf, bodyDeclaration, _edge_variablesContainer });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldDec2Property_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldDec2Property _this, Match match, VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, vdf, bodyDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldDec2Property _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldDec2Property_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_24_1_prepare_blackB(FieldDec2Property _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDec2Property_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldDec2Property_24_2_matchsrctrgcontext_bindingFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("vdf");
		EObject _localVariable_1 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_2 = targetMatch.getObject("feature");
		EObject tmpVdf = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpFeature = _localVariable_2;
		if (tmpVdf instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment vdf = (VariableDeclarationFragment) tmpVdf;
			if (tmpBodyDeclaration instanceof MFieldDefinition) {
				MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
				if (tmpFeature instanceof Property) {
					Property feature = (Property) tmpFeature;
					return new Object[] { vdf, bodyDeclaration, feature, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_24_2_matchsrctrgcontext_blackBBBBB(
			VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration, Property feature, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { vdf, bodyDeclaration, feature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_24_2_matchsrctrgcontext_bindingAndBlackFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldDec2Property_24_2_matchsrctrgcontext_binding = pattern_FieldDec2Property_24_2_matchsrctrgcontext_bindingFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_FieldDec2Property_24_2_matchsrctrgcontext_binding != null) {
			VariableDeclarationFragment vdf = (VariableDeclarationFragment) result_pattern_FieldDec2Property_24_2_matchsrctrgcontext_binding[0];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result_pattern_FieldDec2Property_24_2_matchsrctrgcontext_binding[1];
			Property feature = (Property) result_pattern_FieldDec2Property_24_2_matchsrctrgcontext_binding[2];

			Object[] result_pattern_FieldDec2Property_24_2_matchsrctrgcontext_black = pattern_FieldDec2Property_24_2_matchsrctrgcontext_blackBBBBB(
					vdf, bodyDeclaration, feature, sourceMatch, targetMatch);
			if (result_pattern_FieldDec2Property_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { vdf, bodyDeclaration, feature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_24_3_solvecsp_bindingFBBBBBB(FieldDec2Property _this,
			VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration, Property feature, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_3 = _this.isApplicable_solveCsp_CC(vdf, bodyDeclaration, feature, sourceMatch, targetMatch);
		CSP csp = _localVariable_3;
		if (csp != null) {
			return new Object[] { csp, _this, vdf, bodyDeclaration, feature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property_24_3_solvecsp_bindingAndBlackFBBBBBB(FieldDec2Property _this,
			VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration, Property feature, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_FieldDec2Property_24_3_solvecsp_binding = pattern_FieldDec2Property_24_3_solvecsp_bindingFBBBBBB(
				_this, vdf, bodyDeclaration, feature, sourceMatch, targetMatch);
		if (result_pattern_FieldDec2Property_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property_24_3_solvecsp_binding[0];

			Object[] result_pattern_FieldDec2Property_24_3_solvecsp_black = pattern_FieldDec2Property_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_FieldDec2Property_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, vdf, bodyDeclaration, feature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property_24_5_matchcorrcontext_blackBB(Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "FieldDec2Property";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property_24_6_createcorrespondence_blackBBBB(
			VariableDeclarationFragment vdf, MFieldDefinition bodyDeclaration, Property feature, CCMatch ccMatch) {
		return new Object[] { vdf, bodyDeclaration, feature, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property_24_6_createcorrespondence_greenBBFB(
			MFieldDefinition bodyDeclaration, Property feature, CCMatch ccMatch) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		b2e.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		ccMatch.getCreateCorr().add(b2e);
		return new Object[] { bodyDeclaration, feature, b2e, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "FieldDec2Property";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDec2Property_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_27_1_matchtggpattern_black_nac_0B(
			MFieldDefinition bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_949683 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_949683 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_FieldDec2Property_27_1_matchtggpattern_black_nac_1BB(
			MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		for (VariableDeclarationFragment __DEC_bodyDeclaration_variablesContainer_464649 : bodyDeclaration
				.getFragments()) {
			if (!vdf.equals(__DEC_bodyDeclaration_variablesContainer_464649)) {
				return new Object[] { bodyDeclaration, vdf };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_27_1_matchtggpattern_blackBB(VariableDeclarationFragment vdf,
			MFieldDefinition bodyDeclaration) {
		if (bodyDeclaration.equals(vdf.getVariablesContainer())) {
			if (pattern_FieldDec2Property_27_1_matchtggpattern_black_nac_0B(bodyDeclaration) == null) {
				if (pattern_FieldDec2Property_27_1_matchtggpattern_black_nac_1BB(bodyDeclaration, vdf) == null) {
					return new Object[] { vdf, bodyDeclaration };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_28_1_matchtggpattern_black_nac_0B(Property feature) {
		Type __DEC_feature_type_907561 = feature.getType();
		if (__DEC_feature_type_907561 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Object[] pattern_FieldDec2Property_28_1_matchtggpattern_blackB(Property feature) {
		if (pattern_FieldDec2Property_28_1_matchtggpattern_black_nac_0B(feature) == null) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_29_1_createresult_blackB(FieldDec2Property _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDec2Property_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldDec2Property_29_2_isapplicablecore_blackB(FieldDec2Property _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDec2Property_29_3_solveCSP_bindingFBBB(FieldDec2Property _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property_29_3_solveCSP_bindingAndBlackFBBB(FieldDec2Property _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldDec2Property_29_3_solveCSP_binding = pattern_FieldDec2Property_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_FieldDec2Property_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property_29_3_solveCSP_black = pattern_FieldDec2Property_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_29_4_checkCSP_expressionFBB(FieldDec2Property _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_29_6_perform_blackB(ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_FieldDec2Property_29_6_perform_greenFFFFBB(ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		VariableDeclarationFragment vdf = JavaFactory.eINSTANCE.createVariableDeclarationFragment();
		MFieldDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		Property feature = UMLFactory.eINSTANCE.createProperty();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("vdf", "name");
		Object _localVariable_1 = csp.getValue("feature", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(vdf);
		vdf.setVariablesContainer(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		ruleResult.getTargetObjects().add(feature);
		b2e.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		ruleResult.getCorrObjects().add(b2e);
		String vdf_name_prime = (String) _localVariable_0;
		String feature_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		vdf.setName(vdf_name_prime);
		feature.setName(feature_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { vdf, bodyDeclaration, feature, b2e, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_FieldDec2Property_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldDec2PropertyImpl
