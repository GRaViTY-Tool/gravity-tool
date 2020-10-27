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
import org.eclipse.modisco.java.Modifier;
import org.eclipse.modisco.java.VariableDeclarationFragment;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.VisibilityKind;

import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.Modifier2NamedElement;
import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4Enum_WithModifier;
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
 * An implementation of the model object '<em><b>Field Dec2 Property4 Enum With Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldDec2Property4Enum_WithModifierImpl extends AbstractRuleImpl
		implements FieldDec2Property4Enum_WithModifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldDec2Property4Enum_WithModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldDec2Property4Enum_WithModifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MFieldDefinition bodyDeclaration, Modifier modifier,
			VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType) {

		Object[] result1_black = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_0_1_initialbindings_blackBBBBBB(this, match,
						bodyDeclaration, modifier, vdf, jOwnerType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = "
					+ modifier + ", " + "[vdf] = " + vdf + ", " + "[jOwnerType] = " + jOwnerType + ".");
		}

		Object[] result2_bindingAndBlack = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match,
						bodyDeclaration, modifier, vdf, jOwnerType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = "
					+ modifier + ", " + "[vdf] = " + vdf + ", " + "[jOwnerType] = " + jOwnerType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_0_4_collectelementstobetranslated_blackBBBBB(match,
							bodyDeclaration, modifier, vdf, jOwnerType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ", "
						+ "[vdf] = " + vdf + ", " + "[jOwnerType] = " + jOwnerType + ".");
			}
			FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_0_4_collectelementstobetranslated_greenBBBBBFFFFFF(
							match, bodyDeclaration, modifier, vdf, jOwnerType);
			//nothing EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge bodyDeclaration__vdf____fragments = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge vdf__bodyDeclaration____variablesContainer = (EMoflonEdge) result4_green[10];

			Object[] result5_black = FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_0_5_collectcontextelements_blackBBBBB(match,
							bodyDeclaration, modifier, vdf, jOwnerType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ", "
						+ "[vdf] = " + vdf + ", " + "[jOwnerType] = " + jOwnerType + ".");
			}
			FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_0_5_collectcontextelements_greenBB(match, jOwnerType);

			// 
			FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_0_6_registerobjectstomatch_expressionBBBBBB(this,
							match, bodyDeclaration, modifier, vdf, jOwnerType);
			return FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_0_7_expressionF();
		} else {
			return FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result1_bindingAndBlack[0];
		Modifier modifier = (Modifier) result1_bindingAndBlack[1];
		Enumeration uOwnerType = (Enumeration) result1_bindingAndBlack[2];
		VariableDeclarationFragment vdf = (VariableDeclarationFragment) result1_bindingAndBlack[3];
		AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		NamedElement2NamedElement jo2uo = (NamedElement2NamedElement) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_greenFFFFBBBB(bodyDeclaration,
						modifier, uOwnerType, csp);
		Modifier2NamedElement m2f = (Modifier2NamedElement) result1_green[0];
		Property feature = (Property) result1_green[1];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[2];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[3];

		Object[] result2_black = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_1_2_collecttranslatedelements_blackBBBBBBB(m2f, feature,
						b2e, bd2ne, bodyDeclaration, modifier, vdf);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[m2f] = " + m2f + ", " + "[feature] = " + feature
							+ ", " + "[b2e] = " + b2e + ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[modifier] = " + modifier + ", " + "[vdf] = " + vdf + ".");
		}
		Object[] result2_green = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_1_2_collecttranslatedelements_greenFBBBBBBB(m2f, feature,
						b2e, bd2ne, bodyDeclaration, modifier, vdf);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, m2f,
						feature, b2e, bd2ne, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, jo2uo);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[feature] = " + feature + ", " + "[b2e] = " + b2e + ", "
					+ "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = "
					+ modifier + ", " + "[uOwnerType] = " + uOwnerType + ", " + "[vdf] = " + vdf + ", "
					+ "[jOwnerType] = " + jOwnerType + ", " + "[jo2uo] = " + jo2uo + ".");
		}
		FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFF(
						ruleresult, m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType);
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge bodyDeclaration__vdf____fragments = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge vdf__bodyDeclaration____variablesContainer = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge uOwnerType__feature____ownedAttribute = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge feature__uOwnerType____datatype = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[23];

		// 
		// 
		FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_1_5_registerobjects_expressionBBBBBBBBBBBB(this,
						ruleresult, m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType,
						jo2uo);
		return FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_binding[0];
		Modifier modifier = (Modifier) result2_binding[1];
		VariableDeclarationFragment vdf = (VariableDeclarationFragment) result2_binding[2];
		AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) result2_binding[3];
		for (Object[] result2_black : FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_2_2_corematch_blackBBFBBFB(bodyDeclaration, modifier, vdf,
						jOwnerType, match)) {
			Enumeration uOwnerType = (Enumeration) result2_black[2];
			NamedElement2NamedElement jo2uo = (NamedElement2NamedElement) result2_black[5];
			// ForEach 
			for (Object[] result3_black : FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_2_3_findcontext_blackBBBBBB(bodyDeclaration, modifier,
							uOwnerType, vdf, jOwnerType, jo2uo)) {
				Object[] result3_green = FieldDec2Property4Enum_WithModifierImpl
						.pattern_FieldDec2Property4Enum_WithModifier_2_3_findcontext_greenBBBBBBFFFFFFFFF(
								bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, jo2uo);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge jo2uo__jOwnerType____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge bodyDeclaration__vdf____fragments = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge vdf__bodyDeclaration____variablesContainer = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge jo2uo__uOwnerType____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = FieldDec2Property4Enum_WithModifierImpl
						.pattern_FieldDec2Property4Enum_WithModifier_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, jo2uo);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[modifier] = " + modifier + ", " + "[uOwnerType] = "
							+ uOwnerType + ", " + "[vdf] = " + vdf + ", " + "[jOwnerType] = " + jOwnerType + ", "
							+ "[jo2uo] = " + jo2uo + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldDec2Property4Enum_WithModifierImpl
						.pattern_FieldDec2Property4Enum_WithModifier_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldDec2Property4Enum_WithModifierImpl
							.pattern_FieldDec2Property4Enum_WithModifier_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldDec2Property4Enum_WithModifierImpl
							.pattern_FieldDec2Property4Enum_WithModifier_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MFieldDefinition bodyDeclaration, Modifier modifier,
			VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType) {
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("modifier", modifier);
		match.registerObject("vdf", vdf);
		match.registerObject("jOwnerType", jOwnerType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MFieldDefinition bodyDeclaration, Modifier modifier,
			VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MFieldDefinition bodyDeclaration,
			Modifier modifier, Enumeration uOwnerType, VariableDeclarationFragment vdf,
			AbstractTypeDeclaration jOwnerType, NamedElement2NamedElement jo2uo) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf.name", true, csp);
		var_vdf_name.setValue(vdf.getName());
		var_vdf_name.setType("String");
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
		eq.solve(var_vdf_name, var_feature_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_modifier_static, var_feature_isStatic);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("modifier", modifier);
		isApplicableMatch.registerObject("uOwnerType", uOwnerType);
		isApplicableMatch.registerObject("vdf", vdf);
		isApplicableMatch.registerObject("jOwnerType", jOwnerType);
		isApplicableMatch.registerObject("jo2uo", jo2uo);
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
			EObject bd2ne, EObject bodyDeclaration, EObject modifier, EObject uOwnerType, EObject vdf,
			EObject jOwnerType, EObject jo2uo) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("modifier", modifier);
		ruleresult.registerObject("uOwnerType", uOwnerType);
		ruleresult.registerObject("vdf", vdf);
		ruleresult.registerObject("jOwnerType", jOwnerType);
		ruleresult.registerObject("jo2uo", jo2uo);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
						.equals("modisco.MFieldDefinition.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("modifier").eClass()).equals("java.Modifier.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("vdf").eClass())
						.equals("java.VariableDeclarationFragment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Property feature, Enumeration uOwnerType) {

		Object[] result1_black = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_10_1_initialbindings_blackBBBB(this, match, feature,
						uOwnerType);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType + ".");
		}

		Object[] result2_bindingAndBlack = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, feature,
						uOwnerType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_10_4_collectelementstobetranslated_blackBBB(match,
							feature, uOwnerType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType + ".");
			}
			FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_10_4_collectelementstobetranslated_greenBBBFF(match,
							feature, uOwnerType);
			//nothing EMoflonEdge uOwnerType__feature____ownedAttribute = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge feature__uOwnerType____datatype = (EMoflonEdge) result4_green[4];

			Object[] result5_black = FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_10_5_collectcontextelements_blackBBB(match, feature,
							uOwnerType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType + ".");
			}
			FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_10_5_collectcontextelements_greenBB(match, uOwnerType);

			// 
			FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_10_6_registerobjectstomatch_expressionBBBB(this, match,
							feature, uOwnerType);
			return FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_10_7_expressionF();
		} else {
			return FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Property feature = (Property) result1_bindingAndBlack[0];
		Enumeration uOwnerType = (Enumeration) result1_bindingAndBlack[1];
		AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) result1_bindingAndBlack[2];
		NamedElement2NamedElement jo2uo = (NamedElement2NamedElement) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_greenFBFFFFFBB(feature,
						jOwnerType, csp);
		Modifier2NamedElement m2f = (Modifier2NamedElement) result1_green[0];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[2];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[3];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result1_green[4];
		Modifier modifier = (Modifier) result1_green[5];
		VariableDeclarationFragment vdf = (VariableDeclarationFragment) result1_green[6];

		Object[] result2_black = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_11_2_collecttranslatedelements_blackBBBBBBB(m2f, feature,
						b2e, bd2ne, bodyDeclaration, modifier, vdf);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[m2f] = " + m2f + ", " + "[feature] = " + feature
							+ ", " + "[b2e] = " + b2e + ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[modifier] = " + modifier + ", " + "[vdf] = " + vdf + ".");
		}
		Object[] result2_green = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_11_2_collecttranslatedelements_greenFBBBBBBB(m2f, feature,
						b2e, bd2ne, bodyDeclaration, modifier, vdf);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, m2f,
						feature, b2e, bd2ne, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, jo2uo);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[feature] = " + feature + ", " + "[b2e] = " + b2e + ", "
					+ "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = "
					+ modifier + ", " + "[uOwnerType] = " + uOwnerType + ", " + "[vdf] = " + vdf + ", "
					+ "[jOwnerType] = " + jOwnerType + ", " + "[jo2uo] = " + jo2uo + ".");
		}
		FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFF(
						ruleresult, m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType);
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge bodyDeclaration__vdf____fragments = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge vdf__bodyDeclaration____variablesContainer = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge uOwnerType__feature____ownedAttribute = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge feature__uOwnerType____datatype = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[23];

		// 
		// 
		FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_11_5_registerobjects_expressionBBBBBBBBBBBB(this,
						ruleresult, m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType,
						jo2uo);
		return FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Property feature = (Property) result2_binding[0];
		Enumeration uOwnerType = (Enumeration) result2_binding[1];
		for (Object[] result2_black : FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_12_2_corematch_blackBBFFB(feature, uOwnerType, match)) {
			AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) result2_black[2];
			NamedElement2NamedElement jo2uo = (NamedElement2NamedElement) result2_black[3];
			// ForEach 
			for (Object[] result3_black : FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_12_3_findcontext_blackBBBB(feature, uOwnerType,
							jOwnerType, jo2uo)) {
				Object[] result3_green = FieldDec2Property4Enum_WithModifierImpl
						.pattern_FieldDec2Property4Enum_WithModifier_12_3_findcontext_greenBBBBFFFFF(feature,
								uOwnerType, jOwnerType, jo2uo);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge jo2uo__jOwnerType____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge uOwnerType__feature____ownedAttribute = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge feature__uOwnerType____datatype = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge jo2uo__uOwnerType____target = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = FieldDec2Property4Enum_WithModifierImpl
						.pattern_FieldDec2Property4Enum_WithModifier_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, feature, uOwnerType, jOwnerType, jo2uo);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[uOwnerType] = " + uOwnerType + ", " + "[jOwnerType] = " + jOwnerType + ", "
							+ "[jo2uo] = " + jo2uo + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldDec2Property4Enum_WithModifierImpl
						.pattern_FieldDec2Property4Enum_WithModifier_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldDec2Property4Enum_WithModifierImpl
							.pattern_FieldDec2Property4Enum_WithModifier_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldDec2Property4Enum_WithModifierImpl
							.pattern_FieldDec2Property4Enum_WithModifier_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Property feature, Enumeration uOwnerType) {
		match.registerObject("feature", feature);
		match.registerObject("uOwnerType", uOwnerType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Property feature, Enumeration uOwnerType) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Property feature, Enumeration uOwnerType,
			AbstractTypeDeclaration jOwnerType, NamedElement2NamedElement jo2uo) {// Create CSP
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
		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf.name", csp);
		var_vdf_name.setType("String");
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
		eq.solve(var_vdf_name, var_feature_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_modifier_static, var_feature_isStatic);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("uOwnerType", uOwnerType);
		isApplicableMatch.registerObject("jOwnerType", jOwnerType);
		isApplicableMatch.registerObject("jo2uo", jo2uo);
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
			EObject bd2ne, EObject bodyDeclaration, EObject modifier, EObject uOwnerType, EObject vdf,
			EObject jOwnerType, EObject jo2uo) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("modifier", modifier);
		ruleresult.registerObject("uOwnerType", uOwnerType);
		ruleresult.registerObject("vdf", vdf);
		ruleresult.registerObject("jOwnerType", jOwnerType);
		ruleresult.registerObject("jo2uo", jo2uo);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_49(EMoflonEdge _edge_ownedAttribute) {

		Object[] result1_bindingAndBlack = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_20_2_testcorematchandDECs_blackFFB(_edge_ownedAttribute)) {
			Property feature = (Property) result2_black[0];
			Enumeration uOwnerType = (Enumeration) result2_black[1];
			Object[] result2_green = FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, feature, uOwnerType)) {
				// 
				if (FieldDec2Property4Enum_WithModifierImpl
						.pattern_FieldDec2Property4Enum_WithModifier_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = FieldDec2Property4Enum_WithModifierImpl
							.pattern_FieldDec2Property4Enum_WithModifier_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldDec2Property4Enum_WithModifierImpl
							.pattern_FieldDec2Property4Enum_WithModifier_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_50(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_21_2_testcorematchandDECs_blackFFFFB(
						_edge_bodyDeclarations)) {
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_black[0];
			Modifier modifier = (Modifier) result2_black[1];
			VariableDeclarationFragment vdf = (VariableDeclarationFragment) result2_black[2];
			AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) result2_black[3];
			Object[] result2_green = FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, bodyDeclaration, modifier, vdf, jOwnerType)) {
				// 
				if (FieldDec2Property4Enum_WithModifierImpl
						.pattern_FieldDec2Property4Enum_WithModifier_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = FieldDec2Property4Enum_WithModifierImpl
							.pattern_FieldDec2Property4Enum_WithModifier_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldDec2Property4Enum_WithModifierImpl
							.pattern_FieldDec2Property4Enum_WithModifier_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldDec2Property4Enum_WithModifier");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf", true, csp);
		var_vdf_name.setValue(__helper.getValue("vdf", "name"));
		var_vdf_name.setType("String");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

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

		eq0.setRuleName("FieldDec2Property4Enum_WithModifier");
		eq0.solve(var_vdf_name, var_feature_name);

		eq1.setRuleName("FieldDec2Property4Enum_WithModifier");
		eq1.solve(var_modifier_static, var_feature_isStatic);

		jVisibility2umlVisibility2.setRuleName("FieldDec2Property4Enum_WithModifier");
		jVisibility2umlVisibility2.solve(var_modifier_visibility, var_feature_visibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_feature_name.setBound(false);
			var_feature_isStatic.setBound(false);
			var_feature_visibility.setBound(false);
			eq0.solve(var_vdf_name, var_feature_name);
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
		ruleResult.setRule("FieldDec2Property4Enum_WithModifier");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf", true, csp);
		var_vdf_name.setValue(__helper.getValue("vdf", "name"));
		var_vdf_name.setType("String");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

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

		eq0.setRuleName("FieldDec2Property4Enum_WithModifier");
		eq0.solve(var_vdf_name, var_feature_name);

		eq1.setRuleName("FieldDec2Property4Enum_WithModifier");
		eq1.solve(var_modifier_static, var_feature_isStatic);

		jVisibility2umlVisibility2.setRuleName("FieldDec2Property4Enum_WithModifier");
		jVisibility2umlVisibility2.solve(var_modifier_visibility, var_feature_visibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_vdf_name.setBound(false);
			var_modifier_static.setBound(false);
			var_modifier_visibility.setBound(false);
			eq0.solve(var_vdf_name, var_feature_name);
			eq1.solve(var_modifier_static, var_feature_isStatic);
			jVisibility2umlVisibility2.solve(var_modifier_visibility, var_feature_visibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("vdf", "name", var_vdf_name.getValue());
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

		Object[] result1_black = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Property feature = (Property) result2_bindingAndBlack[0];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_bindingAndBlack[1];
		Modifier modifier = (Modifier) result2_bindingAndBlack[2];
		Enumeration uOwnerType = (Enumeration) result2_bindingAndBlack[3];
		VariableDeclarationFragment vdf = (VariableDeclarationFragment) result2_bindingAndBlack[4];
		AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, feature,
						bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[modifier] = " + modifier + ", " + "[uOwnerType] = " + uOwnerType + ", " + "[vdf] = " + vdf
					+ ", " + "[jOwnerType] = " + jOwnerType + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_24_5_matchcorrcontext_blackBBFBB(uOwnerType,
							jOwnerType, sourceMatch, targetMatch)) {
				NamedElement2NamedElement jo2uo = (NamedElement2NamedElement) result5_black[2];
				Object[] result5_green = FieldDec2Property4Enum_WithModifierImpl
						.pattern_FieldDec2Property4Enum_WithModifier_24_5_matchcorrcontext_greenBBBF(jo2uo, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = FieldDec2Property4Enum_WithModifierImpl
						.pattern_FieldDec2Property4Enum_WithModifier_24_6_createcorrespondence_blackBBBBBBB(feature,
								bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ", "
							+ "[uOwnerType] = " + uOwnerType + ", " + "[vdf] = " + vdf + ", " + "[jOwnerType] = "
							+ jOwnerType + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldDec2Property4Enum_WithModifierImpl
						.pattern_FieldDec2Property4Enum_WithModifier_24_6_createcorrespondence_greenFBFFBBB(feature,
								bodyDeclaration, modifier, ccMatch);
				//nothing Modifier2NamedElement m2f = (Modifier2NamedElement) result6_green[0];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[2];
				//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[3];

				Object[] result7_black = FieldDec2Property4Enum_WithModifierImpl
						.pattern_FieldDec2Property4Enum_WithModifier_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldDec2Property4Enum_WithModifierImpl
						.pattern_FieldDec2Property4Enum_WithModifier_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Property feature, MFieldDefinition bodyDeclaration, Modifier modifier,
			Enumeration uOwnerType, VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf.name", true, csp);
		var_vdf_name.setValue(vdf.getName());
		var_vdf_name.setType("String");
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
		eq.solve(var_vdf_name, var_feature_name);
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
	public boolean checkDEC_FWD(MFieldDefinition bodyDeclaration, Modifier modifier, VariableDeclarationFragment vdf,
			AbstractTypeDeclaration jOwnerType) {// 
		Object[] result1_black = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_27_1_matchtggpattern_blackBBBB(bodyDeclaration, modifier,
						vdf, jOwnerType);
		if (result1_black != null) {
			return FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_27_2_expressionF();
		} else {
			return FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Property feature, Enumeration uOwnerType) {// 
		Object[] result1_black = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_28_1_matchtggpattern_blackBB(feature, uOwnerType);
		if (result1_black != null) {
			return FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_28_2_expressionF();
		} else {
			return FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			NamedElement2NamedElement jo2uoParameter) {

		Object[] result1_black = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList jo2uoList = (RuleEntryList) result2_black[0];
			Enumeration uOwnerType = (Enumeration) result2_black[1];
			NamedElement2NamedElement jo2uo = (NamedElement2NamedElement) result2_black[2];
			AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) result2_black[3];

			Object[] result3_bindingAndBlack = FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_29_3_solveCSP_bindingAndBlackFBBBBBB(this,
							isApplicableMatch, uOwnerType, jOwnerType, jo2uo, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[uOwnerType] = " + uOwnerType + ", "
						+ "[jOwnerType] = " + jOwnerType + ", " + "[jo2uo] = " + jo2uo + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (FieldDec2Property4Enum_WithModifierImpl
					.pattern_FieldDec2Property4Enum_WithModifier_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = FieldDec2Property4Enum_WithModifierImpl
						.pattern_FieldDec2Property4Enum_WithModifier_29_5_checknacs_blackBBB(uOwnerType, jOwnerType,
								jo2uo);
				if (result5_black != null) {

					Object[] result6_black = FieldDec2Property4Enum_WithModifierImpl
							.pattern_FieldDec2Property4Enum_WithModifier_29_6_perform_blackBBBB(uOwnerType, jOwnerType,
									jo2uo, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[uOwnerType] = "
								+ uOwnerType + ", " + "[jOwnerType] = " + jOwnerType + ", " + "[jo2uo] = " + jo2uo
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					FieldDec2Property4Enum_WithModifierImpl
							.pattern_FieldDec2Property4Enum_WithModifier_29_6_perform_greenFFFFFFBFBBB(uOwnerType,
									jOwnerType, ruleResult, csp);
					//nothing Modifier2NamedElement m2f = (Modifier2NamedElement) result6_green[0];
					//nothing Property feature = (Property) result6_green[1];
					//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[2];
					//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[3];
					//nothing MFieldDefinition bodyDeclaration = (MFieldDefinition) result6_green[4];
					//nothing Modifier modifier = (Modifier) result6_green[5];
					//nothing VariableDeclarationFragment vdf = (VariableDeclarationFragment) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return FieldDec2Property4Enum_WithModifierImpl
				.pattern_FieldDec2Property4Enum_WithModifier_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Enumeration uOwnerType,
			AbstractTypeDeclaration jOwnerType, NamedElement2NamedElement jo2uo, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_vdf_name = CSPFactoryHelper.eINSTANCE.createVariable("vdf.name", csp);
		var_vdf_name.setType("String");
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
		eq.solve(var_vdf_name, var_feature_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_modifier_static, var_feature_isStatic);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("uOwnerType", uOwnerType);
		isApplicableMatch.registerObject("jOwnerType", jOwnerType);
		isApplicableMatch.registerObject("jo2uo", jo2uo);
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
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_FWD__MATCH_MFIELDDEFINITION_MODIFIER_VARIABLEDECLARATIONFRAGMENT_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MFieldDefinition) arguments.get(1),
					(Modifier) arguments.get(2), (VariableDeclarationFragment) arguments.get(3),
					(AbstractTypeDeclaration) arguments.get(4));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MFIELDDEFINITION_MODIFIER_VARIABLEDECLARATIONFRAGMENT_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MFieldDefinition) arguments.get(1),
					(Modifier) arguments.get(2), (VariableDeclarationFragment) arguments.get(3),
					(AbstractTypeDeclaration) arguments.get(4));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MFIELDDEFINITION_MODIFIER_VARIABLEDECLARATIONFRAGMENT_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MFieldDefinition) arguments.get(1),
					(Modifier) arguments.get(2), (VariableDeclarationFragment) arguments.get(3),
					(AbstractTypeDeclaration) arguments.get(4));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MFIELDDEFINITION_MODIFIER_ENUMERATION_VARIABLEDECLARATIONFRAGMENT_ABSTRACTTYPEDECLARATION_NAMEDELEMENT2NAMEDELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MFieldDefinition) arguments.get(1),
					(Modifier) arguments.get(2), (Enumeration) arguments.get(3),
					(VariableDeclarationFragment) arguments.get(4), (AbstractTypeDeclaration) arguments.get(5),
					(NamedElement2NamedElement) arguments.get(6));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_BWD__MATCH_PROPERTY_ENUMERATION:
			return isAppropriate_BWD((Match) arguments.get(0), (Property) arguments.get(1),
					(Enumeration) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PROPERTY_ENUMERATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Property) arguments.get(1),
					(Enumeration) arguments.get(2));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PROPERTY_ENUMERATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Property) arguments.get(1),
					(Enumeration) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROPERTY_ENUMERATION_ABSTRACTTYPEDECLARATION_NAMEDELEMENT2NAMEDELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Property) arguments.get(1),
					(Enumeration) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3),
					(NamedElement2NamedElement) arguments.get(4));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_49__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_49((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_50__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_50((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_CC__PROPERTY_MFIELDDEFINITION_MODIFIER_ENUMERATION_VARIABLEDECLARATIONFRAGMENT_ABSTRACTTYPEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Property) arguments.get(0), (MFieldDefinition) arguments.get(1),
					(Modifier) arguments.get(2), (Enumeration) arguments.get(3),
					(VariableDeclarationFragment) arguments.get(4), (AbstractTypeDeclaration) arguments.get(5),
					(Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___CHECK_DEC_FWD__MFIELDDEFINITION_MODIFIER_VARIABLEDECLARATIONFRAGMENT_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((MFieldDefinition) arguments.get(0), (Modifier) arguments.get(1),
					(VariableDeclarationFragment) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___CHECK_DEC_BWD__PROPERTY_ENUMERATION:
			return checkDEC_BWD((Property) arguments.get(0), (Enumeration) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___GENERATE_MODEL__RULEENTRYCONTAINER_NAMEDELEMENT2NAMEDELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (NamedElement2NamedElement) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ENUMERATION_ABSTRACTTYPEDECLARATION_NAMEDELEMENT2NAMEDELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Enumeration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (NamedElement2NamedElement) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.FIELD_DEC2_PROPERTY4_ENUM_WITH_MODIFIER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_0_1_initialbindings_blackBBBBBB(
			FieldDec2Property4Enum_WithModifier _this, Match match, MFieldDefinition bodyDeclaration, Modifier modifier,
			VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType) {
		return new Object[] { _this, match, bodyDeclaration, modifier, vdf, jOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_0_2_SolveCSP_bindingFBBBBBB(
			FieldDec2Property4Enum_WithModifier _this, Match match, MFieldDefinition bodyDeclaration, Modifier modifier,
			VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration, modifier, vdf, jOwnerType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration, modifier, vdf, jOwnerType };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			FieldDec2Property4Enum_WithModifier _this, Match match, MFieldDefinition bodyDeclaration, Modifier modifier,
			VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType) {
		Object[] result_pattern_FieldDec2Property4Enum_WithModifier_0_2_SolveCSP_binding = pattern_FieldDec2Property4Enum_WithModifier_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, bodyDeclaration, modifier, vdf, jOwnerType);
		if (result_pattern_FieldDec2Property4Enum_WithModifier_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Enum_WithModifier_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property4Enum_WithModifier_0_2_SolveCSP_black = pattern_FieldDec2Property4Enum_WithModifier_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Enum_WithModifier_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration, modifier, vdf, jOwnerType };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_0_3_CheckCSP_expressionFBB(
			FieldDec2Property4Enum_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, MFieldDefinition bodyDeclaration, Modifier modifier, VariableDeclarationFragment vdf,
			AbstractTypeDeclaration jOwnerType) {
		return new Object[] { match, bodyDeclaration, modifier, vdf, jOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_0_4_collectelementstobetranslated_greenBBBBBFFFFFF(
			Match match, MFieldDefinition bodyDeclaration, Modifier modifier, VariableDeclarationFragment vdf,
			AbstractTypeDeclaration jOwnerType) {
		EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__vdf____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vdf__bodyDeclaration____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		match.getToBeTranslatedNodes().add(modifier);
		match.getToBeTranslatedNodes().add(vdf);
		String jOwnerType__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String bodyDeclaration__vdf____fragments_name_prime = "fragments";
		String vdf__bodyDeclaration____variablesContainer_name_prime = "variablesContainer";
		jOwnerType__bodyDeclaration____bodyDeclarations.setSrc(jOwnerType);
		jOwnerType__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(jOwnerType__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setTrg(jOwnerType);
		match.getToBeTranslatedEdges().add(bodyDeclaration__jOwnerType____abstractTypeDeclaration);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		match.getToBeTranslatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		bodyDeclaration__vdf____fragments.setSrc(bodyDeclaration);
		bodyDeclaration__vdf____fragments.setTrg(vdf);
		match.getToBeTranslatedEdges().add(bodyDeclaration__vdf____fragments);
		vdf__bodyDeclaration____variablesContainer.setSrc(vdf);
		vdf__bodyDeclaration____variablesContainer.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(vdf__bodyDeclaration____variablesContainer);
		jOwnerType__bodyDeclaration____bodyDeclarations
				.setName(jOwnerType__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration
				.setName(bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		bodyDeclaration__vdf____fragments.setName(bodyDeclaration__vdf____fragments_name_prime);
		vdf__bodyDeclaration____variablesContainer.setName(vdf__bodyDeclaration____variablesContainer_name_prime);
		return new Object[] { match, bodyDeclaration, modifier, vdf, jOwnerType,
				jOwnerType__bodyDeclaration____bodyDeclarations, bodyDeclaration__jOwnerType____abstractTypeDeclaration,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration,
				bodyDeclaration__vdf____fragments, vdf__bodyDeclaration____variablesContainer };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_0_5_collectcontextelements_blackBBBBB(
			Match match, MFieldDefinition bodyDeclaration, Modifier modifier, VariableDeclarationFragment vdf,
			AbstractTypeDeclaration jOwnerType) {
		return new Object[] { match, bodyDeclaration, modifier, vdf, jOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_0_5_collectcontextelements_greenBB(
			Match match, AbstractTypeDeclaration jOwnerType) {
		match.getContextNodes().add(jOwnerType);
		return new Object[] { match, jOwnerType };
	}

	public static final void pattern_FieldDec2Property4Enum_WithModifier_0_6_registerobjectstomatch_expressionBBBBBB(
			FieldDec2Property4Enum_WithModifier _this, Match match, MFieldDefinition bodyDeclaration, Modifier modifier,
			VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration, modifier, vdf, jOwnerType);

	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("modifier");
		EObject _localVariable_2 = isApplicableMatch.getObject("uOwnerType");
		EObject _localVariable_3 = isApplicableMatch.getObject("vdf");
		EObject _localVariable_4 = isApplicableMatch.getObject("jOwnerType");
		EObject _localVariable_5 = isApplicableMatch.getObject("jo2uo");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpModifier = _localVariable_1;
		EObject tmpUOwnerType = _localVariable_2;
		EObject tmpVdf = _localVariable_3;
		EObject tmpJOwnerType = _localVariable_4;
		EObject tmpJo2uo = _localVariable_5;
		if (tmpBodyDeclaration instanceof MFieldDefinition) {
			MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
			if (tmpModifier instanceof Modifier) {
				Modifier modifier = (Modifier) tmpModifier;
				if (tmpUOwnerType instanceof Enumeration) {
					Enumeration uOwnerType = (Enumeration) tmpUOwnerType;
					if (tmpVdf instanceof VariableDeclarationFragment) {
						VariableDeclarationFragment vdf = (VariableDeclarationFragment) tmpVdf;
						if (tmpJOwnerType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) tmpJOwnerType;
							if (tmpJo2uo instanceof NamedElement2NamedElement) {
								NamedElement2NamedElement jo2uo = (NamedElement2NamedElement) tmpJo2uo;
								return new Object[] { bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, jo2uo,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_blackBBBBBBFBB(
			MFieldDefinition bodyDeclaration, Modifier modifier, Enumeration uOwnerType,
			VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType, NamedElement2NamedElement jo2uo,
			FieldDec2Property4Enum_WithModifier _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, jo2uo, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			FieldDec2Property4Enum_WithModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_binding = pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_binding != null) {
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result_pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_binding[0];
			Modifier modifier = (Modifier) result_pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_binding[1];
			Enumeration uOwnerType = (Enumeration) result_pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_binding[2];
			VariableDeclarationFragment vdf = (VariableDeclarationFragment) result_pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_binding[3];
			AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) result_pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_binding[4];
			NamedElement2NamedElement jo2uo = (NamedElement2NamedElement) result_pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_binding[5];

			Object[] result_pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_black = pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_blackBBBBBBFBB(
					bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, jo2uo, _this, isApplicableMatch);
			if (result_pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_black[6];

				return new Object[] { bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, jo2uo, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_1_1_performtransformation_greenFFFFBBBB(
			MFieldDefinition bodyDeclaration, Modifier modifier, Enumeration uOwnerType, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		Property feature = UMLFactory.eINSTANCE.createProperty();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("feature", "isStatic");
		Object _localVariable_2 = csp.getValue("feature", "visibility");
		m2f.setSource(modifier);
		m2f.setTarget(feature);
		uOwnerType.getOwnedAttributes().add(feature);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		bd2ne.setSource(bodyDeclaration);
		bd2ne.setTarget(feature);
		String feature_name_prime = (String) _localVariable_0;
		boolean feature_isStatic_prime = (boolean) _localVariable_1;
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_2;
		feature.setName(feature_name_prime);
		feature.setIsStatic(Boolean.valueOf(feature_isStatic_prime));
		feature.setVisibility(feature_visibility_prime);
		return new Object[] { m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, uOwnerType, csp };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_1_2_collecttranslatedelements_blackBBBBBBB(
			Modifier2NamedElement m2f, Property feature, ASTNode2Element b2e, NamedElement2NamedElement bd2ne,
			MFieldDefinition bodyDeclaration, Modifier modifier, VariableDeclarationFragment vdf) {
		return new Object[] { m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, vdf };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_1_2_collecttranslatedelements_greenFBBBBBBB(
			Modifier2NamedElement m2f, Property feature, ASTNode2Element b2e, NamedElement2NamedElement bd2ne,
			MFieldDefinition bodyDeclaration, Modifier modifier, VariableDeclarationFragment vdf) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2f);
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		ruleresult.getTranslatedElements().add(modifier);
		ruleresult.getTranslatedElements().add(vdf);
		return new Object[] { ruleresult, m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, vdf };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject b2e, EObject bd2ne,
			EObject bodyDeclaration, EObject modifier, EObject uOwnerType, EObject vdf, EObject jOwnerType,
			EObject jo2uo) {
		if (!m2f.equals(modifier)) {
			if (!m2f.equals(uOwnerType)) {
				if (!m2f.equals(vdf)) {
					if (!feature.equals(m2f)) {
						if (!feature.equals(modifier)) {
							if (!feature.equals(uOwnerType)) {
								if (!feature.equals(vdf)) {
									if (!feature.equals(jOwnerType)) {
										if (!feature.equals(jo2uo)) {
											if (!b2e.equals(m2f)) {
												if (!b2e.equals(feature)) {
													if (!b2e.equals(bd2ne)) {
														if (!b2e.equals(bodyDeclaration)) {
															if (!b2e.equals(modifier)) {
																if (!b2e.equals(uOwnerType)) {
																	if (!b2e.equals(vdf)) {
																		if (!b2e.equals(jOwnerType)) {
																			if (!b2e.equals(jo2uo)) {
																				if (!bd2ne.equals(m2f)) {
																					if (!bd2ne.equals(feature)) {
																						if (!bd2ne.equals(
																								bodyDeclaration)) {
																							if (!bd2ne
																									.equals(modifier)) {
																								if (!bd2ne.equals(
																										uOwnerType)) {
																									if (!bd2ne.equals(
																											vdf)) {
																										if (!bd2ne
																												.equals(jOwnerType)) {
																											if (!bd2ne
																													.equals(jo2uo)) {
																												if (!bodyDeclaration
																														.equals(m2f)) {
																													if (!bodyDeclaration
																															.equals(feature)) {
																														if (!bodyDeclaration
																																.equals(modifier)) {
																															if (!bodyDeclaration
																																	.equals(uOwnerType)) {
																																if (!bodyDeclaration
																																		.equals(vdf)) {
																																	if (!bodyDeclaration
																																			.equals(jOwnerType)) {
																																		if (!bodyDeclaration
																																				.equals(jo2uo)) {
																																			if (!modifier
																																					.equals(uOwnerType)) {
																																				if (!modifier
																																						.equals(vdf)) {
																																					if (!uOwnerType
																																							.equals(vdf)) {
																																						if (!jOwnerType
																																								.equals(m2f)) {
																																							if (!jOwnerType
																																									.equals(modifier)) {
																																								if (!jOwnerType
																																										.equals(uOwnerType)) {
																																									if (!jOwnerType
																																											.equals(vdf)) {
																																										if (!jOwnerType
																																												.equals(jo2uo)) {
																																											if (!jo2uo
																																													.equals(m2f)) {
																																												if (!jo2uo
																																														.equals(modifier)) {
																																													if (!jo2uo
																																															.equals(uOwnerType)) {
																																														if (!jo2uo
																																																.equals(vdf)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	m2f,
																																																	feature,
																																																	b2e,
																																																	bd2ne,
																																																	bodyDeclaration,
																																																	modifier,
																																																	uOwnerType,
																																																	vdf,
																																																	jOwnerType,
																																																	jo2uo };
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
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject b2e, EObject bd2ne,
			EObject bodyDeclaration, EObject modifier, EObject uOwnerType, EObject vdf, EObject jOwnerType) {
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__vdf____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vdf__bodyDeclaration____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uOwnerType__feature____ownedAttribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__uOwnerType____datatype = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldDec2Property4Enum_WithModifier";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String jOwnerType__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String m2f__feature____target_name_prime = "target";
		String bodyDeclaration__vdf____fragments_name_prime = "fragments";
		String vdf__bodyDeclaration____variablesContainer_name_prime = "variablesContainer";
		String bd2ne__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String uOwnerType__feature____ownedAttribute_name_prime = "ownedAttribute";
		String feature__uOwnerType____datatype_name_prime = "datatype";
		String m2f__modifier____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		jOwnerType__bodyDeclaration____bodyDeclarations.setSrc(jOwnerType);
		jOwnerType__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(jOwnerType__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setTrg(jOwnerType);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__jOwnerType____abstractTypeDeclaration);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		m2f__feature____target.setSrc(m2f);
		m2f__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(m2f__feature____target);
		bodyDeclaration__vdf____fragments.setSrc(bodyDeclaration);
		bodyDeclaration__vdf____fragments.setTrg(vdf);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__vdf____fragments);
		vdf__bodyDeclaration____variablesContainer.setSrc(vdf);
		vdf__bodyDeclaration____variablesContainer.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(vdf__bodyDeclaration____variablesContainer);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		uOwnerType__feature____ownedAttribute.setSrc(uOwnerType);
		uOwnerType__feature____ownedAttribute.setTrg(feature);
		ruleresult.getCreatedEdges().add(uOwnerType__feature____ownedAttribute);
		feature__uOwnerType____datatype.setSrc(feature);
		feature__uOwnerType____datatype.setTrg(uOwnerType);
		ruleresult.getCreatedEdges().add(feature__uOwnerType____datatype);
		m2f__modifier____source.setSrc(m2f);
		m2f__modifier____source.setTrg(modifier);
		ruleresult.getCreatedEdges().add(m2f__modifier____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		jOwnerType__bodyDeclaration____bodyDeclarations
				.setName(jOwnerType__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration
				.setName(bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		m2f__feature____target.setName(m2f__feature____target_name_prime);
		bodyDeclaration__vdf____fragments.setName(bodyDeclaration__vdf____fragments_name_prime);
		vdf__bodyDeclaration____variablesContainer.setName(vdf__bodyDeclaration____variablesContainer_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		uOwnerType__feature____ownedAttribute.setName(uOwnerType__feature____ownedAttribute_name_prime);
		feature__uOwnerType____datatype.setName(feature__uOwnerType____datatype_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, uOwnerType, vdf,
				jOwnerType, bd2ne__bodyDeclaration____source, jOwnerType__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jOwnerType____abstractTypeDeclaration, bodyDeclaration__modifier____modifier,
				modifier__bodyDeclaration____bodyDeclaration, m2f__feature____target, bodyDeclaration__vdf____fragments,
				vdf__bodyDeclaration____variablesContainer, bd2ne__feature____target, b2e__bodyDeclaration____source,
				uOwnerType__feature____ownedAttribute, feature__uOwnerType____datatype, m2f__modifier____source,
				b2e__feature____target };
	}

	public static final void pattern_FieldDec2Property4Enum_WithModifier_1_5_registerobjects_expressionBBBBBBBBBBBB(
			FieldDec2Property4Enum_WithModifier _this, PerformRuleResult ruleresult, EObject m2f, EObject feature,
			EObject b2e, EObject bd2ne, EObject bodyDeclaration, EObject modifier, EObject uOwnerType, EObject vdf,
			EObject jOwnerType, EObject jo2uo) {
		_this.registerObjects_FWD(ruleresult, m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, uOwnerType, vdf,
				jOwnerType, jo2uo);

	}

	public static final PerformRuleResult pattern_FieldDec2Property4Enum_WithModifier_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_2_1_preparereturnvalue_bindingFB(
			FieldDec2Property4Enum_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_2_1_preparereturnvalue_blackFBB(
			EClass eClass, FieldDec2Property4Enum_WithModifier _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_2_1_preparereturnvalue_bindingAndBlackFFB(
			FieldDec2Property4Enum_WithModifier _this) {
		Object[] result_pattern_FieldDec2Property4Enum_WithModifier_2_1_preparereturnvalue_binding = pattern_FieldDec2Property4Enum_WithModifier_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property4Enum_WithModifier_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldDec2Property4Enum_WithModifier_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property4Enum_WithModifier_2_1_preparereturnvalue_black = pattern_FieldDec2Property4Enum_WithModifier_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldDec2Property4Enum_WithModifier_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldDec2Property4Enum_WithModifier_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldDec2Property4Enum_WithModifier";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject _localVariable_1 = match.getObject("modifier");
		EObject _localVariable_2 = match.getObject("vdf");
		EObject _localVariable_3 = match.getObject("jOwnerType");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpModifier = _localVariable_1;
		EObject tmpVdf = _localVariable_2;
		EObject tmpJOwnerType = _localVariable_3;
		if (tmpBodyDeclaration instanceof MFieldDefinition) {
			MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
			if (tmpModifier instanceof Modifier) {
				Modifier modifier = (Modifier) tmpModifier;
				if (tmpVdf instanceof VariableDeclarationFragment) {
					VariableDeclarationFragment vdf = (VariableDeclarationFragment) tmpVdf;
					if (tmpJOwnerType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) tmpJOwnerType;
						return new Object[] { bodyDeclaration, modifier, vdf, jOwnerType, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Enum_WithModifier_2_2_corematch_blackBBFBBFB(
			MFieldDefinition bodyDeclaration, Modifier modifier, VariableDeclarationFragment vdf,
			AbstractTypeDeclaration jOwnerType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (NamedElement2NamedElement jo2uo : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jOwnerType, NamedElement2NamedElement.class, "source")) {
			NamedElement tmpUOwnerType = jo2uo.getTarget();
			if (tmpUOwnerType instanceof Enumeration) {
				Enumeration uOwnerType = (Enumeration) tmpUOwnerType;
				_result.add(new Object[] { bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, jo2uo, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Enum_WithModifier_2_3_findcontext_blackBBBBBB(
			MFieldDefinition bodyDeclaration, Modifier modifier, Enumeration uOwnerType,
			VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType, NamedElement2NamedElement jo2uo) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jOwnerType.equals(jo2uo.getSource())) {
			if (jOwnerType.getBodyDeclarations().contains(bodyDeclaration)) {
				if (modifier.equals(bodyDeclaration.getModifier())) {
					if (bodyDeclaration.getFragments().contains(vdf)) {
						if (uOwnerType.equals(jo2uo.getTarget())) {
							_result.add(new Object[] { bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, jo2uo });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_2_3_findcontext_greenBBBBBBFFFFFFFFF(
			MFieldDefinition bodyDeclaration, Modifier modifier, Enumeration uOwnerType,
			VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType, NamedElement2NamedElement jo2uo) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jo2uo__jOwnerType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__vdf____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vdf__bodyDeclaration____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jo2uo__uOwnerType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jo2uo__jOwnerType____source_name_prime = "source";
		String jOwnerType__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String bodyDeclaration__vdf____fragments_name_prime = "fragments";
		String vdf__bodyDeclaration____variablesContainer_name_prime = "variablesContainer";
		String jo2uo__uOwnerType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(modifier);
		isApplicableMatch.getAllContextElements().add(uOwnerType);
		isApplicableMatch.getAllContextElements().add(vdf);
		isApplicableMatch.getAllContextElements().add(jOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo);
		jo2uo__jOwnerType____source.setSrc(jo2uo);
		jo2uo__jOwnerType____source.setTrg(jOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo__jOwnerType____source);
		jOwnerType__bodyDeclaration____bodyDeclarations.setSrc(jOwnerType);
		jOwnerType__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jOwnerType__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setTrg(jOwnerType);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__jOwnerType____abstractTypeDeclaration);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(modifier__bodyDeclaration____bodyDeclaration);
		bodyDeclaration__vdf____fragments.setSrc(bodyDeclaration);
		bodyDeclaration__vdf____fragments.setTrg(vdf);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__vdf____fragments);
		vdf__bodyDeclaration____variablesContainer.setSrc(vdf);
		vdf__bodyDeclaration____variablesContainer.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(vdf__bodyDeclaration____variablesContainer);
		jo2uo__uOwnerType____target.setSrc(jo2uo);
		jo2uo__uOwnerType____target.setTrg(uOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo__uOwnerType____target);
		jo2uo__jOwnerType____source.setName(jo2uo__jOwnerType____source_name_prime);
		jOwnerType__bodyDeclaration____bodyDeclarations
				.setName(jOwnerType__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration
				.setName(bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		bodyDeclaration__vdf____fragments.setName(bodyDeclaration__vdf____fragments_name_prime);
		vdf__bodyDeclaration____variablesContainer.setName(vdf__bodyDeclaration____variablesContainer_name_prime);
		jo2uo__uOwnerType____target.setName(jo2uo__uOwnerType____target_name_prime);
		return new Object[] { bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, jo2uo, isApplicableMatch,
				jo2uo__jOwnerType____source, jOwnerType__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jOwnerType____abstractTypeDeclaration, bodyDeclaration__modifier____modifier,
				modifier__bodyDeclaration____bodyDeclaration, bodyDeclaration__vdf____fragments,
				vdf__bodyDeclaration____variablesContainer, jo2uo__uOwnerType____target };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_2_4_solveCSP_bindingFBBBBBBBB(
			FieldDec2Property4Enum_WithModifier _this, IsApplicableMatch isApplicableMatch,
			MFieldDefinition bodyDeclaration, Modifier modifier, Enumeration uOwnerType,
			VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType, NamedElement2NamedElement jo2uo) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, bodyDeclaration, modifier, uOwnerType,
				vdf, jOwnerType, jo2uo);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType,
					jo2uo };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			FieldDec2Property4Enum_WithModifier _this, IsApplicableMatch isApplicableMatch,
			MFieldDefinition bodyDeclaration, Modifier modifier, Enumeration uOwnerType,
			VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType, NamedElement2NamedElement jo2uo) {
		Object[] result_pattern_FieldDec2Property4Enum_WithModifier_2_4_solveCSP_binding = pattern_FieldDec2Property4Enum_WithModifier_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, jo2uo);
		if (result_pattern_FieldDec2Property4Enum_WithModifier_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Enum_WithModifier_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property4Enum_WithModifier_2_4_solveCSP_black = pattern_FieldDec2Property4Enum_WithModifier_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Enum_WithModifier_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, modifier, uOwnerType, vdf,
						jOwnerType, jo2uo };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_2_5_checkCSP_expressionFBB(
			FieldDec2Property4Enum_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldDec2Property4Enum_WithModifier";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDec2Property4Enum_WithModifier_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_10_1_initialbindings_blackBBBB(
			FieldDec2Property4Enum_WithModifier _this, Match match, Property feature, Enumeration uOwnerType) {
		return new Object[] { _this, match, feature, uOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_10_2_SolveCSP_bindingFBBBB(
			FieldDec2Property4Enum_WithModifier _this, Match match, Property feature, Enumeration uOwnerType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, uOwnerType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, uOwnerType };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_10_2_SolveCSP_bindingAndBlackFBBBB(
			FieldDec2Property4Enum_WithModifier _this, Match match, Property feature, Enumeration uOwnerType) {
		Object[] result_pattern_FieldDec2Property4Enum_WithModifier_10_2_SolveCSP_binding = pattern_FieldDec2Property4Enum_WithModifier_10_2_SolveCSP_bindingFBBBB(
				_this, match, feature, uOwnerType);
		if (result_pattern_FieldDec2Property4Enum_WithModifier_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Enum_WithModifier_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property4Enum_WithModifier_10_2_SolveCSP_black = pattern_FieldDec2Property4Enum_WithModifier_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Enum_WithModifier_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, uOwnerType };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_10_3_CheckCSP_expressionFBB(
			FieldDec2Property4Enum_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_10_4_collectelementstobetranslated_blackBBB(
			Match match, Property feature, Enumeration uOwnerType) {
		return new Object[] { match, feature, uOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, Property feature, Enumeration uOwnerType) {
		EMoflonEdge uOwnerType__feature____ownedAttribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__uOwnerType____datatype = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(feature);
		String uOwnerType__feature____ownedAttribute_name_prime = "ownedAttribute";
		String feature__uOwnerType____datatype_name_prime = "datatype";
		uOwnerType__feature____ownedAttribute.setSrc(uOwnerType);
		uOwnerType__feature____ownedAttribute.setTrg(feature);
		match.getToBeTranslatedEdges().add(uOwnerType__feature____ownedAttribute);
		feature__uOwnerType____datatype.setSrc(feature);
		feature__uOwnerType____datatype.setTrg(uOwnerType);
		match.getToBeTranslatedEdges().add(feature__uOwnerType____datatype);
		uOwnerType__feature____ownedAttribute.setName(uOwnerType__feature____ownedAttribute_name_prime);
		feature__uOwnerType____datatype.setName(feature__uOwnerType____datatype_name_prime);
		return new Object[] { match, feature, uOwnerType, uOwnerType__feature____ownedAttribute,
				feature__uOwnerType____datatype };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_10_5_collectcontextelements_blackBBB(
			Match match, Property feature, Enumeration uOwnerType) {
		return new Object[] { match, feature, uOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_10_5_collectcontextelements_greenBB(
			Match match, Enumeration uOwnerType) {
		match.getContextNodes().add(uOwnerType);
		return new Object[] { match, uOwnerType };
	}

	public static final void pattern_FieldDec2Property4Enum_WithModifier_10_6_registerobjectstomatch_expressionBBBB(
			FieldDec2Property4Enum_WithModifier _this, Match match, Property feature, Enumeration uOwnerType) {
		_this.registerObjectsToMatch_BWD(match, feature, uOwnerType);

	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("uOwnerType");
		EObject _localVariable_2 = isApplicableMatch.getObject("jOwnerType");
		EObject _localVariable_3 = isApplicableMatch.getObject("jo2uo");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUOwnerType = _localVariable_1;
		EObject tmpJOwnerType = _localVariable_2;
		EObject tmpJo2uo = _localVariable_3;
		if (tmpFeature instanceof Property) {
			Property feature = (Property) tmpFeature;
			if (tmpUOwnerType instanceof Enumeration) {
				Enumeration uOwnerType = (Enumeration) tmpUOwnerType;
				if (tmpJOwnerType instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) tmpJOwnerType;
					if (tmpJo2uo instanceof NamedElement2NamedElement) {
						NamedElement2NamedElement jo2uo = (NamedElement2NamedElement) tmpJo2uo;
						return new Object[] { feature, uOwnerType, jOwnerType, jo2uo, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_blackBBBBFBB(
			Property feature, Enumeration uOwnerType, AbstractTypeDeclaration jOwnerType,
			NamedElement2NamedElement jo2uo, FieldDec2Property4Enum_WithModifier _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { feature, uOwnerType, jOwnerType, jo2uo, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_bindingAndBlackFFFFFBB(
			FieldDec2Property4Enum_WithModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_binding = pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_binding != null) {
			Property feature = (Property) result_pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_binding[0];
			Enumeration uOwnerType = (Enumeration) result_pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_binding[1];
			AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) result_pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_binding[2];
			NamedElement2NamedElement jo2uo = (NamedElement2NamedElement) result_pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_binding[3];

			Object[] result_pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_black = pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_blackBBBBFBB(
					feature, uOwnerType, jOwnerType, jo2uo, _this, isApplicableMatch);
			if (result_pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_black[4];

				return new Object[] { feature, uOwnerType, jOwnerType, jo2uo, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_11_1_performtransformation_greenFBFFFFFBB(
			Property feature, AbstractTypeDeclaration jOwnerType, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		MFieldDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		Modifier modifier = JavaFactory.eINSTANCE.createModifier();
		VariableDeclarationFragment vdf = JavaFactory.eINSTANCE.createVariableDeclarationFragment();
		Object _localVariable_0 = csp.getValue("modifier", "static");
		Object _localVariable_1 = csp.getValue("modifier", "visibility");
		Object _localVariable_2 = csp.getValue("vdf", "name");
		m2f.setTarget(feature);
		b2e.setTarget(feature);
		bd2ne.setTarget(feature);
		bd2ne.setSource(bodyDeclaration);
		jOwnerType.getBodyDeclarations().add(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		bodyDeclaration.setModifier(modifier);
		m2f.setSource(modifier);
		bodyDeclaration.getFragments().add(vdf);
		boolean modifier_static_prime = (boolean) _localVariable_0;
		org.eclipse.modisco.java.VisibilityKind modifier_visibility_prime = (org.eclipse.modisco.java.VisibilityKind) _localVariable_1;
		String vdf_name_prime = (String) _localVariable_2;
		modifier.setStatic(Boolean.valueOf(modifier_static_prime));
		modifier.setVisibility(modifier_visibility_prime);
		vdf.setName(vdf_name_prime);
		return new Object[] { m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, vdf, jOwnerType, csp };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_11_2_collecttranslatedelements_blackBBBBBBB(
			Modifier2NamedElement m2f, Property feature, ASTNode2Element b2e, NamedElement2NamedElement bd2ne,
			MFieldDefinition bodyDeclaration, Modifier modifier, VariableDeclarationFragment vdf) {
		return new Object[] { m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, vdf };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_11_2_collecttranslatedelements_greenFBBBBBBB(
			Modifier2NamedElement m2f, Property feature, ASTNode2Element b2e, NamedElement2NamedElement bd2ne,
			MFieldDefinition bodyDeclaration, Modifier modifier, VariableDeclarationFragment vdf) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2f);
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		ruleresult.getCreatedElements().add(modifier);
		ruleresult.getCreatedElements().add(vdf);
		return new Object[] { ruleresult, m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, vdf };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject b2e, EObject bd2ne,
			EObject bodyDeclaration, EObject modifier, EObject uOwnerType, EObject vdf, EObject jOwnerType,
			EObject jo2uo) {
		if (!m2f.equals(modifier)) {
			if (!m2f.equals(uOwnerType)) {
				if (!m2f.equals(vdf)) {
					if (!feature.equals(m2f)) {
						if (!feature.equals(modifier)) {
							if (!feature.equals(uOwnerType)) {
								if (!feature.equals(vdf)) {
									if (!feature.equals(jOwnerType)) {
										if (!feature.equals(jo2uo)) {
											if (!b2e.equals(m2f)) {
												if (!b2e.equals(feature)) {
													if (!b2e.equals(bd2ne)) {
														if (!b2e.equals(bodyDeclaration)) {
															if (!b2e.equals(modifier)) {
																if (!b2e.equals(uOwnerType)) {
																	if (!b2e.equals(vdf)) {
																		if (!b2e.equals(jOwnerType)) {
																			if (!b2e.equals(jo2uo)) {
																				if (!bd2ne.equals(m2f)) {
																					if (!bd2ne.equals(feature)) {
																						if (!bd2ne.equals(
																								bodyDeclaration)) {
																							if (!bd2ne
																									.equals(modifier)) {
																								if (!bd2ne.equals(
																										uOwnerType)) {
																									if (!bd2ne.equals(
																											vdf)) {
																										if (!bd2ne
																												.equals(jOwnerType)) {
																											if (!bd2ne
																													.equals(jo2uo)) {
																												if (!bodyDeclaration
																														.equals(m2f)) {
																													if (!bodyDeclaration
																															.equals(feature)) {
																														if (!bodyDeclaration
																																.equals(modifier)) {
																															if (!bodyDeclaration
																																	.equals(uOwnerType)) {
																																if (!bodyDeclaration
																																		.equals(vdf)) {
																																	if (!bodyDeclaration
																																			.equals(jOwnerType)) {
																																		if (!bodyDeclaration
																																				.equals(jo2uo)) {
																																			if (!modifier
																																					.equals(uOwnerType)) {
																																				if (!modifier
																																						.equals(vdf)) {
																																					if (!uOwnerType
																																							.equals(vdf)) {
																																						if (!jOwnerType
																																								.equals(m2f)) {
																																							if (!jOwnerType
																																									.equals(modifier)) {
																																								if (!jOwnerType
																																										.equals(uOwnerType)) {
																																									if (!jOwnerType
																																											.equals(vdf)) {
																																										if (!jOwnerType
																																												.equals(jo2uo)) {
																																											if (!jo2uo
																																													.equals(m2f)) {
																																												if (!jo2uo
																																														.equals(modifier)) {
																																													if (!jo2uo
																																															.equals(uOwnerType)) {
																																														if (!jo2uo
																																																.equals(vdf)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	m2f,
																																																	feature,
																																																	b2e,
																																																	bd2ne,
																																																	bodyDeclaration,
																																																	modifier,
																																																	uOwnerType,
																																																	vdf,
																																																	jOwnerType,
																																																	jo2uo };
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
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject b2e, EObject bd2ne,
			EObject bodyDeclaration, EObject modifier, EObject uOwnerType, EObject vdf, EObject jOwnerType) {
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__vdf____fragments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vdf__bodyDeclaration____variablesContainer = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uOwnerType__feature____ownedAttribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__uOwnerType____datatype = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldDec2Property4Enum_WithModifier";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String jOwnerType__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String m2f__feature____target_name_prime = "target";
		String bodyDeclaration__vdf____fragments_name_prime = "fragments";
		String vdf__bodyDeclaration____variablesContainer_name_prime = "variablesContainer";
		String bd2ne__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String uOwnerType__feature____ownedAttribute_name_prime = "ownedAttribute";
		String feature__uOwnerType____datatype_name_prime = "datatype";
		String m2f__modifier____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		jOwnerType__bodyDeclaration____bodyDeclarations.setSrc(jOwnerType);
		jOwnerType__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(jOwnerType__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setTrg(jOwnerType);
		ruleresult.getCreatedEdges().add(bodyDeclaration__jOwnerType____abstractTypeDeclaration);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		ruleresult.getCreatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		m2f__feature____target.setSrc(m2f);
		m2f__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(m2f__feature____target);
		bodyDeclaration__vdf____fragments.setSrc(bodyDeclaration);
		bodyDeclaration__vdf____fragments.setTrg(vdf);
		ruleresult.getCreatedEdges().add(bodyDeclaration__vdf____fragments);
		vdf__bodyDeclaration____variablesContainer.setSrc(vdf);
		vdf__bodyDeclaration____variablesContainer.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(vdf__bodyDeclaration____variablesContainer);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		uOwnerType__feature____ownedAttribute.setSrc(uOwnerType);
		uOwnerType__feature____ownedAttribute.setTrg(feature);
		ruleresult.getTranslatedEdges().add(uOwnerType__feature____ownedAttribute);
		feature__uOwnerType____datatype.setSrc(feature);
		feature__uOwnerType____datatype.setTrg(uOwnerType);
		ruleresult.getTranslatedEdges().add(feature__uOwnerType____datatype);
		m2f__modifier____source.setSrc(m2f);
		m2f__modifier____source.setTrg(modifier);
		ruleresult.getCreatedEdges().add(m2f__modifier____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		jOwnerType__bodyDeclaration____bodyDeclarations
				.setName(jOwnerType__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration
				.setName(bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		m2f__feature____target.setName(m2f__feature____target_name_prime);
		bodyDeclaration__vdf____fragments.setName(bodyDeclaration__vdf____fragments_name_prime);
		vdf__bodyDeclaration____variablesContainer.setName(vdf__bodyDeclaration____variablesContainer_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		uOwnerType__feature____ownedAttribute.setName(uOwnerType__feature____ownedAttribute_name_prime);
		feature__uOwnerType____datatype.setName(feature__uOwnerType____datatype_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, uOwnerType, vdf,
				jOwnerType, bd2ne__bodyDeclaration____source, jOwnerType__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jOwnerType____abstractTypeDeclaration, bodyDeclaration__modifier____modifier,
				modifier__bodyDeclaration____bodyDeclaration, m2f__feature____target, bodyDeclaration__vdf____fragments,
				vdf__bodyDeclaration____variablesContainer, bd2ne__feature____target, b2e__bodyDeclaration____source,
				uOwnerType__feature____ownedAttribute, feature__uOwnerType____datatype, m2f__modifier____source,
				b2e__feature____target };
	}

	public static final void pattern_FieldDec2Property4Enum_WithModifier_11_5_registerobjects_expressionBBBBBBBBBBBB(
			FieldDec2Property4Enum_WithModifier _this, PerformRuleResult ruleresult, EObject m2f, EObject feature,
			EObject b2e, EObject bd2ne, EObject bodyDeclaration, EObject modifier, EObject uOwnerType, EObject vdf,
			EObject jOwnerType, EObject jo2uo) {
		_this.registerObjects_BWD(ruleresult, m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, uOwnerType, vdf,
				jOwnerType, jo2uo);

	}

	public static final PerformRuleResult pattern_FieldDec2Property4Enum_WithModifier_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_12_1_preparereturnvalue_bindingFB(
			FieldDec2Property4Enum_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_12_1_preparereturnvalue_blackFBB(
			EClass eClass, FieldDec2Property4Enum_WithModifier _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_12_1_preparereturnvalue_bindingAndBlackFFB(
			FieldDec2Property4Enum_WithModifier _this) {
		Object[] result_pattern_FieldDec2Property4Enum_WithModifier_12_1_preparereturnvalue_binding = pattern_FieldDec2Property4Enum_WithModifier_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property4Enum_WithModifier_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldDec2Property4Enum_WithModifier_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property4Enum_WithModifier_12_1_preparereturnvalue_black = pattern_FieldDec2Property4Enum_WithModifier_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldDec2Property4Enum_WithModifier_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldDec2Property4Enum_WithModifier_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldDec2Property4Enum_WithModifier";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("uOwnerType");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUOwnerType = _localVariable_1;
		if (tmpFeature instanceof Property) {
			Property feature = (Property) tmpFeature;
			if (tmpUOwnerType instanceof Enumeration) {
				Enumeration uOwnerType = (Enumeration) tmpUOwnerType;
				return new Object[] { feature, uOwnerType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Enum_WithModifier_12_2_corematch_blackBBFFB(
			Property feature, Enumeration uOwnerType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (NamedElement2NamedElement jo2uo : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(uOwnerType, NamedElement2NamedElement.class, "target")) {
			org.eclipse.modisco.java.NamedElement tmpJOwnerType = jo2uo.getSource();
			if (tmpJOwnerType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) tmpJOwnerType;
				_result.add(new Object[] { feature, uOwnerType, jOwnerType, jo2uo, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Enum_WithModifier_12_3_findcontext_blackBBBB(
			Property feature, Enumeration uOwnerType, AbstractTypeDeclaration jOwnerType,
			NamedElement2NamedElement jo2uo) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jOwnerType.equals(jo2uo.getSource())) {
			if (uOwnerType.getOwnedAttributes().contains(feature)) {
				if (uOwnerType.equals(jo2uo.getTarget())) {
					_result.add(new Object[] { feature, uOwnerType, jOwnerType, jo2uo });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_12_3_findcontext_greenBBBBFFFFF(
			Property feature, Enumeration uOwnerType, AbstractTypeDeclaration jOwnerType,
			NamedElement2NamedElement jo2uo) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jo2uo__jOwnerType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uOwnerType__feature____ownedAttribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__uOwnerType____datatype = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jo2uo__uOwnerType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jo2uo__jOwnerType____source_name_prime = "source";
		String uOwnerType__feature____ownedAttribute_name_prime = "ownedAttribute";
		String feature__uOwnerType____datatype_name_prime = "datatype";
		String jo2uo__uOwnerType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(uOwnerType);
		isApplicableMatch.getAllContextElements().add(jOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo);
		jo2uo__jOwnerType____source.setSrc(jo2uo);
		jo2uo__jOwnerType____source.setTrg(jOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo__jOwnerType____source);
		uOwnerType__feature____ownedAttribute.setSrc(uOwnerType);
		uOwnerType__feature____ownedAttribute.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(uOwnerType__feature____ownedAttribute);
		feature__uOwnerType____datatype.setSrc(feature);
		feature__uOwnerType____datatype.setTrg(uOwnerType);
		isApplicableMatch.getAllContextElements().add(feature__uOwnerType____datatype);
		jo2uo__uOwnerType____target.setSrc(jo2uo);
		jo2uo__uOwnerType____target.setTrg(uOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo__uOwnerType____target);
		jo2uo__jOwnerType____source.setName(jo2uo__jOwnerType____source_name_prime);
		uOwnerType__feature____ownedAttribute.setName(uOwnerType__feature____ownedAttribute_name_prime);
		feature__uOwnerType____datatype.setName(feature__uOwnerType____datatype_name_prime);
		jo2uo__uOwnerType____target.setName(jo2uo__uOwnerType____target_name_prime);
		return new Object[] { feature, uOwnerType, jOwnerType, jo2uo, isApplicableMatch, jo2uo__jOwnerType____source,
				uOwnerType__feature____ownedAttribute, feature__uOwnerType____datatype, jo2uo__uOwnerType____target };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_12_4_solveCSP_bindingFBBBBBB(
			FieldDec2Property4Enum_WithModifier _this, IsApplicableMatch isApplicableMatch, Property feature,
			Enumeration uOwnerType, AbstractTypeDeclaration jOwnerType, NamedElement2NamedElement jo2uo) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, uOwnerType, jOwnerType,
				jo2uo);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, uOwnerType, jOwnerType, jo2uo };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_12_4_solveCSP_bindingAndBlackFBBBBBB(
			FieldDec2Property4Enum_WithModifier _this, IsApplicableMatch isApplicableMatch, Property feature,
			Enumeration uOwnerType, AbstractTypeDeclaration jOwnerType, NamedElement2NamedElement jo2uo) {
		Object[] result_pattern_FieldDec2Property4Enum_WithModifier_12_4_solveCSP_binding = pattern_FieldDec2Property4Enum_WithModifier_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, feature, uOwnerType, jOwnerType, jo2uo);
		if (result_pattern_FieldDec2Property4Enum_WithModifier_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Enum_WithModifier_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property4Enum_WithModifier_12_4_solveCSP_black = pattern_FieldDec2Property4Enum_WithModifier_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Enum_WithModifier_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, uOwnerType, jOwnerType, jo2uo };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_12_5_checkCSP_expressionFBB(
			FieldDec2Property4Enum_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldDec2Property4Enum_WithModifier";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDec2Property4Enum_WithModifier_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_20_1_preparereturnvalue_bindingFB(
			FieldDec2Property4Enum_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, FieldDec2Property4Enum_WithModifier _this) {
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

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_20_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldDec2Property4Enum_WithModifier _this) {
		Object[] result_pattern_FieldDec2Property4Enum_WithModifier_20_1_preparereturnvalue_binding = pattern_FieldDec2Property4Enum_WithModifier_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property4Enum_WithModifier_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldDec2Property4Enum_WithModifier_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property4Enum_WithModifier_20_1_preparereturnvalue_black = pattern_FieldDec2Property4Enum_WithModifier_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldDec2Property4Enum_WithModifier_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldDec2Property4Enum_WithModifier_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldDec2Property4Enum_WithModifier_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_20_2_testcorematchandDECs_black_nac_0B(
			Property feature) {
		Interface __DEC_feature_ownedAttribute_366283 = feature.getInterface();
		if (__DEC_feature_ownedAttribute_366283 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_20_2_testcorematchandDECs_black_nac_1B(
			Property feature) {
		for (StructuredClassifier __DEC_feature_ownedAttribute_834973 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, StructuredClassifier.class, "ownedAttribute")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Enum_WithModifier_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedAttribute) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUOwnerType = _edge_ownedAttribute.getSrc();
		if (tmpUOwnerType instanceof Enumeration) {
			Enumeration uOwnerType = (Enumeration) tmpUOwnerType;
			EObject tmpFeature = _edge_ownedAttribute.getTrg();
			if (tmpFeature instanceof Property) {
				Property feature = (Property) tmpFeature;
				if (uOwnerType.getOwnedAttributes().contains(feature)) {
					if (pattern_FieldDec2Property4Enum_WithModifier_20_2_testcorematchandDECs_black_nac_0B(
							feature) == null) {
						if (pattern_FieldDec2Property4Enum_WithModifier_20_2_testcorematchandDECs_black_nac_1B(
								feature) == null) {
							_result.add(new Object[] { feature, uOwnerType, _edge_ownedAttribute });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldDec2Property4Enum_WithModifier _this, Match match, Property feature, Enumeration uOwnerType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, uOwnerType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldDec2Property4Enum_WithModifier _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldDec2Property4Enum_WithModifier_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_21_1_preparereturnvalue_bindingFB(
			FieldDec2Property4Enum_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, FieldDec2Property4Enum_WithModifier _this) {
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

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_21_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldDec2Property4Enum_WithModifier _this) {
		Object[] result_pattern_FieldDec2Property4Enum_WithModifier_21_1_preparereturnvalue_binding = pattern_FieldDec2Property4Enum_WithModifier_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property4Enum_WithModifier_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldDec2Property4Enum_WithModifier_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property4Enum_WithModifier_21_1_preparereturnvalue_black = pattern_FieldDec2Property4Enum_WithModifier_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldDec2Property4Enum_WithModifier_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldDec2Property4Enum_WithModifier_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldDec2Property4Enum_WithModifier_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_21_2_testcorematchandDECs_black_nac_0BB(
			MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		for (VariableDeclarationFragment __DEC_bodyDeclaration_fragments_403442 : bodyDeclaration.getFragments()) {
			if (!vdf.equals(__DEC_bodyDeclaration_fragments_403442)) {
				return new Object[] { bodyDeclaration, vdf };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_21_2_testcorematchandDECs_black_nac_1B(
			MFieldDefinition bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_174993 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_174993 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Enum_WithModifier_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJOwnerType = _edge_bodyDeclarations.getSrc();
		if (tmpJOwnerType instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) tmpJOwnerType;
			EObject tmpBodyDeclaration = _edge_bodyDeclarations.getTrg();
			if (tmpBodyDeclaration instanceof MFieldDefinition) {
				MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
				if (jOwnerType.getBodyDeclarations().contains(bodyDeclaration)) {
					Modifier modifier = bodyDeclaration.getModifier();
					if (modifier != null) {
						if (pattern_FieldDec2Property4Enum_WithModifier_21_2_testcorematchandDECs_black_nac_1B(
								bodyDeclaration) == null) {
							for (VariableDeclarationFragment vdf : bodyDeclaration.getFragments()) {
								if (pattern_FieldDec2Property4Enum_WithModifier_21_2_testcorematchandDECs_black_nac_0BB(
										bodyDeclaration, vdf) == null) {
									_result.add(new Object[] { bodyDeclaration, modifier, vdf, jOwnerType,
											_edge_bodyDeclarations });
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			FieldDec2Property4Enum_WithModifier _this, Match match, MFieldDefinition bodyDeclaration, Modifier modifier,
			VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration, modifier, vdf, jOwnerType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldDec2Property4Enum_WithModifier _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldDec2Property4Enum_WithModifier_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_24_1_prepare_blackB(
			FieldDec2Property4Enum_WithModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_2 = sourceMatch.getObject("modifier");
		EObject _localVariable_3 = targetMatch.getObject("uOwnerType");
		EObject _localVariable_4 = sourceMatch.getObject("vdf");
		EObject _localVariable_5 = sourceMatch.getObject("jOwnerType");
		EObject tmpFeature = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpModifier = _localVariable_2;
		EObject tmpUOwnerType = _localVariable_3;
		EObject tmpVdf = _localVariable_4;
		EObject tmpJOwnerType = _localVariable_5;
		if (tmpFeature instanceof Property) {
			Property feature = (Property) tmpFeature;
			if (tmpBodyDeclaration instanceof MFieldDefinition) {
				MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
				if (tmpModifier instanceof Modifier) {
					Modifier modifier = (Modifier) tmpModifier;
					if (tmpUOwnerType instanceof Enumeration) {
						Enumeration uOwnerType = (Enumeration) tmpUOwnerType;
						if (tmpVdf instanceof VariableDeclarationFragment) {
							VariableDeclarationFragment vdf = (VariableDeclarationFragment) tmpVdf;
							if (tmpJOwnerType instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) tmpJOwnerType;
								return new Object[] { feature, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_blackBBBBBBBB(
			Property feature, MFieldDefinition bodyDeclaration, Modifier modifier, Enumeration uOwnerType,
			VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { feature, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_binding = pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_binding != null) {
			Property feature = (Property) result_pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_binding[0];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result_pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_binding[1];
			Modifier modifier = (Modifier) result_pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_binding[2];
			Enumeration uOwnerType = (Enumeration) result_pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_binding[3];
			VariableDeclarationFragment vdf = (VariableDeclarationFragment) result_pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_binding[4];
			AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) result_pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_black = pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_blackBBBBBBBB(
					feature, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, sourceMatch, targetMatch);
			if (result_pattern_FieldDec2Property4Enum_WithModifier_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_24_3_solvecsp_bindingFBBBBBBBBB(
			FieldDec2Property4Enum_WithModifier _this, Property feature, MFieldDefinition bodyDeclaration,
			Modifier modifier, Enumeration uOwnerType, VariableDeclarationFragment vdf,
			AbstractTypeDeclaration jOwnerType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(feature, bodyDeclaration, modifier, uOwnerType, vdf,
				jOwnerType, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, feature, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			FieldDec2Property4Enum_WithModifier _this, Property feature, MFieldDefinition bodyDeclaration,
			Modifier modifier, Enumeration uOwnerType, VariableDeclarationFragment vdf,
			AbstractTypeDeclaration jOwnerType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldDec2Property4Enum_WithModifier_24_3_solvecsp_binding = pattern_FieldDec2Property4Enum_WithModifier_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, feature, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, sourceMatch, targetMatch);
		if (result_pattern_FieldDec2Property4Enum_WithModifier_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Enum_WithModifier_24_3_solvecsp_binding[0];

			Object[] result_pattern_FieldDec2Property4Enum_WithModifier_24_3_solvecsp_black = pattern_FieldDec2Property4Enum_WithModifier_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Enum_WithModifier_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Enum_WithModifier_24_5_matchcorrcontext_blackBBFBB(
			Enumeration uOwnerType, AbstractTypeDeclaration jOwnerType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (NamedElement2NamedElement jo2uo : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(jOwnerType, NamedElement2NamedElement.class, "source")) {
				if (uOwnerType.equals(jo2uo.getTarget())) {
					_result.add(new Object[] { uOwnerType, jOwnerType, jo2uo, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_24_5_matchcorrcontext_greenBBBF(
			NamedElement2NamedElement jo2uo, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "FieldDec2Property4Enum_WithModifier";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(jo2uo);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { jo2uo, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_24_6_createcorrespondence_blackBBBBBBB(
			Property feature, MFieldDefinition bodyDeclaration, Modifier modifier, Enumeration uOwnerType,
			VariableDeclarationFragment vdf, AbstractTypeDeclaration jOwnerType, CCMatch ccMatch) {
		return new Object[] { feature, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_24_6_createcorrespondence_greenFBFFBBB(
			Property feature, MFieldDefinition bodyDeclaration, Modifier modifier, CCMatch ccMatch) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		m2f.setTarget(feature);
		m2f.setSource(modifier);
		ccMatch.getCreateCorr().add(m2f);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		ccMatch.getCreateCorr().add(b2e);
		bd2ne.setSource(bodyDeclaration);
		bd2ne.setTarget(feature);
		ccMatch.getCreateCorr().add(bd2ne);
		return new Object[] { m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "FieldDec2Property4Enum_WithModifier";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDec2Property4Enum_WithModifier_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_27_1_matchtggpattern_black_nac_0BB(
			MFieldDefinition bodyDeclaration, VariableDeclarationFragment vdf) {
		for (VariableDeclarationFragment __DEC_bodyDeclaration_fragments_742507 : bodyDeclaration.getFragments()) {
			if (!vdf.equals(__DEC_bodyDeclaration_fragments_742507)) {
				return new Object[] { bodyDeclaration, vdf };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_27_1_matchtggpattern_black_nac_1B(
			MFieldDefinition bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_555976 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_555976 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_27_1_matchtggpattern_blackBBBB(
			MFieldDefinition bodyDeclaration, Modifier modifier, VariableDeclarationFragment vdf,
			AbstractTypeDeclaration jOwnerType) {
		if (jOwnerType.getBodyDeclarations().contains(bodyDeclaration)) {
			if (modifier.equals(bodyDeclaration.getModifier())) {
				if (bodyDeclaration.getFragments().contains(vdf)) {
					if (pattern_FieldDec2Property4Enum_WithModifier_27_1_matchtggpattern_black_nac_0BB(bodyDeclaration,
							vdf) == null) {
						if (pattern_FieldDec2Property4Enum_WithModifier_27_1_matchtggpattern_black_nac_1B(
								bodyDeclaration) == null) {
							return new Object[] { bodyDeclaration, modifier, vdf, jOwnerType };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_28_1_matchtggpattern_black_nac_0B(
			Property feature) {
		Interface __DEC_feature_ownedAttribute_61336 = feature.getInterface();
		if (__DEC_feature_ownedAttribute_61336 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_28_1_matchtggpattern_black_nac_1B(
			Property feature) {
		for (StructuredClassifier __DEC_feature_ownedAttribute_809052 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, StructuredClassifier.class, "ownedAttribute")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_28_1_matchtggpattern_blackBB(
			Property feature, Enumeration uOwnerType) {
		if (uOwnerType.getOwnedAttributes().contains(feature)) {
			if (pattern_FieldDec2Property4Enum_WithModifier_28_1_matchtggpattern_black_nac_0B(feature) == null) {
				if (pattern_FieldDec2Property4Enum_WithModifier_28_1_matchtggpattern_black_nac_1B(feature) == null) {
					return new Object[] { feature, uOwnerType };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_29_1_createresult_blackB(
			FieldDec2Property4Enum_WithModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Enumeration uOwnerType) {
		if (ruleResult.getTargetObjects().contains(uOwnerType)) {
			return new Object[] { ruleResult, uOwnerType };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, NamedElement2NamedElement jo2uo) {
		if (ruleResult.getCorrObjects().contains(jo2uo)) {
			return new Object[] { ruleResult, jo2uo };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration jOwnerType) {
		if (ruleResult.getSourceObjects().contains(jOwnerType)) {
			return new Object[] { ruleResult, jOwnerType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Enum_WithModifier_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList jo2uoList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpJo2uo : jo2uoList.getEntryObjects()) {
				if (tmpJo2uo instanceof NamedElement2NamedElement) {
					NamedElement2NamedElement jo2uo = (NamedElement2NamedElement) tmpJo2uo;
					NamedElement tmpUOwnerType = jo2uo.getTarget();
					if (tmpUOwnerType instanceof Enumeration) {
						Enumeration uOwnerType = (Enumeration) tmpUOwnerType;
						org.eclipse.modisco.java.NamedElement tmpJOwnerType = jo2uo.getSource();
						if (tmpJOwnerType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration jOwnerType = (AbstractTypeDeclaration) tmpJOwnerType;
							if (pattern_FieldDec2Property4Enum_WithModifier_29_2_isapplicablecore_black_nac_1BB(
									ruleResult, jo2uo) == null) {
								if (pattern_FieldDec2Property4Enum_WithModifier_29_2_isapplicablecore_black_nac_0BB(
										ruleResult, uOwnerType) == null) {
									if (pattern_FieldDec2Property4Enum_WithModifier_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, jOwnerType) == null) {
										_result.add(new Object[] { jo2uoList, uOwnerType, jo2uo, jOwnerType,
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

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_29_3_solveCSP_bindingFBBBBBB(
			FieldDec2Property4Enum_WithModifier _this, IsApplicableMatch isApplicableMatch, Enumeration uOwnerType,
			AbstractTypeDeclaration jOwnerType, NamedElement2NamedElement jo2uo, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, uOwnerType, jOwnerType, jo2uo,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, uOwnerType, jOwnerType, jo2uo, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_29_3_solveCSP_bindingAndBlackFBBBBBB(
			FieldDec2Property4Enum_WithModifier _this, IsApplicableMatch isApplicableMatch, Enumeration uOwnerType,
			AbstractTypeDeclaration jOwnerType, NamedElement2NamedElement jo2uo, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldDec2Property4Enum_WithModifier_29_3_solveCSP_binding = pattern_FieldDec2Property4Enum_WithModifier_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, uOwnerType, jOwnerType, jo2uo, ruleResult);
		if (result_pattern_FieldDec2Property4Enum_WithModifier_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Enum_WithModifier_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property4Enum_WithModifier_29_3_solveCSP_black = pattern_FieldDec2Property4Enum_WithModifier_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Enum_WithModifier_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, uOwnerType, jOwnerType, jo2uo, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Enum_WithModifier_29_4_checkCSP_expressionFBB(
			FieldDec2Property4Enum_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_29_5_checknacs_blackBBB(
			Enumeration uOwnerType, AbstractTypeDeclaration jOwnerType, NamedElement2NamedElement jo2uo) {
		return new Object[] { uOwnerType, jOwnerType, jo2uo };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_29_6_perform_blackBBBB(
			Enumeration uOwnerType, AbstractTypeDeclaration jOwnerType, NamedElement2NamedElement jo2uo,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { uOwnerType, jOwnerType, jo2uo, ruleResult };
	}

	public static final Object[] pattern_FieldDec2Property4Enum_WithModifier_29_6_perform_greenFFFFFFBFBBB(
			Enumeration uOwnerType, AbstractTypeDeclaration jOwnerType, ModelgeneratorRuleResult ruleResult, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		Property feature = UMLFactory.eINSTANCE.createProperty();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		MFieldDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		Modifier modifier = JavaFactory.eINSTANCE.createModifier();
		VariableDeclarationFragment vdf = JavaFactory.eINSTANCE.createVariableDeclarationFragment();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("feature", "isStatic");
		Object _localVariable_2 = csp.getValue("feature", "visibility");
		Object _localVariable_3 = csp.getValue("modifier", "static");
		Object _localVariable_4 = csp.getValue("modifier", "visibility");
		Object _localVariable_5 = csp.getValue("vdf", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_6 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(m2f);
		m2f.setTarget(feature);
		uOwnerType.getOwnedAttributes().add(feature);
		ruleResult.getTargetObjects().add(feature);
		b2e.setTarget(feature);
		ruleResult.getCorrObjects().add(b2e);
		bd2ne.setTarget(feature);
		ruleResult.getCorrObjects().add(bd2ne);
		bd2ne.setSource(bodyDeclaration);
		jOwnerType.getBodyDeclarations().add(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		bodyDeclaration.setModifier(modifier);
		m2f.setSource(modifier);
		ruleResult.getSourceObjects().add(modifier);
		bodyDeclaration.getFragments().add(vdf);
		ruleResult.getSourceObjects().add(vdf);
		String feature_name_prime = (String) _localVariable_0;
		boolean feature_isStatic_prime = (boolean) _localVariable_1;
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_2;
		boolean modifier_static_prime = (boolean) _localVariable_3;
		org.eclipse.modisco.java.VisibilityKind modifier_visibility_prime = (org.eclipse.modisco.java.VisibilityKind) _localVariable_4;
		String vdf_name_prime = (String) _localVariable_5;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_6);
		feature.setName(feature_name_prime);
		feature.setIsStatic(Boolean.valueOf(feature_isStatic_prime));
		feature.setVisibility(feature_visibility_prime);
		modifier.setStatic(Boolean.valueOf(modifier_static_prime));
		modifier.setVisibility(modifier_visibility_prime);
		vdf.setName(vdf_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { m2f, feature, b2e, bd2ne, bodyDeclaration, modifier, uOwnerType, vdf, jOwnerType,
				ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_FieldDec2Property4Enum_WithModifier_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldDec2Property4Enum_WithModifierImpl