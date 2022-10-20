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
import org.eclipse.uml2.uml.VisibilityKind;

import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.Modifier2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.FieldDec2Property_WithModifier;
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
 * An implementation of the model object '<em><b>Field Dec2 Property With Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldDec2Property_WithModifierImpl extends AbstractRuleImpl implements FieldDec2Property_WithModifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldDec2Property_WithModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldDec2Property_WithModifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Modifier modifier, MFieldDefinition bodyDeclaration,
			VariableDeclarationFragment vdf) {

		Object[] result1_black = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_0_1_initialbindings_blackBBBBB(this, match, modifier,
						bodyDeclaration, vdf);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[modifier] = " + modifier + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[vdf] = " + vdf + ".");
		}

		Object[] result2_bindingAndBlack = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, modifier,
						bodyDeclaration, vdf);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[modifier] = " + modifier + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[vdf] = " + vdf + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_0_4_collectelementstobetranslated_blackBBBB(match, modifier,
							bodyDeclaration, vdf);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[modifier] = " + modifier + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
						+ "[vdf] = " + vdf + ".");
			}
			FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_0_4_collectelementstobetranslated_greenBBBBFFFF(match,
							modifier, bodyDeclaration, vdf);
			//nothing EMoflonEdge vdf__bodyDeclaration____variablesContainer = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge bodyDeclaration__vdf____fragments = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result4_green[7];

			Object[] result5_black = FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_0_5_collectcontextelements_blackBBBB(match, modifier,
							bodyDeclaration, vdf);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[modifier] = " + modifier + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
						+ "[vdf] = " + vdf + ".");
			}
			// 
			FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_0_6_registerobjectstomatch_expressionBBBBB(this, match,
							modifier, bodyDeclaration, vdf);
			return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_0_7_expressionF();
		} else {
			return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_1_1_performtransformation_bindingAndBlackFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Modifier modifier = (Modifier) result1_bindingAndBlack[0];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result1_bindingAndBlack[1];
		VariableDeclarationFragment vdf = (VariableDeclarationFragment) result1_bindingAndBlack[2];
		CSP csp = (CSP) result1_bindingAndBlack[3];
		Object[] result1_green = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_1_1_performtransformation_greenFFFBBB(modifier, bodyDeclaration,
						csp);
		Modifier2NamedElement m2f = (Modifier2NamedElement) result1_green[0];
		Property feature = (Property) result1_green[1];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[2];

		Object[] result2_black = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_1_2_collecttranslatedelements_blackBBBBBB(m2f, feature, b2e,
						modifier, bodyDeclaration, vdf);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2f] = " + m2f + ", "
					+ "[feature] = " + feature + ", " + "[b2e] = " + b2e + ", " + "[modifier] = " + modifier + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[vdf] = " + vdf + ".");
		}
		Object[] result2_green = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_1_2_collecttranslatedelements_greenFBBBBBB(m2f, feature, b2e,
						modifier, bodyDeclaration, vdf);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, m2f, feature,
						b2e, modifier, bodyDeclaration, vdf);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[feature] = " + feature + ", " + "[b2e] = " + b2e + ", "
					+ "[modifier] = " + modifier + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[vdf] = "
					+ vdf + ".");
		}
		FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(ruleresult, m2f,
						feature, b2e, modifier, bodyDeclaration, vdf);
		//nothing EMoflonEdge vdf__bodyDeclaration____variablesContainer = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bodyDeclaration__vdf____fragments = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[14];

		// 
		// 
		FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, m2f,
						feature, b2e, modifier, bodyDeclaration, vdf);
		return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Modifier modifier = (Modifier) result2_binding[0];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_binding[1];
		VariableDeclarationFragment vdf = (VariableDeclarationFragment) result2_binding[2];
		for (Object[] result2_black : FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_2_2_corematch_blackBBBB(modifier, bodyDeclaration, vdf,
						match)) {
			// ForEach 
			for (Object[] result3_black : FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_2_3_findcontext_blackBBB(modifier, bodyDeclaration, vdf)) {
				Object[] result3_green = FieldDec2Property_WithModifierImpl
						.pattern_FieldDec2Property_WithModifier_2_3_findcontext_greenBBBFFFFF(modifier, bodyDeclaration,
								vdf);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[3];
				//nothing EMoflonEdge vdf__bodyDeclaration____variablesContainer = (EMoflonEdge) result3_green[4];
				//nothing EMoflonEdge bodyDeclaration__vdf____fragments = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = FieldDec2Property_WithModifierImpl
						.pattern_FieldDec2Property_WithModifier_2_4_solveCSP_bindingAndBlackFBBBBB(this,
								isApplicableMatch, modifier, bodyDeclaration, vdf);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[modifier] = " + modifier + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[vdf] = " + vdf + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldDec2Property_WithModifierImpl
						.pattern_FieldDec2Property_WithModifier_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldDec2Property_WithModifierImpl
							.pattern_FieldDec2Property_WithModifier_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldDec2Property_WithModifierImpl
							.pattern_FieldDec2Property_WithModifier_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Modifier modifier, MFieldDefinition bodyDeclaration,
			VariableDeclarationFragment vdf) {
		match.registerObject("modifier", modifier);
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("vdf", vdf);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Modifier modifier, MFieldDefinition bodyDeclaration,
			VariableDeclarationFragment vdf) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Modifier modifier,
			MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_modifier_static = CSPFactoryHelper.eINSTANCE.createVariable("modifier.static", true, csp);
		var_modifier_static.setValue(modifier.isStatic());
		var_modifier_static.setType("Boolean");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", true, csp);
		var_modifier_visibility.setValue(modifier.getVisibility());
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf.name", true, csp);
		var_vdf_name.setValue(vdf.getName());
		var_vdf_name.setType("String");

		// Create unbound variables
		Variable var_feature_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("feature.isStatic", csp);
		var_feature_isStatic.setType("Boolean");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", csp);
		var_feature_visibility.setType("uml.VisibilityKind");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(jVisibility2umlVisibility);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_modifier_static, var_feature_isStatic);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_vdf_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("modifier", modifier);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("vdf", vdf);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject b2e,
			EObject modifier, EObject bodyDeclaration, EObject vdf) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("modifier", modifier);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("vdf", vdf);

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
						.equals("modisco.MFieldDefinition.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("vdf").eClass())
						.equals("java.VariableDeclarationFragment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Property feature) {

		Object[] result1_black = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_10_1_initialbindings_blackBBB(this, match, feature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ".");
		}

		Object[] result2_bindingAndBlack = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_10_2_SolveCSP_bindingAndBlackFBBB(this, match, feature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_10_4_collectelementstobetranslated_blackBB(match, feature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ".");
			}
			FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_10_4_collectelementstobetranslated_greenBB(match, feature);

			Object[] result5_black = FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_10_5_collectcontextelements_blackBB(match, feature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ".");
			}
			// 
			FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_10_6_registerobjectstomatch_expressionBBB(this, match,
							feature);
			return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_10_7_expressionF();
		} else {
			return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_11_1_performtransformation_bindingAndBlackFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Property feature = (Property) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_11_1_performtransformation_greenFBFFFFB(feature, csp);
		Modifier2NamedElement m2f = (Modifier2NamedElement) result1_green[0];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[2];
		Modifier modifier = (Modifier) result1_green[3];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result1_green[4];
		VariableDeclarationFragment vdf = (VariableDeclarationFragment) result1_green[5];

		Object[] result2_black = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_11_2_collecttranslatedelements_blackBBBBBB(m2f, feature, b2e,
						modifier, bodyDeclaration, vdf);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2f] = " + m2f + ", "
					+ "[feature] = " + feature + ", " + "[b2e] = " + b2e + ", " + "[modifier] = " + modifier + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[vdf] = " + vdf + ".");
		}
		Object[] result2_green = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_11_2_collecttranslatedelements_greenFBBBBBB(m2f, feature, b2e,
						modifier, bodyDeclaration, vdf);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, m2f, feature,
						b2e, modifier, bodyDeclaration, vdf);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[feature] = " + feature + ", " + "[b2e] = " + b2e + ", "
					+ "[modifier] = " + modifier + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[vdf] = "
					+ vdf + ".");
		}
		FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(ruleresult, m2f,
						feature, b2e, modifier, bodyDeclaration, vdf);
		//nothing EMoflonEdge vdf__bodyDeclaration____variablesContainer = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bodyDeclaration__vdf____fragments = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[14];

		// 
		// 
		FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, m2f,
						feature, b2e, modifier, bodyDeclaration, vdf);
		return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Property feature = (Property) result2_binding[0];
		for (Object[] result2_black : FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_12_2_corematch_blackBB(feature, match)) {
			// ForEach 
			for (Object[] result3_black : FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_12_3_findcontext_blackB(feature)) {
				Object[] result3_green = FieldDec2Property_WithModifierImpl
						.pattern_FieldDec2Property_WithModifier_12_3_findcontext_greenBF(feature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = FieldDec2Property_WithModifierImpl
						.pattern_FieldDec2Property_WithModifier_12_4_solveCSP_bindingAndBlackFBBB(this,
								isApplicableMatch, feature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldDec2Property_WithModifierImpl
						.pattern_FieldDec2Property_WithModifier_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldDec2Property_WithModifierImpl
							.pattern_FieldDec2Property_WithModifier_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldDec2Property_WithModifierImpl
							.pattern_FieldDec2Property_WithModifier_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_12_7_expressionFB(ruleresult);
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
		Variable var_feature_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("feature.isStatic", true, csp);
		var_feature_isStatic.setValue(feature.isStatic());
		var_feature_isStatic.setType("Boolean");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", true, csp);
		var_feature_visibility.setValue(feature.getVisibility());
		var_feature_visibility.setType("uml.VisibilityKind");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables
		Variable var_modifier_static = CSPFactoryHelper.eINSTANCE.createVariable("modifier.static", csp);
		var_modifier_static.setType("Boolean");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", csp);
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf.name", csp);
		var_vdf_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(jVisibility2umlVisibility);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_modifier_static, var_feature_isStatic);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_vdf_name, var_feature_name);

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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject b2e,
			EObject modifier, EObject bodyDeclaration, EObject vdf) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("modifier", modifier);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("vdf", vdf);

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
	public EObjectContainer isAppropriate_BWD_Property_1(Property feature) {

		Object[] result1_bindingAndBlack = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_20_2_testcorematchandDECs_blackB(feature)) {
			Object[] result2_green = FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
							this, match, feature)) {
				// 
				if (FieldDec2Property_WithModifierImpl
						.pattern_FieldDec2Property_WithModifier_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = FieldDec2Property_WithModifierImpl
							.pattern_FieldDec2Property_WithModifier_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldDec2Property_WithModifierImpl
							.pattern_FieldDec2Property_WithModifier_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_153(EMoflonEdge _edge_variablesContainer) {

		Object[] result1_bindingAndBlack = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_21_2_testcorematchandDECs_blackFFFB(_edge_variablesContainer)) {
			Modifier modifier = (Modifier) result2_black[0];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_black[1];
			VariableDeclarationFragment vdf = (VariableDeclarationFragment) result2_black[2];
			Object[] result2_green = FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, modifier, bodyDeclaration, vdf)) {
				// 
				if (FieldDec2Property_WithModifierImpl
						.pattern_FieldDec2Property_WithModifier_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = FieldDec2Property_WithModifierImpl
							.pattern_FieldDec2Property_WithModifier_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldDec2Property_WithModifierImpl
							.pattern_FieldDec2Property_WithModifier_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldDec2Property_WithModifier");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_isStatic.setValue(__helper.getValue("feature", "isStatic"));
		var_feature_isStatic.setType("boolean");

		Variable var_modifier_static = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_static.setValue(__helper.getValue("modifier", "static"));
		var_modifier_static.setType("boolean");

		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_visibility.setValue(__helper.getValue("feature", "visibility"));
		var_feature_visibility.setType("uml.VisibilityKind");

		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_visibility.setValue(__helper.getValue("modifier", "visibility"));
		var_modifier_visibility.setType("java.VisibilityKind");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf", true, csp);
		var_vdf_name.setValue(__helper.getValue("vdf", "name"));
		var_vdf_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		JVisibility2umlVisibility jVisibility2umlVisibility1 = new JVisibility2umlVisibility();
		csp.getConstraints().add(jVisibility2umlVisibility1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		eq0.setRuleName("FieldDec2Property_WithModifier");
		eq0.solve(var_modifier_static, var_feature_isStatic);

		jVisibility2umlVisibility1.setRuleName("FieldDec2Property_WithModifier");
		jVisibility2umlVisibility1.solve(var_modifier_visibility, var_feature_visibility);

		eq2.setRuleName("FieldDec2Property_WithModifier");
		eq2.solve(var_vdf_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_feature_isStatic.setBound(false);
			var_feature_visibility.setBound(false);
			var_feature_name.setBound(false);
			eq0.solve(var_modifier_static, var_feature_isStatic);
			jVisibility2umlVisibility1.solve(var_modifier_visibility, var_feature_visibility);
			eq2.solve(var_vdf_name, var_feature_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("feature", "isStatic", var_feature_isStatic.getValue());
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
		ruleResult.setRule("FieldDec2Property_WithModifier");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_isStatic.setValue(__helper.getValue("feature", "isStatic"));
		var_feature_isStatic.setType("boolean");

		Variable var_modifier_static = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_static.setValue(__helper.getValue("modifier", "static"));
		var_modifier_static.setType("boolean");

		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_visibility.setValue(__helper.getValue("feature", "visibility"));
		var_feature_visibility.setType("uml.VisibilityKind");

		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_visibility.setValue(__helper.getValue("modifier", "visibility"));
		var_modifier_visibility.setType("java.VisibilityKind");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf", true, csp);
		var_vdf_name.setValue(__helper.getValue("vdf", "name"));
		var_vdf_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		JVisibility2umlVisibility jVisibility2umlVisibility1 = new JVisibility2umlVisibility();
		csp.getConstraints().add(jVisibility2umlVisibility1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		eq0.setRuleName("FieldDec2Property_WithModifier");
		eq0.solve(var_modifier_static, var_feature_isStatic);

		jVisibility2umlVisibility1.setRuleName("FieldDec2Property_WithModifier");
		jVisibility2umlVisibility1.solve(var_modifier_visibility, var_feature_visibility);

		eq2.setRuleName("FieldDec2Property_WithModifier");
		eq2.solve(var_vdf_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_modifier_static.setBound(false);
			var_modifier_visibility.setBound(false);
			var_vdf_name.setBound(false);
			eq0.solve(var_modifier_static, var_feature_isStatic);
			jVisibility2umlVisibility1.solve(var_modifier_visibility, var_feature_visibility);
			eq2.solve(var_vdf_name, var_feature_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("modifier", "static", var_modifier_static.getValue());
				__helper.setValue("modifier", "visibility", var_modifier_visibility.getValue());
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

		Object[] result1_black = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Property feature = (Property) result2_bindingAndBlack[0];
		Modifier modifier = (Modifier) result2_bindingAndBlack[1];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_bindingAndBlack[2];
		VariableDeclarationFragment vdf = (VariableDeclarationFragment) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, feature, modifier,
						bodyDeclaration, vdf, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[modifier] = " + modifier + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[vdf] = " + vdf + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = FieldDec2Property_WithModifierImpl
						.pattern_FieldDec2Property_WithModifier_24_5_matchcorrcontext_greenBBF(sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = FieldDec2Property_WithModifierImpl
						.pattern_FieldDec2Property_WithModifier_24_6_createcorrespondence_blackBBBBB(feature, modifier,
								bodyDeclaration, vdf, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[modifier] = " + modifier + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[vdf] = " + vdf + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldDec2Property_WithModifierImpl
						.pattern_FieldDec2Property_WithModifier_24_6_createcorrespondence_greenFBFBBB(feature, modifier,
								bodyDeclaration, ccMatch);
				//nothing Modifier2NamedElement m2f = (Modifier2NamedElement) result6_green[0];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[2];

				Object[] result7_black = FieldDec2Property_WithModifierImpl
						.pattern_FieldDec2Property_WithModifier_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldDec2Property_WithModifierImpl
						.pattern_FieldDec2Property_WithModifier_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Property feature, Modifier modifier, MFieldDefinition bodyDeclaration,
			VariableDeclarationFragment vdf, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_modifier_static = CSPFactoryHelper.eINSTANCE.createVariable("modifier.static", true, csp);
		var_modifier_static.setValue(modifier.isStatic());
		var_modifier_static.setType("Boolean");
		Variable var_feature_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("feature.isStatic", true, csp);
		var_feature_isStatic.setValue(feature.isStatic());
		var_feature_isStatic.setType("Boolean");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", true, csp);
		var_modifier_visibility.setValue(modifier.getVisibility());
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", true, csp);
		var_feature_visibility.setValue(feature.getVisibility());
		var_feature_visibility.setType("uml.VisibilityKind");
		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf.name", true, csp);
		var_vdf_name.setValue(vdf.getName());
		var_vdf_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(jVisibility2umlVisibility);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_modifier_static, var_feature_isStatic);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_vdf_name, var_feature_name);
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
	public boolean checkDEC_FWD(Modifier modifier, MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {// 
		Object[] result1_black = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_27_1_matchtggpattern_blackBBB(modifier, bodyDeclaration, vdf);
		if (result1_black != null) {
			return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_27_2_expressionF();
		} else {
			return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Property feature) {// 
		Object[] result1_black = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_28_1_matchtggpattern_blackB(feature);
		if (result1_black != null) {
			return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_28_2_expressionF();
		} else {
			return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = FieldDec2Property_WithModifierImpl
				.pattern_FieldDec2Property_WithModifier_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (FieldDec2Property_WithModifierImpl
					.pattern_FieldDec2Property_WithModifier_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = FieldDec2Property_WithModifierImpl
						.pattern_FieldDec2Property_WithModifier_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				FieldDec2Property_WithModifierImpl
						.pattern_FieldDec2Property_WithModifier_29_6_perform_greenFFFFFFBB(ruleResult, csp);
				//nothing Modifier2NamedElement m2f = (Modifier2NamedElement) result6_green[0];
				//nothing Property feature = (Property) result6_green[1];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[2];
				//nothing Modifier modifier = (Modifier) result6_green[3];
				//nothing MFieldDefinition bodyDeclaration = (MFieldDefinition) result6_green[4];
				//nothing VariableDeclarationFragment vdf = (VariableDeclarationFragment) result6_green[5];

			} else {
			}

		} else {
		}
		return FieldDec2Property_WithModifierImpl.pattern_FieldDec2Property_WithModifier_29_7_expressionFB(ruleResult);
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
		Variable var_modifier_static = CSPFactoryHelper.eINSTANCE.createVariable("modifier.static", csp);
		var_modifier_static.setType("Boolean");
		Variable var_feature_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("feature.isStatic", csp);
		var_feature_isStatic.setType("Boolean");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", csp);
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", csp);
		var_feature_visibility.setType("uml.VisibilityKind");
		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf.name", csp);
		var_vdf_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(jVisibility2umlVisibility);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_modifier_static, var_feature_isStatic);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_vdf_name, var_feature_name);

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
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPROPRIATE_FWD__MATCH_MODIFIER_MFIELDDEFINITION_VARIABLEDECLARATIONFRAGMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Modifier) arguments.get(1),
					(MFieldDefinition) arguments.get(2), (VariableDeclarationFragment) arguments.get(3));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODIFIER_MFIELDDEFINITION_VARIABLEDECLARATIONFRAGMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Modifier) arguments.get(1),
					(MFieldDefinition) arguments.get(2), (VariableDeclarationFragment) arguments.get(3));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODIFIER_MFIELDDEFINITION_VARIABLEDECLARATIONFRAGMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Modifier) arguments.get(1),
					(MFieldDefinition) arguments.get(2), (VariableDeclarationFragment) arguments.get(3));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODIFIER_MFIELDDEFINITION_VARIABLEDECLARATIONFRAGMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Modifier) arguments.get(1),
					(MFieldDefinition) arguments.get(2), (VariableDeclarationFragment) arguments.get(3));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPROPRIATE_BWD__MATCH_PROPERTY:
			return isAppropriate_BWD((Match) arguments.get(0), (Property) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PROPERTY:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Property) arguments.get(1));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PROPERTY:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Property) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROPERTY:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Property) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPROPRIATE_BWD_PROPERTY_1__PROPERTY:
			return isAppropriate_BWD_Property_1((Property) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_153__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_153((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_CC__PROPERTY_MODIFIER_MFIELDDEFINITION_VARIABLEDECLARATIONFRAGMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Property) arguments.get(0), (Modifier) arguments.get(1),
					(MFieldDefinition) arguments.get(2), (VariableDeclarationFragment) arguments.get(3),
					(Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___CHECK_DEC_FWD__MODIFIER_MFIELDDEFINITION_VARIABLEDECLARATIONFRAGMENT:
			return checkDEC_FWD((Modifier) arguments.get(0), (MFieldDefinition) arguments.get(1),
					(VariableDeclarationFragment) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___CHECK_DEC_BWD__PROPERTY:
			return checkDEC_BWD((Property) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY_WITH_MODIFIER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_0_1_initialbindings_blackBBBBB(
			FieldDec2Property_WithModifier _this, Match match, Modifier modifier, MFieldDefinition bodyDeclaration,
			VariableDeclarationFragment vdf) {
		return new Object[] { _this, match, modifier, bodyDeclaration, vdf };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_0_2_SolveCSP_bindingFBBBBB(
			FieldDec2Property_WithModifier _this, Match match, Modifier modifier, MFieldDefinition bodyDeclaration,
			VariableDeclarationFragment vdf) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, modifier, bodyDeclaration, vdf);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, modifier, bodyDeclaration, vdf };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_0_2_SolveCSP_bindingAndBlackFBBBBB(
			FieldDec2Property_WithModifier _this, Match match, Modifier modifier, MFieldDefinition bodyDeclaration,
			VariableDeclarationFragment vdf) {
		Object[] result_pattern_FieldDec2Property_WithModifier_0_2_SolveCSP_binding = pattern_FieldDec2Property_WithModifier_0_2_SolveCSP_bindingFBBBBB(
				_this, match, modifier, bodyDeclaration, vdf);
		if (result_pattern_FieldDec2Property_WithModifier_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property_WithModifier_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property_WithModifier_0_2_SolveCSP_black = pattern_FieldDec2Property_WithModifier_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property_WithModifier_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, modifier, bodyDeclaration, vdf };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_WithModifier_0_3_CheckCSP_expressionFBB(
			FieldDec2Property_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_0_4_collectelementstobetranslated_blackBBBB(
			Match match, Modifier modifier, MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		return new Object[] { match, modifier, bodyDeclaration, vdf };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_0_4_collectelementstobetranslated_greenBBBBFFFF(
			Match match, Modifier modifier, MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		EMoflonEdge vdf__bodyDeclaration____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__vdf____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(modifier);
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		match.getToBeTranslatedNodes().add(vdf);
		String vdf__bodyDeclaration____variablesContainer_name_prime = "variablesContainer";
		String bodyDeclaration__vdf____fragments_name_prime = "fragments";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		vdf__bodyDeclaration____variablesContainer.setSrc(vdf);
		vdf__bodyDeclaration____variablesContainer.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(vdf__bodyDeclaration____variablesContainer);
		bodyDeclaration__vdf____fragments.setSrc(bodyDeclaration);
		bodyDeclaration__vdf____fragments.setTrg(vdf);
		match.getToBeTranslatedEdges().add(bodyDeclaration__vdf____fragments);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		match.getToBeTranslatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		vdf__bodyDeclaration____variablesContainer.setName(vdf__bodyDeclaration____variablesContainer_name_prime);
		bodyDeclaration__vdf____fragments.setName(bodyDeclaration__vdf____fragments_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		return new Object[] { match, modifier, bodyDeclaration, vdf, vdf__bodyDeclaration____variablesContainer,
				bodyDeclaration__vdf____fragments, bodyDeclaration__modifier____modifier,
				modifier__bodyDeclaration____bodyDeclaration };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_0_5_collectcontextelements_blackBBBB(
			Match match, Modifier modifier, MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		return new Object[] { match, modifier, bodyDeclaration, vdf };
	}

	public static final void pattern_FieldDec2Property_WithModifier_0_6_registerobjectstomatch_expressionBBBBB(
			FieldDec2Property_WithModifier _this, Match match, Modifier modifier, MFieldDefinition bodyDeclaration,
			VariableDeclarationFragment vdf) {
		_this.registerObjectsToMatch_FWD(match, modifier, bodyDeclaration, vdf);

	}

	public static final boolean pattern_FieldDec2Property_WithModifier_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property_WithModifier_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_1_1_performtransformation_bindingFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("modifier");
		EObject _localVariable_1 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_2 = isApplicableMatch.getObject("vdf");
		EObject tmpModifier = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpVdf = _localVariable_2;
		if (tmpModifier instanceof Modifier) {
			Modifier modifier = (Modifier) tmpModifier;
			if (tmpBodyDeclaration instanceof MFieldDefinition) {
				MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
				if (tmpVdf instanceof VariableDeclarationFragment) {
					VariableDeclarationFragment vdf = (VariableDeclarationFragment) tmpVdf;
					return new Object[] { modifier, bodyDeclaration, vdf, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_1_1_performtransformation_blackBBBFBB(
			Modifier modifier, MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf,
			FieldDec2Property_WithModifier _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { modifier, bodyDeclaration, vdf, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_1_1_performtransformation_bindingAndBlackFFFFBB(
			FieldDec2Property_WithModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldDec2Property_WithModifier_1_1_performtransformation_binding = pattern_FieldDec2Property_WithModifier_1_1_performtransformation_bindingFFFB(
				isApplicableMatch);
		if (result_pattern_FieldDec2Property_WithModifier_1_1_performtransformation_binding != null) {
			Modifier modifier = (Modifier) result_pattern_FieldDec2Property_WithModifier_1_1_performtransformation_binding[0];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result_pattern_FieldDec2Property_WithModifier_1_1_performtransformation_binding[1];
			VariableDeclarationFragment vdf = (VariableDeclarationFragment) result_pattern_FieldDec2Property_WithModifier_1_1_performtransformation_binding[2];

			Object[] result_pattern_FieldDec2Property_WithModifier_1_1_performtransformation_black = pattern_FieldDec2Property_WithModifier_1_1_performtransformation_blackBBBFBB(
					modifier, bodyDeclaration, vdf, _this, isApplicableMatch);
			if (result_pattern_FieldDec2Property_WithModifier_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldDec2Property_WithModifier_1_1_performtransformation_black[3];

				return new Object[] { modifier, bodyDeclaration, vdf, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_1_1_performtransformation_greenFFFBBB(
			Modifier modifier, MFieldDefinition bodyDeclaration, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		Property feature = UMLFactory.eINSTANCE.createProperty();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("feature", "isStatic");
		Object _localVariable_1 = csp.getValue("feature", "visibility");
		Object _localVariable_2 = csp.getValue("feature", "name");
		m2f.setSource(modifier);
		m2f.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		boolean feature_isStatic_prime = (boolean) _localVariable_0;
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_1;
		String feature_name_prime = (String) _localVariable_2;
		feature.setIsStatic(Boolean.valueOf(feature_isStatic_prime));
		feature.setVisibility(feature_visibility_prime);
		feature.setName(feature_name_prime);
		return new Object[] { m2f, feature, b2e, modifier, bodyDeclaration, csp };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_1_2_collecttranslatedelements_blackBBBBBB(
			Modifier2NamedElement m2f, Property feature, ASTNode2Element b2e, Modifier modifier,
			MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		return new Object[] { m2f, feature, b2e, modifier, bodyDeclaration, vdf };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_1_2_collecttranslatedelements_greenFBBBBBB(
			Modifier2NamedElement m2f, Property feature, ASTNode2Element b2e, Modifier modifier,
			MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2f);
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getTranslatedElements().add(modifier);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		ruleresult.getTranslatedElements().add(vdf);
		return new Object[] { ruleresult, m2f, feature, b2e, modifier, bodyDeclaration, vdf };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject b2e, EObject modifier,
			EObject bodyDeclaration, EObject vdf) {
		if (!m2f.equals(modifier)) {
			if (!m2f.equals(vdf)) {
				if (!feature.equals(m2f)) {
					if (!feature.equals(modifier)) {
						if (!feature.equals(vdf)) {
							if (!b2e.equals(m2f)) {
								if (!b2e.equals(feature)) {
									if (!b2e.equals(modifier)) {
										if (!b2e.equals(bodyDeclaration)) {
											if (!b2e.equals(vdf)) {
												if (!modifier.equals(vdf)) {
													if (!bodyDeclaration.equals(m2f)) {
														if (!bodyDeclaration.equals(feature)) {
															if (!bodyDeclaration.equals(modifier)) {
																if (!bodyDeclaration.equals(vdf)) {
																	return new Object[] { ruleresult, m2f, feature, b2e,
																			modifier, bodyDeclaration, vdf };
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

	public static final Object[] pattern_FieldDec2Property_WithModifier_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject b2e, EObject modifier,
			EObject bodyDeclaration, EObject vdf) {
		EMoflonEdge vdf__bodyDeclaration____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__vdf____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldDec2Property_WithModifier";
		String vdf__bodyDeclaration____variablesContainer_name_prime = "variablesContainer";
		String bodyDeclaration__vdf____fragments_name_prime = "fragments";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String m2f__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String m2f__modifier____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		vdf__bodyDeclaration____variablesContainer.setSrc(vdf);
		vdf__bodyDeclaration____variablesContainer.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(vdf__bodyDeclaration____variablesContainer);
		bodyDeclaration__vdf____fragments.setSrc(bodyDeclaration);
		bodyDeclaration__vdf____fragments.setTrg(vdf);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__vdf____fragments);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		m2f__feature____target.setSrc(m2f);
		m2f__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(m2f__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		m2f__modifier____source.setSrc(m2f);
		m2f__modifier____source.setTrg(modifier);
		ruleresult.getCreatedEdges().add(m2f__modifier____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		vdf__bodyDeclaration____variablesContainer.setName(vdf__bodyDeclaration____variablesContainer_name_prime);
		bodyDeclaration__vdf____fragments.setName(bodyDeclaration__vdf____fragments_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		m2f__feature____target.setName(m2f__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, feature, b2e, modifier, bodyDeclaration, vdf,
				vdf__bodyDeclaration____variablesContainer, bodyDeclaration__vdf____fragments,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration,
				m2f__feature____target, b2e__bodyDeclaration____source, m2f__modifier____source,
				b2e__feature____target };
	}

	public static final void pattern_FieldDec2Property_WithModifier_1_5_registerobjects_expressionBBBBBBBB(
			FieldDec2Property_WithModifier _this, PerformRuleResult ruleresult, EObject m2f, EObject feature,
			EObject b2e, EObject modifier, EObject bodyDeclaration, EObject vdf) {
		_this.registerObjects_FWD(ruleresult, m2f, feature, b2e, modifier, bodyDeclaration, vdf);

	}

	public static final PerformRuleResult pattern_FieldDec2Property_WithModifier_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_2_1_preparereturnvalue_bindingFB(
			FieldDec2Property_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_2_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldDec2Property_WithModifier _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_2_1_preparereturnvalue_bindingAndBlackFFB(
			FieldDec2Property_WithModifier _this) {
		Object[] result_pattern_FieldDec2Property_WithModifier_2_1_preparereturnvalue_binding = pattern_FieldDec2Property_WithModifier_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property_WithModifier_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldDec2Property_WithModifier_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property_WithModifier_2_1_preparereturnvalue_black = pattern_FieldDec2Property_WithModifier_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldDec2Property_WithModifier_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldDec2Property_WithModifier_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldDec2Property_WithModifier";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("modifier");
		EObject _localVariable_1 = match.getObject("bodyDeclaration");
		EObject _localVariable_2 = match.getObject("vdf");
		EObject tmpModifier = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpVdf = _localVariable_2;
		if (tmpModifier instanceof Modifier) {
			Modifier modifier = (Modifier) tmpModifier;
			if (tmpBodyDeclaration instanceof MFieldDefinition) {
				MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
				if (tmpVdf instanceof VariableDeclarationFragment) {
					VariableDeclarationFragment vdf = (VariableDeclarationFragment) tmpVdf;
					return new Object[] { modifier, bodyDeclaration, vdf, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property_WithModifier_2_2_corematch_blackBBBB(
			Modifier modifier, MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { modifier, bodyDeclaration, vdf, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property_WithModifier_2_3_findcontext_blackBBB(
			Modifier modifier, MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (bodyDeclaration.equals(vdf.getVariablesContainer())) {
			if (modifier.equals(bodyDeclaration.getModifier())) {
				_result.add(new Object[] { modifier, bodyDeclaration, vdf });
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_2_3_findcontext_greenBBBFFFFF(Modifier modifier,
			MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge vdf__bodyDeclaration____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__vdf____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String vdf__bodyDeclaration____variablesContainer_name_prime = "variablesContainer";
		String bodyDeclaration__vdf____fragments_name_prime = "fragments";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		isApplicableMatch.getAllContextElements().add(modifier);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(vdf);
		vdf__bodyDeclaration____variablesContainer.setSrc(vdf);
		vdf__bodyDeclaration____variablesContainer.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(vdf__bodyDeclaration____variablesContainer);
		bodyDeclaration__vdf____fragments.setSrc(bodyDeclaration);
		bodyDeclaration__vdf____fragments.setTrg(vdf);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__vdf____fragments);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(modifier__bodyDeclaration____bodyDeclaration);
		vdf__bodyDeclaration____variablesContainer.setName(vdf__bodyDeclaration____variablesContainer_name_prime);
		bodyDeclaration__vdf____fragments.setName(bodyDeclaration__vdf____fragments_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		return new Object[] { modifier, bodyDeclaration, vdf, isApplicableMatch,
				vdf__bodyDeclaration____variablesContainer, bodyDeclaration__vdf____fragments,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_2_4_solveCSP_bindingFBBBBB(
			FieldDec2Property_WithModifier _this, IsApplicableMatch isApplicableMatch, Modifier modifier,
			MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, modifier, bodyDeclaration, vdf);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, modifier, bodyDeclaration, vdf };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_2_4_solveCSP_bindingAndBlackFBBBBB(
			FieldDec2Property_WithModifier _this, IsApplicableMatch isApplicableMatch, Modifier modifier,
			MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		Object[] result_pattern_FieldDec2Property_WithModifier_2_4_solveCSP_binding = pattern_FieldDec2Property_WithModifier_2_4_solveCSP_bindingFBBBBB(
				_this, isApplicableMatch, modifier, bodyDeclaration, vdf);
		if (result_pattern_FieldDec2Property_WithModifier_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property_WithModifier_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property_WithModifier_2_4_solveCSP_black = pattern_FieldDec2Property_WithModifier_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property_WithModifier_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, modifier, bodyDeclaration, vdf };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_WithModifier_2_5_checkCSP_expressionFBB(
			FieldDec2Property_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldDec2Property_WithModifier";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDec2Property_WithModifier_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_10_1_initialbindings_blackBBB(
			FieldDec2Property_WithModifier _this, Match match, Property feature) {
		return new Object[] { _this, match, feature };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_10_2_SolveCSP_bindingFBBB(
			FieldDec2Property_WithModifier _this, Match match, Property feature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_10_2_SolveCSP_bindingAndBlackFBBB(
			FieldDec2Property_WithModifier _this, Match match, Property feature) {
		Object[] result_pattern_FieldDec2Property_WithModifier_10_2_SolveCSP_binding = pattern_FieldDec2Property_WithModifier_10_2_SolveCSP_bindingFBBB(
				_this, match, feature);
		if (result_pattern_FieldDec2Property_WithModifier_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property_WithModifier_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property_WithModifier_10_2_SolveCSP_black = pattern_FieldDec2Property_WithModifier_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property_WithModifier_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_WithModifier_10_3_CheckCSP_expressionFBB(
			FieldDec2Property_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_10_4_collectelementstobetranslated_blackBB(
			Match match, Property feature) {
		return new Object[] { match, feature };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_10_4_collectelementstobetranslated_greenBB(
			Match match, Property feature) {
		match.getToBeTranslatedNodes().add(feature);
		return new Object[] { match, feature };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_10_5_collectcontextelements_blackBB(Match match,
			Property feature) {
		return new Object[] { match, feature };
	}

	public static final void pattern_FieldDec2Property_WithModifier_10_6_registerobjectstomatch_expressionBBB(
			FieldDec2Property_WithModifier _this, Match match, Property feature) {
		_this.registerObjectsToMatch_BWD(match, feature);

	}

	public static final boolean pattern_FieldDec2Property_WithModifier_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property_WithModifier_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject tmpFeature = _localVariable_0;
		if (tmpFeature instanceof Property) {
			Property feature = (Property) tmpFeature;
			return new Object[] { feature, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_11_1_performtransformation_blackBFBB(
			Property feature, FieldDec2Property_WithModifier _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { feature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_11_1_performtransformation_bindingAndBlackFFBB(
			FieldDec2Property_WithModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldDec2Property_WithModifier_11_1_performtransformation_binding = pattern_FieldDec2Property_WithModifier_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_FieldDec2Property_WithModifier_11_1_performtransformation_binding != null) {
			Property feature = (Property) result_pattern_FieldDec2Property_WithModifier_11_1_performtransformation_binding[0];

			Object[] result_pattern_FieldDec2Property_WithModifier_11_1_performtransformation_black = pattern_FieldDec2Property_WithModifier_11_1_performtransformation_blackBFBB(
					feature, _this, isApplicableMatch);
			if (result_pattern_FieldDec2Property_WithModifier_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldDec2Property_WithModifier_11_1_performtransformation_black[1];

				return new Object[] { feature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_11_1_performtransformation_greenFBFFFFB(
			Property feature, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Modifier modifier = JavaFactory.eINSTANCE.createModifier();
		MFieldDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		VariableDeclarationFragment vdf = JavaFactory.eINSTANCE.createVariableDeclarationFragment();
		Object _localVariable_0 = csp.getValue("modifier", "static");
		Object _localVariable_1 = csp.getValue("modifier", "visibility");
		Object _localVariable_2 = csp.getValue("vdf", "name");
		m2f.setTarget(feature);
		b2e.setTarget(feature);
		m2f.setSource(modifier);
		bodyDeclaration.setModifier(modifier);
		b2e.setSource(bodyDeclaration);
		vdf.setVariablesContainer(bodyDeclaration);
		boolean modifier_static_prime = (boolean) _localVariable_0;
		org.eclipse.modisco.java.VisibilityKind modifier_visibility_prime = (org.eclipse.modisco.java.VisibilityKind) _localVariable_1;
		String vdf_name_prime = (String) _localVariable_2;
		modifier.setStatic(Boolean.valueOf(modifier_static_prime));
		modifier.setVisibility(modifier_visibility_prime);
		vdf.setName(vdf_name_prime);
		return new Object[] { m2f, feature, b2e, modifier, bodyDeclaration, vdf, csp };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_11_2_collecttranslatedelements_blackBBBBBB(
			Modifier2NamedElement m2f, Property feature, ASTNode2Element b2e, Modifier modifier,
			MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		return new Object[] { m2f, feature, b2e, modifier, bodyDeclaration, vdf };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_11_2_collecttranslatedelements_greenFBBBBBB(
			Modifier2NamedElement m2f, Property feature, ASTNode2Element b2e, Modifier modifier,
			MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2f);
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedElements().add(modifier);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		ruleresult.getCreatedElements().add(vdf);
		return new Object[] { ruleresult, m2f, feature, b2e, modifier, bodyDeclaration, vdf };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject b2e, EObject modifier,
			EObject bodyDeclaration, EObject vdf) {
		if (!m2f.equals(modifier)) {
			if (!m2f.equals(vdf)) {
				if (!feature.equals(m2f)) {
					if (!feature.equals(modifier)) {
						if (!feature.equals(vdf)) {
							if (!b2e.equals(m2f)) {
								if (!b2e.equals(feature)) {
									if (!b2e.equals(modifier)) {
										if (!b2e.equals(bodyDeclaration)) {
											if (!b2e.equals(vdf)) {
												if (!modifier.equals(vdf)) {
													if (!bodyDeclaration.equals(m2f)) {
														if (!bodyDeclaration.equals(feature)) {
															if (!bodyDeclaration.equals(modifier)) {
																if (!bodyDeclaration.equals(vdf)) {
																	return new Object[] { ruleresult, m2f, feature, b2e,
																			modifier, bodyDeclaration, vdf };
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

	public static final Object[] pattern_FieldDec2Property_WithModifier_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject b2e, EObject modifier,
			EObject bodyDeclaration, EObject vdf) {
		EMoflonEdge vdf__bodyDeclaration____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__vdf____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldDec2Property_WithModifier";
		String vdf__bodyDeclaration____variablesContainer_name_prime = "variablesContainer";
		String bodyDeclaration__vdf____fragments_name_prime = "fragments";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String m2f__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String m2f__modifier____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		vdf__bodyDeclaration____variablesContainer.setSrc(vdf);
		vdf__bodyDeclaration____variablesContainer.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(vdf__bodyDeclaration____variablesContainer);
		bodyDeclaration__vdf____fragments.setSrc(bodyDeclaration);
		bodyDeclaration__vdf____fragments.setTrg(vdf);
		ruleresult.getCreatedEdges().add(bodyDeclaration__vdf____fragments);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		ruleresult.getCreatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		m2f__feature____target.setSrc(m2f);
		m2f__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(m2f__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		m2f__modifier____source.setSrc(m2f);
		m2f__modifier____source.setTrg(modifier);
		ruleresult.getCreatedEdges().add(m2f__modifier____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		vdf__bodyDeclaration____variablesContainer.setName(vdf__bodyDeclaration____variablesContainer_name_prime);
		bodyDeclaration__vdf____fragments.setName(bodyDeclaration__vdf____fragments_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		m2f__feature____target.setName(m2f__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, feature, b2e, modifier, bodyDeclaration, vdf,
				vdf__bodyDeclaration____variablesContainer, bodyDeclaration__vdf____fragments,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration,
				m2f__feature____target, b2e__bodyDeclaration____source, m2f__modifier____source,
				b2e__feature____target };
	}

	public static final void pattern_FieldDec2Property_WithModifier_11_5_registerobjects_expressionBBBBBBBB(
			FieldDec2Property_WithModifier _this, PerformRuleResult ruleresult, EObject m2f, EObject feature,
			EObject b2e, EObject modifier, EObject bodyDeclaration, EObject vdf) {
		_this.registerObjects_BWD(ruleresult, m2f, feature, b2e, modifier, bodyDeclaration, vdf);

	}

	public static final PerformRuleResult pattern_FieldDec2Property_WithModifier_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_12_1_preparereturnvalue_bindingFB(
			FieldDec2Property_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_12_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldDec2Property_WithModifier _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_12_1_preparereturnvalue_bindingAndBlackFFB(
			FieldDec2Property_WithModifier _this) {
		Object[] result_pattern_FieldDec2Property_WithModifier_12_1_preparereturnvalue_binding = pattern_FieldDec2Property_WithModifier_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property_WithModifier_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldDec2Property_WithModifier_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property_WithModifier_12_1_preparereturnvalue_black = pattern_FieldDec2Property_WithModifier_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldDec2Property_WithModifier_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldDec2Property_WithModifier_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldDec2Property_WithModifier";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject tmpFeature = _localVariable_0;
		if (tmpFeature instanceof Property) {
			Property feature = (Property) tmpFeature;
			return new Object[] { feature, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property_WithModifier_12_2_corematch_blackBB(
			Property feature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property_WithModifier_12_3_findcontext_blackB(
			Property feature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature });
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_12_3_findcontext_greenBF(Property feature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(feature);
		return new Object[] { feature, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_12_4_solveCSP_bindingFBBB(
			FieldDec2Property_WithModifier _this, IsApplicableMatch isApplicableMatch, Property feature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_12_4_solveCSP_bindingAndBlackFBBB(
			FieldDec2Property_WithModifier _this, IsApplicableMatch isApplicableMatch, Property feature) {
		Object[] result_pattern_FieldDec2Property_WithModifier_12_4_solveCSP_binding = pattern_FieldDec2Property_WithModifier_12_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, feature);
		if (result_pattern_FieldDec2Property_WithModifier_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property_WithModifier_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property_WithModifier_12_4_solveCSP_black = pattern_FieldDec2Property_WithModifier_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property_WithModifier_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_WithModifier_12_5_checkCSP_expressionFBB(
			FieldDec2Property_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldDec2Property_WithModifier";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDec2Property_WithModifier_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_20_1_preparereturnvalue_bindingFB(
			FieldDec2Property_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, FieldDec2Property_WithModifier _this) {
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

	public static final Object[] pattern_FieldDec2Property_WithModifier_20_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldDec2Property_WithModifier _this) {
		Object[] result_pattern_FieldDec2Property_WithModifier_20_1_preparereturnvalue_binding = pattern_FieldDec2Property_WithModifier_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property_WithModifier_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldDec2Property_WithModifier_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property_WithModifier_20_1_preparereturnvalue_black = pattern_FieldDec2Property_WithModifier_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldDec2Property_WithModifier_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldDec2Property_WithModifier_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldDec2Property_WithModifier_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_20_2_testcorematchandDECs_black_nac_0B(
			Property feature) {
		Type __DEC_feature_type_740428 = feature.getType();
		if (__DEC_feature_type_740428 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property_WithModifier_20_2_testcorematchandDECs_blackB(
			Property feature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pattern_FieldDec2Property_WithModifier_20_2_testcorematchandDECs_black_nac_0B(feature) == null) {
			_result.add(new Object[] { feature });
		}
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldDec2Property_WithModifier_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			FieldDec2Property_WithModifier _this, Match match, Property feature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property_WithModifier_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldDec2Property_WithModifier _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldDec2Property_WithModifier_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_21_1_preparereturnvalue_bindingFB(
			FieldDec2Property_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, FieldDec2Property_WithModifier _this) {
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

	public static final Object[] pattern_FieldDec2Property_WithModifier_21_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldDec2Property_WithModifier _this) {
		Object[] result_pattern_FieldDec2Property_WithModifier_21_1_preparereturnvalue_binding = pattern_FieldDec2Property_WithModifier_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property_WithModifier_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldDec2Property_WithModifier_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property_WithModifier_21_1_preparereturnvalue_black = pattern_FieldDec2Property_WithModifier_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldDec2Property_WithModifier_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldDec2Property_WithModifier_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldDec2Property_WithModifier_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_21_2_testcorematchandDECs_black_nac_0BB(
			MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		for (VariableDeclarationFragment __DEC_bodyDeclaration_variablesContainer_689291 : bodyDeclaration
				.getFragments()) {
			if (!vdf.equals(__DEC_bodyDeclaration_variablesContainer_689291)) {
				return new Object[] { bodyDeclaration, vdf };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property_WithModifier_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_variablesContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpVdf = _edge_variablesContainer.getSrc();
		if (tmpVdf instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment vdf = (VariableDeclarationFragment) tmpVdf;
			EObject tmpBodyDeclaration = _edge_variablesContainer.getTrg();
			if (tmpBodyDeclaration instanceof MFieldDefinition) {
				MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
				if (bodyDeclaration.equals(vdf.getVariablesContainer())) {
					Modifier modifier = bodyDeclaration.getModifier();
					if (modifier != null) {
						if (pattern_FieldDec2Property_WithModifier_21_2_testcorematchandDECs_black_nac_0BB(
								bodyDeclaration, vdf) == null) {
							_result.add(new Object[] { modifier, bodyDeclaration, vdf, _edge_variablesContainer });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldDec2Property_WithModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			FieldDec2Property_WithModifier _this, Match match, Modifier modifier, MFieldDefinition bodyDeclaration,
			VariableDeclarationFragment vdf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, modifier, bodyDeclaration, vdf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property_WithModifier_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldDec2Property_WithModifier _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldDec2Property_WithModifier_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_24_1_prepare_blackB(
			FieldDec2Property_WithModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("modifier");
		EObject _localVariable_2 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = sourceMatch.getObject("vdf");
		EObject tmpFeature = _localVariable_0;
		EObject tmpModifier = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpVdf = _localVariable_3;
		if (tmpFeature instanceof Property) {
			Property feature = (Property) tmpFeature;
			if (tmpModifier instanceof Modifier) {
				Modifier modifier = (Modifier) tmpModifier;
				if (tmpBodyDeclaration instanceof MFieldDefinition) {
					MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
					if (tmpVdf instanceof VariableDeclarationFragment) {
						VariableDeclarationFragment vdf = (VariableDeclarationFragment) tmpVdf;
						return new Object[] { feature, modifier, bodyDeclaration, vdf, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_24_2_matchsrctrgcontext_blackBBBBBB(
			Property feature, Modifier modifier, MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { feature, modifier, bodyDeclaration, vdf, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldDec2Property_WithModifier_24_2_matchsrctrgcontext_binding = pattern_FieldDec2Property_WithModifier_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_FieldDec2Property_WithModifier_24_2_matchsrctrgcontext_binding != null) {
			Property feature = (Property) result_pattern_FieldDec2Property_WithModifier_24_2_matchsrctrgcontext_binding[0];
			Modifier modifier = (Modifier) result_pattern_FieldDec2Property_WithModifier_24_2_matchsrctrgcontext_binding[1];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result_pattern_FieldDec2Property_WithModifier_24_2_matchsrctrgcontext_binding[2];
			VariableDeclarationFragment vdf = (VariableDeclarationFragment) result_pattern_FieldDec2Property_WithModifier_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_FieldDec2Property_WithModifier_24_2_matchsrctrgcontext_black = pattern_FieldDec2Property_WithModifier_24_2_matchsrctrgcontext_blackBBBBBB(
					feature, modifier, bodyDeclaration, vdf, sourceMatch, targetMatch);
			if (result_pattern_FieldDec2Property_WithModifier_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, modifier, bodyDeclaration, vdf, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_24_3_solvecsp_bindingFBBBBBBB(
			FieldDec2Property_WithModifier _this, Property feature, Modifier modifier, MFieldDefinition bodyDeclaration,
			VariableDeclarationFragment vdf, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(feature, modifier, bodyDeclaration, vdf, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, feature, modifier, bodyDeclaration, vdf, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			FieldDec2Property_WithModifier _this, Property feature, Modifier modifier, MFieldDefinition bodyDeclaration,
			VariableDeclarationFragment vdf, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldDec2Property_WithModifier_24_3_solvecsp_binding = pattern_FieldDec2Property_WithModifier_24_3_solvecsp_bindingFBBBBBBB(
				_this, feature, modifier, bodyDeclaration, vdf, sourceMatch, targetMatch);
		if (result_pattern_FieldDec2Property_WithModifier_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property_WithModifier_24_3_solvecsp_binding[0];

			Object[] result_pattern_FieldDec2Property_WithModifier_24_3_solvecsp_black = pattern_FieldDec2Property_WithModifier_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_FieldDec2Property_WithModifier_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, modifier, bodyDeclaration, vdf, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_WithModifier_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property_WithModifier_24_5_matchcorrcontext_blackBB(
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_24_5_matchcorrcontext_greenBBF(
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "FieldDec2Property_WithModifier";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_24_6_createcorrespondence_blackBBBBB(
			Property feature, Modifier modifier, MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf,
			CCMatch ccMatch) {
		return new Object[] { feature, modifier, bodyDeclaration, vdf, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_24_6_createcorrespondence_greenFBFBBB(
			Property feature, Modifier modifier, MFieldDefinition bodyDeclaration, CCMatch ccMatch) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		m2f.setTarget(feature);
		m2f.setSource(modifier);
		ccMatch.getCreateCorr().add(m2f);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		ccMatch.getCreateCorr().add(b2e);
		return new Object[] { m2f, feature, b2e, modifier, bodyDeclaration, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "FieldDec2Property_WithModifier";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDec2Property_WithModifier_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_27_1_matchtggpattern_black_nac_0BB(
			MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		for (VariableDeclarationFragment __DEC_bodyDeclaration_variablesContainer_262136 : bodyDeclaration
				.getFragments()) {
			if (!vdf.equals(__DEC_bodyDeclaration_variablesContainer_262136)) {
				return new Object[] { bodyDeclaration, vdf };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_27_1_matchtggpattern_blackBBB(Modifier modifier,
			MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		if (bodyDeclaration.equals(vdf.getVariablesContainer())) {
			if (modifier.equals(bodyDeclaration.getModifier())) {
				if (pattern_FieldDec2Property_WithModifier_27_1_matchtggpattern_black_nac_0BB(bodyDeclaration,
						vdf) == null) {
					return new Object[] { modifier, bodyDeclaration, vdf };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_WithModifier_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property_WithModifier_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_28_1_matchtggpattern_black_nac_0B(
			Property feature) {
		Type __DEC_feature_type_440842 = feature.getType();
		if (__DEC_feature_type_440842 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_28_1_matchtggpattern_blackB(Property feature) {
		if (pattern_FieldDec2Property_WithModifier_28_1_matchtggpattern_black_nac_0B(feature) == null) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_WithModifier_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property_WithModifier_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_29_1_createresult_blackB(
			FieldDec2Property_WithModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_29_2_isapplicablecore_blackB(
			FieldDec2Property_WithModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_29_3_solveCSP_bindingFBBB(
			FieldDec2Property_WithModifier _this, IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_29_3_solveCSP_bindingAndBlackFBBB(
			FieldDec2Property_WithModifier _this, IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldDec2Property_WithModifier_29_3_solveCSP_binding = pattern_FieldDec2Property_WithModifier_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_FieldDec2Property_WithModifier_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property_WithModifier_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property_WithModifier_29_3_solveCSP_black = pattern_FieldDec2Property_WithModifier_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property_WithModifier_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property_WithModifier_29_4_checkCSP_expressionFBB(
			FieldDec2Property_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_29_6_perform_blackB(
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_FieldDec2Property_WithModifier_29_6_perform_greenFFFFFFBB(
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		Property feature = UMLFactory.eINSTANCE.createProperty();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Modifier modifier = JavaFactory.eINSTANCE.createModifier();
		MFieldDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		VariableDeclarationFragment vdf = JavaFactory.eINSTANCE.createVariableDeclarationFragment();
		Object _localVariable_0 = csp.getValue("feature", "isStatic");
		Object _localVariable_1 = csp.getValue("feature", "visibility");
		Object _localVariable_2 = csp.getValue("feature", "name");
		Object _localVariable_3 = csp.getValue("modifier", "static");
		Object _localVariable_4 = csp.getValue("modifier", "visibility");
		Object _localVariable_5 = csp.getValue("vdf", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_6 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(m2f);
		m2f.setTarget(feature);
		ruleResult.getTargetObjects().add(feature);
		b2e.setTarget(feature);
		ruleResult.getCorrObjects().add(b2e);
		m2f.setSource(modifier);
		ruleResult.getSourceObjects().add(modifier);
		bodyDeclaration.setModifier(modifier);
		b2e.setSource(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		vdf.setVariablesContainer(bodyDeclaration);
		ruleResult.getSourceObjects().add(vdf);
		boolean feature_isStatic_prime = (boolean) _localVariable_0;
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_1;
		String feature_name_prime = (String) _localVariable_2;
		boolean modifier_static_prime = (boolean) _localVariable_3;
		org.eclipse.modisco.java.VisibilityKind modifier_visibility_prime = (org.eclipse.modisco.java.VisibilityKind) _localVariable_4;
		String vdf_name_prime = (String) _localVariable_5;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_6);
		feature.setIsStatic(Boolean.valueOf(feature_isStatic_prime));
		feature.setVisibility(feature_visibility_prime);
		feature.setName(feature_name_prime);
		modifier.setStatic(Boolean.valueOf(modifier_static_prime));
		modifier.setVisibility(modifier_visibility_prime);
		vdf.setName(vdf_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { m2f, feature, b2e, modifier, bodyDeclaration, vdf, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_FieldDec2Property_WithModifier_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldDec2Property_WithModifierImpl
