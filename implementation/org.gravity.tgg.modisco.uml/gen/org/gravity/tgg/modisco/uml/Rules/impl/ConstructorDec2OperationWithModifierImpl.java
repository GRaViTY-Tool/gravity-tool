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

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.VisibilityKind;

import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.Modifier2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.ConstructorDec2OperationWithModifier;
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
 * An implementation of the model object '<em><b>Constructor Dec2 Operation With Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConstructorDec2OperationWithModifierImpl extends AbstractRuleImpl
		implements ConstructorDec2OperationWithModifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorDec2OperationWithModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getConstructorDec2OperationWithModifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MConstructorDefinition bodyDeclaration, Modifier modifier) {

		Object[] result1_black = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_0_1_initialbindings_blackBBBB(this, match,
						bodyDeclaration, modifier);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = "
					+ modifier + ".");
		}

		Object[] result2_bindingAndBlack = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_0_2_SolveCSP_bindingAndBlackFBBBB(this, match,
						bodyDeclaration, modifier);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = "
					+ modifier + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_0_4_collectelementstobetranslated_blackBBB(match,
							bodyDeclaration, modifier);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
			}
			ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_0_4_collectelementstobetranslated_greenBBBFF(match,
							bodyDeclaration, modifier);
			//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_0_5_collectcontextelements_blackBBB(match,
							bodyDeclaration, modifier);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
			}
			// 
			ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_0_6_registerobjectstomatch_expressionBBBB(this, match,
							bodyDeclaration, modifier);
			return ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_0_7_expressionF();
		} else {
			return ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_1_1_performtransformation_bindingAndBlackFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result1_bindingAndBlack[0];
		Modifier modifier = (Modifier) result1_bindingAndBlack[1];
		CSP csp = (CSP) result1_bindingAndBlack[2];
		Object[] result1_green = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_1_1_performtransformation_greenFFFBBFB(bodyDeclaration,
						modifier, csp);
		Modifier2NamedElement m2f = (Modifier2NamedElement) result1_green[0];
		Operation feature = (Operation) result1_green[1];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[2];
		Comment comment = (Comment) result1_green[5];

		Object[] result2_black = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_1_2_collecttranslatedelements_blackBBBBBB(m2f, feature,
						b2e, bodyDeclaration, modifier, comment);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2f] = " + m2f + ", "
					+ "[feature] = " + feature + ", " + "[b2e] = " + b2e + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[modifier] = " + modifier + ", " + "[comment] = " + comment + ".");
		}
		Object[] result2_green = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_1_2_collecttranslatedelements_greenFBBBBBB(m2f, feature,
						b2e, bodyDeclaration, modifier, comment);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, m2f,
						feature, b2e, bodyDeclaration, modifier, comment);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[feature] = " + feature + ", " + "[b2e] = " + b2e + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ", "
					+ "[comment] = " + comment + ".");
		}
		ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(ruleresult,
						m2f, feature, b2e, bodyDeclaration, modifier, comment);
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge feature__comment____ownedComment = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge comment__feature____annotatedElement = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[14];

		// 
		// 
		ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						m2f, feature, b2e, bodyDeclaration, modifier, comment);
		return ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result2_binding[0];
		Modifier modifier = (Modifier) result2_binding[1];
		for (Object[] result2_black : ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_2_2_corematch_blackBBB(bodyDeclaration, modifier,
						match)) {
			// ForEach 
			for (Object[] result3_black : ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_2_3_findcontext_blackBB(bodyDeclaration, modifier)) {
				Object[] result3_green = ConstructorDec2OperationWithModifierImpl
						.pattern_ConstructorDec2OperationWithModifier_2_3_findcontext_greenBBFFF(bodyDeclaration,
								modifier);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[3];
				//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[4];

				Object[] result4_bindingAndBlack = ConstructorDec2OperationWithModifierImpl
						.pattern_ConstructorDec2OperationWithModifier_2_4_solveCSP_bindingAndBlackFBBBB(this,
								isApplicableMatch, bodyDeclaration, modifier);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ConstructorDec2OperationWithModifierImpl
						.pattern_ConstructorDec2OperationWithModifier_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ConstructorDec2OperationWithModifierImpl
							.pattern_ConstructorDec2OperationWithModifier_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ConstructorDec2OperationWithModifierImpl
							.pattern_ConstructorDec2OperationWithModifier_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MConstructorDefinition bodyDeclaration, Modifier modifier) {
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("modifier", modifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MConstructorDefinition bodyDeclaration, Modifier modifier) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MConstructorDefinition bodyDeclaration,
			Modifier modifier) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");
		Variable var_modifier_static = CSPFactoryHelper.eINSTANCE.createVariable("modifier.static", true, csp);
		var_modifier_static.setValue(modifier.isStatic());
		var_modifier_static.setType("Boolean");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", true, csp);
		var_modifier_visibility.setValue(modifier.getVisibility());
		var_modifier_visibility.setType("java.VisibilityKind");

		// Create unbound variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");
		Variable var_feature_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("feature.isStatic", csp);
		var_feature_isStatic.setType("Boolean");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", csp);
		var_feature_visibility.setType("uml.VisibilityKind");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_modifier_static, var_feature_isStatic);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject b2e,
			EObject bodyDeclaration, EObject modifier, EObject comment) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("modifier", modifier);
		ruleresult.registerObject("comment", comment);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
						.equals("modisco.MConstructorDefinition.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("modifier").eClass()).equals("java.Modifier.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Operation feature, Comment comment) {

		Object[] result1_black = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_10_1_initialbindings_blackBBBB(this, match, feature,
						comment);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[comment] = " + comment + ".");
		}

		Object[] result2_bindingAndBlack = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, feature,
						comment);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[comment] = " + comment + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_10_4_collectelementstobetranslated_blackBBB(match,
							feature, comment);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[comment] = " + comment + ".");
			}
			ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_10_4_collectelementstobetranslated_greenBBBFF(match,
							feature, comment);
			//nothing EMoflonEdge feature__comment____ownedComment = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge comment__feature____annotatedElement = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_10_5_collectcontextelements_blackBBB(match, feature,
							comment);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[comment] = " + comment + ".");
			}
			// 
			ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_10_6_registerobjectstomatch_expressionBBBB(this,
							match, feature, comment);
			return ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_10_7_expressionF();
		} else {
			return ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_11_1_performtransformation_bindingAndBlackFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Operation feature = (Operation) result1_bindingAndBlack[0];
		Comment comment = (Comment) result1_bindingAndBlack[1];
		CSP csp = (CSP) result1_bindingAndBlack[2];
		Object[] result1_green = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_11_1_performtransformation_greenFBFFFB(feature, csp);
		Modifier2NamedElement m2f = (Modifier2NamedElement) result1_green[0];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[2];
		MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result1_green[3];
		Modifier modifier = (Modifier) result1_green[4];

		Object[] result2_black = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_11_2_collecttranslatedelements_blackBBBBBB(m2f, feature,
						b2e, bodyDeclaration, modifier, comment);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2f] = " + m2f + ", "
					+ "[feature] = " + feature + ", " + "[b2e] = " + b2e + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[modifier] = " + modifier + ", " + "[comment] = " + comment + ".");
		}
		Object[] result2_green = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_11_2_collecttranslatedelements_greenFBBBBBB(m2f, feature,
						b2e, bodyDeclaration, modifier, comment);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, m2f,
						feature, b2e, bodyDeclaration, modifier, comment);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[feature] = " + feature + ", " + "[b2e] = " + b2e + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ", "
					+ "[comment] = " + comment + ".");
		}
		ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(ruleresult,
						m2f, feature, b2e, bodyDeclaration, modifier, comment);
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge feature__comment____ownedComment = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge comment__feature____annotatedElement = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[14];

		// 
		// 
		ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						m2f, feature, b2e, bodyDeclaration, modifier, comment);
		return ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Operation feature = (Operation) result2_binding[0];
		Comment comment = (Comment) result2_binding[1];
		for (Object[] result2_black : ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_12_2_corematch_blackBBB(feature, comment, match)) {
			// ForEach 
			for (Object[] result3_black : ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_12_3_findcontext_blackBB(feature, comment)) {
				Object[] result3_green = ConstructorDec2OperationWithModifierImpl
						.pattern_ConstructorDec2OperationWithModifier_12_3_findcontext_greenBBFFF(feature, comment);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge feature__comment____ownedComment = (EMoflonEdge) result3_green[3];
				//nothing EMoflonEdge comment__feature____annotatedElement = (EMoflonEdge) result3_green[4];

				Object[] result4_bindingAndBlack = ConstructorDec2OperationWithModifierImpl
						.pattern_ConstructorDec2OperationWithModifier_12_4_solveCSP_bindingAndBlackFBBBB(this,
								isApplicableMatch, feature, comment);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[comment] = " + comment + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ConstructorDec2OperationWithModifierImpl
						.pattern_ConstructorDec2OperationWithModifier_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ConstructorDec2OperationWithModifierImpl
							.pattern_ConstructorDec2OperationWithModifier_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ConstructorDec2OperationWithModifierImpl
							.pattern_ConstructorDec2OperationWithModifier_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Operation feature, Comment comment) {
		match.registerObject("feature", feature);
		match.registerObject("comment", comment);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Operation feature, Comment comment) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Operation feature, Comment comment) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");
		Variable var_feature_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("feature.isStatic", true, csp);
		var_feature_isStatic.setValue(feature.isStatic());
		var_feature_isStatic.setType("Boolean");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", true, csp);
		var_feature_visibility.setValue(feature.getVisibility());
		var_feature_visibility.setType("uml.VisibilityKind");

		// Create unbound variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");
		Variable var_modifier_static = CSPFactoryHelper.eINSTANCE.createVariable("modifier.static", csp);
		var_modifier_static.setType("Boolean");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", csp);
		var_modifier_visibility.setType("java.VisibilityKind");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_modifier_static, var_feature_isStatic);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("comment", comment);
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
			EObject bodyDeclaration, EObject modifier, EObject comment) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("modifier", modifier);
		ruleresult.registerObject("comment", comment);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("feature").eClass()).equals("uml.Operation.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("comment").eClass()).equals("uml.Comment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_146(EMoflonEdge _edge_ownedComment) {

		Object[] result1_bindingAndBlack = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_20_2_testcorematchandDECs_blackFFB(_edge_ownedComment)) {
			Operation feature = (Operation) result2_black[0];
			Comment comment = (Comment) result2_black[1];
			Object[] result2_green = ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, feature, comment)) {
				// 
				if (ConstructorDec2OperationWithModifierImpl
						.pattern_ConstructorDec2OperationWithModifier_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ConstructorDec2OperationWithModifierImpl
							.pattern_ConstructorDec2OperationWithModifier_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ConstructorDec2OperationWithModifierImpl
							.pattern_ConstructorDec2OperationWithModifier_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_158(EMoflonEdge _edge_modifier) {

		Object[] result1_bindingAndBlack = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_21_2_testcorematchandDECs_blackFFB(_edge_modifier)) {
			MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result2_black[0];
			Modifier modifier = (Modifier) result2_black[1];
			Object[] result2_green = ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, bodyDeclaration, modifier)) {
				// 
				if (ConstructorDec2OperationWithModifierImpl
						.pattern_ConstructorDec2OperationWithModifier_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ConstructorDec2OperationWithModifierImpl
							.pattern_ConstructorDec2OperationWithModifier_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ConstructorDec2OperationWithModifierImpl
							.pattern_ConstructorDec2OperationWithModifier_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ConstructorDec2OperationWithModifier");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("comment", "body", "Constructor", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

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

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		JVisibility2umlVisibility jVisibility2umlVisibility2 = new JVisibility2umlVisibility();
		csp.getConstraints().add(jVisibility2umlVisibility2);

		eq0.setRuleName("ConstructorDec2OperationWithModifier");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		eq1.setRuleName("ConstructorDec2OperationWithModifier");
		eq1.solve(var_modifier_static, var_feature_isStatic);

		jVisibility2umlVisibility2.setRuleName("ConstructorDec2OperationWithModifier");
		jVisibility2umlVisibility2.solve(var_modifier_visibility, var_feature_visibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_feature_name.setBound(false);
			var_feature_isStatic.setBound(false);
			var_feature_visibility.setBound(false);
			eq0.solve(var_bodyDeclaration_name, var_feature_name);
			eq1.solve(var_modifier_static, var_feature_isStatic);
			jVisibility2umlVisibility2.solve(var_modifier_visibility, var_feature_visibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("feature", "name", var_feature_name.getValue());
				__helper.setValue("feature", "isStatic", var_feature_isStatic.getValue());
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
		ruleResult.setRule("ConstructorDec2OperationWithModifier");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("comment", "body", "Constructor", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

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

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		JVisibility2umlVisibility jVisibility2umlVisibility2 = new JVisibility2umlVisibility();
		csp.getConstraints().add(jVisibility2umlVisibility2);

		eq0.setRuleName("ConstructorDec2OperationWithModifier");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		eq1.setRuleName("ConstructorDec2OperationWithModifier");
		eq1.solve(var_modifier_static, var_feature_isStatic);

		jVisibility2umlVisibility2.setRuleName("ConstructorDec2OperationWithModifier");
		jVisibility2umlVisibility2.solve(var_modifier_visibility, var_feature_visibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_bodyDeclaration_name.setBound(false);
			var_modifier_static.setBound(false);
			var_modifier_visibility.setBound(false);
			eq0.solve(var_bodyDeclaration_name, var_feature_name);
			eq1.solve(var_modifier_static, var_feature_isStatic);
			jVisibility2umlVisibility2.solve(var_modifier_visibility, var_feature_visibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("bodyDeclaration", "name", var_bodyDeclaration_name.getValue());
				__helper.setValue("modifier", "static", var_modifier_static.getValue());
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

		Object[] result1_black = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Operation feature = (Operation) result2_bindingAndBlack[0];
		MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result2_bindingAndBlack[1];
		Modifier modifier = (Modifier) result2_bindingAndBlack[2];
		Comment comment = (Comment) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, feature,
						bodyDeclaration, modifier, comment, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[modifier] = " + modifier + ", " + "[comment] = " + comment + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_24_5_matchcorrcontext_blackBB(sourceMatch,
							targetMatch)) {
				Object[] result5_green = ConstructorDec2OperationWithModifierImpl
						.pattern_ConstructorDec2OperationWithModifier_24_5_matchcorrcontext_greenBBF(sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = ConstructorDec2OperationWithModifierImpl
						.pattern_ConstructorDec2OperationWithModifier_24_6_createcorrespondence_blackBBBBB(feature,
								bodyDeclaration, modifier, comment, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ", "
							+ "[comment] = " + comment + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ConstructorDec2OperationWithModifierImpl
						.pattern_ConstructorDec2OperationWithModifier_24_6_createcorrespondence_greenFBFBBB(feature,
								bodyDeclaration, modifier, ccMatch);
				//nothing Modifier2NamedElement m2f = (Modifier2NamedElement) result6_green[0];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[2];

				Object[] result7_black = ConstructorDec2OperationWithModifierImpl
						.pattern_ConstructorDec2OperationWithModifier_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ConstructorDec2OperationWithModifierImpl
						.pattern_ConstructorDec2OperationWithModifier_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Operation feature, MConstructorDefinition bodyDeclaration, Modifier modifier,
			Comment comment, Match sourceMatch, Match targetMatch) {// Create CSP
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

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_modifier_static, var_feature_isStatic);
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
	public boolean checkDEC_FWD(MConstructorDefinition bodyDeclaration, Modifier modifier) {// 
		Object[] result1_black = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_27_1_matchtggpattern_blackBB(bodyDeclaration, modifier);
		if (result1_black != null) {
			return ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_27_2_expressionF();
		} else {
			return ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Operation feature, Comment comment) {// 
		Object[] result1_black = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_28_1_matchtggpattern_blackBB(feature, comment);
		if (result1_black != null) {
			ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_28_1_matchtggpattern_greenB(comment);

			return ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_28_2_expressionF();
		} else {
			return ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_29_3_solveCSP_bindingAndBlackFBBB(this,
							isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ConstructorDec2OperationWithModifierImpl
					.pattern_ConstructorDec2OperationWithModifier_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = ConstructorDec2OperationWithModifierImpl
						.pattern_ConstructorDec2OperationWithModifier_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				ConstructorDec2OperationWithModifierImpl
						.pattern_ConstructorDec2OperationWithModifier_29_6_perform_greenFFFFFFBB(ruleResult, csp);
				//nothing Modifier2NamedElement m2f = (Modifier2NamedElement) result6_green[0];
				//nothing Operation feature = (Operation) result6_green[1];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[2];
				//nothing MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result6_green[3];
				//nothing Modifier modifier = (Modifier) result6_green[4];
				//nothing Comment comment = (Comment) result6_green[5];

			} else {
			}

		} else {
		}
		return ConstructorDec2OperationWithModifierImpl
				.pattern_ConstructorDec2OperationWithModifier_29_7_expressionFB(ruleResult);
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
		Variable var_modifier_static = CSPFactoryHelper.eINSTANCE.createVariable("modifier.static", csp);
		var_modifier_static.setType("Boolean");
		Variable var_feature_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("feature.isStatic", csp);
		var_feature_isStatic.setType("Boolean");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", csp);
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", csp);
		var_feature_visibility.setType("uml.VisibilityKind");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_modifier_static, var_feature_isStatic);
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
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPROPRIATE_FWD__MATCH_MCONSTRUCTORDEFINITION_MODIFIER:
			return isAppropriate_FWD((Match) arguments.get(0), (MConstructorDefinition) arguments.get(1),
					(Modifier) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MCONSTRUCTORDEFINITION_MODIFIER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MConstructorDefinition) arguments.get(1),
					(Modifier) arguments.get(2));
			return null;
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MCONSTRUCTORDEFINITION_MODIFIER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MConstructorDefinition) arguments.get(1),
					(Modifier) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MCONSTRUCTORDEFINITION_MODIFIER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MConstructorDefinition) arguments.get(1), (Modifier) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPROPRIATE_BWD__MATCH_OPERATION_COMMENT:
			return isAppropriate_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(Comment) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_OPERATION_COMMENT:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(Comment) arguments.get(2));
			return null;
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_OPERATION_COMMENT:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(Comment) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_OPERATION_COMMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Operation) arguments.get(1),
					(Comment) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_146__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_146((EMoflonEdge) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_158__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_158((EMoflonEdge) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_CC__OPERATION_MCONSTRUCTORDEFINITION_MODIFIER_COMMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Operation) arguments.get(0), (MConstructorDefinition) arguments.get(1),
					(Modifier) arguments.get(2), (Comment) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___CHECK_DEC_FWD__MCONSTRUCTORDEFINITION_MODIFIER:
			return checkDEC_FWD((MConstructorDefinition) arguments.get(0), (Modifier) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___CHECK_DEC_BWD__OPERATION_COMMENT:
			return checkDEC_BWD((Operation) arguments.get(0), (Comment) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_WITH_MODIFIER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_0_1_initialbindings_blackBBBB(
			ConstructorDec2OperationWithModifier _this, Match match, MConstructorDefinition bodyDeclaration,
			Modifier modifier) {
		return new Object[] { _this, match, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_0_2_SolveCSP_bindingFBBBB(
			ConstructorDec2OperationWithModifier _this, Match match, MConstructorDefinition bodyDeclaration,
			Modifier modifier) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration, modifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration, modifier };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_0_2_SolveCSP_bindingAndBlackFBBBB(
			ConstructorDec2OperationWithModifier _this, Match match, MConstructorDefinition bodyDeclaration,
			Modifier modifier) {
		Object[] result_pattern_ConstructorDec2OperationWithModifier_0_2_SolveCSP_binding = pattern_ConstructorDec2OperationWithModifier_0_2_SolveCSP_bindingFBBBB(
				_this, match, bodyDeclaration, modifier);
		if (result_pattern_ConstructorDec2OperationWithModifier_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2OperationWithModifier_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ConstructorDec2OperationWithModifier_0_2_SolveCSP_black = pattern_ConstructorDec2OperationWithModifier_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDec2OperationWithModifier_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration, modifier };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_0_3_CheckCSP_expressionFBB(
			ConstructorDec2OperationWithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_0_4_collectelementstobetranslated_blackBBB(
			Match match, MConstructorDefinition bodyDeclaration, Modifier modifier) {
		return new Object[] { match, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, MConstructorDefinition bodyDeclaration, Modifier modifier) {
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

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_0_5_collectcontextelements_blackBBB(
			Match match, MConstructorDefinition bodyDeclaration, Modifier modifier) {
		return new Object[] { match, bodyDeclaration, modifier };
	}

	public static final void pattern_ConstructorDec2OperationWithModifier_0_6_registerobjectstomatch_expressionBBBB(
			ConstructorDec2OperationWithModifier _this, Match match, MConstructorDefinition bodyDeclaration,
			Modifier modifier) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration, modifier);

	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_1_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("modifier");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpModifier = _localVariable_1;
		if (tmpBodyDeclaration instanceof MConstructorDefinition) {
			MConstructorDefinition bodyDeclaration = (MConstructorDefinition) tmpBodyDeclaration;
			if (tmpModifier instanceof Modifier) {
				Modifier modifier = (Modifier) tmpModifier;
				return new Object[] { bodyDeclaration, modifier, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_1_1_performtransformation_blackBBFBB(
			MConstructorDefinition bodyDeclaration, Modifier modifier, ConstructorDec2OperationWithModifier _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { bodyDeclaration, modifier, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_1_1_performtransformation_bindingAndBlackFFFBB(
			ConstructorDec2OperationWithModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ConstructorDec2OperationWithModifier_1_1_performtransformation_binding = pattern_ConstructorDec2OperationWithModifier_1_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_ConstructorDec2OperationWithModifier_1_1_performtransformation_binding != null) {
			MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result_pattern_ConstructorDec2OperationWithModifier_1_1_performtransformation_binding[0];
			Modifier modifier = (Modifier) result_pattern_ConstructorDec2OperationWithModifier_1_1_performtransformation_binding[1];

			Object[] result_pattern_ConstructorDec2OperationWithModifier_1_1_performtransformation_black = pattern_ConstructorDec2OperationWithModifier_1_1_performtransformation_blackBBFBB(
					bodyDeclaration, modifier, _this, isApplicableMatch);
			if (result_pattern_ConstructorDec2OperationWithModifier_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ConstructorDec2OperationWithModifier_1_1_performtransformation_black[2];

				return new Object[] { bodyDeclaration, modifier, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_1_1_performtransformation_greenFFFBBFB(
			MConstructorDefinition bodyDeclaration, Modifier modifier, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		Operation feature = UMLFactory.eINSTANCE.createOperation();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Comment comment = UMLFactory.eINSTANCE.createComment();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("feature", "isStatic");
		Object _localVariable_2 = csp.getValue("feature", "visibility");
		String comment_body_prime = "Constructor";
		m2f.setSource(modifier);
		m2f.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		feature.getOwnedComments().add(comment);
		comment.getAnnotatedElements().add(feature);
		String feature_name_prime = (String) _localVariable_0;
		boolean feature_isStatic_prime = (boolean) _localVariable_1;
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_2;
		comment.setBody(comment_body_prime);
		feature.setName(feature_name_prime);
		feature.setIsStatic(Boolean.valueOf(feature_isStatic_prime));
		feature.setVisibility(feature_visibility_prime);
		return new Object[] { m2f, feature, b2e, bodyDeclaration, modifier, comment, csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_1_2_collecttranslatedelements_blackBBBBBB(
			Modifier2NamedElement m2f, Operation feature, ASTNode2Element b2e, MConstructorDefinition bodyDeclaration,
			Modifier modifier, Comment comment) {
		return new Object[] { m2f, feature, b2e, bodyDeclaration, modifier, comment };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_1_2_collecttranslatedelements_greenFBBBBBB(
			Modifier2NamedElement m2f, Operation feature, ASTNode2Element b2e, MConstructorDefinition bodyDeclaration,
			Modifier modifier, Comment comment) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2f);
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		ruleresult.getTranslatedElements().add(modifier);
		ruleresult.getCreatedElements().add(comment);
		return new Object[] { ruleresult, m2f, feature, b2e, bodyDeclaration, modifier, comment };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject b2e, EObject bodyDeclaration,
			EObject modifier, EObject comment) {
		if (!m2f.equals(modifier)) {
			if (!feature.equals(m2f)) {
				if (!feature.equals(modifier)) {
					if (!b2e.equals(m2f)) {
						if (!b2e.equals(feature)) {
							if (!b2e.equals(bodyDeclaration)) {
								if (!b2e.equals(modifier)) {
									if (!b2e.equals(comment)) {
										if (!bodyDeclaration.equals(m2f)) {
											if (!bodyDeclaration.equals(feature)) {
												if (!bodyDeclaration.equals(modifier)) {
													if (!bodyDeclaration.equals(comment)) {
														if (!comment.equals(m2f)) {
															if (!comment.equals(feature)) {
																if (!comment.equals(modifier)) {
																	return new Object[] { ruleresult, m2f, feature, b2e,
																			bodyDeclaration, modifier, comment };
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

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject b2e, EObject bodyDeclaration,
			EObject modifier, EObject comment) {
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__comment____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__feature____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ConstructorDec2OperationWithModifier";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String m2f__feature____target_name_prime = "target";
		String feature__comment____ownedComment_name_prime = "ownedComment";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String comment__feature____annotatedElement_name_prime = "annotatedElement";
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
		feature__comment____ownedComment.setSrc(feature);
		feature__comment____ownedComment.setTrg(comment);
		ruleresult.getCreatedEdges().add(feature__comment____ownedComment);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		comment__feature____annotatedElement.setSrc(comment);
		comment__feature____annotatedElement.setTrg(feature);
		ruleresult.getCreatedEdges().add(comment__feature____annotatedElement);
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
		feature__comment____ownedComment.setName(feature__comment____ownedComment_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		comment__feature____annotatedElement.setName(comment__feature____annotatedElement_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, feature, b2e, bodyDeclaration, modifier, comment,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration,
				m2f__feature____target, feature__comment____ownedComment, b2e__bodyDeclaration____source,
				comment__feature____annotatedElement, m2f__modifier____source, b2e__feature____target };
	}

	public static final void pattern_ConstructorDec2OperationWithModifier_1_5_registerobjects_expressionBBBBBBBB(
			ConstructorDec2OperationWithModifier _this, PerformRuleResult ruleresult, EObject m2f, EObject feature,
			EObject b2e, EObject bodyDeclaration, EObject modifier, EObject comment) {
		_this.registerObjects_FWD(ruleresult, m2f, feature, b2e, bodyDeclaration, modifier, comment);

	}

	public static final PerformRuleResult pattern_ConstructorDec2OperationWithModifier_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_2_1_preparereturnvalue_bindingFB(
			ConstructorDec2OperationWithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_2_1_preparereturnvalue_blackFBB(
			EClass eClass, ConstructorDec2OperationWithModifier _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_2_1_preparereturnvalue_bindingAndBlackFFB(
			ConstructorDec2OperationWithModifier _this) {
		Object[] result_pattern_ConstructorDec2OperationWithModifier_2_1_preparereturnvalue_binding = pattern_ConstructorDec2OperationWithModifier_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDec2OperationWithModifier_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ConstructorDec2OperationWithModifier_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDec2OperationWithModifier_2_1_preparereturnvalue_black = pattern_ConstructorDec2OperationWithModifier_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ConstructorDec2OperationWithModifier_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ConstructorDec2OperationWithModifier_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ConstructorDec2OperationWithModifier";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject _localVariable_1 = match.getObject("modifier");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpModifier = _localVariable_1;
		if (tmpBodyDeclaration instanceof MConstructorDefinition) {
			MConstructorDefinition bodyDeclaration = (MConstructorDefinition) tmpBodyDeclaration;
			if (tmpModifier instanceof Modifier) {
				Modifier modifier = (Modifier) tmpModifier;
				return new Object[] { bodyDeclaration, modifier, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2OperationWithModifier_2_2_corematch_blackBBB(
			MConstructorDefinition bodyDeclaration, Modifier modifier, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { bodyDeclaration, modifier, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2OperationWithModifier_2_3_findcontext_blackBB(
			MConstructorDefinition bodyDeclaration, Modifier modifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (modifier.equals(bodyDeclaration.getModifier())) {
			_result.add(new Object[] { bodyDeclaration, modifier });
		}
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_2_3_findcontext_greenBBFFF(
			MConstructorDefinition bodyDeclaration, Modifier modifier) {
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

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_2_4_solveCSP_bindingFBBBB(
			ConstructorDec2OperationWithModifier _this, IsApplicableMatch isApplicableMatch,
			MConstructorDefinition bodyDeclaration, Modifier modifier) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, bodyDeclaration, modifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, modifier };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_2_4_solveCSP_bindingAndBlackFBBBB(
			ConstructorDec2OperationWithModifier _this, IsApplicableMatch isApplicableMatch,
			MConstructorDefinition bodyDeclaration, Modifier modifier) {
		Object[] result_pattern_ConstructorDec2OperationWithModifier_2_4_solveCSP_binding = pattern_ConstructorDec2OperationWithModifier_2_4_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, bodyDeclaration, modifier);
		if (result_pattern_ConstructorDec2OperationWithModifier_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2OperationWithModifier_2_4_solveCSP_binding[0];

			Object[] result_pattern_ConstructorDec2OperationWithModifier_2_4_solveCSP_black = pattern_ConstructorDec2OperationWithModifier_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDec2OperationWithModifier_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, modifier };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_2_5_checkCSP_expressionFBB(
			ConstructorDec2OperationWithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ConstructorDec2OperationWithModifier";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ConstructorDec2OperationWithModifier_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_10_1_initialbindings_blackBBBB(
			ConstructorDec2OperationWithModifier _this, Match match, Operation feature, Comment comment) {
		return new Object[] { _this, match, feature, comment };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_10_2_SolveCSP_bindingFBBBB(
			ConstructorDec2OperationWithModifier _this, Match match, Operation feature, Comment comment) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, comment);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, comment };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_10_2_SolveCSP_bindingAndBlackFBBBB(
			ConstructorDec2OperationWithModifier _this, Match match, Operation feature, Comment comment) {
		Object[] result_pattern_ConstructorDec2OperationWithModifier_10_2_SolveCSP_binding = pattern_ConstructorDec2OperationWithModifier_10_2_SolveCSP_bindingFBBBB(
				_this, match, feature, comment);
		if (result_pattern_ConstructorDec2OperationWithModifier_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2OperationWithModifier_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ConstructorDec2OperationWithModifier_10_2_SolveCSP_black = pattern_ConstructorDec2OperationWithModifier_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDec2OperationWithModifier_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, comment };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_10_3_CheckCSP_expressionFBB(
			ConstructorDec2OperationWithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_10_4_collectelementstobetranslated_blackBBB(
			Match match, Operation feature, Comment comment) {
		return new Object[] { match, feature, comment };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, Operation feature, Comment comment) {
		EMoflonEdge feature__comment____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__feature____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(feature);
		match.getToBeTranslatedNodes().add(comment);
		String feature__comment____ownedComment_name_prime = "ownedComment";
		String comment__feature____annotatedElement_name_prime = "annotatedElement";
		feature__comment____ownedComment.setSrc(feature);
		feature__comment____ownedComment.setTrg(comment);
		match.getToBeTranslatedEdges().add(feature__comment____ownedComment);
		comment__feature____annotatedElement.setSrc(comment);
		comment__feature____annotatedElement.setTrg(feature);
		match.getToBeTranslatedEdges().add(comment__feature____annotatedElement);
		feature__comment____ownedComment.setName(feature__comment____ownedComment_name_prime);
		comment__feature____annotatedElement.setName(comment__feature____annotatedElement_name_prime);
		return new Object[] { match, feature, comment, feature__comment____ownedComment,
				comment__feature____annotatedElement };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_10_5_collectcontextelements_blackBBB(
			Match match, Operation feature, Comment comment) {
		return new Object[] { match, feature, comment };
	}

	public static final void pattern_ConstructorDec2OperationWithModifier_10_6_registerobjectstomatch_expressionBBBB(
			ConstructorDec2OperationWithModifier _this, Match match, Operation feature, Comment comment) {
		_this.registerObjectsToMatch_BWD(match, feature, comment);

	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_11_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("comment");
		EObject tmpFeature = _localVariable_0;
		EObject tmpComment = _localVariable_1;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpComment instanceof Comment) {
				Comment comment = (Comment) tmpComment;
				return new Object[] { feature, comment, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_11_1_performtransformation_blackBBFBB(
			Operation feature, Comment comment, ConstructorDec2OperationWithModifier _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { feature, comment, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_11_1_performtransformation_bindingAndBlackFFFBB(
			ConstructorDec2OperationWithModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ConstructorDec2OperationWithModifier_11_1_performtransformation_binding = pattern_ConstructorDec2OperationWithModifier_11_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_ConstructorDec2OperationWithModifier_11_1_performtransformation_binding != null) {
			Operation feature = (Operation) result_pattern_ConstructorDec2OperationWithModifier_11_1_performtransformation_binding[0];
			Comment comment = (Comment) result_pattern_ConstructorDec2OperationWithModifier_11_1_performtransformation_binding[1];

			Object[] result_pattern_ConstructorDec2OperationWithModifier_11_1_performtransformation_black = pattern_ConstructorDec2OperationWithModifier_11_1_performtransformation_blackBBFBB(
					feature, comment, _this, isApplicableMatch);
			if (result_pattern_ConstructorDec2OperationWithModifier_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ConstructorDec2OperationWithModifier_11_1_performtransformation_black[2];

				return new Object[] { feature, comment, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_11_1_performtransformation_greenFBFFFB(
			Operation feature, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		MConstructorDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMConstructorDefinition();
		Modifier modifier = JavaFactory.eINSTANCE.createModifier();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		Object _localVariable_1 = csp.getValue("modifier", "static");
		Object _localVariable_2 = csp.getValue("modifier", "visibility");
		m2f.setTarget(feature);
		b2e.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		bodyDeclaration.setModifier(modifier);
		m2f.setSource(modifier);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		boolean modifier_static_prime = (boolean) _localVariable_1;
		org.eclipse.modisco.java.VisibilityKind modifier_visibility_prime = (org.eclipse.modisco.java.VisibilityKind) _localVariable_2;
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		modifier.setStatic(Boolean.valueOf(modifier_static_prime));
		modifier.setVisibility(modifier_visibility_prime);
		return new Object[] { m2f, feature, b2e, bodyDeclaration, modifier, csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_11_2_collecttranslatedelements_blackBBBBBB(
			Modifier2NamedElement m2f, Operation feature, ASTNode2Element b2e, MConstructorDefinition bodyDeclaration,
			Modifier modifier, Comment comment) {
		return new Object[] { m2f, feature, b2e, bodyDeclaration, modifier, comment };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_11_2_collecttranslatedelements_greenFBBBBBB(
			Modifier2NamedElement m2f, Operation feature, ASTNode2Element b2e, MConstructorDefinition bodyDeclaration,
			Modifier modifier, Comment comment) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2f);
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		ruleresult.getCreatedElements().add(modifier);
		ruleresult.getTranslatedElements().add(comment);
		return new Object[] { ruleresult, m2f, feature, b2e, bodyDeclaration, modifier, comment };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject b2e, EObject bodyDeclaration,
			EObject modifier, EObject comment) {
		if (!m2f.equals(modifier)) {
			if (!feature.equals(m2f)) {
				if (!feature.equals(modifier)) {
					if (!b2e.equals(m2f)) {
						if (!b2e.equals(feature)) {
							if (!b2e.equals(bodyDeclaration)) {
								if (!b2e.equals(modifier)) {
									if (!b2e.equals(comment)) {
										if (!bodyDeclaration.equals(m2f)) {
											if (!bodyDeclaration.equals(feature)) {
												if (!bodyDeclaration.equals(modifier)) {
													if (!bodyDeclaration.equals(comment)) {
														if (!comment.equals(m2f)) {
															if (!comment.equals(feature)) {
																if (!comment.equals(modifier)) {
																	return new Object[] { ruleresult, m2f, feature, b2e,
																			bodyDeclaration, modifier, comment };
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

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject b2e, EObject bodyDeclaration,
			EObject modifier, EObject comment) {
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__comment____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__feature____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ConstructorDec2OperationWithModifier";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String m2f__feature____target_name_prime = "target";
		String feature__comment____ownedComment_name_prime = "ownedComment";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String comment__feature____annotatedElement_name_prime = "annotatedElement";
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
		feature__comment____ownedComment.setSrc(feature);
		feature__comment____ownedComment.setTrg(comment);
		ruleresult.getTranslatedEdges().add(feature__comment____ownedComment);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		comment__feature____annotatedElement.setSrc(comment);
		comment__feature____annotatedElement.setTrg(feature);
		ruleresult.getTranslatedEdges().add(comment__feature____annotatedElement);
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
		feature__comment____ownedComment.setName(feature__comment____ownedComment_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		comment__feature____annotatedElement.setName(comment__feature____annotatedElement_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, feature, b2e, bodyDeclaration, modifier, comment,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration,
				m2f__feature____target, feature__comment____ownedComment, b2e__bodyDeclaration____source,
				comment__feature____annotatedElement, m2f__modifier____source, b2e__feature____target };
	}

	public static final void pattern_ConstructorDec2OperationWithModifier_11_5_registerobjects_expressionBBBBBBBB(
			ConstructorDec2OperationWithModifier _this, PerformRuleResult ruleresult, EObject m2f, EObject feature,
			EObject b2e, EObject bodyDeclaration, EObject modifier, EObject comment) {
		_this.registerObjects_BWD(ruleresult, m2f, feature, b2e, bodyDeclaration, modifier, comment);

	}

	public static final PerformRuleResult pattern_ConstructorDec2OperationWithModifier_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_12_1_preparereturnvalue_bindingFB(
			ConstructorDec2OperationWithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_12_1_preparereturnvalue_blackFBB(
			EClass eClass, ConstructorDec2OperationWithModifier _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_12_1_preparereturnvalue_bindingAndBlackFFB(
			ConstructorDec2OperationWithModifier _this) {
		Object[] result_pattern_ConstructorDec2OperationWithModifier_12_1_preparereturnvalue_binding = pattern_ConstructorDec2OperationWithModifier_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDec2OperationWithModifier_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ConstructorDec2OperationWithModifier_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDec2OperationWithModifier_12_1_preparereturnvalue_black = pattern_ConstructorDec2OperationWithModifier_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ConstructorDec2OperationWithModifier_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ConstructorDec2OperationWithModifier_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ConstructorDec2OperationWithModifier";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("comment");
		EObject tmpFeature = _localVariable_0;
		EObject tmpComment = _localVariable_1;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpComment instanceof Comment) {
				Comment comment = (Comment) tmpComment;
				return new Object[] { feature, comment, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2OperationWithModifier_12_2_corematch_blackBBB(
			Operation feature, Comment comment, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		String comment_body = comment.getBody();
		if (comment_body.equals("Constructor")) {
			_result.add(new Object[] { feature, comment, match });
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2OperationWithModifier_12_3_findcontext_blackBB(
			Operation feature, Comment comment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (feature.getOwnedComments().contains(comment)) {
			if (comment.getAnnotatedElements().contains(feature)) {
				String comment_body = comment.getBody();
				if (comment_body.equals("Constructor")) {
					_result.add(new Object[] { feature, comment });
				}

			}
		}
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_12_3_findcontext_greenBBFFF(
			Operation feature, Comment comment) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge feature__comment____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__feature____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String feature__comment____ownedComment_name_prime = "ownedComment";
		String comment__feature____annotatedElement_name_prime = "annotatedElement";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(comment);
		feature__comment____ownedComment.setSrc(feature);
		feature__comment____ownedComment.setTrg(comment);
		isApplicableMatch.getAllContextElements().add(feature__comment____ownedComment);
		comment__feature____annotatedElement.setSrc(comment);
		comment__feature____annotatedElement.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(comment__feature____annotatedElement);
		feature__comment____ownedComment.setName(feature__comment____ownedComment_name_prime);
		comment__feature____annotatedElement.setName(comment__feature____annotatedElement_name_prime);
		return new Object[] { feature, comment, isApplicableMatch, feature__comment____ownedComment,
				comment__feature____annotatedElement };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_12_4_solveCSP_bindingFBBBB(
			ConstructorDec2OperationWithModifier _this, IsApplicableMatch isApplicableMatch, Operation feature,
			Comment comment) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, comment);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, comment };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_12_4_solveCSP_bindingAndBlackFBBBB(
			ConstructorDec2OperationWithModifier _this, IsApplicableMatch isApplicableMatch, Operation feature,
			Comment comment) {
		Object[] result_pattern_ConstructorDec2OperationWithModifier_12_4_solveCSP_binding = pattern_ConstructorDec2OperationWithModifier_12_4_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, feature, comment);
		if (result_pattern_ConstructorDec2OperationWithModifier_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2OperationWithModifier_12_4_solveCSP_binding[0];

			Object[] result_pattern_ConstructorDec2OperationWithModifier_12_4_solveCSP_black = pattern_ConstructorDec2OperationWithModifier_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDec2OperationWithModifier_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, comment };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_12_5_checkCSP_expressionFBB(
			ConstructorDec2OperationWithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ConstructorDec2OperationWithModifier";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ConstructorDec2OperationWithModifier_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_20_1_preparereturnvalue_bindingFB(
			ConstructorDec2OperationWithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, ConstructorDec2OperationWithModifier _this) {
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

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ConstructorDec2OperationWithModifier _this) {
		Object[] result_pattern_ConstructorDec2OperationWithModifier_20_1_preparereturnvalue_binding = pattern_ConstructorDec2OperationWithModifier_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDec2OperationWithModifier_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ConstructorDec2OperationWithModifier_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDec2OperationWithModifier_20_1_preparereturnvalue_black = pattern_ConstructorDec2OperationWithModifier_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ConstructorDec2OperationWithModifier_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ConstructorDec2OperationWithModifier_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ConstructorDec2OperationWithModifier_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_20_2_testcorematchandDECs_black_nac_0BB(
			Comment comment, Operation feature) {
		for (Element __DEC_comment_annotatedElement_666827 : comment.getAnnotatedElements()) {
			if (!comment.equals(__DEC_comment_annotatedElement_666827)) {
				if (!feature.equals(__DEC_comment_annotatedElement_666827)) {
					return new Object[] { comment, feature };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2OperationWithModifier_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedComment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFeature = _edge_ownedComment.getSrc();
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			EObject tmpComment = _edge_ownedComment.getTrg();
			if (tmpComment instanceof Comment) {
				Comment comment = (Comment) tmpComment;
				if (feature.getOwnedComments().contains(comment)) {
					if (comment.getAnnotatedElements().contains(feature)) {
						String comment_body = comment.getBody();
						if (comment_body.equals("Constructor")) {
							if (pattern_ConstructorDec2OperationWithModifier_20_2_testcorematchandDECs_black_nac_0BB(
									comment, feature) == null) {
								_result.add(new Object[] { feature, comment, _edge_ownedComment });
							}
						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ConstructorDec2OperationWithModifier _this, Match match, Operation feature, Comment comment) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, comment);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ConstructorDec2OperationWithModifier _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ConstructorDec2OperationWithModifier_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_21_1_preparereturnvalue_bindingFB(
			ConstructorDec2OperationWithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, ConstructorDec2OperationWithModifier _this) {
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

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ConstructorDec2OperationWithModifier _this) {
		Object[] result_pattern_ConstructorDec2OperationWithModifier_21_1_preparereturnvalue_binding = pattern_ConstructorDec2OperationWithModifier_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDec2OperationWithModifier_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ConstructorDec2OperationWithModifier_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDec2OperationWithModifier_21_1_preparereturnvalue_black = pattern_ConstructorDec2OperationWithModifier_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ConstructorDec2OperationWithModifier_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ConstructorDec2OperationWithModifier_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ConstructorDec2OperationWithModifier_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2OperationWithModifier_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_modifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpBodyDeclaration = _edge_modifier.getSrc();
		if (tmpBodyDeclaration instanceof MConstructorDefinition) {
			MConstructorDefinition bodyDeclaration = (MConstructorDefinition) tmpBodyDeclaration;
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

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ConstructorDec2OperationWithModifier _this, Match match, MConstructorDefinition bodyDeclaration,
			Modifier modifier) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration, modifier);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ConstructorDec2OperationWithModifier _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ConstructorDec2OperationWithModifier_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_24_1_prepare_blackB(
			ConstructorDec2OperationWithModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_2 = sourceMatch.getObject("modifier");
		EObject _localVariable_3 = targetMatch.getObject("comment");
		EObject tmpFeature = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpModifier = _localVariable_2;
		EObject tmpComment = _localVariable_3;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpBodyDeclaration instanceof MConstructorDefinition) {
				MConstructorDefinition bodyDeclaration = (MConstructorDefinition) tmpBodyDeclaration;
				if (tmpModifier instanceof Modifier) {
					Modifier modifier = (Modifier) tmpModifier;
					if (tmpComment instanceof Comment) {
						Comment comment = (Comment) tmpComment;
						return new Object[] { feature, bodyDeclaration, modifier, comment, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_24_2_matchsrctrgcontext_blackBBBBBB(
			Operation feature, MConstructorDefinition bodyDeclaration, Modifier modifier, Comment comment,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			String comment_body = comment.getBody();
			if (comment_body.equals("Constructor")) {
				return new Object[] { feature, bodyDeclaration, modifier, comment, sourceMatch, targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ConstructorDec2OperationWithModifier_24_2_matchsrctrgcontext_binding = pattern_ConstructorDec2OperationWithModifier_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ConstructorDec2OperationWithModifier_24_2_matchsrctrgcontext_binding != null) {
			Operation feature = (Operation) result_pattern_ConstructorDec2OperationWithModifier_24_2_matchsrctrgcontext_binding[0];
			MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result_pattern_ConstructorDec2OperationWithModifier_24_2_matchsrctrgcontext_binding[1];
			Modifier modifier = (Modifier) result_pattern_ConstructorDec2OperationWithModifier_24_2_matchsrctrgcontext_binding[2];
			Comment comment = (Comment) result_pattern_ConstructorDec2OperationWithModifier_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_ConstructorDec2OperationWithModifier_24_2_matchsrctrgcontext_black = pattern_ConstructorDec2OperationWithModifier_24_2_matchsrctrgcontext_blackBBBBBB(
					feature, bodyDeclaration, modifier, comment, sourceMatch, targetMatch);
			if (result_pattern_ConstructorDec2OperationWithModifier_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, bodyDeclaration, modifier, comment, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_24_3_solvecsp_bindingFBBBBBBB(
			ConstructorDec2OperationWithModifier _this, Operation feature, MConstructorDefinition bodyDeclaration,
			Modifier modifier, Comment comment, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(feature, bodyDeclaration, modifier, comment, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, feature, bodyDeclaration, modifier, comment, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			ConstructorDec2OperationWithModifier _this, Operation feature, MConstructorDefinition bodyDeclaration,
			Modifier modifier, Comment comment, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ConstructorDec2OperationWithModifier_24_3_solvecsp_binding = pattern_ConstructorDec2OperationWithModifier_24_3_solvecsp_bindingFBBBBBBB(
				_this, feature, bodyDeclaration, modifier, comment, sourceMatch, targetMatch);
		if (result_pattern_ConstructorDec2OperationWithModifier_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2OperationWithModifier_24_3_solvecsp_binding[0];

			Object[] result_pattern_ConstructorDec2OperationWithModifier_24_3_solvecsp_black = pattern_ConstructorDec2OperationWithModifier_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ConstructorDec2OperationWithModifier_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, bodyDeclaration, modifier, comment, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2OperationWithModifier_24_5_matchcorrcontext_blackBB(
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_24_5_matchcorrcontext_greenBBF(
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ConstructorDec2OperationWithModifier";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_24_6_createcorrespondence_blackBBBBB(
			Operation feature, MConstructorDefinition bodyDeclaration, Modifier modifier, Comment comment,
			CCMatch ccMatch) {
		return new Object[] { feature, bodyDeclaration, modifier, comment, ccMatch };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_24_6_createcorrespondence_greenFBFBBB(
			Operation feature, MConstructorDefinition bodyDeclaration, Modifier modifier, CCMatch ccMatch) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		m2f.setTarget(feature);
		m2f.setSource(modifier);
		ccMatch.getCreateCorr().add(m2f);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		ccMatch.getCreateCorr().add(b2e);
		return new Object[] { m2f, feature, b2e, bodyDeclaration, modifier, ccMatch };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ConstructorDec2OperationWithModifier";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ConstructorDec2OperationWithModifier_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_27_1_matchtggpattern_blackBB(
			MConstructorDefinition bodyDeclaration, Modifier modifier) {
		if (modifier.equals(bodyDeclaration.getModifier())) {
			return new Object[] { bodyDeclaration, modifier };
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_28_1_matchtggpattern_black_nac_0BB(
			Comment comment, Operation feature) {
		for (Element __DEC_comment_annotatedElement_761575 : comment.getAnnotatedElements()) {
			if (!comment.equals(__DEC_comment_annotatedElement_761575)) {
				if (!feature.equals(__DEC_comment_annotatedElement_761575)) {
					return new Object[] { comment, feature };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_28_1_matchtggpattern_blackBB(
			Operation feature, Comment comment) {
		if (feature.getOwnedComments().contains(comment)) {
			if (comment.getAnnotatedElements().contains(feature)) {
				if (pattern_ConstructorDec2OperationWithModifier_28_1_matchtggpattern_black_nac_0BB(comment,
						feature) == null) {
					return new Object[] { feature, comment };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_28_1_matchtggpattern_greenB(
			Comment comment) {
		String comment_body_prime = "Constructor";
		comment.setBody(comment_body_prime);
		return new Object[] { comment };
	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_29_1_createresult_blackB(
			ConstructorDec2OperationWithModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_29_2_isapplicablecore_blackB(
			ConstructorDec2OperationWithModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_29_3_solveCSP_bindingFBBB(
			ConstructorDec2OperationWithModifier _this, IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_29_3_solveCSP_bindingAndBlackFBBB(
			ConstructorDec2OperationWithModifier _this, IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ConstructorDec2OperationWithModifier_29_3_solveCSP_binding = pattern_ConstructorDec2OperationWithModifier_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_ConstructorDec2OperationWithModifier_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2OperationWithModifier_29_3_solveCSP_binding[0];

			Object[] result_pattern_ConstructorDec2OperationWithModifier_29_3_solveCSP_black = pattern_ConstructorDec2OperationWithModifier_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDec2OperationWithModifier_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2OperationWithModifier_29_4_checkCSP_expressionFBB(
			ConstructorDec2OperationWithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_29_6_perform_blackB(
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_ConstructorDec2OperationWithModifier_29_6_perform_greenFFFFFFBB(
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		Operation feature = UMLFactory.eINSTANCE.createOperation();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		MConstructorDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMConstructorDefinition();
		Modifier modifier = JavaFactory.eINSTANCE.createModifier();
		Comment comment = UMLFactory.eINSTANCE.createComment();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("feature", "isStatic");
		Object _localVariable_2 = csp.getValue("feature", "visibility");
		Object _localVariable_3 = csp.getValue("bodyDeclaration", "name");
		Object _localVariable_4 = csp.getValue("modifier", "static");
		Object _localVariable_5 = csp.getValue("modifier", "visibility");
		String comment_body_prime = "Constructor";
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_6 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(m2f);
		m2f.setTarget(feature);
		ruleResult.getTargetObjects().add(feature);
		b2e.setTarget(feature);
		ruleResult.getCorrObjects().add(b2e);
		b2e.setSource(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		bodyDeclaration.setModifier(modifier);
		m2f.setSource(modifier);
		ruleResult.getSourceObjects().add(modifier);
		feature.getOwnedComments().add(comment);
		comment.getAnnotatedElements().add(feature);
		ruleResult.getTargetObjects().add(comment);
		String feature_name_prime = (String) _localVariable_0;
		boolean feature_isStatic_prime = (boolean) _localVariable_1;
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_2;
		String bodyDeclaration_name_prime = (String) _localVariable_3;
		boolean modifier_static_prime = (boolean) _localVariable_4;
		org.eclipse.modisco.java.VisibilityKind modifier_visibility_prime = (org.eclipse.modisco.java.VisibilityKind) _localVariable_5;
		comment.setBody(comment_body_prime);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_6);
		feature.setName(feature_name_prime);
		feature.setIsStatic(Boolean.valueOf(feature_isStatic_prime));
		feature.setVisibility(feature_visibility_prime);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		modifier.setStatic(Boolean.valueOf(modifier_static_prime));
		modifier.setVisibility(modifier_visibility_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { m2f, feature, b2e, bodyDeclaration, modifier, comment, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ConstructorDec2OperationWithModifier_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ConstructorDec2OperationWithModifierImpl
