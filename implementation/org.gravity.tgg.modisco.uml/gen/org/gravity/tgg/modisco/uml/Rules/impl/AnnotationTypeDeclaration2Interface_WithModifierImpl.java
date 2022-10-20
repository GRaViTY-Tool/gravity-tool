/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.modisco.java.Modifier;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.VisibilityKind;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.Modifier2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.AnnotationTypeDeclaration2Interface_WithModifier;
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
 * An implementation of the model object '<em><b>Annotation Type Declaration2 Interface With Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationTypeDeclaration2Interface_WithModifierImpl extends AbstractRuleImpl
		implements AnnotationTypeDeclaration2Interface_WithModifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeDeclaration2Interface_WithModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotationTypeDeclaration2Interface_WithModifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {

		Object[] result1_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_1_initialbindings_blackBBBB(this, match,
						bodyDeclaration, modifier);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = "
					+ modifier + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_2_SolveCSP_bindingAndBlackFBBBB(this, match,
						bodyDeclaration, modifier);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = "
					+ modifier + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_4_collectelementstobetranslated_blackBBB(
							match, bodyDeclaration, modifier);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
			}
			AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_4_collectelementstobetranslated_greenBBBFF(
							match, bodyDeclaration, modifier);
			//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_5_collectcontextelements_blackBBB(match,
							bodyDeclaration, modifier);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
			}
			// 
			AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_6_registerobjectstomatch_expressionBBBB(
							this, match, bodyDeclaration, modifier);
			return AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_7_expressionF();
		} else {
			return AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_1_performtransformation_bindingAndBlackFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AnnotationTypeDeclaration bodyDeclaration = (AnnotationTypeDeclaration) result1_bindingAndBlack[0];
		Modifier modifier = (Modifier) result1_bindingAndBlack[1];
		CSP csp = (CSP) result1_bindingAndBlack[2];
		Object[] result1_green = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_1_performtransformation_greenFFFBBB(
						bodyDeclaration, modifier, csp);
		Modifier2NamedElement m2f = (Modifier2NamedElement) result1_green[0];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[1];
		Interface feature = (Interface) result1_green[2];

		Object[] result2_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_2_collecttranslatedelements_blackBBBBB(m2f,
						b2e, feature, bodyDeclaration, modifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2f] = " + m2f + ", "
					+ "[b2e] = " + b2e + ", " + "[feature] = " + feature + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
		}
		Object[] result2_green = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_2_collecttranslatedelements_greenFBBBBB(m2f,
						b2e, feature, bodyDeclaration, modifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_3_bookkeepingforedges_blackBBBBBB(
						ruleresult, m2f, b2e, feature, bodyDeclaration, modifier);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[b2e] = " + b2e + ", " + "[feature] = " + feature + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
		}
		AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_3_bookkeepingforedges_greenBBBBBBFFFFFF(
						ruleresult, m2f, b2e, feature, bodyDeclaration, modifier);
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[11];

		// 
		// 
		AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_5_registerobjects_expressionBBBBBBB(this,
						ruleresult, m2f, b2e, feature, bodyDeclaration, modifier);
		return AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_1_preparereturnvalue_bindingAndBlackFFB(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_1_preparereturnvalue_greenBF(
						performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AnnotationTypeDeclaration bodyDeclaration = (AnnotationTypeDeclaration) result2_binding[0];
		Modifier modifier = (Modifier) result2_binding[1];
		for (Object[] result2_black : AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_2_corematch_blackBBB(bodyDeclaration,
						modifier, match)) {
			// ForEach 
			for (Object[] result3_black : AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_3_findcontext_blackBB(bodyDeclaration,
							modifier)) {
				Object[] result3_green = AnnotationTypeDeclaration2Interface_WithModifierImpl
						.pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_3_findcontext_greenBBFFF(
								bodyDeclaration, modifier);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[3];
				//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[4];

				Object[] result4_bindingAndBlack = AnnotationTypeDeclaration2Interface_WithModifierImpl
						.pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_4_solveCSP_bindingAndBlackFBBBB(
								this, isApplicableMatch, bodyDeclaration, modifier);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationTypeDeclaration2Interface_WithModifierImpl
						.pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_5_checkCSP_expressionFBB(this,
								csp)) {

					Object[] result6_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
							.pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationTypeDeclaration2Interface_WithModifierImpl
							.pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("modifier", modifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, AnnotationTypeDeclaration bodyDeclaration,
			Modifier modifier) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", true, csp);
		var_modifier_visibility.setValue(modifier.getVisibility());
		var_modifier_visibility.setType("java.VisibilityKind");

		// Create unbound variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", csp);
		var_feature_visibility.setType("uml.VisibilityKind");

		// Create constraints
		Eq eq = new Eq();
		NonParameterizedName nonParameterizedName = new NonParameterizedName();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(nonParameterizedName);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		nonParameterizedName.setRuleName("NoRuleName");
		nonParameterizedName.solve(var_feature_name);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("modifier", modifier);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject m2f, EObject b2e, EObject feature,
			EObject bodyDeclaration, EObject modifier) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("modifier", modifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
						.equals("java.AnnotationTypeDeclaration.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("modifier").eClass()).equals("java.Modifier.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Interface feature) {

		Object[] result1_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_1_initialbindings_blackBBB(this, match,
						feature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_2_SolveCSP_bindingAndBlackFBBB(this, match,
						feature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_4_collectelementstobetranslated_blackBB(
							match, feature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ".");
			}
			AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_4_collectelementstobetranslated_greenBB(
							match, feature);

			Object[] result5_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_5_collectcontextelements_blackBB(match,
							feature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ".");
			}
			// 
			AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_6_registerobjectstomatch_expressionBBB(
							this, match, feature);
			return AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_7_expressionF();
		} else {
			return AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_1_performtransformation_bindingAndBlackFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Interface feature = (Interface) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_1_performtransformation_greenFFBFFB(
						feature, csp);
		Modifier2NamedElement m2f = (Modifier2NamedElement) result1_green[0];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[1];
		AnnotationTypeDeclaration bodyDeclaration = (AnnotationTypeDeclaration) result1_green[3];
		Modifier modifier = (Modifier) result1_green[4];

		Object[] result2_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_2_collecttranslatedelements_blackBBBBB(m2f,
						b2e, feature, bodyDeclaration, modifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2f] = " + m2f + ", "
					+ "[b2e] = " + b2e + ", " + "[feature] = " + feature + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
		}
		Object[] result2_green = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_2_collecttranslatedelements_greenFBBBBB(
						m2f, b2e, feature, bodyDeclaration, modifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_3_bookkeepingforedges_blackBBBBBB(
						ruleresult, m2f, b2e, feature, bodyDeclaration, modifier);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[b2e] = " + b2e + ", " + "[feature] = " + feature + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
		}
		AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_3_bookkeepingforedges_greenBBBBBBFFFFFF(
						ruleresult, m2f, b2e, feature, bodyDeclaration, modifier);
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[11];

		// 
		// 
		AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_5_registerobjects_expressionBBBBBBB(this,
						ruleresult, m2f, b2e, feature, bodyDeclaration, modifier);
		return AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_1_preparereturnvalue_bindingAndBlackFFB(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_1_preparereturnvalue_greenBF(
						performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Interface feature = (Interface) result2_binding[0];
		for (Object[] result2_black : AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_2_corematch_blackBB(feature, match)) {
			// ForEach 
			for (Object[] result3_black : AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_3_findcontext_blackB(feature)) {
				Object[] result3_green = AnnotationTypeDeclaration2Interface_WithModifierImpl
						.pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_3_findcontext_greenBF(feature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = AnnotationTypeDeclaration2Interface_WithModifierImpl
						.pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_4_solveCSP_bindingAndBlackFBBB(
								this, isApplicableMatch, feature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationTypeDeclaration2Interface_WithModifierImpl
						.pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_5_checkCSP_expressionFBB(this,
								csp)) {

					Object[] result6_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
							.pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationTypeDeclaration2Interface_WithModifierImpl
							.pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Interface feature) {
		match.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Interface feature) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Interface feature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", true, csp);
		var_feature_visibility.setValue(feature.getVisibility());
		var_feature_visibility.setType("uml.VisibilityKind");

		// Create unbound variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", csp);
		var_modifier_visibility.setType("java.VisibilityKind");

		// Create constraints
		Eq eq = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);

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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject m2f, EObject b2e, EObject feature,
			EObject bodyDeclaration, EObject modifier) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("modifier", modifier);

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
	public EObjectContainer isAppropriate_BWD_Interface_3(Interface feature) {

		Object[] result1_bindingAndBlack = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_1_preparereturnvalue_bindingAndBlackFFBF(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_2_testcorematchandDECs_blackB(feature)) {
			Object[] result2_green = AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_2_testcorematchandDECs_greenFB(
							__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
							this, match, feature)) {
				// 
				if (AnnotationTypeDeclaration2Interface_WithModifierImpl
						.pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
							.pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationTypeDeclaration2Interface_WithModifierImpl
							.pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_143(EMoflonEdge _edge_modifier) {

		Object[] result1_bindingAndBlack = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_1_preparereturnvalue_bindingAndBlackFFBF(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_2_testcorematchandDECs_blackFFB(
						_edge_modifier)) {
			AnnotationTypeDeclaration bodyDeclaration = (AnnotationTypeDeclaration) result2_black[0];
			Modifier modifier = (Modifier) result2_black[1];
			Object[] result2_green = AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_2_testcorematchandDECs_greenFB(
							__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, bodyDeclaration, modifier)) {
				// 
				if (AnnotationTypeDeclaration2Interface_WithModifierImpl
						.pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
							.pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationTypeDeclaration2Interface_WithModifierImpl
							.pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnnotationTypeDeclaration2Interface_WithModifier");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_visibility.setValue(__helper.getValue("feature", "visibility"));
		var_feature_visibility.setType("uml.VisibilityKind");

		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_visibility.setValue(__helper.getValue("modifier", "visibility"));
		var_modifier_visibility.setType("java.VisibilityKind");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		NonParameterizedName nonParameterizedName1 = new NonParameterizedName();
		csp.getConstraints().add(nonParameterizedName1);

		JVisibility2umlVisibility jVisibility2umlVisibility2 = new JVisibility2umlVisibility();
		csp.getConstraints().add(jVisibility2umlVisibility2);

		eq0.setRuleName("AnnotationTypeDeclaration2Interface_WithModifier");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		nonParameterizedName1.setRuleName("AnnotationTypeDeclaration2Interface_WithModifier");
		nonParameterizedName1.solve(var_feature_name);

		jVisibility2umlVisibility2.setRuleName("AnnotationTypeDeclaration2Interface_WithModifier");
		jVisibility2umlVisibility2.solve(var_modifier_visibility, var_feature_visibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_feature_name.setBound(false);
			var_feature_name.setBound(false);
			var_feature_visibility.setBound(false);
			eq0.solve(var_bodyDeclaration_name, var_feature_name);
			nonParameterizedName1.solve(var_feature_name);
			jVisibility2umlVisibility2.solve(var_modifier_visibility, var_feature_visibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("feature", "name", var_feature_name.getValue());
				__helper.setValue("feature", "name", var_feature_name.getValue());
				__helper.setValue("feature", "visibility", var_feature_visibility.getValue());
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
		ruleResult.setRule("AnnotationTypeDeclaration2Interface_WithModifier");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_visibility.setValue(__helper.getValue("feature", "visibility"));
		var_feature_visibility.setType("uml.VisibilityKind");

		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_visibility.setValue(__helper.getValue("modifier", "visibility"));
		var_modifier_visibility.setType("java.VisibilityKind");

		NonParameterizedName nonParameterizedName0 = new NonParameterizedName();
		csp.getConstraints().add(nonParameterizedName0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		JVisibility2umlVisibility jVisibility2umlVisibility2 = new JVisibility2umlVisibility();
		csp.getConstraints().add(jVisibility2umlVisibility2);

		nonParameterizedName0.setRuleName("AnnotationTypeDeclaration2Interface_WithModifier");
		nonParameterizedName0.solve(var_feature_name);

		eq1.setRuleName("AnnotationTypeDeclaration2Interface_WithModifier");
		eq1.solve(var_bodyDeclaration_name, var_feature_name);

		jVisibility2umlVisibility2.setRuleName("AnnotationTypeDeclaration2Interface_WithModifier");
		jVisibility2umlVisibility2.solve(var_modifier_visibility, var_feature_visibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_bodyDeclaration_name.setBound(false);
			var_modifier_visibility.setBound(false);
			nonParameterizedName0.solve(var_feature_name);
			eq1.solve(var_bodyDeclaration_name, var_feature_name);
			jVisibility2umlVisibility2.solve(var_modifier_visibility, var_feature_visibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("bodyDeclaration", "name", var_bodyDeclaration_name.getValue());
				__helper.setValue("modifier", "visibility", var_modifier_visibility.getValue());
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

		Object[] result1_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Interface feature = (Interface) result2_bindingAndBlack[0];
		AnnotationTypeDeclaration bodyDeclaration = (AnnotationTypeDeclaration) result2_bindingAndBlack[1];
		Modifier modifier = (Modifier) result2_bindingAndBlack[2];

		Object[] result3_bindingAndBlack = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_3_solvecsp_bindingAndBlackFBBBBBB(this,
						feature, bodyDeclaration, modifier, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[feature] = " + feature
							+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ", "
							+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_5_matchcorrcontext_blackBB(sourceMatch,
							targetMatch)) {
				Object[] result5_green = AnnotationTypeDeclaration2Interface_WithModifierImpl
						.pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_5_matchcorrcontext_greenBBF(
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
						.pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_6_createcorrespondence_blackBBBB(
								feature, bodyDeclaration, modifier, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationTypeDeclaration2Interface_WithModifierImpl
						.pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_6_createcorrespondence_greenFFBBBB(
								feature, bodyDeclaration, modifier, ccMatch);
				//nothing Modifier2NamedElement m2f = (Modifier2NamedElement) result6_green[0];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[1];

				Object[] result7_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
						.pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_7_addtoreturnedresult_blackBB(
								result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationTypeDeclaration2Interface_WithModifierImpl
						.pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_7_addtoreturnedresult_greenBB(
								result, ccMatch);

			}

		} else {
		}
		return AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Interface feature, AnnotationTypeDeclaration bodyDeclaration, Modifier modifier,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", true, csp);
		var_modifier_visibility.setValue(modifier.getVisibility());
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", true, csp);
		var_feature_visibility.setValue(feature.getVisibility());
		var_feature_visibility.setType("uml.VisibilityKind");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		NonParameterizedName nonParameterizedName = new NonParameterizedName();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(nonParameterizedName);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		nonParameterizedName.setRuleName("NoRuleName");
		nonParameterizedName.solve(var_feature_name);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);
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
	public boolean checkDEC_FWD(AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {// 
		Object[] result1_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_27_1_matchtggpattern_blackBB(bodyDeclaration,
						modifier);
		if (result1_black != null) {
			return AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_27_2_expressionF();
		} else {
			return AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Interface feature) {// 
		Object[] result1_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_28_1_matchtggpattern_blackB(feature);
		if (result1_black != null) {
			return AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_28_2_expressionF();
		} else {
			return AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_3_solveCSP_bindingAndBlackFBBB(this,
							isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationTypeDeclaration2Interface_WithModifierImpl
					.pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = AnnotationTypeDeclaration2Interface_WithModifierImpl
						.pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				AnnotationTypeDeclaration2Interface_WithModifierImpl
						.pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_6_perform_greenFFFFFBB(ruleResult,
								csp);
				//nothing Modifier2NamedElement m2f = (Modifier2NamedElement) result6_green[0];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[1];
				//nothing Interface feature = (Interface) result6_green[2];
				//nothing AnnotationTypeDeclaration bodyDeclaration = (AnnotationTypeDeclaration) result6_green[3];
				//nothing Modifier modifier = (Modifier) result6_green[4];

			} else {
			}

		} else {
		}
		return AnnotationTypeDeclaration2Interface_WithModifierImpl
				.pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_7_expressionFB(ruleResult);
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
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", csp);
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", csp);
		var_feature_visibility.setType("uml.VisibilityKind");

		// Create constraints
		NonParameterizedName nonParameterizedName = new NonParameterizedName();
		Eq eq = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(nonParameterizedName);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		nonParameterizedName.setRuleName("NoRuleName");
		nonParameterizedName.solve(var_feature_name);
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);

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
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPROPRIATE_FWD__MATCH_ANNOTATIONTYPEDECLARATION_MODIFIER:
			return isAppropriate_FWD((Match) arguments.get(0), (AnnotationTypeDeclaration) arguments.get(1),
					(Modifier) arguments.get(2));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANNOTATIONTYPEDECLARATION_MODIFIER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AnnotationTypeDeclaration) arguments.get(1),
					(Modifier) arguments.get(2));
			return null;
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANNOTATIONTYPEDECLARATION_MODIFIER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AnnotationTypeDeclaration) arguments.get(1),
					(Modifier) arguments.get(2));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ANNOTATIONTYPEDECLARATION_MODIFIER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(AnnotationTypeDeclaration) arguments.get(1), (Modifier) arguments.get(2));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5));
			return null;
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPROPRIATE_BWD__MATCH_INTERFACE:
			return isAppropriate_BWD((Match) arguments.get(0), (Interface) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERFACE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Interface) arguments.get(1));
			return null;
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERFACE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Interface) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Interface) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5));
			return null;
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPROPRIATE_BWD_INTERFACE_3__INTERFACE:
			return isAppropriate_BWD_Interface_3((Interface) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_143__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_143((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_CC__INTERFACE_ANNOTATIONTYPEDECLARATION_MODIFIER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Interface) arguments.get(0), (AnnotationTypeDeclaration) arguments.get(1),
					(Modifier) arguments.get(2), (Match) arguments.get(3), (Match) arguments.get(4));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___CHECK_DEC_FWD__ANNOTATIONTYPEDECLARATION_MODIFIER:
			return checkDEC_FWD((AnnotationTypeDeclaration) arguments.get(0), (Modifier) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___CHECK_DEC_BWD__INTERFACE:
			return checkDEC_BWD((Interface) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_DECLARATION2_INTERFACE_WITH_MODIFIER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_1_initialbindings_blackBBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, Match match,
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		return new Object[] { _this, match, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_2_SolveCSP_bindingFBBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, Match match,
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration, modifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration, modifier };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_2_SolveCSP_bindingAndBlackFBBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, Match match,
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_2_SolveCSP_binding = pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_2_SolveCSP_bindingFBBBB(
				_this, match, bodyDeclaration, modifier);
		if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_2_SolveCSP_black = pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration, modifier };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_3_CheckCSP_expressionFBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_4_collectelementstobetranslated_blackBBB(
			Match match, AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		return new Object[] { match, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		match.getToBeTranslatedNodes().add(modifier);
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		match.getToBeTranslatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		return new Object[] { match, bodyDeclaration, modifier, bodyDeclaration__modifier____modifier,
				modifier__bodyDeclaration____bodyDeclaration };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_5_collectcontextelements_blackBBB(
			Match match, AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		return new Object[] { match, bodyDeclaration, modifier };
	}

	public static final void pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_6_registerobjectstomatch_expressionBBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, Match match,
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration, modifier);

	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("modifier");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpModifier = _localVariable_1;
		if (tmpBodyDeclaration instanceof AnnotationTypeDeclaration) {
			AnnotationTypeDeclaration bodyDeclaration = (AnnotationTypeDeclaration) tmpBodyDeclaration;
			if (tmpModifier instanceof Modifier) {
				Modifier modifier = (Modifier) tmpModifier;
				return new Object[] { bodyDeclaration, modifier, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_1_performtransformation_blackBBFBB(
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier,
			AnnotationTypeDeclaration2Interface_WithModifier _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { bodyDeclaration, modifier, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_1_performtransformation_bindingAndBlackFFFBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_1_performtransformation_binding = pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_1_performtransformation_binding != null) {
			AnnotationTypeDeclaration bodyDeclaration = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_1_performtransformation_binding[0];
			Modifier modifier = (Modifier) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_1_performtransformation_binding[1];

			Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_1_performtransformation_black = pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_1_performtransformation_blackBBFBB(
					bodyDeclaration, modifier, _this, isApplicableMatch);
			if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_1_performtransformation_black[2];

				return new Object[] { bodyDeclaration, modifier, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_1_performtransformation_greenFFFBBB(
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Interface feature = UMLFactory.eINSTANCE.createInterface();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("feature", "visibility");
		m2f.setSource(modifier);
		b2e.setSource(bodyDeclaration);
		m2f.setTarget(feature);
		b2e.setTarget(feature);
		String feature_name_prime = (String) _localVariable_0;
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_1;
		feature.setName(feature_name_prime);
		feature.setVisibility(feature_visibility_prime);
		return new Object[] { m2f, b2e, feature, bodyDeclaration, modifier, csp };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_2_collecttranslatedelements_blackBBBBB(
			Modifier2NamedElement m2f, ASTNode2Element b2e, Interface feature,
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		return new Object[] { m2f, b2e, feature, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_2_collecttranslatedelements_greenFBBBBB(
			Modifier2NamedElement m2f, ASTNode2Element b2e, Interface feature,
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2f);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		ruleresult.getTranslatedElements().add(modifier);
		return new Object[] { ruleresult, m2f, b2e, feature, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_3_bookkeepingforedges_blackBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject b2e, EObject feature, EObject bodyDeclaration,
			EObject modifier) {
		if (!m2f.equals(modifier)) {
			if (!b2e.equals(m2f)) {
				if (!b2e.equals(feature)) {
					if (!b2e.equals(bodyDeclaration)) {
						if (!b2e.equals(modifier)) {
							if (!feature.equals(m2f)) {
								if (!feature.equals(modifier)) {
									if (!bodyDeclaration.equals(m2f)) {
										if (!bodyDeclaration.equals(feature)) {
											if (!bodyDeclaration.equals(modifier)) {
												return new Object[] { ruleresult, m2f, b2e, feature, bodyDeclaration,
														modifier };
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

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_3_bookkeepingforedges_greenBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject m2f, EObject b2e, EObject feature, EObject bodyDeclaration,
			EObject modifier) {
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeDeclaration2Interface_WithModifier";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String m2f__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String m2f__modifier____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
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
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		m2f__feature____target.setName(m2f__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, b2e, feature, bodyDeclaration, modifier,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration,
				m2f__feature____target, b2e__bodyDeclaration____source, m2f__modifier____source,
				b2e__feature____target };
	}

	public static final void pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_5_registerobjects_expressionBBBBBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, PerformRuleResult ruleresult, EObject m2f,
			EObject b2e, EObject feature, EObject bodyDeclaration, EObject modifier) {
		_this.registerObjects_FWD(ruleresult, m2f, b2e, feature, bodyDeclaration, modifier);

	}

	public static final PerformRuleResult pattern_AnnotationTypeDeclaration2Interface_WithModifier_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_1_preparereturnvalue_bindingFB(
			AnnotationTypeDeclaration2Interface_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_1_preparereturnvalue_blackFBB(
			EClass eClass, AnnotationTypeDeclaration2Interface_WithModifier _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationTypeDeclaration2Interface_WithModifier _this) {
		Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_1_preparereturnvalue_binding = pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_1_preparereturnvalue_black = pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationTypeDeclaration2Interface_WithModifier";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_2_corematch_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject _localVariable_1 = match.getObject("modifier");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpModifier = _localVariable_1;
		if (tmpBodyDeclaration instanceof AnnotationTypeDeclaration) {
			AnnotationTypeDeclaration bodyDeclaration = (AnnotationTypeDeclaration) tmpBodyDeclaration;
			if (tmpModifier instanceof Modifier) {
				Modifier modifier = (Modifier) tmpModifier;
				return new Object[] { bodyDeclaration, modifier, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_2_corematch_blackBBB(
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { bodyDeclaration, modifier, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_3_findcontext_blackBB(
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (modifier.equals(bodyDeclaration.getModifier())) {
			_result.add(new Object[] { bodyDeclaration, modifier });
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_3_findcontext_greenBBFFF(
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(modifier);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(modifier__bodyDeclaration____bodyDeclaration);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		return new Object[] { bodyDeclaration, modifier, isApplicableMatch, bodyDeclaration__modifier____modifier,
				modifier__bodyDeclaration____bodyDeclaration };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_4_solveCSP_bindingFBBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, IsApplicableMatch isApplicableMatch,
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, bodyDeclaration, modifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, modifier };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_4_solveCSP_bindingAndBlackFBBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, IsApplicableMatch isApplicableMatch,
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_4_solveCSP_binding = pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_4_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, bodyDeclaration, modifier);
		if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_4_solveCSP_black = pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, modifier };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_5_checkCSP_expressionFBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationTypeDeclaration2Interface_WithModifier";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeDeclaration2Interface_WithModifier_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_1_initialbindings_blackBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, Match match, Interface feature) {
		return new Object[] { _this, match, feature };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_2_SolveCSP_bindingFBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, Match match, Interface feature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_2_SolveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_2_SolveCSP_bindingAndBlackFBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, Match match, Interface feature) {
		Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_2_SolveCSP_binding = pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_2_SolveCSP_bindingFBBB(
				_this, match, feature);
		if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_2_SolveCSP_black = pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_3_CheckCSP_expressionFBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_4_collectelementstobetranslated_blackBB(
			Match match, Interface feature) {
		return new Object[] { match, feature };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_4_collectelementstobetranslated_greenBB(
			Match match, Interface feature) {
		match.getToBeTranslatedNodes().add(feature);
		return new Object[] { match, feature };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_5_collectcontextelements_blackBB(
			Match match, Interface feature) {
		return new Object[] { match, feature };
	}

	public static final void pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_6_registerobjectstomatch_expressionBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, Match match, Interface feature) {
		_this.registerObjectsToMatch_BWD(match, feature);

	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject tmpFeature = _localVariable_0;
		if (tmpFeature instanceof Interface) {
			Interface feature = (Interface) tmpFeature;
			return new Object[] { feature, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_1_performtransformation_blackBFBB(
			Interface feature, AnnotationTypeDeclaration2Interface_WithModifier _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { feature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_1_performtransformation_bindingAndBlackFFBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_1_performtransformation_binding = pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_1_performtransformation_binding != null) {
			Interface feature = (Interface) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_1_performtransformation_binding[0];

			Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_1_performtransformation_black = pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_1_performtransformation_blackBFBB(
					feature, _this, isApplicableMatch);
			if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_1_performtransformation_black[1];

				return new Object[] { feature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_1_performtransformation_greenFFBFFB(
			Interface feature, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		AnnotationTypeDeclaration bodyDeclaration = JavaFactory.eINSTANCE.createAnnotationTypeDeclaration();
		Modifier modifier = JavaFactory.eINSTANCE.createModifier();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		Object _localVariable_1 = csp.getValue("modifier", "visibility");
		m2f.setTarget(feature);
		b2e.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		bodyDeclaration.setModifier(modifier);
		m2f.setSource(modifier);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		org.eclipse.modisco.java.VisibilityKind modifier_visibility_prime = (org.eclipse.modisco.java.VisibilityKind) _localVariable_1;
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		modifier.setVisibility(modifier_visibility_prime);
		return new Object[] { m2f, b2e, feature, bodyDeclaration, modifier, csp };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_2_collecttranslatedelements_blackBBBBB(
			Modifier2NamedElement m2f, ASTNode2Element b2e, Interface feature,
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		return new Object[] { m2f, b2e, feature, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_2_collecttranslatedelements_greenFBBBBB(
			Modifier2NamedElement m2f, ASTNode2Element b2e, Interface feature,
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2f);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		ruleresult.getCreatedElements().add(modifier);
		return new Object[] { ruleresult, m2f, b2e, feature, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_3_bookkeepingforedges_blackBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject b2e, EObject feature, EObject bodyDeclaration,
			EObject modifier) {
		if (!m2f.equals(modifier)) {
			if (!b2e.equals(m2f)) {
				if (!b2e.equals(feature)) {
					if (!b2e.equals(bodyDeclaration)) {
						if (!b2e.equals(modifier)) {
							if (!feature.equals(m2f)) {
								if (!feature.equals(modifier)) {
									if (!bodyDeclaration.equals(m2f)) {
										if (!bodyDeclaration.equals(feature)) {
											if (!bodyDeclaration.equals(modifier)) {
												return new Object[] { ruleresult, m2f, b2e, feature, bodyDeclaration,
														modifier };
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

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_3_bookkeepingforedges_greenBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject m2f, EObject b2e, EObject feature, EObject bodyDeclaration,
			EObject modifier) {
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeDeclaration2Interface_WithModifier";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String m2f__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String m2f__modifier____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
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
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		m2f__feature____target.setName(m2f__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, b2e, feature, bodyDeclaration, modifier,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration,
				m2f__feature____target, b2e__bodyDeclaration____source, m2f__modifier____source,
				b2e__feature____target };
	}

	public static final void pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_5_registerobjects_expressionBBBBBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, PerformRuleResult ruleresult, EObject m2f,
			EObject b2e, EObject feature, EObject bodyDeclaration, EObject modifier) {
		_this.registerObjects_BWD(ruleresult, m2f, b2e, feature, bodyDeclaration, modifier);

	}

	public static final PerformRuleResult pattern_AnnotationTypeDeclaration2Interface_WithModifier_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_1_preparereturnvalue_bindingFB(
			AnnotationTypeDeclaration2Interface_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_1_preparereturnvalue_blackFBB(
			EClass eClass, AnnotationTypeDeclaration2Interface_WithModifier _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationTypeDeclaration2Interface_WithModifier _this) {
		Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_1_preparereturnvalue_binding = pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_1_preparereturnvalue_black = pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationTypeDeclaration2Interface_WithModifier";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_2_corematch_bindingFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject tmpFeature = _localVariable_0;
		if (tmpFeature instanceof Interface) {
			Interface feature = (Interface) tmpFeature;
			return new Object[] { feature, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_2_corematch_blackBB(
			Interface feature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_3_findcontext_blackB(
			Interface feature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature });
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_3_findcontext_greenBF(
			Interface feature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(feature);
		return new Object[] { feature, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_4_solveCSP_bindingFBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, IsApplicableMatch isApplicableMatch,
			Interface feature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_4_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_4_solveCSP_bindingAndBlackFBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, IsApplicableMatch isApplicableMatch,
			Interface feature) {
		Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_4_solveCSP_binding = pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, feature);
		if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_4_solveCSP_black = pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_5_checkCSP_expressionFBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationTypeDeclaration2Interface_WithModifier";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeDeclaration2Interface_WithModifier_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_1_preparereturnvalue_bindingFB(
			AnnotationTypeDeclaration2Interface_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, AnnotationTypeDeclaration2Interface_WithModifier _this) {
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

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationTypeDeclaration2Interface_WithModifier _this) {
		Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_1_preparereturnvalue_binding = pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_1_preparereturnvalue_black = pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_2_testcorematchandDECs_blackB(
			Interface feature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { feature });
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, Match match, Interface feature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationTypeDeclaration2Interface_WithModifier_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_1_preparereturnvalue_bindingFB(
			AnnotationTypeDeclaration2Interface_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, AnnotationTypeDeclaration2Interface_WithModifier _this) {
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

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationTypeDeclaration2Interface_WithModifier _this) {
		Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_1_preparereturnvalue_binding = pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_1_preparereturnvalue_black = pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_modifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpBodyDeclaration = _edge_modifier.getSrc();
		if (tmpBodyDeclaration instanceof AnnotationTypeDeclaration) {
			AnnotationTypeDeclaration bodyDeclaration = (AnnotationTypeDeclaration) tmpBodyDeclaration;
			EObject tmpModifier = _edge_modifier.getTrg();
			if (tmpModifier instanceof Modifier) {
				Modifier modifier = (Modifier) tmpModifier;
				if (modifier.equals(bodyDeclaration.getModifier())) {
					_result.add(new Object[] { bodyDeclaration, modifier, _edge_modifier });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, Match match,
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration, modifier);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationTypeDeclaration2Interface_WithModifier_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_1_prepare_blackB(
			AnnotationTypeDeclaration2Interface_WithModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_2_matchsrctrgcontext_bindingFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_2 = sourceMatch.getObject("modifier");
		EObject tmpFeature = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpModifier = _localVariable_2;
		if (tmpFeature instanceof Interface) {
			Interface feature = (Interface) tmpFeature;
			if (tmpBodyDeclaration instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration bodyDeclaration = (AnnotationTypeDeclaration) tmpBodyDeclaration;
				if (tmpModifier instanceof Modifier) {
					Modifier modifier = (Modifier) tmpModifier;
					return new Object[] { feature, bodyDeclaration, modifier, targetMatch, sourceMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_2_matchsrctrgcontext_blackBBBBB(
			Interface feature, AnnotationTypeDeclaration bodyDeclaration, Modifier modifier, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { feature, bodyDeclaration, modifier, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_2_matchsrctrgcontext_binding = pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_2_matchsrctrgcontext_bindingFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_2_matchsrctrgcontext_binding != null) {
			Interface feature = (Interface) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_2_matchsrctrgcontext_binding[0];
			AnnotationTypeDeclaration bodyDeclaration = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_2_matchsrctrgcontext_binding[1];
			Modifier modifier = (Modifier) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_2_matchsrctrgcontext_binding[2];

			Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_2_matchsrctrgcontext_black = pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_2_matchsrctrgcontext_blackBBBBB(
					feature, bodyDeclaration, modifier, sourceMatch, targetMatch);
			if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, bodyDeclaration, modifier, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_3_solvecsp_bindingFBBBBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, Interface feature,
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_3 = _this.isApplicable_solveCsp_CC(feature, bodyDeclaration, modifier, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_3;
		if (csp != null) {
			return new Object[] { csp, _this, feature, bodyDeclaration, modifier, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_3_solvecsp_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_3_solvecsp_bindingAndBlackFBBBBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, Interface feature,
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_3_solvecsp_binding = pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_3_solvecsp_bindingFBBBBBB(
				_this, feature, bodyDeclaration, modifier, sourceMatch, targetMatch);
		if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_3_solvecsp_black = pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, bodyDeclaration, modifier, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_4_checkCSP_expressionFB(
			CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_5_matchcorrcontext_blackBB(
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_5_matchcorrcontext_greenBBF(
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnnotationTypeDeclaration2Interface_WithModifier";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_6_createcorrespondence_blackBBBB(
			Interface feature, AnnotationTypeDeclaration bodyDeclaration, Modifier modifier, CCMatch ccMatch) {
		return new Object[] { feature, bodyDeclaration, modifier, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_6_createcorrespondence_greenFFBBBB(
			Interface feature, AnnotationTypeDeclaration bodyDeclaration, Modifier modifier, CCMatch ccMatch) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		m2f.setTarget(feature);
		m2f.setSource(modifier);
		ccMatch.getCreateCorr().add(m2f);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		ccMatch.getCreateCorr().add(b2e);
		return new Object[] { m2f, b2e, feature, bodyDeclaration, modifier, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnnotationTypeDeclaration2Interface_WithModifier";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeDeclaration2Interface_WithModifier_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_27_1_matchtggpattern_blackBB(
			AnnotationTypeDeclaration bodyDeclaration, Modifier modifier) {
		if (modifier.equals(bodyDeclaration.getModifier())) {
			return new Object[] { bodyDeclaration, modifier };
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_28_1_matchtggpattern_blackB(
			Interface feature) {
		return new Object[] { feature };
	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_1_createresult_blackB(
			AnnotationTypeDeclaration2Interface_WithModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_2_isapplicablecore_blackB(
			AnnotationTypeDeclaration2Interface_WithModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_3_solveCSP_bindingFBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_3_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_3_solveCSP_bindingAndBlackFBBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_3_solveCSP_binding = pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_3_solveCSP_black = pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_4_checkCSP_expressionFBB(
			AnnotationTypeDeclaration2Interface_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_6_perform_blackB(
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_6_perform_greenFFFFFBB(
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Interface feature = UMLFactory.eINSTANCE.createInterface();
		AnnotationTypeDeclaration bodyDeclaration = JavaFactory.eINSTANCE.createAnnotationTypeDeclaration();
		Modifier modifier = JavaFactory.eINSTANCE.createModifier();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("feature", "visibility");
		Object _localVariable_2 = csp.getValue("bodyDeclaration", "name");
		Object _localVariable_3 = csp.getValue("modifier", "visibility");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(m2f);
		ruleResult.getCorrObjects().add(b2e);
		m2f.setTarget(feature);
		b2e.setTarget(feature);
		ruleResult.getTargetObjects().add(feature);
		b2e.setSource(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		bodyDeclaration.setModifier(modifier);
		m2f.setSource(modifier);
		ruleResult.getSourceObjects().add(modifier);
		String feature_name_prime = (String) _localVariable_0;
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_1;
		String bodyDeclaration_name_prime = (String) _localVariable_2;
		org.eclipse.modisco.java.VisibilityKind modifier_visibility_prime = (org.eclipse.modisco.java.VisibilityKind) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		feature.setName(feature_name_prime);
		feature.setVisibility(feature_visibility_prime);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		modifier.setVisibility(modifier_visibility_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { m2f, b2e, feature, bodyDeclaration, modifier, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationTypeDeclaration2Interface_WithModifier_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationTypeDeclaration2Interface_WithModifierImpl
